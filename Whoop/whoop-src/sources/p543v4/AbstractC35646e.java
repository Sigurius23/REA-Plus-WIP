package p543v4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import io.sentry.internal.debugmeta.C20378c;
import java.util.List;
import p002a0.C0005a0;
import p044c5.AbstractC4216h;
import p044c5.C4212d;
import p505ts.AbstractC34132o;
import p508ty.C34249c;
import p513u4.AbstractC34514b;
import p513u4.C34517e;
import p513u4.C34519g;
import p513u4.InterfaceC34516d;
import pf.AbstractC29125c;
import te0.AbstractC33745d;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: v4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35646e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC34132o f151456a;

    /* JADX INFO: renamed from: b */
    public static final C0005a0 f151457b;

    static {
        Trace.beginSection(AbstractC29125c.m88517Z("TypefaceCompat static init"));
        if (Build.VERSION.SDK_INT >= 29) {
            f151456a = new C35648g();
        } else {
            f151456a = new C35647f();
        }
        f151457b = new C0005a0(16);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m112845a(Context context, InterfaceC34516d interfaceC34516d, Resources resources, int i13, String str, int i14, int i15, AbstractC34514b abstractC34514b, boolean z4) {
        Typeface typefaceMo107897m;
        if (interfaceC34516d instanceof C34519g) {
            C34519g c34519g = (C34519g) interfaceC34516d;
            String strM109093d = c34519g.m109093d();
            Typeface typeface = null;
            if (strM109093d != null && !strM109093d.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(strM109093d, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (abstractC34514b != null) {
                    abstractC34514b.m109080b(typeface);
                }
                return typeface;
            }
            boolean z13 = !z4 ? abstractC34514b != null : c34519g.m109091b() != 0;
            int iM109094e = z4 ? c34519g.m109094e() : -1;
            Handler handlerM109071g = AbstractC34514b.m109071g();
            C34249c c34249c = new C34249c(abstractC34514b, 10);
            List listM106660s = c34519g.m109090a() != null ? AbstractC33745d.m106660s(c34519g.m109092c(), c34519g.m109090a()) : AbstractC33745d.m106659r(c34519g.m109092c());
            C20378c c20378c = new C20378c(6, c34249c, AbstractC34924m.m110158s(handlerM109071g));
            if (!z13) {
                typefaceMo107897m = AbstractC4216h.m13080c(context, listM106660s, i15, c20378c);
            } else {
                if (listM106660s.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                typefaceMo107897m = AbstractC4216h.m13081d(context, (C4212d) listM106660s.get(0), c20378c, i15, iM109094e);
            }
        } else {
            typefaceMo107897m = f151456a.mo107897m(context, (C34517e) interfaceC34516d, resources, i15);
            if (abstractC34514b != null) {
                if (typefaceMo107897m != null) {
                    abstractC34514b.m109080b(typefaceMo107897m);
                } else {
                    abstractC34514b.m109079a(-3);
                }
            }
        }
        if (typefaceMo107897m != null) {
            f151457b.m3d(m112846b(resources, i13, str, i14, i15), typefaceMo107897m);
        }
        return typefaceMo107897m;
    }

    /* JADX INFO: renamed from: b */
    public static String m112846b(Resources resources, int i13, String str, int i14, int i15) {
        return resources.getResourcePackageName(i13) + '-' + str + '-' + i14 + '-' + i13 + '-' + i15;
    }
}
