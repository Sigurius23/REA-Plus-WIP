package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.capabilities.MessageComposerCapabilitiesKt;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerDefaultLeadingContentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;", "Landroid/widget/FrameLayout;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;", "setBinding", "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "Lkotlin/Function0;", "attachmentsButtonClickListener", "Lc93/a;", "getAttachmentsButtonClickListener", "()Lc93/a;", "setAttachmentsButtonClickListener", "(Lc93/a;)V", "commandsButtonClickListener", "getCommandsButtonClickListener", "setCommandsButtonClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageComposerLeadingContent extends FrameLayout implements MessageComposerLeadingContent {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74569w = 0;
    private InterfaceC4339a attachmentsButtonClickListener;
    protected StreamUiMessageComposerDefaultLeadingContentBinding binding;
    private InterfaceC4339a commandsButtonClickListener;
    protected MessageComposerViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerLeadingContent(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void init() {
        setBinding(StreamUiMessageComposerDefaultLeadingContentBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this));
        final int i13 = 0;
        getBinding().attachmentsButton.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerLeadingContent f74576x;

            {
                this.f74576x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                DefaultMessageComposerLeadingContent defaultMessageComposerLeadingContent = this.f74576x;
                switch (i14) {
                    case 0:
                        int i15 = DefaultMessageComposerLeadingContent.f74569w;
                        InterfaceC4339a attachmentsButtonClickListener = defaultMessageComposerLeadingContent.getAttachmentsButtonClickListener();
                        if (attachmentsButtonClickListener != null) {
                            attachmentsButtonClickListener.invoke();
                        }
                        break;
                    default:
                        int i16 = DefaultMessageComposerLeadingContent.f74569w;
                        InterfaceC4339a commandsButtonClickListener = defaultMessageComposerLeadingContent.getCommandsButtonClickListener();
                        if (commandsButtonClickListener != null) {
                            commandsButtonClickListener.invoke();
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        getBinding().commandsButton.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerLeadingContent f74576x;

            {
                this.f74576x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                DefaultMessageComposerLeadingContent defaultMessageComposerLeadingContent = this.f74576x;
                switch (i15) {
                    case 0:
                        int i16 = DefaultMessageComposerLeadingContent.f74569w;
                        InterfaceC4339a attachmentsButtonClickListener = defaultMessageComposerLeadingContent.getAttachmentsButtonClickListener();
                        if (attachmentsButtonClickListener != null) {
                            attachmentsButtonClickListener.invoke();
                        }
                        break;
                    default:
                        int i17 = DefaultMessageComposerLeadingContent.f74569w;
                        InterfaceC4339a commandsButtonClickListener = defaultMessageComposerLeadingContent.getCommandsButtonClickListener();
                        if (commandsButtonClickListener != null) {
                            commandsButtonClickListener.invoke();
                        }
                        break;
                }
            }
        });
    }

    private static final void init$lambda$0(DefaultMessageComposerLeadingContent defaultMessageComposerLeadingContent, View view) {
        InterfaceC4339a attachmentsButtonClickListener = defaultMessageComposerLeadingContent.getAttachmentsButtonClickListener();
        if (attachmentsButtonClickListener != null) {
            attachmentsButtonClickListener.invoke();
        }
    }

    private static final void init$lambda$1(DefaultMessageComposerLeadingContent defaultMessageComposerLeadingContent, View view) {
        InterfaceC4339a commandsButtonClickListener = defaultMessageComposerLeadingContent.getCommandsButtonClickListener();
        if (commandsButtonClickListener != null) {
            commandsButtonClickListener.invoke();
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void attachContext(MessageComposerContext messageComposerContext) {
        AbstractC22676k.m65750j(messageComposerContext, "messageComposerContext");
        setStyle(messageComposerContext.getStyle());
        ImageView commandsButton = getBinding().commandsButton;
        AbstractC22676k.m65749i(commandsButton, "commandsButton");
        commandsButton.setVisibility(getStyle().getCommandsButtonVisible() ? 0 : 8);
        getBinding().attachmentsButton.setImageDrawable(getStyle().getAttachmentsButtonIconDrawable());
        ImageView attachmentsButton = getBinding().attachmentsButton;
        AbstractC22676k.m65749i(attachmentsButton, "attachmentsButton");
        ViewKt.setBorderlessRipple(attachmentsButton, getStyle().getAttachmentsButtonRippleColor());
        ImageView attachmentsButton2 = getBinding().attachmentsButton;
        AbstractC22676k.m65749i(attachmentsButton2, "attachmentsButton");
        attachmentsButton2.setVisibility(getStyle().getAttachmentsButtonVisible() ? 0 : 8);
        getBinding().commandsButton.setImageDrawable(getStyle().getCommandsButtonIconDrawable());
        ImageView commandsButton2 = getBinding().commandsButton;
        AbstractC22676k.m65749i(commandsButton2, "commandsButton");
        ViewKt.setBorderlessRipple(commandsButton2, getStyle().getCommandsButtonRippleColor());
        ColorStateList attachmentsButtonIconTintList = getStyle().getAttachmentsButtonIconTintList();
        if (attachmentsButtonIconTintList != null) {
            getBinding().attachmentsButton.setImageTintList(attachmentsButtonIconTintList);
        }
        ColorStateList commandsButtonIconTintList = getStyle().getCommandsButtonIconTintList();
        if (commandsButtonIconTintList != null) {
            getBinding().commandsButton.setImageTintList(commandsButtonIconTintList);
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final View findViewByKey(String str) {
        super.findViewByKey(str);
        return null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerLeadingContent
    public InterfaceC4339a getAttachmentsButtonClickListener() {
        return this.attachmentsButtonClickListener;
    }

    public final StreamUiMessageComposerDefaultLeadingContentBinding getBinding() {
        StreamUiMessageComposerDefaultLeadingContentBinding streamUiMessageComposerDefaultLeadingContentBinding = this.binding;
        if (streamUiMessageComposerDefaultLeadingContentBinding != null) {
            return streamUiMessageComposerDefaultLeadingContentBinding;
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerLeadingContent
    public InterfaceC4339a getCommandsButtonClickListener() {
        return this.commandsButtonClickListener;
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
        boolean zCanSendMessage = MessageComposerCapabilitiesKt.canSendMessage(state);
        boolean zCanUploadFile = MessageComposerCapabilitiesKt.canUploadFile(state);
        boolean z4 = state.getInputValue().length() > 0;
        boolean zIsEmpty = state.getAttachments().isEmpty();
        boolean zM125930O = AbstractC39421y.m125930O(state.getInputValue(), "/", false);
        boolean zIsEmpty2 = state.getCommandSuggestions().isEmpty();
        boolean z13 = !zIsEmpty2;
        boolean zIsEmpty3 = state.getMentionSuggestions().isEmpty();
        boolean z14 = state.getAction() instanceof Edit;
        boolean hasCommands = state.getHasCommands();
        boolean z15 = state.getRecording() instanceof RecordingState.Idle;
        View root = getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(z15 ? 0 : 8);
        getBinding().attachmentsButton.setEnabled(!zM125930O && zIsEmpty2 && zIsEmpty3);
        ImageView attachmentsButton = getBinding().attachmentsButton;
        AbstractC22676k.m65749i(attachmentsButton, "attachmentsButton");
        attachmentsButton.setVisibility((getStyle().getAttachmentsButtonVisible() && zCanSendMessage && zCanUploadFile && !z14) ? 0 : 8);
        getBinding().commandsButton.setEnabled(!z4 && zIsEmpty);
        ImageView commandsButton = getBinding().commandsButton;
        AbstractC22676k.m65749i(commandsButton, "commandsButton");
        commandsButton.setVisibility((getStyle().getCommandsButtonVisible() && zCanSendMessage && !z14 && hasCommands) ? 0 : 8);
        getBinding().commandsButton.setSelected(z13);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerLeadingContent
    public void setAttachmentsButtonClickListener(InterfaceC4339a interfaceC4339a) {
        this.attachmentsButtonClickListener = interfaceC4339a;
    }

    public final void setBinding(StreamUiMessageComposerDefaultLeadingContentBinding streamUiMessageComposerDefaultLeadingContentBinding) {
        AbstractC22676k.m65750j(streamUiMessageComposerDefaultLeadingContentBinding, "<set-?>");
        this.binding = streamUiMessageComposerDefaultLeadingContentBinding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerLeadingContent
    public void setCommandsButtonClickListener(InterfaceC4339a interfaceC4339a) {
        this.commandsButtonClickListener = interfaceC4339a;
    }

    public final void setStyle(MessageComposerViewStyle messageComposerViewStyle) {
        AbstractC22676k.m65750j(messageComposerViewStyle, "<set-?>");
        this.style = messageComposerViewStyle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerLeadingContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerLeadingContent(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        init();
    }
}
