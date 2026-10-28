package va3;

import android.content.Context;
import fa3.AbstractC14331x;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.regex.Matcher;
import l83.C23465k;
import m83.AbstractC25265s;
import oa3.InterfaceC27771n;
import p031b9.C2860q0;
import p037bu.C3632c;
import p249jc.AbstractC21598x;
import p636y3.C39173e;
import p636y3.C39182n;
import p670z3.AbstractC40036b;
import p670z3.InterfaceC40035a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pa3.C29039b;
import pa3.C29041d;
import pa3.C29043f;
import pa3.EnumC29038a;
import qf3.C30330b;
import rf3.AbstractC31363b;
import sa3.C32331e;
import tf3.C33768a;
import ua3.AbstractC34721a;
import w93.C36969b;
import x93.AbstractC38109c;
import yb3.AbstractC39421y;
import yb3.C39410n;

/* JADX INFO: renamed from: va3.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35849g {
    /* JADX INFO: renamed from: a */
    public static final C39173e m113799a(Context context) {
        float f13 = context.getResources().getConfiguration().fontScale;
        float f14 = context.getResources().getDisplayMetrics().density;
        InterfaceC40035a interfaceC40035aM128366a = AbstractC40036b.m128366a(f13);
        if (interfaceC40035aM128366a == null) {
            interfaceC40035aM128366a = new C39182n(f13);
        }
        return new C39173e(f14, f13, interfaceC40035aM128366a);
    }

    /* JADX INFO: renamed from: b */
    public static final C39410n m113800b(Matcher matcher, int i13, CharSequence charSequence) {
        if (matcher.find(i13)) {
            return new C39410n(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m113801c(C23465k c23465k, InterfaceC21461d clazz) {
        AbstractC22676k.m65750j(clazz, "clazz");
        AbstractC31363b abstractC31363b = (AbstractC31363b) c23465k.f92938x;
        C30330b c30330b = abstractC31363b.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        C30330b c30330b2 = abstractC31363b.f129023a;
        ((C33768a) c23465k.f92937w).m106774b(AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a), abstractC31363b, true);
    }

    /* JADX INFO: renamed from: d */
    public static void m113802d(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m113803e(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m113804f(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m113805g(C2860q0 c2860q0) {
        c2860q0.getClass();
    }

    /* JADX INFO: renamed from: h */
    public static void m113806h(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m113807i(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m113808j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m113809k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX INFO: renamed from: l */
    public static C36969b m113810l(Class klass) {
        C29039b c29039b;
        InterfaceC27771n c29041d;
        EnumC29038a enumC29038a;
        AbstractC22676k.m65750j(klass, "klass");
        C29043f c29043f = new C29043f();
        c29043f.f117542w = null;
        c29043f.f117543x = null;
        c29043f.f117544y = 0;
        c29043f.f117545z = null;
        c29043f.f117538E = null;
        c29043f.f117539F = null;
        c29043f.f117540G = null;
        c29043f.f117541H = null;
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        AbstractC22676k.m65749i(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            AbstractC22676k.m65747g(annotation);
            Class clsM60663S = AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation));
            C35845c c35845cM122089a = AbstractC38109c.m122089a(clsM60663S);
            C35847e c35847eM113773a = c35845cM122089a.m113773a();
            if (c35847eM113773a.equals(AbstractC14331x.f52306a)) {
                c29041d = new C3632c(c29043f);
            } else if (c35847eM113773a.equals(AbstractC14331x.f52320o)) {
                c29041d = new C29041d(c29043f, 0);
            } else if (C29043f.f117536I || c29043f.f117540G != null || (enumC29038a = (EnumC29038a) C29043f.f117537J.get(c35845cM122089a)) == null) {
                c29041d = null;
            } else {
                c29043f.f117540G = enumC29038a;
                c29041d = new C29041d(c29043f, 1);
            }
            if (c29041d != null) {
                AbstractC35844b.m113768i(c29041d, annotation, clsM60663S);
            }
        }
        C32331e c32331e = C32331e.f133827g;
        if (c29043f.f117540G == null || c29043f.f117542w == null) {
            c29039b = null;
        } else {
            C32331e c32331e2 = new C32331e(c29043f.f117542w, (c29043f.f117544y & 8) != 0);
            if (c32331e2.m100629b(c32331e)) {
                EnumC29038a enumC29038a2 = c29043f.f117540G;
                if ((enumC29038a2 == EnumC29038a.CLASS || enumC29038a2 == EnumC29038a.FILE_FACADE || enumC29038a2 == EnumC29038a.MULTIFILE_CLASS_PART) && c29043f.f117545z == null) {
                    c29039b = null;
                }
            } else {
                c29043f.f117539F = c29043f.f117545z;
                c29043f.f117545z = null;
            }
            String[] strArr = c29043f.f117541H;
            if (strArr != null) {
                AbstractC34721a.m109645a(strArr);
            }
            c29039b = new C29039b(c29043f.f117540G, c32331e2, c29043f.f117545z, c29043f.f117539F, c29043f.f117538E, c29043f.f117543x, c29043f.f117544y);
        }
        if (c29039b == null) {
            return null;
        }
        return new C36969b(klass, c29039b);
    }

    /* JADX INFO: renamed from: m */
    public static final C35847e m113811m(C35847e c35847e, C35847e prefix) {
        AbstractC22676k.m65750j(c35847e, "<this>");
        C35848f c35848f = c35847e.f152613a;
        AbstractC22676k.m65750j(prefix, "prefix");
        C35848f c35848f2 = prefix.f152613a;
        if (!c35847e.equals(prefix) && !c35848f2.m113793c()) {
            String str = c35848f.f152616a;
            String str2 = c35848f2.f152616a;
            if (!AbstractC39421y.m125930O(str, str2, false) || str.charAt(str2.length()) != '.') {
                return c35847e;
            }
        }
        if (c35848f2.m113793c()) {
            return c35847e;
        }
        if (c35847e.equals(prefix)) {
            return C35847e.f152612c;
        }
        String strSubstring = c35848f.f152616a.substring(c35848f2.f152616a.length() + 1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return new C35847e(strSubstring);
    }
}
