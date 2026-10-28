.class final Loo1/k$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/k;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Loo1/j;",
        "acc",
        "Loo1/i;",
        "domainAction",
        "<anonymous>",
        "(Loo1/j;Loo1/i;)Loo1/j;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.PhaseCoachingInteractor$interact$1"
    f = "PhaseCoachingInteractor.kt"
    l = {
        0x13,
        0x18
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Loo1/k;


# direct methods
.method public constructor <init>(Loo1/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/k;",
            "Lq83/d<",
            "-",
            "Loo1/k$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/k$c;->z:Loo1/k;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Loo1/j;Loo1/i;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/j;",
            "Loo1/i;",
            "Lq83/d<",
            "-",
            "Loo1/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Loo1/k$c;

    iget-object v1, p0, Loo1/k$c;->z:Loo1/k;

    invoke-direct {v0, v1, p3}, Loo1/k$c;-><init>(Loo1/k;Lq83/d;)V

    iput-object p1, v0, Loo1/k$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Loo1/k$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Loo1/k$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loo1/j;

    check-cast p2, Loo1/i;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Loo1/k$c;->f(Loo1/j;Loo1/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Loo1/k$c;->x:Ljava/lang/Object;

    check-cast v0, Loo1/j;

    iget-object v1, p0, Loo1/k$c;->y:Ljava/lang/Object;

    check-cast v1, Loo1/i;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Loo1/k$c;->w:I

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

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

    instance-of p1, v1, Loo1/i$a;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Loo1/k$c;->z:Loo1/k;

    check-cast v1, Loo1/i$a;

    invoke-virtual {v1}, Loo1/i$a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v3, p0, Loo1/k$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Loo1/k$c;->y:Ljava/lang/Object;

    iput v4, p0, Loo1/k$c;->w:I

    invoke-static {p1, v0, p0}, Loo1/k;->c(Loo1/k;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Loo1/j;

    return-object p1

    :cond_4
    instance-of p1, v1, Loo1/i$b;

    if-eqz p1, :cond_8

    instance-of p1, v0, Loo1/j$c;

    if-eqz p1, :cond_5

    check-cast v0, Loo1/j$c;

    goto :goto_1

    :cond_5
    move-object v0, v3

    :goto_1
    if-eqz v0, :cond_6

    move-object p1, v1

    check-cast p1, Loo1/i$b;

    invoke-virtual {p1}, Loo1/i$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v3, v5, v3}, Loo1/j$c;->b(Loo1/j$c;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;ILjava/lang/Object;)Loo1/j$c;

    move-result-object p1

    if-eqz p1, :cond_6

    return-object p1

    :cond_6
    iget-object p1, p0, Loo1/k$c;->z:Loo1/k;

    check-cast v1, Loo1/i$b;

    invoke-virtual {v1}, Loo1/i$b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v3, p0, Loo1/k$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Loo1/k$c;->y:Ljava/lang/Object;

    iput v5, p0, Loo1/k$c;->w:I

    invoke-static {p1, v0, p0}, Loo1/k;->c(Loo1/k;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    :goto_3
    check-cast p1, Loo1/j;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
