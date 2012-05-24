Virgo Bundlor Test
------------------

## To Test the Virgo Bundlor:
   _mvn clean package_


## To Test the Spring Bundlor:
   _mvn clean package -Psbundlor_


## Notes:
- Service class & interface, HelloService
- JUnit test to verify service
- Maven Profiles _vbundlor_ (default) configured in _properties_ section of _pom.xml_ as version 1.1.0.M4
- Maven Profile _sbundlor_ for Spring Bundlor 1.0.0.RELEASE


Installing into Maven repo:

mvn install:install-file \
 -Dfile=/code/osgi/virgo/bundlor-1.1.0/integration-repo/org.eclipse.virgo.bundlor/org.eclipse.virgo.bundlor.maven/1.1.0.BUILD-20120523194910/org.eclipse.virgo.bundlor.maven-1.1.0.BUILD-20120523194910.jar \
  -DgroupId=org.eclipse.virgo.bundlor -DartifactId=org.eclipse.virgo.bundlor.maven -Dversion=1.1.0.M04 \
  -Dpackaging=jar


