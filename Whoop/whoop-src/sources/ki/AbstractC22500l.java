package ki;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ki.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22500l {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config[] f88199a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config f88200b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: a */
    public static final int m64992a(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    /* JADX INFO: renamed from: b */
    public static final int m64993b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }
}
