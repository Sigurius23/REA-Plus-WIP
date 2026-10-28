.class final Lvk0/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk0/h;->g(Ljava/lang/String;Lst0/v;)V
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
    c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackCommandAddedToQueue$1"
    f = "CrpDataDogMetrics.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lst0/v;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lvk0/h;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvk0/h;Ljava/lang/String;Lst0/v;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/h;",
            "Ljava/lang/String;",
            "Lst0/v;",
            "Lq83/d<",
            "-",
            "Lvk0/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvk0/h$b;->y:Lvk0/h;

    iput-object p2, p0, Lvk0/h$b;->z:Ljava/lang/String;

    iput-object p3, p0, Lvk0/h$b;->E:Lst0/v;

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

    new-instance p1, Lvk0/h$b;

    iget-object v0, p0, Lvk0/h$b;->y:Lvk0/h;

    iget-object v1, p0, Lvk0/h$b;->z:Ljava/lang/String;

    iget-object v2, p0, Lvk0/h$b;->E:Lst0/v;

    invoke-direct {p1, v0, v1, v2, p2}, Lvk0/h$b;-><init>(Lvk0/h;Ljava/lang/String;Lst0/v;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvk0/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk0/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvk0/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvk0/h$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvk0/h$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lvk0/h$b;->w:Ljava/lang/Object;

    check-cast v0, Ljy1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Ljy1/a;

    iget-object p1, p0, Lvk0/h$b;->y:Lvk0/h;

    iget-object v1, p0, Lvk0/h$b;->z:Ljava/lang/String;

    const-string v4, "command_name:"

    invoke-static {v4, v1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iget-object v4, p0, Lvk0/h$b;->E:Lst0/v;

    invoke-static {p1, v1, v4}, Lvk0/h;->a(Lvk0/h;Ljava/util/List;Lst0/v;)Ljava/util/List;

    move-result-object v7

    const/16 v9, 0x11

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "connectivity.crp.command_added_to_queue"

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lvk0/h$b;->y:Lvk0/h;

    invoke-static {p1}, Lvk0/h;->c(Lvk0/h;)Liy1/c;

    move-result-object p1

    const/4 v1, 0x0

    iput-object v1, p0, Lvk0/h$b;->w:Ljava/lang/Object;

    iput v2, p0, Lvk0/h$b;->x:I

    invoke-interface {p1, v3, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
