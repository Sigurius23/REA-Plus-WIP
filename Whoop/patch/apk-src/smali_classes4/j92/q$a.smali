.class final Lj92/q$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj92/q;->e(Lud3/x0;Lud3/o0;)V
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
    c = "com.whoop.service.network.interceptor.ResponseMetricsLoggerInterceptor$insertApiResponseToMetrics$1"
    f = "ResponseMetricsLoggerInterceptor.kt"
    l = {
        0x2c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lj92/q;

.field final synthetic F:Lud3/o0;

.field final synthetic G:Lud3/x0;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lj92/q;Lud3/o0;Lud3/x0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj92/q;",
            "Lud3/o0;",
            "Lud3/x0;",
            "Lq83/d<",
            "-",
            "Lj92/q$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj92/q$a;->E:Lj92/q;

    iput-object p2, p0, Lj92/q$a;->F:Lud3/o0;

    iput-object p3, p0, Lj92/q$a;->G:Lud3/x0;

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

    new-instance p1, Lj92/q$a;

    iget-object v0, p0, Lj92/q$a;->E:Lj92/q;

    iget-object v1, p0, Lj92/q$a;->F:Lud3/o0;

    iget-object v2, p0, Lj92/q$a;->G:Lud3/x0;

    invoke-direct {p1, v0, v1, v2, p2}, Lj92/q$a;-><init>(Lj92/q;Lud3/o0;Lud3/x0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lj92/q$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj92/q$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj92/q$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj92/q$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "http_method_name:"

    const-string v2, "http_status_code:"

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lj92/q$a;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v6, :cond_0

    iget-object v0, v1, Lj92/q$a;->x:Ljava/lang/Object;

    check-cast v0, Ljy1/a;

    iget-object v0, v1, Lj92/q$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v4, v1, Lj92/q$a;->E:Lj92/q;

    iget-object v7, v1, Lj92/q$a;->F:Lud3/o0;

    invoke-static {v4, v7}, Lj92/q;->c(Lj92/q;Lud3/o0;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v7, v1, Lj92/q$a;->G:Lud3/x0;

    iget-object v8, v1, Lj92/q$a;->E:Lj92/q;

    new-instance v9, Ljy1/a;

    const-string v11, "whoop.api.status_code"

    iget v7, v7, Lud3/x0;->z:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lj92/q;->b(Lj92/q;)Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liy1/c;

    const/4 v2, 0x0

    iput-object v2, v1, Lj92/q$a;->w:Ljava/lang/Object;

    iput-object v2, v1, Lj92/q$a;->x:Ljava/lang/Object;

    iput v5, v1, Lj92/q$a;->y:I

    iput v6, v1, Lj92/q$a;->z:I

    invoke-interface {v0, v9, v1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v3, :cond_2

    return-object v3

    :goto_0
    iget-object v2, v1, Lj92/q$a;->E:Lj92/q;

    invoke-static {v2}, Lj92/q;->a(Lj92/q;)Ltr2/n;

    move-result-object v2

    const-string v3, "Failed to insert api metrics to db"

    new-array v4, v5, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_2
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
