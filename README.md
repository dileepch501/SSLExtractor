# SSLExtractor
This SDK will be used for extracting the sha256 from SSL certificate files (.crt, .cer, .pem ) using the X509 instance

## Follow the Integration steps.




### step 1 : Add maven repo in the project level build.gradle file.

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

```


### step 2 : Add the dependancy in the app level build.gradle file.

```java
maven { url 'https://jitpack.io' }

```

### step 3 : Extract the sha256 key using CertificateExtractor class.

### 1. From file

