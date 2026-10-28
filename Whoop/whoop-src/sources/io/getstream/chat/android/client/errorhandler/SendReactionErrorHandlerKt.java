package io.getstream.chat.android.client.errorhandler;

import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import java.util.Iterator;
import java.util.List;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lo23/d;", "Lio/getstream/chat/android/models/Reaction;", "", "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;", "errorHandlers", "reaction", "", "enforceUnique", "skipPush", "Lio/getstream/chat/android/models/User;", "currentUser", "onReactionError", "(Lo23/d;Ljava/util/List;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/d;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendReactionErrorHandlerKt {
    public static final InterfaceC27474d onReactionError(InterfaceC27474d interfaceC27474d, List<? extends SendReactionErrorHandler> errorHandlers, Reaction reaction, boolean z4, boolean z13, User currentUser) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(errorHandlers, "errorHandlers");
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        Iterator<T> it = errorHandlers.iterator();
        InterfaceC27474d interfaceC27474dOnSendReactionError = interfaceC27474d;
        while (it.hasNext()) {
            interfaceC27474dOnSendReactionError = ((SendReactionErrorHandler) it.next()).onSendReactionError(interfaceC27474dOnSendReactionError, reaction, z4, z13, currentUser);
        }
        return interfaceC27474dOnSendReactionError;
    }
}
