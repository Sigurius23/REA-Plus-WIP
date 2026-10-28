package hk2;

import android.content.Context;
import b83.C2807c;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.tombstone.TombstoneApi;
import gk2.C15929d;
import gk2.C15931f;
import gk2.C15933h;
import gk2.InterfaceC15928c;
import hf2.C17237a;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.List;
import js0.AbstractC21909c;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import od1.InterfaceC27837a0;
import or2.C28162g;
import or2.C28167h1;
import p007a6.InterfaceC0422g;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: hk2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lhk2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17390a implements InterfaceC26584j {
    /* JADX INFO: renamed from: e */
    private static final C23454a0 m49218e(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C17237a c17237a = new C17237a(10);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TombstoneApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c17237a, 2)), false);
        C17237a c17237a2 = new C17237a(11);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC15928c.class);
        module.f141343a.add(AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass2, null, c17237a2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false));
        C17237a c17237a3 = new C17237a(12);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C15931f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c17237a3, 2)), false);
        C17237a c17237a4 = new C17237a(13);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C15929d.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass4, null, c17237a4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final TombstoneApi m49219f(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(TombstoneApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (TombstoneApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC15928c m49220g(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Context contextM88532i = AbstractC29125c.m88532i(single);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15933h(contextM88532i, (C28167h1) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28167h1.class), null), (TombstoneApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(TombstoneApi.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (PreferenceHelper) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC41070a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C15931f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15931f.class), null), null, null, 768, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C15931f m49221h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15931f((AbstractC18377p0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C15929d m49222i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C28162g c28162g = (C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null);
        return new C15929d(AbstractC29125c.m88532i(factory), (C28167h1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28167h1.class), null), (TombstoneApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(TombstoneApi.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), null, c28162g.getBuildEpochMillis(), c28162g.getBuildDistribution(), c28162g.getVersionCode(), null, null, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 1568, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m49218e(c33768a);
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
