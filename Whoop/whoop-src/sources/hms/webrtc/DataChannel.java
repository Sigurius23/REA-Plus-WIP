package hms.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        @CalledByNative("Buffer")
        public Buffer(ByteBuffer byteBuffer, boolean z4) {
            this.data = byteBuffer;
            this.binary = z4;
        }
    }

    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";

        /* JADX INFO: renamed from: id */
        public int f67561id = -1;

        @CalledByNative("Init")
        public int getId() {
            return this.f67561id;
        }

        @CalledByNative("Init")
        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        @CalledByNative("Init")
        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        @CalledByNative("Init")
        public boolean getNegotiated() {
            return this.negotiated;
        }

        @CalledByNative("Init")
        public boolean getOrdered() {
            return this.ordered;
        }

        @CalledByNative("Init")
        public String getProtocol() {
            return this.protocol;
        }
    }

    public interface Observer {
        @CalledByNative("Observer")
        void onBufferedAmountChange(long j7);

        @CalledByNative("Observer")
        void onMessage(Buffer buffer);

        @CalledByNative("Observer")
        void onStateChange();
    }

    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i13) {
            return values()[i13];
        }
    }

    @CalledByNative
    public DataChannel(long j7) {
        this.nativeDataChannel = j7;
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z4);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j7);

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    public void dispose() {
        checkDataChannelExists();
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0L;
    }

    @CalledByNative
    public long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    /* JADX INFO: renamed from: id */
    public int m49548id() {
        checkDataChannelExists();
        return nativeId();
    }

    public String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public void registerObserver(Observer observer) {
        checkDataChannelExists();
        long j7 = this.nativeObserver;
        if (j7 != 0) {
            nativeUnregisterObserver(j7);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public boolean send(Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
        this.nativeObserver = 0L;
    }
}
