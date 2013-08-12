Requirements
------------

 - JDK 7 (JDK8 won't work)
 - Griffon 1.3.0 (or use griffonw)

Instructions
------------

 - Create an applet package by invoking

     griffonw prod package applet

 - edit `dist/applet/applet.hmtl` and `dist/applet/applet.jnlp`; update all references to codebase and documentbase to point to the absolute directory where these files are kept; aletrnatively publish the applet to a webserver (also update the codebase accordingly)
 - open `applet.html` in a browser
 - accept the security warning when prompted. The dialog will ask your permission to let the page access Java code from javascript
