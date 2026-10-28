package io.getstream.chat.android.client.persistance.repository;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.ChannelConfig;
import java.util.Collection;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "", "Ll83/a0;", "cacheChannelConfigs", "(Lq83/d;)Ljava/lang/Object;", "", "channelType", "Lio/getstream/chat/android/models/ChannelConfig;", "selectChannelConfig", "(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;", "", "configs", "insertChannelConfigs", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "config", "insertChannelConfig", "(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;", "clear", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelConfigRepository {
    Object cacheChannelConfigs(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertChannelConfig(ChannelConfig channelConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertChannelConfigs(Collection<ChannelConfig> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    ChannelConfig selectChannelConfig(String channelType);
}
