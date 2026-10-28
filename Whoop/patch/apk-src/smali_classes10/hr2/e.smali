.class public abstract Lhr2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lhr2/b;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "d",
        "(Lhr2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "Lhr2/a;",
        "coloredText",
        "Ly3/o;",
        "textSize",
        "g",
        "(Lhr2/a;JLandroidx/compose/runtime/Composer;I)V",
        "a",
        "Lhr2/b;",
        "getWirPillarIntroViewState",
        "()Lhr2/b;",
        "wirPillarIntroViewState",
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
.field private static final a:Lhr2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lhr2/a;

    const-string v1, "Let\'s"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Ly81/f;->SLEEP:Ly81/f;

    invoke-direct {v0, v1, v2}, Lhr2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;)V

    new-instance v1, Lhr2/a;

    const-string v3, "review"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Lhr2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;)V

    new-instance v3, Lhr2/a;

    const-string v4, "your"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lhr2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;)V

    new-instance v2, Lhr2/a;

    const-string v4, "Sleep "

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct {v2, v4, v5}, Lhr2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;)V

    filled-new-array {v0, v1, v3, v2}, [Lhr2/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lkd1/o$a;

    sget v0, Lgy0/a;->O4:I

    invoke-direct {v3, v0}, Lkd1/o$a;-><init>(I)V

    new-instance v7, Llq2/t$d;

    sget-object v0, Llq2/f;->PRIMARY:Llq2/f;

    invoke-direct {v7, v0}, Llq2/t$d;-><init>(Llq2/f;)V

    sget-object v6, Lcom/whoop/user/journey/model/UserJourneyFooterStyle;->STEP_PROGRESS:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    const/high16 v0, 0x42a00000    # 80.0f

    const-wide v4, 0x100000000L

    invoke-static {v0, v4, v5}, Lv63/c;->j(FJ)J

    move-result-wide v4

    new-instance v1, Lhr2/b;

    const-string v8, "INTRO_PILLAR_SLEEP"

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lhr2/b;-><init>(Ljava/util/List;Lkd1/o;JLcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lhr2/e;->a:Lhr2/b;

    return-void
.end method

.method public static synthetic a(Lhr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhr2/e;->f(Lhr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lhr2/e;->e(Lhr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lhr2/a;JILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lhr2/e;->h(Lhr2/a;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lhr2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x7a93e28d

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lb30/a1;

    const/16 v2, 0x13

    invoke-direct {v1, p0, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, -0x38a88fbd

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lhr2/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lhr2/c;-><init>(Lhr2/b;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final e(Lhr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 20

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

    invoke-virtual/range {p0 .. p0}, Lhr2/b;->e()Lkd1/o;

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

    sget-object v4, Ly2/j;->c:Ly2/b1;

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v18, v7

    move-object/from16 v19, v16

    move-object/from16 v12, v17

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v7

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v1, v2, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->M:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    invoke-static {v2, v1, v3, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-eqz v5, :cond_3

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    invoke-static {v3, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

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
    move-object/from16 v1, v18

    goto :goto_3

    :cond_5
    :goto_2
    move-object/from16 v1, v19

    goto :goto_4

    :goto_3
    invoke-static {v2, v13, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_2

    :goto_4
    invoke-static {v3, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

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

    const/4 v1, 0x1

    invoke-direct {v0, v10, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, -0x71da5fbc

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lhr2/b;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhr2/a;

    invoke-virtual/range {p0 .. p0}, Lhr2/b;->g()J

    move-result-wide v4

    invoke-static {v4, v5}, Ly3/o;->c(J)F

    move-result v4

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v13, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    const-wide v6, 0x100000000L

    invoke-static {v4, v6, v7, v5}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v4

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v4, v5, v3, v6}, Lhr2/e;->g(Lhr2/a;JLandroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_7
    const/4 v2, 0x0

    invoke-static {v13, v2, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lhr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lhr2/e;->d(Lhr2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lhr2/a;JLandroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v1, p0

    const-string v0, "coloredText"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0xcf19545

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, p4, 0x8

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
    or-int v2, p4, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p4

    :goto_2
    and-int/lit8 v3, p4, 0x30

    move-wide/from16 v6, p1

    if-nez v3, :cond_4

    invoke-virtual {v0, v6, v7}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v2, v3

    :cond_4
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    if-eq v3, v4, :cond_5

    const/4 v3, 0x1

    goto :goto_4

    :cond_5
    move v3, v5

    :goto_4
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v0, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Lhr2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v0, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lhr2/h;->a()Ll3/v0;

    move-result-object v22

    invoke-virtual {v1}, Lhr2/a;->b()Ly81/f;

    move-result-object v4

    invoke-virtual {v4, v0, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    shl-int/lit8 v2, v2, 0x6

    and-int/lit16 v2, v2, 0x1c00

    const/high16 v25, 0x180000

    const v26, 0xfff2

    move/from16 v24, v2

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v23, v0

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_6
    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_5
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_7

    new-instance v0, Lhr2/d;

    const/4 v5, 0x0

    move-wide/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lhr2/d;-><init>(Ljava/lang/Object;JII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final h(Lhr2/a;JILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lhr2/e;->g(Lhr2/a;JLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
