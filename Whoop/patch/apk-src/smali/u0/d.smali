.class public abstract Lu0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll83/k;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lu0/d;->a:Ll83/k;

    return-void
.end method

.method public static final a(Ll3/g;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x6af76057

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x1

    if-eq v5, v6, :cond_4

    move v5, v8

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/2addr v4, v8

    invoke-virtual {v3, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v4, :cond_a

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/e;

    iget-object v9, v6, Ll3/e;->a:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/functions/Function3;

    iget v10, v6, Ll3/e;->b:I

    iget v6, v6, Ll3/e;->c:I

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v11, v12, :cond_5

    sget-object v11, Lu0/c;->a:Lu0/c;

    invoke-virtual {v3, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v11, Ly2/r0;

    iget-wide v12, v3, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    const/16 p2, 0x0

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_6

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v12, v3, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0, v10, v6}, Ll3/g;->e(II)Ll3/g;

    move-result-object v6

    iget-object v6, v6, Ll3/g;->x:Ljava/lang/String;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v6, v3, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_9
    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_a
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lso2/f;

    const/16 v5, 0xf

    invoke-direct {v4, v0, v1, v2, v5}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
