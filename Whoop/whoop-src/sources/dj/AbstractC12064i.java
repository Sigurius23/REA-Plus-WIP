package dj;

import ae3.C0796d;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: renamed from: dj.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12064i {

    /* JADX INFO: renamed from: a */
    public static final Matrix f40031a = new Matrix();

    /* JADX INFO: renamed from: b */
    public static final C0796d f40032b = new C0796d(2);

    /* JADX INFO: renamed from: c */
    public static final C0796d f40033c = new C0796d(3);

    /* JADX INFO: renamed from: d */
    public static final C0796d f40034d = new C0796d(4);

    /* JADX INFO: renamed from: e */
    public static final C0796d f40035e = new C0796d(5);

    /* JADX INFO: renamed from: f */
    public static final float f40036f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: a */
    public static void m33263a(Path path, float f13, float f14, float f15) {
        PathMeasure pathMeasure = (PathMeasure) f40032b.get();
        Path path2 = (Path) f40033c.get();
        Path path3 = (Path) f40034d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f13 == 1.0f && f14 == 0.0f) && length >= 1.0f && Math.abs((f14 - f13) - 1.0f) >= 0.01d) {
            float f16 = f13 * length;
            float f17 = f14 * length;
            float f18 = f15 * length;
            float fMin = Math.min(f16, f17) + f18;
            float fMax = Math.max(f16, f17) + f18;
            if (fMin >= length && fMax >= length) {
                fMin = AbstractC12062g.m33254d(fMin, length);
                fMax = AbstractC12062g.m33254d(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = AbstractC12062g.m33254d(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = AbstractC12062g.m33254d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m33264b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m33265c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m33266d(Bitmap bitmap, int i13, int i14) {
        if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i13, i14, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
