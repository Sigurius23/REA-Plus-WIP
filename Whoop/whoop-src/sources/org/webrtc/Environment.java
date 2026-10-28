package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public final class Environment implements AutoCloseable {
    private final long webrtcEnv;

    public static class Builder {
        private String fieldTrials;

        public Environment build() {
            return new Environment(this.fieldTrials, 0);
        }

        public Builder setFieldTrials(String str) {
            this.fieldTrials = str;
            return this;
        }
    }

    public /* synthetic */ Environment(String str, int i13) {
        this(str);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static native long nativeCreate(String str);

    private static native void nativeFree(long j7);

    @Override // java.lang.AutoCloseable
    public void close() {
        nativeFree(this.webrtcEnv);
    }

    public long ref() {
        return this.webrtcEnv;
    }

    private Environment(String str) {
        this.webrtcEnv = nativeCreate(str);
    }
}
