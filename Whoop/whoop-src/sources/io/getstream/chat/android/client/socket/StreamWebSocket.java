package io.getstream.chat.android.client.socket;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.errors.ChatErrorCode;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.parser.ChatParser;
import le3.C23886g;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26200c;
import n23.C26203f;
import n23.C26204g;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34814f1;
import ud3.C34850x0;
import ud3.InterfaceC34811e1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/StreamWebSocket;", "", "Lio/getstream/chat/android/client/parser/ChatParser;", "parser", "Lkotlin/Function1;", "Lud3/f1;", "Lud3/e1;", "socketCreator", "<init>", "(Lio/getstream/chat/android/client/parser/ChatParser;Lkotlin/jvm/functions/Function1;)V", "", "text", "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;", "parseMessage", "(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "chatEvent", "", "send", "(Lio/getstream/chat/android/client/events/ChatEvent;)Z", "close", "()Z", "Lec3/l;", "listen", "()Lec3/l;", "Lio/getstream/chat/android/client/parser/ChatParser;", "Lec3/o1;", "eventFlow", "Lec3/o1;", "webSocket", "Lud3/e1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamWebSocket {
    private final InterfaceC13072o1 eventFlow;
    private final ChatParser parser;
    private final InterfaceC34811e1 webSocket;

    public StreamWebSocket(ChatParser parser, Function1 socketCreator) {
        AbstractC22676k.m65750j(parser, "parser");
        AbstractC22676k.m65750j(socketCreator, "socketCreator");
        this.parser = parser;
        this.eventFlow = AbstractC13091v.m36592b(0, 100, null, 5);
        this.webSocket = (InterfaceC34811e1) socketCreator.invoke(new AbstractC34814f1() { // from class: io.getstream.chat.android.client.socket.StreamWebSocket$webSocket$1
            @Override // ud3.AbstractC34814f1
            public final void onClosed(InterfaceC34811e1 webSocket, int code, String reason) {
                AbstractC22676k.m65750j(webSocket, "webSocket");
                AbstractC22676k.m65750j(reason, "reason");
                if (code != 1000) {
                    this.this$0.eventFlow.mo36564a(new StreamWebSocketEvent.Error(ChatErrorKt.fromChatErrorCode$default(C26200c.f103911e, ChatErrorCode.SOCKET_CLOSED, 0, null, 6, null)));
                }
            }

            @Override // ud3.AbstractC34814f1
            public final void onFailure(InterfaceC34811e1 webSocket, Throwable t14, C34850x0 response) {
                AbstractC22676k.m65750j(webSocket, "webSocket");
                AbstractC22676k.m65750j(t14, "t");
                this.this$0.eventFlow.mo36564a(new StreamWebSocketEvent.Error(ChatErrorKt.fromChatErrorCode$default(C26200c.f103911e, ChatErrorCode.SOCKET_FAILURE, 0, t14, 2, null)));
            }

            @Override // ud3.AbstractC34814f1
            public final void onMessage(InterfaceC34811e1 webSocket, String text) {
                AbstractC22676k.m65750j(webSocket, "webSocket");
                AbstractC22676k.m65750j(text, "text");
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, "Chat:Events")) {
                    C2343i.f9271c.log(enumC2341g, "Chat:Events", AbstractC11895b.m31996o("[handleEvent] event: `", text, "`"), null);
                }
                this.this$0.eventFlow.mo36564a(this.this$0.parseMessage(text));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StreamWebSocketEvent parseMessage(String text) {
        C26204g c26204g;
        AbstractC26205h abstractC26205hFromJsonOrError = this.parser.fromJsonOrError(text, ChatEvent.class);
        if (abstractC26205hFromJsonOrError instanceof C26204g) {
            abstractC26205hFromJsonOrError = new C26204g(new StreamWebSocketEvent.Message((ChatEvent) ((C26204g) abstractC26205hFromJsonOrError).f103919a));
        } else if (!(abstractC26205hFromJsonOrError instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (abstractC26205hFromJsonOrError instanceof C26204g) {
            c26204g = (C26204g) abstractC26205hFromJsonOrError;
        } else {
            if (!(abstractC26205hFromJsonOrError instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            c26204g = new C26204g((StreamWebSocketEvent.Error) parseMessage$lambda$2(this, text, ((C26203f) abstractC26205hFromJsonOrError).f103918a));
        }
        return (StreamWebSocketEvent) c26204g.f103919a;
    }

    private static final StreamWebSocketEvent parseMessage$lambda$2(StreamWebSocket streamWebSocket, String str, AbstractC26202e parseChatError) {
        ErrorResponse error;
        C26200c c26200cFromChatErrorCode$default;
        AbstractC22676k.m65750j(parseChatError, "parseChatError");
        AbstractC26205h abstractC26205hFromJsonOrError = streamWebSocket.parser.fromJsonOrError(str, SocketErrorMessage.class);
        if (abstractC26205hFromJsonOrError instanceof C26204g) {
            error = ((SocketErrorMessage) ((C26204g) abstractC26205hFromJsonOrError).f103919a).getError();
        } else {
            if (!(abstractC26205hFromJsonOrError instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            error = null;
        }
        if (error != null) {
            c26200cFromChatErrorCode$default = new C26200c(error.getMessage(), error.getCode(), error.getStatusCode(), 8);
        } else {
            c26200cFromChatErrorCode$default = ChatErrorKt.fromChatErrorCode$default(C26200c.f103911e, ChatErrorCode.CANT_PARSE_EVENT, 0, ChatErrorKt.extractCause(parseChatError), 2, null);
        }
        return new StreamWebSocketEvent.Error(c26200cFromChatErrorCode$default);
    }

    public final boolean close() {
        return ((C23886g) this.webSocket).m70161b(1000, "Connection close by client");
    }

    public final InterfaceC13058l listen() {
        return AbstractC13091v.m36597g(this.eventFlow);
    }

    public final boolean send(ChatEvent chatEvent) {
        AbstractC22676k.m65750j(chatEvent, "chatEvent");
        return ((C23886g) this.webSocket).m70166h(this.parser.toJson(chatEvent));
    }
}
