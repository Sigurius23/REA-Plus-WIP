package io.getstream.chat.android.p226ui.common.feature.messages.composer.mention;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import m83.C25271y;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "", "channelCid", "<init>", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V", "query", "", "Lio/getstream/chat/android/models/User;", "queryMembersByUsername", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "handleUserLookup", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/ChatClient;", "Ljava/lang/String;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RemoteUserLookupHandler implements UserLookupHandler {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion();
    private static final boolean DEBUG = false;
    private static final int QUERY_MEMBERS_REQUEST_LIMIT = 30;
    private static final int QUERY_MEMBERS_REQUEST_OFFSET = 0;
    private final String channelCid;
    private final ChatClient chatClient;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$Companion;", "", "<init>", "()V", "DEBUG", "", "QUERY_MEMBERS_REQUEST_OFFSET", "", "QUERY_MEMBERS_REQUEST_LIMIT", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.mention.RemoteUserLookupHandler$queryMembersByUsername$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.mention.RemoteUserLookupHandler", m100430f = "RemoteUserLookupHandler.kt", m100431l = {77}, m100432m = "queryMembersByUsername")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195471 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C195471(InterfaceC30057d<? super C195471> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteUserLookupHandler.this.queryMembersByUsername(null, null, null, this);
        }
    }

    public RemoteUserLookupHandler(ChatClient chatClient, String channelCid) {
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelCid, "channelCid");
        this.chatClient = chatClient;
        this.channelCid = channelCid;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:UserLookupRemote");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object queryMembersByUsername(ChatClient chatClient, String str, String str2, InterfaceC30057d<? super List<User>> interfaceC30057d) {
        C195471 c195471;
        RemoteUserLookupHandler remoteUserLookupHandler;
        String str3 = str2;
        if (interfaceC30057d instanceof C195471) {
            c195471 = (C195471) interfaceC30057d;
            int i13 = c195471.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195471.label = i13 - Integer.MIN_VALUE;
                remoteUserLookupHandler = this;
            } else {
                remoteUserLookupHandler = this;
                c195471 = remoteUserLookupHandler.new C195471(interfaceC30057d);
            }
        } else {
            remoteUserLookupHandler = this;
            c195471 = remoteUserLookupHandler.new C195471(interfaceC30057d);
        }
        Object objAwait = c195471.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195471.label;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(str);
            InterfaceC27474d interfaceC27474dQueryMembers = chatClient.queryMembers((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, 0, 30, Filters.autocomplete("name", str3), QuerySortByField.INSTANCE.ascByName("name"), c25271y);
            c195471.L$0 = null;
            c195471.L$1 = null;
            c195471.L$2 = str3;
            c195471.L$3 = null;
            c195471.L$4 = null;
            c195471.label = 1;
            objAwait = interfaceC27474dQueryMembers.await(c195471);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) c195471.L$2;
            AbstractC34132o.m107864I(objAwait);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        if (!(abstractC26205h instanceof C26204g)) {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            C2345k logger = remoteUserLookupHandler.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str4 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[queryMembersByUsername] failed: ", ((C26203f) abstractC26205h).f103918a.mo77807a()), null);
            }
            return c25271y;
        }
        Iterable iterable = (Iterable) ((C26204g) abstractC26205h).f103919a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((Member) it.next()).getUser());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC39414r.m125876U(((User) obj).getName(), str3, true)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler
    public final Object handleUserLookup(String str, InterfaceC30057d<? super List<User>> interfaceC30057d) {
        return str.length() > 0 ? queryMembersByUsername(this.chatClient, this.channelCid, str, interfaceC30057d) : C25271y.f99162w;
    }
}
