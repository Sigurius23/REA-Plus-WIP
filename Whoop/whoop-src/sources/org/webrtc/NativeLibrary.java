package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
class NativeLibrary {
    private static final String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static final Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            Logging.m85621d(NativeLibrary.TAG, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.m85621d(TAG, "Native library has already been loaded.");
                    return;
                }
                Logging.m85621d(TAG, "Loading native library: " + str);
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
