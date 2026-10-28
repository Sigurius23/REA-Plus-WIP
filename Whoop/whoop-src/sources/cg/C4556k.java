package cg;

import bg.AbstractC3210e;
import bg.C3209d;
import bg.C3216k;
import bg.C3217l;
import com.iterable.iterableapi.C5305b;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33775g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cg.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4556k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18358w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4555j f18359x;

    public /* synthetic */ C4556k(C4555j c4555j, int i13) {
        this.f18358w = i13;
        this.f18359x = c4555j;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C23465k c23465k;
        int i13 = this.f18358w;
        int i14 = 2;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C4555j c4555j = this.f18359x;
        String it = (String) obj;
        switch (i13) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                C3217l c3217l = C3217l.f12583c;
                c4555j.f18354w = AbstractC12350b.m34554C(it);
                return c23454a0;
            case 1:
                AbstractC22676k.m65750j(it, "authority");
                C5305b c5305b = new C5305b(it);
                C23465k c23465kM16411a = c5305b.m16411a(new String[]{"@"});
                if (c23465kM16411a != null) {
                    String str = (String) c23465kM16411a.f92937w;
                    int iIntValue = ((Number) c23465kM16411a.f92938x).intValue();
                    String strSubstring = it.substring(c5305b.f21637c, iIntValue);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    c5305b.f21637c = iIntValue;
                    c4555j.f18352F.m119208M(strSubstring);
                    c5305b.f21637c = str.length() + c5305b.f21637c;
                }
                c5305b.m16413c(new String[0], new C4556k(c4555j, i14));
                return c23454a0;
            default:
                AbstractC22676k.m65750j(it, "hostport");
                Integer numValueOf = null;
                if (AbstractC39414r.m125907z0(it, '[')) {
                    int iM125887f0 = AbstractC39414r.m125887f0(it, ']', 0, false, 6);
                    if (iM125887f0 <= 0) {
                        throw new IllegalArgumentException("unmatched [ or ]");
                    }
                    String strSubstring2 = it.substring(1, iM125887f0);
                    AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                    AbstractC3210e abstractC3210eM118967V = AbstractC37056f.m118967V(C33775g.f141357g.mo106777b(strSubstring2));
                    if (!(abstractC3210eM118967V instanceof C3209d) || !(((C3209d) abstractC3210eM118967V).f12566a instanceof C3216k)) {
                        throw new IllegalArgumentException("non-ipv6 host was enclosed in []-brackets");
                    }
                    int i15 = iM125887f0 + 1;
                    Character chValueOf = (i15 < 0 || i15 >= it.length()) ? null : Character.valueOf(it.charAt(i15));
                    if (chValueOf != null && chValueOf.charValue() == ':') {
                        String strSubstring3 = it.substring(iM125887f0 + 2);
                        AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                        numValueOf = Integer.valueOf(Integer.parseInt(strSubstring3));
                    } else if (chValueOf != null) {
                        throw new IllegalArgumentException("unexpected characters after ]");
                    }
                    c23465k = new C23465k(abstractC3210eM118967V, numValueOf);
                } else {
                    List listM125905x0 = AbstractC39414r.m125905x0(it, new char[]{':'}, 0, 6);
                    AbstractC3210e abstractC3210eM118967V2 = AbstractC37056f.m118967V(C33775g.f141357g.mo106777b((String) listM125905x0.get(0)));
                    if ((abstractC3210eM118967V2 instanceof C3209d) && (((C3209d) abstractC3210eM118967V2).f12566a instanceof C3216k)) {
                        throw new IllegalArgumentException("ipv6 host given without []-brackets");
                    }
                    String str2 = (String) AbstractC25265s.m74102I0(1, listM125905x0);
                    c23465k = new C23465k(abstractC3210eM118967V2, str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null);
                }
                AbstractC3210e abstractC3210e = (AbstractC3210e) c23465k.f92937w;
                Integer num = (Integer) c23465k.f92938x;
                AbstractC22676k.m65750j(abstractC3210e, "<set-?>");
                c4555j.f18355x = abstractC3210e;
                if (num != null) {
                    c4555j.f18356y = Integer.valueOf(num.intValue());
                }
                return c23454a0;
        }
    }
}
