package cw0;

import ad3.AbstractC0757c;
import ao1.C1873h;
import bw0.C3679b;
import bw0.C3681d;
import c72.C4283a;
import com.whoop.core.details.activitytargets.domain.C6450c;
import com.whoop.core.details.network.api.CoreDetailsApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.service.network.HomeComponentDismissApi;
import dw0.C12405d;
import dw0.C12406e;
import fi0.InterfaceC14515a;
import hf1.InterfaceC17235b;
import hw0.C17697b;
import hw0.C17698c;
import hw0.C17701f;
import i92.InterfaceC18260e;
import in2.InterfaceC18732d;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import jb1.InterfaceC21539e;
import jw0.C21986d;
import jw0.C21989g;
import l83.C23454a0;
import lf1.C23996f;
import lw0.C24764a;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mc1.C25420e;
import mw0.C25975c;
import mw0.C25977e;
import mw0.C25980h;
import mw0.C25982j;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import u82.C34648i;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import wm0.C37378a;
import wv0.C37649a;
import xf3.C38266c;
import xm0.C38458b;
import yv0.AbstractC39806i;
import yv0.C39800c;
import z82.InterfaceC40188b;
import zv0.C41163a;

/* JADX INFO: renamed from: cw0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lcw0/c;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11158c implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f35717c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final AbstractC0757c m30193A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(factory, C37649a.f161343a.m121030a(), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC34640a m30194B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34648i((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("core-details-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C17701f m30195C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17701f((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C25980h m30196D(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25980h((C21989g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21989g.class), null), (C25982j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25982j.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C25975c m30197E(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25975c((C21986d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21986d.class), null), (C25977e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25977e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C21989g m30198F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21989g((C24764a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24764a.class), null), (NotificationRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationRepository.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final C25982j m30199G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25982j((C17701f) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17701f.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C21986d m30200H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21986d((InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (C24764a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24764a.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C25977e m30201I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25977e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C24764a m30202J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24764a((CoreDetailsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CoreDetailsApi.class), null), InterfaceC34116n.INSTANCE.m107848a("SleepRepository"), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C3681d m30203K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3681d((InterfaceC40188b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public static final C6450c m30204L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C6450c((InterfaceC26834e) factory.m122602a(new C1873h(factory, 8), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m30205M(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("core-details-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final CoreDetailsApi m30206N(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "core-details-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")));
        return (CoreDetailsApi) c29222x0.m88730d().m88733b(CoreDetailsApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C41163a m30207O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41163a(AbstractC39806i.m127605g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C39800c m30208P(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39800c((C6450c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C6450c.class), null), (C41163a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41163a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C11156a m30209Q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C11156a(C37649a.f161343a.m121030a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23996f m30210R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C23996f((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C12405d m30211S(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12405d((C3679b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C3679b.class), null), (C12406e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12406e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C23996f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C23996f.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C17698c m30212T(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17698c((C17697b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17697b.class), null), (C12405d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12405d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C17697b m30213U(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17697b((C17701f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17701f.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C25420e m30214V(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25420e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C3679b m30215W(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3679b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C12406e m30216X(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12406e((CoreDetailsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CoreDetailsApi.class), null), (InterfaceC26834e) factory.m122602a(new C1873h(factory, 7), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (HomeComponentDismissApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HomeComponentDismissApi.class), null), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), InterfaceC34116n.INSTANCE.m107848a("CoreDetailsNetworkMapper"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C34911a m30217Y(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("core-details-bff-cache-deserializer"))}));
    }

    /* JADX INFO: renamed from: z */
    private static final C23454a0 m30243z(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "core-details-json");
        C4283a c4283a = new C4283a(23);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c4283a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "core-details-bff-cache-deserializer");
        C4283a c4283a2 = new C4283a(25);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c4283a2, 2)), false);
        C4283a c4283a3 = new C4283a(29);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(CoreDetailsApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c4283a3, 1)), false);
        C11157b c11157b = new C11157b(0);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C23996f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c11157b, 2)), false);
        C11157b c11157b2 = new C11157b(1);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C12405d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c11157b2, 2)), false);
        C11157b c11157b3 = new C11157b(2);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C17698c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c11157b3, 2)), false);
        C11157b c11157b4 = new C11157b(3);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C17697b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c11157b4, 2)), false);
        C11157b c11157b5 = new C11157b(5);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C25420e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c11157b5, 2)), false);
        C11157b c11157b6 = new C11157b(6);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C3679b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c11157b6, 2)), false);
        C11157b c11157b7 = new C11157b(7);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C12406e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c11157b7, 2)), false);
        C11157b c11157b8 = new C11157b(4);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C17701f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c11157b8, 2)), false);
        C11157b c11157b9 = new C11157b(8);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C25980h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c11157b9, 2)), false);
        C11157b c11157b10 = new C11157b(9);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C25975c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c11157b10, 2)), false);
        C11157b c11157b11 = new C11157b(10);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C21989g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c11157b11, 2)), false);
        C11157b c11157b12 = new C11157b(11);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C25982j.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c11157b12, 2)), false);
        C11157b c11157b13 = new C11157b(12);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C21986d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c11157b13, 2)), false);
        C11157b c11157b14 = new C11157b(13);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C25977e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c11157b14, 2)), false);
        C11157b c11157b15 = new C11157b(14);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C24764a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c11157b15, 2)), false);
        C11157b c11157b16 = new C11157b(15);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C3681d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c11157b16, 2)), false);
        C4283a c4283a4 = new C4283a(24);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C6450c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c4283a4, 2)), false);
        C4283a c4283a5 = new C4283a(26);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C41163a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c4283a5, 2)), false);
        C4283a c4283a6 = new C4283a(27);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C39800c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c4283a6, 2)), false);
        C4283a c4283a7 = new C4283a(28);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C11156a.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass23, null, c4283a7, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        return C23454a0.f92919a;
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m30243z(c33768a);
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
