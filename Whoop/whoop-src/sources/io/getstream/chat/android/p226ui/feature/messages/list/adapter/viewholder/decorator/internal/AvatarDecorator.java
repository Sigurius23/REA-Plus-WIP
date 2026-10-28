package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
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
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.PollViewHolder;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020%2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020(2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020+2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020.2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "showAvatarPredicate", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V", "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;", "avatarView", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Ll83/a0;", "setupAvatar", "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "myAvatar", "theirAvatar", "", "isMine", "getAvatarView", "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;", "controlVisibility", "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AvatarDecorator extends BaseDecorator {
    private final MessageListView.ShowAvatarPredicate showAvatarPredicate;
    private final Decorator.Type type;

    public AvatarDecorator(MessageListView.ShowAvatarPredicate showAvatarPredicate) {
        AbstractC22676k.m65750j(showAvatarPredicate, "showAvatarPredicate");
        this.showAvatarPredicate = showAvatarPredicate;
        this.type = Decorator.Type.BuiltIn.AVATAR;
    }

    private final void controlVisibility(UserAvatarView myAvatar, UserAvatarView theirAvatar, boolean isMine) {
        theirAvatar.setVisibility(!isMine ? 0 : 8);
        myAvatar.setVisibility(isMine ? 0 : 8);
    }

    private final UserAvatarView getAvatarView(UserAvatarView myAvatar, UserAvatarView theirAvatar, boolean isMine) {
        return isMine ? myAvatar : theirAvatar;
    }

    private final void setupAvatar(UserAvatarView avatarView, MessageListItem.MessageItem data) {
        boolean zShouldShow = this.showAvatarPredicate.shouldShow(data);
        avatarView.setVisibility(zShouldShow ? 0 : 8);
        if (zShouldShow) {
            UserAvatarView.setUser$default(avatarView, data.getMessage().getUser(), false, 2, null);
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
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
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        UserAvatarView userAvatarMineView = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView, "userAvatarMineView");
        UserAvatarView userAvatarView = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        controlVisibility(userAvatarMineView, userAvatarView, data.isMine());
        UserAvatarView userAvatarMineView2 = viewHolder.getBinding().userAvatarMineView;
        AbstractC22676k.m65749i(userAvatarMineView2, "userAvatarMineView");
        UserAvatarView userAvatarView2 = viewHolder.getBinding().userAvatarView;
        AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
        if (!data.isMine()) {
            userAvatarMineView2 = userAvatarView2;
        }
        setupAvatar(userAvatarMineView2, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
