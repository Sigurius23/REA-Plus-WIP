package com.mapbox.common;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lcom/mapbox/common/MapboxSDKCommon;", "", "()V", "appContext", "Landroid/content/Context;", "getContext", "invoke", "context", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxSDKCommon {
    public static final MapboxSDKCommon INSTANCE = new MapboxSDKCommon();
    private static Context appContext;

    private MapboxSDKCommon() {
    }

    public final Context getContext() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        AbstractC22676k.m65757q("appContext");
        throw null;
    }

    public final MapboxSDKCommon invoke(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "context.applicationContext");
        appContext = applicationContext;
        return this;
    }
}
