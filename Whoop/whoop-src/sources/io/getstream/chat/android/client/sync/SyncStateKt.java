package io.getstream.chat.android.client.sync;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Date;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m65681d2 = {"stringify", "", "Lio/getstream/chat/android/client/sync/SyncState;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SyncStateKt {
    @InternalStreamChatApi
    public static final String stringify(SyncState syncState) {
        AbstractC22676k.m65750j(syncState, "<this>");
        String userId = syncState.getUserId();
        int size = syncState.getActiveChannelIds().size();
        Date lastSyncedAt = syncState.getLastSyncedAt();
        String rawLastSyncedAt = syncState.getRawLastSyncedAt();
        Date markedAllReadAt = syncState.getMarkedAllReadAt();
        StringBuilder sbM30467u = AbstractC11266d.m30467u(size, "SyncState(userId='", userId, "', activeChannelIds.size=", ", lastSyncedAt=");
        sbM30467u.append(lastSyncedAt);
        sbM30467u.append(", rawLastSyncedAt=");
        sbM30467u.append(rawLastSyncedAt);
        sbM30467u.append(", markedAllReadAt=");
        return AbstractC13673n.m38564k(sbM30467u, markedAllReadAt, ")");
    }
}
