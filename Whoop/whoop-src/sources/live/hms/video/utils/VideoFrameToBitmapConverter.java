package live.hms.video.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import hms.webrtc.VideoFrame;
import io.github.crow_misia.libyuv.Yuv;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/utils/VideoFrameToBitmapConverter;", "", "<init>", "()V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class VideoFrameToBitmapConverter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "VideoFrameToBitmapConverter";

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;", "", "<init>", "()V", "TAG", "", "convertToBitmap", "Landroid/graphics/Bitmap;", "videoFrame", "Lhms/webrtc/VideoFrame;", "applyRotation", "", "convertI420ToArgb", "i420Buffer", "Lhms/webrtc/VideoFrame$I420Buffer;", "rotateBitmap", "bitmap", "degrees", "", "getByteArrayFromByteBuffer", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Bitmap convertI420ToArgb(VideoFrame.I420Buffer i420Buffer) {
            int width = i420Buffer.getWidth();
            int height = i420Buffer.getHeight();
            ByteBuffer dataY = i420Buffer.getDataY();
            AbstractC22676k.m65749i(dataY, "getDataY(...)");
            ByteBuffer dataU = i420Buffer.getDataU();
            AbstractC22676k.m65749i(dataU, "getDataU(...)");
            ByteBuffer dataV = i420Buffer.getDataV();
            AbstractC22676k.m65749i(dataV, "getDataV(...)");
            int strideY = i420Buffer.getStrideY();
            int strideU = i420Buffer.getStrideU();
            int strideV = i420Buffer.getStrideV();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(width * height * 4);
            AbstractC22676k.m65749i(byteBufferAllocateDirect, "allocateDirect(...)");
            Yuv.INSTANCE.convertI420ToARGB(dataY, strideY, 0, dataV, strideV, 0, dataU, strideU, 0, byteBufferAllocateDirect, width * 4, 0, width, height);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
            return bitmapCreateBitmap;
        }

        public static /* synthetic */ Bitmap convertToBitmap$default(Companion companion, VideoFrame videoFrame, boolean z4, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                z4 = true;
            }
            return companion.convertToBitmap(videoFrame, z4);
        }

        private final byte[] getByteArrayFromByteBuffer(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr, 0, iRemaining);
            return bArr;
        }

        private final Bitmap rotateBitmap(Bitmap bitmap, int degrees) {
            if (degrees == 0) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(degrees);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }

        public final Bitmap convertToBitmap(VideoFrame videoFrame, boolean applyRotation) {
            int rotation;
            AbstractC22676k.m65750j(videoFrame, "videoFrame");
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            if (i420 == null) {
                return null;
            }
            if (applyRotation) {
                try {
                    rotation = videoFrame.getRotation();
                } catch (Exception e5) {
                    HMSLogger.INSTANCE.m71138e(VideoFrameToBitmapConverter.TAG, "Error converting VideoFrame to Bitmap", e5);
                    return null;
                } finally {
                    i420.release();
                }
            } else {
                rotation = 0;
            }
            Bitmap bitmapConvertI420ToArgb = convertI420ToArgb(i420);
            if (applyRotation && rotation != 0) {
                bitmapConvertI420ToArgb = rotateBitmap(bitmapConvertI420ToArgb, rotation);
            }
            return bitmapConvertI420ToArgb;
        }

        private Companion() {
        }
    }
}
