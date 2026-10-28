.class public final Lzc1/r6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/r6;->b(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 53

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    const v0, 0x123ef1b4

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v0

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v0, v4

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v0, v4, v8, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v8, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "Tiles"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v7, Lhy0/f;->LEFT:Lhy0/f;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x9

    or-int/lit16 v3, v3, 0x180

    const/16 v17, 0xf3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move/from16 v16, v3

    move-object v15, v8

    move-object v8, v0

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v0, v7

    move-object v8, v15

    const/16 v23, 0x3f

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_4

    sget-object v3, Lzc1/r6$b;->w:Lzc1/r6$b;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lh31/l;->c(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object v18, Lh31/n;->COMMITTED:Lh31/n;

    sget-object v9, Lh31/f;->COMMITTED:Lh31/f;

    sget-object v11, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    const/16 v14, 0x18

    const/4 v15, 0x0

    const-string v10, "COMMITTED"

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v21

    move-object v3, v9

    const/16 v23, 0x2d

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_5

    sget-object v6, Lzc1/r6$f;->w:Lzc1/r6$f;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lh31/l;->c(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object v18, Lh31/n;->COMPLETED:Lh31/n;

    sget-object v19, Lh31/f;->COMPLETED:Lh31/f;

    const/16 v24, 0x18

    const/16 v25, 0x0

    const-string v20, "COMPLETED"

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v21, v11

    invoke-static/range {v19 .. v25}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v5

    move-object/from16 v26, v19

    move-object/from16 v25, v21

    const/16 v23, 0x2d

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v5

    invoke-static/range {v17 .. v24}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_6

    sget-object v6, Lzc1/r6$g;->w:Lzc1/r6$g;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lh31/l;->c(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/16 v38, 0x797

    const/16 v39, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    sget-object v45, Lm83/y;->w:Lm83/y;

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v32, v45

    invoke-static/range {v27 .. v39}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v19

    invoke-static {}, Lzc1/j9;->e()Lu41/b;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const/16 v23, 0x33

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_7

    sget-object v6, Lzc1/r6$h;->w:Lzc1/r6$h;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lh31/l;->c(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lzc1/j9;->d()Lu41/b;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const/16 v23, 0x36

    const/16 v24, 0x0

    const-string v17, "recommendation-with-zone-bars"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_8

    sget-object v6, Lzc1/r6$i;->w:Lzc1/r6$i;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lh31/l;->c(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Header"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v14, 0x0

    const/16 v17, 0xf3

    move-object v15, v8

    move-object v8, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    move-object v7, v0

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v15

    const/16 v23, 0x2b

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Li31/c;->p(Ljava/lang/String;Ljava/lang/String;ZZZLm91/u;ILjava/lang/Object;)Li31/g;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Li31/c;->h(Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/16 v23, 0x2f

    const/16 v19, 0x0

    invoke-static/range {v17 .. v24}, Li31/c;->p(Ljava/lang/String;Ljava/lang/String;ZZZLm91/u;ILjava/lang/Object;)Li31/g;

    move-result-object v5

    invoke-static/range {v5 .. v10}, Li31/c;->h(Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/16 v38, 0x7ff

    const/16 v39, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static/range {v27 .. v39}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v5

    invoke-static/range {v5 .. v10}, Li31/c;->h(Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/16 v51, 0x797

    const/16 v52, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-static/range {v40 .. v52}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v5

    invoke-static/range {v5 .. v10}, Li31/c;->h(Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Button"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v17, 0xf3

    move-object v8, v5

    const/4 v5, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v7, v0

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v15

    sget-object v9, Lh31/f;->UNCOMMITTED:Lh31/f;

    const/16 v14, 0x1c

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v10, "COMMIT"

    invoke-static/range {v9 .. v15}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v5

    move-object v0, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_9

    sget-object v6, Lzc1/r6$j;->w:Lzc1/r6$j;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v7, Lh31/g;->g:I

    or-int/lit8 v9, v7, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lh31/e;->d(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move v5, v9

    const/16 v14, 0x18

    const/4 v15, 0x0

    const-string v10, "COMMITTED"

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v3

    move-object/from16 v11, v25

    invoke-static/range {v9 .. v15}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v3

    move-object/from16 v21, v11

    move-object v11, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_a

    sget-object v6, Lzc1/r6$k;->w:Lzc1/r6$k;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v10, 0x4

    move v9, v5

    move-object v5, v3

    invoke-static/range {v5 .. v10}, Lh31/e;->d(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/16 v24, 0x18

    const/16 v25, 0x0

    const-string v20, "COMPLETED"

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v26

    invoke-static/range {v19 .. v25}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_b

    sget-object v3, Lzc1/r6$l;->w:Lzc1/r6$l;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v10, 0x4

    invoke-static/range {v5 .. v10}, Lh31/e;->d(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move v5, v9

    sget-object v13, Lh31/c;->LIST:Lh31/c;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const-string v10, "COMMITTED"

    const/4 v12, 0x0

    move-object v9, v11

    move-object/from16 v11, v21

    invoke-static/range {v9 .. v15}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_c

    sget-object v6, Lzc1/r6$m;->w:Lzc1/r6$m;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v10, 0x4

    move v9, v5

    move-object v5, v3

    invoke-static/range {v5 .. v10}, Lh31/e;->d(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object v14, Lh31/f;->LOADING:Lh31/f;

    const/16 v19, 0x1c

    const/16 v20, 0x0

    const-string v15, "COMMIT"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_d

    sget-object v3, Lzc1/r6$c;->w:Lzc1/r6$c;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v10, 0x4

    invoke-static/range {v5 .. v10}, Lh31/e;->d(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/16 v17, 0xc

    const/16 v18, 0x0

    move-object/from16 v16, v13

    const-string v13, "COMMIT"

    move-object v12, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v18}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_e

    sget-object v3, Lzc1/r6$d;->w:Lzc1/r6$d;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v10, 0x4

    invoke-static/range {v5 .. v10}, Lh31/e;->d(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move v5, v9

    const/16 v14, 0x14

    const/4 v15, 0x0

    const-string v10, "COMMIT"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v0

    invoke-static/range {v9 .. v15}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_f

    sget-object v3, Lzc1/r6$e;->w:Lzc1/r6$e;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v10, 0x4

    move v9, v5

    move-object v5, v0

    invoke-static/range {v5 .. v10}, Lh31/e;->d(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_10
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lzc1/r6$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
