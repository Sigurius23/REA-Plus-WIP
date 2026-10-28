.class public final Lo92/p;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/p$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lo92/p;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lz82/e;",
        "eventDispatcher",
        "Lp92/i;",
        "realTimeStreamController",
        "<init>",
        "(Lo92/s;Lz82/e;Lp92/i;)V",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "builder",
        "Landroid/content/Context;",
        "context",
        "A",
        "(Landroidx/core/app/NotificationCompat$Builder;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;",
        "Lm92/f;",
        "dataMap",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lz82/e;",
        "J",
        "Lp92/i;",
        "",
        "K",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
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
.field public static final L:Lo92/p$a;

.field public static final M:I

.field private static final N:Lc12/d;


# instance fields
.field private final I:Lz82/e;

.field private final J:Lp92/i;

.field private final K:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo92/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/p;->L:Lo92/p$a;

    const/16 v0, 0x8

    sput v0, Lo92/p;->M:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "00200_Alerts"

    sget v2, Lhi0/j;->n:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sput-object v0, Lo92/p;->N:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Lz82/e;Lp92/i;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "realTimeStreamController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/p;->I:Lz82/e;

    iput-object p3, p0, Lo92/p;->J:Lp92/i;

    const-string p1, "OptimalStrainGoalReachedNotification"

    iput-object p1, p0, Lo92/p;->K:Ljava/lang/String;

    return-void
.end method

.method private final A(Landroidx/core/app/NotificationCompat$Builder;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 3

    sget-object v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->u0:Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;

    iget-object v1, p0, Lo92/p;->J:Lp92/i;

    invoke-virtual {v0, p2, v1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;->b(Landroid/content/Context;Lp92/i;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->f()Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x67

    const/high16 v2, 0x4000000

    invoke-static {p2, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string p2, "setContentIntent(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static final synthetic z(Lo92/p;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 11

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "optimalKey"

    invoke-virtual {p0, p1, v1}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v1, Lhi0/j;->b:I

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v1, "getString(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lhi0/j;->a:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-static {p0, p2, v0, p1, v0}, Lm92/b;->e(Lm92/b;Landroid/content/Context;Ljava/lang/Integer;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    new-instance v0, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v0}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v0, v6}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "setStyle(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lo92/p;->A(Landroidx/core/app/NotificationCompat$Builder;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    sget-object v0, Lo92/p;->N:Lc12/d;

    invoke-virtual {v0, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v4

    const-string p1, "build(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/16 v3, 0x67

    const/4 v8, 0x0

    move-object v2, p0

    move-object v5, p2

    invoke-static/range {v2 .. v10}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, v2, Lo92/p;->I:Lz82/e;

    invoke-virtual {p1}, Lz82/e;->a0()V

    return-void

    :catch_0
    move-object v2, p0

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object p2

    new-instance v1, Lo92/p$b;

    invoke-direct {v1, p1, p0, v0}, Lo92/p$b;-><init>(Lm92/f;Lo92/p;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v0, v0, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/p;->K:Ljava/lang/String;

    return-object v0
.end method
