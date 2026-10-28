package io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal;

import io.getstream.chat.android.client.persistance.repository.SyncStateRepository;
import io.getstream.chat.android.client.sync.SyncState;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;", "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;", "syncStateDao", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;)V", "Lio/getstream/chat/android/client/sync/SyncState;", "syncState", "Ll83/a0;", "insertSyncState", "(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;", "", "userId", "selectSyncState", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "clear", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseSyncStateRepository implements SyncStateRepository {
    private final SyncStateDao syncStateDao;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.DatabaseSyncStateRepository$selectSyncState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.DatabaseSyncStateRepository", m100430f = "DatabaseSyncStateRepository.kt", m100431l = {42}, m100432m = "selectSyncState")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192341 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192341(InterfaceC30057d<? super C192341> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseSyncStateRepository.this.selectSyncState(null, this);
        }
    }

    public DatabaseSyncStateRepository(SyncStateDao syncStateDao) {
        AbstractC22676k.m65750j(syncStateDao, "syncStateDao");
        this.syncStateDao = syncStateDao;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteAll = this.syncStateDao.deleteAll(interfaceC30057d);
        return objDeleteAll == EnumC31071a.f128113w ? objDeleteAll : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object insertSyncState(SyncState syncState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsert = this.syncStateDao.insert(SyncStateMapperKt.toEntity(syncState), interfaceC30057d);
        return objInsert == EnumC31071a.f128113w ? objInsert : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object selectSyncState(String str, InterfaceC30057d<? super SyncState> interfaceC30057d) {
        C192341 c192341;
        if (interfaceC30057d instanceof C192341) {
            c192341 = (C192341) interfaceC30057d;
            int i13 = c192341.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192341.label = i13 - Integer.MIN_VALUE;
            } else {
                c192341 = new C192341(interfaceC30057d);
            }
        } else {
            c192341 = new C192341(interfaceC30057d);
        }
        Object objSelect = c192341.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192341.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelect);
            SyncStateDao syncStateDao = this.syncStateDao;
            c192341.L$0 = null;
            c192341.label = 1;
            objSelect = syncStateDao.select(str, c192341);
            if (objSelect == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelect);
        }
        SyncStateEntity syncStateEntity = (SyncStateEntity) objSelect;
        if (syncStateEntity != null) {
            return SyncStateMapperKt.toModel(syncStateEntity);
        }
        return null;
    }
}
