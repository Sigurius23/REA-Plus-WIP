.class public abstract Lzc1/k9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/k9;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x7f0e5b9c

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x30

    invoke-static {v2, v1, v5, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v5, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Zone Row with editable max and min"

    const/4 v10, 0x6

    invoke-static {v1, v5, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v11, v1, v2

    const-string v1, "Zone 1"

    invoke-static {v9, v11, v5, v1}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v15, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    new-instance v1, Lsz0/u1;

    const-string v21, "96"

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v3, 0x60

    invoke-direct {v1, v3, v2, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v2, Lsz0/u1;

    const-string v22, "115"

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v6, 0x73

    invoke-direct {v2, v6, v4, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    sget-object v17, Ly81/f;->STRAIN:Ly81/f;

    const-string v23, "bpm"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v12, Lsz0/s1;

    const-string v13, "ZONE_1"

    const v18, 0x3e4ccccd    # 0.2f

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    invoke-direct/range {v12 .. v20}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;)V

    move v2, v6

    move-object v1, v12

    sget v6, Lsz0/s1;->i:I

    const/16 v7, 0xe

    move v4, v2

    const/4 v2, 0x0

    move v12, v3

    const/4 v3, 0x0

    move v13, v4

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Zone Row with editable min"

    invoke-static {v1, v5, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v14, "Zone 2"

    invoke-static {v9, v11, v5, v14}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    sget-object v30, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    new-instance v1, Lsz0/u1;

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v12, v2, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v2, Lsz0/u1;

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v13, v3, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    new-instance v24, Lsz0/s1;

    const-string v25, "ZONE_2"

    move-object/from16 v27, v30

    const v30, 0x3e4ccccd    # 0.2f

    move-object/from16 v29, v27

    move-object/from16 v31, v1

    move-object/from16 v32, v2

    invoke-direct/range {v24 .. v32}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;)V

    move-object/from16 v1, v24

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Zone Row with non editable field"

    invoke-static {v1, v5, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v9, v11, v5, v14}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    new-instance v1, Lsz0/u1;

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v12, v2, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v2, Lsz0/u1;

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v13, v3, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    move-object/from16 v30, v27

    new-instance v27, Lsz0/s1;

    const-string v28, "ZONE_2"

    const v33, 0x3e4ccccd    # 0.2f

    move-object/from16 v32, v30

    move-object/from16 v34, v1

    move-object/from16 v35, v2

    invoke-direct/range {v27 .. v35}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;)V

    move-object/from16 v1, v27

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Zone Row with different line and gradient color"

    invoke-static {v1, v5, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Zone X"

    invoke-static {v9, v11, v5, v1}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    sget-object v26, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    new-instance v1, Lsz0/u1;

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v12, v2, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v2, Lsz0/u1;

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v13, v3, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    new-instance v23, Lsz0/s1;

    const-string v24, "ZONE_2"

    const v29, 0x3e4ccccd    # 0.2f

    move-object/from16 v30, v1

    move-object/from16 v31, v2

    move-object/from16 v28, v17

    invoke-direct/range {v23 .. v31}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;)V

    move-object/from16 v1, v23

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v9, v11, v5, v8}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lzc1/w8;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, Lzc1/w8;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/k9;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
