.class public final Lcom/whoop/service/push/notifications/k;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0011B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/k;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lz82/k;",
        "analyticsManager",
        "Lwe1/a;",
        "entitlementChecker",
        "Lo92/j0;",
        "titleGetter",
        "<init>",
        "(Lo92/s;Lz82/k;Lwe1/a;Lo92/j0;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lz82/k;",
        "J",
        "Lwe1/a;",
        "K",
        "Lo92/j0;",
        "",
        "L",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "M",
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
.field public static final M:Lcom/whoop/service/push/notifications/k$a;

.field public static final N:I


# instance fields
.field private final I:Lz82/k;

.field private final J:Lwe1/a;

.field private final K:Lo92/j0;

.field private final L:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/service/push/notifications/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/k;->M:Lcom/whoop/service/push/notifications/k$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/k;->N:I

    return-void
.end method

.method public constructor <init>(Lo92/s;Lz82/k;Lwe1/a;Lo92/j0;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entitlementChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleGetter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lcom/whoop/service/push/notifications/k;->I:Lz82/k;

    iput-object p3, p0, Lcom/whoop/service/push/notifications/k;->J:Lwe1/a;

    iput-object p4, p0, Lcom/whoop/service/push/notifications/k;->K:Lo92/j0;

    const-string p1, "StressMonitorPushNotification"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/k;->L:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lcom/whoop/service/push/notifications/k;)Lo92/j0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/push/notifications/k;->K:Lo92/j0;

    return-object p0
.end method

.method public static final synthetic z(Lcom/whoop/service/push/notifications/k;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 12

    const-string v1, "dataMap"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm92/c;->g(Lm92/f;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "stress_monitor"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v9, 0x3

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    :try_start_0
    const-string v1, "title"

    invoke-virtual {p0, p1, v1}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lcom/whoop/service/push/notifications/k$d;

    invoke-direct {v4, p0, v1, p2, v10}, Lcom/whoop/service/push/notifications/k$d;-><init>(Lcom/whoop/service/push/notifications/k;Ljava/lang/String;Landroid/content/Context;Lq83/d;)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v4}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lo92/k0;

    const-string v1, "body"

    invoke-virtual {p0, p1, v1}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v1, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/high16 v4, 0x8000000

    const/4 v5, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v7}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v3, Lpj2/e$a;

    invoke-direct {v3}, Lpj2/e$a;-><init>()V

    invoke-virtual {p1}, Lm92/f;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lpj2/e$a;->b(Ljava/lang/String;)Lpj2/e$a;

    move-result-object v3

    invoke-virtual {v3}, Lpj2/e$a;->a()Lpj2/e;

    move-result-object v3

    invoke-virtual {v3}, Lpj2/e;->d()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "toBundle(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/whoop/service/push/notifications/k;->J:Lwe1/a;

    sget-object v5, Lcom/whoop/entitlements/Entitlement;->STRESS_MONITOR:Lcom/whoop/entitlements/Entitlement;

    invoke-interface {v4, v5}, Lwe1/a;->b(Lcom/whoop/entitlements/Entitlement;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v4

    sget v5, Lej2/a;->b:I

    invoke-static {v4, v5}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v4, v3}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v4}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v3

    sget v4, Lhi0/e;->D2:I

    invoke-static {v3, v4}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v3}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v3

    :goto_0
    const/16 v4, 0x68

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0, p2, v5}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v8}, Lo92/k0;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v11}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    new-instance v3, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v3}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v8}, Lo92/k0;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    invoke-virtual {v3, v11}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const-string v3, "setStyle(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/whoop/service/push/notifications/k;->I:Lz82/k;

    invoke-virtual {v8}, Lo92/k0;->b()Ljk0/a;

    move-result-object v5

    invoke-virtual {v8}, Lo92/k0;->a()Ljava/lang/String;

    move-result-object v6

    const-string v7, "sleep-and-stress-pn-off-body-experiment"

    invoke-virtual {v3, v5, v6, v7}, Lz82/k;->c(Ljk0/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    const-string v3, "build(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Lo92/k0;->c()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, v1

    move v1, v4

    move-object v5, v11

    move-object v4, v3

    move-object v3, p2

    invoke-static/range {v0 .. v8}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lcom/whoop/service/push/notifications/k$b;

    invoke-direct {v2, p1, p0, v10}, Lcom/whoop/service/push/notifications/k$b;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/k;Lq83/d;)V

    invoke-static {v1, v10, v10, v2, v9}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v2, "Unable to parse pushDataMap within StressMonitorPushNotification"

    invoke-direct {v1, p1, v2}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lcom/whoop/service/push/notifications/k$c;

    invoke-direct {v2, p1, p0, v10}, Lcom/whoop/service/push/notifications/k$c;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/k;Lq83/d;)V

    invoke-static {v1, v10, v10, v2, v9}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v2, "Unrecognized notification type sent to StressMonitorPushNotification"

    invoke-direct {v1, p1, v2}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v1
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/k;->L:Ljava/lang/String;

    return-object v0
.end method
