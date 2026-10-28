package io.getstream.chat.android.p226ui.common.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u000fH\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/permissions/Permissions;", "", "<init>", "()V", "visualMediaPermissions", "", "", "()[Ljava/lang/String;", "audioPermissions", "filesPermissions", "isPermanentlyDenied", "", "context", "Landroid/content/Context;", "grantResults", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Permissions {
    public static final int $stable = 0;
    public static final Permissions INSTANCE = new Permissions();

    private Permissions() {
    }

    @InternalStreamChatApi
    public final String[] audioPermissions() {
        return Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_AUDIO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    @InternalStreamChatApi
    public final String[] filesPermissions() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_AUDIO"};
        }
        return i13 >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    @InternalStreamChatApi
    public final boolean isPermanentlyDenied(Context context, Map<String, Boolean> grantResults) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(grantResults, "grantResults");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return false;
        }
        if (grantResults.isEmpty()) {
            return true;
        }
        for (Map.Entry<String, Boolean> entry : grantResults.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().booleanValue() || ActivityCompat.shouldShowRequestPermissionRationale(activity, key)) {
                return false;
            }
        }
        return true;
    }

    @InternalStreamChatApi
    public final String[] visualMediaPermissions() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        }
        return i13 >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }
}
