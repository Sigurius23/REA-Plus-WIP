.class final Lvk0/h$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk0/h;->l(Ljava/lang/String;ZLst0/v;)V
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
    c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackService$1"
    f = "CrpDataDogMetrics.kt"
    l = {
        0x84
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lst0/v;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Z

.field final synthetic z:Lvk0/h;


# direct methods
.method public constructor <init>(ZLvk0/h;Ljava/lang/String;Lst0/v;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lvk0/h;",
            "Ljava/lang/String;",
            "Lst0/v;",
            "Lq83/d<",
            "-",
            "Lvk0/h$g;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lvk0/h$g;->y:Z

    iput-object p2, p0, Lvk0/h$g;->z:Lvk0/h;

    iput-object p3, p0, Lvk0/h$g;->E:Ljava/lang/String;

    iput-object p4, p0, Lvk0/h$g;->F:Lst0/v;

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

    new-instance v0, Lvk0/h$g;

    iget-boolean v1, p0, Lvk0/h$g;->y:Z

    iget-object v2, p0, Lvk0/h$g;->z:Lvk0/h;

    iget-object v3, p0, Lvk0/h$g;->E:Ljava/lang/String;

    iget-object v4, p0, Lvk0/h$g;->F:Lst0/v;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lvk0/h$g;-><init>(ZLvk0/h;Ljava/lang/String;Lst0/v;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvk0/h$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk0/h$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvk0/h$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvk0/h$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvk0/h$g;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lvk0/h$g;->w:Ljava/lang/Object;

    check-cast v0, Ljy1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lvk0/h$g;->y:Z

    const-string v1, "service_name:"

    if-eqz p1, :cond_2

    new-instance v3, Ljy1/a;

    iget-object p1, p0, Lvk0/h$g;->z:Lvk0/h;

    iget-object v4, p0, Lvk0/h$g;->E:Ljava/lang/String;

    invoke-static {v1, v4}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iget-object v4, p0, Lvk0/h$g;->F:Lst0/v;

    invoke-static {p1, v1, v4}, Lvk0/h;->a(Lvk0/h;Ljava/util/List;Lst0/v;)Ljava/util/List;

    move-result-object v7

    const/16 v9, 0x11

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "connectivity.crp.service_block"

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    new-instance v4, Ljy1/a;

    iget-object p1, p0, Lvk0/h$g;->z:Lvk0/h;

    iget-object v3, p0, Lvk0/h$g;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iget-object v3, p0, Lvk0/h$g;->F:Lst0/v;

    invoke-static {p1, v1, v3}, Lvk0/h;->a(Lvk0/h;Ljava/util/List;Lst0/v;)Ljava/util/List;

    move-result-object v8

    const/16 v10, 0x11

    const/4 v11, 0x0

    const/4 v5, 0x0

    const-string v6, "connectivity.crp.service_unblock"

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v4

    :goto_0
    iget-object p1, p0, Lvk0/h$g;->z:Lvk0/h;

    invoke-static {p1}, Lvk0/h;->c(Lvk0/h;)Liy1/c;

    move-result-object p1

    const/4 v1, 0x0

    iput-object v1, p0, Lvk0/h$g;->w:Ljava/lang/Object;

    iput v2, p0, Lvk0/h$g;->x:I

    invoke-interface {p1, v3, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
