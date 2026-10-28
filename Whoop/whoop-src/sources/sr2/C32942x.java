package sr2;

import j93.InterfaceC21461d;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import qf3.C30330b;
import rf3.C31364c;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import xf3.C38266c;
import zf3.C40614a;

/* JADX INFO: renamed from: sr2.x */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsr2/x;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32942x implements InterfaceC26584j {
    /* JADX INFO: renamed from: b */
    private static final C23454a0 m104012b(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "scopeConnectStrap");
        m104013c(new C40614a(c35953cM73386s, c33768a));
        c33768a.f141345c.add(c35953cM73386s);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    private static final C23454a0 m104013c(C40614a scope) {
        AbstractC22676k.m65750j(scope, "$this$scope");
        C35953c c35953c = new C35953c("bleStrap");
        C32939u c32939u = new C32939u(16);
        C35953c c35953c2 = scope.f175045a;
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(AtomicReference.class);
        C30330b c30330b = new C30330b(c35953c2, orCreateKotlinClass, c35953c, c32939u, 3);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass, c35953c, c35953c2);
        C31364c c31364c = new C31364c(c30330b);
        c31364c.f129024b = new HashMap();
        scope.f175046b.m106774b(strM60669Y, c31364c, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final AtomicReference m104014d(C38266c scoped, C34911a it) {
        AbstractC22676k.m65750j(scoped, "$this$scoped");
        AbstractC22676k.m65750j(it, "it");
        return new AtomicReference();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m104012b(c33768a);
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
