import * as React from 'react';

import { StyleSheet, View, Text, Button, NativeModules } from 'react-native';
import { Noke, CalendarModule } from 'react-native-noke';
import { useEffect } from 'react';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();

  React.useEffect(() => {
    Noke.multiply(3, 7).then(setResult);
  }, []);

  useEffect(() => {
    console.log('Result Change ' + result);
  }, [result]);

  const addCalendarEvent = () => {
    CalendarModule.createCalendarEvent('HELLO', 'Yangon');
  };

  const openNoke = () => {
    Noke.openNoke();
  };

  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
      <View style={{ margin: 16 }} />
      <Button title={'Add Calendar Event'} onPress={addCalendarEvent} />
      <View style={{ margin: 16 }} />
      <Button title={'Open Noke'} onPress={openNoke} />
      <View style={{ margin: 16 }} />
      <Button
        title={'Open Noke'}
        onPress={() => {
          NativeModules.AppDelegate.pushVC('NokeViewController');
        }}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
