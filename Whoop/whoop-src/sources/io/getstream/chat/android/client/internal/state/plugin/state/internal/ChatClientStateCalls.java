package io.getstream.chat.android.client.internal.state.plugin.state.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.event.ChatEventHandlerFactory;
import io.getstream.chat.android.client.api.models.Pagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.models.WatchChannelRequest;
import io.getstream.chat.android.client.api.state.QueryChannelsState;
import io.getstream.chat.android.client.api.state.QueryThreadsState;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.api.state.ThreadState;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal.QueryChannelPaginationRequest;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifierKt;
import l83.C23465k;
import l83.InterfaceC23462h;
import o23.AbstractC27476f;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J \u0010 \u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0080@¢\u0006\u0004\b\u001e\u0010\u001fJ4\u0010&\u001a\u00020\r2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\bH\u0080@¢\u0006\u0004\b$\u0010%J\u0018\u0010+\u001a\u00020(2\u0006\u0010\f\u001a\u00020'H\u0080@¢\u0006\u0004\b)\u0010*J(\u0010/\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b-\u0010.J(\u00101\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b0\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;", "", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lbc3/c0;", "scope", "<init>", "(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V", "", "channelType", "channelId", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "", "olderToNewer", "messageId", "", "messageLimit", "Lo23/d;", "", "Lio/getstream/chat/android/models/Message;", "repliesCall", "(ZLjava/lang/String;I)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "chatEventHandlerFactory", "Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "queryChannels$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lq83/d;)Ljava/lang/Object;", "queryChannels", "cid", "userPresence", "aroundMessageId", "watchChannel$stream_chat_android_client_release", "(Ljava/lang/String;IZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "watchChannel", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/client/api/state/QueryThreadsState;", "queryThreads$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "queryThreads", "Lio/getstream/chat/android/client/api/state/ThreadState;", "getReplies$stream_chat_android_client_release", "(Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;", "getReplies", "awaitReplies$stream_chat_android_client_release", "awaitReplies", "Lio/getstream/chat/android/client/ChatClient;", "Lbc3/c0;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lbc3/i0;", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "deferredState", "Lbc3/i0;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClientStateCalls {
    private final ChatClient chatClient;
    private final InterfaceC3018i0 deferredState;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$queryChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls", m100430f = "ChatClientStateCalls.kt", m100431l = {84}, m100432m = "queryChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193461 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C193461(InterfaceC30057d<? super C193461> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClientStateCalls.this.queryChannel(null, null, null, this);
        }
    }

    public ChatClientStateCalls(ChatClient chatClient, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(scope, "scope");
        this.chatClient = chatClient;
        this.scope = scope;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ClientStateCalls");
        EnumC2998d0 enumC2998d0 = EnumC2998d0.f12004w;
        this.deferredState = AbstractC3006f0.m8711e(scope, null, new ChatClientStateCalls$deferredState$1(this, null), 1);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object queryChannel(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super ChannelState> interfaceC30057d) {
        C193461 c193461;
        String str3;
        String str4 = str2;
        if (interfaceC30057d instanceof C193461) {
            c193461 = (C193461) interfaceC30057d;
            int i13 = c193461.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193461.label = i13 - Integer.MIN_VALUE;
            } else {
                c193461 = new C193461(interfaceC30057d);
            }
        } else {
            c193461 = new C193461(interfaceC30057d);
        }
        C193461 c193462 = c193461;
        Object objAwait = c193462.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193462.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str5 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[queryChannel] cid: ", str, ":", str2, ", request: ");
                sbM32001t.append(queryChannelRequest);
                interfaceC2344j.log(enumC2341g, str5, sbM32001t.toString(), null);
            }
            AbstractC27476f.m82908f(ChatClient.queryChannel$default(this.chatClient, str, str4, queryChannelRequest, false, 8, null), this.scope);
            InterfaceC3018i0 interfaceC3018i0 = this.deferredState;
            c193462.L$0 = str;
            c193462.L$1 = str4;
            c193462.L$2 = null;
            c193462.label = 1;
            objAwait = interfaceC3018i0.await(c193462);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
            str3 = str;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = (String) c193462.L$1;
            String str7 = (String) c193462.L$0;
            AbstractC34132o.m107864I(objAwait);
            str4 = str6;
            str3 = str7;
        }
        return ((StateRegistry) objAwait).channel(str3, str4);
    }

    private final InterfaceC27474d repliesCall(boolean olderToNewer, String messageId, int messageLimit) {
        if (olderToNewer) {
            return ChatClient.getNewerReplies$default(this.chatClient, messageId, messageLimit, null, 4, null);
        }
        if (olderToNewer) {
            throw new NoWhenBranchMatchedException();
        }
        return this.chatClient.getReplies(messageId, messageLimit);
    }

    public static /* synthetic */ Object watchChannel$stream_chat_android_client_release$default(ChatClientStateCalls chatClientStateCalls, String str, int i13, boolean z4, String str2, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            str2 = null;
        }
        return chatClientStateCalls.watchChannel$stream_chat_android_client_release(str, i13, z4, str2, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r12 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitReplies$stream_chat_android_client_release(java.lang.String r9, int r10, boolean r11, q83.InterfaceC30057d<? super io.getstream.chat.android.client.api.state.ThreadState> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$awaitReplies$1
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$awaitReplies$1 r0 = (io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$awaitReplies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$awaitReplies$1 r0 = new io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$awaitReplies$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p505ts.AbstractC34132o.m107864I(r12)
            goto L87
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            boolean r11 = r0.Z$0
            int r10 = r0.I$0
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p505ts.AbstractC34132o.m107864I(r12)
            goto L76
        L42:
            p505ts.AbstractC34132o.m107864I(r12)
            b23.k r12 = r8.getLogger()
            b23.e r2 = r12.f9275c
            java.lang.String r5 = r12.f9273a
            b23.g r6 = b23.EnumC2341g.DEBUG
            boolean r2 = r2.isLoggable(r6, r5)
            if (r2 == 0) goto L63
            b23.j r12 = r12.f9274b
            java.lang.String r2 = "[awaitReplies] messageId: "
            java.lang.String r7 = ", messageLimit: "
            java.lang.String r2 = p319m4.AbstractC25012a.m73374g(r10, r2, r9, r7)
            r7 = 0
            r12.log(r6, r5, r2, r7)
        L63:
            o23.d r12 = r8.repliesCall(r11, r9, r10)
            r0.L$0 = r9
            r0.I$0 = r10
            r0.Z$0 = r11
            r0.label = r4
            java.lang.Object r12 = r12.await(r0)
            if (r12 != r1) goto L76
            goto L86
        L76:
            bc3.i0 r12 = r8.deferredState
            r0.L$0 = r9
            r0.I$0 = r10
            r0.Z$0 = r11
            r0.label = r3
            java.lang.Object r12 = r12.await(r0)
            if (r12 != r1) goto L87
        L86:
            return r1
        L87:
            io.getstream.chat.android.client.api.state.StateRegistry r12 = (io.getstream.chat.android.client.api.state.StateRegistry) r12
            io.getstream.chat.android.client.api.state.ThreadState r9 = r12.thread(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls.awaitReplies$stream_chat_android_client_release(java.lang.String, int, boolean, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getReplies$stream_chat_android_client_release(String str, int i13, boolean z4, InterfaceC30057d<? super ThreadState> interfaceC30057d) {
        ChatClientStateCalls$getReplies$1 chatClientStateCalls$getReplies$1;
        if (interfaceC30057d instanceof ChatClientStateCalls$getReplies$1) {
            chatClientStateCalls$getReplies$1 = (ChatClientStateCalls$getReplies$1) interfaceC30057d;
            int i14 = chatClientStateCalls$getReplies$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                chatClientStateCalls$getReplies$1.label = i14 - Integer.MIN_VALUE;
            } else {
                chatClientStateCalls$getReplies$1 = new ChatClientStateCalls$getReplies$1(this, interfaceC30057d);
            }
        } else {
            chatClientStateCalls$getReplies$1 = new ChatClientStateCalls$getReplies$1(this, interfaceC30057d);
        }
        Object objAwait = chatClientStateCalls$getReplies$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = chatClientStateCalls$getReplies$1.label;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC25012a.m73374g(i13, "[getReplies] messageId: ", str, ", messageLimit: "), null);
            }
            AbstractC27476f.m82908f(repliesCall(z4, str, i13), this.scope);
            InterfaceC3018i0 interfaceC3018i0 = this.deferredState;
            chatClientStateCalls$getReplies$1.L$0 = str;
            chatClientStateCalls$getReplies$1.I$0 = i13;
            chatClientStateCalls$getReplies$1.Z$0 = z4;
            chatClientStateCalls$getReplies$1.label = 1;
            objAwait = interfaceC3018i0.await(chatClientStateCalls$getReplies$1);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) chatClientStateCalls$getReplies$1.L$0;
            AbstractC34132o.m107864I(objAwait);
        }
        return ((StateRegistry) objAwait).thread(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object queryChannels$stream_chat_android_client_release(QueryChannelsRequest queryChannelsRequest, ChatEventHandlerFactory chatEventHandlerFactory, InterfaceC30057d<? super QueryChannelsState> interfaceC30057d) {
        ChatClientStateCalls$queryChannels$1 chatClientStateCalls$queryChannels$1;
        if (interfaceC30057d instanceof ChatClientStateCalls$queryChannels$1) {
            chatClientStateCalls$queryChannels$1 = (ChatClientStateCalls$queryChannels$1) interfaceC30057d;
            int i13 = chatClientStateCalls$queryChannels$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                chatClientStateCalls$queryChannels$1.label = i13 - Integer.MIN_VALUE;
            } else {
                chatClientStateCalls$queryChannels$1 = new ChatClientStateCalls$queryChannels$1(this, interfaceC30057d);
            }
        } else {
            chatClientStateCalls$queryChannels$1 = new ChatClientStateCalls$queryChannels$1(this, interfaceC30057d);
        }
        Object objAwait = chatClientStateCalls$queryChannels$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = chatClientStateCalls$queryChannels$1.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[queryChannels] request: " + queryChannelsRequest, null);
            }
            AbstractC27476f.m82908f(this.chatClient.queryChannels(queryChannelsRequest), this.scope);
            InterfaceC3018i0 interfaceC3018i0 = this.deferredState;
            chatClientStateCalls$queryChannels$1.L$0 = queryChannelsRequest;
            chatClientStateCalls$queryChannels$1.L$1 = chatEventHandlerFactory;
            chatClientStateCalls$queryChannels$1.label = 1;
            objAwait = interfaceC3018i0.await(chatClientStateCalls$queryChannels$1);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chatEventHandlerFactory = (ChatEventHandlerFactory) chatClientStateCalls$queryChannels$1.L$1;
            queryChannelsRequest = (QueryChannelsRequest) chatClientStateCalls$queryChannels$1.L$0;
            AbstractC34132o.m107864I(objAwait);
        }
        QueryChannelsState queryChannelsStateQueryChannels = ((StateRegistry) objAwait).queryChannels(QueryChannelsIdentifierKt.getIdentifier(queryChannelsRequest));
        queryChannelsStateQueryChannels.setChatEventHandlerFactory(chatEventHandlerFactory);
        return queryChannelsStateQueryChannels;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object queryThreads$stream_chat_android_client_release(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super QueryThreadsState> interfaceC30057d) {
        ChatClientStateCalls$queryThreads$1 chatClientStateCalls$queryThreads$1;
        if (interfaceC30057d instanceof ChatClientStateCalls$queryThreads$1) {
            chatClientStateCalls$queryThreads$1 = (ChatClientStateCalls$queryThreads$1) interfaceC30057d;
            int i13 = chatClientStateCalls$queryThreads$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                chatClientStateCalls$queryThreads$1.label = i13 - Integer.MIN_VALUE;
            } else {
                chatClientStateCalls$queryThreads$1 = new ChatClientStateCalls$queryThreads$1(this, interfaceC30057d);
            }
        } else {
            chatClientStateCalls$queryThreads$1 = new ChatClientStateCalls$queryThreads$1(this, interfaceC30057d);
        }
        Object objAwait = chatClientStateCalls$queryThreads$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = chatClientStateCalls$queryThreads$1.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            AbstractC27476f.m82908f(this.chatClient.queryThreads(queryThreadsRequest), this.scope);
            InterfaceC3018i0 interfaceC3018i0 = this.deferredState;
            chatClientStateCalls$queryThreads$1.L$0 = queryThreadsRequest;
            chatClientStateCalls$queryThreads$1.label = 1;
            objAwait = interfaceC3018i0.await(chatClientStateCalls$queryThreads$1);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            queryThreadsRequest = (QueryThreadsRequest) chatClientStateCalls$queryThreads$1.L$0;
            AbstractC34132o.m107864I(objAwait);
        }
        return ((StateRegistry) objAwait).queryThreads$stream_chat_android_client_release(queryThreadsRequest.getFilter(), queryThreadsRequest.getSort());
    }

    public final Object watchChannel$stream_chat_android_client_release(String str, int i13, boolean z4, String str2, InterfaceC30057d<? super ChannelState> interfaceC30057d) {
        QueryChannelPaginationRequest queryChannelPaginationRequest;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str3 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[watchChannel] cid: ", str, ", messageLimit: ", ", userPresence: ");
            sbM30467u.append(z4);
            sbM30467u.append(", aroundMessageId: ");
            sbM30467u.append(str2);
            interfaceC2344j.log(enumC2341g, str3, sbM30467u.toString(), null);
        }
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(str);
        String str4 = (String) c23465kCidToTypeAndId.f92937w;
        String str5 = (String) c23465kCidToTypeAndId.f92938x;
        if (str2 == null) {
            queryChannelPaginationRequest = new QueryChannelPaginationRequest(i13);
        } else {
            QueryChannelPaginationRequest queryChannelPaginationRequest2 = new QueryChannelPaginationRequest(i13);
            queryChannelPaginationRequest2.setMessageFilterDirection(Pagination.AROUND_ID);
            queryChannelPaginationRequest2.setMessageFilterValue(str2);
            queryChannelPaginationRequest = queryChannelPaginationRequest2;
        }
        WatchChannelRequest watchChannelRequest = queryChannelPaginationRequest.toWatchChannelRequest(z4);
        watchChannelRequest.setShouldRefresh(false);
        watchChannelRequest.setWatchChannel(true);
        return queryChannel(str4, str5, watchChannelRequest, interfaceC30057d);
    }
}
