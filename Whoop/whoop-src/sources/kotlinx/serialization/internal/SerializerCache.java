package kotlinx.serialization.internal;

import j93.InterfaceC21461d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lkotlinx/serialization/internal/SerializerCache;", "T", "", "Lj93/d;", "key", "Lwc3/c;", "get", "(Lj93/d;)Lwc3/c;", "", "isStored", "(Lj93/d;)Z", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface SerializerCache<T> {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean isStored(SerializerCache<T> serializerCache, InterfaceC21461d key) {
            AbstractC22676k.m65750j(key, "key");
            return SerializerCache.super.isStored(key);
        }
    }

    InterfaceC37138c get(InterfaceC21461d key);

    default boolean isStored(InterfaceC21461d key) {
        AbstractC22676k.m65750j(key, "key");
        return false;
    }
}
