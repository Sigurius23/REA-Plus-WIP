package f01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.room.AbstractC1772c1;
import b61.AbstractC2756k;
import b91.C2886a;
import bm0.C3412o;
import c13.AbstractC3855a;
import c51.AbstractC4234k;
import c51.C4242s;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.edit.C9790n;
import d30.C11546l;
import d62.C11736b;
import dp0.C12253i;
import e11.C12582b;
import e61.C12769l;
import ev2.C13693b;
import fy1.C14873i;
import gz0.EnumC16313m0;
import hy0.AbstractC17808z1;
import hy0.C17723a2;
import hy0.C17731c2;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23459e;
import m83.C25235a0;
import o61.C27607f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15005f3;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import v31.C35605a;
import v31.C35611g;
import v31.EnumC35606b;
import v31.EnumC35612h;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: f01.n0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a#\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u001c\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lf01/o0;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "q", "(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "l", "(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V", "A", "Lf01/p0;", "footer", "n", "(Landroidx/compose/ui/Modifier;Lf01/p0;Landroidx/compose/runtime/Composer;II)V", "", "Lm91/u;", "subItems", "y", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Lk2/e;", "Li2/x;", "color", "Ly3/f;", "width", "height", "C", "(Lk2/e;JFF)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/runtime/Composer;I)V", "", "a", "F", "rightContentWeightPercent", "Lh2/c;", "b", "Lh2/c;", "D", "()Lh2/c;", "graphDescriptionCardInset", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13882n0 {

    /* JADX INFO: renamed from: a */
    private static final float f49500a = 0.6f;

    /* JADX INFO: renamed from: b */
    private static final C16618c f49501b = new C16618c(0.0f, 0.04f, 0.02f, 0.04f);

    /* JADX INFO: renamed from: f01.n0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m39443a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(2030585138);
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
            C27607f c27607f = C27607f.f111109a;
            C13885o0 c13885o0M39452b = C13885o0.m39452b(c27607f.m83363e(), null, null, null, null, null, null, null, null, new C17750h1(AbstractC8693b.m21278l("BETA V1.0"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), null, 767, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = b.f49502w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC13882n0.m39433q(null, c13885o0M39452b, (Function1) objM87133R, c28655q, 384, 1);
            C13885o0 c13885o0M83360b = c27607f.m83360b();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = c.f49503w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC13882n0.m39433q(null, c13885o0M83360b, (Function1) objM87133R2, c28655q, 384, 1);
            C13885o0 c13885o0M83362d = c27607f.m83362d();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = d.f49504w;
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC13882n0.m39433q(null, c13885o0M83362d, (Function1) objM87133R3, c28655q, 384, 1);
            C13885o0 c13885o0M39452b2 = C13885o0.m39452b(c27607f.m83361c(), null, null, null, null, null, null, null, null, null, AbstractC37056f.m118958J(new C35611g(AbstractC8693b.m21278l("Wear WHOOP to sleep for 4 nights to fully calibrate your Recovery Score."), new C35605a(EnumC35606b.DISCRETE, 7, 5, null), null, EnumC35612h.ONBOARDING)), FrameMetricsAggregator.EVERY_DURATION, null);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = e.f49505w;
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC13882n0.m39433q(null, c13885o0M39452b2, (Function1) objM87133R4, c28655q, 384, 1);
            C13885o0 c13885o0M83364f = c27607f.m83364f();
            C13888p0 footer = c27607f.m83364f().getFooter();
            C13885o0 c13885o0M39452b3 = C13885o0.m39452b(c13885o0M83364f, null, null, null, null, null, null, footer != null ? C13888p0.m39487b(footer, null, null, null, true, 7, null) : null, null, null, null, 959, null);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = f.f49506w;
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC13882n0.m39433q(null, c13885o0M39452b3, (Function1) objM87133R5, c28655q, 384, 1);
            C13885o0 c13885o0M83365g = c27607f.m83365g();
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = g.f49507w;
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC13882n0.m39433q(null, c13885o0M83365g, (Function1) objM87133R6, c28655q, 384, 1);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m39443a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f49502w = new b();

        /* JADX INFO: renamed from: a */
        public final void m39444a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m39444a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f49503w = new c();

        /* JADX INFO: renamed from: a */
        public final void m39445a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m39445a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n0$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f49504w = new d();

        /* JADX INFO: renamed from: a */
        public final void m39446a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m39446a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n0$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f49505w = new e();

        /* JADX INFO: renamed from: a */
        public final void m39447a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m39447a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n0$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f49506w = new f();

        /* JADX INFO: renamed from: a */
        public final void m39448a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m39448a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n0$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f49507w = new g();

        /* JADX INFO: renamed from: a */
        public final void m39449a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m39449a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m39413A(Modifier modifier, C13885o0 c13885o0, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C13885o0 c13885o1;
        Modifier modifier3;
        boolean z4;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1331751411);
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
            c13885o1 = c13885o0;
            i15 |= c28655q.m87157i(c13885o1) ? 32 : 16;
        } else {
            c13885o1 = c13885o0;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            String strM21274h = AbstractC8693b.m21274h(c13885o1.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            InterfaceC25312u navigationTag = c13885o0.getNavigationTag();
            if (navigationTag == null) {
                c28655q.m87150e0(956514329);
                z4 = false;
                c28655q.m87173q(false);
            } else {
                z4 = false;
                c28655q.m87150e0(956514330);
                AbstractC25303l.m74291r(navigationTag, null, null, null, c28655q, 0, 14);
                c28655q.m87173q(false);
            }
            EnumC16313m0 endIcon = c13885o0.getEndIcon();
            if (endIcon == null) {
                c28655q.m87150e0(956600788);
                c28655q.m87173q(z4);
                z13 = true;
            } else {
                c28655q.m87150e0(956600789);
                z13 = true;
                float f13 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(endIcon.toWhoopIcon(), c28655q, 6), null, AbstractC34132o.m107879c(0.5f, AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3398t(c2314t, 1 * 8, 0.0f, 0.0f, 0.0f, 14))), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                c28655q = c28655q;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z13);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13879m0(modifier3, c13885o0, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m39414B(Modifier modifier, C13885o0 c13885o0, int i13, int i14, Composer composer, int i15) {
        m39413A(modifier, c13885o0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m39415C(InterfaceC22131e drawTriangle, long j7, float f13, float f14) {
        AbstractC22676k.m65750j(drawTriangle, "$this$drawTriangle");
        float f15 = 2;
        float fMo743q0 = drawTriangle.mo743q0(f13) / f15;
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        c17891jM51478a.m51462i(Float.intBitsToFloat((int) (drawTriangle.mo731d() >> 32)) / f15, 0.0f);
        c17891jM51478a.m51461h((Float.intBitsToFloat((int) (drawTriangle.mo731d() >> 32)) / f15) - fMo743q0, drawTriangle.mo743q0(f14));
        c17891jM51478a.m51461h((Float.intBitsToFloat((int) (drawTriangle.mo731d() >> 32)) / f15) + fMo743q0, drawTriangle.mo743q0(f14));
        c17891jM51478a.m51459f();
        InterfaceC22131e.m63386z(drawTriangle, c17891jM51478a, j7, 0.0f, null, 60);
        InterfaceC22131e.m63386z(drawTriangle, c17891jM51478a, j7, 0.0f, new C22135i(0.5f, 0.0f, 0, 0, null, 30), 52);
    }

    /* JADX INFO: renamed from: D */
    public static final C16618c m39416D() {
        return f49501b;
    }

    /* JADX INFO: renamed from: l */
    private static final void m39428l(Modifier modifier, C13885o0 c13885o0, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C13885o0 c13885o1;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(736934492);
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
            c13885o1 = c13885o0;
            i15 |= c28655q.m87157i(c13885o1) ? 32 : 16;
        } else {
            c13885o1 = c13885o0;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
            String strM21274h = AbstractC8693b.m21274h(c13885o1.getBody().getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 3120, 186362);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C39111m c39111m = AbstractC39083d.f168140a;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13885o0.getBody().getMagnitude(), c28655q, 0), new WithAlignmentLineElement(c39111m), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 3120, 186360);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13885o0.getBody().getMagnitudeSuffix(), c28655q, 0), new WithAlignmentLineElement(c39111m), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 3120, 186360);
            c28655q = c28655q;
            c28655q.m87173q(true);
            C17731c2 c17731c2M39335f = c13885o0.getBody().getTrend();
            if (c17731c2M39335f == null) {
                c28655q.m87150e0(-2117978441);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2117978440);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(6, c2314t));
                AbstractC17808z1.m51175c(c17731c2M39335f, c28655q, C9598e.f28134d);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13879m0(modifier3, c13885o0, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m39429m(Modifier modifier, C13885o0 c13885o0, int i13, int i14, Composer composer, int i15) {
        m39428l(modifier, c13885o0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0203  */
    /* JADX WARN: Code duplicated, block: B:79:0x022e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0232  */
    /* JADX WARN: Code duplicated, block: B:85:0x024d  */
    /* JADX WARN: Code duplicated, block: B:88:0x025d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0266  */
    /* JADX WARN: Code duplicated, block: B:91:0x026c  */
    /* JADX WARN: Code duplicated, block: B:92:0x027d  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    private static final void m39430n(Modifier modifier, C13888p0 c13888p0, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C17723a2 c17723a2;
        C0209i c0209i;
        int i16;
        int i17;
        float f13;
        float f14;
        float f15;
        C2307m c2307m;
        int iHashCode;
        int iHashCode2;
        EnumC16313m0 enumC16313m0M50803f;
        Integer numM50727f;
        int iHashCode3;
        int i18;
        boolean z4;
        int i19;
        Modifier modifier4;
        int iHashCode4;
        boolean zM87151f;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1359492940);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c13888p0) : c28655q.m87157i(c13888p0) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier5 = i24 != 0 ? c2314t : modifier2;
            if (c13888p0 == null) {
                c28655q.m87150e0(-887222782);
                c28655q.m87173q(false);
                modifier4 = modifier5;
            } else {
                c28655q.m87150e0(-887222781);
                C17723a2 c17723a2M51179g = AbstractC17808z1.m51179g(c13888p0.getTrend().getTrendTypeState(), c28655q, 0);
                float f16 = 12;
                float f17 = 6;
                C38072d c38072d = C38072d.f163053a;
                long jM125414q = c38072d.m121949b(c28655q, 6).getBlack20();
                if (c13888p0.getShowPicker()) {
                    c28655q.m87150e0(1686223481);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1686157172);
                    AbstractC31061c.m95650z(2, 8, c2314t, c28655q, false);
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c17723a2 = c17723a2M51179g;
                } else {
                    c17723a2 = c17723a2M51179g;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    }
                    c0209i = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                    if (c13888p0.getShowPicker()) {
                        c28655q.m87150e0(1941971625);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                        Modifier modifierM3421r = AbstractC1102d.m3421r(c2314t, f16, f17);
                        zM87151f = c28655q.m87151f(jM125414q);
                        objM87133R = c28655q.m87133R();
                        if (zM87151f || objM87133R == C28635l.f115821a) {
                            objM87133R = new C12769l(jM125414q, f16, f17, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        i16 = 6;
                        AbstractC21478l0.m60421a(modifierM3421r, (Function1) objM87133R, c28655q, 6);
                        i17 = 4;
                        AbstractC18489d0.m53381v(22, 4, c2314t, c28655q, true);
                        c28655q.m87173q(false);
                    } else {
                        i16 = 6;
                        i17 = 4;
                        c28655q.m87150e0(1942469423);
                        c28655q.m87173q(false);
                    }
                    f13 = i17;
                    f14 = 2 * f13;
                    Modifier modifier6 = modifier5;
                    f15 = 1;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f15, AbstractC1092a.m3358c(modifier6, c38072d.m121949b(c28655q, i16).getBlack20(), AbstractC33253j.m105489e(f14)));
                    c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
                    enumC16313m0M50803f = c13888p0.getTrend().getIcon();
                    if (enumC16313m0M50803f != null) {
                        numM50727f = Integer.valueOf(enumC16313m0M50803f.toWhoopIcon());
                    } else {
                        numM50727f = c17723a2.getIconResource();
                    }
                    if (numM50727f == null) {
                        c28655q.m87150e0(-1054869255);
                        c28655q.m87173q(false);
                        i19 = 0;
                        i18 = 6;
                        z4 = true;
                    } else {
                        c28655q.m87150e0(-1054869254);
                        int iIntValue = numM50727f.intValue();
                        Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1102d.m3419p(f13 * f13, c2314t), f15, f13, c17723a2.getBackgroundColor());
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM95629e);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N5);
                        i18 = 6;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue, c28655q, 6), null, C1100b.f4583a.mo3400a(AbstractC34132o.m107879c(0.5f, AbstractC1102d.m3419p(f14, c2314t)), c2307m), c17723a2.getIconColor(), c28655q, 48, 0);
                        z4 = true;
                        c28655q.m87173q(true);
                        i19 = 0;
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(3 * f13, c2314t));
                    String strM21274h = AbstractC8693b.m21274h(c13888p0.getStartTitle(), c28655q, i19);
                    long jM50731j = c17723a2.getTextColor();
                    C2886a c2886aM8422c = r33.m121952e(c28655q, i18).getB3();
                    modifier4 = modifier6;
                    boolean z13 = i19;
                    AbstractC30795n.m94707h(strM21274h, null, jM50731j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q, 0, 0, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13888p0.getEndTitle(), c28655q, z13 ? 1 : 0), null, r33.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    AbstractC2875y.m8286B(c28655q, true, true, true, z13);
                }
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (c13888p0.getShowPicker()) {
                    c28655q.m87150e0(1941971625);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N6);
                    Modifier modifierM3421r2 = AbstractC1102d.m3421r(c2314t, f16, f17);
                    zM87151f = c28655q.m87151f(jM125414q);
                    objM87133R = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R = new C12769l(jM125414q, f16, f17, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12769l(jM125414q, f16, f17, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    i16 = 6;
                    AbstractC21478l0.m60421a(modifierM3421r2, (Function1) objM87133R, c28655q, 6);
                    i17 = 4;
                    AbstractC18489d0.m53381v(22, 4, c2314t, c28655q, true);
                    c28655q.m87173q(false);
                } else {
                    i16 = 6;
                    i17 = 4;
                    c28655q.m87150e0(1942469423);
                    c28655q.m87173q(false);
                }
                f13 = i17;
                f14 = 2 * f13;
                Modifier modifier7 = modifier5;
                f15 = 1;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(8 * f15, AbstractC1092a.m3358c(modifier7, c38072d.m121949b(c28655q, i16).getBlack20(), AbstractC33253j.m105489e(f14)));
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N7);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N8);
                enumC16313m0M50803f = c13888p0.getTrend().getIcon();
                if (enumC16313m0M50803f != null) {
                    numM50727f = Integer.valueOf(enumC16313m0M50803f.toWhoopIcon());
                } else {
                    numM50727f = c17723a2.getIconResource();
                }
                if (numM50727f == null) {
                    c28655q.m87150e0(-1054869255);
                    c28655q.m87173q(false);
                    i19 = 0;
                    i18 = 6;
                    z4 = true;
                } else {
                    c28655q.m87150e0(-1054869254);
                    int iIntValue2 = numM50727f.intValue();
                    Modifier modifierM95629e2 = AbstractC31061c.m95629e(AbstractC1102d.m3419p(f13 * f13, c2314t), f15, f13, c17723a2.getBackgroundColor());
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM95629e2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N9);
                    i18 = 6;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue2, c28655q, 6), null, C1100b.f4583a.mo3400a(AbstractC34132o.m107879c(0.5f, AbstractC1102d.m3419p(f14, c2314t)), c2307m), c17723a2.getIconColor(), c28655q, 48, 0);
                    z4 = true;
                    c28655q.m87173q(true);
                    i19 = 0;
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(3 * f13, c2314t));
                String strM21274h2 = AbstractC8693b.m21274h(c13888p0.getStartTitle(), c28655q, i19);
                long jM50731j2 = c17723a2.getTextColor();
                C2886a c2886aM8422c2 = r33.m121952e(c28655q, i18).getB3();
                modifier4 = modifier7;
                boolean z14 = i19;
                AbstractC30795n.m94707h(strM21274h2, null, jM50731j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c2, null, c28655q, 0, 0, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13888p0.getEndTitle(), c28655q, z14 ? 1 : 0), null, r33.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                AbstractC2875y.m8286B(c28655q, true, true, true, z14);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, c13888p0, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m39431o(long j7, float f13, float f14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        m39415C(Canvas, j7, f13, f14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m39432p(Modifier modifier, C13888p0 c13888p0, int i13, int i14, Composer composer, int i15) {
        m39430n(modifier, c13888p0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m39433q(Modifier modifier, C13885o0 viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1616761176);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            boolean zM87157i = c28655q2.m87157i(viewState) | ((i15 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11546l(26, viewState, onViewEvent);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1136a.m3599a(AbstractC1772c1.m5391i(modifier3, false, null, (InterfaceC4339a) objM87133R, 3), "GraphDescriptionCard"), null, 0L, AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-516645656, c28655q2, new C13857f(2, viewState, onViewEvent)), c28655q, 12582912, 118);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 25, (Object) modifier2, (Object) viewState, (InterfaceC23459e) onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m39434r(C13885o0 c13885o0, Function1 function1) {
        C9598e destination = c13885o0.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m39435s(C13885o0 c13885o0, Function1 function1, Composer composer, int i13) {
        float f13;
        int i14;
        C2314t c2314t;
        boolean z4;
        boolean z13;
        boolean z14;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 8;
            float f15 = 2 * f14;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, f15, f15, 0.0f, f15, 4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            m39413A(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f15, 0.0f, 11), c13885o0, c28655q, 6, 0);
            C13888p0 footer = c13885o0.getFooter();
            if (footer == null || !footer.getShowPicker()) {
                AbstractC31061c.m95623C(c28655q, 2009443863, c2314t2, f15, c28655q);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2009517860);
                c28655q.m87173q(false);
            }
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f16 = 1;
            float f17 = f49500a;
            C23000t1 c23000t1 = C23000t1.f90727a;
            m39428l(c23000t1.mo66772c(c2314t2, true, f16 - f17), c13885o0, c28655q, 0, 0);
            if (c13885o0.getRightItem() != null) {
                c28655q.m87150e0(-1590176743);
                Modifier modifierMo66772c = c23000t1.mo66772c(c2314t2, true, f17);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                if (c13885o0.getRightItem() instanceof C4242s) {
                    c28655q.m87150e0(2121795324);
                    i14 = 6;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, f15, f16 * f14, 0.0f, 9);
                    f13 = f15;
                    C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                    AbstractC4234k.m13178q(AbstractC1127a.m3488c(modifierM3398t2, 0.0f, 0.0f, 0.0f, -((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(42), -((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(20), 0.0f, null, null, 0, 524263), null, AbstractC34132o.m107879c(0.0f, c2314t2), AbstractC12350b.m34565N(2.0f, c2314t2), AbstractC34132o.m107879c(0.0f, c2314t2), null, (C4242s) c13885o0.getRightItem(), c28655q, 28032, 34);
                    z14 = false;
                    c28655q.m87173q(false);
                    z13 = true;
                } else {
                    f13 = f15;
                    i14 = 6;
                    c28655q.m87150e0(2122670268);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(4, c2314t2);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    AbstractC25303l.m74291r(c13885o0.getRightItem(), null, null, null, c28655q, 0, 14);
                    z13 = true;
                    c28655q.m87173q(true);
                    z14 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z14);
                z4 = z13;
                c2314t = c2314t2;
            } else {
                f13 = f15;
                i14 = 6;
                c28655q.m87150e0(-1588686728);
                Modifier modifierM3488c = AbstractC1127a.m3488c(c23000t1.mo66772c(c2314t2, true, f17), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C13693b(20);
                    c28655q.m87172p0(objM87133R);
                }
                c2314t = c2314t2;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1136a.m3599a(c23000t1.mo66772c(AbstractC1099a.m3384f(AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R), false, 2.0f), true, 2.0f), "GraphDescriptionCardGraph"), 0.0f, 0.0f, f13, 0.0f, 11);
                C21395c graph = c13885o0.getGraph();
                boolean zM87157i = c28655q.m87157i(c13885o0) | c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C9790n(25, c13885o0, function1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC2756k.m7799p(modifierM3398t3, graph, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 60);
                c28655q.m87173q(false);
                z4 = true;
            }
            c28655q.m87173q(z4);
            m39430n(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11), c13885o0.getFooter(), c28655q, i14 | (C9598e.f28134d << 3), 0);
            m39441y(c13885o0.m39462l(), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m39436t(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C23465k[] c23465kArr = {new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m)), new C23465k(Float.valueOf(0.3f), new C17919x(C17919x.f69625b))};
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51484b(AbstractC17911t.f69612b, (C23465k[]) Arrays.copyOf(c23465kArr, 2)), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m39437u(C13885o0 c13885o0, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e destination = c13885o0.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m39438v(Modifier modifier, C13885o0 c13885o0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m39433q(modifier, c13885o0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m39439w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-141337738);
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
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m39440x(int i13, Composer composer, int i14) {
        m39439w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m39441y(List<? extends InterfaceC25312u> list, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1203729353);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (list == null) {
            c28655q.m87150e0(1619273088);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1619273089);
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, f13, f13, 0.0f, 9);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            c28655q.m87150e0(234524719);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, null, c28655q, 0, 14);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m39442z(List list, int i13, Composer composer, int i14) {
        m39441y(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
