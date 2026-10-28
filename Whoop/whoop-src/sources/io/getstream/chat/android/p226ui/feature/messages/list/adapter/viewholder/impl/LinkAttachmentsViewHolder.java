package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import hn.C17508p;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemLinkAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.LinkAttachmentView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.LongClickFriendlyLinkMovementMethod;
import io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p047c9.C4312c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "messageTextTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;", "binding", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "data", "Ll83/a0;", "updateHorizontalBias", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "initializeListeners", "()V", "setLinkMovementMethod", "applyLinkAttachmentViewStyle", "Landroid/view/View;", "messageContainerView", "()Landroid/view/View;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LinkAttachmentsViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final StreamUiItemLinkAttachmentBinding binding;
    private final MessageListListeners listeners;
    private final ChatMessageTextTransformer messageTextTransformer;
    private final MessageListItemStyle style;

    public /* synthetic */ LinkAttachmentsViewHolder(ViewGroup viewGroup, List list, ChatMessageTextTransformer chatMessageTextTransformer, MessageListListeners messageListListeners, StreamUiItemLinkAttachmentBinding streamUiItemLinkAttachmentBinding, MessageListItemStyle messageListItemStyle, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, chatMessageTextTransformer, messageListListeners, (i13 & 16) != 0 ? StreamUiItemLinkAttachmentBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemLinkAttachmentBinding, messageListItemStyle);
    }

    private final void applyLinkAttachmentViewStyle() {
        LinkAttachmentView linkAttachmentView = this.binding.linkAttachmentView;
        linkAttachmentView.m55503xdf9c1a8(this.style.getLinkDescriptionMaxLines());
        linkAttachmentView.m55502x604a2357(this.style.getTextStyleLinkDescription());
        linkAttachmentView.setTitleTextStyle$stream_chat_android_ui_components_release(this.style.getTextStyleLinkTitle());
        linkAttachmentView.setLabelTextStyle$stream_chat_android_ui_components_release(this.style.getTextStyleLinkLabel());
    }

    private final void initializeListeners() {
        StreamUiItemLinkAttachmentBinding streamUiItemLinkAttachmentBinding = this.binding;
        final MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            final int i13 = 0;
            streamUiItemLinkAttachmentBinding.messageContainer.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$3(messageListListeners, this, view);
                            break;
                        default:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$8(messageListListeners, this, view);
                            break;
                    }
                }
            });
            streamUiItemLinkAttachmentBinding.reactionsView.setReactionClickListener(new C4312c(11, messageListListeners, this));
            final int i14 = 0;
            streamUiItemLinkAttachmentBinding.footnote.setOnThreadClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.j
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$5(messageListListeners, this, (View) obj);
                            break;
                        default:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$6(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i15 = 1;
            streamUiItemLinkAttachmentBinding.footnote.setOnTranslatedLabelClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.j
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$5(messageListListeners, this, (View) obj);
                            break;
                        default:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$6(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i16 = 0;
            streamUiItemLinkAttachmentBinding.messageContainer.setOnLongClickListener(new View.OnLongClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i16) {
                        case 0:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$7(messageListListeners, this, view);
                            break;
                        default:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$10(messageListListeners, this, view);
                            break;
                    }
                    return true;
                }
            });
            final int i17 = 1;
            streamUiItemLinkAttachmentBinding.userAvatarView.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$3(messageListListeners, this, view);
                            break;
                        default:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$8(messageListListeners, this, view);
                            break;
                    }
                }
            });
            streamUiItemLinkAttachmentBinding.linkAttachmentView.setLinkPreviewClickListener(new C17508p(this, 8));
            final int i18 = 1;
            streamUiItemLinkAttachmentBinding.linkAttachmentView.setOnLongClickListener(new View.OnLongClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i18) {
                        case 0:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$7(messageListListeners, this, view);
                            break;
                        default:
                            LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$10(messageListListeners, this, view);
                            break;
                    }
                    return true;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initializeListeners$lambda$12$lambda$11$lambda$10(MessageListListeners messageListListeners, LinkAttachmentsViewHolder linkAttachmentsViewHolder, View view) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) linkAttachmentsViewHolder.getData()).getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$12$lambda$11$lambda$3(MessageListListeners messageListListeners, LinkAttachmentsViewHolder linkAttachmentsViewHolder, View view) {
        messageListListeners.getMessageClickListener().onMessageClick(((MessageListItem.MessageItem) linkAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$12$lambda$11$lambda$4(MessageListListeners messageListListeners, LinkAttachmentsViewHolder linkAttachmentsViewHolder, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getReactionViewClickListener().onReactionViewClick(((MessageListItem.MessageItem) linkAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$12$lambda$11$lambda$5(MessageListListeners messageListListeners, LinkAttachmentsViewHolder linkAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getThreadClickListener().onThreadClick(((MessageListItem.MessageItem) linkAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$12$lambda$11$lambda$6(MessageListListeners messageListListeners, LinkAttachmentsViewHolder linkAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getTranslatedLabelClickListener().onTranslatedLabelClick(((MessageListItem.MessageItem) linkAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initializeListeners$lambda$12$lambda$11$lambda$7(MessageListListeners messageListListeners, LinkAttachmentsViewHolder linkAttachmentsViewHolder, View view) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) linkAttachmentsViewHolder.getData()).getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$12$lambda$11$lambda$8(MessageListListeners messageListListeners, LinkAttachmentsViewHolder linkAttachmentsViewHolder, View view) {
        messageListListeners.getUserClickListener().onUserClick(((MessageListItem.MessageItem) linkAttachmentsViewHolder.getData()).getMessage().getUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeListeners$lambda$12$lambda$11$lambda$9(LinkAttachmentsViewHolder linkAttachmentsViewHolder, String it) {
        AbstractC22676k.m65750j(it, "it");
        linkAttachmentsViewHolder.listeners.getLinkClickListener().onLinkClick(it);
    }

    private final void setLinkMovementMethod() {
        MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            LongClickFriendlyLinkMovementMethod.Companion companion = LongClickFriendlyLinkMovementMethod.INSTANCE;
            TextView messageText = this.binding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            LinearLayout messageContainer = this.binding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            companion.set(messageText, messageContainer, new LinkAttachmentsViewHolder$setLinkMovementMethod$1$1(messageListListeners.getLinkClickListener()), new LinkAttachmentsViewHolder$setLinkMovementMethod$1$2(messageListListeners.getMentionClickListener()));
        }
    }

    private final void updateHorizontalBias(MessageListItem.MessageItem data) {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        c1141d.f5016E = data.isMine() ? 1.0f : 0.0f;
        messageContainer.setLayoutParams(c1141d);
    }

    public final StreamUiItemLinkAttachmentBinding getBinding() {
        return this.binding;
    }

    public final MessageListItemStyle getStyle() {
        return this.style;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final View messageContainerView() {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        return messageContainer;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        Object next;
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        updateHorizontalBias(data);
        Iterator<T> it = data.getMessage().getAttachments().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AttachmentKt.hasLink((Attachment) next));
        Attachment attachment = (Attachment) next;
        if (attachment != null) {
            this.binding.linkAttachmentView.showLinkAttachment(attachment, this.style);
            ChatMessageTextTransformer chatMessageTextTransformer = this.messageTextTransformer;
            TextView messageText = this.binding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            chatMessageTextTransformer.transformAndApply(messageText, data);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkAttachmentsViewHolder(ViewGroup parent, List<? extends Decorator> decorators, ChatMessageTextTransformer messageTextTransformer, MessageListListeners messageListListeners, StreamUiItemLinkAttachmentBinding binding, MessageListItemStyle style) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(messageTextTransformer, "messageTextTransformer");
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(style, "style");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.messageTextTransformer = messageTextTransformer;
        this.listeners = messageListListeners;
        this.binding = binding;
        this.style = style;
        applyLinkAttachmentViewStyle();
        initializeListeners();
        setLinkMovementMethod();
    }
}
