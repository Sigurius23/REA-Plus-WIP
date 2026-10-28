package sr2;

import a92.C0589a;
import al0.C0971f;
import android.content.Context;
import android.os.Build;
import ax1.C2120b;
import ci2.InterfaceC4733b;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryImpl;
import com.whoop.data.repositories.HealthMonitorRepository;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.OnboardingRepository;
import com.whoop.data.repositories.SettingsLandingRepository;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.C10535e;
import com.whoop.pairing.membershipAdjustment.api.MembershipAdjustmentApi;
import com.whoop.service.network.MembershipV2Api;
import com.whoop.settings.C10124m;
import cq0.C11054b;
import cq0.C11059g;
import cq0.C11060h;
import dt0.InterfaceC12361d;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import gp0.C16064a;
import gt0.InterfaceC16183e;
import hc2.C17153a;
import hc2.C17162j;
import hc2.C17164l;
import hf1.InterfaceC17235b;
import i92.InterfaceC18260e;
import in2.InterfaceC18732d;
import iw2.C21008c;
import j02.C21138e;
import j93.InterfaceC21461d;
import java.util.List;
import ka2.C22308a;
import l83.C23454a0;
import le1.C23876c;
import lg0.InterfaceC24033f;
import lm0.C24506a;
import nd1.InterfaceC26584j;
import nm2.C26847c;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq0.C27046i;
import oa2.C27757e;
import od1.C27858u;
import od1.InterfaceC27837a0;
import on2.C28049b;
import on2.C28050c;
import oq0.C28108e;
import oq0.C28114k;
import or2.C28144a0;
import or2.C28150c;
import or2.C28162g;
import or2.C28205u0;
import or2.InterfaceC28186o;
import org.koin.core.error.DefinitionParameterException;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p705ea2.C12901d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p92.C29020i;
import pf.AbstractC29125c;
import pm2.C29363d;
import pq0.C29468c;
import pq0.C29471f;
import pz1.C29647e;
import q92.C30076h;
import qe1.C30306d;
import qf3.C30330b;
import qm2.C30489f;
import qq0.C30548d;
import qv1.C30653d;
import qv1.C30655f;
import rf3.C31362a;
import rf3.C31365d;
import rq0.C31652b0;
import rq0.C31662e1;
import rq0.C31671h1;
import rq0.C31673i0;
import rq0.C31677k;
import rq0.C31705y;
import rv1.C31842a;
import sb0.C32345f;
import sc2.C32365d;
import sc2.C32380s;
import sx1.C33067c;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tm2.C33954a;
import tr2.InterfaceC34116n;
import u22.InterfaceC34493h;
import uf3.C34911a;
import vf3.C35953c;
import we1.InterfaceC37217a;
import wf3.C37247a;
import wm2.C37391a;
import wm2.C37392b;
import xf2.C38263a;
import xf3.C38266c;
import xs0.InterfaceC38638b;
import y42.C39228j;
import yk0.C39598a;
import z82.C40191e;
import z82.C40196j;
import z82.InterfaceC40188b;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: sr2.a0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsr2/a0;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32919a0 implements InterfaceC26584j {
    /* JADX INFO: renamed from: J */
    private static final C23454a0 m103385J(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C32939u c32939u = new C32939u(17);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C21138e.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c32939u, 1)), false);
        C32939u c32939u2 = new C32939u(19);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C37392b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c32939u2, 2)), false);
        C32939u c32939u3 = new C32939u(26);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C31705y.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c32939u3, 2)), false);
        C32939u c32939u4 = new C32939u(27);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C31652b0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c32939u4, 2)), false);
        C32939u c32939u5 = new C32939u(29);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C31677k.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c32939u5, 2)), false);
        C32944z c32944z = new C32944z(0);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C31673i0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c32944z, 2)), false);
        C32944z c32944z2 = new C32944z(1);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C31671h1.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c32944z2, 2)), false);
        C32944z c32944z3 = new C32944z(2);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C31662e1.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c32944z3, 2)), false);
        C32944z c32944z4 = new C32944z(3);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C30489f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c32944z4, 2)), false);
        C32944z c32944z5 = new C32944z(4);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C28108e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c32944z5, 2)), false);
        C32939u c32939u6 = new C32939u(28);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C28114k.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c32939u6, 2)), false);
        C32944z c32944z6 = new C32944z(5);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C26847c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c32944z6, 2)), false);
        C32944z c32944z7 = new C32944z(6);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C27046i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c32944z7, 2)), false);
        C32944z c32944z8 = new C32944z(7);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C10535e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c32944z8, 2)), false);
        C32944z c32944z9 = new C32944z(8);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C10124m.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c32944z9, 2)), false);
        C32944z c32944z10 = new C32944z(9);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C29363d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c32944z10, 2)), false);
        C32944z c32944z11 = new C32944z(10);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C17162j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c32944z11, 2)), false);
        C32944z c32944z12 = new C32944z(11);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C32380s.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c32944z12, 2)), false);
        C32944z c32944z13 = new C32944z(12);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C32365d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c32944z13, 2)), false);
        C32939u c32939u7 = new C32939u(18);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C16064a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c32939u7, 2)), false);
        C32939u c32939u8 = new C32939u(20);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C29471f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c32939u8, 2)), false);
        C32939u c32939u9 = new C32939u(21);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C29468c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c32939u9, 2)), false);
        C32939u c32939u10 = new C32939u(22);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C30548d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c32939u10, 2)), false);
        C32939u c32939u11 = new C32939u(23);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C17164l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass24, null, c32939u11, 2)), false);
        C32939u c32939u12 = new C32939u(24);
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(C17153a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass25, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass25, null, c32939u12, 2)), false);
        C32939u c32939u13 = new C32939u(25);
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(C12901d0.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass26, null, c32939u13, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass26, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C21138e m103386K(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C21138e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C37392b m103387L(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37392b((C33954a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33954a.class), null), (C37391a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37391a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C28114k m103388M(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("JoinTeamLandingViewModel");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28114k(interfaceC34116nM107848a, (C11054b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11054b.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C26847c m103389N(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26847c((FeatureFlagRepositoryImpl) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepositoryImpl.class), null), (PreferenceHelper) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC18732d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C27046i m103390O(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27046i((C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), InterfaceC34116n.INSTANCE.m107848a("CommunityLandingViewModel"), (C23876c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C23876c.class), null), (C30306d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30306d.class), null), (C30653d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30653d.class), null), (C30655f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30655f.class), null), null, (LanguageRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null), (C33067c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33067c.class), null), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C10535e m103391P(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("ConnectStrapViewModel");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C10535e(interfaceC34116nM107848a, (OnboardingRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingRepository.class), null), (C28150c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28150c.class), null), (RemoteDataSource) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(RemoteDataSource.class), null), (PreferenceHelper) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC33704b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (InterfaceC4733b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (MembershipAdjustmentApi) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipAdjustmentApi.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C10124m m103392Q(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C10124m((C31842a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null), (PreferenceHelper) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC40188b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class), null), (SettingsLandingRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(SettingsLandingRepository.class), null), (C32345f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32345f.class), null), (C29647e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29647e.class), null), (C38263a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38263a.class), null), (InterfaceC17235b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null), (C39598a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39598a.class), null), (AbstractC32943y) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (C21008c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21008c.class), null), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null), (C12901d0) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12901d0.class), null), null, null, 98304, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C29363d m103393R(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29363d((FeatureFlagRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC33704b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C28150c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28150c.class), null), (InterfaceC16183e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), (InterfaceC4733b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (C39228j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null), true, null, 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C17162j m103394S(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17162j((C31842a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null), (C27757e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27757e.class), null), (C22308a) viewModel.m122602a(new C28050c(it, 14), c22673i0.getOrCreateKotlinClass(C22308a.class), null), (FeatureFlagRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC14515a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C2120b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C2120b.class), null), (C17164l) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17164l.class), null), (InterfaceC24033f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC24033f.class), null), (InterfaceC34493h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34493h.class), null), (C17153a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17153a.class), null), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (C12901d0) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12901d0.class), null), null, 4096, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C34911a m103395T(C34911a c34911a) {
        return AbstractC15751g.m44431K(c34911a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C32380s m103396U(C38266c viewModel, C34911a params) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32380s((InterfaceC33704b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C28150c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28150c.class), null), (FeatureFlagRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC41070a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C30076h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (C28205u0) viewModel.m122602a(new C28049b(viewModel, 17), c22673i0.getOrCreateKotlinClass(C28205u0.class), null), (C24506a) viewModel.m122602a(new C28050c(params, 15), c22673i0.getOrCreateKotlinClass(C24506a.class), null), (C31842a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null), ((C28162g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null)).getSdkInt(), (InterfaceC12361d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12361d.class), null), (InterfaceC4733b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (StringsRepository) viewModel.m122602a(new C28050c(params, 16), c22673i0.getOrCreateKotlinClass(StringsRepository.class), new C35953c("stringRepo")), (C39228j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null), (InterfaceC38638b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC38638b.class), null), null, 32768, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C34911a m103397V(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C34911a m103398W(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C34911a m103399X(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C32365d m103400Y(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32365d((C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (InterfaceC4733b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C30076h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C16064a m103401Z(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Context context = (Context) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Context.class));
        return new C16064a((HealthMonitorRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthMonitorRepository.class), null), (StringsRepository) viewModel.m122602a(new C0971f(context, 12), c22673i0.getOrCreateKotlinClass(StringsRepository.class), new C35953c("stringRepo")), (C27858u) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C29020i) viewModel.m122602a(new C32940v(1), c22673i0.getOrCreateKotlinClass(C29020i.class), null), (C28144a0) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28144a0.class), null), (InterfaceC40188b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class), null), (InterfaceC16183e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), null, null, 384, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C34911a m103403a0(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C34911a m103405b0() {
        return AbstractC15751g.m44431K(56);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C31705y m103407c0(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Context context = (Context) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Context.class));
        return new C31705y((C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), InterfaceC34116n.INSTANCE.m107848a("TeamCreateViewModel"), (FeatureFlagRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (StringsRepository) viewModel.m122602a(new C0971f(context, 11), c22673i0.getOrCreateKotlinClass(StringsRepository.class), new C35953c("stringRepo")), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C34911a m103409d0(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C29471f m103411e0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29471f((C11060h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11060h.class), null), (C27858u) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), InterfaceC34116n.INSTANCE.m107848a("GlobalShareDialogViewModel"), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static final C29468c m103413f0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C29468c(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C30548d m103415g0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30548d((C11060h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11060h.class), null), (C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), InterfaceC34116n.INSTANCE.m107848a("SelectTeamViewModel"), (C27858u) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static final C17164l m103417h0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17164l((MembershipV2Api) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(MembershipV2Api.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C17153a m103419i0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17153a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C12901d0 m103421j0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12901d0((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C31652b0 m103423k0(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Context context = (Context) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Context.class));
        return new C31652b0((StringsRepository) viewModel.m122602a(new C0971f(context, 10), c22673i0.getOrCreateKotlinClass(StringsRepository.class), new C35953c("stringRepo")), (C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (InterfaceC34116n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (C27858u) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (FeatureFlagRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C34911a m103425l0(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C31677k m103427m0(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Context context = (Context) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Context.class));
        return new C31677k((C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (C31842a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (StringsRepository) viewModel.m122602a(new C0971f(context, 13), c22673i0.getOrCreateKotlinClass(StringsRepository.class), new C35953c("stringRepo")), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C34911a m103429n0(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C31673i0 m103431o0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C31673i0((C11059g) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11059g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C31671h1 m103433p0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31671h1((C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), InterfaceC34116n.INSTANCE.m107848a("TeamsViewModel"), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C31662e1 m103435q0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31662e1((C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (InterfaceC34116n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C30489f m103437r0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30489f((C0589a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C0589a.class), null), (InterfaceC27837a0) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC34116n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (C28150c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28150c.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), Build.VERSION.SDK_INT, (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (InterfaceC28186o) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28186o.class), null), (C40196j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40196j.class), null), ((Boolean) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(Boolean.class), new C35953c("testFlag"))).booleanValue(), (C30076h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null), (InterfaceC14515a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (InterfaceC33704b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), null, DfuBaseService.ERROR_REMOTE_MASK, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C28108e m103439s0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28108e((C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), InterfaceC34116n.INSTANCE.m107848a("InviteCodeViewModel"), (StringsRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(StringsRepository.class), new C35953c("incorrectStringsRepo")), (C11054b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11054b.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), null, null, 192, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m103385J(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
