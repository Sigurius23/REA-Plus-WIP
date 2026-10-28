package io.getstream.chat.android.client.p224di;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"io/getstream/chat/android/client/di/ChatModule$baseClientBuilder$1$1", "", "", "message", "Ll83/a0;", "log", "(Ljava/lang/String;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatModule$baseClientBuilder$1$1 {
    public final void log(String message) {
        AbstractC22676k.m65750j(message, "message");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, "Chat:CURL")) {
            C2343i.f9271c.log(enumC2341g, "Chat:CURL", message, null);
        }
    }
}
