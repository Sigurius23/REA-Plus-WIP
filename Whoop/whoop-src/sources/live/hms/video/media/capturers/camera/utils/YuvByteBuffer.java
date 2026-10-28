package live.hms.video.media.capturers.camera.utils;

import android.media.Image;
import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002#$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;", "", "Landroid/media/Image;", "image", "Ljava/nio/ByteBuffer;", "dstBuffer", "<init>", "(Landroid/media/Image;Ljava/nio/ByteBuffer;)V", "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;", "Ll83/a0;", "removePadding", "(Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;)V", "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;", "plane", "dst", "", MapboxMap.QFE_OFFSET, "removePaddingCompact", "(Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;Ljava/nio/ByteBuffer;I)V", "removePaddingNotCompact", "(Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;Ljava/nio/ByteBuffer;I)V", "buffer", "start", "size", "clipBuffer", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "type", "I", "getType", "()I", "getType$annotations", "()V", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "ImageWrapper", "PlaneWrapper", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class YuvByteBuffer {
    private final ByteBuffer buffer;
    private final int type;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;", "", "image", "Landroid/media/Image;", "<init>", "(Landroid/media/Image;)V", "width", "", "getWidth", "()I", "height", "getHeight", "y", "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;", "getY", "()Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;", "u", "getU", "v", "getV", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class ImageWrapper {
        private final int height;
        private final PlaneWrapper u;
        private final PlaneWrapper v;
        private final int width;
        private final PlaneWrapper y;

        public ImageWrapper(Image image) {
            AbstractC22676k.m65750j(image, "image");
            int width = image.getWidth();
            this.width = width;
            int height = image.getHeight();
            this.height = height;
            Image.Plane plane = image.getPlanes()[0];
            AbstractC22676k.m65749i(plane, "get(...)");
            PlaneWrapper planeWrapper = new PlaneWrapper(width, height, plane);
            this.y = planeWrapper;
            Image.Plane plane2 = image.getPlanes()[1];
            AbstractC22676k.m65749i(plane2, "get(...)");
            PlaneWrapper planeWrapper2 = new PlaneWrapper(width / 2, height / 2, plane2);
            this.u = planeWrapper2;
            Image.Plane plane3 = image.getPlanes()[2];
            AbstractC22676k.m65749i(plane3, "get(...)");
            PlaneWrapper planeWrapper3 = new PlaneWrapper(width / 2, height / 2, plane3);
            this.v = planeWrapper3;
            if (planeWrapper.getPixelStride() != 1) {
                throw new IllegalArgumentException(AbstractC18489d0.m53371l(new StringBuilder("Pixel stride for Y plane must be 1 but got "), planeWrapper.getPixelStride(), " instead.").toString());
            }
            if (planeWrapper2.getPixelStride() == planeWrapper3.getPixelStride() && planeWrapper2.getRowStride() == planeWrapper3.getRowStride()) {
                if (planeWrapper2.getPixelStride() != 1 && planeWrapper2.getPixelStride() != 2) {
                    throw new IllegalArgumentException("Supported pixel strides for U and V planes are 1 and 2");
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder("U and V planes must have the same pixel and row strides but got pixel=");
            sb4.append(planeWrapper2.getPixelStride());
            sb4.append(" row=");
            sb4.append(planeWrapper2.getRowStride());
            sb4.append(" for U and pixel=");
            sb4.append(planeWrapper3.getPixelStride());
            sb4.append(" and row=");
            throw new IllegalArgumentException(AbstractC18489d0.m53371l(sb4, planeWrapper3.getRowStride(), " for V").toString());
        }

        public final int getHeight() {
            return this.height;
        }

        public final PlaneWrapper getU() {
            return this.u;
        }

        public final PlaneWrapper getV() {
            return this.v;
        }

        public final int getWidth() {
            return this.width;
        }

        public final PlaneWrapper getY() {
            return this.y;
        }
    }

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\n¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;", "", "width", "", "height", "plane", "Landroid/media/Image$Plane;", "<init>", "(IILandroid/media/Image$Plane;)V", "getWidth", "()I", "getHeight", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "rowStride", "getRowStride", "pixelStride", "getPixelStride", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class PlaneWrapper {
        private final ByteBuffer buffer;
        private final int height;
        private final int pixelStride;
        private final int rowStride;
        private final int width;

        public PlaneWrapper(int i13, int i14, Image.Plane plane) {
            AbstractC22676k.m65750j(plane, "plane");
            this.width = i13;
            this.height = i14;
            ByteBuffer buffer = plane.getBuffer();
            AbstractC22676k.m65749i(buffer, "getBuffer(...)");
            this.buffer = buffer;
            this.rowStride = plane.getRowStride();
            this.pixelStride = plane.getPixelStride();
        }

        public final ByteBuffer getBuffer() {
            return this.buffer;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getPixelStride() {
            return this.pixelStride;
        }

        public final int getRowStride() {
            return this.rowStride;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    public YuvByteBuffer(Image image, ByteBuffer byteBuffer) {
        AbstractC22676k.m65750j(image, "image");
        ImageWrapper imageWrapper = new ImageWrapper(image);
        this.type = imageWrapper.getU().getPixelStride() == 1 ? 35 : 17;
        int height = ((image.getHeight() * image.getWidth()) * 3) / 2;
        if (byteBuffer == null || byteBuffer.capacity() < height || byteBuffer.isReadOnly() || !byteBuffer.isDirect()) {
            byteBuffer = ByteBuffer.allocateDirect(height);
            AbstractC22676k.m65747g(byteBuffer);
        }
        this.buffer = byteBuffer;
        byteBuffer.rewind();
        removePadding(imageWrapper);
    }

    private final ByteBuffer clipBuffer(ByteBuffer buffer, int start, int size) {
        ByteBuffer byteBufferDuplicate = buffer.duplicate();
        byteBufferDuplicate.position(start);
        byteBufferDuplicate.limit(start + size);
        ByteBuffer byteBufferSlice = byteBufferDuplicate.slice();
        AbstractC22676k.m65749i(byteBufferSlice, "slice(...)");
        return byteBufferSlice;
    }

    public static /* synthetic */ void getType$annotations() {
    }

    private final void removePadding(ImageWrapper image) {
        int width = image.getY().getWidth() * image.getY().getHeight();
        int width2 = image.getU().getWidth() * image.getU().getHeight();
        if (image.getY().getRowStride() > image.getY().getWidth()) {
            removePaddingCompact(image.getY(), this.buffer, 0);
        } else {
            this.buffer.position(0);
            this.buffer.put(image.getY().getBuffer());
        }
        if (this.type == 35) {
            if (image.getU().getRowStride() > image.getU().getWidth()) {
                removePaddingCompact(image.getU(), this.buffer, width);
                removePaddingCompact(image.getV(), this.buffer, width + width2);
            } else {
                this.buffer.position(width);
                this.buffer.put(image.getU().getBuffer());
                this.buffer.position(width + width2);
                this.buffer.put(image.getV().getBuffer());
            }
        } else if (image.getU().getRowStride() > image.getU().getWidth() * 2) {
            removePaddingNotCompact(image, this.buffer, width);
        } else {
            this.buffer.position(width);
            ByteBuffer buffer = image.getV().getBuffer();
            int height = (image.getV().getHeight() * image.getV().getRowStride()) - 1;
            if (buffer.capacity() > height) {
                buffer = clipBuffer(image.getV().getBuffer(), 0, height);
            }
            this.buffer.put(buffer);
            byte b = image.getU().getBuffer().get(image.getU().getBuffer().capacity() - 1);
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.put(byteBuffer.capacity() - 1, b);
        }
        this.buffer.rewind();
    }

    private final void removePaddingCompact(PlaneWrapper plane, ByteBuffer dst, int offset) {
        if (plane.getPixelStride() != 1) {
            throw new IllegalArgumentException("use removePaddingCompact with pixelStride == 1");
        }
        ByteBuffer buffer = plane.getBuffer();
        int rowStride = plane.getRowStride();
        dst.position(offset);
        int height = plane.getHeight();
        for (int i13 = 0; i13 < height; i13++) {
            dst.put(clipBuffer(buffer, i13 * rowStride, plane.getWidth()));
        }
    }

    private final void removePaddingNotCompact(ImageWrapper image, ByteBuffer dst, int offset) {
        if (image.getU().getPixelStride() != 2) {
            throw new IllegalArgumentException("use removePaddingNotCompact pixelStride == 2");
        }
        int width = image.getU().getWidth();
        int height = image.getU().getHeight();
        int rowStride = image.getU().getRowStride();
        dst.position(offset);
        int i13 = height - 1;
        for (int i14 = 0; i14 < i13; i14++) {
            dst.put(clipBuffer(image.getV().getBuffer(), i14 * rowStride, width * 2));
        }
        dst.put(clipBuffer(image.getU().getBuffer(), (i13 * rowStride) - 1, width * 2));
    }

    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ YuvByteBuffer(Image image, ByteBuffer byteBuffer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(image, (i13 & 2) != 0 ? null : byteBuffer);
    }
}
