package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import n53.C26318e;
import p127ev.AbstractC13673n;
import p163g1.C15160u4;
import p163g1.C15184w8;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15413r0 implements InterfaceC15379k1, InterfaceC15455z2, InterfaceC15445x2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15403p0 f57900a;

    /* JADX INFO: renamed from: b */
    public final List f57901b;

    /* JADX INFO: renamed from: c */
    public final boolean f57902c;

    /* JADX INFO: renamed from: d */
    public final Integer f57903d;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f57904e;

    /* JADX INFO: renamed from: f */
    public final C13045h2 f57905f;

    /* JADX INFO: renamed from: g */
    public final C13045h2 f57906g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f57907h;

    /* JADX INFO: renamed from: i */
    public final C26318e f57908i;

    /* JADX INFO: renamed from: j */
    public final C26318e f57909j;

    /* JADX INFO: renamed from: k */
    public final C26318e f57910k;

    /* JADX INFO: renamed from: l */
    public final boolean f57911l;

    public C15413r0(InterfaceC15403p0 interfaceC15403p0, String str) {
        this.f57900a = interfaceC15403p0;
        this.f57901b = interfaceC15403p0.mo849M();
        this.f57902c = interfaceC15403p0.mo845H();
        InterfaceC15398o0 interfaceC15398o0Mo857g = interfaceC15403p0.mo857g();
        Integer num = 0;
        if ((interfaceC15398o0Mo857g instanceof C15393n0) && !((C15393n0) interfaceC15398o0Mo857g).f57842a) {
            num = null;
        }
        this.f57903d = num;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f57904e = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(num);
        this.f57905f = c13045h2M36593c2;
        this.f57906g = c13045h2M36593c2;
        this.f57907h = AbstractC13091v.m36593c(interfaceC15403p0.getLabel());
        final int i13 = 0;
        AbstractC3269g.m9484M(c13045h2M36593c2, new Function1(this) { // from class: g40.q0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15413r0 f57875x;

            {
                this.f57875x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer num2 = (Integer) obj;
                switch (i13) {
                    case 0:
                        if (num2 != null) {
                            String str2 = (String) this.f57875x.f57901b.get(num2.intValue());
                            if (str2 != null) {
                                return str2;
                            }
                        }
                        return "";
                    default:
                        if (num2 != null) {
                            return (String) AbstractC25265s.m74102I0(num2.intValue(), this.f57875x.f57900a.mo865w());
                        }
                        return null;
                }
            }
        });
        final int i14 = 1;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13045h2M36593c2, new Function1(this) { // from class: g40.q0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15413r0 f57875x;

            {
                this.f57875x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer num2 = (Integer) obj;
                switch (i14) {
                    case 0:
                        if (num2 != null) {
                            String str2 = (String) this.f57875x.f57901b.get(num2.intValue());
                            if (str2 != null) {
                                return str2;
                            }
                        }
                        return "";
                    default:
                        if (num2 != null) {
                            return (String) AbstractC25265s.m74102I0(num2.intValue(), this.f57875x.f57900a.mo865w());
                        }
                        return null;
                }
            }
        });
        this.f57908i = c26318eM9484M;
        this.f57909j = AbstractC3269g.m9509p(c13045h2M36593c, c13045h2M36593c2, new C15184w8(4));
        this.f57910k = AbstractC3269g.m9509p(AbstractC3269g.m9484M(c13045h2M36593c2, new C15160u4(22)), c26318eM9484M, new C15184w8(5));
        this.f57911l = interfaceC15403p0.mo857g() instanceof C15388m0;
        if (str != null) {
            mo43573s(str);
        }
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f57904e, null);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 mo43559c() {
        throw null;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f57909j;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1878756385);
        AbstractC15448y0.m43610a(this, z4, modifier, false, c28655q, ((i13 >> 15) & 14) | ((i13 << 3) & 112) | (i13 & 896));
        c28655q.m87173q(false);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: j */
    public final InterfaceC13037f2 mo43564j() {
        return this.f57910k;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: s */
    public final void mo43573s(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        int iIndexOf = this.f57901b.indexOf(this.f57900a.mo853b(rawValue));
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            numValueOf = this.f57903d;
        }
        m43603u(numValueOf);
    }

    /* JADX INFO: renamed from: u */
    public final void m43603u(Integer num) {
        C13045h2 c13045h2 = this.f57905f;
        if (num == null) {
            c13045h2.m36570j(this.f57903d);
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue < this.f57901b.size()) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            c13045h2.getClass();
            c13045h2.m36571k(null, numValueOf);
        }
    }
}
