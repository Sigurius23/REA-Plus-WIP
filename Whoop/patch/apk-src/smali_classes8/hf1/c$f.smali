.class final Lhf1/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhf1/c;->e(Lhf1/a;ZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.experiments.ExperimentsRepository$getVariantFor$response$1"
    f = "ExperimentsRepository.kt"
    l = {
        0x20,
        0x22
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Z

.field final synthetic y:Lhf1/c;

.field final synthetic z:Lhf1/a;


# direct methods
.method public constructor <init>(ZLhf1/c;Lhf1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lhf1/c;",
            "Lhf1/a;",
            "Lq83/d<",
            "-",
            "Lhf1/c$f;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lhf1/c$f;->x:Z

    iput-object p2, p0, Lhf1/c$f;->y:Lhf1/c;

    iput-object p3, p0, Lhf1/c$f;->z:Lhf1/a;

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

    new-instance v0, Lhf1/c$f;

    iget-boolean v1, p0, Lhf1/c$f;->x:Z

    iget-object v2, p0, Lhf1/c$f;->y:Lhf1/c;

    iget-object v3, p0, Lhf1/c$f;->z:Lhf1/a;

    invoke-direct {v0, v1, v2, v3, p1}, Lhf1/c$f;-><init>(ZLhf1/c;Lhf1/a;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lhf1/c$f;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lpg3/v0<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lhf1/c$f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhf1/c$f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lhf1/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lhf1/c$f;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lhf1/c$f;->x:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lhf1/c$f;->y:Lhf1/c;

    invoke-static {p1}, Lhf1/c;->h(Lhf1/c;)Lcom/whoop/experiments/api/ExperimentsAuthApi;

    move-result-object v4

    iget-object p1, p0, Lhf1/c$f;->z:Lhf1/a;

    invoke-interface {p1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v5

    iput v3, p0, Lhf1/c$f;->w:I

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v4 .. v9}, Lcom/whoop/experiments/api/ExperimentsAuthApi;->a(Lcom/whoop/experiments/api/ExperimentsAuthApi;Ljava/lang/String;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, v7

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_4
    move-object v4, p0

    iget-object p1, v4, Lhf1/c$f;->y:Lhf1/c;

    invoke-static {p1}, Lhf1/c;->g(Lhf1/c;)Lcom/whoop/experiments/api/ExperimentsApi;

    move-result-object v1

    iget-object p1, v4, Lhf1/c$f;->z:Lhf1/a;

    invoke-interface {p1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object p1

    iput v2, v4, Lhf1/c$f;->w:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/whoop/experiments/api/ExperimentsApi;->a(Lcom/whoop/experiments/api/ExperimentsApi;Ljava/lang/String;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lpg3/v0;

    return-object p1
.end method
