.class final Lcom/whoop/service/push/notifications/l$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/push/notifications/l;->a(Lm92/f;Landroid/content/Context;)V
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
    c = "com.whoop.service.push.notifications.TeamChatNotification$perform$1"
    f = "TeamChatNotification.kt"
    l = {
        0x45
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Landroid/content/Context;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:I

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Ljava/lang/String;

.field final synthetic K:Lm92/f;

.field w:Z

.field x:I

.field final synthetic y:Lcom/whoop/service/push/notifications/l;

.field final synthetic z:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/whoop/service/push/notifications/l;Ljava/lang/Integer;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lm92/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/push/notifications/l;",
            "Ljava/lang/Integer;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lm92/f;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/push/notifications/l$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    iput-object p2, p0, Lcom/whoop/service/push/notifications/l$b;->z:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    iput-object p4, p0, Lcom/whoop/service/push/notifications/l$b;->F:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/service/push/notifications/l$b;->G:Ljava/lang/String;

    iput p6, p0, Lcom/whoop/service/push/notifications/l$b;->H:I

    iput-object p7, p0, Lcom/whoop/service/push/notifications/l$b;->I:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/service/push/notifications/l$b;->J:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/service/push/notifications/l$b;->K:Lm92/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11
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

    new-instance v0, Lcom/whoop/service/push/notifications/l$b;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    iget-object v2, p0, Lcom/whoop/service/push/notifications/l$b;->z:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    iget-object v4, p0, Lcom/whoop/service/push/notifications/l$b;->F:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/service/push/notifications/l$b;->G:Ljava/lang/String;

    iget v6, p0, Lcom/whoop/service/push/notifications/l$b;->H:I

    iget-object v7, p0, Lcom/whoop/service/push/notifications/l$b;->I:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/service/push/notifications/l$b;->J:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/service/push/notifications/l$b;->K:Lm92/f;

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/whoop/service/push/notifications/l$b;-><init>(Lcom/whoop/service/push/notifications/l;Ljava/lang/Integer;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lm92/f;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/push/notifications/l$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/push/notifications/l$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/service/push/notifications/l$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/push/notifications/l$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/service/push/notifications/l$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lcom/whoop/service/push/notifications/l$b;->w:Z

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/l;->B(Lcom/whoop/service/push/notifications/l;)Lyp0/a;

    move-result-object p1

    invoke-interface {p1}, Lyp0/a;->a()Z

    move-result p1

    iget-object v1, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->z:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput-boolean p1, p0, Lcom/whoop/service/push/notifications/l$b;->w:Z

    iput v2, p0, Lcom/whoop/service/push/notifications/l$b;->x:I

    invoke-static {v1, v3, p0}, Lcom/whoop/service/push/notifications/l;->G(Lcom/whoop/service/push/notifications/l;ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget-object p1, Ld92/b;->a:Ld92/b;

    iget-object v2, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    invoke-static {v2, v3}, Lcom/whoop/service/push/notifications/l;->z(Lcom/whoop/service/push/notifications/l;Landroid/content/Context;)Leb/j0;

    move-result-object v2

    invoke-virtual {p1, v2}, Ld92/b;->b(Leb/j0;)Landroid/app/PendingIntent;

    move-result-object p1

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    iget-object v4, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    invoke-static {v3, v4}, Lcom/whoop/service/push/notifications/l;->z(Lcom/whoop/service/push/notifications/l;Landroid/content/Context;)Leb/j0;

    move-result-object v3

    sget v4, Lxp0/a0;->G0:I

    invoke-static {v3, v4}, Leb/j0;->f(Leb/j0;I)V

    new-instance v4, Lxp0/f$a;

    const-string v5, "DAILY"

    invoke-direct {v4, v2, v5}, Lxp0/f$a;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, p1}, Lxp0/f$a;->d(Lcom/whoop/domain/model/teams/Team;)Lxp0/f$a;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/service/push/notifications/l$b;->F:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lxp0/f$a;->b(Ljava/lang/String;)Lxp0/f$a;

    move-result-object p1

    invoke-virtual {p1}, Lxp0/f$a;->a()Lxp0/f;

    move-result-object p1

    invoke-virtual {p1}, Lxp0/f;->j()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v3, p1}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v3}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v1

    :goto_1
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/l;->F(Lcom/whoop/service/push/notifications/l;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lcom/whoop/service/push/notifications/l$b$a;

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->K:Lm92/f;

    iget-object v4, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    invoke-direct {v0, v3, v4, v1}, Lcom/whoop/service/push/notifications/l$b$a;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/l;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {p1, v1, v1, v0, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v2

    :cond_5
    sget-object v4, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    iget-object v5, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    iget-object v6, p0, Lcom/whoop/service/push/notifications/l$b;->G:Ljava/lang/String;

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/high16 v7, 0x8000000

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object v1

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    iget-object v4, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    iget v5, p0, Lcom/whoop/service/push/notifications/l$b;->H:I

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v3, v4, v6}, Lcom/whoop/service/push/notifications/l;->A(Lcom/whoop/service/push/notifications/l;Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->I:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->J:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    new-instance v3, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v3}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    iget-object v4, p0, Lcom/whoop/service/push/notifications/l$b;->I:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/service/push/notifications/l$b;->J:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v1, "setDeleteIntent(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/service/push/notifications/l;->E()Lc12/d;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    iget-object v3, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v5

    const-string p1, "build(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/whoop/service/push/notifications/l$b;->I:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/service/push/notifications/l$b;->J:Ljava/lang/String;

    const/16 v4, 0x66

    invoke-static/range {v3 .. v9}, Lcom/whoop/service/push/notifications/l;->H(Lcom/whoop/service/push/notifications/l;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_6

    iget-object p1, p0, Lcom/whoop/service/push/notifications/l$b;->y:Lcom/whoop/service/push/notifications/l;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/l;->C(Lcom/whoop/service/push/notifications/l;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v0, "android-remove-team-chat-implicit-broadcast"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/whoop/service/push/notifications/l$b;->E:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "teamChatIntent"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_6
    return-object v2
.end method
