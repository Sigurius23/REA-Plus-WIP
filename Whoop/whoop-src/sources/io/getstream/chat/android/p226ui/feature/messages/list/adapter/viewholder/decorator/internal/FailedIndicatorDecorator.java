package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import android.widget.ImageView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
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
import io.getstream.chat.android.p226ui.utils.extensions.MessageItemKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FailedIndicatorDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "listViewStyle", "Lkotlin/Function0;", "", "isCurrentUserBanned", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lc93/a;)V", "Landroid/widget/ImageView;", "deliveryFailedIcon", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Ll83/a0;", "setupFailedIndicator", "(Landroid/widget/ImageView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lc93/a;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FailedIndicatorDecorator extends BaseDecorator {
    private final InterfaceC4339a isCurrentUserBanned;
    private final MessageListItemStyle listViewStyle;
    private final Decorator.Type type;

    public FailedIndicatorDecorator(MessageListItemStyle listViewStyle, InterfaceC4339a isCurrentUserBanned) {
        AbstractC22676k.m65750j(listViewStyle, "listViewStyle");
        AbstractC22676k.m65750j(isCurrentUserBanned, "isCurrentUserBanned");
        this.listViewStyle = listViewStyle;
        this.isCurrentUserBanned = isCurrentUserBanned;
        this.type = Decorator.Type.BuiltIn.FAILED_INDICATOR;
    }

    private final void setupFailedIndicator(ImageView deliveryFailedIcon, MessageListItem.MessageItem data) {
        boolean zIsErrorOrFailed = MessageItemKt.isErrorOrFailed(data);
        boolean z4 = true;
        boolean z13 = zIsErrorOrFailed && ((Boolean) this.isCurrentUserBanned.invoke()).booleanValue();
        if (z13) {
            deliveryFailedIcon.setImageDrawable(this.listViewStyle.getIconBannedMessage());
        } else if (zIsErrorOrFailed) {
            deliveryFailedIcon.setImageDrawable(this.listViewStyle.getIconFailedMessage());
        }
        if (!zIsErrorOrFailed && !z13) {
            z4 = false;
        }
        deliveryFailedIcon.setVisibility(z4 ? 0 : 8);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        ImageView deliveryFailedIcon = viewHolder.getBinding().deliveryFailedIcon;
        AbstractC22676k.m65749i(deliveryFailedIcon, "deliveryFailedIcon");
        setupFailedIndicator(deliveryFailedIcon, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        ImageView deliveryFailedIcon = viewHolder.getBinding().deliveryFailedIcon;
        AbstractC22676k.m65749i(deliveryFailedIcon, "deliveryFailedIcon");
        setupFailedIndicator(deliveryFailedIcon, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        ImageView deliveryFailedIcon = viewHolder.getBinding().deliveryFailedIcon;
        AbstractC22676k.m65749i(deliveryFailedIcon, "deliveryFailedIcon");
        setupFailedIndicator(deliveryFailedIcon, data);
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
        ImageView deliveryFailedIcon = viewHolder.getBinding().deliveryFailedIcon;
        AbstractC22676k.m65749i(deliveryFailedIcon, "deliveryFailedIcon");
        setupFailedIndicator(deliveryFailedIcon, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        ImageView deliveryFailedIcon = viewHolder.getBinding().deliveryFailedIcon;
        AbstractC22676k.m65749i(deliveryFailedIcon, "deliveryFailedIcon");
        setupFailedIndicator(deliveryFailedIcon, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        ImageView deliveryFailedIcon = viewHolder.getBinding().deliveryFailedIcon;
        AbstractC22676k.m65749i(deliveryFailedIcon, "deliveryFailedIcon");
        setupFailedIndicator(deliveryFailedIcon, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
