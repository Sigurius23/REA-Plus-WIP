package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int width;

    public NV21Buffer(byte[] bArr, int i13, int i14, Runnable runnable) {
        this.data = bArr;
        this.width = i13;
        this.height = i14;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i13, int i14, int i15, int i16, int i17, int i18, byte[] bArr, int i19, int i24, ByteBuffer byteBuffer, int i25, ByteBuffer byteBuffer2, int i26, ByteBuffer byteBuffer3, int i27);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i13, int i14, int i15, int i16, int i17, int i18) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i17, i18);
        nativeCropAndScale(i13, i14, i15, i16, i17, i18, this.data, this.width, this.height, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i13 = this.width;
        int i14 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i13, i14, i13, i14);
    }
}
