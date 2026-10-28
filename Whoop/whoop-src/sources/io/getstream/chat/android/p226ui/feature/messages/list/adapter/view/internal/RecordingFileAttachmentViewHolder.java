package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.client.audio.ProgressData;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.helper.DurationFormatter;
import io.getstream.chat.android.p226ui.common.utils.MediaStringUtil;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemRecordingAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.FileAttachmentViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.background.ShapeAppearanceModelFactory;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.AttachmentUtilsKt;
import java.io.File;
import java.util.List;
import kr.C22782a;
import kr.C22786e;
import kr.C22788g;
import kr.C22792k;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import se.AbstractC32410a;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 <2\u00020\u0001:\u0001<B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010\u001fJ\u000f\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010\u001fJ\u0017\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;", "binding", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "attachmentLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;", "attachmentDownloadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;", "playerView", "", "hashCode", "Ll83/a0;", "registerStateChange", "(Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;I)V", "audioPlayer", "registerButtonsListeners", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;Lio/getstream/chat/android/client/audio/AudioPlayer;)V", NotificationCompat.CATEGORY_PROGRESS, "", "totalDuration", "progressToDecimal", "(ILjava/lang/Float;)I", "setupBackground", "()V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "subscribeForProgressIfNeeded", "(Lio/getstream/chat/android/models/Attachment;)V", "Landroid/widget/TextView;", "fileSizeView", "", "bytesRead", "totalBytes", "handleInProgressAttachment", "(Landroid/widget/TextView;JJ)V", "clearScope", "restartJob", "item", "bind", "unbind", "Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/models/Attachment;", "Lbc3/c0;", "scope", "Lbc3/c0;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class RecordingFileAttachmentViewHolder extends FileAttachmentViewHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final float NULL_DURATION = 0.0f;
    private Attachment attachment;
    private final StreamUiItemRecordingAttachmentBinding binding;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private InterfaceC2994c0 scope;
    private final FileAttachmentViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder$Companion;", "", "<init>", "()V", "NULL_DURATION", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioState.values().length];
            try {
                iArr[AudioState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioState.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioState.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioState.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioState.PLAYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.RecordingFileAttachmentViewHolder$registerStateChange$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C197693 extends C22672i implements Function1 {
        public C197693(Object obj) {
            super(1, 0, AudioRecordPlayerView.class, obj, "setSpeedText", "setSpeedText(F)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return C23454a0.f92919a;
        }

        public final void invoke(float f13) {
            ((AudioRecordPlayerView) this.receiver).setSpeedText(f13);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecordingFileAttachmentViewHolder(StreamUiItemRecordingAttachmentBinding binding, AttachmentClickListener attachmentClickListener, AttachmentLongClickListener attachmentLongClickListener, AttachmentDownloadClickListener attachmentDownloadClickListener, FileAttachmentViewStyle style) {
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(style, "style");
        FrameLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        this.style = style;
        this.logger = AbstractC1772c1.m5382S(this, "RecordingAttachmentVH");
        if (attachmentClickListener != null) {
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC19771b(3, this, attachmentClickListener));
        }
        if (attachmentLongClickListener != null) {
            binding.getRoot().setOnLongClickListener(new ViewOnLongClickListenerC19780k(attachmentLongClickListener, 1));
        }
        if (attachmentDownloadClickListener != null) {
            binding.actionButton.setOnClickListener(new ViewOnClickListenerC19771b(4, this, attachmentDownloadClickListener));
        }
        AudioPlayer audioPlayer = ChatClient.INSTANCE.instance().getAudioPlayer();
        AudioRecordPlayerView playerView = binding.playerView;
        AbstractC22676k.m65749i(playerView, "playerView");
        registerButtonsListeners(playerView, audioPlayer);
        binding.getRoot().setBackground(ShapeAppearanceModelFactory.INSTANCE.fileBackground(getContext()));
    }

    /* JADX INFO: renamed from: c */
    public static void m55527c(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AttachmentClickListener attachmentClickListener, View view) {
        Attachment attachment = recordingFileAttachmentViewHolder.attachment;
        if (attachment != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void handleInProgressAttachment(TextView fileSizeView, long bytesRead, long totalBytes) {
        fileSizeView.setText(getContext().getString(C19469R.string.stream_ui_message_list_attachment_upload_progress, MediaStringUtil.convertFileSizeByteCount(bytesRead), MediaStringUtil.convertFileSizeByteCount(totalBytes)));
    }

    private static final void lambda$1$lambda$0(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AttachmentClickListener attachmentClickListener, View view) {
        Attachment attachment = recordingFileAttachmentViewHolder.attachment;
        if (attachment != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private static final boolean lambda$3$lambda$2(AttachmentLongClickListener attachmentLongClickListener, View view) {
        attachmentLongClickListener.onAttachmentLongClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AttachmentDownloadClickListener attachmentDownloadClickListener, View view) {
        Attachment attachment;
        Attachment attachment2 = recordingFileAttachmentViewHolder.attachment;
        if ((attachment2 == null || !AttachmentKt.isFailed(attachment2)) && (attachment = recordingFileAttachmentViewHolder.attachment) != null) {
            attachmentDownloadClickListener.onAttachmentDownloadClick(attachment);
        }
    }

    private final int progressToDecimal(int progress, Float totalDuration) {
        return (progress * ((int) (totalDuration != null ? totalDuration.floatValue() : 0.0f))) / 100;
    }

    private final void registerButtonsListeners(AudioRecordPlayerView audioRecordPlayerView, AudioPlayer audioPlayer) {
        int i13 = 0;
        audioRecordPlayerView.setOnPlayButtonClickListener(new C19787r(this, audioPlayer, audioRecordPlayerView, i13));
        audioRecordPlayerView.setOnSpeedButtonClickListener(new C19788s(i13, this, audioPlayer));
        audioRecordPlayerView.setOnSeekbarMoveListeners(new C19788s(1, this, audioPlayer), new C19785p(1, this, audioPlayer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$11(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AudioPlayer audioPlayer, AudioRecordPlayerView audioRecordPlayerView) {
        Attachment attachment = recordingFileAttachmentViewHolder.attachment;
        String assetUrl = attachment != null ? attachment.getAssetUrl() : null;
        Attachment attachment2 = recordingFileAttachmentViewHolder.attachment;
        int iHashCode = attachment2 != null ? attachment2.hashCode() : 0;
        C2345k logger = recordingFileAttachmentViewHolder.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30456j(iHashCode, "[onPlayButtonClick] audioHash: ", ", assetUrl: ", assetUrl), null);
        }
        if (assetUrl != null) {
            audioPlayer.play(assetUrl, iHashCode);
        } else {
            audioRecordPlayerView.setLoading();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$12(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AudioPlayer audioPlayer) {
        Attachment attachment = recordingFileAttachmentViewHolder.attachment;
        audioPlayer.changeSpeed(attachment != null ? attachment.hashCode() : 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$13(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AudioPlayer audioPlayer) {
        Attachment attachment = recordingFileAttachmentViewHolder.attachment;
        audioPlayer.startSeek(attachment != null ? attachment.hashCode() : 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$14(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AudioPlayer audioPlayer, int i13) {
        Attachment attachment = recordingFileAttachmentViewHolder.attachment;
        int iHashCode = attachment != null ? attachment.hashCode() : 0;
        Attachment attachment2 = recordingFileAttachmentViewHolder.attachment;
        audioPlayer.seekTo(recordingFileAttachmentViewHolder.progressToDecimal(i13, attachment2 != null ? AttachmentExtensionsKt.getDuration(attachment2) : null), iHashCode);
        return C23454a0.f92919a;
    }

    private final void registerStateChange(AudioPlayer audioPlayer, AudioRecordPlayerView audioRecordPlayerView, int i13) {
        int i14 = 0;
        audioPlayer.registerOnAudioStateChange(i13, new C19785p(i14, this, audioRecordPlayerView));
        audioPlayer.registerOnProgressStateChange(i13, new C19786q(audioRecordPlayerView, i14));
        audioPlayer.registerOnSpeedChange(i13, new C197693(audioRecordPlayerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerStateChange$lambda$8(RecordingFileAttachmentViewHolder recordingFileAttachmentViewHolder, AudioRecordPlayerView audioRecordPlayerView, AudioState audioState) {
        AbstractC22676k.m65750j(audioState, "audioState");
        C2345k logger = recordingFileAttachmentViewHolder.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onAudioStateChange] audioState: " + audioState, null);
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[audioState.ordinal()];
        if (i13 == 1) {
            audioRecordPlayerView.setLoading();
        } else if (i13 == 2) {
            audioRecordPlayerView.setPaused();
        } else if (i13 == 3 || i13 == 4) {
            audioRecordPlayerView.setIdle();
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            audioRecordPlayerView.setPlaying();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerStateChange$lambda$9(AudioRecordPlayerView audioRecordPlayerView, ProgressData progressData) {
        AbstractC22676k.m65750j(progressData, "<destruct>");
        int iComponent1 = progressData.getCurrentPosition();
        float fComponent2 = progressData.getProgress();
        audioRecordPlayerView.setDuration(ChatUI.getDurationFormatter().format(iComponent1));
        audioRecordPlayerView.setProgress(fComponent2);
        return C23454a0.f92919a;
    }

    private final void setupBackground() {
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        float cornerRadius = this.style.getCornerRadius();
        AbstractC32410a abstractC32410aM101114z = AbstractC32411b.m101114z(0);
        C22782a c22782a = new C22782a(cornerRadius);
        C22782a c22782a2 = new C22782a(cornerRadius);
        C22782a c22782a3 = new C22782a(cornerRadius);
        C22782a c22782a4 = new C22782a(cornerRadius);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = abstractC32410aM101114z;
        c22792k.f89767b = abstractC32410aM101114z;
        c22792k.f89768c = abstractC32410aM101114z;
        c22792k.f89769d = abstractC32410aM101114z;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        C22788g c22788g = new C22788g(c22792k);
        c22788g.m66011m(ColorStateList.valueOf(this.style.getBackgroundColor()));
        c22788g.m66015q(ColorStateList.valueOf(this.style.getStrokeColor()));
        c22788g.m66017s(this.style.getStrokeWidth());
        this.binding.getRoot().setBackground(c22788g);
    }

    private final void subscribeForProgressIfNeeded(Attachment attachment) {
        Attachment.UploadState uploadState = attachment.getUploadState();
        if (uploadState instanceof Attachment.UploadState.Idle) {
            TextView fileSize = this.binding.fileSize;
            AbstractC22676k.m65749i(fileSize, "fileSize");
            File upload = attachment.getUpload();
            handleInProgressAttachment(fileSize, 0L, upload != null ? upload.length() : 0L);
            return;
        }
        if (uploadState instanceof Attachment.UploadState.InProgress) {
            TextView fileSize2 = this.binding.fileSize;
            AbstractC22676k.m65749i(fileSize2, "fileSize");
            Attachment.UploadState.InProgress inProgress = (Attachment.UploadState.InProgress) uploadState;
            handleInProgressAttachment(fileSize2, inProgress.getBytesUploaded(), inProgress.getTotalBytes());
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FileAttachmentViewHolder
    public final void clearScope() {
        InterfaceC2994c0 interfaceC2994c0 = this.scope;
        if (interfaceC2994c0 != null) {
            AbstractC3006f0.m8714h(interfaceC2994c0, null);
        }
        this.scope = null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FileAttachmentViewHolder
    public final void restartJob() {
        Attachment attachment = this.attachment;
        if (attachment != null) {
            subscribeForProgressIfNeeded(attachment);
        }
    }

    @Override // io.getstream.chat.android.ui.widgets.internal.SimpleListAdapter.ViewHolder
    public final void unbind() {
        clearScope();
    }

    @Override // io.getstream.chat.android.ui.widgets.internal.SimpleListAdapter.ViewHolder
    public final void bind(Attachment item) {
        String str;
        AbstractC22676k.m65750j(item, "item");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, "[bind] item: " + item, null);
        }
        this.attachment = item;
        StreamUiItemRecordingAttachmentBinding streamUiItemRecordingAttachmentBinding = this.binding;
        TextView fileTitle = streamUiItemRecordingAttachmentBinding.fileTitle;
        AbstractC22676k.m65749i(fileTitle, "fileTitle");
        TextStyleKt.setTextStyle(fileTitle, this.style.getTitleTextStyle());
        TextView fileSize = streamUiItemRecordingAttachmentBinding.fileSize;
        AbstractC22676k.m65749i(fileSize, "fileSize");
        TextStyleKt.setTextStyle(fileSize, this.style.getFileSizeTextStyle());
        ImageView fileTypeIcon = streamUiItemRecordingAttachmentBinding.fileTypeIcon;
        AbstractC22676k.m65749i(fileTypeIcon, "fileTypeIcon");
        AttachmentUtilsKt.loadAttachmentThumb(fileTypeIcon, item);
        streamUiItemRecordingAttachmentBinding.fileTitle.setText(getContext().getString(C19469R.string.stream_ui_attachment_list_recording));
        Attachment.UploadState uploadState = item.getUploadState();
        boolean z4 = uploadState != null ? uploadState instanceof Attachment.UploadState.Success : true;
        ConstraintLayout uploadingContainer = streamUiItemRecordingAttachmentBinding.uploadingContainer;
        AbstractC22676k.m65749i(uploadingContainer, "uploadingContainer");
        uploadingContainer.setVisibility(!z4 ? 0 : 8);
        AudioRecordPlayerView playerView = streamUiItemRecordingAttachmentBinding.playerView;
        AbstractC22676k.m65749i(playerView, "playerView");
        playerView.setVisibility(z4 ? 0 : 8);
        Integer durationInMs = AttachmentExtensionsKt.getDurationInMs(item);
        if (durationInMs != null && (str = ChatUI.getDurationFormatter().format(durationInMs.intValue())) != null) {
            streamUiItemRecordingAttachmentBinding.playerView.setDuration(str);
        }
        List<Float> waveformData = AttachmentExtensionsKt.getWaveformData(item);
        if (waveformData != null) {
            streamUiItemRecordingAttachmentBinding.playerView.setWaveBars(waveformData);
        }
        if ((item.getUploadState() instanceof Attachment.UploadState.Idle) || (item.getUploadState() instanceof Attachment.UploadState.InProgress) || ((item.getUploadState() instanceof Attachment.UploadState.Success) && item.getFileSize() == 0)) {
            streamUiItemRecordingAttachmentBinding.actionButton.setVisibility(8);
            TextView textView = streamUiItemRecordingAttachmentBinding.fileSize;
            File upload = item.getUpload();
            textView.setText(MediaStringUtil.convertFileSizeByteCount(upload != null ? upload.length() : 0L));
        } else if ((item.getUploadState() instanceof Attachment.UploadState.Failed) || item.getFileSize() == 0) {
            streamUiItemRecordingAttachmentBinding.actionButton.setVisibility(0);
            streamUiItemRecordingAttachmentBinding.actionButton.setImageDrawable(this.style.getFailedAttachmentIcon());
            TextView textView2 = streamUiItemRecordingAttachmentBinding.fileSize;
            DurationFormatter durationFormatter = ChatUI.getDurationFormatter();
            Integer durationInMs2 = AttachmentExtensionsKt.getDurationInMs(item);
            textView2.setText(durationFormatter.format(durationInMs2 != null ? durationInMs2.intValue() : 0));
        } else {
            streamUiItemRecordingAttachmentBinding.actionButton.setVisibility(8);
            streamUiItemRecordingAttachmentBinding.actionButton.setImageDrawable(this.style.getActionButtonIcon());
            TextView textView3 = streamUiItemRecordingAttachmentBinding.fileSize;
            DurationFormatter durationFormatter2 = ChatUI.getDurationFormatter();
            Integer durationInMs3 = AttachmentExtensionsKt.getDurationInMs(item);
            textView3.setText(durationFormatter2.format(durationInMs3 != null ? durationInMs3.intValue() : 0));
        }
        this.binding.progressBar.setIndeterminateDrawable(this.style.getProgressBarDrawable());
        ProgressBar progressBar = this.binding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(item.getUploadState() instanceof Attachment.UploadState.InProgress ? 0 : 8);
        subscribeForProgressIfNeeded(item);
        setupBackground();
        AudioPlayer audioPlayer = ChatClient.INSTANCE.instance().getAudioPlayer();
        AudioRecordPlayerView playerView2 = this.binding.playerView;
        AbstractC22676k.m65749i(playerView2, "playerView");
        registerStateChange(audioPlayer, playerView2, item.hashCode());
    }
}
