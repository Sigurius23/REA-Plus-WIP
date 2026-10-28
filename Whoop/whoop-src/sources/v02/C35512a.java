package v02;

import com.google.gson.Gson;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u02.C34387c;
import ud3.C34826l0;
import uf3.C34911a;
import un0.C35093a;
import v53.C35709c;
import vf3.C35953c;
import w02.C36684a;
import wf3.C37247a;
import x02.AbstractC37803b;
import xf3.C38266c;

/* JADX INFO: renamed from: v02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lv02/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35512a implements InterfaceC26584j {
    /* JADX INFO: renamed from: e */
    private static final C23454a0 m112669e(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "cache_ktor_client_instance");
        C35093a c35093a = new C35093a(4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C35709c.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c35093a, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "serialization_configurable_ktor_client");
        C35093a c35093a2 = new C35093a(5);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C35709c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM53379t, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, c35953cM53379t, c35093a2, 2)), false);
        C35093a c35093a3 = new C35093a(6);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C34387c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c35093a3, 2)), false);
        C35093a c35093a4 = new C35093a(7);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C36684a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass4, null, c35093a4, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C35709c m112670f(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "api_ok_http_name");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC37803b.m121313e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), c35953cM73387t), (Gson) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("api_gson_name")), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C35709c m112671g(C38266c factory, C34911a params) {
        Object next;
        Gson gson;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof C35513b)) {
                next = null;
            }
        } while (next == null);
        C35513b c35513b = (C35513b) next;
        C35953c c35953c = new C35953c("api_ok_http_name");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34826l0 c34826l0 = (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), c35953c);
        if (c35513b == null || (gson = c35513b.getGson()) == null) {
            gson = (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("api_gson_name"));
        }
        return AbstractC37803b.m121312d(c34826l0, gson, c35513b != null ? c35513b.getKotlinSerialization() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C34387c m112672h(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof C35709c)) {
                next = null;
            }
        } while (next == null);
        C35709c c35709c = (C35709c) next;
        if (c35709c == null) {
            c35709c = (C35709c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35709c.class), new C35953c("cache_ktor_client_instance"));
        }
        return new C34387c((AbstractC32943y) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC32943y.class), null), c35709c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final C36684a m112673i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36684a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m112669e(c33768a);
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
