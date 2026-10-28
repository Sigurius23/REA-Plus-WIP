package com.mapbox.common.core.module;

import com.mapbox.common.module.LibraryLoader;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import l83.InterfaceC23462h;
import p405pu.EnumC29546b;
import p715kotlin.Metadata;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;", "", "<init>", "()V", "Lpu/b;", "type", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "Lcom/mapbox/common/module/LibraryLoader;", "loaderInstance$delegate", "Ll83/h;", "getLoaderInstance", "()Lcom/mapbox/common/module/LibraryLoader;", "loaderInstance", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CommonSingletonModuleProvider {
    public static final CommonSingletonModuleProvider INSTANCE = new CommonSingletonModuleProvider();

    /* JADX INFO: renamed from: loaderInstance$delegate, reason: from kotlin metadata */
    private static final InterfaceC23462h loaderInstance = AbstractC30060g.m92088H(CommonSingletonModuleProvider$loaderInstance$2.INSTANCE);

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC29546b.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CommonSingletonModuleProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(EnumC29546b type) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i13 == 1) {
            return new ModuleProviderArgument[0];
        }
        if (i13 == 2) {
            return new ModuleProviderArgument[0];
        }
        throw new IllegalArgumentException("unsupported module type - " + type);
    }

    public final LibraryLoader getLoaderInstance() {
        return (LibraryLoader) loaderInstance.getValue();
    }
}
