package f22;

import a81.C0563n;
import am2.C1008b;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractC1329o1;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2633u2;
import bc3.InterfaceC2994c0;
import c22.EnumC3894b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.pairing.membershipAdjustment.navigation.MembershipAdjustmentNavHostDestination;
import e93.AbstractC12889b;
import eo2.C13390j;
import g22.C15284d;
import g22.InterfaceC15282b;
import g22.InterfaceC15283c;
import hg3.AbstractC17269i;
import i22.AbstractC18015c;
import java.util.Map;
import kotlin.C2040y;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p133f1.C13989w1;
import p133f1.C13998z1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: f22.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Lg22/d;", "viewModel", "Leb/u0;", "navController", "Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;", "startDestination", "Lkotlin/Function1;", "Lf22/d;", "Ll83/a0;", "onNavigationEvent", "Landroidx/fragment/app/o1;", "parentFragmentManager", "", "strapSerial", "strapSignature", "o", "(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lg22/b;", "viewState", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14031c {

    /* JADX INFO: renamed from: f22.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.navigation.MembershipAdjustmentNavHostKt$MembershipAdjustmentNavHost$1$1$1$1$1", m100430f = "MembershipAdjustmentNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f50064w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15284d f50065x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f50066y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f50067z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15284d c15284d, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f50065x = c15284d;
            this.f50066y = str;
            this.f50067z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f50065x, this.f50066y, this.f50067z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f50064w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f50065x.m43399o(new InterfaceC15283c.b(this.f50066y, this.f50067z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f22.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.navigation.MembershipAdjustmentNavHostKt$MembershipAdjustmentNavHost$1$1$2$1$1", m100430f = "MembershipAdjustmentNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f50068w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15284d f50069x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f50070y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f50071z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15284d c15284d, String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f50069x = c15284d;
            this.f50070y = str;
            this.f50071z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f50069x, this.f50070y, this.f50071z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f50068w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f50069x.m43399o(new InterfaceC15283c.b(this.f50070y, this.f50071z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m39923A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m39924B(Function1 function1) {
        AppScreen.C9426u2 c9426u2 = AppScreen.C9426u2.f27963w;
        Object[] objArr = 0 == true ? 1 : 0;
        function1.invoke(new AbstractC14032d.d(new C9598e(c9426u2, new HomeScreenModel((String) null, (AiAction) objArr, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), 0 == true ? 1 : 0, 4, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m39925C(C15284d c15284d, String str, String str2) {
        c15284d.m43399o(new InterfaceC15283c.b(str, str2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m39926D(C15284d c15284d, C12991u0 c12991u0, MembershipAdjustmentNavHostDestination membershipAdjustmentNavHostDestination, Function1 function1, AbstractC1329o1 abstractC1329o1, String str, String str2, int i13, Composer composer, int i14) {
        m39941o(c15284d, c12991u0, membershipAdjustmentNavHostDestination, function1, abstractC1329o1, str, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m39941o(C15284d viewModel, C12991u0 navController, MembershipAdjustmentNavHostDestination startDestination, Function1 onNavigationEvent, AbstractC1329o1 parentFragmentManager, String strapSerial, String strapSignature, Composer composer, int i13) {
        int i14;
        int i15;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(startDestination, "startDestination");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(parentFragmentManager, "parentFragmentManager");
        AbstractC22676k.m65750j(strapSerial, "strapSerial");
        AbstractC22676k.m65750j(strapSignature, "strapSignature");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1260227223);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(startDestination.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(parentFragmentManager) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(strapSerial) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87153g(strapSignature) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), InterfaceC15282b.b.f57382a, null, c28655q, 48, 2);
            String strName = startDestination.name();
            boolean zM87157i = ((3670016 & i14) == 1048576) | ((458752 & i14) == 131072) | c28655q.m87157i(viewModel) | c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(parentFragmentManager) | ((i14 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                i15 = i14;
                C1008b c1008b = new C1008b(viewModel, strapSerial, strapSignature, parentFragmentManager, onNavigationEvent, interfaceC28601c1M87260n, 6);
                c28655q.m87172p0(c1008b);
                objM87133R = c1008b;
            } else {
                i15 = i14;
            }
            AbstractC17269i.m48888e(navController, strName, null, (Function1) objM87133R, c28655q, (i15 >> 3) & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(viewModel, navController, startDestination, onNavigationEvent, parentFragmentManager, strapSerial, strapSignature, i13, 4);
        }
    }

    /* JADX INFO: renamed from: p */
    private static final InterfaceC15282b m39942p(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC15282b) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m39943q(C15284d c15284d, String str, String str2, AbstractC1329o1 abstractC1329o1, Function1 function1, InterfaceC28670t2 interfaceC28670t2, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "PAIRING_FLOW_MEMBERSHIP_ADJUSTMENT", null, new C37816b(new C2040y(c15284d, str, str2, abstractC1329o1, function1, interfaceC28670t2), true, -914132924), 6);
        AbstractC12889b.m36291u(NavHost, "PAIRING_FIRST_FLOW_MEMBERSHIP_ADJUSTMENT", null, new C37816b(new C0563n(c15284d, str, str2, function1, interfaceC28670t2, 4), true, -2076091731), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m39944r(C15284d c15284d, String str, String str2, AbstractC1329o1 abstractC1329o1, Function1 function1, InterfaceC28670t2 interfaceC28670t2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c15284d) | c28655q.m87153g(str) | c28655q.m87153g(str2);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new a(c15284d, str, str2, null);
            c28655q.m87172p0(objM87133R);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        InterfaceC15282b interfaceC15282bM39942p = m39942p(interfaceC28670t2);
        boolean zM87157i2 = c28655q.m87157i(c15284d) | c28655q.m87153g(str);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C14030b(c15284d, str, 1);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(abstractC1329o1) | c28655q.m87153g(function1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C13989w1(2, abstractC1329o1, function1);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g || objM87133R4 == c28676v0) {
            objM87133R4 = new C13390j(function1, 25);
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
        boolean zM87153g2 = c28655q.m87153g(function1);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87153g2 || objM87133R5 == c28676v0) {
            objM87133R5 = new C13390j(function1, 26);
            c28655q.m87172p0(objM87133R5);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
        boolean zM87157i4 = c28655q.m87157i(c15284d) | c28655q.m87153g(str) | c28655q.m87153g(str2);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i4 || objM87133R6 == c28676v0) {
            objM87133R6 = new C14029a(c15284d, str, str2, 0);
            c28655q.m87172p0(objM87133R6);
        }
        AbstractC18015c.m51724E(interfaceC15282bM39942p, false, interfaceC4351m, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R6, c28655q, 0, 2);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m39945s(C15284d c15284d, String str, String path, Map payload) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(payload, "payload");
        c15284d.m43399o(new InterfaceC15283c.a(path, payload, str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m39946t(AbstractC1329o1 abstractC1329o1, Function1 function1) {
        abstractC1329o1.m4168f0(new Bundle(), "membership_adjustment_fragment_cancel_result");
        function1.invoke(new AbstractC14032d.b(EnumC3894b.PAIRING_FLOW));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m39947u(Function1 function1) {
        function1.invoke(AbstractC14032d.a.f50072a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m39948v(Function1 function1) {
        function1.invoke(AbstractC14032d.c.f50074a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m39949w(C15284d c15284d, String str, String str2) {
        c15284d.m43399o(new InterfaceC15283c.b(str, str2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m39950x(C15284d c15284d, String str, String str2, Function1 function1, InterfaceC28670t2 interfaceC28670t2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c15284d) | c28655q.m87153g(str) | c28655q.m87153g(str2);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new b(c15284d, str, str2, null);
            c28655q.m87172p0(objM87133R);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        InterfaceC15282b interfaceC15282bM39942p = m39942p(interfaceC28670t2);
        boolean zM87157i2 = c28655q.m87157i(c15284d) | c28655q.m87153g(str);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C14030b(c15284d, str, 0);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R2;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            objM87133R3 = new C13390j(function1, 27);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
        Object objM87133R4 = c28655q.m87133R();
        if (objM87133R4 == c28676v0) {
            objM87133R4 = new C13998z1(1);
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
        boolean zM87153g2 = c28655q.m87153g(function1);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87153g2 || objM87133R5 == c28676v0) {
            objM87133R5 = new C13390j(function1, 28);
            c28655q.m87172p0(objM87133R5);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
        boolean zM87157i3 = c28655q.m87157i(c15284d) | c28655q.m87153g(str) | c28655q.m87153g(str2);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i3 || objM87133R6 == c28676v0) {
            objM87133R6 = new C14029a(c15284d, str, str2, 1);
            c28655q.m87172p0(objM87133R6);
        }
        AbstractC18015c.m51724E(interfaceC15282bM39942p, false, interfaceC4351m, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R6, c28655q, 24624, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m39951y(C15284d c15284d, String str, String path, Map payload) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(payload, "payload");
        c15284d.m43399o(new InterfaceC15283c.a(path, payload, str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m39952z(Function1 function1) {
        function1.invoke(new AbstractC14032d.b(EnumC3894b.PAIRING_FIRST_FLOW));
        return C23454a0.f92919a;
    }
}
