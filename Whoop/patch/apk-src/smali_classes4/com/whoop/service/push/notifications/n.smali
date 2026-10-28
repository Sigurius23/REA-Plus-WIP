.class public final Lcom/whoop/service/push/notifications/n;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/n$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/n;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "<init>",
        "(Lo92/s;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "",
        "I",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "J",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final J:Lcom/whoop/service/push/notifications/n$a;

.field public static final K:I

.field public static final L:Lc12/d;


# instance fields
.field private final I:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/service/push/notifications/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/n;->J:Lcom/whoop/service/push/notifications/n$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/n;->K:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "06625_WhoopLabs"

    sget v2, Lhi0/j;->G0:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/service/push/notifications/n;->L:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    const-string p1, "WhoopLabsPushNotification"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/n;->I:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic z(Lcom/whoop/service/push/notifications/n;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v2, p2

    const-string v8, "sessionId"

    const-string v10, "campaignId"

    const-string v1, "dataMap"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lm92/c;->g(Lm92/f;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "whoop_labs"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v11, 0x3

    const/4 v12, 0x0

    if-nez v1, :cond_1

    const-string v1, "Study Completed"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lcom/whoop/service/push/notifications/n$c;

    invoke-direct {v2, v9, v0, v12}, Lcom/whoop/service/push/notifications/n$c;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/n;Lq83/d;)V

    invoke-static {v1, v12, v12, v2, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v2, "Unrecognized notification type sent to WhoopLabsPushNotification"

    invoke-direct {v1, v9, v2}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    :try_start_0
    const-string v1, "title"

    invoke-virtual {v9, v1}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    sget v1, Lhi0/j;->G0:I

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "getString(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    move-object v13, v1

    const-string v1, "body"

    invoke-virtual {v0, v9, v1}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v10}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    move-object v15, v1

    goto :goto_1

    :cond_3
    move-object v15, v12

    :goto_1
    invoke-virtual {v9, v8}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v4, Lhi0/e;->m5:I

    move-object v5, v1

    sget-object v1, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    move/from16 v16, v4

    const/high16 v4, 0x8000000

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move/from16 v12, v16

    move-object/from16 v11, v17

    invoke-static/range {v1 .. v7}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v3

    invoke-static {v3, v12}, Leb/j0;->f(Leb/j0;I)V

    if-eqz v15, :cond_4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v10, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v8, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v5}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v3, v4}, Leb/j0;->e(Landroid/os/Bundle;)V

    :cond_4
    const/16 v4, 0x6d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    invoke-virtual {v3}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v13}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v14}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    new-instance v3, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v3}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v3, v13}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    invoke-virtual {v3, v14}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const-string v3, "setStyle(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/whoop/service/push/notifications/n;->L:Lc12/d;

    invoke-virtual {v3, v1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    const-string v3, "build(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v2

    move-object v5, v14

    move-object v2, v1

    move v1, v4

    move-object v4, v13

    invoke-static/range {v0 .. v8}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {v0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lcom/whoop/service/push/notifications/n$b;

    const/4 v3, 0x0

    invoke-direct {v2, v9, v0, v3}, Lcom/whoop/service/push/notifications/n$b;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/n;Lq83/d;)V

    const/4 v4, 0x3

    invoke-static {v1, v3, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v2, "Unable to parse pushDataMap within WhoopLabsPushNotification"

    invoke-direct {v1, v9, v2}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v1
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/n;->I:Ljava/lang/String;

    return-object v0
.end method
