package io.getstream.chat.android.client.api.state;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.InterfaceC1633v0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/EventObserver;", "T", "Landroidx/lifecycle/v0;", "Lio/getstream/chat/android/client/api/state/Event;", "Lkotlin/Function1;", "Ll83/a0;", "onEventUnhandledContent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", NotificationCompat.CATEGORY_EVENT, "onChanged", "(Lio/getstream/chat/android/client/api/state/Event;)V", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EventObserver<T> implements InterfaceC1633v0 {
    private final Function1 onEventUnhandledContent;

    public EventObserver(Function1 onEventUnhandledContent) {
        AbstractC22676k.m65750j(onEventUnhandledContent, "onEventUnhandledContent");
        this.onEventUnhandledContent = onEventUnhandledContent;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Event<? extends T> event) {
        AbstractC22676k.m65750j(event, "event");
        T contentIfNotHandled = event.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            this.onEventUnhandledContent.invoke(contentIfNotHandled);
        }
    }
}
