.class public final Lo92/a;
.super Lm92/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lo92/a;",
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
.field public static final K:Lo92/a$a;

.field public static final L:I

.field public static final M:Lc12/d;


# instance fields
.field private final I:Lwm0/a;

.field private final J:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo92/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/a;->K:Lo92/a$a;

    const/16 v0, 0x8

    sput v0, Lo92/a;->L:I

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

    sput-object v0, Lo92/a;->M:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Lwm0/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/a;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/a;->I:Lwm0/a;

    const-string p1, "ActivityProcessedPushNotification"

    iput-object p1, p0, Lo92/a;->J:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/a;)Ltr2/n;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lo92/a;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lo92/a;)Lbc3/c0;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lo92/a;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/a;->I:Lwm0/a;

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 13

    const-string v1, "dataMap"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "activityId"

    invoke-virtual {p0, p1, v1}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "title"

    invoke-virtual {p1, v1}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    if-nez v1, :cond_0

    sget v1, Lhi0/j;->d:I

    sget v4, Lhi0/j;->B:I

    invoke-virtual {p2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p2, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v4, v1

    const-string v1, "body"

    invoke-virtual {p1, v1}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    sget v1, Lhi0/j;->c:I

    sget v5, Lhi0/j;->B:I

    invoke-virtual {p2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p2, v1, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v5, v1

    sget-object v1, Lc12/a;->a:Lc12/a;

    invoke-virtual {v1, v7}, Lc12/a;->a(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, p2, v2}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    new-instance v6, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v6}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v6, v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    const-string v6, "setStyle(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lo92/a;->M:Lc12/d;

    invoke-virtual {v6, v2}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    const-string v6, "cycleDays"

    invoke-virtual {p0, p1, v6}, Lm92/b;->v(Lm92/f;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v6, :cond_2

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    const/4 v12, 0x1

    xor-int/2addr v11, v12

    if-ne v11, v12, :cond_2

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lcom/whoop/ui/f;->m(Ljava/lang/String;)Lorg/joda/time/LocalDate;

    move-result-object v6

    goto :goto_0

    :cond_2
    move-object v6, v10

    :goto_0
    const/4 v11, 0x3

    if-nez v6, :cond_3

    new-instance v6, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v7, "Can\'t find cycle days, aborting cycle refresh and prefetch"

    invoke-direct {v6, p1, v7}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lm92/b;->u(Lcom/whoop/service/push/InvalidPushDataException;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v6

    new-instance v7, Lo92/a$b;

    invoke-direct {v7, p0, p1, v10}, Lo92/a$b;-><init>(Lo92/a;Lm92/f;Lq83/d;)V

    invoke-static {v6, v10, v10, v7, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {v2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    const-string v6, "build(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v3, p2

    invoke-static/range {v0 .. v8}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v0

    const-string v3, "Prefetching cycle and workout data"

    new-array v6, v9, [Lqr2/a$a;

    invoke-interface {v0, v3, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v12

    new-instance v0, Lo92/a$c;

    const/4 v9, 0x0

    move-object v8, p1

    move v3, v1

    move-object v6, v5

    move-object v1, p0

    move-object v5, v4

    move-object v4, p2

    invoke-direct/range {v0 .. v9}, Lo92/a$c;-><init>(Lo92/a;Landroidx/core/app/NotificationCompat$Builder;ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm92/f;Lq83/d;)V

    invoke-static {v12, v10, v10, v0, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/a;->J:Ljava/lang/String;

    return-object v0
.end method
