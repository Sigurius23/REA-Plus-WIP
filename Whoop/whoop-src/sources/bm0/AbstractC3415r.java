package bm0;

import a01.C0085e;
import a41.C0373i;
import am2.C1012d;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import ar2.C1935f;
import b72.C2783a;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import nl0.AbstractC26802d;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17893k;
import p208i2.InterfaceC17869a1;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bm0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0019\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010\"¨\u0006&²\u0006\u000e\u0010%\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lbm0/s;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "v", "(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbm0/d;", "buttonState", "", "isSelected", "Lkotlin/Function0;", "onClickAction", "l", "(Lbm0/d;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lbm0/c;", "targetZone", "t", "(Lbm0/c;Landroidx/compose/runtime/Composer;I)V", "", "Lbm0/b;", "subtitles", "q", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "icon", "", "title", "o", "(Lkd1/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "D", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "E", "B", "selected", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3415r {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m9824A(C3416s c3416s, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m9851v(c3416s, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final Modifier m9825B(Modifier modifier) {
        return modifier.mo3471e(AbstractC1125a.m3480c(modifier, new C2783a(22)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m9826C(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22135i c22135i = new C22135i(c0238p0.mo743q0((float) 1.5d), 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14);
        long jMo134585toTestableColor0d7_KjU = EnumC39333f.WHITE_50.getColor();
        float fMo743q0 = c0238p0.mo743q0(3 * 4);
        InterfaceC22131e.m63374D(drawWithContent, jMo134585toTestableColor0d7_KjU, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), c22135i, 0.0f, 230);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final Modifier m9827D(Modifier modifier) {
        return modifier.mo3471e(AbstractC15751g.m44456i((float) 1.5d, modifier, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(3 * 4)));
    }

    /* JADX INFO: renamed from: E */
    private static final Modifier m9828E(Modifier modifier) {
        return modifier.mo3471e(AbstractC1125a.m3480c(modifier, new C2783a(21)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m9829F(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22135i c22135i = new C22135i(c0238p0.mo743q0((float) 1.5d), 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14);
        AbstractC17911t abstractC17911tM43972A = AbstractC15673b0.m43972A();
        float fMo743q0 = c0238p0.mo743q0(3 * 4);
        InterfaceC22131e.m63376J0(drawWithContent, abstractC17911tM43972A, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), 0.0f, c22135i, 214);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m9841l(C3401d c3401d, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        long jM95624D;
        long jM31986e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(986117225);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c3401d) : c28655q.m87157i(c3401d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3357b = C2314t.f9131w;
            if (z4) {
                float f13 = 4;
                modifierM3357b = AbstractC1092a.m3357b(modifierM3357b, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f13 * f13), 0.0f, 4);
            }
            Modifier modifier = modifierM3357b;
            if (z4) {
                c28655q.m87150e0(-1529109004);
                jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1529107885);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            if (z4) {
                c28655q.m87150e0(-1529105805);
                jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1529104717);
                jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            Integer numValueOf = z4 ? Integer.valueOf(C38072d.f163053a.m121951d().getAction().getCheckMark()) : null;
            TextResource textResourceM9787a = z4 ? c3401d.getSelectedCtaText() : c3401d.getUnselectedCtaText();
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(jM95624D, jM31986e, c38072d.m121949b(c28655q, i15).getWhite10(), c38072d.m121949b(c28655q, i15).getWhite20(), c28655q, 0, 0);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3406i(interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifier, false, false, numValueOf, null, null, textResourceM9787a, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable << 18, 0, 7990);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(c3401d, z4, interfaceC4339a, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m9842m(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m9843n(C3401d c3401d, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m9841l(c3401d, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m9844o(AbstractC22403o abstractC22403o, String str, Composer composer, int i13) {
        int i14;
        String str2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-936315916);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * 4, c2314t);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC15005f3.m43107a(abstractC26165aM64500i, null, modifierM3419p, c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 432, 0);
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i16).getB1();
            str2 = str;
            AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, (i15 >> 3) & 14, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            str2 = str;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3413p(abstractC22403o, str2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m9845p(AbstractC22403o abstractC22403o, String str, int i13, Composer composer, int i14) {
        m9844o(abstractC22403o, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m9846q(final List<C3399b> list, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(242575321);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), AbstractC22977m.f90656g, null, null, 0, 0, AbstractC37817c.m121344e(1206637908, c28655q, new Function3() { // from class: bm0.q
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC3415r.m9847r(list, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 1572918, 60);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m9847r(List list, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        int i14 = 1;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                C3399b c3399b = (C3399b) it.next();
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(i14 * 4), C2299e.f9107J, c28655q, 6);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                TextResource textResourceM9782a = c3399b.getLabel();
                int i15 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM9782a, c28655q, i15);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
                C2886a c2886aM8421b = c38072d.m121952e(c28655q, i16).getB2();
                int i17 = C2886a.f11498d << 18;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q2, 0, i17, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3399b.getValue(), c28655q2, i15), null, c38072d.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB2(), null, c28655q2, 0, i17, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                i14 = 1;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m9848s(List list, int i13, Composer composer, int i14) {
        m9846q(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m9849t(C3400c c3400c, Composer composer, int i13) {
        InterfaceC17869a1 interfaceC17869a1M105491g;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(247532218);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(c3400c) ? 4 : 2) : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
            String strM21274h = AbstractC8693b.m21274h(c3400c.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2314t c2314t2 = c2314t;
            int i16 = 2;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Float fM9784a = c3400c.getIndicatorPosition();
            float f14 = 0.0f;
            if (fM9784a == null) {
                c28655q.m87150e0(1844452734);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1844452735);
                AbstractC3398a.m9779c(AbstractC2294a.m7154a(10.0f, AbstractC29011e.m88149j(c2314t2, fM9784a.floatValue(), 0.0f, new C29007a(0.5f, 0.9f, false, false, 12, null))), c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-217579173);
            int i17 = 0;
            for (Object obj : c3400c.m9786c()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3417t c3417t = (C3417t) obj;
                Iterator<T> it = c3400c.m9786c().subList(0, i17).iterator();
                float fM9864a = f14;
                while (it.hasNext()) {
                    fM9864a += ((C3417t) it.next()).getSize();
                }
                float fM9864a2 = c3417t.getSize() + fM9864a;
                float fM9864a3 = i17 < AbstractC37056f.m118951C(c3400c.m9786c()) ? c3417t.getSize() - 0.005f : c3417t.getSize();
                if (i17 == 0) {
                    float f15 = i16 * 4;
                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f15, f14, f14, f15, 6);
                } else if (i17 == AbstractC37056f.m118951C(c3400c.m9786c())) {
                    float f16 = i16 * 4;
                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f14, f16, f16, f14, 9);
                } else {
                    interfaceC17869a1M105491g = AbstractC17918w0.f69621a;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                float f17 = 4;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88145f(AbstractC1102d.m3411h(((float) 1.5d) * f17, c2314t2), fM9864a, 0.0f, fM9864a3, 0.0f, null, 26, null), c3417t.getStyle().mo134584toComposableColorWaAFU9c(c28655q, 0), interfaceC17869a1M105491g), c28655q, 0);
                float f18 = (float) 0.5d;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, f18 * f13, 0.0f, 0.0f, 13);
                float f19 = (fM9864a + fM9864a2) / i16;
                C29007a.Companion aVar = C29007a.INSTANCE;
                Modifier modifierM88150k = AbstractC29011e.m88150k(modifierM3398t2, f19, 0.0f, aVar.m88137b(), 2, null);
                TextResource textResourceM9867d = c3417t.getTitle();
                int i19 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM9867d, c28655q, i19);
                C38072d c38072d2 = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C2886a c2886aM8408F = c38072d2.m121952e(c28655q, i24).getN9();
                long jMo134584toComposableColorWaAFU9c = c3417t.getStyle().mo134584toComposableColorWaAFU9c(c28655q, 0);
                int i25 = C2886a.f11498d << 18;
                C28655q c28655q2 = c28655q;
                C2314t c2314t3 = c2314t2;
                AbstractC30795n.m94707h(strM21274h2, modifierM88150k, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8408F, null, c28655q2, 0, i25, 196600);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3417t.getSubtitle(), c28655q2, i19), AbstractC29011e.m88150k(AbstractC1099a.m3398t(c2314t3, 0.0f, f18 * f17, 0.0f, 0.0f, 13), f19, 0.0f, aVar.m88137b(), 2, null), c38072d2.m121949b(c28655q2, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i24).getN9(), null, c28655q2, 0, i25, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                i17 = i18;
                c2305k = c2305k;
                c2314t2 = c2314t3;
                f14 = f14;
                i16 = 2;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c3400c, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m9850u(C3400c c3400c, int i13, Composer composer, int i14) {
        m9849t(c3400c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:105:0x0244  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0185  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0201  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x021c  */
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
    /* JADX INFO: renamed from: v */
    public static final void m9851v(C3416s viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87155h;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zIsFeatureEnabled;
        Modifier modifierM9827D;
        int i18;
        String strM21274h;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C3400c c3400cM9861g;
        InterfaceC25312u interfaceC25312uM9857b;
        boolean z13;
        String str;
        C3401d c3401dM9856a;
        boolean z14;
        boolean zM87157i;
        Object c1012d;
        Function1 function5;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-424830630);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C2783a(20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    zM87155h = c28655q.m87155h(viewState.getIsSelected());
                    objM87133R = c28655q.m87133R();
                    if (zM87155h || objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AIM_ACTIVITY_RECS_TILE_REDESIGN);
                    if (zIsFeatureEnabled || m9853x(interfaceC28601c1)) {
                        modifierM9827D = (zIsFeatureEnabled && m9853x(interfaceC28601c1)) ? m9827D(c2314t) : m9828E(c2314t);
                    } else {
                        modifierM9827D = m9825B(c2314t);
                    }
                    TextResource textResourceM9862h = viewState.getTitle();
                    i18 = TextResource.$stable;
                    strM21274h = AbstractC8693b.m21274h(textResourceM9862h, c28655q, i18);
                    float f13 = 2 * 8;
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3356a(0.1f, modifier4, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM9827D));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, C2299e.f9110M, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    m9844o(viewState.getIcon(), strM21274h, c28655q, AbstractC22403o.f87638a);
                    if (viewState.m9860f().isEmpty()) {
                        c28655q.m87150e0(1383350418);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1383298524);
                        m9846q(viewState.m9860f(), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    c3400cM9861g = viewState.getTargetZone();
                    if (c3400cM9861g == null) {
                        c28655q.m87150e0(1383381851);
                    } else {
                        c28655q.m87150e0(1383381852);
                        m9849t(c3400cM9861g, c28655q, 0);
                    }
                    c28655q.m87173q(false);
                    interfaceC25312uM9857b = viewState.getContent();
                    if (interfaceC25312uM9857b == null) {
                        c28655q.m87150e0(1383431668);
                        c28655q.m87173q(false);
                        str = strM21274h;
                        z13 = false;
                    } else {
                        c28655q.m87150e0(1383431669);
                        z13 = false;
                        str = strM21274h;
                        AbstractC25303l.m74291r(interfaceC25312uM9857b, null, null, null, c28655q, 0, 14);
                        c28655q.m87173q(false);
                    }
                    c3401dM9856a = viewState.getButtonState();
                    if (c3401dM9856a == null) {
                        c28655q.m87150e0(1383506130);
                        c28655q.m87173q(z13);
                        modifier4 = modifier4;
                        function5 = function4;
                    } else {
                        c28655q.m87150e0(1383506131);
                        boolean zM9853x = m9853x(interfaceC28601c1);
                        boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        zM87157i = zM87153g | z14 | c28655q.m87157i(viewState) | c28655q.m87153g(str);
                        Object objM87133R3 = c28655q.m87133R();
                        if (!zM87157i || objM87133R3 == c28676v0) {
                            String str2 = str;
                            function5 = function4;
                            c1012d = new C1012d(function5, viewState, str2, interfaceC28601c1, 1);
                            c28655q.m87172p0(c1012d);
                        } else {
                            c1012d = objM87133R3;
                            function5 = function4;
                        }
                        m9841l(c3401dM9856a, zM9853x, (InterfaceC4339a) c1012d, c28655q, i18);
                        c28655q.m87173q(z13);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0085e(i13, i14, 19, modifier3, function3, viewState);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C2783a(20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                zM87155h = c28655q.m87155h(viewState.getIsSelected());
                objM87133R = c28655q.m87133R();
                if (zM87155h) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AIM_ACTIVITY_RECS_TILE_REDESIGN);
                if (zIsFeatureEnabled) {
                    if (zIsFeatureEnabled) {
                        modifierM9827D = m9828E(c2314t);
                    }
                } else if (zIsFeatureEnabled) {
                    modifierM9827D = m9828E(c2314t);
                }
                TextResource textResourceM9862h2 = viewState.getTitle();
                i18 = TextResource.$stable;
                strM21274h = AbstractC8693b.m21274h(textResourceM9862h2, c28655q, i18);
                float f14 = 2 * 8;
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, AbstractC1092a.m3356a(0.1f, modifier4, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM9827D));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                m9844o(viewState.getIcon(), strM21274h, c28655q, AbstractC22403o.f87638a);
                if (viewState.m9860f().isEmpty()) {
                    c28655q.m87150e0(1383298524);
                    m9846q(viewState.m9860f(), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1383350418);
                    c28655q.m87173q(false);
                }
                c3400cM9861g = viewState.getTargetZone();
                if (c3400cM9861g == null) {
                    c28655q.m87150e0(1383381851);
                } else {
                    c28655q.m87150e0(1383381852);
                    m9849t(c3400cM9861g, c28655q, 0);
                }
                c28655q.m87173q(false);
                interfaceC25312uM9857b = viewState.getContent();
                if (interfaceC25312uM9857b == null) {
                    c28655q.m87150e0(1383431668);
                    c28655q.m87173q(false);
                    str = strM21274h;
                    z13 = false;
                } else {
                    c28655q.m87150e0(1383431669);
                    z13 = false;
                    str = strM21274h;
                    AbstractC25303l.m74291r(interfaceC25312uM9857b, null, null, null, c28655q, 0, 14);
                    c28655q.m87173q(false);
                }
                c3401dM9856a = viewState.getButtonState();
                if (c3401dM9856a == null) {
                    c28655q.m87150e0(1383506130);
                    c28655q.m87173q(z13);
                    modifier4 = modifier4;
                    function5 = function4;
                } else {
                    c28655q.m87150e0(1383506131);
                    boolean zM9853x2 = m9853x(interfaceC28601c1);
                    boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    zM87157i = zM87153g2 | z14 | c28655q.m87157i(viewState) | c28655q.m87153g(str);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        String str3 = str;
                        function5 = function4;
                        c1012d = new C1012d(function5, viewState, str3, interfaceC28601c1, 1);
                        c28655q.m87172p0(c1012d);
                    } else {
                        String str4 = str;
                        function5 = function4;
                        c1012d = new C1012d(function5, viewState, str4, interfaceC28601c1, 1);
                        c28655q.m87172p0(c1012d);
                    }
                    m9841l(c3401dM9856a, zM9853x2, (InterfaceC4339a) c1012d, c28655q, i18);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(i13, i14, 19, modifier3, function3, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C2783a(20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                zM87155h = c28655q.m87155h(viewState.getIsSelected());
                objM87133R = c28655q.m87133R();
                if (zM87155h) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AIM_ACTIVITY_RECS_TILE_REDESIGN);
                if (zIsFeatureEnabled) {
                    if (zIsFeatureEnabled) {
                        modifierM9827D = m9828E(c2314t);
                    }
                } else if (zIsFeatureEnabled) {
                    modifierM9827D = m9828E(c2314t);
                }
                TextResource textResourceM9862h3 = viewState.getTitle();
                i18 = TextResource.$stable;
                strM21274h = AbstractC8693b.m21274h(textResourceM9862h3, c28655q, i18);
                float f15 = 2 * 8;
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f15);
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f15, AbstractC1092a.m3356a(0.1f, modifier4, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM9827D));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i3, C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                m9844o(viewState.getIcon(), strM21274h, c28655q, AbstractC22403o.f87638a);
                if (viewState.m9860f().isEmpty()) {
                    c28655q.m87150e0(1383298524);
                    m9846q(viewState.m9860f(), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1383350418);
                    c28655q.m87173q(false);
                }
                c3400cM9861g = viewState.getTargetZone();
                if (c3400cM9861g == null) {
                    c28655q.m87150e0(1383381851);
                } else {
                    c28655q.m87150e0(1383381852);
                    m9849t(c3400cM9861g, c28655q, 0);
                }
                c28655q.m87173q(false);
                interfaceC25312uM9857b = viewState.getContent();
                if (interfaceC25312uM9857b == null) {
                    c28655q.m87150e0(1383431668);
                    c28655q.m87173q(false);
                    str = strM21274h;
                    z13 = false;
                } else {
                    c28655q.m87150e0(1383431669);
                    z13 = false;
                    str = strM21274h;
                    AbstractC25303l.m74291r(interfaceC25312uM9857b, null, null, null, c28655q, 0, 14);
                    c28655q.m87173q(false);
                }
                c3401dM9856a = viewState.getButtonState();
                if (c3401dM9856a == null) {
                    c28655q.m87150e0(1383506130);
                    c28655q.m87173q(z13);
                    modifier4 = modifier4;
                    function5 = function4;
                } else {
                    c28655q.m87150e0(1383506131);
                    boolean zM9853x3 = m9853x(interfaceC28601c1);
                    boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    zM87157i = zM87153g3 | z14 | c28655q.m87157i(viewState) | c28655q.m87153g(str);
                    Object objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        String str5 = str;
                        function5 = function4;
                        c1012d = new C1012d(function5, viewState, str5, interfaceC28601c1, 1);
                        c28655q.m87172p0(c1012d);
                    } else {
                        String str6 = str;
                        function5 = function4;
                        c1012d = new C1012d(function5, viewState, str6, interfaceC28601c1, 1);
                        c28655q.m87172p0(c1012d);
                    }
                    m9841l(c3401dM9856a, zM9853x3, (InterfaceC4339a) c1012d, c28655q, i18);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(i13, i14, 19, modifier3, function3, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C2783a(20);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            zM87155h = c28655q.m87155h(viewState.getIsSelected());
            objM87133R = c28655q.m87133R();
            if (zM87155h) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AIM_ACTIVITY_RECS_TILE_REDESIGN);
            if (zIsFeatureEnabled) {
                if (zIsFeatureEnabled) {
                    modifierM9827D = m9828E(c2314t);
                }
            } else if (zIsFeatureEnabled) {
                modifierM9827D = m9828E(c2314t);
            }
            TextResource textResourceM9862h4 = viewState.getTitle();
            i18 = TextResource.$stable;
            strM21274h = AbstractC8693b.m21274h(textResourceM9862h4, c28655q, i18);
            float f16 = 2 * 8;
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f16);
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f16, AbstractC1092a.m3356a(0.1f, modifier4, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM9827D));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22971kM66746i4, C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            m9844o(viewState.getIcon(), strM21274h, c28655q, AbstractC22403o.f87638a);
            if (viewState.m9860f().isEmpty()) {
                c28655q.m87150e0(1383298524);
                m9846q(viewState.m9860f(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1383350418);
                c28655q.m87173q(false);
            }
            c3400cM9861g = viewState.getTargetZone();
            if (c3400cM9861g == null) {
                c28655q.m87150e0(1383381851);
            } else {
                c28655q.m87150e0(1383381852);
                m9849t(c3400cM9861g, c28655q, 0);
            }
            c28655q.m87173q(false);
            interfaceC25312uM9857b = viewState.getContent();
            if (interfaceC25312uM9857b == null) {
                c28655q.m87150e0(1383431668);
                c28655q.m87173q(false);
                str = strM21274h;
                z13 = false;
            } else {
                c28655q.m87150e0(1383431669);
                z13 = false;
                str = strM21274h;
                AbstractC25303l.m74291r(interfaceC25312uM9857b, null, null, null, c28655q, 0, 14);
                c28655q.m87173q(false);
            }
            c3401dM9856a = viewState.getButtonState();
            if (c3401dM9856a == null) {
                c28655q.m87150e0(1383506130);
                c28655q.m87173q(z13);
                modifier4 = modifier4;
                function5 = function4;
            } else {
                c28655q.m87150e0(1383506131);
                boolean zM9853x4 = m9853x(interfaceC28601c1);
                boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                zM87157i = zM87153g4 | z14 | c28655q.m87157i(viewState) | c28655q.m87153g(str);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i) {
                    String str7 = str;
                    function5 = function4;
                    c1012d = new C1012d(function5, viewState, str7, interfaceC28601c1, 1);
                    c28655q.m87172p0(c1012d);
                } else {
                    String str8 = str;
                    function5 = function4;
                    c1012d = new C1012d(function5, viewState, str8, interfaceC28601c1, 1);
                    c28655q.m87172p0(c1012d);
                }
                m9841l(c3401dM9856a, zM9853x4, (InterfaceC4339a) c1012d, c28655q, i18);
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(i13, i14, 19, modifier3, function3, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m9852w(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final boolean m9853x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    private static final void m9854y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m9855z(Function1 function1, C3416s c3416s, String str, InterfaceC28601c1 interfaceC28601c1) {
        m9854y(interfaceC28601c1, !m9853x(interfaceC28601c1));
        function1.invoke(new AbstractC26802d.a(m9853x(interfaceC28601c1), c3416s.getRecommendationId(), false, null, str, 12, null));
        return C23454a0.f92919a;
    }
}
