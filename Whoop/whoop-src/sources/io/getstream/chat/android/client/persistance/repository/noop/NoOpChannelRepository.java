package io.getstream.chat.android.client.persistance.repository.noop;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0016\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0018\u0010\u0014J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001f\u0010\u0010J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b$\u0010#J \u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b'\u0010(J(\u0010,\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020%H\u0096@¢\u0006\u0004\b,\u0010-J \u0010,\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010.J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b0\u0010\u0010J&\u00102\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u0019H\u0096@¢\u0006\u0004\b2\u00103J \u00105\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b7\u0010\u0010J\u0010\u00108\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b8\u0010\u001b¨\u00069"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "<init>", "()V", "Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "insertChannel", "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;", "", "channels", "insertChannels", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "", "cid", "deleteChannel", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "message", "deleteChannelMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "userId", "deleteAllChannelUserMessages", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "updateChannelMessage", "", "selectAllCids", "(Lq83/d;)Ljava/lang/Object;", "channelCIDs", "selectChannels", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectChannel", "", MapboxMap.QFE_LIMIT, "selectChannelCidsBySyncNeeded", "(ILq83/d;)Ljava/lang/Object;", "selectChannelsSyncNeeded", "Ljava/util/Date;", "deletedAt", "setChannelDeletedAt", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "", "hidden", "hideMessagesBefore", "setHiddenForChannel", "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Member;", "selectMembersForChannel", QueryChannelRequest.KEY_MEMBERS, "updateMembersForChannel", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "lastMessage", "updateLastMessageForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "evictChannel", "clear", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpChannelRepository implements ChannelRepository {
    public static final NoOpChannelRepository INSTANCE = new NoOpChannelRepository();

    private NoOpChannelRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object deleteAllChannelUserMessages(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object deleteChannel(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object deleteChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object evictChannel(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object insertChannel(Channel channel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object insertChannels(Collection<Channel> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectAllCids(InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannel(String str, InterfaceC30057d<? super Channel> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannelCidsBySyncNeeded(int i13, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannels(List<String> list, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannelsSyncNeeded(int i13, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectMembersForChannel(String str, InterfaceC30057d<? super List<Member>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object setChannelDeletedAt(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object setHiddenForChannel(String str, boolean z4, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object updateChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object updateLastMessageForChannel(String str, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object updateMembersForChannel(String str, List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object setHiddenForChannel(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }
}
