package io.getstream.chat.android.client.notifications.handler;

import androidx.core.graphics.drawable.IconCompat;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Landroidx/core/graphics/drawable/IconCompat;", "buildIcon", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserIconBuilder {
    Object buildIcon(User user, InterfaceC30057d<? super IconCompat> interfaceC30057d);
}
