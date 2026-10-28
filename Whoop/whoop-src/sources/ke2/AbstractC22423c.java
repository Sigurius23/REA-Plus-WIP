package ke2;

import a31.C0341c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d11.C11474i;
import h02.C16576i;
import ig0.C18464d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import je2.C21627f;
import je2.InterfaceC21622a;
import je2.InterfaceC21624c;
import jp1.C21860l;
import jp1.C21862n;
import jp2.C21875f;
import kd2.AbstractC22415a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
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
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ke2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00182\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lje2/c;", "viewState", "Lkotlin/Function1;", "Lje2/a$e;", "Ll83/a0;", "onNavEvent", "Lje2/a$j;", "onViewEvent", "C", "(Lje2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lje2/a;", "onEvent", "B", "(Lje2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lje2/c$b;", "H", "(Lje2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lje2/f;", "toggleViewState", "", "isToggleEnabled", "onSwitchToggled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lje2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lje2/c$a;", "r", "(Lje2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22423c {

    /* JADX INFO: renamed from: ke2.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.togglesettings.view.ShepherdToggleSettingsScreenKt$FullScreenModalScreen$1$4$1", m100430f = "ShepherdToggleSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87745w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC21624c.a f87746x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f87747y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21624c.a aVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87746x = aVar;
            this.f87747y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f87746x, this.f87747y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87745w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC21622a interfaceC21622aM60845g = this.f87746x.getFollowUpEvent();
            if (interfaceC21622aM60845g != null) {
                this.f87747y.invoke(interfaceC21622aM60845g);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m64564A(C21627f c21627f, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m64599w(c21627f, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m64565B(InterfaceC21624c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(564946452);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState instanceof InterfaceC21624c.a) {
            c28655q.m87150e0(1747668243);
            m64594r((InterfaceC21624c.a) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof InterfaceC21624c.b)) {
                throw AbstractC11895b.m32003v(1747665869, c28655q, false);
            }
            c28655q.m87150e0(1747672001);
            m64571H((InterfaceC21624c.b) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(viewState, onEvent, i13, 24);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m64566C(InterfaceC21624c viewState, Function1 onNavEvent, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(740816487);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C21860l(onNavEvent, 17);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
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
            boolean z13 = (i15 == 32) | ((i14 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2777c(onNavEvent, 7, onViewEvent);
                c28655q.m87172p0(objM87133R2);
            }
            m64565B(viewState, (Function1) objM87133R2, c28655q, i14 & 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(i13, 20, viewState, onViewEvent, onNavEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m64567D(Function1 function1) {
        function1.invoke(InterfaceC21622a.b.f82990a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m64568E(Function1 function1, Function1 function2, InterfaceC21622a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC21622a.e) {
            function1.invoke(event);
        } else {
            if (!(event instanceof InterfaceC21622a.j)) {
                throw new NoWhenBranchMatchedException();
            }
            function2.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m64569F(InterfaceC21624c interfaceC21624c, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m64566C(interfaceC21624c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m64570G(InterfaceC21624c interfaceC21624c, Function1 function1, int i13, Composer composer, int i14) {
        m64565B(interfaceC21624c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m64571H(InterfaceC21624c.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(943866112);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(bVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
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
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "ArrhythmiaSettingsToolbar");
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getPageTitle(), null, Integer.valueOf(bVar.getIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC22415a.f87687d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C21860l(function1, 18);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3599a, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f13 = 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
            C21627f c21627fM60859d = bVar.getShepherdDetectionToggleViewState();
            boolean z13 = i15 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C21862n(function1, 15);
                c28655q.m87172p0(objM87133R2);
            }
            int i16 = TextResource.$stable;
            m64599w(c21627fM60859d, false, (Function1) objM87133R2, c28655q, i16, 2);
            float f14 = 4 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            C21627f c21627fM60860e = bVar.getShepherdNotificationToggleViewState();
            boolean zM60875b = bVar.getShepherdDetectionToggleViewState().getEnabled();
            boolean zM87157i = (i15 == 32) | c28655q.m87157i(bVar);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C22422b(function1, bVar);
                c28655q.m87172p0(objM87133R3);
            }
            m64599w(c21627fM60860e, zM60875b, (Function1) objM87133R3, c28655q, i16, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            InterfaceC25312u interfaceC25312uM60856a = bVar.getAboutCtaTile();
            boolean zM87157i2 = c28655q.m87157i(bVar) | (i15 == 32);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C22422b(bVar, function1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC25303l.m74291r(interfaceC25312uM60856a, null, null, (Function1) objM87133R4, c28655q, 0, 6);
            c28655q = c28655q;
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(bVar, function1, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m64572I(Function1 function1) {
        function1.invoke(InterfaceC21622a.b.f82990a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m64573J(Function1 function1, boolean z4) {
        if (z4) {
            function1.invoke(InterfaceC21622a.d.f82993a);
        } else {
            function1.invoke(new InterfaceC21622a.g(false, false));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m64574K(Function1 function1, InterfaceC21624c.b bVar, boolean z4) {
        function1.invoke(new InterfaceC21622a.h(bVar.getShepherdDetectionToggleViewState().getEnabled(), z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m64575L(InterfaceC21624c.b bVar, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC25312u interfaceC25312uM60856a = bVar.getAboutCtaTile();
        AbstractC22676k.m65748h(interfaceC25312uM60856a, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.ctatile.CtaTileState");
        C9598e c9598eM30835x = ((C11474i) interfaceC25312uM60856a).getNavigationAction();
        if (c9598eM30835x != null) {
            function1.invoke(new InterfaceC21622a.c(c9598eM30835x));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m64576M(InterfaceC21624c.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m64571H(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m64594r(final InterfaceC21624c.a aVar, final Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1510847384);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = aVar.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-771169841);
                TextResource title = aVar.getType().getTitle();
                boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i15 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: ke2.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return AbstractC22423c.m64596t(aVar, function1);
                                case 1:
                                    return AbstractC22423c.m64597u(aVar, function1);
                                default:
                                    return AbstractC22423c.m64595s(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), aVar.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(-770819448);
                int i16 = i14;
                AbstractC33208p0 abstractC33208p0M60851m = aVar.getType();
                TextResource textResourceM60850l = aVar.getSupportText();
                TextResource textResourceM60847i = aVar.getPrimaryButtonText();
                int i17 = i16 & 112;
                boolean zM87157i2 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i18 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: ke2.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC22423c.m64596t(aVar, function1);
                                case 1:
                                    return AbstractC22423c.m64597u(aVar, function1);
                                default:
                                    return AbstractC22423c.m64595s(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                TextResource textResourceM60849k = aVar.getSecondaryButtonText();
                boolean zM87157i3 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    final int i19 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: ke2.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC22423c.m64596t(aVar, function1);
                                case 1:
                                    return AbstractC22423c.m64597u(aVar, function1);
                                default:
                                    return AbstractC22423c.m64595s(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                int i24 = 196608 | AbstractC33208p0.f138461d;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M60851m, textResourceM60850l, null, textResourceM60847i, interfaceC4339a, true, false, textResourceM60849k, interfaceC4339a2, null, false, false, c28655q, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 3652);
                InterfaceC21622a interfaceC21622aM60845g = aVar.getFollowUpEvent();
                boolean zM87157i4 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    function2 = function1;
                    objM87133R4 = new a(aVar, function2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = function1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC21622aM60845g);
                c28655q.m87173q(false);
            }
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(aVar, function2, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m64595s(InterfaceC21624c.a aVar, Function1 function1) {
        InterfaceC21622a interfaceC21622aM60845g = aVar.getFollowUpEvent();
        if (interfaceC21622aM60845g != null) {
            function1.invoke(interfaceC21622aM60845g);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m64596t(InterfaceC21624c.a aVar, Function1 function1) {
        InterfaceC21622a interfaceC21622aM60846h = aVar.getPrimaryButtonClickEvent();
        if (interfaceC21622aM60846h != null) {
            function1.invoke(interfaceC21622aM60846h);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m64597u(InterfaceC21624c.a aVar, Function1 function1) {
        InterfaceC21622a interfaceC21622aM60848j = aVar.getSecondaryButtonClickEvent();
        if (interfaceC21622aM60848j != null) {
            function1.invoke(interfaceC21622aM60848j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m64598v(InterfaceC21624c.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m64594r(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    private static final void m64599w(C21627f c21627f, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        Function1 function2;
        int i17;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-189221468);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(c21627f) : c28655q2.m87157i(c21627f) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21875f(28);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function2;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    float f13 = 8;
                    float f14 = 2 * f13;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    TextResource textResourceM60876c = c21627f.getTitle();
                    int i19 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM60876c, c28655q2, i19);
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    long jM125430y = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i24).getH4();
                    if (1.0f > 0.0d) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 1 * f13, 0.0f, 11);
                    int i25 = C2886a.f11498d << 18;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i25, 196600);
                    AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i24).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-519932305, c28655q, new C0341c(c21627f, z16, function3, 11)), c28655q, 24576, 13);
                    c28655q.m87173q(true);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21627f.getDescription(), c28655q, i19), AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), c38072d.m121949b(c28655q, i24).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB2(), null, c28655q, 48, i25, 196600);
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z15 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3226h(c21627f, z15, function3, i13, i14, 13);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21875f(28);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                C2314t c2314t2 = C2314t.f9131w;
                float f15 = 8;
                float f16 = 2 * f15;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f16, 0.0f, 2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                TextResource textResourceM60876c2 = c21627f.getTitle();
                int i110 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM60876c2, c28655q2, i110);
                C38072d c38072d2 = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                long jM125430y2 = c38072d2.m121949b(c28655q2, i26).getBrandWhite();
                C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q2, i26).getH4();
                if (1.0f > 0.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 1 * f15, 0.0f, 11);
                int i27 = C2886a.f11498d << 18;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i27, 196600);
                AbstractC39330c.m125320b(0L, c38072d2.m121949b(c28655q, i26).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-519932305, c28655q, new C0341c(c21627f, z16, function3, 11)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21627f.getDescription(), c28655q, i110), AbstractC1099a.m3396r(c2314t2, f16, 0.0f, 2), c38072d2.m121949b(c28655q, i26).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i26).getB2(), null, c28655q, 48, i27, 196600);
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(c21627f, z15, function3, i13, i14, 13);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21875f(28);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                C2314t c2314t3 = C2314t.f9131w;
                float f17 = 8;
                float f18 = 2 * f17;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f18, 0.0f, 2);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                TextResource textResourceM60876c3 = c21627f.getTitle();
                int i111 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM60876c3, c28655q2, i111);
                C38072d c38072d3 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                long jM125430y3 = c38072d3.m121949b(c28655q2, i28).getBrandWhite();
                C2886a c2886aM8437r3 = c38072d3.m121952e(c28655q2, i28).getH4();
                if (1.0f > 0.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 1 * f17, 0.0f, 11);
                int i29 = C2886a.f11498d << 18;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h3, modifierM3398t3, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r3, null, c28655q, 0, i29, 196600);
                AbstractC39330c.m125320b(0L, c38072d3.m121949b(c28655q, i28).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-519932305, c28655q, new C0341c(c21627f, z16, function3, 11)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21627f.getDescription(), c28655q, i111), AbstractC1099a.m3396r(c2314t3, f18, 0.0f, 2), c38072d3.m121949b(c28655q, i28).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i28).getB2(), null, c28655q, 48, i29, 196600);
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(c21627f, z15, function3, i13, i14, 13);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21875f(28);
                    c28655q2.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            C2314t c2314t4 = C2314t.f9131w;
            float f19 = 8;
            float f110 = 2 * f19;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f110, 0.0f, 2);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            TextResource textResourceM60876c4 = c21627f.getTitle();
            int i112 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM60876c4, c28655q2, i112);
            C38072d c38072d4 = C38072d.f163053a;
            int i210 = C38072d.f163054b;
            long jM125430y4 = c38072d4.m121949b(c28655q2, i210).getBrandWhite();
            C2886a c2886aM8437r4 = c38072d4.m121952e(c28655q2, i210).getH4();
            if (1.0f > 0.0d) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 1 * f19, 0.0f, 11);
            int i211 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h4, modifierM3398t4, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r4, null, c28655q, 0, i211, 196600);
            AbstractC39330c.m125320b(0L, c38072d4.m121949b(c28655q, i210).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-519932305, c28655q, new C0341c(c21627f, z16, function3, 11)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21627f.getDescription(), c28655q, i112), AbstractC1099a.m3396r(c2314t4, f110, 0.0f, 2), c38072d4.m121949b(c28655q, i210).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i210).getB2(), null, c28655q, 48, i211, 196600);
            z15 = z16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(c21627f, z15, function3, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m64600x(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m64601y(C21627f c21627f, boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3429z = AbstractC1102d.m3429z(AbstractC1136a.m3599a(C2314t.f9131w, AbstractC8693b.m21274h(c21627f.getTitle(), c28655q, TextResource.$stable)), null, 3);
            long jM125410o = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd();
            boolean zM60875b = c21627f.getEnabled();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C21862n(function1, 14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(modifierM3429z, zM60875b, z4, jM125410o, null, null, (Function1) objM87133R, c28655q, 0, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m64602z(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }
}
