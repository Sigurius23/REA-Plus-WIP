package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public interface RefCounted {
    @CalledByNative
    void release();

    @CalledByNative
    void retain();
}
