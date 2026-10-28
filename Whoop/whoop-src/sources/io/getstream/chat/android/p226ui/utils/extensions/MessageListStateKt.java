package io.getstream.chat.android.p226ui.utils.extensions;

import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListState;
import io.getstream.chat.android.p226ui.common.state.messages.list.NewMessageState;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.model.MessageListItemWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m65681d2 = {"toMessageListItemWrapper", "Lio/getstream/chat/android/ui/model/MessageListItemWrapper;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "isInThread", "", "prevNewMessageState", "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListStateKt {
    public static final MessageListItemWrapper toMessageListItemWrapper(MessageListState messageListState, boolean z4, NewMessageState newMessageState) {
        Object next;
        AbstractC22676k.m65750j(messageListState, "<this>");
        List<MessageListItemState> messageItems = messageListState.getMessageItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messageItems, 10));
        Iterator<T> it = messageItems.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageListItemKt.toUiMessageListItem((MessageListItemState) it.next()));
        }
        if (messageListState.isLoadingOlderMessages()) {
            arrayList = AbstractC25265s.m74129g1(arrayList, AbstractC37056f.m118958J(MessageListItem.LoadingMoreIndicatorItem.INSTANCE));
        }
        if (messageListState.isLoadingNewerMessages()) {
            arrayList = AbstractC25265s.m74129g1(AbstractC37056f.m118958J(MessageListItem.LoadingMoreIndicatorItem.INSTANCE), arrayList);
        }
        ArrayList arrayList2 = arrayList;
        boolean z13 = !AbstractC22676k.m65745e(messageListState.getNewMessageState(), newMessageState);
        NewMessageState newMessageState2 = messageListState.getNewMessageState();
        Iterator it3 = arrayList2.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!(((MessageListItem) next) instanceof MessageListItem.TypingItem));
        return new MessageListItemWrapper(arrayList2, z13, next != null, z4, messageListState.getEndOfNewMessagesReached(), newMessageState2);
    }

    public static /* synthetic */ MessageListItemWrapper toMessageListItemWrapper$default(MessageListState messageListState, boolean z4, NewMessageState newMessageState, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            newMessageState = null;
        }
        return toMessageListItemWrapper(messageListState, z4, newMessageState);
    }
}
