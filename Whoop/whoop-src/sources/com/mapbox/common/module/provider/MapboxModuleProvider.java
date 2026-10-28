package com.mapbox.common.module.provider;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p405pu.EnumC29546b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0004\u0012\u0015\u0018\u001b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider;", "", "<init>", "()V", "", "asGetterFun", "(Ljava/lang/String;)Ljava/lang/String;", "T", "Lpu/b;", "type", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "createModule", "(Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "com/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1", "noArgConstructorCreator", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1", "kotlinObjectReferenceProvider", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1", "singletonReferenceProvider", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1", "defaultMapboxModuleCreator", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "instanceCreators", "[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "ModuleInstanceProvider", "common-android"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxModuleProvider {
    public static final MapboxModuleProvider INSTANCE = new MapboxModuleProvider();
    private static final String TAG = "MapboxModuleProvider";
    private static final MapboxModuleProvider$defaultMapboxModuleCreator$1 defaultMapboxModuleCreator;
    private static final ModuleInstanceProvider[] instanceCreators;
    private static final MapboxModuleProvider$kotlinObjectReferenceProvider$1 kotlinObjectReferenceProvider;
    private static final MapboxModuleProvider$noArgConstructorCreator$1 noArgConstructorCreator;
    private static final MapboxModuleProvider$singletonReferenceProvider$1 singletonReferenceProvider;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "", "Ljava/lang/Class;", "implClass", "Lpu/b;", "type", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "getInstance", "(Ljava/lang/Class;Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "common-android"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public interface ModuleInstanceProvider {
        Object getInstance(Class<?> implClass, EnumC29546b type, Function1 paramsProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1] */
    static {
        ?? r10 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, EnumC29546b type, Function1 paramsProvider) throws NoSuchMethodException {
                AbstractC22676k.m65750j(implClass, "implClass");
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(paramsProvider, "paramsProvider");
                Constructor<?> constructor = implClass.getConstructor(null);
                AbstractC22676k.m65749i(constructor, "implClass.getConstructor()");
                return constructor.newInstance(null);
            }
        };
        noArgConstructorCreator = r10;
        ?? r14 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, EnumC29546b type, Function1 paramsProvider) {
                AbstractC22676k.m65750j(implClass, "implClass");
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(paramsProvider, "paramsProvider");
                return implClass.getField("INSTANCE").get(null);
            }
        };
        kotlinObjectReferenceProvider = r14;
        ?? r15 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, EnumC29546b type, Function1 paramsProvider) {
                AbstractC22676k.m65750j(implClass, "implClass");
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(paramsProvider, "paramsProvider");
                return implClass.getMethod("getInstance", null).invoke(null, null);
            }
        };
        singletonReferenceProvider = r15;
        ?? r16 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, EnumC29546b type, Function1 paramsProvider) throws NoSuchMethodException {
                AbstractC22676k.m65750j(implClass, "implClass");
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(paramsProvider, "paramsProvider");
                ModuleProviderArgument[] moduleProviderArgumentArr = (ModuleProviderArgument[]) paramsProvider.invoke(type);
                ArrayList arrayList = new ArrayList(moduleProviderArgumentArr.length);
                for (ModuleProviderArgument moduleProviderArgument : moduleProviderArgumentArr) {
                    arrayList.add(moduleProviderArgument.getExpectedArgumentClass());
                }
                Object[] array = arrayList.toArray(new Class[0]);
                AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                Class[] clsArr = (Class[]) array;
                Constructor<?> constructor = implClass.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                AbstractC22676k.m65749i(constructor, "implClass.getConstructor…ntClass }.toTypedArray())");
                ArrayList arrayList2 = new ArrayList(moduleProviderArgumentArr.length);
                for (ModuleProviderArgument moduleProviderArgument2 : moduleProviderArgumentArr) {
                    arrayList2.add(moduleProviderArgument2.getArgumentInstance());
                }
                Object[] array2 = arrayList2.toArray(new Object[0]);
                AbstractC22676k.m65748h(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return constructor.newInstance(Arrays.copyOf(array2, array2.length));
            }
        };
        defaultMapboxModuleCreator = r16;
        instanceCreators = new ModuleInstanceProvider[]{r10, r14, r15, r16};
    }

    private MapboxModuleProvider() {
    }

    private final String asGetterFun(String str) {
        StringBuilder sb4 = new StringBuilder("get");
        sb4.append(Character.toUpperCase(str.charAt(0)));
        String strSubstring = str.substring(1);
        AbstractC22676k.m65749i(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb4.append(strSubstring);
        return sb4.toString();
    }

    public final <T> T createModule(EnumC29546b type, Function1 paramsProvider) throws Exception {
        AbstractC22676k.m65750j(type, "type");
        String str = type.f120320w;
        AbstractC22676k.m65750j(paramsProvider, "paramsProvider");
        try {
            Class<?> cls = Class.forName("com.mapbox.module.".concat(String.format("Mapbox_%sModuleConfiguration", Arrays.copyOf(new Object[]{str}, 1))));
            T t14 = null;
            Object objInvoke = cls.getMethod(asGetterFun("enableConfiguration"), null).invoke(null, null);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) objInvoke).booleanValue()) {
                Field declaredField = cls.getDeclaredField("moduleProvider");
                AbstractC22676k.m65749i(declaredField, "configurationClass.getDe…N_PROVIDER_VARIABLE_NAME)");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new MapboxInvalidModuleException(type);
                }
                Class<?> type2 = declaredField.getType();
                AbstractC22676k.m65749i(type2, "providerField.type");
                Method declaredMethod = type2.getDeclaredMethod(String.format("create%s", Arrays.copyOf(new Object[]{str}, 1)), null);
                AbstractC22676k.m65749i(declaredMethod, "providerClass.getDeclare…            )\n          )");
                T t15 = (T) declaredMethod.invoke(obj, null);
                AbstractC22676k.m65749i(t15, "providerMethod.invoke(provider)");
                return t15;
            }
            Object objInvoke2 = cls.getMethod(asGetterFun("implClass"), null).invoke(null, null);
            AbstractC22676k.m65748h(objInvoke2, "null cannot be cast to non-null type java.lang.Class<T of com.mapbox.common.module.provider.MapboxModuleProvider.createModule>");
            Class<?> cls2 = (Class) objInvoke2;
            ArrayList arrayList = new ArrayList();
            for (ModuleInstanceProvider moduleInstanceProvider : instanceCreators) {
                try {
                    t14 = (T) moduleInstanceProvider.getInstance(cls2, type, paramsProvider);
                } catch (Exception e5) {
                    if (e5 instanceof MapboxInvalidModuleException) {
                        throw e5;
                    }
                    arrayList.add(e5);
                }
                if (t14 != null) {
                    break;
                }
            }
            if (t14 == null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.e(TAG, "Module loading failed", (Throwable) it.next());
                }
            }
            if (t14 != null) {
                return t14;
            }
            throw new MapboxInvalidModuleException(type);
        } catch (Exception e13) {
            if (e13 instanceof MapboxInvalidModuleException) {
                throw e13;
            }
            e13.printStackTrace();
            throw new MapboxInvalidModuleException(type);
        }
    }
}
