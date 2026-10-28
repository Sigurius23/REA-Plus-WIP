.class final Lp82/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp82/b;->j(Lyh2/b;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/domain/model/MetricsProcessedTime;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sensorDataUpload.SensorDataUploadInteractor$uploadSensorData$response$1"
    f = "SensorDataUploadInteractor.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lp82/b;

.field final synthetic y:Lud3/v0;

.field final synthetic z:Lyh2/b;


# direct methods
.method public constructor <init>(Lp82/b;Lud3/v0;Lyh2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp82/b;",
            "Lud3/v0;",
            "Lyh2/b;",
            "Lq83/d<",
            "-",
            "Lp82/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp82/b$c;->x:Lp82/b;

    iput-object p2, p0, Lp82/b$c;->y:Lud3/v0;

    iput-object p3, p0, Lp82/b$c;->z:Lyh2/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lp82/b$c;

    iget-object v1, p0, Lp82/b$c;->x:Lp82/b;

    iget-object v2, p0, Lp82/b$c;->y:Lud3/v0;

    iget-object v3, p0, Lp82/b$c;->z:Lyh2/b;

    invoke-direct {v0, v1, v2, v3, p1}, Lp82/b$c;-><init>(Lp82/b;Lud3/v0;Lyh2/b;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lp82/b$c;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/MetricsProcessedTime;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lp82/b$c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp82/b$c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lp82/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp82/b$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp82/b$c;->x:Lp82/b;

    invoke-static {p1}, Lp82/b;->c(Lp82/b;)Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;

    move-result-object v3

    iget-object v4, p0, Lp82/b$c;->y:Lud3/v0;

    iget-object p1, p0, Lp82/b$c;->z:Lyh2/b;

    invoke-virtual {p1}, Lyh2/b;->b()Loh2/d;

    move-result-object p1

    invoke-virtual {p1}, Loh2/d;->f()Loh2/c;

    move-result-object p1

    invoke-virtual {p1}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lp82/b$c;->z:Lyh2/b;

    invoke-virtual {p1}, Lyh2/b;->b()Loh2/d;

    move-result-object p1

    invoke-virtual {p1}, Loh2/d;->e()Loh2/b;

    move-result-object p1

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, Lp82/b$c;->z:Lyh2/b;

    invoke-virtual {p1}, Lyh2/b;->b()Loh2/d;

    move-result-object p1

    invoke-virtual {p1}, Loh2/d;->g()Loh2/e;

    move-result-object p1

    invoke-virtual {p1}, Loh2/e;->f()Ljava/lang/String;

    move-result-object v8

    const-string p1, "toSemanticVersionString(...)"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lp82/b$c;->z:Lyh2/b;

    invoke-virtual {p1}, Lyh2/b;->b()Loh2/d;

    move-result-object p1

    invoke-virtual {p1}, Loh2/d;->h()Ljava/lang/String;

    move-result-object v9

    const-string p1, "getStrapId(...)"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lp82/b$c;->z:Lyh2/b;

    invoke-virtual {p1}, Lyh2/b;->b()Loh2/d;

    move-result-object p1

    invoke-virtual {p1}, Loh2/d;->d()B

    move-result v10

    iget-object p1, p0, Lp82/b$c;->z:Lyh2/b;

    invoke-virtual {p1}, Lyh2/b;->b()Loh2/d;

    move-result-object p1

    invoke-virtual {p1}, Loh2/d;->c()B

    move-result v11

    iput v2, p0, Lp82/b$c;->w:I

    const-string v5, "gzip"

    move-object v12, p0

    invoke-interface/range {v3 .. v12}, Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;->uploadMetricsData(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
