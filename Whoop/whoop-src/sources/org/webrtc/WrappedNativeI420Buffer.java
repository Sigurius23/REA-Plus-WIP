package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final long nativeBuffer;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    @CalledByNative
    public WrappedNativeI420Buffer(int i13, int i14, ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, long j7) {
        this.width = i13;
        this.height = i14;
        this.dataY = byteBuffer;
        this.strideY = i15;
        this.dataU = byteBuffer2;
        this.strideU = i16;
        this.dataV = byteBuffer3;
        this.strideV = i17;
        this.nativeBuffer = j7;
        retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i13, int i14, int i15, int i16, int i17, int i18) {
        return JavaI420Buffer.cropAndScaleI420(this, i13, i14, i15, i16, i17, i18);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
