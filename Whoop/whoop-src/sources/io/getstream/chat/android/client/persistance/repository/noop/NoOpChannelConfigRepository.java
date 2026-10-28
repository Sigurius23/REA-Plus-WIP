package io.getstream.chat.android.client.persistance.repository.noop;

import io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository;
import io.getstream.chat.android.models.ChannelConfig;
import java.util.Collection;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelConfigRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "<init>", "()V", "Ll83/a0;", "cacheChannelConfigs", "(Lq83/d;)Ljava/lang/Object;", "", "channelType", "Lio/getstream/chat/android/models/ChannelConfig;", "selectChannelConfig", "(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;", "", "configs", "insertChannelConfigs", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "config", "insertChannelConfig", "(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;", "clear", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpChannelConfigRepository implements ChannelConfigRepository {
    public static final NoOpChannelConfigRepository INSTANCE = new NoOpChannelConfigRepository();

    private NoOpChannelConfigRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object cacheChannelConfigs(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object insertChannelConfig(ChannelConfig channelConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object insertChannelConfigs(Collection<ChannelConfig> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final ChannelConfig selectChannelConfig(String channelType) {
        AbstractC22676k.m65750j(channelType, "channelType");
        return null;
    }
}
