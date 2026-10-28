package io.getstream.chat.android.client.errorhandler;

import java.util.Iterator;
import java.util.List;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a?\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lo23/d;", "Lio/getstream/chat/android/models/Message;", "", "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;", "errorHandlers", "", "cid", "messageId", "onMessageError", "(Lo23/d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteReactionErrorHandlerKt {
    public static final InterfaceC27474d onMessageError(InterfaceC27474d interfaceC27474d, List<? extends DeleteReactionErrorHandler> errorHandlers, String str, String messageId) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(errorHandlers, "errorHandlers");
        AbstractC22676k.m65750j(messageId, "messageId");
        Iterator<T> it = errorHandlers.iterator();
        while (it.hasNext()) {
            interfaceC27474d = ((DeleteReactionErrorHandler) it.next()).onDeleteReactionError(interfaceC27474d, str, messageId);
        }
        return interfaceC27474d;
    }
}
