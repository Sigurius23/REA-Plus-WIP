package gl;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: gl.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC15950o {

    /* JADX INFO: renamed from: a */
    public static final C15949n f60373a = new C15949n(false);

    /* JADX INFO: renamed from: a */
    public static C15938c m45018a(InterfaceC0955b interfaceC0955b, Drawable drawable, int i13, int i14) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z4 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i13 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i14 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i13 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i14 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC15958w.f60390b;
                    lock.lock();
                    Bitmap bitmapMo2434o = interfaceC0955b.mo2434o(i13, i14, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo2434o);
                        current.setBounds(0, 0, i13, i14);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo2434o;
                    } catch (Throwable th3) {
                        lock.unlock();
                        throw th3;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z4 = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z4 = true;
        }
        if (!z4) {
            interfaceC0955b = f60373a;
        }
        return C15938c.m44994b(interfaceC0955b, bitmap);
    }
}
