.class public abstract Lo42/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ln42/b;",
        "account",
        "Lkotlin/Function1;",
        "Lj42/a;",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Ln42/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "privacy-consent_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ln42/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lo42/c;->d(Lkotlin/jvm/functions/Function1;Ln42/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ln42/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lo42/c;->e(Ln42/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ln42/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln42/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "account"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v3, 0x78027517

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v10, 0x0

    if-eq v6, v8, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    move v6, v10

    :goto_3
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v9, v12, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const-wide/high16 v14, 0x4004000000000000L    # 2.5

    double-to-float v14, v14

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v14, v15

    const/4 v4, 0x0

    invoke-static {v13, v14, v4, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v17, v8

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_5

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v9, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    :cond_6
    invoke-static {v5, v9, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln42/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v9, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v11, Lx81/d;->a:Lx81/d;

    move-object/from16 v21, v5

    sget v5, Lx81/d;->b:I

    invoke-virtual {v11, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->y()J

    move-result-wide v22

    invoke-virtual {v11, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Lb91/d;->r()Lb91/a;

    move-result-object v24

    sget v25, Lb91/a;->d:I

    shl-int/lit8 v28, v25, 0x12

    const v29, 0x2fffa

    move/from16 v17, v5

    const/4 v5, 0x0

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    move/from16 v27, v10

    const/4 v10, 0x0

    move-object/from16 v30, v11

    const/4 v11, 0x0

    move-object/from16 v31, v12

    const/4 v12, 0x0

    move-object/from16 v32, v13

    const/16 v33, 0x2

    const-wide/16 v13, 0x0

    move/from16 v34, v15

    const/4 v15, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    move/from16 v36, v17

    const/16 v37, 0x20

    const-wide/16 v17, 0x0

    const/16 v38, 0x0

    const/16 v19, 0x0

    const/16 v39, 0x1

    const/16 v20, 0x0

    move-object/from16 v40, v21

    const/16 v21, 0x0

    move-object/from16 v41, v6

    move-wide/from16 v50, v22

    move-object/from16 v23, v7

    move-wide/from16 v6, v50

    const/16 v22, 0x0

    move-object/from16 v42, v23

    const/16 v23, 0x0

    move-object/from16 v43, v25

    const/16 v25, 0x0

    move/from16 v44, v27

    const/16 v27, 0x0

    move/from16 v45, v3

    move-object/from16 v2, v30

    move-object/from16 v0, v31

    move-object/from16 v46, v32

    move/from16 v1, v33

    move/from16 v3, v36

    move-object/from16 v48, v40

    move-object/from16 v47, v41

    move/from16 v49, v44

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    int-to-float v1, v1

    const/4 v4, 0x4

    int-to-float v12, v4

    invoke-static {v1, v12, v0, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x1

    int-to-float v6, v5

    invoke-static {v4, v6, v12}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v5

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    mul-float v1, v1, v34

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    new-instance v14, Lj0/j;

    invoke-direct {v14}, Lj0/j;-><init>()V

    and-int/lit8 v1, v45, 0x70

    const/16 v4, 0x20

    if-ne v1, v4, :cond_8

    const/4 v10, 0x1

    :goto_5
    move-object/from16 v1, p0

    goto :goto_6

    :cond_8
    const/4 v10, 0x0

    goto :goto_5

    :goto_6
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_9

    goto :goto_7

    :cond_9
    move-object/from16 v6, p1

    goto :goto_8

    :cond_a
    :goto_7
    new-instance v5, Lmi2/o;

    const/16 v4, 0x16

    move-object/from16 v6, p1

    invoke-direct {v5, v4, v6, v1}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    move-object/from16 v18, v5

    check-cast v18, Lc93/a;

    const/16 v19, 0x1c

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v5, v9, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_b

    move-object/from16 v10, v43

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v10, v42

    goto :goto_a

    :cond_b
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v9, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v46

    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    move-object/from16 v5, v47

    goto :goto_c

    :cond_d
    :goto_b
    move-object/from16 v5, v48

    goto :goto_d

    :goto_c
    invoke-static {v7, v9, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v9, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0xbe0040c

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ln42/b;->d()I

    move-result v4

    const/4 v5, 0x6

    int-to-float v7, v5

    mul-float/2addr v7, v12

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v4, v9, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v10

    move-object v6, v7

    move-wide v7, v10

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const-string v5, ""

    invoke-static/range {v4 .. v11}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x0

    invoke-static {v12, v12, v0, v9, v4}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    invoke-virtual {v1}, Ln42/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v4, v49

    invoke-static {v0, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v24

    const/16 v27, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_e
    move-object/from16 v50, v1

    move-object v1, v0

    move-object/from16 v0, v50

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_f

    new-instance v3, Lo42/b;

    const/4 v4, 0x0

    move/from16 v5, p3

    invoke-direct {v3, v1, v0, v5, v4}, Lo42/b;-><init>(Ln42/b;Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ln42/b;)Ll83/a0;
    .locals 1

    new-instance v0, Lj42/a$e;

    invoke-virtual {p1}, Ln42/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lj42/a$e;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ln42/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lo42/c;->c(Ln42/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
