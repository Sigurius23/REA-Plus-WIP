package kotlinx.serialization.internal;

import c93.InterfaceC4351m;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23468n;
import m83.AbstractC25267u;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R*\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "Lkotlin/Function2;", "Lj93/d;", "", "", "Lj93/a0;", "Lwc3/c;", "compute", "<init>", "(Lc93/m;)V", "key", "types", "Ll83/n;", "get-gIAlu-s", "(Lj93/d;Ljava/util/List;)Ljava/lang/Object;", "get", "Lc93/m;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache;
    private final InterfaceC4351m compute;

    public ConcurrentHashMapParametrizedCache(InterfaceC4351m compute) {
        AbstractC22676k.m65750j(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* JADX INFO: renamed from: get-gIAlu-s */
    public Object mo134409getgIAlus(InterfaceC21461d key, List<? extends InterfaceC21456a0> types) {
        Object objM107888l;
        ParametrizedCacheEntry<T> parametrizedCacheEntryPutIfAbsent;
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(types, "types");
        ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> concurrentHashMap = this.cache;
        Class<?> clsM60663S = AbstractC21598x.m60663S(key);
        ParametrizedCacheEntry<T> parametrizedCacheEntry = concurrentHashMap.get(clsM60663S);
        if (parametrizedCacheEntry == null && (parametrizedCacheEntryPutIfAbsent = concurrentHashMap.putIfAbsent(clsM60663S, (parametrizedCacheEntry = new ParametrizedCacheEntry<>()))) != null) {
            parametrizedCacheEntry = parametrizedCacheEntryPutIfAbsent;
        }
        ParametrizedCacheEntry<T> parametrizedCacheEntry2 = parametrizedCacheEntry;
        List<? extends InterfaceC21456a0> list = types;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((InterfaceC21456a0) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = ((ParametrizedCacheEntry) parametrizedCacheEntry2).serializers;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                objM107888l = (InterfaceC37138c) this.compute.invoke(key, types);
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            C23468n c23468n = new C23468n(objM107888l);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, c23468n);
            obj = objPutIfAbsent == null ? c23468n : objPutIfAbsent;
        }
        return ((C23468n) obj).f92940w;
    }
}
