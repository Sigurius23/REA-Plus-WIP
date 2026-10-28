package nc2;

import ad3.AbstractC0757c;
import ao1.C1873h;
import com.google.gson.Gson;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.settings.referafriendmenu.api.ReferAFriendMenuApi;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25260n;
import mc2.C25424c;
import mc2.C25427f;
import mc2.C25428g;
import n52.C26302a;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
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
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.C34642c;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: nc2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lnc2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26570a implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f105674c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: i */
    private static final C23454a0 m78739i(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C26302a c26302a = new C26302a(2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C25427f.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c26302a, 2)), false);
        C26302a c26302a2 = new C26302a(3);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C25424c.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, null, c26302a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false, "raf-menu-bff-cache-deserializer");
        C26302a c26302a3 = new C26302a(4);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r, c26302a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r, c35953c), false, "raf-menu-gson");
        C26302a c26302a4 = new C26302a(5);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM73385r3 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r2, c26302a4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r2, c35953c), false, "raf-menu-json");
        C26302a c26302a5 = new C26302a(6);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, c35953cM73385r3, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, c35953cM73385r3, c26302a5, 2)), false);
        C26302a c26302a6 = new C26302a(7);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(ReferAFriendMenuApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c26302a6, 1)), false);
        C26302a c26302a7 = new C26302a(8);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C25428g.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass7, null, c26302a7, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C25427f m78740j(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25427f((C25424c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25424c.class), null), (C25428g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25428g.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C25424c m78741k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25424c((ReferAFriendMenuApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ReferAFriendMenuApi.class), null), (InterfaceC26834e) factory.m122602a(new C1873h(factory, 21), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), InterfaceC34116n.INSTANCE.m107848a("RafMenuInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C34911a m78742l(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("raf-menu-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC34640a m78743m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("raf-menu-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("raf-menu-gson")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-settings"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Gson m78744n(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final AbstractC0757c m78745o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final ReferAFriendMenuApi m78746p(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("raf-menu-gson")), (AbstractC0757c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("raf-menu-json")), AbstractC12350b.m34570S("kt-serialization-settings"));
        C29222x0 c29222x0 = new C29222x0();
        return (ReferAFriendMenuApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), ReferAFriendMenuApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C25428g m78747q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25428g();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m78739i(c33768a);
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
