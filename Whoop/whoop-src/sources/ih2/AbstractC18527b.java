package ih2;

import a31.C0341c;
import am2.C1018g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1935f;
import b91.C2886a;
import be1.C3172f;
import bg0.C3226h;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d42.C11698n;
import e41.C12701f;
import eh2.EnumC13196a;
import g40.C15369i3;
import ge0.C15728c;
import ge3.AbstractC15751g;
import gz0.AbstractC16319p0;
import h02.C16574h;
import hh2.C17291b;
import hh2.C17295f;
import hh2.C17296g;
import hy0.C17737e0;
import ih0.C18510t;
import ih1.C18518b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import zg2.AbstractC40633a;

/* JADX INFO: renamed from: ih2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u009f\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\rH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001e\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u0019\u001a=\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b \u0010!\u001a9\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00072\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u000eH\u0003¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u000eH\u0003¢\u0006\u0004\b(\u0010'¨\u0006)"}, m65681d2 = {"Lhh2/g;", "parentViewState", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "onInfoClicked", "Lkotlin/Function1;", "", "onStealthModeToggled", "onRefresh", "onLearnMoreClicked", "onGeneralErrorTryAgainPressed", "onToggleErrorTryAgainPressed", "Lkotlin/Function2;", "Leh2/a;", "onHiddenMetricToggled", "F", "(Lhh2/g;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/runtime/Composer;I)V", "isEnabled", "P", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onErrorTryAgainPressed", "s", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lhh2/f;", "y", "(Lhh2/f;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "onToolbarLeftClick", "N", "enabled", "H", "(ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "metricType", "B", "(Leh2/a;ZLc93/m;Landroidx/compose/runtime/Composer;I)V", "", "T", "(Leh2/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "S", "stealth-mode_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18527b {

    /* JADX INFO: renamed from: ih2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f72186w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C17291b c17291b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ih2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f72187w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f72188x;

        public b(Function1 function1, List list) {
            this.f72187w = function1;
            this.f72188x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m53747a(int i13) {
            return this.f72187w.invoke(this.f72188x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m53747a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ih2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f72189w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4351m f72190x;

        public c(List list, InterfaceC4351m interfaceC4351m) {
            this.f72189w = list;
            this.f72190x = interfaceC4351m;
        }

        /* JADX INFO: renamed from: a */
        public final void m53748a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C17291b c17291b = (C17291b) this.f72189w.get(i13);
            c28655q.m87150e0(-482889482);
            float f13 = 8;
            AbstractC15751g.m44449b(AbstractC1099a.m3398t(C2314t.f9131w, ((float) 2.5d) * f13, 0.0f, 2 * f13, 0.0f, 10), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), 1, 0.0f, c28655q, 390, 8);
            AbstractC18527b.m53701B(c17291b.getType(), c17291b.getIsEnabled(), this.f72190x, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m53748a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ih2.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72191a;

        static {
            int[] iArr = new int[EnumC13196a.values().length];
            try {
                iArr[EnumC13196a.BODY_COMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13196a.HEALTHSPAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72191a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m53700A(C17295f c17295f, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, InterfaceC4339a interfaceC4339a3, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m53744y(c17295f, interfaceC4339a, interfaceC4339a2, function1, interfaceC4339a3, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m53701B(EnumC13196a metricType, boolean z4, InterfaceC4351m onHiddenMetricToggled, Composer composer, int i13) {
        int i14;
        EnumC13196a enumC13196a;
        AbstractC22676k.m65750j(metricType, "metricType");
        AbstractC22676k.m65750j(onHiddenMetricToggled, "onHiddenMetricToggled");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1169737397);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(metricType.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onHiddenMetricToggled) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = ((float) 2.5d) * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2 * f13, 0.0f, 10);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            int i16 = i14;
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i15).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(2108000406, c28655q, new C0341c(metricType, z4, onHiddenMetricToggled, 9)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            float f15 = 4;
            AbstractC11266d.m30469w(f15, f15, c2314t, c28655q);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            enumC13196a = metricType;
            AbstractC30795n.m94707h(m53718S(enumC13196a, c28655q, i16 & 14), null, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            enumC13196a = metricType;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(enumC13196a, z4, onHiddenMetricToggled, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m53702C(EnumC13196a enumC13196a, boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM53719T = m53719T(enumC13196a, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM53719T, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87149e(enumC13196a.ordinal());
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C16574h(16, interfaceC4351m, enumC13196a);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, z4, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m53703D(InterfaceC4351m interfaceC4351m, EnumC13196a enumC13196a, boolean z4) {
        interfaceC4351m.invoke(enumC13196a, Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m53704E(EnumC13196a enumC13196a, boolean z4, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m53701B(enumC13196a, z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    public static final void m53705F(C17296g parentViewState, InterfaceC4339a onBackPressed, InterfaceC4339a onInfoClicked, Function1 onStealthModeToggled, Function1 onRefresh, InterfaceC4339a onLearnMoreClicked, InterfaceC4339a onGeneralErrorTryAgainPressed, InterfaceC4339a onToggleErrorTryAgainPressed, InterfaceC4351m onHiddenMetricToggled, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(parentViewState, "parentViewState");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(onInfoClicked, "onInfoClicked");
        AbstractC22676k.m65750j(onStealthModeToggled, "onStealthModeToggled");
        AbstractC22676k.m65750j(onRefresh, "onRefresh");
        AbstractC22676k.m65750j(onLearnMoreClicked, "onLearnMoreClicked");
        AbstractC22676k.m65750j(onGeneralErrorTryAgainPressed, "onGeneralErrorTryAgainPressed");
        AbstractC22676k.m65750j(onToggleErrorTryAgainPressed, "onToggleErrorTryAgainPressed");
        AbstractC22676k.m65750j(onHiddenMetricToggled, "onHiddenMetricToggled");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(503043847);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(parentViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onBackPressed) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onInfoClicked) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onStealthModeToggled) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onRefresh) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onLearnMoreClicked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(onGeneralErrorTryAgainPressed) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(onToggleErrorTryAgainPressed) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q.m87157i(onHiddenMetricToggled) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q.m87135U(i14 & 1, (38347923 & i14) != 38347922)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (parentViewState.getIsLoading()) {
                c28655q.m87150e0(-970248947);
                m53742w(c28655q, 0);
                c28655q.m87173q(false);
            } else if (parentViewState.getIsGeneralError()) {
                c28655q.m87150e0(-970166301);
                m53738s(onBackPressed, onGeneralErrorTryAgainPressed, c28655q, ((i14 >> 3) & 14) | ((i14 >> 15) & 112));
                c28655q.m87173q(false);
            } else {
                boolean z4 = false;
                c28655q.m87150e0(-970000575);
                C17295f c17295fM48984c = parentViewState.getStealthModeScreenViewState();
                if (c17295fM48984c == null) {
                    c28655q.m87150e0(-970000576);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-970000575);
                    if (parentViewState.getStealthModeScreenViewState().getToggleSuccess()) {
                        c28655q.m87150e0(897971309);
                        m53715P(c17295fM48984c.getIsEnabled(), onRefresh, c28655q, (i14 >> 9) & 112);
                        z4 = false;
                        c28655q.m87173q(false);
                    } else if (c17295fM48984c.getIsToggleError()) {
                        c28655q.m87150e0(898087621);
                        m53738s(onBackPressed, onToggleErrorTryAgainPressed, c28655q, ((i14 >> 3) & 14) | ((i14 >> 18) & 112));
                        z4 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(898200368);
                        m53744y(c17295fM48984c, onBackPressed, onInfoClicked, onStealthModeToggled, onLearnMoreClicked, onHiddenMetricToggled, c28655q, (i14 & 8176) | (57344 & (i14 >> 3)) | (458752 & (i14 >> 9)));
                        z4 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11698n(parentViewState, onBackPressed, onInfoClicked, onStealthModeToggled, onRefresh, onLearnMoreClicked, onGeneralErrorTryAgainPressed, onToggleErrorTryAgainPressed, onHiddenMetricToggled, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m53706G(C17296g c17296g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m53705F(c17296g, interfaceC4339a, interfaceC4339a2, function1, function2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0170  */
    /* JADX WARN: Code duplicated, block: B:54:0x0178  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0208  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    public static final void m53707H(boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z13;
        Function1 function3;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1078682928);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87155h(z4) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18510t(12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if ((i14 & 4) != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18518b(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                float f14 = ((float) 2.5d) * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2 * f13, 0.0f, 10);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                Function1 function5 = function4;
                AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i17).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-653728699, c28655q, new C12701f(z4, function4, 1)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                float f15 = 4;
                AbstractC11266d.m30469w(f15, f15, c2314t, c28655q);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC40633a.f175374d, c28655q, 0), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a2 = interfaceC4339a3;
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(z4, function3, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18510t(12);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if ((i14 & 4) != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18518b(2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f16 = 8;
            float f17 = ((float) 2.5d) * f16;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), f17, 0.0f, 2 * f16, 0.0f, 10);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            Function1 function6 = function4;
            AbstractC39330c.m125320b(0L, c38072d2.m121949b(c28655q, i18).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-653728699, c28655q, new C12701f(z4, function4, 1)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            float f18 = 4;
            AbstractC11266d.m30469w(f18, f18, c2314t2, c28655q);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f17, 0.0f, 2);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC40633a.f175374d, c28655q, 0), null, c38072d2.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a3;
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a2 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(z4, function3, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m53708I(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m53709J() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m53710K(boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21273g = AbstractC8693b.m21273g(AbstractC40633a.f175382l, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C15728c(function1, 26);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, z4, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m53711L(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m53712M(boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m53707H(z4, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public static final void m53713N(InterfaceC4339a onToolbarLeftClick, InterfaceC4339a onInfoClicked, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onToolbarLeftClick, "onToolbarLeftClick");
        AbstractC22676k.m65750j(onInfoClicked, "onInfoClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1830306602);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onToolbarLeftClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(new TextResource.C8688b(AbstractC40633a.f175381k, null, i15, 0 == true ? 1 : 0), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, AbstractC30060g.m92103Y(c28655q, AbstractC40633a.f175380j), null, null, false, null, null, null, null, null, null, null, 65490, null), null, onToolbarLeftClick, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 9) & 7168), 53);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(onToolbarLeftClick, onInfoClicked, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m53714O(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m53713N(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final void m53715P(boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1337330711);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            boolean z13 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3675b(function1, z4, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R, 3, null), textResourceM21267a, null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18526a(z4, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m53716Q(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m53717R(boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m53715P(z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final String m53718S(EnumC13196a enumC13196a, Composer composer, int i13) {
        int i14 = d.f72191a[enumC13196a.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-211157853);
            String strM21273g = AbstractC8693b.m21273g(AbstractC40633a.f175371a, c28655q, 0);
            c28655q.m87173q(false);
            return strM21273g;
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(-211159251, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-211155068);
        String strM21273g2 = AbstractC8693b.m21273g(AbstractC40633a.f175378h, c28655q2, 0);
        c28655q2.m87173q(false);
        return strM21273g2;
    }

    /* JADX INFO: renamed from: T */
    private static final String m53719T(EnumC13196a enumC13196a, Composer composer, int i13) {
        int i14 = d.f72191a[enumC13196a.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(187263673);
            String strM21273g = AbstractC8693b.m21273g(AbstractC40633a.f175372b, c28655q, 0);
            c28655q.m87173q(false);
            return strM21273g;
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(187262269, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(187266266);
        String strM21273g2 = AbstractC8693b.m21273g(AbstractC40633a.f175379i, c28655q2, 0);
        c28655q2.m87173q(false);
        return strM21273g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final void m53738s(InterfaceC4339a onBackPressed, InterfaceC4339a onErrorTryAgainPressed, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(onErrorTryAgainPressed, "onErrorTryAgainPressed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-168584859);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(onBackPressed) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onErrorTryAgainPressed) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC40633a.f175375e, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC40633a.f175377g, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC40633a.f175376f, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C15369i3(onErrorTryAgainPressed, 28);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC40633a.f175373c, objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
            boolean z13 = (i14 & 14) == 4;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15369i3(onBackPressed, 29);
                c28655q2.m87172p0(objM87133R2);
            }
            int i16 = 196608 | AbstractC33208p0.b.f138467h;
            int i17 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, true, false, c8688b3, (InterfaceC4339a) objM87133R2, null, false, false, c28655q, i16 | (i17 << 3) | (i17 << 9) | (i17 << 21), 0, 3652);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(onBackPressed, onErrorTryAgainPressed, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m53739t(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m53740u(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m53741v(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m53738s(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m53742w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1398208821);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m53743x(int i13, Composer composer, int i14) {
        m53742w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m53744y(C17295f c17295f, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, InterfaceC4339a interfaceC4339a3, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1252200974);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c17295f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
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
            m53713N(interfaceC4339a, interfaceC4339a2, c28655q, (i14 >> 3) & 126);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            m53707H(c17295f.getIsEnabled(), function1, interfaceC4339a3, c28655q, (i14 >> 6) & MessageListItemViewType.GIPHY, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(5 * f13, c2314t));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            boolean zM87157i = c28655q.m87157i(c17295f) | ((i14 & 458752) == 131072);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C16574h(17, c17295f, interfaceC4351m);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(null, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 495);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(c17295f, interfaceC4339a, interfaceC4339a2, function1, interfaceC4339a3, interfaceC4351m, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m53745z(C17295f c17295f, InterfaceC4351m interfaceC4351m, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C17291b> listM48978c = c17295f.m48978c();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM48978c.size(), null, new b(a.f72186w, listM48978c), new C37816b(new c(listM48978c, interfaceC4351m), true, 802480018));
        return C23454a0.f92919a;
    }
}
