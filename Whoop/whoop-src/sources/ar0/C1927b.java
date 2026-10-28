package ar0;

import ao1.C1874i;
import br0.C3556c;
import com.whoop.communityfollowercontainer.api.CommunityFollowerContainerApi;
import com.whoop.design.json.AbstractC6728b;
import dr0.C12294a;
import er0.C13577a;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
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
import sr2.AbstractC32943y;
import tf3.C33768a;
import ud3.C34826l0;
import uf3.C34911a;
import v01.AbstractC35504f;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;

/* JADX INFO: renamed from: ar0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lar0/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1927b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: f */
    private static final C23454a0 m5899f(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C1874i c1874i = new C1874i(4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(CommunityFollowerContainerApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c1874i, 2)), false);
        C1874i c1874i2 = new C1874i(5);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C3556c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c1874i2, 2)), false);
        C1874i c1874i3 = new C1874i(6);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C13577a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c1874i3, 2)), false);
        C1874i c1874i4 = new C1874i(7);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(AbstractC35504f.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass4, null, c1874i4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final CommunityFollowerContainerApi m5900g(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (CommunityFollowerContainerApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null), c29222x0M73382o, "defaultOkHttpClient")), CommunityFollowerContainerApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C3556c m5901h(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3556c((CommunityFollowerContainerApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CommunityFollowerContainerApi.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (String) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(String.class)), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final C13577a m5902i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13577a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final AbstractC35504f m5903j(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12294a((C3556c) viewModel.m122602a(new C1926a((String) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(String.class)), 0), c22673i0.getOrCreateKotlinClass(C3556c.class), null), (C13577a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13577a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C34911a m5904k(String str) {
        return AbstractC15751g.m44431K(str);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m5899f(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
