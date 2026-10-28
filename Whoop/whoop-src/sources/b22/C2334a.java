package b22;

import ad3.AbstractC0757c;
import androidx.fragment.app.AbstractActivityC1340r0;
import ao1.C1871f;
import ao1.C1874i;
import ci2.InterfaceC4733b;
import com.google.gson.Gson;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.pairing.membershipAdjustment.api.MembershipAdjustmentApi;
import d22.C11512c;
import f22.C14033e;
import f22.C14034f;
import g22.C15284d;
import ge3.AbstractC15751g;
import h22.C16782a;
import j02.InterfaceC21159o0;
import j22.C21258g;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Set;
import k22.C22163c;
import k22.C22166f;
import l22.C23240a;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import qt0.InterfaceC30585a;
import rf3.C31362a;
import sr2.AbstractC32943y;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: b22.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lb22/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2334a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: l */
    private static final C23454a0 m7205l(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C1874i c1874i = new C1874i(8);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C22166f.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c1874i, 2)), false);
        C1874i c1874i2 = new C1874i(9);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C23240a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c1874i2, 2)), false);
        C1874i c1874i3 = new C1874i(10);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C22163c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c1874i3, 2)), false);
        C1874i c1874i4 = new C1874i(11);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C21258g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c1874i4, 2)), false);
        C1874i c1874i5 = new C1874i(12);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(MembershipAdjustmentApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c1874i5, 2)), false);
        C1874i c1874i6 = new C1874i(13);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C11512c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c1874i6, 2)), false);
        C1874i c1874i7 = new C1874i(14);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C16782a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c1874i7, 2)), false);
        C1874i c1874i8 = new C1874i(15);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C14034f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c1874i8, 2)), false);
        C1874i c1874i9 = new C1874i(16);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C14033e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c1874i9, 2)), false);
        C1874i c1874i10 = new C1874i(17);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C15284d.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass10, null, c1874i10, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C22166f m7206m(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("PairingViewModel");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22166f(null, interfaceC34116nM107848a, (C23240a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C23240a.class), null), (C22163c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22163c.class), null), (C21258g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21258g.class), null), (InterfaceC30585a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30585a.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23240a m7207n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C23240a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C22163c m7208o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22163c(InterfaceC34116n.INSTANCE.m107848a("PairingUiDomainInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C21258g m7209p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21258g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final MembershipAdjustmentApi m7210q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Gson gson = new Gson();
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        Set<String> setM34570S = AbstractC12350b.m34570S("kt-serialization-pairing-membership-adjustment-module");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a(gson, abstractC0757cM109496c, setM34570S);
        C29222x0 c29222x0 = new C29222x0();
        return (MembershipAdjustmentApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), MembershipAdjustmentApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C11512c m7211r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11512c((MembershipAdjustmentApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipAdjustmentApi.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (BannerInvalidator) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BannerInvalidator.class), null), (PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), InterfaceC34116n.INSTANCE.m107848a("MembershipAdjustmentInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C16782a m7212s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C16782a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C14034f m7213t(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class));
        return new C14034f(abstractActivityC1340r0, (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (InterfaceC21159o0) factory.m122602a(new C1871f(abstractActivityC1340r0, 1), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C34911a m7214u(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final C14033e m7215v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14033e(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C15284d m7216w(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15284d((C11512c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11512c.class), null), (C16782a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C16782a.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m7205l(c33768a);
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
