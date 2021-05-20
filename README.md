# SSLExtractor
This SDK will be used for extracting the sha256 from SSL certificate files (.crt, .cer, .pem ) using the X509 instance

## Follow the Integration steps.




### step 1 : Add maven repo in the project level build.gradle file.

```ruby
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

```


### step 2 : Add the dependancy in the app level build.gradle file.

```ruby
dependencies {
	        implementation 'com.github.dileepch501:SSLExtractor:1.0.1'
	}

```

### step 3 : Extract the sha256 key using CertificateExtractor class.


1. From file

```ruby

File file = new File(certFile);
String sha256key=CertificateExtractor.extract(file);
Log.e("SSLKEY",sha256key);

```

2. From raw folder as a inputStream

```ruby

InputStream inputStream= getResources().openRawResource(R.raw.certificate);
String sha256key=CertificateExtractor.extract(inputStream);
Log.e("SSLKEY",sha256key);

```

3. From FileInputStream

```ruby

FileInputStream inputStream = new FileInputStream(file);
String sha256key=CertificateExtractor.extract(inputStream);
Log.e("SSLKEY",sha256key);

```

##### you can use any of the above method to generate a sha256 key


## you can generate the sha256 key from the following extensions.

1. .crt
2. .cer
3. .pem



