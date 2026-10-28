package h02;

import am0.C0998b;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import ar2.C1930a;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.nativestore.pdp.domain.model.SelectorType;
import com.whoop.nativestore.pdp.domain.model.SizeChart;
import d13.AbstractC11478a;
import d30.C11558r;
import d71.C11757c;
import f01.C13849c0;
import f02.C13917c;
import f71.C14221b;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import java.util.Locale;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p163g1.AbstractC15005f3;
import p181h2.C16618c;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17918w0;
import p208i2.C17887h;
import p208i2.C17891j;
import p208i2.C17916v0;
import p208i2.C17919x;
import p208i2.EnumC17908r0;
import p208i2.InterfaceC17915v;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p571w3.C36776l;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h02.h0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a5\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001fH\u0003¢\u0006\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh02/i0;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Lh02/i0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(Lh02/i0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "v", "Lh02/l0;", "option", "", "isSelected", "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "type", "Lkotlin/Function0;", "onClick", "t", "(Lh02/l0;ZLcom/whoop/nativestore/pdp/domain/model/SelectorType;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "l", "(Lh02/l0;Landroidx/compose/runtime/Composer;I)V", "p", "(Lh02/l0;ZLandroidx/compose/runtime/Composer;I)V", "r", "(Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "color", "Ly3/f;", "strokeWidth", "blurRadius", "offsetY", "C", "(Landroidx/compose/ui/Modifier;JFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16575h0 {

    /* JADX INFO: renamed from: h02.h0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63797a;

        static {
            int[] iArr = new int[SelectorType.values().length];
            try {
                iArr[SelectorType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectorType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f63797a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m46961A(Function1 function1, SizeChart sizeChart) {
        function1.invoke(new C16581k0(sizeChart));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m46962B(C16577i0 c16577i0, Function1 function1, int i13, Composer composer, int i14) {
        m46990z(c16577i0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final Modifier m46963C(Modifier modifier, long j7, float f13, float f14, float f15, Composer composer, int i13, int i14) {
        if ((i14 & 1) != 0) {
            j7 = C38072d.f163053a.m121949b(composer, C38072d.f163054b).getBlack20();
        }
        if ((i14 & 2) != 0) {
            f13 = 2;
        }
        if ((i14 & 4) != 0) {
            f14 = 2;
        }
        boolean z4 = true;
        if ((i14 & 8) != 0) {
            f15 = 1;
        }
        boolean z13 = ((((i13 & 896) ^ 384) > 256 && ((C28655q) composer).m87147d(f13)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && ((C28655q) composer).m87147d(f14)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && ((C28655q) composer).m87147d(f15)) || (i13 & 24576) == 16384);
        if ((((i13 & 112) ^ 48) <= 32 || !((C28655q) composer).m87151f(j7)) && (i13 & 48) != 32) {
            z4 = false;
        }
        boolean z14 = z13 | z4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (z14 || objM87133R == C28635l.f115821a) {
            C14221b c14221b = new C14221b(f13, f14, f15, j7);
            c28655q.m87172p0(c14221b);
            objM87133R = c14221b;
        }
        return AbstractC1125a.m3480c(modifier, (Function1) objM87133R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m46964D(float f13, float f14, float f15, long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        C22128b c22128b = c0238p0.f815w;
        C16618c c16618cM48896j = AbstractC17269i.m48896j(0L, c22128b.mo731d());
        EnumC17908r0 enumC17908r0 = EnumC17908r0.f69610w;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(c16618cM48896j.f63939a, c16618cM48896j.f63940b, c16618cM48896j.f63941c, c16618cM48896j.f63942d);
        Path path = c17891jM51478a.f69587a;
        RectF rectF2 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF2);
        path.addOval(rectF2, AbstractC17897m.m51479b(enumC17908r0));
        C0237p c0237p = c22128b.f85852x;
        long jM670A = c0237p.m670A();
        c0237p.m716w().mo51426q();
        try {
            ((C0929d) c0237p.f812x).m2344b(c17891jM51478a, 1);
            InterfaceC17915v interfaceC17915vM716w = ((C0238p0) drawWithContent).f815w.f85852x.m716w();
            C17887h c17887hM51522j = AbstractC17918w0.m51522j();
            c17887hM51522j.m51455m(1);
            C0238p0 c0238p1 = (C0238p0) drawWithContent;
            c17887hM51522j.m51454l(c0238p1.mo743q0(f13));
            Paint paint = c17887hM51522j.f69578a;
            paint.setColor(0);
            paint.setShadowLayer(c0238p1.mo743q0(f14), 0.0f, c0238p1.mo743q0(f15), AbstractC17918w0.m51506H(j7));
            float fIntBitsToFloat = Float.intBitsToFloat((int) (((C0238p0) drawWithContent).f815w.mo731d() >> 32)) / 2.0f;
            interfaceC17915vM716w.mo51421l((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (((C0238p0) drawWithContent).f815w.mo731d() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), c17887hM51522j, C16620e.m47212d(((C0238p0) drawWithContent).f815w.mo731d()) / 2.0f);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237p, jM670A);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final void m46976l(C16583l0 c16583l0, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(40607);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c16583l0) : c28655q2.m87157i(c16583l0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8 * 4;
            C2314t c2314t = C2314t.f9131w;
            c28655q = c28655q2;
            Modifier modifierM46963C = m46963C(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13, c2314t), AbstractC33253j.f138651a), 0L, 0.0f, 0.0f, 0.0f, c28655q, 0, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM46963C);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22403o image = c16583l0.getImage();
            if (image == null) {
                c28655q.m87150e0(1817463583);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1817463584);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a, 3), c16583l0.getLabel(), AbstractC1102d.m3419p(f13, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 24960, 104);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c16583l0, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m46977m(C16583l0 c16583l0, int i13, Composer composer, int i14) {
        m46976l(c16583l0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m46978n(Modifier modifier, C16577i0 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1992861830);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier), f13, 4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getGreyL6(), AbstractC17918w0.f69621a));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14 * 1.5f), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i17 = (i15 >> 3) & 126;
            m46990z(state, onViewEvent, c28655q, i17);
            m46986v(state, onViewEvent, c28655q, i17);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 22, modifier2, onViewEvent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m46979o(Modifier modifier, C16577i0 c16577i0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46978n(modifier, c16577i0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m46980p(C16583l0 c16583l0, boolean z4, Composer composer, int i13) {
        int i14;
        long jM95624D;
        long brandBlack;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-34457067);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c16583l0) : c28655q.m87157i(c16583l0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(8 * 4, c2314t), AbstractC33253j.f138651a);
            if (z4) {
                c28655q.m87150e0(-1796561051);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1796559963);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            AbstractC22989q.m66760a(m46963C(AbstractC1092a.m3358c(modifierM118994r, jM95624D, AbstractC17918w0.f69621a), 0L, 0.0f, 0.0f, 0.0f, c28655q, 0, 15), c28655q, 0);
            String strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21278l(c16583l0.getText()), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q, i15).getSh4();
            if (z4) {
                brandBlack = AbstractC25012a.m73366B(c28655q, -1796552155, c38072d, c28655q, i15);
            } else {
                c28655q.m87150e0(-1796551067);
                brandBlack = c38072d.m121949b(c28655q, i15).getBrandBlack();
            }
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(strM21274h, null, brandBlack, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, c2886aM8414L, null, c28655q, 0, (C2886a.f11498d << 18) | 3504, 181754);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(c16583l0, z4, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m46981q(C16583l0 c16583l0, boolean z4, int i13, Composer composer, int i14) {
        m46980p(c16583l0, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m46982r(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(765370721);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 4;
            float f14 = 8 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM5375L = AbstractC1772c1.m5375L(45.0f, AbstractC1102d.m3421r(c2314t, 0.5f * f13, f14));
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM5375L, brandWhite, c17916v0);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22989q.m66760a(C1100b.f4583a.mo3400a(AbstractC1092a.m3358c(AbstractC1102d.m3421r(c2314t, f13 * 0.25f, f14), c38072d.m121949b(c28655q, i14).getBrandBlack(), c17916v0), C2299e.f9102E), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m46983s(int i13, Composer composer, int i14) {
        m46982r(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
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
    /* JADX INFO: renamed from: t */
    private static final void m46984t(C16583l0 c16583l0, boolean z4, SelectorType selectorType, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        SelectorType selectorType2;
        boolean z13;
        ?? r10;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1191423293);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c16583l0) : c28655q.m87157i(c16583l0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(selectorType.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            float f13 = 4;
            float f14 = 11 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1102d.m3419p(f14, c2314t), false, null, null, interfaceC4339a2, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i15 = a.f63797a[selectorType.ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(-1844967654);
                m46976l(c16583l0, c28655q, (i14 & 14) | AbstractC22403o.f87638a);
                c28655q.m87173q(false);
            } else {
                if (i15 != 2) {
                    throw AbstractC11895b.m32003v(-1844969039, c28655q, false);
                }
                c28655q.m87150e0(-1844965422);
                m46980p(c16583l0, z4, c28655q, (i14 & 112) | AbstractC22403o.f87638a | (i14 & 14));
                c28655q.m87173q(false);
            }
            if (z4) {
                c28655q.m87150e0(-1359244112);
                r10 = 0;
                AbstractC22989q.m66760a(AbstractC15751g.m44455h(AbstractC1102d.m3419p(f14, c2314t), 1, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC33253j.f138651a), c28655q, 0);
                selectorType2 = selectorType;
                if (selectorType2 == SelectorType.IMAGE) {
                    z13 = true;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.TINY_BORDERED_CHECKMARK.toWhoopIcon(), c28655q, 0), null, AbstractC18489d0.m53365f(c28655q, -1358986347, f13, f13, c2314t), C17919x.f69637n, c28655q, 3504, 0);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(-1358705301);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                selectorType2 = selectorType;
                z13 = true;
                r10 = 0;
                c28655q.m87150e0(-1358695381);
                c28655q.m87173q(false);
            }
            if (c16583l0.getHasStock()) {
                c28655q.m87150e0(-1358623957);
                c28655q.m87173q(r10);
            } else {
                c28655q.m87150e0(-1358663358);
                m46982r(c28655q, r10);
                c28655q.m87173q(r10);
            }
            c28655q.m87173q(z13);
        } else {
            selectorType2 = selectorType;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(i13, 14, c16583l0, selectorType2, interfaceC4339a, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m46985u(C16583l0 c16583l0, boolean z4, SelectorType selectorType, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m46984t(c16583l0, z4, selectorType, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m46986v(C16577i0 c16577i0, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1434711323);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c16577i0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 1 * 8;
            AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), AbstractC22977m.m66746i(f13), AbstractC22977m.m66746i(f13), null, 7, 0, AbstractC37817c.m121344e(-108149750, c28655q, new C22931l(27, c16577i0, function1)), c28655q, 1597878, 40);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16573g0(c16577i0, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m46987w(C16577i0 c16577i0, Function1 function1, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (C16583l0 c16583l0 : c16577i0.m46994e()) {
                c28655q.m87144b0(-1810067911, c16583l0.getKey());
                String key = c16583l0.getKey();
                C16583l0 selectedOption = c16577i0.getSelectedOption();
                boolean zM65745e = AbstractC22676k.m65745e(key, selectedOption != null ? selectedOption.getKey() : null);
                SelectorType type = c16577i0.getType();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c16583l0) | c28655q.m87157i(c16577i0);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C11558r(function1, c16583l0, c16577i0, 24);
                    c28655q.m87172p0(objM87133R);
                }
                m46984t(c16583l0, zM65745e, type, (InterfaceC4339a) objM87133R, c28655q, AbstractC22403o.f87638a);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m46988x(Function1 function1, C16583l0 c16583l0, C16577i0 c16577i0) {
        function1.invoke(new C16579j0(c16583l0.getKey(), c16577i0.getLevel(), c16577i0.getVariantSelectorIndex(), c16577i0.getPackItemId(), c16577i0.getPackItemProductKey()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m46989y(C16577i0 c16577i0, Function1 function1, int i13, Composer composer, int i14) {
        m46986v(c16577i0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m46990z(C16577i0 c16577i0, Function1 function1, Composer composer, int i13) {
        int i14;
        int i15;
        C38072d c38072d;
        boolean z4;
        int i16;
        C23454a0 c23454a0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(779524303);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c16577i0) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14;
        if (c28655q.m87135U(i17 & 1, (i17 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8 * 0.5f), C2299e.f9108K, c28655q, 54);
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
            String title = c16577i0.getTitle();
            Locale locale = Locale.ROOT;
            TextResource textResourceM30853e = AbstractC11478a.m30853e(locale, title, "toUpperCase(...)");
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM30853e, c28655q, i18);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d2.m121952e(c28655q, i19).getSh4();
            long brandBlack = c38072d2.m121949b(c28655q, i19).getBrandBlack();
            int i24 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandBlack, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, i24, 196602);
            c28655q = c28655q;
            C16583l0 selectedOption = c16577i0.getSelectedOption();
            if (selectedOption == null) {
                c28655q.m87150e0(1645711573);
                c28655q.m87173q(false);
                c23454a0 = null;
                i15 = i18;
                c38072d = c38072d2;
                i16 = i19;
                z4 = true;
            } else {
                c28655q.m87150e0(1645711574);
                String upperCase = selectedOption.getLabel().toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                String strM21274h2 = AbstractC8693b.m21274h(AbstractC8693b.m21278l(upperCase), c28655q, i18);
                C2886a c2886aM8422c = c38072d2.m121952e(c28655q, i19).getB3();
                C28780r c28780r = C28780r.f116539F;
                long jM113245g = AbstractC35745c.m113245g(1.2d);
                long brandBlack2 = c38072d2.m121949b(c28655q, i19).getBrandBlack();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                i15 = i18;
                c38072d = c38072d2;
                z4 = true;
                i16 = i19;
                AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), brandBlack2, 0L, null, c28780r, null, jM113245g, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q, 12779520, i24, 196440);
                c28655q = c28655q;
                c28655q.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(2131309550);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22989q.m66760a(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z4), c28655q, 0);
            } else {
                c28655q.m87150e0(2131296809);
            }
            c28655q.m87173q(false);
            SizeChart sizeChart = c16577i0.getSizeChart();
            if (sizeChart == null) {
                c28655q.m87150e0(1646160515);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1646160516);
                String upperCase2 = sizeChart.getLabel().toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                String strM21274h3 = AbstractC8693b.m21274h(AbstractC8693b.m21278l(upperCase2), c28655q, i15);
                C38072d c38072d3 = c38072d;
                int i25 = i16;
                C2886a c2886aM8414L2 = c38072d3.m121952e(c28655q, i25).getSh4();
                long brandBlack3 = c38072d3.m121949b(c28655q, i25).getBrandBlack();
                boolean zM87157i = ((i17 & 112) == 32 ? z4 : false) | c28655q.m87157i(sizeChart);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C13989w1(18, function1, sizeChart);
                    c28655q.m87172p0(objM87133R);
                }
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h3, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), brandBlack3, 0L, null, null, null, 0L, C36776l.f157352c, null, 0L, 0, false, 0, 0, null, c2886aM8414L2, null, c28655q2, 100663296, i24, 196344);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            function1 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16573g0(c16577i0, function1, i13, 1);
        }
    }
}
