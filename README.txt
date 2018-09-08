To use this code in eclipse:

1)	Install eclipse (classic)

2)	Unzip the archive, which will create a Senior-Design folder.

3)	Create a new eclipse java project from existing code, importing the Senior-Design directory 

4)	Create a data directory somewhere outside of Senior-Design (because the data directory will contain other java projects, it can confuse eclipse if they are in the same place as your project). In that directory, create “projects” and “output” subdirectories, and an input.txt file (you can copy the example input.txt from the Senior-Design folder)

5)	Update ROOT in Controller.java with the path to your data directory. 

6)	Also in Controller.java, for your first test, change “ProjectProcessor.DownloadProjects(false);” to “ProjectProcessor.DownloadProjects(true);”—after the first run you can change it back so you don’t have to re-download the test project every time you run. You can update the projects/ProjectNames file to choose different projects to download.

7)	Run Controller.java as a Java Application

Important To-do:

QueryNodeTypeClassifier.java maps the query language node types to eclipse AST node types. That is how the program matches queries to sections of Java code (in TreeSearchAlgorithm.java). The problem is that the ASTNode integer constants that are used are not fine-grained enough to identify all of the query language node types.

For example, there is no possibility of distinguishing between class and interface declarations with this approach, because they both have the same nodeType, TYPE_DECLARATION.

An additional problem is that not all of the mappings are correct. For instance, class_declaration is mapped to CLASS_INSTANCE_CREATION, which is really used for class instantiations, not declarations.

We need a better approach to matching query language nodes to ASTNodes. I’m open to ideas, but my first thought is that we should use the Java reflection API to specifically identify the AST nodes. 

Instead of returning an int, ClassifyNode could return a java.lang.Class so we could specify the exact ASTNode subclass we are interested in (for example, ClassDeclaration, rather than TYPE_DECLARATION). Then we just need to update TreeSearchAlgorithm.java to compare the class of the ASTNode with the result of ClassifyNode() using isInstance.

The benefit of this approach is the simple implementation. The potential downside is that it may impact performance negatively.