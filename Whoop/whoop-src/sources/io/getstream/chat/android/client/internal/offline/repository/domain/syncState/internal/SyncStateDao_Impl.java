package io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import j93.InterfaceC21461d;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;", "syncStateEntity", "Ll83/a0;", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;Lq83/d;)Ljava/lang/Object;", "", "userId", "select", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfSyncStateEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SyncStateDao_Impl implements SyncStateDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfSyncStateEntity;
    private final ListConverter __listConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SyncStateDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__listConverter = new ListConverter();
        this.__dateConverter = new DateConverter();
        this.__db = __db;
        this.__insertAdapterOfSyncStateEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_sync_state` (`userId`,`activeChannelIds`,`lastSyncedAt`,`rawLastSyncedAt`,`markedAllReadAt`) VALUES (?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, SyncStateEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getUserId());
                String strFromStringList = SyncStateDao_Impl.this.__listConverter.fromStringList(entity.getActiveChannelIds());
                if (strFromStringList == null) {
                    statement.mo5359u(2);
                } else {
                    statement.mo5354L(2, strFromStringList);
                }
                Long lDateToTimestamp = SyncStateDao_Impl.this.__dateConverter.dateToTimestamp(entity.getLastSyncedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(3);
                } else {
                    statement.mo5356p(3, lDateToTimestamp.longValue());
                }
                String rawLastSyncedAt = entity.getRawLastSyncedAt();
                if (rawLastSyncedAt == null) {
                    statement.mo5359u(4);
                } else {
                    statement.mo5354L(4, rawLastSyncedAt);
                }
                Long lDateToTimestamp2 = SyncStateDao_Impl.this.__dateConverter.dateToTimestamp(entity.getMarkedAllReadAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(5);
                } else {
                    statement.mo5356p(5, lDateToTimestamp2.longValue());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$2(String str, InterfaceC33687a _connection) throws Exception {
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
    public static final C23454a0 insert$lambda$0(SyncStateDao_Impl syncStateDao_Impl, SyncStateEntity syncStateEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        syncStateDao_Impl.__insertAdapterOfSyncStateEntity.insert(_connection, syncStateEntity);
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
    public static final SyncStateEntity select$lambda$1(String str, String str2, SyncStateDao_Impl syncStateDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "userId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activeChannelIds");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastSyncedAt");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "rawLastSyncedAt");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "markedAllReadAt");
            SyncStateEntity syncStateEntity = null;
            Long lValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                List<String> stringList = syncStateDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                Date dateFromTimestamp = syncStateDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N3)));
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N5)) {
                    lValueOf = Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N5));
                }
                syncStateEntity = new SyncStateEntity(strMo5353J0, stringList, dateFromTimestamp, strMo5353J1, syncStateDao_Impl.__dateConverter.fromTimestamp(lValueOf));
            }
            interfaceC33689cMo68212g1.close();
            return syncStateEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(15), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao
    public final Object insert(SyncStateEntity syncStateEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(2, this, syncStateEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao
    public final Object select(String str, InterfaceC30057d<? super SyncStateEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19223a(3, str, this), interfaceC30057d);
    }
}
