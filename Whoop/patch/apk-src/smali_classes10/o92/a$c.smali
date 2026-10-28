.class final Lo92/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo92/a;->a(Lm92/f;Landroid/content/Context;)V
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
    c = "com.whoop.service.push.notifications.ActivityProcessedPushNotification$perform$2"
    f = "ActivityProcessedPushNotification.kt"
    l = {
        0x40,
        0x4d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:Landroid/content/Context;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Lm92/f;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lo92/a;

.field final synthetic z:Landroidx/core/app/NotificationCompat$Builder;


# direct methods
.method public constructor <init>(Lo92/a;Landroidx/core/app/NotificationCompat$Builder;ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm92/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo92/a;",
            "Landroidx/core/app/NotificationCompat$Builder;",
            "I",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lm92/f;",
            "Lq83/d<",
            "-",
            "Lo92/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo92/a$c;->y:Lo92/a;

    iput-object p2, p0, Lo92/a$c;->z:Landroidx/core/app/NotificationCompat$Builder;

    iput p3, p0, Lo92/a$c;->E:I

    iput-object p4, p0, Lo92/a$c;->F:Landroid/content/Context;

    iput-object p5, p0, Lo92/a$c;->G:Ljava/lang/String;

    iput-object p6, p0, Lo92/a$c;->H:Ljava/lang/String;

    iput-object p7, p0, Lo92/a$c;->I:Ljava/lang/String;

    iput-object p8, p0, Lo92/a$c;->J:Lm92/f;

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

    new-instance v0, Lo92/a$c;

    iget-object v1, p0, Lo92/a$c;->y:Lo92/a;

    iget-object v2, p0, Lo92/a$c;->z:Landroidx/core/app/NotificationCompat$Builder;

    iget v3, p0, Lo92/a$c;->E:I

    iget-object v4, p0, Lo92/a$c;->F:Landroid/content/Context;

    iget-object v5, p0, Lo92/a$c;->G:Ljava/lang/String;

    iget-object v6, p0, Lo92/a$c;->H:Ljava/lang/String;

    iget-object v7, p0, Lo92/a$c;->I:Ljava/lang/String;

    iget-object v8, p0, Lo92/a$c;->J:Lm92/f;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lo92/a$c;-><init>(Lo92/a;Landroidx/core/app/NotificationCompat$Builder;ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm92/f;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lo92/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo92/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo92/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo92/a$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lo92/a$c;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lo92/a$c;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/PendingIntent;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lo92/a$c$b;

    iget-object v1, p0, Lo92/a$c;->y:Lo92/a;

    iget-object v5, p0, Lo92/a$c;->F:Landroid/content/Context;

    iget-object v6, p0, Lo92/a$c;->I:Ljava/lang/String;

    invoke-direct {p1, v1, v5, v6, v4}, Lo92/a$c$b;-><init>(Lo92/a;Landroid/content/Context;Ljava/lang/String;Lq83/d;)V

    iput v3, p0, Lo92/a$c;->x:I

    const-wide/16 v5, 0xbb8

    invoke-static {v5, v6, p1, p0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Landroid/app/PendingIntent;

    if-eqz p1, :cond_4

    iget-object v1, p0, Lo92/a$c;->y:Lo92/a;

    invoke-static {v1}, Lo92/a;->A(Lo92/a;)Ltr2/n;

    move-result-object v1

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    const-string v6, "got workout deep dive intent"

    invoke-interface {v1, v6, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lo92/a$c;->z:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lo92/a$c;->y:Lo92/a;

    invoke-static {p1}, Lo92/a;->C(Lo92/a;)Lbc3/c0;

    move-result-object p1

    new-instance v1, Lo92/a$c$a;

    iget-object v5, p0, Lo92/a$c;->J:Lm92/f;

    iget-object v6, p0, Lo92/a$c;->y:Lo92/a;

    invoke-direct {v1, v5, v6, v4}, Lo92/a$c$a;-><init>(Lm92/f;Lo92/a;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {p1, v4, v4, v1, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_1
    iget-object p1, p0, Lo92/a$c;->y:Lo92/a;

    invoke-static {p1}, Lo92/a;->D(Lo92/a;)Lwm0/a;

    move-result-object p1

    iput-object v4, p0, Lo92/a$c;->w:Ljava/lang/Object;

    iput v2, p0, Lo92/a$c;->x:I

    invoke-static {p1, v4, p0, v3, v4}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    iget-object v1, p0, Lo92/a$c;->y:Lo92/a;

    iget v2, p0, Lo92/a$c;->E:I

    iget-object p1, p0, Lo92/a$c;->z:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    const-string p1, "build(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lo92/a$c;->F:Landroid/content/Context;

    iget-object v5, p0, Lo92/a$c;->G:Ljava/lang/String;

    iget-object v6, p0, Lo92/a$c;->H:Ljava/lang/String;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
