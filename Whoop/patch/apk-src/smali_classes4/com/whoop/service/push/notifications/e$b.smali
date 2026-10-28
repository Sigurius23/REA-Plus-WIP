.class final Lcom/whoop/service/push/notifications/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/push/notifications/e;->onCreate(Landroidx/lifecycle/g0;)V
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
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "detected",
        "Ll83/a0;",
        "<anonymous>",
        "(Z)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.push.notifications.DorsetDetectedNotification$onCreate$1"
    f = "DorsetDetectedNotification.kt"
    l = {
        0x41,
        0x4b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:J

.field x:I

.field synthetic y:Z

.field final synthetic z:Lcom/whoop/service/push/notifications/e;


# direct methods
.method public constructor <init>(Lcom/whoop/service/push/notifications/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/push/notifications/e;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/push/notifications/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lcom/whoop/service/push/notifications/e$b;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-direct {v0, v1, p2}, Lcom/whoop/service/push/notifications/e$b;-><init>(Lcom/whoop/service/push/notifications/e;Lq83/d;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lcom/whoop/service/push/notifications/e$b;->y:Z

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/push/notifications/e$b;->invoke(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/push/notifications/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/push/notifications/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/service/push/notifications/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-boolean v0, p0, Lcom/whoop/service/push/notifications/e$b;->y:Z

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/service/push/notifications/e$b;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-wide v5, p0, Lcom/whoop/service/push/notifications/e$b;->w:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

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

    if-eqz v0, :cond_7

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/e;->c(Lcom/whoop/service/push/notifications/e;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v2, "droid-dorset-detection-notification"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    iput-boolean v0, p0, Lcom/whoop/service/push/notifications/e$b;->y:Z

    iput v5, p0, Lcom/whoop/service/push/notifications/e$b;->x:I

    invoke-static {p1, p0}, Lcom/whoop/service/push/notifications/e;->g(Lcom/whoop/service/push/notifications/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/e;->d(Lcom/whoop/service/push/notifications/e;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Session started within cool-off period \u2014 suppressing notifications."

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_4
    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-virtual {p1}, Lcom/whoop/service/push/notifications/e;->j()V

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/e;->a(Lcom/whoop/service/push/notifications/e;)Luu0/a;

    move-result-object p1

    sget-object v2, Luu0/a$b;->INITIAL:Luu0/a$b;

    invoke-virtual {p1, v2}, Luu0/a;->a(Luu0/a$b;)V

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/e;->b(Lcom/whoop/service/push/notifications/e;)Ljava/time/Clock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    invoke-static {}, Lcom/whoop/service/push/notifications/e;->f()J

    move-result-wide v7

    invoke-static {v7, v8}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v7

    add-long/2addr v7, v5

    move-wide v5, v7

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/e;->b(Lcom/whoop/service/push/notifications/e;)Ljava/time/Clock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide v7

    cmp-long p1, v7, v5

    if-gez p1, :cond_6

    invoke-static {}, Lcom/whoop/service/push/notifications/e;->e()J

    move-result-wide v7

    iput-boolean v0, p0, Lcom/whoop/service/push/notifications/e$b;->y:Z

    iput-wide v5, p0, Lcom/whoop/service/push/notifications/e$b;->w:J

    iput v4, p0, Lcom/whoop/service/push/notifications/e$b;->x:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_6
    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-virtual {p1}, Lcom/whoop/service/push/notifications/e;->j()V

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e$b;->z:Lcom/whoop/service/push/notifications/e;

    invoke-static {p1}, Lcom/whoop/service/push/notifications/e;->a(Lcom/whoop/service/push/notifications/e;)Luu0/a;

    move-result-object p1

    sget-object v0, Luu0/a$b;->REMINDER:Luu0/a$b;

    invoke-virtual {p1, v0}, Luu0/a;->a(Luu0/a$b;)V

    :cond_7
    return-object v3
.end method
