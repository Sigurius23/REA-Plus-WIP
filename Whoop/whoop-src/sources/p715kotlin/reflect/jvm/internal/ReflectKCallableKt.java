package p715kotlin.reflect.jvm.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001c\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"isBound", "", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ReflectKCallableKt {
    public static final boolean isBound(ReflectKCallable<?> reflectKCallable) {
        AbstractC22676k.m65750j(reflectKCallable, "<this>");
        return reflectKCallable.getRawBoundReceiver() != AbstractC22660c.NO_RECEIVER;
    }
}
