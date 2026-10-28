package io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal;

import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifierKt;
import io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository;
import io.getstream.chat.android.client.query.QueryChannelsSpec;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;", "queryChannelsDao", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;)V", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "queryChannelsSpec", "Ll83/a0;", "insertQueryChannels", "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "selectBy", "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;", "clear", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseQueryChannelsRepository implements QueryChannelsRepository {
    private static final Companion Companion = new Companion();
    private final QueryChannelsDao queryChannelsDao;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0002¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;", "", "<init>", "()V", "generateId", "", "identifier", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;", "queryChannelsSpec", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "toModel", "queryChannelsEntity", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String generateId(QueryChannelsIdentifier identifier) {
            if (identifier instanceof QueryChannelsIdentifier.Standard) {
                QueryChannelsIdentifier.Standard standard = (QueryChannelsIdentifier.Standard) identifier;
                return standard.getFilter().hashCode() + "-" + standard.getSort().toDto().hashCode();
            }
            if (!(identifier instanceof QueryChannelsIdentifier.Predefined)) {
                throw new NoWhenBranchMatchedException();
            }
            QueryChannelsIdentifier.Predefined predefined = (QueryChannelsIdentifier.Predefined) identifier;
            String name = predefined.getName();
            Map<String, Object> filterValues = predefined.getFilterValues();
            int iHashCode = filterValues != null ? filterValues.hashCode() : 0;
            Map<String, Object> sortValues = predefined.getSortValues();
            int iHashCode2 = sortValues != null ? sortValues.hashCode() : 0;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(iHashCode, "pd:", name, ":", ":");
            sbM30467u.append(iHashCode2);
            return sbM30467u.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final QueryChannelsEntity toEntity(QueryChannelsSpec queryChannelsSpec) {
            return new QueryChannelsEntity(generateId(QueryChannelsIdentifierKt.getIdentifier(queryChannelsSpec)), queryChannelsSpec.getFilter(), queryChannelsSpec.getQuerySort(), AbstractC25265s.m74093D1(queryChannelsSpec.getCids()), queryChannelsSpec.getPredefinedFilterName(), queryChannelsSpec.getPredefinedFilterValues(), queryChannelsSpec.getPredefinedSortValues());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final QueryChannelsSpec toModel(QueryChannelsEntity queryChannelsEntity) {
            return new QueryChannelsSpec(queryChannelsEntity.getFilter(), queryChannelsEntity.getQuerySort(), AbstractC25265s.m74103I1(queryChannelsEntity.getCids()), queryChannelsEntity.getPredefinedFilterName(), queryChannelsEntity.getPredefinedFilterValues(), queryChannelsEntity.getPredefinedSortValues());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.DatabaseQueryChannelsRepository$selectBy$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.DatabaseQueryChannelsRepository", m100430f = "DatabaseQueryChannelsRepository.kt", m100431l = {41}, m100432m = "selectBy")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192211 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192211(InterfaceC30057d<? super C192211> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseQueryChannelsRepository.this.selectBy(null, this);
        }
    }

    public DatabaseQueryChannelsRepository(QueryChannelsDao queryChannelsDao) {
        AbstractC22676k.m65750j(queryChannelsDao, "queryChannelsDao");
        this.queryChannelsDao = queryChannelsDao;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteAll = this.queryChannelsDao.deleteAll(interfaceC30057d);
        return objDeleteAll == EnumC31071a.f128113w ? objDeleteAll : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object insertQueryChannels(QueryChannelsSpec queryChannelsSpec, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsert = this.queryChannelsDao.insert(Companion.toEntity(queryChannelsSpec), interfaceC30057d);
        return objInsert == EnumC31071a.f128113w ? objInsert : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object selectBy(QueryChannelsIdentifier queryChannelsIdentifier, InterfaceC30057d<? super QueryChannelsSpec> interfaceC30057d) {
        C192211 c192211;
        if (interfaceC30057d instanceof C192211) {
            c192211 = (C192211) interfaceC30057d;
            int i13 = c192211.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192211.label = i13 - Integer.MIN_VALUE;
            } else {
                c192211 = new C192211(interfaceC30057d);
            }
        } else {
            c192211 = new C192211(interfaceC30057d);
        }
        Object objSelect = c192211.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192211.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelect);
            QueryChannelsDao queryChannelsDao = this.queryChannelsDao;
            String strGenerateId = Companion.generateId(queryChannelsIdentifier);
            c192211.L$0 = null;
            c192211.label = 1;
            objSelect = queryChannelsDao.select(strGenerateId, c192211);
            if (objSelect == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelect);
        }
        QueryChannelsEntity queryChannelsEntity = (QueryChannelsEntity) objSelect;
        if (queryChannelsEntity != null) {
            return Companion.toModel(queryChannelsEntity);
        }
        return null;
    }
}
