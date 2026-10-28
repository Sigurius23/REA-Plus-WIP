package xh1;

import ai1.InterfaceC0909a;
import android.content.Context;
import bc3.InterfaceC2994c0;
import ci1.C4730a;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.gps.foreground.network.ForegroundGpsApi;
import com.whoop.gps.network.GpsTrackingApi;
import ei1.InterfaceC13220a;
import fi0.InterfaceC14515a;
import fi1.C14520a;
import fi1.C14522c;
import fi1.InterfaceC14521b;
import fv1.InterfaceC14815c;
import gi1.C15892b;
import hi1.C17315a;
import ii1.InterfaceC18571a;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.List;
import ji1.C21721b;
import ji1.InterfaceC21720a;
import js0.AbstractC21909c;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.AbstractC29199m;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rh1.C31439a;
import sh1.C32504c;
import sh1.C32506e;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import ud3.C34826l0;
import uf3.C34911a;
import uh1.InterfaceC34966a;
import vf3.C35953c;
import wf3.C37247a;
import wh1.C37299a;
import x52.C37993a;
import xf3.C38266c;
import zh1.C40642d;
import zh1.InterfaceC40639a;

/* JADX INFO: renamed from: xh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lxh1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38309a implements InterfaceC26584j {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final ForegroundGpsApi m122743A(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        AbstractC29199m abstractC29199mM109482a = AbstractC34645f.m109482a(AbstractC6728b.m20380e(single, null, null, null, null, null, 31, null));
        C29222x0 c29222x0 = new C29222x0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0.m88729c(((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(abstractC29199mM109482a);
        return (ForegroundGpsApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), ForegroundGpsApi.class, "create(...)");
    }

    /* JADX INFO: renamed from: n */
    private static final C23454a0 m122757n(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C37993a c37993a = new C37993a(12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC18571a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c37993a, 1)), false);
        C37993a c37993a2 = new C37993a(19);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(GpsTrackingApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c37993a2, 1)), false);
        C37993a c37993a3 = new C37993a(20);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC21720a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c37993a3, 1)), false);
        C37993a c37993a4 = new C37993a(21);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C17315a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c37993a4, 1)), false);
        C37993a c37993a5 = new C37993a(22);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C15892b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c37993a5, 2)), false);
        C37993a c37993a6 = new C37993a(23);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C31439a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c37993a6, 1)), false);
        C37993a c37993a7 = new C37993a(24);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C32504c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c37993a7, 1)), false);
        C37993a c37993a8 = new C37993a(13);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(InterfaceC40639a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c37993a8, 2)), false);
        C37993a c37993a9 = new C37993a(14);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC13220a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass9, null, c37993a9, 1)), false);
        C37993a c37993a10 = new C37993a(15);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(ForegroundGpsApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass10, null, c37993a10, 1)), false);
        C37993a c37993a11 = new C37993a(16);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(InterfaceC14521b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass11, null, c37993a11, 1)), false);
        C37993a c37993a12 = new C37993a(17);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C14520a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass12, null, c37993a12, 1)), false);
        C37993a c37993a13 = new C37993a(18);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C32506e.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass13, null, c37993a13, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC18571a m122758o(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37299a((InterfaceC34966a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34966a.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final GpsTrackingApi m122759p(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        AbstractC29199m abstractC29199mM109482a = AbstractC34645f.m109482a(AbstractC6728b.m20380e(single, null, null, null, null, null, 31, null));
        C29222x0 c29222x0 = new C29222x0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0.m88729c(((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(abstractC29199mM109482a);
        return (GpsTrackingApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), GpsTrackingApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC14521b m122760q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C14522c((ForegroundGpsApi) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ForegroundGpsApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ForegroundGpsUploader"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C14520a m122761r(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C14520a((AbstractC18377p0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C32506e m122762s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32506e((C32504c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32504c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (Context) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (C31439a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31439a.class), null), (C17315a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17315a.class), null), null, null, 0, 896, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC21720a m122763t(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C21721b((GpsTrackingApi) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(GpsTrackingApi.class), null), InterfaceC34116n.INSTANCE.m107848a("BackendUploader"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C17315a m122764u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("workManagerInstance");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17315a((AbstractC18377p0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), c35953c), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C15892b m122765v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15892b((Context) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Context.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C31439a m122766w(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31439a((C15892b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15892b.class), null), (InterfaceC14515a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C32504c m122767x(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32504c((Context) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC18571a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18571a.class), null), (C15892b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15892b.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, null, null, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC40639a m122768y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40642d((FusedLocationProviderClient) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FusedLocationProviderClient.class), null), (InterfaceC14815c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14815c.class), null), (C15892b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15892b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC13220a m122769z(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C4730a((InterfaceC0909a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0909a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m122757n(c33768a);
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
