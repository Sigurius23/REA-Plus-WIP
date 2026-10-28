.class final Lcom/whoop/service/push/notifications/m$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/push/notifications/m;->a(Lm92/f;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.push.notifications.TeamOwnershipPushNotification$perform$1"
    f = "TeamOwnershipPushNotification.kt"
    l = {
        0x44
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lm92/f;

.field final synthetic F:I

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Landroid/app/PendingIntent;

.field w:I

.field final synthetic x:Lcom/whoop/service/push/notifications/m;

.field final synthetic y:I

.field final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/whoop/service/push/notifications/m;ILandroid/content/Context;Lm92/f;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/push/notifications/m;",
            "I",
            "Landroid/content/Context;",
            "Lm92/f;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/app/PendingIntent;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/push/notifications/m$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iput p2, p0, Lcom/whoop/service/push/notifications/m$b;->y:I

    iput-object p3, p0, Lcom/whoop/service/push/notifications/m$b;->z:Landroid/content/Context;

    iput-object p4, p0, Lcom/whoop/service/push/notifications/m$b;->E:Lm92/f;

    iput p5, p0, Lcom/whoop/service/push/notifications/m$b;->F:I

    iput-object p6, p0, Lcom/whoop/service/push/notifications/m$b;->G:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/service/push/notifications/m$b;->H:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/service/push/notifications/m$b;->I:Landroid/app/PendingIntent;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/service/push/notifications/m$b;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iget v2, p0, Lcom/whoop/service/push/notifications/m$b;->y:I

    iget-object v3, p0, Lcom/whoop/service/push/notifications/m$b;->z:Landroid/content/Context;

    iget-object v4, p0, Lcom/whoop/service/push/notifications/m$b;->E:Lm92/f;

    iget v5, p0, Lcom/whoop/service/push/notifications/m$b;->F:I

    iget-object v6, p0, Lcom/whoop/service/push/notifications/m$b;->G:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/service/push/notifications/m$b;->H:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/service/push/notifications/m$b;->I:Landroid/app/PendingIntent;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/whoop/service/push/notifications/m$b;-><init>(Lcom/whoop/service/push/notifications/m;ILandroid/content/Context;Lm92/f;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/push/notifications/m$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/push/notifications/m$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/service/push/notifications/m$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/push/notifications/m$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/service/push/notifications/m$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iget v1, p0, Lcom/whoop/service/push/notifications/m$b;->y:I

    iput v2, p0, Lcom/whoop/service/push/notifications/m$b;->w:I

    invoke-static {p1, v1, p0}, Lcom/whoop/service/push/notifications/m;->G(Lcom/whoop/service/push/notifications/m;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    invoke-static {v0}, Lcom/whoop/service/push/notifications/m;->C(Lcom/whoop/service/push/notifications/m;)Lyp0/a;

    move-result-object v0

    invoke-interface {v0}, Lyp0/a;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Ld92/b;->a:Ld92/b;

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->z:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/whoop/service/push/notifications/m;->A(Lcom/whoop/service/push/notifications/m;Landroid/content/Context;)Leb/j0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld92/b;->b(Leb/j0;)Landroid/app/PendingIntent;

    move-result-object p1

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->z:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/whoop/service/push/notifications/m;->A(Lcom/whoop/service/push/notifications/m;Landroid/content/Context;)Leb/j0;

    move-result-object v0

    sget v1, Lxp0/a0;->G0:I

    invoke-static {v0, v1}, Leb/j0;->f(Leb/j0;I)V

    new-instance v1, Lxp0/f$a;

    const/4 v2, 0x0

    const-string v3, "DAILY"

    invoke-direct {v1, v2, v3}, Lxp0/f$a;-><init>(ILjava/lang/String;)V

    invoke-virtual {v1, p1}, Lxp0/f$a;->d(Lcom/whoop/domain/model/teams/Team;)Lxp0/f$a;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->E:Lm92/f;

    invoke-virtual {v1}, Lm92/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lxp0/f$a;->c(Ljava/lang/String;)Lxp0/f$a;

    move-result-object p1

    invoke-virtual {p1}, Lxp0/f$a;->a()Lxp0/f;

    move-result-object p1

    invoke-virtual {p1}, Lxp0/f;->j()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/m;->F(Lcom/whoop/service/push/notifications/m;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lcom/whoop/service/push/notifications/m$b$a;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->E:Lm92/f;

    iget-object v2, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/service/push/notifications/m$b$a;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/m;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object p1, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->z:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/whoop/service/push/notifications/m;->A(Lcom/whoop/service/push/notifications/m;Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget v0, Lxp0/a0;->H0:I

    invoke-static {p1, v0}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    :goto_1
    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->z:Landroid/content/Context;

    iget v2, p0, Lcom/whoop/service/push/notifications/m$b;->F:I

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v0, v1, v3}, Lcom/whoop/service/push/notifications/m;->B(Lcom/whoop/service/push/notifications/m;Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    new-instance v0, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v0}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m$b;->I:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "setDeleteIntent(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/service/push/notifications/m;->P:Lcom/whoop/service/push/notifications/m$a;

    invoke-virtual {v0}, Lcom/whoop/service/push/notifications/m$a;->a()Lc12/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m$b;->x:Lcom/whoop/service/push/notifications/m;

    iget v2, p0, Lcom/whoop/service/push/notifications/m$b;->F:I

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    const-string p1, "build(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/whoop/service/push/notifications/m$b;->z:Landroid/content/Context;

    iget-object v5, p0, Lcom/whoop/service/push/notifications/m$b;->G:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/service/push/notifications/m$b;->H:Ljava/lang/String;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
