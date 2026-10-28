package gl;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: gl.w */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC15958w {

    /* JADX INFO: renamed from: a */
    public static final Paint f60389a = new Paint(6);

    /* JADX INFO: renamed from: b */
    public static final Lock f60390b;

    static {
        new Paint(7);
        f60390b = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new LockC15957v();
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    public static void m45023a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f60390b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f60389a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m45024b(InterfaceC0955b interfaceC0955b, Bitmap bitmap, int i13, int i14) {
        if (bitmap.getWidth() != i13 || bitmap.getHeight() != i14) {
            float fMin = Math.min(i13 / bitmap.getWidth(), i14 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapMo2434o = interfaceC0955b.mo2434o((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                bitmapMo2434o.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i13 + "x" + i14);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmapMo2434o.getWidth() + "x" + bitmapMo2434o.getHeight());
                    StringBuilder sb4 = new StringBuilder("minPct:   ");
                    sb4.append(fMin);
                    Log.v("TransformationUtils", sb4.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                m45023a(bitmap, bitmapMo2434o, matrix);
                return bitmapMo2434o;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: c */
    public static Lock m45025c() {
        return f60390b;
    }

    /* JADX INFO: renamed from: d */
    public static int m45026d(int i13) {
        switch (i13) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m45027e(int i13) {
        switch (i13) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m45028f(InterfaceC0955b interfaceC0955b, Bitmap bitmap, int i13) {
        switch (i13) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (i13) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                Bitmap bitmapMo2434o = interfaceC0955b.mo2434o(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                matrix.postTranslate(-rectF.left, -rectF.top);
                bitmapMo2434o.setHasAlpha(bitmap.hasAlpha());
                m45023a(bitmap, bitmapMo2434o, matrix);
                return bitmapMo2434o;
            default:
                return bitmap;
        }
    }
}
