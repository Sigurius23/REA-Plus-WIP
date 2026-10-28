package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J:\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;", "", "", "cid", "Lio/getstream/chat/android/models/Reaction;", "reaction", "", "enforceUnique", "skipPush", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "onSendReactionRequest", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "result", "onSendReactionResult", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onSendReactionPrecondition", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface SendReactionListener {
    Object onSendReactionPrecondition(String str, User user, Reaction reaction, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    Object onSendReactionRequest(String str, Reaction reaction, boolean z4, boolean z13, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onSendReactionResult(String str, Reaction reaction, boolean z4, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
