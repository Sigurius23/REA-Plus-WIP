package io.getstream.chat.android.p226ui.common.permissions;

import android.content.Context;
import android.os.Build;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, m65681d2 = {"resolveFilesAccessState", "Lio/getstream/chat/android/ui/common/permissions/FilesAccess;", "context", "Landroid/content/Context;", "isAudioAccessGranted", "", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FilesAccessKt {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisualMediaAccess.values().length];
            try {
                iArr[VisualMediaAccess.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisualMediaAccess.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisualMediaAccess.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean isAudioAccessGranted(Context context) {
        return Build.VERSION.SDK_INT >= 33 ? isAudioAccessGranted$lambda$0(context, "android.permission.READ_MEDIA_AUDIO") : isAudioAccessGranted$lambda$0(context, "android.permission.READ_EXTERNAL_STORAGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAudioAccessGranted$lambda$0(Context context, String permission) {
        AbstractC22676k.m65750j(permission, "permission");
        return AbstractC32122c.checkSelfPermission(context, permission) == 0;
    }

    @InternalStreamChatApi
    public static final FilesAccess resolveFilesAccessState(Context context) {
        AbstractC22676k.m65750j(context, "context");
        VisualMediaAccess visualMediaAccessResolveVisualMediaAccessState = VisualMediaAccessKt.resolveVisualMediaAccessState(context);
        boolean zIsAudioAccessGranted = isAudioAccessGranted(context);
        int i13 = WhenMappings.$EnumSwitchMapping$0[visualMediaAccessResolveVisualMediaAccessState.ordinal()];
        if (i13 == 1) {
            return zIsAudioAccessGranted ? FilesAccess.AUDIO_AND_FULL_VISUAL : FilesAccess.FULL_VISUAL;
        }
        if (i13 == 2) {
            return zIsAudioAccessGranted ? FilesAccess.AUDIO_AND_PARTIAL_VISUAL : FilesAccess.PARTIAL_VISUAL;
        }
        if (i13 == 3) {
            return zIsAudioAccessGranted ? FilesAccess.AUDIO : FilesAccess.DENIED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
