package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;", "", "", "cid", "messageId", "reactionType", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "onDeleteReactionRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "onDeleteReactionResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteReactionPrecondition", "(Lio/getstream/chat/android/models/User;)Ln23/h;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface DeleteReactionListener {
    AbstractC26205h onDeleteReactionPrecondition(User currentUser);

    Object onDeleteReactionRequest(String str, String str2, String str3, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onDeleteReactionResult(String str, String str2, String str3, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
