package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¨\u0006\u0007"}, m65681d2 = {"updateUsers", "", "Lio/getstream/chat/android/models/Member;", "userMap", "", "", "Lio/getstream/chat/android/models/User;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MemberKt {
    @InternalStreamChatApi
    public static final Collection<Member> updateUsers(Collection<Member> collection, Map<String, User> userMap) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(userMap, "userMap");
        Collection<Member> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        for (Member memberCopy : collection2) {
            if (userMap.containsKey(memberCopy.getUserId())) {
                User user = userMap.get(memberCopy.getUserId());
                if (user == null) {
                    user = memberCopy.getUser();
                }
                memberCopy = memberCopy.copy((32766 & 1) != 0 ? memberCopy.user : user, (32766 & 2) != 0 ? memberCopy.createdAt : null, (32766 & 4) != 0 ? memberCopy.updatedAt : null, (32766 & 8) != 0 ? memberCopy.isInvited : null, (32766 & 16) != 0 ? memberCopy.inviteAcceptedAt : null, (32766 & 32) != 0 ? memberCopy.inviteRejectedAt : null, (32766 & 64) != 0 ? memberCopy.shadowBanned : false, (32766 & 128) != 0 ? memberCopy.banned : false, (32766 & 256) != 0 ? memberCopy.channelRole : null, (32766 & 512) != 0 ? memberCopy.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? memberCopy.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? memberCopy.banExpires : null, (32766 & 4096) != 0 ? memberCopy.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? memberCopy.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? memberCopy.extraData : null);
            }
            arrayList.add(memberCopy);
        }
        return arrayList;
    }
}
