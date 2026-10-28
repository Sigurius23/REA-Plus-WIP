package live.hms.video.media.capturers.camera.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.camera2.CaptureResult;
import android.media.Image;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001e¨\u00061"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;", "Ljava/io/Closeable;", "Landroid/media/Image;", "image", "Landroid/hardware/camera2/CaptureResult;", "metadata", "", "orientation", "format", "<init>", "(Landroid/media/Image;Landroid/hardware/camera2/CaptureResult;Ljava/lang/Integer;I)V", "Ll83/a0;", "close", "()V", "Landroid/content/Context;", "context", "", "correctOrientation", "Landroid/graphics/BitmapFactory$Options;", "opts", "Landroid/graphics/Bitmap;", "getBitmap", "(Landroid/content/Context;ZLandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "component1", "()Landroid/media/Image;", "component2", "()Landroid/hardware/camera2/CaptureResult;", "component3", "()Ljava/lang/Integer;", "component4", "()I", "copy", "(Landroid/media/Image;Landroid/hardware/camera2/CaptureResult;Ljava/lang/Integer;I)Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/media/Image;", "getImage", "Landroid/hardware/camera2/CaptureResult;", "getMetadata", "Ljava/lang/Integer;", "getOrientation", "I", "getFormat", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class ImageCaptureModel implements Closeable {
    private final int format;
    private final Image image;
    private final CaptureResult metadata;
    private final Integer orientation;

    public ImageCaptureModel(Image image, CaptureResult metadata, Integer num, int i13) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.image = image;
        this.metadata = metadata;
        this.orientation = num;
        this.format = i13;
    }

    public static /* synthetic */ ImageCaptureModel copy$default(ImageCaptureModel imageCaptureModel, Image image, CaptureResult captureResult, Integer num, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            image = imageCaptureModel.image;
        }
        if ((i14 & 2) != 0) {
            captureResult = imageCaptureModel.metadata;
        }
        if ((i14 & 4) != 0) {
            num = imageCaptureModel.orientation;
        }
        if ((i14 & 8) != 0) {
            i13 = imageCaptureModel.format;
        }
        return imageCaptureModel.copy(image, captureResult, num, i13);
    }

    public static /* synthetic */ Bitmap getBitmap$default(ImageCaptureModel imageCaptureModel, Context context, boolean z4, BitmapFactory.Options options, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            options = null;
        }
        return imageCaptureModel.getBitmap(context, z4, options);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.image.close();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CaptureResult getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    public final ImageCaptureModel copy(Image image, CaptureResult metadata, Integer orientation, int format) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(metadata, "metadata");
        return new ImageCaptureModel(image, metadata, orientation, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageCaptureModel)) {
            return false;
        }
        ImageCaptureModel imageCaptureModel = (ImageCaptureModel) other;
        return AbstractC22676k.m65745e(this.image, imageCaptureModel.image) && AbstractC22676k.m65745e(this.metadata, imageCaptureModel.metadata) && AbstractC22676k.m65745e(this.orientation, imageCaptureModel.orientation) && this.format == imageCaptureModel.format;
    }

    public final Bitmap getBitmap(Context context, boolean correctOrientation, BitmapFactory.Options opts) {
        Bitmap bitmapDecodeByteArray;
        AbstractC22676k.m65750j(context, "context");
        int format = this.image.getFormat();
        if (format == 35) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.image.getWidth(), this.image.getHeight(), Bitmap.Config.ARGB_8888);
            AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
            new YuvToRgbConverter(context).yuvToRgb(this.image, bitmapCreateBitmap);
            bitmapDecodeByteArray = bitmapCreateBitmap;
        } else if (format == 256 || format == 1768253795) {
            ByteBuffer buffer = this.image.getPlanes()[0].getBuffer();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining, opts);
        } else {
            bitmapDecodeByteArray = null;
        }
        return correctOrientation ? new OrientationTools().correctOrientation(bitmapDecodeByteArray, this.orientation) : bitmapDecodeByteArray;
    }

    public final int getFormat() {
        return this.format;
    }

    public final Image getImage() {
        return this.image;
    }

    public final CaptureResult getMetadata() {
        return this.metadata;
    }

    public final Integer getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        int iHashCode = (this.metadata.hashCode() + (this.image.hashCode() * 31)) * 31;
        Integer num = this.orientation;
        return Integer.hashCode(this.format) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("ImageCaptureModel(image=");
        sb4.append(this.image);
        sb4.append(", metadata=");
        sb4.append(this.metadata);
        sb4.append(", orientation=");
        sb4.append(this.orientation);
        sb4.append(", format=");
        return AbstractC11895b.m31999r(sb4, this.format, ')');
    }
}
