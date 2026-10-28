package io.getstream.chat.android.client.receivers;

import android.R;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.C18999R;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.internal.PairKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import l83.C23465k;
import l83.InterfaceC23462h;
import o23.C27481k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "", "messageId", "channelId", "channelType", "Ll83/a0;", "markAsRead", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", NotificationMessageReceiver.KEY_CHANNEL_TYPE, "", "messageChars", "replyText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V", "cancelNotification", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NotificationMessageReceiver extends BroadcastReceiver {
    private static final String ACTION_DISMISS = "io.getstream.chat.android.DISMISS";
    private static final String ACTION_READ = "io.getstream.chat.android.READ";
    private static final String ACTION_REPLY = "io.getstream.chat.android.REPLY";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int IMMUTABLE_PENDING_INTENT_FLAGS;
    private static final String KEY_CHANNEL_ID = "id";
    private static final String KEY_CHANNEL_TYPE = "type";
    private static final String KEY_MESSAGE_ID = "message_id";
    private static final String KEY_TEXT_REPLY = "text_reply";
    private static final int MUTABLE_PENDING_INTENT_FLAGS;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "NotificationMessageReceiver");

    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J-\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ%\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u001cJK\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0003\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\"JM\u0010#\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0002\b%J \u0010&\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;", "", "<init>", "()V", "ACTION_READ", "", "ACTION_REPLY", "ACTION_DISMISS", "KEY_MESSAGE_ID", "KEY_CHANNEL_ID", "KEY_CHANNEL_TYPE", "KEY_TEXT_REPLY", "IMMUTABLE_PENDING_INTENT_FLAGS", "", "MUTABLE_PENDING_INTENT_FLAGS", "createReplyPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "notificationId", "channel", "Lio/getstream/chat/android/models/Channel;", "createReplyPendingIntent$stream_chat_android_client_release", "createMarkReadPendingIntent", "message", "Lio/getstream/chat/android/models/Message;", "createMarkReadPendingIntent$stream_chat_android_client_release", "createDismissPendingIntent", "createDismissPendingIntent$stream_chat_android_client_release", "createMarkReadAction", "Landroidx/core/app/NotificationCompat$Action;", "icon", "title", "pendingIntent", "createMarkReadAction$stream_chat_android_client_release", "createReplyAction", "hint", "createReplyAction$stream_chat_android_client_release", "createNotifyIntent", "Landroid/content/Intent;", "action", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ NotificationCompat.Action createMarkReadAction$stream_chat_android_client_release$default(Companion companion, Context context, int i13, Channel channel, Message message, int i14, String str, PendingIntent pendingIntent, int i15, Object obj) {
            if ((i15 & 16) != 0) {
                i14 = R.drawable.ic_menu_view;
            }
            int i16 = i14;
            if ((i15 & 32) != 0) {
                str = context.getString(C18999R.string.stream_chat_notification_read);
                AbstractC22676k.m65749i(str, "getString(...)");
            }
            return companion.createMarkReadAction$stream_chat_android_client_release(context, i13, channel, message, i16, str, (i15 & 64) != 0 ? companion.createMarkReadPendingIntent$stream_chat_android_client_release(context, i13, channel, message) : pendingIntent);
        }

        private final Intent createNotifyIntent(Context context, Channel channel, String action) {
            Intent intent = new Intent(context, (Class<?>) NotificationMessageReceiver.class);
            intent.putExtra(NotificationMessageReceiver.KEY_CHANNEL_ID, channel.getId());
            intent.putExtra(NotificationMessageReceiver.KEY_CHANNEL_TYPE, channel.getType());
            intent.setAction(action);
            return intent;
        }

        public static /* synthetic */ NotificationCompat.Action createReplyAction$stream_chat_android_client_release$default(Companion companion, Context context, int i13, Channel channel, int i14, String str, String str2, PendingIntent pendingIntent, int i15, Object obj) {
            if ((i15 & 8) != 0) {
                i14 = R.drawable.ic_menu_send;
            }
            int i16 = i14;
            if ((i15 & 16) != 0) {
                str = context.getString(C18999R.string.stream_chat_notification_reply);
                AbstractC22676k.m65749i(str, "getString(...)");
            }
            String str3 = str;
            if ((i15 & 32) != 0) {
                str2 = context.getString(C18999R.string.stream_chat_notification_type_hint);
                AbstractC22676k.m65749i(str2, "getString(...)");
            }
            String str4 = str2;
            if ((i15 & 64) != 0) {
                pendingIntent = companion.createReplyPendingIntent$stream_chat_android_client_release(context, i13, channel);
            }
            return companion.createReplyAction$stream_chat_android_client_release(context, i13, channel, i16, str3, str4, pendingIntent);
        }

        public final PendingIntent createDismissPendingIntent$stream_chat_android_client_release(Context context, int notificationId, Channel channel) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(channel, "channel");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, notificationId, createNotifyIntent(context, channel, NotificationMessageReceiver.ACTION_DISMISS), NotificationMessageReceiver.IMMUTABLE_PENDING_INTENT_FLAGS);
            AbstractC22676k.m65749i(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final NotificationCompat.Action createMarkReadAction$stream_chat_android_client_release(Context context, int notificationId, Channel channel, Message message, int icon, String title, PendingIntent pendingIntent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
            NotificationCompat.Action actionBuild = new NotificationCompat.Action.Builder(icon, title, pendingIntent).build();
            AbstractC22676k.m65749i(actionBuild, "build(...)");
            return actionBuild;
        }

        public final PendingIntent createMarkReadPendingIntent$stream_chat_android_client_release(Context context, int notificationId, Channel channel, Message message) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            Intent intentCreateNotifyIntent = createNotifyIntent(context, channel, NotificationMessageReceiver.ACTION_READ);
            intentCreateNotifyIntent.putExtra(NotificationMessageReceiver.KEY_MESSAGE_ID, message.getId());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, notificationId, intentCreateNotifyIntent, NotificationMessageReceiver.IMMUTABLE_PENDING_INTENT_FLAGS);
            AbstractC22676k.m65749i(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final NotificationCompat.Action createReplyAction$stream_chat_android_client_release(Context context, int notificationId, Channel channel, int icon, String title, String hint, PendingIntent pendingIntent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(hint, "hint");
            AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
            RemoteInput remoteInputBuild = new RemoteInput.Builder(NotificationMessageReceiver.KEY_TEXT_REPLY).setLabel(hint).build();
            AbstractC22676k.m65749i(remoteInputBuild, "build(...)");
            NotificationCompat.Action actionBuild = new NotificationCompat.Action.Builder(icon, title, pendingIntent).addRemoteInput(remoteInputBuild).setAllowGeneratedReplies(true).build();
            AbstractC22676k.m65749i(actionBuild, "build(...)");
            return actionBuild;
        }

        public final PendingIntent createReplyPendingIntent$stream_chat_android_client_release(Context context, int notificationId, Channel channel) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(channel, "channel");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, notificationId, createNotifyIntent(context, channel, NotificationMessageReceiver.ACTION_REPLY), NotificationMessageReceiver.MUTABLE_PENDING_INTENT_FLAGS);
            AbstractC22676k.m65749i(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i13 = Build.VERSION.SDK_INT;
        IMMUTABLE_PENDING_INTENT_FLAGS = 201326592;
        MUTABLE_PENDING_INTENT_FLAGS = i13 >= 31 ? 167772160 : 134217728;
    }

    private final void cancelNotification(String channelType, String channelId) {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        if (companion.isInitialized()) {
            companion.instance().dismissChannelNotifications(channelType, channelId);
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[cancelNotification] ChatClient is not initialized, returning.", null);
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void markAsRead(String messageId, String channelId, String channelType) {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        if (companion.isInitialized()) {
            ((C27481k) companion.instance().markMessageRead(channelType, channelId, messageId)).enqueue();
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[markAsRead] ChatClient is not initialized, returning.", null);
        }
    }

    private final void replyText(String channelId, String type, CharSequence messageChars) {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        if (companion.isInitialized()) {
            ChatClient.sendMessage$default(companion.instance(), type, channelId, new Message(null, PairKt.toCid(new C23465k(type, channelId)), messageChars.toString(), null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -7, 65535, null), false, 8, null).enqueue();
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[replyText] ChatClient is not initialized, returning.", null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Bundle resultsFromIntent;
        CharSequence charSequence;
        String stringExtra2;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        String stringExtra3 = intent.getStringExtra(KEY_CHANNEL_TYPE);
        if (stringExtra3 == null || (stringExtra = intent.getStringExtra(KEY_CHANNEL_ID)) == null) {
            return;
        }
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1122734891) {
                if (iHashCode == 1487802923 && action.equals(ACTION_READ) && (stringExtra2 = intent.getStringExtra(KEY_MESSAGE_ID)) != null) {
                    markAsRead(stringExtra2, stringExtra, stringExtra3);
                }
            } else if (action.equals(ACTION_REPLY) && (resultsFromIntent = RemoteInput.getResultsFromIntent(intent)) != null && (charSequence = resultsFromIntent.getCharSequence(KEY_TEXT_REPLY)) != null) {
                replyText(stringExtra, stringExtra3, charSequence);
            }
        }
        cancelNotification(stringExtra3, stringExtra);
    }
}
