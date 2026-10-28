package p715kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR$\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/ConcurrentHashMapCache;", "V", "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "key", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", "Ll83/a0;", "clear", "()V", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class ConcurrentHashMapCache<V> extends CacheByClass<V> {
    private final ConcurrentHashMap<Class<?>, V> cache;
    private final Function1 compute;

    public ConcurrentHashMapCache(Function1 compute) {
        AbstractC22676k.m65750j(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // p715kotlin.reflect.jvm.internal.CacheByClass
    public void clear() {
        this.cache.clear();
    }

    @Override // p715kotlin.reflect.jvm.internal.CacheByClass
    public V get(Class<?> key) {
        AbstractC22676k.m65750j(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.cache;
        V v13 = concurrentHashMap.get(key);
        if (v13 != null) {
            return v13;
        }
        V v14 = (V) this.compute.invoke(key);
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(key, v14);
        return vPutIfAbsent == null ? v14 : vPutIfAbsent;
    }
}
