package hf2;

import ao1.C1873h;
import ci2.InterfaceC4733b;
import com.whoop.coaching.sleepcoach.data.network.api.SleepCoachOnboardingApi;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.coaching.sleepcoach.wizard.C6246h;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.onboarding.story.domain.network.FeatureEducationApi;
import com.whoop.sleep.coach.data.network.api.SleepCoachApi;
import com.whoop.sleep.coach.data.network.api.SleepCoachUsersApiMigrations;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import ef2.C13151a;
import ff2.C14430a;
import ga1.C15621b;
import ge3.AbstractC15751g;
import gj2.C15920a;
import hb1.C17089l;
import i92.InterfaceC18260e;
import in2.InterfaceC18732d;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.List;
import jp0.C21848b;
import jp0.InterfaceC21847a;
import kf2.C22444c;
import kf2.C22446e;
import kp0.C22743j;
import l83.C23454a0;
import lf2.C24016i;
import lf2.C24019l;
import mp0.C25819b1;
import mp0.C25826f;
import mp0.C25827f0;
import mp0.C25832i;
import mp0.C25833i0;
import mp0.C25845o0;
import mp0.C25852s;
import mp0.C25860w;
import nd1.InterfaceC26584j;
import np0.C27015h;
import op0.C28086d;
import op0.C28087e;
import or2.C28205u0;
import or2.InterfaceC28172j0;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29224y0;
import qf2.C30327f;
import qf3.C30330b;
import re2.C31328b;
import rf2.InterfaceC31359a;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import se2.C32426d;
import sr2.AbstractC32943y;
import sx1.C33067c;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import ue2.C34862b;
import ue2.C34863c;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import we2.C37233b;
import wf3.C37247a;
import xe2.C38234c;
import xe2.C38236e;
import xf3.C38266c;
import z82.C40191e;
import z82.InterfaceC40188b;
import ze2.C40596h;

/* JADX INFO: renamed from: hf2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lhf2/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17238b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f66262c = 8;

    /* JADX INFO: renamed from: d */
    private static final C33768a f66263d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    static {
        C33768a c33768a = new C33768a();
        m48758J(c33768a);
        f66263d = c33768a;
    }

    /* JADX INFO: renamed from: J */
    private static final C23454a0 m48758J(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C15920a c15920a = new C15920a(9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(SleepCoachApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c15920a, 2)), false);
        C15920a c15920a2 = new C15920a(11);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(SleepCoachOnboardingApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c15920a2, 2)), false);
        C15920a c15920a3 = new C15920a(23);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(SleepCoachUsersApiMigrations.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c15920a3, 2)), false);
        C15920a c15920a4 = new C15920a(25);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C13151a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c15920a4, 2)), false);
        C15920a c15920a5 = new C15920a(26);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C38236e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c15920a5, 2)), false);
        C15920a c15920a6 = new C15920a(27);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C38234c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c15920a6, 2)), false);
        C15920a c15920a7 = new C15920a(28);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C24019l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c15920a7, 2)), false);
        C15920a c15920a8 = new C15920a(29);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C24016i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c15920a8, 2)), false);
        C17237a c17237a = new C17237a(0);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C40596h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c17237a, 2)), false);
        C17237a c17237a2 = new C17237a(2);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C22444c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c17237a2, 2)), false);
        C15920a c15920a9 = new C15920a(20);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C22446e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c15920a9, 2)), false);
        C17237a c17237a3 = new C17237a(1);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C14430a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c17237a3, 2)), false);
        C17237a c17237a4 = new C17237a(3);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C37233b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c17237a4, 2)), false);
        C17237a c17237a5 = new C17237a(4);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C34863c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c17237a5, 2)), false);
        C17237a c17237a6 = new C17237a(5);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C34862b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c17237a6, 2)), false);
        C17237a c17237a7 = new C17237a(6);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C31328b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c17237a7, 2)), false);
        C17237a c17237a8 = new C17237a(7);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(InterfaceC21847a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass17, null, c17237a8, 1)), false);
        C17237a c17237a9 = new C17237a(8);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C22743j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c17237a9, 2)), false);
        C17237a c17237a10 = new C17237a(9);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C6240b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass19, null, c17237a10, 1)), false);
        C15920a c15920a10 = new C15920a(10);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C28086d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass20, null, c15920a10, 1)), false);
        C15920a c15920a11 = new C15920a(12);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C27015h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c15920a11, 2)), false);
        C15920a c15920a12 = new C15920a(13);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C28087e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c15920a12, 2)), false);
        C15920a c15920a13 = new C15920a(14);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C25819b1.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c15920a13, 2)), false);
        C15920a c15920a14 = new C15920a(15);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C6246h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass24, null, c15920a14, 2)), false);
        C15920a c15920a15 = new C15920a(16);
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(C25845o0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass25, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass25, null, c15920a15, 2)), false);
        C15920a c15920a16 = new C15920a(17);
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(C25833i0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass26, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass26, null, c15920a16, 2)), false);
        C15920a c15920a17 = new C15920a(18);
        InterfaceC21461d orCreateKotlinClass27 = c22673i0.getOrCreateKotlinClass(C25832i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass27, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass27, null, c15920a17, 2)), false);
        C15920a c15920a18 = new C15920a(19);
        InterfaceC21461d orCreateKotlinClass28 = c22673i0.getOrCreateKotlinClass(C25852s.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass28, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass28, null, c15920a18, 2)), false);
        C15920a c15920a19 = new C15920a(21);
        InterfaceC21461d orCreateKotlinClass29 = c22673i0.getOrCreateKotlinClass(C25827f0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass29, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass29, null, c15920a19, 2)), false);
        C15920a c15920a20 = new C15920a(22);
        InterfaceC21461d orCreateKotlinClass30 = c22673i0.getOrCreateKotlinClass(C25826f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass30, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass30, null, c15920a20, 2)), false);
        C15920a c15920a21 = new C15920a(24);
        InterfaceC21461d orCreateKotlinClass31 = c22673i0.getOrCreateKotlinClass(C25860w.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass31, null, c15920a21, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass31, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final SleepCoachApi m48759K(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C15621b(11), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(SleepCoachApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (SleepCoachApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34911a m48760L() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-sleep-coach"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final SleepCoachOnboardingApi m48761M(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C17089l(6), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(SleepCoachOnboardingApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (SleepCoachOnboardingApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C34911a m48762N() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-sleep-coach"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C22446e m48763O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22446e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C14430a m48764P(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14430a((InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C30327f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30327f.class), null), InterfaceC34116n.INSTANCE.m107848a("SmartAlarmHandler"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C37233b m48765Q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37233b((InterfaceC40188b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C34863c m48766R(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34863c((C34862b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34862b.class), null), (C32426d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32426d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C34862b m48767S(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34862b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C31328b m48768T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31328b((InterfaceC40188b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final InterfaceC21847a m48769U(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21848b((InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (SmartAlarmApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SmartAlarmApi.class), null), (SleepCoachUsersApiMigrations) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SleepCoachUsersApiMigrations.class), null), (InterfaceC31359a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31359a.class), null), (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C22743j m48770V(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22743j((C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (AbstractC32943y) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C6240b m48771W(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C6240b(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C28086d m48772X(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28086d((InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (SleepCoachOnboardingApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SleepCoachOnboardingApi.class), null), (FeatureEducationApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureEducationApi.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final SleepCoachUsersApiMigrations m48773Y(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(SleepCoachUsersApiMigrations.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (SleepCoachUsersApiMigrations) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C27015h m48774Z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27015h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C28087e m48776a0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28087e((C28086d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28086d.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C25819b1 m48778b0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25819b1((C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (AbstractC32943y) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C6246h m48780c0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C6246h((C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (C30327f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30327f.class), null), (InterfaceC21847a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21847a.class), null), (InterfaceC31766c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), InterfaceC34116n.INSTANCE.m107848a("TonightsSleepContainerViewModel"), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C25845o0 m48782d0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25845o0((C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (C30327f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30327f.class), null), (InterfaceC4733b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C33067c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33067c.class), null), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C25833i0 m48784e0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25833i0((InterfaceC21847a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21847a.class), null), (C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C25832i m48786f0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25832i((C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (InterfaceC4733b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C30327f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30327f.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (InterfaceC21847a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21847a.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C25852s m48788g0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25852s((C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (C30327f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30327f.class), null), (InterfaceC31766c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (C28205u0) viewModel.m122602a(new C1873h(viewModel, 13), c22673i0.getOrCreateKotlinClass(C28205u0.class), null), (InterfaceC28172j0) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28172j0.class), null), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C34911a m48790h0(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C25827f0 m48792i0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25827f0((C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (OnboardingStatusChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusChecker.class), null), (AbstractC32943y) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C25826f m48794j0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25826f((C28086d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28086d.class), null), (C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (C27015h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27015h.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C13151a m48796k0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13151a((SleepCoachApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SleepCoachApi.class), null), InterfaceC34116n.INSTANCE.m107848a("SleepCoachScheduleRepository"), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C25860w m48798l0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25860w((C6240b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6240b.class), null), (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C38236e m48800m0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38236e((C13151a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13151a.class), null), (C38234c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38234c.class), null), (C14430a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14430a.class), null), InterfaceC34116n.INSTANCE.m107848a("WakeTimeScheduleDomainInteractor"), (C37233b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37233b.class), null), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C38234c m48802n0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38234c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C24019l m48804o0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24019l((C28205u0) factory.m122602a(new C1873h(factory, 12), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C34911a m48806p0(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C24016i m48808q0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24016i((C38236e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38236e.class), null), (C24019l) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C24019l.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C40596h m48810r0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40596h((C13151a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13151a.class), null), (C14430a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14430a.class), null), InterfaceC34116n.INSTANCE.m107848a("SleepScheduleListInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C22444c m48812s0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22444c((C40596h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40596h.class), null), (C22446e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22446e.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (C37233b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37233b.class), null), null, 16, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        return f66263d;
    }

    @Override // nd1.InterfaceC26584j
    public List<C35799a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
