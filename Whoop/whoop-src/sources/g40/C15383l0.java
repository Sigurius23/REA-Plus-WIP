package g40;

import a33.C0352d;
import android.os.LocaleList;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import i93.C18277c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import p029b5.C2728g;
import p097ds.AbstractC12313p;
import p412q3.InterfaceC29884r;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: g40.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15383l0 implements InterfaceC29884r {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57824w;

    public /* synthetic */ C15383l0(int i13) {
        this.f57824w = i13;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static C15454z1 m43593a(String str, int i13, String str2, boolean z4, boolean z13) {
        String country;
        AbstractC15380k2 abstractC15380k2M34253E = null;
        String str3 = (i13 & 2) != 0 ? null : str2;
        boolean z14 = (i13 & 8) != 0 ? false : z4;
        boolean z15 = (i13 & 16) != 0 ? false : z13;
        boolean zM125930O = AbstractC39421y.m125930O(str, "+", false);
        if (str3 == null && zM125930O) {
            C18277c c18277c = AbstractC15380k2.f57813a;
            int i14 = 1;
            while (i14 <= AbstractC39414r.m125884c0(str) && i14 < 4) {
                i14++;
                String strSubstring = str.substring(0, i14);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                C2728g c2728g = C2728g.f10738b;
                C2728g c2728gM7699f = C2728g.m7699f(LocaleList.getAdjustedDefault());
                ?? r15 = AbstractC15380k2.f57814b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r15.entrySet()) {
                    if (AbstractC22676k.m65745e(((C15356g2) entry.getValue()).f57729a, strSubstring)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C15356g2) ((Map.Entry) it.next()).getValue()).f57730b);
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    int iM7702d = c2728gM7699f.m7702d();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= iM7702d) {
                            country = (String) AbstractC25265s.m74096F0(arrayList);
                            break;
                        }
                        Locale localeM7700b = c2728gM7699f.m7700b(i15);
                        AbstractC22676k.m65747g(localeM7700b);
                        if (arrayList.contains(localeM7700b.getCountry())) {
                            country = localeM7700b.getCountry();
                            break;
                        }
                        i15++;
                    }
                } else {
                    country = null;
                }
                if (country != null) {
                    abstractC15380k2M34253E = AbstractC12313p.m34253E(country);
                    break;
                }
            }
        } else if (str3 != null) {
            C18277c c18277c2 = AbstractC15380k2.f57813a;
            abstractC15380k2M34253E = AbstractC12313p.m34253E(str3);
        }
        C25235a0 c25235a0 = C25235a0.f99113w;
        if (abstractC15380k2M34253E == null) {
            return new C15454z1(str, str3, c25235a0, z14, z15);
        }
        String strMo43577c = abstractC15380k2M34253E.mo43577c();
        return new C15454z1(AbstractC39414r.m125898q0(abstractC15380k2M34253E.mo43579e(AbstractC39414r.m125898q0(str, strMo43577c)), strMo43577c), abstractC15380k2M34253E.mo43575a(), c25235a0, z14, z15);
    }

    /* JADX INFO: renamed from: b */
    public static C15440w2 m43594b(InterfaceC15450y2 sectionFieldElement, InterfaceC41211c interfaceC41211c) {
        AbstractC22676k.m65750j(sectionFieldElement, "sectionFieldElement");
        return m43595c(AbstractC37056f.m118958J(sectionFieldElement), interfaceC41211c);
    }

    /* JADX INFO: renamed from: c */
    public static C15440w2 m43595c(List list, InterfaceC41211c interfaceC41211c) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC15450y2) it.next()).mo43540i());
        }
        C5705a c5705a = IdentifierSpec.Companion;
        String str = ((InterfaceC15450y2) AbstractC25265s.m74096F0(list)).mo43531a().getV1() + "_section";
        c5705a.getClass();
        return new C15440w2(C5705a.m16892a(str), list, new C0352d(arrayList, interfaceC41211c));
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: n */
    public int mo15743n(int i13) {
        switch (this.f57824w) {
            case 3:
                return Math.max(i13 - 1, 0);
            default:
                if (i13 <= 3) {
                    return i13;
                }
                if (i13 <= 6) {
                    return i13 - 1;
                }
                return 6;
        }
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: x */
    public int mo15749x(int i13) {
        switch (this.f57824w) {
            case 3:
                return i13 + 1;
            default:
                if (i13 <= 2) {
                    return i13;
                }
                if (i13 <= 5) {
                    return i13 + 1;
                }
                return 7;
        }
    }
}
