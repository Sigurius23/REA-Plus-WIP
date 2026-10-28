package zc2;

import ci2.InterfaceC4733b;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.UserStrapsRepository;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p705ea2.C12901d0;
import p705ea2.C12905f0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import we1.InterfaceC37217a;
import wf3.C37247a;
import xf3.C38266c;
import yf2.C39520a;

/* JADX INFO: renamed from: zc2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lzc2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40537a implements InterfaceC26584j {
    /* JADX INFO: renamed from: c */
    private static final C23454a0 m131370c(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C39520a c39520a = new C39520a(23);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C12901d0.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c39520a, 2)), false);
        C39520a c39520a2 = new C39520a(24);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C12905f0.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass2, null, c39520a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C12901d0 m131371d(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12901d0((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C12905f0 m131372e(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12905f0((UserStrapsRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(UserStrapsRepository.class), null), (InterfaceC4733b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C12901d0) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12901d0.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m131370c(c33768a);
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
