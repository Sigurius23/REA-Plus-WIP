package io.getstream.chat.android.p226ui.common.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroid/content/Context;", "Ll83/a0;", "openSystemSettings", "(Landroid/content/Context;)V", "", "permission", "", "isPermissionDeclared", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", "mimeType", "text", "shareLocalFile", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ContextUtilsKt {
    @InternalStreamChatApi
    public static final boolean isPermissionDeclared(Context context, String permission) throws PackageManager.NameNotFoundException {
        String[] strArr;
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(permission, "permission");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        return (packageInfo == null || (strArr = packageInfo.requestedPermissions) == null || !AbstractC25260n.m74056a0(strArr, permission)) ? false : true;
    }

    @InternalStreamChatApi
    public static final void openSystemSettings(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
        AbstractC22676k.m65749i(uriFromParts, "fromParts(...)");
        intent.addFlags(268435456);
        intent.setData(uriFromParts);
        context.startActivity(intent);
    }

    @InternalStreamChatApi
    public static final void shareLocalFile(Context context, Uri uri, String str, String str2) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(uri, "uri");
        Intent intent = new Intent("android.intent.action.SEND");
        if (str == null) {
            str = "*/*";
        }
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        intent.addFlags(1);
        context.startActivity(Intent.createChooser(intent, null));
    }

    public static /* synthetic */ void shareLocalFile$default(Context context, Uri uri, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        shareLocalFile(context, uri, str, str2);
    }
}
