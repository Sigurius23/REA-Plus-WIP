package p461rh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rh.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31412a implements InterfaceC31421j {

    /* JADX INFO: renamed from: a */
    public final Bitmap f129270a;

    public C31412a(Bitmap bitmap) {
        this.f129270a = bitmap;
    }

    @Override // p461rh.InterfaceC31421j
    /* JADX INFO: renamed from: a */
    public final boolean mo96729a() {
        return true;
    }

    @Override // p461rh.InterfaceC31421j
    /* JADX INFO: renamed from: b */
    public final void mo96730b(Canvas canvas) {
        canvas.drawBitmap(this.f129270a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31412a) && AbstractC22676k.m65745e(this.f129270a, ((C31412a) obj).f129270a);
    }

    @Override // p461rh.InterfaceC31421j
    public final int getHeight() {
        return this.f129270a.getHeight();
    }

    @Override // p461rh.InterfaceC31421j
    public final long getSize() {
        int i13;
        int allocationByteCount;
        Bitmap bitmap = this.f129270a;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            allocationByteCount = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i13 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i13 = 2;
            } else {
                i13 = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
            }
            allocationByteCount = i13 * height;
        }
        return allocationByteCount;
    }

    @Override // p461rh.InterfaceC31421j
    public final int getWidth() {
        return this.f129270a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f129270a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f129270a + ", shareable=true)";
    }
}
