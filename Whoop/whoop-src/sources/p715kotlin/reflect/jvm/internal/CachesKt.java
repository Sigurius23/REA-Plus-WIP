package p715kotlin.reflect.jvm.internal;

import j93.C21462d0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21465f;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23465k;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22662d;
import wb3.AbstractC37051a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\u0015\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\"*\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0017*\u0004\u0018\u00010\u00000\u00000\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019\"<\u0010!\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001fj\u0002` \u0012\u0004\u0012\u00020\u00120\u001e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019*0\b\u0002\u0010\"\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001f2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001f¨\u0006#"}, m65681d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "getOrCreateKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lj93/f;", "getOrCreateKotlinPackage", "(Ljava/lang/Class;)Lj93/f;", "Ll83/a0;", "clearCaches", "()V", "", "Lj93/d0;", "arguments", "", "isMarkedNullable", "Lj93/a0;", "getOrCreateKType", "(Ljava/lang/Class;Ljava/util/List;Z)Lj93/a0;", "getOrCreateKTypeWithTypeArguments", "Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin.jvm.PlatformType", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "K_PACKAGE_CACHE", "CACHE_FOR_BASE_CLASSIFIERS", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Ll83/k;", "Lkotlin/reflect/jvm/internal/Key;", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CachesKt {
    private static final CacheByClass<KClassImpl<? extends Object>> K_CLASS_CACHE = CacheByClassKt.createCache(new Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$0
        @Override // p715kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return CachesKt.K_CLASS_CACHE$lambda$0((Class) obj);
        }
    });
    private static final CacheByClass<KPackageImpl> K_PACKAGE_CACHE = CacheByClassKt.createCache(new Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$1
        @Override // p715kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return CachesKt.K_PACKAGE_CACHE$lambda$0((Class) obj);
        }
    });
    private static final CacheByClass<InterfaceC21456a0> CACHE_FOR_BASE_CLASSIFIERS = CacheByClassKt.createCache(new Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$2
        @Override // p715kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return CachesKt.CACHE_FOR_BASE_CLASSIFIERS$lambda$0((Class) obj);
        }
    });
    private static final CacheByClass<InterfaceC21456a0> CACHE_FOR_NULLABLE_BASE_CLASSIFIERS = CacheByClassKt.createCache(new Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$3
        @Override // p715kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return CachesKt.CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$lambda$0((Class) obj);
        }
    });
    private static final CacheByClass<ConcurrentHashMap<C23465k, InterfaceC21456a0>> CACHE_FOR_GENERIC_CLASSIFIERS = CacheByClassKt.createCache(new Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$4
        @Override // p715kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return CachesKt.CACHE_FOR_GENERIC_CLASSIFIERS$lambda$0((Class) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC21456a0 CACHE_FOR_BASE_CLASSIFIERS$lambda$0(Class it) {
        AbstractC22676k.m65750j(it, "it");
        KClassImpl orCreateKotlinClass = getOrCreateKotlinClass(it);
        C25271y c25271y = C25271y.f99162w;
        return AbstractC21598x.m60714z(orCreateKotlinClass, c25271y, false, c25271y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap CACHE_FOR_GENERIC_CLASSIFIERS$lambda$0(Class it) {
        AbstractC22676k.m65750j(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC21456a0 CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$lambda$0(Class it) {
        AbstractC22676k.m65750j(it, "it");
        KClassImpl orCreateKotlinClass = getOrCreateKotlinClass(it);
        C25271y c25271y = C25271y.f99162w;
        return AbstractC21598x.m60714z(orCreateKotlinClass, c25271y, true, c25271y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassImpl K_CLASS_CACHE$lambda$0(Class it) {
        AbstractC22676k.m65750j(it, "it");
        return new KClassImpl(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KPackageImpl K_PACKAGE_CACHE$lambda$0(Class it) {
        AbstractC22676k.m65750j(it, "it");
        return new KPackageImpl(it);
    }

    public static final void clearCaches() {
        K_CLASS_CACHE.clear();
        K_PACKAGE_CACHE.clear();
        CACHE_FOR_BASE_CLASSIFIERS.clear();
        CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.clear();
        CACHE_FOR_GENERIC_CLASSIFIERS.clear();
    }

    public static final <T> InterfaceC21456a0 getOrCreateKType(Class<T> jClass, List<C21462d0> arguments, boolean z4) {
        AbstractC22676k.m65750j(jClass, "jClass");
        AbstractC22676k.m65750j(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z4 ? CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.get(jClass) : CACHE_FOR_BASE_CLASSIFIERS.get(jClass);
        }
        return getOrCreateKTypeWithTypeArguments(jClass, arguments, z4);
    }

    private static final <T> InterfaceC21456a0 getOrCreateKTypeWithTypeArguments(Class<T> cls, List<C21462d0> list, boolean z4) {
        ConcurrentHashMap<C23465k, InterfaceC21456a0> concurrentHashMap = CACHE_FOR_GENERIC_CLASSIFIERS.get(cls);
        C23465k c23465k = new C23465k(list, Boolean.valueOf(z4));
        InterfaceC21456a0 interfaceC21456a0 = concurrentHashMap.get(c23465k);
        if (interfaceC21456a0 == null) {
            AbstractC37051a abstractC37051aM60714z = AbstractC21598x.m60714z(getOrCreateKotlinClass(cls), list, z4, C25271y.f99162w);
            InterfaceC21456a0 interfaceC21456a0PutIfAbsent = concurrentHashMap.putIfAbsent(c23465k, abstractC37051aM60714z);
            interfaceC21456a0 = interfaceC21456a0PutIfAbsent == null ? abstractC37051aM60714z : interfaceC21456a0PutIfAbsent;
        }
        return interfaceC21456a0;
    }

    public static final <T> KClassImpl<T> getOrCreateKotlinClass(Class<T> jClass) {
        AbstractC22676k.m65750j(jClass, "jClass");
        InterfaceC22662d interfaceC22662d = K_CLASS_CACHE.get(jClass);
        AbstractC22676k.m65748h(interfaceC22662d, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) interfaceC22662d;
    }

    public static final <T> InterfaceC21465f getOrCreateKotlinPackage(Class<T> jClass) {
        AbstractC22676k.m65750j(jClass, "jClass");
        return K_PACKAGE_CACHE.get(jClass);
    }
}
