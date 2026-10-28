package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i13) {
            return values()[i13];
        }
    }

    public MediaSource(final long j7) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: hms.webrtc.j
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeReleaseRef(j7);
            }
        });
        this.nativeSource = j7;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw new IllegalStateException("MediaSource has been disposed.");
        }
    }

    private static native State nativeGetState(long j7);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
