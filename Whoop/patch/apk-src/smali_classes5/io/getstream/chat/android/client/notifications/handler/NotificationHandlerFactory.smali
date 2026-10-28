.class public final Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u00e5\u0001\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001a\u0008\u0002\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00082\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u001c\u0008\u0002\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00082&\u0008\u0002\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190\u00172\u001a\u0008\u0002\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001c0\u00082\u0014\u0008\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0007\u00a2\u0006\u0004\u0008&\u0010\'J5\u0010(\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008(\u0010)J+\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008*\u0010+J)\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00082\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u001d\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u00080\u00101J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u00082\u00103J\u0017\u00104\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u00084\u00105\u00a8\u00066"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "notificationConfig",
        "Lkotlin/Function2;",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/Channel;",
        "Landroid/content/Intent;",
        "newMessageIntent",
        "Lkotlin/Function0;",
        "Landroid/app/NotificationChannel;",
        "notificationChannel",
        "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "userIconBuilder",
        "La13/c;",
        "permissionHandler",
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
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/PushMessage;",
        "",
        "onPushMessage",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
        "notificationIdFactory",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "createNotificationHandler",
        "(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "getDefaultActionsProvider",
        "(Landroid/content/Context;)Lkotlin/jvm/functions/Function3;",
        "getDefaultNotificationTextFormatter",
        "(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;)Lc93/m;",
        "getDefaultNewMessageIntentFun",
        "(Landroid/content/Context;)Lc93/m;",
        "createDefaultNewMessageIntent",
        "(Landroid/content/Context;)Landroid/content/Intent;",
        "getDefaultNotificationChannel",
        "(Landroid/content/Context;)Lc93/a;",
        "provideDefaultUserIconBuilder",
        "(Landroid/content/Context;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "provideDefaultNotificationPermissionHandler",
        "(Landroid/content/Context;)La13/c;",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->getDefaultNotificationTextFormatter$lambda$5(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/PushMessage;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$lambda$1(Lio/getstream/chat/android/models/PushMessage;)Z

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;)Landroid/app/NotificationChannel;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->getDefaultNotificationChannel$lambda$7(Landroid/content/Context;)Landroid/app/NotificationChannel;

    move-result-object p0

    return-object p0
.end method

.method private final createDefaultNewMessageIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x7fc

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x7f8

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 3
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x7f0

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 4
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x7e0

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "La13/c;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 5
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x7c0

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "La13/c;",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 6
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTextFormatter"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x780

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "La13/c;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 7
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTextFormatter"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionsProvider"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x700

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "La13/c;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 8
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTextFormatter"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionsProvider"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationBuilderTransformer"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x600

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "La13/c;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    .line 9
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTextFormatter"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionsProvider"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationBuilderTransformer"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPushMessage"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x400

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "La13/c;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newMessageIntent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "notificationChannel"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "userIconBuilder"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "notificationTextFormatter"

    move-object/from16 v6, p6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "actionsProvider"

    move-object/from16 v7, p7

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "notificationBuilderTransformer"

    move-object/from16 v8, p8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onPushMessage"

    move-object/from16 v9, p9

    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;-><init>(Landroid/content/Context;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V

    return-object v0
.end method

.method public static createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
    .locals 11

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_0

    sget-object v2, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lc41/l3;

    const/4 v3, 0x5

    invoke-direct {v2, p0, v3}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    and-int/lit8 v3, v1, 0x8

    if-eqz v3, :cond_1

    sget-object v3, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lio/getstream/chat/android/client/notifications/handler/c;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lio/getstream/chat/android/client/notifications/handler/c;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_1
    move-object v3, p3

    :goto_1
    and-int/lit8 v4, v1, 0x10

    if-eqz v4, :cond_2

    sget-object v4, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;

    invoke-direct {v4, p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;-><init>(Landroid/content/Context;)V

    goto :goto_2

    :cond_2
    move-object v4, p4

    :goto_2
    and-int/lit8 v5, v1, 0x20

    if-eqz v5, :cond_3

    sget-object v5, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1;

    invoke-direct {v5, p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1;-><init>(Landroid/content/Context;)V

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v1, 0x40

    if-eqz v6, :cond_4

    sget-object v6, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lc41/l3;

    const/4 v7, 0x6

    invoke-direct {v6, p1, v7}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit16 v7, v1, 0x80

    if-eqz v7, :cond_5

    sget-object v7, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lbc3/l;

    const/4 v8, 0x3

    invoke-direct {v7, p0, v8}, Lbc3/l;-><init>(Ljava/lang/Object;I)V

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v1, 0x100

    if-eqz v8, :cond_6

    new-instance v8, Lin0/a;

    const/4 v9, 0x7

    invoke-direct {v8, v9}, Lin0/a;-><init>(I)V

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v1, 0x200

    if-eqz v9, :cond_7

    new-instance v9, Lim1/p0;

    const/16 v10, 0xe

    invoke-direct {v9, v10}, Lim1/p0;-><init>(I)V

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    move-object/from16 p12, v1

    :goto_8
    move-object p2, p0

    move-object p3, p1

    move-object p4, v2

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    move-object/from16 p10, v8

    move-object/from16 p11, v9

    goto :goto_9

    :cond_8
    move-object/from16 p12, p10

    goto :goto_8

    :goto_9
    invoke-static/range {p2 .. p12}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object v0

    return-object v0
.end method

.method private static final createNotificationHandler$lambda$0(Landroidx/core/app/NotificationCompat$Builder;Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 1

    const-string v0, "builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final createNotificationHandler$lambda$1(Lio/getstream/chat/android/models/PushMessage;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic d(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->getDefaultActionsProvider$lambda$2(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->getDefaultNewMessageIntentFun$lambda$6(Landroid/content/Context;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/core/app/NotificationCompat$Builder;Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$lambda$0(Landroidx/core/app/NotificationCompat$Builder;Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Landroidx/core/app/NotificationCompat$Builder;

    return-void
.end method

.method private final getDefaultActionsProvider(Landroid/content/Context;)Lkotlin/jvm/functions/Function3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    new-instance v0, Lbc3/l;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lbc3/l;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static final getDefaultActionsProvider$lambda$2(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 11

    const-string v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;

    const/16 v9, 0x70

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;->createMarkReadAction$default(Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p0

    const/16 v9, 0x78

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;->createReplyAction$default(Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    filled-new-array {p0, p1}, [Landroidx/core/app/NotificationCompat$Action;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final getDefaultNewMessageIntentFun(Landroid/content/Context;)Lc93/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lc93/m;"
        }
    .end annotation

    new-instance v0, Lc41/l3;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static final getDefaultNewMessageIntentFun$lambda$6(Landroid/content/Context;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createDefaultNewMessageIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private final getDefaultNotificationChannel(Landroid/content/Context;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/notifications/handler/c;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method private static final getDefaultNotificationChannel$lambda$7(Landroid/content/Context;)Landroid/app/NotificationChannel;
    .locals 3

    new-instance v0, Landroid/app/NotificationChannel;

    sget v1, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_channel_id:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_channel_name:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x3

    invoke-direct {v0, v1, p0, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    return-object v0
.end method

.method private final getDefaultNotificationTextFormatter(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;)Lc93/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
            ")",
            "Lc93/m;"
        }
    .end annotation

    new-instance v0, Lc41/l3;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static final getDefaultNotificationTextFormatter$lambda$5(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->getAutoTranslationEnabled()Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getLanguage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p2, p0}, Lio/getstream/chat/android/models/Message;->getTranslation(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p0

    :cond_0
    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    return-object p0

    :cond_2
    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final provideDefaultNotificationPermissionHandler(Landroid/content/Context;)La13/c;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private final provideDefaultUserIconBuilder(Landroid/content/Context;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
