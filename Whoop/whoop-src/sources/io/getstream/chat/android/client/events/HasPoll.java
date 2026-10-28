package io.getstream.chat.android.client.events;

import io.getstream.chat.android.models.Poll;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/events/HasPoll;", "", "messageId", "", "getMessageId", "()Ljava/lang/String;", "poll", "Lio/getstream/chat/android/models/Poll;", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/client/events/AnswerCastedEvent;", "Lio/getstream/chat/android/client/events/PollClosedEvent;", "Lio/getstream/chat/android/client/events/PollDeletedEvent;", "Lio/getstream/chat/android/client/events/PollUpdatedEvent;", "Lio/getstream/chat/android/client/events/VoteCastedEvent;", "Lio/getstream/chat/android/client/events/VoteChangedEvent;", "Lio/getstream/chat/android/client/events/VoteRemovedEvent;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface HasPoll {
    String getMessageId();

    Poll getPoll();
}
