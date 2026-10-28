.class final Lvk0/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk0/h;->h(Ljava/lang/String;ZJJLst0/v;)V
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
    c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackCommandResponseFromStrap$1"
    f = "CrpDataDogMetrics.kt"
    l = {
        0x54,
        0x5b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Lvk0/h;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Lst0/v;

.field final synthetic I:J

.field final synthetic J:J

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(ZLvk0/h;Ljava/lang/String;Lst0/v;JJLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lvk0/h;",
            "Ljava/lang/String;",
            "Lst0/v;",
            "JJ",
            "Lq83/d<",
            "-",
            "Lvk0/h$c;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lvk0/h$c;->E:Z

    iput-object p2, p0, Lvk0/h$c;->F:Lvk0/h;

    iput-object p3, p0, Lvk0/h$c;->G:Ljava/lang/String;

    iput-object p4, p0, Lvk0/h$c;->H:Lst0/v;

    iput-wide p5, p0, Lvk0/h$c;->I:J

    iput-wide p7, p0, Lvk0/h$c;->J:J

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

    new-instance v0, Lvk0/h$c;

    iget-boolean v1, p0, Lvk0/h$c;->E:Z

    iget-object v2, p0, Lvk0/h$c;->F:Lvk0/h;

    iget-object v3, p0, Lvk0/h$c;->G:Ljava/lang/String;

    iget-object v4, p0, Lvk0/h$c;->H:Lst0/v;

    iget-wide v5, p0, Lvk0/h$c;->I:J

    iget-wide v7, p0, Lvk0/h$c;->J:J

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lvk0/h$c;-><init>(ZLvk0/h;Ljava/lang/String;Lst0/v;JJLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvk0/h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk0/h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvk0/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvk0/h$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvk0/h$c;->z:I

    const-string v2, "command_name:"

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lvk0/h$c;->y:Ljava/lang/Object;

    check-cast v0, Ljy1/a;

    iget-object v0, p0, Lvk0/h$c;->x:Ljava/lang/Object;

    check-cast v0, Ljy1/a;

    iget-object v0, p0, Lvk0/h$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lvk0/h$c;->x:Ljava/lang/Object;

    check-cast v1, Ljy1/a;

    iget-object v1, p0, Lvk0/h$c;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lvk0/h$c;->E:Z

    if-eqz p1, :cond_3

    const-string p1, "success"

    goto :goto_0

    :cond_3
    const-string p1, "fail"

    :goto_0
    new-instance v6, Ljy1/a;

    iget-object v1, p0, Lvk0/h$c;->F:Lvk0/h;

    iget-object v7, p0, Lvk0/h$c;->G:Ljava/lang/String;

    invoke-static {v2, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "response:"

    invoke-virtual {v8, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v7, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v7, p0, Lvk0/h$c;->H:Lst0/v;

    invoke-static {v1, p1, v7}, Lvk0/h;->a(Lvk0/h;Ljava/util/List;Lst0/v;)Ljava/util/List;

    move-result-object v10

    const/16 v12, 0x11

    const/4 v13, 0x0

    const/4 v7, 0x0

    const-string v8, "connectivity.crp.command_executed"

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lvk0/h$c;->F:Lvk0/h;

    invoke-static {p1}, Lvk0/h;->c(Lvk0/h;)Liy1/c;

    move-result-object p1

    iput-object v5, p0, Lvk0/h$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lvk0/h$c;->x:Ljava/lang/Object;

    iput v4, p0, Lvk0/h$c;->z:I

    invoke-interface {p1, v6, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    new-instance v6, Ljy1/a;

    iget-wide v7, p0, Lvk0/h$c;->I:J

    iget-wide v9, p0, Lvk0/h$c;->J:J

    sub-long/2addr v7, v9

    long-to-double v7, v7

    new-instance v9, Ljava/lang/Double;

    invoke-direct {v9, v7, v8}, Ljava/lang/Double;-><init>(D)V

    iget-object p1, p0, Lvk0/h$c;->F:Lvk0/h;

    iget-object v1, p0, Lvk0/h$c;->G:Ljava/lang/String;

    invoke-static {v2, v1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lvk0/h$c;->H:Lst0/v;

    invoke-static {p1, v1, v2}, Lvk0/h;->a(Lvk0/h;Ljava/util/List;Lst0/v;)Ljava/util/List;

    move-result-object v10

    const/16 v12, 0x11

    const/4 v13, 0x0

    const/4 v7, 0x0

    const-string v8, "connectivity.crp.strap_execution_time"

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lvk0/h$c;->F:Lvk0/h;

    invoke-static {p1}, Lvk0/h;->c(Lvk0/h;)Liy1/c;

    move-result-object p1

    iput-object v5, p0, Lvk0/h$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lvk0/h$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lvk0/h$c;->y:Ljava/lang/Object;

    iput v3, p0, Lvk0/h$c;->z:I

    invoke-interface {p1, v6, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
