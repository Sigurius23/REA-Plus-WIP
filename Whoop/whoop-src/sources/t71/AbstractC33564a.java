package t71;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ej1.C13256s;
import i21.AbstractC17999i;
import i21.C18000j;
import i21.InterfaceC18002l;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import java.util.UUID;
import l83.C23454a0;
import nq2.C27060c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.C14984d4;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22128b;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.C39065r;

/* JADX INFO: renamed from: t71.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lt71/j;", "state", "Ll83/a0;", "e", "(Landroidx/compose/ui/Modifier;Lt71/j;Landroidx/compose/runtime/Composer;II)V", "", "Li21/j;", "a", "Ljava/util/List;", "j", "()Ljava/util/List;", "emptyImpactCardStateList", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33564a {

    /* JADX INFO: renamed from: a */
    private static final List<C18000j> f140046a;

    /* JADX INFO: renamed from: t71.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f140047w = new a();

        /* JADX INFO: renamed from: a */
        public final long m105992a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m105992a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: t71.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f140048w = new b();

        /* JADX INFO: renamed from: a */
        public final long m105993a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkAlt();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m105993a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        EnumC39333f enumC39333f = null;
        C18000j c18000j = new C18000j(AbstractC8693b.m21278l("I tried so hard but not so far"), enumC39333f, new C39065r(0.0f, null, 0.0f, 0.0f, null, null, null, 127, null), new InterfaceC18002l.a(AbstractC8693b.m21278l("24%"), true, null, objArr2, objArr3, objArr4, null, objArr, null, null, 1020, null), 2, 0 == true ? 1 : 0);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("In the end");
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
        C39065r c39065r = new C39065r(0.0f, null, 0.4f, 0.5f, enumC39333f2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 99, 0 == true ? 1 : 0);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("-6%");
        int i13 = MessageListItemViewType.UNREAD_SEPARATOR;
        DefaultConstructorMarker defaultConstructorMarker = null;
        UUID uuid = null;
        EnumC39333f enumC39333f3 = null;
        C18000j c18000j2 = new C18000j(textResourceM21278l, enumC39333f3, c39065r, new InterfaceC18002l.a(textResourceM21278l2, true, enumC39333f2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, uuid, i13, defaultConstructorMarker), 2, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("It doesn't even matter!");
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        C39065r c39065r2 = new C39065r(0.0f, null, 0.2f, 0.5f, enumC39333f2, objArr5, 0 == true ? 1 : 0, 99, objArr6);
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        f140046a = AbstractC37056f.m118959K(c18000j, c18000j2, new C18000j(textResourceM21278l3, 0 == true ? 1 : 0, c39065r2, new InterfaceC18002l.a(AbstractC8693b.m21278l("-13%"), true, enumC39333f2, null, null, objArr7, objArr9, null, objArr8, uuid, i13, defaultConstructorMarker), 2, null));
    }

    /* JADX INFO: renamed from: e */
    public static final void m105986e(Modifier modifier, C33573j state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        float f13;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1774436953);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C22135i c22135i = new C22135i(2.0f, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14);
            C38072d c38072d = C38072d.f163053a;
            long jM125372X0 = c38072d.m121949b(c28655q, 6).getWhite20();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f140047w;
                c28655q.m87172p0(objM87133R);
            }
            C17919x c17919x = new C17919x(p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q, 0));
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f140048w;
                c28655q.m87172p0(objM87133R2);
            }
            List listM118959K = AbstractC37056f.m118959K(c17919x, new C17919x(p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q, 0)));
            boolean zM87151f = c28655q.m87151f(jM125372X0) | c28655q.m87157i(c22135i);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87151f || objM87133R3 == c28676v0) {
                objM87133R3 = new C14984d4(jM125372X0, c22135i, 3);
                c28655q.m87172p0(objM87133R3);
            }
            float f14 = 8;
            Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1125a.m3478a(c2314t, (Function1) objM87133R3), 1, f14, c38072d.m121949b(c28655q, 6).getWhite5());
            boolean zM87153g = c28655q.m87153g(listM118959K);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                objM87133R4 = new C13256s(listM118959K, 5);
                c28655q.m87172p0(objM87133R4);
            }
            float f15 = 2;
            float f16 = f15 * f14;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1099a.m3398t(AbstractC1125a.m3479b(modifierM95629e, (Function1) objM87133R4), f16, f16, f16, 0.0f, 8), EnumC22935a1.f90538x);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9109L, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC33576m.m106045o(state.getLeftHeaderState().getIcon(), state.getLeftHeaderState().getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), state.getLeftHeaderState().getText(), state.getLeftHeaderState().getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), state.getLeftHeaderState().getBackgroundIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
            float f17 = f16;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getMiddleText(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            AbstractC33576m.m106047q(state.getRightHeaderState().getIcon(), state.getRightHeaderState().getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), state.getRightHeaderState().getText(), state.getRightHeaderState().getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), state.getRightHeaderState().getBackgroundIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15 * 4, c2314t));
            c28655q.m87150e0(1297229891);
            int i17 = 0;
            for (Object obj : state.m106027g()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC17999i.m51632i(null, (C18000j) obj, null, c28655q, 0, 5);
                if (state.m106027g().size() <= 1 || AbstractC37056f.m118951C(state.m106027g()) == i17) {
                    f13 = f17;
                    c28655q.m87150e0(1388262657);
                    c28655q.m87173q(false);
                } else {
                    f13 = f17;
                    AbstractC31061c.m95623C(c28655q, 1388180972, c2314t, f13, c28655q);
                    c28655q.m87173q(false);
                }
                f17 = f13;
                i17 = i18;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(modifier3, state, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m105987f(long j7, C22135i c22135i, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(1 * 8);
        InterfaceC22131e.m63374D(drawBehind, j7, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), c22135i, 0.0f, 230);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C14018g m105988g(List list, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C27060c(C17909s.m51493k(AbstractC17911t.f69612b, list, (Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)) * 2) / 3, 0.0f, 12), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m105989h(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        C0238p0 c0238p0 = (C0238p0) onDrawWithContent;
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) * 0.001f;
        float f13 = 3;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) * 2) / f13) * 0.999f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) * 0.99f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) / f13)) & 4294967295L);
        float fMo743q0 = c0238p0.mo743q0(1 * 8);
        InterfaceC22131e.m63376J0(onDrawWithContent, abstractC17911t, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), 0.0f, null, 240);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m105990i(Modifier modifier, C33573j c33573j, int i13, int i14, Composer composer, int i15) {
        m105986e(modifier, c33573j, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final List<C18000j> m105991j() {
        return f140046a;
    }
}
