.class final Lko2/d$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko2/d;->interact(Lec3/l;)Lec3/l;
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
        "Lko2/c;",
        "previousState",
        "Lko2/e;",
        "action",
        "<anonymous>",
        "(Lko2/c;Lko2/e;)Lko2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$2"
    f = "UniversalCheckoutInteractor.kt"
    l = {
        0x7c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lko2/d;


# direct methods
.method public constructor <init>(Lko2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko2/d;",
            "Lq83/d<",
            "-",
            "Lko2/d$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lko2/d$o;->z:Lko2/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lko2/c;Lko2/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko2/c;",
            "Lko2/e;",
            "Lq83/d<",
            "-",
            "Lko2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lko2/d$o;

    iget-object v1, p0, Lko2/d$o;->z:Lko2/d;

    invoke-direct {v0, v1, p3}, Lko2/d$o;-><init>(Lko2/d;Lq83/d;)V

    iput-object p1, v0, Lko2/d$o;->x:Ljava/lang/Object;

    iput-object p2, v0, Lko2/d$o;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lko2/d$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lko2/c;

    check-cast p2, Lko2/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lko2/d$o;->f(Lko2/c;Lko2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lko2/d$o;->x:Ljava/lang/Object;

    check-cast v1, Lko2/c;

    iget-object v2, v0, Lko2/d$o;->y:Ljava/lang/Object;

    check-cast v2, Lko2/e;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lko2/d$o;->w:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v4, v2, Lko2/e$b;

    const/4 v6, 0x0

    if-eqz v4, :cond_3

    iget-object v4, v0, Lko2/d$o;->z:Lko2/d;

    check-cast v2, Lko2/e$b;

    invoke-virtual {v2}, Lko2/e$b;->a()Lko2/b;

    move-result-object v2

    iput-object v6, v0, Lko2/d$o;->x:Ljava/lang/Object;

    iput-object v6, v0, Lko2/d$o;->y:Ljava/lang/Object;

    iput v5, v0, Lko2/d$o;->w:I

    invoke-static {v4, v1, v2, v0}, Lko2/d;->g(Lko2/d;Lko2/c;Lko2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_2

    return-object v3

    :cond_2
    :goto_0
    check-cast v1, Lko2/c;

    return-object v1

    :cond_3
    instance-of v3, v2, Lko2/e$a;

    if-eqz v3, :cond_e

    check-cast v2, Lko2/e$a;

    invoke-virtual {v2}, Lko2/e$a;->b()Lko2/c;

    move-result-object v7

    invoke-virtual {v2}, Lko2/e$a;->b()Lko2/c;

    move-result-object v3

    invoke-virtual {v3}, Lko2/c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_4

    goto :goto_1

    :cond_4
    move-object v3, v6

    :goto_1
    if-nez v3, :cond_5

    invoke-virtual {v1}, Lko2/c;->d()Ljava/lang/String;

    move-result-object v3

    :cond_5
    move-object v10, v3

    invoke-virtual {v2}, Lko2/e$a;->b()Lko2/c;

    move-result-object v3

    invoke-virtual {v3}, Lko2/c;->o()Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;

    move-result-object v3

    if-nez v3, :cond_6

    invoke-virtual {v1}, Lko2/c;->o()Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;

    move-result-object v3

    :cond_6
    move-object v12, v3

    invoke-virtual {v2}, Lko2/e$a;->b()Lko2/c;

    move-result-object v3

    invoke-virtual {v3}, Lko2/c;->g()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_7

    goto :goto_2

    :cond_7
    move-object v3, v6

    :goto_2
    if-nez v3, :cond_8

    invoke-virtual {v1}, Lko2/c;->g()Ljava/lang/String;

    move-result-object v3

    :cond_8
    move-object v8, v3

    invoke-virtual {v2}, Lko2/e$a;->b()Lko2/c;

    move-result-object v3

    invoke-virtual {v3}, Lko2/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_9

    move-object v6, v3

    :cond_9
    if-nez v6, :cond_a

    invoke-virtual {v1}, Lko2/c;->f()Ljava/lang/String;

    move-result-object v6

    :cond_a
    move-object v9, v6

    sget-object v3, Lmn2/b;->Companion:Lmn2/b$a;

    invoke-virtual {v2}, Lko2/e$a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lmn2/b$a;->a(Ljava/lang/String;)Lmn2/b;

    move-result-object v3

    invoke-virtual {v3}, Lmn2/b;->getAutoExpandsOrderDetails()Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_3
    move v15, v5

    goto :goto_4

    :cond_b
    invoke-virtual {v1}, Lko2/c;->i()Z

    move-result v5

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lko2/c;->l()Z

    move-result v17

    invoke-virtual {v2}, Lko2/e$a;->c()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_c

    invoke-virtual {v1}, Lko2/c;->p()Ljava/lang/String;

    move-result-object v3

    :cond_c
    move-object/from16 v21, v3

    invoke-virtual {v2}, Lko2/e$a;->a()Lj02/x0;

    move-result-object v2

    if-nez v2, :cond_d

    invoke-virtual {v1}, Lko2/c;->c()Lj02/x0;

    move-result-object v2

    :cond_d
    move-object/from16 v22, v2

    invoke-virtual {v1}, Lko2/c;->h()Z

    move-result v23

    const v25, 0x11d68

    const/16 v26, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    invoke-static/range {v7 .. v26}, Lko2/c;->b(Lko2/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lko2/a;Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;ZZZLq20/e;ZZLjava/lang/String;ZLjava/lang/String;Lj02/x0;ZLjava/lang/Long;ILjava/lang/Object;)Lko2/c;

    move-result-object v1

    return-object v1

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
