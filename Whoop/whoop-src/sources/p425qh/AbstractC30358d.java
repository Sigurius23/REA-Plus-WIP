package p425qh;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p341nh.C26707a;
import p341nh.EnumC26713g;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: qh.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30358d {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config[] f124548a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config f124549b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: c */
    public static final C34807d0 f124550c = new C34807d0((String[]) new ArrayList(20).toArray(new String[0]));

    /* JADX INFO: renamed from: a */
    public static final void m92827a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m92828b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return null;
        }
        String strM125864J0 = AbstractC39414r.m125864J0('#', str, str);
        String strM125864J1 = AbstractC39414r.m125864J0('?', strM125864J0, strM125864J0);
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC39414r.m125860F0('.', AbstractC39414r.m125860F0('/', strM125864J1, strM125864J1), ""));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m92829c(Uri uri) {
        return AbstractC22676k.m65745e(uri.getScheme(), "file") && AbstractC22676k.m65745e((String) AbstractC25265s.m74100H0(uri.getPathSegments()), "android_asset");
    }

    /* JADX INFO: renamed from: d */
    public static final int m92830d(AbstractC12350b abstractC12350b, EnumC26713g enumC26713g) {
        if (abstractC12350b instanceof C26707a) {
            return ((C26707a) abstractC12350b).f106205a;
        }
        int iOrdinal = enumC26713g.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
