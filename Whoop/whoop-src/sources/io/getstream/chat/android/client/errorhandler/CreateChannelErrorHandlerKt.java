package io.getstream.chat.android.client.errorhandler;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a_\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lo23/d;", "Lio/getstream/chat/android/models/Channel;", "", "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;", "errorHandlers", "", "channelType", "channelId", "memberIds", "", "", "extraData", "onCreateChannelError", "(Lo23/d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/d;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreateChannelErrorHandlerKt {
    public static final InterfaceC27474d onCreateChannelError(InterfaceC27474d interfaceC27474d, List<? extends CreateChannelErrorHandler> errorHandlers, String channelType, String channelId, List<String> memberIds, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(errorHandlers, "errorHandlers");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        Iterator<T> it = errorHandlers.iterator();
        InterfaceC27474d interfaceC27474dOnCreateChannelError = interfaceC27474d;
        while (it.hasNext()) {
            interfaceC27474dOnCreateChannelError = ((CreateChannelErrorHandler) it.next()).onCreateChannelError(interfaceC27474dOnCreateChannelError, channelType, channelId, memberIds, extraData);
        }
        return interfaceC27474dOnCreateChannelError;
    }
}
