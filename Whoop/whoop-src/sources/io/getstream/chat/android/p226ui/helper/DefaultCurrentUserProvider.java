package io.getstream.chat.android.p226ui.helper;

import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/DefaultCurrentUserProvider;", "Lio/getstream/chat/android/ui/helper/CurrentUserProvider;", "<init>", "()V", "getCurrentUser", "Lio/getstream/chat/android/models/User;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class DefaultCurrentUserProvider implements CurrentUserProvider {
    @Override // io.getstream.chat.android.p226ui.helper.CurrentUserProvider
    public final User getCurrentUser() {
        return ChatClient.INSTANCE.instance().getCurrentUser();
    }
}
