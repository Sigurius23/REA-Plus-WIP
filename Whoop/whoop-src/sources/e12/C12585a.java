package e12;

import android.app.Application;
import b83.C2807c;
import com.whoop.oauthintegration.api.OAuthIntegrationApi;
import ds2.C12347a;
import f12.C14011c;
import g12.C15223a;
import g12.C15224b;
import g12.C15227e;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import or2.C28175k0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import qf3.C30330b;
import r80.AbstractC31061c;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u82.AbstractC34650k;
import ud3.C34826l0;
import uf3.C34911a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: e12.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Le12/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lnd1/i;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12585a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C26583i> dependencies = AbstractC37056f.m118958J(new C26583i());

    /* JADX INFO: renamed from: f */
    private static final C23454a0 m35282f(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C12347a c12347a = new C12347a(15);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(OAuthIntegrationApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c12347a, 1)), false);
        C12347a c12347a2 = new C12347a(16);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C15224b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c12347a2, 1)), false);
        C12347a c12347a3 = new C12347a(17);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C14011c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c12347a3, 2)), false);
        C12347a c12347a4 = new C12347a(18);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C15223a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c12347a4, 2)), false);
        C12347a c12347a5 = new C12347a(19);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C15227e.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass5, null, c12347a5, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final OAuthIntegrationApi m35283g(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "defaultOkHttpClient")));
        c29222x0M73382o.m88728b(AbstractC34650k.m109497d());
        Object objM88733b = c29222x0M73382o.m88730d().m88733b(OAuthIntegrationApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (OAuthIntegrationApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C15224b m35284h(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C15224b(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final C14011c m35285i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14011c((OAuthIntegrationApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OAuthIntegrationApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C15223a m35286j(C38266c factory, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Application applicationM88531h = AbstractC29125c.m88531h(factory);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15223a(applicationM88531h, (C28175k0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28175k0.class), null), (C15224b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15224b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C15227e m35287k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15227e((C14011c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14011c.class), null), (C15223a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15223a.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m35282f(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C26583i> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
