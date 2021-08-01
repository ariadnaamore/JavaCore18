package homeworkReflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
	IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
Class vehicle = Vehicle.class;

System.out.println("Назва класу: " + vehicle.getName());
System.out.println("Проста назва класу: " + vehicle.getSimpleName());
System.out.println("модифікатор доступу до класу:  " + Modifier.toString(vehicle.getModifiers()));
System.out.println("Пакет даного класу:  " + vehicle.getPackage());
System.out.println("Батьківський клас: " + vehicle.getSuperclass());
System.out.println();

System.out.println("Клас " + vehicle.getSimpleName() + " має такі поля: ");
Field[] vehicleFields = vehicle.getDeclaredFields();
for (Field field : vehicleFields) {
	System.out.println("Поле " + field);
}
System.out
		.println("Загалька кількість полей класу: " + vehicle.getSimpleName() + " - " + vehicleFields.length);
System.out.println();


Field[] vPublicFields = vehicle.getFields();
System.out.println("Поля класу паблік  "+ vehicle.getSimpleName());
for (Field field : vPublicFields) {
	System.out.println(field);
}
System.out.println("Загальна кількість паблік полей класу " + vehicle.getSimpleName() + " - " + vPublicFields.length);
System.out.println();

Constructor[] vCons = vehicle.getConstructors();
System.out.println("Конструктори класу  "+ vehicle.getSimpleName());
for (Constructor cons : vCons) {
	
	System.out.println(cons);
}
System.out.println("Загальна кількість конструкторів класу " + vehicle.getSimpleName() + " - " + vCons.length);
System.out.println();

Method[] vMethods = vehicle.getMethods();
System.out.println("Методи класу  "+ vehicle.getSimpleName());
for (Method method : vMethods) {
	System.out.println( method);
}
System.out.println("Загальна кількість методів класу: " + vehicle.getSimpleName() + " - " + vMethods.length);
System.out.println();

System.out.println("Додамо нове ТЗ за допомогою рефлексії: ");
Constructor<Vehicle> constructor = vehicle.getConstructor(String.class, String.class, int.class);
Vehicle newVehicle = constructor.newInstance("Мотоцикл","BMW", 2001);
System.out.println(newVehicle);
System.out.println();

System.out.println("Міняємо тип ТЗ за допомогою рефлексії - ");
Field fieldName = vehicle.getField("type");
fieldName.set(newVehicle, "автомобіль");
System.out.println(newVehicle);
System.out.println();

System.out.println("Додаємо ціну ТЗ: ");
Method vMethod = vehicle.getMethod("setCoast", int.class);
vMethod.invoke(newVehicle, 30000);
System.out.println(newVehicle);
System.out.println();

System.out.println("Вивести тип ТЗ: ");
vMethod = vehicle.getMethod("getType", null);
System.out.println("ТЗ - " + vMethod.invoke(newVehicle, null));
System.out.println();

System.out.println("Запаркуємо ТЗ в гараж: ");
vMethod = vehicle.getMethod("getInGarage", int.class);
vMethod.invoke(newVehicle, 23);
System.out.println();

System.out.println("Продамо новому водію: ");
vMethod = vehicle.getMethod("getDriver", String.class);
vMethod.invoke(newVehicle, "Люк Скайвокер");
}

}
