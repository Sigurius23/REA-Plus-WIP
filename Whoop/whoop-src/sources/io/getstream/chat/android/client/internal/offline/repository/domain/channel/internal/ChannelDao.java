package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\ba\u0018\u0000 %2\u00020\u0001:\u0001%J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0013J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H§@¢\u0006\u0004\b\u0016\u0010\nJ\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001aH§@¢\u0006\u0004\b!\u0010\"J \u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010#J\u0010\u0010$\u001a\u00020\u0004H§@¢\u0006\u0004\b$\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;", "channelEntity", "Ll83/a0;", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lq83/d;)Ljava/lang/Object;", "", "channelEntities", "insertMany", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "selectAllCids", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "", MapboxMap.QFE_LIMIT, "selectCidsBySyncNeeded", "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;", "selectSyncNeeded", "cids", "select", "cid", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "delete", "Ljava/util/Date;", "deletedAt", "setDeletedAt", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "", "hidden", "hideMessagesBefore", "setHidden", "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "deleteAll", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao$Companion;", "", "<init>", "()V", "NO_LIMIT", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int NO_LIMIT = -1;

        private Companion() {
        }
    }

    static /* synthetic */ Object selectCidsBySyncNeeded$default(ChannelDao channelDao, SyncStatus syncStatus, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectCidsBySyncNeeded");
        }
        if ((i14 & 1) != 0) {
            syncStatus = SyncStatus.SYNC_NEEDED;
        }
        if ((i14 & 2) != 0) {
            i13 = -1;
        }
        return channelDao.selectCidsBySyncNeeded(syncStatus, i13, interfaceC30057d);
    }

    static /* synthetic */ Object selectSyncNeeded$default(ChannelDao channelDao, SyncStatus syncStatus, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSyncNeeded");
        }
        if ((i14 & 1) != 0) {
            syncStatus = SyncStatus.SYNC_NEEDED;
        }
        if ((i14 & 2) != 0) {
            i13 = -1;
        }
        return channelDao.selectSyncNeeded(syncStatus, i13, interfaceC30057d);
    }

    Object delete(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insert(ChannelEntity channelEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertMany(List<ChannelEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object select(String str, InterfaceC30057d<? super ChannelEntity> interfaceC30057d);

    Object select(List<String> list, InterfaceC30057d<? super List<ChannelEntity>> interfaceC30057d);

    Object selectAllCids(InterfaceC30057d<? super List<String>> interfaceC30057d);

    Object selectCidsBySyncNeeded(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<String>> interfaceC30057d);

    Object selectSyncNeeded(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<ChannelEntity>> interfaceC30057d);

    Object setDeletedAt(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object setHidden(String str, boolean z4, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object setHidden(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
