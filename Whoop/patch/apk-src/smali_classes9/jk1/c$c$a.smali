.class public final Ljk1/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljk1/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Ljk1/c;


# direct methods
.method public constructor <init>(Lec3/m;Ljk1/c;)V
    .locals 0

    iput-object p2, p0, Ljk1/c$c$a;->x:Ljk1/c;

    iput-object p1, p0, Ljk1/c$c$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Ljk1/c$c$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljk1/c$c$a$a;

    iget v3, v2, Ljk1/c$c$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ljk1/c$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Ljk1/c$c$a$a;

    invoke-direct {v2, v0, v1}, Ljk1/c$c$a$a;-><init>(Ljk1/c$c$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Ljk1/c$c$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ljk1/c$c$a$a;->x:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    check-cast v3, Lik1/h;

    iget-object v3, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v3, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    check-cast v3, Ljk1/d;

    iget-object v2, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Ljk1/c$c$a$a;->I:I

    iget-object v6, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lik1/h;

    iget-object v7, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v8, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    check-cast v8, Ljk1/d;

    iget-object v8, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lq83/d;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget v4, v2, Ljk1/c$c$a$a;->I:I

    iget-object v7, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lik1/h;

    iget-object v8, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v10, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    check-cast v10, Ljk1/d;

    iget-object v10, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v10, Lq83/d;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    iget v4, v2, Ljk1/c$c$a$a;->I:I

    iget-object v8, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    check-cast v8, Lik1/h;

    iget-object v10, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v10, Lec3/m;

    iget-object v11, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    check-cast v11, Ljk1/d;

    iget-object v11, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v11, Lq83/d;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v10

    goto/16 :goto_3

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ljk1/c$c$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Ljk1/d;

    invoke-virtual {v4}, Ljk1/d;->b()Lik1/h;

    move-result-object v10

    instance-of v10, v10, Lik1/h$c;

    if-eqz v10, :cond_6

    iget-object v10, v0, Ljk1/c$c$a;->x:Ljk1/c;

    invoke-virtual {v4}, Ljk1/d;->b()Lik1/h;

    move-result-object v11

    check-cast v11, Lik1/h$c;

    invoke-static {v10, v11}, Ljk1/c;->a(Ljk1/c;Lik1/h$c;)Lik1/h$c;

    move-result-object v10

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Ljk1/d;->b()Lik1/h;

    move-result-object v10

    :goto_1
    invoke-virtual {v4}, Ljk1/d;->c()Lc51/s;

    move-result-object v11

    const/4 v12, 0x0

    if-eqz v11, :cond_a

    instance-of v11, v10, Lik1/h$c;

    if-eqz v11, :cond_a

    move-object v13, v10

    check-cast v13, Lik1/h$c;

    invoke-virtual {v13}, Lik1/h$c;->d()Lik1/d;

    move-result-object v14

    if-eqz v14, :cond_7

    invoke-virtual {v4}, Ljk1/d;->c()Lc51/s;

    move-result-object v17

    const/16 v25, 0x3fb

    const/16 v26, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v14 .. v26}, Lik1/d;->b(Lik1/d;Lcom/whoop/design/models/items/DateSelectorModel;ZLc51/s;Lik1/a;Ljava/util/List;Ljava/util/List;ZZLik1/c;ZILjava/lang/Object;)Lik1/d;

    move-result-object v4

    move-object v15, v4

    goto :goto_2

    :cond_7
    move-object v15, v9

    :goto_2
    const/16 v19, 0x1d

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Lik1/h$c;->c(Lik1/h$c;Lik1/i;Lik1/d;Lcom/whoop/healthspan/domain/models/LockedContentViewState;ZLep0/j;ILjava/lang/Object;)Lik1/h$c;

    move-result-object v4

    iput-object v9, v2, Ljk1/c$c$a$a;->z:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v1, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v10, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    iput v12, v2, Ljk1/c$c$a$a;->I:I

    iput v8, v2, Ljk1/c$c$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_8

    goto :goto_7

    :cond_8
    move-object v8, v10

    move v4, v12

    :goto_3
    iput-object v9, v2, Ljk1/c$c$a$a;->z:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v1, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v8, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    iput v4, v2, Ljk1/c$c$a$a;->I:I

    iput v7, v2, Ljk1/c$c$a$a;->x:I

    const-wide/16 v10, 0xa

    invoke-static {v10, v11, v2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_9

    goto :goto_7

    :cond_9
    move-object v7, v8

    move-object v8, v1

    :goto_4
    move-object v1, v8

    goto :goto_5

    :cond_a
    move-object v7, v10

    move v4, v12

    :goto_5
    iput-object v9, v2, Ljk1/c$c$a$a;->z:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v1, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v7, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    iput v4, v2, Ljk1/c$c$a$a;->I:I

    iput v6, v2, Ljk1/c$c$a$a;->x:I

    invoke-interface {v1, v7, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_b

    goto :goto_7

    :cond_b
    move-object v6, v7

    move-object v7, v1

    :goto_6
    instance-of v1, v6, Lik1/h$c;

    if-eqz v1, :cond_c

    iget-object v1, v0, Ljk1/c$c$a;->x:Ljk1/c;

    check-cast v6, Lik1/h$c;

    iput-object v9, v2, Ljk1/c$c$a$a;->z:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v9, v2, Ljk1/c$c$a$a;->H:Ljava/lang/Object;

    iput v4, v2, Ljk1/c$c$a$a;->I:I

    iput v5, v2, Ljk1/c$c$a$a;->x:I

    invoke-static {v1, v7, v6, v2}, Ljk1/c;->b(Ljk1/c;Lec3/m;Lik1/h$c;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_c

    :goto_7
    return-object v3

    :cond_c
    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
