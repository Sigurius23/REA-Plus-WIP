.class final Llj0/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj0/h;->j(Ljava/lang/String;Lst0/v;Ljava/util/List;)V
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
    c = "com.whoop.ble.analytics.PacketParsingAnalyticsHelper$insertMetric$1"
    f = "PacketParsingAnalyticsHelper.kt"
    l = {
        0x30
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Llj0/h;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lst0/v;


# direct methods
.method public constructor <init>(Llj0/h;Ljava/lang/String;Lst0/v;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llj0/h;",
            "Ljava/lang/String;",
            "Lst0/v;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Llj0/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llj0/h$b;->x:Llj0/h;

    iput-object p2, p0, Llj0/h$b;->y:Ljava/lang/String;

    iput-object p3, p0, Llj0/h$b;->z:Lst0/v;

    iput-object p4, p0, Llj0/h$b;->E:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Llj0/h$b;

    iget-object v1, p0, Llj0/h$b;->x:Llj0/h;

    iget-object v2, p0, Llj0/h$b;->y:Ljava/lang/String;

    iget-object v3, p0, Llj0/h$b;->z:Lst0/v;

    iget-object v4, p0, Llj0/h$b;->E:Ljava/util/List;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llj0/h$b;-><init>(Llj0/h;Ljava/lang/String;Lst0/v;Ljava/util/List;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llj0/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llj0/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llj0/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llj0/h$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llj0/h$b;->w:I

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

    iget-object p1, p0, Llj0/h$b;->x:Llj0/h;

    invoke-static {p1}, Llj0/h;->g(Llj0/h;)Liy1/c;

    move-result-object p1

    new-instance v3, Ljy1/a;

    iget-object v1, p0, Llj0/h$b;->y:Ljava/lang/String;

    const-string v4, "connectivity.ble.packet_parsing."

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Llj0/h$b;->z:Lst0/v;

    invoke-virtual {v1}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "whoop_device:"

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Llj0/h$b;->x:Llj0/h;

    invoke-static {v4}, Llj0/h;->f(Llj0/h;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "firmware_version:"

    invoke-static {v6, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Llj0/h$b;->x:Llj0/h;

    invoke-static {v6}, Llj0/h;->h(Llj0/h;)Lca2/h;

    move-result-object v6

    invoke-interface {v6}, Lca2/h;->c()Z

    move-result v6

    const-string v7, "is_raw_data_in_strap_or_app_backlog:"

    invoke-static {v7, v6}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v1, v4, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    iget-object v4, p0, Llj0/h$b;->E:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v7

    const/16 v9, 0x15

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v2, p0, Llj0/h$b;->w:I

    invoke-interface {p1, v3, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
