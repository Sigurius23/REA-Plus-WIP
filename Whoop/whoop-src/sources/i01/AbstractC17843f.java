package i01;

import android.annotation.SuppressLint;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.whoopaction.domain.models.Action;
import dp0.C12253i;
import eh0.C13193b;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hu1.C17650g;
import hy0.AbstractC17746g1;
import hy0.C17737e0;
import hy0.C17750h1;
import hy0.C17794v;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import iz0.C21053l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.C21084j;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC23004v;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p700bd1.C3101s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.AbstractC25303l;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i01.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li01/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Li01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "minPriceWidth", "j", "(Li01/h;FLandroidx/compose/runtime/Composer;I)V", "Li01/i;", "style", "Lt0/i;", "cardShape", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Li01/i;Lt0/i;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "s", "(Landroidx/compose/runtime/Composer;I)V", "u", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17843f {

    /* JADX INFO: renamed from: i01.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51297a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1251536459);
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
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
            C17844g c17844g = C17844g.f69359a;
            AbstractC17843f.m51285l(null, c17844g.m51307i(), null, c28655q, 0, 5);
            AbstractC17843f.m51285l(null, c17844g.m51306h(), null, c28655q, 0, 5);
            AbstractC17843f.m51285l(null, c17844g.m51305g(), null, c28655q, 0, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51297a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i01.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51298a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(621807199);
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
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
            C17844g c17844g = C17844g.f69359a;
            AbstractC17843f.m51285l(null, c17844g.m51299a(), null, c28655q, 0, 5);
            AbstractC17843f.m51285l(null, c17844g.m51300b(), null, c28655q, 0, 5);
            AbstractC17843f.m51285l(null, c17844g.m51301c(), null, c28655q, 0, 5);
            AbstractC17843f.m51285l(null, c17844g.m51304f(), null, c28655q, 0, 5);
            AbstractC17843f.m51285l(null, c17844g.m51302d(), null, c28655q, 0, 5);
            AbstractC17843f.m51285l(null, c17844g.m51303e(), null, c28655q, 0, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51298a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i01.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69357a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f69358b;

        static {
            int[] iArr = new int[EnumC17838a.values().length];
            try {
                iArr[EnumC17838a.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17838a.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f69357a = iArr;
            int[] iArr2 = new int[EnumC17846i.values().length];
            try {
                iArr2[EnumC17846i.CURRENT_WITH_CHECKMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC17846i.CHROMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC17846i.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC17846i.BLUE_SIMPLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC17846i.BLUE_SIMPLE_SELECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC17846i.SAVINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC17846i.CURRENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC17846i.DEFAULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            f69358b = iArr2;
        }
    }

    /* JADX INFO: renamed from: j */
    private static final void m51283j(C17845h c17845h, float f13, Composer composer, int i13) {
        int i14;
        C2886a c2886aM8403A;
        C23454a0 c23454a0;
        C23465k c23465k;
        int i15;
        Float fValueOf = Float.valueOf(1.0f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1384506579);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c17845h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3425v = AbstractC1102d.m3425v(c2314t, f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3425v);
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
            int i16 = c.f69357a[c17845h.getPriceLabelSize().ordinal()];
            if (i16 == 1) {
                c28655q.m87150e0(420227205);
                c2886aM8403A = C38072d.f163053a.m121952e(c28655q, 6).getN5();
                c28655q.m87173q(false);
            } else {
                if (i16 != 2) {
                    throw AbstractC11895b.m32003v(420224393, c28655q, false);
                }
                c28655q.m87150e0(420229157);
                c2886aM8403A = C38072d.f163053a.m121952e(c28655q, 6).getN4();
                c28655q.m87173q(false);
            }
            EnumC17846i enumC17846iM51318k = c17845h.getStyle();
            int[] iArr = c.f69358b;
            int i17 = iArr[enumC17846iM51318k.ordinal()];
            if (i17 != 2) {
                if (i17 == 3) {
                    c28655q.m87150e0(420240884);
                    c23465k = new C23465k(c2886aM8403A, new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getRecovery()));
                    c28655q.m87173q(false);
                } else if (i17 == 4 || i17 == 5) {
                    c28655q.m87150e0(420246158);
                    C38072d c38072d = C38072d.f163053a;
                    c23465k = new C23465k(c38072d.m121952e(c28655q, 6).getN45(), new C17919x(c38072d.m121949b(c28655q, 6).getBrandWhite()));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(420250230);
                    c23465k = new C23465k(c2886aM8403A, new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite()));
                    c28655q.m87173q(false);
                }
                c23454a0 = null;
            } else {
                c28655q.m87150e0(420234246);
                c28655q.m87173q(false);
                c23454a0 = null;
                c23465k = new C23465k(C2886a.m8397c(c2886aM8403A, C23285v0.m67363a(c2886aM8403A.getStyle(), AbstractC15673b0.m43989I0(), 0L, null, null, 0L, 33554430), null, 2, null), new C17919x(C17919x.f69637n));
            }
            C2886a c2886a = (C2886a) c23465k.f92937w;
            long j7 = ((C17919x) c23465k.f92938x).f69639a;
            int i18 = iArr[c17845h.getStyle().ordinal()];
            C23454a0 c23454a1 = c23454a0;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c17845h.getPriceLabel(), c28655q, 0), AbstractC1099a.m3392n(c2314t, 0.0f, (i18 == 4 || i18 == 5) ? -5 : 0, 1), j7, 0L, null, C28780r.f116542I, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, fValueOf, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 12582912, 65496);
            c28655q = c28655q;
            String strM51317j = c17845h.getPriceSubLabelMarkdown();
            if (strM51317j == null) {
                c28655q.m87150e0(143475057);
                c28655q.m87173q(false);
                i15 = 6;
            } else {
                c28655q.m87150e0(143475058);
                C21053l c21053l = C21053l.f79834a;
                C38072d c38072d2 = C38072d.f163053a;
                i15 = 6;
                AbstractC21048g.m58807M(strM51317j, null, false, c21053l.m58880a(c38072d2.m121952e(c28655q, 6).getB3().getStyle(), c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32764), null, 0, 0, 0, false, c28655q, 0, 502);
                c28655q.m87173q(false);
                c23454a1 = C23454a0.f92919a;
            }
            if (c23454a1 == null) {
                c28655q = c28655q;
                c28655q.m87150e0(143745378);
                String strM21274h = AbstractC8693b.m21274h(c17845h.getPriceSubLabel(), c28655q, 0);
                C38072d c38072d3 = C38072d.f163053a;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h, null, c38072d3.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i15).getB3(), fValueOf, c28655q2, 0, 12582912, 65530);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(420269458);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3101s(c17845h, f13, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51284k(C17845h c17845h, float f13, int i13, Composer composer, int i14) {
        m51283j(c17845h, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x0205  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:84:0x0224  */
    /* JADX WARN: Code duplicated, block: B:88:0x0260  */
    /* JADX WARN: Code duplicated, block: B:89:0x026b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0299  */
    /* JADX WARN: Code duplicated, block: B:92:0x029d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v33 */
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
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /* JADX INFO: renamed from: l */
    public static final void m51285l(Modifier modifier, C17845h viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Object obj;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object obj2;
        C2307m c2307m;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C28655q c28655q2;
        int i16;
        boolean z15;
        Modifier modifierM31987f;
        C1100b c1100b;
        int iHashCode2;
        C2314t c2314t2;
        C1100b c1100b2;
        ?? r10;
        C28655q c28655q3;
        int iHashCode3;
        boolean z16;
        Object objM87133R;
        Object obj3;
        C2307m c2307m2 = C2299e.f9102E;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(1290326730);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q4.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == obj) {
                        obj3 = objM87133R;
                        Object c17650g = new C17650g(9);
                        c28655q4.m87172p0(c17650g);
                        obj3 = c17650g;
                    }
                    obj3 = objM87133R;
                    function4 = (Function1) obj3;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier2, "PricingSelectionCard");
                C21084j c21084j = new C21084j();
                boolean zM87157i = c28655q4.m87157i(viewState);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i | z13;
                Object objM87133R2 = c28655q4.m87133R();
                obj2 = objM87133R2;
                if (z14 || objM87133R2 == obj) {
                    Object c17841d = new C17841d(0, viewState, function4);
                    c28655q4.m87172p0(c17841d);
                    obj2 = c17841d;
                }
                Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3599a, c21084j, null, false, null, (InterfaceC4339a) obj2, 28);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3360e);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                Modifier modifierM51296w = m51296w(modifier2, viewState.getStyle(), null, c28655q4, i15 & 14, 2);
                Modifier modifier4 = modifier2;
                c28655q2 = c28655q4;
                Function1 function5 = function4;
                AbstractC22953f.m66714a(modifierM51296w, null, false, AbstractC37817c.m121344e(-594562450, c28655q2, new C17842e(viewState, 0)), c28655q2, 3072, 6);
                i16 = c.f69358b[viewState.getStyle().ordinal()];
                if (i16 != 1) {
                    z15 = false;
                    c28655q2.m87150e0(408223163);
                    c28655q2.m87173q(false);
                    modifierM31987f = AbstractC11895b.m31987f(1, 4, c2314t, C17919x.f69629f);
                } else if (i16 != 2) {
                    z15 = false;
                    c28655q2.m87150e0(408226890);
                    c28655q2.m87173q(false);
                    modifierM31987f = AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43989I0(), AbstractC33253j.m105489e(1 * 4), 0.0f, 4);
                } else if (i16 != 3) {
                    c28655q2.m87150e0(-229655079);
                    z15 = false;
                    c28655q2.m87173q(false);
                    modifierM31987f = null;
                } else {
                    z15 = false;
                    c28655q2.m87150e0(408230922);
                    modifierM31987f = AbstractC11895b.m31987f(1, 4, c2314t, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery());
                    c28655q2.m87173q(false);
                }
                c1100b = C1100b.f4583a;
                if (modifierM31987f == null) {
                    c28655q2.m87150e0(-229591529);
                    c28655q2.m87173q(z15);
                    c1100b2 = c1100b;
                    c2314t2 = c2314t;
                    r10 = z15;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(-229591528);
                    float f13 = 4;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f13, AbstractC1099a.m3391m(c1100b.mo3400a(c2314t, C2299e.f9116y), 1 * f13, (z15 ? 1.0f : 0.0f) * f13).mo3471e(modifierM31987f));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, z15);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3419p);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(3 * f13, c2314t);
                    c2314t2 = c2314t;
                    c1100b2 = c1100b;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q2, 6), null, modifierM3419p2, C17919x.f69625b, c28655q2, 3504, 0);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(true);
                    r10 = 0;
                    c28655q5.m87173q(false);
                    c28655q3 = c28655q5;
                }
                if (viewState.getTag() == null) {
                    c28655q3.m87150e0(-228937522);
                    c28655q3.m87173q(r10);
                    z16 = true;
                } else {
                    c28655q3.m87150e0(-228937521);
                    float f14 = 4;
                    Modifier modifierM3391m = AbstractC1099a.m3391m(c1100b2.mo3400a(c2314t2, c2307m), 6 * f14, ((float) r10) * f14);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, r10);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3391m);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                    AbstractC25303l.m74291r(viewState.getTag(), null, null, null, c28655q3, 0, 14);
                    z16 = true;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z16);
                modifier3 = modifier4;
                function3 = function5;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 3, modifier3, (Object) viewState, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            obj = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R = c28655q4.m87133R();
                if (objM87133R == obj) {
                    obj3 = objM87133R;
                    Object c17650g2 = new C17650g(9);
                    c28655q4.m87172p0(c17650g2);
                    obj3 = c17650g2;
                }
                obj3 = objM87133R;
                function4 = (Function1) obj3;
            } else {
                function4 = function2;
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifier2, "PricingSelectionCard");
            C21084j c21084j2 = new C21084j();
            boolean zM87157i2 = c28655q4.m87157i(viewState);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i2 | z13;
            Object objM87133R3 = c28655q4.m87133R();
            obj2 = objM87133R3;
            if (z14) {
                Object c17841d2 = new C17841d(0, viewState, function4);
                c28655q4.m87172p0(c17841d2);
                obj2 = c17841d2;
            } else {
                Object c17841d3 = new C17841d(0, viewState, function4);
                c28655q4.m87172p0(c17841d3);
                obj2 = c17841d3;
            }
            Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM3599a2, c21084j2, null, false, null, (InterfaceC4339a) obj2, 28);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3360e2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
            Modifier modifierM51296w2 = m51296w(modifier2, viewState.getStyle(), null, c28655q4, i15 & 14, 2);
            Modifier modifier5 = modifier2;
            c28655q2 = c28655q4;
            Function1 function6 = function4;
            AbstractC22953f.m66714a(modifierM51296w2, null, false, AbstractC37817c.m121344e(-594562450, c28655q2, new C17842e(viewState, 0)), c28655q2, 3072, 6);
            i16 = c.f69358b[viewState.getStyle().ordinal()];
            if (i16 != 1) {
                z15 = false;
                c28655q2.m87150e0(408223163);
                c28655q2.m87173q(false);
                modifierM31987f = AbstractC11895b.m31987f(1, 4, c2314t, C17919x.f69629f);
            } else if (i16 != 2) {
                z15 = false;
                c28655q2.m87150e0(408226890);
                c28655q2.m87173q(false);
                modifierM31987f = AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43989I0(), AbstractC33253j.m105489e(1 * 4), 0.0f, 4);
            } else if (i16 != 3) {
                c28655q2.m87150e0(-229655079);
                z15 = false;
                c28655q2.m87173q(false);
                modifierM31987f = null;
            } else {
                z15 = false;
                c28655q2.m87150e0(408230922);
                modifierM31987f = AbstractC11895b.m31987f(1, 4, c2314t, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery());
                c28655q2.m87173q(false);
            }
            c1100b = C1100b.f4583a;
            if (modifierM31987f == null) {
                c28655q2.m87150e0(-229591529);
                c28655q2.m87173q(z15);
                c1100b2 = c1100b;
                c2314t2 = c2314t;
                r10 = z15;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(-229591528);
                float f15 = 4;
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(5 * f15, AbstractC1099a.m3391m(c1100b.mo3400a(c2314t, C2299e.f9116y), 1 * f15, (z15 ? 1.0f : 0.0f) * f15).mo3471e(modifierM31987f));
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, z15);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3419p3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(3 * f15, c2314t);
                c2314t2 = c2314t;
                c1100b2 = c1100b;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q2, 6), null, modifierM3419p4, C17919x.f69625b, c28655q2, 3504, 0);
                C28655q c28655q6 = c28655q2;
                c28655q6.m87173q(true);
                r10 = 0;
                c28655q6.m87173q(false);
                c28655q3 = c28655q6;
            }
            if (viewState.getTag() == null) {
                c28655q3.m87150e0(-228937522);
                c28655q3.m87173q(r10);
                z16 = true;
            } else {
                c28655q3.m87150e0(-228937521);
                float f16 = 4;
                Modifier modifierM3391m2 = AbstractC1099a.m3391m(c1100b2.mo3400a(c2314t2, c2307m), 6 * f16, ((float) r10) * f16);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, r10);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM3391m2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N6);
                AbstractC25303l.m74291r(viewState.getTag(), null, null, null, c28655q3, 0, 14);
                z16 = true;
                c28655q3.m87173q(true);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(z16);
            modifier3 = modifier5;
            function3 = function6;
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c28655q = c28655q4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 3, modifier3, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m51286m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m51287n(C17845h c17845h, Function1 function1) {
        if (c17845h.getId() != null) {
            function1.invoke(new C17839b(c17845h.getId()));
        }
        Action actionM51310c = c17845h.getAction();
        if (actionM51310c != null) {
            function1.invoke(actionM51310c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0223  */
    /* JADX WARN: Code duplicated, block: B:67:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x024f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0252  */
    /* JADX WARN: Code duplicated, block: B:77:0x025e  */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m51288o(C17845h c17845h, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        float f13;
        boolean z4;
        float f14;
        int iHashCode;
        int iHashCode2;
        float f15;
        List<C17750h1> listM51313f;
        String strM51317j;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f16 = 4;
            float f17 = 8;
            float fM3403d = ((C1101c) BoxWithConstraints).m3403d() - (f16 * f17);
            int i15 = c.f69357a[c17845h.getPriceLabelSize().ordinal()];
            if (i15 == 1) {
                f13 = 0.4f;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 0.3f;
            }
            float f18 = fM3403d * f13;
            float f19 = 2;
            float f24 = f19 * f17;
            float f25 = f18 - f24;
            if (AbstractC39414r.m125890i0(AbstractC8693b.m21274h(c17845h.getPriceLabel(), c28655q, 0)) && ((strM51317j = c17845h.getPriceSubLabelMarkdown()) == null || AbstractC39414r.m125890i0(strM51317j))) {
                c28655q.m87150e0(-143847750);
                boolean z13 = !AbstractC39414r.m125890i0(AbstractC8693b.m21274h(c17845h.getPriceSubLabel(), c28655q, 0));
                c28655q.m87173q(false);
                z4 = z13;
            } else {
                c28655q.m87150e0(-164480146);
                c28655q.m87173q(false);
                z4 = true;
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f24, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                f14 = f17;
            } else {
                f14 = f17;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C2306l c2306l = C2299e.f9108K;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f24);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                f15 = 1;
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f15 * f16), null, c2306l, 0, 0, AbstractC37817c.m121344e(-1431465767, c28655q, new C17842e(c17845h, 1)), c28655q, 1575984, 53);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19 * f16, c2314t));
                String strM21274h = AbstractC8693b.m21274h(c17845h.getDescription(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                if (z4) {
                    c28655q.m87150e0(404009437);
                    m51283j(c17845h, f25, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(404118030);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                listM51313f = c17845h.m51313f();
                if (listM51313f != null || listM51313f.isEmpty()) {
                    listM51313f = null;
                }
                if (listM51313f == null) {
                    c28655q.m87150e0(-1798887366);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1798887365);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16 * f16, c2314t));
                    float f26 = f15 * f14;
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f26), AbstractC22977m.m66746i(f26), null, 0, 0, AbstractC37817c.m121344e(643337390, c28655q, new C13193b(listM51313f, 1)), c28655q, 1573296, 57);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C2306l c2306l2 = C2299e.f9108K;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f24);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            f15 = 1;
            AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f15 * f16), null, c2306l2, 0, 0, AbstractC37817c.m121344e(-1431465767, c28655q, new C17842e(c17845h, 1)), c28655q, 1575984, 53);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19 * f16, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(c17845h.getDescription(), c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            if (z4) {
                c28655q.m87150e0(404009437);
                m51283j(c17845h, f25, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(404118030);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            listM51313f = c17845h.m51313f();
            if (listM51313f != null) {
                listM51313f = null;
            } else {
                listM51313f = null;
            }
            if (listM51313f == null) {
                c28655q.m87150e0(-1798887366);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1798887365);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16 * f16, c2314t));
                float f27 = f15 * f14;
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f27), AbstractC22977m.m66746i(f27), null, 0, 0, AbstractC37817c.m121344e(643337390, c28655q, new C13193b(listM51313f, 1)), c28655q, 1573296, 57);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m51289p(C17845h c17845h, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM21274h = AbstractC8693b.m21274h(c17845h.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT3(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c17845h.getSubtitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m51290q(List list, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, 0, 6);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m51291r(Modifier modifier, C17845h c17845h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51285l(modifier, c17845h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m51292s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1208428440);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m51293t(int i13, Composer composer, int i14) {
        m51292s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m51294u(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2069966986);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m51295v(int i13, Composer composer, int i14) {
        m51294u(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final Modifier m51296w(Modifier modifier, EnumC17846i enumC17846i, C33252i c33252i, Composer composer, int i13, int i14) {
        C33252i c33252iM105489e;
        if ((i14 & 2) != 0) {
            float f13 = 4;
            c33252iM105489e = AbstractC33253j.m105489e(f13 * f13);
        } else {
            c33252iM105489e = c33252i;
        }
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3405b(modifier, 0.0f, 25 * 4, 1), 0.0f, 1 * 8, 1);
        C38072d c38072d = C38072d.f163053a;
        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3396r, c38072d.m121949b(composer, 6).getWhite5(), c33252iM105489e);
        switch (c.f69358b[enumC17846i.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(2085702846);
                Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3358c, (float) 1.5d, c38072d.m121949b(c28655q, 6).getWhite90(), c33252iM105489e);
                c28655q.m87173q(false);
                return modifierM44455h;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(2085692936);
                c28655q2.m87173q(false);
                return AbstractC1092a.m3357b(AbstractC15751g.m44456i((float) 1.5d, modifierM3358c, AbstractC15673b0.m43989I0(), c33252iM105489e), AbstractC15673b0.m43991J0(), c33252iM105489e, 0.0f, 4);
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(2085709519);
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierM3358c, (float) 1.5d, c38072d.m121949b(c28655q3, 6).getRecovery(), c33252iM105489e), C17919x.m51541c(0.15f, c38072d.m121949b(c28655q3, 6).getRecovery()), c33252iM105489e);
                c28655q3.m87173q(false);
                return modifierM3358c2;
            case 4:
            case 8:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(2085722166);
                c28655q4.m87173q(false);
                return modifierM3358c;
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(2085717263);
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierM3358c, (float) 1.5d, c38072d.m121949b(c28655q5, 6).getRecovery(), c33252iM105489e), C17919x.m51541c(0.15f, c38072d.m121949b(c28655q5, 6).getRecovery()), c33252iM105489e);
                c28655q5.m87173q(false);
                return modifierM3358c3;
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(2085675636);
                C17909s c17909s = AbstractC17911t.f69612b;
                Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC15751g.m44456i((float) 1.5d, modifierM3358c, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q6, 6).getAccentAction()), new C17919x(c38072d.m121949b(c28655q6, 6).getRecovery())), 0L, 0L, 14), c33252iM105489e), C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, c38072d.m121949b(c28655q6, 6).getAccentAction())), new C17919x(C17919x.m51541c(0.15f, c38072d.m121949b(c28655q6, 6).getRecovery()))), 0L, 0L, 14), c33252iM105489e, 0.0f, 4);
                c28655q6.m87173q(false);
                return modifierM3357b;
            case 7:
                C28655q c28655q7 = (C28655q) composer;
                c28655q7.m87150e0(2085698814);
                Modifier modifierM44455h2 = AbstractC15751g.m44455h(modifierM3358c, (float) 1.5d, c38072d.m121949b(c28655q7, 6).getWhite50(), c33252iM105489e);
                c28655q7.m87173q(false);
                return modifierM44455h2;
            default:
                throw AbstractC11895b.m32003v(2085664605, (C28655q) composer, false);
        }
    }
}
