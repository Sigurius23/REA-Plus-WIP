package hms.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final RGBABufferTextureUploader rgbaBufferTextureUploader;
    private final YuvUploader yuvUploader;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final Matrix renderMatrix = new Matrix();

    /* JADX INFO: renamed from: hms.webrtc.VideoFrameDrawer$1 */
    public static /* synthetic */ class C174741 {
        static final /* synthetic */ int[] $SwitchMap$hms$webrtc$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$hms$webrtc$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$hms$webrtc$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class RGBABufferTextureUploader {
        private ByteBuffer copyBuffer;
        int textureId;

        public /* synthetic */ RGBABufferTextureUploader(int i13) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int uploadRgbaData(int i13, int i14, ByteBuffer byteBuffer, int i15) {
            ByteBuffer byteBuffer2;
            int i16 = i13 * 4;
            int iMax = i15 > i16 ? Math.max(0, i16 * i14) : 0;
            ByteBuffer byteBuffer3 = this.copyBuffer;
            if ((byteBuffer3 != null ? byteBuffer3.capacity() : 0) < iMax) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            int iGenerateTexture = this.textureId;
            if (iGenerateTexture == 0) {
                iGenerateTexture = GlUtil.generateTexture(3553);
            }
            this.textureId = iGenerateTexture;
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.textureId);
            if (i15 == i16) {
                byteBuffer2 = byteBuffer;
            } else {
                YuvHelper.copyPlane(byteBuffer, i15, this.copyBuffer, i16, i13, i14);
                if (this.copyBuffer == null) {
                    return 0;
                }
                byteBuffer2 = null;
            }
            GLES20.glTexImage2D(3553, 0, 6408, i13, i14, 0, 6408, 5121, byteBuffer2);
            return this.textureId;
        }

        public void release() {
            this.copyBuffer = null;
            GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
            this.textureId = 0;
        }

        public int uploadFromBuffer(int i13, int i14, ByteBuffer byteBuffer, int i15) {
            return uploadRgbaData(i13, i14, byteBuffer, i15);
        }

        private RGBABufferTextureUploader() {
        }
    }

    public static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        public /* synthetic */ YuvUploader(int i13) {
            this();
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i13, int i14, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i15 = i13 / 2;
            int[] iArr2 = {i13, i15, i15};
            int i16 = i14 / 2;
            int[] iArr3 = {i14, i16, i16};
            int iMax = 0;
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = iArr[i17];
                int i19 = iArr2[i17];
                if (i18 > i19) {
                    iMax = Math.max(iMax, i19 * iArr3[i17]);
                }
            }
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i24 = 0; i24 < 3; i24++) {
                    this.yuvTextures[i24] = GlUtil.generateTexture(3553);
                }
            }
            for (int i25 = 0; i25 < 3; i25++) {
                GLES20.glActiveTexture(33984 + i25);
                GLES20.glBindTexture(3553, this.yuvTextures[i25]);
                int i26 = iArr[i25];
                int i27 = iArr2[i25];
                if (i26 == i27) {
                    byteBuffer = byteBufferArr[i25];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i25], i26, this.copyBuffer, i27, i27, iArr3[i25]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i25], iArr3[i25], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }

        private YuvUploader() {
        }
    }

    public VideoFrameDrawer() {
        int i13 = 0;
        this.yuvUploader = new YuvUploader(i13);
        this.rgbaBufferTextureUploader = new RGBABufferTextureUploader(i13);
    }

    private void calculateTransformedRenderSize(int i13, int i14, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i13;
            this.renderHeight = i14;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i15 = 0; i15 < 3; i15++) {
            float[] fArr = this.dstPoints;
            int i16 = i15 * 2;
            fArr[i16] = fArr[i16] * i13;
            int i17 = i16 + 1;
            fArr[i17] = fArr[i17] * i14;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f13, float f14, float f15, float f16) {
        return (int) Math.round(Math.hypot(f15 - f13, f16 - f14));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i13, int i14, int i15, int i16, int i17, int i18) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i19 = C174741.$SwitchMap$hms$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i19 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i13, i14, i15, i16, i17, i18);
        } else {
            if (i19 != 2) {
                throw new RuntimeException("Unknown texture type.");
            }
            glDrawer.drawRgb(textureBuffer.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i13, i14, i15, i16, i17, i18);
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void drawRGBAFrame(RendererCommon.GlDrawer glDrawer, Matrix matrix, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, ByteBuffer byteBuffer) {
        calculateTransformedRenderSize(i17, i18, matrix);
        if (this.renderWidth <= 0 || this.renderHeight <= 0) {
            return;
        }
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        this.renderMatrix.preRotate(i19);
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.renderMatrix.preConcat(matrix);
        }
        glDrawer.drawRgb(this.rgbaBufferTextureUploader.uploadRgbaData(i17, i18, byteBuffer, i24), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i13, i14, i15, i16);
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int i13, int i14) {
        buffer.retain();
        return buffer;
    }

    public void release() {
        this.yuvUploader.release();
        this.rgbaBufferTextureUploader.release();
        this.lastI420Frame = null;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i13, int i14, int i15, int i16) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        int i17 = this.renderWidth;
        if (i17 > 0 && this.renderHeight > 0) {
            boolean z4 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z4) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (z4) {
                this.lastI420Frame = null;
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i13, i14, i15, i16);
                return;
            }
            if (videoFrame != this.lastI420Frame) {
                this.lastI420Frame = videoFrame;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i13, i14, i15, i16);
            return;
        }
        Logging.m49574w("VideoFrameDrawer", "Illegal frame size: " + i17 + "x" + this.renderHeight);
    }
}
