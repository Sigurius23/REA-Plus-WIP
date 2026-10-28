package mb2;

import ad3.AbstractC0757c;
import androidx.fragment.app.AbstractActivityC1340r0;
import ao1.C1871f;
import com.google.gson.Gson;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.settings.gifthub.api.GiftHubApi;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import lb2.C23755b;
import nb2.C26542d;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p294l3.C23257h0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pb2.C29060c;
import pg3.C29222x0;
import qf3.C30330b;
import rb2.C31192a;
import rf3.C31362a;
import sr2.AbstractC32943y;
import tb2.C33693a;
import tf3.C33768a;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: mb2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lmb2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25383a implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f99468c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: j */
    private static final C23454a0 m74446j(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C23257h0 c23257h0 = new C23257h0(22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C26542d.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, null, c23257h0, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false, "gift-hub-gson");
        C23257h0 c23257h1 = new C23257h0(23);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c23257h1, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "gift-hub-json");
        C23257h0 c23257h2 = new C23257h0(24);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c23257h2, 2)), false);
        C23257h0 c23257h3 = new C23257h0(25);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(GiftHubApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c23257h3, 2)), false);
        C23257h0 c23257h4 = new C23257h0(26);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C29060c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c23257h4, 2)), false);
        C23257h0 c23257h5 = new C23257h0(27);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C23755b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c23257h5, 2)), false);
        C23257h0 c23257h6 = new C23257h0(28);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C31192a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c23257h6, 2)), false);
        C23257h0 c23257h7 = new C23257h0(29);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C33693a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass8, null, c23257h7, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C26542d m74447k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26542d((GiftHubApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(GiftHubApi.class), null), (C23755b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C23755b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Gson m74448l(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final AbstractC0757c m74449m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final GiftHubApi m74450n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("gift-hub-gson")), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("gift-hub-json")), AbstractC12350b.m34570S("kt-serialization-settings"));
        C29222x0 c29222x0 = new C29222x0();
        return (GiftHubApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), GiftHubApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C29060c m74451o(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29060c((AbstractC12939a0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class)), (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 5), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (C23755b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C23755b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C34911a m74452p(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23755b m74453q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C23755b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C31192a m74454r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31192a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C33693a m74455s(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33693a((C26542d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C26542d.class), null), (C31192a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31192a.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m74446j(c33768a);
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
