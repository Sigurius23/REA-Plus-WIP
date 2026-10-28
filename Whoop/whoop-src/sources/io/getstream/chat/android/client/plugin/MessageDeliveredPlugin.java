package io.getstream.chat.android.client.plugin;

import h02.C16587n0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsResult;
import io.getstream.chat.android.client.receipts.MessageReceiptManager;
import io.getstream.chat.android.models.Channel;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;", "Lio/getstream/chat/android/client/plugin/Plugin;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "<init>", "(Lio/getstream/chat/android/client/ChatClient;)V", "Ln23/h;", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "result", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "request", "Ll83/a0;", "onQueryChannelsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Channel;", "", "channelType", "channelId", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "onQueryChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/receipts/MessageReceiptManager;", "messageReceiptManager$delegate", "Ll83/h;", "getMessageReceiptManager", "()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;", "messageReceiptManager", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageDeliveredPlugin implements Plugin {

    /* JADX INFO: renamed from: messageReceiptManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h messageReceiptManager;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.plugin.MessageDeliveredPlugin$onQueryChannelResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.plugin.MessageDeliveredPlugin", m100430f = "MessageDeliveredPlugin.kt", m100431l = {52}, m100432m = "onQueryChannelResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194181 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C194181(InterfaceC30057d<? super C194181> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageDeliveredPlugin.this.onQueryChannelResult(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.plugin.MessageDeliveredPlugin$onQueryChannelsResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.plugin.MessageDeliveredPlugin", m100430f = "MessageDeliveredPlugin.kt", m100431l = {40}, m100432m = "onQueryChannelsResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194191 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C194191(InterfaceC30057d<? super C194191> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageDeliveredPlugin.this.onQueryChannelsResult(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageDeliveredPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageReceiptManager getMessageReceiptManager() {
        return (MessageReceiptManager) this.messageReceiptManager.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelResult(AbstractC26205h abstractC26205h, String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C194181 c194181;
        if (interfaceC30057d instanceof C194181) {
            c194181 = (C194181) interfaceC30057d;
            int i13 = c194181.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194181.label = i13 - Integer.MIN_VALUE;
            } else {
                c194181 = new C194181(interfaceC30057d);
            }
        } else {
            c194181 = new C194181(interfaceC30057d);
        }
        Object obj = c194181.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194181.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC26205h instanceof C26204g) {
                Channel channel = (Channel) ((C26204g) abstractC26205h).f103919a;
                if (queryChannelRequest.pagination() == null) {
                    MessageReceiptManager messageReceiptManager = getMessageReceiptManager();
                    List<Channel> listM118958J = AbstractC37056f.m118958J(channel);
                    c194181.L$0 = null;
                    c194181.L$1 = null;
                    c194181.L$2 = null;
                    c194181.L$3 = null;
                    c194181.L$4 = null;
                    c194181.L$5 = abstractC26205h;
                    c194181.L$6 = null;
                    c194181.L$7 = null;
                    c194181.L$8 = null;
                    c194181.I$0 = 0;
                    c194181.I$1 = 0;
                    c194181.I$2 = 0;
                    c194181.label = 1;
                    if (messageReceiptManager.markChannelsAsDelivered(listM118958J, c194181) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener
    public final Object onQueryChannelsResult(AbstractC26205h abstractC26205h, QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C194191 c194191;
        if (interfaceC30057d instanceof C194191) {
            c194191 = (C194191) interfaceC30057d;
            int i13 = c194191.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194191.label = i13 - Integer.MIN_VALUE;
            } else {
                c194191 = new C194191(interfaceC30057d);
            }
        } else {
            c194191 = new C194191(interfaceC30057d);
        }
        Object obj = c194191.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194191.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC26205h instanceof C26204g) {
                QueryChannelsResult queryChannelsResult = (QueryChannelsResult) ((C26204g) abstractC26205h).f103919a;
                MessageReceiptManager messageReceiptManager = getMessageReceiptManager();
                List<Channel> channels = queryChannelsResult.getChannels();
                c194191.L$0 = null;
                c194191.L$1 = null;
                c194191.L$2 = null;
                c194191.L$3 = abstractC26205h;
                c194191.L$4 = null;
                c194191.L$5 = null;
                c194191.L$6 = null;
                c194191.I$0 = 0;
                c194191.I$1 = 0;
                c194191.I$2 = 0;
                c194191.label = 1;
                if (messageReceiptManager.markChannelsAsDelivered(channels, c194191) == enumC31071a) {
                    return enumC31071a;
                }
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    public MessageDeliveredPlugin(ChatClient chatClient) {
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.messageReceiptManager = AbstractC30060g.m92088H(new C16587n0(chatClient, 26));
    }

    public /* synthetic */ MessageDeliveredPlugin(ChatClient chatClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChatClient.INSTANCE.instance() : chatClient);
    }
}
