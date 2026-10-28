package p109e6;

import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25267u;
import p082d6.C11726d;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C12754i extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ C11726d f43633w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ AbstractC14134f f43634x;

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C12754i c12754i = new C12754i(3, (InterfaceC30057d) obj3);
        c12754i.f43633w = (C11726d) obj;
        c12754i.f43634x = (AbstractC14134f) obj2;
        return c12754i.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C11726d c11726d = this.f43633w;
        AbstractC14134f abstractC14134f = this.f43634x;
        Set setKeySet = abstractC14134f.mo40226a().keySet();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C14132d) it.next()).f50837a);
        }
        LinkedHashMap linkedHashMapM31329a = c11726d.m31329a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapM31329a.entrySet()) {
            if (!arrayList.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C14129a c14129aM40233c = abstractC14134f.m40233c();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                c14129aM40233c.m40231h(AbstractC15751g.m44453f(str), value);
            } else if (value instanceof Float) {
                c14129aM40233c.m40231h(AbstractC15751g.m44471x(str), value);
            } else if (value instanceof Integer) {
                c14129aM40233c.m40231h(AbstractC15751g.m44423C(str), value);
            } else if (value instanceof Long) {
                c14129aM40233c.m40231h(AbstractC15751g.m44429I(str), value);
            } else if (value instanceof String) {
                c14129aM40233c.m40231h(AbstractC15751g.m44441U(str), value);
            } else if (value instanceof Set) {
                c14129aM40233c.m40231h(AbstractC15751g.m44442V(str), (Set) value);
            }
        }
        return c14129aM40233c.m40234d();
    }
}
