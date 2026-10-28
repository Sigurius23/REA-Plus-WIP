package xe1;

import com.whoop.data.repositories.ActiveSessionChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.entitlements.MemberEntitlementsApi;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import we1.C37223g;
import we1.InterfaceC37217a;
import we1.InterfaceC37218b;
import we1.InterfaceC37225i;
import we1.InterfaceC37226j;
import we1.InterfaceC37229m;
import wf3.C37247a;
import x52.C37993a;
import xf3.C38266c;

/* JADX INFO: renamed from: xe1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lxe1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38231a implements InterfaceC26584j {
    /* JADX INFO: renamed from: c */
    private static final C23454a0 m122506c(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C37993a c37993a = new C37993a(5);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C37223g.class);
        C35953c c35953c = C37247a.f159360e;
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass, null, c37993a, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
        InterfaceC21461d[] interfaceC21461dArr = {c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), c22673i0.getOrCreateKotlinClass(InterfaceC37229m.class)};
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74130h1((Collection) c30330b.f124475f, interfaceC21461dArr);
        for (InterfaceC21461d interfaceC21461d : interfaceC21461dArr) {
            module.m106774b(AbstractC21598x.m60669Y(interfaceC21461d, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        }
        C37993a c37993a2 = new C37993a(6);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(MemberEntitlementsApi.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass2, null, c37993a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C37223g m122507d(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37223g((InterfaceC37218b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37218b.class), null), (InterfaceC37226j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37226j.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (ActiveSessionChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ActiveSessionChecker.class), null), null, (MemberEntitlementsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(MemberEntitlementsApi.class), null), null, null, (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC37225i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37225i.class), null), 208, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final MemberEntitlementsApi m122508e(C38266c c38266c, C34911a c34911a) {
        return (MemberEntitlementsApi) ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(MemberEntitlementsApi.class);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m122506c(c33768a);
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
