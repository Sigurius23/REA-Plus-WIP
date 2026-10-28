package com.mapbox.common;

import android.content.SharedPreferences;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m65681d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class AccessTokenInitializer$preferences$2 extends AbstractC22680m implements InterfaceC4339a {
    public static final AccessTokenInitializer$preferences$2 INSTANCE = new AccessTokenInitializer$preferences$2();

    public AccessTokenInitializer$preferences$2() {
        super(0);
    }

    @Override // c93.InterfaceC4339a
    public final SharedPreferences invoke() {
        return MapboxSDKCommon.INSTANCE.getContext().getSharedPreferences("mapbox_initialization_settings", 0);
    }
}
