package io.getstream.chat.android.client.internal.state.event.handler.internal.utils;

import io.getstream.chat.android.client.internal.state.event.handler.internal.model.SelfUser;
import io.getstream.chat.android.client.internal.state.event.handler.internal.model.SelfUserFull;
import io.getstream.chat.android.client.internal.state.event.handler.internal.model.SelfUserPart;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.utils.UserUtilsKt;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lio/getstream/chat/android/models/User;", "currentUser", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;", "receivedUser", "Ll83/a0;", "updateCurrentUser", "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;)V", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SelfUserUtilsKt {
    public static final void updateCurrentUser(MutableGlobalState mutableGlobalState, User user, SelfUser receivedUser) {
        User me4;
        AbstractC22676k.m65750j(mutableGlobalState, "<this>");
        AbstractC22676k.m65750j(receivedUser, "receivedUser");
        if (receivedUser instanceof SelfUserFull) {
            me4 = ((SelfUserFull) receivedUser).getMe();
        } else {
            if (!(receivedUser instanceof SelfUserPart)) {
                throw new NoWhenBranchMatchedException();
            }
            if (user == null || (me4 = UserUtilsKt.mergePartially(user, ((SelfUserPart) receivedUser).getMe())) == null) {
                me4 = ((SelfUserPart) receivedUser).getMe();
            }
        }
        mutableGlobalState.setBanned(me4.isBanned());
        mutableGlobalState.setMutedUsers(me4.getMutes());
        mutableGlobalState.setChannelMutes(me4.getChannelMutes());
        mutableGlobalState.setTotalUnreadCount(me4.getTotalUnreadCount());
        mutableGlobalState.setChannelUnreadCount(me4.getUnreadChannels());
        mutableGlobalState.setUnreadThreadsCount(me4.getUnreadThreads());
        mutableGlobalState.setBlockedUserIds(me4.getBlockedUserIds());
    }
}
