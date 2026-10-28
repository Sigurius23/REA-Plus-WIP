package io.getstream.chat.android.client.notifications.handler;

import a13.EnumC0147e;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.C18999R;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.client.receivers.NotificationMessageReceiver;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.PushMessage;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0085\u00012\u00020\u0001:\u0002\u0085\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0004\u0012$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f\u0012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\"H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020+H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b4\u0010'J\u0017\u00106\u001a\u00020\"2\u0006\u0010%\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\"2\u0006\u0010%\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\"2\u0006\u0010%\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\"2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u0010CJ'\u0010G\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00142\u0006\u0010%\u001a\u00020;H\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\bM\u0010LJ\u001f\u0010N\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0010H\u0002¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010&\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010%\u001a\u00020VH\u0002¢\u0006\u0004\b&\u0010WJ1\u0010\\\u001a\u00020\u00142\u0006\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u00010+2\u0006\u0010[\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020+*\u00020\u0006H\u0002¢\u0006\u0004\b^\u0010_J\u0015\u0010`\u001a\u0004\u0018\u00010+*\u00020\u0006H\u0002¢\u0006\u0004\b`\u0010_J\u0017\u0010b\u001a\u00020\"2\u0006\u0010a\u001a\u00020\u0010H\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010d\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0010H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bf\u0010cJ\u0017\u0010g\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bg\u0010cJ\u0015\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00100hH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bk\u0010lJ\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00100h2\u0006\u0010a\u001a\u00020\u0010H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020+2\u0006\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020+2\u0006\u0010a\u001a\u00020\u0010H\u0002¢\u0006\u0004\bq\u0010pJ\u0015\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00100hH\u0002¢\u0006\u0004\br\u0010jJ\u000f\u0010s\u001a\u00020\"H\u0002¢\u0006\u0004\bs\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010tR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010uR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010vR(\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010uR2\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010wR&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00140\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010uR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010vR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010xR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010yR\u001b\u0010\u007f\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010|\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0086\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/Channel;", "Landroid/content/Intent;", "newMessageIntent", "Lkotlin/Function0;", "Landroid/app/NotificationChannel;", "notificationChannel", "Lio/getstream/chat/android/models/User;", "", "notificationTextFormatter", "Lkotlin/Function3;", "", "", "Landroidx/core/app/NotificationCompat$Action;", "actionsProvider", "Landroidx/core/app/NotificationCompat$Builder;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notificationBuilderTransformer", "currentUserProvider", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/PushMessage;", "", "onNewPushMessage", "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;", "notificationIdFactory", "<init>", "(Landroid/content/Context;Lc93/m;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V", "La13/e;", NotificationCompat.CATEGORY_STATUS, "Ll83/a0;", "onNotificationPermissionStatus", "(La13/e;)V", "notification", "showNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V", "message", "onPushMessage", "(Lio/getstream/chat/android/models/PushMessage;)Z", "", "channelType", "channelId", "dismissChannelNotifications", "(Ljava/lang/String;Ljava/lang/String;)V", "dismissAllNotifications", "()V", "getNotificationChannelId", "()Ljava/lang/String;", "showNotificationInternal", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;", "showMessageNewNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;)V", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;", "showMessageUpdatedNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;)V", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;", "showReactionNewNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)V", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;", "chatNotification", "showReminderDueNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;)V", "createNotificationId", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I", "createDefaultNotificationId", "notificationId", "channel", "buildNotification", "(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;", "buildReactionNewNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)Landroidx/core/app/NotificationCompat$Builder;", "buildReminderDueNotification", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;", "buildNotificationGroupSummary", "getNotificationGroupKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getNotificationGroupSummaryId", "(Ljava/lang/String;Ljava/lang/String;)I", "getRequestCode", "()I", "getNewMessageIntent", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;", "Landroid/app/Notification;", "(ILandroid/app/Notification;)V", "contentTitle", "contentText", "groupKey", "intent", "getNotificationBuilder", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)Landroidx/core/app/NotificationCompat$Builder;", "getNotificationContentTitle", "(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;", "getMemberNamesWithoutCurrentUser", "notificationSummaryId", "dismissSummaryNotification", "(I)V", "addNotificationId", "(II)V", "addNotificationIdWithoutSummary", "removeNotificationId", "", "getNotificationSummaryIds", "()Ljava/util/Set;", "getAssociatedNotificationSummaryId", "(I)I", "getAssociatedNotificationIds", "(I)Ljava/util/Set;", "getNotificationIdKey", "(I)Ljava/lang/String;", "getNotificationSummaryIdKey", "getNotificationWithoutSummaryIds", "clearNotificationWithoutSummaryIds", "Landroid/content/Context;", "Lc93/m;", "Lc93/a;", "Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;", "Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Ll83/h;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/app/NotificationManager;", "notificationManager$delegate", "getNotificationManager", "()Landroid/app/NotificationManager;", "notificationManager", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatNotificationHandler implements NotificationHandler {
    private static final Companion Companion = new Companion();
    private static final String KEY_NOTIFICATION_SUMMARY_IDS = "notification_summary_ids";
    private static final String KEY_NOTIFICATION_WITHOUT_SUMMARY_IDS = "notification_without_summary_ids";
    private static final String KEY_PREFIX_NOTIFICATION_ID = "nId-";
    private static final String KEY_PREFIX_NOTIFICATION_SUMMARY_ID = "nSId-";
    private static final String SHARED_PREFERENCES_NAME = "stream_notifications.sp";
    private final Function3 actionsProvider;
    private final Context context;
    private final InterfaceC4339a currentUserProvider;
    private final InterfaceC4351m newMessageIntent;
    private final InterfaceC4351m notificationBuilderTransformer;
    private final InterfaceC4339a notificationChannel;
    private final NotificationIdFactory notificationIdFactory;

    /* JADX INFO: renamed from: notificationManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h notificationManager;
    private final InterfaceC4351m notificationTextFormatter;
    private final Function1 onNewPushMessage;

    /* JADX INFO: renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h sharedPreferences;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler$Companion;", "", "<init>", "()V", "SHARED_PREFERENCES_NAME", "", "KEY_PREFIX_NOTIFICATION_ID", "KEY_PREFIX_NOTIFICATION_SUMMARY_ID", "KEY_NOTIFICATION_SUMMARY_IDS", "KEY_NOTIFICATION_WITHOUT_SUMMARY_IDS", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChatNotificationHandler(Context context, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, InterfaceC4351m notificationTextFormatter, Function3 actionsProvider, InterfaceC4351m notificationBuilderTransformer, InterfaceC4339a currentUserProvider, Function1 onNewPushMessage, NotificationIdFactory notificationIdFactory) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        AbstractC22676k.m65750j(actionsProvider, "actionsProvider");
        AbstractC22676k.m65750j(notificationBuilderTransformer, "notificationBuilderTransformer");
        AbstractC22676k.m65750j(currentUserProvider, "currentUserProvider");
        AbstractC22676k.m65750j(onNewPushMessage, "onNewPushMessage");
        this.context = context;
        this.newMessageIntent = newMessageIntent;
        this.notificationChannel = notificationChannel;
        this.notificationTextFormatter = notificationTextFormatter;
        this.actionsProvider = actionsProvider;
        this.notificationBuilderTransformer = notificationBuilderTransformer;
        this.currentUserProvider = currentUserProvider;
        this.onNewPushMessage = onNewPushMessage;
        this.notificationIdFactory = notificationIdFactory;
        final int i13 = 0;
        this.sharedPreferences = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.notifications.handler.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatNotificationHandler f73939x;

            {
                this.f73939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ChatNotificationHandler.m54873a(this.f73939x);
                    default:
                        return ChatNotificationHandler.notificationManager_delegate$lambda$3(this.f73939x);
                }
            }
        });
        final int i14 = 1;
        this.notificationManager = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.notifications.handler.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatNotificationHandler f73939x;

            {
                this.f73939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ChatNotificationHandler.m54873a(this.f73939x);
                    default:
                        return ChatNotificationHandler.notificationManager_delegate$lambda$3(this.f73939x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final User _init_$lambda$0() {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        User currentUser = companion.instance().getCurrentUser();
        return currentUser == null ? companion.instance().getStoredUser$stream_chat_android_client_release() : currentUser;
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m54873a(ChatNotificationHandler chatNotificationHandler) {
        return chatNotificationHandler.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    private final void addNotificationId(int notificationId, int notificationSummaryId) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.putInt(getNotificationIdKey(notificationId), notificationSummaryId);
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(Integer.valueOf(notificationSummaryId), getNotificationSummaryIds());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34555D, 10));
        Iterator it = linkedHashSetM34555D.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        editorEdit.putStringSet(KEY_NOTIFICATION_SUMMARY_IDS, AbstractC25265s.m74103I1(arrayList));
        String notificationSummaryIdKey = getNotificationSummaryIdKey(notificationSummaryId);
        LinkedHashSet linkedHashSetM34555D2 = AbstractC12350b.m34555D(Integer.valueOf(notificationId), getAssociatedNotificationIds(notificationSummaryId));
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34555D2, 10));
        Iterator it3 = linkedHashSetM34555D2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(String.valueOf(((Number) it3.next()).intValue()));
        }
        editorEdit.putStringSet(notificationSummaryIdKey, AbstractC25265s.m74103I1(arrayList2));
        editorEdit.apply();
    }

    private final void addNotificationIdWithoutSummary(int notificationId) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(Integer.valueOf(notificationId), getNotificationWithoutSummaryIds());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34555D, 10));
        Iterator it = linkedHashSetM34555D.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        editorEdit.putStringSet(KEY_NOTIFICATION_WITHOUT_SUMMARY_IDS, AbstractC25265s.m74103I1(arrayList));
        editorEdit.apply();
    }

    private final NotificationCompat.Builder buildNotification(int notificationId, Channel channel, Message message) {
        NotificationCompat.Builder notificationBuilder = getNotificationBuilder(getNotificationContentTitle(channel), (CharSequence) this.notificationTextFormatter.invoke((User) this.currentUserProvider.invoke(), message), getNotificationGroupKey(channel.getType(), channel.getId()), getNewMessageIntent(message, channel));
        Iterator it = ((Iterable) this.actionsProvider.invoke(Integer.valueOf(notificationId), channel, message)).iterator();
        while (it.hasNext()) {
            notificationBuilder.addAction((NotificationCompat.Action) it.next());
        }
        notificationBuilder.setDeleteIntent(NotificationMessageReceiver.INSTANCE.createDismissPendingIntent$stream_chat_android_client_release(this.context, notificationId, channel));
        return notificationBuilder;
    }

    private final NotificationCompat.Builder buildNotificationGroupSummary(Channel channel, Message message) {
        String notificationContentTitle = getNotificationContentTitle(channel);
        String string = this.context.getString(C18999R.string.stream_chat_notification_group_summary_content_text);
        AbstractC22676k.m65749i(string, "getString(...)");
        NotificationCompat.Builder notificationBuilder = getNotificationBuilder(notificationContentTitle, string, getNotificationGroupKey(channel.getType(), channel.getId()), getNewMessageIntent(message, channel));
        notificationBuilder.setGroupSummary(true);
        return notificationBuilder;
    }

    private final NotificationCompat.Builder buildReactionNewNotification(ChatNotification.ReactionNew notification) {
        return getNotificationBuilder(notification.getTitle(), notification.getBody(), null, getNewMessageIntent(notification.getMessage(), notification.getChannel()));
    }

    private final NotificationCompat.Builder buildReminderDueNotification(Channel channel, Message message) {
        User user = (User) this.currentUserProvider.invoke();
        String string = this.context.getString(C18999R.string.stream_chat_notification_reminder_due_title);
        AbstractC22676k.m65749i(string, "getString(...)");
        return getNotificationBuilder(string, (CharSequence) this.notificationTextFormatter.invoke(user, message), null, getNewMessageIntent(message, channel));
    }

    private final void clearNotificationWithoutSummaryIds() {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.remove(KEY_NOTIFICATION_WITHOUT_SUMMARY_IDS);
        editorEdit.apply();
    }

    private final int createDefaultNotificationId(ChatNotification notification) {
        if (!(notification instanceof ChatNotification.MessageNew) && !(notification instanceof ChatNotification.MessageUpdated)) {
            if (notification instanceof ChatNotification.ReactionNew) {
                ChatNotification.ReactionNew reactionNew = (ChatNotification.ReactionNew) notification;
                return (reactionNew.getMessage().getId() + ":" + reactionNew.getReactionUserId() + ":" + reactionNew.getType()).hashCode();
            }
            if (!(notification instanceof ChatNotification.NotificationReminderDue)) {
                throw new NoWhenBranchMatchedException();
            }
            ChatNotification.NotificationReminderDue notificationReminderDue = (ChatNotification.NotificationReminderDue) notification;
            return (notificationReminderDue.getChannel().getType() + ":" + notificationReminderDue.getChannel().getId() + ":" + notificationReminderDue.getMessage().getId()).hashCode();
        }
        return (int) System.nanoTime();
    }

    private final int createNotificationId(ChatNotification notification) {
        Integer notificationId;
        NotificationIdFactory notificationIdFactory = this.notificationIdFactory;
        return (notificationIdFactory == null || (notificationId = notificationIdFactory.getNotificationId(notification)) == null) ? createDefaultNotificationId(notification) : notificationId.intValue();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m54876d(User user) {
        return (String) getMemberNamesWithoutCurrentUser$lambda$8(user);
    }

    private final void dismissSummaryNotification(int notificationSummaryId) {
        Iterator<T> it = getAssociatedNotificationIds(notificationSummaryId).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            getNotificationManager().cancel(iIntValue);
            removeNotificationId(iIntValue);
        }
        getNotificationManager().cancel(notificationSummaryId);
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.remove(getNotificationSummaryIdKey(notificationSummaryId));
        editorEdit.apply();
    }

    private final Set<Integer> getAssociatedNotificationIds(int notificationSummaryId) {
        Set<String> stringSet = getSharedPreferences().getStringSet(getNotificationSummaryIdKey(notificationSummaryId), null);
        if (stringSet == null) {
            stringSet = C25235a0.f99113w;
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    private final int getAssociatedNotificationSummaryId(int notificationId) {
        return getSharedPreferences().getInt(getNotificationIdKey(notificationId), 0);
    }

    private final String getMemberNamesWithoutCurrentUser(Channel channel) {
        String strM74110N0 = AbstractC25265s.m74110N0(ChannelExtensionKt.getUsersExcludingCurrent$default(channel, null, 1, null), null, null, null, new C19336c(9), 31);
        if (strM74110N0.length() > 0) {
            return strM74110N0;
        }
        return null;
    }

    private static final CharSequence getMemberNamesWithoutCurrentUser$lambda$8(User it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getName();
    }

    private final Intent getNewMessageIntent(Message message, Channel channel) {
        return (Intent) this.newMessageIntent.invoke(message, channel);
    }

    private final NotificationCompat.Builder getNotificationBuilder(String contentTitle, CharSequence contentText, String groupKey, Intent intent) {
        NotificationCompat.Builder group = new NotificationCompat.Builder(this.context, getNotificationChannelId()).setDefaults(-1).setAutoCancel(true).setSmallIcon(C18999R.drawable.stream_ic_notification).setColor(AbstractC32122c.getColor(this.context, C18999R.color.stream_ic_notification)).setContentTitle(contentTitle).setContentText(contentText).setPriority(1).setCategory(NotificationCompat.CATEGORY_MESSAGE).setShowWhen(true).setContentIntent(PendingIntent.getActivity(this.context, (int) System.currentTimeMillis(), intent, 201326592)).setGroup(groupKey);
        AbstractC22676k.m65749i(group, "setGroup(...)");
        return group;
    }

    private final String getNotificationChannelId() {
        String id4 = ((NotificationChannel) this.notificationChannel.invoke()).getId();
        AbstractC22676k.m65747g(id4);
        return id4;
    }

    private final String getNotificationContentTitle(Channel channel) {
        String name = channel.getName();
        if (name.length() <= 0) {
            name = null;
        }
        if (name != null) {
            return name;
        }
        String memberNamesWithoutCurrentUser = getMemberNamesWithoutCurrentUser(channel);
        if (memberNamesWithoutCurrentUser != null) {
            return memberNamesWithoutCurrentUser;
        }
        String string = this.context.getString(C18999R.string.stream_chat_notification_title);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    private final String getNotificationGroupKey(String channelType, String channelId) {
        return AbstractC18489d0.m53370k(channelType, ":", channelId);
    }

    private final int getNotificationGroupSummaryId(String channelType, String channelId) {
        return getNotificationGroupKey(channelType, channelId).hashCode();
    }

    private final String getNotificationIdKey(int notificationId) {
        return AbstractC2875y.m8295h(notificationId, KEY_PREFIX_NOTIFICATION_ID);
    }

    private final NotificationManager getNotificationManager() {
        return (NotificationManager) this.notificationManager.getValue();
    }

    private final String getNotificationSummaryIdKey(int notificationSummaryId) {
        return AbstractC2875y.m8295h(notificationSummaryId, KEY_PREFIX_NOTIFICATION_SUMMARY_ID);
    }

    private final Set<Integer> getNotificationSummaryIds() {
        Set<String> stringSet = getSharedPreferences().getStringSet(KEY_NOTIFICATION_SUMMARY_IDS, null);
        if (stringSet == null) {
            stringSet = C25235a0.f99113w;
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    private final Set<Integer> getNotificationWithoutSummaryIds() {
        Set<String> stringSet = getSharedPreferences().getStringSet(KEY_NOTIFICATION_WITHOUT_SUMMARY_IDS, null);
        if (stringSet == null) {
            stringSet = C25235a0.f99113w;
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    private final int getRequestCode() {
        return (int) System.currentTimeMillis();
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationManager notificationManager_delegate$lambda$3(ChatNotificationHandler chatNotificationHandler) {
        Object systemService = chatNotificationHandler.context.getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.createNotificationChannel((NotificationChannel) chatNotificationHandler.notificationChannel.invoke());
        return notificationManager;
    }

    private final void removeNotificationId(int notificationId) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        int associatedNotificationSummaryId = getAssociatedNotificationSummaryId(notificationId);
        editorEdit.remove(getNotificationIdKey(notificationId));
        String notificationSummaryIdKey = getNotificationSummaryIdKey(associatedNotificationSummaryId);
        LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(Integer.valueOf(notificationId), getAssociatedNotificationIds(associatedNotificationSummaryId));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34604y, 10));
        Iterator it = linkedHashSetM34604y.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        editorEdit.putStringSet(notificationSummaryIdKey, AbstractC25265s.m74103I1(arrayList));
        editorEdit.apply();
    }

    private final void showMessageNewNotification(ChatNotification.MessageNew notification) {
        Channel channel = notification.getChannel();
        Message message = notification.getMessage();
        int iCreateNotificationId = createNotificationId(notification);
        int notificationGroupSummaryId = getNotificationGroupSummaryId(channel.getType(), channel.getId());
        addNotificationId(iCreateNotificationId, notificationGroupSummaryId);
        Notification notificationBuild = ((NotificationCompat.Builder) this.notificationBuilderTransformer.invoke(buildNotification(iCreateNotificationId, channel, message), notification)).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        showNotification(iCreateNotificationId, notificationBuild);
        Notification notificationBuild2 = buildNotificationGroupSummary(channel, message).build();
        AbstractC22676k.m65749i(notificationBuild2, "build(...)");
        showNotification(notificationGroupSummaryId, notificationBuild2);
    }

    private final void showMessageUpdatedNotification(ChatNotification.MessageUpdated notification) {
        Channel channel = notification.getChannel();
        Message message = notification.getMessage();
        int iCreateNotificationId = createNotificationId(notification);
        int notificationGroupSummaryId = getNotificationGroupSummaryId(channel.getType(), channel.getId());
        addNotificationId(iCreateNotificationId, notificationGroupSummaryId);
        Notification notificationBuild = ((NotificationCompat.Builder) this.notificationBuilderTransformer.invoke(buildNotification(iCreateNotificationId, channel, message), notification)).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        showNotification(iCreateNotificationId, notificationBuild);
        Notification notificationBuild2 = buildNotificationGroupSummary(channel, message).build();
        AbstractC22676k.m65749i(notificationBuild2, "build(...)");
        showNotification(notificationGroupSummaryId, notificationBuild2);
    }

    private final void showNotificationInternal(ChatNotification notification) {
        if (notification instanceof ChatNotification.MessageNew) {
            showMessageNewNotification((ChatNotification.MessageNew) notification);
            return;
        }
        if (notification instanceof ChatNotification.MessageUpdated) {
            showMessageUpdatedNotification((ChatNotification.MessageUpdated) notification);
        } else if (notification instanceof ChatNotification.ReactionNew) {
            showReactionNewNotification((ChatNotification.ReactionNew) notification);
        } else {
            if (!(notification instanceof ChatNotification.NotificationReminderDue)) {
                throw new NoWhenBranchMatchedException();
            }
            showReminderDueNotification((ChatNotification.NotificationReminderDue) notification);
        }
    }

    private final void showReactionNewNotification(ChatNotification.ReactionNew notification) {
        int iCreateNotificationId = createNotificationId(notification);
        addNotificationIdWithoutSummary(iCreateNotificationId);
        Notification notificationBuild = ((NotificationCompat.Builder) this.notificationBuilderTransformer.invoke(buildReactionNewNotification(notification), notification)).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        showNotification(iCreateNotificationId, notificationBuild);
    }

    private final void showReminderDueNotification(ChatNotification.NotificationReminderDue chatNotification) {
        Channel channel = chatNotification.getChannel();
        Message message = chatNotification.getMessage();
        int iCreateNotificationId = createNotificationId(chatNotification);
        addNotificationIdWithoutSummary(iCreateNotificationId);
        Notification notificationBuild = ((NotificationCompat.Builder) this.notificationBuilderTransformer.invoke(buildReminderDueNotification(channel, message), chatNotification)).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        showNotification(iCreateNotificationId, notificationBuild);
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void dismissAllNotifications() {
        Iterator<T> it = getNotificationSummaryIds().iterator();
        while (it.hasNext()) {
            dismissSummaryNotification(((Number) it.next()).intValue());
        }
        Iterator<T> it3 = getNotificationWithoutSummaryIds().iterator();
        while (it3.hasNext()) {
            getNotificationManager().cancel(((Number) it3.next()).intValue());
        }
        clearNotificationWithoutSummaryIds();
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void dismissChannelNotifications(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        dismissSummaryNotification(getNotificationGroupSummaryId(channelType, channelId));
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void onNotificationPermissionStatus(EnumC0147e status) {
        AbstractC22676k.m65750j(status, "status");
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final boolean onPushMessage(PushMessage message) {
        AbstractC22676k.m65750j(message, "message");
        return ((Boolean) this.onNewPushMessage.invoke(message)).booleanValue();
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void showNotification(ChatNotification notification) {
        AbstractC22676k.m65750j(notification, "notification");
        showNotificationInternal(notification);
    }

    private final void showNotification(int notificationId, Notification notification) {
        getNotificationManager().notify(notificationId, notification);
    }

    public /* synthetic */ ChatNotificationHandler(Context context, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m2, Function3 function3, InterfaceC4351m interfaceC4351m3, InterfaceC4339a interfaceC4339a2, Function1 function1, NotificationIdFactory notificationIdFactory, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC4351m, interfaceC4339a, interfaceC4351m2, function3, interfaceC4351m3, (i13 & 64) != 0 ? new C19383k(7) : interfaceC4339a2, function1, notificationIdFactory);
    }
}
