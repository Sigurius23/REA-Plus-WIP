package sv1;

import ad3.AbstractC0757c;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.health.platform.client.proto.C1533u;
import ao1.C1871f;
import ax1.C2120b;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bx1.C3689c;
import c93.InterfaceC4351m;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.membership.comunityraf.CommunityRafApi;
import com.whoop.membership.domain.upcycle.UpcycleApi;
import com.whoop.membership.extensions.domain.MembershipExtensionApi;
import com.whoop.membership.familyPlan.domain.api.FamilyPlanApi;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonTableModel;
import com.whoop.membership.familyPlan.domain.model.items.DividedCardButtons;
import com.whoop.membership.familyPlan.domain.model.items.SendEmailInviteModel;
import com.whoop.membership.familyPlan.navigation.C9114b;
import com.whoop.membership.management.domain.api.MembershipManagementApi;
import com.whoop.membership.management.domain.models.items.DowngradeMembershipCardModel;
import com.whoop.membership.management.domain.models.items.MembershipAdjustmentCheckoutHeaderModel;
import com.whoop.membership.management.domain.models.items.MembershipCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutRadioOptionModel;
import com.whoop.membership.management.domain.models.items.MembershipFeaturesCardModel;
import com.whoop.membership.management.navigation.C9128c;
import com.whoop.membership.reactivationmodal.domain.ReactivationModalApi;
import com.whoop.membership.returns.domain.ReturnsApi;
import com.whoop.membership.view.upcycle.C9144a;
import cx1.C11179b;
import dx1.C12429c;
import ew1.C13722a;
import ex1.C13729c;
import fi0.InterfaceC14515a;
import fw1.C14837d;
import fx1.C14848d;
import ge3.AbstractC15751g;
import h32.InterfaceC16828a;
import hw1.C17703b;
import ih0.AbstractC18489d0;
import iw1.C21002h;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jw1.C21993a;
import jx1.C22005a0;
import jx1.C22011d0;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kx1.C22883d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nw1.C27209a;
import o02.InterfaceC27353d;
import or2.C28144a0;
import or2.C28176k1;
import org.koin.core.error.DefinitionParameterException;
import ow1.C28437b;
import ox1.C28454b;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p742vw1.C36545d;
import pg3.AbstractC29199m;
import pg3.C29222x0;
import pw1.C29588d;
import q22.C29855e;
import q83.InterfaceC30057d;
import qf3.C30330b;
import qv1.C30653d;
import qv1.C30655f;
import qw1.C30690d;
import qw1.C30692f;
import qw2.C30695c;
import qx1.C30759f;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rf3.C31362a;
import rf3.C31365d;
import rv1.C31842a;
import rx1.C31903a;
import sr2.AbstractC32943y;
import sr2.C32944z;
import sx1.C33067c;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import tv1.C34206b;
import tw1.C34220a;
import u22.InterfaceC34486a;
import u82.C34643d;
import u82.C34644e;
import ud3.C34824k0;
import ud3.C34826l0;
import uf3.C34911a;
import uw1.C35309b;
import uw1.C35313f;
import ux1.C35369c;
import v82.C35799a;
import vf3.C35953c;
import vx1.C36559b;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wx1.C37685c;
import wx1.C37686d;
import xf3.C38266c;
import xx1.C38691a;
import yx1.C39844e;
import zx1.C41207a;

/* JADX INFO: renamed from: sv1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lsv1/c;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33037c implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: sv1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC34486a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C38266c f137591a;

        public a(C38266c c38266c) {
            this.f137591a = c38266c;
        }

        @Override // u22.InterfaceC34486a
        /* JADX INFO: renamed from: a */
        public final Object mo95014a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM98950u = ((C31842a) this.f137591a.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31842a.class), null)).m98950u(interfaceC30057d);
            return objM98950u == EnumC31071a.f128113w ? objM98950u : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C13729c m104312A0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13729c((MembershipManagementApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipManagementApi.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (C2120b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C2120b.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C14848d m104314B0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14848d((MembershipManagementApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipManagementApi.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (InterfaceC16828a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16828a.class), null), null, (C2120b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C2120b.class), null), (BannerInvalidator) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BannerInvalidator.class), null), null, 72, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final MembershipExtensionApi m104316C0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "defaultOkHttpClient");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), c35953cM73387t)).m109897a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c34824k0M109897a.m109895e(15L, timeUnit);
        c34824k0M109897a.m109892b(15L, timeUnit);
        c34824k0M109897a.m109896f(15L, timeUnit);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC29199m.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, "MembershipConverterFactory")));
        c29222x0.f118281a = new C34826l0(c34824k0M109897a);
        Object objM88733b = c29222x0.m88730d().m88733b(MembershipExtensionApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (MembershipExtensionApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C12429c m104318D0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12429c((MembershipManagementApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipManagementApi.class), null), (C2120b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C2120b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C3689c m104320E0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3689c((MembershipManagementApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipManagementApi.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (InterfaceC16828a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16828a.class), null), (BannerInvalidator) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BannerInvalidator.class), null), null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C22883d m104322F0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22883d((C29855e) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29855e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C11179b m104324G0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C11179b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C22005a0 m104326H0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22005a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C9128c m104328I0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C9128c((AbstractC12939a0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class)), (C12991u0) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(C12991u0.class)), (InterfaceC27353d) c34911a.m110110a(2, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class)), (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(3, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 16), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (C2120b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C2120b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C34911a m104330J0(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C2120b m104332K0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C2120b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C22011d0 m104334L0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22011d0((C13729c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13729c.class), null), (C14848d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14848d.class), null), (C12429c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12429c.class), null), (C3689c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3689c.class), null), (C11179b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11179b.class), null), (C22005a0) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22005a0.class), null), (C22883d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22883d.class), null), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public static final C34206b m104336M0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34206b((UpcycleApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(UpcycleApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C30759f m104338N0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30759f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final UpcycleApi m104340O0(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC29199m.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "MembershipConverterFactory")));
        return (UpcycleApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), UpcycleApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C28454b m104342P0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28454b((AbstractC12939a0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class)), (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 13), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C34911a m104344Q0(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C31903a m104346R0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31903a((C34206b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34206b.class), null), (C30759f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30759f.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C9144a m104348S0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C9144a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final ReturnsApi m104350T0(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC29199m.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "MembershipConverterFactory")));
        return (ReturnsApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), ReturnsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C37685c m104352U0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37685c((ReturnsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ReturnsApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ReturnsInteractorLogger"), (C37686d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37686d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C36559b m104354V0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36559b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C37686d m104356W0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        FileDownloaderApi fileDownloaderApi = (FileDownloaderApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FileDownloaderApi.class), null);
        C28144a0 c28144a0 = (C28144a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28144a0.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("ReturnsPdfHandlerLogger");
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C37686d(fileDownloaderApi, c28144a0, interfaceC34116nM107848a, ExecutorC22364d.f87316w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C38691a m104358X0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38691a((AbstractC12939a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class), null), (C28176k1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28176k1.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C41207a m104360Y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41207a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C39844e m104362Z0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39844e((C37685c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37685c.class), null), (C41207a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41207a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final CommunityRafApi m104365a1(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC29199m.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "MembershipConverterFactory")));
        return (CommunityRafApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), CommunityRafApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final ReactivationModalApi m104368b1(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC29199m.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "MembershipConverterFactory")));
        return (ReactivationModalApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), ReactivationModalApi.class, "create(...)");
    }

    /* JADX INFO: renamed from: c0 */
    private static final C23454a0 m104370c0(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "membership-feature-models");
        C32944z c32944z = new C32944z(13);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c32944z, 2)), false);
        C32944z c32944z2 = new C32944z(15);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC34486a.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass2, null, c32944z2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false, "MembershipConverterFactory");
        C32944z c32944z3 = new C32944z(27);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C34643d.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass3, c35953cM53379t, c32944z3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM53379t, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(AbstractC29199m.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        final int i13 = 9;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(MembershipExtensionApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, interfaceC4351m, 1)), false);
        final int i14 = 21;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(UpcycleApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, interfaceC4351m2, 2)), false);
        final int i15 = 22;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(CommunityRafApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, interfaceC4351m3, 2)), false);
        final int i16 = 23;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(ReactivationModalApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, interfaceC4351m4, 1)), false);
        final int i17 = 24;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(MembershipManagementApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, interfaceC4351m5, 2)), false);
        final int i18 = 25;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(FamilyPlanApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, interfaceC4351m6, 2)), false);
        final int i19 = 26;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C14837d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, interfaceC4351m7, 2)), false);
        C32944z c32944z4 = new C32944z(24);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C21993a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c32944z4, 2)), false);
        final int i24 = 5;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C17703b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, interfaceC4351m8, 2)), false);
        final int i25 = 16;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C21002h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, interfaceC4351m9, 2)), false);
        final int i26 = 27;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C13722a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, interfaceC4351m10, 2)), false);
        final int i27 = 28;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C33067c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass15, null, interfaceC4351m11, 1)), false);
        final int i28 = 29;
        C30330b c30330b2 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35369c.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b2.f124471b, null, c35953c), new C31362a(c30330b2), false);
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30692f.class), null, new C33036b(0), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b3.f124471b, null, c35953c), new C31362a(c30330b3), false);
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27209a.class), null, new C33036b(1), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c), new C31362a(c30330b4), false);
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34220a.class), null, new C33036b(2), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), new C31362a(c30330b5), false);
        C30330b c30330b6 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35309b.class), null, new C32944z(14), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b6.f124471b, null, c35953c), new C31362a(c30330b6), false);
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36545d.class), null, new C32944z(16), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31362a(c30330b7), false);
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29588d.class), null, new C32944z(17), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30690d.class), null, new C32944z(18), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31362a(c30330b9), false);
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28437b.class), null, new C32944z(19), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31362a(c30330b10), false);
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35313f.class), null, new C32944z(20), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C9114b.class), null, new C32944z(21), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30653d.class), null, new C32944z(22), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30655f.class), null, new C32944z(23), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C13729c.class), null, new C32944z(25), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C14848d.class), null, new C32944z(26), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C12429c.class), null, new C32944z(28), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31362a(c30330b17), false);
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C3689c.class), null, new C32944z(29), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31362a(c30330b18), false);
        final int i29 = 0;
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22883d.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), new C31362a(c30330b19), false);
        final int i34 = 1;
        C30330b c30330b20 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C11179b.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b20.f124471b, null, c35953c), new C31362a(c30330b20), false);
        final int i35 = 2;
        C30330b c30330b21 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22005a0.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b21.f124471b, null, c35953c), new C31362a(c30330b21), false);
        final int i36 = 3;
        C30330b c30330b22 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C9128c.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b22.f124471b, null, c35953c), new C31362a(c30330b22), false);
        final int i37 = 4;
        C30330b c30330b23 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C2120b.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b23.f124471b, null, c35953c), new C31362a(c30330b23), false);
        final int i38 = 6;
        C30330b c30330b24 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22011d0.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b24.f124471b, null, c35953c), new C31362a(c30330b24), false);
        final int i39 = 7;
        C30330b c30330b25 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34206b.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b25.f124471b, null, c35953c), new C31362a(c30330b25), false);
        final int i44 = 8;
        C30330b c30330b26 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30759f.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b26.f124471b, null, c35953c), new C31362a(c30330b26), false);
        final int i45 = 10;
        C30330b c30330b27 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28454b.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b27.f124471b, null, c35953c), new C31362a(c30330b27), false);
        final int i46 = 11;
        C30330b c30330b28 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C31903a.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b28.f124471b, null, c35953c), new C31362a(c30330b28), false);
        final int i47 = 12;
        C30330b c30330b29 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C9144a.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b29.f124471b, null, c35953c), new C31362a(c30330b29), false);
        final int i48 = 13;
        C30330b c30330b30 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(ReturnsApi.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b30.f124471b, null, c35953c), new C31362a(c30330b30), false);
        final int i49 = 14;
        C30330b c30330b31 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37685c.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b31.f124471b, null, c35953c), new C31362a(c30330b31), false);
        final int i54 = 15;
        C30330b c30330b32 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36559b.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b32.f124471b, null, c35953c), new C31362a(c30330b32), false);
        final int i55 = 17;
        C30330b c30330b33 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37686d.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b33.f124471b, null, c35953c), new C31362a(c30330b33), false);
        final int i56 = 18;
        C30330b c30330b34 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38691a.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b34.f124471b, null, c35953c), new C31362a(c30330b34), false);
        final int i57 = 19;
        C30330b c30330b35 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41207a.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b35.f124471b, null, c35953c), new C31362a(c30330b35), false);
        final int i58 = 20;
        C30330b c30330b36 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C39844e.class), null, new InterfaceC4351m() { // from class: sv1.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C33037c.m104322F0(c38266c, c34911a);
                    case 1:
                        return C33037c.m104324G0(c38266c, c34911a);
                    case 2:
                        return C33037c.m104326H0(c38266c, c34911a);
                    case 3:
                        return C33037c.m104328I0(c38266c, c34911a);
                    case 4:
                        return C33037c.m104332K0(c38266c, c34911a);
                    case 5:
                        return C33037c.m104381g0(c38266c, c34911a);
                    case 6:
                        return C33037c.m104334L0(c38266c, c34911a);
                    case 7:
                        return C33037c.m104336M0(c38266c, c34911a);
                    case 8:
                        return C33037c.m104338N0(c38266c, c34911a);
                    case 9:
                        return C33037c.m104316C0(c38266c, c34911a);
                    case 10:
                        return C33037c.m104342P0(c38266c, c34911a);
                    case 11:
                        return C33037c.m104346R0(c38266c, c34911a);
                    case 12:
                        return C33037c.m104348S0(c38266c, c34911a);
                    case 13:
                        return C33037c.m104350T0(c38266c, c34911a);
                    case 14:
                        return C33037c.m104352U0(c38266c, c34911a);
                    case 15:
                        return C33037c.m104354V0(c38266c, c34911a);
                    case 16:
                        return C33037c.m104385i0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C33037c.m104356W0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C33037c.m104358X0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C33037c.m104360Y0(c38266c, c34911a);
                    case 20:
                        return C33037c.m104362Z0(c38266c, c34911a);
                    case 21:
                        return C33037c.m104340O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C33037c.m104365a1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C33037c.m104368b1(c38266c, c34911a);
                    case 24:
                        return C33037c.m104371c1(c38266c, c34911a);
                    case 25:
                        return C33037c.m104374d1(c38266c, c34911a);
                    case 26:
                        return C33037c.m104377e1(c38266c, c34911a);
                    case 27:
                        return C33037c.m104387j0(c38266c, c34911a);
                    case 28:
                        return C33037c.m104389k0(c38266c, c34911a);
                    default:
                        return C33037c.m104391l0(c38266c, c34911a);
                }
            }
        }, 2);
        AbstractC25012a.m73393z(c30330b36, c33768a, AbstractC21598x.m60669Y(c30330b36.f124471b, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final MembershipManagementApi m104371c1(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC29199m.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "MembershipConverterFactory")));
        return (MembershipManagementApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), MembershipManagementApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final Map m104373d0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("MEMBERSHIP_CARD", c22673i0.getOrCreateKotlinClass(MembershipCardModel.class)), new C23465k("ADJUST_MEMBERSHIP_HEADER", c22673i0.getOrCreateKotlinClass(MembershipAdjustmentCheckoutHeaderModel.class)), new C23465k("MEMBERSHIP_CHECKOUT_CARD", c22673i0.getOrCreateKotlinClass(MembershipCheckoutCardModel.class)), new C23465k("DOWNGRADE_MEMBERSHIP_CARD", c22673i0.getOrCreateKotlinClass(DowngradeMembershipCardModel.class)), new C23465k("MEMBERSHIP_FEATURES_CARD", c22673i0.getOrCreateKotlinClass(MembershipFeaturesCardModel.class)), new C23465k("MEMBERSHIP_CHECKOUT_RADIO_OPTION", c22673i0.getOrCreateKotlinClass(MembershipCheckoutRadioOptionModel.class)), new C23465k("DIVIDED_CARD_BUTTONS", c22673i0.getOrCreateKotlinClass(DividedCardButtons.class)), new C23465k("SEND_EMAIL_INVITE", c22673i0.getOrCreateKotlinClass(SendEmailInviteModel.class)), new C23465k("COMPARISON_TABLE", c22673i0.getOrCreateKotlinClass(ComparisonTableModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final FamilyPlanApi m104374d1(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC29199m.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "MembershipConverterFactory")));
        return (FamilyPlanApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), FamilyPlanApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final InterfaceC34486a m104376e0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new a(single);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C14837d m104377e1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14837d((MembershipExtensionApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipExtensionApi.class), null), null, (InterfaceC16828a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16828a.class), null), null, (C31842a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null), (PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (C13722a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13722a.class), null), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C21993a m104379f0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21993a((C13722a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13722a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C17703b m104381g0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class));
        return new C17703b((InterfaceC21159o0) factory.m122602a(new C1871f(abstractActivityC1340r0, 14), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (AbstractC12939a0) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C34911a m104383h0(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C21002h m104385i0(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C14837d c14837d = (C14837d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14837d.class), null);
        C21993a c21993a = (C21993a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21993a.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C17703b.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C17703b.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C21002h(c14837d, c21993a, null, (C17703b) objM110111b, (C13722a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13722a.class), null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C13722a m104387j0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13722a((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C33067c m104389k0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33067c((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C31842a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C35369c m104391l0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C35369c((C33067c) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33067c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static final C30692f m104393m0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30692f(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C27209a m104395n0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27209a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C34220a m104397o0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34220a((C27209a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27209a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C35309b m104399p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35309b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C34643d m104401q0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "membership-feature-models");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), map, null, 2, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null);
        Set<String> setM34570S = AbstractC12350b.m34570S("kt-serialization-membership");
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        return c34644e.m109481a(gsonCreate, abstractC0757cM20380e, setM34570S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C36545d m104403r0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36545d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public static final C29588d m104405s0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29588d((FamilyPlanApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FamilyPlanApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C30690d m104407t0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30690d((FamilyPlanApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FamilyPlanApi.class), null), (C30692f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30692f.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C28437b m104409u0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28437b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C35313f m104411v0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35313f((C29588d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29588d.class), null), (C30690d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30690d.class), null), (C28437b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28437b.class), null), (C35309b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35309b.class), null), (C36545d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36545d.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C9114b m104413w0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C9114b((AbstractC12939a0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class)), (C12991u0) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(C12991u0.class)), (InterfaceC27353d) c34911a.m110110a(2, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class)), (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(3, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 15), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), null, (C27209a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27209a.class), null), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C34911a m104415x0(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C30653d m104417y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30653d((CommunityRafApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(CommunityRafApi.class), null), InterfaceC34116n.INSTANCE.m107848a("CommunityRafInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C30655f m104419z0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30655f();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m104370c0(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
