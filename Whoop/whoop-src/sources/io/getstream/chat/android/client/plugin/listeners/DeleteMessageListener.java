package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\u0007J&\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H¦@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;", "", "", "messageId", "Ln23/h;", "Ll83/a0;", "onMessageDeletePrecondition", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onMessageDeleteRequest", "originalMessageId", "Lio/getstream/chat/android/models/Message;", "result", "onMessageDeleteResult", "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface DeleteMessageListener {
    Object onMessageDeletePrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    Object onMessageDeleteRequest(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onMessageDeleteResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
