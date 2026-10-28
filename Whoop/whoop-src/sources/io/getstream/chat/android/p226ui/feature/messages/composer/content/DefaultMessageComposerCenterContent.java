package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.RecyclerView;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.capabilities.MessageComposerCapabilitiesKt;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerDefaultCenterContentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.MessageReplyView;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J5\u0010\u001d\u001a\u00028\u0000\"\u0012\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00010\u0016*\u00020\u0017\"\b\b\u0001\u0010\u001a*\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0013R\"\u0010%\u001a\u00020$8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u001c\u001a\u00020\u001b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00178\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R0\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R0\u0010?\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=¨\u0006B"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;", "Landroid/widget/FrameLayout;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "()V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderTextInputState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "renderReplyState", "renderAttachmentState", "Landroidx/recyclerview/widget/i1;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;", "T", "Landroidx/recyclerview/widget/o2;", "VH", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "buildAdapter", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Landroidx/recyclerview/widget/i1;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "renderState", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;", "setBinding", "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "attachmentsAdapter", "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;", "getAttachmentsAdapter", "()Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;", "setAttachmentsAdapter", "(Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;)V", "Lkotlin/Function1;", "", "textInputChangeListener", "Lkotlin/jvm/functions/Function1;", "getTextInputChangeListener", "()Lkotlin/jvm/functions/Function1;", "setTextInputChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/models/Attachment;", "attachmentRemovalListener", "getAttachmentRemovalListener", "setAttachmentRemovalListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageComposerCenterContent extends FrameLayout implements MessageComposerCenterContent {
    private Function1 attachmentRemovalListener;
    protected AttachmentAdapter attachmentsAdapter;
    protected StreamUiMessageComposerDefaultCenterContentBinding binding;
    protected MessageComposerViewStyle style;
    private Function1 textInputChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerCenterContent(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 buildAdapter$lambda$1(DefaultMessageComposerCenterContent defaultMessageComposerCenterContent, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        Function1 attachmentRemovalListener = defaultMessageComposerCenterContent.getAttachmentRemovalListener();
        if (attachmentRemovalListener != null) {
            attachmentRemovalListener.invoke(attachment);
        }
        return C23454a0.f92919a;
    }

    private final void init() {
        setBinding(StreamUiMessageComposerDefaultCenterContentBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this));
        AppCompatEditText messageEditText = getBinding().messageEditText;
        AbstractC22676k.m65749i(messageEditText, "messageEditText");
        messageEditText.addTextChangedListener(new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.DefaultMessageComposerCenterContent$init$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable s13) {
                String string;
                Function1 textInputChangeListener = this.this$0.getTextInputChangeListener();
                if (textInputChangeListener != null) {
                    if (s13 == null || (string = s13.toString()) == null) {
                        string = "";
                    }
                    textInputChangeListener.invoke(string);
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    private final void renderAttachmentState(MessageComposerState state) {
        RecyclerView attachmentsRecyclerView = getBinding().attachmentsRecyclerView;
        AbstractC22676k.m65749i(attachmentsRecyclerView, "attachmentsRecyclerView");
        attachmentsRecyclerView.setVisibility(!state.getAttachments().isEmpty() ? 0 : 8);
        getAttachmentsAdapter().setAttachments(state.getAttachments());
    }

    private final void renderReplyState(MessageComposerState state) {
        if (getStyle().getMessageInputShowReplyView()) {
            MessageAction action = state.getAction();
            if (!(action instanceof Reply)) {
                MessageReplyView messageReplyView = getBinding().messageReplyView;
                AbstractC22676k.m65749i(messageReplyView, "messageReplyView");
                messageReplyView.setVisibility(8);
                return;
            }
            Message message = ((Reply) action).getMessage();
            MessageReplyView messageReplyView2 = getBinding().messageReplyView;
            User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
            messageReplyView2.setMessage(message, AbstractC22676k.m65745e(currentUser != null ? currentUser.getId() : null, message.getUser().getId()), getStyle().toMessageReplyStyle());
            MessageReplyView messageReplyView3 = getBinding().messageReplyView;
            AbstractC22676k.m65749i(messageReplyView3, "messageReplyView");
            messageReplyView3.setVisibility(0);
        }
    }

    private final void renderTextInputState(MessageComposerState state) {
        AppCompatEditText appCompatEditText = getBinding().messageEditText;
        if (!AbstractC22676k.m65745e(state.getInputValue(), String.valueOf(appCompatEditText.getText()))) {
            appCompatEditText.setText(state.getInputValue());
            appCompatEditText.setSelection(appCompatEditText.length());
        }
        if (MessageComposerCapabilitiesKt.canSendMessage(state)) {
            getBinding().messageEditText.setEnabled(true);
            getBinding().messageEditText.setHint(getStyle().getMessageInputTextStyle().getHint());
            getBinding().messageEditText.setMaxLines(getStyle().getMessageInputMaxLines());
        } else {
            getBinding().messageEditText.setEnabled(false);
            getBinding().messageEditText.setHint(getStyle().getMessageInputCannotSendHintText());
            getBinding().messageEditText.setMaxLines(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void attachContext(MessageComposerContext messageComposerContext) {
        Drawable messageInputCursorDrawable;
        AbstractC22676k.m65750j(messageComposerContext, "messageComposerContext");
        setStyle(messageComposerContext.getStyle());
        AbstractC1692i1 abstractC1692i1BuildAdapter = buildAdapter(messageComposerContext.getStyle());
        setAttachmentsAdapter((AttachmentAdapter) abstractC1692i1BuildAdapter);
        getBinding().attachmentsRecyclerView.setAdapter(abstractC1692i1BuildAdapter);
        getBinding().messageInputContainer.setBackground(getStyle().getMessageInputBackgroundDrawable());
        AppCompatEditText messageEditText = getBinding().messageEditText;
        AbstractC22676k.m65749i(messageEditText, "messageEditText");
        TextStyleKt.setTextStyle(messageEditText, getStyle().getMessageInputTextStyle());
        getBinding().messageEditText.setVerticalScrollBarEnabled(getStyle().getMessageInputScrollbarEnabled());
        getBinding().messageEditText.setVerticalFadingEdgeEnabled(getStyle().getMessageInputScrollbarFadingEnabled());
        getBinding().messageEditText.setInputType(getStyle().getMessageInputInputType());
        if (Build.VERSION.SDK_INT < 29 || (messageInputCursorDrawable = getStyle().getMessageInputCursorDrawable()) == null) {
            return;
        }
        getBinding().messageEditText.setTextCursorDrawable(messageInputCursorDrawable);
    }

    public final <T extends AbstractC1692i1 & AttachmentAdapter, VH extends AbstractC1717o2> T buildAdapter(MessageComposerViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        return new AttachmentPreviewAdapter(ChatUI.getAttachmentPreviewFactoryManager(), style, new C19713b(this, 0));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final View findViewByKey(String str) {
        super.findViewByKey(str);
        return null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerCenterContent
    public Function1 getAttachmentRemovalListener() {
        return this.attachmentRemovalListener;
    }

    public final AttachmentAdapter getAttachmentsAdapter() {
        AttachmentAdapter attachmentAdapter = this.attachmentsAdapter;
        if (attachmentAdapter != null) {
            return attachmentAdapter;
        }
        AbstractC22676k.m65757q("attachmentsAdapter");
        throw null;
    }

    public final StreamUiMessageComposerDefaultCenterContentBinding getBinding() {
        StreamUiMessageComposerDefaultCenterContentBinding streamUiMessageComposerDefaultCenterContentBinding = this.binding;
        if (streamUiMessageComposerDefaultCenterContentBinding != null) {
            return streamUiMessageComposerDefaultCenterContentBinding;
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    public final MessageComposerViewStyle getStyle() {
        MessageComposerViewStyle messageComposerViewStyle = this.style;
        if (messageComposerViewStyle != null) {
            return messageComposerViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerCenterContent
    public Function1 getTextInputChangeListener() {
        return this.textInputChangeListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void renderState(MessageComposerState state) {
        AbstractC22676k.m65750j(state, "state");
        boolean z4 = state.getRecording() instanceof RecordingState.Idle;
        View root = getBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(z4 ? 0 : 8);
        renderTextInputState(state);
        renderReplyState(state);
        renderAttachmentState(state);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerCenterContent
    public void setAttachmentRemovalListener(Function1 function1) {
        this.attachmentRemovalListener = function1;
    }

    public final void setAttachmentsAdapter(AttachmentAdapter attachmentAdapter) {
        AbstractC22676k.m65750j(attachmentAdapter, "<set-?>");
        this.attachmentsAdapter = attachmentAdapter;
    }

    public final void setBinding(StreamUiMessageComposerDefaultCenterContentBinding streamUiMessageComposerDefaultCenterContentBinding) {
        AbstractC22676k.m65750j(streamUiMessageComposerDefaultCenterContentBinding, "<set-?>");
        this.binding = streamUiMessageComposerDefaultCenterContentBinding;
    }

    public final void setStyle(MessageComposerViewStyle messageComposerViewStyle) {
        AbstractC22676k.m65750j(messageComposerViewStyle, "<set-?>");
        this.style = messageComposerViewStyle;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerCenterContent
    public void setTextInputChangeListener(Function1 function1) {
        this.textInputChangeListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerCenterContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerCenterContent(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        init();
    }
}
