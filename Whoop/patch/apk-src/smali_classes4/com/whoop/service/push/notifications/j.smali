.class public final Lcom/whoop/service/push/notifications/j;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0011B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/j;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lx82/i;",
        "batteryMonitor",
        "Lz82/k;",
        "analyticsManager",
        "Lo92/c0;",
        "bodyGetter",
        "<init>",
        "(Lo92/s;Lx82/i;Lz82/k;Lo92/c0;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lx82/i;",
        "J",
        "Lz82/k;",
        "K",
        "Lo92/c0;",
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
.field public static final M:Lcom/whoop/service/push/notifications/j$a;

.field public static final N:I

.field private static final O:Lc12/d;


# instance fields
.field private final I:Lx82/i;

.field private final J:Lz82/k;

.field private final K:Lo92/c0;

.field private final L:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/service/push/notifications/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/j;->M:Lcom/whoop/service/push/notifications/j$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/j;->N:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "02000_SleepCoach"

    sget v2, Lhi0/j;->q:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/service/push/notifications/j;->O:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Lx82/i;Lz82/k;Lo92/c0;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryMonitor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyGetter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lcom/whoop/service/push/notifications/j;->I:Lx82/i;

    iput-object p3, p0, Lcom/whoop/service/push/notifications/j;->J:Lz82/k;

    iput-object p4, p0, Lcom/whoop/service/push/notifications/j;->K:Lo92/c0;

    const-string p1, "SleepNeedPushNotification"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/j;->L:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lcom/whoop/service/push/notifications/j;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B()Lc12/d;
    .locals 1

    sget-object v0, Lcom/whoop/service/push/notifications/j;->O:Lc12/d;

    return-object v0
.end method

.method public static final synthetic z(Lcom/whoop/service/push/notifications/j;)Lo92/c0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/push/notifications/j;->K:Lo92/c0;

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 13

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm92/c;->g(Lm92/f;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "SleepCoachV2"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v0, "title"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "body"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lm92/b;->g()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v2

    const-string v4, "bedtime-off-body-experiment-android"

    invoke-interface {v2, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcom/whoop/service/push/notifications/j$c;

    invoke-direct {v2, p0, v0, p2, v1}, Lcom/whoop/service/push/notifications/j$c;-><init>(Lcom/whoop/service/push/notifications/j;Ljava/lang/String;Landroid/content/Context;Lq83/d;)V

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-static {v0, v2}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo92/d0;

    goto :goto_0

    :cond_0
    new-instance v2, Lo92/d0;

    invoke-direct {v2, v0, v1, v1}, Lo92/d0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljk0/a;)V

    move-object v0, v2

    :goto_0
    invoke-virtual {v0}, Lo92/d0;->a()Ljava/lang/String;

    move-result-object v9

    iget-object v1, p0, Lcom/whoop/service/push/notifications/j;->J:Lz82/k;

    invoke-virtual {v0}, Lo92/d0;->c()Ljk0/a;

    move-result-object v2

    invoke-virtual {v0}, Lo92/d0;->b()Ljava/lang/String;

    move-result-object v0

    const-string v4, "bedtime-off-body-experiment"

    invoke-virtual {v1, v2, v0, v4}, Lz82/k;->b(Ljk0/a;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "entryPoint"

    const-string v2, "Notification - Bedtime Recommendation"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "clickType"

    const-string v4, ""

    invoke-direct {v1, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm92/f;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v4, "sourceId"

    invoke-direct {v2, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v0

    sget v1, Lhi0/e;->w4:I

    invoke-static {v0, v1}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v0, p1}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    sget-object v1, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/high16 v4, 0x8000000

    const/4 v5, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v7}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object p2

    const/16 v0, 0x32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v8}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v9}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string p2, "setDeleteIntent(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/whoop/service/push/notifications/j;->O:Lc12/d;

    invoke-virtual {p2, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    new-instance p2, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {p2}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {p2, v8}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object p2

    invoke-virtual {p2, v9}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v6

    const-string p1, "build(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/16 v5, 0x32

    const/4 v10, 0x0

    move-object v4, p0

    move-object v7, v2

    invoke-static/range {v4 .. v12}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, v4, Lcom/whoop/service/push/notifications/j;->I:Lx82/i;

    invoke-virtual {p1}, Lx82/i;->r()V

    return-void

    :cond_1
    move-object v4, p0

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object p2

    new-instance v0, Lcom/whoop/service/push/notifications/j$b;

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/service/push/notifications/j$b;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/j;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p2, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p2, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v0, "Unrecognized notification type sent to SleepNeedPushNotification"

    invoke-direct {p2, p1, v0}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw p2
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/j;->L:Ljava/lang/String;

    return-object v0
.end method
