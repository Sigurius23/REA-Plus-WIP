.class public final Lb30/c2;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lm40/w;

.field public final synthetic F:Z

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Ljava/util/List;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:I

.field public final synthetic y:Lq20/c;

.field public final synthetic z:F


# direct methods
.method public constructor <init>(Ljava/util/List;ILq20/c;FLm40/w;ZLkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lb30/c2;->w:Ljava/util/List;

    iput p2, p0, Lb30/c2;->x:I

    iput-object p3, p0, Lb30/c2;->y:Lq20/c;

    iput p4, p0, Lb30/c2;->z:F

    iput-object p5, p0, Lb30/c2;->E:Lm40/w;

    iput-boolean p6, p0, Lb30/c2;->F:Z

    iput-object p7, p0, Lb30/c2;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lb30/c2;->H:Ljava/util/List;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object/from16 v3, p3

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    move-object v5, v3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v4

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    and-int/lit8 v4, v4, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    move-object v4, v3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v1, 0x93

    const/16 v6, 0x92

    if-ne v4, v6, :cond_5

    move-object v4, v3

    check-cast v4, Lp1/q;

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_5
    :goto_3
    iget-object v4, v0, Lb30/c2;->w:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu00/f;

    check-cast v3, Lp1/q;

    const v6, -0x3fcc84a1

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    iget-object v6, v4, Lu00/f;->a:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PaymentMethodsUITestTag"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const v6, -0x7cac7b98

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    iget v6, v4, Lu00/f;->d:I

    iget-object v7, v4, Lu00/f;->e:Ljava/lang/Integer;

    iget-object v8, v4, Lu00/f;->j:Ljava/lang/Integer;

    invoke-static {v6, v7, v8, v3}, Lx43/j;->H(ILjava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;)I

    move-result v7

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    const v8, -0x1bcbdfcb

    invoke-virtual {v3, v8}, Lp1/q;->e0(I)V

    iget-object v8, v4, Lu00/f;->f:Ljava/lang/String;

    iget-object v9, v4, Lu00/f;->g:Ljava/lang/String;

    const v10, -0xc01f75b

    invoke-virtual {v3, v10}, Lp1/q;->e0(I)V

    const v10, -0x5b23d4c6

    invoke-virtual {v3, v10}, Lp1/q;->e0(I)V

    invoke-static {v3}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v10

    iget-wide v10, v10, Ld40/n;->a:J

    invoke-static {v10, v11}, Li2/w0;->x(J)F

    move-result v10

    float-to-double v10, v10

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    cmpg-double v10, v10, v12

    const/4 v11, 0x1

    if-gez v10, :cond_6

    move v10, v11

    goto :goto_4

    :cond_6
    move v10, v6

    :goto_4
    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    if-eqz v10, :cond_7

    if-eqz v9, :cond_7

    move-object v8, v9

    :cond_7
    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    iget-object v9, v4, Lu00/f;->c:Lzy/c;

    invoke-static {v9, v3}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v10

    iget v9, v0, Lb30/c2;->x:I

    if-ne v2, v9, :cond_8

    move v9, v11

    goto :goto_5

    :cond_8
    move v9, v11

    move v11, v6

    :goto_5
    iget-boolean v13, v4, Lu00/f;->h:Z

    iget-object v12, v0, Lb30/c2;->y:Lq20/c;

    if-eqz v12, :cond_9

    iget-object v4, v4, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v12, v4}, Lq20/c;->b(Ljava/lang/String;)Lq20/c;

    move-result-object v4

    if-eqz v4, :cond_9

    iget-object v4, v4, Lq20/c;->x:Ljava/lang/String;

    :goto_6
    move-object v14, v4

    goto :goto_7

    :cond_9
    const/4 v4, 0x0

    goto :goto_6

    :goto_7
    const v4, 0x4001fb0d

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lb30/c2;->G:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    iget-object v9, v0, Lb30/c2;->H:Ljava/util/List;

    invoke-virtual {v3, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v12, v12, v16

    and-int/lit8 v16, v1, 0x70

    xor-int/lit8 v6, v16, 0x30

    if-le v6, v5, :cond_a

    invoke-virtual {v3, v2}, Lp1/q;->e(I)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    and-int/lit8 v1, v1, 0x30

    if-ne v1, v5, :cond_c

    :cond_b
    const/4 v1, 0x1

    goto :goto_8

    :cond_c
    const/4 v1, 0x0

    :goto_8
    or-int/2addr v1, v12

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_d

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v5, v1, :cond_e

    :cond_d
    new-instance v5, Lb30/a2;

    const/4 v1, 0x0

    invoke-direct {v5, v4, v9, v2, v1}, Lb30/a2;-><init>(Ljava/lang/Object;Ljava/util/List;II)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v16, v5

    check-cast v16, Lc93/a;

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    const/16 v18, 0x1000

    iget v6, v0, Lb30/c2;->z:F

    iget-object v9, v0, Lb30/c2;->E:Lm40/w;

    iget-boolean v12, v0, Lb30/c2;->F:Z

    move-object/from16 v17, v3

    invoke-static/range {v6 .. v18}, Lbi/g;->c(FILjava/lang/String;Lm40/w;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
