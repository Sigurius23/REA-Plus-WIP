package io.getstream.chat.android.client.scope;

import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.InterfaceC2994c0;
import io.getstream.chat.android.client.scope.user.UserIdentifier;
import io.getstream.chat.android.client.scope.user.UserJob;
import io.getstream.chat.android.client.scope.user.UserJobKt;
import p007a6.C0438l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/UserScopeImpl;", "Lio/getstream/chat/android/client/scope/UserScope;", "Lbc3/c0;", "Lio/getstream/chat/android/client/scope/ClientScope;", "clientScope", "Lio/getstream/chat/android/client/scope/user/UserIdentifier;", "userIdentifier", "<init>", "(Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/user/UserIdentifier;)V", "", "Lio/getstream/chat/android/models/UserId;", "userId", "Ll83/a0;", "cancelChildren", "(Ljava/lang/String;)V", "getUserId", "()Lio/getstream/chat/android/client/scope/user/UserIdentifier;", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class UserScopeImpl implements UserScope, InterfaceC2994c0 {
    private final /* synthetic */ InterfaceC2994c0 $$delegate_0;

    public UserScopeImpl(ClientScope clientScope, UserIdentifier userIdentifier) {
        AbstractC22676k.m65750j(clientScope, "clientScope");
        AbstractC22676k.m65750j(userIdentifier, "userIdentifier");
        this.$$delegate_0 = AbstractC3006f0.m8696B(AbstractC3006f0.m8696B(clientScope, userIdentifier), UserJobKt.UserJob(AbstractC3006f0.m8725s(clientScope.getCoroutineContext()), new C0438l0(userIdentifier, 24)));
    }

    @Override // io.getstream.chat.android.client.scope.UserScope
    public final void cancelChildren(String userId) {
        InterfaceC30061h interfaceC30061h = this.$$delegate_0.getCoroutineContext().get(C3023j1.f12041w);
        AbstractC22676k.m65748h(interfaceC30061h, "null cannot be cast to non-null type io.getstream.chat.android.client.scope.user.UserJob");
        ((UserJob) interfaceC30061h).cancelChildren(userId);
    }

    @Override // io.getstream.chat.android.client.scope.UserScope, bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.getstream.chat.android.client.scope.UserScope
    public final UserIdentifier getUserId() {
        UserIdentifier userIdentifier = (UserIdentifier) this.$$delegate_0.getCoroutineContext().get(UserIdentifier.INSTANCE);
        if (userIdentifier != null) {
            return userIdentifier;
        }
        throw new IllegalStateException("no UserIdentifier found");
    }

    public /* synthetic */ UserScopeImpl(ClientScope clientScope, UserIdentifier userIdentifier, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientScope, (i13 & 2) != 0 ? new UserIdentifier() : userIdentifier);
    }
}
