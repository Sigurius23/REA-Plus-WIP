package rx0;

import com.whoop.design.json.AbstractC6728b;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21536b;
import l83.C23454a0;
import m83.C25272z;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23596b1;
import qf3.C30330b;
import re1.C31314a;
import rm2.C31604d;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: rx0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrx0/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31897b implements InterfaceC26584j {
    /* JADX INFO: renamed from: c */
    private static final C23454a0 m99147c(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31314a c31314a = new C31314a(10);
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31899d.class);
        C35953c c35953c = C37247a.f159360e;
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass, null, c31314a, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C31899d m99148d(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Map map = (Map) factory.m122604c(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("generic-models-mapping"));
        if (map == null) {
            map = C25272z.f99163w;
        }
        return new C31899d(AbstractC6728b.m20380e(factory, map, null, null, null, null, 30, null), AbstractC21537c.m60554d(new C31604d(19)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m99149e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m99147c(c33768a);
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
