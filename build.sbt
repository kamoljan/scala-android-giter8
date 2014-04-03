// so we can use keywords from Android, such as 'Android' and 'proguardOptions'
import android.Keys._
 
// load the android plugin into the build
android.Plugin.androidBuild

//resolvers += "Paho" at "https://repo.eclipse.org/content/repositories/paho-releases/"

//libraryDependencies += "org.eclipse.paho" % "mqtt-client" % "0.4.0"
//
//libraryDependencies += "com.squareup.picasso" % "picasso" % "2.1.1"
//
//libraryDependencies += "com.squareup.okhttp" % "okhttp" % "1.2.1"

libraryDependencies += "com.android.support" % "support-v4" % "19.0.0"


// project name, completely optional
name := "NefeteScala"
 
// pick the version of scala you want to use
scalaVersion := "2.10.4"
 
// scala 2.10 flag for feature warnings
scalacOptions in Compile += "-feature"
 
// for non-ant-based projects, you'll need this for the specific build target:
platformTarget in Android := "android-19"
 
// call install and run without having to prefix with android:
run <<= run in Android
 
install <<= install in Android

