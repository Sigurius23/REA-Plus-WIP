package io.getstream.chat.android.models;

import androidx.core.app.NotificationCompat;
import ge3.AbstractC15751g;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/models/SyncStatus;", "", NotificationCompat.CATEGORY_STATUS, "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", "SYNC_NEEDED", "COMPLETED", "FAILED_PERMANENTLY", "IN_PROGRESS", "AWAITING_ATTACHMENTS", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public enum SyncStatus {
    SYNC_NEEDED(-1),
    COMPLETED(1),
    FAILED_PERMANENTLY(2),
    IN_PROGRESS(3),
    AWAITING_ATTACHMENTS(4);

    private static final Map<Integer, SyncStatus> map;
    private final int status;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/models/SyncStatus$Companion;", "", "<init>", "()V", "map", "", "", "Lio/getstream/chat/android/models/SyncStatus;", "fromInt", "type", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SyncStatus fromInt(int type) {
            return (SyncStatus) SyncStatus.map.get(Integer.valueOf(type));
        }

        private Companion() {
        }
    }

    static {
        InterfaceC33616a entries = getEntries();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((SyncStatus) obj).status), obj);
        }
        map = linkedHashMap;
    }

    SyncStatus(int i13) {
        this.status = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getStatus() {
        return this.status;
    }
}
