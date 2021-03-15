import { NativeModules } from 'react-native';

type NokeType = {
  multiply(a: number, b: number): Promise<number>;
};

const { Noke } = NativeModules;

export default Noke as NokeType;
