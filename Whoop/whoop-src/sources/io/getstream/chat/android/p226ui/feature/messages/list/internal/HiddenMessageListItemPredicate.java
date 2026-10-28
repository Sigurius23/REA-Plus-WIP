package io.getstream.chat.android.p226ui.feature.messages.list.internal;

import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemPredicate;", "<init>", "()V", "theirGiphyEphemeralMessagePredicate", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "", "predicate", "item", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HiddenMessageListItemPredicate implements MessageListView.MessageListItemPredicate {
    public static final HiddenMessageListItemPredicate INSTANCE = new HiddenMessageListItemPredicate();
    private static final Function1 theirGiphyEphemeralMessagePredicate = new C19616a(22);

    private HiddenMessageListItemPredicate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean theirGiphyEphemeralMessagePredicate$lambda$0(MessageListItem item) {
        AbstractC22676k.m65750j(item, "item");
        if (!(item instanceof MessageListItem.MessageItem)) {
            return false;
        }
        MessageListItem.MessageItem messageItem = (MessageListItem.MessageItem) item;
        return MessageUtils.isGiphyEphemeral(messageItem.getMessage()) && messageItem.isTheirs();
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageListItemPredicate
    public final boolean predicate(MessageListItem item) {
        AbstractC22676k.m65750j(item, "item");
        return !((Boolean) theirGiphyEphemeralMessagePredicate.invoke(item)).booleanValue();
    }
}
