package p221ii;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import gi.C15878i;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ii.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18531a extends AbstractC18532b {

    /* JADX INFO: renamed from: a */
    public final String f72200a = String.valueOf(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18531a.class).getQualifiedName());

    @Override // p221ii.AbstractC18532b
    public final String getCacheKey() {
        return this.f72200a;
    }

    @Override // p221ii.AbstractC18532b
    public final Object transform(Bitmap bitmap, C15878i c15878i, InterfaceC30057d interfaceC30057d) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f13 = iMin / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f13, f13, f13, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f13 - (bitmap.getWidth() / 2.0f), f13 - (bitmap.getHeight() / 2.0f), paint);
        return bitmapCreateBitmap;
    }
}
