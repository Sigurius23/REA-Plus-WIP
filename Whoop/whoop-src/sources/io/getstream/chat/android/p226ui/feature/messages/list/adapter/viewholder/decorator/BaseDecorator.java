package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
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
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\rH$¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\rH$¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\rH$¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\rH$¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\rH$¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\rH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020%2\u0006\u0010\b\u001a\u00020\rH\u0014¢\u0006\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "<init>", "()V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "T", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "viewHolder", "data", "Ll83/a0;", "decorate", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class BaseDecorator implements Decorator {
    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final <T extends MessageListItem> void decorate(BaseMessageItemViewHolder<T> viewHolder, T data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        if (data instanceof MessageListItem.MessageItem) {
            if (viewHolder instanceof MessageDeletedViewHolder) {
                decorateDeletedMessage((MessageDeletedViewHolder) viewHolder, (MessageListItem.MessageItem) data);
                return;
            }
            if (viewHolder instanceof MessagePlainTextViewHolder) {
                decoratePlainTextMessage((MessagePlainTextViewHolder) viewHolder, (MessageListItem.MessageItem) data);
                return;
            }
            if (viewHolder instanceof CustomAttachmentsViewHolder) {
                decorateCustomAttachmentsMessage((CustomAttachmentsViewHolder) viewHolder, (MessageListItem.MessageItem) data);
                return;
            }
            if (viewHolder instanceof LinkAttachmentsViewHolder) {
                decorateLinkAttachmentsMessage((LinkAttachmentsViewHolder) viewHolder, (MessageListItem.MessageItem) data);
                return;
            }
            if (viewHolder instanceof GiphyViewHolder) {
                decorateGiphyMessage((GiphyViewHolder) viewHolder, (MessageListItem.MessageItem) data);
                return;
            }
            if (viewHolder instanceof GiphyAttachmentViewHolder) {
                decorateGiphyAttachmentMessage((GiphyAttachmentViewHolder) viewHolder, (MessageListItem.MessageItem) data);
                return;
            }
            if (viewHolder instanceof FileAttachmentsViewHolder) {
                decorateFileAttachmentsMessage((FileAttachmentsViewHolder) viewHolder, (MessageListItem.MessageItem) data);
            } else if (viewHolder instanceof MediaAttachmentsViewHolder) {
                decorateMediaAttachmentsMessage((MediaAttachmentsViewHolder) viewHolder, (MessageListItem.MessageItem) data);
            } else if (viewHolder instanceof PollViewHolder) {
                decoratePollMessage((PollViewHolder) viewHolder, (MessageListItem.MessageItem) data);
            }
        }
    }

    public abstract void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data);

    public void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
    }

    public abstract void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data);

    public abstract void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data);

    public void decorateGiphyMessage(GiphyViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
    }

    public abstract void decorateLinkAttachmentsMessage(LinkAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data);

    public abstract void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data);

    public abstract void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data);

    public void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
    }
}
