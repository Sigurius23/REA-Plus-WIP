package com.mapbox.common;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/mapbox/common/MapboxMapsAndroidLogger;", "", "<init>", "()V", "", "tag", "message", "Ll83/a0;", "internalLogE$sdk_base_release", "(Ljava/lang/String;Ljava/lang/String;)V", "internalLogE", "internalLogW$sdk_base_release", "internalLogW", "internalLogI$sdk_base_release", "internalLogI", "internalLogD$sdk_base_release", "internalLogD", "SDK_IDENTIFIER", "Ljava/lang/String;", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxMapsAndroidLogger {
    public static final MapboxMapsAndroidLogger INSTANCE = new MapboxMapsAndroidLogger();
    public static final String SDK_IDENTIFIER = "maps-android";

    private MapboxMapsAndroidLogger() {
    }

    public final void internalLogD$sdk_base_release(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        try {
            Log.debug(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.d("maps-android\\".concat(tag), message);
        }
    }

    public final void internalLogE$sdk_base_release(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        try {
            Log.error(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.e("maps-android\\".concat(tag), message);
        }
    }

    public final void internalLogI$sdk_base_release(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        try {
            Log.info(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.i("maps-android\\".concat(tag), message);
        }
    }

    public final void internalLogW$sdk_base_release(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        try {
            Log.warning(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.w("maps-android\\".concat(tag), message);
        }
    }
}
