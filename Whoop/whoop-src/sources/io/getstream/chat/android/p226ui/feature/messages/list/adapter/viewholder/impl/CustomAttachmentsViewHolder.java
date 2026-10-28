package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemCustomAttachmentsBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.InnerAttachmentViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.LongClickFriendlyLinkMovementMethod;
import io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import l83.C23454a0;
import p047c9.C4312c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "messageTextTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "attachmentFactoryManager", "Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;)V", "Ll83/a0;", "bindMessageText", "()V", "bindHorizontalBias", "data", "bindCustomAttachments", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "initializeListeners", "setLinkMovementMethod", "Landroid/view/View;", "messageContainerView", "()Landroid/view/View;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "unbind", "onDetachedFromWindow", "onAttachedToWindow", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;", "innerAttachmentViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CustomAttachmentsViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final AttachmentFactoryManager attachmentFactoryManager;
    private final StreamUiItemCustomAttachmentsBinding binding;
    private InnerAttachmentViewHolder innerAttachmentViewHolder;
    private final MessageListListeners listeners;
    private final ChatMessageTextTransformer messageTextTransformer;

    public /* synthetic */ CustomAttachmentsViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, ChatMessageTextTransformer chatMessageTextTransformer, AttachmentFactoryManager attachmentFactoryManager, StreamUiItemCustomAttachmentsBinding streamUiItemCustomAttachmentsBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, chatMessageTextTransformer, attachmentFactoryManager, (i13 & 32) != 0 ? StreamUiItemCustomAttachmentsBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemCustomAttachmentsBinding);
    }

    private final void bindCustomAttachments(MessageListItem.MessageItem data) {
        AttachmentFactoryManager attachmentFactoryManager = this.attachmentFactoryManager;
        Message message = data.getMessage();
        MessageListListeners messageListListeners = this.listeners;
        ConstraintLayout root = this.binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        InnerAttachmentViewHolder innerAttachmentViewHolderCreateViewHolder = attachmentFactoryManager.createViewHolder(message, messageListListeners, root);
        innerAttachmentViewHolderCreateViewHolder.onBindViewHolder(data.getMessage());
        this.binding.attachmentsContainer.removeAllViews();
        this.binding.attachmentsContainer.addView(innerAttachmentViewHolderCreateViewHolder.getItemView());
        this.innerAttachmentViewHolder = innerAttachmentViewHolderCreateViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindHorizontalBias() {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        c1141d.f5016E = ((MessageListItem.MessageItem) getData()).isMine() ? 1.0f : 0.0f;
        messageContainer.setLayoutParams(c1141d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindMessageText() {
        TextView messageText = this.binding.messageText;
        AbstractC22676k.m65749i(messageText, "messageText");
        messageText.setVisibility(((MessageListItem.MessageItem) getData()).getMessage().getText().length() > 0 ? 0 : 8);
        ChatMessageTextTransformer chatMessageTextTransformer = this.messageTextTransformer;
        TextView messageText2 = this.binding.messageText;
        AbstractC22676k.m65749i(messageText2, "messageText");
        chatMessageTextTransformer.transformAndApply(messageText2, (MessageListItem.MessageItem) getData());
    }

    private final void initializeListeners() {
        StreamUiItemCustomAttachmentsBinding streamUiItemCustomAttachmentsBinding = this.binding;
        final MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            final int i13 = 0;
            streamUiItemCustomAttachmentsBinding.messageContainer.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$2(messageListListeners, this, view);
                            break;
                        default:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$7(messageListListeners, this, view);
                            break;
                    }
                }
            });
            streamUiItemCustomAttachmentsBinding.reactionsView.setReactionClickListener(new C4312c(8, messageListListeners, this));
            final int i14 = 0;
            streamUiItemCustomAttachmentsBinding.footnote.setOnThreadClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$4(messageListListeners, this, (View) obj);
                            break;
                        default:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$5(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i15 = 1;
            streamUiItemCustomAttachmentsBinding.footnote.setOnTranslatedLabelClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$4(messageListListeners, this, (View) obj);
                            break;
                        default:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$5(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            streamUiItemCustomAttachmentsBinding.messageContainer.setOnLongClickListener(new ViewOnLongClickListenerC19797c(0, messageListListeners, this));
            final int i16 = 1;
            streamUiItemCustomAttachmentsBinding.userAvatarView.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$2(messageListListeners, this, view);
                            break;
                        default:
                            CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$7(messageListListeners, this, view);
                            break;
                    }
                }
            });
            LongClickFriendlyLinkMovementMethod.Companion companion = LongClickFriendlyLinkMovementMethod.INSTANCE;
            TextView messageText = streamUiItemCustomAttachmentsBinding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            LinearLayout messageContainer = streamUiItemCustomAttachmentsBinding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            companion.set(messageText, messageContainer, new CustomAttachmentsViewHolder$initializeListeners$1$1$7(messageListListeners.getLinkClickListener()), new CustomAttachmentsViewHolder$initializeListeners$1$1$8(messageListListeners.getMentionClickListener()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$9$lambda$8$lambda$2(MessageListListeners messageListListeners, CustomAttachmentsViewHolder customAttachmentsViewHolder, View view) {
        messageListListeners.getMessageClickListener().onMessageClick(((MessageListItem.MessageItem) customAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$9$lambda$8$lambda$3(MessageListListeners messageListListeners, CustomAttachmentsViewHolder customAttachmentsViewHolder, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getReactionViewClickListener().onReactionViewClick(((MessageListItem.MessageItem) customAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$9$lambda$8$lambda$4(MessageListListeners messageListListeners, CustomAttachmentsViewHolder customAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getThreadClickListener().onThreadClick(((MessageListItem.MessageItem) customAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$9$lambda$8$lambda$5(MessageListListeners messageListListeners, CustomAttachmentsViewHolder customAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getTranslatedLabelClickListener().onTranslatedLabelClick(((MessageListItem.MessageItem) customAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initializeListeners$lambda$9$lambda$8$lambda$6(MessageListListeners messageListListeners, CustomAttachmentsViewHolder customAttachmentsViewHolder, View view) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) customAttachmentsViewHolder.getData()).getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$9$lambda$8$lambda$7(MessageListListeners messageListListeners, CustomAttachmentsViewHolder customAttachmentsViewHolder, View view) {
        messageListListeners.getUserClickListener().onUserClick(((MessageListItem.MessageItem) customAttachmentsViewHolder.getData()).getMessage().getUser());
    }

    private final void setLinkMovementMethod() {
        MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            LongClickFriendlyLinkMovementMethod.Companion companion = LongClickFriendlyLinkMovementMethod.INSTANCE;
            TextView messageText = this.binding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            LinearLayout messageContainer = this.binding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            companion.set(messageText, messageContainer, new CustomAttachmentsViewHolder$setLinkMovementMethod$1$1(messageListListeners.getLinkClickListener()), new CustomAttachmentsViewHolder$setLinkMovementMethod$1$2(messageListListeners.getMentionClickListener()));
        }
    }

    public final StreamUiItemCustomAttachmentsBinding getBinding() {
        return this.binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final View messageContainerView() {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        return messageContainer;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void onAttachedToWindow() {
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void onDetachedFromWindow() {
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void unbind() {
        super.unbind();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        bindMessageText();
        bindHorizontalBias();
        bindCustomAttachments(data);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomAttachmentsViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListListeners messageListListeners, ChatMessageTextTransformer messageTextTransformer, AttachmentFactoryManager attachmentFactoryManager, StreamUiItemCustomAttachmentsBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(messageTextTransformer, "messageTextTransformer");
        AbstractC22676k.m65750j(attachmentFactoryManager, "attachmentFactoryManager");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.listeners = messageListListeners;
        this.messageTextTransformer = messageTextTransformer;
        this.attachmentFactoryManager = attachmentFactoryManager;
        this.binding = binding;
        initializeListeners();
        setLinkMovementMethod();
    }
}
