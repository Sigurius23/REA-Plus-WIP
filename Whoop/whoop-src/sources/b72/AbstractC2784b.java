package b72;

import a41.C0373i;
import am0.C0998b;
import android.graphics.Canvas;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import as1.C1945f;
import b01.C2185f;
import b30.C2619s2;
import b91.C2886a;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import gy0.AbstractC16276e;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import i93.C18279e;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p025b1.C2217h;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import z71.AbstractC40145d;
import z71.AbstractC40153l;

/* JADX INFO: renamed from: b72.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0002*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0017\u0010%\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!\"\u0017\u0010(\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!\"\u0017\u0010+\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!¨\u0006-²\u0006\u000e\u0010,\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lb72/e;", "viewState", "Ll83/a0;", "q", "(Lb72/e;Landroidx/compose/runtime/Composer;I)V", "", "isSuccessState", "l", "(Lb72/e;ZLandroidx/compose/runtime/Composer;I)V", "Lb72/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lb72/d;ZLandroidx/compose/runtime/Composer;I)V", "Lk2/e;", "", "percent", "Ly3/c;", "density", "p", "(Lk2/e;FLy3/c;)V", "arcAngle", "z", "(FF)F", "Li93/f;", "t", "y", "(Li93/f;F)F", "a", "Li93/f;", "meterArcRange", "Li91/a;", "b", "Li91/a;", "getSageMeterBorder", "()Li91/a;", "sageMeterBorder", "c", "getSageMeterOverlay", "sageMeterOverlay", "d", "getSageMeterBorderContinuous", "sageMeterBorderContinuous", "e", "getSageMeterOverlayContinuous", "sageMeterOverlayContinuous", "scale", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2784b {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC18280f f10935a = new C18279e(0.0f, 0.6111111f);

    /* JADX INFO: renamed from: b */
    private static final AbstractC18247a f10936b = AbstractC18249c.m52572j(new C2783a(0));

    /* JADX INFO: renamed from: c */
    private static final AbstractC18247a f10937c = AbstractC18249c.m52572j(new C2783a(1));

    /* JADX INFO: renamed from: d */
    private static final AbstractC18247a f10938d = AbstractC18249c.m52572j(new C2783a(2));

    /* JADX INFO: renamed from: e */
    private static final AbstractC18247a f10939e = AbstractC18249c.m52572j(new C2783a(3));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final AbstractC17911t m7888A(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        InterfaceC18280f interfaceC18280f = f10935a;
        return C17909s.m51492j(c17909s, new C23465k[]{new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.0f)), new C17919x(brushBackground.getAccentPositiveTrend())), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.33f)), new C17919x(brushBackground.getAccentPositiveTrend())), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.34f)), new C17919x(brushBackground.getAccentFocus())), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.66f)), new C17919x(brushBackground.getAccentFocus())), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.67f)), new C17919x(brushBackground.getAccentNegativeTrend())), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 1.0f)), new C17919x(brushBackground.getAccentNegativeTrend())), new C23465k(Float.valueOf(1.0f), new C17919x(brushBackground.getAccentPositiveTrend()))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final AbstractC17911t m7889B(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        C17919x c17919x = new C17919x(brushBackground.getAccentPositiveTrend());
        C17919x c17919x2 = new C17919x(brushBackground.getAccentPositiveTrend());
        C17919x c17919x3 = new C17919x(brushBackground.getAccentFocus());
        C17919x c17919x4 = new C17919x(brushBackground.getAccentFocus());
        C17919x c17919x5 = new C17919x(brushBackground.getAccentNegativeTrend());
        C17919x c17919x6 = new C17919x(brushBackground.getAccentNegativeTrend());
        C17919x c17919x7 = new C17919x(brushBackground.getAccentNegativeTrend());
        long j7 = C17919x.f69636m;
        return C17909s.m51491i(c17909s, AbstractC37056f.m118959K(c17919x, c17919x2, c17919x3, c17919x4, c17919x5, c17919x6, c17919x7, new C17919x(j7), new C17919x(j7), new C17919x(brushBackground.getAccentPositiveTrend())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final AbstractC17911t m7890C(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        InterfaceC18280f interfaceC18280f = f10935a;
        return C17909s.m51492j(c17909s, new C23465k[]{new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.0f)), new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentPositiveTrend()))), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.33f)), new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentPositiveTrend()))), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.34f)), new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentNegativeTrend()))), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.66f)), new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentNegativeTrend()))), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 0.67f)), new C17919x(C17919x.m51541c(0.2f, brushBackground.getStrainZone5()))), new C23465k(Float.valueOf(m7916y(interfaceC18280f, 1.0f)), new C17919x(C17919x.m51541c(0.2f, brushBackground.getStrainZone5()))), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentPositiveTrend())))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final AbstractC17911t m7891D(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        C17919x c17919x = new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentPositiveTrend()));
        C17919x c17919x2 = new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentPositiveTrend()));
        C17919x c17919x3 = new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentFocus()));
        C17919x c17919x4 = new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentFocus()));
        C17919x c17919x5 = new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentNegativeTrend()));
        C17919x c17919x6 = new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentNegativeTrend()));
        C17919x c17919x7 = new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentNegativeTrend()));
        long j7 = C17919x.f69636m;
        return C17909s.m51491i(c17909s, AbstractC37056f.m118959K(c17919x, c17919x2, c17919x3, c17919x4, c17919x5, c17919x6, c17919x7, new C17919x(j7), new C17919x(j7), new C17919x(C17919x.m51541c(0.2f, brushBackground.getAccentPositiveTrend()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    private static final void m7903l(C2787e c2787e, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        ?? r10;
        C28655q c28655q2;
        C2886a h7;
        Float fValueOf = Float.valueOf(1.0f);
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1435259124);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(c2787e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87155h(z4) ? 32 : 16;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean zM7931k = c2787e.getIsLoading();
            C2314t c2314t = C2314t.f9131w;
            if (zM7931k) {
                c28655q3.m87150e0(1405247904);
                Modifier modifierM3419p = AbstractC1102d.m3419p(((float) 12.5d) * 4, AbstractC1136a.m3599a(c2314t, "progress_modal_loading_lottie"));
                InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
                Object objM87133R = c28655q3.m87133R();
                Object obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = new C2217h(11);
                    c28655q3.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                Object objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C2185f(29);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC35684p.m113047h(modifierM3419p, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q3, 1769478, 412);
                c28655q3.m87173q(false);
                c28655q = c28655q3;
            } else {
                c28655q3.m87150e0(1405567669);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q3, 48);
                int iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                if (c2787e.getGaugeDateDisplay() != null) {
                    c28655q3.m87150e0(-442978462);
                    String strM7924c = c2787e.getGaugeDateDisplay();
                    C38072d c38072d = C38072d.f163053a;
                    int i15 = C38072d.f163054b;
                    C2886a h13 = c38072d.m121952e(c28655q3, i15).getH3();
                    r10 = 0;
                    AbstractC30795n.m94707h(strM7924c, null, c38072d.m121949b(c28655q3, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h13, fValueOf, c28655q3, 0, (C2886a.f11498d << 18) | 12582912, 65530);
                    C28655q c28655q4 = c28655q3;
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                } else {
                    r10 = 0;
                    c28655q3.m87150e0(-442835800);
                    c28655q3.m87173q(false);
                    c28655q2 = c28655q3;
                }
                String strM7929i = c2787e.getGaugeSubtextDisplay();
                if (z4) {
                    c28655q2.m87150e0(-152828804);
                    h7 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN4();
                } else {
                    c28655q2.m87150e0(-152827844);
                    h7 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getH2();
                }
                c28655q2.m87173q(r10);
                C28655q c28655q5 = c28655q2;
                AbstractC30795n.m94707h(strM7929i, null, c2787e.getGaugeLastUpdatedDisplayStyle().getColorKey().mo134584toComposableColorWaAFU9c(c28655q2, r10), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, fValueOf, c28655q5, 0, (C2886a.f11498d << 18) | 12582912, 65530);
                C28655q c28655q6 = c28655q5;
                c28655q6.m87173q(true);
                c28655q6.m87173q(r10);
                c28655q = c28655q6;
            }
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(c2787e, z4, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m7904m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m7905n(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m7906o(C2787e c2787e, boolean z4, int i13, Composer composer, int i14) {
        m7903l(c2787e, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m7907p(InterfaceC22131e interfaceC22131e, float f13, InterfaceC39171c interfaceC39171c) {
        float fMo743q0 = interfaceC39171c.mo743q0(18);
        float fMo743q1 = interfaceC39171c.mo743q0(243) - fMo743q0;
        float f14 = fMo743q0 / 2.0f;
        long jMo721B0 = interfaceC22131e.mo721B0();
        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(160.0f, jMo721B0);
            C17909s c17909s = AbstractC17911t.f69612b;
            long j7 = C17919x.f69629f;
            InterfaceC22131e.m63381X(interfaceC22131e, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.01f, j7)), new C17919x(C17919x.m51541c(0.01f, j7))), 0L, 0L, 14), m7917z(f13, 2.5f), 2.5f, false, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo743q1)) << 32) | (((long) Float.floatToRawIntBits(fMo743q1)) & 4294967295L), new C22135i(fMo743q0, 0.0f, 0, 0, null, 30), 0, 320);
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m7908q(C2787e viewState, Composer composer, int i13) {
        int i14;
        C2787e c2787e;
        C0209i c0209i;
        C2314t c2314t;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(858655956);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean z13 = (viewState.getIsLoading() || viewState.getGaugeLastUpdatedDisplayStyle() == EnumC2788f.MISSING_DATA) ? false : true;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC3855a.m11831o(1.0f, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM7930j = viewState.getIsContinuousDial();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t2), false, 1.0f);
            boolean zM87153g = c28655q.m87153g(interfaceC39171c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C2619s2(interfaceC39171c, interfaceC28601c1, 1);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3384f, (Function1) objM87133R2);
            C2307m c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3500d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i15 = i14;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC40145d.m128728c(), AbstractC12350b.m34565N(m7909r(interfaceC28601c1), c2314t2));
            boolean zM87155h = c28655q.m87155h(zM7930j) | c28655q.m87153g(interfaceC39171c);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87155h || objM87133R3 == c28676v0) {
                objM87133R3 = new C1945f(zM7930j, interfaceC39171c, 1);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3419p, (Function1) objM87133R3);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3480c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            Modifier modifierM107879c = z13 ? c2314t2 : AbstractC34132o.m107879c(0.2f, c2314t2);
            AbstractC18247a abstractC18247a = zM7930j ? f10938d : f10936b;
            AbstractC18247a abstractC18247a2 = zM7930j ? f10939e : f10937c;
            int i16 = AbstractC18247a.f71043a;
            AbstractC40153l.m128756o(modifierM107879c, abstractC18247a, abstractC18247a2, c28655q, (i16 << 6) | (i16 << 3), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(AbstractC40145d.m128728c(), AbstractC12350b.m34565N(m7909r(interfaceC28601c1), c2314t2));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3419p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            if (!z13 || viewState.getGaugeFillPercentage() == null) {
                c0209i = c0209i3;
                c2314t = c2314t2;
                z4 = false;
                c28655q.m87150e0(-1101868629);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1102106957);
                float fM7917z = m7917z(viewState.getGaugeFillPercentage().floatValue(), 5.0f);
                AbstractC40153l.m128761t(fM7917z, 0.0f, null, 0, c28655q, 0, 14);
                c0209i = c0209i3;
                c2314t = c2314t2;
                AbstractC40153l.m128764w(fM7917z, 0.0f, 0.0f, 0.0f, null, 0, c28655q, 0, 62);
                c28655q = c28655q;
                z4 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9115x, z4);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d5);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            Modifier modifierM34565N = AbstractC12350b.m34565N(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(10), C2299e.f9111N, c28655q, 54);
            int iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM34565N);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m6);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
            AbstractC11266d.m30469w(56, m7909r(interfaceC28601c1), c2314t, c28655q);
            c2787e = viewState;
            m7903l(c2787e, z13, c28655q, i15 & 14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(40), C2299e.f9107J, c28655q, 6);
            int iHashCode7 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m7);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
            m7914w(c2787e.getGaugeLeftSubtext(), z13, c28655q, 0);
            m7914w(c2787e.getGaugeRightSubtext(), z13, c28655q, 0);
            AbstractC2875y.m8286B(c28655q, true, true, true, true);
        } else {
            c2787e = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c2787e, i13, 7);
        }
    }

    /* JADX INFO: renamed from: r */
    private static final float m7909r(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m7910s(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m7911t(InterfaceC39171c interfaceC39171c, InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        m7910s(interfaceC28601c1, interfaceC39171c.mo733e0((int) (coordinates.mo3541n() >> 32)) / AbstractC40145d.m128728c());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m7912u(boolean z4, InterfaceC39171c interfaceC39171c, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        Canvas canvasM51433a = AbstractC17876d.m51433a(c0238p0.f815w.f85852x.m716w());
        canvasM51433a.saveLayer(null, null);
        c0238p0.m728a();
        if (!z4) {
            m7907p(drawWithContent, 0.33f, interfaceC39171c);
            m7907p(drawWithContent, 0.66f, interfaceC39171c);
        }
        canvasM51433a.restore();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m7913v(C2787e c2787e, int i13, Composer composer, int i14) {
        m7908q(c2787e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m7914w(C2786d viewState, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-713629370);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM7919a = viewState.getSubtextTitleDisplay();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a h7 = c38072d.m121952e(c28655q2, i15).getH6();
            long white70 = c38072d.m121949b(c28655q2, i15).getWhite70();
            int i16 = (C2886a.f11498d << 18) | 12582912;
            AbstractC30795n.m94707h(strM7919a, null, white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, fValueOf, c28655q2, 0, i16, 65530);
            String strM7921c = viewState.getSubtextValueDisplay();
            C2886a n13 = c38072d.m121952e(c28655q2, i15).getN7();
            long jM73366B = z4 ? AbstractC25012a.m73366B(c28655q2, -784884582, c38072d, c28655q2, i15) : AbstractC31061c.m95627c(c28655q2, -784883497, c38072d, c28655q2, i15);
            c28655q2.m87173q(false);
            AbstractC30795n.m94707h(strM7921c, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n13, fValueOf, c28655q2, 0, i16, 65530);
            AbstractC30795n.m94707h(viewState.getSubtextUnitsDisplay(), null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB3(), fValueOf, c28655q2, 0, i16, 65530);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(viewState, z4, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m7915x(C2786d c2786d, boolean z4, int i13, Composer composer, int i14) {
        m7914w(c2786d, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final float m7916y(InterfaceC18280f interfaceC18280f, float f13) {
        AbstractC22676k.m65750j(interfaceC18280f, "<this>");
        return ((((Number) interfaceC18280f.mo52651d()).floatValue() - ((Number) interfaceC18280f.getStart()).floatValue()) * f13) + ((Number) interfaceC18280f.getStart()).floatValue();
    }

    /* JADX INFO: renamed from: z */
    private static final float m7917z(float f13, float f14) {
        return (220.0f - f14) * f13;
    }
}
