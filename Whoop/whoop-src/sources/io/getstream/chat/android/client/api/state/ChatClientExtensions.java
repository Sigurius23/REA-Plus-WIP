package io.getstream.chat.android.client.api.state;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ih0.C18510t;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.ChatClientConfig;
import io.getstream.chat.android.client.api.event.ChatEventHandlerFactory;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.CDNRequest;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.internal.state.extensions.internal.AttachmentKt;
import io.getstream.chat.android.client.internal.state.extensions.internal.ChatClientKt;
import io.getstream.chat.android.client.internal.state.plugin.factory.StreamStatePluginFactory;
import io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.client.plugin.factory.PluginFactory;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.client.utils.internal.ValidationKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.InitializationState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k93.AbstractC22306c;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import o23.C27478h;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0013\u001a+\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a6\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087@¢\u0006\u0004\b\u001c\u0010\u001d\u001a,\u0010\u001e\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@¢\u0006\u0004\b\u001e\u0010\u001f\u001aG\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010 *\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u001c\u0010$\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0002¢\u0006\u0004\b%\u0010&\u001a+\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b+\u0010,\u001a)\u00101\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102\u001a'\u00104\u001a\b\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b4\u00105\u001a/\u00108\u001a\b\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b8\u00109\u001a'\u0010:\u001a\b\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190)*\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b<\u0010=\u001a!\u0010>\u001a\b\u0012\u0004\u0012\u00020'0)*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000bH\u0007¢\u0006\u0004\b>\u0010?\u001a)\u0010@\u001a\b\u0012\u0004\u0012\u00020'0)*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0007¢\u0006\u0004\b@\u0010;\u001a*\u0010B\u001a\b\u0012\u0004\u0012\u00020'0A*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0082@¢\u0006\u0004\bB\u0010C\u001a3\u0010E\u001a\b\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0019H\u0007¢\u0006\u0004\bE\u0010F\u001a\u000f\u0010G\u001a\u00020\u000bH\u0002¢\u0006\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010K\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010J\"\u0015\u0010O\u001a\u00020L*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u0015\u0010S\u001a\u00020P*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u001b\u0010W\u001a\b\u0012\u0004\u0012\u00020P0T*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bU\u0010V\"\u0018\u0010[\u001a\u00020X*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006^²\u0006\f\u0010]\u001a\u00020\\8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "request", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "chatEventHandlerFactory", "Lbc3/c0;", "coroutineScope", "Lec3/f2;", "Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "queryChannelsAsState", "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;)Lec3/f2;", "", "cid", "", "messageLimit", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "watchChannelAsState", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;", "aroundMessageId", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;Lbc3/c0;)Lec3/f2;", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/client/api/state/QueryThreadsState;", "queryThreadsAsState", "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;)Lec3/f2;", "messageId", "", "olderToNewer", "Lio/getstream/chat/android/client/api/state/ThreadState;", "getRepliesAsState", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLbc3/c0;Lq83/d;)Ljava/lang/Object;", "awaitRepliesAsState", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lq83/d;", "", "producer", "getStateOrNull", "(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;", "Lio/getstream/chat/android/models/Message;", "message", "Lo23/d;", "Ll83/a0;", "setMessageForReply", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/models/Attachment;", "attachment", "downloadAttachment", "(Lio/getstream/chat/android/client/ChatClient;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)Lo23/d;", "Lio/getstream/chat/android/models/Channel;", "loadOlderMessages", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;I)Lo23/d;", "channelCid", "baseMessageId", "loadNewerMessages", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "loadMessagesAroundId", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "cancelEphemeralMessage", "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;)Lo23/d;", "getMessageUsingCache", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;", "loadMessageById", "Ln23/h;", "loadMessageByIdInternal", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "userPresence", "loadNewestMessages", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZ)Lo23/d;", "createAttachmentFallbackName", "()Ljava/lang/String;", "TAG", "Ljava/lang/String;", "ATTACHMENT_FALLBACK_NAME_DATE_FORMAT", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "getState", "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/StateRegistry;", "state", "Lio/getstream/chat/android/client/api/state/GlobalState;", "getGlobalState", "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/GlobalState;", "globalState", "Lec3/l;", "getGlobalStateFlow", "(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;", "globalStateFlow", "Lio/getstream/chat/android/client/api/ChatClientConfig;", "getChatClientConfig", "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/ChatClientConfig;", "chatClientConfig", "Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClientExtensions {
    private static final String ATTACHMENT_FALLBACK_NAME_DATE_FORMAT = "yyyy-MM-dd_HH-mm-ss";
    private static final String TAG = "Chat:Client-StatePlugin";

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$awaitRepliesAsState$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$awaitRepliesAsState$3", m100430f = "ChatClientStateExtensions.kt", m100431l = {252}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/api/state/ThreadState;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/api/state/ThreadState;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190113 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ boolean $olderToNewer;
        final /* synthetic */ ChatClient $this_awaitRepliesAsState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190113(ChatClient chatClient, String str, int i13, boolean z4, InterfaceC30057d<? super C190113> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_awaitRepliesAsState = chatClient;
            this.$messageId = str;
            this.$messageLimit = i13;
            this.$olderToNewer = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C190113 c190113 = new C190113(this.$this_awaitRepliesAsState, this.$messageId, this.$messageLimit, this.$olderToNewer, interfaceC30057d);
            c190113.L$0 = obj;
            return c190113;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ThreadState> interfaceC30057d) {
            return ((C190113) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChatClientStateCalls chatClientStateCallsRequestsAsState = ChatClientKt.requestsAsState(this.$this_awaitRepliesAsState, interfaceC2994c0);
            String str = this.$messageId;
            int i14 = this.$messageLimit;
            boolean z4 = this.$olderToNewer;
            this.L$0 = null;
            this.label = 1;
            Object objAwaitReplies$stream_chat_android_client_release = chatClientStateCallsRequestsAsState.awaitReplies$stream_chat_android_client_release(str, i14, z4, this);
            return objAwaitReplies$stream_chat_android_client_release == enumC31071a ? enumC31071a : objAwaitReplies$stream_chat_android_client_release;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$cancelEphemeralMessage$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$cancelEphemeralMessage$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {453}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190122 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        final /* synthetic */ ChatClient $this_cancelEphemeralMessage;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190122(Message message, ChatClient chatClient, InterfaceC30057d<? super C190122> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
            this.$this_cancelEphemeralMessage = chatClient;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190122(this.$message, this.$this_cancelEphemeralMessage, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190122) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC26205h abstractC26205hValidateCidWithResult = ValidationKt.validateCidWithResult(this.$message.getCid());
                    if (!(abstractC26205hValidateCidWithResult instanceof C26204g)) {
                        if (abstractC26205hValidateCidWithResult instanceof C26203f) {
                            return abstractC26205hValidateCidWithResult;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!MessageUtils.isEphemeral(this.$message)) {
                        throw new IllegalArgumentException("Only ephemeral message can be canceled");
                    }
                    ChannelLogic channelLogicChannelFromMessage = ChatClientKt.getLogic(this.$this_cancelEphemeralMessage).channelFromMessage(this.$message);
                    if (channelLogicChannelFromMessage != null) {
                        channelLogicChannelFromMessage.deleteMessage(this.$message);
                    }
                    List<QueryThreadsLogic> activeQueryThreadsLogic = ChatClientKt.getLogic(this.$this_cancelEphemeralMessage).getActiveQueryThreadsLogic();
                    Message message = this.$message;
                    Iterator<T> it = activeQueryThreadsLogic.iterator();
                    while (it.hasNext()) {
                        ((QueryThreadsLogic) it.next()).deleteMessage$stream_chat_android_client_release(message);
                    }
                    ThreadLogic threadLogicThreadFromMessage = ChatClientKt.getLogic(this.$this_cancelEphemeralMessage).threadFromMessage(this.$message);
                    if (threadLogicThreadFromMessage != null) {
                        threadLogicThreadFromMessage.removeLocalMessage$stream_chat_android_client_release(this.$message);
                    }
                    RepositoryFacade repositoryFacade = this.$this_cancelEphemeralMessage.getRepositoryFacade();
                    Message message2 = this.$message;
                    this.L$0 = null;
                    this.label = 1;
                    if (repositoryFacade.deleteChannelMessage(message2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return new C26204g(Boolean.TRUE);
            } catch (Exception e5) {
                return new C26203f(new C26201d("Could not cancel ephemeral message", e5));
            }
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$downloadAttachment$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$downloadAttachment$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {336, 336}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190132 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Attachment $attachment;
        final /* synthetic */ Context $context;
        final /* synthetic */ ChatClient $this_downloadAttachment;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190132(Context context, Attachment attachment, ChatClient chatClient, InterfaceC30057d<? super C190132> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$context = context;
            this.$attachment = attachment;
            this.$this_downloadAttachment = chatClient;
        }

        private static final C2345k invokeSuspend$lambda$0(InterfaceC23462h interfaceC23462h) {
            return (C2345k) interfaceC23462h.getValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C190132 c190132 = new C190132(this.$context, this.$attachment, this.$this_downloadAttachment, interfaceC30057d);
            c190132.L$0 = obj;
            return c190132;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190132) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:65:0x014a A[Catch: Exception -> 0x0121, TryCatch #4 {Exception -> 0x0121, blocks: (B:56:0x012a, B:58:0x0130, B:63:0x013e, B:65:0x014a, B:66:0x0165, B:68:0x017a, B:70:0x0180, B:71:0x0188, B:73:0x018e, B:74:0x01a4, B:48:0x010b, B:50:0x0117), top: B:92:0x010b }] */
        /* JADX WARN: Code duplicated, block: B:73:0x018e A[Catch: Exception -> 0x0121, LOOP:0: B:71:0x0188->B:73:0x018e, LOOP_END, TryCatch #4 {Exception -> 0x0121, blocks: (B:56:0x012a, B:58:0x0130, B:63:0x013e, B:65:0x014a, B:66:0x0165, B:68:0x017a, B:70:0x0180, B:71:0x0188, B:73:0x018e, B:74:0x01a4, B:48:0x010b, B:50:0x0117), top: B:92:0x010b }] */
        /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
        /* JADX WARN: Instruction removed from duplicated block: B:65:0x014a, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.app.DownloadManager$Request] */
        /* JADX WARN: Type inference failed for: r0v6, types: [android.app.DownloadManager$Request] */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, l83.p] */
        /* JADX WARN: Type inference failed for: r12v18 */
        /* JADX WARN: Type inference failed for: r12v20 */
        /* JADX WARN: Type inference failed for: r12v21 */
        /* JADX WARN: Type inference failed for: r12v22 */
        /* JADX WARN: Type inference failed for: r12v23 */
        /* JADX WARN: Type inference failed for: r12v26 */
        /* JADX WARN: Type inference failed for: r12v5, types: [l83.h] */
        /* JADX WARN: Type inference failed for: r1v1, types: [bc3.c0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12, types: [android.net.Uri, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v25, types: [android.net.Uri, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v47 */
        /* JADX WARN: Type inference failed for: r1v48 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, r83.a] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v21, types: [android.net.Uri] */
        /* JADX WARN: Type inference failed for: r2v23, types: [android.net.Uri] */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v12, types: [android.app.DownloadManager] */
        /* JADX WARN: Type inference failed for: r3v14, types: [android.app.DownloadManager] */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v5, types: [android.app.DownloadManager] */
        /* JADX WARN: Type inference failed for: r3v9, types: [android.app.DownloadManager, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v18, types: [l83.h] */
        /* JADX WARN: Type inference failed for: r4v2, types: [l83.h] */
        /* JADX WARN: Type inference failed for: r4v20, types: [l83.h] */
        /* JADX WARN: Type inference failed for: r4v21 */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v23 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8, types: [l83.h] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ?? r10;
            ?? r14;
            ?? r15;
            ?? r16;
            CDNRequest cDNRequest;
            Exception e5;
            ?? r17;
            C2345k c2345k;
            InterfaceC2339e interfaceC2339e;
            String str;
            EnumC2341g enumC2341g;
            ?? r18;
            ?? r19;
            ?? r24;
            C2345k c2345k2;
            InterfaceC2339e interfaceC2339e2;
            EnumC2341g enumC2341g2;
            DownloadManager.Request notificationVisibility;
            Map<String, String> headers;
            String url;
            Uri uri;
            String title;
            String attachmentNameFromUrl;
            ?? CreateAttachmentFallbackName = (InterfaceC2994c0) this.L$0;
            CreateAttachmentFallbackName = EnumC31071a.f128113w;
            ?? r25 = this.label;
            obj = 2;
            try {
                if (r25 == 0) {
                    AbstractC34132o.m107864I(obj);
                    obj = AbstractC1772c1.m5382S(CreateAttachmentFallbackName, "Chat:DownloadAttachment");
                    try {
                        Object systemService = this.$context.getSystemService("download");
                        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                        r25 = (DownloadManager) systemService;
                        String assetUrl = this.$attachment.getAssetUrl();
                        if (assetUrl == null) {
                            assetUrl = this.$attachment.getImageUrl();
                        }
                        CreateAttachmentFallbackName = Uri.parse(assetUrl);
                        String name = this.$attachment.getName();
                        CreateAttachmentFallbackName = name;
                        if (name == null && (title = this.$attachment.getTitle()) == null && (attachmentNameFromUrl = AttachmentKt.parseAttachmentNameFromUrl(this.$attachment)) == null) {
                            CreateAttachmentFallbackName = title;
                            CreateAttachmentFallbackName = attachmentNameFromUrl;
                            CreateAttachmentFallbackName = ChatClientExtensions.createAttachmentFallbackName();
                        }
                        try {
                            CreateAttachmentFallbackName = title;
                            CreateAttachmentFallbackName = attachmentNameFromUrl;
                            CreateAttachmentFallbackName = title;
                            CDN cdn = this.$this_downloadAttachment.getCdn();
                            String string = CreateAttachmentFallbackName.toString();
                            AbstractC22676k.m65749i(string, "toString(...)");
                            if (AttachmentUtilsKt.isImage(this.$attachment)) {
                                if (cdn != null) {
                                    this.L$0 = null;
                                    this.L$1 = obj;
                                    this.L$2 = r25;
                                    this.L$3 = CreateAttachmentFallbackName;
                                    this.L$4 = CreateAttachmentFallbackName;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.label = 1;
                                    Object objImageRequest = cdn.imageRequest(string, this);
                                    if (objImageRequest == CreateAttachmentFallbackName) {
                                        return CreateAttachmentFallbackName;
                                    }
                                    obj = objImageRequest;
                                }
                                r15 = obj;
                                r14 = CreateAttachmentFallbackName;
                                r16 = r25;
                                r10 = CreateAttachmentFallbackName;
                                cDNRequest = null;
                                r24 = r14;
                                r19 = r16;
                                obj = r15;
                                r18 = r10;
                            } else {
                                if (cdn != null) {
                                    this.L$0 = null;
                                    this.L$1 = obj;
                                    this.L$2 = r25;
                                    this.L$3 = CreateAttachmentFallbackName;
                                    this.L$4 = CreateAttachmentFallbackName;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.label = 2;
                                    Object objFileRequest = cdn.fileRequest(string, this);
                                    if (objFileRequest != CreateAttachmentFallbackName) {
                                        obj = objFileRequest;
                                    }
                                    return CreateAttachmentFallbackName;
                                }
                                r15 = obj;
                                r14 = CreateAttachmentFallbackName;
                                r16 = r25;
                                r10 = CreateAttachmentFallbackName;
                                cDNRequest = null;
                                r24 = r14;
                                r19 = r16;
                                obj = r15;
                                r18 = r10;
                            }
                        } catch (Exception e13) {
                            obj = obj;
                            e = e13;
                            CreateAttachmentFallbackName = CreateAttachmentFallbackName;
                            CreateAttachmentFallbackName = CreateAttachmentFallbackName;
                            try {
                                C2345k c2345k3 = (C2345k) obj.getValue();
                                try {
                                    InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
                                    EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                                    if (interfaceC2339e3.isLoggable(enumC2341g3, c2345k3.f9273a)) {
                                        c2345k3.f9274b.log(enumC2341g3, c2345k3.f9273a, "CDN request failed for attachment. Falling back to original URL.", e);
                                    }
                                    r10 = CreateAttachmentFallbackName;
                                    r14 = CreateAttachmentFallbackName;
                                    r16 = r25;
                                    r15 = obj;
                                } catch (Exception e14) {
                                    e5 = e14;
                                    r17 = obj;
                                    c2345k = (C2345k) r17.getValue();
                                    interfaceC2339e = c2345k.f9275c;
                                    str = c2345k.f9273a;
                                    enumC2341g = EnumC2341g.DEBUG;
                                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                        c2345k.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("Downloading attachment failed. Error: ", e5.getMessage()), null);
                                    }
                                    return new C26203f(new C26201d("Could not download the attachment", e5));
                                }
                            } catch (Exception e15) {
                                e5 = e15;
                                r17 = obj;
                                c2345k = (C2345k) r17.getValue();
                                interfaceC2339e = c2345k.f9275c;
                                str = c2345k.f9273a;
                                enumC2341g = EnumC2341g.DEBUG;
                                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                    c2345k.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("Downloading attachment failed. Error: ", e5.getMessage()), null);
                                }
                                return new C26203f(new C26201d("Could not download the attachment", e5));
                            }
                        }
                        if (cDNRequest != null && (url = cDNRequest.getUrl()) != null && (uri = Uri.parse(url)) != null) {
                            r24 = uri;
                        }
                        c2345k2 = (C2345k) obj.getValue();
                        interfaceC2339e2 = c2345k2.f9275c;
                        enumC2341g2 = EnumC2341g.DEBUG;
                        if (interfaceC2339e2.isLoggable(enumC2341g2, c2345k2.f9273a)) {
                            c2345k2.f9274b.log(enumC2341g2, c2345k2.f9273a, "Downloading attachment. Name: " + r18 + ", Uri: " + r24, null);
                        }
                        notificationVisibility = new DownloadManager.Request(r24).setTitle(r18).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, r18).setNotificationVisibility(1);
                        if (cDNRequest != null && (headers = cDNRequest.getHeaders()) != null) {
                            for (Map.Entry<String, String> entry : headers.entrySet()) {
                                notificationVisibility.addRequestHeader(entry.getKey(), entry.getValue());
                            }
                        }
                        r19.enqueue(notificationVisibility);
                        return new C26204g(C23454a0.f92919a);
                    } catch (Exception e16) {
                        e5 = e16;
                        r17 = obj;
                        c2345k = (C2345k) r17.getValue();
                        interfaceC2339e = c2345k.f9275c;
                        str = c2345k.f9273a;
                        enumC2341g = EnumC2341g.DEBUG;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            c2345k.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("Downloading attachment failed. Error: ", e5.getMessage()), null);
                        }
                        return new C26203f(new C26201d("Could not download the attachment", e5));
                    }
                }
                if (r25 == 1) {
                    CreateAttachmentFallbackName = (String) this.L$4;
                    CreateAttachmentFallbackName = (Uri) this.L$3;
                    r25 = (DownloadManager) this.L$2;
                    obj = (InterfaceC23462h) this.L$1;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (r25 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CreateAttachmentFallbackName = (String) this.L$4;
                    CreateAttachmentFallbackName = (Uri) this.L$3;
                    r25 = (DownloadManager) this.L$2;
                    obj = (InterfaceC23462h) this.L$1;
                    AbstractC34132o.m107864I(obj);
                }
                cDNRequest = (CDNRequest) obj;
                r18 = CreateAttachmentFallbackName;
                r24 = CreateAttachmentFallbackName;
                r19 = r25;
                obj = obj;
            } catch (Exception e17) {
                e = e17;
            }
            if (cDNRequest != null) {
                r24 = uri;
            }
            c2345k2 = (C2345k) obj.getValue();
            interfaceC2339e2 = c2345k2.f9275c;
            enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, c2345k2.f9273a)) {
                c2345k2.f9274b.log(enumC2341g2, c2345k2.f9273a, "Downloading attachment. Name: " + r18 + ", Uri: " + r24, null);
            }
            notificationVisibility = new DownloadManager.Request(r24).setTitle(r18).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, r18).setNotificationVisibility(1);
            if (cDNRequest != null) {
                while (r12.hasNext()) {
                    notificationVisibility.addRequestHeader(entry.getKey(), entry.getValue());
                }
            }
            r19.enqueue(notificationVisibility);
            return new C26204g(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$getMessageUsingCache$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$getMessageUsingCache$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {483, 488}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190142 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        final /* synthetic */ ChatClient $this_getMessageUsingCache;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190142(ChatClient chatClient, String str, InterfaceC30057d<? super C190142> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_getMessageUsingCache = chatClient;
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190142(this.$this_getMessageUsingCache, this.$messageId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190142) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0046  */
        /* JADX WARN: Code duplicated, block: B:19:0x004c  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r5 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if (r5 == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r4.L$0
                io.getstream.chat.android.models.Message r0 = (io.getstream.chat.android.models.Message) r0
                p505ts.AbstractC34132o.m107864I(r5)
                goto L60
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L42
            L20:
                p505ts.AbstractC34132o.m107864I(r5)
                io.getstream.chat.android.client.ChatClient r5 = r4.$this_getMessageUsingCache
                io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry r5 = io.getstream.chat.android.client.internal.state.extensions.internal.ChatClientKt.getLogic(r5)
                java.lang.String r1 = r4.$messageId
                io.getstream.chat.android.models.Message r5 = r5.getMessageById(r1)
                if (r5 != 0) goto L44
                io.getstream.chat.android.client.ChatClient r5 = r4.$this_getMessageUsingCache
                io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry r5 = io.getstream.chat.android.client.internal.state.extensions.internal.ChatClientKt.getLogic(r5)
                java.lang.String r1 = r4.$messageId
                r4.label = r3
                java.lang.Object r5 = r5.getMessageByIdFromDb(r1, r4)
                if (r5 != r0) goto L42
                goto L5f
            L42:
                io.getstream.chat.android.models.Message r5 = (io.getstream.chat.android.models.Message) r5
            L44:
                if (r5 == 0) goto L4c
                n23.g r0 = new n23.g
                r0.<init>(r5)
                return r0
            L4c:
                io.getstream.chat.android.client.ChatClient r5 = r4.$this_getMessageUsingCache
                java.lang.String r1 = r4.$messageId
                o23.d r5 = r5.getMessage(r1)
                r1 = 0
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r5.await(r4)
                if (r5 != r0) goto L60
            L5f:
                return r0
            L60:
                n23.h r5 = (n23.AbstractC26205h) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.api.state.ChatClientExtensions.C190142.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lio/getstream/chat/android/models/InitializationState;", "initializationState", "", "userId", "Ll83/k;", "", "<anonymous>", "(Lio/getstream/chat/android/models/InitializationState;Ljava/lang/String;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190162 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C190162(InterfaceC30057d<? super C190162> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InitializationState initializationState, String str, InterfaceC30057d<? super C23465k> interfaceC30057d) {
            C190162 c190162 = new C190162(3, interfaceC30057d);
            c190162.L$0 = initializationState;
            c190162.L$1 = str;
            return c190162.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InitializationState initializationState = (InitializationState) this.L$0;
            String str = (String) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C23465k(str, Boolean.valueOf(initializationState == InitializationState.COMPLETE));
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$3", m100430f = "ChatClientStateExtensions.kt", m100431l = {273}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, m65681d2 = {"T", "Ll83/k;", "", "", "it", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190173 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Function1 $producer;
        /* synthetic */ Object L$0;
        Object L$1;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190173(Function1 function1, InterfaceC30057d<? super C190173> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$producer = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C190173 c190173 = new C190173(this.$producer, interfaceC30057d);
            c190173.L$0 = obj;
            return c190173;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23465k c23465k = (C23465k) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = (String) c23465k.f92937w;
            boolean zBooleanValue = ((Boolean) c23465k.f92938x).booleanValue();
            if (str == null || !zBooleanValue) {
                return null;
            }
            Function1 function1 = this.$producer;
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = zBooleanValue;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == enumC31071a ? enumC31071a : objInvoke;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C23465k c23465k, InterfaceC30057d<? super T> interfaceC30057d) {
            return ((C190173) create(c23465k, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$loadMessageById$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$loadMessageById$3", m100430f = "ChatClientStateExtensions.kt", m100431l = {508}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190183 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ String $messageId;
        final /* synthetic */ ChatClient $this_loadMessageById;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190183(ChatClient chatClient, String str, String str2, InterfaceC30057d<? super C190183> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_loadMessageById = chatClient;
            this.$cid = str;
            this.$messageId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190183(this.$this_loadMessageById, this.$cid, this.$messageId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190183) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChatClient chatClient = this.$this_loadMessageById;
            String str = this.$cid;
            String str2 = this.$messageId;
            this.label = 1;
            Object objLoadMessageByIdInternal = ChatClientExtensions.loadMessageByIdInternal(chatClient, str, str2, this);
            return objLoadMessageByIdInternal == enumC31071a ? enumC31071a : objLoadMessageByIdInternal;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$loadMessageByIdInternal$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions", m100430f = "ChatClientStateExtensions.kt", m100431l = {524}, m100432m = "loadMessageByIdInternal")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190191 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C190191(InterfaceC30057d<? super C190191> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClientExtensions.loadMessageByIdInternal(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$loadMessagesAroundId$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$loadMessagesAroundId$3", m100430f = "ChatClientStateExtensions.kt", m100431l = {427}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190203 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ String $messageId;
        final /* synthetic */ ChatClient $this_loadMessagesAroundId;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190203(String str, ChatClient chatClient, String str2, InterfaceC30057d<? super C190203> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$this_loadMessagesAroundId = chatClient;
            this.$messageId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190203(this.$cid, this.$this_loadMessagesAroundId, this.$messageId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190203) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26205h abstractC26205hValidateCidWithResult = ValidationKt.validateCidWithResult(this.$cid);
                if (!(abstractC26205hValidateCidWithResult instanceof C26204g)) {
                    if (abstractC26205hValidateCidWithResult instanceof C26203f) {
                        return abstractC26205hValidateCidWithResult;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.$cid);
                ChannelLogic channelLogicChannel = ChatClientKt.getLogic(this.$this_loadMessagesAroundId).channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
                String str = this.$messageId;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = channelLogicChannel.loadAround(str, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC26205h) obj;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$loadNewerMessages$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$loadNewerMessages$3", m100430f = "ChatClientStateExtensions.kt", m100431l = {401}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190213 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $baseMessageId;
        final /* synthetic */ String $channelCid;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ ChatClient $this_loadNewerMessages;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190213(String str, ChatClient chatClient, String str2, int i13, InterfaceC30057d<? super C190213> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelCid = str;
            this.$this_loadNewerMessages = chatClient;
            this.$baseMessageId = str2;
            this.$messageLimit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190213(this.$channelCid, this.$this_loadNewerMessages, this.$baseMessageId, this.$messageLimit, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190213) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26205h abstractC26205hValidateCidWithResult = ValidationKt.validateCidWithResult(this.$channelCid);
                if (!(abstractC26205hValidateCidWithResult instanceof C26204g)) {
                    if (abstractC26205hValidateCidWithResult instanceof C26203f) {
                        return abstractC26205hValidateCidWithResult;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.$channelCid);
                ChannelLogic channelLogicChannel = ChatClientKt.getLogic(this.$this_loadNewerMessages).channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
                String str = this.$baseMessageId;
                int i14 = this.$messageLimit;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = channelLogicChannel.loadAfter(str, i14, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC26205h) obj;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$loadNewestMessages$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$loadNewestMessages$3", m100430f = "ChatClientStateExtensions.kt", m100431l = {567}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190223 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ ChatClient $this_loadNewestMessages;
        final /* synthetic */ boolean $userPresence;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190223(String str, ChatClient chatClient, int i13, boolean z4, InterfaceC30057d<? super C190223> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$this_loadNewestMessages = chatClient;
            this.$messageLimit = i13;
            this.$userPresence = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190223(this.$cid, this.$this_loadNewestMessages, this.$messageLimit, this.$userPresence, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190223) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26205h abstractC26205hValidateCidWithResult = ValidationKt.validateCidWithResult(this.$cid);
                if (!(abstractC26205hValidateCidWithResult instanceof C26204g)) {
                    if (abstractC26205hValidateCidWithResult instanceof C26203f) {
                        return new C26203f(((C26203f) abstractC26205hValidateCidWithResult).f103918a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.$cid);
                ChannelLogic channelLogicChannel = ChatClientKt.getLogic(this.$this_loadNewestMessages).channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
                int i14 = this.$messageLimit;
                boolean z4 = this.$userPresence;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = channelLogicChannel.watch(i14, z4, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC26205h) obj;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$loadOlderMessages$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$loadOlderMessages$3", m100430f = "ChatClientStateExtensions.kt", m100431l = {379}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190233 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ ChatClient $this_loadOlderMessages;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190233(String str, ChatClient chatClient, int i13, InterfaceC30057d<? super C190233> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$this_loadOlderMessages = chatClient;
            this.$messageLimit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190233(this.$cid, this.$this_loadOlderMessages, this.$messageLimit, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190233) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26205h abstractC26205hValidateCidWithResult = ValidationKt.validateCidWithResult(this.$cid);
                if (!(abstractC26205hValidateCidWithResult instanceof C26204g)) {
                    if (abstractC26205hValidateCidWithResult instanceof C26203f) {
                        return abstractC26205hValidateCidWithResult;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.$cid);
                ChannelLogic channelLogicChannel = ChatClientKt.getLogic(this.$this_loadOlderMessages).channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
                int i14 = this.$messageLimit;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = channelLogicChannel.loadBefore(null, i14, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC26205h) obj;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$queryChannelsAsState$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$queryChannelsAsState$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {139}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/client/api/state/QueryChannelsState;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190242 extends AbstractC32275i implements Function1 {
        final /* synthetic */ ChatEventHandlerFactory $chatEventHandlerFactory;
        final /* synthetic */ InterfaceC2994c0 $coroutineScope;
        final /* synthetic */ QueryChannelsRequest $request;
        final /* synthetic */ ChatClient $this_queryChannelsAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190242(ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, QueryChannelsRequest queryChannelsRequest, ChatEventHandlerFactory chatEventHandlerFactory, InterfaceC30057d<? super C190242> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$this_queryChannelsAsState = chatClient;
            this.$coroutineScope = interfaceC2994c0;
            this.$request = queryChannelsRequest;
            this.$chatEventHandlerFactory = chatEventHandlerFactory;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new C190242(this.$this_queryChannelsAsState, this.$coroutineScope, this.$request, this.$chatEventHandlerFactory, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChatClientStateCalls chatClientStateCallsRequestsAsState = ChatClientKt.requestsAsState(this.$this_queryChannelsAsState, this.$coroutineScope);
            QueryChannelsRequest queryChannelsRequest = this.$request;
            ChatEventHandlerFactory chatEventHandlerFactory = this.$chatEventHandlerFactory;
            this.label = 1;
            Object objQueryChannels$stream_chat_android_client_release = chatClientStateCallsRequestsAsState.queryChannels$stream_chat_android_client_release(queryChannelsRequest, chatEventHandlerFactory, this);
            return objQueryChannels$stream_chat_android_client_release == enumC31071a ? enumC31071a : objQueryChannels$stream_chat_android_client_release;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super QueryChannelsState> interfaceC30057d) {
            return ((C190242) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$queryThreadsAsState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$queryThreadsAsState$1", m100430f = "ChatClientStateExtensions.kt", m100431l = {205}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/client/api/state/QueryThreadsState;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190251 extends AbstractC32275i implements Function1 {
        final /* synthetic */ InterfaceC2994c0 $coroutineScope;
        final /* synthetic */ QueryThreadsRequest $request;
        final /* synthetic */ ChatClient $this_queryThreadsAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190251(ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C190251> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$this_queryThreadsAsState = chatClient;
            this.$coroutineScope = interfaceC2994c0;
            this.$request = queryThreadsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new C190251(this.$this_queryThreadsAsState, this.$coroutineScope, this.$request, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChatClientStateCalls chatClientStateCallsRequestsAsState = ChatClientKt.requestsAsState(this.$this_queryThreadsAsState, this.$coroutineScope);
            QueryThreadsRequest queryThreadsRequest = this.$request;
            this.label = 1;
            Object objQueryThreads$stream_chat_android_client_release = chatClientStateCallsRequestsAsState.queryThreads$stream_chat_android_client_release(queryThreadsRequest, this);
            return objQueryThreads$stream_chat_android_client_release == enumC31071a ? enumC31071a : objQueryThreads$stream_chat_android_client_release;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super QueryThreadsState> interfaceC30057d) {
            return ((C190251) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$setMessageForReply$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$setMessageForReply$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190262 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ Message $message;
        final /* synthetic */ ChatClient $this_setMessageForReply;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190262(String str, ChatClient chatClient, Message message, InterfaceC30057d<? super C190262> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$this_setMessageForReply = chatClient;
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190262(this.$cid, this.$this_setMessageForReply, this.$message, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190262) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC26205h abstractC26205hValidateCidWithResult = ValidationKt.validateCidWithResult(this.$cid);
            if (!(abstractC26205hValidateCidWithResult instanceof C26204g)) {
                if (abstractC26205hValidateCidWithResult instanceof C26203f) {
                    return abstractC26205hValidateCidWithResult;
                }
                throw new NoWhenBranchMatchedException();
            }
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.$cid);
            ChatClientKt.getLogic(this.$this_setMessageForReply).channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x).setRepliedMessage(this.$message);
            return new C26204g(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$watchChannelAsState$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$watchChannelAsState$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {164}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/client/channel/state/ChannelState;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190292 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        final /* synthetic */ InterfaceC2994c0 $coroutineScope;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ ChatClient $this_watchChannelAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190292(ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, String str, int i13, InterfaceC30057d<? super C190292> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$this_watchChannelAsState = chatClient;
            this.$coroutineScope = interfaceC2994c0;
            this.$cid = str;
            this.$messageLimit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new C190292(this.$this_watchChannelAsState, this.$coroutineScope, this.$cid, this.$messageLimit, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChatClientStateCalls chatClientStateCallsRequestsAsState = ChatClientKt.requestsAsState(this.$this_watchChannelAsState, this.$coroutineScope);
            String str = this.$cid;
            int i14 = this.$messageLimit;
            boolean userPresence = ChatClientExtensions.getChatClientConfig(this.$this_watchChannelAsState).getUserPresence();
            this.label = 1;
            Object objWatchChannel$stream_chat_android_client_release$default = ChatClientStateCalls.watchChannel$stream_chat_android_client_release$default(chatClientStateCallsRequestsAsState, str, i14, userPresence, null, this, 8, null);
            return objWatchChannel$stream_chat_android_client_release$default == enumC31071a ? enumC31071a : objWatchChannel$stream_chat_android_client_release$default;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ChannelState> interfaceC30057d) {
            return ((C190292) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$watchChannelAsState$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$watchChannelAsState$4", m100430f = "ChatClientStateExtensions.kt", m100431l = {188}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/client/channel/state/ChannelState;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190304 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $aroundMessageId;
        final /* synthetic */ String $cid;
        final /* synthetic */ InterfaceC2994c0 $coroutineScope;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ ChatClient $this_watchChannelAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190304(ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, String str, int i13, String str2, InterfaceC30057d<? super C190304> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$this_watchChannelAsState = chatClient;
            this.$coroutineScope = interfaceC2994c0;
            this.$cid = str;
            this.$messageLimit = i13;
            this.$aroundMessageId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new C190304(this.$this_watchChannelAsState, this.$coroutineScope, this.$cid, this.$messageLimit, this.$aroundMessageId, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChatClientStateCalls chatClientStateCallsRequestsAsState = ChatClientKt.requestsAsState(this.$this_watchChannelAsState, this.$coroutineScope);
            String str = this.$cid;
            int i14 = this.$messageLimit;
            boolean userPresence = ChatClientExtensions.getChatClientConfig(this.$this_watchChannelAsState).getUserPresence();
            String str2 = this.$aroundMessageId;
            this.label = 1;
            Object objWatchChannel$stream_chat_android_client_release = chatClientStateCallsRequestsAsState.watchChannel$stream_chat_android_client_release(str, i14, userPresence, str2, this);
            return objWatchChannel$stream_chat_android_client_release == enumC31071a ? enumC31071a : objWatchChannel$stream_chat_android_client_release;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ChannelState> interfaceC30057d) {
            return ((C190304) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3031l1 m54553a(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) downloadAttachment$lambda$9(interfaceC3027k1);
    }

    @InternalStreamChatApi
    public static final Object awaitRepliesAsState(ChatClient chatClient, String str, int i13, boolean z4, InterfaceC30057d<? super ThreadState> interfaceC30057d) {
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, AbstractC25012a.m73374g(i13, "[awaitRepliesAsState] messageId: ", str, ", messageLimit: "), null);
        }
        return AbstractC3006f0.m8719m(new C190113(chatClient, str, i13, z4, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3031l1 m54554b(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) loadNewerMessages$lambda$13(interfaceC3027k1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C3031l1 m54555c(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) loadMessageById$lambda$19(interfaceC3027k1);
    }

    public static final InterfaceC27474d cancelEphemeralMessage(ChatClient chatClient, Message message) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(message, "message");
        return new C27478h(chatClient.inheritScope(new C19031a(0)), new C190122(message, chatClient, null));
    }

    private static final InterfaceC30063j cancelEphemeralMessage$lambda$16(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createAttachmentFallbackName() {
        return AbstractC11266d.m30461o("attachment_", new SimpleDateFormat(ATTACHMENT_FALLBACK_NAME_DATE_FORMAT, Locale.getDefault()).format(new Date()).toString());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C3031l1 m54556d(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) getMessageUsingCache$lambda$17(interfaceC3027k1);
    }

    public static final InterfaceC27474d downloadAttachment(ChatClient chatClient, Context context, Attachment attachment) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attachment, "attachment");
        return new C27478h(chatClient.inheritScope(new C18510t(27)), new C190132(context, attachment, chatClient, null));
    }

    private static final InterfaceC30063j downloadAttachment$lambda$9(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C3031l1 m54557e(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) loadNewestMessages$lambda$23(interfaceC3027k1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C3031l1 m54558f(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) loadOlderMessages$lambda$11(interfaceC3027k1);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C3031l1 m54559g(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) cancelEphemeralMessage$lambda$16(interfaceC3027k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatClientConfig getChatClientConfig(ChatClient chatClient) throws InterruptedException {
        Object objResolveDependency;
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        Object obj = null;
        if (interfaceC2339e.isLoggable(enumC2341g, ChatClient.TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            interfaceC2344j.log(enumC2341g, ChatClient.TAG, AbstractC31061c.m95640p("[resolveDependency] DR: ", c22673i0.getOrCreateKotlinClass(StreamStatePluginFactory.class).getSimpleName(), ", T: ", c22673i0.getOrCreateKotlinClass(ChatClientConfig.class).getSimpleName()), null);
        }
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        if (AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StreamStatePluginFactory.class), c22673i1.getOrCreateKotlinClass(PluginFactory.class))) {
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g2, ChatClient.TAG, AbstractC31061c.m95640p("[resolveFactoryDependency] F: ", c22673i1.getOrCreateKotlinClass(StreamStatePluginFactory.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(ChatClientConfig.class).getSimpleName()), null);
            }
            for (Object obj2 : chatClient.getPluginFactories()) {
                if (((PluginFactory) obj2) instanceof StreamStatePluginFactory) {
                    obj = obj2;
                    break;
                }
            }
            PluginFactory pluginFactory = (PluginFactory) obj;
            if (pluginFactory == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Factory '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StreamStatePluginFactory.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
            objResolveDependency = pluginFactory.resolveDependency(c22673i2.getOrCreateKotlinClass(ChatClientConfig.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i2.getOrCreateKotlinClass(ChatClientConfig.class).getQualifiedName(), "' was not resolved by factory '", c22673i2.getOrCreateKotlinClass(StreamStatePluginFactory.class).getQualifiedName(), "'"));
            }
        } else {
            if (!AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StreamStatePluginFactory.class), c22673i1.getOrCreateKotlinClass(Plugin.class))) {
                throw new IllegalStateException(("Unsupported dependency resolver: " + c22673i1.getOrCreateKotlinClass(StreamStatePluginFactory.class)).toString());
            }
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g3, ChatClient.TAG, AbstractC31061c.m95640p("[resolvePluginDependency] P: ", c22673i1.getOrCreateKotlinClass(StreamStatePluginFactory.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(ChatClientConfig.class).getSimpleName()), null);
            }
            List<Plugin> plugins = chatClient.getPlugins();
            InitializationState initializationStateAwaitInitializationState = chatClient.awaitInitializationState(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
            if (initializationStateAwaitInitializationState != InitializationState.COMPLETE) {
                InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
                EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
                if (interfaceC2339e4.isLoggable(enumC2341g4, ChatClient.TAG)) {
                    C2343i.f9271c.log(enumC2341g4, ChatClient.TAG, "[resolvePluginDependency] failed (initializationState is not COMPLETE): " + initializationStateAwaitInitializationState + " ", null);
                }
                throw new IllegalStateException("ChatClient::connectUser() must be called before resolving any dependency");
            }
            for (Object obj3 : plugins) {
                if (((Plugin) obj3) instanceof StreamStatePluginFactory) {
                    obj = obj3;
                    break;
                }
            }
            Plugin plugin = (Plugin) obj;
            if (plugin == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Plugin '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StreamStatePluginFactory.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
            objResolveDependency = plugin.resolveDependency(c22673i3.getOrCreateKotlinClass(ChatClientConfig.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i3.getOrCreateKotlinClass(ChatClientConfig.class).getQualifiedName(), "' was not resolved by plugin '", c22673i3.getOrCreateKotlinClass(StreamStatePluginFactory.class).getQualifiedName(), "'"));
            }
        }
        return (ChatClientConfig) objResolveDependency;
    }

    public static final GlobalState getGlobalState(ChatClient chatClient) throws InterruptedException, IllegalArgumentException {
        Object objResolveDependency;
        AbstractC22676k.m65750j(chatClient, "<this>");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        Object obj = null;
        if (interfaceC2339e.isLoggable(enumC2341g, ChatClient.TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            interfaceC2344j.log(enumC2341g, ChatClient.TAG, AbstractC31061c.m95640p("[resolveDependency] DR: ", c22673i0.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i0.getOrCreateKotlinClass(GlobalState.class).getSimpleName()), null);
        }
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        if (AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StatePlugin.class), c22673i1.getOrCreateKotlinClass(PluginFactory.class))) {
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g2, ChatClient.TAG, AbstractC31061c.m95640p("[resolveFactoryDependency] F: ", c22673i1.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(GlobalState.class).getSimpleName()), null);
            }
            for (Object obj2 : chatClient.getPluginFactories()) {
                if (((PluginFactory) obj2) instanceof StatePlugin) {
                    obj = obj2;
                    break;
                }
            }
            PluginFactory pluginFactory = (PluginFactory) obj;
            if (pluginFactory == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Factory '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
            objResolveDependency = pluginFactory.resolveDependency(c22673i2.getOrCreateKotlinClass(GlobalState.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i2.getOrCreateKotlinClass(GlobalState.class).getQualifiedName(), "' was not resolved by factory '", c22673i2.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "'"));
            }
        } else {
            if (!AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StatePlugin.class), c22673i1.getOrCreateKotlinClass(Plugin.class))) {
                throw new IllegalStateException(("Unsupported dependency resolver: " + c22673i1.getOrCreateKotlinClass(StatePlugin.class)).toString());
            }
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g3, ChatClient.TAG, AbstractC31061c.m95640p("[resolvePluginDependency] P: ", c22673i1.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(GlobalState.class).getSimpleName()), null);
            }
            List<Plugin> plugins = chatClient.getPlugins();
            InitializationState initializationStateAwaitInitializationState = chatClient.awaitInitializationState(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
            if (initializationStateAwaitInitializationState != InitializationState.COMPLETE) {
                InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
                EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
                if (interfaceC2339e4.isLoggable(enumC2341g4, ChatClient.TAG)) {
                    C2343i.f9271c.log(enumC2341g4, ChatClient.TAG, "[resolvePluginDependency] failed (initializationState is not COMPLETE): " + initializationStateAwaitInitializationState + " ", null);
                }
                throw new IllegalStateException("ChatClient::connectUser() must be called before resolving any dependency");
            }
            for (Object obj3 : plugins) {
                if (((Plugin) obj3) instanceof StatePlugin) {
                    obj = obj3;
                    break;
                }
            }
            Plugin plugin = (Plugin) obj;
            if (plugin == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Plugin '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
            objResolveDependency = plugin.resolveDependency(c22673i3.getOrCreateKotlinClass(GlobalState.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i3.getOrCreateKotlinClass(GlobalState.class).getQualifiedName(), "' was not resolved by plugin '", c22673i3.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "'"));
            }
        }
        return (GlobalState) objResolveDependency;
    }

    public static final InterfaceC13058l getGlobalStateFlow(final ChatClient chatClient) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        final C13052j1 c13052j1 = new C13052j1(chatClient.getClientState().getInitializationState(), new ChatClientExtensions$globalStateFlow$1(2, null), 0);
        final InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$filter$1

            /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$filter$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C190272<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$filter$1$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {50}, m100432m = "emit")
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
                        return C190272.this.emit(null, this);
                    }
                }

                public C190272(InterfaceC13062m interfaceC13062m) {
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
                        if (((InitializationState) obj) == InitializationState.COMPLETE) {
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC13062m.emit(obj, anonymousClass1) == enumC31071a) {
                                return enumC31071a;
                            }
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
                Object objCollect = c13052j1.collect(new C190272(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        return new InterfaceC13058l() { // from class: io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C190282<T> implements InterfaceC13062m {
                final /* synthetic */ ChatClient $this_globalStateFlow$inlined;
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$special$$inlined$map$1$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {50}, m100432m = "emit")
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
                        return C190282.this.emit(null, this);
                    }
                }

                public C190282(InterfaceC13062m interfaceC13062m, ChatClient chatClient) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.$this_globalStateFlow$inlined = chatClient;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws InterruptedException {
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
                        GlobalState globalState = ChatClientExtensions.getGlobalState(this.$this_globalStateFlow$inlined);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(globalState, anonymousClass1) == enumC31071a) {
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
                Object objCollect = interfaceC13058l.collect(new C190282(interfaceC13062m, chatClient), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
    }

    public static final InterfaceC27474d getMessageUsingCache(ChatClient chatClient, String messageId) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(messageId, "messageId");
        return new C27478h(chatClient.inheritScope(new C19031a(1)), new C190142(chatClient, messageId, null));
    }

    private static final InterfaceC30063j getMessageUsingCache$lambda$17(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    public static final Object getRepliesAsState(ChatClient chatClient, String str, int i13, boolean z4, InterfaceC30057d<? super ThreadState> interfaceC30057d) {
        return getRepliesAsState$default(chatClient, str, i13, z4, null, interfaceC30057d, 8, null);
    }

    public static /* synthetic */ Object getRepliesAsState$default(ChatClient chatClient, String str, int i13, boolean z4, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            interfaceC2994c0 = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO());
        }
        return getRepliesAsState(chatClient, str, i13, z4, interfaceC2994c0, interfaceC30057d);
    }

    public static final StateRegistry getState(ChatClient chatClient) throws InterruptedException, IllegalArgumentException {
        Object objResolveDependency;
        AbstractC22676k.m65750j(chatClient, "<this>");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        Object obj = null;
        if (interfaceC2339e.isLoggable(enumC2341g, ChatClient.TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            interfaceC2344j.log(enumC2341g, ChatClient.TAG, AbstractC31061c.m95640p("[resolveDependency] DR: ", c22673i0.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i0.getOrCreateKotlinClass(StateRegistry.class).getSimpleName()), null);
        }
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        if (AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StatePlugin.class), c22673i1.getOrCreateKotlinClass(PluginFactory.class))) {
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g2, ChatClient.TAG, AbstractC31061c.m95640p("[resolveFactoryDependency] F: ", c22673i1.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(StateRegistry.class).getSimpleName()), null);
            }
            for (Object obj2 : chatClient.getPluginFactories()) {
                if (((PluginFactory) obj2) instanceof StatePlugin) {
                    obj = obj2;
                    break;
                }
            }
            PluginFactory pluginFactory = (PluginFactory) obj;
            if (pluginFactory == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Factory '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
            objResolveDependency = pluginFactory.resolveDependency(c22673i2.getOrCreateKotlinClass(StateRegistry.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i2.getOrCreateKotlinClass(StateRegistry.class).getQualifiedName(), "' was not resolved by factory '", c22673i2.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "'"));
            }
        } else {
            if (!AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StatePlugin.class), c22673i1.getOrCreateKotlinClass(Plugin.class))) {
                throw new IllegalStateException(("Unsupported dependency resolver: " + c22673i1.getOrCreateKotlinClass(StatePlugin.class)).toString());
            }
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g3, ChatClient.TAG, AbstractC31061c.m95640p("[resolvePluginDependency] P: ", c22673i1.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(StateRegistry.class).getSimpleName()), null);
            }
            List<Plugin> plugins = chatClient.getPlugins();
            InitializationState initializationStateAwaitInitializationState = chatClient.awaitInitializationState(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
            if (initializationStateAwaitInitializationState != InitializationState.COMPLETE) {
                InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
                EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
                if (interfaceC2339e4.isLoggable(enumC2341g4, ChatClient.TAG)) {
                    C2343i.f9271c.log(enumC2341g4, ChatClient.TAG, "[resolvePluginDependency] failed (initializationState is not COMPLETE): " + initializationStateAwaitInitializationState + " ", null);
                }
                throw new IllegalStateException("ChatClient::connectUser() must be called before resolving any dependency");
            }
            for (Object obj3 : plugins) {
                if (((Plugin) obj3) instanceof StatePlugin) {
                    obj = obj3;
                    break;
                }
            }
            Plugin plugin = (Plugin) obj;
            if (plugin == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Plugin '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
            objResolveDependency = plugin.resolveDependency(c22673i3.getOrCreateKotlinClass(StateRegistry.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i3.getOrCreateKotlinClass(StateRegistry.class).getQualifiedName(), "' was not resolved by plugin '", c22673i3.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "'"));
            }
        }
        return (StateRegistry) objResolveDependency;
    }

    private static final <T> InterfaceC13037f2 getStateOrNull(ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, Function1 function1) {
        InterfaceC13037f2 initializationState = chatClient.getClientState().getInitializationState();
        final InterfaceC13037f2 user = chatClient.getClientState().getUser();
        return AbstractC13091v.m36587M(AbstractC13091v.m36583I(new C190173(function1, null), AbstractC13091v.m36610t(new C13060l1(initializationState, new InterfaceC13058l() { // from class: io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C190152<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$$inlined$map$1$2", m100430f = "ChatClientStateExtensions.kt", m100431l = {50}, m100432m = "emit")
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
                        return C190152.this.emit(null, this);
                    }
                }

                public C190152(InterfaceC13062m interfaceC13062m) {
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
                        User user = (User) obj;
                        String id4 = user != null ? user.getId() : null;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(id4, anonymousClass1) == enumC31071a) {
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
                Object objCollect = user.collect(new C190152(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, new C190162(3, null), 1))), interfaceC2994c0, C13105z1.f45288a, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C3031l1 m54560h(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) loadMessagesAroundId$lambda$15(interfaceC3027k1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C3031l1 m54561i(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) setMessageForReply$lambda$8(interfaceC3027k1);
    }

    public static final InterfaceC27474d loadMessageById(ChatClient chatClient, String cid, String messageId) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(messageId, "messageId");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, AbstractC31061c.m95640p("[loadMessageById] cid: ", cid, ", messageId: ", messageId), null);
        }
        return new C27478h(chatClient.inheritScope(new C18510t(25)), new C190183(chatClient, cid, messageId, null));
    }

    private static final InterfaceC30063j loadMessageById$lambda$19(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadMessageByIdInternal(ChatClient chatClient, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C190191 c190191;
        if (interfaceC30057d instanceof C190191) {
            c190191 = (C190191) interfaceC30057d;
            int i13 = c190191.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c190191.label = i13 - Integer.MIN_VALUE;
            } else {
                c190191 = new C190191(interfaceC30057d);
            }
        } else {
            c190191 = new C190191(interfaceC30057d);
        }
        Object objLoadAround = c190191.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c190191.label;
        Object obj = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objLoadAround);
            AbstractC26205h abstractC26205hValidateCidWithResult = ValidationKt.validateCidWithResult(str);
            if (abstractC26205hValidateCidWithResult instanceof C26203f) {
                return abstractC26205hValidateCidWithResult;
            }
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(str);
            ChannelLogic channelLogicChannel = ChatClientKt.getLogic(chatClient).channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
            c190191.L$0 = null;
            c190191.L$1 = null;
            c190191.L$2 = str2;
            c190191.L$3 = null;
            c190191.L$4 = null;
            c190191.L$5 = null;
            c190191.label = 1;
            objLoadAround = channelLogicChannel.loadAround(str2, c190191);
            if (objLoadAround == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) c190191.L$2;
            AbstractC34132o.m107864I(objLoadAround);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objLoadAround;
        if (!(abstractC26205h instanceof C26204g)) {
            if (abstractC26205h instanceof C26203f) {
                return new C26203f(new C26198a(AbstractC11266d.m30461o("Error while fetching messages from backend. Messages around id: ", str2)));
            }
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = ((C26204g) abstractC26205h).f103919a;
        for (Object obj3 : ((Channel) obj2).getMessages()) {
            if (AbstractC22676k.m65745e(((Message) obj3).getId(), str2)) {
                obj = obj3;
                break;
            }
        }
        Message message = (Message) obj;
        if (message == null) {
            return new C26203f(new C26198a("The message could not be found."));
        }
        return new C26204g(message);
    }

    public static final InterfaceC27474d loadMessagesAroundId(ChatClient chatClient, String cid, String messageId) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(messageId, "messageId");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, AbstractC31061c.m95640p("[loadMessagesAroundId] cid: ", cid, ", messageId: ", messageId), null);
        }
        return new C27478h(chatClient.inheritScope(new C18510t(29)), new C190203(cid, chatClient, messageId, null));
    }

    private static final InterfaceC30063j loadMessagesAroundId$lambda$15(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    public static final InterfaceC27474d loadNewerMessages(ChatClient chatClient, String channelCid, String baseMessageId, int i13) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(channelCid, "channelCid");
        AbstractC22676k.m65750j(baseMessageId, "baseMessageId");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[loadNewerMessages] cid: ", channelCid, ", messageLimit: ", ", baseMessageId: ");
            sbM30467u.append(baseMessageId);
            interfaceC2344j.log(enumC2341g, TAG, sbM30467u.toString(), null);
        }
        return new C27478h(chatClient.inheritScope(new C19031a(2)), new C190213(channelCid, chatClient, baseMessageId, i13, null));
    }

    private static final InterfaceC30063j loadNewerMessages$lambda$13(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    public static final InterfaceC27474d loadNewestMessages(ChatClient chatClient, String cid, int i13, boolean z4) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[loadNewestMessages] cid: ", cid, ", messageLimit: ", ", userPresence: ");
            sbM30467u.append(z4);
            interfaceC2344j.log(enumC2341g, TAG, sbM30467u.toString(), null);
        }
        return new C27478h(chatClient.inheritScope(new C18510t(26)), new C190223(cid, chatClient, i13, z4, null));
    }

    public static /* synthetic */ InterfaceC27474d loadNewestMessages$default(ChatClient chatClient, String str, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            z4 = true;
        }
        return loadNewestMessages(chatClient, str, i13, z4);
    }

    private static final InterfaceC30063j loadNewestMessages$lambda$23(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    public static final InterfaceC27474d loadOlderMessages(ChatClient chatClient, String cid, int i13) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, AbstractC25012a.m73374g(i13, "[loadOlderMessages] cid: ", cid, ", messageLimit: "), null);
        }
        return new C27478h(chatClient.inheritScope(new C18510t(24)), new C190233(cid, chatClient, i13, null));
    }

    private static final InterfaceC30063j loadOlderMessages$lambda$11(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    public static final InterfaceC13037f2 queryChannelsAsState(ChatClient chatClient, QueryChannelsRequest request) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(request, "request");
        return queryChannelsAsState$default(chatClient, request, null, null, 6, null);
    }

    public static /* synthetic */ InterfaceC13037f2 queryChannelsAsState$default(ChatClient chatClient, QueryChannelsRequest queryChannelsRequest, ChatEventHandlerFactory chatEventHandlerFactory, InterfaceC2994c0 interfaceC2994c0, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            chatEventHandlerFactory = new ChatEventHandlerFactory(chatClient.getClientState());
        }
        if ((i13 & 4) != 0) {
            interfaceC2994c0 = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO());
        }
        return queryChannelsAsState(chatClient, queryChannelsRequest, chatEventHandlerFactory, interfaceC2994c0);
    }

    public static final InterfaceC13037f2 queryThreadsAsState(ChatClient chatClient, QueryThreadsRequest request, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        return getStateOrNull(chatClient, coroutineScope, new C190251(chatClient, coroutineScope, request, null));
    }

    public static /* synthetic */ InterfaceC13037f2 queryThreadsAsState$default(ChatClient chatClient, QueryThreadsRequest queryThreadsRequest, InterfaceC2994c0 interfaceC2994c0, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC2994c0 = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO());
        }
        return queryThreadsAsState(chatClient, queryThreadsRequest, interfaceC2994c0);
    }

    public static final InterfaceC27474d setMessageForReply(ChatClient chatClient, String cid, Message message) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        return new C27478h(chatClient.inheritScope(new C18510t(28)), new C190262(cid, chatClient, message, null));
    }

    private static final InterfaceC30063j setMessageForReply$lambda$8(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    public static final InterfaceC13037f2 watchChannelAsState(ChatClient chatClient, String cid, int i13) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        return watchChannelAsState$default(chatClient, cid, i13, null, 4, null);
    }

    public static /* synthetic */ InterfaceC13037f2 watchChannelAsState$default(ChatClient chatClient, String str, int i13, InterfaceC2994c0 interfaceC2994c0, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            interfaceC2994c0 = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO());
        }
        return watchChannelAsState(chatClient, str, i13, interfaceC2994c0);
    }

    public static final Object getRepliesAsState(ChatClient chatClient, String str, int i13, boolean z4, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ThreadState> interfaceC30057d) {
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[getRepliesAsState] messageId: ", str, ", messageLimit: ", ", olderToNewer: ");
            sbM30467u.append(z4);
            interfaceC2344j.log(enumC2341g, TAG, sbM30467u.toString(), null);
        }
        return ChatClientKt.requestsAsState(chatClient, interfaceC2994c0).getReplies$stream_chat_android_client_release(str, i13, z4, interfaceC30057d);
    }

    public static final InterfaceC13037f2 queryChannelsAsState(ChatClient chatClient, QueryChannelsRequest request, ChatEventHandlerFactory chatEventHandlerFactory) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
        return queryChannelsAsState$default(chatClient, request, chatEventHandlerFactory, null, 4, null);
    }

    @InternalStreamChatApi
    public static final InterfaceC13037f2 watchChannelAsState(ChatClient chatClient, String cid, int i13, String str) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        return watchChannelAsState$default(chatClient, cid, i13, str, null, 8, null);
    }

    public static final InterfaceC13037f2 queryChannelsAsState(ChatClient chatClient, QueryChannelsRequest request, ChatEventHandlerFactory chatEventHandlerFactory, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, "[queryChannelsAsState] request: " + request, null);
        }
        return getStateOrNull(chatClient, coroutineScope, new C190242(chatClient, coroutineScope, request, chatEventHandlerFactory, null));
    }

    public static final InterfaceC13037f2 watchChannelAsState(ChatClient chatClient, String cid, int i13, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, AbstractC25012a.m73374g(i13, "[watchChannelAsState] cid: ", cid, ", messageLimit: "), null);
        }
        return getStateOrNull(chatClient, coroutineScope, new C190292(chatClient, coroutineScope, cid, i13, null));
    }

    public static /* synthetic */ InterfaceC13037f2 watchChannelAsState$default(ChatClient chatClient, String str, int i13, String str2, InterfaceC2994c0 interfaceC2994c0, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            interfaceC2994c0 = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO());
        }
        return watchChannelAsState(chatClient, str, i13, str2, interfaceC2994c0);
    }

    @InternalStreamChatApi
    public static final InterfaceC13037f2 watchChannelAsState(ChatClient chatClient, String cid, int i13, String str, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[watchChannelAsState] cid: ", cid, ", messageLimit: ", ", aroundMessageId: ");
            sbM30467u.append(str);
            interfaceC2344j.log(enumC2341g, TAG, sbM30467u.toString(), null);
        }
        return getStateOrNull(chatClient, coroutineScope, new C190304(chatClient, coroutineScope, cid, i13, str, null));
    }
}
