package f91;

import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.EnumC6731e;
import ex0.C13725a;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb1.InterfaceC21539e;
import jy1.C22047a;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25272z;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.AbstractC29199m;
import qf3.C30330b;
import r80.AbstractC31061c;
import tf3.C33768a;
import u82.AbstractC34645f;
import u82.C34648i;
import u82.InterfaceC34640a;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: f91.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lf91/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14283a implements InterfaceC26584j {
    /* JADX INFO: renamed from: d */
    private static final C23454a0 m40788d(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "generic-models-mapping");
        C13725a c13725a = new C13725a(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c13725a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "polymorphicDesignSystemKtxSerializationJson");
        C13725a c13725a2 = new C13725a(26);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC29199m.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c13725a2, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "KotlinxDeserializer");
        C13725a c13725a3 = new C13725a(27);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c13725a3, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Map m40789e(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        EnumC6731e[] enumC6731eArrValues = EnumC6731e.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC6731e enumC6731e : enumC6731eArrValues) {
            linkedHashSet.add(enumC6731e.name());
        }
        Map mapM73995d0 = C25272z.f99163w;
        for (InterfaceC21539e interfaceC21539e : factory.m122603b(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21539e.class))) {
            Set<String> setKeySet = interfaceC21539e.mo1798a().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (mapM73995d0.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                interfaceC21030c.mo58701b(new C22047a(0, "mobile.whoop.arch_v2.model_key_conflict", null, AbstractC31061c.m95644t("key:", (String) it3.next()), null, 21, null));
            }
            mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, interfaceC21539e.mo1798a());
        }
        Set setKeySet2 = mapM73995d0.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setKeySet2) {
            if (linkedHashSet.contains((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            interfaceC21030c.mo58701b(new C22047a(0, "mobile.whoop.arch_v2.model_key_conflict", null, AbstractC31061c.m95644t("key:", (String) it4.next()), null, 21, null));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73995d0.entrySet()) {
            if (!linkedHashSet.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final AbstractC29199m m40790f(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Map map = (Map) factory.m122604c(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), null);
        if (map == null) {
            map = C25272z.f99163w;
        }
        return AbstractC34645f.m109482a(AbstractC6728b.m20380e(factory, map, null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC34640a m40791g(C38266c factory, C34911a params) {
        Object obj;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof Map) {
                obj = next;
            }
        } while (obj == null);
        Map map = (Map) obj;
        if (map == null) {
            map = C25272z.f99163w;
        }
        return new C34648i(AbstractC6728b.m20380e(factory, map, null, null, null, null, 30, null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m40788d(c33768a);
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
