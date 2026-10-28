package fa3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import na3.C26521h;
import na3.EnumC26520g;
import va3.C35847e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fa3.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14321n {

    /* JADX INFO: renamed from: a */
    public static final Object f52281a;

    /* JADX INFO: renamed from: b */
    public static final Object f52282b = null;

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f52283c;

    static {
        EnumC14301a enumC14301a = EnumC14301a.FIELD;
        EnumC14301a enumC14301a2 = EnumC14301a.METHOD_RETURN_TYPE;
        EnumC14301a enumC14301a3 = EnumC14301a.VALUE_PARAMETER;
        List listM118959K = AbstractC37056f.m118959K(enumC14301a, enumC14301a2, enumC14301a3, EnumC14301a.TYPE_PARAMETER_BOUNDS, EnumC14301a.TYPE_USE);
        List listM118958J = AbstractC37056f.m118958J(enumC14301a3);
        C35847e c35847e = AbstractC14332y.f52323a;
        EnumC26520g enumC26520g = EnumC26520g.f105437y;
        List list = listM118959K;
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k(c35847e, new C14320m(new C26521h(enumC26520g), list, false, true, true)), new C23465k(AbstractC14332y.f52324b, new C14320m(new C26521h(enumC26520g), list, false, true, true)), new C23465k(AbstractC14332y.f52325c, new C14320m(new C26521h(EnumC26520g.f105435w), list, 4)));
        f52281a = mapM73990Y;
        List list2 = listM118958J;
        f52283c = AbstractC25247g0.m73995d0(mapM73990Y, AbstractC25247g0.m73990Y(new C23465k(AbstractC14332y.f52330h, new C14320m(new C26521h(enumC26520g), list2, 28)), new C23465k(AbstractC14332y.f52331i, new C14320m(new C26521h(EnumC26520g.f105436x), list2, 28))));
    }

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m40929a() {
        return f52283c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static final Map m40930b() {
        return f52281a;
    }
}
