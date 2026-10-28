package hms.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class NV12Buffer implements VideoFrame.Buffer {
    private final ByteBuffer buffer;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    public NV12Buffer(int i13, int i14, int i15, int i16, ByteBuffer byteBuffer, Runnable runnable) {
        this.width = i13;
        this.height = i14;
        this.stride = i15;
        this.sliceHeight = i16;
        this.buffer = byteBuffer;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i13, int i14, int i15, int i16, int i17, int i18, ByteBuffer byteBuffer, int i19, int i24, int i25, int i26, ByteBuffer byteBuffer2, int i27, ByteBuffer byteBuffer3, int i28, ByteBuffer byteBuffer4, int i29);

    @Override // hms.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i13, int i14, int i15, int i16, int i17, int i18) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i17, i18);
        nativeCropAndScale(i13, i14, i15, i16, i17, i18, this.buffer, this.width, this.height, this.stride, this.sliceHeight, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // hms.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
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
        int i13 = this.width;
        int i14 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i13, i14, i13, i14);
    }
}
