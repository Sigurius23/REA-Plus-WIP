.class public final Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\"\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u0085\u00012\u00020\u0001:\u0002\u0085\u0001B\u00c3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0004\u0012$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00110\u000f\u0012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0010\u0008\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\t\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u0010.\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020+H\u0002\u00a2\u0006\u0004\u00082\u00103J\u0017\u00104\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u00084\u0010\'J\u0017\u00106\u001a\u00020\"2\u0006\u0010%\u001a\u000205H\u0002\u00a2\u0006\u0004\u00086\u00107J\u0017\u00109\u001a\u00020\"2\u0006\u0010%\u001a\u000208H\u0002\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010<\u001a\u00020\"2\u0006\u0010%\u001a\u00020;H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010@\u001a\u00020\"2\u0006\u0010?\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010B\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010D\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008D\u0010CJ\'\u0010G\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008G\u0010HJ\u0017\u0010I\u001a\u00020\u00142\u0006\u0010%\u001a\u00020;H\u0002\u00a2\u0006\u0004\u0008I\u0010JJ\u001f\u0010K\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008K\u0010LJ\u001f\u0010M\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008M\u0010LJ\u001f\u0010N\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008N\u0010OJ\u001f\u0010P\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008P\u0010QJ\u000f\u0010R\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008R\u0010SJ\u001f\u0010T\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008T\u0010UJ\u001f\u0010&\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010%\u001a\u00020VH\u0002\u00a2\u0006\u0004\u0008&\u0010WJ1\u0010\\\u001a\u00020\u00142\u0006\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020\r2\u0008\u0010Z\u001a\u0004\u0018\u00010+2\u0006\u0010[\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\\\u0010]J\u0013\u0010^\u001a\u00020+*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008^\u0010_J\u0015\u0010`\u001a\u0004\u0018\u00010+*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008`\u0010_J\u0017\u0010b\u001a\u00020\"2\u0006\u0010a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008b\u0010cJ\u001f\u0010d\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008d\u0010eJ\u0017\u0010f\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008f\u0010cJ\u0017\u0010g\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008g\u0010cJ\u0015\u0010i\u001a\u0008\u0012\u0004\u0012\u00020\u00100hH\u0002\u00a2\u0006\u0004\u0008i\u0010jJ\u0017\u0010k\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008k\u0010lJ\u001d\u0010m\u001a\u0008\u0012\u0004\u0012\u00020\u00100h2\u0006\u0010a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008m\u0010nJ\u0017\u0010o\u001a\u00020+2\u0006\u0010E\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008o\u0010pJ\u0017\u0010q\u001a\u00020+2\u0006\u0010a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008q\u0010pJ\u0015\u0010r\u001a\u0008\u0012\u0004\u0012\u00020\u00100hH\u0002\u00a2\u0006\u0004\u0008r\u0010jJ\u000f\u0010s\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008s\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010tR&\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010uR\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010vR(\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010uR2\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00110\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010wR&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00140\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010uR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010vR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010xR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010yR\u001b\u0010\u007f\u001a\u00020z8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008{\u0010|\u001a\u0004\u0008}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u0081\u0001\u0010|\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u00a8\u0006\u0086\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/Function2;",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/Channel;",
        "Landroid/content/Intent;",
        "newMessageIntent",
        "Lkotlin/Function0;",
        "Landroid/app/NotificationChannel;",
        "notificationChannel",
        "Lio/getstream/chat/android/models/User;",
        "",
        "notificationTextFormatter",
        "Lkotlin/Function3;",
        "",
        "",
        "Landroidx/core/app/NotificationCompat$Action;",
        "actionsProvider",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
        "notificationBuilderTransformer",
        "currentUserProvider",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/PushMessage;",
        "",
        "onNewPushMessage",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
        "notificationIdFactory",
        "<init>",
        "(Landroid/content/Context;Lc93/m;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V",
        "La13/e;",
        "status",
        "Ll83/a0;",
        "onNotificationPermissionStatus",
        "(La13/e;)V",
        "notification",
        "showNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V",
        "message",
        "onPushMessage",
        "(Lio/getstream/chat/android/models/PushMessage;)Z",
        "",
        "channelType",
        "channelId",
        "dismissChannelNotifications",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "dismissAllNotifications",
        "()V",
        "getNotificationChannelId",
        "()Ljava/lang/String;",
        "showNotificationInternal",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;",
        "showMessageNewNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;)V",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;",
        "showMessageUpdatedNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;)V",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;",
        "showReactionNewNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)V",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;",
        "chatNotification",
        "showReminderDueNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;)V",
        "createNotificationId",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I",
        "createDefaultNotificationId",
        "notificationId",
        "channel",
        "buildNotification",
        "(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;",
        "buildReactionNewNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)Landroidx/core/app/NotificationCompat$Builder;",
        "buildReminderDueNotification",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;",
        "buildNotificationGroupSummary",
        "getNotificationGroupKey",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "getNotificationGroupSummaryId",
        "(Ljava/lang/String;Ljava/lang/String;)I",
        "getRequestCode",
        "()I",
        "getNewMessageIntent",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;",
        "Landroid/app/Notification;",
        "(ILandroid/app/Notification;)V",
        "contentTitle",
        "contentText",
        "groupKey",
        "intent",
        "getNotificationBuilder",
        "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)Landroidx/core/app/NotificationCompat$Builder;",
        "getNotificationContentTitle",
        "(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;",
        "getMemberNamesWithoutCurrentUser",
        "notificationSummaryId",
        "dismissSummaryNotification",
        "(I)V",
        "addNotificationId",
        "(II)V",
        "addNotificationIdWithoutSummary",
        "removeNotificationId",
        "",
        "getNotificationSummaryIds",
        "()Ljava/util/Set;",
        "getAssociatedNotificationSummaryId",
        "(I)I",
        "getAssociatedNotificationIds",
        "(I)Ljava/util/Set;",
        "getNotificationIdKey",
        "(I)Ljava/lang/String;",
        "getNotificationSummaryIdKey",
        "getNotificationWithoutSummaryIds",
        "clearNotificationWithoutSummaryIds",
        "Landroid/content/Context;",
        "Lc93/m;",
        "Lc93/a;",
        "Lkotlin/jvm/functions/Function3;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
        "Landroid/content/SharedPreferences;",
        "sharedPreferences$delegate",
        "Ll83/h;",
        "getSharedPreferences",
        "()Landroid/content/SharedPreferences;",
        "sharedPreferences",
        "Landroid/app/NotificationManager;",
        "notificationManager$delegate",
        "getNotificationManager",
        "()Landroid/app/NotificationManager;",
        "notificationManager",
        "Companion",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler$Companion;

.field private static final KEY_NOTIFICATION_SUMMARY_IDS:Ljava/lang/String; = "notification_summary_ids"

.field private static final KEY_NOTIFICATION_WITHOUT_SUMMARY_IDS:Ljava/lang/String; = "notification_without_summary_ids"

.field private static final KEY_PREFIX_NOTIFICATION_ID:Ljava/lang/String; = "nId-"

.field private static final KEY_PREFIX_NOTIFICATION_SUMMARY_ID:Ljava/lang/String; = "nSId-"

.field private static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "stream_notifications.sp"


# instance fields
.field private final actionsProvider:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final currentUserProvider:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final newMessageIntent:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final notificationBuilderTransformer:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final notificationChannel:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

.field private final notificationManager$delegate:Ll83/h;

.field private final notificationTextFormatter:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final onNewPushMessage:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final sharedPreferences$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->Companion:Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc93/m;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc93/m;",
            "Lc93/a;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/m;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTextFormatter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionsProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationBuilderTransformer"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUserProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNewPushMessage"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->newMessageIntent:Lc93/m;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationChannel:Lc93/a;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationTextFormatter:Lc93/m;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->actionsProvider:Lkotlin/jvm/functions/Function3;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationBuilderTransformer:Lc93/m;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->currentUserProvider:Lc93/a;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->onNewPushMessage:Lkotlin/jvm/functions/Function1;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

    .line 11
    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/notifications/handler/a;-><init>(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->sharedPreferences$delegate:Ll83/h;

    .line 12
    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/notifications/handler/a;-><init>(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationManager$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lc93/m;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_0

    .line 13
    new-instance v0, Lio/getstream/chat/android/client/k;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/k;-><init>(I)V

    move-object v9, v0

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    goto :goto_1

    :cond_0
    move-object/from16 v9, p7

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;-><init>(Landroid/content/Context;Lc93/m;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V

    return-void
.end method

.method private static final _init_$lambda$0()Lio/getstream/chat/android/models/User;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getStoredUser$stream_chat_android_client_release()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public static a(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;)Landroid/content/SharedPreferences;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    const-string v0, "stream_notifications.sp"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method private final addNotificationId(II)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationIdKey(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationSummaryIds()Ljava/util/Set;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2, v1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "notification_summary_ids"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationSummaryIdKey(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getAssociatedNotificationIds(I)Ljava/util/Set;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, p2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private final addNotificationIdWithoutSummary(I)V
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationWithoutSummaryIds()Ljava/util/Set;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    const-string v1, "notification_without_summary_ids"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static synthetic b()Lio/getstream/chat/android/models/User;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->_init_$lambda$0()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0
.end method

.method private final buildNotification(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->currentUserProvider:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationContentTitle(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationTextFormatter:Lc93/m;

    invoke-interface {v2, v0, p3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p3, p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNewMessageIntent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;

    move-result-object v3

    invoke-direct {p0, v1, v0, v2, v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationBuilder(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->actionsProvider:Lkotlin/jvm/functions/Function3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/app/NotificationCompat$Action;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_0

    :cond_0
    sget-object p3, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    invoke-virtual {p3, v1, p1, p2}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createDismissPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    return-object v0
.end method

.method private final buildNotificationGroupSummary(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 4

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationContentTitle(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_group_summary_content_text:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNewMessageIntent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, v0, v1, v2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationBuilder(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setGroupSummary(Z)Landroidx/core/app/NotificationCompat$Builder;

    return-object p1
.end method

.method private final buildReactionNewNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNewMessageIntent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationBuilder(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    return-object p1
.end method

.method private final buildReminderDueNotification(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->currentUserProvider:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_reminder_due_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationTextFormatter:Lc93/m;

    invoke-interface {v2, v0, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNewMessageIntent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, v1, v0, v2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationBuilder(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;)Landroid/app/NotificationManager;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationManager_delegate$lambda$3(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;)Landroid/app/NotificationManager;

    move-result-object p0

    return-object p0
.end method

.method private final clearNotificationWithoutSummaryIds()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "notification_without_summary_ids"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private final createDefaultNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I
    .locals 4

    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    long-to-int p1, v0

    return p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    long-to-int p1, v0

    return p1

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    const-string v1, ":"

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getReactionUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getType()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final createNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;->getNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->createDefaultNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result p1

    return p1
.end method

.method public static synthetic d(Lio/getstream/chat/android/models/User;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getMemberNamesWithoutCurrentUser$lambda$8(Lio/getstream/chat/android/models/User;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private final dismissSummaryNotification(I)V
    .locals 3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getAssociatedNotificationIds(I)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/NotificationManager;->cancel(I)V

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->removeNotificationId(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationSummaryIdKey(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private final getAssociatedNotificationIds(I)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationSummaryIdKey(I)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final getAssociatedNotificationSummaryId(I)I
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationIdKey(I)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method private final getMemberNamesWithoutCurrentUser(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->getUsersExcludingCurrent$default(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p1, 0x9

    invoke-direct {v6, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    const/16 v7, 0x1f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method

.method private static final getMemberNamesWithoutCurrentUser$lambda$8(Lio/getstream/chat/android/models/User;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getNewMessageIntent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->newMessageIntent:Lc93/m;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    return-object p1
.end method

.method private final getNotificationBuilder(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-int v1, v1

    const/high16 v2, 0xc000000

    invoke-static {v0, v1, p4, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p4

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationChannelId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v2, Lio/getstream/chat/android/client/R$drawable;->stream_ic_notification:I

    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    sget v3, Lio/getstream/chat/android/client/R$color;->stream_ic_notification:I

    invoke-static {v2, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string p2, "msg"

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/core/app/NotificationCompat$Builder;->setGroup(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string p2, "setGroup(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getNotificationChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationChannel:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationChannel;

    invoke-virtual {v0}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getNotificationContentTitle(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getMemberNamesWithoutCurrentUser(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    sget v0, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1

    :cond_2
    return-object v0
.end method

.method private final getNotificationGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ":"

    invoke-static {p1, v0, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getNotificationGroupSummaryId(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1
.end method

.method private final getNotificationIdKey(I)Ljava/lang/String;
    .locals 1

    const-string v0, "nId-"

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getNotificationManager()Landroid/app/NotificationManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    return-object v0
.end method

.method private final getNotificationSummaryIdKey(I)Ljava/lang/String;
    .locals 1

    const-string v0, "nSId-"

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getNotificationSummaryIds()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "notification_summary_ids"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final getNotificationWithoutSummaryIds()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "notification_without_summary_ids"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final getRequestCode()I
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method private final getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->sharedPreferences$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method private static final notificationManager_delegate$lambda$3(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;)Landroid/app/NotificationManager;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationChannel:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationChannel;

    invoke-virtual {v0, p0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-object v0
.end method

.method private final removeNotificationId(I)V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getAssociatedNotificationSummaryId(I)I

    move-result v1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationIdKey(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationSummaryIdKey(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getAssociatedNotificationIds(I)Ljava/util/Set;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v1}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private static final sharedPreferences_delegate$lambda$1(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;)Landroid/content/SharedPreferences;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->context:Landroid/content/Context;

    const-string v0, "stream_notifications.sp"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method private final showMessageNewNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;)V
    .locals 6

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->component1()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->component2()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->createNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result v2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationGroupSummaryId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-direct {p0, v2, v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->addNotificationId(II)V

    iget-object v4, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationBuilderTransformer:Lc93/m;

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->buildNotification(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    invoke-interface {v4, v5, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string v4, "build(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showNotification(ILandroid/app/Notification;)V

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->buildNotificationGroupSummary(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v3, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showNotification(ILandroid/app/Notification;)V

    return-void
.end method

.method private final showMessageUpdatedNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;)V
    .locals 6

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;->component1()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;->component2()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->createNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result v2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationGroupSummaryId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-direct {p0, v2, v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->addNotificationId(II)V

    iget-object v4, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationBuilderTransformer:Lc93/m;

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->buildNotification(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    invoke-interface {v4, v5, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string v4, "build(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showNotification(ILandroid/app/Notification;)V

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->buildNotificationGroupSummary(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v3, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showNotification(ILandroid/app/Notification;)V

    return-void
.end method

.method private final showNotification(ILandroid/app/Notification;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method private final showNotificationInternal(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showMessageNewNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;)V

    return-void

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showMessageUpdatedNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;)V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showReactionNewNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)V

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showReminderDueNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final showReactionNewNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)V
    .locals 3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->createNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->addNotificationIdWithoutSummary(I)V

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationBuilderTransformer:Lc93/m;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->buildReactionNewNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string v1, "build(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showNotification(ILandroid/app/Notification;)V

    return-void
.end method

.method private final showReminderDueNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;)V
    .locals 4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->component1()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->component2()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->createNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result v2

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->addNotificationIdWithoutSummary(I)V

    iget-object v3, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->notificationBuilderTransformer:Lc93/m;

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->buildReminderDueNotification(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-interface {v3, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showNotification(ILandroid/app/Notification;)V

    return-void
.end method


# virtual methods
.method public final dismissAllNotifications()V
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationSummaryIds()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->dismissSummaryNotification(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationWithoutSummaryIds()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/NotificationManager;->cancel(I)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->clearNotificationWithoutSummaryIds()V

    return-void
.end method

.method public final dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->getNotificationGroupSummaryId(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->dismissSummaryNotification(I)V

    return-void
.end method

.method public final onNotificationPermissionStatus(La13/e;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onPushMessage(Lio/getstream/chat/android/models/PushMessage;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->onNewPushMessage:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final showNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
    .locals 1

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->showNotificationInternal(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V

    return-void
.end method
