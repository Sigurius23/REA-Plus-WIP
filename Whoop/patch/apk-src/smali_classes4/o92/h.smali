.class public final Lo92/h;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lo92/h;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Landroid/content/Context;",
        "context",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "ffChecker",
        "",
        "logTag",
        "<init>",
        "(Lo92/s;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V",
        "Lm92/f;",
        "dataMap",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "J",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "K",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "L",
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
.field public static final L:Lo92/h$a;

.field public static final M:I

.field public static final N:Lc12/d;


# instance fields
.field private final I:Landroid/content/Context;

.field private final J:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final K:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lo92/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/h;->L:Lo92/h$a;

    const/16 v0, 0x8

    sput v0, Lo92/h;->M:I

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->MAX:Lc12/b;

    const-string v2, "00250_StrapBattery"

    sget v3, Luv0/c;->w:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc12/d;->j(Z)Lc12/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc12/d;->l(Z)Lc12/d;

    move-result-object v0

    const-string v1, "setVibrationEnabled(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lo92/h;->N:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ffChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logTag"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    .line 2
    iput-object p2, p0, Lo92/h;->I:Landroid/content/Context;

    .line 3
    iput-object p3, p0, Lo92/h;->J:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 4
    iput-object p4, p0, Lo92/h;->K:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lo92/s;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 5
    const-string p4, "DeadBatteryPushNotification"

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lo92/h;-><init>(Lo92/s;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 9

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "context"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Luv0/c;->g:I

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string p1, "getString(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Luv0/c;->f:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p2, p1, v0, p1}, Lm92/b;->e(Lm92/b;Landroid/content/Context;Ljava/lang/Integer;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "setContentText(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo92/h;->N:Lc12/d;

    invoke-virtual {v0, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    new-instance v0, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v0}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v0, v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lo92/h;->J:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "droid-battery-notifications-to-device-settings"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v0

    sget v1, Lhi0/e;->n3:I

    invoke-static {v0, v1}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v0}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v0

    sget v1, Lhi0/e;->D2:I

    invoke-static {v0, v1}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v0}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    const-string p1, "build(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/16 v1, 0x73

    const/4 v6, 0x0

    move-object v0, p0

    move-object v3, p2

    invoke-static/range {v0 .. v8}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/h;->K:Ljava/lang/String;

    return-object v0
.end method
