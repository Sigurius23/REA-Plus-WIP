package t23;

import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33420m0 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Map f139545w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Map f139546x;

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C33420m0 c33420m0 = new C33420m0(3, (InterfaceC30057d) obj3);
        c33420m0.f139545w = (Map) obj;
        c33420m0.f139546x = (Map) obj2;
        return c33420m0.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        Map map = this.f139545w;
        Map map2 = this.f139546x;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map2);
        linkedHashMap.putAll(map);
        return AbstractC25247g0.m74001j0(linkedHashMap);
    }
}
