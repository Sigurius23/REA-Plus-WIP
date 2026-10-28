package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.mapbox.maps.MapboxMap;
import d62.C11740f;
import ge3.AbstractC15751g;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.MapConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.PrivacySettingsConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.PushPreferenceConverter;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;", "users", "Ll83/a0;", "insertMany", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "userEntity", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Lq83/d;)Ljava/lang/Object;", "", "ids", "select", "id", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_LIMIT, MapboxMap.QFE_OFFSET, "selectAllUser", "(II)Ljava/util/List;", "searchString", "selectUsersLikeName", "(Ljava/lang/String;II)Ljava/util/List;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfUserEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;", "__privacySettingsConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "__mapConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;", "__pushPreferenceConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserDao_Impl implements UserDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final ExtraDataConverter __extraDataConverter;
    private final AbstractC1802k __insertAdapterOfUserEntity;
    private final ListConverter __listConverter;
    private final MapConverter __mapConverter;
    private final PrivacySettingsConverter __privacySettingsConverter;
    private final PushPreferenceConverter __pushPreferenceConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public UserDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__dateConverter = new DateConverter();
        this.__privacySettingsConverter = new PrivacySettingsConverter();
        this.__listConverter = new ListConverter();
        this.__mapConverter = new MapConverter();
        this.__extraDataConverter = new ExtraDataConverter();
        this.__pushPreferenceConverter = new PushPreferenceConverter();
        this.__db = __db;
        this.__insertAdapterOfUserEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_user` (`id`,`originalId`,`name`,`image`,`role`,`createdAt`,`updatedAt`,`lastActive`,`invisible`,`privacySettings`,`banned`,`mutes`,`teams`,`teamsRole`,`extraData`,`avgResponseTime`,`pushPreference`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, UserEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                statement.mo5354L(2, entity.getOriginalId());
                statement.mo5354L(3, entity.getName());
                statement.mo5354L(4, entity.getImage());
                statement.mo5354L(5, entity.getRole());
                Long lDateToTimestamp = UserDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(6);
                } else {
                    statement.mo5356p(6, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = UserDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5356p(7, lDateToTimestamp2.longValue());
                }
                Long lDateToTimestamp3 = UserDao_Impl.this.__dateConverter.dateToTimestamp(entity.getLastActive());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(8);
                } else {
                    statement.mo5356p(8, lDateToTimestamp3.longValue());
                }
                statement.mo5356p(9, entity.getInvisible() ? 1L : 0L);
                String strPrivacySettingsToString = UserDao_Impl.this.__privacySettingsConverter.privacySettingsToString(entity.getPrivacySettings());
                if (strPrivacySettingsToString == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5354L(10, strPrivacySettingsToString);
                }
                statement.mo5356p(11, entity.getBanned() ? 1L : 0L);
                String strFromUserMuteList = UserDao_Impl.this.__listConverter.fromUserMuteList(entity.getMutes());
                if (strFromUserMuteList == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5354L(12, strFromUserMuteList);
                }
                String strFromStringList = UserDao_Impl.this.__listConverter.fromStringList(entity.getTeams());
                if (strFromStringList == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5354L(13, strFromStringList);
                }
                String strStringMapToString = UserDao_Impl.this.__mapConverter.stringMapToString(entity.getTeamsRole());
                if (strStringMapToString == null) {
                    statement.mo5359u(14);
                } else {
                    statement.mo5354L(14, strStringMapToString);
                }
                String strMapToString = UserDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(15);
                } else {
                    statement.mo5354L(15, strMapToString);
                }
                Long avgResponseTime = entity.getAvgResponseTime();
                if (avgResponseTime == null) {
                    statement.mo5359u(16);
                } else {
                    statement.mo5356p(16, avgResponseTime.longValue());
                }
                String strPushPreferenceToString = UserDao_Impl.this.__pushPreferenceConverter.pushPreferenceToString(entity.getPushPreference());
                if (strPushPreferenceToString == null) {
                    statement.mo5359u(17);
                } else {
                    statement.mo5354L(17, strPushPreferenceToString);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ArrayList m54772a(String str, List list, UserDao_Impl userDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) select$lambda$2(str, list, userDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ArrayList m54775d(int i13, int i14, UserDao_Impl userDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectAllUser$lambda$4("SELECT * FROM stream_chat_user ORDER BY name ASC LIMIT ? OFFSET ?", i13, i14, userDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$6(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ArrayList m54777f(String str, int i13, int i14, UserDao_Impl userDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectUsersLikeName$lambda$5("SELECT * FROM stream_chat_user WHERE name LIKE ? ORDER BY name ASC LIMIT ? OFFSET ?", str, i13, i14, userDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insert$lambda$1(UserDao_Impl userDao_Impl, UserEntity userEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        userDao_Impl.__insertAdapterOfUserEntity.insert(_connection, userEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertMany$lambda$0(UserDao_Impl userDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        userDao_Impl.__insertAdapterOfUserEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    private static final List select$lambda$2(String str, List list, UserDao_Impl userDao_Impl, InterfaceC33687a _connection) throws Exception {
        InterfaceC33689c interfaceC33689c;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i13, (String) it.next());
                i13++;
            }
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "originalId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "role");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastActive");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "invisible");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "privacySettings");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "banned");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mutes");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teams");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teamsRole");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avgResponseTime");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pushPreference");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                int i14 = iM60658N2;
                Date dateFromTimestamp = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp2 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp3 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                int i15 = iM60658N3;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                PrivacySettingsEntity privacySettingsEntityStringToPrivacySettings = userDao_Impl.__privacySettingsConverter.stringToPrivacySettings(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10));
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N11)) != 0;
                List<UserMuteEntity> userMuteList = userDao_Impl.__listConverter.toUserMuteList(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (userMuteList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>', but it was NULL.");
                }
                List<String> stringList = userDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i16 = iM60658N14;
                iM60658N14 = i16;
                Map<String, String> mapStringToStringMap = userDao_Impl.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                int i17 = iM60658N15;
                iM60658N15 = i17;
                Map<String, Object> mapStringToMap = userDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i18 = iM60658N16;
                int i19 = iM60658N17;
                interfaceC33689c = interfaceC33689cMo68212g1;
                try {
                    arrayList.add(new UserEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, z4, privacySettingsEntityStringToPrivacySettings, z13, userMuteList, stringList, mapStringToStringMap, mapStringToMap, interfaceC33689cMo68212g1.isNull(i18) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i18)), userDao_Impl.__pushPreferenceConverter.stringToPushPreference(interfaceC33689cMo68212g1.isNull(i19) ? null : interfaceC33689cMo68212g1.mo5353J0(i19))));
                    interfaceC33689cMo68212g1 = interfaceC33689c;
                    iM60658N16 = i18;
                    iM60658N = iM60658N;
                    iM60658N3 = i15;
                    iM60658N17 = i19;
                    iM60658N2 = i14;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689c.close();
                    throw th;
                }
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            interfaceC33689c = interfaceC33689cMo68212g1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final UserEntity select$lambda$3(String str, String str2, UserDao_Impl userDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "originalId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "role");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastActive");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "invisible");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "privacySettings");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "banned");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mutes");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teams");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teamsRole");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avgResponseTime");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pushPreference");
            UserEntity userEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                Date dateFromTimestamp = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp2 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp3 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                PrivacySettingsEntity privacySettingsEntityStringToPrivacySettings = userDao_Impl.__privacySettingsConverter.stringToPrivacySettings(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10));
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N11)) != 0;
                List<UserMuteEntity> userMuteList = userDao_Impl.__listConverter.toUserMuteList(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (userMuteList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>', but it was NULL.");
                }
                List<String> stringList = userDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                Map<String, String> mapStringToStringMap = userDao_Impl.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N14));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                Map<String, Object> mapStringToMap = userDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                userEntity = new UserEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, z4, privacySettingsEntityStringToPrivacySettings, z13, userMuteList, stringList, mapStringToStringMap, mapStringToMap, interfaceC33689cMo68212g1.isNull(iM60658N16) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N16)), userDao_Impl.__pushPreferenceConverter.stringToPushPreference(interfaceC33689cMo68212g1.isNull(iM60658N17) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N17)));
            }
            interfaceC33689cMo68212g1.close();
            return userEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectAllUser$lambda$4(String str, int i13, int i14, UserDao_Impl userDao_Impl, InterfaceC33687a _connection) throws Exception {
        InterfaceC33689c interfaceC33689c;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, i14);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "originalId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "role");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastActive");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "invisible");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "privacySettings");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "banned");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mutes");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teams");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teamsRole");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avgResponseTime");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pushPreference");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                int i15 = iM60658N2;
                Date dateFromTimestamp = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp2 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp3 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                PrivacySettingsEntity privacySettingsEntityStringToPrivacySettings = userDao_Impl.__privacySettingsConverter.stringToPrivacySettings(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10));
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N11)) != 0;
                List<UserMuteEntity> userMuteList = userDao_Impl.__listConverter.toUserMuteList(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (userMuteList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>', but it was NULL.");
                }
                List<String> stringList = userDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i16 = iM60658N14;
                iM60658N14 = i16;
                Map<String, String> mapStringToStringMap = userDao_Impl.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                int i17 = iM60658N15;
                iM60658N15 = i17;
                Map<String, Object> mapStringToMap = userDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i18 = iM60658N16;
                int i19 = iM60658N17;
                interfaceC33689c = interfaceC33689cMo68212g1;
                try {
                    arrayList.add(new UserEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, z4, privacySettingsEntityStringToPrivacySettings, z13, userMuteList, stringList, mapStringToStringMap, mapStringToMap, interfaceC33689cMo68212g1.isNull(i18) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i18)), userDao_Impl.__pushPreferenceConverter.stringToPushPreference(interfaceC33689cMo68212g1.isNull(i19) ? null : interfaceC33689cMo68212g1.mo5353J0(i19))));
                    interfaceC33689cMo68212g1 = interfaceC33689c;
                    iM60658N16 = i18;
                    iM60658N = iM60658N;
                    iM60658N17 = i19;
                    iM60658N2 = i15;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689c.close();
                    throw th;
                }
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            interfaceC33689c = interfaceC33689cMo68212g1;
        }
    }

    private static final List selectUsersLikeName$lambda$5(String str, String str2, int i13, int i14, UserDao_Impl userDao_Impl, InterfaceC33687a _connection) throws Exception {
        InterfaceC33689c interfaceC33689c;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            interfaceC33689cMo68212g1.mo5356p(3, i14);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "originalId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "role");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastActive");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "invisible");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "privacySettings");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "banned");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mutes");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teams");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teamsRole");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avgResponseTime");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pushPreference");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                int i15 = iM60658N2;
                Date dateFromTimestamp = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp2 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp3 = userDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                PrivacySettingsEntity privacySettingsEntityStringToPrivacySettings = userDao_Impl.__privacySettingsConverter.stringToPrivacySettings(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10));
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N11)) != 0;
                List<UserMuteEntity> userMuteList = userDao_Impl.__listConverter.toUserMuteList(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (userMuteList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>', but it was NULL.");
                }
                List<String> stringList = userDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i16 = iM60658N14;
                iM60658N14 = i16;
                Map<String, String> mapStringToStringMap = userDao_Impl.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                int i17 = iM60658N15;
                iM60658N15 = i17;
                Map<String, Object> mapStringToMap = userDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i18 = iM60658N16;
                int i19 = iM60658N17;
                interfaceC33689c = interfaceC33689cMo68212g1;
                iM60658N16 = i18;
                try {
                    arrayList.add(new UserEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, z4, privacySettingsEntityStringToPrivacySettings, z13, userMuteList, stringList, mapStringToStringMap, mapStringToMap, interfaceC33689cMo68212g1.isNull(i18) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i18)), userDao_Impl.__pushPreferenceConverter.stringToPushPreference(interfaceC33689cMo68212g1.isNull(i19) ? null : interfaceC33689cMo68212g1.mo5353J0(i19))));
                    interfaceC33689cMo68212g1 = interfaceC33689c;
                    iM60658N17 = i19;
                    iM60658N2 = i15;
                    iM60658N = iM60658N;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689c.close();
                    throw th;
                }
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            interfaceC33689c = interfaceC33689cMo68212g1;
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(18), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao
    public final Object insert(UserEntity userEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(11, this, userEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao
    public final Object insertMany(List<UserEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(9, this, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao
    public final Object select(List<String> list, InterfaceC30057d<? super List<UserEntity>> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT * FROM stream_chat_user WHERE stream_chat_user.id IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return AbstractC15751g.m44434N(this.__db, true, false, new C18468h(string, list, this, 15), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao
    public final List<UserEntity> selectAllUser(int limit, int offset) {
        return (List) AbstractC15751g.m44432L(this.__db, true, false, new C11740f(limit, offset, this));
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao
    public final List<UserEntity> selectUsersLikeName(String searchString, int limit, int offset) {
        AbstractC22676k.m65750j(searchString, "searchString");
        return (List) AbstractC15751g.m44432L(this.__db, true, false, new C19254a(searchString, limit, offset, this));
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao
    public final Object select(String str, InterfaceC30057d<? super UserEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19223a(10, str, this), interfaceC30057d);
    }
}
