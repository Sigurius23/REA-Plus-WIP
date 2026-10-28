package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
class Histogram {
    private final long handle;

    private Histogram(long j7) {
        this.handle = j7;
    }

    public static Histogram createCounts(String str, int i13, int i14, int i15) {
        return new Histogram(nativeCreateCounts(str, i13, i14, i15));
    }

    public static Histogram createEnumeration(String str, int i13) {
        return new Histogram(nativeCreateEnumeration(str, i13));
    }

    private static native void nativeAddSample(long j7, int i13);

    private static native long nativeCreateCounts(String str, int i13, int i14, int i15);

    private static native long nativeCreateEnumeration(String str, int i13);

    public void addSample(int i13) {
        nativeAddSample(this.handle, i13);
    }
}
