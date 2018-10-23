
# react-native-emoji-compat

## Getting started

`$ npm install react-native-emoji-compat --save`

### Mostly automatic installation

`$ react-native link react-native-emoji-compat`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-emoji-compat` and add `RNEmojiCompat.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNEmojiCompat.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNEmojiCompatPackage;` to the imports at the top of the file
  - Add `new RNEmojiCompatPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-emoji-compat'
  	project(':react-native-emoji-compat').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-emoji-compat/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-emoji-compat')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNEmojiCompat.sln` in `node_modules/react-native-emoji-compat/windows/RNEmojiCompat.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Emoji.Compat.RNEmojiCompat;` to the usings at the top of the file
  - Add `new RNEmojiCompatPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNEmojiCompat from 'react-native-emoji-compat';

// TODO: What to do with the module?
RNEmojiCompat;
```
  