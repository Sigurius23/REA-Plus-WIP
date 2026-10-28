package io.getstream.chat.android.client.socket;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.events.ChatEvent;
import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;", "", "<init>", "()V", "Error", "Message", "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;", "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Message;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class StreamWebSocketEvent {

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;", "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Error extends StreamWebSocketEvent {
        private final AbstractC26202e streamError;

        public Error(AbstractC26202e streamError) {
            AbstractC22676k.m65750j(streamError, "streamError");
            this.streamError = streamError;
        }

        public static /* synthetic */ Error copy$default(Error error, AbstractC26202e abstractC26202e, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC26202e = error.streamError;
            }
            return error.copy(abstractC26202e);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AbstractC26202e getStreamError() {
            return this.streamError;
        }

        public final Error copy(AbstractC26202e streamError) {
            AbstractC22676k.m65750j(streamError, "streamError");
            return new Error(streamError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && AbstractC22676k.m65745e(this.streamError, ((Error) other).streamError);
        }

        public final AbstractC26202e getStreamError() {
            return this.streamError;
        }

        public final int hashCode() {
            return this.streamError.hashCode();
        }

        public final String toString() {
            return AbstractC17176i.m48503e("Error(streamError=", this.streamError, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Message;", "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;", "chatEvent", "Lio/getstream/chat/android/client/events/ChatEvent;", "<init>", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "getChatEvent", "()Lio/getstream/chat/android/client/events/ChatEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Message extends StreamWebSocketEvent {
        private final ChatEvent chatEvent;

        public Message(ChatEvent chatEvent) {
            AbstractC22676k.m65750j(chatEvent, "chatEvent");
            this.chatEvent = chatEvent;
        }

        public static /* synthetic */ Message copy$default(Message message, ChatEvent chatEvent, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                chatEvent = message.chatEvent;
            }
            return message.copy(chatEvent);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ChatEvent getChatEvent() {
            return this.chatEvent;
        }

        public final Message copy(ChatEvent chatEvent) {
            AbstractC22676k.m65750j(chatEvent, "chatEvent");
            return new Message(chatEvent);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Message) && AbstractC22676k.m65745e(this.chatEvent, ((Message) other).chatEvent);
        }

        public final ChatEvent getChatEvent() {
            return this.chatEvent;
        }

        public final int hashCode() {
            return this.chatEvent.hashCode();
        }

        public final String toString() {
            return "Message(chatEvent=" + this.chatEvent + ")";
        }
    }

    private StreamWebSocketEvent() {
    }

    public StreamWebSocketEvent(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
