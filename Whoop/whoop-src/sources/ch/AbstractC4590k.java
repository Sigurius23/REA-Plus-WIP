package ch;

import android.os.Trace;
import androidx.compose.runtime.Composer;
import bh.InterfaceC3242e;
import coil.compose.AsyncImagePainter;
import mh.C25540h;
import mh.C25542j;
import p027b3.AbstractC2399k2;
import p088dc.AbstractC11895b;
import p208i2.C17885g;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.C28635l;
import p390p1.C28655q;
import p437qt.C30582e;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.functions.Function1;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ch.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4590k {

    /* JADX INFO: renamed from: a */
    public static final C4589j f18472a = new C4589j();

    /* JADX INFO: renamed from: b */
    public static final C30582e f18473b = new C30582e(12);

    /* JADX INFO: renamed from: a */
    public static final AsyncImagePainter m14258a(C25542j c25542j, InterfaceC3242e interfaceC3242e, Function1 function1, Function1 function2, InterfaceC39105k interfaceC39105k, C30582e c30582e, Composer composer, int i13, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1645646697);
        if ((i14 & 64) != 0) {
            c30582e = f18473b;
        }
        AsyncImagePainter asyncImagePainterM14259b = m14259b(new C4591l(c25542j, c30582e, interfaceC3242e), function1, function2, interfaceC39105k, c28655q);
        c28655q.m87173q(false);
        return asyncImagePainterM14259b;
    }

    /* JADX INFO: renamed from: b */
    public static final AsyncImagePainter m14259b(C4591l c4591l, Function1 function1, Function1 function2, InterfaceC39105k interfaceC39105k, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            Object obj = c4591l.f18474a;
            InterfaceC3242e interfaceC3242e = c4591l.f18476c;
            C25542j c25542jM14264b = AbstractC4601v.m14264b(obj, c28655q);
            m14261d(c25542jM14264b);
            c28655q.m87152f0(1094691773);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new AsyncImagePainter(c25542jM14264b, interfaceC3242e);
                c28655q.m87172p0(objM87133R);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objM87133R;
            c28655q.m87173q(false);
            asyncImagePainter.f20218L = function1;
            asyncImagePainter.f20219M = function2;
            asyncImagePainter.f20220N = interfaceC39105k;
            asyncImagePainter.f20221O = 1;
            asyncImagePainter.f20222P = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            asyncImagePainter.f20225S.setValue(interfaceC3242e);
            asyncImagePainter.f20224R.setValue(c25542jM14264b);
            asyncImagePainter.mo15502a();
            c28655q.m87173q(false);
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m14260c(String str) {
        throw new IllegalArgumentException(AbstractC31061c.m95640p("Unsupported type: ", str, ". ", AbstractC11895b.m31996o("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    /* JADX INFO: renamed from: d */
    public static final void m14261d(C25542j c25542j) {
        Object obj = c25542j.f100109b;
        if (obj instanceof C25540h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C17885g) {
            m14260c("ImageBitmap");
            throw null;
        }
        if (obj instanceof C27430e) {
            m14260c("ImageVector");
            throw null;
        }
        if (obj instanceof AbstractC26165a) {
            m14260c("Painter");
            throw null;
        }
        if (c25542j.f100110c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
