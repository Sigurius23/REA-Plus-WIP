package com.mapbox.maps;

import com.mapbox.common.MapboxMapsAndroidLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, m65681d2 = {"", "tag", "message", "Ll83/a0;", "logE", "(Ljava/lang/String;Ljava/lang/String;)V", "logW", "logI", "logD", "sdk-base_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxLogger {
    public static final void logD(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogD$sdk_base_release(tag, message);
    }

    public static final void logE(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogE$sdk_base_release(tag, message);
    }

    public static final void logI(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogI$sdk_base_release(tag, message);
    }

    public static final void logW(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogW$sdk_base_release(tag, message);
    }
}
