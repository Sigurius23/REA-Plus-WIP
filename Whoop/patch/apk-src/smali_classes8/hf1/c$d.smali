.class final Lhf1/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhf1/c;->a(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.experiments.ExperimentsRepository$getVariant$response$1"
    f = "ExperimentsRepository.kt"
    l = {
        0x50,
        0x55
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lhf1/c;

.field final synthetic z:Lhf1/a;


# direct methods
.method public constructor <init>(ZLhf1/c;Lhf1/a;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lhf1/c;",
            "Lhf1/a;",
            "Z",
            "Lq83/d<",
            "-",
            "Lhf1/c$d;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lhf1/c$d;->x:Z

    iput-object p2, p0, Lhf1/c$d;->y:Lhf1/c;

    iput-object p3, p0, Lhf1/c$d;->z:Lhf1/a;

    iput-boolean p4, p0, Lhf1/c$d;->E:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lhf1/c$d;

    iget-boolean v1, p0, Lhf1/c$d;->x:Z

    iget-object v2, p0, Lhf1/c$d;->y:Lhf1/c;

    iget-object v3, p0, Lhf1/c$d;->z:Lhf1/a;

    iget-boolean v4, p0, Lhf1/c$d;->E:Z

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lhf1/c$d;-><init>(ZLhf1/c;Lhf1/a;ZLq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lhf1/c$d;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lhf1/c$d;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhf1/c$d;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lhf1/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lhf1/c$d;->w:I

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

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lhf1/c$d;->x:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lhf1/c$d;->y:Lhf1/c;

    invoke-static {p1}, Lhf1/c;->h(Lhf1/c;)Lcom/whoop/experiments/api/ExperimentsAuthApi;

    move-result-object p1

    iget-object v1, p0, Lhf1/c$d;->z:Lhf1/a;

    invoke-interface {v1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lhf1/c$d;->E:Z

    xor-int/2addr v2, v3

    iput v3, p0, Lhf1/c$d;->w:I

    invoke-interface {p1, v1, v2, p0}, Lcom/whoop/experiments/api/ExperimentsAuthApi;->getUserVariantForExperiment(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_4
    iget-object p1, p0, Lhf1/c$d;->y:Lhf1/c;

    invoke-static {p1}, Lhf1/c;->g(Lhf1/c;)Lcom/whoop/experiments/api/ExperimentsApi;

    move-result-object p1

    iget-object v1, p0, Lhf1/c$d;->z:Lhf1/a;

    invoke-interface {v1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v1

    iget-boolean v4, p0, Lhf1/c$d;->E:Z

    xor-int/2addr v3, v4

    iput v2, p0, Lhf1/c$d;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/experiments/api/ExperimentsApi;->getVariantForExperiment(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lpg3/v0;

    return-object p1
.end method
