package io.getstream.chat.android.p226ui.common.utils.extensions;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroid/content/Context;", "", "permission", "", "wasPermissionRequested", "(Landroid/content/Context;Ljava/lang/String;)Z", "Ll83/a0;", "onPermissionRequested", "(Landroid/content/Context;Ljava/lang/String;)V", "PERMISSIONS_PREFS", "Ljava/lang/String;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ContextKt {
    private static final String PERMISSIONS_PREFS = "stream_permissions";

    public static final void onPermissionRequested(Context context, String permission) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(permission, "permission");
        context.getSharedPreferences(PERMISSIONS_PREFS, 0).edit().putBoolean(permission, true).apply();
    }

    public static final boolean wasPermissionRequested(Context context, String permission) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(permission, "permission");
        return context.getSharedPreferences(PERMISSIONS_PREFS, 0).getBoolean(permission, false);
    }
}
