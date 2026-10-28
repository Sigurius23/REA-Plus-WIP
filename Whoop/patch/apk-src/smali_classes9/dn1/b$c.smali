.class final Ldn1/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldn1/b;->interact(Lec3/l;)Lec3/l;
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
        "Ldn1/c;",
        "currResult",
        "Ldn1/a;",
        "action",
        "<anonymous>",
        "(Ldn1/c;Ldn1/a;)Ldn1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.homecustomization.domain.CustomizeOverviewDomainInteractor$interact$1"
    f = "CustomizeOverviewDomainInteractor.kt"
    l = {
        0x15,
        0x1a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Ldn1/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ldn1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn1/b;",
            "Lq83/d<",
            "-",
            "Ldn1/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldn1/b$c;->G:Ldn1/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ldn1/c;Ldn1/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn1/c;",
            "Ldn1/a;",
            "Lq83/d<",
            "-",
            "Ldn1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldn1/b$c;

    iget-object v1, p0, Ldn1/b$c;->G:Ldn1/b;

    invoke-direct {v0, v1, p3}, Ldn1/b$c;-><init>(Ldn1/b;Lq83/d;)V

    iput-object p1, v0, Ldn1/b$c;->E:Ljava/lang/Object;

    iput-object p2, v0, Ldn1/b$c;->F:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldn1/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldn1/c;

    check-cast p2, Ldn1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldn1/b$c;->f(Ldn1/c;Ldn1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ldn1/b$c;->E:Ljava/lang/Object;

    check-cast v0, Ldn1/c;

    iget-object v1, p0, Ldn1/b$c;->F:Ljava/lang/Object;

    check-cast v1, Ldn1/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ldn1/b$c;->z:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, p0, Ldn1/b$c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    iget-object v1, p0, Ldn1/b$c;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

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

    instance-of p1, v1, Ldn1/a$c;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Ldn1/b$c;->G:Ldn1/b;

    iput-object v3, p0, Ldn1/b$c;->E:Ljava/lang/Object;

    iput-object v3, p0, Ldn1/b$c;->F:Ljava/lang/Object;

    iput v5, p0, Ldn1/b$c;->z:I

    invoke-static {p1, p0}, Ldn1/b;->d(Ldn1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_4

    :cond_3
    :goto_0
    check-cast p1, Ldn1/c;

    return-object p1

    :cond_4
    instance-of p1, v1, Ldn1/a$f;

    if-eqz p1, :cond_c

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_5

    move-object p1, v0

    check-cast p1, Ldn1/e;

    goto :goto_1

    :cond_5
    move-object p1, v3

    :goto_1
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ldn1/e;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object p1

    if-nez p1, :cond_9

    :cond_6
    instance-of p1, v0, Ldn1/f;

    if-eqz p1, :cond_7

    move-object p1, v0

    check-cast p1, Ldn1/f;

    goto :goto_2

    :cond_7
    move-object p1, v3

    :goto_2
    if-eqz p1, :cond_8

    invoke-interface {p1}, Ldn1/f;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object p1

    goto :goto_3

    :cond_8
    move-object p1, v3

    :cond_9
    :goto_3
    if-eqz p1, :cond_1e

    iget-object v5, p0, Ldn1/b$c;->G:Ldn1/b;

    check-cast v1, Ldn1/a$f;

    invoke-virtual {v1}, Ldn1/a$f;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;

    move-result-object v1

    iput-object v0, p0, Ldn1/b$c;->E:Ljava/lang/Object;

    iput-object v3, p0, Ldn1/b$c;->F:Ljava/lang/Object;

    iput-object v3, p0, Ldn1/b$c;->w:Ljava/lang/Object;

    iput-object v3, p0, Ldn1/b$c;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Ldn1/b$c;->y:I

    iput v4, p0, Ldn1/b$c;->z:I

    invoke-static {v5, p1, v1, p0}, Ldn1/b;->i(Ldn1/b;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_a

    :goto_4
    return-object v2

    :cond_a
    :goto_5
    check-cast p1, Ldn1/c;

    if-nez p1, :cond_b

    goto/16 :goto_b

    :cond_b
    return-object p1

    :cond_c
    instance-of p1, v1, Ldn1/a$a;

    if-eqz p1, :cond_d

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_1e

    iget-object p1, p0, Ldn1/b$c;->G:Ldn1/b;

    check-cast v0, Ldn1/e;

    check-cast v1, Ldn1/a$a;

    invoke-virtual {v1}, Ldn1/a$a;->a()I

    move-result v1

    invoke-static {p1, v0, v1}, Ldn1/b;->c(Ldn1/b;Ldn1/e;I)Ldn1/c;

    move-result-object p1

    return-object p1

    :cond_d
    instance-of p1, v1, Ldn1/a$d;

    if-eqz p1, :cond_e

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_1e

    iget-object p1, p0, Ldn1/b$c;->G:Ldn1/b;

    check-cast v0, Ldn1/e;

    check-cast v1, Ldn1/a$d;

    invoke-virtual {v1}, Ldn1/a$d;->a()I

    move-result v1

    invoke-static {p1, v0, v1}, Ldn1/b;->g(Ldn1/b;Ldn1/e;I)Ldn1/c;

    move-result-object p1

    return-object p1

    :cond_e
    instance-of p1, v1, Ldn1/a$e;

    if-eqz p1, :cond_f

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_1e

    iget-object p1, p0, Ldn1/b$c;->G:Ldn1/b;

    check-cast v0, Ldn1/e;

    check-cast v1, Ldn1/a$e;

    invoke-virtual {v1}, Ldn1/a$e;->a()I

    move-result v2

    invoke-virtual {v1}, Ldn1/a$e;->b()I

    move-result v1

    invoke-static {p1, v0, v2, v1}, Ldn1/b;->h(Ldn1/b;Ldn1/e;II)Ldn1/c;

    move-result-object p1

    return-object p1

    :cond_f
    instance-of p1, v1, Ldn1/a$i;

    if-eqz p1, :cond_10

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_1e

    sget-object p1, Ldn1/h;->Companion:Ldn1/h$a;

    check-cast v1, Ldn1/a$i;

    invoke-virtual {v1}, Ldn1/a$i;->b()Ldn1/h;

    move-result-object v2

    invoke-virtual {v2}, Ldn1/h;->getGaugeIndex()I

    move-result v2

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, v4}, Ldn1/h$a;->a(Ljava/lang/Integer;)Ldn1/h;

    move-result-object p1

    iget-object v2, p0, Ldn1/b$c;->G:Ldn1/b;

    invoke-static {v2}, Ldn1/b;->e(Ldn1/b;)Lbn1/a;

    move-result-object v2

    invoke-virtual {v1}, Ldn1/a$i;->b()Ldn1/h;

    move-result-object v4

    invoke-virtual {v2, v4}, Lbn1/a;->h(Ldn1/h;)V

    check-cast v0, Ldn1/e;

    new-instance v2, Ldn1/i;

    invoke-virtual {v1}, Ldn1/a$i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, p1, v1}, Ldn1/i;-><init>(Ldn1/h;Ljava/lang/String;)V

    invoke-static {v0, v3, v2, v5, v3}, Ldn1/e;->c(Ldn1/e;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;ILjava/lang/Object;)Ldn1/e;

    move-result-object p1

    return-object p1

    :cond_10
    instance-of p1, v1, Ldn1/a$h;

    if-eqz p1, :cond_12

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_1e

    check-cast v0, Ldn1/e;

    invoke-virtual {v0}, Ldn1/e;->d()Ldn1/i;

    move-result-object p1

    if-eqz p1, :cond_11

    check-cast v1, Ldn1/a$h;

    invoke-virtual {v1}, Ldn1/a$h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v3, v1, v5, v3}, Ldn1/i;->b(Ldn1/i;Ldn1/h;Ljava/lang/String;ILjava/lang/Object;)Ldn1/i;

    move-result-object p1

    goto :goto_6

    :cond_11
    move-object p1, v3

    :goto_6
    invoke-static {v0, v3, p1, v5, v3}, Ldn1/e;->c(Ldn1/e;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;ILjava/lang/Object;)Ldn1/e;

    move-result-object p1

    return-object p1

    :cond_12
    instance-of p1, v1, Ldn1/a$j;

    if-eqz p1, :cond_17

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_1e

    iget-object p1, p0, Ldn1/b$c;->G:Ldn1/b;

    check-cast v0, Ldn1/e;

    invoke-static {p1, v0}, Ldn1/b;->j(Ldn1/b;Ldn1/e;)V

    iget-object p1, p0, Ldn1/b$c;->G:Ldn1/b;

    invoke-virtual {v0}, Ldn1/e;->d()Ldn1/i;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Ldn1/i;->c()Ldn1/h;

    move-result-object v1

    if-nez v1, :cond_14

    :cond_13
    sget-object v1, Ldn1/h;->NONE:Ldn1/h;

    :cond_14
    invoke-virtual {v0}, Ldn1/e;->d()Ldn1/i;

    move-result-object v2

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Ldn1/i;->d()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_16

    :cond_15
    const-string v2, ""

    :cond_16
    invoke-static {p1, v0, v1, v2}, Ldn1/b;->k(Ldn1/b;Ldn1/e;Ldn1/h;Ljava/lang/String;)Ldn1/c;

    move-result-object p1

    return-object p1

    :cond_17
    sget-object p1, Ldn1/a$b;->a:Ldn1/a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    instance-of p1, v0, Ldn1/f$a;

    if-eqz p1, :cond_1e

    new-instance p1, Ldn1/e;

    check-cast v0, Ldn1/f$a;

    invoke-virtual {v0}, Ldn1/f$a;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object v0

    invoke-direct {p1, v0, v3, v4, v3}, Ldn1/e;-><init>(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_18
    sget-object p1, Ldn1/a$g;->a:Ldn1/a$g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1f

    instance-of p1, v0, Ldn1/e;

    if-eqz p1, :cond_19

    move-object p1, v0

    check-cast p1, Ldn1/e;

    goto :goto_7

    :cond_19
    move-object p1, v3

    :goto_7
    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Ldn1/e;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object p1

    if-nez p1, :cond_1a

    goto :goto_8

    :cond_1a
    move-object v3, p1

    goto :goto_a

    :cond_1b
    :goto_8
    instance-of p1, v0, Ldn1/f$a;

    if-eqz p1, :cond_1c

    move-object p1, v0

    check-cast p1, Ldn1/f$a;

    goto :goto_9

    :cond_1c
    move-object p1, v3

    :goto_9
    if-eqz p1, :cond_1d

    invoke-virtual {p1}, Ldn1/f$a;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object v3

    :cond_1d
    :goto_a
    if-eqz v3, :cond_1e

    new-instance p1, Ldn1/f$b;

    invoke-direct {p1, v3}, Ldn1/f$b;-><init>(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)V

    return-object p1

    :cond_1e
    :goto_b
    return-object v0

    :cond_1f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
