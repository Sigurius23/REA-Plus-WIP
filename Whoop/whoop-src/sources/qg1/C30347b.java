package qg1;

import android.content.Context;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import ci2.InterfaceC4733b;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.firmwareUpdateService.data.api.OtaFirmwareUpdateApi;
import ct0.InterfaceC11107b;
import fi0.InterfaceC14515a;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16183e;
import j93.InterfaceC21461d;
import java.io.File;
import java.time.Clock;
import java.util.List;
import jg1.C21668a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kg1.C22454a;
import l83.C23454a0;
import lg1.C24035a;
import m32.InterfaceC25005a;
import mg1.C25529b;
import mg1.C25530c;
import nd1.InterfaceC26584j;
import og1.C27918a;
import or2.C28217y0;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg1.C29163a;
import pg1.C29165c;
import pg3.C29224y0;
import q42.C29976a;
import qf3.C30330b;
import qt0.InterfaceC30585a;
import rf3.C31362a;
import rf3.C31365d;
import rg1.C31385a;
import rg1.C31387c;
import rg1.InterfaceC31386b;
import sg1.InterfaceC32449a;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uf3.C34911a;
import ug1.C34937a;
import ug1.C34938b;
import ug1.C34939c;
import ug1.C34942f;
import ug1.C34944h;
import ug1.C34947k;
import ug1.InterfaceC34943g;
import vf3.C35953c;
import wf3.C37247a;
import wg1.C37263b;
import wg1.C37264c;
import wg1.InterfaceC37262a;
import xf3.C38266c;
import y42.C39228j;

/* JADX INFO: renamed from: qg1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lqg1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30347b implements InterfaceC26584j {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC31386b m92744A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("FirmwareUpdateManagerImpl");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C31387c c31387c = (C31387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31387c.class), null);
        InterfaceC32449a interfaceC32449a = (InterfaceC32449a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32449a.class), null);
        C34942f c34942f = (C34942f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34942f.class), null);
        InterfaceC16182d interfaceC16182d = (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null);
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C22454a(interfaceC34116nM107848a, c31387c, interfaceC32449a, c34942f, interfaceC16182d, clockSystemDefaultZone, interfaceC2994c0, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC37262a m92745B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("FirmwareUpdateSchedulerImpl");
        C35953c c35953c = new C35953c("workManagerInstance");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37263b(interfaceC34116nM107848a, (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), c35953c), (C31387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31387c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC16183e m92746C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("FirmwareUpdateApiImpl");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31385a(interfaceC34116nM107848a, (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC31386b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31386b.class), null), (InterfaceC37262a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37262a.class), null), (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C37264c m92747D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37264c((AbstractC18377p0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), InterfaceC34116n.INSTANCE.m107848a("PeriodicFwUpdateInitializer"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC16182d m92748E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21668a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C31387c m92749F(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31387c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final OtaFirmwareUpdateApi m92750G(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(OtaFirmwareUpdateApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (OtaFirmwareUpdateApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C25529b m92751H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        File filesDir = AbstractC29125c.m88532i(factory).getFilesDir();
        AbstractC22676k.m65749i(filesDir, "getFilesDir(...)");
        return new C25529b(executorC22364d, featureFlagChecker, (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), filesDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C24035a m92752I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24035a((OtaFirmwareUpdateApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OtaFirmwareUpdateApi.class), null), InterfaceC34116n.INSTANCE.m107848a("OtaFwUpdateApiWrapper"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC32449a m92753J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27918a((InterfaceC11107b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC11107b.class), null), (C25529b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25529b.class), null), (C25530c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25530c.class), null), (C24035a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24035a.class), null), (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC34943g m92754K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34944h(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34938b m92755L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        C25529b c25529b = (C25529b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25529b.class), null);
        InterfaceC32449a interfaceC32449a = (InterfaceC32449a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32449a.class), null);
        InterfaceC34943g interfaceC34943g = (InterfaceC34943g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34943g.class), null);
        InterfaceC16182d interfaceC16182d = (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C34938b(interfaceC4733b, c25529b, interfaceC34943g, interfaceC32449a, interfaceC16182d, clockSystemDefaultZone, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, null, 384, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34937a m92756M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34937a((C25529b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25529b.class), null), (InterfaceC34943g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34943g.class), null), (InterfaceC32449a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32449a.class), null), (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null), (C39228j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null), null, null, 96, null);
    }

    /* JADX INFO: renamed from: t */
    private static final C23454a0 m92776t(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "whoop_firmware_preferences");
        C29976a c29976a = new C29976a(28);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C34660d.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c29976a, 1)), false);
        C29976a c29976a2 = new C29976a(29);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C25530c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c29976a2, 1)), false);
        C30346a c30346a = new C30346a(0);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C31387c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c30346a, 1)), false);
        C30346a c30346a2 = new C30346a(1);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(OtaFirmwareUpdateApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c30346a2, 2)), false);
        C30346a c30346a3 = new C30346a(2);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C25529b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c30346a3, 2)), false);
        C30346a c30346a4 = new C30346a(3);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C24035a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c30346a4, 2)), false);
        C30346a c30346a5 = new C30346a(4);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC32449a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c30346a5, 2)), false);
        C30346a c30346a6 = new C30346a(5);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(InterfaceC34943g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c30346a6, 2)), false);
        C30346a c30346a7 = new C30346a(6);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C34938b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c30346a7, 2)), false);
        C30346a c30346a8 = new C30346a(7);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C34937a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c30346a8, 2)), false);
        C30346a c30346a9 = new C30346a(8);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C29165c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c30346a9, 2)), false);
        C30346a c30346a10 = new C30346a(9);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C34939c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c30346a10, 2)), false);
        C30346a c30346a11 = new C30346a(10);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C34947k.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c30346a11, 2)), false);
        C30346a c30346a12 = new C30346a(11);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C34942f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c30346a12, 2)), false);
        C30346a c30346a13 = new C30346a(12);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(InterfaceC31386b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c30346a13, 2)), false);
        C30346a c30346a14 = new C30346a(13);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(InterfaceC37262a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c30346a14, 2)), false);
        C30346a c30346a15 = new C30346a(14);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c30346a15, 2)), false);
        C30346a c30346a16 = new C30346a(15);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C37264c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c30346a16, 2)), false);
        C30346a c30346a17 = new C30346a(16);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass19, null, c30346a17, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C34660d m92777u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34660d(AbstractC29125c.m88531h(single), "whoop_firmware_preferences");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C25530c m92778v(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C25530c((C34660d) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), new C35953c("whoop_firmware_preferences")), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C29165c m92779w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29165c((InterfaceC34116n) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C34939c m92780x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        C25529b c25529b = (C25529b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25529b.class), null);
        InterfaceC32449a interfaceC32449a = (InterfaceC32449a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32449a.class), null);
        InterfaceC34943g interfaceC34943g = (InterfaceC34943g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34943g.class), null);
        InterfaceC16182d interfaceC16182d = (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null);
        C29165c c29165c = (C29165c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29165c.class), null);
        Context context = (Context) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null);
        C29163a c29163a = (C29163a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29163a.class), null);
        InterfaceC30585a interfaceC30585a = (InterfaceC30585a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30585a.class), null);
        return new C34939c(interfaceC4733b, c25529b, interfaceC34943g, interfaceC32449a, interfaceC16182d, (C28217y0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28217y0.class), null), interfaceC30585a, c29163a, context, c29165c, (InterfaceC25005a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null), InterfaceC34116n.INSTANCE.m107848a("DfuUpdateStrategy"), null, 4096, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C34947k m92781y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34947k((C34938b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34938b.class), null), (C34939c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34939c.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), InterfaceC34116n.INSTANCE.m107848a("UnifiedUpdateStrategy"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C34942f m92782z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34942f((C34938b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34938b.class), null), (C34947k) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34947k.class), null), (C34937a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34937a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m92776t(c33768a);
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
