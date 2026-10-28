package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ.\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;", "", "Lio/getstream/chat/android/models/User;", "currentUser", "", "channelType", "channelId", "Ll83/a0;", "onDeleteChannelRequest", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onDeleteChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelPrecondition", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface DeleteChannelListener {
    Object onDeleteChannelPrecondition(User user, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    Object onDeleteChannelRequest(User user, String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onDeleteChannelResult(String str, String str2, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
