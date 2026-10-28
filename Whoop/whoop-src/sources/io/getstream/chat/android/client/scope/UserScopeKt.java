package io.getstream.chat.android.client.scope;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m65681d2 = {"UserScope", "Lio/getstream/chat/android/client/scope/UserScope;", "clientScope", "Lio/getstream/chat/android/client/scope/ClientScope;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserScopeKt {
    public static final UserScope UserScope(ClientScope clientScope) {
        AbstractC22676k.m65750j(clientScope, "clientScope");
        return new UserScopeImpl(clientScope, null, 2, null);
    }
}
