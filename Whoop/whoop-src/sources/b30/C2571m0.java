package b30;

import a20.C0162b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import com.whoop.service.network.model.UserSessionDto;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13105z1;
import g40.C15333c3;
import g40.C15372j0;
import g40.C15440w2;
import h20.C16689l1;
import h20.EnumC16677j1;
import hc3.AbstractC17182o;
import java.util.ArrayList;
import java.util.Set;
import kc3.C22365e;
import m83.AbstractC25267u;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p095dp.AbstractC12240d;
import p499t9.C33623c0;
import p537ux.InterfaceC35320a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import y00.EnumC38853i;

/* JADX INFO: renamed from: b30.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2571m0 {

    /* JADX INFO: renamed from: a */
    public final C2540i1 f9990a;

    /* JADX INFO: renamed from: b */
    public final C16689l1 f9991b;

    /* JADX INFO: renamed from: c */
    public final C2658y f9992c;

    /* JADX INFO: renamed from: d */
    public final boolean f9993d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2994c0 f9994e;

    /* JADX INFO: renamed from: f */
    public final Function1 f9995f;

    /* JADX INFO: renamed from: g */
    public final Function1 f9996g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f9997h;

    /* JADX INFO: renamed from: i */
    public final C13045h2 f9998i;

    /* JADX INFO: renamed from: j */
    public final C2570m f9999j;

    /* JADX INFO: renamed from: k */
    public final C13081r1 f10000k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [q83.d] */
    public C2571m0(C2540i1 c2540i1, C16689l1 c16689l1, C2658y c2658y, boolean z4, InterfaceC2994c0 coroutineScope, Function1 function1, Function1 function2) {
        C2570m c2570m;
        boolean z13;
        C2616s c2616s;
        C2570m c2570m2;
        String string;
        String strM8299l;
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.f9990a = c2540i1;
        this.f9991b = c16689l1;
        this.f9992c = c2658y;
        this.f9993d = z4;
        this.f9994e = coroutineScope;
        this.f9995f = function1;
        this.f9996g = function2;
        int i13 = 1;
        if (c2658y != null) {
            C2602q c2602qM7500a = m7500a(c2658y);
            boolean z14 = c2658y.f10382c;
            Integer num = c2540i1.f9858b;
            Integer num2 = c2540i1.f9859c;
            c2570m = null;
            if (z14 || (num != null && num.intValue() >= 1 && num.intValue() <= 12 && num2 != null && num2.intValue() >= 2000 && num2.intValue() <= 2100)) {
                String strSubstring = "00";
                if (num == null || num.intValue() < 1 || num.intValue() > 12) {
                    string = "00";
                } else if (num.intValue() < 10) {
                    string = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE + num;
                } else {
                    string = num.toString();
                }
                if (num2 != null && num2.intValue() >= 2000 && num2.intValue() <= 2100) {
                    strSubstring = num2.toString().substring(2, 4);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                }
                strM8299l = AbstractC2875y.m8299l(string, strSubstring);
            } else {
                strM8299l = "•• / ••";
            }
            z13 = false;
            c2616s = new C2616s(c2602qM7500a, new C2556k1(strM8299l, z14, false, new C15372j0()));
        } else {
            c2570m = null;
            z13 = false;
            c2616s = null;
        }
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c2616s);
        this.f9997h = c13045h2M36593c;
        this.f9998i = AbstractC13091v.m36593c(c2570m);
        boolean z15 = (!(c2658y != null ? c2658y.f10382c : true) || c16689l1.f64192z == EnumC16677j1.f64132x) ? z13 : true;
        z13 = (c16689l1.m47251h() || c16689l1.m47250f() || c16689l1.m47252i()) ? true : z13;
        if (z15 || z13) {
            c2570m2 = new C2570m(c2540i1.f9863g, c16689l1.f64192z, (!c16689l1.m47251h() || c2658y == null) ? c16689l1.m47251h() ? EnumC2625t1.f10217x : EnumC2625t1.f10216w : EnumC2625t1.f10218y, c16689l1.m47250f(), c16689l1.m47252i(), c16689l1.m47249b());
        } else {
            c2570m2 = c2570m;
        }
        this.f9999j = c2570m2;
        this.f10000k = AbstractC13091v.m36587M(AbstractC13091v.m36583I(new C2563l0(this, c2570m, i13), c13045h2M36593c), coroutineScope, C13105z1.f45288a, m7502c((C2616s) c13045h2M36593c.getValue(), c2570m2));
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(coroutineScope, AbstractC17182o.f65999a, null, new C0162b(this, null, 6), 2);
    }

    /* JADX INFO: renamed from: a */
    public final C2602q m7500a(C2658y c2658y) {
        InterfaceC35320a cardBrandFilter = c2658y.f10380a;
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        C33623c0 c33623c0 = EnumC38853i.f167238M;
        String str = this.f9990a.f9861e;
        c33623c0.getClass();
        EnumC38853i enumC38853iM106236i = C33623c0.m106236i(str);
        return new C2602q(enumC38853iM106236i, cardBrandFilter.mo112179o(enumC38853iM106236i));
    }

    /* JADX INFO: renamed from: b */
    public final void m7501b(InterfaceC2532h1 interfaceC2532h1) {
        Object value;
        C2616s c2616s;
        Object value2;
        C2616s c2616sM7520a;
        Object value3;
        C2616s c2616s2;
        boolean z4 = interfaceC2532h1 instanceof C2508e1;
        C2658y c2658y = this.f9992c;
        C13045h2 c13045h2 = this.f9997h;
        if (z4) {
            C2602q c2602q = ((C2508e1) interfaceC2532h1).f9764a;
            if (c2658y != null) {
                C2484b1 c2484b1 = ((C2492c1) this.f10000k.f45200w.getValue()).f9710c;
                if (!AbstractC22676k.m65745e(c2602q, c2484b1 != null ? c2484b1.f9675a : null)) {
                    this.f9995f.invoke(c2602q.f10126a);
                }
                do {
                    value3 = c13045h2.getValue();
                    c2616s2 = (C2616s) value3;
                } while (!c13045h2.m36569i(value3, c2616s2 != null ? C2616s.m7520a(c2616s2, c2602q, null, 2) : null));
                return;
            }
            return;
        }
        if (interfaceC2532h1 instanceof C2516f1) {
            String proposedValue = ((C2516f1) interfaceC2532h1).f9786a;
            if (c2658y != null) {
                do {
                    value2 = c13045h2.getValue();
                    C2616s c2616s3 = (C2616s) value2;
                    if (c2616s3 != null) {
                        C2556k1 c2556k1M7469a = c2616s3.f10193b;
                        AbstractC22676k.m65750j(proposedValue, "proposedValue");
                        if (AbstractC32417h.m101214w(c2556k1M7469a.f9932e, c2556k1M7469a.f9928a, proposedValue)) {
                            c2556k1M7469a = C2556k1.m7469a(c2556k1M7469a, proposedValue, 14);
                        }
                        c2616sM7520a = C2616s.m7520a(c2616s3, null, c2556k1M7469a, 1);
                    } else {
                        c2616sM7520a = null;
                    }
                } while (!c13045h2.m36569i(value2, c2616sM7520a));
                return;
            }
            return;
        }
        if (interfaceC2532h1 instanceof C2500d1) {
            C2554k c2554k = new C2554k(((C2500d1) interfaceC2532h1).f9740a);
            C13045h2 c13045h3 = this.f9998i;
            c13045h3.getClass();
            c13045h3.m36571k(null, c2554k);
            return;
        }
        if (!(interfaceC2532h1 instanceof C2524g1)) {
            throw new NoWhenBranchMatchedException();
        }
        do {
            value = c13045h2.getValue();
            c2616s = (C2616s) value;
        } while (!c13045h2.m36569i(value, c2616s != null ? C2616s.m7520a(c2616s, null, C2556k1.m7469a(c2616s.f10193b, null, 11), 1) : null));
        C2570m c2570m = this.f9999j;
        if (c2570m != null) {
            C15333c3 c15333c3 = (C15333c3) c2570m.f9988y;
            if (c15333c3 != null) {
                c15333c3.mo43537b(true);
            }
            ((C15440w2) c2570m.f9989z).mo43548b(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public final C2492c1 m7502c(C2616s c2616s, C2570m c2570m) {
        ?? arrayList;
        C33623c0 c33623c0 = EnumC38853i.f167238M;
        C2540i1 c2540i1 = this.f9990a;
        String str = c2540i1.f9861e;
        c33623c0.getClass();
        EnumC38853i enumC38853iM106236i = C33623c0.m106236i(str);
        C2484b1 c2484b1 = null;
        if (enumC38853iM106236i == EnumC38853i.Unknown) {
            enumC38853iM106236i = null;
        }
        if (enumC38853iM106236i == null) {
            enumC38853iM106236i = c2540i1.f9860d;
        }
        int iM34038D = AbstractC12240d.m34038D(enumC38853iM106236i);
        C2658y c2658y = this.f9992c;
        if (c2658y != null && c2616s != null) {
            C2602q c2602q = c2616s.f10192a;
            boolean z4 = c2658y.f10381b;
            InterfaceC35320a cardBrandFilter = c2658y.f10380a;
            AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
            Set set = c2540i1.f9862f;
            if (set != null) {
                Set<String> set2 = set;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(set2, 10));
                for (String str2 : set2) {
                    EnumC38853i.f167238M.getClass();
                    EnumC38853i enumC38853iM106236i2 = C33623c0.m106236i(str2);
                    arrayList.add(new C2602q(enumC38853iM106236i2, cardBrandFilter.mo112179o(enumC38853iM106236i2)));
                }
            } else {
                arrayList = C25271y.f99162w;
            }
            c2484b1 = new C2484b1(c2602q, z4, arrayList, c2616s.f10193b);
        }
        return new C2492c1(c2540i1, iM34038D, c2484b1, c2570m);
    }
}
