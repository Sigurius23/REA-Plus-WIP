.class final Lm70/d$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm70/d;->o(Lm70/a$a;Lq83/d;)Ljava/lang/Object;
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
        "Lm70/b;",
        "<anonymous>",
        "(Lbc3/c0;)Lm70/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$createStripeToken$2"
    f = "PaymentsInteractor.kt"
    l = {
        0xe0,
        0xf2,
        0xf5
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lm70/d;

.field final synthetic F:Lm70/a$a;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lm70/d;Lm70/a$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm70/d;",
            "Lm70/a$a;",
            "Lq83/d<",
            "-",
            "Lm70/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm70/d$d;->E:Lm70/d;

    iput-object p2, p0, Lm70/d$d;->F:Lm70/a$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lm70/d$d;

    iget-object v0, p0, Lm70/d$d;->E:Lm70/d;

    iget-object v1, p0, Lm70/d$d;->F:Lm70/a$a;

    invoke-direct {p1, v0, v1, p2}, Lm70/d$d;-><init>(Lm70/d;Lm70/a$a;Lq83/d;)V

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
            "Lm70/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lm70/d$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm70/d$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm70/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm70/d$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm70/d$d;->z:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lm70/d$d;->y:Ljava/lang/Object;

    check-cast v1, Ly00/g8;

    iget-object v1, v0, Lm70/d$d;->x:Ljava/lang/Object;

    check-cast v1, Lux/j0;

    iget-object v1, v0, Lm70/d$d;->w:Ljava/lang/Object;

    check-cast v1, Lm70/i$b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v1, v0, Lm70/d$d;->y:Ljava/lang/Object;

    check-cast v1, Ly00/g8;

    iget-object v2, v0, Lm70/d$d;->x:Ljava/lang/Object;

    check-cast v2, Lux/j0;

    iget-object v2, v0, Lm70/d$d;->w:Ljava/lang/Object;

    check-cast v2, Lm70/i$b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v2, v0, Lm70/d$d;->w:Ljava/lang/Object;

    check-cast v2, Lm70/i$b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v2, Lm70/i$b;->a:Lm70/i$b;

    iget-object v6, v0, Lm70/d$d;->E:Lm70/d;

    invoke-static {v6}, Lm70/d;->h(Lm70/d;)Lh32/a;

    move-result-object v6

    iget-object v7, v0, Lm70/d$d;->F:Lm70/a$a;

    invoke-virtual {v7}, Lm70/a$a;->f()Ljava/lang/String;

    move-result-object v7

    iput-object v2, v0, Lm70/d$d;->w:Ljava/lang/Object;

    iput v5, v0, Lm70/d$d;->z:I

    invoke-interface {v6, v7, v0}, Lh32/a;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto/16 :goto_2

    :cond_4
    :goto_0
    check-cast v5, Lux/j0;

    if-nez v5, :cond_5

    new-instance v1, Lm70/b$e;

    invoke-direct {v1, v2}, Lm70/b$e;-><init>(Lm70/g;)V

    return-object v1

    :cond_5
    new-instance v6, Ly00/m;

    iget-object v7, v0, Lm70/d$d;->F:Lm70/a$a;

    invoke-virtual {v7}, Lm70/a$a;->d()Ld70/g;

    move-result-object v7

    invoke-virtual {v7}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lm70/d$d;->F:Lm70/a$a;

    invoke-virtual {v8}, Lm70/a$a;->b()Ld70/f;

    move-result-object v8

    invoke-virtual {v8}, Ld70/f;->a()I

    move-result v8

    iget-object v9, v0, Lm70/d$d;->F:Lm70/a$a;

    invoke-virtual {v9}, Lm70/a$a;->c()Ld70/f;

    move-result-object v9

    invoke-virtual {v9}, Ld70/f;->a()I

    move-result v9

    iget-object v10, v0, Lm70/d$d;->F:Lm70/a$a;

    invoke-virtual {v10}, Lm70/a$a;->a()Ld70/g;

    move-result-object v10

    invoke-virtual {v10}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v0, Lm70/d$d;->F:Lm70/a$a;

    invoke-virtual {v11}, Lm70/a$a;->e()Ld70/g;

    move-result-object v11

    invoke-virtual {v11}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v17

    new-instance v11, Ly00/c;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v12, v11

    invoke-direct/range {v12 .. v18}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct/range {v6 .. v11}, Ly00/m;-><init>(Ljava/lang/String;IILjava/lang/String;Ly00/c;)V

    invoke-static {v5, v6}, Lux/j0;->a(Lux/j0;Ly00/m;)Ly00/g8;

    move-result-object v5

    iget-object v6, v5, Ly00/g8;->w:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_7

    iget-object v4, v0, Lm70/d$d;->E:Lm70/d;

    iput-object v2, v0, Lm70/d$d;->w:Ljava/lang/Object;

    iput-object v7, v0, Lm70/d$d;->x:Ljava/lang/Object;

    iput-object v7, v0, Lm70/d$d;->y:Ljava/lang/Object;

    iput v3, v0, Lm70/d$d;->z:I

    invoke-static {v4, v2, v0}, Lm70/d;->l(Lm70/d;Lm70/g;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    goto :goto_2

    :cond_6
    move-object v1, v2

    :goto_1
    new-instance v2, Lm70/b$e;

    invoke-direct {v2, v1}, Lm70/b$e;-><init>(Lm70/g;)V

    return-object v2

    :cond_7
    iget-object v2, v0, Lm70/d$d;->E:Lm70/d;

    invoke-static {v2, v5}, Lm70/d;->i(Lm70/d;Ly00/g8;)V

    iget-object v2, v0, Lm70/d$d;->E:Lm70/d;

    iput-object v7, v0, Lm70/d$d;->w:Ljava/lang/Object;

    iput-object v7, v0, Lm70/d$d;->x:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$d;->y:Ljava/lang/Object;

    iput v4, v0, Lm70/d$d;->z:I

    invoke-static {v2, v0}, Lm70/d;->m(Lm70/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    move-object v1, v5

    :goto_3
    new-instance v2, Lm70/b$d;

    iget-object v1, v1, Ly00/g8;->w:Ljava/lang/String;

    iget-object v3, v0, Lm70/d$d;->F:Lm70/a$a;

    invoke-virtual {v3}, Lm70/a$a;->e()Ld70/g;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lm70/b$d;-><init>(Ljava/lang/String;Ld70/g;)V

    return-object v2
.end method
