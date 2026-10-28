package io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal;

import am2.C1042s;
import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.mapbox.maps.MapboxMap;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import ge3.AbstractC15751g;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.SyncStatusConverter;
import io.getstream.chat.android.models.SyncStatus;
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
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J*\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b \u0010!J(\u0010$\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bH\u0096@¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0006058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "reactionEntity", "Ll83/a0;", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;", "delete", "", "id", "selectReactionById", "(ILq83/d;)Ljava/lang/Object;", "", "ids", "selectReactionsByIds", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", MapboxMap.QFE_LIMIT, "selectIdsSyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;", "selectSyncStatus", "", "reactionType", "messageId", "userId", "selectUserReactionToMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectUserReactionsToMessage", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ljava/util/Date;", "deletedAt", "setDeleteAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfReactionEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "__syncStatusConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "Landroidx/room/i;", "__deleteAdapterOfReactionEntity", "Landroidx/room/i;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionDao_Impl implements ReactionDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final AbstractC1794i __deleteAdapterOfReactionEntity;
    private final ExtraDataConverter __extraDataConverter;
    private final AbstractC1802k __insertAdapterOfReactionEntity;
    private final SyncStatusConverter __syncStatusConverter;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl$2 */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"io/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$2", "Landroidx/room/i;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "", "createQuery", "()Ljava/lang/String;", "Ltb/c;", "statement", "entity", "Ll83/a0;", "bind", "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192302 extends AbstractC1794i {
        @Override // androidx.room.AbstractC1794i
        public final String createQuery() {
            return "DELETE FROM `stream_chat_reaction` WHERE `id` = ?";
        }

        @Override // androidx.room.AbstractC1794i
        public final void bind(InterfaceC33689c statement, ReactionEntity entity) {
            AbstractC22676k.m65750j(statement, "statement");
            AbstractC22676k.m65750j(entity, "entity");
            statement.mo5356p(1, entity.getId());
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReactionDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__dateConverter = new DateConverter();
        this.__extraDataConverter = new ExtraDataConverter();
        this.__syncStatusConverter = new SyncStatusConverter();
        this.__db = __db;
        this.__insertAdapterOfReactionEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_reaction` (`messageId`,`userId`,`type`,`score`,`createdAt`,`createdLocallyAt`,`updatedAt`,`deletedAt`,`enforceUnique`,`skipPush`,`emojiCode`,`extraData`,`syncStatus`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ReactionEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getMessageId());
                statement.mo5354L(2, entity.getUserId());
                statement.mo5354L(3, entity.getType());
                statement.mo5356p(4, entity.getScore());
                Long lDateToTimestamp = ReactionDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(5);
                } else {
                    statement.mo5356p(5, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = ReactionDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedLocallyAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(6);
                } else {
                    statement.mo5356p(6, lDateToTimestamp2.longValue());
                }
                Long lDateToTimestamp3 = ReactionDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5356p(7, lDateToTimestamp3.longValue());
                }
                Long lDateToTimestamp4 = ReactionDao_Impl.this.__dateConverter.dateToTimestamp(entity.getDeletedAt());
                if (lDateToTimestamp4 == null) {
                    statement.mo5359u(8);
                } else {
                    statement.mo5356p(8, lDateToTimestamp4.longValue());
                }
                statement.mo5356p(9, entity.getEnforceUnique() ? 1L : 0L);
                statement.mo5356p(10, entity.getSkipPush() ? 1L : 0L);
                String emojiCode = entity.getEmojiCode();
                if (emojiCode == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5354L(11, emojiCode);
                }
                String strMapToString = ReactionDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5354L(12, strMapToString);
                }
                statement.mo5356p(13, ReactionDao_Impl.this.__syncStatusConverter.syncStatusToString(entity.getSyncStatus()));
                statement.mo5356p(14, entity.getId());
            }
        };
        this.__deleteAdapterOfReactionEntity = new C192302();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ArrayList m54753d(ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectIdsSyncStatus$lambda$4("SELECT id FROM stream_chat_reaction WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", reactionDao_Impl, syncStatus, i13, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 delete$lambda$1(ReactionDao_Impl reactionDao_Impl, ReactionEntity reactionEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        reactionDao_Impl.__deleteAdapterOfReactionEntity.handle(_connection, reactionEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$9(String str, InterfaceC33687a _connection) throws Exception {
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
    public static /* synthetic */ ArrayList m54755f(String str, List list, ReactionDao_Impl reactionDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectReactionsByIds$lambda$3(str, list, reactionDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ArrayList m54758i(String str, String str2, ReactionDao_Impl reactionDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectUserReactionsToMessage$lambda$7("SELECT * FROM stream_chat_reaction WHERE stream_chat_reaction.messageid = ? AND userId = ?", str, str2, reactionDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insert$lambda$0(ReactionDao_Impl reactionDao_Impl, ReactionEntity reactionEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        reactionDao_Impl.__insertAdapterOfReactionEntity.insert(_connection, reactionEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ArrayList m54759j(ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectSyncStatus$lambda$5("SELECT * FROM stream_chat_reaction WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", reactionDao_Impl, syncStatus, i13, interfaceC33687a);
    }

    private static final List selectIdsSyncStatus$lambda$4(String str, ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, reactionDao_Impl.__syncStatusConverter.syncStatusToString(syncStatus));
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(0)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
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
    public static final ReactionEntity selectReactionById$lambda$2(String str, int i13, ReactionDao_Impl reactionDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "userId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "score");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdLocallyAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enforceUnique");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPush");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "emojiCode");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ReactionEntity reactionEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i14 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                Date dateFromTimestamp = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N5)));
                Date dateFromTimestamp2 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp3 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp4 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0;
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                Map<String, Object> mapStringToMap = reactionDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                ReactionEntity reactionEntity2 = new ReactionEntity(strMo5353J0, strMo5353J1, strMo5353J2, i14, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, z4, z13, strMo5353J3, mapStringToMap, reactionDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N13)));
                reactionEntity2.setId((int) interfaceC33689cMo68212g1.getLong(iM60658N14));
                reactionEntity = reactionEntity2;
            }
            interfaceC33689cMo68212g1.close();
            return reactionEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectReactionsByIds$lambda$3(String str, List list, ReactionDao_Impl reactionDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5356p(i13, ((Number) it.next()).intValue());
                i13++;
            }
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "userId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "score");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdLocallyAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enforceUnique");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPush");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "emojiCode");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i14 = iM60658N2;
                int i15 = iM60658N3;
                int i16 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                int i17 = iM60658N;
                Date dateFromTimestamp = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N5)));
                Date dateFromTimestamp2 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp3 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp4 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0;
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                Map<String, Object> mapStringToMap = reactionDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                ReactionEntity reactionEntity = new ReactionEntity(strMo5353J0, strMo5353J1, strMo5353J2, i16, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, z4, z13, strMo5353J3, mapStringToMap, reactionDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N13)));
                int i18 = iM60658N14;
                reactionEntity.setId((int) interfaceC33689cMo68212g1.getLong(i18));
                arrayList.add(reactionEntity);
                iM60658N4 = iM60658N4;
                iM60658N14 = i18;
                iM60658N3 = i15;
                iM60658N = i17;
                iM60658N2 = i14;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectSyncStatus$lambda$5(String str, ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, reactionDao_Impl.__syncStatusConverter.syncStatusToString(syncStatus));
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "userId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "score");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdLocallyAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enforceUnique");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPush");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "emojiCode");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i14 = iM60658N;
                int i15 = iM60658N2;
                int i16 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                Date dateFromTimestamp = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N5)));
                Date dateFromTimestamp2 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp3 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp4 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                ArrayList arrayList2 = arrayList;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0;
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                Map<String, Object> mapStringToMap = reactionDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                ReactionEntity reactionEntity = new ReactionEntity(strMo5353J0, strMo5353J1, strMo5353J2, i16, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, z4, z13, strMo5353J3, mapStringToMap, reactionDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N13)));
                int i17 = iM60658N14;
                reactionEntity.setId((int) interfaceC33689cMo68212g1.getLong(i17));
                arrayList2.add(reactionEntity);
                iM60658N3 = iM60658N3;
                iM60658N2 = i15;
                iM60658N14 = i17;
                iM60658N4 = iM60658N4;
                arrayList = arrayList2;
                iM60658N = i14;
            }
            ArrayList arrayList3 = arrayList;
            interfaceC33689cMo68212g1.close();
            return arrayList3;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
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
    public static final ReactionEntity selectUserReactionToMessage$lambda$6(String str, String str2, String str3, String str4, ReactionDao_Impl reactionDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5354L(2, str3);
            interfaceC33689cMo68212g1.mo5354L(3, str4);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "userId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "score");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdLocallyAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enforceUnique");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPush");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "emojiCode");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ReactionEntity reactionEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                Date dateFromTimestamp = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N5)));
                Date dateFromTimestamp2 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp3 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp4 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0;
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                Map<String, Object> mapStringToMap = reactionDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                ReactionEntity reactionEntity2 = new ReactionEntity(strMo5353J0, strMo5353J1, strMo5353J2, i13, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, z4, z13, strMo5353J3, mapStringToMap, reactionDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N13)));
                reactionEntity2.setId((int) interfaceC33689cMo68212g1.getLong(iM60658N14));
                reactionEntity = reactionEntity2;
            }
            interfaceC33689cMo68212g1.close();
            return reactionEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectUserReactionsToMessage$lambda$7(String str, String str2, String str3, ReactionDao_Impl reactionDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5354L(2, str3);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "userId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "score");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdLocallyAt");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enforceUnique");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPush");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "emojiCode");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i13 = iM60658N;
                int i14 = iM60658N2;
                int i15 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                Date dateFromTimestamp = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N5)));
                Date dateFromTimestamp2 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N6)));
                Date dateFromTimestamp3 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                Date dateFromTimestamp4 = reactionDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                int i16 = iM60658N3;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0;
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                Map<String, Object> mapStringToMap = reactionDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                ReactionEntity reactionEntity = new ReactionEntity(strMo5353J0, strMo5353J1, strMo5353J2, i15, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, z4, z13, strMo5353J3, mapStringToMap, reactionDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N13)));
                int i17 = iM60658N14;
                reactionEntity.setId((int) interfaceC33689cMo68212g1.getLong(i17));
                arrayList.add(reactionEntity);
                iM60658N4 = iM60658N4;
                iM60658N2 = i14;
                iM60658N14 = i17;
                iM60658N5 = iM60658N5;
                iM60658N3 = i16;
                iM60658N = i13;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setDeleteAt$lambda$8(String str, ReactionDao_Impl reactionDao_Impl, Date date, String str2, String str3, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Long lDateToTimestamp = reactionDao_Impl.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5356p(1, lDateToTimestamp.longValue());
            }
            interfaceC33689cMo68212g1.mo5354L(2, str2);
            interfaceC33689cMo68212g1.mo5354L(3, str3);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object delete(ReactionEntity reactionEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19233b(this, reactionEntity, 1), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(14), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object insert(ReactionEntity reactionEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19233b(this, reactionEntity, 0), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object selectIdsSyncStatus(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<Integer>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19232a(this, syncStatus, i13, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object selectReactionById(int i13, InterfaceC30057d<? super ReactionEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6516c(i13, this, 10), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object selectReactionsByIds(List<Integer> list, InterfaceC30057d<? super List<ReactionEntity>> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT * FROM stream_chat_reaction WHERE id IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return AbstractC15751g.m44434N(this.__db, true, false, new C18468h(string, list, this, 13), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object selectSyncStatus(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<ReactionEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19232a(this, syncStatus, i13, 0), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object selectUserReactionToMessage(String str, String str2, String str3, InterfaceC30057d<? super ReactionEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C1042s(str, str2, str3, this, 25), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object selectUserReactionsToMessage(String str, String str2, InterfaceC30057d<? super List<ReactionEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C18468h(str, str2, this, 12), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao
    public final Object setDeleteAt(String str, String str2, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C1042s(this, date, str, str2, 26), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }
}
