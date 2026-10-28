package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import do0.C12229c;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import eg2.C13168a;
import java.util.Set;
import n53.C26318e;
import p042c2.EnumC3869n;
import p127ev.AbstractC13673n;
import p163g1.C15184w8;
import p390p1.C28655q;
import p412q3.C29871f0;
import p412q3.InterfaceC29873g0;
import p479s4.AbstractC32128i;
import p636y3.EnumC39181m;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15351f3 implements InterfaceC15391m3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15386l3 f57702a;

    /* JADX INFO: renamed from: b */
    public final String f57703b;

    /* JADX INFO: renamed from: c */
    public final Function1 f57704c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13037f2 f57705d;

    /* JADX INFO: renamed from: e */
    public final int f57706e;

    /* JADX INFO: renamed from: f */
    public final int f57707f;

    /* JADX INFO: renamed from: g */
    public final C13081r1 f57708g;

    /* JADX INFO: renamed from: h */
    public final boolean f57709h;

    /* JADX INFO: renamed from: i */
    public final C13045h2 f57710i;

    /* JADX INFO: renamed from: j */
    public final EnumC39181m f57711j;

    /* JADX INFO: renamed from: k */
    public final EnumC3869n f57712k;

    /* JADX INFO: renamed from: l */
    public final C13045h2 f57713l;

    /* JADX INFO: renamed from: m */
    public final C13045h2 f57714m;

    /* JADX INFO: renamed from: n */
    public final C13081r1 f57715n;

    /* JADX INFO: renamed from: o */
    public final C26318e f57716o;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f57717p;

    /* JADX INFO: renamed from: q */
    public final C13081r1 f57718q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC13037f2 f57719r;

    /* JADX INFO: renamed from: s */
    public final C13045h2 f57720s;

    /* JADX INFO: renamed from: t */
    public final C13045h2 f57721t;

    /* JADX INFO: renamed from: u */
    public final C26318e f57722u;

    /* JADX INFO: renamed from: v */
    public final C26318e f57723v;

    /* JADX INFO: renamed from: w */
    public final C26318e f57724w;

    /* JADX INFO: renamed from: x */
    public final C26318e f57725x;

    public /* synthetic */ C15351f3(InterfaceC15386l3 interfaceC15386l3, String str, C12229c c12229c, int i13) {
        this(interfaceC15386l3, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : c12229c);
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo43557a() {
        return this.f57705d;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f57720s, null);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 mo43559c() {
        return this.f57724w;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: d */
    public final InterfaceC13037f2 mo43560d() {
        return this.f57708g;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43561e() {
        return this.f57713l;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f57723v;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: g */
    public final void mo43562g(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f57721t, null);
    }

    @Override // g40.InterfaceC15391m3
    public final C26318e getContentDescription() {
        return this.f57716o;
    }

    @Override // g40.InterfaceC15391m3
    public final InterfaceC13037f2 getLabel() {
        return this.f57710i;
    }

    @Override // g40.InterfaceC15391m3
    public final EnumC39181m getLayoutDirection() {
        return this.f57711j;
    }

    @Override // g40.InterfaceC15391m3
    public final InterfaceC13037f2 getLoading() {
        return this.f57719r;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: h */
    public final int mo43563h() {
        return this.f57706e;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1225623209);
        int i14 = AbstractC22676k.m65745e(identifierSpec, interfaceC15450y2.mo43531a()) ? 7 : 6;
        InterfaceC15386l3 interfaceC15386l3 = this.f57702a;
        int i15 = i13 << 3;
        AbstractC15376j4.m43587c(this, z4, i14, modifier, null, 0, 0, null, interfaceC15386l3.mo1726p(), interfaceC15386l3.mo1725o(), c28655q, ((i13 >> 15) & 14) | (i15 & 112) | (i15 & 7168), 240);
        c28655q.m87173q(false);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: j */
    public final InterfaceC13037f2 mo43564j() {
        return this.f57725x;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: k */
    public final EnumC3869n mo43565k() {
        return this.f57712k;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: l */
    public final String mo43566l() {
        return this.f57703b;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: m */
    public final boolean mo43567m() {
        return this.f57709h;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: n */
    public final void mo43568n(C15396n3 item) {
        AbstractC22676k.m65750j(item, "item");
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: o */
    public final int mo43569o() {
        return this.f57707f;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: p */
    public final InterfaceC13037f2 mo43570p() {
        return this.f57715n;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: q */
    public final InterfaceC15421s3 mo43571q(String displayFormatted) {
        AbstractC22676k.m65750j(displayFormatted, "displayFormatted");
        C13045h2 c13045h2 = this.f57717p;
        InterfaceC15421s3 interfaceC15421s3 = (InterfaceC15421s3) c13045h2.getValue();
        InterfaceC15386l3 interfaceC15386l3 = this.f57702a;
        String strMo1720j = interfaceC15386l3.mo1720j(displayFormatted);
        C13045h2 c13045h3 = this.f57714m;
        c13045h3.m36570j(strMo1720j);
        InterfaceC15421s3 interfaceC15421s3Mo1721k = interfaceC15386l3.mo1721k((String) c13045h3.getValue());
        c13045h2.getClass();
        c13045h2.m36571k(null, interfaceC15421s3Mo1721k);
        if (AbstractC22676k.m65745e(c13045h2.getValue(), interfaceC15421s3)) {
            return null;
        }
        return (InterfaceC15421s3) c13045h2.getValue();
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: r */
    public final InterfaceC13037f2 mo43572r() {
        return this.f57718q;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: s */
    public final void mo43573s(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        mo43571q(this.f57702a.mo1716b(rawValue));
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: t */
    public final InterfaceC13037f2 mo43574t() {
        return this.f57722u;
    }

    public C15351f3(InterfaceC15386l3 interfaceC15386l3, String str, Function1 function1) {
        this.f57702a = interfaceC15386l3;
        this.f57703b = str;
        this.f57704c = function1;
        this.f57705d = interfaceC15386l3.mo1715a();
        this.f57706e = interfaceC15386l3.mo1719h();
        this.f57707f = interfaceC15386l3.mo1724n();
        InterfaceC29873g0 interfaceC29873g0Mo1717d = interfaceC15386l3.mo1717d();
        this.f57708g = AbstractC3269g.m9493Z(interfaceC29873g0Mo1717d == null ? C29871f0.f122092w : interfaceC29873g0Mo1717d);
        this.f57709h = interfaceC15386l3.mo1722l();
        this.f57710i = AbstractC13091v.m36593c(interfaceC15386l3.getLabel());
        this.f57711j = interfaceC15386l3.getLayoutDirection();
        this.f57712k = interfaceC15386l3 instanceof C15372j0 ? EnumC3869n.f15810J : interfaceC15386l3 instanceof C15415r2 ? EnumC3869n.f15807G : interfaceC15386l3 instanceof C15453z0 ? EnumC3869n.f15838w : interfaceC15386l3 instanceof C15384l1 ? EnumC3869n.f15820T : null;
        this.f57713l = AbstractC13091v.m36593c(interfaceC15386l3.mo1718e());
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c("");
        this.f57714m = c13045h2M36593c;
        this.f57715n = AbstractC13091v.m36598h(c13045h2M36593c);
        final int i13 = 0;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13045h2M36593c, new Function1(this) { // from class: g40.e3

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15351f3 f57660x;

            {
                this.f57660x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC41211c interfaceC41211c;
                switch (i13) {
                    case 0:
                        String it = (String) obj;
                        AbstractC22676k.m65750j(it, "it");
                        return this.f57660x.f57702a.mo1723m(it);
                    case 1:
                        String it3 = (String) obj;
                        AbstractC22676k.m65750j(it3, "it");
                        Function1 function2 = this.f57660x.f57704c;
                        return (function2 == null || (interfaceC41211c = (InterfaceC41211c) function2.invoke(it3)) == null) ? AbstractC32128i.m100055i(it3) : interfaceC41211c;
                    default:
                        InterfaceC15421s3 it4 = (InterfaceC15421s3) obj;
                        AbstractC22676k.m65750j(it4, "it");
                        return Boolean.valueOf(it4.isValid() || (!it4.isValid() && this.f57660x.f57702a.mo1722l() && it4.mo43599a()));
                }
            }
        });
        final int i14 = 1;
        this.f57716o = AbstractC3269g.m9484M(c13045h2M36593c, new Function1(this) { // from class: g40.e3

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15351f3 f57660x;

            {
                this.f57660x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC41211c interfaceC41211c;
                switch (i14) {
                    case 0:
                        String it = (String) obj;
                        AbstractC22676k.m65750j(it, "it");
                        return this.f57660x.f57702a.mo1723m(it);
                    case 1:
                        String it3 = (String) obj;
                        AbstractC22676k.m65750j(it3, "it");
                        Function1 function2 = this.f57660x.f57704c;
                        return (function2 == null || (interfaceC41211c = (InterfaceC41211c) function2.invoke(it3)) == null) ? AbstractC32128i.m100055i(it3) : interfaceC41211c;
                    default:
                        InterfaceC15421s3 it4 = (InterfaceC15421s3) obj;
                        AbstractC22676k.m65750j(it4, "it");
                        return Boolean.valueOf(it4.isValid() || (!it4.isValid() && this.f57660x.f57702a.mo1722l() && it4.mo43599a()));
                }
            }
        });
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(interfaceC15386l3.mo1722l() ? C15451y3.f58039a : C15426t3.f57978b);
        this.f57717p = c13045h2M36593c2;
        this.f57718q = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.f57719r = interfaceC15386l3.getLoading();
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(bool);
        this.f57720s = c13045h2M36593c3;
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(bool);
        this.f57721t = c13045h2M36593c4;
        C26318e c26318eM9513t = AbstractC3269g.m9513t(c13045h2M36593c2, c13045h2M36593c4, c13045h2M36593c3, new C13168a(26));
        this.f57722u = c26318eM9513t;
        this.f57723v = AbstractC3269g.m9509p(c26318eM9513t, c13045h2M36593c2, new C15184w8(8));
        final int i15 = 2;
        C26318e c26318eM9484M2 = AbstractC3269g.m9484M(c13045h2M36593c2, new Function1(this) { // from class: g40.e3

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15351f3 f57660x;

            {
                this.f57660x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC41211c interfaceC41211c;
                switch (i15) {
                    case 0:
                        String it = (String) obj;
                        AbstractC22676k.m65750j(it, "it");
                        return this.f57660x.f57702a.mo1723m(it);
                    case 1:
                        String it3 = (String) obj;
                        AbstractC22676k.m65750j(it3, "it");
                        Function1 function2 = this.f57660x.f57704c;
                        return (function2 == null || (interfaceC41211c = (InterfaceC41211c) function2.invoke(it3)) == null) ? AbstractC32128i.m100055i(it3) : interfaceC41211c;
                    default:
                        InterfaceC15421s3 it4 = (InterfaceC15421s3) obj;
                        AbstractC22676k.m65750j(it4, "it");
                        return Boolean.valueOf(it4.isValid() || (!it4.isValid() && this.f57660x.f57702a.mo1722l() && it4.mo43599a()));
                }
            }
        });
        this.f57724w = c26318eM9484M2;
        this.f57725x = AbstractC3269g.m9509p(c26318eM9484M2, c26318eM9484M, new C15184w8(9));
        if (str != null) {
            mo43573s(str);
        }
    }
}
