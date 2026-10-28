package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessagePlainTextBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
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
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "messageTextTransformer", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;)V", "Landroid/view/View;", "messageContainerView", "()Landroid/view/View;", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagePlainTextViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final StreamUiItemMessagePlainTextBinding binding;
    private final MessageListListeners listeners;
    private final ChatMessageTextTransformer messageTextTransformer;

    public /* synthetic */ MessagePlainTextViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, ChatMessageTextTransformer chatMessageTextTransformer, StreamUiItemMessagePlainTextBinding streamUiItemMessagePlainTextBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, chatMessageTextTransformer, (i13 & 16) != 0 ? StreamUiItemMessagePlainTextBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemMessagePlainTextBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$8$lambda$7$lambda$0(MessageListListeners messageListListeners, MessagePlainTextViewHolder messagePlainTextViewHolder, View view) {
        messageListListeners.getMessageClickListener().onMessageClick(((MessageListItem.MessageItem) messagePlainTextViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$8$lambda$7$lambda$1(MessageListListeners messageListListeners, MessagePlainTextViewHolder messagePlainTextViewHolder, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getReactionViewClickListener().onReactionViewClick(((MessageListItem.MessageItem) messagePlainTextViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 lambda$8$lambda$7$lambda$2(MessageListListeners messageListListeners, MessagePlainTextViewHolder messagePlainTextViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getThreadClickListener().onThreadClick(((MessageListItem.MessageItem) messagePlainTextViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 lambda$8$lambda$7$lambda$3(MessageListListeners messageListListeners, MessagePlainTextViewHolder messagePlainTextViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getTranslatedLabelClickListener().onTranslatedLabelClick(((MessageListItem.MessageItem) messagePlainTextViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean lambda$8$lambda$7$lambda$4(MessageListListeners messageListListeners, MessagePlainTextViewHolder messagePlainTextViewHolder, View view) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) messagePlainTextViewHolder.getData()).getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$8$lambda$7$lambda$5(MessageListListeners messageListListeners, MessagePlainTextViewHolder messagePlainTextViewHolder, View view) {
        messageListListeners.getUserClickListener().onUserClick(((MessageListItem.MessageItem) messagePlainTextViewHolder.getData()).getMessage().getUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$8$lambda$7$lambda$6(MessageListListeners messageListListeners, MessagePlainTextViewHolder messagePlainTextViewHolder, View view) {
        messageListListeners.getMessageClickListener().onMessageClick(((MessageListItem.MessageItem) messagePlainTextViewHolder.getData()).getMessage());
    }

    public final StreamUiItemMessagePlainTextBinding getBinding() {
        return this.binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final View messageContainerView() {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        return messageContainer;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        boolean text = diff.getText();
        boolean mentions = diff.getMentions();
        boolean showOriginalText = diff.getShowOriginalText();
        if (text || mentions || showOriginalText) {
            StreamUiItemMessagePlainTextBinding streamUiItemMessagePlainTextBinding = this.binding;
            ChatMessageTextTransformer chatMessageTextTransformer = this.messageTextTransformer;
            TextView messageText = streamUiItemMessagePlainTextBinding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            chatMessageTextTransformer.transformAndApply(messageText, data);
            LinearLayout messageContainer = streamUiItemMessagePlainTextBinding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C1141d c1141d = (C1141d) layoutParams;
            c1141d.f5016E = data.isTheirs() ? 0.0f : 1.0f;
            messageContainer.setLayoutParams(c1141d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessagePlainTextViewHolder(ViewGroup parent, List<? extends Decorator> decorators, final MessageListListeners messageListListeners, ChatMessageTextTransformer messageTextTransformer, StreamUiItemMessagePlainTextBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(messageTextTransformer, "messageTextTransformer");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.listeners = messageListListeners;
        this.messageTextTransformer = messageTextTransformer;
        this.binding = binding;
        if (messageListListeners != null) {
            final int i13 = 0;
            binding.messageContainer.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$0(messageListListeners, this, view);
                            break;
                        case 1:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$5(messageListListeners, this, view);
                            break;
                        default:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$6(messageListListeners, this, view);
                            break;
                    }
                }
            });
            binding.reactionsView.setReactionClickListener(new C4312c(13, messageListListeners, this));
            final int i14 = 0;
            binding.footnote.setOnThreadClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.q
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$2(messageListListeners, this, (View) obj);
                            break;
                        default:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$3(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i15 = 1;
            binding.footnote.setOnTranslatedLabelClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.q
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$2(messageListListeners, this, (View) obj);
                            break;
                        default:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$3(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            binding.messageContainer.setOnLongClickListener(new ViewOnLongClickListenerC19797c(4, messageListListeners, this));
            final int i16 = 1;
            binding.userAvatarView.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$0(messageListListeners, this, view);
                            break;
                        case 1:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$5(messageListListeners, this, view);
                            break;
                        default:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$6(messageListListeners, this, view);
                            break;
                    }
                }
            });
            final int i17 = 2;
            binding.messageText.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$0(messageListListeners, this, view);
                            break;
                        case 1:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$5(messageListListeners, this, view);
                            break;
                        default:
                            MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$6(messageListListeners, this, view);
                            break;
                    }
                }
            });
            LongClickFriendlyLinkMovementMethod.Companion companion = LongClickFriendlyLinkMovementMethod.INSTANCE;
            TextView messageText = binding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            LinearLayout messageContainer = binding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            companion.set(messageText, messageContainer, new MessagePlainTextViewHolder$1$1$8(messageListListeners.getLinkClickListener()), new MessagePlainTextViewHolder$1$1$9(messageListListeners.getMentionClickListener()));
        }
    }
}
