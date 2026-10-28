package jr1;

import a23.C0176c;
import am2.C1008b;
import am2.C1012d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1909c;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import be1.C3172f;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import fr1.InterfaceC14714c;
import g11.C15218b;
import gb1.AbstractC15673b0;
import gr1.C16094a;
import gr1.C16096c;
import gr1.C16110q;
import gr1.InterfaceC16107n;
import hr1.AbstractC17575a;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import j11.AbstractC21211n;
import jp1.C21860l;
import jp1.C21862n;
import kd1.AbstractC22392e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kr1.AbstractC22810c;
import kr1.InterfaceC22808a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p133f1.C13921a0;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
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
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import zq1.AbstractC40987b;

/* JADX INFO: renamed from: jr1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001ai\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aa\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aq\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lgr1/q;", "viewState", "Lkotlin/Function1;", "Lgr1/n;", "Ll83/a0;", "onViewEvent", "Lfr1/c;", "onNavigationEvent", "o", "(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lgr1/c;", "detailsScreen", "Lkotlin/Function0;", "onConnectStarted", "Lgr1/a;", "onDisconnectRequested", "Landroidx/compose/ui/Modifier;", "modifier", "z", "(Lgr1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "l", "(Lgr1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkr1/a;", "action", "section", "F", "(Lkr1/a;Lgr1/c;Lgr1/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;)V", "", "isBackFromConnect", "pendingDisconnectSection", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21897e {

    /* JADX INFO: renamed from: jr1.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.view.IntegrationsDetailsV2ScreenKt$IntegrationsDetailsV2Screen$1$1$1$1", m100430f = "IntegrationsDetailsV2Screen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Landroidx/lifecycle/x;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Landroidx/lifecycle/x;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f84607w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f84608x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16096c f84609y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f84610z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C16096c c16096c, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f84608x = function1;
            this.f84609y = c16096c;
            this.f84610z = interfaceC28601c1;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, AbstractC1638x abstractC1638x, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new a(this.f84608x, this.f84609y, this.f84610z, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84607w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC21897e.m62244p(this.f84610z)) {
                AbstractC21897e.m62245q(this.f84610z, false);
                this.f84608x.invoke(new InterfaceC16107n.o(this.f84609y.getId()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m62223A(Function1 function1, Object event) {
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
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m62224B(Function1 function1, String str, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC14714c.f(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m62225C(C16096c c16096c, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, Modifier modifier, int i13, Composer composer, int i14) {
        m62254z(c16096c, function1, function2, interfaceC4339a, function3, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m62228F(InterfaceC22808a interfaceC22808a, C16096c c16096c, C16094a c16094a, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3) {
        if (interfaceC22808a instanceof InterfaceC22808a.b) {
            function1.invoke(new InterfaceC16107n.d(c16096c.getReportingKey()));
            function3.invoke(c16094a);
            return;
        }
        if (!(interfaceC22808a instanceof InterfaceC22808a.a)) {
            if (!(interfaceC22808a instanceof InterfaceC22808a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(new InterfaceC16107n.a(c16096c.getReportingKey()));
            interfaceC4339a.invoke();
            function2.invoke(new InterfaceC14714c.c(((InterfaceC22808a.c) interfaceC22808a).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()));
            return;
        }
        function1.invoke(new InterfaceC16107n.a(c16096c.getReportingKey()));
        if (c16096c.getProviderId() != null) {
            function2.invoke(new InterfaceC14714c.h(((InterfaceC22808a.a) interfaceC22808a).getConnectionUrl(), c16096c.getProviderId(), c16096c.getId(), false, 8, null));
        } else {
            interfaceC4339a.invoke();
            function2.invoke(new InterfaceC14714c.b(((InterfaceC22808a.a) interfaceC22808a).getConnectionUrl()));
        }
    }

    /* JADX INFO: renamed from: l */
    private static final void m62240l(C16096c c16096c, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, Composer composer, int i13) {
        Function1 function4;
        C28655q c28655q;
        C28655q c28655q2;
        boolean z4;
        int i14;
        Object c1008b;
        int i15;
        C16094a c16094a;
        boolean z13;
        C16096c c16096c2 = c16096c;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(911840564);
        int i16 = (i13 & 6) == 0 ? (c28655q3.m87157i(c16096c2) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            function4 = function1;
            i16 |= c28655q3.m87157i(function4) ? 32 : 16;
        } else {
            function4 = function1;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q3.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q3.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        char c3 = 16384;
        if ((i13 & 24576) == 0) {
            i16 |= c28655q3.m87157i(function3) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        boolean z14 = true;
        boolean z15 = false;
        if (c28655q3.m87135U(i16 & 1, (i16 & 9363) != 9362)) {
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 1 * f13, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
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
            c28655q3.m87150e0(-1101170086);
            int i17 = 0;
            for (Object obj : c16096c2.m45541b()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C16094a c16094a2 = (C16094a) obj;
                if (i17 == 0) {
                    c28655q3.m87150e0(-1333896358);
                    C28655q c28655q4 = c28655q3;
                    z4 = z14;
                    i14 = 2048;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q4, 0, 255);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(z15);
                } else {
                    c28655q2 = c28655q3;
                    z4 = z14;
                    i14 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q2.m87150e0(-1333852152);
                    c28655q2.m87173q(z15);
                }
                boolean zM87157i = c28655q2.m87157i(c16096c2) | c28655q2.m87157i(c16094a2) | ((i16 & 112) == 32 ? z4 : z15) | ((i16 & 896) == 256 ? z4 : z15) | ((i16 & 7168) == i14 ? z4 : z15) | ((57344 & i16) == 16384 ? z4 : z15);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    i15 = i16;
                    c16094a = c16094a2;
                    c1008b = new C1008b(c16096c2, c16094a, function4, function2, interfaceC4339a, function3, 13);
                    c28655q2.m87172p0(c1008b);
                } else {
                    i15 = i16;
                    c16094a = c16094a2;
                    c1008b = objM87133R;
                }
                AbstractC22810c.m66055f(c16094a, (Function1) c1008b, null, c28655q2, 0, 4);
                if (i17 != AbstractC37056f.m118951C(c16096c.m45541b())) {
                    c28655q2.m87150e0(-1333189062);
                    C28655q c28655q5 = c28655q2;
                    z13 = z15;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q5, 0, 255);
                    c28655q2 = c28655q5;
                    c28655q2.m87173q(z13);
                } else {
                    z13 = z15;
                    c28655q2.m87150e0(-1333144856);
                    c28655q2.m87173q(z13);
                }
                c16096c2 = c16096c;
                function4 = function1;
                z15 = z13;
                z14 = z4;
                c28655q3 = c28655q2;
                i16 = i15;
                i17 = i18;
                c3 = 16384;
            }
            c28655q = c28655q3;
            c28655q.m87173q(z15);
            c28655q.m87173q(z14);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) c16096c, (Object) function1, (Object) function2, (Object) interfaceC4339a, (Object) function3, i13, 19, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m62241m(C16096c c16096c, C16094a c16094a, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC22808a action) {
        AbstractC22676k.m65750j(action, "action");
        m62228F(action, c16096c, c16094a, function1, function2, interfaceC4339a, function3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m62242n(C16096c c16096c, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, int i13, Composer composer, int i14) {
        m62240l(c16096c, function1, function2, interfaceC4339a, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m62243o(C16110q viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C16110q c16110q;
        Function1 function2;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z4;
        int i15;
        boolean z13;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1181818375);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C16096c c16096cM45634d = viewState.getDetailsV2Screen();
            if (c16096cM45634d == null) {
                c28655q.m87150e0(-183082996);
                c28655q.m87173q(false);
                function1 = onViewEvent;
                i15 = i14;
                z4 = true;
            } else {
                c28655q.m87150e0(-183082995);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
                EnumC1632v enumC1632v = EnumC1632v.ON_RESUME;
                int i16 = i14 & 112;
                boolean zM87157i = (i16 == 32) | c28655q.m87157i(c16096cM45634d);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(onViewEvent, c16096cM45634d, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22392e.m64443d(enumC1632v, (Function3) objM87133R2, c28655q, 6);
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                int i17 = i14;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c16096cM45634d.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC40987b.f176893a), null, AbstractC13673n.m38561h(C38072d.f163053a), "Back button", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                int i18 = i17 & 896;
                boolean z14 = i18 == 256;
                Object objM87133R4 = c28655q.m87133R();
                if (z14 || objM87133R4 == c28676v0) {
                    function2 = onNavigationEvent;
                    objM87133R4 = new C21860l(function2, 7);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = onNavigationEvent;
                }
                AbstractC6719b.m20143d(modifierM66723l, aVar, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                c28655q = c28655q;
                Object objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C15218b(26, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
                Object objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    interfaceC28601c1 = interfaceC28601c3;
                    objM87133R6 = new C13921a0(29, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    interfaceC28601c1 = interfaceC28601c3;
                }
                Function1 function3 = (Function1) objM87133R6;
                z4 = true;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q, 1), 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                int i19 = i16 | 27648 | i18;
                i15 = i17;
                m62254z(c16096cM45634d, onViewEvent, function2, interfaceC4339a, function3, AbstractC11895b.m31988g(modifierM92116f0, true, 1.0f), c28655q, i19);
                c28655q.m87173q(true);
                C16094a c16094aM62246r = m62246r(interfaceC28601c1);
                if (c16094aM62246r == null) {
                    c28655q.m87150e0(-1745492396);
                    c28655q.m87173q(false);
                    function1 = onViewEvent;
                    z13 = false;
                } else {
                    c28655q.m87150e0(-1745492395);
                    TextResource textResourceM45565d = c16094aM62246r.getDisconnectPopup().getTitle();
                    TextResource textResourceM45562a = c16094aM62246r.getDisconnectPopup().getDescription();
                    TextResource textResourceM45563b = c16094aM62246r.getDisconnectPopup().getPrimaryButtonText();
                    TextResource textResourceM45564c = c16094aM62246r.getDisconnectPopup().getSecondaryButtonText();
                    Object objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C15218b(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R7;
                    boolean zM87157i2 = c28655q.m87157i(c16094aM62246r) | (i16 == 32) | c28655q.m87157i(c16096cM45634d);
                    Object objM87133R8 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R8 == c28676v0) {
                        C1012d c1012d = new C1012d((Object) c16094aM62246r, onViewEvent, (Object) c16096cM45634d, (Object) interfaceC28601c1, 20);
                        function1 = onViewEvent;
                        c28655q.m87172p0(c1012d);
                        objM87133R8 = c1012d;
                    } else {
                        function1 = onViewEvent;
                    }
                    int i24 = TextResource.$stable;
                    int i25 = (i24 << 3) | (i24 << 6) | (i24 << 9) | (i24 << 27);
                    z13 = false;
                    AbstractC21211n.m59497o(null, textResourceM45565d, textResourceM45562a, textResourceM45563b, false, null, null, null, null, textResourceM45564c, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, null, (InterfaceC4339a) objM87133R8, null, null, null, c28655q, i25, 0, 384, 247463409);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z13);
            }
            c16110q = viewState;
            AbstractC21894b.m62170c(c16110q, function1, c28655q, i15 & 126);
            c28655q.m87173q(z4);
        } else {
            function1 = onViewEvent;
            c16110q = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21895c(c16110q, function1, onNavigationEvent, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final boolean m62244p(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m62245q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: r */
    private static final C16094a m62246r(InterfaceC28601c1 interfaceC28601c1) {
        return (C16094a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m62247s(InterfaceC28601c1 interfaceC28601c1, C16094a c16094a) {
        interfaceC28601c1.setValue(c16094a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m62248t(Function1 function1) {
        function1.invoke(new InterfaceC14714c.a(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m62249u(InterfaceC28601c1 interfaceC28601c1) {
        m62245q(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m62250v(InterfaceC28601c1 interfaceC28601c1, C16094a section) {
        AbstractC22676k.m65750j(section, "section");
        m62247s(interfaceC28601c1, section);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m62251w(InterfaceC28601c1 interfaceC28601c1) {
        m62247s(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m62252x(C16094a c16094a, Function1 function1, C16096c c16096c, InterfaceC28601c1 interfaceC28601c1) {
        m62247s(interfaceC28601c1, null);
        if (c16094a.getIsWhoopBuilt()) {
            function1.invoke(new InterfaceC16107n.c(c16096c.getId(), c16096c.getReportingKey()));
        } else if (c16094a.getIntegrationId3P() != null) {
            function1.invoke(new InterfaceC16107n.b(c16096c.getId(), c16094a.getIntegrationId3P(), c16096c.getReportingKey()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m62253y(C16110q c16110q, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m62243o(c16110q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private static final void m62254z(C16096c c16096c, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, Modifier modifier, Composer composer, int i13) {
        C16096c c16096c2;
        int i14;
        Function1 function4;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1041180528);
        if ((i13 & 6) == 0) {
            c16096c2 = c16096c;
            i14 = (c28655q.m87157i(c16096c2) ? 4 : 2) | i13;
        } else {
            c16096c2 = c16096c;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            function4 = function1;
            i14 |= c28655q.m87157i(function4) ? 32 : 16;
        } else {
            function4 = function1;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(modifier) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            float f13 = 8;
            float f14 = 2 * f13;
            float f15 = 4;
            float f16 = f15 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, modifier), f14, 0.0f, f14, f16, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
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
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(c16096c2.getIcon(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            long j7 = C17919x.f69637n;
            C2314t c2314t = C2314t.f9131w;
            AbstractC15005f3.m43107a(abstractC26165aM64500i, null, AbstractC1102d.m3419p(f16, c2314t), j7, c28655q, 3504, 0);
            TextResource textResourceM45550k = c16096c2.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM45550k, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8416N = c38072d.m121952e(c28655q, i16).getT1();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16096c.getDescription(), c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            InterfaceC25312u interfaceC25312uM45543d = c16096c.getDescriptionFootnote();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (interfaceC25312uM45543d == null) {
                c28655q.m87150e0(561573326);
                z4 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(561573327);
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C21862n(function2, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312uM45543d, null, null, (Function1) objM87133R, c28655q, 0, 6);
                c28655q = c28655q;
                z4 = false;
                c28655q.m87173q(false);
            }
            String strM45546g = c16096c.getLearnMoreButtonDestinationUrl();
            if (strM45546g == null) {
                c28655q.m87150e0(561992911);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(561992912);
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                TextResource textResourceM45547h = c16096c.getLearnMoreButtonText();
                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t, (-3) * f15, 0.0f, 2);
                boolean zM87153g = ((i14 & 896) == 256) | c28655q.m87153g(strM45546g);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0176c(function2, strM45546g, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                C28655q c28655q2 = c28655q;
                AbstractC27265l0.m82217i(modifierM3392n, enumC27269n0, textResourceM45547h, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q2, (i15 << 6) | 54 | (C39274g.f168929c << 12), 0, 4072);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            m62240l(c16096c, function4, function2, interfaceC4339a2, function3, c28655q, 65534 & i14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(c16096c, function1, function2, interfaceC4339a, function3, modifier, i13);
        }
    }
}
