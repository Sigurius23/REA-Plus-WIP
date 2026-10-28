package io.getstream.chat.android.client.internal.state.event.handler.internal.model;

import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;", "", "<init>", "()V", "me", "Lio/getstream/chat/android/models/User;", "getMe", "()Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserFull;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserPart;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class SelfUser {
    private SelfUser() {
    }

    public abstract User getMe();

    public SelfUser(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
