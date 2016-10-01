/*
 * Violate Singleton using:
 * Using Reflections
 * Serialization/De-Serialization
 * Multi Threading
 * 
 */
package Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The Class TestSingleton.
 */
public class TestSingleton implements Serializable, Cloneable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		createSingletonObject();
		usingReflections();
		usingSerilization();
		multiThreading();
	}

	/**
	 * Prints the.
	 *
	 * @param name
	 *            the name
	 * @param object
	 *            the object
	 */
	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object: %s, Hashcode: %d ", name, object.hashCode()));
	}

	/**
	 * Creates the singleton object.
	 */
	private static void createSingletonObject() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("S1", s1);
		print("S2", s2);
	}

	/**
	 * Using reflections.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void usingReflections() throws Exception {
		System.out.println("\nCreating new instance of Singleton Class using Reflections");

		Class clazz = Class.forName("Singleton.Singleton");
		Constructor<Singleton> constructr = clazz.getDeclaredConstructor();
		constructr.setAccessible(true);
		Singleton s3 = constructr.newInstance();

		print("S3", s3);
	}

	/**
	 * Using Serilization.
	 *
	 * @throws Exception
	 *             the exception
	 */
	private static void usingSerilization() throws Exception {
		System.out.println("\nCreating new instance of Singleton Class using Serialization");
		Singleton s4 = Singleton.getInstance();
		print("s4", s4);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("s2.ser")));
		oos.writeObject(s4);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("s2.ser")));
		Singleton s5 = (Singleton) ois.readObject();
		ois.close();
		print("s5", s5);
	}

	/**
	 * Cloning.
	 */
	@SuppressWarnings("unused")
	private static void cloning() {
		
		 /*Singleton s6 = Singleton.getInstance();
		 Singleton s7 = (Singleton) s6.clone();*/
		 
	}
	
	/**
	 * Multi threading.
	 * Called method -- useSingleton()
	 */
	private static void multiThreading(){
		System.out.println("\nCreating new two separate instances of Singleton using Multi threading");
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(TestSingleton::useSingleton);
		service.submit(TestSingleton::useSingleton);
		service.shutdown();
	}
	
	/**
	 * Use singleton.
	 * Calling method -- multiThreading
	 */
	static void useSingleton(){
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}
	
}
