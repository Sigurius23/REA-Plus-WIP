package io.getstream.chat.android.client.utils;

import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, m65681d2 = {"mergePartially", "Lio/getstream/chat/android/models/User;", "that", "isMoreUpToDateThan", "", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserUtilsKt {
    private static final boolean isMoreUpToDateThan(User user, User user2) {
        Date createdAt = user.getCreatedAt();
        if (createdAt == null) {
            createdAt = MessageKt.getNEVER();
        }
        Date createdAt2 = user2.getCreatedAt();
        if (createdAt2 == null) {
            createdAt2 = MessageKt.getNEVER();
        }
        if (createdAt.compareTo(createdAt2) > 0) {
            return true;
        }
        Date updatedAt = user.getUpdatedAt();
        if (updatedAt == null) {
            updatedAt = MessageKt.getNEVER();
        }
        Date updatedAt2 = user2.getUpdatedAt();
        if (updatedAt2 == null) {
            updatedAt2 = MessageKt.getNEVER();
        }
        return updatedAt.compareTo(updatedAt2) > 0;
    }

    @InternalStreamChatApi
    public static final User mergePartially(User user, User that) {
        AbstractC22676k.m65750j(user, "<this>");
        AbstractC22676k.m65750j(that, "that");
        if (!isMoreUpToDateThan(that, user)) {
            return user;
        }
        String role = that.getRole();
        Date createdAt = that.getCreatedAt();
        Date updatedAt = that.getUpdatedAt();
        Date lastActive = that.getLastActive();
        Boolean banned = that.getBanned();
        return User.copy$default(user, null, role, that.getName(), that.getImage(), null, that.getPrivacySettings(), null, banned, null, false, createdAt, updatedAt, lastActive, 0, 0, 0, that.getMutes(), null, null, null, null, null, null, that.getExtraData(), null, 25092945, null);
    }
}
