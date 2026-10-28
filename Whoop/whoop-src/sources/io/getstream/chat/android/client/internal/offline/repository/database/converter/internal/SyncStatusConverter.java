package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import io.getstream.chat.android.models.SyncStatus;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "", "<init>", "()V", "stringToSyncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "data", "", "syncStatusToString", "syncStatus", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SyncStatusConverter {
    public final SyncStatus stringToSyncStatus(int data) {
        SyncStatus syncStatusFromInt = SyncStatus.INSTANCE.fromInt(data);
        AbstractC22676k.m65747g(syncStatusFromInt);
        return syncStatusFromInt;
    }

    public final int syncStatusToString(SyncStatus syncStatus) {
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        return syncStatus.getStatus();
    }
}
