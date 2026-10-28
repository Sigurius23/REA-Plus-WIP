.class final Lo92/u$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo92/u;->a(Lm92/f;Landroid/content/Context;)V
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
    c = "com.whoop.service.push.notifications.RecoveryProcessedPushNotification$perform$1"
    f = "RecoveryProcessedPushNotification.kt"
    l = {
        0x33
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lo92/u;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lm92/f;


# direct methods
.method public constructor <init>(Lm92/f;Lo92/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm92/f;",
            "Lo92/u;",
            "Lq83/d<",
            "-",
            "Lo92/u$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo92/u$b;->z:Lm92/f;

    iput-object p2, p0, Lo92/u$b;->E:Lo92/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lo92/u$b;

    iget-object v0, p0, Lo92/u$b;->z:Lm92/f;

    iget-object v1, p0, Lo92/u$b;->E:Lo92/u;

    invoke-direct {p1, v0, v1, p2}, Lo92/u$b;-><init>(Lm92/f;Lo92/u;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lo92/u$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo92/u$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo92/u$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo92/u$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lo92/u$b;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lo92/u$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lo92/u$b;->z:Lm92/f;

    invoke-virtual {p1}, Lm92/f;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lo92/u$b;->E:Lo92/u;

    invoke-static {v1}, Lo92/u;->z(Lo92/u;)Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object v1

    sget-object v3, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;->FailedToOpen:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    const/4 v4, 0x0

    iput-object v4, p0, Lo92/u$b;->w:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lo92/u$b;->x:I

    iput v2, p0, Lo92/u$b;->y:I

    invoke-virtual {v1, v3, p1, p0}, Lcom/whoop/data/repositories/NotificationRepository;->sendPushNotificationMetric(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
