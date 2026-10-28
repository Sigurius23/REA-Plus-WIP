package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import ht2.C17632d;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Collection;
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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;", "thread", "Ll83/a0;", "insertThread", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lq83/d;)Ljava/lang/Object;", "", "threads", "insertThreads", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "id", "selectThread", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "ids", "selectThreads", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "cid", "deleteThreads", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfThreadEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadDao_Impl implements ThreadDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final ExtraDataConverter __extraDataConverter;
    private final AbstractC1802k __insertAdapterOfThreadEntity;
    private final ListConverter __listConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ThreadDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__listConverter = new ListConverter();
        this.__dateConverter = new DateConverter();
        this.__extraDataConverter = new ExtraDataConverter();
        this.__db = __db;
        this.__insertAdapterOfThreadEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_thread` (`parentMessageId`,`cid`,`createdByUserId`,`activeParticipantCount`,`participantCount`,`threadParticipants`,`lastMessageAt`,`createdAt`,`updatedAt`,`deletedAt`,`title`,`read`,`latestReplyIds`,`extraData`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ThreadEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getParentMessageId());
                statement.mo5354L(2, entity.getCid());
                statement.mo5354L(3, entity.getCreatedByUserId());
                statement.mo5356p(4, entity.getActiveParticipantCount());
                statement.mo5356p(5, entity.getParticipantCount());
                String strFromThreadParticipantList = ThreadDao_Impl.this.__listConverter.fromThreadParticipantList(entity.getThreadParticipants());
                if (strFromThreadParticipantList == null) {
                    statement.mo5359u(6);
                } else {
                    statement.mo5354L(6, strFromThreadParticipantList);
                }
                Long lDateToTimestamp = ThreadDao_Impl.this.__dateConverter.dateToTimestamp(entity.getLastMessageAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5356p(7, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = ThreadDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(8);
                } else {
                    statement.mo5356p(8, lDateToTimestamp2.longValue());
                }
                Long lDateToTimestamp3 = ThreadDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(9);
                } else {
                    statement.mo5356p(9, lDateToTimestamp3.longValue());
                }
                Long lDateToTimestamp4 = ThreadDao_Impl.this.__dateConverter.dateToTimestamp(entity.getDeletedAt());
                if (lDateToTimestamp4 == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5356p(10, lDateToTimestamp4.longValue());
                }
                statement.mo5354L(11, entity.getTitle());
                String strFromReadList = ThreadDao_Impl.this.__listConverter.fromReadList(entity.getRead());
                if (strFromReadList == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5354L(12, strFromReadList);
                }
                String strFromStringList = ThreadDao_Impl.this.__listConverter.fromStringList(entity.getLatestReplyIds());
                if (strFromStringList == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5354L(13, strFromStringList);
                }
                String strMapToString = ThreadDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(14);
                } else {
                    statement.mo5354L(14, strMapToString);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ArrayList m54763a(String str, Collection collection, ThreadDao_Impl threadDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectThreads$lambda$3(str, collection, threadDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$5(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteThreads$lambda$4(String str, String str2, InterfaceC33687a _connection) throws Exception {
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
    public static final C23454a0 insertThread$lambda$0(ThreadDao_Impl threadDao_Impl, ThreadEntity threadEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        threadDao_Impl.__insertAdapterOfThreadEntity.insert(_connection, threadEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertThreads$lambda$1(ThreadDao_Impl threadDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        threadDao_Impl.__insertAdapterOfThreadEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
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
    public static final ThreadEntity selectThread$lambda$2(String str, String str2, ThreadDao_Impl threadDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentMessageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdByUserId");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activeParticipantCount");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "participantCount");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipants");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "title");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "read");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "latestReplyIds");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            ThreadEntity threadEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                int i14 = (int) interfaceC33689cMo68212g1.getLong(iM60658N5);
                List<ThreadParticipantEntity> threadParticipantList = threadDao_Impl.__listConverter.toThreadParticipantList(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6));
                if (threadParticipantList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.threads.`internal`.ThreadParticipantEntity>', but it was NULL.");
                }
                Date dateFromTimestamp = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                if (dateFromTimestamp == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                Date dateFromTimestamp2 = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                if (dateFromTimestamp2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                Date dateFromTimestamp3 = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N9)));
                if (dateFromTimestamp3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                Date dateFromTimestamp4 = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N10)));
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                List<ChannelUserReadEntity> readList = threadDao_Impl.__listConverter.toReadList(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (readList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                }
                List<String> stringList = threadDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                Map<String, Object> mapStringToMap = threadDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N14));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                threadEntity = new ThreadEntity(strMo5353J0, strMo5353J1, strMo5353J2, i13, i14, threadParticipantList, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, strMo5353J3, readList, stringList, mapStringToMap);
            }
            interfaceC33689cMo68212g1.close();
            return threadEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectThreads$lambda$3(String str, Collection collection, ThreadDao_Impl threadDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = collection.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i13, (String) it.next());
                i13++;
            }
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentMessageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdByUserId");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activeParticipantCount");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "participantCount");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipants");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastMessageAt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "title");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "read");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "latestReplyIds");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i14 = iM60658N;
                int i15 = iM60658N2;
                int i16 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                int i17 = (int) interfaceC33689cMo68212g1.getLong(iM60658N5);
                List<ThreadParticipantEntity> threadParticipantList = threadDao_Impl.__listConverter.toThreadParticipantList(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6));
                if (threadParticipantList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.threads.`internal`.ThreadParticipantEntity>', but it was NULL.");
                }
                Date dateFromTimestamp = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N7)));
                if (dateFromTimestamp == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                int i18 = iM60658N3;
                Date dateFromTimestamp2 = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N8)));
                if (dateFromTimestamp2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                Date dateFromTimestamp3 = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N9)));
                if (dateFromTimestamp3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                Date dateFromTimestamp4 = threadDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N10)));
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                List<ChannelUserReadEntity> readList = threadDao_Impl.__listConverter.toReadList(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (readList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                }
                List<String> stringList = threadDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i19 = iM60658N14;
                Map<String, Object> mapStringToMap = threadDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i19) ? null : interfaceC33689cMo68212g1.mo5353J0(i19));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                arrayList.add(new ThreadEntity(strMo5353J0, strMo5353J1, strMo5353J2, i16, i17, threadParticipantList, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, strMo5353J3, readList, stringList, mapStringToMap));
                iM60658N2 = i15;
                iM60658N14 = i19;
                iM60658N3 = i18;
                iM60658N = i14;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(16), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao
    public final Object deleteThreads(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C17632d(str, 8), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao
    public final Object insertThread(ThreadEntity threadEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(4, this, threadEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao
    public final Object insertThreads(List<ThreadEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(5, this, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao
    public final Object selectThread(String str, InterfaceC30057d<? super ThreadEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19223a(6, str, this), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao
    public final Object selectThreads(Collection<String> collection, InterfaceC30057d<? super List<ThreadEntity>> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT * FROM stream_chat_thread WHERE parentMessageId in (");
        AbstractC29125c.m88533j(collection.size(), sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return AbstractC15751g.m44434N(this.__db, true, false, new C18468h(string, collection, this, 14), interfaceC30057d);
    }
}
