package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;

    /* JADX INFO: renamed from: id */
    private final int f114046id;
    private final RefCountDelegate refCountDelegate;
    private final RefCountMonitor refCountMonitor;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    public interface RefCountMonitor {
        void onDestroy(TextureBufferImpl textureBufferImpl);

        void onRelease(TextureBufferImpl textureBufferImpl);

        void onRetain(TextureBufferImpl textureBufferImpl);
    }

    public TextureBufferImpl(int i13, int i14, VideoFrame.TextureBuffer.Type type, int i15, Matrix matrix, Handler handler, YuvConverter yuvConverter, final Runnable runnable) {
        this(i13, i14, i13, i14, type, i15, matrix, handler, yuvConverter, new RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.1
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(RefCountMonitor refCountMonitor) {
        refCountMonitor.onDestroy(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() throws Exception {
        return this.yuvConverter.convert(this);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i13, int i14, int i15, int i16, int i17, int i18) {
        Matrix matrix = new Matrix();
        int i19 = this.height;
        matrix.preTranslate(i13 / this.width, (i19 - (i14 + i16)) / i19);
        matrix.preScale(i15 / this.width, i16 / this.height);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i15) / this.width), Math.round((this.unscaledHeight * i16) / this.height), i17, i18);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f114046id;
    }

    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    public YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountMonitor.onRelease(this);
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountMonitor.onRetain(this);
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new CallableC28294p(this, 3));
    }

    public TextureBufferImpl(int i13, int i14, VideoFrame.TextureBuffer.Type type, int i15, Matrix matrix, Handler handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this(i13, i14, i13, i14, type, i15, matrix, handler, yuvConverter, refCountMonitor);
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i13, int i14) {
        return applyTransformMatrix(matrix, i13, i14, i13, i14);
    }

    private TextureBufferImpl(int i13, int i14, int i15, int i16, VideoFrame.TextureBuffer.Type type, int i17, Matrix matrix, Handler handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this.unscaledWidth = i13;
        this.unscaledHeight = i14;
        this.width = i15;
        this.height = i16;
        this.type = type;
        this.f114046id = i17;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(new RunnableC28299v(0, this, refCountMonitor));
        this.refCountMonitor = refCountMonitor;
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i13, int i14, int i15, int i16) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i13, i14, i15, i16, this.type, this.f114046id, matrix2, this.toI420Handler, this.yuvConverter, new RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.release();
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRelease(TextureBufferImpl.this);
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRetain(TextureBufferImpl.this);
            }
        });
    }
}
