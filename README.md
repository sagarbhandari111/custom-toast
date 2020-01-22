# custom-toast
a library for showing customize toast
the process to access this library into your project
1. add
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
2.add

	dependencies {
	        implementation 'com.github.sagarbhandari111:custom-toast:v1.0.0'
	}
  
  3.used in your project
  
   ToastMessage1.showMessage(Activity.this,message,imageresouce);
