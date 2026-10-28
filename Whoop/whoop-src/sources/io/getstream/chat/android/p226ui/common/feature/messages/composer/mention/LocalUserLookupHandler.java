package io.getstream.chat.android.p226ui.common.feature.messages.composer.mention;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.filter.DefaultUserQueryFilter;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.filter.QueryFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "", "channelCid", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;", "Lio/getstream/chat/android/models/User;", "filter", "<init>", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V", "query", "", "handleUserLookup", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/ChatClient;", "Ljava/lang/String;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LocalUserLookupHandler implements UserLookupHandler {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion();
    private static final boolean DEBUG = false;
    private final String channelCid;
    private final ChatClient chatClient;
    private final QueryFilter<User> filter;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler$Companion;", "", "<init>", "()V", "DEBUG", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public LocalUserLookupHandler(ChatClient chatClient, String channelCid, QueryFilter<User> filter) {
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelCid, "channelCid");
        AbstractC22676k.m65750j(filter, "filter");
        this.chatClient = chatClient;
        this.channelCid = channelCid;
        this.filter = filter;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:UserLookupLocal");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler
    public final Object handleUserLookup(String str, InterfaceC30057d<? super List<User>> interfaceC30057d) {
        try {
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.channelCid);
            ChannelState channelStateChannel = ChatClientExtensions.getState(this.chatClient).channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
            Iterable iterable = (Iterable) channelStateChannel.getMembers().getValue();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((Member) it.next()).getUser());
            }
            if (((Number) channelStateChannel.getMembersCount().getValue()).intValue() == arrayList.size()) {
                return this.filter.filter(arrayList, str);
            }
        } catch (Exception e5) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC2875y.m8297j(e5, "[handleUserLookup] failed: "), e5);
            }
        }
        return C25271y.f99162w;
    }

    public /* synthetic */ LocalUserLookupHandler(ChatClient chatClient, String str, QueryFilter queryFilter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatClient, str, (i13 & 4) != 0 ? new DefaultUserQueryFilter(null, 1, null) : queryFilter);
    }
}
