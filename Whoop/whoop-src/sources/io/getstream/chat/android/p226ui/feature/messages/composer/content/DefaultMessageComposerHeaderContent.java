package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerDefaultHeaderContentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;", "Landroid/widget/FrameLayout;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;", "setBinding", "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "Lkotlin/Function0;", "dismissActionClickListener", "Lc93/a;", "getDismissActionClickListener", "()Lc93/a;", "setDismissActionClickListener", "(Lc93/a;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageComposerHeaderContent extends FrameLayout implements MessageComposerHeaderContent {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74568w = 0;
    protected StreamUiMessageComposerDefaultHeaderContentBinding binding;
    private InterfaceC4339a dismissActionClickListener;
    protected MessageComposerViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerHeaderContent(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void init() {
        setBinding(StreamUiMessageComposerDefaultHeaderContentBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this));
        getBinding().dismissInputModeButton.setOnClickListener(new ViewOnClickListenerC19712a(this, 2));
    }

    private static final void init$lambda$0(DefaultMessageComposerHeaderContent defaultMessageComposerHeaderContent, View view) {
        InterfaceC4339a dismissActionClickListener = defaultMessageComposerHeaderContent.getDismissActionClickListener();
        if (dismissActionClickListener != null) {
            dismissActionClickListener.invoke();
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void attachContext(MessageComposerContext messageComposerContext) {
        AbstractC22676k.m65750j(messageComposerContext, "messageComposerContext");
        setStyle(messageComposerContext.getStyle());
        getBinding().dismissInputModeButton.setImageDrawable(getStyle().getDismissModeIconDrawable());
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final View findViewByKey(String str) {
        super.findViewByKey(str);
        return null;
    }

    public final StreamUiMessageComposerDefaultHeaderContentBinding getBinding() {
        StreamUiMessageComposerDefaultHeaderContentBinding streamUiMessageComposerDefaultHeaderContentBinding = this.binding;
        if (streamUiMessageComposerDefaultHeaderContentBinding != null) {
            return streamUiMessageComposerDefaultHeaderContentBinding;
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerHeaderContent
    public InterfaceC4339a getDismissActionClickListener() {
        return this.dismissActionClickListener;
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
        boolean z4 = state.getRecording() instanceof RecordingState.Idle;
        View root = getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(z4 ? 0 : 8);
        MessageAction action = state.getAction();
        if (action instanceof Reply) {
            FrameLayout inputModeHeaderContainer = getBinding().inputModeHeaderContainer;
            AbstractC22676k.m65749i(inputModeHeaderContainer, "inputModeHeaderContainer");
            inputModeHeaderContainer.setVisibility(0);
            getBinding().inputModeTextView.setText(getStyle().getReplyModeText());
            getBinding().inputModeImageView.setImageDrawable(getStyle().getReplyModeIconDrawable());
            return;
        }
        if (!(action instanceof Edit)) {
            FrameLayout inputModeHeaderContainer2 = getBinding().inputModeHeaderContainer;
            AbstractC22676k.m65749i(inputModeHeaderContainer2, "inputModeHeaderContainer");
            inputModeHeaderContainer2.setVisibility(8);
        } else {
            FrameLayout inputModeHeaderContainer3 = getBinding().inputModeHeaderContainer;
            AbstractC22676k.m65749i(inputModeHeaderContainer3, "inputModeHeaderContainer");
            inputModeHeaderContainer3.setVisibility(0);
            getBinding().inputModeTextView.setText(getStyle().getEditModeText());
            getBinding().inputModeImageView.setImageDrawable(getStyle().getEditModeIconDrawable());
        }
    }

    public final void setBinding(StreamUiMessageComposerDefaultHeaderContentBinding streamUiMessageComposerDefaultHeaderContentBinding) {
        AbstractC22676k.m65750j(streamUiMessageComposerDefaultHeaderContentBinding, "<set-?>");
        this.binding = streamUiMessageComposerDefaultHeaderContentBinding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerHeaderContent
    public void setDismissActionClickListener(InterfaceC4339a interfaceC4339a) {
        this.dismissActionClickListener = interfaceC4339a;
    }

    public final void setStyle(MessageComposerViewStyle messageComposerViewStyle) {
        AbstractC22676k.m65750j(messageComposerViewStyle, "<set-?>");
        this.style = messageComposerViewStyle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerHeaderContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerHeaderContent(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        init();
    }
}
