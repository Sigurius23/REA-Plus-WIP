package com.mapbox.common;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/mapbox/common/MapboxInitializerException;", "", "initializerData", "Lcom/mapbox/common/InitializerData;", "context", "Landroid/content/Context;", "t", "(Lcom/mapbox/common/InitializerData;Landroid/content/Context;Ljava/lang/Throwable;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxInitializerException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxInitializerException(InitializerData initializerData, Context context, Throwable t14) {
        super(BaseMapboxInitializerKt.gatherSystemInfo(initializerData, context, t14), t14);
        AbstractC22676k.m65750j(initializerData, "initializerData");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(t14, "t");
    }
}
