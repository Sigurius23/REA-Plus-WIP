package tl;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: tl.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC33913l {

    /* JADX INFO: renamed from: a */
    public static final char[] f142093a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f142094b = new char[64];

    /* JADX INFO: renamed from: a */
    public static boolean m107266a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m107267b(int i13, int i14, Bitmap.Config config) {
        int i15 = i13 * i14;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i16 = AbstractC33912k.f142092a[config.ordinal()];
        int i17 = 1;
        if (i16 != 1) {
            i17 = 2;
            if (i16 != 2 && i16 != 3) {
                i17 = 4;
                if (i16 == 4) {
                    i17 = 8;
                }
            }
        }
        return i15 * i17;
    }

    /* JADX INFO: renamed from: c */
    public static int m107268c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m107269d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static int m107270e(int i13, int i14) {
        return (i14 * 31) + i13;
    }

    /* JADX INFO: renamed from: f */
    public static int m107271f(int i13, Object obj) {
        return m107270e(obj == null ? 0 : obj.hashCode(), i13);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m107272g() {
        return !(Looper.myLooper() == Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: h */
    public static boolean m107273h(int i13, int i14) {
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            return i14 > 0 || i14 == Integer.MIN_VALUE;
        }
        return false;
    }
}
