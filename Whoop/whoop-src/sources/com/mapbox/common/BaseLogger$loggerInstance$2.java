package com.mapbox.common;

import c93.InterfaceC4339a;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import p405pu.EnumC29546b;
import p438qu.InterfaceC30621a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lqu/a;", "invoke", "()Lqu/a;", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class BaseLogger$loggerInstance$2 extends AbstractC22680m implements InterfaceC4339a {
    public static final BaseLogger$loggerInstance$2 INSTANCE = new BaseLogger$loggerInstance$2();

    /* JADX INFO: renamed from: com.mapbox.common.BaseLogger$loggerInstance$2$1 */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpu/b;", "it", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "invoke", "(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C53941 extends AbstractC22680m implements Function1 {
        public static final C53941 INSTANCE = new C53941();

        public C53941() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final ModuleProviderArgument[] invoke(EnumC29546b it) {
            AbstractC22676k.m65750j(it, "it");
            return new ModuleProviderArgument[0];
        }
    }

    public BaseLogger$loggerInstance$2() {
        super(0);
    }

    @Override // c93.InterfaceC4339a
    public final InterfaceC30621a invoke() {
        return (InterfaceC30621a) MapboxModuleProvider.INSTANCE.createModule(EnumC29546b.CommonLogger, C53941.INSTANCE);
    }
}
