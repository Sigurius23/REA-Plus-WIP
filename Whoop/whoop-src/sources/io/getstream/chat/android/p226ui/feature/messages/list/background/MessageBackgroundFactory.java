package io.getstream.chat.android.p226ui.feature.messages.list.background;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "", "plainTextMessageBackground", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "deletedMessageBackground", "textAndAttachmentMessageBackground", "fileAttachmentsMessageBackground", "linkAttachmentMessageBackground", "giphyAppearanceModel", "imageAttachmentMessageBackground", "pollMessageBackground", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageBackgroundFactory {
    Drawable deletedMessageBackground(Context context, MessageListItem.MessageItem data);

    Drawable fileAttachmentsMessageBackground(Context context, MessageListItem.MessageItem data);

    Drawable giphyAppearanceModel(Context context);

    Drawable imageAttachmentMessageBackground(Context context, MessageListItem.MessageItem data);

    Drawable linkAttachmentMessageBackground(Context context, MessageListItem.MessageItem data);

    Drawable plainTextMessageBackground(Context context, MessageListItem.MessageItem data);

    Drawable pollMessageBackground(Context context, MessageListItem.MessageItem data);

    Drawable textAndAttachmentMessageBackground(Context context, MessageListItem.MessageItem data);
}
