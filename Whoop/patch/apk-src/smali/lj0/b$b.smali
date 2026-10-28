.class final Llj0/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj0/b;->c(Lus0/d;)V
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
    c = "com.whoop.ble.analytics.ConnectionAnalyticsHelper$sendToDataDog$1"
    f = "ConnectionAnalyticsHelper.kt"
    l = {
        0x73
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Llj0/b;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lus0/d;

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lus0/d;Ljava/util/List;Llj0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lus0/d;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llj0/b;",
            "Lq83/d<",
            "-",
            "Llj0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llj0/b$b;->y:Lus0/d;

    iput-object p2, p0, Llj0/b$b;->z:Ljava/util/List;

    iput-object p3, p0, Llj0/b$b;->E:Llj0/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Llj0/b$b;

    iget-object v0, p0, Llj0/b$b;->y:Lus0/d;

    iget-object v1, p0, Llj0/b$b;->z:Ljava/util/List;

    iget-object v2, p0, Llj0/b$b;->E:Llj0/b;

    invoke-direct {p1, v0, v1, v2, p2}, Llj0/b$b;-><init>(Lus0/d;Ljava/util/List;Llj0/b;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llj0/b$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llj0/b$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llj0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llj0/b$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llj0/b$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Llj0/b$b;->w:Ljava/lang/Object;

    check-cast v0, Ljy1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llj0/b$b;->y:Lus0/d;

    instance-of v1, p1, Lus0/d$a;

    const-string v3, "whoop_device:"

    if-eqz v1, :cond_2

    new-instance v4, Ljy1/a;

    check-cast p1, Lus0/d$a;

    invoke-virtual {p1}, Lus0/d$a;->c()Lst0/v;

    move-result-object p1

    invoke-virtual {p1}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v1, p0, Llj0/b$b;->z:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v8

    const/16 v10, 0x15

    const/4 v11, 0x0

    const/4 v5, 0x0

    const-string v6, "connectivity.app.ble.connection_attempt"

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_0

    :cond_2
    instance-of v1, p1, Lus0/d$d;

    if-eqz v1, :cond_4

    new-instance v4, Ljy1/a;

    check-cast p1, Lus0/d$d;

    invoke-virtual {p1}, Lus0/d$d;->b()Lus0/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lus0/d$b;->getValue()Ljava/lang/String;

    move-result-object p1

    const-string v1, "status:"

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Llj0/b$b;->y:Lus0/d;

    check-cast v1, Lus0/d$d;

    invoke-virtual {v1}, Lus0/d$d;->c()Lst0/v;

    move-result-object v1

    invoke-virtual {v1}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Llj0/b$b;->y:Lus0/d;

    check-cast v3, Lus0/d$d;

    invoke-virtual {v3}, Lus0/d$d;->a()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    const-string v3, ""

    :cond_3
    const-string v5, "error_msg:"

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1, v1, v3}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v1, p0, Llj0/b$b;->z:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v8

    const/16 v10, 0x15

    const/4 v11, 0x0

    const/4 v5, 0x0

    const-string v6, "connectivity.app.ble.connection_status"

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_4
    instance-of v1, p1, Lus0/d$e;

    if-eqz v1, :cond_6

    new-instance v4, Ljy1/a;

    check-cast p1, Lus0/d$e;

    invoke-virtual {p1}, Lus0/d$e;->c()Lst0/v;

    move-result-object p1

    invoke-virtual {p1}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v1, p0, Llj0/b$b;->z:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v8

    const/16 v10, 0x15

    const/4 v11, 0x0

    const/4 v5, 0x0

    const-string v6, "connectivity.app.ble.disconnected"

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    iget-object p1, p0, Llj0/b$b;->E:Llj0/b;

    invoke-static {p1}, Llj0/b;->b(Llj0/b;)Liy1/c;

    move-result-object p1

    const/4 v1, 0x0

    iput-object v1, p0, Llj0/b$b;->w:Ljava/lang/Object;

    iput v2, p0, Llj0/b$b;->x:I

    invoke-interface {p1, v4, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
