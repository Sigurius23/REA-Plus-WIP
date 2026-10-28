package io.getstream.chat.android.client.socket;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.clientstate.DisconnectCause;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/SocketListener;", "", "<init>", "()V", "Ll83/a0;", "onConnecting", "Lio/getstream/chat/android/client/events/ConnectedEvent;", NotificationCompat.CATEGORY_EVENT, "onConnected", "(Lio/getstream/chat/android/client/events/ConnectedEvent;)V", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "cause", "onDisconnected", "(Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V", "Ln23/e;", "error", "onError", "(Ln23/e;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "onEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "", "deliverOnMainThread", "Z", "getDeliverOnMainThread", "()Z", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class SocketListener {
    private final boolean deliverOnMainThread = true;

    public boolean getDeliverOnMainThread() {
        return this.deliverOnMainThread;
    }

    public void onConnected(ConnectedEvent event) {
        AbstractC22676k.m65750j(event, "event");
    }

    public void onConnecting() {
    }

    public void onDisconnected(DisconnectCause cause) {
        AbstractC22676k.m65750j(cause, "cause");
    }

    public void onError(AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
    }

    public void onEvent(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
    }
}
