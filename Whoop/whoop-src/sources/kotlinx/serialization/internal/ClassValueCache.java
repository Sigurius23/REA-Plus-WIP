package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR/\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkotlinx/serialization/internal/ClassValueCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lj93/d;", "Lwc3/c;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "get", "(Lj93/d;)Lwc3/c;", "", "isStored", "(Lj93/d;)Z", "Lkotlin/jvm/functions/Function1;", "getCompute", "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/serialization/internal/ClassValueReferences;", "Lkotlinx/serialization/internal/CacheEntry;", "classValue", "Lkotlinx/serialization/internal/ClassValueReferences;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class ClassValueCache<T> implements SerializerCache<T> {
    private final ClassValueReferences<CacheEntry<T>> classValue;
    private final Function1 compute;

    public ClassValueCache(Function1 compute) {
        AbstractC22676k.m65750j(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public InterfaceC37138c get(final InterfaceC21461d key) {
        AbstractC22676k.m65750j(key, "key");
        CacheEntry<T> cacheEntry = this.classValue.get(AbstractC21598x.m60663S(key));
        AbstractC22676k.m65749i(cacheEntry, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) cacheEntry;
        T t14 = mutableSoftReference.reference.get();
        if (t14 == null) {
            t14 = (T) mutableSoftReference.getOrSetWithLock(new InterfaceC4339a() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlinx.serialization.internal.CacheEntry] */
                @Override // c93.InterfaceC4339a
                public final T invoke() {
                    return new CacheEntry((InterfaceC37138c) this.this$0.getCompute().invoke(key));
                }
            });
        }
        return t14.serializer;
    }

    public final Function1 getCompute() {
        return this.compute;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(InterfaceC21461d key) {
        AbstractC22676k.m65750j(key, "key");
        return this.classValue.isStored(AbstractC21598x.m60663S(key));
    }
}
