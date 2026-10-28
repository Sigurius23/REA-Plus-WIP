package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.audio.AudioHashKt;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.client.audio.ProgressData;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.databinding.StreamUiAudioRecordPlayerPreviewBinding;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordPlayerView;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.io.File;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactory;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AttachmentPreviewFactory;", "<init>", "()V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "", "canHandle", "(Lio/getstream/chat/android/models/Attachment;)Z", "Landroid/view/ViewGroup;", "parentView", "Lkotlin/Function1;", "Ll83/a0;", "attachmentRemovalListener", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "AudioRecordAttachmentPreviewViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioRecordAttachmentPreviewFactory implements AttachmentPreviewFactory {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "AttachRecordPreviewFactory");

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactory$AudioRecordAttachmentPreviewViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerPreviewBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "Ll83/a0;", "attachmentRemovalListener", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerPreviewBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;", "playerView", "", "hashCode", "registerStateChange", "(Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;I)V", "audioPlayer", "attachment", "registerButtonsListeners", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;I)V", "bind", "(Lio/getstream/chat/android/models/Attachment;)V", "unbind", "()V", "Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerPreviewBinding;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/models/Attachment;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class AudioRecordAttachmentPreviewViewHolder extends AttachmentPreviewViewHolder {
        private Attachment attachment;
        private final StreamUiAudioRecordPlayerPreviewBinding binding;

        /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h logger;
        private final MessageComposerViewStyle style;

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

        /* JADX WARN: Illegal instructions before constructor call */
        public AudioRecordAttachmentPreviewViewHolder(StreamUiAudioRecordPlayerPreviewBinding binding, Function1 attachmentRemovalListener, MessageComposerViewStyle messageComposerViewStyle) {
            AudioRecordPlayerViewStyle audioRecordPlayerViewStyle;
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
            FrameLayout root = binding.getRoot();
            AbstractC22676k.m65749i(root, "getRoot(...)");
            super(root);
            this.binding = binding;
            this.style = messageComposerViewStyle;
            this.logger = AbstractC1772c1.m5382S(this, "AttachRecordPreviewHolder");
            binding.removeButton.setOnClickListener(new ViewOnClickListenerC19703a(this, attachmentRemovalListener, 0));
            if (messageComposerViewStyle == null || (audioRecordPlayerViewStyle = messageComposerViewStyle.getAudioRecordPlayerViewStyle()) == null) {
                return;
            }
            binding.playerView.setStyle(audioRecordPlayerViewStyle);
        }

        private static final void _init_$lambda$1(AudioRecordAttachmentPreviewViewHolder audioRecordAttachmentPreviewViewHolder, Function1 function1, View view) {
            Attachment attachment = audioRecordAttachmentPreviewViewHolder.attachment;
            if (attachment != null) {
                function1.invoke(attachment);
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m55282a(AudioRecordAttachmentPreviewViewHolder audioRecordAttachmentPreviewViewHolder, Function1 function1, View view) {
            Attachment attachment = audioRecordAttachmentPreviewViewHolder.attachment;
            if (attachment != null) {
                function1.invoke(attachment);
            }
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ C23454a0 m55288g(Attachment attachment, AudioRecordPlayerView audioRecordPlayerView, AudioPlayer audioPlayer, int i13, AudioRecordAttachmentPreviewViewHolder audioRecordAttachmentPreviewViewHolder) {
            registerButtonsListeners$lambda$11(attachment, audioRecordPlayerView, audioPlayer, i13, audioRecordAttachmentPreviewViewHolder);
            return C23454a0.f92919a;
        }

        private final C2345k getLogger() {
            return (C2345k) this.logger.getValue();
        }

        private final void registerButtonsListeners(final AudioRecordPlayerView audioRecordPlayerView, final AudioPlayer audioPlayer, final Attachment attachment, final int i13) {
            audioRecordPlayerView.setOnPlayButtonClickListener(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.c
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.m55288g(attachment, audioRecordPlayerView, audioPlayer, i13, this);
                    return C23454a0.f92919a;
                }
            });
            audioRecordPlayerView.setOnSpeedButtonClickListener(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.d
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.registerButtonsListeners$lambda$12(audioPlayer, i13);
                    return C23454a0.f92919a;
                }
            });
            audioRecordPlayerView.setOnSeekbarMoveListeners(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.e
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.registerButtonsListeners$lambda$13(audioPlayer, attachment);
                    return C23454a0.f92919a;
                }
            }, new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.registerButtonsListeners$lambda$14(audioPlayer, attachment, ((Integer) obj).intValue());
                    return C23454a0.f92919a;
                }
            });
        }

        private static final C23454a0 registerButtonsListeners$lambda$11(Attachment attachment, AudioRecordPlayerView audioRecordPlayerView, AudioPlayer audioPlayer, int i13, AudioRecordAttachmentPreviewViewHolder audioRecordAttachmentPreviewViewHolder) {
            File upload = attachment.getUpload();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (upload != null) {
                String string = Uri.fromFile(upload).toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                audioPlayer.play(string, i13);
                return c23454a0;
            }
            C2345k logger = audioRecordAttachmentPreviewViewHolder.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[toggleRecordingPlayback] rejected (audioFile is null)", null);
            }
            return c23454a0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 registerButtonsListeners$lambda$12(AudioPlayer audioPlayer, int i13) {
            audioPlayer.changeSpeed(i13);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 registerButtonsListeners$lambda$13(AudioPlayer audioPlayer, Attachment attachment) {
            audioPlayer.startSeek(AudioHashKt.getAudioHash(attachment));
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 registerButtonsListeners$lambda$14(AudioPlayer audioPlayer, Attachment attachment, int i13) {
            audioPlayer.seekTo(AudioRecordAttachmentPreviewFactoryKt.progressToDecimal(i13, AttachmentExtensionsKt.getDuration(attachment)), attachment.hashCode());
            return C23454a0.f92919a;
        }

        private final void registerStateChange(AudioPlayer audioPlayer, final AudioRecordPlayerView audioRecordPlayerView, int i13) {
            final int i14 = 0;
            audioPlayer.registerOnAudioStateChange(i13, new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.registerStateChange$lambda$7(audioRecordPlayerView, (AudioState) obj);
                            break;
                        default:
                            AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.registerStateChange$lambda$8(audioRecordPlayerView, (ProgressData) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i15 = 1;
            audioPlayer.registerOnProgressStateChange(i13, new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.registerStateChange$lambda$7(audioRecordPlayerView, (AudioState) obj);
                            break;
                        default:
                            AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.registerStateChange$lambda$8(audioRecordPlayerView, (ProgressData) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            audioPlayer.registerOnSpeedChange(i13, new C19702x2104d570(audioRecordPlayerView));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 registerStateChange$lambda$7(AudioRecordPlayerView audioRecordPlayerView, AudioState audioState) {
            AbstractC22676k.m65750j(audioState, "audioState");
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
        public static final C23454a0 registerStateChange$lambda$8(AudioRecordPlayerView audioRecordPlayerView, ProgressData progressData) {
            AbstractC22676k.m65750j(progressData, "<destruct>");
            int currentPosition = progressData.getCurrentPosition();
            float progress = progressData.getProgress();
            audioRecordPlayerView.setDuration(ChatUI.getDurationFormatter().format(currentPosition));
            audioRecordPlayerView.setProgress(progress);
            return C23454a0.f92919a;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder
        public final void bind(Attachment attachment) {
            String str;
            AbstractC22676k.m65750j(attachment, "attachment");
            if (attachment.getUpload() == null) {
                return;
            }
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, "[bind] attachment: " + attachment, null);
            }
            AudioPlayer audioPlayer = ChatClient.INSTANCE.instance().getAudioPlayer();
            AudioRecordPlayerView playerView = this.binding.playerView;
            AbstractC22676k.m65749i(playerView, "playerView");
            this.attachment = attachment;
            Integer durationInMs = AttachmentExtensionsKt.getDurationInMs(attachment);
            if (durationInMs != null && (str = ChatUI.getDurationFormatter().format(durationInMs.intValue())) != null) {
                C2345k logger2 = getLogger();
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str3 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                    logger2.f9274b.log(enumC2341g2, str3, "[bind] duration: ".concat(str), null);
                }
                playerView.setDuration(str);
            }
            List<Float> waveformData = AttachmentExtensionsKt.getWaveformData(attachment);
            if (waveformData != null) {
                playerView.setWaveBars(waveformData);
            }
            int iHashCode = attachment.hashCode();
            registerStateChange(audioPlayer, playerView, iHashCode);
            registerButtonsListeners(playerView, audioPlayer, attachment, iHashCode);
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder
        public final void unbind() {
            Attachment attachment = this.attachment;
            if (attachment == null) {
                return;
            }
            ChatClient.INSTANCE.instance().getAudioPlayer().removeAudios(AbstractC37056f.m118958J(Integer.valueOf(attachment.hashCode())));
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.AttachmentPreviewFactory
    public final boolean canHandle(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[canHandle] isAudioRecording: " + AttachmentUtilsKt.isAudioRecording(attachment) + "; " + attachment, null);
        }
        return AttachmentUtilsKt.isAudioRecording(attachment);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.AttachmentPreviewFactory
    public final AttachmentPreviewViewHolder onCreateViewHolder(ViewGroup parentView, Function1 attachmentRemovalListener, MessageComposerViewStyle style) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        Context context = parentView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return new AudioRecordAttachmentPreviewViewHolder(StreamUiAudioRecordPlayerPreviewBinding.inflate(ContextKt.getStreamThemeInflater(context), parentView, false), attachmentRemovalListener, style);
    }
}
