package hms.webrtc;

import java.nio.ByteBuffer;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes11.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i13, int i14, ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, Runnable runnable) {
        this.width = i13;
        this.height = i14;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i15;
        this.strideU = i16;
        this.strideV = i17;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i13, int i14) {
        int i15 = (i14 + 1) / 2;
        int i16 = (i13 + 1) / 2;
        int i17 = i13 * i14;
        int i18 = i16 * i15;
        int i19 = i17 + i18;
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i16 * 2 * i15) + i17);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        return new JavaI420Buffer(i13, i14, byteBufferSlice, i13, byteBufferSlice2, i16, byteBufferNativeAllocateByteBuffer.slice(), i16, new RunnableC17484h(byteBufferNativeAllocateByteBuffer, 0));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i13, int i14, int i15) {
        int i16 = ((i14 - 1) * i15) + i13;
        if (byteBuffer.capacity() < i16) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i16, byteBuffer.capacity(), "Buffer must be at least ", " bytes, but was "));
        }
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i15 != i17 || i16 != i18) {
            JavaI420Buffer javaI420BufferAllocate = allocate(i17, i18);
            nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i13, i14, i15, i16, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i17, i18);
            return javaI420BufferAllocate;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        int i19 = i13 / 2;
        int i24 = i14 / 2;
        i420Buffer.retain();
        return wrap(i17, i18, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new RunnableC17485i(i420Buffer, 0));
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, int i16, int i17, int i18, int i19, ByteBuffer byteBuffer4, int i24, ByteBuffer byteBuffer5, int i25, ByteBuffer byteBuffer6, int i26, int i27, int i28);

    public static JavaI420Buffer wrap(int i13, int i14, ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
        int i18 = (i13 + 1) / 2;
        int i19 = (i14 + 1) / 2;
        checkCapacity(byteBufferSlice, i13, i14, i15);
        checkCapacity(byteBufferSlice2, i18, i19, i16);
        checkCapacity(byteBufferSlice3, i18, i19, i17);
        return new JavaI420Buffer(i13, i14, byteBufferSlice, i15, byteBufferSlice2, i16, byteBufferSlice3, i17, runnable);
    }

    @Override // hms.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i13, int i14, int i15, int i16, int i17, int i18) {
        return cropAndScaleI420(this, i13, i14, i15, i16, i17, i18);
    }

    @Override // hms.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // hms.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // hms.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // hms.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // hms.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // hms.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // hms.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // hms.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // hms.webrtc.VideoFrame.Buffer, hms.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // hms.webrtc.VideoFrame.Buffer, hms.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // hms.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
