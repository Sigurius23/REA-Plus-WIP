package io.getstream.chat.android.client.utils.observable;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.events.ChatEvent;
import ou1.C28376a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;", "Lio/getstream/chat/android/client/utils/observable/EventSubscription;", "Lkotlin/Function1;", "Lio/getstream/chat/android/client/events/ChatEvent;", "", "filter", "Lio/getstream/chat/android/client/ChatEventListener;", "listener", "<init>", "(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)V", "Ll83/a0;", "dispose", "()V", NotificationCompat.CATEGORY_EVENT, "onNext", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/client/ChatEventListener;", "isDisposed", "Z", "()Z", "setDisposed", "(Z)V", "Lkotlin/Function0;", "afterEventDelivered", "Lc93/a;", "getAfterEventDelivered", "()Lc93/a;", "setAfterEventDelivered", "(Lc93/a;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class SubscriptionImpl implements EventSubscription {
    private InterfaceC4339a afterEventDelivered;
    private final Function1 filter;
    private volatile boolean isDisposed;
    private volatile ChatEventListener<ChatEvent> listener;

    public SubscriptionImpl(Function1 filter, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(listener, "listener");
        this.filter = filter;
        this.listener = listener;
        this.afterEventDelivered = new C28376a(7);
    }

    @Override // io.getstream.chat.android.client.utils.observable.Disposable
    public final void dispose() {
        this.isDisposed = true;
        this.listener = null;
    }

    public final InterfaceC4339a getAfterEventDelivered() {
        return this.afterEventDelivered;
    }

    @Override // io.getstream.chat.android.client.utils.observable.Disposable
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // io.getstream.chat.android.client.utils.observable.EventSubscription
    public final void onNext(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (!this.isDisposed && ((Boolean) this.filter.invoke(event)).booleanValue()) {
            try {
                ChatEventListener<ChatEvent> chatEventListener = this.listener;
                if (chatEventListener != null) {
                    chatEventListener.onEvent(event);
                }
            } finally {
                this.afterEventDelivered.invoke();
            }
        }
    }

    public final void setAfterEventDelivered(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.afterEventDelivered = interfaceC4339a;
    }

    public final void setDisposed(boolean z4) {
        this.isDisposed = z4;
    }
}
