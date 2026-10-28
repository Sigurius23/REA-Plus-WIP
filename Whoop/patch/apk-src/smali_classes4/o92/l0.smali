.class public final Lo92/l0;
.super Lm92/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/l0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lo92/l0;",
        "Lm92/a;",
        "Lo92/s;",
        "pushContext",
        "Lwm0/a;",
        "scopeCoordinator",
        "<init>",
        "(Lo92/s;Lwm0/a;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lwm0/a;",
        "",
        "J",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "K",
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
.field public static final K:Lo92/l0$a;

.field public static final L:I

.field public static final M:Lc12/d;


# instance fields
.field private final I:Lwm0/a;

.field private final J:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo92/l0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/l0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/l0;->K:Lo92/l0$a;

    const/16 v0, 0x8

    sput v0, Lo92/l0;->L:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "01000_ActivityProcessed"

    sget v2, Lhi0/j;->m:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sget v1, Lhi0/j;->l:I

    invoke-virtual {v0, v1}, Lc12/d;->f(I)Lc12/d;

    move-result-object v0

    const-string v1, "setChannelDescriptionResId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lo92/l0;->M:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Lwm0/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/a;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/l0;->I:Lwm0/a;

    const-string p1, "WeightliftingWorkoutProcessedPushNotification"

    iput-object p1, p0, Lo92/l0;->J:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/l0;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/l0;->I:Lwm0/a;

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 12

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityId"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {p1, v1}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    if-nez v1, :cond_0

    sget v1, Lhi0/j;->d:I

    sget v3, Lhi0/j;->B:I

    invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p2, v1, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v7, v1

    const-string v1, "body"

    invoke-virtual {p1, v1}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    sget p1, Lhi0/j;->c:I

    sget v1, Lhi0/j;->B:I

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v8, p1

    sget-object p1, Lc12/a;->a:Lc12/a;

    invoke-virtual {p1, v0}, Lc12/a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v8}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    new-instance v1, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v1}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v1, v7}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v1, "setStyle(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lo92/l0;->M:Lc12/d;

    invoke-virtual {v1, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {p0, p2, v0}, Lm92/a;->z(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lo92/l0$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo92/l0$b;-><init>(Lo92/l0;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v5

    const-string p1, "build(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    move-object v6, p2

    invoke-static/range {v3 .. v11}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/l0;->J:Ljava/lang/String;

    return-object v0
.end method
