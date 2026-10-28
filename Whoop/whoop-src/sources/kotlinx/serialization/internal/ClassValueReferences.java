package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ/\u0010\r\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00062\u000e\b\u0004\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m65681d2 = {"Lkotlinx/serialization/internal/ClassValueReferences;", "T", "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/MutableSoftReference;", "<init>", "()V", "Ljava/lang/Class;", "type", "computeValue", "(Ljava/lang/Class;)Lkotlinx/serialization/internal/MutableSoftReference;", "key", "Lkotlin/Function0;", "factory", "getOrSet", "(Ljava/lang/Class;Lc93/a;)Ljava/lang/Object;", "", "isStored", "(Ljava/lang/Class;)Z", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@SuppressAnimalSniffer
final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
        return computeValue((Class<?>) cls);
    }

    public final T getOrSet(Class<?> key, final InterfaceC4339a factory) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(factory, "factory");
        T t14 = get(key);
        AbstractC22676k.m65749i(t14, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) t14;
        T t15 = mutableSoftReference.reference.get();
        return t15 != null ? t15 : (T) mutableSoftReference.getOrSetWithLock(new InterfaceC4339a() { // from class: kotlinx.serialization.internal.ClassValueReferences.getOrSet.2
            @Override // c93.InterfaceC4339a
            public final T invoke() {
                return (T) factory.invoke();
            }
        });
    }

    public final boolean isStored(Class<?> key) {
        AbstractC22676k.m65750j(key, "key");
        return ((MutableSoftReference) get(key)).reference.get() != null;
    }

    @Override // java.lang.ClassValue
    public MutableSoftReference<T> computeValue(Class<?> type) {
        AbstractC22676k.m65750j(type, "type");
        return new MutableSoftReference<>();
    }
}
