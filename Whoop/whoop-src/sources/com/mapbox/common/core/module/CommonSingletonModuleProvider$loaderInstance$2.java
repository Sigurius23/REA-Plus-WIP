package com.mapbox.common.core.module;

import c93.InterfaceC4339a;
import com.mapbox.common.module.LibraryLoader;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import p405pu.EnumC29546b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/common/module/LibraryLoader;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CommonSingletonModuleProvider$loaderInstance$2 extends AbstractC22680m implements InterfaceC4339a {
    public static final CommonSingletonModuleProvider$loaderInstance$2 INSTANCE = new CommonSingletonModuleProvider$loaderInstance$2();

    /* JADX INFO: renamed from: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2$1 */
    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class C54151 extends C22672i implements Function1 {
        public C54151(Object obj) {
            super(1, 0, CommonSingletonModuleProvider.class, obj, "paramsProvider", "paramsProvider(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final ModuleProviderArgument[] invoke(EnumC29546b p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((CommonSingletonModuleProvider) this.receiver).paramsProvider(p13);
        }
    }

    public CommonSingletonModuleProvider$loaderInstance$2() {
        super(0);
    }

    @Override // c93.InterfaceC4339a
    public final LibraryLoader invoke() {
        return (LibraryLoader) MapboxModuleProvider.INSTANCE.createModule(EnumC29546b.CommonLibraryLoader, new C54151(CommonSingletonModuleProvider.INSTANCE));
    }
}
