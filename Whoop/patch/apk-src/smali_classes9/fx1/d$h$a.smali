.class final Lfx1/d$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx1/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lfx1/d;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lfx1/d;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lfx1/d;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfx1/d$h$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lfx1/d$h$a;->x:Lfx1/d;

    iput-object p3, p0, Lfx1/d$h$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lfx1/a;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfx1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lfx1/d$h$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfx1/d$h$a$a;

    iget v1, v0, Lfx1/d$h$a$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfx1/d$h$a$a;->F:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lfx1/d$h$a$a;

    invoke-direct {v0, p0, p2}, Lfx1/d$h$a$a;-><init>(Lfx1/d$h$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Lfx1/d$h$a$a;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lfx1/d$h$a$a;->F:I

    const/4 v8, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v8, :cond_1

    iget-object p1, v7, Lfx1/d$h$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lfx1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v7, Lfx1/d$h$a$a;->y:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v7, Lfx1/d$h$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/payments/domain/models/Card;

    iget-object v1, v7, Lfx1/d$h$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lfx1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget-object p1, v7, Lfx1/d$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v7, Lfx1/d$h$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lfx1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lfx1/d$h$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v1, p1, Lfx1/a$c;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lfx1/d$h$a;->x:Lfx1/d;

    iget-object v2, p0, Lfx1/d$h$a;->y:Lec3/m;

    check-cast p1, Lfx1/a$c;

    invoke-virtual {p1}, Lfx1/a$c;->a()Ljava/util/Map;

    move-result-object p1

    iput-object v9, v7, Lfx1/d$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v7, Lfx1/d$h$a$a;->x:Ljava/lang/Object;

    iput v3, v7, Lfx1/d$h$a$a;->F:I

    invoke-static {v1, v2, p1, v7}, Lfx1/d;->d(Lfx1/d;Lec3/m;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_8

    :cond_5
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    :goto_2
    check-cast p2, Lfx1/b;

    :goto_3
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    goto/16 :goto_7

    :cond_6
    instance-of v1, p1, Lfx1/a$e;

    if-eqz v1, :cond_7

    iget-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lfx1/b;

    iget-object v2, p0, Lfx1/d$h$a;->x:Lfx1/d;

    check-cast p1, Lfx1/b;

    invoke-virtual {p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object p1

    invoke-static {v2, p1}, Lfx1/d;->g(Lfx1/d;Lfx1/c;)Lfx1/c;

    move-result-object p1

    invoke-static {v1, v9, p1, v3, v9}, Lfx1/b;->b(Lfx1/b;Ljava/util/Map;Lfx1/c;ILjava/lang/Object;)Lfx1/b;

    move-result-object p1

    goto/16 :goto_7

    :cond_7
    instance-of v1, p1, Lfx1/a$g;

    if-eqz v1, :cond_8

    iget-object v1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lfx1/b;

    iget-object v4, p0, Lfx1/d$h$a;->x:Lfx1/d;

    check-cast v1, Lfx1/b;

    invoke-virtual {v1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    check-cast p1, Lfx1/a$g;

    invoke-virtual {p1}, Lfx1/a$g;->a()I

    move-result p1

    invoke-static {v4, v1, p1}, Lfx1/d;->j(Lfx1/d;Lfx1/c;I)Lfx1/c;

    move-result-object p1

    invoke-static {v2, v9, p1, v3, v9}, Lfx1/b;->b(Lfx1/b;Ljava/util/Map;Lfx1/c;ILjava/lang/Object;)Lfx1/b;

    move-result-object p1

    goto/16 :goto_7

    :cond_8
    instance-of v1, p1, Lfx1/a$f;

    if-eqz v1, :cond_9

    iget-object v1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lfx1/b;

    iget-object v4, p0, Lfx1/d$h$a;->x:Lfx1/d;

    check-cast v1, Lfx1/b;

    invoke-virtual {v1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    check-cast p1, Lfx1/a$f;

    invoke-virtual {p1}, Lfx1/a$f;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v5

    invoke-virtual {p1}, Lfx1/a$f;->b()Z

    move-result p1

    invoke-static {v4, v1, v5, p1}, Lfx1/d;->i(Lfx1/d;Lfx1/c;Lcom/whoop/payments/domain/models/Card;Z)Lfx1/c;

    move-result-object p1

    invoke-static {v2, v9, p1, v3, v9}, Lfx1/b;->b(Lfx1/b;Ljava/util/Map;Lfx1/c;ILjava/lang/Object;)Lfx1/b;

    move-result-object p1

    goto/16 :goto_7

    :cond_9
    instance-of v1, p1, Lfx1/a$a;

    if-eqz v1, :cond_e

    iget-object v1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lfx1/b;

    invoke-virtual {v1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    instance-of v1, v1, Lfx1/c$d;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lfx1/d$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lfx1/b;

    invoke-virtual {v1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutDomainScreenState.Result"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lfx1/c$d;

    invoke-virtual {v1}, Lfx1/c$d;->c()Lcom/whoop/payments/domain/models/Card;

    move-result-object v3

    invoke-virtual {v1}, Lfx1/c$d;->f()I

    move-result v4

    if-nez v4, :cond_b

    invoke-virtual {v1}, Lfx1/c$d;->d()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_4

    :cond_a
    move-object v6, v9

    goto :goto_5

    :cond_b
    :goto_4
    move-object v6, v3

    goto :goto_5

    :cond_c
    move-object v1, p1

    check-cast v1, Lfx1/a$a;

    invoke-virtual {v1}, Lfx1/a$a;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v3

    goto :goto_4

    :goto_5
    iget-object v1, p0, Lfx1/d$h$a;->x:Lfx1/d;

    move v3, v2

    iget-object v2, p0, Lfx1/d$h$a;->y:Lec3/m;

    iget-object v4, p0, Lfx1/d$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v4, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lfx1/b;

    check-cast p1, Lfx1/a$a;

    move v5, v3

    move-object v3, v4

    invoke-virtual {p1}, Lfx1/a$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lfx1/a$a;->c()Ljava/util/Map;

    move-result-object p1

    iput-object v9, v7, Lfx1/d$h$a$a;->w:Ljava/lang/Object;

    iput-object v9, v7, Lfx1/d$h$a$a;->x:Ljava/lang/Object;

    iput-object p2, v7, Lfx1/d$h$a$a;->y:Ljava/lang/Object;

    iput v5, v7, Lfx1/d$h$a$a;->F:I

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lfx1/d;->c(Lfx1/d;Lec3/m;Lfx1/b;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    goto :goto_8

    :cond_d
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    :goto_6
    check-cast p2, Lfx1/b;

    goto/16 :goto_3

    :cond_e
    instance-of v1, p1, Lfx1/a$d;

    if-eqz v1, :cond_f

    iget-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lfx1/b;

    iget-object v2, p0, Lfx1/d$h$a;->x:Lfx1/d;

    check-cast p1, Lfx1/b;

    invoke-virtual {p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object p1

    invoke-static {v2, p1, v3}, Lfx1/d;->h(Lfx1/d;Lfx1/c;Z)Lfx1/c;

    move-result-object p1

    invoke-static {v1, v9, p1, v3, v9}, Lfx1/b;->b(Lfx1/b;Ljava/util/Map;Lfx1/c;ILjava/lang/Object;)Lfx1/b;

    move-result-object p1

    goto :goto_7

    :cond_f
    instance-of p1, p1, Lfx1/a$b;

    if-eqz p1, :cond_11

    iget-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lfx1/b;

    iget-object v2, p0, Lfx1/d$h$a;->x:Lfx1/d;

    check-cast p1, Lfx1/b;

    invoke-virtual {p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object p1

    const/4 v4, 0x0

    invoke-static {v2, p1, v4}, Lfx1/d;->h(Lfx1/d;Lfx1/c;Z)Lfx1/c;

    move-result-object p1

    invoke-static {v1, v9, p1, v3, v9}, Lfx1/b;->b(Lfx1/b;Ljava/util/Map;Lfx1/c;ILjava/lang/Object;)Lfx1/b;

    move-result-object p1

    :goto_7
    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lfx1/d$h$a;->y:Lec3/m;

    iget-object p2, p0, Lfx1/d$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v9, v7, Lfx1/d$h$a$a;->w:Ljava/lang/Object;

    iput-object v9, v7, Lfx1/d$h$a$a;->x:Ljava/lang/Object;

    iput-object v9, v7, Lfx1/d$h$a$a;->y:Ljava/lang/Object;

    iput v8, v7, Lfx1/d$h$a$a;->F:I

    invoke-interface {p1, p2, v7}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10

    :goto_8
    return-object v0

    :cond_10
    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfx1/a;

    invoke-virtual {p0, p1, p2}, Lfx1/d$h$a;->b(Lfx1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
