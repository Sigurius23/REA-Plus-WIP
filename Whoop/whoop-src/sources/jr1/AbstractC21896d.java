package jr1;

import a00.C0073h;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.whoopaction.domain.models.Action;
import d11.AbstractC11471f;
import d11.C11474i;
import fr1.InterfaceC14714c;
import g11.C15218b;
import gb1.AbstractC15673b0;
import gf1.C15786e;
import gr1.C16095b;
import gr1.C16110q;
import gr1.C16112s;
import gr1.InterfaceC16107n;
import hg3.AbstractC17269i;
import hr1.AbstractC17575a;
import ig0.C18464d;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import iy0.C21026a;
import j11.AbstractC21211n;
import j11.C21214q;
import j21.C21245d;
import j41.C21313a;
import java.util.List;
import jp1.C21851c;
import jp1.C21860l;
import jp1.C21862n;
import kd1.AbstractC22392e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kr1.AbstractC22811d;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27292z;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p180h0.C16416l0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import zq1.AbstractC40986a;
import zq1.AbstractC40987b;

/* JADX INFO: renamed from: jr1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lgr1/q;", "viewState", "Lkotlin/Function1;", "Lgr1/n;", "Ll83/a0;", "onViewEvent", "Lfr1/c;", "onNavigationEvent", "x", "(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lgr1/b;", "detailsScreen", "Landroidx/compose/ui/Modifier;", "modifier", "M", "(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onClick", "t", "(Lgr1/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "isBackFromConnect", "showDisconnectDialog", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21896d {

    /* JADX INFO: renamed from: jr1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f84600w = new a();

        /* JADX INFO: renamed from: a */
        public final long m62220a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m62220a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jr1.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f84601w = new b();

        /* JADX INFO: renamed from: a */
        public final long m62221a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m62221a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jr1.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.view.IntegrationsDetailsScreenKt$IntegrationsDetailsScreen$2$1$1$1", m100430f = "IntegrationsDetailsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Landroidx/lifecycle/x;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Landroidx/lifecycle/x;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f84602E;

        /* JADX INFO: renamed from: w */
        int f84603w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16110q f84604x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f84605y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C16095b f84606z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C16110q c16110q, Function1 function1, C16095b c16095b, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f84604x = c16110q;
            this.f84605y = function1;
            this.f84606z = c16095b;
            this.f84602E = interfaceC28601c1;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, AbstractC1638x abstractC1638x, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new c(this.f84604x, this.f84605y, this.f84606z, this.f84602E, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84603w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC21896d.m62219z(this.f84602E) && !this.f84604x.getDetailsScreen().getShouldPerformFullOauth()) {
                AbstractC21896d.m62173A(this.f84602E, false);
                this.f84605y.invoke(new InterfaceC16107n.o(this.f84606z.getId()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m62173A(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m62174B(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m62175C(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m62176D(Function1 function1) {
        function1.invoke(new InterfaceC14714c.a(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Modifier m62177E(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1482240654);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m62178F(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C9598e c9598eM50040l = AbstractC17575a.m50040l(event);
        if (c9598eM50040l != null) {
            if (AbstractC22676k.m65745e(c9598eM50040l.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                c9598eM50040l = null;
            }
            if (c9598eM50040l != null) {
                function1.invoke(new InterfaceC14714c.g(c9598eM50040l));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Modifier m62179G(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1281577733);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m62180H(C16095b c16095b, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C9598e c9598eM50040l = AbstractC17575a.m50040l(event);
        if (c9598eM50040l != null) {
            if (AbstractC22676k.m65745e(c9598eM50040l.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                c9598eM50040l = null;
            }
            C9598e c9598eM23127b = c9598eM50040l;
            if (c9598eM23127b != null) {
                if (AbstractC22676k.m65745e(c9598eM23127b.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9267a3.f27473w)) {
                    c9598eM23127b = C9598e.m23127b(c9598eM23127b, null, new IntegrationsScreenModel(c16095b.getId(), (String) null, (AiAction) null, 6, (DefaultConstructorMarker) null), null, 5, null);
                } else {
                    m62173A(interfaceC28601c1, true);
                }
                function1.invoke(new InterfaceC14714c.g(c9598eM23127b));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m62181I(C16095b c16095b, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Function1 function2, InterfaceC28601c1 interfaceC28601c2) {
        if (c16095b.getConnected()) {
            function1.invoke(new InterfaceC16107n.d(c16095b.getReportingKey()));
            m62175C(interfaceC28601c1, true);
        } else {
            function1.invoke(new InterfaceC16107n.a(c16095b.getReportingKey()));
            String strM45520g = c16095b.getConnectionUrl();
            if (strM45520g != null) {
                if (c16095b.getShouldPerformFullOauth()) {
                    String strM45536w = c16095b.getProviderId();
                    if (strM45536w != null) {
                        function2.invoke(new InterfaceC14714c.h(strM45520g, strM45536w, c16095b.getId(), c16095b.getConnected()));
                    }
                } else {
                    m62173A(interfaceC28601c2, true);
                    function2.invoke(new InterfaceC14714c.b(strM45520g));
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m62182J(InterfaceC28601c1 interfaceC28601c1) {
        m62175C(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m62183K(Function1 function1, C16095b c16095b) {
        function1.invoke(new InterfaceC16107n.c(c16095b.getId(), c16095b.getReportingKey()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m62184L(C16110q c16110q, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m62217x(c16110q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static final void m62185M(C16095b c16095b, Function1 onViewEvent, Function1 onNavigationEvent, Modifier modifier, Composer composer, int i13) {
        Function1 function1;
        float f13;
        boolean z4;
        C2314t c2314t;
        int i14;
        int i15;
        Function1 function2;
        int i16;
        C28676v0 c28676v0;
        int i17;
        C2314t c2314t2;
        C16095b detailsScreen = c16095b;
        AbstractC22676k.m65750j(detailsScreen, "detailsScreen");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1952785925);
        int i18 = (i13 & 6) == 0 ? (c28655q.m87157i(detailsScreen) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i18 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i18 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i18 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i18 & 1, (i18 & 1171) != 1170)) {
            float f14 = 8;
            float f15 = 2 * f14;
            float f16 = 4;
            float f17 = f16 * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, modifier), f15, 0.0f, f15, f17, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
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
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(detailsScreen.getIcon(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            long j7 = C17919x.f69637n;
            C2314t c2314t3 = C2314t.f9131w;
            AbstractC15005f3.m43107a(abstractC26165aM64500i, null, AbstractC1102d.m3419p(f17, c2314t3), j7, c28655q, 3504, 0);
            TextResource textResourceM45539z = detailsScreen.getTitle();
            int i19 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM45539z, c28655q, i19);
            C38072d c38072d = C38072d.f163053a;
            int i24 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i24).getBrandWhite();
            C2886a c2886aM8416N = c38072d.m121952e(c28655q, i24).getT1();
            int i25 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 0, i25, 196602);
            C28655q c28655q2 = c28655q;
            if (c16095b.getConnected() || c16095b.getLastUpdated() != null) {
                c28655q2.m87150e0(621113378);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t3);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                if (c16095b.getConnected()) {
                    c28655q2.m87150e0(1101749889);
                    f13 = 1.0f;
                    AbstractC15005f3.m43107a(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC40986a.f176889a), null, null, c28655q2, AbstractC22403o.a.f87639c, 3), null, null, j7, c28655q2, 3120, 4);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(1 * f14, c2314t3));
                    z4 = false;
                    c2314t = c2314t3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16095b.getConnectedStatus(), c28655q2, i19), null, c38072d.m121949b(c28655q2, i24).getAccentPositiveTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getH6(), null, c28655q2, 0, i25, 196602);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    f13 = 1.0f;
                    z4 = false;
                    c2314t = c2314t3;
                    c28655q2.m87150e0(1102331294);
                    c28655q2.m87173q(false);
                }
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(f13, true));
                TextResource textResourceM45531r = c16095b.getLastUpdated();
                if (textResourceM45531r == null) {
                    c28655q2.m87150e0(1102424417);
                    c28655q2.m87173q(z4);
                } else {
                    c28655q2.m87150e0(1102424418);
                    C28655q c28655q3 = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM45531r, c28655q2, i19), null, c38072d.m121949b(c28655q2, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getH6(), null, c28655q3, 0, i25, 196602);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(z4);
                }
                i14 = 1;
                c28655q2.m87173q(true);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(622246397);
                c28655q2.m87173q(false);
                z4 = false;
                c2314t = c2314t3;
                i14 = 1;
            }
            float f18 = i14;
            C2314t c2314t4 = c2314t;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f18 * f14, c2314t4));
            C28655q c28655q4 = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16095b.getDescription(), c28655q2, i19), null, c38072d.m121949b(c28655q2, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getB1(), null, c28655q4, 0, i25, 196602);
            c28655q = c28655q4;
            InterfaceC25312u interfaceC25312uM45522i = c16095b.getDescriptionFootnote();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (interfaceC25312uM45522i == null) {
                c28655q.m87150e0(622520095);
                c28655q.m87173q(z4);
                function2 = onNavigationEvent;
                i15 = 256;
            } else {
                c28655q.m87150e0(622520096);
                i15 = 256;
                boolean z13 = (i18 & 896) == 256 ? true : z4;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v1) {
                    function2 = onNavigationEvent;
                    objM87133R = new C21862n(function2, 2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function2 = onNavigationEvent;
                }
                AbstractC25303l.m74291r(interfaceC25312uM45522i, null, null, (Function1) objM87133R, c28655q, 0, 6);
                c28655q.m87173q(z4);
            }
            if (c16095b.getLearnMoreButtonDestinationUrl() == null) {
                c28655q.m87150e0(622940269);
                c28655q.m87173q(z4);
                detailsScreen = c16095b;
                c28676v0 = c28676v1;
                i16 = i15;
                function1 = function2;
            } else {
                c28655q.m87150e0(622940270);
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                TextResource textResourceM45533t = c16095b.getLearnMoreButtonText();
                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t4, (-3) * f16, 0.0f, 2);
                detailsScreen = c16095b;
                boolean zM87157i = ((i18 & 896) == i15 ? true : z4) | c28655q.m87157i(detailsScreen);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v1) {
                    objM87133R2 = new C21851c(3, function2, detailsScreen);
                    c28655q.m87172p0(objM87133R2);
                }
                i16 = i15;
                c28676v0 = c28676v1;
                function1 = onNavigationEvent;
                AbstractC27265l0.m82217i(modifierM3392n, enumC27269n0, textResourceM45533t, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, (i19 << 6) | 54 | (C39274g.f168929c << 12), 0, 4072);
                c28655q = c28655q;
                c28655q.m87173q(z4);
            }
            List<InterfaceC25312u> listM45523j = detailsScreen.m45523j();
            if (listM45523j == null) {
                c28655q.m87150e0(623394977);
                c28655q.m87173q(z4);
                i17 = 32;
            } else {
                c28655q.m87150e0(623394978);
                for (InterfaceC25312u interfaceC25312u : listM45523j) {
                    boolean z14 = ((i18 & 112) == 32 ? true : z4) | ((i18 & 896) == i16 ? true : z4);
                    Object objM87133R3 = c28655q.m87133R();
                    if (z14 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C2777c(onViewEvent, 5, function1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R3, c28655q, 0, 6);
                }
                i17 = 32;
                c28655q.m87173q(z4);
            }
            C16112s c16112sM45535v = detailsScreen.getPrivacyControls();
            if (c16112sM45535v == null) {
                c28655q.m87150e0(623985155);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(623985156);
                boolean zM87157i2 = c28655q.m87157i(detailsScreen) | ((i18 & 112) == i17 ? true : z4);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C21245d(onViewEvent, detailsScreen);
                    c28655q.m87172p0(objM87133R4);
                }
                C28655q c28655q5 = c28655q;
                AbstractC22811d.m66072i(c16112sM45535v, (InterfaceC4351m) objM87133R4, null, c28655q5, TextResource.$stable, 4);
                c28655q = c28655q5;
                c28655q.m87173q(z4);
            }
            InterfaceC25312u interfaceC25312uM45514A = detailsScreen.getUpsellCtaTile();
            if (interfaceC25312uM45514A == null) {
                c28655q.m87150e0(624474025);
                c28655q.m87173q(z4);
                c2314t2 = c2314t4;
            } else {
                c28655q.m87150e0(624474026);
                c2314t2 = r3;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f17, c2314t2));
                C11474i c11474i = (C11474i) interfaceC25312uM45514A;
                boolean zM87157i3 = ((i18 & 896) == i16 ? true : z4) | c28655q.m87157i(interfaceC25312uM45514A);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87157i3 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C21214q(interfaceC25312uM45514A, function1, 10);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC11471f.m30786k(c11474i, null, null, (InterfaceC4339a) objM87133R5, c28655q, 0, 6);
                c28655q.m87173q(z4);
            }
            AbstractC25012a.m73388u(f18, f16, c2314t2, c28655q, true);
        } else {
            onViewEvent = onViewEvent;
            function1 = onNavigationEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21313a(detailsScreen, onViewEvent, function1, modifier, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m62186N(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C9598e c9598eM50040l = AbstractC17575a.m50040l(event);
        if (c9598eM50040l != null) {
            if (AbstractC22676k.m65745e(c9598eM50040l.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                c9598eM50040l = null;
            }
            if (c9598eM50040l != null) {
                function1.invoke(new InterfaceC14714c.g(c9598eM50040l));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m62187O(Function1 function1, C16095b c16095b, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC14714c.f(c16095b.getLearnMoreButtonDestinationUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m62188P(Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof Action) {
            function1.invoke(new InterfaceC16107n.l((Action) event));
        } else {
            C9598e c9598eM50040l = AbstractC17575a.m50040l(event);
            if (c9598eM50040l != null) {
                if (AbstractC22676k.m65745e(c9598eM50040l.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                    c9598eM50040l = null;
                }
                if (c9598eM50040l != null) {
                    function2.invoke(new InterfaceC14714c.g(c9598eM50040l));
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m62189Q(Function1 function1, C16095b c16095b, String type, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        function1.invoke(new InterfaceC16107n.m(c16095b.getId(), type, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m62190R(InterfaceC25312u interfaceC25312u, Function1 function1) {
        C9598e c9598eM30835x = ((C11474i) interfaceC25312u).getNavigationAction();
        if (c9598eM30835x != null) {
            function1.invoke(new InterfaceC14714c.g(c9598eM30835x));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m62191S(C16095b c16095b, Function1 function1, Function1 function2, Modifier modifier, int i13, Composer composer, int i14) {
        m62185M(c16095b, function1, function2, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m62213t(C16095b detailsScreen, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        long jM95624D;
        long jM31986e;
        C13825t c13825tM48880a;
        Object objM87133R;
        AbstractC22676k.m65750j(detailsScreen, "detailsScreen");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1797510722);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(detailsScreen) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 1 * 8, 0.0f, 0.0f, 13);
            InterfaceC25312u interfaceC25312uM45534u = detailsScreen.getOverridePrimaryButton();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (interfaceC25312uM45534u != null) {
                c28655q.m87150e0(-1548801702);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextLarge;
                TextResource textResourceM45517d = detailsScreen.getButtonText();
                if (detailsScreen.getConnected()) {
                    c28655q.m87150e0(-1959407568);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = a.f84600w;
                        c28655q.m87172p0(objM87133R);
                    }
                } else {
                    c28655q.m87150e0(-1959406574);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = b.f84601w;
                        c28655q.m87172p0(objM87133R);
                    }
                }
                InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                c28655q.m87173q(false);
                boolean z4 = (i14 & 112) == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C16416l0(onClick, 12);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM45517d, null, null, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) objM87133R2, c28655q, (TextResource.$stable << 6) | 48, 0, 4025);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1548448581);
                TextResource textResourceM45517d2 = detailsScreen.getButtonText();
                int i15 = TextResource.$stable;
                TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC8693b.m21274h(textResourceM45517d2, c28655q, i15));
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                if (detailsScreen.getConnected()) {
                    c28655q.m87150e0(1335531239);
                    jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1335532544);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                if (detailsScreen.getConnected()) {
                    c28655q.m87150e0(1335534973);
                    jM31986e = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite70();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1335535968);
                    jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(jM95624D, jM31986e, c38072d.m121949b(c28655q, i16).getWhite10(), c38072d.m121949b(c28655q, i16).getWhite20(), c28655q, 0, 0);
                if (detailsScreen.getConnected()) {
                    c28655q.m87150e0(1335542307);
                    c13825tM48880a = AbstractC17269i.m48880a(2, c38072d.m121949b(c28655q, i16).getWhite10());
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1547812121);
                    c28655q.m87173q(false);
                    c13825tM48880a = null;
                }
                C13825t c13825t = c13825tM48880a;
                boolean z13 = (i14 & 112) == 32;
                Object objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C21026a(onClick, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27292z.m82343j(modifierM3398t, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, c13825t, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (i15 << 18) | 6, 0, 7486);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(detailsScreen, onClick, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m62214u(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m62215v(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m62216w(C16095b c16095b, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m62213t(c16095b, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m62217x(C16110q c16110q, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C21895c c21895c;
        Object cVar;
        C0209i c0209i;
        C0213j c0213j;
        Modifier modifierM3396r;
        int i15;
        C28676v0 c28676v0;
        int i16;
        boolean z4;
        InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q2;
        Function1 function2;
        C16095b c16095b;
        InterfaceC28601c1 interfaceC28601c2;
        int i17;
        boolean z13;
        boolean z14;
        int i18;
        boolean z15;
        Object c0073h;
        String strM45520g;
        String strM45520g2;
        C16110q viewState = c16110q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1487501313);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(onNavigationEvent) ? 256 : 128;
        }
        int i19 = i14;
        if (c28655q3.m87135U(i19 & 1, (i19 & 147) != 146)) {
            if (viewState.getDetailsV2Screen() != null) {
                c28655q3.m87150e0(1321345346);
                AbstractC21897e.m62243o(viewState, onViewEvent, onNavigationEvent, c28655q3, i19 & 1022);
                c28655q3.m87173q(false);
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c21895c = new C21895c(viewState, onViewEvent, onNavigationEvent, i13, 0);
                }
            } else {
                c28655q3.m87150e0(1321530819);
                c28655q3.m87173q(false);
                C2307m c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
                C16095b c16095bM45633c = viewState.getDetailsScreen();
                if (c16095bM45633c == null) {
                    c28655q3.m87150e0(-1728340965);
                    c28655q3.m87173q(false);
                    c28655q = c28655q3;
                    i18 = i19;
                    z15 = true;
                } else {
                    c28655q3.m87150e0(-1728340964);
                    Object objM87133R = c28655q3.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (objM87133R == c28676v1) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                    EnumC1632v enumC1632v = EnumC1632v.ON_RESUME;
                    int i24 = i19 & 112;
                    boolean zM87157i = c28655q3.m87157i(viewState) | (i24 == 32) | c28655q3.m87157i(c16095bM45633c);
                    Object objM87133R2 = c28655q3.m87133R();
                    if (zM87157i || objM87133R2 == c28676v1) {
                        c0209i = c0209i3;
                        c0213j = c0213j2;
                        cVar = new c(viewState, onViewEvent, c16095bM45633c, interfaceC28601c3, null);
                        c28655q3.m87172p0(cVar);
                    } else {
                        c0209i = c0209i3;
                        cVar = objM87133R2;
                        c0213j = c0213j2;
                    }
                    AbstractC22392e.m64443d(enumC1632v, (Function3) cVar, c28655q3, 6);
                    Object objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v1) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
                    Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM44028b0);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC28653p1M87165m2);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, r2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
                    C0209i c0209i6 = c0209i;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(c16095bM45633c.getBackgroundImage(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168202d, 0.0f, null, c28655q3, 25008, 104);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                    int iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3407d);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m3);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, r2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
                    AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC40987b.f176893a), null, AbstractC13673n.m38561h(C38072d.f163053a), "Back button", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                    int i25 = i19 & 896;
                    boolean z16 = i25 == 256;
                    Object objM87133R4 = c28655q3.m87133R();
                    if (z16 || objM87133R4 == c28676v1) {
                        objM87133R4 = new C21860l(onNavigationEvent, 6);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    AbstractC6719b.m20143d(modifierM66723l, aVar, null, (InterfaceC4339a) objM87133R4, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 52);
                    C28655q c28655q4 = c28655q3;
                    C16095b c16095bM45633c2 = c16110q.getDetailsScreen();
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    m62185M(c16095bM45633c2, onViewEvent, onNavigationEvent, AbstractC11895b.m31988g(modifierM92116f0, true, 1.0f), c28655q4, i19 & MessageListItemViewType.GIPHY);
                    TextResource textResourceM45517d = c16095bM45633c.getButtonText();
                    int i26 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM45517d, c28655q4, i26);
                    boolean z17 = (c16095bM45633c.getFooterDisclaimer() == null && c16095bM45633c.getOverridePrimaryButton() == null && (strM21274h.length() <= 0 || (!c16095bM45633c.getConnected() && ((strM45520g2 = c16095bM45633c.getConnectionUrl()) == null || strM45520g2.length() == 0)))) ? false : true;
                    Modifier modifierM66722k = AbstractC22953f.m66722k(c2314t);
                    if (z17) {
                        float f13 = 8;
                        modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(c2314t, 0.0f, 3 * f13, 0.0f, 1 * f13, 5), ((float) 2.5d) * f13, 0.0f, 2);
                    } else {
                        modifierM3396r = c2314t;
                    }
                    Modifier modifierMo3471e = modifierM66722k.mo3471e(modifierM3396r);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                    int iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N4);
                    InterfaceC25312u interfaceC25312uM45528o = c16095bM45633c.getFooterDisclaimer();
                    if (interfaceC25312uM45528o == null) {
                        c28655q4.m87150e0(828258849);
                        z4 = false;
                        c28655q4.m87173q(false);
                        i16 = i26;
                        i15 = i25;
                        c28676v0 = c28676v1;
                    } else {
                        c28655q4.m87150e0(828258850);
                        C15786e c15786e = new C15786e(15);
                        i15 = i25;
                        boolean z18 = i15 == 256;
                        Object objM87133R5 = c28655q4.m87133R();
                        c28676v0 = c28676v1;
                        if (z18 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C21862n(onNavigationEvent, 3);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        i16 = i26;
                        AbstractC25303l.m74291r(interfaceC25312uM45528o, null, c15786e, (Function1) objM87133R5, c28655q4, 0, 2);
                        c28655q4 = c28655q4;
                        z4 = false;
                        AbstractC25012a.m73388u(1, 4, c2314t, c28655q4, false);
                    }
                    InterfaceC25312u interfaceC25312uM45534u = c16095bM45633c.getOverridePrimaryButton();
                    if (interfaceC25312uM45534u == null) {
                        c28655q4.m87150e0(828982885);
                        c28655q4.m87173q(z4);
                        c28655q2 = c28655q4;
                        interfaceC28601c1 = interfaceC28601c3;
                    } else {
                        c28655q4.m87150e0(828982886);
                        C15786e c15786e2 = new C15786e(16);
                        boolean zM87157i2 = c28655q4.m87157i(c16095bM45633c) | (i15 == 256);
                        Object objM87133R6 = c28655q4.m87133R();
                        if (zM87157i2 || objM87133R6 == c28676v0) {
                            interfaceC28601c1 = interfaceC28601c3;
                            objM87133R6 = new C18468h(c16095bM45633c, onNavigationEvent, interfaceC28601c1, 26);
                            c28655q4.m87172p0(objM87133R6);
                        } else {
                            interfaceC28601c1 = interfaceC28601c3;
                        }
                        Function1 function3 = (Function1) objM87133R6;
                        C28655q c28655q5 = c28655q4;
                        AbstractC25303l.m74291r(interfaceC25312uM45534u, null, c15786e2, function3, c28655q5, 0, 2);
                        c28655q2 = c28655q5;
                        c28655q2.m87173q(false);
                    }
                    if (strM21274h.length() <= 0 || (!c16095bM45633c.getConnected() && ((strM45520g = c16095bM45633c.getConnectionUrl()) == null || strM45520g.length() == 0))) {
                        function2 = onViewEvent;
                        c16095b = c16095bM45633c;
                        interfaceC28601c2 = interfaceC28601c4;
                        i17 = i24;
                        z13 = false;
                        c28655q2.m87150e0(831700408);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(830382877);
                        C16095b c16095bM45633c3 = c16110q.getDetailsScreen();
                        i17 = i24;
                        boolean zM87157i3 = (i15 == 256) | c28655q2.m87157i(c16095bM45633c) | (i17 == 32);
                        Object objM87133R7 = c28655q2.m87133R();
                        if (zM87157i3 || objM87133R7 == c28676v0) {
                            c0073h = new C0073h(c16095bM45633c, onViewEvent, interfaceC28601c4, onNavigationEvent, interfaceC28601c1, 11);
                            c16095b = c16095bM45633c;
                            function2 = onViewEvent;
                            interfaceC28601c2 = interfaceC28601c4;
                            c28655q2.m87172p0(c0073h);
                        } else {
                            c0073h = objM87133R7;
                            c16095b = c16095bM45633c;
                            interfaceC28601c2 = interfaceC28601c4;
                            function2 = onViewEvent;
                        }
                        z13 = false;
                        m62213t(c16095bM45633c3, (InterfaceC4339a) c0073h, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    if (m62174B(interfaceC28601c2)) {
                        c28655q2.m87150e0(-932089442);
                        TextResource textResourceM45527n = c16095b.getDisconnectPopupTitle();
                        TextResource textResourceM45524k = c16095b.getDisconnectPopupDescription();
                        boolean z19 = z13;
                        TextResource textResourceM45525l = c16095b.getDisconnectPopupPrimaryButtonText();
                        TextResource textResourceM45526m = c16095b.getDisconnectPopupSecondaryButtonText();
                        Object objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C15218b(25, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R8;
                        boolean zM87157i4 = (i17 == 32 ? true : z19) | c28655q2.m87157i(c16095b);
                        Object objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4 || objM87133R9 == c28676v0) {
                            objM87133R9 = new C21214q(11, function2, c16095b);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        C28655q c28655q6 = c28655q2;
                        i18 = i19;
                        z14 = z19;
                        AbstractC21211n.m59497o(null, textResourceM45527n, textResourceM45524k, textResourceM45525l, false, null, null, null, null, textResourceM45526m, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q6, (i16 << 3) | (i16 << 6) | (i16 << 9) | (i16 << 27), 0, 384, 247463409);
                        c28655q = c28655q6;
                        c28655q.m87173q(z14);
                    } else {
                        z14 = z13;
                        c28655q = c28655q2;
                        i18 = i19;
                        c28655q.m87150e0(-931481532);
                        c28655q.m87173q(z14);
                    }
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(z14);
                }
                viewState = c16110q;
                function1 = onViewEvent;
                AbstractC21894b.m62170c(viewState, function1, c28655q, i18 & 126);
                c28655q.m87173q(z15);
            }
            c28677v1M87180u.f115982d = c21895c;
        }
        function1 = onViewEvent;
        c28655q = c28655q3;
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c21895c = new C21895c(viewState, function1, onNavigationEvent, i13, 1);
            c28677v1M87180u.f115982d = c21895c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m62218y(C16110q c16110q, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m62217x(c16110q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final boolean m62219z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }
}
