package p193hf;

import g40.C15352f4;
import gf.InterfaceC15772m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import p708hb2.C17095c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.C22693x;
import xb3.AbstractC38176k;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: hf.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17231h implements InterfaceC15772m {

    /* JADX INFO: renamed from: E */
    public final C22672i f66214E;

    /* JADX INFO: renamed from: F */
    public final C17230g f66215F;

    /* JADX INFO: renamed from: G */
    public final C17230g f66216G;

    /* JADX INFO: renamed from: w */
    public final InterfaceC15772m f66217w;

    /* JADX INFO: renamed from: x */
    public final C22693x f66218x;

    /* JADX INFO: renamed from: y */
    public final C22672i f66219y;

    /* JADX INFO: renamed from: z */
    public final C22693x f66220z;

    /* JADX WARN: Multi-variable type inference failed */
    public C17231h(InterfaceC15772m src, C22693x c22693x, Function1 function1, C22693x c22693x2, Function1 function2) {
        AbstractC22676k.m65750j(src, "src");
        this.f66217w = src;
        this.f66218x = c22693x;
        this.f66219y = (C22672i) function1;
        this.f66220z = c22693x2;
        this.f66214E = (C22672i) function2;
        this.f66215F = new C17230g(this, 0);
        this.f66216G = new C17230g(this, 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: C */
    public final boolean mo14230C(Object obj, Collection values) {
        AbstractC22676k.m65750j(values, "values");
        List list = (List) get(obj);
        if (list == null) {
            this.f66217w.put(this.f66219y.invoke(obj), new ArrayList());
            list = (List) AbstractC25247g0.m73986U(obj, this);
        }
        return list.addAll(values);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX INFO: renamed from: a */
    public final boolean m48738a(Object obj, Object obj2) {
        List list = (List) get(obj);
        if (list == null) {
            this.f66217w.put(this.f66219y.invoke(obj), new ArrayList());
            list = (List) AbstractC25247g0.m73986U(obj, this);
        }
        return list.add(obj2);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f66217w.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f66217w.containsKey(this.f66219y.invoke(obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!AbstractC22681m0.m65776g(obj)) {
            return false;
        }
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        return this.f66217w.containsValue(this.f66216G.invoke(value));
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set setEntrySet = this.f66217w.entrySet();
        C15352f4 c15352f4 = new C15352f4(this, 8);
        C15352f4 c15352f5 = new C15352f4(this, 9);
        AbstractC22676k.m65750j(setEntrySet, "<this>");
        return new C17232i(setEntrySet, c15352f4, c15352f5);
    }

    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: f */
    public final InterfaceC38174i mo14235f() {
        return AbstractC38176k.m122272A(this.f66217w.mo14235f(), new C17095c(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // java.util.Map
    public final Object get(Object obj) {
        List list = (List) this.f66217w.get(this.f66219y.invoke(obj));
        if (list != null) {
            return (List) this.f66215F.invoke(list);
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f66217w.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // java.util.Map
    public final Set keySet() {
        Set setKeySet = this.f66217w.keySet();
        AbstractC22676k.m65750j(setKeySet, "<this>");
        return new C17232i(setKeySet, this.f66218x, this.f66219y);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        List value = (List) obj2;
        AbstractC22676k.m65750j(value, "value");
        List list = (List) this.f66217w.put(this.f66219y.invoke(obj), this.f66216G.invoke(value));
        if (list != null) {
            return (List) this.f66215F.invoke(list);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC22676k.m65750j(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            this.f66217w.put(this.f66219y.invoke(key), this.f66216G.invoke(list));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        List list = (List) this.f66217w.remove(this.f66219y.invoke(obj));
        if (list != null) {
            return (List) this.f66215F.invoke(list);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f66217w.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collectionValues = this.f66217w.values();
        AbstractC22676k.m65750j(collectionValues, "<this>");
        return new C17225b(collectionValues, this.f66215F, this.f66216G);
    }
}
