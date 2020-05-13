# Verify Connectivity Module

Module de verificação de connectividade 


## Requirements

- minSdkVersion **21**
- targetSdkVersion **29**

## Dependencies

```groovy
//build.gradle (app level)
dependencies {
  // ...
  //di
  implementation 'com.google.dagger:dagger-android:2.16'
  kapt 'com.google.dagger:dagger-android-processor:2.16'
  kapt 'com.google.dagger:dagger-compiler:2.16'
  implementation 'com.google.dagger:dagger-android-support:2.15'
  implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"
  // ...
}
```

## Configurations

```kotlin
@Component(
  modules = [
    //...
    ResultadosDeExamesModule::class
  ]
)
interface AppComponent {
	//... 
}
```
