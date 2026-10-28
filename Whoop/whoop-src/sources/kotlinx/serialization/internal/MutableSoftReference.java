package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import java.lang.ref.SoftReference;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lkotlinx/serialization/internal/MutableSoftReference;", "T", "", "<init>", "()V", "Lkotlin/Function0;", "factory", "getOrSetWithLock", "(Lc93/a;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", "reference", "Ljava/lang/ref/SoftReference;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class MutableSoftReference<T> {
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    public final synchronized T getOrSetWithLock(InterfaceC4339a factory) {
        AbstractC22676k.m65750j(factory, "factory");
        T t14 = this.reference.get();
        if (t14 != null) {
            return t14;
        }
        T t15 = (T) factory.invoke();
        this.reference = new SoftReference<>(t15);
        return t15;
    }
}
