.class public abstract Llw1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a;\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0013\u00b2\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llw1/k;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onApplyPromoCodeClicked",
        "g",
        "(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "a",
        "Ljava/util/List;",
        "getPromoCodeViewStates",
        "()Ljava/util/List;",
        "PromoCodeViewStates",
        "code",
        "",
        "isExpanded",
        "membership_release"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llw1/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 30

    new-instance v0, Llw1/k;

    const-string v9, "PROMO CODE"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v10, "PROMO CODE?"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v11, "APPLY"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v20, Ly81/f;->ACCENT_ALERT:Ly81/f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v20

    invoke-direct/range {v0 .. v8}, Llw1/k;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    new-instance v12, Llw1/k;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x1

    invoke-direct/range {v12 .. v20}, Llw1/k;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    move-object v1, v12

    new-instance v21, Llw1/k;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const-string v2, "Discount Applied"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    sget-object v29, Ly81/f;->ACCENT_ACTION:Ly81/f;

    const/16 v22, 0x1

    const/16 v23, 0x1

    const-string v27, "EXT10"

    invoke-direct/range {v21 .. v29}, Llw1/k;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    move-object/from16 v2, v21

    new-instance v12, Llw1/k;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const-string v3, "Invalid Promo Code"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const-string v18, "TEST"

    invoke-direct/range {v12 .. v20}, Llw1/k;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    filled-new-array {v0, v1, v2, v12}, [Llw1/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Llw1/f;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Llw1/k;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llw1/f;->o(Llw1/k;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llw1/f;->p(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llw1/f;->n(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llw1/f;->q(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llw1/f;->h(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Llw1/f;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llw1/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x2eb30db7

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v1, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v6, v11

    :goto_5
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v14, 0x1

    if-eq v11, v12, :cond_9

    move v11, v14

    goto :goto_6

    :cond_9
    const/4 v11, 0x0

    :goto_6
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_25

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_a

    move-object v4, v11

    :cond_a
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_b

    new-instance v7, Llive/hms/video/media/capturers/camera/utils/a;

    const/16 v10, 0x19

    invoke-direct {v7, v10}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v10, v7

    :cond_c
    if-eqz v5, :cond_d

    invoke-virtual {v5}, Llw1/k;->b()Z

    move-result v7

    if-ne v7, v14, :cond_d

    move v7, v14

    goto :goto_7

    :cond_d
    const/4 v7, 0x0

    :goto_7
    if-eqz v7, :cond_24

    const v7, 0x76ad70f6

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_e

    invoke-virtual {v5}, Llw1/k;->f()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v2, :cond_f

    invoke-virtual {v5}, Llw1/k;->c()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lp1/c1;

    invoke-static {v12}, Llw1/f;->k(Lp1/c1;)Z

    move-result v15

    if-eqz v15, :cond_22

    const v12, 0x76afc480

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-interface {v15, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    int-to-float v8, v14

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v8, v12, v0, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_10

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move/from16 v19, v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_9

    :cond_11
    move/from16 v19, v6

    :goto_9
    invoke-static {v12, v0, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Llw1/k;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v0, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v15, Lx81/d;->a:Lx81/d;

    move-object/from16 p2, v7

    sget v7, Lx81/d;->b:I

    invoke-virtual {v15, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lb91/d;->m()Lb91/a;

    move-result-object v26

    invoke-virtual {v15, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->c1()J

    move-result-wide v20

    sget v22, Lb91/a;->d:I

    shl-int/lit8 v30, v22, 0x12

    const v31, 0x2fffa

    move/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    const-wide/16 v10, 0x0

    move/from16 v25, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    const/4 v14, 0x0

    move-object/from16 v29, v15

    const/16 v33, 0x100

    const-wide/16 v15, 0x0

    const/16 v34, 0x0

    const/16 v17, 0x0

    const/16 v35, 0x1

    const/16 v18, 0x0

    move-object/from16 v37, v8

    move/from16 v36, v9

    move-wide/from16 v8, v20

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    move-object/from16 v41, v24

    const/16 v24, 0x0

    move/from16 v42, v25

    const/16 v25, 0x0

    move-object/from16 v43, v27

    const/16 v27, 0x0

    move-object/from16 v44, v29

    const/16 v29, 0x0

    move-object/from16 v51, v2

    move-object/from16 p3, v4

    move-object/from16 v4, v28

    move/from16 v47, v38

    move/from16 v50, v39

    move-object/from16 v46, v40

    move-object/from16 v2, v41

    move/from16 v48, v42

    move-object/from16 v5, v43

    move-object/from16 v49, v44

    move-object/from16 v28, v0

    move-object/from16 v0, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    move/from16 v52, v30

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v7, v6, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v6, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_13

    invoke-virtual {v6, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_13
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    invoke-static {v8, v6, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v6, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v3, v0

    const-wide/16 v0, 0x0

    cmpl-double v0, v3, v0

    if-lez v0, :cond_16

    const/4 v13, 0x1

    goto :goto_b

    :cond_16
    const/4 v13, 0x0

    :goto_b
    if-nez v13, :cond_17

    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_17
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x1

    invoke-direct {v7, v0, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float v10, v0, v36

    const/4 v11, 0x0

    const/16 v12, 0xb

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {p2 .. p2}, Llw1/f;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v3, ""

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v3, Llw1/a;->a:Llw1/a;

    invoke-virtual {v3}, Llw1/a;->b()Lc93/m;

    move-result-object v12

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v51

    if-ne v3, v4, :cond_18

    new-instance v3, Llt2/a;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Llt2/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v37, v3

    check-cast v37, Lc93/a;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_19

    new-instance v3, Ljs2/e;

    const/16 v5, 0xb

    move-object/from16 v8, p2

    invoke-direct {v3, v5, v8}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_c

    :cond_19
    move-object/from16 v8, p2

    :goto_c
    move-object/from16 v38, v3

    check-cast v38, Lkotlin/jvm/functions/Function1;

    move/from16 v3, v48

    shl-int/lit8 v5, v3, 0x3

    const/high16 v9, 0x180000

    or-int/2addr v5, v9

    shl-int/lit8 v9, v3, 0x18

    or-int v40, v5, v9

    const v44, 0x3fffbebc

    const/16 v45, 0x0

    move-object v5, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

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

    const/16 v41, 0x6000

    const/16 v42, 0x0

    const/16 v43, 0x36

    move-object/from16 v39, v6

    move-object v6, v0

    invoke-static/range {v6 .. v45}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v6, v39

    and-int/lit8 v0, v47, 0x70

    const/16 v7, 0x20

    if-eq v0, v7, :cond_1c

    and-int/lit8 v0, v47, 0x40

    if-eqz v0, :cond_1a

    move-object/from16 v0, p1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1b

    goto :goto_d

    :cond_1a
    move-object/from16 v0, p1

    :cond_1b
    const/4 v13, 0x0

    goto :goto_e

    :cond_1c
    move-object/from16 v0, p1

    :goto_d
    move v13, v1

    :goto_e
    move/from16 v7, v47

    and-int/lit16 v7, v7, 0x380

    const/16 v8, 0x100

    if-ne v7, v8, :cond_1d

    move v7, v1

    goto :goto_f

    :cond_1d
    const/4 v7, 0x0

    :goto_f
    or-int/2addr v7, v13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1f

    if-ne v8, v4, :cond_1e

    goto :goto_10

    :cond_1e
    move-object/from16 v7, v46

    goto :goto_11

    :cond_1f
    :goto_10
    new-instance v8, Lim1/a0;

    const/16 v4, 0x18

    move-object/from16 v7, v46

    invoke-direct {v8, v0, v7, v5, v4}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object/from16 v19, v8

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v15, v2

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Llw1/k;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v6, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v8, v49

    move/from16 v9, v50

    invoke-virtual {v8, v6, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->k()Lb91/a;

    move-result-object v26

    invoke-static {v5}, Llw1/f;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Llw1/k;->f()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    const v5, -0x70c5120f

    invoke-static {v6, v5, v8, v6, v9}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v10

    const/4 v5, 0x0

    :goto_12
    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_20
    const/4 v5, 0x0

    const v10, -0x70c50dd3

    invoke-virtual {v6, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v6, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->H()J

    move-result-wide v10

    goto :goto_12

    :goto_13
    const/16 v29, 0x0

    const v31, 0x2fff8

    move-object/from16 v44, v8

    move/from16 v50, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v28, v6

    move-object/from16 v46, v7

    move/from16 v30, v52

    move-object v7, v2

    move-object v6, v4

    move-object/from16 v2, v44

    move/from16 v4, v50

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Llw1/k;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz v5, :cond_21

    invoke-virtual {v0}, Llw1/k;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_21

    const v5, 0x2caeab30

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Llw1/k;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v6, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v6, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->d()Lb91/a;

    move-result-object v26

    invoke-virtual {v0}, Llw1/k;->g()Ly81/f;

    move-result-object v2

    const/4 v5, 0x0

    invoke-virtual {v2, v6, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    const/16 v29, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v28, v6

    move-object v6, v3

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_21
    const/4 v5, 0x0

    const v2, 0x2cb25417

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    move-object/from16 v4, p3

    goto/16 :goto_15

    :cond_22
    move-object v6, v0

    move-object/from16 p3, v4

    move-object v0, v5

    move-object/from16 v46, v10

    move-object v15, v11

    move-object v4, v2

    const v1, 0x76cdf16f

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_23

    new-instance v1, Ljt1/b;

    const/16 v2, 0x17

    invoke-direct {v1, v2, v12}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    move-object/from16 v19, v1

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v4, p3

    invoke-interface {v1, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Llw1/k;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v6, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v6, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->m()Lb91/a;

    move-result-object v26

    invoke-virtual {v2, v6, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v8

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v30, v2, 0x12

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v6

    move-object v6, v1

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_24
    move-object v6, v0

    move-object v0, v5

    move-object/from16 v46, v10

    const/4 v5, 0x0

    const v1, 0x76d2d1ab

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_16
    move-object/from16 v28, v6

    move-object/from16 v6, v46

    goto :goto_17

    :cond_25
    move-object v6, v0

    move-object v0, v5

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v28, v6

    move-object v6, v10

    :goto_17
    invoke-virtual/range {v28 .. v28}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_26

    new-instance v0, Ll72/h;

    const/16 v3, 0x19

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final h(Ljava/lang/String;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final j(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final k(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final l(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llw1/f;->j(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Llw1/k;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p2}, Llw1/f;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Llw1/k;->f()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p2}, Llw1/f;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Llw1/f;->l(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llw1/f;->g(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
