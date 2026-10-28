package nb3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import lb3.InterfaceC23796q0;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31135k;
import va3.C35850h;

/* JADX INFO: renamed from: nb3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C26555l {

    /* JADX INFO: renamed from: a */
    public static final C26555l f105564a = new C26555l();

    /* JADX INFO: renamed from: b */
    public static final C26548e f105565b = C26548e.f105509w;

    /* JADX INFO: renamed from: c */
    public static final C26544a f105566c;

    /* JADX INFO: renamed from: d */
    public static final C26552i f105567d;

    /* JADX INFO: renamed from: e */
    public static final C26552i f105568e;

    /* JADX INFO: renamed from: f */
    public static final Set f105569f;

    static {
        EnumC26545b[] enumC26545bArr = EnumC26545b.f105507w;
        f105566c = new C26544a(C35850h.m113816g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        f105567d = m78682c(EnumC26554k.CYCLIC_SUPERTYPES, new String[0]);
        f105568e = m78682c(EnumC26554k.ERROR_PROPERTY_TYPE, new String[0]);
        f105569f = AbstractC12350b.m34570S(new C26549f());
    }

    /* JADX INFO: renamed from: a */
    public static final C26550g m78680a(EnumC26551h enumC26551h, boolean z4, String... formatParams) {
        AbstractC22676k.m65750j(formatParams, "formatParams");
        return z4 ? new C26556m(enumC26551h, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new C26550g(enumC26551h, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* JADX INFO: renamed from: b */
    public static final C26550g m78681b(EnumC26551h enumC26551h, String... strArr) {
        return m78680a(enumC26551h, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: c */
    public static final C26552i m78682c(EnumC26554k kind, String... strArr) {
        AbstractC22676k.m65750j(kind, "kind");
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC22676k.m65750j(formatParams, "formatParams");
        return m78684e(kind, C25271y.f99162w, m78683d(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* JADX INFO: renamed from: d */
    public static C26553j m78683d(EnumC26554k kind, String... formatParams) {
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(formatParams, "formatParams");
        return new C26553j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* JADX INFO: renamed from: e */
    public static C26552i m78684e(EnumC26554k kind, List list, InterfaceC23796q0 interfaceC23796q0, String... formatParams) {
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(formatParams, "formatParams");
        return new C26552i(interfaceC23796q0, m78681b(EnumC26551h.ERROR_TYPE_SCOPE, interfaceC23796q0.toString()), kind, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m78685f(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k != null) {
            return (interfaceC31135k instanceof C26544a) || (interfaceC31135k.mo60581g() instanceof C26544a) || interfaceC31135k == f105565b;
        }
        return false;
    }
}
