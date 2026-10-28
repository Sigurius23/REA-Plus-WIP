package io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.FilterObjectConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.NullableMapConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.QuerySortConverter;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import j93.InterfaceC21461d;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;", "queryChannelsEntity", "Ll83/a0;", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Lq83/d;)Ljava/lang/Object;", "", "id", "select", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfQueryChannelsEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;", "__filterObjectConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;", "__querySortConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;", "__nullableMapConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsDao_Impl implements QueryChannelsDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final AbstractC1848z0 __db;
    private final FilterObjectConverter __filterObjectConverter;
    private final AbstractC1802k __insertAdapterOfQueryChannelsEntity;
    private final ListConverter __listConverter;
    private final NullableMapConverter __nullableMapConverter;
    private final QuerySortConverter __querySortConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public QueryChannelsDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__filterObjectConverter = new FilterObjectConverter();
        this.__querySortConverter = new QuerySortConverter();
        this.__listConverter = new ListConverter();
        this.__nullableMapConverter = new NullableMapConverter();
        this.__db = __db;
        this.__insertAdapterOfQueryChannelsEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_channel_query` (`id`,`filter`,`querySort`,`cids`,`predefinedFilterName`,`predefinedFilterValues`,`predefinedSortValues`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, QueryChannelsEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                String strObjectToString = QueryChannelsDao_Impl.this.__filterObjectConverter.objectToString(entity.getFilter());
                if (strObjectToString == null) {
                    statement.mo5359u(2);
                } else {
                    statement.mo5354L(2, strObjectToString);
                }
                String strObjectToString2 = QueryChannelsDao_Impl.this.__querySortConverter.objectToString(entity.getQuerySort());
                if (strObjectToString2 == null) {
                    statement.mo5359u(3);
                } else {
                    statement.mo5354L(3, strObjectToString2);
                }
                String strFromStringList = QueryChannelsDao_Impl.this.__listConverter.fromStringList(entity.getCids());
                if (strFromStringList == null) {
                    statement.mo5359u(4);
                } else {
                    statement.mo5354L(4, strFromStringList);
                }
                String predefinedFilterName = entity.getPredefinedFilterName();
                if (predefinedFilterName == null) {
                    statement.mo5359u(5);
                } else {
                    statement.mo5354L(5, predefinedFilterName);
                }
                String strMapToString = QueryChannelsDao_Impl.this.__nullableMapConverter.mapToString(entity.getPredefinedFilterValues());
                if (strMapToString == null) {
                    statement.mo5359u(6);
                } else {
                    statement.mo5354L(6, strMapToString);
                }
                String strMapToString2 = QueryChannelsDao_Impl.this.__nullableMapConverter.mapToString(entity.getPredefinedSortValues());
                if (strMapToString2 == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5354L(7, strMapToString2);
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
    public static final C23454a0 insert$lambda$0(QueryChannelsDao_Impl queryChannelsDao_Impl, QueryChannelsEntity queryChannelsEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        queryChannelsDao_Impl.__insertAdapterOfQueryChannelsEntity.insert(_connection, queryChannelsEntity);
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
    public static final QueryChannelsEntity select$lambda$1(String str, String str2, QueryChannelsDao_Impl queryChannelsDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "filter");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "querySort");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cids");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "predefinedFilterName");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "predefinedFilterValues");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "predefinedSortValues");
            QueryChannelsEntity queryChannelsEntity = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                FilterObject filterObjectStringToObject = queryChannelsDao_Impl.__filterObjectConverter.stringToObject(interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2));
                if (filterObjectStringToObject == null) {
                    throw new IllegalStateException("Expected NON-NULL 'io.getstream.chat.android.models.FilterObject', but it was NULL.");
                }
                QuerySorter<Channel> querySorterStringToObject = queryChannelsDao_Impl.__querySortConverter.stringToObject(interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3));
                List<String> stringList = queryChannelsDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                Map<String, Object> mapStringToMap = queryChannelsDao_Impl.__nullableMapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6));
                if (!interfaceC33689cMo68212g1.isNull(iM60658N7)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                }
                queryChannelsEntity = new QueryChannelsEntity(strMo5353J1, filterObjectStringToObject, querySorterStringToObject, stringList, strMo5353J2, mapStringToMap, queryChannelsDao_Impl.__nullableMapConverter.stringToMap(strMo5353J0));
            }
            interfaceC33689cMo68212g1.close();
            return queryChannelsEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(13), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao
    public final Object insert(QueryChannelsEntity queryChannelsEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(this, queryChannelsEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao
    public final Object select(String str, InterfaceC30057d<? super QueryChannelsEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19223a(0, str, this), interfaceC30057d);
    }
}
