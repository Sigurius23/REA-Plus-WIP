package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.utils.GiphySizingMode;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemGiphyAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.GiphyMediaAttachmentView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.BackgroundDecorator;
import io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer;
import io.getstream.chat.android.p226ui.utils.extensions.MessageItemKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p047c9.C4312c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "markdown", "Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;)V", "Ll83/a0;", "initializeListeners", "()V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;", "mediaAttachmentView", "data", "imageCorners", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Landroid/view/View;", "messageContainerView", "()Landroid/view/View;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class GiphyAttachmentViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final StreamUiItemGiphyAttachmentBinding binding;
    private final MessageListListeners listeners;
    private final ChatMessageTextTransformer markdown;

    public /* synthetic */ GiphyAttachmentViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, ChatMessageTextTransformer chatMessageTextTransformer, StreamUiItemGiphyAttachmentBinding streamUiItemGiphyAttachmentBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, chatMessageTextTransformer, (i13 & 16) != 0 ? StreamUiItemGiphyAttachmentBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemGiphyAttachmentBinding);
    }

    private final void imageCorners(GiphyMediaAttachmentView mediaAttachmentView, MessageListItem.MessageItem data) {
        float f13;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (MessageUtils.isReply(data.getMessage())) {
            f13 = 0.0f;
        } else {
            BackgroundDecorator.INSTANCE.getClass();
            f13 = BackgroundDecorator.DEFAULT_CORNER_RADIUS;
        }
        if (MessageUtils.isReply(data.getMessage())) {
            f14 = 0.0f;
        } else {
            BackgroundDecorator.INSTANCE.getClass();
            f14 = BackgroundDecorator.DEFAULT_CORNER_RADIUS;
        }
        if (MessageKt.hasText(data.getMessage()) || (data.isMine() && MessageItemKt.isBottomPosition(data))) {
            f15 = 0.0f;
        } else {
            BackgroundDecorator.INSTANCE.getClass();
            f15 = BackgroundDecorator.DEFAULT_CORNER_RADIUS;
        }
        if (!MessageKt.hasText(data.getMessage()) && (!data.isTheirs() || !MessageItemKt.isBottomPosition(data))) {
            BackgroundDecorator.INSTANCE.getClass();
            f16 = BackgroundDecorator.DEFAULT_CORNER_RADIUS;
        }
        mediaAttachmentView.setImageShapeByCorners(f13, f14, f15, f16);
    }

    private final void initializeListeners() {
        StreamUiItemGiphyAttachmentBinding streamUiItemGiphyAttachmentBinding = this.binding;
        final MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            streamUiItemGiphyAttachmentBinding.messageContainer.setOnClickListener(new ViewOnClickListenerC19799e(this, messageListListeners));
            streamUiItemGiphyAttachmentBinding.reactionsView.setReactionClickListener(new C4312c(10, messageListListeners, this));
            final int i13 = 0;
            streamUiItemGiphyAttachmentBinding.footnote.setOnThreadClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i13) {
                        case 0:
                            GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$3(messageListListeners, this, (View) obj);
                            break;
                        default:
                            GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$4(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i14 = 1;
            streamUiItemGiphyAttachmentBinding.footnote.setOnTranslatedLabelClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$3(messageListListeners, this, (View) obj);
                            break;
                        default:
                            GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$4(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            streamUiItemGiphyAttachmentBinding.messageContainer.setOnLongClickListener(new ViewOnLongClickListenerC19797c(2, messageListListeners, this));
            streamUiItemGiphyAttachmentBinding.userAvatarView.setOnClickListener(new ViewOnClickListenerC19799e(messageListListeners, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$8$lambda$7$lambda$1(GiphyAttachmentViewHolder giphyAttachmentViewHolder, MessageListListeners messageListListeners, View view) {
        Attachment attachment = (Attachment) AbstractC25265s.m74100H0(((MessageListItem.MessageItem) giphyAttachmentViewHolder.getData()).getMessage().getAttachments());
        if (attachment != null) {
            messageListListeners.getAttachmentClickListener().onAttachmentClick(((MessageListItem.MessageItem) giphyAttachmentViewHolder.getData()).getMessage(), attachment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$8$lambda$7$lambda$2(MessageListListeners messageListListeners, GiphyAttachmentViewHolder giphyAttachmentViewHolder, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getReactionViewClickListener().onReactionViewClick(((MessageListItem.MessageItem) giphyAttachmentViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$8$lambda$7$lambda$3(MessageListListeners messageListListeners, GiphyAttachmentViewHolder giphyAttachmentViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getThreadClickListener().onThreadClick(((MessageListItem.MessageItem) giphyAttachmentViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$8$lambda$7$lambda$4(MessageListListeners messageListListeners, GiphyAttachmentViewHolder giphyAttachmentViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getTranslatedLabelClickListener().onTranslatedLabelClick(((MessageListItem.MessageItem) giphyAttachmentViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initializeListeners$lambda$8$lambda$7$lambda$5(MessageListListeners messageListListeners, GiphyAttachmentViewHolder giphyAttachmentViewHolder, View view) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) giphyAttachmentViewHolder.getData()).getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$8$lambda$7$lambda$6(MessageListListeners messageListListeners, GiphyAttachmentViewHolder giphyAttachmentViewHolder, View view) {
        messageListListeners.getUserClickListener().onUserClick(((MessageListItem.MessageItem) giphyAttachmentViewHolder.getData()).getMessage().getUser());
    }

    public final StreamUiItemGiphyAttachmentBinding getBinding() {
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
        TextView messageText = this.binding.messageText;
        AbstractC22676k.m65749i(messageText, "messageText");
        int i13 = 0;
        messageText.setVisibility(data.getMessage().getText().length() > 0 ? 0 : 8);
        ChatMessageTextTransformer chatMessageTextTransformer = this.markdown;
        TextView messageText2 = this.binding.messageText;
        AbstractC22676k.m65749i(messageText2, "messageText");
        chatMessageTextTransformer.transformAndApply(messageText2, data);
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        c1141d.f5016E = data.isTheirs() ? 0.0f : 1.0f;
        messageContainer.setLayoutParams(c1141d);
        GiphyMediaAttachmentView mediaAttachmentView = this.binding.mediaAttachmentView;
        AbstractC22676k.m65749i(mediaAttachmentView, "mediaAttachmentView");
        imageCorners(mediaAttachmentView, data);
        GiphyMediaAttachmentView giphyMediaAttachmentView = this.binding.mediaAttachmentView;
        if (giphyMediaAttachmentView.isStyleInitialized$stream_chat_android_ui_components_release() && giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getSizingMode() != GiphySizingMode.ADAPTIVE) {
            GiphySizingMode sizingMode = giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getSizingMode();
            GiphySizingMode giphySizingMode = GiphySizingMode.FIXED_SIZE;
            if ((sizingMode != giphySizingMode || giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getWidth() != -1) && giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getSizingMode() == giphySizingMode) {
                i13 = -2;
            }
        }
        LinearLayout messageContainer2 = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer2, "messageContainer");
        ViewGroup.LayoutParams layoutParams2 = messageContainer2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = i13;
        messageContainer2.setLayoutParams(layoutParams2);
        GiphyMediaAttachmentView.showGiphy$default(this.binding.mediaAttachmentView, (Attachment) AbstractC25265s.m74096F0(data.getMessage().getAttachments()), null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GiphyAttachmentViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListListeners messageListListeners, ChatMessageTextTransformer markdown, StreamUiItemGiphyAttachmentBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(markdown, "markdown");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.listeners = messageListListeners;
        this.markdown = markdown;
        this.binding = binding;
        initializeListeners();
    }
}
