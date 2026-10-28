package io.getstream.chat.android.client.errorhandler;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.List;
import java.util.Map;
import o23.C27487q;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JU\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;", "", "Lo23/d;", "Lio/getstream/chat/android/models/Channel;", "originalCall", "", "channelType", "channelId", "", "memberIds", "", "extraData", "Lo23/q;", "onCreateChannelError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface CreateChannelErrorHandler {
    C27487q onCreateChannelError(InterfaceC27474d originalCall, String channelType, String channelId, List<String> memberIds, Map<String, ? extends Object> extraData);
}
