package io.getstream.chat.android.client.persistance.repository;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u0000 72\u00020\u0001:\u00017J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0016\u0010\u0012J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H¦@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u001d\u0010\u000eJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b \u0010!J \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b\"\u0010!J \u0010%\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020#H¦@¢\u0006\u0004\b*\u0010+J \u0010*\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H¦@¢\u0006\u0004\b*\u0010,J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00172\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b.\u0010\u000eJ&\u00100\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u0017H¦@¢\u0006\u0004\b0\u00101J \u00103\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH¦@¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b5\u0010\u000eJ\u0010\u00106\u001a\u00020\u0004H¦@¢\u0006\u0004\b6\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "", "Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "insertChannel", "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;", "", "channels", "insertChannels", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "", "cid", "deleteChannel", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "message", "deleteChannelMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "userId", "deleteAllChannelUserMessages", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "updateChannelMessage", "", "selectAllCids", "(Lq83/d;)Ljava/lang/Object;", "channelCIDs", "selectChannels", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectChannel", "", MapboxMap.QFE_LIMIT, "selectChannelCidsBySyncNeeded", "(ILq83/d;)Ljava/lang/Object;", "selectChannelsSyncNeeded", "Ljava/util/Date;", "deletedAt", "setChannelDeletedAt", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "", "hidden", "hideMessagesBefore", "setHiddenForChannel", "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Member;", "selectMembersForChannel", QueryChannelRequest.KEY_MEMBERS, "updateMembersForChannel", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "lastMessage", "updateLastMessageForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "evictChannel", "clear", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/ChannelRepository$Companion;", "", "<init>", "()V", "NO_LIMIT", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int NO_LIMIT = -1;

        private Companion() {
        }
    }

    static /* synthetic */ Object selectChannelCidsBySyncNeeded$default(ChannelRepository channelRepository, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectChannelCidsBySyncNeeded");
        }
        if ((i14 & 1) != 0) {
            i13 = -1;
        }
        return channelRepository.selectChannelCidsBySyncNeeded(i13, interfaceC30057d);
    }

    static /* synthetic */ Object selectChannelsSyncNeeded$default(ChannelRepository channelRepository, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectChannelsSyncNeeded");
        }
        if ((i14 & 1) != 0) {
            i13 = -1;
        }
        return channelRepository.selectChannelsSyncNeeded(i13, interfaceC30057d);
    }

    Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteAllChannelUserMessages(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteChannel(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object evictChannel(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertChannel(Channel channel, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertChannels(Collection<Channel> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectAllCids(InterfaceC30057d<? super List<String>> interfaceC30057d);

    Object selectChannel(String str, InterfaceC30057d<? super Channel> interfaceC30057d);

    Object selectChannelCidsBySyncNeeded(int i13, InterfaceC30057d<? super List<String>> interfaceC30057d);

    Object selectChannels(List<String> list, InterfaceC30057d<? super List<Channel>> interfaceC30057d);

    Object selectChannelsSyncNeeded(int i13, InterfaceC30057d<? super List<Channel>> interfaceC30057d);

    Object selectMembersForChannel(String str, InterfaceC30057d<? super List<Member>> interfaceC30057d);

    Object setChannelDeletedAt(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object setHiddenForChannel(String str, boolean z4, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object setHiddenForChannel(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object updateChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object updateLastMessageForChannel(String str, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object updateMembersForChannel(String str, List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
