package live.hms.video.media.capturers.camera.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/media/Image;", "image", "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;", "yuvBuffer", "", "needCreateAllocations", "(Landroid/media/Image;Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;)Z", "Landroid/graphics/Bitmap;", "output", "Ll83/a0;", "yuvToRgb", "(Landroid/media/Image;Landroid/graphics/Bitmap;)V", "Landroid/renderscript/RenderScript;", "kotlin.jvm.PlatformType", "rs", "Landroid/renderscript/RenderScript;", "Landroid/renderscript/ScriptIntrinsicYuvToRGB;", "scriptYuvToRgb", "Landroid/renderscript/ScriptIntrinsicYuvToRGB;", "Ljava/nio/ByteBuffer;", "yuvBits", "Ljava/nio/ByteBuffer;", "", "bytes", "[B", "Landroid/renderscript/Allocation;", "inputAllocation", "Landroid/renderscript/Allocation;", "outputAllocation", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class YuvToRgbConverter {
    private byte[] bytes;
    private Allocation inputAllocation;
    private Allocation outputAllocation;
    private final RenderScript rs;
    private final ScriptIntrinsicYuvToRGB scriptYuvToRgb;
    private ByteBuffer yuvBits;

    public YuvToRgbConverter(Context context) {
        AbstractC22676k.m65750j(context, "context");
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.rs = renderScriptCreate;
        this.scriptYuvToRgb = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        this.bytes = new byte[0];
    }

    private final boolean needCreateAllocations(Image image, YuvByteBuffer yuvBuffer) {
        Allocation allocation = this.inputAllocation;
        if (allocation == null) {
            return true;
        }
        AbstractC22676k.m65747g(allocation);
        if (allocation.getType().getX() != image.getWidth()) {
            return true;
        }
        Allocation allocation2 = this.inputAllocation;
        AbstractC22676k.m65747g(allocation2);
        if (allocation2.getType().getY() != image.getHeight()) {
            return true;
        }
        Allocation allocation3 = this.inputAllocation;
        AbstractC22676k.m65747g(allocation3);
        return allocation3.getType().getYuv() != yuvBuffer.getType() || this.bytes.length == yuvBuffer.getBuffer().capacity();
    }

    public final synchronized void yuvToRgb(Image image, Bitmap output) {
        try {
            AbstractC22676k.m65750j(image, "image");
            AbstractC22676k.m65750j(output, "output");
            YuvByteBuffer yuvByteBuffer = new YuvByteBuffer(image, this.yuvBits);
            this.yuvBits = yuvByteBuffer.getBuffer();
            if (needCreateAllocations(image, yuvByteBuffer)) {
                RenderScript renderScript = this.rs;
                this.inputAllocation = Allocation.createTyped(this.rs, new Type.Builder(renderScript, Element.U8(renderScript)).setX(image.getWidth()).setY(image.getHeight()).setYuvFormat(yuvByteBuffer.getType()).create(), 1);
                this.bytes = new byte[yuvByteBuffer.getBuffer().capacity()];
                RenderScript renderScript2 = this.rs;
                this.outputAllocation = Allocation.createTyped(this.rs, new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(image.getWidth()).setY(image.getHeight()).create(), 1);
            }
            yuvByteBuffer.getBuffer().get(this.bytes);
            Allocation allocation = this.inputAllocation;
            AbstractC22676k.m65747g(allocation);
            allocation.copyFrom(this.bytes);
            Allocation allocation2 = this.inputAllocation;
            AbstractC22676k.m65747g(allocation2);
            allocation2.copyFrom(this.bytes);
            this.scriptYuvToRgb.setInput(this.inputAllocation);
            this.scriptYuvToRgb.forEach(this.outputAllocation);
            Allocation allocation3 = this.outputAllocation;
            AbstractC22676k.m65747g(allocation3);
            allocation3.copyTo(output);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
