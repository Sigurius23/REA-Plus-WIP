package rh2;

import bc3.InterfaceC2994c0;
import ca2.InterfaceC4368h;
import ci2.InterfaceC4733b;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import qh2.C30370b;
import rb0.C31189f;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: rh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrh2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "strap-pipeline-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31440a implements InterfaceC26584j {
    /* JADX INFO: renamed from: b */
    private static final C23454a0 m96774b(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31189f c31189f = new C31189f(28);
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30370b.class);
        C35953c c35953c = C37247a.f159360e;
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass, null, c31189f, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C30370b m96775c(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null);
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C30370b(interfaceC2994c0, interfaceC21030c, interfaceC4733b, (InterfaceC4368h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null), clockSystemDefaultZone, InterfaceC34116n.INSTANCE.m107848a("MetricsHistorySync"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m96774b(c33768a);
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
