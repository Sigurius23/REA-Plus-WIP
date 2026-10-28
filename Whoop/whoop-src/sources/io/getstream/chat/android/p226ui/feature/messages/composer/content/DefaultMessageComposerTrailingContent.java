package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.models.AppSettings;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.capabilities.MessageComposerCapabilitiesKt;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerDefaultTrailingContentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R0\u00105\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;", "Landroid/widget/FrameLayout;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "", "key", "Landroid/view/View;", "findViewByKey", "(Ljava/lang/String;)Landroid/view/View;", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultTrailingContentBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultTrailingContentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultTrailingContentBinding;", "setBinding", "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultTrailingContentBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "Lkotlin/Function0;", "sendMessageButtonClickListener", "Lc93/a;", "getSendMessageButtonClickListener", "()Lc93/a;", "setSendMessageButtonClickListener", "(Lc93/a;)V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "recordAudioButtonTouchListener", "Lkotlin/jvm/functions/Function1;", "getRecordAudioButtonTouchListener", "()Lkotlin/jvm/functions/Function1;", "setRecordAudioButtonTouchListener", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageComposerTrailingContent extends FrameLayout implements MessageComposerTrailingContent {
    private static final String AAC_EXTENSION = "aac";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String RECORD_AUDIO_TAG = "record_audio";
    protected StreamUiMessageComposerDefaultTrailingContentBinding binding;
    private Function1 recordAudioButtonTouchListener;
    private InterfaceC4339a sendMessageButtonClickListener;
    protected MessageComposerViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent$Companion;", "", "<init>", "()V", "RECORD_AUDIO_TAG", "", "AAC_EXTENSION", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerTrailingContent(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void init() {
        setBinding(StreamUiMessageComposerDefaultTrailingContentBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this));
        getBinding().sendMessageButton.setOnClickListener(new ViewOnClickListenerC19712a(this, 3));
        getBinding().recordAudioButton.setOnTouchListener(new View.OnTouchListener() { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DefaultMessageComposerTrailingContent.init$lambda$1(this.f74582w, view, motionEvent);
            }
        });
        getBinding().recordAudioButton.setTag(RECORD_AUDIO_TAG);
    }

    private static final void init$lambda$0(DefaultMessageComposerTrailingContent defaultMessageComposerTrailingContent, View view) {
        InterfaceC4339a sendMessageButtonClickListener = defaultMessageComposerTrailingContent.getSendMessageButtonClickListener();
        if (sendMessageButtonClickListener != null) {
            sendMessageButtonClickListener.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$1(DefaultMessageComposerTrailingContent defaultMessageComposerTrailingContent, View view, MotionEvent motionEvent) {
        Function1 recordAudioButtonTouchListener = defaultMessageComposerTrailingContent.getRecordAudioButtonTouchListener();
        if (recordAudioButtonTouchListener == null) {
            return false;
        }
        AbstractC22676k.m65747g(motionEvent);
        return ((Boolean) recordAudioButtonTouchListener.invoke(motionEvent)).booleanValue();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void attachContext(MessageComposerContext messageComposerContext) {
        AbstractC22676k.m65750j(messageComposerContext, "messageComposerContext");
        setStyle(messageComposerContext.getStyle());
        getBinding().sendMessageButton.setImageDrawable(getStyle().getSendMessageButtonIconDrawable());
        ImageView sendMessageButton = getBinding().sendMessageButton;
        AbstractC22676k.m65749i(sendMessageButton, "sendMessageButton");
        ViewGroup.LayoutParams layoutParams = sendMessageButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = getStyle().getSendMessageButtonWidth();
        layoutParams.height = getStyle().getSendMessageButtonHeight();
        sendMessageButton.setLayoutParams(layoutParams);
        getBinding().sendMessageButton.setPadding(getStyle().getSendMessageButtonPadding(), getStyle().getSendMessageButtonPadding(), getStyle().getSendMessageButtonPadding(), getStyle().getSendMessageButtonPadding());
        ColorStateList sendMessageButtonIconTintList = getStyle().getSendMessageButtonIconTintList();
        if (sendMessageButtonIconTintList != null) {
            getBinding().sendMessageButton.setImageTintList(sendMessageButtonIconTintList);
        }
        getBinding().recordAudioButton.setImageDrawable(getStyle().getAudioRecordingButtonIconDrawable());
        ColorStateList audioRecordingButtonIconTintList = getStyle().getAudioRecordingButtonIconTintList();
        if (audioRecordingButtonIconTintList != null) {
            getBinding().recordAudioButton.setImageTintList(audioRecordingButtonIconTintList);
        }
        ImageView recordAudioButton = getBinding().recordAudioButton;
        AbstractC22676k.m65749i(recordAudioButton, "recordAudioButton");
        ViewGroup.LayoutParams layoutParams2 = recordAudioButton.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = getStyle().getAudioRecordingButtonWidth();
        layoutParams2.height = getStyle().getAudioRecordingButtonHeight();
        recordAudioButton.setLayoutParams(layoutParams2);
        getBinding().recordAudioButton.setPadding(getStyle().getAudioRecordingButtonPadding(), getStyle().getAudioRecordingButtonPadding(), getStyle().getAudioRecordingButtonPadding(), getStyle().getAudioRecordingButtonPadding());
        TextView cooldownBadgeTextView = getBinding().cooldownBadgeTextView;
        AbstractC22676k.m65749i(cooldownBadgeTextView, "cooldownBadgeTextView");
        TextStyleKt.setTextStyle(cooldownBadgeTextView, getStyle().getCooldownTimerTextStyle());
        getBinding().cooldownBadgeTextView.setBackground(getStyle().getCooldownTimerBackgroundDrawable());
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final View findViewByKey(String key) {
        AbstractC22676k.m65750j(key, "key");
        if (key.equals("record_audio_button")) {
            return getBinding().recordAudioButton;
        }
        return null;
    }

    public final StreamUiMessageComposerDefaultTrailingContentBinding getBinding() {
        StreamUiMessageComposerDefaultTrailingContentBinding streamUiMessageComposerDefaultTrailingContentBinding = this.binding;
        if (streamUiMessageComposerDefaultTrailingContentBinding != null) {
            return streamUiMessageComposerDefaultTrailingContentBinding;
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerTrailingContent
    public Function1 getRecordAudioButtonTouchListener() {
        return this.recordAudioButtonTouchListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerTrailingContent
    public InterfaceC4339a getSendMessageButtonClickListener() {
        return this.sendMessageButtonClickListener;
    }

    public final MessageComposerViewStyle getStyle() {
        MessageComposerViewStyle messageComposerViewStyle = this.style;
        if (messageComposerViewStyle != null) {
            return messageComposerViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void renderState(MessageComposerState state) {
        AbstractC22676k.m65750j(state, "state");
        AppSettings appSettings = ChatClient.INSTANCE.instance().getAppSettings();
        List<String> blockedMimeTypes = appSettings.getApp().getFileUploadConfig().getBlockedMimeTypes();
        List<String> blockedFileExtensions = appSettings.getApp().getFileUploadConfig().getBlockedFileExtensions();
        boolean zCanSendMessage = MessageComposerCapabilitiesKt.canSendMessage(state);
        boolean zCanUploadFile = MessageComposerCapabilitiesKt.canUploadFile(state);
        boolean z4 = true;
        boolean z13 = (blockedMimeTypes.contains("audio") || blockedFileExtensions.contains(AAC_EXTENSION)) ? false : true;
        boolean z14 = state.getInputValue().length() > 0;
        boolean zIsEmpty = state.getAttachments().isEmpty();
        boolean zIsEmpty2 = state.getValidationErrors().isEmpty();
        boolean z15 = state.getAction() instanceof Edit;
        int coolDownTime = state.getCoolDownTime();
        boolean z16 = (z14 || !zIsEmpty) && zIsEmpty2;
        boolean z17 = state.getRecording() instanceof RecordingState.Idle;
        View root = getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(z17 ? 0 : 8);
        StreamUiMessageComposerDefaultTrailingContentBinding binding = getBinding();
        if (coolDownTime > 0 && !z15) {
            TextView cooldownBadgeTextView = binding.cooldownBadgeTextView;
            AbstractC22676k.m65749i(cooldownBadgeTextView, "cooldownBadgeTextView");
            cooldownBadgeTextView.setVisibility(0);
            binding.cooldownBadgeTextView.setText(String.valueOf(coolDownTime));
            ImageView sendMessageButton = binding.sendMessageButton;
            AbstractC22676k.m65749i(sendMessageButton, "sendMessageButton");
            sendMessageButton.setVisibility(8);
            ImageView recordAudioButton = binding.recordAudioButton;
            AbstractC22676k.m65749i(recordAudioButton, "recordAudioButton");
            recordAudioButton.setVisibility(8);
            return;
        }
        TextView cooldownBadgeTextView2 = binding.cooldownBadgeTextView;
        AbstractC22676k.m65749i(cooldownBadgeTextView2, "cooldownBadgeTextView");
        cooldownBadgeTextView2.setVisibility(8);
        ImageView sendMessageButton2 = binding.sendMessageButton;
        AbstractC22676k.m65749i(sendMessageButton2, "sendMessageButton");
        sendMessageButton2.setVisibility(!getStyle().getAudioRecordingButtonPreferred() || z14 || !zIsEmpty || z15 ? 0 : 8);
        binding.sendMessageButton.setEnabled(getStyle().getSendMessageButtonEnabled() && zCanSendMessage && z16);
        binding.recordAudioButton.setEnabled(getStyle().getSendMessageButtonEnabled() && zCanSendMessage && z13 && zCanUploadFile);
        ImageView recordAudioButton2 = binding.recordAudioButton;
        AbstractC22676k.m65749i(recordAudioButton2, "recordAudioButton");
        if (!getStyle().getAudioRecordingButtonVisible() || (!getStyle().getAudioRecordingButtonPreferred() ? !zCanUploadFile || !z13 || !zCanSendMessage || z15 : !zCanUploadFile || !z13 || !zCanSendMessage || z15 || z14)) {
            z4 = false;
        }
        recordAudioButton2.setVisibility(z4 ? 0 : 8);
    }

    public final void setBinding(StreamUiMessageComposerDefaultTrailingContentBinding streamUiMessageComposerDefaultTrailingContentBinding) {
        AbstractC22676k.m65750j(streamUiMessageComposerDefaultTrailingContentBinding, "<set-?>");
        this.binding = streamUiMessageComposerDefaultTrailingContentBinding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerTrailingContent
    public void setRecordAudioButtonTouchListener(Function1 function1) {
        this.recordAudioButtonTouchListener = function1;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerTrailingContent
    public void setSendMessageButtonClickListener(InterfaceC4339a interfaceC4339a) {
        this.sendMessageButtonClickListener = interfaceC4339a;
    }

    public final void setStyle(MessageComposerViewStyle messageComposerViewStyle) {
        AbstractC22676k.m65750j(messageComposerViewStyle, "<set-?>");
        this.style = messageComposerViewStyle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerTrailingContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerTrailingContent(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        init();
    }
}
