
## Hibernate samples

* Using mysql connector
* Employee DB - https://github.com/datacharmer/test_db

#### Dependencies

Download `javahb/lib/jarlist.txt` to `javahb/lib`

#### Compile

$ javac -cp .:lib/cglib-2.1.3.jar:lib/hibernate3.jar:lib/jta.jar src/com/hbexample/pkg/*.java

#### Run

$ java -cp .:src:lib/cglib-2.1.3.jar:lib/hibernate3.jar:lib/jta.jar:lib/dom4j-1.6.1.jar:lib/log4j-1.2.11.jar:lib/commons-logging-1.0.4.jar:lib/xerces-2.6.2.jar:lib/jdbc2_0-stdext.jar:lib/hibernate-commons-annotations.jar:lib/hibernate-annotations.jar:lib/ejb3-persistence.jar:lib/antlr-2.7.6.jar:lib/asm-attrs.jar:lib/asm.jar:lib/c3p0-0.9.1.jar:lib/commons-collections-2.1.1.jar:lib/ehcache-1.2.3.jar:lib/mysql-connector-java-5.1.45-bin.jar com.hbexample.pkg.StoreData

