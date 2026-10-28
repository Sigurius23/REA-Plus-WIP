package io.getstream.chat.android.client.internal.state.errorhandler;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.errorhandler.CreateChannelErrorHandler;
import io.getstream.chat.android.client.errorhandler.DeleteReactionErrorHandler;
import io.getstream.chat.android.client.errorhandler.ErrorHandler;
import io.getstream.chat.android.client.errorhandler.QueryMembersErrorHandler;
import io.getstream.chat.android.client.errorhandler.SendReactionErrorHandler;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import java.util.Map;
import o23.C27487q;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014JV\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00180\u00122\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00180\f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018H\u0096\u0001¢\u0006\u0004\b(\u0010)JD\u00101\u001a\b\u0012\u0004\u0012\u00020*0\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020*0\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u00109\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;", "deleteReactionErrorHandler", "createChannelErrorHandler", "queryMembersErrorHandler", "sendReactionErrorHandler", "<init>", "(Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;)V", "Lo23/d;", "Lio/getstream/chat/android/models/Message;", "originalCall", "", "cid", "messageId", "Lo23/q;", "onDeleteReactionError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;", "Lio/getstream/chat/android/models/Channel;", "channelType", "channelId", "", "memberIds", "", "", "extraData", "onCreateChannelError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;", "Lio/getstream/chat/android/models/Member;", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "onQueryMembersError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;", "Lio/getstream/chat/android/models/Reaction;", "reaction", "", "enforceUnique", "skipPush", "Lio/getstream/chat/android/models/User;", "currentUser", "onSendReactionError", "(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;", "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;", "getPriority", "()I", "priority", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StateErrorHandler implements ErrorHandler, DeleteReactionErrorHandler, CreateChannelErrorHandler, QueryMembersErrorHandler, SendReactionErrorHandler {
    private final CreateChannelErrorHandler createChannelErrorHandler;
    private final DeleteReactionErrorHandler deleteReactionErrorHandler;
    private final QueryMembersErrorHandler queryMembersErrorHandler;
    private final SendReactionErrorHandler sendReactionErrorHandler;

    public StateErrorHandler(DeleteReactionErrorHandler deleteReactionErrorHandler, CreateChannelErrorHandler createChannelErrorHandler, QueryMembersErrorHandler queryMembersErrorHandler, SendReactionErrorHandler sendReactionErrorHandler) {
        AbstractC22676k.m65750j(deleteReactionErrorHandler, "deleteReactionErrorHandler");
        AbstractC22676k.m65750j(createChannelErrorHandler, "createChannelErrorHandler");
        AbstractC22676k.m65750j(queryMembersErrorHandler, "queryMembersErrorHandler");
        AbstractC22676k.m65750j(sendReactionErrorHandler, "sendReactionErrorHandler");
        this.deleteReactionErrorHandler = deleteReactionErrorHandler;
        this.createChannelErrorHandler = createChannelErrorHandler;
        this.queryMembersErrorHandler = queryMembersErrorHandler;
        this.sendReactionErrorHandler = sendReactionErrorHandler;
    }

    @Override // io.getstream.chat.android.client.errorhandler.ErrorHandler
    public final int getPriority() {
        return 1;
    }

    @Override // io.getstream.chat.android.client.errorhandler.CreateChannelErrorHandler
    public final C27487q onCreateChannelError(InterfaceC27474d originalCall, String channelType, String channelId, List<String> memberIds, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.createChannelErrorHandler.onCreateChannelError(originalCall, channelType, channelId, memberIds, extraData);
    }

    @Override // io.getstream.chat.android.client.errorhandler.DeleteReactionErrorHandler
    public final C27487q onDeleteReactionError(InterfaceC27474d originalCall, String cid, String messageId) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.deleteReactionErrorHandler.onDeleteReactionError(originalCall, cid, messageId);
    }

    @Override // io.getstream.chat.android.client.errorhandler.QueryMembersErrorHandler
    public final C27487q onQueryMembersError(InterfaceC27474d originalCall, String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return this.queryMembersErrorHandler.onQueryMembersError(originalCall, channelType, channelId, offset, limit, filter, sort, members);
    }

    @Override // io.getstream.chat.android.client.errorhandler.SendReactionErrorHandler
    public final C27487q onSendReactionError(InterfaceC27474d originalCall, Reaction reaction, boolean enforceUnique, boolean skipPush, User currentUser) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        return this.sendReactionErrorHandler.onSendReactionError(originalCall, reaction, enforceUnique, skipPush, currentUser);
    }
}
