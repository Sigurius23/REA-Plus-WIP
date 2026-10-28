.class public abstract Llf0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001aG\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000fH\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llf0/m;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "m",
        "(Landroidx/compose/ui/Modifier;Llf0/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "event",
        "",
        "C",
        "(Ljava/lang/Object;)Z",
        "Llf0/v;",
        "Lkotlin/Function0;",
        "onApproveRequest",
        "onDismissRequest",
        "onSecondaryActionClicked",
        "x",
        "(Llf0/v;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "showDialog",
        "advanced-labs_release"
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
.method private static final A()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Llf0/v;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Llf0/l;->x(Llf0/v;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(Ljava/lang/Object;)Z
    .locals 2

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lny0/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lny0/h;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lny0/h;->e()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    instance-of p0, v1, Lcom/whoop/design/models/modal/AnyModal;

    return p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/l;->s(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/l;->v(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Llf0/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/l;->w(Landroidx/compose/ui/Modifier;Llf0/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Llf0/l;->A()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/l;->u(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/l;->t(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Landroid/content/Context;Ljava/lang/String;Llf0/m;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llf0/l;->q(Lkotlin/jvm/functions/Function1;Landroid/content/Context;Ljava/lang/String;Llf0/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Llf0/v;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Llf0/l;->B(Llf0/v;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Llf0/l;->y()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Llf0/l;->z()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/l;->p(Lkotlin/jvm/functions/Function1;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/l;->r(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;Llf0/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llf0/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p1

    move-object/from16 v1, p2

    move/from16 v6, p4

    const-string v0, "state"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x1e5e07fc

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v6, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :cond_7
    move v15, v5

    and-int/lit16 v5, v15, 0x93

    const/16 v7, 0x92

    if-eq v5, v7, :cond_8

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_5
    and-int/lit8 v7, v15, 0x1

    invoke-virtual {v11, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_2e

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v5

    goto :goto_6

    :cond_9
    move-object v0, v3

    :goto_6
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v3, v7, :cond_a

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lp1/c1;

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    sget v12, Lma0/d;->g:I

    invoke-static {v11, v12}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v2, v2

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v2, v9

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v13, Lb2/e;->M:Lb2/k;

    move-object/from16 v17, v12

    const/4 v12, 0x6

    invoke-static {v2, v13, v11, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v20, v0

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-eqz v0, :cond_b

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v11, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 v21, v3

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v12, v11, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Llf0/m;->c()Lld0/d;

    move-result-object v8

    and-int/lit16 v6, v15, 0x380

    const/16 v12, 0x100

    if-ne v6, v12, :cond_e

    const/4 v12, 0x1

    :goto_8
    move-object/from16 v22, v8

    goto :goto_9

    :cond_e
    const/4 v12, 0x0

    goto :goto_8

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v12, :cond_f

    if-ne v8, v7, :cond_10

    :cond_f
    new-instance v8, Ll80/k;

    const/4 v12, 0x2

    invoke-direct {v8, v1, v12}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v12, Lkd1/o;->a:I

    shl-int/lit8 v12, v12, 0x3

    move-object/from16 v23, v10

    move-object v10, v11

    move v11, v12

    const/4 v12, 0x1

    move-object/from16 v24, v7

    const/4 v7, 0x0

    move/from16 v16, v9

    move/from16 v25, v15

    move-object/from16 v1, v17

    move-object/from16 v15, v23

    move-object/from16 v26, v24

    const/16 v18, 0x6

    move-object v9, v8

    move-object/from16 v8, v22

    invoke-static/range {v7 .. v12}, Llf0/p;->h(Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v10

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v7, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v7, v9, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_11

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v11, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    :cond_12
    invoke-static {v9, v11, v9, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v11, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Llf0/m;->a()Lny0/h;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v4}, Llf0/m;->b()Lld0/c;

    move-result-object v0

    if-eqz v0, :cond_19

    const v0, -0x37fae946

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    new-instance v7, Lny0/d;

    invoke-direct {v7}, Lny0/d;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v4}, Llf0/m;->a()Lny0/h;

    move-result-object v27

    const v53, 0x1ff9fff

    const/16 v54, 0x0

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x1

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-static/range {v27 .. v54}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v9

    const/16 v12, 0x100

    if-ne v6, v12, :cond_14

    const/4 v0, 0x1

    goto :goto_b

    :cond_14
    const/4 v0, 0x0

    :goto_b
    invoke-virtual {v11, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    and-int/lit8 v2, v25, 0x70

    const/16 v3, 0x20

    if-eq v2, v3, :cond_16

    and-int/lit8 v2, v25, 0x40

    if-eqz v2, :cond_15

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    goto :goto_c

    :cond_15
    const/4 v2, 0x0

    goto :goto_d

    :cond_16
    :goto_c
    const/4 v2, 0x1

    :goto_d
    or-int/2addr v0, v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v13, v26

    if-nez v0, :cond_18

    if-ne v2, v13, :cond_17

    goto :goto_e

    :cond_17
    move-object/from16 v1, p2

    move-object v15, v5

    move-object/from16 v14, v21

    goto :goto_f

    :cond_18
    :goto_e
    new-instance v0, Ljp2/l;

    move-object v2, v5

    const/4 v5, 0x6

    move-object v3, v15

    move-object v15, v2

    move-object v2, v3

    move-object v3, v1

    move-object/from16 v14, v21

    move-object/from16 v1, p2

    invoke-direct/range {v0 .. v5}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :goto_f
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v0, Lny0/h;->z:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v0, v0, 0x6

    sget v2, Lny0/d;->a:I

    shl-int/lit8 v2, v2, 0x9

    or-int v12, v0, v2

    invoke-virtual/range {v7 .. v12}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_19
    move-object/from16 v1, p2

    move-object v15, v5

    move-object/from16 v14, v21

    move-object/from16 v13, v26

    const/4 v0, 0x0

    const v2, -0x37ea7ce6

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v4}, Llf0/m;->g()Lny0/h;

    move-result-object v26

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    if-nez v26, :cond_1a

    const v5, -0x37e9829a

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_12

    :cond_1a
    const v0, -0x37e98299

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    new-instance v7, Lny0/d;

    invoke-direct {v7}, Lny0/d;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v27

    double-to-float v0, v2

    mul-float v29, v0, v16

    const/16 v31, 0x0

    const/16 v32, 0xd

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v52, 0x1ff9fff

    const/16 v53, 0x0

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x1

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-static/range {v26 .. v53}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v9

    move-object/from16 v0, v26

    const/16 v12, 0x100

    if-ne v6, v12, :cond_1b

    const/4 v5, 0x1

    goto :goto_11

    :cond_1b
    const/4 v5, 0x0

    :goto_11
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_1c

    if-ne v10, v13, :cond_1d

    :cond_1c
    new-instance v10, Lc11/d;

    const/16 v5, 0x8

    invoke-direct {v10, v1, v0, v5}, Lc11/d;-><init>(Lkotlin/jvm/functions/Function1;Lny0/h;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v0, Lny0/h;->z:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v0, v0, 0x6

    sget v5, Lny0/d;->a:I

    shl-int/lit8 v5, v5, 0x9

    or-int v12, v0, v5

    invoke-virtual/range {v7 .. v12}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v4}, Llf0/m;->e()Lny0/h;

    move-result-object v26

    if-nez v26, :cond_1e

    const v2, -0x37dee469

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v0, 0x1

    goto/16 :goto_15

    :cond_1e
    const v0, -0x37dee468

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    new-instance v7, Lny0/d;

    invoke-direct {v7}, Lny0/d;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v27

    double-to-float v0, v2

    mul-float v29, v0, v16

    const/16 v31, 0x0

    const/16 v32, 0xd

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v52, 0x1ff9fff

    const/16 v53, 0x0

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x1

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-static/range {v26 .. v53}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v9

    const/16 v12, 0x100

    if-ne v6, v12, :cond_1f

    const/4 v0, 0x1

    goto :goto_14

    :cond_1f
    const/4 v0, 0x0

    :goto_14
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_20

    if-ne v2, v13, :cond_21

    :cond_20
    new-instance v2, Lb30/r;

    const/16 v0, 0x12

    invoke-direct {v2, v1, v14, v0}, Lb30/r;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v0, Lny0/h;->z:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v0, v0, 0x6

    sget v2, Lny0/d;->a:I

    shl-int/lit8 v2, v2, 0x9

    or-int v12, v0, v2

    invoke-virtual/range {v7 .. v12}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :goto_15
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-static {v14}, Llf0/l;->n(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-virtual {v4}, Llf0/m;->f()Llf0/v;

    move-result-object v2

    if-eqz v2, :cond_2d

    const v2, -0x1f477698

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Llf0/m;->f()Llf0/v;

    move-result-object v7

    const/16 v12, 0x100

    if-ne v6, v12, :cond_22

    move v8, v0

    goto :goto_16

    :cond_22
    const/4 v8, 0x0

    :goto_16
    and-int/lit8 v2, v25, 0x70

    const/16 v3, 0x20

    if-eq v2, v3, :cond_24

    and-int/lit8 v3, v25, 0x40

    if-eqz v3, :cond_23

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_23

    goto :goto_17

    :cond_23
    const/4 v3, 0x0

    goto :goto_18

    :cond_24
    :goto_17
    move v3, v0

    :goto_18
    or-int/2addr v3, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_25

    if-ne v5, v13, :cond_26

    :cond_25
    new-instance v5, Llf0/k;

    const/4 v3, 0x0

    invoke-direct {v5, v1, v4, v14, v3}, Llf0/k;-><init>(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v8, v5

    check-cast v8, Lc93/a;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_27

    new-instance v3, Ljt1/b;

    const/16 v5, 0xa

    invoke-direct {v3, v5, v14}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v9, v3

    check-cast v9, Lc93/a;

    const/16 v12, 0x100

    if-ne v6, v12, :cond_28

    move v3, v0

    :goto_19
    const/16 v5, 0x20

    goto :goto_1a

    :cond_28
    const/4 v3, 0x0

    goto :goto_19

    :goto_1a
    if-eq v2, v5, :cond_2a

    and-int/lit8 v2, v25, 0x40

    if-eqz v2, :cond_29

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_1b

    :cond_29
    const/4 v0, 0x0

    :cond_2a
    :goto_1b
    or-int/2addr v0, v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2b

    if-ne v2, v13, :cond_2c

    :cond_2b
    new-instance v2, Llf0/k;

    const/4 v0, 0x1

    invoke-direct {v2, v1, v4, v14, v0}, Llf0/k;-><init>(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object v10, v2

    check-cast v10, Lc93/a;

    sget v0, Lny0/h;->z:I

    or-int/lit16 v12, v0, 0x180

    const/4 v13, 0x0

    invoke-static/range {v7 .. v13}, Llf0/l;->x(Llf0/v;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_2d
    const/4 v0, 0x0

    const v2, -0x1f3e93ba

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_1c
    move-object/from16 v3, v20

    goto :goto_1d

    :cond_2e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2f

    new-instance v0, Ll72/h;

    move-object v4, v3

    const/4 v3, 0x7

    move-object/from16 v5, p1

    move/from16 v2, p5

    move-object v6, v1

    move/from16 v1, p4

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final n(Lp1/c1;)Z
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

.method private static final o(Lp1/c1;Z)V
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

.method private static final p(Lkotlin/jvm/functions/Function1;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)Ll83/a0;
    .locals 1

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Landroid/content/Context;Ljava/lang/String;Llf0/m;Ljava/lang/Object;)Ll83/a0;
    .locals 14

    move-object/from16 v0, p4

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Llf0/l;->C(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object v2, Lla0/a;->a:Lla0/a;

    invoke-virtual/range {p3 .. p3}, Llf0/m;->b()Lld0/c;

    move-result-object v0

    invoke-virtual {v0}, Lld0/c;->b()J

    move-result-wide v5

    invoke-virtual/range {p3 .. p3}, Llf0/m;->b()Lld0/c;

    move-result-object v0

    invoke-virtual {v0}, Lld0/c;->a()J

    move-result-wide v7

    invoke-virtual/range {p3 .. p3}, Llf0/m;->c()Lld0/d;

    move-result-object v0

    invoke-virtual {v0}, Lld0/d;->j()Ljava/lang/String;

    move-result-object v9

    const/16 v12, 0x60

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v3, p1

    move-object/from16 v4, p2

    invoke-static/range {v2 .. v13}, Lla0/a;->b(Lla0/a;Landroid/content/Context;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Llf0/i$a;->a:Llf0/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Llf0/l;->C(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p2, Llf0/i$c;

    invoke-direct {p2, p1}, Llf0/i$c;-><init>(Lny0/h;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Llf0/l;->C(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    invoke-static {p1, p0}, Llf0/l;->o(Lp1/c1;Z)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Llf0/l;->o(Lp1/c1;Z)V

    invoke-virtual {p1}, Llf0/m;->f()Llf0/v;

    move-result-object p1

    invoke-virtual {p1}, Llf0/v;->b()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Llf0/i$b;->a:Llf0/i$b;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Llf0/l;->o(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Llf0/m;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Llf0/l;->o(Lp1/c1;Z)V

    invoke-virtual {p1}, Llf0/m;->f()Llf0/v;

    move-result-object p1

    invoke-virtual {p1}, Llf0/v;->c()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Landroidx/compose/ui/Modifier;Llf0/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/l;->m(Landroidx/compose/ui/Modifier;Llf0/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Llf0/v;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf0/v;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x1479f0da

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v5, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v5

    goto :goto_2

    :cond_2
    move v2, v5

    :goto_2
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v2, v6

    :goto_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v2, v8

    :goto_6
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v2, v2, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_7

    :cond_b
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v2, v10

    :goto_8
    and-int/lit16 v10, v2, 0x493

    const/16 v11, 0x492

    if-eq v10, v11, :cond_c

    const/4 v10, 0x1

    goto :goto_9

    :cond_c
    const/4 v10, 0x0

    :goto_9
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_13

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_d

    new-instance v3, Ll72/f;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Ll72/f;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lc93/a;

    move-object/from16 v30, v3

    goto :goto_a

    :cond_e
    move-object/from16 v30, v4

    :goto_a
    if-eqz v6, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_f

    new-instance v3, Ll72/f;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Ll72/f;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v3, Lc93/a;

    move-object/from16 v28, v3

    goto :goto_b

    :cond_10
    move-object/from16 v28, v7

    :goto_b
    if-eqz v8, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_11

    new-instance v3, Ll72/f;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Ll72/f;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v3, Lc93/a;

    move-object/from16 v29, v3

    goto :goto_c

    :cond_12
    move-object/from16 v29, v9

    :goto_c
    invoke-virtual {v1}, Llf0/v;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Llf0/v;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Llf0/v;->b()Lny0/h;

    move-result-object v3

    invoke-virtual {v3}, Lny0/h;->x()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Llf0/v;->c()Lny0/h;

    move-result-object v3

    invoke-virtual {v3}, Lny0/h;->x()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v3, 0x3

    shl-int/lit8 v6, v3, 0x6

    or-int/2addr v4, v6

    shl-int/lit8 v6, v3, 0x9

    or-int/2addr v4, v6

    shl-int/lit8 v3, v3, 0x1b

    or-int v35, v4, v3

    and-int/lit16 v3, v2, 0x1f80

    const v4, 0xe000

    shl-int/lit8 v2, v2, 0x9

    and-int/2addr v2, v4

    or-int v37, v3, v2

    const v38, 0xe3ffdf1

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    move-object/from16 v34, v0

    invoke-static/range {v6 .. v38}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    move-object/from16 v2, v30

    goto :goto_d

    :cond_13
    move-object/from16 v34, v0

    invoke-virtual/range {v34 .. v34}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v7

    move-object v4, v9

    :goto_d
    invoke-virtual/range {v34 .. v34}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lkw1/c;

    const/4 v7, 0x7

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Lc93/a;Lc93/a;Lc93/a;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final y()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
