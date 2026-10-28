.class public abstract Lyt2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a5\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\"\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001d\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010 \u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010!\u001a\u00020\u001b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lwt2/k;",
        "viewState",
        "",
        "isPreview",
        "Lkotlin/Function1;",
        "Lwt2/i;",
        "Ll83/a0;",
        "onViewEvent",
        "Lvt2/a;",
        "onNavigationEvent",
        "X",
        "(Lwt2/k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lwt2/k$c;",
        "summaryState",
        "x",
        "(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lwt2/c;",
        "challengeBar",
        "v",
        "(Lwt2/c;Landroidx/compose/runtime/Composer;I)V",
        "Lkd1/o;",
        "overrideImage",
        "t",
        "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V",
        "showLoading",
        "animationFinished",
        "showFooter",
        "",
        "gradientAlpha",
        "showToolbar",
        "Ly3/f;",
        "gaugeOffsetY",
        "showContent",
        "toolbarAlpha",
        "weekly-plan_release"
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
.method private static final A(Lp1/c1;Z)V
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

.method private static final B(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final C(Lp1/c1;)Z
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

.method private static final D(Lp1/c1;Z)V
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

.method private static final E(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final F(Lp1/c1;)Z
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

.method private static final G(Lp1/z0;Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyt2/k;->V(Lp1/z0;)F

    move-result p0

    check-cast p1, Li2/x0;

    invoke-virtual {p1, p0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lvt2/a$a;->a:Lvt2/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/z0;Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyt2/k;->V(Lp1/z0;)F

    move-result p0

    check-cast p1, Li2/x0;

    invoke-virtual {p1, p0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/z0;Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyt2/k;->V(Lp1/z0;)F

    move-result p0

    check-cast p1, Li2/x0;

    invoke-virtual {p1, p0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Ly2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 3

    const-string v0, "$this$layout"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p2, Ly3/a;->a:J

    invoke-interface {p1, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p1

    iget p2, p1, Ly2/j1;->x:I

    int-to-float p2, p2

    const v0, 0x3f70a3d7    # 0.94f

    mul-float/2addr p2, v0

    float-to-int p2, p2

    iget v0, p1, Ly2/j1;->w:I

    new-instance v1, Lyt2/h;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lyt2/h;-><init>(Ljava/lang/Object;I)V

    sget-object p1, Lm83/z;->w:Lm83/z;

    invoke-interface {p0, v0, p2, p1, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method private static final L(Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 1

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(II)I
    .locals 0

    return p0
.end method

.method private static final N(Lwt2/k$c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 39

    move-object/from16 v0, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x30

    invoke-static {v2, v1, v0, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lp1/q;

    iget-wide v3, v2, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    iget-object v8, v2, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-eqz v8, :cond_0

    invoke-virtual {v2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_0
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v2, Lp1/q;->S:Z

    if-nez v4, :cond_1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    invoke-static {v3, v2, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->c()Lwt2/h;

    move-result-object v1

    invoke-virtual {v1}, Lwt2/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v0, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v6, v1

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->O()Lb91/a;

    move-result-object v20

    invoke-virtual {v7, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v24, v11, 0x12

    const v25, 0x2fff8

    move v11, v4

    move-object v12, v5

    const-wide/16 v4, 0x0

    move-object v0, v6

    const/4 v6, 0x0

    move-object v13, v7

    const/4 v7, 0x0

    move v14, v8

    const/4 v8, 0x0

    move-object v15, v2

    move/from16 v16, v3

    move-wide v2, v9

    const-wide/16 v9, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    move/from16 v21, v14

    const-wide/16 v13, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v27, v18

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v30, v23

    const/16 v23, 0x30

    move-object/from16 v31, v22

    move-object/from16 v35, v27

    move-object/from16 v33, v28

    move/from16 v34, v29

    move/from16 v32, v30

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v1, 0x1

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    move-object/from16 v4, v35

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v5, v32

    invoke-static {v2, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v13, v33

    move/from16 v14, v34

    invoke-virtual {v13, v0, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v13, v0, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    move v8, v1

    move-object v12, v4

    move-object v1, v5

    const-wide/16 v4, 0x0

    move-object v0, v2

    move-wide/from16 v37, v6

    move v7, v3

    move-wide/from16 v2, v37

    const/4 v6, 0x0

    move v9, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move v11, v9

    move v13, v10

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    move v15, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v35, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v22, p2

    move-object/from16 v36, v35

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->d()Lau2/d;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    const v0, 0x460bc7

    move-object/from16 v15, v31

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    :goto_1
    const/4 v13, 0x1

    goto :goto_2

    :cond_3
    move-object/from16 v15, v31

    const v3, 0x460bc8

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x5

    int-to-float v3, v3

    mul-float v3, v3, v26

    move-object/from16 v12, v36

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v1, v0, v2}, Lau2/c;->g(Lau2/d;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final O(I)I
    .locals 0

    return p0
.end method

.method private static final P(Lwt2/k$c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v5, p3

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v1, v2, v5, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v8, v5

    check-cast v8, Lp1/q;

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    iget-object v10, v8, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_0

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_0
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v5, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    :cond_1
    invoke-static {v2, v8, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v12, 0x5

    int-to-float v12, v12

    const/4 v13, 0x4

    int-to-float v13, v13

    mul-float/2addr v12, v13

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Li2/t;->b:Li2/s;

    sget-wide v13, Li2/x;->m:J

    new-instance v15, Li2/x;

    invoke-direct {v15, v13, v14}, Li2/x;-><init>(J)V

    const-wide v16, 0xff101518L

    invoke-static/range {v16 .. v17}, Li2/w0;->e(J)J

    move-result-wide v13

    new-instance v3, Li2/x;

    invoke-direct {v3, v13, v14}, Li2/x;-><init>(J)V

    invoke-static/range {v16 .. v17}, Li2/w0;->e(J)J

    move-result-wide v13

    new-instance v7, Li2/x;

    invoke-direct {v7, v13, v14}, Li2/x;-><init>(J)V

    filled-new-array {v15, v3, v7}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v13, 0x0

    invoke-static {v12, v3, v13, v13, v7}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v3

    const/4 v7, 0x0

    const/4 v12, 0x6

    invoke-static {v11, v3, v7, v13, v12}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v5, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static/range {v16 .. v17}, Li2/w0;->e(J)J

    move-result-wide v6

    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v6, v7, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v3, 0x3

    int-to-float v6, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v13, v6, v7

    const/16 v16, 0x0

    const/16 v17, 0xa

    const/4 v14, 0x0

    move v15, v13

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, Lb2/e;->w:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v11, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_3

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    invoke-static {v5, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    invoke-static {v13, v8, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    invoke-static {v5, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->g()Lwt2/a;

    move-result-object v1

    move-object v2, v1

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->i()Lwt2/a;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->d()Lau2/d;

    move-result-object v4

    const/4 v9, 0x1

    if-eqz v4, :cond_6

    move v12, v9

    :cond_6
    const/4 v4, 0x2

    int-to-float v4, v4

    mul-float/2addr v4, v7

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_7

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v7, v6, :cond_8

    :cond_7
    new-instance v7, Lyt2/h;

    const/4 v6, 0x0

    invoke-direct {v7, v0, v6}, Lyt2/h;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v6, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v0, v6

    or-int/lit16 v6, v0, 0xc00

    shl-int/2addr v0, v3

    or-int/2addr v6, v0

    move v3, v4

    move-object v4, v7

    const/4 v7, 0x0

    move-object v0, v2

    move v2, v12

    invoke-static/range {v0 .. v7}, Lau2/h;->h(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Q(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvt2/a$b;

    invoke-direct {v0, p1}, Lvt2/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lyt2/k;->x(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lp1/c1;Z)V
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

.method private static final T(Lp1/c1;)Z
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

.method private static final U(Lp1/c1;Z)V
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

.method private static final V(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final W(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method public static final X(Lwt2/k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt2/k;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p5

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v0, 0x6a6611f7

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_2

    move/from16 v5, p1

    invoke-virtual {v8, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, p6, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v8, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    move v10, v7

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v1, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit16 v12, v0, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v12, v13, :cond_b

    move v12, v14

    goto :goto_8

    :cond_b
    move v12, v15

    :goto_8
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v8, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1e

    if-eqz v3, :cond_c

    move v3, v6

    move v6, v15

    goto :goto_9

    :cond_c
    move v3, v6

    move v6, v5

    :goto_9
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_e

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_d

    new-instance v3, Lyk2/k;

    const/16 v9, 0xf

    invoke-direct {v3, v9}, Lyk2/k;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_e
    move-object v3, v9

    :goto_a
    if-eqz v10, :cond_10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_f

    new-instance v9, Lyk2/k;

    const/16 v10, 0x11

    invoke-direct {v9, v10}, Lyk2/k;-><init>(I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v9

    move v9, v7

    move-object/from16 v7, v29

    goto :goto_b

    :cond_10
    move v9, v7

    move-object v7, v11

    :goto_b
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_11

    invoke-static {v6, v8}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v10

    :cond_11
    check-cast v10, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v5, :cond_12

    new-instance v11, Lyt2/k$c;

    const/4 v12, 0x0

    invoke-direct {v11, v10, v12}, Lyt2/k$c;-><init>(Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v11, Lc93/m;

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    invoke-static {v8, v11, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v11, v4, Lwt2/k$c;

    if-eqz v11, :cond_13

    const v2, -0x43f50b4a

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    move-object v5, v4

    check-cast v5, Lwt2/k$c;

    and-int/lit8 v2, v0, 0x7e

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v9, v2, v0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lyt2/k;->x(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move/from16 v21, v6

    move-object/from16 v22, v7

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_13
    move/from16 v21, v6

    move-object/from16 v22, v7

    instance-of v6, v4, Lwt2/k$a;

    if-eqz v6, :cond_18

    const v6, -0x43f17b55

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    new-instance v23, Lsz0/p0$b;

    sget v6, Lks2/a;->g:I

    invoke-static {v8, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v27, 0x6

    const/16 v28, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v23 .. v28}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lks2/a;->d:I

    invoke-static {v8, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lks2/a;->e:I

    invoke-static {v8, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    and-int/lit16 v10, v0, 0x380

    if-ne v10, v9, :cond_14

    move v9, v14

    goto :goto_c

    :cond_14
    move v9, v15

    :goto_c
    and-int/lit8 v0, v0, 0xe

    if-ne v0, v2, :cond_15

    goto :goto_d

    :cond_15
    move v14, v15

    :goto_d
    or-int v0, v9, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_16

    if-ne v2, v5, :cond_17

    :cond_16
    new-instance v2, Lyo1/b;

    const/4 v0, 0x2

    invoke-direct {v2, v0, v3, v4}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v9, v2

    check-cast v9, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v2, 0x3

    or-int/2addr v0, v5

    shl-int/lit8 v2, v2, 0x9

    or-int v18, v0, v2

    const/16 v19, 0x6

    const/16 v20, 0xbe4

    move-object/from16 v17, v8

    move-object v8, v7

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v0, v15

    const/4 v15, 0x1

    const/16 v16, 0x0

    move-object/from16 v5, v23

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v17

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_18
    move v0, v15

    sget-object v2, Lwt2/k$b;->a:Lwt2/k$b;

    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const v2, -0x43e7bbb6

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lyt2/k;->a0(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_1c

    const v2, -0x43e7488d

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    sget-object v2, Ll0/m;->e:Ll0/h;

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/16 v6, 0x36

    invoke-static {v2, v5, v8, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_19

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_e
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v8, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_1a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    :cond_1a
    invoke-static {v5, v8, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v2, Lsz0/p0$c;->f:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v18, v2, v7

    const/16 v19, 0x6

    const/16 v20, 0xbfc

    const/4 v7, 0x0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v2, v14

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v17

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1c
    const v2, -0x43e0d4d5

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_10
    move-object v5, v3

    move/from16 v7, v21

    move-object/from16 v6, v22

    goto :goto_11

    :cond_1d
    const v1, 0x6929a220

    invoke-static {v1, v8, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1e
    invoke-virtual {v8}, Lp1/q;->X()V

    move v7, v5

    move-object v5, v9

    move-object v6, v11

    :goto_11
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Lry2/h;

    const/16 v3, 0xe

    move/from16 v2, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final Y(Lwt2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Z(Lvt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lvt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyt2/k;->Z(Lvt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lp1/c1;)Z
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

.method public static synthetic b(Lvt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyt2/k;->y(Lvt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lp1/c1;Z)V
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

.method public static synthetic c(Ly2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyt2/k;->K(Ly2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(Lkotlin/jvm/functions/Function1;Lwt2/k;)Ll83/a0;
    .locals 1

    new-instance v0, Lwt2/i$b;

    check-cast p1, Lwt2/k$a;

    invoke-virtual {p1}, Lwt2/k$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lwt2/i$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyt2/k;->H(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lwt2/k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lyt2/k;->X(Lwt2/k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic e(Lwt2/k$c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lyt2/k;->N(Lwt2/k$c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->A(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic f(Lp1/z0;Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->I(Lp1/z0;Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->D(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic g(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyt2/k;->R(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g0(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lyt2/k;->F(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(Lwt2/k$c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyt2/k;->P(Lwt2/k$c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->S(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic i(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyt2/k;->Q(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->U(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic j(Lp1/z0;Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->G(Lp1/z0;Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j0(Lp1/z0;F)V
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->W(Lp1/z0;F)V

    return-void
.end method

.method public static synthetic k(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lyt2/k;->u(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->b0(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic l(Lp1/z0;Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->J(Lp1/z0;Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lwt2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyt2/k;->Y(Lwt2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(II)I
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->M(II)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->L(Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(I)I
    .locals 0

    invoke-static {p0}, Lyt2/k;->O(I)I

    move-result p0

    return p0
.end method

.method public static synthetic q(Lwt2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lyt2/k;->w(Lwt2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Lwt2/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->c0(Lkotlin/jvm/functions/Function1;Lwt2/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lwt2/k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lyt2/k;->d0(Lwt2/k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lkd1/o;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v3, p1

    check-cast v3, Lp1/q;

    const p1, 0x46ac6117

    invoke-virtual {v3, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_2

    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_0

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x4

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    or-int/2addr p1, p2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x0

    const/4 v10, 0x1

    if-eq v1, v0, :cond_3

    move v1, v10

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    and-int/lit8 v4, p1, 0x1

    invoke-virtual {v3, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0x12c

    int-to-float v1, v1

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v3, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v5, v3, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v3, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v0, v0

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v8, v0, v2

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v9, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v12, v8

    sget v0, Lkd1/o;->a:I

    and-int/lit8 p1, p1, 0xe

    or-int v4, v0, p1

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object p0

    move-object p1, v0

    const/16 v8, 0x61b0

    const/16 v9, 0x68

    move-object v7, v3

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->b:Ly2/b1;

    const/4 v5, 0x0

    move-object v2, v6

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v7

    invoke-static {v3, v10, v11, v12, v3}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    goto :goto_5

    :cond_7
    move-object p1, p0

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v0, Ld41/d;

    const/16 v1, 0xe

    invoke-direct {v0, p1, p2, v1}, Ld41/d;-><init>(Lkd1/o;II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final u(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lyt2/k;->t(Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lwt2/c;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    const v2, -0x3059993a

    invoke-virtual {v10, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v3, :cond_3

    move v3, v7

    goto :goto_3

    :cond_3
    move v3, v6

    :goto_3
    and-int/2addr v2, v7

    invoke-virtual {v10, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    :cond_5
    invoke-static {v3, v10, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, Ll0/m;->g:Ll0/h;

    sget-object v13, Lb2/e;->J:Lb2/l;

    const/4 v14, 0x6

    invoke-static {v12, v13, v10, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_7

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v10, v11, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    invoke-static {v13, v10, v13, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lwt2/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v5, v10, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->L()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v11

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fffa

    move v9, v3

    const/4 v3, 0x0

    move-object v14, v6

    move v13, v7

    const-wide/16 v6, 0x0

    move v15, v8

    const/4 v8, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move/from16 v18, v4

    move-object/from16 v17, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v23, v15

    move/from16 v21, v16

    const-wide/16 v15, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v25

    const/16 v25, 0x0

    move-object/from16 v35, v30

    move/from16 v0, v31

    move/from16 v34, v32

    move-object/from16 v1, v33

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v24

    invoke-virtual/range {p0 .. p0}, Lwt2/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v10, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v0, v34

    invoke-virtual {v1, v10, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->L()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v4

    const/4 v3, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v24

    const/4 v13, 0x1

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    int-to-float v2, v13

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v9, v2, v3

    move-object/from16 v14, v35

    invoke-static {v9, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/c;->a()I

    move-result v3

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object v5

    invoke-virtual {v1, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v6

    const v11, 0x1b0180

    const/4 v12, 0x1

    const/4 v2, 0x0

    const/16 v4, 0x64

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x3

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v0, v1, v14, v10, v13}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Lwr0/y;

    const/16 v2, 0x8

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lwr0/y;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final w(Lwt2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lyt2/k;->v(Lwt2/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt2/k$c;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v0, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v3, 0x7fa2fd08

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x4

    const/4 v11, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v11

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v7, p2

    :goto_3
    move v12, v3

    goto :goto_5

    :cond_5
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_3

    :goto_5
    and-int/lit16 v3, v12, 0x93

    const/16 v8, 0x92

    const/4 v14, 0x0

    if-eq v3, v8, :cond_7

    const/4 v3, 0x1

    goto :goto_6

    :cond_7
    move v3, v14

    :goto_6
    and-int/lit8 v8, v12, 0x1

    invoke-virtual {v9, v8, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_42

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_8

    new-instance v3, Lyk2/k;

    const/16 v5, 0x12

    invoke-direct {v3, v5}, Lyk2/k;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_9
    move-object v3, v7

    :goto_7
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/Configuration;

    iget v5, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v5, v5

    const/16 v7, 0xb4

    int-to-float v7, v7

    sub-float/2addr v5, v7

    int-to-float v7, v11

    div-float/2addr v5, v7

    const/16 v7, 0x24

    int-to-float v7, v7

    int-to-float v4, v4

    mul-float/2addr v7, v4

    sub-float v16, v5, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_a

    invoke-static {v2, v9}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v5

    :cond_a
    check-cast v5, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v15, :cond_b

    invoke-static {v2, v9}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v7

    :cond_b
    check-cast v7, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v15, :cond_d

    if-eqz v2, :cond_c

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_c
    const/4 v8, 0x0

    :goto_8
    invoke-static {v8, v9}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v8

    :cond_d
    check-cast v8, Lp1/z0;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v15, :cond_e

    invoke-static {v2, v9}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v13

    :cond_e
    check-cast v13, Lp1/c1;

    and-int/lit8 v10, v12, 0x70

    if-ne v10, v6, :cond_f

    const/4 v6, 0x1

    goto :goto_9

    :cond_f
    move v6, v14

    :goto_9
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_11

    if-ne v10, v15, :cond_10

    goto :goto_a

    :cond_10
    move-object/from16 v18, v10

    move v10, v2

    move-object/from16 v2, v18

    move-object/from16 v18, v8

    move-object v8, v5

    move-object/from16 v5, v18

    move/from16 v18, v4

    move-object/from16 v19, v7

    move-object/from16 v20, v13

    move-object v13, v3

    goto :goto_b

    :cond_11
    :goto_a
    new-instance v2, Lyt2/k$a;

    move-object v6, v5

    move-object v5, v8

    const/4 v8, 0x0

    move/from16 v18, v4

    move-object v4, v13

    move-object v13, v3

    move/from16 v3, p1

    invoke-direct/range {v2 .. v8}, Lyt2/k$a;-><init>(ZLp1/c1;Lp1/z0;Lp1/c1;Lp1/c1;Lq83/d;)V

    move v10, v3

    move-object/from16 v20, v4

    move-object v8, v6

    move-object/from16 v19, v7

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v2, Lc93/m;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v2, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8}, Lyt2/k;->F(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_12

    int-to-float v2, v14

    goto :goto_c

    :cond_12
    move/from16 v2, v16

    :goto_c
    const/16 v4, 0x258

    const/4 v6, 0x0

    const/4 v7, 0x6

    if-eqz v10, :cond_13

    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object v16

    :goto_d
    move-object/from16 v21, v6

    goto :goto_e

    :cond_13
    invoke-static {v4, v14, v6, v7}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v16

    goto :goto_d

    :goto_e
    const/16 v6, 0x180

    move/from16 v22, v7

    const/16 v7, 0x8

    move/from16 v23, v4

    const-string v4, "GaugeOffsetY"

    move-object/from16 v11, v16

    move-object/from16 v16, v3

    move-object v3, v11

    move-object/from16 v24, v5

    move-object v5, v9

    move-object/from16 v9, v21

    move/from16 v11, v23

    invoke-static/range {v2 .. v7}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v22

    move-object v6, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_14

    invoke-static {v10, v6}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v2

    :cond_14
    check-cast v2, Lp1/c1;

    invoke-static {v8}, Lyt2/k;->F(Lp1/c1;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_15

    new-instance v4, Lyt2/k$b;

    invoke-direct {v4, v8, v2, v9}, Lyt2/k$b;-><init>(Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v4, Lc93/m;

    invoke-static {v6, v4, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v20 .. v20}, Lyt2/k;->z(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_16

    move-object v3, v2

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_f

    :cond_16
    move-object v3, v2

    const/4 v2, 0x0

    :goto_f
    if-eqz v10, :cond_17

    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object v4

    move-object v5, v4

    const/4 v4, 0x6

    goto :goto_10

    :cond_17
    const/4 v4, 0x6

    invoke-static {v11, v14, v9, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v5

    :goto_10
    const/16 v7, 0xc00

    const/16 v8, 0x14

    move/from16 v25, v4

    const-string v4, "ToolbarAlpha"

    move-object/from16 v20, v3

    move-object v3, v5

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v23

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v25, La3/l;->a:La3/k;

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_18

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_18
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_11
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v6, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-nez v14, :cond_19

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_19
    invoke-static {v7, v6, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_1b

    new-instance v4, Lyt2/i;

    const/4 v14, 0x0

    move-object/from16 v10, v24

    invoke-direct {v4, v10, v14}, Lyt2/i;-><init>(Lp1/z0;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_12

    :cond_1b
    move-object/from16 v10, v24

    :goto_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v4}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lyt2/a;->a:Lyt2/a;

    invoke-virtual {v7}, Lyt2/a;->b()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    move-object v14, v5

    move-object v5, v7

    const/16 v7, 0xc06

    move-object/from16 v24, v8

    const/4 v8, 0x6

    move-object/from16 v28, v3

    const/4 v3, 0x0

    move-object/from16 v29, v2

    move-object v2, v4

    const/4 v4, 0x0

    move-object/from16 v1, v24

    move-object/from16 v24, v10

    move-object v10, v14

    move-object/from16 v14, v29

    invoke-static/range {v2 .. v8}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v3, v2}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v3, v4, v6, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_1c

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v6, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_1d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    :cond_1d
    invoke-static {v5, v6, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v6, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_1f

    goto :goto_14

    :cond_1f
    const/4 v2, 0x0

    :goto_14
    if-eqz v2, :cond_20

    new-instance v4, Lo81/a;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5}, Lo81/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    move-object/from16 v31, v4

    goto :goto_15

    :cond_20
    const/16 v31, 0x0

    :goto_15
    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v32

    sget v2, Luv0/c;->E:I

    invoke-static {v6, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v33

    new-instance v29, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const v46, 0xfff0

    const/16 v47, 0x0

    invoke-direct/range {v29 .. v47}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {v23 .. v23}, Lyt2/k;->E(Lp1/t2;)F

    move-result v4

    invoke-static {v4, v2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit16 v4, v12, 0x380

    const/16 v5, 0x100

    if-ne v4, v5, :cond_21

    const/4 v4, 0x1

    goto :goto_16

    :cond_21
    const/4 v4, 0x0

    :goto_16
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_22

    if-ne v5, v15, :cond_23

    :cond_22
    new-instance v5, Lyt2/b;

    const/4 v4, 0x3

    invoke-direct {v5, v13, v4}, Lyt2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v5, Lc93/a;

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v4, v4, 0x3

    move-object v7, v10

    const/16 v10, 0x34

    move-object v8, v9

    move v9, v4

    const/4 v4, 0x0

    move-object v12, v8

    move-object v8, v6

    const/4 v6, 0x0

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v23, v13

    move-object v13, v12

    move-object/from16 v12, v17

    move-object/from16 v17, v23

    move-object/from16 v23, v15

    move-object v15, v3

    move-object/from16 v3, v29

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v4, v3

    const-wide/16 v7, 0x0

    cmpl-double v2, v4, v7

    if-lez v2, :cond_24

    :goto_17
    const/4 v2, 0x1

    goto :goto_18

    :cond_24
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_17

    :goto_18
    invoke-static {v3, v3, v2}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v9, v28

    const/4 v5, 0x0

    invoke-static {v9, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_25

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_25
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v6, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_26

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    :cond_26
    invoke-static {v3, v6, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-static {v5, v6, v3}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v3, 0xe

    invoke-static {v2, v4, v3}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    mul-float v4, v18, v18

    const/4 v3, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v4, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->h()Lep0/j;

    move-result-object v3

    sget v4, Lep0/j;->x:I

    shl-int/lit8 v4, v4, 0x3

    const/4 v7, 0x2

    move-object v8, v6

    move v6, v4

    const/4 v4, 0x0

    move-object v5, v8

    invoke-static/range {v2 .. v7}, Ldp0/f;->b(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v3, v6

    move-object v6, v5

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->h()Lep0/j;

    move-result-object v4

    const/16 v5, 0x15

    int-to-float v5, v5

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    or-int/lit16 v7, v3, 0x180

    const/4 v8, 0x4

    move-object v3, v4

    move v4, v5

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Ldp0/d;->a(Landroidx/compose/ui/Modifier;Lep0/j;FZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->N:Lb2/k;

    const/16 v4, 0x30

    invoke-static {v15, v3, v6, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_28

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_28
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v6, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_29

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2a

    :cond_29
    invoke-static {v4, v6, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2a
    invoke-static {v6, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float v2, v2, v18

    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v6, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->a()Lwt2/c;

    move-result-object v2

    if-nez v2, :cond_2b

    const v2, -0x1158ab84

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    move v4, v5

    move-object/from16 v28, v9

    move-object/from16 v15, v23

    move-object/from16 v5, v24

    goto :goto_1d

    :cond_2b
    const v3, -0x1158ab83

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v15, v23

    if-ne v3, v15, :cond_2c

    new-instance v3, Lyt2/i;

    const/4 v4, 0x1

    move-object/from16 v5, v24

    invoke-direct {v3, v5, v4}, Lyt2/i;-><init>(Lp1/z0;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_2c
    move-object/from16 v5, v24

    :goto_1b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v14, v3}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v9, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    move-object/from16 v28, v9

    iget-wide v8, v6, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_2d

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2d
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v6, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_2e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2f

    :cond_2e
    invoke-static {v4, v6, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2f
    invoke-static {v6, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v6, v3}, Lyt2/k;->v(Lwt2/c;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->e()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_30

    const v2, -0x1154ee26

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    move v5, v4

    move-object/from16 v9, v28

    const/4 v3, 0x0

    goto :goto_1f

    :cond_30
    const v3, -0x1154ee25

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_31

    new-instance v3, Lyt2/i;

    const/4 v4, 0x2

    invoke-direct {v3, v5, v4}, Lyt2/i;-><init>(Lp1/z0;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v14, v3}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v9, v28

    const/4 v5, 0x0

    invoke-static {v9, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_32

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1e

    :cond_32
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1e
    invoke-static {v6, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_33

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_34

    :cond_33
    invoke-static {v5, v6, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_34
    invoke-static {v6, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lkd1/o;->a:I

    invoke-static {v2, v6, v3}, Lyt2/k;->t(Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    move-object/from16 v3, v16

    :goto_1f
    if-nez v3, :cond_3a

    const v2, -0x11517e09

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->f()Le0;

    move-result-object v2

    if-nez v2, :cond_35

    const v2, 0x57d59369

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    goto/16 :goto_21

    :cond_35
    const v2, 0x57d5936a

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-static/range {v22 .. v22}, Lyt2/k;->B(Lp1/t2;)F

    move-result v2

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-static {v14, v5, v2, v3}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_36

    new-instance v3, Lvx0/a;

    const/16 v4, 0x19

    invoke-direct {v3, v4}, Lvx0/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    check-cast v3, Lkotlin/jvm/functions/Function3;

    invoke-static {v2, v3}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->x:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_37

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    :cond_37
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_20
    invoke-static {v6, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_38

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_39

    :cond_38
    invoke-static {v4, v6, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_39
    invoke-static {v6, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->f()Le0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v6, v5}, Lg;->a(Le0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_21
    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_22

    :cond_3a
    const/4 v3, 0x0

    const v2, -0x8d1308e

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_22
    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v6, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    const/16 v4, 0x28

    int-to-float v4, v4

    invoke-interface {v2, v4}, Ly3/c;->q0(F)F

    move-result v2

    float-to-int v2, v2

    invoke-static/range {v20 .. v20}, Lyt2/k;->C(Lp1/c1;)Z

    move-result v4

    const/16 v7, 0x258

    const/4 v8, 0x6

    invoke-static {v7, v5, v3, v8}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v10

    move/from16 p2, v4

    const/4 v4, 0x2

    invoke-static {v10, v4}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v10

    invoke-static {v7, v5, v3, v8}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    invoke-virtual {v6, v2}, Lp1/q;->e(I)Z

    move-result v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_3b

    if-ne v7, v15, :cond_3c

    :cond_3b
    new-instance v7, Lyt2/f;

    const/4 v5, 0x0

    invoke-direct {v7, v2, v5}, Lyt2/f;-><init>(II)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v7}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v2

    invoke-virtual {v10, v2}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v4

    new-instance v2, Lyt2/g;

    const/4 v5, 0x0

    move-object/from16 v7, p0

    invoke-direct {v2, v7, v5}, Lyt2/g;-><init>(Ljava/lang/Object;I)V

    const v5, 0x50ff8ad8

    invoke-static {v5, v6, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    move-object/from16 v28, v9

    const/high16 v9, 0x30000

    const/16 v10, 0x1a

    move-object/from16 v27, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    move/from16 v26, v8

    move-object v8, v6

    const/4 v6, 0x0

    move-object v7, v2

    move-object/from16 v23, v15

    move-object/from16 v15, v28

    move/from16 v2, p2

    invoke-static/range {v2 .. v10}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lwt2/k$c;->g()Lwt2/a;

    move-result-object v2

    if-nez v2, :cond_3d

    const v0, 0x5b1ab5a6

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    move-object/from16 v11, p0

    move-object/from16 v13, v17

    goto/16 :goto_24

    :cond_3d
    const/4 v5, 0x0

    const v2, 0x5b1ab5a7

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->H:Lb2/m;

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v2, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v15, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_3e

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_23

    :cond_3e
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_23
    invoke-static {v6, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_3f

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_40

    :cond_3f
    invoke-static {v4, v6, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_40
    invoke-static {v6, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v19 .. v19}, Lyt2/k;->T(Lp1/c1;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v11, 0x258

    invoke-static {v11, v5, v3, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v0

    invoke-static {v11, v5, v3, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v15, v23

    if-ne v3, v15, :cond_41

    new-instance v3, Lyk2/k;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lyk2/k;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_41
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v4

    new-instance v0, Lvv2/d;

    const/16 v1, 0xf

    move-object/from16 v11, p0

    move-object/from16 v13, v17

    invoke-direct {v0, v1, v11, v13}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x64a9c0b4

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0x30000

    const/16 v10, 0x1a

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    invoke-static/range {v2 .. v10}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_24
    invoke-static {v6, v2, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v3, v13

    goto :goto_25

    :cond_42
    move-object v11, v1

    move-object v6, v9

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, v7

    :goto_25
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_43

    new-instance v0, Lsl0/t1;

    const/16 v6, 0x9

    move/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v1, v11

    invoke-direct/range {v0 .. v6}, Lsl0/t1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_43
    return-void
.end method

.method private static final y(Lvt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;)Z
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
