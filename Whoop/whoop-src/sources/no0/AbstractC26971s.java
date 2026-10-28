package no0;

import ai1.C0910b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gh0.C15848c;
import gy0.AbstractC16277f;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.C23821c;
import lo0.AbstractC24594n;
import lo0.C24580g;
import lo0.C24582h;
import lo0.C24584i;
import lo0.C24590l;
import lo0.C24592m;
import lo0.InterfaceC24588k;
import mf2.C25514e;
import mh0.C25550b;
import mo0.AbstractC25739b;
import mx1.C26003i;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p719m22.C24965t;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: no0.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0007¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "appointmentId", "Lkotlin/Function1;", "Llo0/j;", "Ll83/a0;", "onNavigationEvent", "l", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Llo0/n;", "viewState", "Llo0/k;", "onViewEvent", "m", "(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Llo0/n$c;", "x", "(Llo0/n$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Li2/x;", "color", "D", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "v", "(Landroidx/compose/runtime/Composer;I)V", "s", "Llo0/m;", "viewModel", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26971s {

    /* JADX INFO: renamed from: no0.s$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f107594w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f107595x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f107596y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f107597z;

        /* JADX INFO: renamed from: no0.s$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42074a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f107598w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42074a(C21647a c21647a) {
                super(0);
                this.f107598w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f107598w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f107594w = c38266c;
            this.f107595x = interfaceC35951a;
            this.f107596y = interfaceC4339a;
            this.f107597z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, lo0.m] */
        @Override // c93.InterfaceC4339a
        public final C24592m invoke() {
            return AbstractC21598x.m60668X(this.f107594w, this.f107595x, new C42074a(this.f107597z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24592m.class), null, this.f107596y);
        }
    }

    /* JADX INFO: renamed from: no0.s$b */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianSchedulingConfirmationScreenKt$ClinicianSchedulingConfirmationScreen$1$1", m100430f = "ClinicianSchedulingConfirmationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107599w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f107600x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f107601y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107600x = str;
            this.f107601y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f107600x, this.f107601y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107599w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC26971s.m80790n(this.f107601y).m71815n(new C24584i(this.f107600x));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.s$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f107602w = new c();

        /* JADX INFO: renamed from: a */
        public final void m80803a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m80803a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.s$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f107603w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: no0.s$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f107604w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f107605x;

        public e(Function1 function1, List list) {
            this.f107604w = function1;
            this.f107605x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m80805a(int i13) {
            return this.f107604w.invoke(this.f107605x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m80805a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: no0.s$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f107606w;

        public f(List list) {
            this.f107606w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m80806a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f107606w.get(i13);
            c28655q.m87150e0(382398912);
            C25307p c25307pM75911y = AbstractC25739b.m75911y();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = c.f107602w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM75911y, null, (Function1) objM87133R, c28655q, 3072 | (C25307p.f99300b << 3), 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m80806a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m80772A(C24590l c24590l, InterfaceC22997s1 interfaceC22997s1, Function1 function1, EnumC3919c clickType) {
        AbstractC22676k.m65750j(clickType, "clickType");
        if (clickType == EnumC3919c.FILLED_BUTTON) {
            GenericInteraction genericInteractionM11950o = c24590l.getProgressButton().getInteraction();
            if (genericInteractionM11950o != null) {
                function1.invoke(new C24580g(genericInteractionM11950o));
            } else {
                function1.invoke(C24582h.f96056a);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m80773B(AbstractC24594n.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m80800x(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final Modifier m80775D(Modifier modifier, long j7) {
        return AbstractC1125a.m3478a(modifier, new C0910b(j7, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m80776E(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C17909s c17909s = AbstractC17911t.f69612b;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, j7)), new C17919x(C17919x.m51541c(0.0f, j7)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L));
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(c17909s, listM118959K, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m80788l(String appointmentId, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        String str;
        C28655q c28655q;
        Function1 function1;
        AbstractC22676k.m65750j(appointmentId, "appointmentId");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2016931177);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(appointmentId) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q2.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
            boolean zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q2.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m80790n(interfaceC23462h).getViewState(), AbstractC24594n.b.f96129b, null, c28655q2, 48, 2);
            boolean zM87157i = c28655q2.m87157i(interfaceC23462h) | ((i14 & 14) == 4);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(appointmentId, interfaceC23462h, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, appointmentId);
            AbstractC14874j.m42904c(m80791o(interfaceC28601c1M87260n), "healthcare_loop_appointment_scheduling_confirmation", c28655q2, 48);
            AbstractC24594n abstractC24594nM80791o = m80791o(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q2.m87157i(interfaceC23462h);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C26967q(interfaceC23462h, 0);
                c28655q2.m87172p0(objM87133R3);
            }
            str = appointmentId;
            c28655q = c28655q2;
            function1 = onNavigationEvent;
            m80789m(abstractC24594nM80791o, str, (Function1) objM87133R3, function1, c28655q, ((i14 << 3) & 112) | ((i14 << 6) & 7168));
        } else {
            str = appointmentId;
            c28655q = c28655q2;
            function1 = onNavigationEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15848c(str, i13, 1, function1);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m80789m(AbstractC24594n viewState, String appointmentId, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(appointmentId, "appointmentId");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-929199143);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(appointmentId) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
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
            if (viewState instanceof AbstractC24594n.c) {
                c28655q.m87150e0(-1442388483);
                m80800x((AbstractC24594n.c) viewState, onNavigationEvent, c28655q, ((i14 >> 6) & 112) | (i14 & 14));
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC24594n.a.f96128b)) {
                c28655q.m87150e0(-1442384585);
                m80795s(appointmentId, onViewEvent, c28655q, (i14 >> 3) & 126);
                c28655q.m87173q(false);
            } else {
                if (!viewState.equals(AbstractC24594n.b.f96129b)) {
                    throw AbstractC11895b.m32003v(-1442391409, c28655q, false);
                }
                c28655q.m87150e0(-1442380383);
                m80798v(c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25550b(viewState, appointmentId, onViewEvent, onNavigationEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C24592m m80790n(InterfaceC23462h interfaceC23462h) {
        return (C24592m) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: o */
    private static final AbstractC24594n m80791o(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC24594n) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m80792p(InterfaceC23462h interfaceC23462h, InterfaceC24588k it) {
        AbstractC22676k.m65750j(it, "it");
        m80790n(interfaceC23462h).m71815n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m80793q(String str, Function1 function1, int i13, Composer composer, int i14) {
        m80788l(str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m80794r(AbstractC24594n abstractC24594n, String str, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m80789m(abstractC24594n, str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private static final void m80795s(String str, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1809460903);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC16277f.f62259L1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC16277f.f62292W1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C26969r(function1, str, 0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i16 = AbstractC33208p0.b.f138467h;
            int i17 = TextResource.C8688b.f25889c;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, false, false, null, null, null, false, false, c28655q, i16 | (i17 << 3) | (i17 << 9), 0, 4068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15848c(str, i13, 2, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m80796t(Function1 function1, String str) {
        function1.invoke(new C24584i(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m80797u(String str, Function1 function1, int i13, Composer composer, int i14) {
        m80795s(str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m80798v(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-668178461);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62274Q1)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m80799w(int i13, Composer composer, int i14) {
        m80798v(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m80800x(AbstractC24594n.c cVar, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q;
        C17919x c17919xM31989h;
        Modifier modifierM80775D;
        C0209i c0209i;
        C0209i c0209i2;
        C2314t c2314t;
        C0209i c0209i3;
        C0213j c0213j;
        C24590l c24590l;
        C28655q c28655q2;
        int i15;
        float f13;
        C0209i c0209i4;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(178711652);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q3.m87157i(cVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q3.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C24590l c24590lM71826b = cVar.getScreenState();
            EnumC39333f enumC39333fM71808b = c24590lM71826b.getGradientColor();
            if (enumC39333fM71808b == null) {
                c28655q3.m87150e0(-1760392566);
                c28655q3.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q3.m87150e0(-56786857);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q3, false, enumC39333fM71808b.mo134584toComposableColorWaAFU9c(c28655q3, 0));
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            if (c17919xM31989h == null || (modifierM80775D = m80775D(c2314t2, c17919xM31989h.f69639a)) == null) {
                modifierM80775D = c2314t2;
            }
            Modifier modifierMo3471e = modifierM3407d.mo3471e(modifierM80775D);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC39127r0M66763d);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N);
            if (AbstractC22404p.m64497f(c24590lM71826b.getBackgroundImage())) {
                c28655q3.m87150e0(635152260);
                c2314t = c2314t2;
                c24590l = c24590lM71826b;
                c0209i3 = c0209i7;
                f13 = 1.0f;
                c0209i = c0209i6;
                c0209i2 = c0209i5;
                c0213j = c0213j2;
                i15 = 0;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c24590lM71826b.getBackgroundImage(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC15674c.m44081e(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9115x), AbstractC26973t.m80810a()), null, C39102j.f168199a, 0.0f, null, c28655q3, 24624, 104);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c0209i = c0209i6;
                c0209i2 = c0209i5;
                c2314t = c2314t2;
                c0209i3 = c0209i7;
                c0213j = c0213j2;
                c24590l = c24590lM71826b;
                c28655q2 = c28655q3;
                i15 = 0;
                f13 = 1.0f;
                c28655q2.m87150e0(635519672);
                c28655q2.m87173q(false);
            }
            Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC1102d.m3407d(f13, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, i15);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66725n);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i4 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            } else {
                c0209i4 = c0209i3;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N2);
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(f13, c2314t), 0.0f, 1 * f14, 0.0f, f15, 5);
            AbstractC6721d.a aVar = new AbstractC6721d.a(null, null, AbstractC38963t7.m124375e(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
            int i17 = i16 & 112;
            int i18 = i17 == 32 ? 1 : i15;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i18 != 0 || objM87133R == c28676v0) {
                objM87133R = new C25514e(function1, 18);
                c28655q2.m87172p0(objM87133R);
            }
            C28655q c28655q4 = c28655q2;
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q4, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM44082f = AbstractC15674c.m44082f(AbstractC15674c.m44085i(AbstractC38963t7.m124374d(1.0f, 1.0f, true), 0.0f, null, 3, null), 0.0f, 1, null);
            C22976l1 c22976l1 = new C22976l1(f15, f15, f15, f15);
            C22971k c22971kM66748k = AbstractC22977m.m66748k(f15, C2299e.f9109L);
            C24590l c24590l2 = c24590l;
            boolean zM87157i = c28655q4.m87157i(c24590l2);
            Object objM87133R2 = c28655q4.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C23821c(c24590l2, 29);
                c28655q4.m87172p0(objM87133R2);
            }
            C0209i c0209i9 = c0209i4;
            AbstractC22674j.m65717c(modifierM44082f, null, c22976l1, c22971kM66748k, null, null, false, null, (Function1) objM87133R2, c28655q4, 24960, 490);
            c28655q = c28655q4;
            float f16 = 4 * f14;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f16, f16, f16, 5 * f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i9);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
            C3927k c3927kM71810d = c24590l2.getProgressButton();
            boolean zM87157i2 = c28655q.m87157i(c24590l2) | (i17 == 32);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                function2 = function1;
                objM87133R3 = new C26941d(c24590l2, function2, 1);
                c28655q.m87172p0(objM87133R3);
            } else {
                function2 = function1;
            }
            AbstractC3926j.m11931e(c3927kM71810d, (Function1) objM87133R3, c28655q, C3927k.f16020r, 0);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            function2 = function1;
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(cVar, function2, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m80801y(Function1 function1) {
        function1.invoke(C24582h.f96056a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m80802z(C24590l c24590l, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM71809c = c24590l.m71809c();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM71809c.size(), null, new e(d.f107603w, listM71809c), new C37816b(new f(listM71809c), true, 802480018));
        return C23454a0.f92919a;
    }
}
