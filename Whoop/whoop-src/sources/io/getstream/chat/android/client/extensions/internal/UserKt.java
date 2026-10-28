package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\u0007¨\u0006\u0007"}, m65681d2 = {"updateUsers", "", "Lio/getstream/chat/android/models/User;", "", "users", "", "", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserKt {
    @InternalStreamChatApi
    public static final List<User> updateUsers(Collection<User> collection, Map<String, User> users) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(users, "users");
        Collection<User> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        for (User user : collection2) {
            User user2 = users.get(user.getId());
            if (user2 != null) {
                user = user2;
            }
            arrayList.add(user);
        }
        return arrayList;
    }
}
