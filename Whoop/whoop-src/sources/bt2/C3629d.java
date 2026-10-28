package bt2;

import ad3.AbstractC0757c;
import androidx.health.platform.client.proto.C1533u;
import ao1.C1873h;
import bh2.C3252a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.items.PlanTileModel;
import com.whoop.weeklyplan.api.ChallengeLandingCustomPlanCard;
import com.whoop.weeklyplan.api.WeeklyPlanApi;
import com.whoop.weeklyplan.api.WeeklyPlanChallengeApi;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometile;
import com.whoop.weeklyplan.weeklyplan.domain.models.AddGoalCard;
import com.whoop.weeklyplan.weeklyplan.domain.models.LoggedRecoveries;
import ct2.C11111c;
import et2.C13599a;
import fi0.InterfaceC14515a;
import ft2.C14773a;
import ge3.AbstractC15751g;
import gt2.C16206d;
import ih0.AbstractC18489d0;
import it2.C20931a;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jt2.C21943e;
import jt2.C21944f;
import jt2.C21945g;
import jt2.C21947i;
import jt2.C21949k;
import jt2.C21952n;
import jt2.C21953o;
import jt2.C21955q;
import l83.C23454a0;
import l83.C23465k;
import ls2.C24717b;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import ns2.C27107c;
import nt2.C27133c;
import org.koin.core.error.DefinitionParameterException;
import ot2.C28338g;
import ot2.C28339h;
import ot2.C28341j;
import ot2.C28342k;
import ot2.C28343l;
import ot2.C28345n;
import ot2.C28346o;
import ot2.C28350s;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import ps2.C29506b;
import qf3.C30330b;
import qs2.C30577b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import ss2.C32954e;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import tt2.C34165c;
import tt2.C34168f;
import tt2.C34170h;
import tt2.C34173k;
import tw0.C34215a;
import u82.AbstractC34645f;
import u82.C34648i;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import us2.C35224e;
import us2.C35226g;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wm0.C37378a;
import ws2.C37610b;
import ws2.C37611c;
import ws2.C37614f;
import wt2.C37629j;
import wt2.C37635p;
import xf3.C38266c;
import xt2.C38647a;
import xt2.C38650d;
import ys2.C39757d;
import zr2.InterfaceC41070a;
import zs2.C41077a;
import zs2.C41078b;
import zs2.C41079c;
import zs2.C41080d;
import zs2.C41081e;
import zs2.C41083g;
import zs2.C41084h;
import zs2.C41086j;
import zs2.C41087k;
import zs2.C41088l;
import zs2.C41089m;
import zs2.C41090n;
import zs2.C41091o;
import zs2.C41093q;

/* JADX INFO: renamed from: bt2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lbt2/d;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3629d implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f14780c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C41093q m11018A0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41093q((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C38650d m11019A1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38650d((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final InterfaceC34640a m11021B0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34648i((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("weekly-plan-cache-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final C34170h m11022B1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34170h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C41086j m11024C0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41086j((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final C37635p m11025C1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37635p((C34173k) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34173k.class), null), (C34165c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34165c.class), null), (C38650d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38650d.class), null), (C34170h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34170h.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C41078b m11027D0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41078b((C34215a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34215a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C41083g m11029E0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41083g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C41084h m11031F0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41084h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C41081e m11033G0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41081e((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C41080d m11035H0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41080d((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C41091o m11037I0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41091o((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C41079c m11039J0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41079c((C41090n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41090n.class), null), (C41087k) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41087k.class), null), (C41088l) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41088l.class), null), (C41077a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41077a.class), null), (C41078b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41078b.class), null), (C41093q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41093q.class), null), (C41089m) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41089m.class), null), (C41086j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41086j.class), null), (C41081e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41081e.class), null), (C41080d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41080d.class), null), (C41091o) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41091o.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C24717b m11041K0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24717b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C27133c m11043L0(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C20931a c20931a = (C20931a) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(C20931a.class));
        return new C27133c(null, (C21949k) viewModel.m122602a(new C3628c(c20931a, 0), c22673i0.getOrCreateKotlinClass(C21949k.class), null), (C28345n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28345n.class), null), c20931a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C34911a m11045M0(C20931a c20931a) {
        return AbstractC15751g.m44431K(c20931a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final WeeklyPlanApi m11047N0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "weekly-plan-cache-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        return (WeeklyPlanApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), WeeklyPlanApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C28345n m11049O0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28345n((C28338g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28338g.class), null), (C28339h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28339h.class), null), (C28343l) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28343l.class), null), (C28341j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28341j.class), null), (C28342k) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28342k.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C28350s m11051P0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28350s((C21955q) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21955q.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C28338g m11053Q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28338g((C28350s) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28350s.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C28339h m11055R0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28339h((C28350s) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28350s.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C28343l m11057S0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28343l((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), (C28346o) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28346o.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C28346o m11059T0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28346o((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C28341j m11061U0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28341j((C34215a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34215a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C28342k m11063V0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28342k((C34215a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34215a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C21949k m11065W0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C20931a.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C20931a.class, new StringBuilder("No value found for type '"), '\''));
        }
        C20931a c20931a = (C20931a) objM110111b;
        return new C21949k((C21944f) factory.m122602a(new C3628c(c20931a, 1), c22673i0.getOrCreateKotlinClass(C21944f.class), null), (C21952n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21952n.class), null), (C21953o) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21953o.class), null), (C21943e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21943e.class), null), (C21945g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21945g.class), null), (C21947i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21947i.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), c20931a.getLocked(), c20931a.getInitialSelection(), c20931a.getSource(), c20931a.getPresetPlanCategory(), c20931a.getPlanTitle(), c20931a.getDescription(), c20931a.getExplanationTitle(), c20931a.getExplanation(), c20931a.getTemplateId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C34911a m11067X0(C20931a c20931a) {
        return AbstractC15751g.m44431K(c20931a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C21944f m11069Y0(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof C20931a)) {
                next = null;
            }
        } while (next == null);
        C20931a c20931a = (C20931a) next;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21944f((WeeklyPlanApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeeklyPlanApi.class), null), InterfaceC34116n.INSTANCE.m107848a("HubAndSpokeApiInteractor"), (C24717b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24717b.class), null), c20931a != null ? c20931a.getCategory() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final WeeklyPlanChallengeApi m11071Z0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(single, AbstractC25247g0.m73989X(new C23465k("ARCH_MINI_AI_PLANS", c22673i0.getOrCreateKotlinClass(ChallengeLandingCustomPlanCard.class))), null, null, null, null, 30, null);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757cM20380e));
        return (WeeklyPlanChallengeApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), WeeklyPlanChallengeApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C21953o m11074a1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21953o((C24717b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C21943e m11077b1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21943e((C24717b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C21945g m11080c1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21945g((C24717b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C21952n m11083d1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21952n((C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), (C24717b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24717b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C21947i m11086e1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21947i((C24717b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C21955q m11089f1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21955q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C11111c m11092g1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C11111c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C13599a m11095h1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13599a((WeeklyPlanApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeeklyPlanApi.class), null), (InterfaceC26834e) factory.m122602a(new C1873h(factory, 4), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C11111c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C11111c.class), null), InterfaceC34116n.INSTANCE.m107848a("WeeklyPlanHomeTileApiInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C34911a m11098i1(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("weekly-plan-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C16206d m11101j1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C16206d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C14773a m11104k1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14773a((C13599a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13599a.class), null), (C16206d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C16206d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C34173k m11107l1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34173k((WeeklyPlanApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeeklyPlanApi.class), null), (InterfaceC26834e) factory.m122602a(new C1873h(factory, 2), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C24717b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24717b.class), null), InterfaceC34116n.INSTANCE.m107848a("WeeklyPlanInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C34911a m11110m1(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("weekly-plan-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C34168f m11113n1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34168f((WeeklyPlanApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeeklyPlanApi.class), null), InterfaceC34116n.INSTANCE.m107848a("SummaryV2Interactor"), (C24717b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24717b.class), null));
    }

    /* JADX INFO: renamed from: o0 */
    private static final C23454a0 m11115o0(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "weekly-plan-cache-mapping");
        C3252a c3252a = new C3252a(11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c3252a, 2);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(c30330b, c33768a, AbstractC21598x.m60669Y(c30330b.f124471b, c35953cM73386s, c35953c), false, "weekly-plan-cache-json");
        C30330b c30330b2 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73385r, new C3252a(13), 1);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(c30330b2, c33768a, AbstractC21598x.m60669Y(c30330b2.f124471b, c35953cM73385r, c35953c), false, "weekly-plan-bff-cache-deserializer");
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), c35953cM53379t, new C3252a(25), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b3.f124471b, c35953cM53379t, c35953c), new C31362a(c30330b3), false);
        final int i13 = 7;
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(WeeklyPlanApi.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 1);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c), new C31365d(c30330b4), false);
        final int i14 = 19;
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(WeeklyPlanChallengeApi.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 1);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), new C31365d(c30330b5), false);
        C30330b c30330b6 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34173k.class), null, new C3627b(0), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b6.f124471b, null, c35953c), new C31362a(c30330b6), false);
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34165c.class), null, new C3627b(1), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31362a(c30330b7), false);
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38650d.class), null, new C3627b(2), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34170h.class), null, new C3627b(3), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31362a(c30330b9), false);
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37635p.class), null, new C3627b(4), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31362a(c30330b10), false);
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37610b.class), null, new C3252a(22), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        final int i15 = 3;
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37614f.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        final int i16 = 14;
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37611c.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        final int i17 = 25;
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C39757d.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41087k.class), null, new C3627b(5), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41088l.class), null, new C3627b(6), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41089m.class), null, new C3627b(7), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31362a(c30330b17), false);
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41090n.class), null, new C3627b(8), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31362a(c30330b18), false);
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41077a.class), null, new C3627b(9), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), new C31362a(c30330b19), false);
        C30330b c30330b20 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41093q.class), null, new C3252a(12), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b20.f124471b, null, c35953c), new C31362a(c30330b20), false);
        C30330b c30330b21 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41086j.class), null, new C3252a(14), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b21.f124471b, null, c35953c), new C31362a(c30330b21), false);
        C30330b c30330b22 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41078b.class), null, new C3252a(15), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b22.f124471b, null, c35953c), new C31362a(c30330b22), false);
        C30330b c30330b23 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41083g.class), null, new C3252a(16), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b23.f124471b, null, c35953c), new C31362a(c30330b23), false);
        C30330b c30330b24 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41084h.class), null, new C3252a(17), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b24.f124471b, null, c35953c), new C31362a(c30330b24), false);
        C30330b c30330b25 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41081e.class), null, new C3252a(18), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b25.f124471b, null, c35953c), new C31362a(c30330b25), false);
        C30330b c30330b26 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41080d.class), null, new C3252a(19), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b26.f124471b, null, c35953c), new C31362a(c30330b26), false);
        C30330b c30330b27 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41091o.class), null, new C3252a(20), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b27.f124471b, null, c35953c), new C31362a(c30330b27), false);
        C30330b c30330b28 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41079c.class), null, new C3252a(21), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b28.f124471b, null, c35953c), new C31362a(c30330b28), false);
        C30330b c30330b29 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24717b.class), null, new C3252a(23), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b29.f124471b, null, c35953c), new C31362a(c30330b29), false);
        C30330b c30330b30 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27133c.class), null, new C3252a(24), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b30.f124471b, null, c35953c), new C31362a(c30330b30), false);
        C30330b c30330b31 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28345n.class), null, new C3252a(26), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b31.f124471b, null, c35953c), new C31362a(c30330b31), false);
        C30330b c30330b32 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28350s.class), null, new C3252a(27), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b32.f124471b, null, c35953c), new C31362a(c30330b32), false);
        C30330b c30330b33 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28338g.class), null, new C3252a(28), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b33.f124471b, null, c35953c), new C31362a(c30330b33), false);
        C30330b c30330b34 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28339h.class), null, new C3252a(29), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b34.f124471b, null, c35953c), new C31362a(c30330b34), false);
        final int i18 = 0;
        C30330b c30330b35 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28343l.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b35.f124471b, null, c35953c), new C31362a(c30330b35), false);
        final int i19 = 1;
        C30330b c30330b36 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28346o.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b36.f124471b, null, c35953c), new C31362a(c30330b36), false);
        final int i24 = 2;
        C30330b c30330b37 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28341j.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b37.f124471b, null, c35953c), new C31362a(c30330b37), false);
        final int i25 = 4;
        C30330b c30330b38 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28342k.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b38.f124471b, null, c35953c), new C31362a(c30330b38), false);
        final int i26 = 5;
        C30330b c30330b39 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21949k.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b39.f124471b, null, c35953c), new C31362a(c30330b39), false);
        final int i27 = 6;
        C30330b c30330b40 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21944f.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b40.f124471b, null, c35953c), new C31362a(c30330b40), false);
        final int i28 = 8;
        C30330b c30330b41 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21953o.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b41.f124471b, null, c35953c), new C31362a(c30330b41), false);
        final int i29 = 9;
        C30330b c30330b42 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21943e.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b42.f124471b, null, c35953c), new C31362a(c30330b42), false);
        final int i34 = 10;
        C30330b c30330b43 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21945g.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b43.f124471b, null, c35953c), new C31362a(c30330b43), false);
        final int i35 = 11;
        C30330b c30330b44 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21952n.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b44.f124471b, null, c35953c), new C31362a(c30330b44), false);
        final int i36 = 12;
        C30330b c30330b45 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21947i.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b45.f124471b, null, c35953c), new C31362a(c30330b45), false);
        final int i37 = 13;
        C30330b c30330b46 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21955q.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b46.f124471b, null, c35953c), new C31362a(c30330b46), false);
        final int i38 = 15;
        C30330b c30330b47 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C11111c.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 1);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b47.f124471b, null, c35953c), new C31365d(c30330b47), false);
        final int i39 = 16;
        C30330b c30330b48 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C13599a.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b48.f124471b, null, c35953c), new C31362a(c30330b48), false);
        final int i44 = 17;
        C30330b c30330b49 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C16206d.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b49.f124471b, null, c35953c), new C31362a(c30330b49), false);
        final int i45 = 18;
        C30330b c30330b50 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C14773a.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b50.f124471b, null, c35953c), new C31362a(c30330b50), false);
        final int i46 = 20;
        C30330b c30330b51 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34168f.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b51.f124471b, null, c35953c), new C31362a(c30330b51), false);
        final int i47 = 21;
        C30330b c30330b52 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38647a.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b52.f124471b, null, c35953c), new C31362a(c30330b52), false);
        final int i48 = 22;
        C30330b c30330b53 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37629j.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b53.f124471b, null, c35953c), new C31362a(c30330b53), false);
        final int i49 = 23;
        C30330b c30330b54 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27107c.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b54.f124471b, null, c35953c), new C31362a(c30330b54), false);
        final int i54 = 24;
        C30330b c30330b55 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30577b.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b55.f124471b, null, c35953c), new C31362a(c30330b55), false);
        final int i55 = 26;
        C30330b c30330b56 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29506b.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b56.f124471b, null, c35953c), new C31362a(c30330b56), false);
        final int i56 = 27;
        C30330b c30330b57 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C32954e.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b57.f124471b, null, c35953c), new C31362a(c30330b57), false);
        final int i57 = 28;
        C30330b c30330b58 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35226g.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b58.f124471b, null, c35953c), new C31362a(c30330b58), false);
        final int i58 = 29;
        C30330b c30330b59 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35224e.class), null, new InterfaceC4351m() { // from class: bt2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C3629d.m11057S0(c38266c, c34911a);
                    case 1:
                        return C3629d.m11059T0(c38266c, c34911a);
                    case 2:
                        return C3629d.m11061U0(c38266c, c34911a);
                    case 3:
                        return C3629d.m11127s0(c38266c, c34911a);
                    case 4:
                        return C3629d.m11063V0(c38266c, c34911a);
                    case 5:
                        return C3629d.m11065W0(c38266c, c34911a);
                    case 6:
                        return C3629d.m11069Y0(c38266c, c34911a);
                    case 7:
                        return C3629d.m11047N0(c38266c, c34911a);
                    case 8:
                        return C3629d.m11074a1(c38266c, c34911a);
                    case 9:
                        return C3629d.m11077b1(c38266c, c34911a);
                    case 10:
                        return C3629d.m11080c1(c38266c, c34911a);
                    case 11:
                        return C3629d.m11083d1(c38266c, c34911a);
                    case 12:
                        return C3629d.m11086e1(c38266c, c34911a);
                    case 13:
                        return C3629d.m11089f1(c38266c, c34911a);
                    case 14:
                        return C3629d.m11130t0(c38266c, c34911a);
                    case 15:
                        return C3629d.m11092g1(c38266c, c34911a);
                    case 16:
                        return C3629d.m11095h1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C3629d.m11101j1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C3629d.m11104k1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C3629d.m11071Z0(c38266c, c34911a);
                    case 20:
                        return C3629d.m11113n1(c38266c, c34911a);
                    case 21:
                        return C3629d.m11116o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C3629d.m11119p1(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C3629d.m11122q1(c38266c, c34911a);
                    case 24:
                        return C3629d.m11128s1(c38266c, c34911a);
                    case 25:
                        return C3629d.m11133u0(c38266c, c34911a);
                    case 26:
                        return C3629d.m11131t1(c38266c, c34911a);
                    case 27:
                        return C3629d.m11134u1(c38266c, c34911a);
                    case 28:
                        return C3629d.m11140w1(c38266c, c34911a);
                    default:
                        return C3629d.m11143x1(c38266c, c34911a);
                }
            }
        }, 2);
        AbstractC25012a.m73393z(c30330b59, c33768a, AbstractC21598x.m60669Y(c30330b59.f124471b, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C38647a m11116o1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38647a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final Map m11118p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("PLAN_TILE", c22673i0.getOrCreateKotlinClass(PlanTileModel.class)), new C23465k("LOGGED_RECOVERIES", c22673i0.getOrCreateKotlinClass(LoggedRecoveries.class)), new C23465k("ADD_GOAL_CARD", c22673i0.getOrCreateKotlinClass(AddGoalCard.class)), new C23465k("WEEKLY_PLAN_HOME_TILE", c22673i0.getOrCreateKotlinClass(WeeklyPlanHometile.class)), new C23465k("ARCH_MINI_AI_PLANS", c22673i0.getOrCreateKotlinClass(ChallengeLandingCustomPlanCard.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C37629j m11119p1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37629j((C34168f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34168f.class), null), (C38647a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38647a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final AbstractC0757c m11121q0(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "weekly-plan-cache-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C27107c m11122q1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27107c((InterfaceC26834e) factory.m122602a(new C1873h(factory, 6), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C37610b m11124r0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37610b((WeeklyPlanApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeeklyPlanApi.class), null), InterfaceC34116n.INSTANCE.m107848a("CustomizePlanApiInteractor"), (C24717b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24717b.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final C34911a m11125r1(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("weekly-plan-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C37614f m11127s0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37614f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C30577b m11128s1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30577b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C37611c m11130t0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37611c((C37610b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37610b.class), null), (C37614f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37614f.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C29506b m11131t1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29506b((C27107c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27107c.class), null), (C30577b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30577b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C39757d m11133u0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39757d(null, (C37611c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37611c.class), null), (C41079c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41079c.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final C32954e m11134u1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1873h c1873h = new C1873h(factory, 3);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32954e((InterfaceC26834e) factory.m122602a(c1873h, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C24717b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24717b.class), null), InterfaceC34116n.INSTANCE.m107848a("ChallengeLandingInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C41087k m11136v0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41087k((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C34911a m11137v1(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("weekly-plan-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C41088l m11139w0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41088l((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w1 */
    public static final C35226g m11140w1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35226g(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C41089m m11142x0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41089m((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C35224e m11143x1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35224e((C32954e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32954e.class), null), (C35226g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35226g.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C41090n m11145y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41090n((C41083g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41083g.class), null), (C21955q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21955q.class), null), (C41084h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41084h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C34165c m11146y1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34165c((WeeklyPlanApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeeklyPlanApi.class), null), (InterfaceC26834e) factory.m122602a(new C1873h(factory, 5), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C41077a m11148z0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41077a((C34215a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34215a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C34911a m11149z1(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("weekly-plan-bff-cache-deserializer"))}));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m11115o0(c33768a);
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
