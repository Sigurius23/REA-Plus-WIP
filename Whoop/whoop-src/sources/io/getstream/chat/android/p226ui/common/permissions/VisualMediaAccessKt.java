package io.getstream.chat.android.p226ui.common.permissions;

import android.content.Context;
import android.os.Build;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m65681d2 = {"resolveVisualMediaAccessState", "Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;", "context", "Landroid/content/Context;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class VisualMediaAccessKt {
    @InternalStreamChatApi
    public static final VisualMediaAccess resolveVisualMediaAccessState(Context context) {
        AbstractC22676k.m65750j(context, "context");
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33 && resolveVisualMediaAccessState$lambda$0(context, "android.permission.READ_MEDIA_IMAGES") && resolveVisualMediaAccessState$lambda$0(context, "android.permission.READ_MEDIA_VIDEO")) {
            return VisualMediaAccess.FULL;
        }
        if (i13 < 34 || !resolveVisualMediaAccessState$lambda$0(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
            return resolveVisualMediaAccessState$lambda$0(context, "android.permission.READ_EXTERNAL_STORAGE") ? VisualMediaAccess.FULL : VisualMediaAccess.DENIED;
        }
        return VisualMediaAccess.PARTIAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveVisualMediaAccessState$lambda$0(Context context, String permission) {
        AbstractC22676k.m65750j(permission, "permission");
        return AbstractC32122c.checkSelfPermission(context, permission) == 0;
    }
}
