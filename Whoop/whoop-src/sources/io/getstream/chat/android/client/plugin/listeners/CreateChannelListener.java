package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.client.query.CreateChannelParams;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;", "", "", "channelType", "channelId", "Lio/getstream/chat/android/client/query/CreateChannelParams;", "params", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "onCreateChannelRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "", "memberIds", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onCreateChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onCreateChannelPrecondition", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface CreateChannelListener {
    AbstractC26205h onCreateChannelPrecondition(User currentUser, String channelId, List<String> memberIds);

    Object onCreateChannelRequest(String str, String str2, CreateChannelParams createChannelParams, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onCreateChannelResult(String str, String str2, List<String> list, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
