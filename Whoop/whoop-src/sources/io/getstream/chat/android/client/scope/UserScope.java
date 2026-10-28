package io.getstream.chat.android.client.scope;

import bc3.InterfaceC2994c0;
import io.getstream.chat.android.client.scope.user.UserIdentifier;
import p715kotlin.Metadata;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/UserScope;", "Lbc3/c0;", "", "Lio/getstream/chat/android/models/UserId;", "userId", "Ll83/a0;", "cancelChildren", "(Ljava/lang/String;)V", "Lio/getstream/chat/android/client/scope/user/UserIdentifier;", "getUserId", "()Lio/getstream/chat/android/client/scope/user/UserIdentifier;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserScope extends InterfaceC2994c0 {
    static /* synthetic */ void cancelChildren$default(UserScope userScope, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelChildren");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        userScope.cancelChildren(str);
    }

    void cancelChildren(String userId);

    @Override // bc3.InterfaceC2994c0
    /* synthetic */ InterfaceC30063j getCoroutineContext();

    UserIdentifier getUserId();
}
