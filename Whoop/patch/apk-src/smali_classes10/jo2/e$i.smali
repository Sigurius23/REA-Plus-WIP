.class final Ljo2/e$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljo2/e;->B(Lq20/e;)Lbc3/k1;
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
    c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$setSelectedPaymentMethod$1"
    f = "StripeFlowControllerManager.kt"
    l = {
        0x142
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lq20/e;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Ljo2/e;


# direct methods
.method public constructor <init>(Ljo2/e;Lq20/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljo2/e;",
            "Lq20/e;",
            "Lq83/d<",
            "-",
            "Ljo2/e$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljo2/e$i;->z:Ljo2/e;

    iput-object p2, p0, Ljo2/e$i;->E:Lq20/e;

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

    new-instance p1, Ljo2/e$i;

    iget-object v0, p0, Ljo2/e$i;->z:Ljo2/e;

    iget-object v1, p0, Ljo2/e$i;->E:Lq20/e;

    invoke-direct {p1, v0, v1, p2}, Ljo2/e$i;-><init>(Ljo2/e;Lq20/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ljo2/e$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljo2/e$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljo2/e$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljo2/e$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljo2/e$i;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v1, v0, Ljo2/e$i;->x:Ljava/lang/Object;

    check-cast v1, Ljo2/c;

    iget-object v1, v0, Ljo2/e$i;->w:Ljava/lang/Object;

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

    iget-object v2, v0, Ljo2/e$i;->z:Ljo2/e;

    invoke-static {v2}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljo2/c;

    iget-object v5, v0, Ljo2/e$i;->z:Ljo2/e;

    invoke-static {v5}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v5

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljo2/c;

    iget-object v14, v0, Ljo2/e$i;->E:Lq20/e;

    const/16 v16, 0x17f

    const/16 v17, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v17}, Ljo2/c;->b(Ljo2/c;ZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/e;Lq20/e;Ljava/lang/Boolean;ILjava/lang/Object;)Ljo2/c;

    move-result-object v5

    invoke-virtual {v2}, Ljo2/c;->e()Lh20/d2;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljo2/c;->m(Lh20/d2;)V

    iget-object v2, v0, Ljo2/e$i;->z:Ljo2/e;

    invoke-static {v2}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v2

    const/4 v6, 0x0

    iput-object v6, v0, Ljo2/e$i;->w:Ljava/lang/Object;

    iput-object v6, v0, Ljo2/e$i;->x:Ljava/lang/Object;

    iput v4, v0, Ljo2/e$i;->y:I

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v5, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    return-object v3
.end method
