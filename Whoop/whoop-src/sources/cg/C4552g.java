package cg;

import androidx.room.C1832u;
import gf.C15778s;
import gf.InterfaceC15770k;
import gf.InterfaceC15772m;
import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25267u;
import p193hf.C17231h;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import tg.C33770b;
import tg.C33775g;
import tg.InterfaceC33773e;
import xb3.InterfaceC38174i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cg.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4552g implements InterfaceC15772m {

    /* JADX INFO: renamed from: w */
    public final InterfaceC15772m f18343w = new C15778s(new LinkedHashMap());

    /* JADX INFO: renamed from: x */
    public boolean f18344x = false;

    /* JADX INFO: renamed from: y */
    public final C17231h f18345y;

    /* JADX INFO: renamed from: z */
    public final C17231h f18346z;

    public C4552g() {
        C4546a c4546a = C4546a.f18337w;
        C33775g c33775g = C33775g.f141360j;
        int i13 = 0;
        int i14 = 1;
        this.f18345y = AbstractC17269i.m48916t(this, c4546a, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 2), C4547b.f18338w, new C1832u(i14, c33775g, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i13, 3));
        this.f18346z = AbstractC17269i.m48916t(this, C4550e.f18341w, new C1832u(i14, c33775g, InterfaceC33773e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i13, 4), C4551f.f18342w, new C1832u(i14, c33775g, InterfaceC33773e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i13, 5));
    }

    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: H */
    public final void mo14231H(Map map) {
        this.f18343w.mo14231H(map);
    }

    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean mo14230C(C33770b key, Collection values) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(values, "values");
        return this.f18343w.mo14230C(key, values);
    }

    /* JADX INFO: renamed from: b */
    public final C4554i m14233b() {
        return new C4554i(this.f18343w.mo14236y(), this.f18344x);
    }

    /* JADX INFO: renamed from: c */
    public final void m14234c(C17231h c17231h, String str) {
        String str2;
        clear();
        this.f18344x = AbstractC22676k.m65745e(str, "?");
        String strM125898q0 = AbstractC39414r.m125898q0(str, "?");
        if (strM125898q0.length() > 0) {
            List<String> listM125906y0 = AbstractC39414r.m125906y0(strM125898q0, new String[]{"&"}, 6);
            ArrayList<C23465k> arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125906y0, 10));
            for (String str3 : listM125906y0) {
                List listM125906y1 = AbstractC39414r.m125906y0(str3, new String[]{"="}, 6);
                String str4 = (String) listM125906y1.get(0);
                int size = listM125906y1.size();
                if (size == 1) {
                    str2 = "";
                } else {
                    if (size != 2) {
                        throw new IllegalArgumentException("invalid query string segment ".concat(str3));
                    }
                    str2 = (String) listM125906y1.get(1);
                }
                arrayList.add(new C23465k(str4, str2));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C23465k c23465k : arrayList) {
                String str5 = (String) c23465k.f92937w;
                Object arrayList2 = linkedHashMap.get(str5);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(str5, arrayList2);
                }
                ((List) arrayList2).add((String) c23465k.f92938x);
            }
            c17231h.mo14231H(linkedHashMap);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f18343w.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof C33770b)) {
            return false;
        }
        return this.f18343w.containsKey((C33770b) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!AbstractC22681m0.m65776g(obj)) {
            return false;
        }
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        return this.f18343w.containsValue(value);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f18343w.entrySet();
    }

    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: f */
    public final InterfaceC38174i mo14235f() {
        return this.f18343w.mo14235f();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof C33770b)) {
            return null;
        }
        return (List) this.f18343w.get((C33770b) obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f18343w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f18343w.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C33770b key = (C33770b) obj;
        List value = (List) obj2;
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        return (List) this.f18343w.put(key, value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC22676k.m65750j(from, "from");
        this.f18343w.putAll(from);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof C33770b)) {
            return null;
        }
        return (List) this.f18343w.remove((C33770b) obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18343w.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f18343w.values();
    }

    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: y */
    public final InterfaceC15770k mo14236y() {
        return this.f18343w.mo14236y();
    }

    @Override // gf.InterfaceC15772m, java.util.Map
    public final List put(Object obj, Object obj2) {
        return this.f18343w.put(obj, obj2);
    }
}
