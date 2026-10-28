package uf2;

import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import ge3.AbstractC15751g;
import in2.InterfaceC18732d;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29224y0;
import qf2.C30324c;
import qf3.C30330b;
import rf3.C31362a;
import rr2.InterfaceC31766c;
import s52.C32223d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uc2.C34761a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: uf2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Luf2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34910a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: d */
    private static final C23454a0 m110106d(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C34761a c34761a = new C34761a(1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(SmartAlarmApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c34761a, 2)), false);
        C34761a c34761a2 = new C34761a(2);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C30324c.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass2, null, c34761a2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final SmartAlarmApi m110107e(C38266c c38266c, C34911a c34911a) {
        return (SmartAlarmApi) ((C29224y0) c38266c.m122602a(new C32223d(26), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(SmartAlarmApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C34911a m110108f() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-smart-alarm"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C30324c m110109g(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30324c((InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), InterfaceC34116n.INSTANCE.m107848a("LwtResetRepository"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m110106d(c33768a);
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
