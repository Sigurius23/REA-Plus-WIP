package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000b\u0010\nJ6\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;", "", "", "channelType", "channelId", "", "clearHistory", "Ln23/h;", "Ll83/a0;", "onHideChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onHideChannelRequest", "result", "onHideChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface HideChannelListener {
    Object onHideChannelPrecondition(String str, String str2, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    Object onHideChannelRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onHideChannelResult(AbstractC26205h abstractC26205h, String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
