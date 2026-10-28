package io.getstream.chat.android.client.notifications.handler;

import a11.C0134l;
import a13.InterfaceC0145c;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import bc3.C3029l;
import c41.C4065l3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.service.network.model.UserState;
import in0.C18719a;
import io.getstream.android.push.permissions.snackbar.SnackbarNotificationPermissionHandler;
import io.getstream.chat.android.client.C18999R;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.PushMessage;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.notifications.StreamCoilUserIconBuilder;
import j93.InterfaceC21467g;
import java.util.List;
import k93.AbstractC22306c;
import l83.C23467m;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p035bp.AbstractC3511b;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jå\u0001\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\b2&\b\u0002\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00172\u001a\b\u0002\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001c0\b2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b&\u0010'J5\u0010(\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J+\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J)\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u00105¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "notificationConfig", "Lkotlin/Function2;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/Channel;", "Landroid/content/Intent;", "newMessageIntent", "Lkotlin/Function0;", "Landroid/app/NotificationChannel;", "notificationChannel", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "userIconBuilder", "La13/c;", "permissionHandler", "Lio/getstream/chat/android/models/User;", "", "notificationTextFormatter", "Lkotlin/Function3;", "", "", "Landroidx/core/app/NotificationCompat$Action;", "actionsProvider", "Landroidx/core/app/NotificationCompat$Builder;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notificationBuilderTransformer", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/PushMessage;", "", "onPushMessage", "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;", "notificationIdFactory", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "createNotificationHandler", "(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "getDefaultActionsProvider", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function3;", "getDefaultNotificationTextFormatter", "(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;)Lc93/m;", "getDefaultNewMessageIntentFun", "(Landroid/content/Context;)Lc93/m;", "createDefaultNewMessageIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "getDefaultNotificationChannel", "(Landroid/content/Context;)Lc93/a;", "provideDefaultUserIconBuilder", "(Landroid/content/Context;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "provideDefaultNotificationPermissionHandler", "(Landroid/content/Context;)La13/c;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NotificationHandlerFactory {
    public static final NotificationHandlerFactory INSTANCE = new NotificationHandlerFactory();

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1 */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004R\u001b\u0010\f\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"io/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1", "La13/c;", "Ll83/a0;", "onPermissionDenied", "()V", "onPermissionGranted", "onPermissionRationale", "onPermissionRequested", "handler$delegate", "Ll83/h;", "getHandler", "()La13/c;", "handler", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193941 implements InterfaceC0145c {

        /* JADX INFO: renamed from: handler$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h handler;

        public C193941(Context context) {
            this.handler = AbstractC30060g.m92088H(new C0134l(21, context, this));
        }

        private final InterfaceC0145c getHandler() {
            return (InterfaceC0145c) this.handler.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC0145c handler_delegate$lambda$1(Context context, C193941 c193941) {
            Object objM107888l;
            Context applicationContext = context.getApplicationContext();
            try {
                InterfaceC21467g interfaceC21467gM64099a = AbstractC22306c.m64099a(AbstractC21598x.m60666V(SnackbarNotificationPermissionHandler.class));
                Object objCall = interfaceC21467gM64099a != null ? interfaceC21467gM64099a.call(applicationContext) : null;
                AbstractC22676k.m65748h(objCall, "null cannot be cast to non-null type io.getstream.android.push.permissions.NotificationPermissionHandler");
                objM107888l = (InterfaceC0145c) objCall;
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            Object objM10389r = AbstractC3511b.m10389r((Application) applicationContext);
            if (objM107888l instanceof C23467m) {
                objM107888l = objM10389r;
            }
            return (InterfaceC0145c) objM107888l;
        }

        @Override // a13.InterfaceC0145c
        public final void onPermissionDenied() {
            getHandler().onPermissionDenied();
        }

        @Override // a13.InterfaceC0145c
        public final void onPermissionGranted() {
            getHandler().onPermissionGranted();
        }

        @Override // a13.InterfaceC0145c
        public final void onPermissionRationale() {
            getHandler().onPermissionRationale();
        }

        @Override // a13.InterfaceC0145c
        public final void onPermissionRequested() {
            getHandler().onPermissionRequested();
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory$provideDefaultUserIconBuilder$1 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"io/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Landroidx/core/graphics/drawable/IconCompat;", "buildIcon", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "builder$delegate", "Ll83/h;", "getBuilder", "()Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "builder", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193951 implements UserIconBuilder {

        /* JADX INFO: renamed from: builder$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h builder;

        public C193951(Context context) {
            this.builder = AbstractC30060g.m92088H(new C0134l(22, context, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserIconBuilder builder_delegate$lambda$1(Context context, C193951 c193951) {
            Object objM107888l;
            Context applicationContext = context.getApplicationContext();
            try {
                InterfaceC21467g interfaceC21467gM64099a = AbstractC22306c.m64099a(AbstractC21598x.m60666V(StreamCoilUserIconBuilder.class));
                Object objCall = interfaceC21467gM64099a != null ? interfaceC21467gM64099a.call(applicationContext) : null;
                AbstractC22676k.m65748h(objCall, "null cannot be cast to non-null type io.getstream.chat.android.client.notifications.handler.UserIconBuilder");
                objM107888l = (UserIconBuilder) objCall;
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            AbstractC22676k.m65747g(applicationContext);
            Object defaultUserIconBuilder = new DefaultUserIconBuilder(applicationContext);
            if (objM107888l instanceof C23467m) {
                objM107888l = defaultUserIconBuilder;
            }
            return (UserIconBuilder) objM107888l;
        }

        private final UserIconBuilder getBuilder() {
            return (UserIconBuilder) this.builder.getValue();
        }

        @Override // io.getstream.chat.android.client.notifications.handler.UserIconBuilder
        public final Object buildIcon(User user, InterfaceC30057d<? super IconCompat> interfaceC30057d) {
            return getBuilder().buildIcon(user, interfaceC30057d);
        }
    }

    private NotificationHandlerFactory() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m54882a(NotificationConfig notificationConfig, User user, Message message) {
        return (String) getDefaultNotificationTextFormatter$lambda$5(notificationConfig, user, message);
    }

    private final Intent createDefaultNewMessageIntent(Context context) {
        PackageManager packageManager = context.getPackageManager();
        AbstractC22676k.m65747g(packageManager);
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
        AbstractC22676k.m65747g(launchIntentForPackage);
        return launchIntentForPackage;
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        return createNotificationHandler$default(context, notificationConfig, null, null, null, null, null, null, null, null, null, 2044, null);
    }

    public static NotificationHandler createNotificationHandler$default(Context context, NotificationConfig notificationConfig, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, UserIconBuilder userIconBuilder, InterfaceC0145c interfaceC0145c, InterfaceC4351m interfaceC4351m2, Function3 function3, InterfaceC4351m interfaceC4351m3, Function1 function1, NotificationIdFactory notificationIdFactory, int i13, Object obj) {
        InterfaceC4351m c4065l3;
        InterfaceC4339a c19398c;
        UserIconBuilder c193951;
        InterfaceC0145c c193941;
        InterfaceC4351m c4065l4;
        Function3 c3029l;
        if ((i13 & 4) != 0) {
            INSTANCE.getClass();
            c4065l3 = new C4065l3(context, 5);
        } else {
            c4065l3 = interfaceC4351m;
        }
        if ((i13 & 8) != 0) {
            INSTANCE.getClass();
            c19398c = new C19398c(context, 0);
        } else {
            c19398c = interfaceC4339a;
        }
        if ((i13 & 16) != 0) {
            INSTANCE.getClass();
            c193951 = new C193951(context);
        } else {
            c193951 = userIconBuilder;
        }
        if ((i13 & 32) != 0) {
            INSTANCE.getClass();
            c193941 = new C193941(context);
        } else {
            c193941 = interfaceC0145c;
        }
        if ((i13 & 64) != 0) {
            INSTANCE.getClass();
            c4065l4 = new C4065l3(notificationConfig, 6);
        } else {
            c4065l4 = interfaceC4351m2;
        }
        if ((i13 & 128) != 0) {
            INSTANCE.getClass();
            c3029l = new C3029l(context, 3);
        } else {
            c3029l = function3;
        }
        return createNotificationHandler(context, notificationConfig, c4065l3, c19398c, c193951, c193941, c4065l4, c3029l, (i13 & 256) != 0 ? new C18719a(7) : interfaceC4351m3, (i13 & 512) != 0 ? new C18689p0(14) : function1, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : notificationIdFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationCompat.Builder createNotificationHandler$lambda$0(NotificationCompat.Builder builder, ChatNotification chatNotification) {
        AbstractC22676k.m65750j(builder, "builder");
        AbstractC22676k.m65750j(chatNotification, "<unused var>");
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createNotificationHandler$lambda$1(PushMessage it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    private final Function3 getDefaultActionsProvider(Context context) {
        return new C3029l(context, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getDefaultActionsProvider$lambda$2(Context context, int i13, Channel channel, Message message) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(message, "message");
        NotificationActionsFactory notificationActionsFactory = NotificationActionsFactory.INSTANCE;
        return AbstractC37056f.m118959K(NotificationActionsFactory.createMarkReadAction$default(notificationActionsFactory, context, i13, channel, message, 0, null, null, 112, null), NotificationActionsFactory.createReplyAction$default(notificationActionsFactory, context, i13, channel, 0, null, null, null, 120, null));
    }

    private final InterfaceC4351m getDefaultNewMessageIntentFun(Context context) {
        return new C4065l3(context, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent getDefaultNewMessageIntentFun$lambda$6(Context context, Message message, Channel channel) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(channel, "<unused var>");
        return INSTANCE.createDefaultNewMessageIntent(context);
    }

    private final InterfaceC4339a getDefaultNotificationChannel(Context context) {
        return new C19398c(context, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationChannel getDefaultNotificationChannel$lambda$7(Context context) {
        return new NotificationChannel(context.getString(C18999R.string.stream_chat_notification_channel_id), context.getString(C18999R.string.stream_chat_notification_channel_name), 3);
    }

    private final InterfaceC4351m getDefaultNotificationTextFormatter(NotificationConfig notificationConfig) {
        return new C4065l3(notificationConfig, 6);
    }

    private static final CharSequence getDefaultNotificationTextFormatter$lambda$5(NotificationConfig notificationConfig, User user, Message message) {
        String language;
        AbstractC22676k.m65750j(message, "message");
        if (!notificationConfig.getAutoTranslationEnabled()) {
            return message.getText();
        }
        if (user != null && (language = user.getLanguage()) != null) {
            String translation = message.getTranslation(language);
            if (translation.length() == 0) {
                translation = message.getText();
            }
            if (translation != null) {
                return translation;
            }
        }
        return message.getText();
    }

    private final InterfaceC0145c provideDefaultNotificationPermissionHandler(Context context) {
        return new C193941(context);
    }

    private final UserIconBuilder provideDefaultUserIconBuilder(Context context) {
        return new C193951(context);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, null, null, null, null, null, null, null, null, 2040, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, notificationChannel, null, null, null, null, null, null, null, 2032, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, notificationChannel, userIconBuilder, null, null, null, null, null, null, 2016, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder, InterfaceC0145c interfaceC0145c) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, notificationChannel, userIconBuilder, interfaceC0145c, null, null, null, null, null, 1984, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder, InterfaceC0145c interfaceC0145c, InterfaceC4351m notificationTextFormatter) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, notificationChannel, userIconBuilder, interfaceC0145c, notificationTextFormatter, null, null, null, null, 1920, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder, InterfaceC0145c interfaceC0145c, InterfaceC4351m notificationTextFormatter, Function3 actionsProvider) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        AbstractC22676k.m65750j(actionsProvider, "actionsProvider");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, notificationChannel, userIconBuilder, interfaceC0145c, notificationTextFormatter, actionsProvider, null, null, null, 1792, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder, InterfaceC0145c interfaceC0145c, InterfaceC4351m notificationTextFormatter, Function3 actionsProvider, InterfaceC4351m notificationBuilderTransformer) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        AbstractC22676k.m65750j(actionsProvider, "actionsProvider");
        AbstractC22676k.m65750j(notificationBuilderTransformer, "notificationBuilderTransformer");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, notificationChannel, userIconBuilder, interfaceC0145c, notificationTextFormatter, actionsProvider, notificationBuilderTransformer, null, null, 1536, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder, InterfaceC0145c interfaceC0145c, InterfaceC4351m notificationTextFormatter, Function3 actionsProvider, InterfaceC4351m notificationBuilderTransformer, Function1 onPushMessage) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        AbstractC22676k.m65750j(actionsProvider, "actionsProvider");
        AbstractC22676k.m65750j(notificationBuilderTransformer, "notificationBuilderTransformer");
        AbstractC22676k.m65750j(onPushMessage, "onPushMessage");
        return createNotificationHandler$default(context, notificationConfig, newMessageIntent, notificationChannel, userIconBuilder, interfaceC0145c, notificationTextFormatter, actionsProvider, notificationBuilderTransformer, onPushMessage, null, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, null);
    }

    @SuppressLint({"NewApi"})
    public static final NotificationHandler createNotificationHandler(Context context, NotificationConfig notificationConfig, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder, InterfaceC0145c permissionHandler, InterfaceC4351m notificationTextFormatter, Function3 actionsProvider, InterfaceC4351m notificationBuilderTransformer, Function1 onPushMessage, NotificationIdFactory notificationIdFactory) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        AbstractC22676k.m65750j(actionsProvider, "actionsProvider");
        AbstractC22676k.m65750j(notificationBuilderTransformer, "notificationBuilderTransformer");
        AbstractC22676k.m65750j(onPushMessage, "onPushMessage");
        return new MessagingStyleNotificationHandler(context, newMessageIntent, notificationChannel, userIconBuilder, permissionHandler, notificationTextFormatter, actionsProvider, notificationBuilderTransformer, onPushMessage, notificationIdFactory);
    }
}
