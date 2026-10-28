package kotlinx.serialization.internal;

import j93.InterfaceC21461d;
import java.util.concurrent.ConcurrentHashMap;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R*\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lj93/d;", "Lwc3/c;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "get", "(Lj93/d;)Lwc3/c;", "", "isStored", "(Lj93/d;)Z", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/CacheEntry;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class ConcurrentHashMapCache<T> implements SerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, CacheEntry<T>> cache;
    private final Function1 compute;

    public ConcurrentHashMapCache(Function1 compute) {
        AbstractC22676k.m65750j(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public InterfaceC37138c get(InterfaceC21461d key) {
        CacheEntry<T> cacheEntryPutIfAbsent;
        AbstractC22676k.m65750j(key, "key");
        ConcurrentHashMap<Class<?>, CacheEntry<T>> concurrentHashMap = this.cache;
        Class<?> clsM60663S = AbstractC21598x.m60663S(key);
        CacheEntry<T> cacheEntry = concurrentHashMap.get(clsM60663S);
        if (cacheEntry == null && (cacheEntryPutIfAbsent = concurrentHashMap.putIfAbsent(clsM60663S, (cacheEntry = new CacheEntry<>((InterfaceC37138c) this.compute.invoke(key))))) != null) {
            cacheEntry = cacheEntryPutIfAbsent;
        }
        return cacheEntry.serializer;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(InterfaceC21461d key) {
        AbstractC22676k.m65750j(key, "key");
        return this.cache.containsKey(AbstractC21598x.m60663S(key));
    }
}
