package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import as1.C1945f;
import com.mapbox.maps.MapboxMap;
import ge3.AbstractC15751g;
import h02.C16574h;
import ht2.C17632d;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.LocationConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.MapConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.MemberConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.SetConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.SyncStatusConverter;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.LocationEntity;
import io.getstream.chat.android.models.SyncStatus;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@¢\u0006\u0004\b\u001a\u0010\u000eJ\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u001a\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001d\u0010\u001cJ \u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J(\u0010%\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b%\u0010&J \u0010%\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b%\u0010'J\u0010\u0010(\u001a\u00020\bH\u0096@¢\u0006\u0004\b(\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;", "channelEntity", "Ll83/a0;", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lq83/d;)Ljava/lang/Object;", "", "channelEntities", "insertMany", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "selectAllCids", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "", MapboxMap.QFE_LIMIT, "selectCidsBySyncNeeded", "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;", "selectSyncNeeded", "cids", "select", "cid", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "delete", "Ljava/util/Date;", "deletedAt", "setDeletedAt", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "", "hidden", "hideMessagesBefore", "setHidden", "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "deleteAll", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfChannelEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "__mapConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "__syncStatusConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;", "__setConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;", "__memberConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;", "__locationConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelDao_Impl implements ChannelDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final ExtraDataConverter __extraDataConverter;
    private final AbstractC1802k __insertAdapterOfChannelEntity;
    private final ListConverter __listConverter;
    private final LocationConverter __locationConverter;
    private final MapConverter __mapConverter;
    private final MemberConverter __memberConverter;
    private final SetConverter __setConverter;
    private final SyncStatusConverter __syncStatusConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__listConverter = new ListConverter();
        this.__dateConverter = new DateConverter();
        this.__mapConverter = new MapConverter();
        this.__extraDataConverter = new ExtraDataConverter();
        this.__syncStatusConverter = new SyncStatusConverter();
        this.__setConverter = new SetConverter();
        this.__memberConverter = new MemberConverter();
        this.__locationConverter = new LocationConverter();
        this.__db = __db;
        this.__insertAdapterOfChannelEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_channel_state` (`type`,`channelId`,`name`,`image`,`cooldown`,`createdByUserId`,`filterTags`,`frozen`,`hidden`,`hideMessagesBefore`,`members`,`memberCount`,`watcherIds`,`watcherCount`,`reads`,`lastMessageAt`,`lastMessageId`,`createdAt`,`updatedAt`,`deletedAt`,`extraData`,`syncStatus`,`team`,`ownCapabilities`,`membership`,`activeLiveLocations`,`messageCount`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ChannelEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getType());
                statement.mo5354L(2, entity.getChannelId());
                statement.mo5354L(3, entity.getName());
                statement.mo5354L(4, entity.getImage());
                statement.mo5356p(5, entity.getCooldown());
                statement.mo5354L(6, entity.getCreatedByUserId());
                String strFromStringList = ChannelDao_Impl.this.__listConverter.fromStringList(entity.getFilterTags());
                if (strFromStringList == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5354L(7, strFromStringList);
                }
                statement.mo5356p(8, entity.getFrozen() ? 1L : 0L);
                Boolean hidden = entity.getHidden();
                Integer numValueOf = hidden != null ? Integer.valueOf(hidden.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    statement.mo5359u(9);
                } else {
                    statement.mo5356p(9, numValueOf.intValue());
                }
                Long lDateToTimestamp = ChannelDao_Impl.this.__dateConverter.dateToTimestamp(entity.getHideMessagesBefore());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5356p(10, lDateToTimestamp.longValue());
                }
                String strMemberMapToString = ChannelDao_Impl.this.__mapConverter.memberMapToString(entity.getMembers());
                if (strMemberMapToString == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5354L(11, strMemberMapToString);
                }
                statement.mo5356p(12, entity.getMemberCount());
                String strFromStringList2 = ChannelDao_Impl.this.__listConverter.fromStringList(entity.getWatcherIds());
                if (strFromStringList2 == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5354L(13, strFromStringList2);
                }
                statement.mo5356p(14, entity.getWatcherCount());
                String mapToString = ChannelDao_Impl.this.__mapConverter.readMapToString(entity.getReads());
                if (mapToString == null) {
                    statement.mo5359u(15);
                } else {
                    statement.mo5354L(15, mapToString);
                }
                Long lDateToTimestamp2 = ChannelDao_Impl.this.__dateConverter.dateToTimestamp(entity.getLastMessageAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(16);
                } else {
                    statement.mo5356p(16, lDateToTimestamp2.longValue());
                }
                String lastMessageId = entity.getLastMessageId();
                if (lastMessageId == null) {
                    statement.mo5359u(17);
                } else {
                    statement.mo5354L(17, lastMessageId);
                }
                Long lDateToTimestamp3 = ChannelDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(18);
                } else {
                    statement.mo5356p(18, lDateToTimestamp3.longValue());
                }
                Long lDateToTimestamp4 = ChannelDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp4 == null) {
                    statement.mo5359u(19);
                } else {
                    statement.mo5356p(19, lDateToTimestamp4.longValue());
                }
                Long lDateToTimestamp5 = ChannelDao_Impl.this.__dateConverter.dateToTimestamp(entity.getDeletedAt());
                if (lDateToTimestamp5 == null) {
                    statement.mo5359u(20);
                } else {
                    statement.mo5356p(20, lDateToTimestamp5.longValue());
                }
                String strMapToString = ChannelDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(21);
                } else {
                    statement.mo5354L(21, strMapToString);
                }
                statement.mo5356p(22, ChannelDao_Impl.this.__syncStatusConverter.syncStatusToString(entity.getSyncStatus()));
                statement.mo5354L(23, entity.getTeam());
                String strSortedSetToString = ChannelDao_Impl.this.__setConverter.sortedSetToString(entity.getOwnCapabilities());
                if (strSortedSetToString == null) {
                    statement.mo5359u(24);
                } else {
                    statement.mo5354L(24, strSortedSetToString);
                }
                String strMemberToString = ChannelDao_Impl.this.__memberConverter.memberToString(entity.getMembership());
                if (strMemberToString == null) {
                    statement.mo5359u(25);
                } else {
                    statement.mo5354L(25, strMemberToString);
                }
                String strLocationListToString = ChannelDao_Impl.this.__locationConverter.locationListToString(entity.getActiveLiveLocations());
                if (strLocationListToString == null) {
                    statement.mo5359u(26);
                } else {
                    statement.mo5354L(26, strLocationListToString);
                }
                Integer messageCount = entity.getMessageCount();
                if (messageCount == null) {
                    statement.mo5359u(27);
                } else {
                    statement.mo5356p(27, messageCount.intValue());
                }
                statement.mo5354L(28, entity.getCid());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ArrayList m54675a(ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectCidsBySyncNeeded$lambda$3("SELECT cid FROM stream_chat_channel_state WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", channelDao_Impl, syncStatus, i13, interfaceC33687a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m54676b(String str, List list, ChannelDao_Impl channelDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) select$lambda$7(str, list, channelDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ArrayList m54677c(ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectSyncNeeded$lambda$5("SELECT * FROM stream_chat_channel_state WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", channelDao_Impl, syncStatus, i13, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 delete$lambda$10(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$14(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ArrayList m54679e(InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectAllCids$lambda$2("SELECT cid FROM stream_chat_channel_state", interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insert$lambda$0(ChannelDao_Impl channelDao_Impl, ChannelEntity channelEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        channelDao_Impl.__insertAdapterOfChannelEntity.insert(_connection, channelEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertMany$lambda$1(ChannelDao_Impl channelDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        channelDao_Impl.__insertAdapterOfChannelEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    private static final List select$lambda$7(String str, List list, ChannelDao_Impl channelDao_Impl, InterfaceC33687a _connection) throws Exception {
        Boolean boolValueOf;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i13, (String) it.next());
                i13++;
            }
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cooldown");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdByUserId");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "filterTags");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "frozen");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hidden");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hideMessagesBefore");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, QueryChannelRequest.KEY_MEMBERS);
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberCount");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "watcherIds");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "watcherCount");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reads");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageAt");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageId");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "team");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "ownCapabilities");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "membership");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activeLiveLocations");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageCount");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                int i14 = iM60658N2;
                int i15 = iM60658N3;
                int i16 = (int) interfaceC33689cMo68212g1.getLong(iM60658N5);
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                Integer numValueOf = null;
                int i17 = iM60658N;
                List<String> stringList = channelDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0;
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N9));
                if (numValueOf2 != null) {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                } else {
                    boolValueOf = null;
                }
                Date dateFromTimestamp = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N10)));
                Map<String, MemberEntity> mapStringToMemberMap = channelDao_Impl.__mapConverter.stringToMemberMap(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11));
                if (mapStringToMemberMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>', but it was NULL.");
                }
                int i18 = (int) interfaceC33689cMo68212g1.getLong(iM60658N12);
                int i19 = iM60658N4;
                List<String> stringList2 = channelDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i24 = iM60658N14;
                int i25 = (int) interfaceC33689cMo68212g1.getLong(i24);
                int i26 = iM60658N15;
                Map<String, ChannelUserReadEntity> mapStringToReadMap = channelDao_Impl.__mapConverter.stringToReadMap(interfaceC33689cMo68212g1.isNull(i26) ? null : interfaceC33689cMo68212g1.mo5353J0(i26));
                if (mapStringToReadMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                }
                int i27 = iM60658N16;
                iM60658N16 = i27;
                Date dateFromTimestamp2 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i27) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i27)));
                int i28 = iM60658N17;
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(i28) ? null : interfaceC33689cMo68212g1.mo5353J0(i28);
                int i29 = iM60658N18;
                iM60658N14 = i24;
                Date dateFromTimestamp3 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i29) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i29)));
                int i34 = iM60658N19;
                iM60658N19 = i34;
                Date dateFromTimestamp4 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i34) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i34)));
                int i35 = iM60658N20;
                iM60658N20 = i35;
                Date dateFromTimestamp5 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = iM60658N21;
                iM60658N21 = i36;
                Map<String, Object> mapStringToMap = channelDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i36) ? null : interfaceC33689cMo68212g1.mo5353J0(i36));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                iM60658N15 = i26;
                iM60658N22 = iM60658N22;
                SyncStatus syncStatusStringToSyncStatus = channelDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N22));
                int i37 = iM60658N23;
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(i37);
                iM60658N24 = iM60658N24;
                iM60658N23 = i37;
                Set<String> setStringToSortedSet = channelDao_Impl.__setConverter.stringToSortedSet(interfaceC33689cMo68212g1.isNull(iM60658N24) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N24));
                int i38 = iM60658N25;
                iM60658N25 = i38;
                MemberEntity memberEntityStringToMemberMap = channelDao_Impl.__memberConverter.stringToMemberMap(interfaceC33689cMo68212g1.isNull(i38) ? null : interfaceC33689cMo68212g1.mo5353J0(i38));
                int i39 = iM60658N26;
                iM60658N26 = i39;
                List<LocationEntity> listStringToLocationList = channelDao_Impl.__locationConverter.stringToLocationList(interfaceC33689cMo68212g1.isNull(i39) ? null : interfaceC33689cMo68212g1.mo5353J0(i39));
                if (listStringToLocationList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>', but it was NULL.");
                }
                int i44 = iM60658N27;
                if (!interfaceC33689cMo68212g1.isNull(i44)) {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i44));
                }
                ChannelEntity channelEntity = new ChannelEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, i16, strMo5353J4, stringList, z4, boolValueOf, dateFromTimestamp, mapStringToMemberMap, i18, stringList2, i25, mapStringToReadMap, dateFromTimestamp2, strMo5353J5, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, mapStringToMap, syncStatusStringToSyncStatus, strMo5353J6, setStringToSortedSet, memberEntityStringToMemberMap, listStringToLocationList, numValueOf);
                int i45 = iM60658N28;
                channelEntity.setCid(interfaceC33689cMo68212g1.mo5353J0(i45));
                arrayList.add(channelEntity);
                iM60658N27 = i44;
                iM60658N28 = i45;
                iM60658N17 = i28;
                iM60658N2 = i14;
                iM60658N3 = i15;
                iM60658N = i17;
                iM60658N18 = i29;
                iM60658N4 = i19;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelEntity select$lambda$9(String str, String str2, ChannelDao_Impl channelDao_Impl, InterfaceC33687a _connection) throws Exception {
        Boolean boolValueOf;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            if (str2 == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str2);
            }
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cooldown");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdByUserId");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "filterTags");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "frozen");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hidden");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hideMessagesBefore");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, QueryChannelRequest.KEY_MEMBERS);
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberCount");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "watcherIds");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "watcherCount");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reads");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageAt");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageId");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "team");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "ownCapabilities");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "membership");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activeLiveLocations");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageCount");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            ChannelEntity channelEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N5);
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                List<String> stringList = channelDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0;
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N9));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                } else {
                    boolValueOf = null;
                }
                Date dateFromTimestamp = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N10)));
                Map<String, MemberEntity> mapStringToMemberMap = channelDao_Impl.__mapConverter.stringToMemberMap(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11));
                if (mapStringToMemberMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>', but it was NULL.");
                }
                int i14 = (int) interfaceC33689cMo68212g1.getLong(iM60658N12);
                List<String> stringList2 = channelDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i15 = (int) interfaceC33689cMo68212g1.getLong(iM60658N14);
                Map<String, ChannelUserReadEntity> mapStringToReadMap = channelDao_Impl.__mapConverter.stringToReadMap(interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15));
                if (mapStringToReadMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                }
                Date dateFromTimestamp2 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N16) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N16)));
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(iM60658N17) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N17);
                Date dateFromTimestamp3 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N18)));
                Date dateFromTimestamp4 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N19)));
                Date dateFromTimestamp5 = channelDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N20)));
                Map<String, Object> mapStringToMap = channelDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                SyncStatus syncStatusStringToSyncStatus = channelDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N22));
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N23);
                Set<String> setStringToSortedSet = channelDao_Impl.__setConverter.stringToSortedSet(interfaceC33689cMo68212g1.isNull(iM60658N24) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N24));
                MemberEntity memberEntityStringToMemberMap = channelDao_Impl.__memberConverter.stringToMemberMap(interfaceC33689cMo68212g1.isNull(iM60658N25) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N25));
                List<LocationEntity> listStringToLocationList = channelDao_Impl.__locationConverter.stringToLocationList(interfaceC33689cMo68212g1.isNull(iM60658N26) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N26));
                if (listStringToLocationList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>', but it was NULL.");
                }
                ChannelEntity channelEntity2 = new ChannelEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, i13, strMo5353J4, stringList, z4, boolValueOf, dateFromTimestamp, mapStringToMemberMap, i14, stringList2, i15, mapStringToReadMap, dateFromTimestamp2, strMo5353J5, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, mapStringToMap, syncStatusStringToSyncStatus, strMo5353J6, setStringToSortedSet, memberEntityStringToMemberMap, listStringToLocationList, interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N27)));
                channelEntity2.setCid(interfaceC33689cMo68212g1.mo5353J0(iM60658N28));
                channelEntity = channelEntity2;
            }
            interfaceC33689cMo68212g1.close();
            return channelEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectAllCids$lambda$2(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(interfaceC33689cMo68212g1.mo5353J0(0));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectCidsBySyncNeeded$lambda$3(String str, ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, channelDao_Impl.__syncStatusConverter.syncStatusToString(syncStatus));
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(interfaceC33689cMo68212g1.mo5353J0(0));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectSyncNeeded$lambda$5(String str, ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a _connection) throws Exception {
        Boolean boolValueOf;
        ChannelDao_Impl channelDao_Impl2 = channelDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, channelDao_Impl2.__syncStatusConverter.syncStatusToString(syncStatus));
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cooldown");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdByUserId");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "filterTags");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "frozen");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hidden");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hideMessagesBefore");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, QueryChannelRequest.KEY_MEMBERS);
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberCount");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "watcherIds");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "watcherCount");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reads");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageAt");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageId");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "team");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "ownCapabilities");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "membership");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activeLiveLocations");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageCount");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                int i14 = iM60658N;
                int i15 = iM60658N2;
                int i16 = (int) interfaceC33689cMo68212g1.getLong(iM60658N5);
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                Integer numValueOf = null;
                List<String> stringList = channelDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i17 = iM60658N3;
                int i18 = iM60658N4;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0;
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N9));
                if (numValueOf2 != null) {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                } else {
                    boolValueOf = null;
                }
                Date dateFromTimestamp = channelDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N10)));
                Map<String, MemberEntity> mapStringToMemberMap = channelDao_Impl2.__mapConverter.stringToMemberMap(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11));
                if (mapStringToMemberMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>', but it was NULL.");
                }
                int i19 = (int) interfaceC33689cMo68212g1.getLong(iM60658N12);
                List<String> stringList2 = channelDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i24 = iM60658N14;
                int i25 = iM60658N5;
                int i26 = (int) interfaceC33689cMo68212g1.getLong(i24);
                int i27 = iM60658N15;
                Map<String, ChannelUserReadEntity> mapStringToReadMap = channelDao_Impl2.__mapConverter.stringToReadMap(interfaceC33689cMo68212g1.isNull(i27) ? null : interfaceC33689cMo68212g1.mo5353J0(i27));
                if (mapStringToReadMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                }
                int i28 = iM60658N16;
                Date dateFromTimestamp2 = channelDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i28) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i28)));
                int i29 = iM60658N17;
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29);
                int i34 = iM60658N18;
                Date dateFromTimestamp3 = channelDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i34) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i34)));
                int i35 = iM60658N19;
                iM60658N19 = i35;
                Date dateFromTimestamp4 = channelDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = iM60658N20;
                iM60658N20 = i36;
                Date dateFromTimestamp5 = channelDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = iM60658N21;
                iM60658N21 = i37;
                Map<String, Object> mapStringToMap = channelDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i37) ? null : interfaceC33689cMo68212g1.mo5353J0(i37));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                iM60658N15 = i27;
                iM60658N16 = i28;
                int i38 = iM60658N22;
                SyncStatus syncStatusStringToSyncStatus = channelDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(i38));
                int i39 = iM60658N23;
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(i39);
                iM60658N24 = iM60658N24;
                iM60658N22 = i38;
                Set<String> setStringToSortedSet = channelDao_Impl2.__setConverter.stringToSortedSet(interfaceC33689cMo68212g1.isNull(iM60658N24) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N24));
                int i44 = iM60658N25;
                iM60658N25 = i44;
                MemberEntity memberEntityStringToMemberMap = channelDao_Impl2.__memberConverter.stringToMemberMap(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                int i45 = iM60658N26;
                iM60658N26 = i45;
                List<LocationEntity> listStringToLocationList = channelDao_Impl2.__locationConverter.stringToLocationList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (listStringToLocationList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>', but it was NULL.");
                }
                int i46 = iM60658N27;
                if (!interfaceC33689cMo68212g1.isNull(i46)) {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i46));
                }
                ChannelEntity channelEntity = new ChannelEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, i16, strMo5353J4, stringList, z4, boolValueOf, dateFromTimestamp, mapStringToMemberMap, i19, stringList2, i26, mapStringToReadMap, dateFromTimestamp2, strMo5353J5, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, mapStringToMap, syncStatusStringToSyncStatus, strMo5353J6, setStringToSortedSet, memberEntityStringToMemberMap, listStringToLocationList, numValueOf);
                int i47 = iM60658N28;
                channelEntity.setCid(interfaceC33689cMo68212g1.mo5353J0(i47));
                arrayList.add(channelEntity);
                iM60658N5 = i25;
                iM60658N14 = i24;
                iM60658N17 = i29;
                iM60658N18 = i34;
                channelDao_Impl2 = channelDao_Impl;
                iM60658N27 = i46;
                iM60658N23 = i39;
                iM60658N28 = i47;
                iM60658N = i14;
                iM60658N2 = i15;
                iM60658N4 = i18;
                iM60658N3 = i17;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setDeletedAt$lambda$11(String str, ChannelDao_Impl channelDao_Impl, Date date, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Long lDateToTimestamp = channelDao_Impl.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5356p(1, lDateToTimestamp.longValue());
            }
            interfaceC33689cMo68212g1.mo5354L(2, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setHidden$lambda$12(String str, boolean z4, ChannelDao_Impl channelDao_Impl, Date date, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, z4 ? 1L : 0L);
            Long lDateToTimestamp = channelDao_Impl.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5356p(2, lDateToTimestamp.longValue());
            }
            interfaceC33689cMo68212g1.mo5354L(3, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setHidden$lambda$13(String str, boolean z4, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, z4 ? 1L : 0L);
            interfaceC33689cMo68212g1.mo5354L(2, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object delete(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C17632d(str, 4), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(7), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object insert(ChannelEntity channelEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C16574h(21, this, channelEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object insertMany(List<ChannelEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C16574h(19, this, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object select(List<String> list, InterfaceC30057d<? super List<ChannelEntity>> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT * FROM stream_chat_channel_state WHERE stream_chat_channel_state.cid IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return AbstractC15751g.m44434N(this.__db, true, false, new C18468h(string, list, this, 7), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object selectAllCids(InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19031a(6), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object selectCidsBySyncNeeded(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19144a(this, syncStatus, i13, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object selectSyncNeeded(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<ChannelEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19144a(this, syncStatus, i13, 0), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object setDeletedAt(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C18468h(this, date, str, 8), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object setHidden(String str, boolean z4, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C4614e(z4, this, date, str, 9), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object setHidden(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C1945f(z4, str, 4), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao
    public final Object select(String str, InterfaceC30057d<? super ChannelEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C16574h(20, str, this), interfaceC30057d);
    }
}
