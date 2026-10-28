package io.getstream.chat.android.client.api.state;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/Event;", "T", "", "content", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "", "hasBeenHandled", "getHasBeenHandled$annotations", "()V", "getHasBeenHandled", "()Z", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class Event<T> {
    private final T content;
    private boolean hasBeenHandled;

    public Event(T t14) {
        this.content = t14;
    }

    public static /* synthetic */ void getHasBeenHandled$annotations() {
    }

    public final T getContentIfNotHandled() {
        if (this.hasBeenHandled) {
            return null;
        }
        this.hasBeenHandled = true;
        return this.content;
    }

    public final boolean getHasBeenHandled() {
        return this.hasBeenHandled;
    }

    public final T peekContent() {
        return this.content;
    }
}
