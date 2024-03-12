public class SingletonSync {
        // Private static instance of the singleton class
        private static volatile SingletonSync instance = null;

        // Private constructor to prevent instantiation from other classes
        // Public static method to get the instance of the singleton class
        public static SingletonSync getInstance() {
            if (instance == null) {
                // Synchronize block to remove multi-threading issues
                synchronized (SingletonSync.class) {
                    // Check again as multiple threads
                    // can reach above step
                    if (instance == null) {
                        instance = new SingletonSync();
                    }
                }
            }
            return instance;
        }

        // Other methods of the class...
    }


