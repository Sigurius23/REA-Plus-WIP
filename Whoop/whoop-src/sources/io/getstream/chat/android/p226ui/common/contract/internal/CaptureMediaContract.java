package io.getstream.chat.android.p226ui.common.contract.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.profileinstaller.ProfileVerifier;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.internal.file.StreamFileManager;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.internal.file.ShareableUriProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001.B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R.\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R.\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010)¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;", "Lk/b;", "Ll83/a0;", "Ljava/io/File;", "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;", "mode", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "fileManager", "pictureFile", "videoFile", "<init>", "(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;Ljava/io/File;)V", "Landroid/content/Context;", "context", "", "Landroid/content/Intent;", "getRecordVideoIntents", "(Landroid/content/Context;)Ljava/util/List;", "getTakePictureIntents", "", "action", "destinationFile", "createIntentList", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Ljava/util/List;", "intents", "(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/util/List;", "label", "(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/lang/String;", "input", "createIntent", "(Landroid/content/Context;Ll83/a0;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/io/File;", "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "value", "Ljava/io/File;", "getPictureFile", "()Ljava/io/File;", "getPictureFile$annotations", "()V", "getVideoFile", "getVideoFile$annotations", "Mode", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CaptureMediaContract extends AbstractC22081b {
    public static final int $stable = 8;
    private final StreamFileManager fileManager;
    private final Mode mode;
    private File pictureFile;
    private File videoFile;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "PHOTO", "VIDEO", "PHOTO_AND_VIDEO", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    @InternalStreamChatApi
    public enum Mode {
        PHOTO,
        VIDEO,
        PHOTO_AND_VIDEO;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.PHOTO_AND_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CaptureMediaContract(Mode mode, StreamFileManager fileManager, File file, File file2) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(fileManager, "fileManager");
        this.mode = mode;
        this.fileManager = fileManager;
        this.pictureFile = file;
        this.videoFile = file2;
    }

    private final List<Intent> createIntentList(Context context, String action, File destinationFile) {
        Uri uriForFile = new ShareableUriProvider().getUriForFile(context, destinationFile);
        Intent intent = new Intent(action);
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
        AbstractC22676k.m65749i(listQueryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = listQueryIntentActivities;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ResolveInfo resolveInfo : list) {
            Intent intent2 = new Intent(intent);
            intent2.putExtra("output", uriForFile);
            intent2.setFlags(2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getPictureFile$annotations() {
    }

    private final List<Intent> getRecordVideoIntents(Context context) {
        File file = (File) this.fileManager.createVideoInExternalDir(context).m77816b();
        this.videoFile = file;
        return file != null ? createIntentList(context, "android.media.action.VIDEO_CAPTURE", file) : C25271y.f99162w;
    }

    private final List<Intent> getTakePictureIntents(Context context) {
        File file = (File) this.fileManager.createPhotoInExternalDir(context).m77816b();
        this.pictureFile = file;
        return file != null ? createIntentList(context, "android.media.action.IMAGE_CAPTURE", file) : C25271y.f99162w;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getVideoFile$annotations() {
    }

    private final List<Intent> intents(Mode mode, Context context) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i13 == 1) {
            return getTakePictureIntents(context);
        }
        if (i13 == 2) {
            return getRecordVideoIntents(context);
        }
        if (i13 == 3) {
            return AbstractC25265s.m74129g1(getTakePictureIntents(context), getRecordVideoIntents(context));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String label(Mode mode, Context context) {
        int i13;
        int i14 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i14 == 1) {
            i13 = C19470R.string.stream_ui_message_composer_capture_media_take_photo;
        } else if (i14 == 2) {
            i13 = C19470R.string.stream_ui_message_composer_capture_media_video;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = C19470R.string.stream_ui_message_composer_capture_media;
        }
        String string = context.getString(i13);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    public final File getPictureFile() {
        return this.pictureFile;
    }

    public final File getVideoFile() {
        return this.videoFile;
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, C23454a0 input) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        List<Intent> listIntents = intents(this.mode, context);
        Intent intent = (Intent) AbstractC25265s.m74114R0(listIntents);
        if (intent == null) {
            intent = new Intent();
        }
        Intent intentCreateChooser = Intent.createChooser(intent, label(this.mode, context));
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) AbstractC25265s.m74124b1(listIntents, intent).toArray(new Intent[0]));
        return intentCreateChooser;
    }

    @Override // p267k.AbstractC22081b
    public final File parseResult(int resultCode, Intent intent) {
        File fileTakeIfCaptured = CaptureMediaContractKt.takeIfCaptured(this.pictureFile);
        if (fileTakeIfCaptured == null) {
            fileTakeIfCaptured = CaptureMediaContractKt.takeIfCaptured(this.videoFile);
        }
        if (resultCode == -1) {
            return fileTakeIfCaptured;
        }
        return null;
    }

    public CaptureMediaContract(Mode mode, StreamFileManager streamFileManager, File file, File file2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, (i13 & 2) != 0 ? new StreamFileManager() : streamFileManager, (i13 & 4) != 0 ? null : file, (i13 & 8) != 0 ? null : file2);
    }
}
