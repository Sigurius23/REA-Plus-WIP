package uh2;

import android.os.Build;
import bc3.InterfaceC2994c0;
import ci2.InterfaceC4733b;
import com.whoop.strapauth.client.StrapUnlockApi;
import fy1.InterfaceC14871g;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import js0.AbstractC21909c;
import l83.C23454a0;
import l83.C23465k;
import nd1.InterfaceC26584j;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import sh2.C32511b;
import sh2.InterfaceC32510a;
import st0.InterfaceC32974r;
import tf3.C33768a;
import th2.C33816b;
import th2.InterfaceC33815a;
import uc2.C34761a;
import uf3.C34911a;
import v82.C35799a;
import va3.AbstractC35849g;
import vf3.C35953c;
import vh2.C36047b;
import vh2.C36048c;
import vh2.C36050e;
import vh2.C36051f;
import vh2.C36052g;
import vh2.InterfaceC36046a;
import vh2.InterfaceC36049d;
import vs0.InterfaceC36471a;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: uh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Luh2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34968a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: i */
    private static final C23454a0 m110455i(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C34761a c34761a = new C34761a(3);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC32510a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c34761a, 2)), false);
        C34761a c34761a2 = new C34761a(4);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(StrapUnlockApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c34761a2, 2)), false);
        C34761a c34761a3 = new C34761a(5);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC33815a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c34761a3, 2)), false);
        C34761a c34761a4 = new C34761a(6);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C36047b.class);
        C23465k c23465k = new C23465k(module, AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass4, null, c34761a4, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false));
        AbstractC35849g.m113801c(c23465k, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class));
        AbstractC35849g.m113801c(c23465k, c22673i0.getOrCreateKotlinClass(InterfaceC36046a.class));
        C34761a c34761a5 = new C34761a(7);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C36048c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c34761a5, 2)), false);
        C34761a c34761a6 = new C34761a(8);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C36051f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c34761a6, 2)), false);
        C34761a c34761a7 = new C34761a(9);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C36052g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c34761a7, 2)), false);
        C34761a c34761a8 = new C34761a(10);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(InterfaceC36049d.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass8, null, c34761a8, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC32510a m110456j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32511b(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final StrapUnlockApi m110457k(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(StrapUnlockApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (StrapUnlockApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC33815a m110458l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33816b((StrapUnlockApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(StrapUnlockApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C36047b m110459m(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C36047b(clockSystemUTC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C36048c m110460n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36048c((InterfaceC21030c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null), AbstractC11266d.m30461o("android_", Build.VERSION.RELEASE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C36051f m110461o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36051f((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C36052g m110462p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36052g((C36051f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36051f.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC36471a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36471a.class), null), (C36048c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36048c.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC36049d m110463q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36050e((InterfaceC33815a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33815a.class), null), (InterfaceC32510a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32510a.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC36046a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36046a.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C36048c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36048c.class), null), (C36052g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36052g.class), null), (InterfaceC14871g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14871g.class), null), null, 512, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m110455i(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C35799a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
