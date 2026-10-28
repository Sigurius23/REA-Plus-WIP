package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemCustomAttachmentsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemFileAttachmentsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemGiphyAttachmentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemLinkAttachmentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageDeletedBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageMediaAttachmentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessagePlainTextBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessagePollBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FootnoteView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.CustomAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.FileAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyAttachmentViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.LinkAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MediaAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessageDeletedViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessagePlainTextViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.PollViewHolder;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\r\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\r\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\r\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MessageContainerMarginDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "Landroid/view/View;", "messageContainer", "footnote", "Ll83/a0;", "configMargins", "(Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageContainerMarginDecorator extends BaseDecorator {
    private final MessageListItemStyle style;
    private final Decorator.Type type;

    public MessageContainerMarginDecorator(MessageListItemStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.type = Decorator.Type.BuiltIn.MESSAGE_CONTAINER_MARGIN;
    }

    private final void configMargins(View messageContainer, View footnote, MessageListItemStyle style) {
        ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(style.getMessageStartMargin());
        marginLayoutParams.setMarginEnd(style.getMessageEndMargin());
        messageContainer.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = footnote.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(style.getMessageStartMargin());
        marginLayoutParams2.setMarginEnd(style.getMessageEndMargin());
        footnote.setLayoutParams(marginLayoutParams2);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemCustomAttachmentsBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessageDeletedBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemFileAttachmentsBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemGiphyAttachmentBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyMessage(GiphyViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateLinkAttachmentsMessage(LinkAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemLinkAttachmentBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessageMediaAttachmentBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessagePlainTextBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessagePollBinding binding = viewHolder.getBinding();
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        FootnoteView footnote = binding.footnote;
        AbstractC22676k.m65749i(footnote, "footnote");
        configMargins(messageContainer, footnote, this.style);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
