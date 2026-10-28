.class final Ljo2/e$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljo2/e;->k(Ljava/lang/String;Ljava/lang/String;)Lbc3/k1;
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
    c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$confirmPayment$1"
    f = "StripeFlowControllerManager.kt"
    l = {
        0x154
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Ljo2/e;


# direct methods
.method public constructor <init>(Ljo2/e;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljo2/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljo2/e$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljo2/e$g;->z:Ljo2/e;

    iput-object p2, p0, Ljo2/e$g;->E:Ljava/lang/String;

    iput-object p3, p0, Ljo2/e$g;->F:Ljava/lang/String;

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

    new-instance p1, Ljo2/e$g;

    iget-object v0, p0, Ljo2/e$g;->z:Ljo2/e;

    iget-object v1, p0, Ljo2/e$g;->E:Ljava/lang/String;

    iget-object v2, p0, Ljo2/e$g;->F:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Ljo2/e$g;-><init>(Ljo2/e;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ljo2/e$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljo2/e$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljo2/e$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljo2/e$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljo2/e$g;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v1, v0, Ljo2/e$g;->x:Ljava/lang/Object;

    check-cast v1, Ljo2/c;

    iget-object v1, v0, Ljo2/e$g;->w:Ljava/lang/Object;

    check-cast v1, Ljo2/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Ljo2/e$g;->z:Ljo2/e;

    invoke-static {v2}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljo2/c;

    iget-object v5, v0, Ljo2/e$g;->z:Ljo2/e;

    invoke-static {v5}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v5

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljo2/c;

    iget-object v11, v0, Ljo2/e$g;->E:Ljava/lang/String;

    iget-object v12, v0, Ljo2/e$g;->F:Ljava/lang/String;

    const/16 v16, 0x1cf

    const/16 v17, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v17}, Ljo2/c;->b(Ljo2/c;ZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/e;Lq20/e;Ljava/lang/Boolean;ILjava/lang/Object;)Ljo2/c;

    move-result-object v5

    invoke-virtual {v2}, Ljo2/c;->e()Lh20/d2;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljo2/c;->m(Lh20/d2;)V

    iget-object v2, v0, Ljo2/e$g;->z:Ljo2/e;

    invoke-static {v2}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v2

    const/4 v6, 0x0

    iput-object v6, v0, Ljo2/e$g;->w:Ljava/lang/Object;

    iput-object v6, v0, Ljo2/e$g;->x:Ljava/lang/Object;

    iput v4, v0, Ljo2/e$g;->y:I

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v5, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    iget-object v1, v0, Ljo2/e$g;->z:Ljo2/e;

    invoke-static {v1}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljo2/c;

    invoke-virtual {v1}, Ljo2/c;->e()Lh20/d2;

    move-result-object v1

    check-cast v1, Ln20/i;

    invoke-virtual {v1}, Ln20/i;->c()V

    return-object v3
.end method
