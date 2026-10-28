.class public final Lh0/q0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lkotlin/jvm/internal/b0;

.field public final synthetic G:Lkotlin/jvm/internal/g0;

.field public final synthetic H:Lkotlin/jvm/internal/g0;

.field public x:Lu2/k;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/q0;->F:Lkotlin/jvm/internal/b0;

    iput-object p2, p0, Lh0/q0;->G:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lh0/q0;->H:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Lh0/q0;

    iget-object v1, p0, Lh0/q0;->G:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lh0/q0;->H:Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Lh0/q0;->F:Lkotlin/jvm/internal/b0;

    invoke-direct {v0, v3, v1, v2, p2}, Lh0/q0;-><init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object p1, v0, Lh0/q0;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/q0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/q0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/q0;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, v0, Lh0/q0;->y:I

    iget-object v7, v0, Lh0/q0;->x:Lu2/k;

    iget-object v8, v0, Lh0/q0;->E:Ljava/lang/Object;

    check-cast v8, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v5, v6

    move-object/from16 v6, p1

    goto/16 :goto_8

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lh0/q0;->y:I

    iget-object v7, v0, Lh0/q0;->E:Ljava/lang/Object;

    check-cast v7, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lh0/q0;->E:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    move-object v7, v2

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_13

    sget-object v8, Lu2/l;->x:Lu2/l;

    iput-object v7, v0, Lh0/q0;->E:Ljava/lang/Object;

    iput-object v3, v0, Lh0/q0;->x:Lu2/k;

    iput v2, v0, Lh0/q0;->y:I

    iput v6, v0, Lh0/q0;->z:I

    check-cast v7, Lu2/g0;

    invoke-virtual {v7, v8, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_3

    goto/16 :goto_7

    :cond_3
    :goto_1
    check-cast v8, Lu2/k;

    iget-object v9, v8, Lu2/k;->a:Ljava/lang/Object;

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_5

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu2/r;

    invoke-static {v12}, Lu2/d0;->e(Lu2/r;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_5
    move v2, v6

    :goto_3
    iget-object v9, v8, Lu2/k;->a:Ljava/lang/Object;

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_8

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu2/r;

    invoke-virtual {v12}, Lu2/r;->l()Z

    move-result v13

    if-nez v13, :cond_7

    move-object v13, v7

    check-cast v13, Lu2/g0;

    iget-object v14, v13, Lu2/g0;->F:Lu2/h0;

    iget-wide v14, v14, Lu2/h0;->Y:J

    invoke-virtual {v13}, Lu2/g0;->b()J

    move-result-wide v5

    invoke-static {v12, v14, v15, v5, v6}, Lu2/d0;->h(Lu2/r;JJ)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v11, v11, 0x1

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    const/4 v2, 0x1

    :cond_8
    iget v5, v8, Lu2/k;->c:I

    if-ne v5, v4, :cond_9

    iget-object v2, v0, Lh0/q0;->F:Lkotlin/jvm/internal/b0;

    const/4 v5, 0x1

    iput-boolean v5, v2, Lkotlin/jvm/internal/b0;->w:Z

    move v2, v5

    goto :goto_6

    :cond_9
    const/4 v5, 0x1

    :goto_6
    sget-object v6, Lu2/l;->y:Lu2/l;

    iput-object v7, v0, Lh0/q0;->E:Ljava/lang/Object;

    iput-object v8, v0, Lh0/q0;->x:Lu2/k;

    iput v2, v0, Lh0/q0;->y:I

    iput v4, v0, Lh0/q0;->z:I

    check-cast v7, Lu2/g0;

    invoke-virtual {v7, v6, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_a

    :goto_7
    return-object v1

    :cond_a
    move-object/from16 v16, v8

    move-object v8, v7

    move-object/from16 v7, v16

    :goto_8
    check-cast v6, Lu2/k;

    iget-object v6, v6, Lu2/k;->a:Ljava/lang/Object;

    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_9
    if-ge v10, v9, :cond_c

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lu2/r;

    invoke-virtual {v11}, Lu2/r;->l()Z

    move-result v11

    if-eqz v11, :cond_b

    move v2, v5

    goto :goto_a

    :cond_b
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_c
    :goto_a
    iget-object v6, v0, Lh0/q0;->G:Lkotlin/jvm/internal/g0;

    iget-object v9, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lu2/r;

    iget-wide v9, v9, Lu2/r;->a:J

    invoke-static {v7, v9, v10}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v9

    iget-object v7, v7, Lu2/k;->a:Ljava/lang/Object;

    iget-object v10, v0, Lh0/q0;->H:Lkotlin/jvm/internal/g0;

    if-eqz v9, :cond_10

    move-object v9, v7

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_b
    if-ge v11, v9, :cond_e

    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lu2/r;

    iget-boolean v13, v13, Lu2/r;->d:Z

    if-eqz v13, :cond_d

    goto :goto_c

    :cond_d
    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    :cond_e
    move-object v12, v3

    :goto_c
    check-cast v12, Lu2/r;

    if-eqz v12, :cond_f

    iput-object v12, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v12, v10, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_f

    :cond_f
    move v2, v5

    move v6, v2

    move-object v7, v8

    goto/16 :goto_0

    :cond_10
    move-object v9, v7

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_d
    if-ge v11, v9, :cond_12

    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lu2/r;

    iget-wide v13, v13, Lu2/r;->a:J

    iget-object v15, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v15, Lu2/r;

    iget-wide v3, v15, Lu2/r;->a:J

    invoke-static {v13, v14, v3, v4}, Lu2/q;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_e

    :cond_11
    add-int/lit8 v11, v11, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    goto :goto_d

    :cond_12
    const/4 v12, 0x0

    :goto_e
    iput-object v12, v10, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_f
    move v6, v5

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x2

    goto/16 :goto_0

    :cond_13
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
