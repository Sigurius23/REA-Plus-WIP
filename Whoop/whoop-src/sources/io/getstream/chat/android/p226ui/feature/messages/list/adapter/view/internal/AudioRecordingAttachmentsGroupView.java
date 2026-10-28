package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import a41.C0372h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2588o1;
import c93.InterfaceC4339a;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import h02.C16561a0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.audio.AudioHashKt;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.client.audio.ExtractorCallBack;
import io.getstream.chat.android.client.audio.ProgressData;
import io.getstream.chat.android.client.audio.WaveformExtractor;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p184h5.C16907r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001;\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u000f*\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0014¢\u0006\u0004\b&\u0010\u0013J\u001b\u0010)\u001a\u00020\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0014¢\u0006\u0004\b+\u0010\u0013J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u0013R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010IR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010K¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Ll83/a0;", "addAttachmentPlayerView", "(ILio/getstream/chat/android/models/Attachment;)V", "resetCurrentAttachments", "()V", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;", "playerView", "audioHash", "registerStateChange", "(Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;I)V", "audioPlayer", "registerButtonsListeners", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;I)V", NotificationCompat.CATEGORY_PROGRESS, "", "durationInSeconds", "progressToMillis", "(IF)I", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "style", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V", "onAttachedToWindow", "", "attachments", "showAudioAttachments", "(Ljava/util/List;)V", "onDetachedFromWindow", "unbind", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "getAttachmentClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "setAttachmentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "attachmentLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "getAttachmentLongClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "setAttachmentLongClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V", "io/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1", "pauseAudioPlayerListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "audioAttachments", "Ljava/util/List;", "Lio/getstream/chat/android/client/audio/WaveformExtractor;", "extractor$delegate", "getExtractor", "()Lio/getstream/chat/android/client/audio/WaveformExtractor;", "extractor", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioRecordingAttachmentsGroupView extends LinearLayoutCompat {
    private AttachmentClickListener attachmentClickListener;
    private AttachmentLongClickListener attachmentLongClickListener;
    private List<Attachment> audioAttachments;

    /* JADX INFO: renamed from: extractor$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h extractor;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1 pauseAudioPlayerListener;
    private AudioRecordPlayerViewStyle style;

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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.AudioRecordingAttachmentsGroupView$registerStateChange$4 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C197654 extends C22672i implements Function1 {
        public C197654(Object obj) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordingAttachmentsGroupView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context), null);
        AbstractC22676k.m65750j(context, "context");
        setPadding(IntKt.dpToPx(2), IntKt.dpToPx(0), IntKt.dpToPx(2), IntKt.dpToPx(2));
        this.pauseAudioPlayerListener = new AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1();
        this.logger = AbstractC1772c1.m5382S(this, "AudioRecAttachGroupView");
        this.extractor = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C19773d(this, 0));
    }

    private final void addAttachmentPlayerView(int index, Attachment attachment) {
        String str;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC2875y.m8295h(index, "[addAttachmentPlayerView] index: "), null);
        }
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        AudioRecordPlayerView audioRecordPlayerView = new AudioRecordPlayerView(context);
        Integer durationInMs = AttachmentExtensionsKt.getDurationInMs(attachment);
        if (durationInMs != null && (str = ChatUI.getDurationFormatter().format(durationInMs.intValue())) != null) {
            audioRecordPlayerView.setTotalDuration(str);
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str3 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
            logger2.f9274b.log(enumC2341g2, str3, AbstractC11895b.m31998q("[addAttachmentPlayerView] waveformData: ", AttachmentExtensionsKt.getWaveformData(attachment)), null);
        }
        List<Float> waveformData = AttachmentExtensionsKt.getWaveformData(attachment);
        if (waveformData != null) {
            audioRecordPlayerView.setWaveBars(waveformData);
        }
        setOnClickListener(new ViewOnClickListenerC19771b(5, this, attachment));
        setOnLongClickListener(new ViewOnLongClickListenerC19775f(this, 0));
        addView(audioRecordPlayerView);
        if (index > 0) {
            ViewGroup.LayoutParams layoutParams = audioRecordPlayerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = IntKt.dpToPx(2);
            audioRecordPlayerView.setLayoutParams(marginLayoutParams);
        }
        AudioPlayer audioPlayer = ChatClient.INSTANCE.instance().getAudioPlayer();
        int iHashCode = attachment.hashCode();
        registerStateChange(audioPlayer, audioRecordPlayerView, iHashCode);
        registerButtonsListeners(audioRecordPlayerView, audioPlayer, attachment, iHashCode);
        audioRecordPlayerView.setAudioHash$stream_chat_android_ui_components_release(Integer.valueOf(iHashCode));
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = this.style;
        if (audioRecordPlayerViewStyle != null) {
            audioRecordPlayerView.setStyle(audioRecordPlayerViewStyle);
        }
    }

    private static final void addAttachmentPlayerView$lambda$19$lambda$15(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, Attachment attachment, View view) {
        AttachmentClickListener attachmentClickListener = audioRecordingAttachmentsGroupView.attachmentClickListener;
        if (attachmentClickListener != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private static final boolean addAttachmentPlayerView$lambda$19$lambda$16(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, View view) {
        AttachmentLongClickListener attachmentLongClickListener = audioRecordingAttachmentsGroupView.attachmentLongClickListener;
        if (attachmentLongClickListener == null) {
            return true;
        }
        attachmentLongClickListener.onAttachmentLongClick();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m55480d(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, View view) {
        AttachmentLongClickListener attachmentLongClickListener = audioRecordingAttachmentsGroupView.attachmentLongClickListener;
        if (attachmentLongClickListener != null) {
            attachmentLongClickListener.onAttachmentLongClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaveformExtractor extractor_delegate$lambda$2(final AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView) {
        Context context = audioRecordingAttachmentsGroupView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return new WaveformExtractor(context, "key", 100, new ExtractorCallBack() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.e
            @Override // io.getstream.chat.android.client.audio.ExtractorCallBack
            public final void onProgress(WaveformExtractor waveformExtractor, float f13) {
                AudioRecordingAttachmentsGroupView.extractor_delegate$lambda$2$lambda$1(this.f74628a, waveformExtractor, f13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void extractor_delegate$lambda$2$lambda$1(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, WaveformExtractor extractor, float f13) {
        AbstractC22676k.m65750j(extractor, "extractor");
        if (f13 >= 1.0f) {
            C2345k logger = audioRecordingAttachmentsGroupView.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[onProgress] progress: " + f13 + ", sampleData: " + extractor.getSampleData(), null);
            }
            if (audioRecordingAttachmentsGroupView.getChildCount() > 0) {
                View childAt = audioRecordingAttachmentsGroupView.getChildAt(0);
                AbstractC22676k.m65748h(childAt, "null cannot be cast to non-null type io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.AudioRecordPlayerView");
                AudioRecordPlayerView audioRecordPlayerView = (AudioRecordPlayerView) childAt;
                audioRecordPlayerView.setWaveBars(extractor.getSampleData());
                audioRecordPlayerView.invalidate();
                audioRecordPlayerView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m55482f(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, Attachment attachment, View view) {
        AttachmentClickListener attachmentClickListener = audioRecordingAttachmentsGroupView.attachmentClickListener;
        if (attachmentClickListener != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private final WaveformExtractor getExtractor() {
        return (WaveformExtractor) this.extractor.getValue();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final int progressToMillis(int progress, float durationInSeconds) {
        return (int) ((progress * (durationInSeconds * 1000)) / 100);
    }

    private final void registerButtonsListeners(final AudioRecordPlayerView audioRecordPlayerView, final AudioPlayer audioPlayer, final Attachment attachment, final int i13) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(i13, "[registerButtonsListeners] audioHash: "), null);
        }
        audioRecordPlayerView.setOnPlayButtonClickListener(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.g
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                AudioRecordingAttachmentsGroupView.registerButtonsListeners$lambda$32(this.f74632w, audioPlayer, attachment, i13, audioRecordPlayerView);
                return C23454a0.f92919a;
            }
        });
        audioRecordPlayerView.setOnSpeedButtonClickListener(new C0372h(this, audioPlayer, i13, 5));
        audioRecordPlayerView.setOnSeekbarMoveListeners(new C16561a0(this, audioPlayer, attachment, i13), new C2588o1(attachment, this, audioPlayer, i13, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$32(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, AudioPlayer audioPlayer, Attachment attachment, int i13, AudioRecordPlayerView audioRecordPlayerView) {
        C2345k logger = audioRecordingAttachmentsGroupView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(i13, "[onPlayButtonClick] audioHash: "), null);
        }
        audioPlayer.clearTracks();
        List<Attachment> list = audioRecordingAttachmentsGroupView.audioAttachments;
        if (list != null) {
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                Attachment attachment2 = (Attachment) obj;
                String assetUrl = attachment2.getAssetUrl();
                if (assetUrl != null) {
                    audioPlayer.registerTrack(assetUrl, attachment2.hashCode(), i14);
                }
                i14 = i15;
            }
        }
        String assetUrl2 = attachment.getAssetUrl();
        if (assetUrl2 != null) {
            audioPlayer.play(assetUrl2, i13);
        } else {
            audioRecordPlayerView.setLoading();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$34(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, AudioPlayer audioPlayer, int i13) {
        C2345k logger = audioRecordingAttachmentsGroupView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(i13, "[onSpeedButtonClick] audioHash: "), null);
        }
        audioPlayer.changeSpeed(i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$36(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, AudioPlayer audioPlayer, Attachment attachment, int i13) {
        C2345k logger = audioRecordingAttachmentsGroupView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(i13, "[onSeekBarStart] audioHash: "), null);
        }
        audioPlayer.startSeek(AudioHashKt.getAudioHash(attachment));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerButtonsListeners$lambda$38(Attachment attachment, AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, AudioPlayer audioPlayer, int i13, int i14) {
        Float duration = AttachmentExtensionsKt.getDuration(attachment);
        float fFloatValue = duration != null ? duration.floatValue() : 0.0f;
        int iProgressToMillis = audioRecordingAttachmentsGroupView.progressToMillis(i14, fFloatValue);
        C2345k logger = audioRecordingAttachmentsGroupView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "[onSeekBarStop] audioHash: ", ", progress: ", ", duration: ");
            sbM30465s.append(fFloatValue);
            interfaceC2344j.log(enumC2341g, str, sbM30465s.toString(), null);
        }
        audioPlayer.seekTo(iProgressToMillis, attachment.hashCode());
        return C23454a0.f92919a;
    }

    private final void registerStateChange(AudioPlayer audioPlayer, AudioRecordPlayerView audioRecordPlayerView, int i13) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(i13, "[registerStateChange] audioHash: "), null);
        }
        audioPlayer.registerOnAudioStateChange(i13, new C6517d(this, audioRecordPlayerView, i13, 3));
        audioPlayer.registerOnProgressStateChange(i13, new C19786q(audioRecordPlayerView, 1));
        audioPlayer.registerOnSpeedChange(i13, new C197654(audioRecordPlayerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerStateChange$lambda$26(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, AudioRecordPlayerView audioRecordPlayerView, int i13, AudioState audioState) {
        AbstractC22676k.m65750j(audioState, "audioState");
        C2345k logger = audioRecordingAttachmentsGroupView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onAudioStateChange] audioHash: " + i13 + ", audioState: " + audioState, null);
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[audioState.ordinal()];
        if (i14 == 1) {
            audioRecordPlayerView.setLoading();
        } else if (i14 == 2) {
            audioRecordPlayerView.setPaused();
        } else if (i14 == 3 || i14 == 4) {
            audioRecordPlayerView.setIdle();
        } else {
            if (i14 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            audioRecordPlayerView.setPlaying();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 registerStateChange$lambda$27(AudioRecordPlayerView audioRecordPlayerView, ProgressData progressData) {
        AbstractC22676k.m65750j(progressData, "<destruct>");
        int iComponent1 = progressData.getCurrentPosition();
        float fComponent2 = progressData.getProgress();
        audioRecordPlayerView.setDuration(ChatUI.getDurationFormatter().format(iComponent1));
        audioRecordPlayerView.setProgress(fComponent2);
        return C23454a0.f92919a;
    }

    private final void resetCurrentAttachments() {
        List<Attachment> list = this.audioAttachments;
        if (list == null) {
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[resetCurrentAttachments] no args", null);
        }
        AudioPlayer audioPlayer = ChatClient.INSTANCE.instance().getAudioPlayer();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int audioHash = AudioHashKt.getAudioHash((Attachment) it.next());
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8295h(audioHash, "[resetCurrentAttachments] audioHash: "), null);
            }
            audioPlayer.resetAudio(audioHash);
        }
    }

    public final AttachmentClickListener getAttachmentClickListener() {
        return this.attachmentClickListener;
    }

    public final AttachmentLongClickListener getAttachmentLongClickListener() {
        return this.attachmentLongClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC1638x lifecycle;
        AudioRecordPlayerView audioRecordPlayerView;
        Integer audioHash$stream_chat_android_ui_components_release;
        super.onAttachedToWindow();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            List<Attachment> list = this.audioAttachments;
            interfaceC2344j.log(enumC2341g, str, "[onAttachedToWindow] audioAttachments.size: " + (list != null ? Integer.valueOf(list.size()) : null), null);
        }
        AudioPlayer audioPlayer = ChatClient.INSTANCE.instance().getAudioPlayer();
        List<Attachment> list2 = this.audioAttachments;
        if (list2 == null) {
            return;
        }
        List<Attachment> list3 = list2;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(AudioHashKt.getAudioHash((Attachment) it.next())));
        }
        HashSet hashSet = new HashSet(AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 12)));
        AbstractC25265s.m74087A1(arrayList, hashSet);
        int i13 = 0;
        while (true) {
            if (!(i13 < getChildCount())) {
                InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(this);
                if (interfaceC1585g0M5017g == null || (lifecycle = interfaceC1585g0M5017g.getLifecycle()) == null) {
                    return;
                }
                lifecycle.mo4986a(this.pauseAudioPlayerListener);
                return;
            }
            int i14 = i13 + 1;
            View childAt = getChildAt(i13);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if ((childAt instanceof AudioRecordPlayerView) && (audioHash$stream_chat_android_ui_components_release = (audioRecordPlayerView = (AudioRecordPlayerView) childAt).getAudioHash()) != null) {
                int iIntValue = audioHash$stream_chat_android_ui_components_release.intValue();
                if (hashSet.contains(audioHash$stream_chat_android_ui_components_release)) {
                    registerStateChange(audioPlayer, audioRecordPlayerView, iIntValue);
                    C2345k logger2 = getLogger();
                    InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                    String str2 = logger2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                        logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8296i(iIntValue, "[onAttachedToWindow] restored (audioHash: ", ")"), null);
                    }
                }
            }
            i13 = i14;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC1638x lifecycle;
        super.onDetachedFromWindow();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onDetachedFromWindow] no args", null);
        }
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(this);
        if (interfaceC1585g0M5017g == null || (lifecycle = interfaceC1585g0M5017g.getLifecycle()) == null) {
            return;
        }
        lifecycle.mo4988d(this.pauseAudioPlayerListener);
    }

    public final void setAttachmentClickListener(AttachmentClickListener attachmentClickListener) {
        this.attachmentClickListener = attachmentClickListener;
    }

    public final void setAttachmentLongClickListener(AttachmentLongClickListener attachmentLongClickListener) {
        this.attachmentLongClickListener = attachmentLongClickListener;
    }

    public final void setStyle(AudioRecordPlayerViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        C16907r0 c16907r0 = new C16907r0(this);
        while (c16907r0.hasNext()) {
            View view = (View) c16907r0.next();
            if (view instanceof AudioRecordPlayerView) {
                ((AudioRecordPlayerView) view).setStyle(style);
            }
        }
    }

    public final void showAudioAttachments(List<Attachment> attachments) {
        AbstractC22676k.m65750j(attachments, "attachments");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(attachments.size(), "[showAudioAttachments] attachments.size: "), null);
        }
        resetCurrentAttachments();
        removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (AttachmentUtilsKt.isAudioRecording((Attachment) obj)) {
                arrayList.add(obj);
            }
        }
        this.audioAttachments = arrayList;
        int i13 = 0;
        for (Object obj2 : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            addAttachmentPlayerView(i13, (Attachment) obj2);
            i13 = i14;
        }
    }

    public final void unbind() {
        List<Attachment> list = this.audioAttachments;
        if (list != null) {
            List<Attachment> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(AudioHashKt.getAudioHash((Attachment) it.next())));
            }
            ChatClient.INSTANCE.instance().getAudioPlayer().removeAudios(arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordingAttachmentsGroupView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        setPadding(IntKt.dpToPx(2), IntKt.dpToPx(0), IntKt.dpToPx(2), IntKt.dpToPx(2));
        this.pauseAudioPlayerListener = new AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1();
        this.logger = AbstractC1772c1.m5382S(this, "AudioRecAttachGroupView");
        this.extractor = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C19773d(this, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordingAttachmentsGroupView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        setPadding(IntKt.dpToPx(2), IntKt.dpToPx(0), IntKt.dpToPx(2), IntKt.dpToPx(2));
        this.pauseAudioPlayerListener = new AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1();
        this.logger = AbstractC1772c1.m5382S(this, "AudioRecAttachGroupView");
        this.extractor = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C19773d(this, 0));
    }
}
