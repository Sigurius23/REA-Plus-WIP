package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.extensions.FloatExtensionsKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiAudioRecordPlayerBinding;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import java.util.List;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0015J\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010!J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0(¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0(¢\u0006\u0004\b,\u0010+J/\u00100\u001a\u00020\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0(2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0.¢\u0006\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006D"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "style", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V", "", AttachmentExtensionsKt.EXTRA_DURATION, "setTotalDuration", "(Ljava/lang/String;)V", "", "", "waveBars", "setWaveBars", "(Ljava/util/List;)V", "setDuration", "", NotificationCompat.CATEGORY_PROGRESS, "setProgress", "(D)V", "setLoading", "()V", "setPlaying", "setIdle", "setPaused", "speed", "setSpeedText", "(F)V", "Lkotlin/Function0;", "listener", "setOnPlayButtonClickListener", "(Lc93/a;)V", "setOnSpeedButtonClickListener", "startDrag", "Lkotlin/Function1;", "stopDrag", "setOnSeekbarMoveListeners", "(Lc93/a;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "totalDuration", "Ljava/lang/String;", "audioHash", "Ljava/lang/Integer;", "getAudioHash$stream_chat_android_ui_components_release", "()Ljava/lang/Integer;", "setAudioHash$stream_chat_android_ui_components_release", "(Ljava/lang/Integer;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioRecordPlayerView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74613w = 0;
    private Integer audioHash;
    private StreamUiAudioRecordPlayerBinding binding;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private AudioRecordPlayerViewStyle style;
    private String totalDuration;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioRecordPlayerView(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void init(Context context, AttributeSet attrs) {
        this.binding = StreamUiAudioRecordPlayerBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        setStyle(AudioRecordPlayerViewStyle.INSTANCE.invoke$stream_chat_android_ui_components_release(context, attrs));
    }

    /* JADX INFO: renamed from: getAudioHash$stream_chat_android_ui_components_release, reason: from getter */
    public final Integer getAudioHash() {
        return this.audioHash;
    }

    public final void setAudioHash$stream_chat_android_ui_components_release(Integer num) {
        this.audioHash = num;
    }

    public final void setDuration(String duration) {
        AbstractC22676k.m65750j(duration, "duration");
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        AppCompatTextView appCompatTextView = streamUiAudioRecordPlayerBinding.duration;
        appCompatTextView.setText(duration);
        appCompatTextView.setVisibility(0);
    }

    public final void setIdle() {
        String str = this.totalDuration;
        if (str != null) {
            setDuration(str);
        }
        setProgress(0.0d);
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ProgressBar progressBar = streamUiAudioRecordPlayerBinding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(8);
        AppCompatImageButton playButton = streamUiAudioRecordPlayerBinding.playButton;
        AbstractC22676k.m65749i(playButton, "playButton");
        playButton.setVisibility(0);
        AppCompatImageButton appCompatImageButton = streamUiAudioRecordPlayerBinding.playButton;
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = this.style;
        if (audioRecordPlayerViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        appCompatImageButton.setImageDrawable(audioRecordPlayerViewStyle.getTintedPlayIconDrawable());
        AppCompatTextView audioSpeedButton = streamUiAudioRecordPlayerBinding.audioSpeedButton;
        AbstractC22676k.m65749i(audioSpeedButton, "audioSpeedButton");
        audioSpeedButton.setVisibility(8);
        AppCompatImageView audioFileIcon = streamUiAudioRecordPlayerBinding.audioFileIcon;
        AbstractC22676k.m65749i(audioFileIcon, "audioFileIcon");
        audioFileIcon.setVisibility(0);
    }

    public final void setLoading() {
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ProgressBar progressBar = streamUiAudioRecordPlayerBinding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(0);
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding2 = this.binding;
        if (streamUiAudioRecordPlayerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        AppCompatImageButton playButton = streamUiAudioRecordPlayerBinding2.playButton;
        AbstractC22676k.m65749i(playButton, "playButton");
        playButton.setVisibility(8);
    }

    public final void setOnPlayButtonClickListener(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding != null) {
            streamUiAudioRecordPlayerBinding.playButton.setOnClickListener(new ViewOnClickListenerC19772c(listener, 0));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setOnSeekbarMoveListeners(InterfaceC4339a startDrag, Function1 stopDrag) {
        AbstractC22676k.m65750j(startDrag, "startDrag");
        AbstractC22676k.m65750j(stopDrag, "stopDrag");
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        AudioWavesSeekBar audioWavesSeekBar = streamUiAudioRecordPlayerBinding.audioSeekBar;
        audioWavesSeekBar.setOnStartDragListener$stream_chat_android_ui_components_release(startDrag);
        audioWavesSeekBar.setOnEndDragListener$stream_chat_android_ui_components_release(stopDrag);
    }

    public final void setOnSpeedButtonClickListener(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding != null) {
            streamUiAudioRecordPlayerBinding.audioSpeedButton.setOnClickListener(new ViewOnClickListenerC19772c(listener, 1));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setPaused() {
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ProgressBar progressBar = streamUiAudioRecordPlayerBinding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(8);
        AppCompatImageButton playButton = streamUiAudioRecordPlayerBinding.playButton;
        AbstractC22676k.m65749i(playButton, "playButton");
        playButton.setVisibility(0);
        AppCompatImageButton appCompatImageButton = streamUiAudioRecordPlayerBinding.playButton;
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = this.style;
        if (audioRecordPlayerViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        appCompatImageButton.setImageDrawable(audioRecordPlayerViewStyle.getTintedPlayIconDrawable());
        AppCompatTextView audioSpeedButton = streamUiAudioRecordPlayerBinding.audioSpeedButton;
        AbstractC22676k.m65749i(audioSpeedButton, "audioSpeedButton");
        audioSpeedButton.setVisibility(0);
        AppCompatImageView audioFileIcon = streamUiAudioRecordPlayerBinding.audioFileIcon;
        AbstractC22676k.m65749i(audioFileIcon, "audioFileIcon");
        audioFileIcon.setVisibility(8);
    }

    public final void setPlaying() {
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ProgressBar progressBar = streamUiAudioRecordPlayerBinding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(8);
        AppCompatImageButton playButton = streamUiAudioRecordPlayerBinding.playButton;
        AbstractC22676k.m65749i(playButton, "playButton");
        playButton.setVisibility(0);
        AppCompatImageButton appCompatImageButton = streamUiAudioRecordPlayerBinding.playButton;
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = this.style;
        if (audioRecordPlayerViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        appCompatImageButton.setImageDrawable(audioRecordPlayerViewStyle.getTintedPauseIconDrawable());
        AppCompatTextView audioSpeedButton = streamUiAudioRecordPlayerBinding.audioSpeedButton;
        AbstractC22676k.m65749i(audioSpeedButton, "audioSpeedButton");
        audioSpeedButton.setVisibility(0);
        AppCompatImageView audioFileIcon = streamUiAudioRecordPlayerBinding.audioFileIcon;
        AbstractC22676k.m65749i(audioFileIcon, "audioFileIcon");
        audioFileIcon.setVisibility(8);
    }

    public final void setProgress(double progress) {
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding != null) {
            streamUiAudioRecordPlayerBinding.audioSeekBar.setProgress$stream_chat_android_ui_components_release((float) (progress * ((double) 100)));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setSpeedText(float speed) {
        String strM8295h;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[setSpeedText] speed: " + speed, null);
        }
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        AppCompatTextView appCompatTextView = streamUiAudioRecordPlayerBinding.audioSpeedButton;
        if (FloatExtensionsKt.isInt(speed)) {
            strM8295h = AbstractC2875y.m8295h((int) speed, "x");
        } else {
            strM8295h = "x" + speed;
        }
        appCompatTextView.setText(strM8295h);
    }

    public final void setStyle(final AudioRecordPlayerViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        setOrientation(0);
        setGravity(16);
        setBackground(style.getTintedBackgroundDrawable());
        ViewKt.setPaddingCompat(this, style.getPadding());
        if (isAttachedToWindow()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = style.getHeight();
            setLayoutParams(layoutParams);
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.height = style.getHeight();
                    view.setLayoutParams(layoutParams2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                }
            });
        }
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout playbackProgressContainer = streamUiAudioRecordPlayerBinding.playbackProgressContainer;
        AbstractC22676k.m65749i(playbackProgressContainer, "playbackProgressContainer");
        ViewGroup.LayoutParams layoutParams2 = playbackProgressContainer.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = style.getPlaybackProgressContainerSize().getWidth();
        layoutParams2.height = style.getPlaybackProgressContainerSize().getHeight();
        playbackProgressContainer.setLayoutParams(layoutParams2);
        streamUiAudioRecordPlayerBinding.progressBar.setIndeterminateDrawable(style.getTintedProgressBarDrawable());
        ProgressBar progressBar = streamUiAudioRecordPlayerBinding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = style.getProgressBarSize().getWidth();
        layoutParams3.height = style.getProgressBarSize().getHeight();
        progressBar.setLayoutParams(layoutParams3);
        AppCompatImageButton playButton = streamUiAudioRecordPlayerBinding.playButton;
        AbstractC22676k.m65749i(playButton, "playButton");
        ViewKt.setPaddingCompat(playButton, style.getPlaybackButtonPadding());
        streamUiAudioRecordPlayerBinding.playButton.setImageDrawable(style.getTintedPlayIconDrawable());
        streamUiAudioRecordPlayerBinding.playButton.setBackgroundDrawable(style.getTintedPlaybackButtonBackground());
        streamUiAudioRecordPlayerBinding.playButton.setElevation(style.getPlaybackButtonElevation());
        AppCompatImageButton playButton2 = streamUiAudioRecordPlayerBinding.playButton;
        AbstractC22676k.m65749i(playButton2, "playButton");
        ViewGroup.LayoutParams layoutParams4 = playButton2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams4.width = style.getPlaybackButtonSize().getWidth();
        layoutParams4.height = style.getPlaybackButtonSize().getHeight();
        playButton2.setLayoutParams(layoutParams4);
        AppCompatTextView duration = streamUiAudioRecordPlayerBinding.duration;
        AbstractC22676k.m65749i(duration, "duration");
        TextStyleKt.setTextStyle(duration, style.getDurationTextStyle());
        AppCompatTextView duration2 = streamUiAudioRecordPlayerBinding.duration;
        AbstractC22676k.m65749i(duration2, "duration");
        ViewGroup.LayoutParams layoutParams5 = duration2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams.width = style.getDurationTextViewSize().getWidth();
        marginLayoutParams.height = style.getDurationTextViewSize().getHeight();
        marginLayoutParams.setMarginStart(style.getDurationTextMarginStart());
        duration2.setLayoutParams(marginLayoutParams);
        streamUiAudioRecordPlayerBinding.audioSeekBar.setPlayedWaveBarColor(style.getWaveBarColorPlayed());
        streamUiAudioRecordPlayerBinding.audioSeekBar.setFutureWaveBarColor(style.getWaveBarColorFuture());
        streamUiAudioRecordPlayerBinding.audioSeekBar.setScrubberDrawable(style.getTintedScrubberDrawable());
        streamUiAudioRecordPlayerBinding.audioSeekBar.setScrubberWidth(style.getScrubberWidthDefault(), style.getScrubberWidthPressed());
        AudioWavesSeekBar audioSeekBar = streamUiAudioRecordPlayerBinding.audioSeekBar;
        AbstractC22676k.m65749i(audioSeekBar, "audioSeekBar");
        ViewGroup.LayoutParams layoutParams6 = audioSeekBar.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams2.height = style.getWaveBarHeight();
        marginLayoutParams2.setMarginStart(style.getWaveBarMarginStart());
        audioSeekBar.setLayoutParams(marginLayoutParams2);
        FrameLayout audioFileIconContainer = streamUiAudioRecordPlayerBinding.audioFileIconContainer;
        AbstractC22676k.m65749i(audioFileIconContainer, "audioFileIconContainer");
        ViewGroup.LayoutParams layoutParams7 = audioFileIconContainer.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams7.width = style.getFileIconContainerWidth();
        audioFileIconContainer.setLayoutParams(layoutParams7);
        FrameLayout audioFileIconContainer2 = streamUiAudioRecordPlayerBinding.audioFileIconContainer;
        AbstractC22676k.m65749i(audioFileIconContainer2, "audioFileIconContainer");
        audioFileIconContainer2.setVisibility(style.isFileIconContainerVisible() ? 0 : 8);
        streamUiAudioRecordPlayerBinding.audioFileIcon.setImageDrawable(style.getAudioFileIconDrawable());
        AppCompatTextView audioSpeedButton = streamUiAudioRecordPlayerBinding.audioSpeedButton;
        AbstractC22676k.m65749i(audioSpeedButton, "audioSpeedButton");
        TextStyleKt.setTextStyle(audioSpeedButton, style.getSpeedButtonTextStyle());
        streamUiAudioRecordPlayerBinding.audioSpeedButton.setBackground(style.getTintedSpeedButtonBackground());
        streamUiAudioRecordPlayerBinding.audioSpeedButton.setElevation(style.getSpeedButtonElevation());
        AppCompatTextView audioSpeedButton2 = streamUiAudioRecordPlayerBinding.audioSpeedButton;
        AbstractC22676k.m65749i(audioSpeedButton2, "audioSpeedButton");
        ViewGroup.LayoutParams layoutParams8 = audioSpeedButton2.getLayoutParams();
        if (layoutParams8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams8.width = style.getSpeedButtonSize().getWidth();
        layoutParams8.height = style.getSpeedButtonSize().getHeight();
        audioSpeedButton2.setLayoutParams(layoutParams8);
    }

    public final void setTotalDuration(String duration) {
        AbstractC22676k.m65750j(duration, "duration");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[setTotalDuration] duration: ".concat(duration), null);
        }
        this.totalDuration = duration;
        setDuration(duration);
    }

    public final void setWaveBars(List<Float> waveBars) {
        AbstractC22676k.m65750j(waveBars, "waveBars");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31998q("[setWaveBars] value: ", waveBars), null);
        }
        StreamUiAudioRecordPlayerBinding streamUiAudioRecordPlayerBinding = this.binding;
        if (streamUiAudioRecordPlayerBinding != null) {
            streamUiAudioRecordPlayerBinding.audioSeekBar.setWaveBars$stream_chat_android_ui_components_release(waveBars);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioRecordPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordPlayerView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "Chat:PlayerView");
        init(context, attributeSet);
    }
}
