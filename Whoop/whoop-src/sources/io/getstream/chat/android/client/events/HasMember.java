package io.getstream.chat.android.client.events;

import io.getstream.chat.android.models.Member;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u0006\u0007\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/events/HasMember;", "", "member", "Lio/getstream/chat/android/models/Member;", "getMember", "()Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/client/events/MemberAddedEvent;", "Lio/getstream/chat/android/client/events/MemberRemovedEvent;", "Lio/getstream/chat/android/client/events/MemberUpdatedEvent;", "Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;", "Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;", "Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;", "Lio/getstream/chat/android/client/events/NotificationInvitedEvent;", "Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface HasMember {
    Member getMember();
}
