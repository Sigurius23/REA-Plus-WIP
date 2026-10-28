package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.models.User;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u00018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0 8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0&0 8\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%R\u001f\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0 8\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000 8\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0 8\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%¨\u00069"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;", "Landroidx/lifecycle/w1;", "", "cid", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "messageId", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ljava/lang/String;)V", "Lec3/l;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "observeChannelState", "()Lec3/l;", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "setActiveThread", "(Lio/getstream/chat/android/models/Message;)V", "resetThread", "()V", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "channelState", "Lec3/l;", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/models/Channel;", "channel", "Landroidx/lifecycle/p0;", "getChannel", "()Landroidx/lifecycle/p0;", "", "Lio/getstream/chat/android/models/User;", "typingUsers", "getTypingUsers", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "getMembers", "", "membersCount", "getMembersCount", "Lio/getstream/chat/android/models/ConnectionState;", "online", "getOnline", "Landroidx/lifecycle/u0;", "_activeThread", "Landroidx/lifecycle/u0;", "activeThread", "getActiveThread", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelHeaderViewModel extends AbstractC1637w1 {
    private static final Companion Companion = new Companion();
    private static final int DEFAULT_MESSAGES_LIMIT = 30;
    private final C1630u0 _activeThread;
    private final AbstractC1615p0 activeThread;
    private final AbstractC1615p0 channel;
    private final InterfaceC13058l channelState;
    private final ChatClient chatClient;
    private final String cid;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final AbstractC1615p0 members;
    private final AbstractC1615p0 membersCount;
    private final String messageId;
    private final AbstractC1615p0 online;
    private final AbstractC1615p0 typingUsers;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$Companion;", "", "<init>", "()V", "DEFAULT_MESSAGES_LIMIT", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelHeaderViewModel(String str, ChatClient chatClient, ClientState clientState, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        chatClient = (i13 & 2) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        this(str, chatClient, (i13 & 4) != 0 ? chatClient.getClientState() : clientState, (i13 & 8) != 0 ? null : str2);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final InterfaceC13058l observeChannelState() {
        int i13 = this.messageId != null ? 0 : 30;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[observeChannelState] cid: ", this.cid, ", messageId: ", this.messageId, ", messageLimit: ");
            sbM32001t.append(i13);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        return new C4588i(ChatClientExtensions.watchChannelAsState(this.chatClient, this.cid, i13, AbstractC1640x1.m5043b(this)), 2);
    }

    public final AbstractC1615p0 getActiveThread() {
        return this.activeThread;
    }

    public final AbstractC1615p0 getChannel() {
        return this.channel;
    }

    public final AbstractC1615p0 getMembers() {
        return this.members;
    }

    public final AbstractC1615p0 getMembersCount() {
        return this.membersCount;
    }

    public final AbstractC1615p0 getOnline() {
        return this.online;
    }

    public final AbstractC1615p0 getTypingUsers() {
        return this.typingUsers;
    }

    public final void resetThread() {
        this._activeThread.postValue(null);
    }

    public final void setActiveThread(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this._activeThread.postValue(message);
    }

    public ChannelHeaderViewModel(String cid, ChatClient chatClient, ClientState clientState, String str) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.cid = cid;
        this.chatClient = chatClient;
        this.messageId = str;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MessagesHeaderVM");
        InterfaceC13058l interfaceC13058lObserveChannelState = observeChannelState();
        this.channelState = interfaceC13058lObserveChannelState;
        this.channel = AbstractC1613o1.m5012b(AbstractC13091v.m36590P(interfaceC13058lObserveChannelState, new ChannelHeaderViewModel$special$$inlined$flatMapLatest$1(3, null)), null, 3);
        final C14380k c14380kM36590P = AbstractC13091v.m36590P(interfaceC13058lObserveChannelState, new ChannelHeaderViewModel$special$$inlined$flatMapLatest$2(3, null));
        this.typingUsers = AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.messages.ChannelHeaderViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.ChannelHeaderViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199242<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.ChannelHeaderViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.ChannelHeaderViewModel$special$$inlined$map$1$2", m100430f = "ChannelHeaderViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C199242.this.emit(null, this);
                    }
                }

                public C199242(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        List<User> users = ((TypingEvent) obj).getUsers();
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(users, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c14380kM36590P.collect(new C199242(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, null, 3);
        this.members = AbstractC1613o1.m5012b(AbstractC13091v.m36590P(interfaceC13058lObserveChannelState, new ChannelHeaderViewModel$special$$inlined$flatMapLatest$3(3, null)), null, 3);
        this.membersCount = AbstractC1613o1.m5012b(AbstractC13091v.m36590P(interfaceC13058lObserveChannelState, new ChannelHeaderViewModel$special$$inlined$flatMapLatest$4(3, null)), null, 3);
        this.online = AbstractC1613o1.m5012b(clientState.getConnectionState(), null, 3);
        C1630u0 c1630u0 = new C1630u0();
        this._activeThread = c1630u0;
        this.activeThread = c1630u0;
    }
}
