package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
        @Override // hms.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            Logging.m49570d(NativeLibrary.TAG, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.m49570d(TAG, "Native library has already been loaded.");
                    return;
                }
                Logging.m49570d(TAG, "Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z4;
        synchronized (lock) {
            z4 = libraryLoaded;
        }
        return z4;
    }
}
