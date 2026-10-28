package io.getstream.chat.android.p226ui.viewmodel.typing;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.models.User;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;", "Landroidx/lifecycle/w1;", "", "cid", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "messageId", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V", "Lec3/f2;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "observeChannelState", "()Lec3/f2;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "channelState", "Lec3/f2;", "Landroidx/lifecycle/p0;", "", "Lio/getstream/chat/android/models/User;", "typingUsers", "Landroidx/lifecycle/p0;", "getTypingUsers", "()Landroidx/lifecycle/p0;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypingIndicatorViewModel extends AbstractC1637w1 {
    private static final Companion Companion = new Companion();
    private static final int DEFAULT_MESSAGES_LIMIT = 30;
    private static final String TAG = "Chat:TypingIndicatorVM";
    private final InterfaceC13037f2 channelState;
    private final ChatClient chatClient;
    private final String cid;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final String messageId;
    private final AbstractC1615p0 typingUsers;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_MESSAGES_LIMIT", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ TypingIndicatorViewModel(String str, ChatClient chatClient, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? ChatClient.INSTANCE.instance() : chatClient, (i13 & 4) != 0 ? null : str2);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final InterfaceC13037f2 observeChannelState() {
        int i13 = this.messageId != null ? 0 : 30;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(i13, "[observeChannelState] cid: ", this.cid, ", messageLimit: "), null);
        }
        return ChatClientExtensions.watchChannelAsState(this.chatClient, this.cid, i13, AbstractC1640x1.m5043b(this));
    }

    public final AbstractC1615p0 getTypingUsers() {
        return this.typingUsers;
    }

    public TypingIndicatorViewModel(String cid, ChatClient chatClient, String str) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.cid = cid;
        this.chatClient = chatClient;
        this.messageId = str;
        this.logger = AbstractC1772c1.m5382S(this, TAG);
        InterfaceC13037f2 interfaceC13037f2ObserveChannelState = observeChannelState();
        this.channelState = interfaceC13037f2ObserveChannelState;
        final C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(interfaceC13037f2ObserveChannelState, 2), new TypingIndicatorViewModel$special$$inlined$flatMapLatest$1(3, null));
        this.typingUsers = AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.typing.TypingIndicatorViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.typing.TypingIndicatorViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199602<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.typing.TypingIndicatorViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.typing.TypingIndicatorViewModel$special$$inlined$map$1$2", m100430f = "TypingIndicatorViewModel.kt", m100431l = {50}, m100432m = "emit")
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
                        return C199602.this.emit(null, this);
                    }
                }

                public C199602(InterfaceC13062m interfaceC13062m) {
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
                Object objCollect = c14380kM36590P.collect(new C199602(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, null, 3);
    }
}
