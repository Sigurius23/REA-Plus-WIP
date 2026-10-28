package gf;

import d93.InterfaceC11824e;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import wb3.AbstractC37056f;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: gf.m */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC15772m extends Map, InterfaceC11824e {
    /* JADX INFO: renamed from: C */
    boolean mo14230C(Object obj, Collection collection);

    /* JADX INFO: renamed from: H */
    default void mo14231H(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            mo14230C(entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: f */
    InterfaceC38174i mo14235f();

    @Override // java.util.Map
    default List put(Object obj, Object obj2) {
        return (List) put(obj, AbstractC37056f.m118964P(obj2));
    }

    /* JADX INFO: renamed from: y */
    default InterfaceC15770k mo14236y() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(size()));
        for (Map.Entry entry : entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC25265s.m74093D1((List) entry.getValue()));
        }
        return new C15776q(AbstractC25247g0.m74001j0(linkedHashMap));
    }
}
