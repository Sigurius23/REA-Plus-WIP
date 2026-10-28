package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.stripe.android.core.model.Country;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import eg2.C13168a;
import ej1.C13242h;
import i93.C18277c;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import m63.C25126d;
import m83.C25271y;
import n53.C26318e;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p127ev.AbstractC13673n;
import p163g1.C15160u4;
import p163g1.C15184w8;
import p390p1.C28655q;
import p479s4.AbstractC32128i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15454z1 implements InterfaceC15379k1, InterfaceC15445x2 {

    /* JADX INFO: renamed from: a */
    public final String f58046a;

    /* JADX INFO: renamed from: b */
    public final boolean f58047b;

    /* JADX INFO: renamed from: c */
    public final boolean f58048c;

    /* JADX INFO: renamed from: d */
    public final C13081r1 f58049d = AbstractC3269g.m9493Z(AbstractC32128i.m100064s(R.string.stripe_address_label_phone_number, new Object[0], C25271y.f99162w));

    /* JADX INFO: renamed from: e */
    public final C13045h2 f58050e;

    /* JADX INFO: renamed from: f */
    public final C13081r1 f58051f;

    /* JADX INFO: renamed from: g */
    public final C13045h2 f58052g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f58053h;

    /* JADX INFO: renamed from: i */
    public final C25126d f58054i;

    /* JADX INFO: renamed from: j */
    public final C15413r0 f58055j;

    /* JADX INFO: renamed from: k */
    public final C26318e f58056k;

    /* JADX INFO: renamed from: l */
    public final C26318e f58057l;

    /* JADX INFO: renamed from: m */
    public final C26318e f58058m;

    /* JADX INFO: renamed from: n */
    public final C26318e f58059n;

    /* JADX INFO: renamed from: o */
    public final C26318e f58060o;

    /* JADX INFO: renamed from: p */
    public final C26318e f58061p;

    public C15454z1(String str, String str2, Set set, boolean z4, boolean z13) {
        this.f58046a = str;
        this.f58047b = z4;
        this.f58048c = z13;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(str);
        this.f58050e = c13045h2M36593c;
        C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(c13045h2M36593c);
        this.f58051f = c13081r1M36598h;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(bool);
        this.f58052g = c13045h2M36593c2;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(bool);
        this.f58053h = c13045h2M36593c3;
        C25126d c25126d = new C25126d(set, new C15160u4(26), new C15160u4(29), 10);
        this.f58054i = c25126d;
        C15413r0 c15413r0 = new C15413r0(c25126d, str2);
        this.f58055j = c15413r0;
        final int i13 = 0;
        Function1 function1 = new Function1(this) { // from class: g40.x1

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15454z1 f58034x;

            {
                this.f58034x = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str3;
                int i14 = i13;
                C15454z1 c15454z1 = this.f58034x;
                Integer num = (Integer) obj;
                switch (i14) {
                    case 0:
                        C18277c c18277c = AbstractC15380k2.f57813a;
                        return AbstractC12313p.m34253E(((Country) ((ArrayList) c15454z1.f58054i.f98480F).get(num != null ? num.intValue() : 0)).getCode().getValue());
                    default:
                        C18277c c18277c2 = AbstractC15380k2.f57813a;
                        String countryCode = ((Country) ((ArrayList) c15454z1.f58054i.f98480F).get(num != null ? num.intValue() : 0)).getCode().getValue();
                        AbstractC22676k.m65750j(countryCode, "countryCode");
                        ?? r10 = AbstractC15380k2.f57814b;
                        String upperCase = countryCode.toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        C15356g2 c15356g2 = (C15356g2) r10.get(upperCase);
                        if (c15356g2 == null || (str3 = c15356g2.f57731c) == null) {
                            return null;
                        }
                        int i15 = 0;
                        for (int i16 = 0; i16 < str3.length(); i16++) {
                            if (str3.charAt(i16) == '#') {
                                i15++;
                            }
                        }
                        return Integer.valueOf(i15);
                }
            }
        };
        C13045h2 c13045h2 = c15413r0.f57906g;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13045h2, function1);
        this.f58056k = c26318eM9484M;
        final int i14 = 1;
        C26318e c26318eM9509p = AbstractC3269g.m9509p(c13081r1M36598h, AbstractC3269g.m9484M(c13045h2, new Function1(this) { // from class: g40.x1

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15454z1 f58034x;

            {
                this.f58034x = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str3;
                int i15 = i14;
                C15454z1 c15454z1 = this.f58034x;
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        C18277c c18277c = AbstractC15380k2.f57813a;
                        return AbstractC12313p.m34253E(((Country) ((ArrayList) c15454z1.f58054i.f98480F).get(num != null ? num.intValue() : 0)).getCode().getValue());
                    default:
                        C18277c c18277c2 = AbstractC15380k2.f57813a;
                        String countryCode = ((Country) ((ArrayList) c15454z1.f58054i.f98480F).get(num != null ? num.intValue() : 0)).getCode().getValue();
                        AbstractC22676k.m65750j(countryCode, "countryCode");
                        ?? r10 = AbstractC15380k2.f57814b;
                        String upperCase = countryCode.toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        C15356g2 c15356g2 = (C15356g2) r10.get(upperCase);
                        if (c15356g2 == null || (str3 = c15356g2.f57731c) == null) {
                            return null;
                        }
                        int i16 = 0;
                        for (int i17 = 0; i17 < str3.length(); i17++) {
                            if (str3.charAt(i17) == '#') {
                                i16++;
                            }
                        }
                        return Integer.valueOf(i16);
                }
            }
        }), new C13242h(this, 17));
        C26318e c26318eM9509p2 = AbstractC3269g.m9509p(c13081r1M36598h, c26318eM9484M, new C15184w8(6));
        C26318e c26318eM9484M2 = AbstractC3269g.m9484M(c26318eM9509p, new C15449y1(0));
        this.f58057l = c26318eM9484M2;
        this.f58058m = AbstractC3269g.m9509p(c26318eM9509p2, c26318eM9484M2, new C15184w8(7));
        this.f58059n = AbstractC3269g.m9513t(c26318eM9509p, c13045h2M36593c3, c13045h2M36593c2, new C13168a(25));
        this.f58060o = AbstractC3269g.m9484M(c26318eM9484M, new C15160u4(27));
        this.f58061p = AbstractC3269g.m9484M(c26318eM9484M, new C15160u4(28));
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f58052g, null);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 mo43559c() {
        throw null;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f58059n;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1343378051);
        AbstractC12240d.m34070g(z4, this, modifier, null, false, false, null, null, !AbstractC22676k.m65745e(identifierSpec, interfaceC15450y2.mo43531a()) ? 6 : 7, c28655q, (i13 & 14) | ((i13 >> 12) & 112) | (i13 & 896), 248);
        c28655q.m87173q(false);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: j */
    public final InterfaceC13037f2 mo43564j() {
        return this.f58058m;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: s */
    public final void mo43573s(String str) {
        m43615v(str);
    }

    /* JADX INFO: renamed from: u */
    public final String m43614u() {
        return ((AbstractC15380k2) ((InterfaceC4339a) this.f58056k.f104635y).invoke()).mo43575a();
    }

    /* JADX INFO: renamed from: v */
    public final void m43615v(String displayFormatted) {
        AbstractC22676k.m65750j(displayFormatted, "displayFormatted");
        String strMo43580f = ((AbstractC15380k2) ((InterfaceC4339a) this.f58056k.f104635y).invoke()).mo43580f(displayFormatted);
        C13045h2 c13045h2 = this.f58050e;
        c13045h2.getClass();
        c13045h2.m36571k(null, strMo43580f);
    }
}
