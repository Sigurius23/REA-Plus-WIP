.class final Lkj2/k$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k;->A(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lec3/l;",
        "Lkj2/c$b;",
        "<anonymous>",
        "(Lbc3/c0;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$sendSourceIdToNotificationService$2"
    f = "StressMonitorInteractor.kt"
    l = {
        0x12e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lkj2/k;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkj2/k;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/k;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lkj2/k$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/k$k;->x:Lkj2/k;

    iput-object p2, p0, Lkj2/k$k;->y:Ljava/lang/String;

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

    new-instance p1, Lkj2/k$k;

    iget-object v0, p0, Lkj2/k$k;->x:Lkj2/k;

    iget-object v1, p0, Lkj2/k$k;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lkj2/k$k;-><init>(Lkj2/k;Ljava/lang/String;Lq83/d;)V

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
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkj2/k$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/k$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkj2/k$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkj2/k$k;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkj2/k$k;->w:I

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

    iget-object p1, p0, Lkj2/k$k;->x:Lkj2/k;

    invoke-static {p1}, Lkj2/k;->h(Lkj2/k;)Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;->Opened:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    iget-object v3, p0, Lkj2/k$k;->y:Ljava/lang/String;

    iput v2, p0, Lkj2/k$k;->w:I

    invoke-virtual {p1, v1, v3, p0}, Lcom/whoop/data/repositories/NotificationRepository;->sendPushNotificationMetric(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lkj2/c$b;

    sget-object v0, Lnj2/l$d;->a:Lnj2/l$d;

    invoke-direct {p1, v0}, Lkj2/c$b;-><init>(Lnj2/l;)V

    new-instance v0, La6/u;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method
