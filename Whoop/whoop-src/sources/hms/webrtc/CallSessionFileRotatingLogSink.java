package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i13, Logging.Severity severity) {
        if (str == null) {
            throw new IllegalArgumentException("dirPath may not be null.");
        }
        this.nativeSink = nativeAddSink(str, i13, severity.ordinal());
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i13, int i14);

    private static native void nativeDeleteSink(long j7);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j7 = this.nativeSink;
        if (j7 != 0) {
            nativeDeleteSink(j7);
            this.nativeSink = 0L;
        }
    }
}
