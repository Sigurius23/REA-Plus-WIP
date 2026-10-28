package nd1;

import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.ProcessLifecycleOwner;
import ao1.C1873h;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.whoop.data.repositories.FeatureFlagChecker;
import hj0.C17345d;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kh2.C22487b;
import l83.C23454a0;
import m32.C25006b;
import m32.C25008d;
import m32.C25010f;
import m32.InterfaceC25005a;
import m32.InterfaceC25007c;
import or2.C28175k0;
import or2.C28206u1;
import or2.InterfaceC28203t1;
import p007a6.InterfaceC0422g;
import p082d6.C11724b;
import p138f6.C14131c;
import p236j.AbstractC21071j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: nd1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lnd1/m;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26587m implements InterfaceC26584j {
    /* JADX INFO: renamed from: l */
    private static final C23454a0 m79072l(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        HashSet hashSet = module.f141343a;
        C26582h c26582h = new C26582h(2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, null, c26582h, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false, "appLifecycleOwnerr");
        C26582h c26582h2 = new C26582h(3);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC1585g0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c26582h2, 1)), false);
        C26582h c26582h3 = new C26582h(4);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C17345d.class);
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass3, null, c26582h3, 1);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c);
        C31365d c31365d = new C31365d(c30330b);
        module.m106774b(strM60669Y, c31365d, false);
        hashSet.add(c31365d);
        C35953c c35953c2 = new C35953c("required-permissions-helper");
        C26582h c26582h4 = new C26582h(5);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC25007c.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass4, c35953c2, c26582h4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953c2, c35953c), false, "push-notification-permission-helper");
        C26582h c26582h5 = new C26582h(6);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(InterfaceC25007c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, c35953cM73385r2, c26582h5, 2)), false);
        C26582h c26582h6 = new C26582h(7);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C25010f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c26582h6, 2)), false);
        C26582h c26582h7 = new C26582h(8);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC28203t1.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c26582h7, 2)), false);
        C26582h c26582h8 = new C26582h(9);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C22487b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c26582h8, 1)), false);
        C26582h c26582h9 = new C26582h(10);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass9, null, c26582h9, 1)), false);
        C26582h c26582h10 = new C26582h(11);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C28175k0.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass10, null, c26582h10, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC25005a m79073m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25006b(AbstractC29125c.m88531h(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC1585g0 m79074n(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f6173I;
        return ProcessLifecycleOwner.f6173I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C17345d m79075o(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17345d((InterfaceC1585g0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC1585g0.class), new C35953c("appLifecycleOwnerr")), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC25007c m79076p(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25008d(InterfaceC34116n.INSTANCE.m107848a("BluetoothPermissionHelperImpl"), (AbstractC21071j) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC21071j.class)), (InterfaceC25005a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null), (List) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(List.class)), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC25007c m79077q(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25008d(InterfaceC34116n.INSTANCE.m107848a("PushNotificationPermissionsHelper"), (AbstractC21071j) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC21071j.class)), (InterfaceC25005a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null), (List) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(List.class)), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (String) c34911a.m110110a(2, c22673i0.getOrCreateKotlinClass(String.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final C25010f m79078r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25010f((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC28203t1 m79079s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28206u1(AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C22487b m79080t(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C22487b(AbstractC29125c.m88531h(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC0422g m79081u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        List<C11724b> listM64988a = ((C22487b) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22487b.class), null)).m64988a();
        C22365e c22365e = AbstractC3050q0.f12077a;
        return C14131c.m40232d(listM64988a, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())), new C1873h(single, 27), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final File m79082v(C38266c c38266c) {
        return AbstractC21598x.m60684i0(AbstractC29125c.m88531h(c38266c), "complete_data_store_file");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C28175k0 m79083w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28175k0();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m79072l(c33768a);
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
