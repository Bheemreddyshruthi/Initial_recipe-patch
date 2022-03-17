# Initial_recipe-patch

This repositiory contains a basic recipe and a patch with which custom images are created for open embedded systems.

To create a recipe do the following steps:
1: Create a layer of your own which starts with "meta-"
2: Add the created layer to bblayers.conf
3: To create a recipe in the layer go to recipe-example in custom layer directory
4: Create a .bb file by copying from meta/recipes-core/images/core-image-minimal-dev.bb
5: Create a recipe by including the files required with an extension .bb
6: Add the image into the .bb file by using IMAGE_INSTAll += ""
7: Finally bitabke the recipe and run it.
