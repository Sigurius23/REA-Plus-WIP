package ej0;

import aws.smithy.kotlin.runtime.ClientException;
import cf.C4528c;
import cf.C4533h;
import cf.InterfaceC4536k;
import cg.C4559n;
import cg.C4560o;
import com.whoop.data.repositories.FeatureFlagChecker;
import dc1.C11906c;
import dj0.C12066b;
import dj0.C12086v;
import ds2.C12347a;
import eg.C13162k;
import eg.C13166o;
import gj0.C15917d;
import hy1.C17809a;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import ne.C26592a;
import ne.C26593b;
import ne.C26595d;
import ne.InterfaceC26594c;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p249jc.C21568b0;
import p392p3.C28761b0;
import p459rf.C31344o;
import p459rf.C31347r;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import ud3.C34826l0;
import uf3.C34911a;
import vf3.C35953c;
import vg.AbstractC35959f;
import vg.C35958e;
import vg.EnumC35969p;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import ye.C39475b;

/* JADX INFO: renamed from: ej0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lej0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lhy1/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13227a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C17809a> dependencies = AbstractC37056f.m118958J(new C17809a());

    /* JADX INFO: renamed from: e */
    private static final C23454a0 m37130e(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C12347a c12347a = new C12347a(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC26594c.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c12347a, 1)), false);
        C12347a c12347a2 = new C12347a(26);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C12066b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c12347a2, 2)), false);
        C12347a c12347a3 = new C12347a(27);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C12086v.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass3, null, c12347a3, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC26594c m37131f(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC32943y abstractC32943y = (AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null);
        C34826l0 c34826l0 = (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("unauthenticatedOkHttpClient"));
        C26592a c26592a = new C26592a();
        m37132g(abstractC32943y, c34826l0, c26592a);
        c26592a.f105764h.add(0, new C39475b());
        C26593b config = (C26593b) ((InterfaceC4536k) c26592a.build());
        AbstractC22676k.m65750j(config, "config");
        return new C26595d(config);
    }

    /* JADX INFO: renamed from: g */
    private static final C23454a0 m37132g(AbstractC32943y abstractC32943y, C34826l0 client, C26592a CognitoIdentityProviderClient) {
        AbstractC22676k.m65750j(CognitoIdentityProviderClient, "$this$CognitoIdentityProviderClient");
        CognitoIdentityProviderClient.f105760d = "us-west-2";
        CognitoIdentityProviderClient.f105763g = C4559n.m14242a(C4560o.f18367i, abstractC32943y.getApiBaseUrl() + "/auth-service/v3/whoop");
        AbstractC22676k.m65750j(client, "client");
        CognitoIdentityProviderClient.f105757a.m133455G(new C31344o(C31347r.f128984m, client));
        CognitoIdentityProviderClient.f105766j = new C15917d();
        CognitoIdentityProviderClient.f105765i = C4528c.f18259e;
        C11906c c11906c = new C11906c(25);
        C4533h c4533h = CognitoIdentityProviderClient.f105758b;
        c4533h.getClass();
        C21568b0 c21568b0 = c4533h.f18267a;
        c21568b0.getClass();
        if (AbstractC35959f.f153124a[((EnumC35969p) c21568b0.f82716f).ordinal()] == 2) {
            throw new ClientException("An explicit instance is already configured and its configuration cannot be modified");
        }
        c21568b0.f82716f = EnumC35969p.f153153y;
        c21568b0.f82715e = C13166o.f45617b;
        c21568b0.f82714d = new C28761b0(15, (Function1) c21568b0.f82714d, c11906c);
        c21568b0.f82717g = new C35958e(c21568b0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m37133h(C13162k retryStrategy) {
        AbstractC22676k.m65750j(retryStrategy, "$this$retryStrategy");
        retryStrategy.f45589b = 1;
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C12066b m37134i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12066b((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC26594c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26594c.class), null), null, (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (C12086v) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12086v.class), null), null, 36, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C12086v m37135j(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C12086v();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m37130e(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C17809a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
