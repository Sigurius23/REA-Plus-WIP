package hms.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes11.dex */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    /* JADX INFO: renamed from: qp */
    public final Integer f67562qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        /* JADX INFO: renamed from: qp */
        private Integer f67563qp;
        private Runnable releaseCallback;
        private int rotation;

        public /* synthetic */ Builder(int i13) {
            this();
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.f67563qp, 0);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j7) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j7);
            return this;
        }

        public Builder setCaptureTimeNs(long j7) {
            this.captureTimeNs = j7;
            return this;
        }

        public Builder setEncodedHeight(int i13) {
            this.encodedHeight = i13;
            return this;
        }

        public Builder setEncodedWidth(int i13) {
            this.encodedWidth = i13;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.f67563qp = num;
            return this;
        }

        public Builder setRotation(int i13) {
            this.rotation = i13;
            return this;
        }

        private Builder() {
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i13) {
            this.nativeIndex = i13;
        }

        @CalledByNative("FrameType")
        public static FrameType fromNativeIndex(int i13) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i13) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown native frame type: "));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public /* synthetic */ EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i13, int i14, long j7, FrameType frameType, int i15, Integer num, int i16) {
        this(byteBuffer, runnable, i13, i14, j7, frameType, i15, num);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @CalledByNative
    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    @CalledByNative
    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    @CalledByNative
    private int getFrameType() {
        return this.frameType.getNative();
    }

    @CalledByNative
    private Integer getQp() {
        return this.f67562qp;
    }

    @CalledByNative
    private int getRotation() {
        return this.rotation;
    }

    @Override // hms.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // hms.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i13, int i14, long j7, FrameType frameType, int i15, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i13;
        this.encodedHeight = i14;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j7);
        this.captureTimeNs = j7;
        this.frameType = frameType;
        this.rotation = i15;
        this.f67562qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
