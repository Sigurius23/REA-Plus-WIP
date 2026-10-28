package mu2;

import ad3.AbstractC0757c;
import ad3.C0764g;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1601k1;
import av2.C2095b;
import av2.C2099f;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import cd3.C4455g;
import ci2.InterfaceC4733b;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.exerciseprogressminiarch.domain.models.ArchMiniExerciseProgress;
import com.whoop.personalrecords.miniarch.domain.models.ArchMiniPersonalRecords;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.ExerciseEquipment;
import com.whoop.weightlifting.data.domain.ExerciseLaterality;
import com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b;
import com.whoop.weightlifting.feature.builder.details.ExerciseInstructionsModel;
import com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsApi;
import com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ArchMiniExerciseRecords;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel;
import com.whoop.weightlifting.feature.onerepmax.measuremententry.models.MeasurementEntryItemModel;
import cu2.C11140t;
import cv2.C11155h;
import dt0.InterfaceC12362e;
import dv2.C12392c;
import dv2.C12393d;
import dv2.C12395f;
import e82.C12853a;
import eq1.C13562a;
import fi0.InterfaceC14515a;
import fu2.C14789d;
import fu2.C14791f;
import fu2.C14794i;
import fv2.C14819d;
import gv2.C16244b;
import gv2.C16245c;
import hf1.InterfaceC17235b;
import i92.InterfaceC18260e;
import in2.InterfaceC18732d;
import iq2.C20855a;
import iu2.C20937a;
import iu2.C20938b;
import iv2.C20955d;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import jt0.InterfaceC21934a;
import jv2.C21971b;
import jv2.C21973d;
import l83.C23454a0;
import l83.C23465k;
import lf1.C23996f;
import lf1.C24003m;
import lu2.C24754d;
import lu2.C24755e;
import lv2.C24763a;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import mi1.C25575d;
import mm1.C25694h;
import mu1.C25954a;
import n92.InterfaceC26483e;
import nd1.InterfaceC26584j;
import no.nordicsemi.android.dfu.DfuBaseService;
import nu2.C27145b;
import nu2.C27148e;
import nu2.C27149f;
import nv2.C27176b;
import nv2.C27178d;
import od1.C27858u;
import oi0.C27948a;
import ou2.C28377a;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25310s;
import pf.AbstractC29125c;
import pg3.C29222x0;
import pu2.C29554b;
import pu2.C29556d;
import pu2.C29558f;
import pu2.C29561i;
import pv2.C29581b;
import qf3.C30330b;
import qi0.C30406a;
import qv2.C30664e;
import qw2.C30695c;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import rt0.InterfaceC31801c;
import rv2.C31847e;
import rv2.C31849g;
import sr2.AbstractC32943y;
import su2.C33023c;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import tv2.C34211d;
import u82.AbstractC34649j;
import u82.C34642c;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import u92.C34660d;
import ud3.C34826l0;
import uf3.C34911a;
import us0.InterfaceC35211g;
import uu2.C35240a0;
import uu2.C35273x;
import uu2.C35275z;
import uv2.C35285b;
import uv2.C35287d;
import v82.C35799a;
import va3.AbstractC35846d;
import vf3.AbstractC35952b;
import vf3.C35953c;
import vu2.C36523d;
import wc3.InterfaceC37138c;
import wf3.C37247a;
import wm0.C37378a;
import wu2.C37647c;
import xf3.C38266c;
import xu2.C38657c;
import xu2.C38659e;
import z82.InterfaceC40188b;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;
import zu2.C41157d;

/* JADX INFO: renamed from: mu2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lmu2/f;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25961f implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f102525c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C12395f m76849A0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12395f((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C12392c m76851B0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12392c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public static final ExerciseRecordsInteractor m76853C0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new ExerciseRecordsInteractor((ExerciseRecordsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExerciseRecordsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C27178d m76855D0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27178d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C24763a m76857E0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24763a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C27176b m76859F0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27176b((ExerciseRecordsInteractor) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(ExerciseRecordsInteractor.class), null), (C27178d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27178d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C37647c m76861G0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37647c((C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null), (C14789d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14789d.class), null), (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), null, (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C14789d m76863H0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14789d(null, (InterfaceC40188b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C38659e m76865I0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38659e((C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C10769b m76867J0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC41070a interfaceC41070a = (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null);
        C14789d c14789d = (C14789d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14789d.class), null);
        C20938b c20938b = (C20938b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C20938b.class), null);
        WeightliftingApi weightliftingApi = (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null);
        InterfaceC18260e interfaceC18260e = (InterfaceC18260e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null);
        C14794i c14794i = (C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null);
        return new C10769b(interfaceC41070a, c14789d, c20938b, weightliftingApi, interfaceC18260e, null, (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), c14794i, (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C25575d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25575d.class), null), (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), (C24755e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24755e.class), null), (InterfaceC12362e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12362e.class), null), (C24003m) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24003m.class), null), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C35273x m76869K0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35273x((C36523d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36523d.class), null), (C35275z) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35275z.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C27148e m76871L0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27148e((InterfaceC4733b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C27149f m76873M0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27149f((InterfaceC41070a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C27145b m76875N0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27145b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C29561i m76877O0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29561i((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (C29581b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29581b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C28377a m76879P0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28377a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C29556d m76881Q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29556d((C27858u) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C20938b m76883R0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C20938b((InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), InterfaceC34116n.INSTANCE.m107848a("WeightliftingRepository"), (WeightliftingApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), (ActivitiesApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (C20937a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C20937a.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C24754d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C24754d.class), null), (InterfaceC14515a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (Context) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC40205a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C24755e m76885S0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24755e((C24754d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24754d.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C14791f m76887T0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14791f((C20937a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C20937a.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), InterfaceC34116n.INSTANCE.m107848a("StrainStartupHandler"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C30664e m76889U0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        WeightliftingApi weightliftingApi = (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("WorkoutLibraryInteractor");
        return new C30664e((C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null), weightliftingApi, interfaceC34116nM107848a, (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C23996f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C23996f.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C11140t m76891V0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11140t((InterfaceC26483e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26483e.class), null), (C20938b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20938b.class), null), (C23996f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C23996f.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C31847e m76893W0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31847e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C20955d m76895X0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C20955d((C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null), (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), InterfaceC34116n.INSTANCE.m107848a("WorkoutDetailsInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C21973d m76897Y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21973d((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Gson m76899Z0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), AbstractC25247g0.m73990Y(new C23465k("MINI_ARCH_EXERCISE_PROGRESS", c22673i0.getOrCreateKotlinClass(ArchMiniExerciseProgress.class)), new C23465k("MINI_ARCH_ALL_PRS", c22673i0.getOrCreateKotlinClass(ArchMiniPersonalRecords.class)), new C23465k("MINI_ARCH_EXERCISE_RECORDS", c22673i0.getOrCreateKotlinClass(ArchMiniExerciseRecords.class)), new C23465k("EXERCISE_INSTRUCTIONS", c22673i0.getOrCreateKotlinClass(ExerciseInstructionsModel.class))), null, 2, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final AbstractC0757c m76902a1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(factory, AbstractC25247g0.m73990Y(new C23465k("MINI_ARCH_EXERCISE_PROGRESS", c22673i0.getOrCreateKotlinClass(ArchMiniExerciseProgress.class)), new C23465k("MINI_ARCH_ALL_PRS", c22673i0.getOrCreateKotlinClass(ArchMiniPersonalRecords.class)), new C23465k("MINI_ARCH_EXERCISE_RECORDS", c22673i0.getOrCreateKotlinClass(ArchMiniExerciseRecords.class)), new C23465k("EXERCISE_INSTRUCTIONS", c22673i0.getOrCreateKotlinClass(ExerciseInstructionsModel.class))), null, null, null, null, 30, null);
        C4455g c4455g = new C4455g();
        c4455g.mo2326o(c22673i0.getOrCreateKotlinClass(ExerciseEquipment.class), new C25694h(25));
        c4455g.mo2326o(c22673i0.getOrCreateKotlinClass(ExerciseLaterality.class), new C25694h(26));
        return AbstractC34132o.m107878b(abstractC0757cM20380e, new C20855a(abstractC0757cM20380e, c4455g.m13953r(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final InterfaceC37138c m76905b1(List it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC34649j.m109491a(ExerciseEquipment.Unknown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final InterfaceC37138c m76908c1(List it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC34649j.m109491a(ExerciseLaterality.Unknown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C23454a0 m76911d1(AbstractC0757c abstractC0757c, AbstractC4454f abstractC4454f, C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2788o = AbstractC4457i.m13960a(abstractC0757c.f2764b, abstractC4454f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C30406a m76914e1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30406a(new C27948a((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null)), new ScreenAnalyticEventModel((AnalyticEventModel) null, (AnalyticEventModel) null, (AnalyticEventModel) null, 7, (DefaultConstructorMarker) null), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("weightlifting-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final InterfaceC34640a m76917f1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("weightlifting-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("weightlifting-gson")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-weightlifting"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final WeightliftingApi m76920g1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("weightlifting-gson")), (AbstractC0757c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("weightlifting-json")), AbstractC12350b.m34570S("kt-serialization-weightlifting"));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e((C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")));
        return (WeightliftingApi) c29222x0.m88730d().m88733b(WeightliftingApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final ExerciseRecordsApi m76923h1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("weightlifting-gson")), (AbstractC0757c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("weightlifting-json")), AbstractC12350b.m34570S("kt-serialization-weightlifting"));
        C29222x0 c29222x0 = new C29222x0();
        return (ExerciseRecordsApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), ExerciseRecordsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C24754d m76926i1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C24754d((InterfaceC41070a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C2095b m76929j1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C2095b((C41157d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41157d.class), null), (C2099f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C2099f.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C20937a m76932k1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C20937a((InterfaceC31801c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31801c.class), null), (C12853a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12853a.class), null), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), InterfaceC34116n.INSTANCE.m107848a("StrengthTrainerPacketManager"), (InterfaceC21934a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21934a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C34211d m76935l1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34211d((C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null), (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: renamed from: m0 */
    private static final C23454a0 m76937m0(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C25954a c25954a = new C25954a(8);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C35240a0.class);
        C35953c c35953c = C37247a.f159360e;
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass, null, c25954a, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b.f124471b, null, c35953c), new C31362a(c30330b), false);
        C30330b c30330b2 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36523d.class), null, new C25954a(10), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b2.f124471b, null, c35953c), new C31362a(c30330b2), false);
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35275z.class), null, new C25954a(22), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b3.f124471b, null, c35953c), new C31362a(c30330b3), false);
        final int i13 = 4;
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35273x.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c), new C31362a(c30330b4), false);
        final int i14 = 16;
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C11140t.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), new C31362a(c30330b5), false);
        final int i15 = 28;
        C30330b c30330b6 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C2095b.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b6.f124471b, null, c35953c), new C31362a(c30330b6), false);
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C12393d.class), null, new C25960e(0), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31362a(c30330b7), false);
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38657c.class), null, new C25960e(1), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C33023c.class), null, new C25960e(2), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31362a(c30330b9), false);
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29558f.class), null, new C25960e(4), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31362a(c30330b10), false);
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C23996f.class), null, new C25954a(19), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        final int i16 = 0;
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24003m.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        final int i17 = 11;
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C31849g.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        final int i18 = 22;
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21971b.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35285b.class), null, new C25960e(3), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C16244b.class), null, new C25960e(5), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C14794i.class), null, new C25960e(6), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31365d(c30330b17), false);
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C41157d.class), null, new C25960e(7), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31362a(c30330b18), false);
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C2099f.class), null, new C25960e(8), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), new C31362a(c30330b19), false);
        C30330b c30330b20 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C11155h.class), null, new C25954a(9), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b20.f124471b, null, c35953c), new C31362a(c30330b20), false);
        C30330b c30330b21 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C12395f.class), null, new C25954a(11), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b21.f124471b, null, c35953c), new C31362a(c30330b21), false);
        C30330b c30330b22 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C12392c.class), null, new C25954a(12), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b22.f124471b, null, c35953c), new C31362a(c30330b22), false);
        C30330b c30330b23 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(ExerciseRecordsInteractor.class), null, new C25954a(13), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b23.f124471b, null, c35953c), new C31362a(c30330b23), false);
        C30330b c30330b24 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27178d.class), null, new C25954a(14), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.f124471b, null, c35953c), new C31362a(c30330b24), false);
        C30330b c30330b25 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24763a.class), null, new C25954a(15), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b25.f124471b, null, c35953c), new C31362a(c30330b25), false);
        C30330b c30330b26 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27176b.class), null, new C25954a(16), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b26.f124471b, null, c35953c), new C31362a(c30330b26), false);
        C30330b c30330b27 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37647c.class), null, new C25954a(17), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b27.f124471b, null, c35953c), new C31362a(c30330b27), false);
        C30330b c30330b28 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C14789d.class), null, new C25954a(18), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b28.f124471b, null, c35953c), new C31362a(c30330b28), false);
        C30330b c30330b29 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38659e.class), null, new C25954a(20), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b29.f124471b, null, c35953c), new C31362a(c30330b29), false);
        C30330b c30330b30 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C10769b.class), null, new C25954a(21), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b30.f124471b, null, c35953c), new C31362a(c30330b30), false);
        C30330b c30330b31 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27148e.class), null, new C25954a(23), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b31.f124471b, null, c35953c), new C31362a(c30330b31), false);
        C30330b c30330b32 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27149f.class), null, new C25954a(24), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b32.f124471b, null, c35953c), new C31362a(c30330b32), false);
        C30330b c30330b33 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27145b.class), null, new C25954a(25), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b33.f124471b, null, c35953c), new C31362a(c30330b33), false);
        C30330b c30330b34 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29561i.class), null, new C25954a(26), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b34.f124471b, null, c35953c), new C31362a(c30330b34), false);
        C30330b c30330b35 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28377a.class), null, new C25954a(27), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b35.f124471b, null, c35953c), new C31362a(c30330b35), false);
        C30330b c30330b36 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29556d.class), null, new C25954a(28), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b36.f124471b, null, c35953c), new C31362a(c30330b36), false);
        C30330b c30330b37 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C20938b.class), null, new C25954a(29), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b37.f124471b, null, c35953c), new C31365d(c30330b37), false);
        final int i19 = 1;
        C30330b c30330b38 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24755e.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b38.f124471b, null, c35953c), new C31362a(c30330b38), false);
        final int i24 = 2;
        C30330b c30330b39 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C14791f.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b39.f124471b, null, c35953c), new C31362a(c30330b39), false);
        final int i25 = 3;
        C30330b c30330b40 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30664e.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b40.f124471b, null, c35953c), new C31362a(c30330b40), false);
        final int i26 = 5;
        C30330b c30330b41 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C31847e.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b41.f124471b, null, c35953c), new C31362a(c30330b41), false);
        final int i27 = 6;
        C30330b c30330b42 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C20955d.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b42.f124471b, null, c35953c), new C31362a(c30330b42), false);
        final int i28 = 7;
        C30330b c30330b43 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21973d.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(c30330b43, module, AbstractC21598x.m60669Y(c30330b43.f124471b, null, c35953c), false, "weightlifting-gson");
        final int i29 = 8;
        C30330b c30330b44 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(Gson.class), c35953cM73385r, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(c30330b44, module, AbstractC21598x.m60669Y(c30330b44.f124471b, c35953cM73385r, c35953c), false, "weightlifting-json");
        final int i34 = 9;
        C30330b c30330b45 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73385r2, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        C35953c c35953cM73385r3 = AbstractC25012a.m73385r(c30330b45, module, AbstractC21598x.m60669Y(c30330b45.f124471b, c35953cM73385r2, c35953c), false, "weightlifting-generic-action-router");
        final int i35 = 10;
        C30330b c30330b46 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30406a.class), c35953cM73385r3, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        C35953c c35953cM73385r4 = AbstractC25012a.m73385r(c30330b46, module, AbstractC21598x.m60669Y(c30330b46.f124471b, c35953cM73385r3, c35953c), false, "weightlifting-bff-cache-deserializer");
        final int i36 = 12;
        C30330b c30330b47 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), c35953cM73385r4, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b47.f124471b, c35953cM73385r4, c35953c), new C31362a(c30330b47), false);
        final int i37 = 13;
        C30330b c30330b48 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b48.f124471b, null, c35953c), new C31365d(c30330b48), false);
        final int i38 = 14;
        C30330b c30330b49 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(ExerciseRecordsApi.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b49.f124471b, null, c35953c), new C31365d(c30330b49), false);
        final int i39 = 15;
        C30330b c30330b50 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24754d.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b50.f124471b, null, c35953c), new C31365d(c30330b50), false);
        final int i44 = 17;
        C30330b c30330b51 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C20937a.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b51.f124471b, null, c35953c), new C31362a(c30330b51), false);
        final int i45 = 18;
        C30330b c30330b52 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34211d.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b52.m92688a(), null, c35953c), new C31362a(c30330b52), false);
        final int i46 = 19;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g = AbstractC35846d.m113782g();
        C30330b c30330b53 = new C30330b(c35953cM113782g, AbstractC22671h0.m65688a(C35287d.class), null, interfaceC4351m, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b53.m92688a(), null, c35953cM113782g), new C31362a(c30330b53), false);
        final int i47 = 20;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g2 = AbstractC35846d.m113782g();
        C30330b c30330b54 = new C30330b(c35953cM113782g2, AbstractC22671h0.m65688a(C29554b.class), null, interfaceC4351m2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b54.m92688a(), null, c35953cM113782g2), new C31362a(c30330b54), false);
        final int i48 = 21;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g3 = AbstractC35846d.m113782g();
        C30330b c30330b55 = new C30330b(c35953cM113782g3, AbstractC22671h0.m65688a(C14819d.class), null, interfaceC4351m3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b55.m92688a(), null, c35953cM113782g3), new C31362a(c30330b55), false);
        final int i49 = 23;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g4 = AbstractC35846d.m113782g();
        C30330b c30330b56 = new C30330b(c35953cM113782g4, AbstractC22671h0.m65688a(C16245c.class), null, interfaceC4351m4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b56.m92688a(), null, c35953cM113782g4), new C31362a(c30330b56), false);
        final int i54 = 24;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g5 = AbstractC35846d.m113782g();
        C30330b c30330b57 = new C30330b(c35953cM113782g5, AbstractC22671h0.m65688a(C29581b.class), null, interfaceC4351m5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b57.m92688a(), null, c35953cM113782g5), new C31362a(c30330b57), false);
        C35953c c35953cM114198f = AbstractC35952b.m114198f("weightlifting-arch-v2-mapping");
        final int i55 = 25;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g6 = AbstractC35846d.m113782g();
        C30330b c30330b58 = new C30330b(c35953cM113782g6, AbstractC22671h0.m65688a(Map.class), c35953cM114198f, interfaceC4351m6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b58.m92688a(), c35953cM114198f, c35953cM113782g6), new C31362a(c30330b58), false);
        final int i56 = 26;
        C30330b c30330b59 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C25958c.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x = AbstractC2875y.m8311x(c30330b59, module, AbstractC21598x.m60669Y(c30330b59.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz = AbstractC22671h0.m65688a(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b60 = c31365dM8311x.f129023a;
        c30330b60.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b60.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b60.f124472c, c30330b60.f124470a), c31365dM8311x, true);
        final int i57 = 27;
        C30330b c30330b61 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C25957b.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x2 = AbstractC2875y.m8311x(c30330b61, module, AbstractC21598x.m60669Y(c30330b61.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz2 = AbstractC22671h0.m65688a(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b62 = c31365dM8311x2.f129023a;
        c30330b62.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b62.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b62.f124472c, c30330b62.f124470a), c31365dM8311x2, true);
        final int i58 = 29;
        C30330b c30330b63 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C25956a.class), null, new InterfaceC4351m() { // from class: mu2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C25961f.m76949q0(c38266c, c34911a);
                    case 1:
                        return C25961f.m76885S0(c38266c, c34911a);
                    case 2:
                        return C25961f.m76887T0(c38266c, c34911a);
                    case 3:
                        return C25961f.m76889U0(c38266c, c34911a);
                    case 4:
                        return C25961f.m76869K0(c38266c, c34911a);
                    case 5:
                        return C25961f.m76893W0(c38266c, c34911a);
                    case 6:
                        return C25961f.m76895X0(c38266c, c34911a);
                    case 7:
                        return C25961f.m76897Y0(c38266c, c34911a);
                    case 8:
                        return C25961f.m76899Z0(c38266c, c34911a);
                    case 9:
                        return C25961f.m76902a1(c38266c, c34911a);
                    case 10:
                        return C25961f.m76914e1(c38266c, c34911a);
                    case 11:
                        return C25961f.m76952r0(c38266c, c34911a);
                    case 12:
                        return C25961f.m76917f1(c38266c, c34911a);
                    case 13:
                        return C25961f.m76920g1(c38266c, c34911a);
                    case 14:
                        return C25961f.m76923h1(c38266c, c34911a);
                    case 15:
                        return C25961f.m76926i1(c38266c, c34911a);
                    case 16:
                        return C25961f.m76891V0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C25961f.m76932k1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C25961f.m76935l1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C25961f.m76938m1(c38266c, c34911a);
                    case 20:
                        return C25961f.m76941n1(c38266c, c34911a);
                    case 21:
                        return C25961f.m76944o1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C25961f.m76955s0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C25961f.m76947p1(c38266c, c34911a);
                    case 24:
                        return C25961f.m76950q1(c38266c, c34911a);
                    case 25:
                        return C25961f.m76953r1(c38266c, c34911a);
                    case 26:
                        return C25961f.m76956s1(c38266c, c34911a);
                    case 27:
                        return C25961f.m76959t1(c38266c, c34911a);
                    case 28:
                        return C25961f.m76929j1(c38266c, c34911a);
                    default:
                        return C25961f.m76965v1(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x3 = AbstractC2875y.m8311x(c30330b63, module, AbstractC21598x.m60669Y(c30330b63.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz3 = AbstractC22671h0.m65688a(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b64 = c31365dM8311x3.f129023a;
        c30330b64.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b64.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b64.f124472c, c30330b64.f124470a), c31365dM8311x3, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C35287d m76938m1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35287d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C35240a0 m76940n0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35240a0((InterfaceC14515a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (WeightliftingApi) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ExerciseDetailsViewModel"), (C14794i) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null), (C34660d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C29554b m76941n1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(AbstractC29125c.m88532i(factory));
        AbstractC22676k.m65749i(notificationManagerCompatFrom, "from(...)");
        Context applicationContext = AbstractC29125c.m88532i(factory).getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        return new C29554b(notificationManagerCompatFrom, applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C36523d m76943o0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36523d((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), InterfaceC34116n.INSTANCE.m107848a("ExerciseDetailsV2Interactor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C14819d m76944o1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14819d((WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), (C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null), InterfaceC34116n.INSTANCE.m107848a("CustomExerciseInteractor"), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23996f m76946p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C23996f((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C16245c m76947p1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C16245c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C24003m m76949q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24003m((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C29581b m76950q1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29581b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C31849g m76952r0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31849g((C31847e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31847e.class), null), (C30664e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30664e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final Map m76953r1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("MEASUREMENT_ENTRY_ITEM", c22673i0.getOrCreateKotlinClass(MeasurementEntryItemModel.class)), new C23465k("ONE_REP_MAX_MEASUREMENT", c22673i0.getOrCreateKotlinClass(OneRepMaxMeasurementModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C21971b m76955s0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21971b((C20955d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20955d.class), null), (C21973d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21973d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C25958c m76956s1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C25958c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("weightlifting-arch-v2-mapping")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C35285b m76958t0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35285b((C34211d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34211d.class), null), (C35287d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35287d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C25957b m76959t1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C25957b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C16244b m76961u0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C16244b((C14819d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14819d.class), null), (C16245c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C16245c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final C12393d m76962u1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12393d((C11155h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11155h.class), null), (C12395f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12395f.class), null), (C12392c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12392c.class), null), (InterfaceC14515a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public static final C14794i m76964v0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C14794i(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C25956a m76965v1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C25956a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C41157d m76967w0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C14794i c14794i = (C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null);
        WeightliftingApi weightliftingApi = (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("InputWorkoutNameInteractor");
        InterfaceC31766c interfaceC31766c = (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C41157d(c14794i, weightliftingApi, interfaceC34116nM107848a, interfaceC31766c, interfaceC14515a, clockSystemDefaultZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final C38657c m76968w1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38657c((C37647c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37647c.class), null), (C38659e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38659e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C2099f m76970x0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C2099f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C33023c m76971x1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33023c((C20938b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20938b.class), null), null, (InterfaceC0422g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C11155h m76973y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11155h((C14794i) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14794i.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (WeightliftingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WeightliftingApi.class), null), InterfaceC34116n.INSTANCE.m107848a("SelectExercisesInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C29558f m76974y1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29558f((C10769b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C10769b.class), null), (C29561i) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29561i.class), null), (C28377a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28377a.class), null), (C29556d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29556d.class), null), (C27145b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27145b.class), null), (C20937a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20937a.class), null), (InterfaceC33704b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C27148e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27148e.class), null), (C27149f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27149f.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C1601k1) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C1601k1.class), null), null, (C29554b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29554b.class), null), (C13562a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13562a.class), null), (InterfaceC35211g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35211g.class), null), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C35275z m76976z0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35275z();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m76937m0(c33768a);
        return c33768a;
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
