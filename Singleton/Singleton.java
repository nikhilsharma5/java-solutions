package Singleton;

import java.io.Serializable;

/**
 * The Class Singleton.
 */
public class Singleton implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The instance. */
	private static Singleton instance = null;

	/**
	 * Instantiates a new singleton.
	 */
	private Singleton() {
		System.out.println("Creating Singleton..");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	/**
	 * Gets the single instance of Singleton.
	 * Use Singleton instance returned by Holder class for Lazy initialization
	 * @return single instance of Singleton
	 */
	public static Singleton getHolderInstance() {
		return Holder.Instance;
	}

	/**
	 * The Class Holder.
	 */
	static class Holder {
		private static final Singleton Instance = new Singleton();
	}

	/**
	 * Read resolve.
	 *
	 * @return the object --> Helps with Serialization/De-serialization and
	 *         returns the same instance of Singleton class Commenting out this
	 *         method will result in different instance creation in
	 *         TestSingleton.usingSerilization method returns instance object
	 */
	private Object readResolve() {
		System.out.println("..Read Resolve..");
		return instance;
	}
}
