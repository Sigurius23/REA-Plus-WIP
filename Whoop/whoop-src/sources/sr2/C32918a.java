package sr2;

import ca2.C4373m;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.data.serialization.DateTimeRangeSerializer;
import com.whoop.data.serialization.DateTimeSerializer;
import com.whoop.design.json.AbstractC6730d;
import fi0.InterfaceC14515a;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import nd1.InterfaceC26584j;
import org.joda.time.DateTime;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import sf1.C32446a;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import ud3.C34826l0;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: sr2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsr2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32918a implements InterfaceC26584j {
    /* JADX INFO: renamed from: d */
    private static final C23454a0 m103372d(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "api_ok_http_name");
        C32446a c32446a = new C32446a(7);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C34826l0.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c32446a, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "api_gson_name");
        C32446a c32446a2 = new C32446a(8);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Gson.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM53379t, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, c35953cM53379t, c32446a2, 2)), false);
        C32446a c32446a3 = new C32446a(9);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C4373m.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, null, c32446a3, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C34826l0 m103373e(C38266c c38266c, C34911a c34911a) {
        return (C34826l0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "defaultOkHttpClient"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Gson m103374f(C38266c factory, C34911a params) {
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
            if (!(next != null ? next instanceof Map : true)) {
                next = null;
            }
        } while (next == null);
        Map map = (Map) next;
        GsonBuilder gsonBuilderRegisterTypeAdapter = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateTimeSerializer((InterfaceC41070a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null))).registerTypeAdapter(DateTimeRange.class, new DateTimeRangeSerializer());
        AbstractC22676k.m65749i(gsonBuilderRegisterTypeAdapter, "registerTypeAdapter(...)");
        if (map == null) {
            map = C25272z.f99163w;
        }
        return AbstractC6730d.m20388f(gsonBuilderRegisterTypeAdapter, map, null, 2, null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C4373m m103375g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4373m((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null), InterfaceC34116n.INSTANCE.m107848a("WhoopSyncServiceHelper"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m103372d(c33768a);
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
