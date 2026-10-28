.class final Lvk0/h$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk0/h;->m(Ljava/lang/String;JJLst0/v;)V
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
    c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackServiceExecutionTime$1"
    f = "CrpDataDogMetrics.kt"
    l = {
        0x90
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:Lvk0/h;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Lst0/v;

.field w:J

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:J


# direct methods
.method public constructor <init>(JJLvk0/h;Ljava/lang/String;Lst0/v;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lvk0/h;",
            "Ljava/lang/String;",
            "Lst0/v;",
            "Lq83/d<",
            "-",
            "Lvk0/h$h;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lvk0/h$h;->z:J

    iput-wide p3, p0, Lvk0/h$h;->E:J

    iput-object p5, p0, Lvk0/h$h;->F:Lvk0/h;

    iput-object p6, p0, Lvk0/h$h;->G:Ljava/lang/String;

    iput-object p7, p0, Lvk0/h$h;->H:Lst0/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lvk0/h$h;

    iget-wide v1, p0, Lvk0/h$h;->z:J

    iget-wide v3, p0, Lvk0/h$h;->E:J

    iget-object v5, p0, Lvk0/h$h;->F:Lvk0/h;

    iget-object v6, p0, Lvk0/h$h;->G:Ljava/lang/String;

    iget-object v7, p0, Lvk0/h$h;->H:Lst0/v;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lvk0/h$h;-><init>(JJLvk0/h;Ljava/lang/String;Lst0/v;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvk0/h$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk0/h$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvk0/h$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvk0/h$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvk0/h$h;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lvk0/h$h;->w:J

    iget-object v2, p0, Lvk0/h$h;->x:Ljava/lang/Object;

    check-cast v2, Ljy1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v3, p0, Lvk0/h$h;->z:J

    iget-wide v5, p0, Lvk0/h$h;->E:J

    sub-long/2addr v3, v5

    new-instance v5, Ljy1/a;

    long-to-double v6, v3

    new-instance v8, Ljava/lang/Double;

    invoke-direct {v8, v6, v7}, Ljava/lang/Double;-><init>(D)V

    iget-object p1, p0, Lvk0/h$h;->F:Lvk0/h;

    iget-object v1, p0, Lvk0/h$h;->G:Ljava/lang/String;

    const-string v6, "service_name:"

    invoke-static {v6, v1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iget-object v6, p0, Lvk0/h$h;->H:Lst0/v;

    invoke-static {p1, v1, v6}, Lvk0/h;->a(Lvk0/h;Ljava/util/List;Lst0/v;)Ljava/util/List;

    move-result-object v9

    const/16 v11, 0x11

    const/4 v12, 0x0

    const/4 v6, 0x0

    const-string v7, "connectivity.crp.service_execution_time"

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lvk0/h$h;->F:Lvk0/h;

    invoke-static {p1}, Lvk0/h;->c(Lvk0/h;)Liy1/c;

    move-result-object p1

    const/4 v1, 0x0

    iput-object v1, p0, Lvk0/h$h;->x:Ljava/lang/Object;

    iput-wide v3, p0, Lvk0/h$h;->w:J

    iput v2, p0, Lvk0/h$h;->y:I

    invoke-interface {p1, v5, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-wide v0, v3

    :goto_0
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 p1, 0xa

    sget-object v2, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    invoke-static {p1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_3

    iget-object p1, p0, Lvk0/h$h;->F:Lvk0/h;

    invoke-static {p1}, Lvk0/h;->b(Lvk0/h;)Ltr2/n;

    move-result-object p1

    iget-object v2, p0, Lvk0/h$h;->G:Ljava/lang/String;

    const-string v3, "Service "

    const-string v4, " took more than 10 minutes to complete: "

    invoke-static {v3, v2, v0, v1, v4}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
