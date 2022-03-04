import React from 'react';
import { ReactNode } from 'react';
import {
  SafeAreaView,
  Button,
  NativeModules
} from 'react-native';

const App = () => {

  const { NativeModule1 } = NativeModules

	const onPress = () => {
		console.log('button pressed')
		if (NativeModule1 == null)
			console.log("null")
		else {
			console.log(NativeModule1)
			NativeModule1.logSomething("ciao", "ciao")
		}
	}

  return (
    <SafeAreaView>
			<Button
				title="Click to invoke your native module!"
				color="#841584"
				onPress={onPress}
			/>
		</SafeAreaView>
  )
}

export default App;
