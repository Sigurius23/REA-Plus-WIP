package io.getstream.chat.android.client.utils.observable;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.events.ChatEvent;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;", "Lio/getstream/chat/android/client/utils/observable/EventSubscription;", "Lbc3/c0;", "scope", "Lkotlin/Function1;", "Lio/getstream/chat/android/client/events/ChatEvent;", "", "filter", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;", "listener", "<init>", "(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)V", "Ll83/a0;", "dispose", "()V", NotificationCompat.CATEGORY_EVENT, "onNext", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "Lbc3/c0;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;", "isDisposed", "Z", "()Z", "setDisposed", "(Z)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SuspendSubscription implements EventSubscription {
    private final Function1 filter;
    private volatile boolean isDisposed;
    private volatile ChatEventsObservable.ChatEventSuspendListener<ChatEvent> listener;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.observable.SuspendSubscription$onNext$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.observable.SuspendSubscription$onNext$1", m100430f = "Subscriptions.kt", m100431l = {85}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194571 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ChatEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194571(ChatEvent chatEvent, InterfaceC30057d<? super C194571> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$event = chatEvent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SuspendSubscription.this.new C194571(this.$event, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194571) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatEventsObservable.ChatEventSuspendListener chatEventSuspendListener;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (((Boolean) SuspendSubscription.this.filter.invoke(this.$event)).booleanValue() && (chatEventSuspendListener = SuspendSubscription.this.listener) != null) {
                    ChatEvent chatEvent = this.$event;
                    this.label = 1;
                    if (chatEventSuspendListener.onEvent(chatEvent, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public SuspendSubscription(InterfaceC2994c0 scope, Function1 filter, ChatEventsObservable.ChatEventSuspendListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(listener, "listener");
        this.scope = scope;
        this.filter = filter;
        this.listener = listener;
    }

    @Override // io.getstream.chat.android.client.utils.observable.Disposable
    public final void dispose() {
        this.isDisposed = true;
        this.listener = null;
    }

    @Override // io.getstream.chat.android.client.utils.observable.Disposable
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // io.getstream.chat.android.client.utils.observable.EventSubscription
    public final void onNext(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (this.isDisposed) {
            return;
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194571(event, null), 3);
    }

    public final void setDisposed(boolean z4) {
        this.isDisposed = z4;
    }
}
