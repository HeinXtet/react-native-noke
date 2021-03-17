import { NativeModules } from 'react-native';

type NokeType = {
  multiply(a: number, b: number): Promise<number>;
  createCalendarEvent(name: string, location: string): void;
  openNoke(): void;
};
const Noke = NativeModules.Noke as NokeType;
const CalendarModule = NativeModules.CalendarModule as NokeType;
export { Noke, CalendarModule };
