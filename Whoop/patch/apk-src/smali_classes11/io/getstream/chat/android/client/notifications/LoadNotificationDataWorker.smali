.class public final Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/m;",
        "createForegroundInfo",
        "()Lic/m;",
        "",
        "notificationChannelId",
        "notificationChannelName",
        "Landroid/app/Notification;",
        "createForegroundNotification",
        "(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;",
        "Ll83/a0;",
        "createSyncNotificationChannel",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lic/u;",
        "doWork",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field public static final Companion:Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;

.field private static final DATA_CHANNEL_ID:Ljava/lang/String; = "DATA_CHANNEL_ID"

.field private static final DATA_CHANNEL_TYPE:Ljava/lang/String; = "DATA_CHANNEL_TYPE"

.field private static final DATA_MESSAGE_ID:Ljava/lang/String; = "DATA_MESSAGE_ID"

.field private static final DATA_TYPE:Ljava/lang/String; = "DATA_TYPE"

.field private static final LOAD_NOTIFICATION_DATA_WORK_NAME:Ljava/lang/String; = "LOAD_NOTIFICATION_DATA_WORK_NAME"

.field private static final NOTIFICATION_ID:I = 0x1

.field private static final TAG:Ljava/lang/String; = "Chat:Notifications-Loader"


# instance fields
.field private final context:Landroid/content/Context;

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->Companion:Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->context:Landroid/content/Context;

    const-string p1, "Chat:Notifications-Loader"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final createForegroundInfo()Lic/m;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/client/R$string;->stream_chat_other_notifications_channel_id:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->context:Landroid/content/Context;

    sget v3, Lio/getstream/chat/android/client/R$string;->stream_chat_other_notifications_channel_name:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v2}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->createForegroundNotification(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    const/4 v3, 0x1

    if-lt v1, v2, :cond_0

    new-instance v1, Lic/m;

    const/16 v2, 0x800

    invoke-direct {v1, v3, v0, v2}, Lic/m;-><init>(ILandroid/app/Notification;I)V

    return-object v1

    :cond_0
    new-instance v1, Lic/m;

    const/4 v2, 0x0

    invoke-direct {v1, v3, v0, v2}, Lic/m;-><init>(ILandroid/app/Notification;I)V

    return-object v1
.end method

.method private final createForegroundNotification(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;
    .locals 1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->createSyncNotificationChannel(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->context:Landroid/content/Context;

    invoke-direct {p2, v0, p1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    sget p2, Lio/getstream/chat/android/client/R$drawable;->stream_ic_notification:I

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->context:Landroid/content/Context;

    sget v0, Lio/getstream/chat/android/client/R$string;->stream_chat_load_notification_data_title:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final createSyncNotificationChannel(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/app/NotificationChannel;

    const/4 v1, 0x2

    invoke-direct {v0, p1, p2, v1}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->context:Landroid/content/Context;

    const-class p2, Landroid/app/NotificationManager;

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final doWork(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "[doWork] failed: "

    instance-of v3, v0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;

    iget v4, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;

    invoke-direct {v3, v1, v0}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;-><init>(Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;Lq83/d;)V

    :goto_0
    iget-object v0, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->label:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v2, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$10:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$9:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    iget-object v4, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$8:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$7:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lo23/d;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lo23/d;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/ChatClient;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v3, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lo23/d;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lo23/d;

    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/ChatClient;

    iget-object v7, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    :cond_3
    iget-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v10, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    move-object v0, v12

    move-object v12, v11

    move-object v11, v10

    goto :goto_1

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lic/v;->getInputData()Lic/g;

    move-result-object v0

    const-string v5, "DATA_TYPE"

    invoke-virtual {v0, v5}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lic/v;->getInputData()Lic/g;

    move-result-object v0

    const-string v5, "DATA_CHANNEL_ID"

    invoke-virtual {v0, v5}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lic/v;->getInputData()Lic/g;

    move-result-object v0

    const-string v5, "DATA_CHANNEL_TYPE"

    invoke-virtual {v0, v5}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lic/v;->getInputData()Lic/g;

    move-result-object v0

    const-string v5, "DATA_MESSAGE_ID"

    invoke-virtual {v0, v5}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->createForegroundInfo()Lic/m;

    move-result-object v0

    iput-object v12, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$0:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$1:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$3:Ljava/lang/Object;

    iput v8, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->label:I

    invoke-virtual {v1, v0, v3}, Landroidx/work/CoroutineWorker;->setForeground(Lic/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_4

    goto/16 :goto_3

    :goto_1
    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->getLogger()Lb23/k;

    move-result-object v10

    iget-object v13, v10, Lb23/k;->c:Lb23/e;

    iget-object v14, v10, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_6

    iget-object v10, v10, Lb23/k;->b:Lb23/j;

    const-string v13, ":"

    const-string v6, ", messageId: "

    const-string v7, "[doWork] cid: "

    invoke-static {v7, v11, v13, v12, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v10, v15, v14, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    :try_start_2
    sget-object v6, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v6}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v10

    invoke-virtual {v10, v5}, Lio/getstream/chat/android/client/ChatClient;->getMessage(Ljava/lang/String;)Lo23/d;

    move-result-object v5

    new-instance v13, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-direct {v13}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;-><init>()V

    invoke-virtual {v13, v8}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setNotificationUpdate(Z)V

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Lio/getstream/chat/android/client/ChatClient;->queryChannel$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;ZILjava/lang/Object;)Lo23/d;

    move-result-object v6

    new-instance v7, Lo23/o;

    invoke-direct {v7, v6, v5}, Lo23/o;-><init>(Lo23/d;Lo23/d;)V

    iput-object v0, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$1:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$2:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$3:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$5:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$6:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->label:I

    invoke-virtual {v7, v3}, Lo23/o;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_7

    goto :goto_3

    :cond_7
    move-object v7, v0

    move-object v0, v5

    move-object v5, v10

    :goto_2
    check-cast v0, Ln23/h;

    instance-of v6, v0, Ln23/g;

    if-eqz v6, :cond_d

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v10, v8, Lb23/k;->c:Lb23/e;

    iget-object v11, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    const-string v10, "[doWork] fetching thread parent message."

    invoke-interface {v8, v12, v11, v10, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/ChatClient;->getMessage(Ljava/lang/String;)Lo23/d;

    move-result-object v5

    iput-object v7, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$1:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$2:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$5:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$6:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$7:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$8:Ljava/lang/Object;

    iput-object v0, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$9:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->L$10:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v3, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$doWork$1;->label:I

    invoke-interface {v5, v3}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_9

    :goto_3
    return-object v4

    :cond_9
    move-object v4, v2

    move-object v3, v7

    move-object v2, v0

    :goto_4
    move-object v0, v2

    move-object v7, v3

    move-object v2, v4

    :cond_a
    sget-object v3, Lio/getstream/chat/android/client/notifications/handler/ChatNotification;->Companion:Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;

    invoke-virtual {v1}, Lic/v;->getInputData()Lic/g;

    move-result-object v4

    iget-object v4, v4, Lic/g;->a:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    const-string v5, "unmodifiableMap(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v7, v4, v2, v0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;->create$stream_chat_android_client_release(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    move-result-object v0

    if-eqz v0, :cond_b

    sget-object v2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->displayNotification$stream_chat_android_client_release(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V

    :cond_b
    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[doWork] completed"

    invoke-interface {v0, v4, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v0

    return-object v0

    :cond_d
    instance-of v3, v0, Ln23/f;

    if-eqz v3, :cond_f

    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_e

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v6, v5, v0, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    new-instance v0, Lic/r;

    invoke-direct {v0}, Lic/r;-><init>()V

    return-object v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_5
    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[doWork] failed unexpectedly: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v5, v4, v0, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    new-instance v0, Lic/r;

    invoke-direct {v0}, Lic/r;-><init>()V

    return-object v0
.end method
