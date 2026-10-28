.class public final Lo92/u;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/u$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lo92/u;",
        "Lm92/b;",
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

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final K:Lo92/u$a;

.field public static final L:I


# instance fields
.field private final I:Lwm0/a;

.field private final J:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo92/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/u;->K:Lo92/u$a;

    const/16 v0, 0x8

    sput v0, Lo92/u;->L:I

    return-void
.end method

.method public constructor <init>(Lo92/s;Lwm0/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/u;->I:Lwm0/a;

    const-string p1, "RecoveryProcessedPushNotification"

    iput-object p1, p0, Lo92/u;->J:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/u;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/u;->I:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic z(Lo92/u;)Lcom/whoop/data/repositories/NotificationRepository;
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

    const-string v0, "objectId"

    invoke-virtual {p0, p1, v0}, Lm92/b;->j(Lm92/f;Ljava/lang/String;)I

    move-result v0

    sget-object v1, Lc12/a;->a:Lc12/a;

    invoke-virtual {v1, v0}, Lc12/a;->c(I)I

    move-result v3

    const-string v0, "title"

    invoke-virtual {p1, v0}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    if-nez v0, :cond_0

    sget v0, Lhi0/j;->s:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v6, v0

    const-string v0, "body"

    invoke-virtual {p1, v0}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    sget v0, Lhi0/j;->r:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v7, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    new-instance v1, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v1}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v1, v6}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "setStyle(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lo92/a;->M:Lc12/d;

    invoke-virtual {v1, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    const-string v1, "cycleDays"

    invoke-virtual {p0, p1, v1}, Lm92/b;->v(Lm92/f;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    invoke-static {v2, v1}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/whoop/ui/f;->m(Ljava/lang/String;)Lorg/joda/time/LocalDate;

    move-result-object v1

    goto :goto_1

    :cond_3
    :goto_0
    move-object v1, v4

    :goto_1
    const/4 v2, 0x3

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v5, Lo92/u$b;

    invoke-direct {v5, p1, p0, v4}, Lo92/u$b;-><init>(Lm92/f;Lo92/u;Lq83/d;)V

    invoke-static {v1, v4, v4, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v5, "Failed to build recovery processed notification"

    invoke-direct {v1, p1, v5}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lm92/b;->u(Lcom/whoop/service/push/InvalidPushDataException;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lm92/f;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ll83/k;

    const-string v8, "sourceId"

    invoke-direct {v5, v8, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    sget v5, Lhi0/e;->D2:I

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v8

    invoke-static {v8, v5}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v8, p1}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v8}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "Showing recovery processed notification for "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {p1, v1, v5}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_2
    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object p1

    new-instance v1, Lo92/u$c;

    invoke-direct {v1, p0, v4}, Lo92/u$c;-><init>(Lo92/u;Lq83/d;)V

    invoke-static {p1, v4, v4, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v4

    const-string p1, "build(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v5, p2

    invoke-static/range {v2 .. v10}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/u;->J:Ljava/lang/String;

    return-object v0
.end method
