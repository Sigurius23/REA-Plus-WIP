package p02;

import bh1.C3249a;
import bh1.C3250b;
import com.google.gson.Gson;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import f91.C14283a;
import fy1.InterfaceC14871g;
import ge3.AbstractC15751g;
import hb1.AbstractC17083f;
import hy1.C17809a;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import on2.C28048a;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q02.C29750d;
import qf3.C30330b;
import r02.C30843a;
import rf3.C31362a;
import s02.C32051a;
import t02.C33266a;
import tf3.C33768a;
import u82.C34642c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;

/* JADX INFO: renamed from: p02.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lp02/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28590b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f115703c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a(), new C17809a(), new C14283a());

    /* JADX INFO: renamed from: h */
    private static final C23454a0 m86968h(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "nested-bff-cache-deserializer");
        C28048a c28048a = new C28048a(28);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c28048a, 2)), false);
        C28048a c28048a2 = new C28048a(29);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C29750d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c28048a2, 2)), false);
        C28589a c28589a = new C28589a(0);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C33266a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c28589a, 2)), false);
        C28589a c28589a2 = new C28589a(1);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C32051a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c28589a2, 2)), false);
        C28589a c28589a3 = new C28589a(2);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(AbstractC17083f.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass5, null, c28589a3, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC34640a m86969i(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "generic-models-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        return new C34642c(AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null), (Gson) c38266c.m122602a(new C3249a(map, 6), c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("api_gson_name")), (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-nested-bff"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C34911a m86970j(Map map) {
        return AbstractC15751g.m44431K(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C29750d m86971k(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "generic-models-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29750d((InterfaceC26834e) c38266c.m122602a(new C3250b((Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), (InterfaceC34640a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("nested-bff-cache-deserializer")), 11), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C37378a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (InterfaceC21030c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C34911a m86972l(Map map, InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(map, interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final C33266a m86973m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33266a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C32051a m86974n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32051a((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC14871g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14871g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final AbstractC17083f m86975o(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30843a((C29750d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29750d.class), null), (C33266a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33266a.class), null), (C32051a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32051a.class), null), null, 8, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m86968h(c33768a);
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
