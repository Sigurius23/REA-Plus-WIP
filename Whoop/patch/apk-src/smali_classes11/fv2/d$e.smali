.class final Lfv2/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv2/d;->interact(Lec3/l;)Lec3/l;
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
        "Lfv2/c;",
        "currentState",
        "Lfv2/b;",
        "currentAction",
        "<anonymous>",
        "(Lfv2/c;Lfv2/b;)Lfv2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor$interact$1"
    f = "CustomExerciseInteractor.kt"
    l = {
        0x34,
        0x35,
        0x40,
        0x41,
        0x4b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfv2/d;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfv2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfv2/d;",
            "Lq83/d<",
            "-",
            "Lfv2/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lfv2/c;Lfv2/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfv2/c;",
            "Lfv2/b;",
            "Lq83/d<",
            "-",
            "Lfv2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lfv2/d$e;

    iget-object v1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-direct {v0, v1, p3}, Lfv2/d$e;-><init>(Lfv2/d;Lq83/d;)V

    iput-object p1, v0, Lfv2/d$e;->y:Ljava/lang/Object;

    iput-object p2, v0, Lfv2/d$e;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfv2/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfv2/c;

    check-cast p2, Lfv2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfv2/d$e;->f(Lfv2/c;Lfv2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lfv2/d$e;->y:Ljava/lang/Object;

    check-cast v0, Lfv2/c;

    iget-object v1, p0, Lfv2/d$e;->z:Ljava/lang/Object;

    check-cast v1, Lfv2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lfv2/d$e;->x:I

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v8, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object v1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lfv2/b$f;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    check-cast v1, Lfv2/b$f;

    invoke-virtual {v1}, Lfv2/b$f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lfv2/d;->m(Lfv2/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lfv2/d$e;->E:Lfv2/d;

    iput-object v0, p0, Lfv2/d$e;->y:Ljava/lang/Object;

    iput-object v9, p0, Lfv2/d$e;->z:Ljava/lang/Object;

    iput-object p1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    iput v8, p0, Lfv2/d$e;->x:I

    invoke-static {v1, p0}, Lfv2/d;->e(Lfv2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v10, v1

    move-object v1, p1

    move-object p1, v10

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_7

    sget-object p1, Lfv2/a$c;->a:Lfv2/a$c;

    invoke-static {v0, v9, p1, v8, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_7
    if-eqz v1, :cond_9

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    iput-object v0, p0, Lfv2/d$e;->y:Ljava/lang/Object;

    iput-object v9, p0, Lfv2/d$e;->z:Ljava/lang/Object;

    iput-object v1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    iput v7, p0, Lfv2/d$e;->x:I

    invoke-static {p1, v1, p0}, Lfv2/d;->d(Lfv2/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    goto/16 :goto_4

    :cond_8
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_9

    sget-object p1, Lfv2/a$c;->a:Lfv2/a$c;

    invoke-static {v0, v9, p1, v8, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_9
    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-static {p1, v0, v1}, Lfv2/d;->g(Lfv2/d;Lfv2/c;Ljava/lang/String;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, v1, Lfv2/b$a;

    if-eqz p1, :cond_10

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    check-cast v1, Lfv2/b$a;

    invoke-virtual {v1}, Lfv2/b$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lfv2/d;->m(Lfv2/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_b

    return-object v0

    :cond_b
    iget-object v1, p0, Lfv2/d$e;->E:Lfv2/d;

    iput-object v0, p0, Lfv2/d$e;->y:Ljava/lang/Object;

    iput-object v9, p0, Lfv2/d$e;->z:Ljava/lang/Object;

    iput-object p1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    iput v6, p0, Lfv2/d$e;->x:I

    invoke-static {v1, p0}, Lfv2/d;->e(Lfv2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_c

    goto/16 :goto_4

    :cond_c
    move-object v10, v1

    move-object v1, p1

    move-object p1, v10

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_d

    sget-object p1, Lfv2/a$c;->a:Lfv2/a$c;

    invoke-static {v0, v9, p1, v8, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_d
    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    iput-object v0, p0, Lfv2/d$e;->y:Ljava/lang/Object;

    iput-object v9, p0, Lfv2/d$e;->z:Ljava/lang/Object;

    iput-object v1, p0, Lfv2/d$e;->w:Ljava/lang/Object;

    iput v5, p0, Lfv2/d$e;->x:I

    invoke-static {p1, v1, p0}, Lfv2/d;->d(Lfv2/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_e

    goto/16 :goto_4

    :cond_e
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_f

    sget-object p1, Lfv2/a$c;->a:Lfv2/a$c;

    invoke-static {v0, v9, p1, v8, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_f
    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-static {p1, v0, v1}, Lfv2/d;->c(Lfv2/d;Lfv2/c;Ljava/lang/String;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_10
    instance-of p1, v1, Lfv2/b$d;

    if-eqz p1, :cond_11

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-virtual {v0}, Lfv2/c;->d()Lfv2/e;

    move-result-object v2

    check-cast v1, Lfv2/b$d;

    invoke-virtual {v1}, Lfv2/b$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v2, v1}, Lfv2/d;->l(Lfv2/d;Lfv2/e;Ljava/lang/String;)Lfv2/e;

    move-result-object p1

    invoke-static {v0, p1, v9, v7, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_11
    instance-of p1, v1, Lfv2/b$c;

    if-eqz p1, :cond_12

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-virtual {v0}, Lfv2/c;->d()Lfv2/e;

    move-result-object v2

    check-cast v1, Lfv2/b$c;

    invoke-virtual {v1}, Lfv2/b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v2, v1}, Lfv2/d;->k(Lfv2/d;Lfv2/e;Ljava/lang/String;)Lfv2/e;

    move-result-object p1

    invoke-static {v0, p1, v9, v7, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_12
    instance-of p1, v1, Lfv2/b$j;

    if-eqz p1, :cond_13

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-virtual {v0}, Lfv2/c;->d()Lfv2/e;

    move-result-object v1

    invoke-static {p1, v1}, Lfv2/d;->j(Lfv2/d;Lfv2/e;)Lfv2/e;

    move-result-object p1

    invoke-static {v0, p1, v9, v7, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_13
    instance-of p1, v1, Lfv2/b$h;

    if-eqz p1, :cond_14

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-virtual {v0}, Lfv2/c;->d()Lfv2/e;

    move-result-object v2

    check-cast v1, Lfv2/b$h;

    invoke-virtual {v1}, Lfv2/b$h;->a()Lcom/whoop/weightlifting/data/domain/FilterItem;

    move-result-object v1

    invoke-static {p1, v2, v1}, Lfv2/d;->h(Lfv2/d;Lfv2/e;Lcom/whoop/weightlifting/data/domain/FilterItem;)Lfv2/e;

    move-result-object p1

    invoke-static {v0, p1, v9, v7, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_14
    instance-of p1, v1, Lfv2/b$i;

    if-eqz p1, :cond_15

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-virtual {v0}, Lfv2/c;->d()Lfv2/e;

    move-result-object v2

    check-cast v1, Lfv2/b$i;

    invoke-virtual {v1}, Lfv2/b$i;->a()Lcom/whoop/weightlifting/data/domain/FilterItem;

    move-result-object v1

    invoke-static {p1, v2, v1}, Lfv2/d;->i(Lfv2/d;Lfv2/e;Lcom/whoop/weightlifting/data/domain/FilterItem;)Lfv2/e;

    move-result-object p1

    invoke-static {v0, p1, v9, v7, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_15
    instance-of p1, v1, Lfv2/b$g;

    if-eqz p1, :cond_17

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-virtual {v0}, Lfv2/c;->d()Lfv2/e;

    move-result-object v1

    iput-object v9, p0, Lfv2/d$e;->y:Ljava/lang/Object;

    iput-object v9, p0, Lfv2/d$e;->z:Ljava/lang/Object;

    iput v4, p0, Lfv2/d$e;->x:I

    invoke-static {p1, v0, v1, p0}, Lfv2/d;->p(Lfv2/d;Lfv2/c;Lfv2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_16

    :goto_4
    return-object v2

    :cond_16
    :goto_5
    check-cast p1, Lfv2/c;

    return-object p1

    :cond_17
    instance-of p1, v1, Lfv2/b$e;

    if-eqz p1, :cond_18

    iget-object p1, p0, Lfv2/d$e;->E:Lfv2/d;

    invoke-static {p1, v0}, Lfv2/d;->n(Lfv2/d;Lfv2/c;)V

    sget-object p1, Lfv2/a$e;->a:Lfv2/a$e;

    invoke-static {v0, v9, p1, v8, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_18
    instance-of p1, v1, Lfv2/b$b;

    if-eqz p1, :cond_19

    invoke-static {v0, v9, v9, v8, v9}, Lfv2/c;->b(Lfv2/c;Lfv2/e;Lfv2/a;ILjava/lang/Object;)Lfv2/c;

    move-result-object p1

    return-object p1

    :cond_19
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
