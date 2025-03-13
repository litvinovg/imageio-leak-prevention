# ImageIO leak prevention for Tomcat based servlet containers

Download [jar](https://github.com/litvinovg/imageio-leak-prevention/raw/refs/heads/main/ImageIO-leak-prevention.jar) or build it with mvn package

To use it add produced jar file into tomcat/lib directory and specify class to initialize in conf/server.xml

\<Listener className="org.apache.catalina.core.JreMemoryLeakPreventionListener" classesToInitialize="osl.tib.eu.ImageIO.LeakPrevention" />

In web application use [servlet listener](https://github.com/haraldk/TwelveMonkeys?tab=readme-ov-file#deploying-the-plugins-in-a-web-app)
