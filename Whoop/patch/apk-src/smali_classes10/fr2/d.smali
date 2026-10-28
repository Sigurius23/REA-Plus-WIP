.class public abstract Lfr2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lfr2/b;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lfr2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "a",
        "Lfr2/b;",
        "sampleViewState",
        "user-journey_release"
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
.field private static final a:Lfr2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfr2/b;

    const-string v1, "Congrats, Nina!\nLet\u2019s review your first week on WHOOP."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "July 2 - July 10, 2023"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lkd1/o$a;

    sget v4, Lgy0/a;->O4:I

    invoke-direct {v3, v4}, Lkd1/o$a;-><init>(I)V

    sget-object v4, Lcom/whoop/user/journey/model/UserJourneyFooterStyle;->GET_STARTED:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    new-instance v5, Llq2/t$a;

    sget-object v6, Llq2/f;->PRIMARY:Llq2/f;

    invoke-direct {v5, v6}, Llq2/t$a;-><init>(Llq2/f;)V

    const-string v6, "WIR_INTRO_STEP"

    invoke-direct/range {v0 .. v6}, Lfr2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V

    sput-object v0, Lfr2/d;->a:Lfr2/b;

    return-void
.end method

.method public static synthetic a(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lfr2/d;->e(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lfr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfr2/d;->d(Lfr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lfr2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x383b3619

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lb30/a1;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, 0x276505cf

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lfr2/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lfr2/c;-><init>(Lfr2/b;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(Lfr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    move-object/from16 v3, p2

    const-string v0, "$this$BasicAnimationComponent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v1, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move-object v13, v3

    check-cast v13, Lp1/q;

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    iget-object v5, v13, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-eqz v5, :cond_0

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_0
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v3, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v3, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_1

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-static {v2, v13, v2, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v3, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x8c

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lfr2/b;->e()Lkd1/o;

    move-result-object v0

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    move-object v1, v8

    const/16 v8, 0x61b0

    move-object v2, v9

    const/16 v9, 0x68

    move-object v3, v1

    const/4 v1, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    sget-object v4, Ly2/j;->a:Ly2/b1;

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v27, v7

    move-object/from16 v28, v16

    move-object/from16 v26, v17

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v6, v2

    mul-float/2addr v1, v6

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v2, v7, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-eqz v5, :cond_3

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    invoke-static {v7, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v26

    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    move-object/from16 v1, v27

    goto :goto_3

    :cond_5
    :goto_2
    move-object/from16 v1, v28

    goto :goto_4

    :goto_3
    invoke-static {v2, v13, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_2

    :goto_4
    invoke-static {v7, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v0, v10

    const-wide/16 v4, 0x0

    cmpl-double v0, v0, v4

    if-lez v0, :cond_6

    goto :goto_5

    :cond_6
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v0, v10, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    int-to-float v0, v3

    mul-float v4, v0, v6

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v11

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v26, v0

    invoke-virtual/range {p0 .. p0}, Lfr2/b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lfr2/a;->b()Lb91/a;

    move-result-object v20

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v9

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v24, v5, 0x12

    const v25, 0x2fff8

    move v11, v4

    const-wide/16 v4, 0x0

    move v12, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v14, v8

    const/4 v8, 0x0

    move v15, v2

    move-object/from16 v16, v3

    move-wide v2, v9

    const-wide/16 v9, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    move/from16 v21, v14

    const-wide/16 v13, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v27, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move-object/from16 v29, v19

    const/16 v19, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v31, v23

    const/16 v23, 0x30

    move/from16 v33, v22

    move/from16 v35, v27

    move-object/from16 v32, v29

    move-object/from16 v34, v31

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v22

    const/4 v0, 0x5

    int-to-float v0, v0

    mul-float v4, v0, v28

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, v26

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lfr2/b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v15, v33

    invoke-static {v0, v7, v15}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v34

    move/from16 v11, v35

    invoke-virtual {v2, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v2, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v32

    const/4 v14, 0x1

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lfr2/d;->c(Lfr2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
