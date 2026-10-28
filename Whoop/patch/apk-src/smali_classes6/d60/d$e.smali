.class final Ld60/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld60/d;->interact(Lec3/l;)Lec3/l;
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
        "Ld60/d$a;",
        "previous",
        "Ld60/b;",
        "action",
        "<anonymous>",
        "(Ld60/d$a;Ld60/b;)Ld60/d$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$interact$2"
    f = "ReconfirmLabsInteractor.kt"
    l = {
        0x45,
        0x48,
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Ld60/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld60/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld60/d;",
            "Lq83/d<",
            "-",
            "Ld60/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ld60/d$e;->F:Ld60/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ld60/d$a;Ld60/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld60/d$a;",
            "Ld60/b;",
            "Lq83/d<",
            "-",
            "Ld60/d$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ld60/d$e;

    iget-object v1, p0, Ld60/d$e;->F:Ld60/d;

    invoke-direct {v0, v1, p3}, Ld60/d$e;-><init>(Ld60/d;Lq83/d;)V

    iput-object p1, v0, Ld60/d$e;->z:Ljava/lang/Object;

    iput-object p2, v0, Ld60/d$e;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ld60/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ld60/d$a;

    check-cast p2, Ld60/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ld60/d$e;->f(Ld60/d$a;Ld60/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Ld60/d$e;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ld60/d$a;

    iget-object v1, v0, Ld60/d$e;->E:Ljava/lang/Object;

    check-cast v1, Ld60/b;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Ld60/d$e;->y:I

    sget-object v8, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-eq v4, v6, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v1, v0, Ld60/d$e;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ld60/d$a;

    iget-object v1, v0, Ld60/d$e;->w:Ljava/lang/Object;

    check-cast v1, Ld60/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_1

    :cond_2
    iget-object v1, v0, Ld60/d$e;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ld60/d$a;

    iget-object v1, v0, Ld60/d$e;->w:Ljava/lang/Object;

    check-cast v1, Ld60/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, v1

    move-object/from16 v1, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v4, v1, Ld60/b$e;

    if-eqz v4, :cond_4

    return-object v2

    :cond_4
    instance-of v4, v1, Ld60/b$a;

    if-eqz v4, :cond_5

    iget-object v3, v0, Ld60/d$e;->F:Ld60/d;

    check-cast v1, Ld60/b$a;

    invoke-virtual {v1}, Ld60/b$a;->a()Ld60/c;

    move-result-object v1

    invoke-static {v3, v2, v1}, Ld60/d;->c(Ld60/d;Ld60/d$a;Ld60/c;)Ld60/d$a;

    move-result-object v1

    return-object v1

    :cond_5
    instance-of v4, v1, Ld60/b$c;

    if-eqz v4, :cond_7

    iget-object v4, v0, Ld60/d$e;->F:Ld60/d;

    invoke-static {v4}, Ld60/d;->f(Ld60/d;)Lps1/a;

    move-result-object v5

    check-cast v1, Ld60/b$c;

    invoke-virtual {v1}, Ld60/b$c;->a()Lj/a;

    move-result-object v1

    iput-object v9, v0, Ld60/d$e;->z:Ljava/lang/Object;

    iput-object v9, v0, Ld60/d$e;->E:Ljava/lang/Object;

    iput-object v4, v0, Ld60/d$e;->w:Ljava/lang/Object;

    iput-object v2, v0, Ld60/d$e;->x:Ljava/lang/Object;

    iput v7, v0, Ld60/d$e;->y:I

    invoke-virtual {v5, v1, v0}, Lps1/a;->d(Lj/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto :goto_2

    :cond_6
    :goto_0
    check-cast v1, Ljava/util/List;

    invoke-static {v4, v2, v1}, Ld60/d;->d(Ld60/d;Ld60/d$a;Ljava/util/List;)Ld60/d$a;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v4, v1, Ld60/b$d;

    if-eqz v4, :cond_9

    iget-object v4, v0, Ld60/d$e;->F:Ld60/d;

    invoke-static {v4}, Ld60/d;->f(Ld60/d;)Lps1/a;

    move-result-object v5

    check-cast v1, Ld60/b$d;

    invoke-virtual {v1}, Ld60/b$d;->a()Ljava/util/List;

    move-result-object v1

    iput-object v9, v0, Ld60/d$e;->z:Ljava/lang/Object;

    iput-object v9, v0, Ld60/d$e;->E:Ljava/lang/Object;

    iput-object v4, v0, Ld60/d$e;->w:Ljava/lang/Object;

    iput-object v2, v0, Ld60/d$e;->x:Ljava/lang/Object;

    iput v6, v0, Ld60/d$e;->y:I

    invoke-virtual {v5, v1, v0}, Lps1/a;->e(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto :goto_2

    :cond_8
    :goto_1
    check-cast v1, Ljava/util/List;

    invoke-static {v4, v2, v1}, Ld60/d;->d(Ld60/d;Ld60/d$a;Ljava/util/List;)Ld60/d$a;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v4, v1, Ld60/b$g;

    if-eqz v4, :cond_a

    invoke-virtual {v2}, Ld60/d$a;->e()Ld60/c;

    move-result-object v10

    sget-object v14, Ld60/e$d;->a:Ld60/e$d;

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Ld60/c;->b(Ld60/c;Ld60/a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/e;Lf60/a;ILjava/lang/Object;)Ld60/c;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Ld60/d$a;->b(Ld60/d$a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;ILjava/lang/Object;)Ld60/d$a;

    move-result-object v1

    return-object v1

    :cond_a
    instance-of v4, v1, Ld60/b$f;

    if-eqz v4, :cond_e

    iget-object v1, v0, Ld60/d$e;->F:Ld60/d;

    iput-object v2, v0, Ld60/d$e;->z:Ljava/lang/Object;

    iput-object v9, v0, Ld60/d$e;->E:Ljava/lang/Object;

    iput v5, v0, Ld60/d$e;->y:I

    invoke-static {v1, v2, v0}, Ld60/d;->i(Ld60/d;Ld60/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    :goto_2
    return-object v3

    :cond_b
    :goto_3
    move-object v14, v1

    check-cast v14, Ld60/e;

    instance-of v1, v14, Ld60/e$c;

    if-eqz v1, :cond_c

    :goto_4
    move-object v4, v8

    goto :goto_5

    :cond_c
    invoke-virtual {v2}, Ld60/d$a;->c()Ljava/util/List;

    move-result-object v8

    goto :goto_4

    :goto_5
    invoke-virtual {v2}, Ld60/d$a;->e()Ld60/c;

    move-result-object v10

    instance-of v1, v14, Ld60/e$a;

    if-eqz v1, :cond_d

    sget-object v9, Ld60/a$d;->a:Ld60/a$d;

    :cond_d
    move-object v11, v9

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    move-object v13, v4

    invoke-static/range {v10 .. v17}, Ld60/c;->b(Ld60/c;Ld60/a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/e;Lf60/a;ILjava/lang/Object;)Ld60/c;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Ld60/d$a;->b(Ld60/d$a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;ILjava/lang/Object;)Ld60/d$a;

    move-result-object v1

    return-object v1

    :cond_e
    instance-of v1, v1, Ld60/b$b;

    if-eqz v1, :cond_f

    invoke-virtual {v2}, Ld60/d$a;->e()Ld60/c;

    move-result-object v5

    sget-object v9, Ld60/e$b;->a:Ld60/e$b;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Ld60/c;->b(Ld60/c;Ld60/a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/e;Lf60/a;ILjava/lang/Object;)Ld60/c;

    move-result-object v5

    move-object v4, v8

    const/4 v6, 0x1

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Ld60/d$a;->b(Ld60/d$a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;ILjava/lang/Object;)Ld60/d$a;

    move-result-object v1

    return-object v1

    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
