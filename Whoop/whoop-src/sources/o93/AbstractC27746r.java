package o93;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23465k;
import lb3.AbstractC23767d1;
import lb3.AbstractC23811y;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import u93.AbstractC34677g0;
import va3.C35845c;
import va3.C35850h;

/* JADX INFO: renamed from: o93.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC27746r {

    /* JADX INFO: renamed from: a */
    public static final Set f111904a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f111905b;

    /* JADX INFO: renamed from: c */
    public static final HashMap f111906c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f111907d;

    static {
        EnumC27745q[] enumC27745qArrValues = EnumC27745q.values();
        ArrayList arrayList = new ArrayList(enumC27745qArrValues.length);
        for (EnumC27745q enumC27745q : enumC27745qArrValues) {
            arrayList.add(enumC27745q.f111902x);
        }
        f111904a = AbstractC25265s.m74103I1(arrayList);
        EnumC27744p[] enumC27744pArrValues = EnumC27744p.values();
        ArrayList arrayList2 = new ArrayList(enumC27744pArrValues.length);
        for (EnumC27744p enumC27744p : enumC27744pArrValues) {
            arrayList2.add(enumC27744p.f111899w);
        }
        AbstractC25265s.m74103I1(arrayList2);
        f111905b = new HashMap();
        f111906c = new HashMap();
        AbstractC25247g0.m73987V(new C23465k(EnumC27744p.UBYTEARRAY, C35850h.m113814e("ubyteArrayOf")), new C23465k(EnumC27744p.USHORTARRAY, C35850h.m113814e("ushortArrayOf")), new C23465k(EnumC27744p.UINTARRAY, C35850h.m113814e("uintArrayOf")), new C23465k(EnumC27744p.ULONGARRAY, C35850h.m113814e("ulongArrayOf")));
        EnumC27745q[] enumC27745qArrValues2 = EnumC27745q.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC27745q enumC27745q2 : enumC27745qArrValues2) {
            linkedHashSet.add(enumC27745q2.f111903y.m113777f());
        }
        f111907d = linkedHashSet;
        for (EnumC27745q enumC27745q3 : EnumC27745q.values()) {
            HashMap map = f111905b;
            C35845c c35845c = enumC27745q3.f111903y;
            C35845c c35845c2 = enumC27745q3.f111901w;
            map.put(c35845c, c35845c2);
            f111906c.put(c35845c2, enumC27745q3.f111903y);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C35845c m83840a(C35845c c35845c) {
        return (C35845c) f111905b.get(c35845c);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m83841b(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return f111907d.contains(name);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m83842c(AbstractC23811y abstractC23811y) {
        InterfaceC31126h interfaceC31126hMo1784d;
        if (AbstractC23767d1.m69856l(abstractC23811y) || (interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d()) == null) {
            return false;
        }
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31126hMo1784d.mo60581g();
        return (interfaceC31135kMo60581g instanceof InterfaceC31124g0) && AbstractC22676k.m65745e(((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135kMo60581g)).f146067F, AbstractC27742n.f111886k) && f111904a.contains(interfaceC31126hMo1784d.getName());
    }
}
