package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/models/NoOpUserTransformer;", "Lio/getstream/chat/android/models/UserTransformer;", "<init>", "()V", "transform", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpUserTransformer implements UserTransformer {
    public static final NoOpUserTransformer INSTANCE = new NoOpUserTransformer();

    private NoOpUserTransformer() {
    }

    @Override // io.getstream.chat.android.models.UserTransformer
    public User transform(User user) {
        AbstractC22676k.m65750j(user, "user");
        return user;
    }
}
