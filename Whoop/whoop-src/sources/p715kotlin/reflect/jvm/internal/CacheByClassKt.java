package p715kotlin.reflect.jvm.internal;

import l83.C23467m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"useClassValue", "", "createCache", "Lkotlin/reflect/jvm/internal/CacheByClass;", "V", "", "compute", "Lkotlin/Function1;", "Ljava/lang/Class;", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CacheByClassKt {
    private static final boolean useClassValue = false;

    static {
        Object objM107888l;
        try {
            objM107888l = Class.forName("java.lang.ClassValue");
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (!(objM107888l instanceof C23467m)) {
            objM107888l = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objM107888l instanceof C23467m) {
            objM107888l = obj;
        }
    }

    public static final <V> CacheByClass<V> createCache(Function1 compute) {
        AbstractC22676k.m65750j(compute, "compute");
        return new ConcurrentHashMapCache(compute);
    }
}
