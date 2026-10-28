package io.getstream.chat.android.client.persistance.repository.noop;

import io.getstream.chat.android.client.persistance.repository.SyncStateRepository;
import io.getstream.chat.android.client.sync.SyncState;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpSyncStateRepository;", "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "<init>", "()V", "Lio/getstream/chat/android/client/sync/SyncState;", "syncState", "Ll83/a0;", "insertSyncState", "(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;", "", "userId", "selectSyncState", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "clear", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpSyncStateRepository implements SyncStateRepository {
    public static final NoOpSyncStateRepository INSTANCE = new NoOpSyncStateRepository();

    private NoOpSyncStateRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object insertSyncState(SyncState syncState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object selectSyncState(String str, InterfaceC30057d<? super SyncState> interfaceC30057d) {
        return null;
    }
}
