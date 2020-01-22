# custom-toast
a library for showing customize toast
the process to access this library into your project
1. add in gradle
 	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
2. add

	dependencies {
	        implementation 'com.github.sagarbhandari111:custom-toast:v1.0.0'
	}
  
  3.used in your project
  
   eg : ToastMessage1.showMessage(Activity.this,message,imageresouce);

add in maven
Step 1. Add the JitPack repository to your build file


maven
sbt
leiningen
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.sagarbhandari111</groupId>
	    <artifactId>custom-toast</artifactId>
	    <version>v1.0.0</version>
	</dependency>
