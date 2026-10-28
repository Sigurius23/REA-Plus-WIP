package io.getstream.chat.android.client.utils.observable;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.clientstate.DisconnectCause;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.client.events.ConnectingEvent;
import io.getstream.chat.android.client.events.DisconnectedEvent;
import io.getstream.chat.android.client.events.ErrorEvent;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.client.socket.ChatSocket;
import io.getstream.chat.android.client.socket.SocketListener;
import io.getstream.chat.android.models.EventType;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import n23.AbstractC26202e;
import p505ts.AbstractC34132o;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002/0B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\u00152\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010 \u001a\u00020\u00152\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0004\b \u0010!J1\u0010\"\u001a\u00020\u00152\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b\"\u0010\u001eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;", "", "Lec3/m;", "Ln23/h;", "Lio/getstream/chat/android/models/ConnectionData;", "waitConnection", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/socket/ChatSocket;", "chatSocket", "<init>", "(Lec3/m;Lbc3/c0;Lio/getstream/chat/android/client/socket/ChatSocket;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "onNext", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "emitConnectionEvents", "notifySubscriptions", "Lio/getstream/chat/android/client/utils/observable/EventSubscription;", "subscription", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "addSubscription", "(Lio/getstream/chat/android/client/utils/observable/EventSubscription;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Lkotlin/Function1;", "", "filter", "Lio/getstream/chat/android/client/ChatEventListener;", "listener", "subscribe", "(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;", "subscribeSuspend", "(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "subscribeSingle", "Lec3/m;", "Lbc3/c0;", "Lio/getstream/chat/android/client/socket/ChatSocket;", "Lmc3/a;", "mutex", "Lmc3/a;", "", "subscriptions", "Ljava/util/Set;", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;", "eventsMapper", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;", "ChatEventSuspendListener", "EventsMapper", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatEventsObservable {
    private final ChatSocket chatSocket;
    private final EventsMapper eventsMapper;
    private final InterfaceC25435a mutex;
    private final InterfaceC2994c0 scope;
    private final Set<EventSubscription> subscriptions;
    private final InterfaceC13062m waitConnection;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;", "Lio/getstream/chat/android/client/events/ChatEvent;", "EventT", "", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "onEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChatEventSuspendListener<EventT extends ChatEvent> {
        Object onEvent(EventT eventt, InterfaceC30057d<? super C23454a0> interfaceC30057d);
    }

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;", "Lio/getstream/chat/android/client/socket/SocketListener;", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;", "observable", "<init>", "(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)V", "Ll83/a0;", "onConnecting", "()V", "Lio/getstream/chat/android/client/events/ConnectedEvent;", NotificationCompat.CATEGORY_EVENT, "onConnected", "(Lio/getstream/chat/android/client/events/ConnectedEvent;)V", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "cause", "onDisconnected", "(Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "onEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "Ln23/e;", "error", "onError", "(Ln23/e;)V", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;", "", "getDeliverOnMainThread", "()Z", "deliverOnMainThread", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class EventsMapper extends SocketListener {
        private final ChatEventsObservable observable;

        public EventsMapper(ChatEventsObservable observable) {
            AbstractC22676k.m65750j(observable, "observable");
            this.observable = observable;
        }

        @Override // io.getstream.chat.android.client.socket.SocketListener
        public final boolean getDeliverOnMainThread() {
            return false;
        }

        @Override // io.getstream.chat.android.client.socket.SocketListener
        public final void onConnected(ConnectedEvent event) {
            AbstractC22676k.m65750j(event, "event");
            this.observable.onNext(event);
        }

        @Override // io.getstream.chat.android.client.socket.SocketListener
        public final void onConnecting() {
            this.observable.onNext(new ConnectingEvent(EventType.CONNECTION_CONNECTING, new Date(), null));
        }

        @Override // io.getstream.chat.android.client.socket.SocketListener
        public final void onDisconnected(DisconnectCause cause) {
            AbstractC22676k.m65750j(cause, "cause");
            this.observable.onNext(new DisconnectedEvent(EventType.CONNECTION_DISCONNECTED, new Date(), null, cause));
        }

        @Override // io.getstream.chat.android.client.socket.SocketListener
        public final void onError(AbstractC26202e error) {
            AbstractC22676k.m65750j(error, "error");
            this.observable.onNext(new ErrorEvent(EventType.CONNECTION_ERROR, new Date(), null, error));
        }

        @Override // io.getstream.chat.android.client.socket.SocketListener
        public final void onEvent(ChatEvent event) {
            AbstractC22676k.m65750j(event, "event");
            this.observable.onNext(event);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.observable.ChatEventsObservable$addSubscription$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.observable.ChatEventsObservable$addSubscription$1", m100430f = "ChatEventsObservable.kt", m100431l = {188}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194541 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ EventSubscription $subscription;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194541(EventSubscription eventSubscription, InterfaceC30057d<? super C194541> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$subscription = eventSubscription;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatEventsObservable.this.new C194541(this.$subscription, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194541) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatEventsObservable chatEventsObservable;
            InterfaceC25435a interfaceC25435a;
            EventSubscription eventSubscription;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC25435a interfaceC25435a2 = ChatEventsObservable.this.mutex;
                chatEventsObservable = ChatEventsObservable.this;
                EventSubscription eventSubscription2 = this.$subscription;
                this.L$0 = interfaceC25435a2;
                this.L$1 = chatEventsObservable;
                this.L$2 = eventSubscription2;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC25435a2.mo68211b(this) == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC25435a = interfaceC25435a2;
                eventSubscription = eventSubscription2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventSubscription = (EventSubscription) this.L$2;
                chatEventsObservable = (ChatEventsObservable) this.L$1;
                interfaceC25435a = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
            }
            try {
                if (chatEventsObservable.subscriptions.isEmpty()) {
                    chatEventsObservable.chatSocket.addListener(chatEventsObservable.eventsMapper);
                }
                chatEventsObservable.subscriptions.add(eventSubscription);
                return C23454a0.f92919a;
            } finally {
                interfaceC25435a.mo68214i(null);
            }
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.observable.ChatEventsObservable$emitConnectionEvents$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.observable.ChatEventsObservable$emitConnectionEvents$1", m100430f = "ChatEventsObservable.kt", m100431l = {59, 62, 69}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194551 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ChatEvent $event;
        Object L$0;
        int label;
        final /* synthetic */ ChatEventsObservable this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194551(ChatEvent chatEvent, ChatEventsObservable chatEventsObservable, InterfaceC30057d<? super C194551> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$event = chatEvent;
            this.this$0 = chatEventsObservable;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C194551(this.$event, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194551) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
        
            if (r1.emit(r4, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1c
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r6.L$0
                n23.c r0 = (n23.C26200c) r0
                goto L1c
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto La6
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                io.getstream.chat.android.client.events.ChatEvent r7 = r6.$event
                boolean r1 = r7 instanceof io.getstream.chat.android.client.events.ConnectedEvent
                if (r1 == 0) goto L53
                io.getstream.chat.android.client.utils.observable.ChatEventsObservable r7 = r6.this$0
                ec3.m r7 = io.getstream.chat.android.client.utils.observable.ChatEventsObservable.access$getWaitConnection$p(r7)
                n23.g r1 = new n23.g
                io.getstream.chat.android.models.ConnectionData r2 = new io.getstream.chat.android.models.ConnectionData
                io.getstream.chat.android.client.events.ChatEvent r3 = r6.$event
                io.getstream.chat.android.client.events.ConnectedEvent r3 = (io.getstream.chat.android.client.events.ConnectedEvent) r3
                io.getstream.chat.android.models.User r3 = r3.getMe()
                io.getstream.chat.android.client.events.ChatEvent r5 = r6.$event
                io.getstream.chat.android.client.events.ConnectedEvent r5 = (io.getstream.chat.android.client.events.ConnectedEvent) r5
                java.lang.String r5 = r5.getConnectionId()
                r2.<init>(r3, r5)
                r1.<init>(r2)
                r6.label = r4
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto La6
                goto La5
            L53:
                boolean r1 = r7 instanceof io.getstream.chat.android.client.events.ErrorEvent
                if (r1 == 0) goto L73
                io.getstream.chat.android.client.utils.observable.ChatEventsObservable r7 = r6.this$0
                ec3.m r7 = io.getstream.chat.android.client.utils.observable.ChatEventsObservable.access$getWaitConnection$p(r7)
                n23.f r1 = new n23.f
                io.getstream.chat.android.client.events.ChatEvent r2 = r6.$event
                io.getstream.chat.android.client.events.ErrorEvent r2 = (io.getstream.chat.android.client.events.ErrorEvent) r2
                n23.e r2 = r2.getError()
                r1.<init>(r2)
                r6.label = r3
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto La6
                goto La5
            L73:
                boolean r1 = r7 instanceof io.getstream.chat.android.client.events.DisconnectedEvent
                if (r1 == 0) goto La6
                io.getstream.chat.android.client.events.DisconnectedEvent r7 = (io.getstream.chat.android.client.events.DisconnectedEvent) r7
                io.getstream.chat.android.client.clientstate.DisconnectCause r7 = r7.getDisconnectCause()
                boolean r1 = r7 instanceof io.getstream.chat.android.client.clientstate.DisconnectCause.UnrecoverableError
                r3 = 0
                if (r1 == 0) goto L85
                io.getstream.chat.android.client.clientstate.DisconnectCause$UnrecoverableError r7 = (io.getstream.chat.android.client.clientstate.DisconnectCause.UnrecoverableError) r7
                goto L86
            L85:
                r7 = r3
            L86:
                if (r7 == 0) goto L8d
                n23.c r7 = r7.getError()
                goto L8e
            L8d:
                r7 = r3
            L8e:
                if (r7 == 0) goto La6
                io.getstream.chat.android.client.utils.observable.ChatEventsObservable r1 = r6.this$0
                ec3.m r1 = io.getstream.chat.android.client.utils.observable.ChatEventsObservable.access$getWaitConnection$p(r1)
                n23.f r4 = new n23.f
                r4.<init>(r7)
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.emit(r4, r6)
                if (r7 != r0) goto La6
            La5:
                return r0
            La6:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.utils.observable.ChatEventsObservable.C194551.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.observable.ChatEventsObservable$notifySubscriptions$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.observable.ChatEventsObservable$notifySubscriptions$1", m100430f = "ChatEventsObservable.kt", m100431l = {188}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194561 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ChatEvent $event;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194561(ChatEvent chatEvent, InterfaceC30057d<? super C194561> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$event = chatEvent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatEventsObservable.this.new C194561(this.$event, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194561) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatEventsObservable chatEventsObservable;
            InterfaceC25435a interfaceC25435a;
            ChatEvent chatEvent;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC25435a interfaceC25435a2 = ChatEventsObservable.this.mutex;
                chatEventsObservable = ChatEventsObservable.this;
                ChatEvent chatEvent2 = this.$event;
                this.L$0 = interfaceC25435a2;
                this.L$1 = chatEventsObservable;
                this.L$2 = chatEvent2;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC25435a2.mo68211b(this) == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC25435a = interfaceC25435a2;
                chatEvent = chatEvent2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chatEvent = (ChatEvent) this.L$2;
                chatEventsObservable = (ChatEventsObservable) this.L$1;
                interfaceC25435a = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
            }
            try {
                Iterator it = chatEventsObservable.subscriptions.iterator();
                while (it.hasNext()) {
                    EventSubscription eventSubscription = (EventSubscription) it.next();
                    if (eventSubscription.getIsDisposed()) {
                        it.remove();
                    } else {
                        eventSubscription.onNext(chatEvent);
                    }
                }
                if (chatEventsObservable.subscriptions.isEmpty()) {
                    chatEventsObservable.chatSocket.removeListener(chatEventsObservable.eventsMapper);
                }
                return C23454a0.f92919a;
            } finally {
                interfaceC25435a.mo68214i(null);
            }
        }
    }

    public ChatEventsObservable(InterfaceC13062m waitConnection, InterfaceC2994c0 scope, ChatSocket chatSocket) {
        AbstractC22676k.m65750j(waitConnection, "waitConnection");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(chatSocket, "chatSocket");
        this.waitConnection = waitConnection;
        this.scope = scope;
        this.chatSocket = chatSocket;
        this.mutex = AbstractC25438d.m74669a();
        this.subscriptions = new LinkedHashSet();
        this.eventsMapper = new EventsMapper(this);
    }

    private final Disposable addSubscription(EventSubscription subscription) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C194541(subscription, null), 3);
        return subscription;
    }

    private final void emitConnectionEvents(ChatEvent event) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C194551(event, this, null), 3);
    }

    private final void notifySubscriptions(ChatEvent event) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C194561(event, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNext(ChatEvent event) {
        notifySubscriptions(event);
        emitConnectionEvents(event);
    }

    public static /* synthetic */ Disposable subscribe$default(ChatEventsObservable chatEventsObservable, Function1 function1, ChatEventListener chatEventListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = new C19336c(12);
        }
        return chatEventsObservable.subscribe(function1, chatEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribe$lambda$0(ChatEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    public static /* synthetic */ Disposable subscribeSingle$default(ChatEventsObservable chatEventsObservable, Function1 function1, ChatEventListener chatEventListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = new C19336c(13);
        }
        return chatEventsObservable.subscribeSingle(function1, chatEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeSingle$lambda$2(ChatEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    public static /* synthetic */ Disposable subscribeSuspend$default(ChatEventsObservable chatEventsObservable, Function1 function1, ChatEventSuspendListener chatEventSuspendListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = new C18689p0(15);
        }
        return chatEventsObservable.subscribeSuspend(function1, chatEventSuspendListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeSuspend$lambda$1(ChatEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    public final Disposable subscribe(Function1 filter, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(listener, "listener");
        SubscriptionImpl subscriptionImpl = new SubscriptionImpl(filter, listener);
        addSubscription(subscriptionImpl);
        return subscriptionImpl;
    }

    public final Disposable subscribeSingle(Function1 filter, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(listener, "listener");
        SubscriptionImpl subscriptionImpl = new SubscriptionImpl(filter, listener);
        subscriptionImpl.setAfterEventDelivered(new ChatEventsObservable$subscribeSingle$2$1(subscriptionImpl));
        addSubscription(subscriptionImpl);
        return subscriptionImpl;
    }

    public final Disposable subscribeSuspend(Function1 filter, ChatEventSuspendListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(listener, "listener");
        SuspendSubscription suspendSubscription = new SuspendSubscription(this.scope, filter, listener);
        addSubscription(suspendSubscription);
        return suspendSubscription;
    }
}
