.class public final Lcom/whoop/service/push/notifications/a;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/a;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "<init>",
        "(Lo92/s;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/PendingIntent;",
        "B",
        "(Lm92/f;Landroid/content/Context;)Landroid/app/PendingIntent;",
        "D",
        "C",
        "(Landroid/content/Context;)Landroid/app/PendingIntent;",
        "Ll83/a0;",
        "E",
        "(Lm92/f;)V",
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
.field public static final J:Lcom/whoop/service/push/notifications/a$a;

.field public static final K:I

.field private static final L:Lc12/d;


# instance fields
.field private final I:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/service/push/notifications/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/a;->J:Lcom/whoop/service/push/notifications/a$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/a;->K:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "06700_AdvancedLabs"

    sget v2, Lhi0/j;->v0:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/service/push/notifications/a;->L:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    const-string p1, "AdvancedLabsUploadPushNotification"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/a;->I:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A()Lc12/d;
    .locals 1

    sget-object v0, Lcom/whoop/service/push/notifications/a;->L:Lc12/d;

    return-object v0
.end method

.method private final B(Lm92/f;Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/service/push/notifications/a;->D(Lm92/f;Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-direct {p0, p2}, Lcom/whoop/service/push/notifications/a;->C(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final C(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 1

    invoke-virtual {p0, p1}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget v0, Lma0/b;->a:I

    invoke-static {p1, v0}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private final D(Lm92/f;Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 5

    const-string v0, "is_ai_confirmation"

    const-string v1, "test_id"

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "navigation"

    invoke-virtual {p1, v3}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "screen"

    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v4, Lcom/whoop/navigation/AppScreen$c0;->w:Lcom/whoop/navigation/AppScreen$c0;

    invoke-virtual {v4}, Lcom/whoop/navigation/AppScreen$c0;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string p1, "parameters"

    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object p2

    sget v4, Lma0/b;->b:I

    invoke-static {p2, v4}, Leb/j0;->f(Leb/j0;I)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p2, p1}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {p2}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/whoop/navigation/AppScreen$t0;->w:Lcom/whoop/navigation/AppScreen$t0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t0;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget p2, Lma0/b;->c:I

    invoke-static {p1, p2}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_3
    :goto_0
    return-object v2

    :goto_1
    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to parse navigation from meta_data, falling back to Advanced Labs home"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v2
.end method

.method private final E(Lm92/f;)V
    .locals 3

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lcom/whoop/service/push/notifications/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/whoop/service/push/notifications/a$b;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic z(Lcom/whoop/service/push/notifications/a;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 13

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Lm92/c;->g(Lm92/f;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "BloodworkImageUploadReview"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "title"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "body"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, p1, p2}, Lcom/whoop/service/push/notifications/a;->B(Lm92/f;Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    sget-object v1, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/high16 v4, 0x8000000

    const/4 v5, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v7}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object p2

    const/16 v5, 0x74

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    new-instance v1, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v1}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v1, v8}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    const-string v0, "setDeleteIntent(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/service/push/notifications/a;->L:Lc12/d;

    invoke-virtual {v0, p2}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {p2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v6

    const-string p2, "build(...)"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, p0

    move-object v7, v2

    invoke-static/range {v4 .. v12}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/service/push/notifications/a;->E(Lm92/f;)V

    new-instance p2, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v0, "Unrecognized notification type sent to AdvancedLabsUploadPushNotification"

    invoke-direct {p2, p1, v0}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Advanced Labs upload notification failed"

    invoke-interface {v0, v2, p2, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-direct {p0, p1}, Lcom/whoop/service/push/notifications/a;->E(Lm92/f;)V

    new-instance p2, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v0, "Unable to parse pushDataMap within AdvancedLabsUploadPushNotification"

    invoke-direct {p2, p1, v0}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw p2
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/a;->I:Ljava/lang/String;

    return-object v0
.end method
