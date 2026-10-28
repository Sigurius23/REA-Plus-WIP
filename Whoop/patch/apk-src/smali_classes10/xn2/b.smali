.class public abstract Lxn2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lxn2/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "c",
        "(Lxn2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lxn2/c;",
        "f",
        "()Lxn2/c;",
        "buyNowCheckoutInfoPreviewViewState",
        "universal-checkout_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lxn2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lxn2/c;

    const-string v1, "Total Due"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "$49.00"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "View full checkout"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v5, "Includes shipping, taxes and fees."

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lxn2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;)V

    sput-object v0, Lxn2/b;->a:Lxn2/c;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lxn2/b;->d(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxn2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lxn2/b;->e(Lxn2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lxn2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxn2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v3, -0x114bfec

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v4, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v4

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit16 v8, v3, 0x93

    const/16 v9, 0x92

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_19

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_9

    move-object v5, v8

    goto :goto_7

    :cond_9
    move-object v5, v7

    :goto_7
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v12, 0x3f000000    # 0.5f

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v13, v12

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v12, v13, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-eqz v6, :cond_a

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v0, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v0, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v13, v0, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Ll0/m;->g:Ll0/h;

    sget-object v13, Lb2/e;->K:Lb2/l;

    const/16 v1, 0x36

    invoke-static {v11, v13, v0, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v1, v0, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 v31, v3

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-eqz v3, :cond_d

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v0, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-nez v2, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    invoke-static {v1, v0, v1, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v0, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lxn2/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v0, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v3, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->P()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v18

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v29, v9, 0x12

    const v30, 0x2fffa

    move-object v9, v6

    const/4 v6, 0x0

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    const-wide/16 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v27, v14

    move-object/from16 v26, v15

    const-wide/16 v14, 0x0

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/16 v32, 0x1

    const/16 v17, 0x0

    move/from16 v33, v7

    move-object/from16 v34, v8

    move-wide/from16 v7, v18

    const-wide/16 v18, 0x0

    move-object/from16 v35, v20

    const/16 v20, 0x0

    move-object/from16 v36, v21

    const/16 v21, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    move-object/from16 v38, v23

    const/16 v23, 0x0

    move-object/from16 v39, v24

    const/16 v24, 0x0

    move-object/from16 v40, v26

    const/16 v26, 0x0

    move/from16 v41, v28

    const/16 v28, 0x0

    move-object/from16 p2, v5

    move-object/from16 v42, v27

    move/from16 v4, v32

    move-object/from16 v43, v36

    move-object/from16 v27, v0

    move-object v5, v1

    move/from16 v0, v33

    move-object/from16 v1, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual/range {p0 .. p0}, Lxn2/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v5, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->P()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v5, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    move-object v5, v6

    const/4 v6, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v37

    move-object/from16 v8, v39

    const/16 v9, 0x36

    invoke-static {v7, v8, v5, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_10

    move-object/from16 v10, v40

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v10, v35

    goto :goto_b

    :cond_10
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v5, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v38

    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    :cond_11
    move-object/from16 v7, v42

    goto :goto_d

    :cond_12
    :goto_c
    move-object/from16 v7, v43

    goto :goto_e

    :goto_d
    invoke-static {v8, v5, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v5, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lxn2/c;->a()Lcom/whoop/navigation/e;

    move-result-object v6

    if-nez v6, :cond_13

    const v6, 0x7e0355f8

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    const/4 v6, 0x0

    move-object/from16 v9, p1

    move-object v12, v1

    move-object v8, v6

    goto :goto_12

    :cond_13
    const v7, 0x7e0355f9

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v31, 0x70

    const/16 v8, 0x20

    if-ne v7, v8, :cond_14

    move v10, v4

    goto :goto_f

    :cond_14
    const/4 v10, 0x0

    :goto_f
    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_16

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_15

    goto :goto_10

    :cond_15
    move-object/from16 v9, p1

    goto :goto_11

    :cond_16
    :goto_10
    new-instance v8, Lck1/l;

    const/16 v7, 0xe

    move-object/from16 v9, p1

    invoke-direct {v8, v9, v6, v7}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object/from16 v16, v8

    check-cast v16, Lc93/a;

    const/16 v17, 0xf

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v12, v1

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    move-object v8, v1

    :goto_12
    if-nez v8, :cond_17

    move-object v6, v12

    goto :goto_13

    :cond_17
    move-object v6, v8

    :goto_13
    invoke-virtual/range {p0 .. p0}, Lxn2/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v5, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v5, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v5, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, Lxn2/c;->a()Lcom/whoop/navigation/e;

    move-result-object v10

    if-eqz v10, :cond_18

    sget-object v10, Lw3/l;->c:Lw3/l;

    :goto_14
    move-object/from16 v16, v10

    goto :goto_15

    :cond_18
    sget-object v10, Lw3/l;->b:Lw3/l;

    goto :goto_14

    :goto_15
    const/16 v28, 0x0

    const v30, 0x2fef8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v27, v5

    move-object v5, v1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual/range {p0 .. p0}, Lxn2/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v5, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v5, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v5, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    const v30, 0x2fffa

    const/4 v6, 0x0

    const/16 v16, 0x0

    move-object v5, v1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    goto :goto_16

    :cond_19
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v7

    :goto_16
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lwr0/f;

    const/16 v6, 0xe

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(Ljava/lang/Object;Ll83/e;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    new-instance v0, Lwn2/e$j;

    invoke-direct {v0, p1}, Lwn2/e$j;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lxn2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lxn2/b;->c(Lxn2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f()Lxn2/c;
    .locals 1

    sget-object v0, Lxn2/b;->a:Lxn2/c;

    return-object v0
.end method
