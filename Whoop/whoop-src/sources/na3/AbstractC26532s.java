package na3;

import cb3.AbstractC4393e;
import fa3.AbstractC14331x;
import java.util.HashMap;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import q93.C30080d;
import q93.C30081e;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import s93.C32308j;
import s93.InterfaceC32307i;
import va3.C35847e;
import va3.C35848f;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: na3.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC26532s {

    /* JADX INFO: renamed from: a */
    public static final C32308j f105470a;

    /* JADX INFO: renamed from: b */
    public static final C32308j f105471b;

    static {
        C35847e ENHANCED_NULLABILITY_ANNOTATION = AbstractC14331x.f52321p;
        AbstractC22676k.m65749i(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f105470a = new C32308j(ENHANCED_NULLABILITY_ANNOTATION);
        C35847e ENHANCED_MUTABILITY_ANNOTATION = AbstractC14331x.f52322q;
        AbstractC22676k.m65749i(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f105471b = new C32308j(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC32307i m78605a(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C32308j(AbstractC25265s.m74093D1(list), 1) : (InterfaceC32307i) AbstractC25265s.m74142p1(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC31117e m78606b(InterfaceC31126h interfaceC31126h, C26517d c26517d, EnumC26529p enumC26529p) {
        if (enumC26529p != EnumC26529p.f105466y && (interfaceC31126h instanceof InterfaceC31117e)) {
            if (c26517d.f105428b == EnumC26518e.f105431w && enumC26529p == EnumC26529p.f105464w) {
                InterfaceC31117e interfaceC31117e = (InterfaceC31117e) interfaceC31126h;
                String str = C30080d.f122759a;
                C35848f c35848fM125524f = AbstractC39363f.m125524f(interfaceC31117e);
                HashMap map = C30080d.f122768j;
                if (map.containsKey(c35848fM125524f)) {
                    C35847e c35847e = (C35847e) map.get(AbstractC39363f.m125524f(interfaceC31117e));
                    if (c35847e != null) {
                        return AbstractC4393e.m13807e(interfaceC31117e).m83822j(c35847e);
                    }
                    throw new IllegalArgumentException("Given class " + interfaceC31117e + " is not a mutable collection");
                }
            }
            if (c26517d.f105428b == EnumC26518e.f105432x && enumC26529p == EnumC26529p.f105465x) {
                InterfaceC31117e interfaceC31117e2 = (InterfaceC31117e) interfaceC31126h;
                String str2 = C30080d.f122759a;
                if (C30080d.f122769k.containsKey(AbstractC39363f.m125524f(interfaceC31117e2))) {
                    return C30081e.m92213a(interfaceC31117e2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final Boolean m78608d(C26517d c26517d, EnumC26529p enumC26529p) {
        if (enumC26529p == EnumC26529p.f105466y) {
            return null;
        }
        EnumC26520g enumC26520g = c26517d.f105427a;
        int i13 = enumC26520g == null ? -1 : AbstractC26531r.f105469a[enumC26520g.ordinal()];
        if (i13 == 1) {
            return Boolean.TRUE;
        }
        if (i13 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: e */
    public static final C32308j m78609e() {
        return f105470a;
    }
}
