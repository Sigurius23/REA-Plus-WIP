package io.getstream.chat.android.client.notifications.handler;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import bc3.AbstractC3006f0;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Landroidx/core/graphics/drawable/IconCompat;", "buildIcon", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultUserIconBuilder implements UserIconBuilder {
    private final Context context;

    public DefaultUserIconBuilder(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // io.getstream.chat.android.client.notifications.handler.UserIconBuilder
    public final Object buildIcon(User user, InterfaceC30057d<? super IconCompat> interfaceC30057d) throws Throwable {
        String image = user.getImage();
        if (image.length() == 0) {
            image = null;
        }
        if (image == null) {
            return null;
        }
        Object objM8705K = AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new DefaultUserIconBuilder$buildIcon$3$1(image, this, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : (IconCompat) objM8705K;
    }

    public final Context getContext() {
        return this.context;
    }
}
