package io.getstream.chat.android.client.persistance.repository.noop;

import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository;
import io.getstream.chat.android.client.query.QueryChannelsSpec;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpQueryChannelsRepository;", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "<init>", "()V", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "queryChannelsSpec", "Ll83/a0;", "insertQueryChannels", "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "selectBy", "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;", "clear", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpQueryChannelsRepository implements QueryChannelsRepository {
    public static final NoOpQueryChannelsRepository INSTANCE = new NoOpQueryChannelsRepository();

    private NoOpQueryChannelsRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object insertQueryChannels(QueryChannelsSpec queryChannelsSpec, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object selectBy(QueryChannelsIdentifier queryChannelsIdentifier, InterfaceC30057d<? super QueryChannelsSpec> interfaceC30057d) {
        return null;
    }
}
