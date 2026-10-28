.class public final Lm83/m0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public F:I

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:Ljava/util/Iterator;

.field public x:Ljava/lang/Object;

.field public y:Ljava/util/Iterator;

.field public z:I


# direct methods
.method public constructor <init>(IILjava/util/Iterator;Lq83/d;)V
    .locals 0

    iput p1, p0, Lm83/m0;->H:I

    iput p2, p0, Lm83/m0;->I:I

    iput-object p3, p0, Lm83/m0;->J:Ljava/util/Iterator;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Lm83/m0;

    iget v1, p0, Lm83/m0;->I:I

    iget-object v2, p0, Lm83/m0;->J:Ljava/util/Iterator;

    iget v3, p0, Lm83/m0;->H:I

    invoke-direct {v0, v3, v1, v2, p2}, Lm83/m0;-><init>(IILjava/util/Iterator;Lq83/d;)V

    iput-object p1, v0, Lm83/m0;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm83/m0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm83/m0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm83/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lm83/m0;->G:Ljava/lang/Object;

    check-cast v1, Lxb3/j;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lm83/m0;->F:I

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    iget v8, v0, Lm83/m0;->I:I

    const/4 v9, 0x1

    iget v10, v0, Lm83/m0;->H:I

    const/4 v11, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v9, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lm83/m0;->x:Ljava/lang/Object;

    check-cast v1, Lm83/l0;

    :goto_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v3, v0, Lm83/m0;->E:I

    iget v6, v0, Lm83/m0;->z:I

    iget-object v7, v0, Lm83/m0;->x:Ljava/lang/Object;

    check-cast v7, Lm83/l0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v7, v8}, Lm83/l0;->c(I)V

    goto/16 :goto_5

    :cond_2
    iget v3, v0, Lm83/m0;->E:I

    iget v7, v0, Lm83/m0;->z:I

    iget-object v12, v0, Lm83/m0;->y:Ljava/util/Iterator;

    iget-object v13, v0, Lm83/m0;->x:Ljava/lang/Object;

    check-cast v13, Lm83/l0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v13, v8}, Lm83/l0;->c(I)V

    goto/16 :goto_3

    :cond_3
    iget-object v1, v0, Lm83/m0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    goto :goto_0

    :cond_4
    iget v3, v0, Lm83/m0;->E:I

    iget v4, v0, Lm83/m0;->z:I

    iget-object v5, v0, Lm83/m0;->y:Ljava/util/Iterator;

    iget-object v6, v0, Lm83/m0;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    move v12, v3

    goto :goto_2

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/16 v3, 0x400

    if-le v10, v3, :cond_6

    goto :goto_1

    :cond_6
    move v3, v10

    :goto_1
    sub-int v12, v8, v10

    iget-object v13, v0, Lm83/m0;->J:Ljava/util/Iterator;

    const/4 v14, 0x0

    if-ltz v12, :cond_a

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v3

    move-object v5, v13

    move v3, v14

    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    if-lez v3, :cond_8

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ne v8, v10, :cond_7

    iput-object v1, v0, Lm83/m0;->G:Ljava/lang/Object;

    iput-object v6, v0, Lm83/m0;->x:Ljava/lang/Object;

    iput-object v5, v0, Lm83/m0;->y:Ljava/util/Iterator;

    iput v4, v0, Lm83/m0;->z:I

    iput v12, v0, Lm83/m0;->E:I

    iput v9, v0, Lm83/m0;->F:I

    invoke-virtual {v1, v6, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v2

    :cond_9
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_12

    iput-object v11, v0, Lm83/m0;->G:Ljava/lang/Object;

    iput-object v11, v0, Lm83/m0;->x:Ljava/lang/Object;

    iput-object v11, v0, Lm83/m0;->y:Ljava/util/Iterator;

    iput v4, v0, Lm83/m0;->z:I

    iput v12, v0, Lm83/m0;->E:I

    iput v7, v0, Lm83/m0;->F:I

    invoke-virtual {v1, v6, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v2

    :cond_a
    new-instance v7, Lm83/l0;

    new-array v15, v3, [Ljava/lang/Object;

    invoke-direct {v7, v14, v15}, Lm83/l0;-><init>(I[Ljava/lang/Object;)V

    move-object/from16 v18, v7

    move v7, v3

    move v3, v12

    move-object v12, v13

    move-object/from16 v13, v18

    :goto_3
    iget v14, v13, Lm83/l0;->x:I

    iget-object v15, v13, Lm83/l0;->w:[Ljava/lang/Object;

    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_10

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move/from16 v17, v9

    invoke-virtual {v13}, Lm83/l0;->a()I

    move-result v9

    if-eq v9, v14, :cond_f

    iget v9, v13, Lm83/l0;->y:I

    iget v4, v13, Lm83/l0;->z:I

    add-int/2addr v9, v4

    rem-int/2addr v9, v14

    aput-object v16, v15, v9

    add-int/lit8 v4, v4, 0x1

    iput v4, v13, Lm83/l0;->z:I

    invoke-virtual {v13}, Lm83/l0;->a()I

    move-result v4

    if-ne v4, v14, :cond_d

    iget v4, v13, Lm83/l0;->z:I

    if-ge v4, v10, :cond_e

    shr-int/lit8 v4, v14, 0x1

    add-int/2addr v14, v4

    add-int/lit8 v14, v14, 0x1

    if-le v14, v10, :cond_b

    move v14, v10

    :cond_b
    iget v4, v13, Lm83/l0;->y:I

    if-nez v4, :cond_c

    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v9, "copyOf(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_c
    new-array v4, v14, [Ljava/lang/Object;

    invoke-virtual {v13, v4}, Lm83/l0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    :goto_4
    new-instance v9, Lm83/l0;

    iget v13, v13, Lm83/l0;->z:I

    invoke-direct {v9, v13, v4}, Lm83/l0;-><init>(I[Ljava/lang/Object;)V

    move-object v13, v9

    :cond_d
    move/from16 v9, v17

    const/4 v4, 0x5

    goto :goto_3

    :cond_e
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lm83/m0;->G:Ljava/lang/Object;

    iput-object v13, v0, Lm83/m0;->x:Ljava/lang/Object;

    iput-object v12, v0, Lm83/m0;->y:Ljava/util/Iterator;

    iput v7, v0, Lm83/m0;->z:I

    iput v3, v0, Lm83/m0;->E:I

    iput v6, v0, Lm83/m0;->F:I

    invoke-virtual {v1, v4, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v2

    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "ring buffer is full"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    move v6, v7

    move-object v7, v13

    :goto_5
    iget v4, v7, Lm83/l0;->z:I

    if-le v4, v8, :cond_11

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lm83/m0;->G:Ljava/lang/Object;

    iput-object v7, v0, Lm83/m0;->x:Ljava/lang/Object;

    iput-object v11, v0, Lm83/m0;->y:Ljava/util/Iterator;

    iput v6, v0, Lm83/m0;->z:I

    iput v3, v0, Lm83/m0;->E:I

    iput v5, v0, Lm83/m0;->F:I

    invoke-virtual {v1, v4, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v2

    :cond_11
    invoke-virtual {v7}, Lm83/a;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_12

    iput-object v11, v0, Lm83/m0;->G:Ljava/lang/Object;

    iput-object v11, v0, Lm83/m0;->x:Ljava/lang/Object;

    iput-object v11, v0, Lm83/m0;->y:Ljava/util/Iterator;

    iput v6, v0, Lm83/m0;->z:I

    iput v3, v0, Lm83/m0;->E:I

    const/4 v3, 0x5

    iput v3, v0, Lm83/m0;->F:I

    invoke-virtual {v1, v7, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v2

    :cond_12
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
