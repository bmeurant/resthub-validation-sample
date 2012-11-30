RESThub Validation Sample Application
=====================================

This small example application demonstrates usage of RESThub Validation extension. This extension (see documentation for details)
provides some helpers both on server and client side in order to export BeanValidation constraints and map it, in
client side, to Backbone.Validation constraints.

This application shows two sample forms using this extension :

 * One exhaustive 'Sample' form containing all supported validation constraints and demonstrating some advanced options:
   includes / excludes, global custom validation messages and its format, custom validator and merge of client and server constraints
 * One more concrete 'User' form containg more coherent validation constraint and demonstrating other advanced options:
   customization of messages in model, custom validator implementation (on both server and client side) and definition
   of an aditional client only validation constraint.

In order to run it :

 * Run the following command : mvn clean install jetty:run
 * Open your browser and go to http://localhost:8080