package by1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bs1.C3595n;
import c41.AbstractC4062l0;
import c41.AbstractC4076n0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import java.util.Iterator;
import java.util.Locale;
import kd1.EnumC22400l;
import l83.C23454a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p000.C21061j;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17911t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vx1.AbstractC36558a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xx1.InterfaceC38692b;
import yb3.AbstractC39421y;
import yx1.C39840a;
import yx1.C39841b;
import yx1.C39842c;
import yx1.C39845f;

/* JADX INFO: renamed from: by1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lyx1/f;", "viewState", "Lkotlin/Function1;", "Lxx1/b;", "Ll83/a0;", "onNavigationEvent", "Lvx1/a;", "onAnalyticsEvent", "d", "(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lyx1/c;", "a", "Lyx1/c;", "getSampleReturnsBffData", "()Lyx1/c;", "sampleReturnsBffData", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3700g {

    /* JADX INFO: renamed from: a */
    private static final C39842c f15119a = new C39842c(AbstractC8693b.m21278l("Return Instructions"), AbstractC8693b.m21278l("Return window closes on Feb 17, 2025."), AbstractC8693b.m21278l("If you miss it, you'll be charged"), AbstractC8693b.m21278l("Return Instructions"), AbstractC37056f.m118959K(new C39841b(EnumC16313m0.RETURN, "Place your items in their original shipping box along with the commercial invoice."), new C39841b(EnumC16313m0.SHIPPING_BOX, "Attach the shipping label to the top of the box."), new C39841b(EnumC16313m0.SHIPPING, "Drop off the box at any shipping location, find one near you using [this link](https.whoop.com).")), AbstractC37056f.m118959K(new C39840a("SHIPPING LABEL", "https://whoop.com", "/mock/path/shipping_label.pdf"), new C39840a("COMMERCIAL INVOICE", "https://whoop.com", "/mock/path/shipping_label.pdf"), new C39840a("DANGEROUS GOODS", "https://whoop.com", "/mock/path/shipping_label.pdf")), AbstractC8693b.m21278l("Make sure all items are returned in their original condition. If anything gets damaged, you'll be charged a fee. Shipping costs may apply, depending on the service provider."), AbstractC8693b.m21278l("RETURN AND REFUND POLICY"), "https://support.whoop.com/s/article/Return-Policy?language=en_US");

    /* JADX INFO: renamed from: by1.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.view.content.ReturnsScreenContentKt$ReturnsScreenContent$1$1$1", m100430f = "ReturnsScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f15120w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f15121x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f15121x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f15121x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f15120w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f15121x.invoke(AbstractC36558a.c.f156538a);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:63:0x0186  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x026e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0270  */
    /* JADX WARN: Code duplicated, block: B:77:0x027c  */
    /* JADX WARN: Code duplicated, block: B:78:0x027e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0286  */
    /* JADX WARN: Code duplicated, block: B:84:0x028b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0290  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m11515d(C39845f viewState, Function1 onNavigationEvent, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        int i15;
        int iHashCode;
        Object objM87133R;
        C28676v0 c28676v0;
        C2314t c2314t;
        int i16;
        int i17;
        float f13;
        Iterator it;
        String filePath;
        int iHashCode2;
        boolean z4;
        int i18;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        C28676v0 c28676v1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(157994506);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C39842c returns = viewState.getReturns();
            if (returns == null) {
                c28655q.m87150e0(-469542008);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-469542007);
                int i19 = i14 & 896;
                boolean z15 = i19 == 256;
                Object objM87133R3 = c28655q.m87133R();
                C28676v0 c28676v2 = C28635l.f115821a;
                if (z15 || objM87133R3 == c28676v2) {
                    objM87133R3 = new a(onAnalyticsEvent, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, null);
                AbstractC17911t abstractC17911tM44012U = AbstractC15673b0.m44012U();
                C2314t c2314t2 = C2314t.f9131w;
                float f14 = 8;
                float f15 = 2 * f14;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3396r(AbstractC22953f.m66723l(AbstractC1092a.m3357b(c2314t2, abstractC17911tM44012U, null, 0.0f, 6)), f15, 0.0f, 2));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                int i24 = i14;
                if (c28655q.f115903S) {
                    i15 = i19;
                } else {
                    i15 = i19;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    TextResource navbarTitle = returns.getNavbarTitle();
                    int i25 = TextResource.$stable;
                    int i26 = i24 & 112;
                    AbstractC3699f.m11509c(navbarTitle, onNavigationEvent, c28655q, i25 | i26);
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t2, AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    TextResource alertTitle = returns.getAlertTitle();
                    TextResource alertSubtitle = returns.getAlertSubtitle();
                    AbstractC4076n0.e eVar = new AbstractC4076n0.e(null, 1, null);
                    EnumC22400l enumC22400l = EnumC22400l.UNKNOWN;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v2) {
                        objM87133R = new C3595n(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28676v0 = c28676v2;
                    c2314t = c2314t2;
                    i16 = i26;
                    i17 = i15;
                    AbstractC4062l0.m12421i(null, alertTitle, alertSubtitle, eVar, enumC22400l, null, null, (Function1) objM87133R, c28655q, (i25 << 3) | 12607488 | (i25 << 6) | (AbstractC4076n0.e.f16561e << 9), 97);
                    f13 = 4 * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    AbstractC3694a.m11497f(returns.getInstructionsTitle(), returns.m127909e(), c28655q, i25);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    c28655q.m87150e0(1731388041);
                    it = returns.m127907c().iterator();
                    while (it.hasNext()) {
                        C39840a c39840a = (C39840a) it.next();
                        filePath = c39840a.getFilePath();
                        if (filePath != null) {
                            iHashCode2 = filePath.hashCode();
                        } else {
                            iHashCode2 = 0;
                        }
                        Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "download_" + iHashCode2);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(c39840a.getText());
                        C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                        C38072d c38072d = C38072d.f163053a;
                        int i27 = C38072d.f163054b;
                        Iterator it3 = it;
                        C2314t c2314t3 = c2314t;
                        float f16 = f13;
                        C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i27).getTransparent(), c38072d.m121949b(c28655q, i27).getBrandWhite(), c38072d.m121949b(c28655q, i27).getWhite10(), c38072d.m121949b(c28655q, i27).getWhite20(), c28655q, 0, 0);
                        C13825t c13825tM48880a = AbstractC17269i.m48880a(1, c38072d.m121949b(c28655q, i27).getWhite50());
                        if (i17 == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean zM87153g = c28655q.m87153g(c39840a) | z4;
                        i18 = i16;
                        if (i18 == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87153g | z13;
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            c28676v1 = c28676v0;
                        } else {
                            c28676v1 = c28676v0;
                            if (objM87133R2 == c28676v1) {
                            }
                            C28655q c28655q2 = c28655q;
                            AbstractC27292z.m82343j(modifierM3599a, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, c13825tM48880a, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, TextResource.$stable << 18, 0, 7486);
                            c28655q = c28655q2;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
                            i16 = i18;
                            c28676v0 = c28676v1;
                            c2314t = c2314t3;
                            it = it3;
                            f13 = f16;
                        }
                        objM87133R2 = new C3718c(onAnalyticsEvent, c39840a, onNavigationEvent, 22);
                        c28655q.m87172p0(objM87133R2);
                        C28655q c28655q3 = c28655q;
                        AbstractC27292z.m82343j(modifierM3599a, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, c13825tM48880a, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q3, TextResource.$stable << 18, 0, 7486);
                        c28655q = c28655q3;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
                        i16 = i18;
                        c28676v0 = c28676v1;
                        c2314t = c2314t3;
                        it = it3;
                        f13 = f16;
                    }
                    AbstractC17176i.m48516r(c28655q, false, c2314t, f13, c28655q);
                    TextResource footerText = returns.getFooterText();
                    TextResource policyCtaText = returns.getPolicyCtaText();
                    String policyCtaUrl = returns.getPolicyCtaUrl();
                    int i28 = TextResource.$stable;
                    int i29 = i24 << 6;
                    AbstractC3697d.m11503d(footerText, policyCtaText, policyCtaUrl, onNavigationEvent, onAnalyticsEvent, c28655q, i28 | (i28 << 3) | (i29 & 7168) | (i29 & 57344));
                    AbstractC25012a.m73392y(c28655q, true, true, false);
                }
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                TextResource navbarTitle2 = returns.getNavbarTitle();
                int i210 = TextResource.$stable;
                int i211 = i24 & 112;
                AbstractC3699f.m11509c(navbarTitle2, onNavigationEvent, c28655q, i210 | i211);
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(c2314t2, AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                TextResource alertTitle2 = returns.getAlertTitle();
                TextResource alertSubtitle2 = returns.getAlertSubtitle();
                AbstractC4076n0.e eVar2 = new AbstractC4076n0.e(null, 1, null);
                EnumC22400l enumC22400l2 = EnumC22400l.UNKNOWN;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v2) {
                    objM87133R = new C3595n(19);
                    c28655q.m87172p0(objM87133R);
                }
                c28676v0 = c28676v2;
                c2314t = c2314t2;
                i16 = i211;
                i17 = i15;
                AbstractC4062l0.m12421i(null, alertTitle2, alertSubtitle2, eVar2, enumC22400l2, null, null, (Function1) objM87133R, c28655q, (i210 << 3) | 12607488 | (i210 << 6) | (AbstractC4076n0.e.f16561e << 9), 97);
                f13 = 4 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                AbstractC3694a.m11497f(returns.getInstructionsTitle(), returns.m127909e(), c28655q, i210);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                c28655q.m87150e0(1731388041);
                it = returns.m127907c().iterator();
                while (it.hasNext()) {
                    C39840a c39840a2 = (C39840a) it.next();
                    filePath = c39840a2.getFilePath();
                    if (filePath != null) {
                        iHashCode2 = filePath.hashCode();
                    } else {
                        iHashCode2 = 0;
                    }
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "download_" + iHashCode2);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c39840a2.getText());
                    C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                    C38072d c38072d2 = C38072d.f163053a;
                    int i212 = C38072d.f163054b;
                    Iterator it4 = it;
                    C2314t c2314t4 = c2314t;
                    float f17 = f13;
                    C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q, i212).getTransparent(), c38072d2.m121949b(c28655q, i212).getBrandWhite(), c38072d2.m121949b(c28655q, i212).getWhite10(), c38072d2.m121949b(c28655q, i212).getWhite20(), c28655q, 0, 0);
                    C13825t c13825tM48880a2 = AbstractC17269i.m48880a(1, c38072d2.m121949b(c28655q, i212).getWhite50());
                    if (i17 == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean zM87153g2 = c28655q.m87153g(c39840a2) | z4;
                    i18 = i16;
                    if (i18 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g2 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                        }
                        C28655q c28655q4 = c28655q;
                        AbstractC27292z.m82343j(modifierM3599a2, false, false, null, null, null, textResourceM21278l2, c15077m1M43196a2, null, c13825tM48880a2, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q4, TextResource.$stable << 18, 0, 7486);
                        c28655q = c28655q4;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t4));
                        i16 = i18;
                        c28676v0 = c28676v1;
                        c2314t = c2314t4;
                        it = it4;
                        f13 = f17;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R2 = new C3718c(onAnalyticsEvent, c39840a2, onNavigationEvent, 22);
                    c28655q.m87172p0(objM87133R2);
                    C28655q c28655q5 = c28655q;
                    AbstractC27292z.m82343j(modifierM3599a2, false, false, null, null, null, textResourceM21278l2, c15077m1M43196a2, null, c13825tM48880a2, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q5, TextResource.$stable << 18, 0, 7486);
                    c28655q = c28655q5;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t4));
                    i16 = i18;
                    c28676v0 = c28676v1;
                    c2314t = c2314t4;
                    it = it4;
                    f13 = f17;
                }
                AbstractC17176i.m48516r(c28655q, false, c2314t, f13, c28655q);
                TextResource footerText2 = returns.getFooterText();
                TextResource policyCtaText2 = returns.getPolicyCtaText();
                String policyCtaUrl2 = returns.getPolicyCtaUrl();
                int i213 = TextResource.$stable;
                int i214 = i24 << 6;
                AbstractC3697d.m11503d(footerText2, policyCtaText2, policyCtaUrl2, onNavigationEvent, onAnalyticsEvent, c28655q, i213 | (i213 << 3) | (i214 & 7168) | (i214 & 57344));
                AbstractC25012a.m73392y(c28655q, true, true, false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(viewState, onNavigationEvent, onAnalyticsEvent, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m11516e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11517f(Function1 function1, C39840a c39840a, Function1 function2) {
        String lowerCase = c39840a.getText().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        function1.invoke(new AbstractC36558a.a(AbstractC39421y.m125926K(lowerCase, " ", "_", false)));
        String filePath = c39840a.getFilePath();
        if (filePath != null) {
            function2.invoke(new InterfaceC38692b.c(filePath));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11518g(C39845f c39845f, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m11515d(c39845f, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
