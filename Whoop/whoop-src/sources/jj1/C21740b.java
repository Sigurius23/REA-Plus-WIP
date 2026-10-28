package jj1;

import ad3.AbstractC0757c;
import bc3.InterfaceC2994c0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.healthconnect.domain.HealthConnectApi;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hj1.C17364a;
import ij1.C18596a;
import ix2.C21023b;
import j93.InterfaceC21461d;
import java.util.List;
import kj1.C22516c;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import nj1.C26752b;
import oj1.C27979a;
import p007a6.C0438l0;
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
import pj1.C29297a;
import pj1.C29298b;
import pj1.C29299c;
import qf3.C30330b;
import qj1.C30429b;
import qj1.C30430c;
import qj1.C30431d;
import qj1.C30432e;
import qj1.C30433f;
import qj1.C30434g;
import qj1.C30435h;
import rf3.C31362a;
import rf3.C31365d;
import rj1.C31487a;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;
import u82.C34643d;
import u82.C34644e;
import u92.C34660d;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: jj1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Ljj1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21740b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C31487a m61307A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31487a(AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C17364a m61308B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17364a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C29299c m61309C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29299c((HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C26752b m61310D(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26752b((C22516c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22516c.class), null), (C27979a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27979a.class), null), null, (C17364a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17364a.class), null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C22516c m61311E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22516c((C29298b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29298b.class), null), (C17364a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17364a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C27979a m61312F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27979a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C29297a m61313G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29297a((C29298b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29298b.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C30430c m61314H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30430c((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), null, (HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C31487a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31487a.class), null), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C30431d m61315I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30431d((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), null, (HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C31487a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31487a.class), null), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C30435h m61316J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30435h((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), null, (HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C31487a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31487a.class), null), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C30434g m61317K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30434g((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), null, (HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C31487a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31487a.class), null), 10, null);
    }

    /* JADX INFO: renamed from: s */
    private static final C23454a0 m61336s(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C21023b c21023b = new C21023b(19);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(HealthConnectApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c21023b, 1)), false);
        C21739a c21739a = new C21739a(4);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C29298b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c21739a, 1)), false);
        C21739a c21739a2 = new C21739a(5);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C26752b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c21739a2, 2)), false);
        C21023b c21023b2 = new C21023b(20);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C22516c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c21023b2, 2)), false);
        C21023b c21023b3 = new C21023b(21);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C27979a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c21023b3, 2)), false);
        C21023b c21023b4 = new C21023b(22);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C29297a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c21023b4, 2)), false);
        C21023b c21023b5 = new C21023b(23);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C30430c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c21023b5, 2)), false);
        C21023b c21023b6 = new C21023b(24);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C30431d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c21023b6, 2)), false);
        C21023b c21023b7 = new C21023b(25);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C30435h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c21023b7, 2)), false);
        C21023b c21023b8 = new C21023b(26);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C30434g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c21023b8, 2)), false);
        C21023b c21023b9 = new C21023b(27);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C30433f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c21023b9, 2)), false);
        C21023b c21023b10 = new C21023b(28);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C30432e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c21023b10, 2)), false);
        C21023b c21023b11 = new C21023b(29);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C30429b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c21023b11, 2)), false);
        C21739a c21739a3 = new C21739a(0);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C18596a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c21739a3, 2)), false);
        C21739a c21739a4 = new C21739a(1);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C31487a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c21739a4, 2)), false);
        C21739a c21739a5 = new C21739a(2);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C17364a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c21739a5, 2)), false);
        C21739a c21739a6 = new C21739a(3);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C29299c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass17, null, c21739a6, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final HealthConnectApi m61337t(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Gson gsonCreate = new GsonBuilder().create();
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM109496c, AbstractC12350b.m34570S("kt-serialization-health-connect"));
        Object objM88733b = ((C29224y0) single.m122602a(new C0438l0(c34643dM109481a, 28), c22673i0.getOrCreateKotlinClass(C29224y0.class), new C35953c("featureFlaggableDefaultRetrofit"))).m88733b(HealthConnectApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (HealthConnectApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C34911a m61338u(C34643d c34643d) {
        return AbstractC15751g.m44431K(c34643d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C29298b m61339v(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29298b((C18596a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C18596a.class), null), (C30430c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30430c.class), null), (C30431d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30431d.class), null), (C30435h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30435h.class), null), (C30434g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30434g.class), null), (C30433f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30433f.class), null), (C30432e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30432e.class), null), (C30429b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30429b.class), null), (C29299c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C29299c.class), null), InterfaceC34116n.INSTANCE.m107848a("HealthConnectRepository"), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C30433f m61340w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30433f((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), null, (HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C31487a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31487a.class), null), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C30432e m61341x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30432e((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), null, (HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C31487a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31487a.class), null), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C30429b m61342y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30429b((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), null, (HealthConnectApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthConnectApi.class), null), null, (C31487a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31487a.class), null), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C18596a m61343z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C18596a(AbstractC29125c.m88532i(factory), InterfaceC34116n.INSTANCE.m107848a("HealthConnectClientWrapper"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m61336s(c33768a);
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
