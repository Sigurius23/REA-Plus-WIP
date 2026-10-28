.class public abstract Lc41/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc41/v1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a?\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aA\u0010\r\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000b\u001a\u0013\u0010\u000f\u001a\u00020\u0008*\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\'\u00b2\u0006\u000e\u0010 \u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010!\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\"\u001a\u00020\u00188\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010%\u001a\u00020#8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010&\u001a\u00020#8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/w1;",
        "viewState",
        "",
        "isExpandedView",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "B",
        "(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "onOverflow",
        "r",
        "Ll0/u;",
        "o",
        "(Ll0/u;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Ll83/k;",
        "",
        "Li2/x;",
        "a",
        "[Ll83/k;",
        "GRADIENT_COLOR_STOPS",
        "Ly3/f;",
        "b",
        "F",
        "GRADIENT_SIZE",
        "Lh2/b;",
        "c",
        "J",
        "GRADIENT_CENTER",
        "hasOverflow",
        "isExpanded",
        "maxHeight",
        "",
        "titleMaxLines",
        "bodyMaxLinesWhenExpanded",
        "bodyMaxLines",
        "design_release"
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
.field private static final a:[Ll83/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/k;"
        }
    .end annotation
.end field

.field private static final b:F

.field private static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-wide v2, 0xff00f19fL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f19999a    # 0.6f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const v3, 0x4d67aee6    # 2.4293744E8f

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f666666    # 0.9f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const v4, 0xffffff

    invoke-static {v4}, Li2/w0;->c(I)J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4}, [Ll83/k;

    move-result-object v1

    sput-object v1, Lc41/v1;->a:[Ll83/k;

    const/16 v1, 0x58

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sput v1, Lc41/v1;->b:F

    const-wide v1, 0x7f8000007f800000L    # 1.404448428688076E306

    const/4 v3, 0x1

    invoke-static {v0, v0, v1, v2, v3}, Lh2/b;->a(FFJI)J

    move-result-wide v0

    sput-wide v0, Lc41/v1;->c:J

    return-void
.end method

.method private static final A(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lc41/v1;->r(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final B(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/w1;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v4, p3

    move/from16 v8, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x12483a36

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v8, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v8, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v2

    :goto_0
    or-int/2addr v6, v8

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v8

    :goto_1
    and-int/lit8 v7, v8, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move/from16 v10, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v10, v8, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p2

    invoke-virtual {v9, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    :goto_4
    and-int/lit16 v11, v8, 0xc00

    const/16 v12, 0x800

    if-nez v11, :cond_9

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    move v11, v12

    goto :goto_5

    :cond_8
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v6, v11

    :cond_9
    and-int/lit16 v11, v6, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v11, v13, :cond_a

    move v11, v15

    goto :goto_6

    :cond_a
    move v11, v14

    :goto_6
    and-int/lit8 v13, v6, 0x1

    invoke-virtual {v9, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_16

    if-eqz v0, :cond_b

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v11, v0

    goto :goto_7

    :cond_b
    move-object v11, v5

    :goto_7
    if-eqz v7, :cond_c

    move v10, v14

    :cond_c
    invoke-virtual {v1}, Lc41/w1;->b()Lf01/q1;

    move-result-object v0

    sget-object v5, Lc41/v1$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    const/4 v5, 0x3

    if-eq v0, v15, :cond_d

    if-eq v0, v2, :cond_d

    if-eq v0, v5, :cond_d

    if-eq v0, v3, :cond_d

    const v0, 0x7cd99ef3

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    goto :goto_9

    :cond_d
    const v0, 0x7cd8ebfa

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lc41/w1;->m()Lh01/a;

    move-result-object v0

    invoke-virtual {v0}, Lh01/a;->getBorderInformation()Ld11/a;

    move-result-object v0

    if-nez v0, :cond_e

    const v0, 0x7cd8ebf9

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_8

    :cond_e
    const v2, 0x5eddb508

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v7

    const/16 v7, 0x30

    invoke-static {v0, v2, v9, v7}, Ld11/f;->y(Ld11/a;FLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v0

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    move-object v8, v0

    :goto_9
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_f

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v0, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_10

    invoke-static {v10, v9}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v7

    :cond_10
    check-cast v7, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v2, :cond_11

    new-instance v13, Lb01/m;

    const/4 v15, 0x7

    invoke-direct {v13, v15, v7}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-static {v13}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v13

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lp1/t2;

    invoke-virtual {v1}, Lc41/w1;->m()Lh01/a;

    move-result-object v15

    sget-object v3, Lh01/a;->ADVANCED_LABS:Lh01/a;

    if-ne v15, v3, :cond_12

    const/4 v3, 0x1

    goto :goto_a

    :cond_12
    move v3, v14

    :goto_a
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    and-int/lit16 v6, v6, 0x1c00

    if-ne v6, v12, :cond_13

    const/4 v6, 0x1

    goto :goto_b

    :cond_13
    move v6, v14

    :goto_b
    or-int/2addr v6, v15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_14

    if-ne v12, v2, :cond_15

    :cond_14
    new-instance v12, Lbs1/v;

    const/16 v2, 0xb

    invoke-direct {v12, v1, v4, v2}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v12, Lc93/a;

    const/4 v2, 0x0

    invoke-static {v11, v14, v2, v12, v5}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v2, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->V0()J

    move-result-wide v14

    int-to-float v2, v5

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v16

    invoke-virtual {v1}, Lc41/w1;->m()Lh01/a;

    move-result-object v2

    invoke-virtual {v2}, Lh01/a;->getElevation-D9Ej5fM()F

    move-result v17

    move-object v5, v0

    new-instance v0, Lc41/t1;

    move-object v4, v7

    const/4 v7, 0x0

    move-object/from16 v6, p3

    move-object v2, v13

    invoke-direct/range {v0 .. v7}, Lc41/t1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ll83/e;I)V

    const v1, 0x7cdcc55a

    invoke-static {v1, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/high16 v19, 0xc00000

    const/16 v20, 0x22

    move v1, v10

    const/4 v10, 0x0

    move-object/from16 v18, v9

    move-object v5, v11

    move-object v9, v12

    move-wide v11, v14

    const/4 v15, 0x0

    move-object v14, v8

    move-object/from16 v13, v16

    move/from16 v16, v17

    move-object/from16 v17, v0

    invoke-static/range {v9 .. v20}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move v3, v1

    :goto_c
    move-object v1, v5

    goto :goto_d

    :cond_16
    move-object/from16 v18, v9

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    move v3, v10

    goto :goto_c

    :goto_d
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lc41/s1;

    const/4 v7, 0x1

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lc41/s1;-><init>(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
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

.method private static final D(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lc41/v1;->B(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp1/c1;Z)V
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

.method private static final G(Lp1/c1;Z)V
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

.method private static final H(Lp1/c1;)Ly3/f;
    .locals 1

    invoke-static {p0}, Lc41/v1;->F(Lp1/c1;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x1388

    int-to-float p0, p0

    goto :goto_0

    :cond_0
    sget-object p0, Lh01/c;->a:Lh01/c;

    invoke-virtual {p0}, Lh01/c;->b()F

    move-result p0

    :goto_0
    new-instance v0, Ly3/f;

    invoke-direct {v0, p0}, Ly3/f;-><init>(F)V

    return-object v0
.end method

.method private static final I(Lp1/t2;)F
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

.method private static final J(Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lc41/w1;->j()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc41/w1;->g()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lc41/w1;Lp1/t2;ZLp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 19

    move-object/from16 v7, p5

    and-int/lit8 v0, p7, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x2

    if-eq v0, v10, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    and-int/lit8 v1, p7, 0x1

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual/range {p0 .. p0}, Lc41/w1;->m()Lh01/a;

    move-result-object v0

    invoke-virtual {v0}, Lh01/a;->getStyleModifier()Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lh01/c;->a:Lh01/c;

    invoke-virtual {v1}, Lh01/c;->a()Ld0/e2;

    move-result-object v1

    invoke-static {v0, v1, v10}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x23

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v11, v2

    mul-float/2addr v1, v11

    invoke-static/range {p1 .. p1}, Lc41/v1;->I(Lp1/t2;)F

    move-result v2

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v4, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v4, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v12, v11

    sget-object v11, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-eqz p2, :cond_4

    const v0, -0x7bfc5ed4

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x6

    invoke-static {v11, v4, v0}, Lc41/v1;->o(Ll0/u;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const v0, -0x7bfb941e

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_2
    invoke-static/range {p3 .. p3}, Lc41/v1;->F(Lp1/c1;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v0, v13, :cond_5

    new-instance v0, Laq1/d;

    const/4 v1, 0x7

    move-object/from16 v14, p4

    invoke-direct {v0, v1, v14}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    move-object/from16 v14, p4

    :goto_3
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/16 v5, 0xc00

    const/4 v6, 0x1

    const/4 v0, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v0 .. v6}, Lc41/v1;->r(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lc41/w1;->i()Lgz0/m0;

    move-result-object v14

    if-nez v14, :cond_6

    const v0, -0x7bf6ecec

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    move-object v0, v13

    goto/16 :goto_8

    :cond_6
    const v0, -0x7bf6eceb

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const-string v2, "entry_point_end_icon"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float/2addr v2, v12

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v4, v2}, Lp1/q;->e(I)Z

    move-result v2

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    if-ne v3, v13, :cond_8

    :cond_7
    new-instance v3, Lc;

    const/16 v2, 0x19

    invoke-direct {v3, v14, v1, v7, v2}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lc93/a;

    const/4 v2, 0x0

    const/4 v5, 0x3

    invoke-static {v0, v9, v2, v3, v5}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v0, Lgz0/m0;->CROSS:Lgz0/m0;

    if-ne v14, v0, :cond_a

    const v0, 0x4d13558d    # 1.5449109E8f

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_9

    sget-object v0, Lc41/v1$a;->w:Lc41/v1$a;

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_4
    move-object v15, v0

    goto :goto_5

    :cond_a
    const v0, 0x4d135b60    # 1.5451494E8f

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lc41/w1;->m()Lh01/a;

    move-result-object v0

    invoke-virtual {v0}, Lh01/a;->getEndIconColor()Ly81/e;

    move-result-object v0

    goto :goto_4

    :goto_5
    invoke-virtual {v1}, Lc41/w1;->l()Lm91/u;

    move-result-object v0

    const/16 v1, 0x8

    if-eqz v0, :cond_b

    const-wide v2, 0x400599999999999aL    # 2.7

    :goto_6
    double-to-float v0, v2

    int-to-float v2, v1

    mul-float/2addr v0, v2

    goto :goto_7

    :cond_b
    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    goto :goto_6

    :goto_7
    int-to-float v2, v10

    int-to-float v1, v1

    mul-float/2addr v2, v1

    const/16 v1, 0x9

    const/4 v3, 0x0

    invoke-static {v3, v0, v2, v3, v1}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v0

    const/16 v17, 0x6

    const/16 v18, 0x0

    move-object/from16 v16, v13

    move-object v13, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v18}, Lh01/x;->i(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_8
    invoke-static/range {p4 .. p4}, Lc41/v1;->C(Lp1/c1;)Z

    move-result v1

    if-nez v1, :cond_d

    invoke-static/range {p3 .. p3}, Lc41/v1;->F(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_9

    :cond_c
    const v0, -0x7be2f75e

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_d
    :goto_9
    const v1, -0x7be5848c

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-static/range {p3 .. p3}, Lc41/v1;->F(Lp1/c1;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_e

    new-instance v2, Lb01/m;

    const/16 v0, 0x8

    move-object/from16 v3, p3

    invoke-direct {v2, v0, v3}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lc93/a;

    const/16 v0, 0x6006

    const/4 v3, 0x5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 p6, v0

    move/from16 p2, v1

    move-object/from16 p4, v2

    move/from16 p7, v3

    move-object/from16 p5, v4

    move-object/from16 p1, v5

    move/from16 p3, v6

    move-object/from16 p0, v11

    invoke-static/range {p0 .. p7}, Lh01/x;->e(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final L(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/v1;->E(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lgz0/m0;Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lgz0/m0;->CROSS:Lgz0/m0;

    if-ne p0, v0, :cond_1

    invoke-virtual {p1}, Lc41/w1;->h()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lc41/w1;->getId()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance p1, Lc41/p1;

    invoke-direct {p1, p0}, Lc41/p1;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lc41/w1;->g()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lc41/v1;->F(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lc41/v1;->G(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/v1;->z(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/v1;->q(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/v1;->L(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/v1;->J(Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/v1;->N(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ll3/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/v1;->y(Lkotlin/jvm/functions/Function1;Ll3/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Z)I
    .locals 0

    invoke-static {p0}, Lc41/v1;->t(Z)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lc41/v1;->A(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;)Ly3/f;
    .locals 0

    invoke-static {p0}, Lc41/v1;->H(Lp1/c1;)Ly3/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lc41/v1;->D(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lc41/w1;Lp1/t2;ZLp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lc41/v1;->K(Lc41/w1;Lp1/t2;ZLp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/v1;->s(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lgz0/m0;Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/v1;->M(Lgz0/m0;Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/v1;->p(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Ll0/u;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, -0x54875582

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_2

    move v1, v4

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    and-int/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    sget v1, Lc41/v1;->b:F

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    sget-object v4, Li2/t;->b:Li2/s;

    sget-object v1, Lc41/v1;->a:[Ll83/k;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, [Ll83/k;

    sget-wide v6, Lc41/v1;->c:J

    const v1, 0x3fb33333    # 1.4f

    div-float v8, v0, v1

    const/16 v9, 0x8

    invoke-static/range {v4 .. v9}, Li2/s;->h(Li2/s;[Ll83/k;JFI)Li2/u0;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-interface {p0, v1}, Ll0/u;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_3

    new-instance v2, Lc31/m;

    const/16 v4, 0xa

    invoke-direct {v2, v4}, Lc31/m;-><init>(I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-static {v1, v0, v2, v4, v5}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p1, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lc41/u1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lc41/u1;-><init>(Ll0/u;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final p(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ecccccd    # 0.4f

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/v1;->o(Ll0/u;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/w1;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    sget-object v0, Lb2/e;->K:Lb2/l;

    const-string v1, "viewState"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v1, -0x52db7188

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v5, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_3

    :cond_7
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v6, v10

    :goto_4
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v6, v6, 0xc00

    :cond_8
    move-object/from16 v12, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_8

    move-object/from16 v12, p3

    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_5

    :cond_a
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v6, v13

    :goto_6
    and-int/lit16 v13, v6, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x0

    if-eq v13, v14, :cond_b

    const/4 v13, 0x1

    goto :goto_7

    :cond_b
    move v13, v15

    :goto_7
    and-int/lit8 v14, v6, 0x1

    invoke-virtual {v9, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_32

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_c

    move-object v4, v13

    :cond_c
    if-eqz v7, :cond_d

    move v1, v15

    goto :goto_8

    :cond_d
    move v1, v8

    :goto_8
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_e

    new-instance v8, Lc31/m;

    const/16 v10, 0xb

    invoke-direct {v8, v10}, Lc31/m;-><init>(I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_f
    move-object v8, v12

    :goto_9
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_10

    new-instance v10, Lc41/r1;

    const/4 v12, 0x0

    invoke-direct {v10, v1, v12}, Lc41/r1;-><init>(ZI)V

    invoke-static {v10}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v10

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v10, Lp1/t2;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v7, :cond_11

    const/16 v12, 0x64

    invoke-static {v12, v9}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v12

    :cond_11
    check-cast v12, Lp1/c1;

    if-eqz v1, :cond_12

    invoke-static {v12}, Lc41/v1;->v(Lp1/c1;)I

    move-result v14

    goto :goto_a

    :cond_12
    const/4 v14, 0x5

    :goto_a
    invoke-static {v14, v9}, Ld0/g;->c(ILp1/q;)Lp1/t2;

    move-result-object v32

    move-object/from16 p0, v12

    const-wide/high16 v11, 0x4004000000000000L    # 2.5

    double-to-float v11, v11

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    move-object/from16 p2, v10

    const/4 v10, 0x3

    int-to-float v14, v10

    mul-float/2addr v14, v12

    new-instance v10, Ll0/l1;

    invoke-direct {v10, v11, v11, v14, v11}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move/from16 v19, v11

    sget-object v11, Ll0/m;->c:Ll0/g;

    move/from16 v23, v12

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v9, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v26, v11

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 v33, v1

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-eqz v1, :cond_13

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v34, v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_c

    :cond_14
    move-object/from16 v34, v4

    :goto_c
    invoke-static {v14, v9, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v35, "invalid weight; must be greater than zero"

    const-wide/16 v36, 0x0

    if-nez v4, :cond_16

    const v4, 0x43ec52fd

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    move-object/from16 v52, p0

    move v5, v6

    move-object/from16 v57, v7

    move-object/from16 v51, v8

    move-object/from16 v54, v12

    move-object/from16 v43, v13

    move-object v14, v15

    move/from16 v45, v23

    move-object/from16 v53, v26

    const/4 v6, 0x1

    const/16 v47, 0x3

    move-object v13, v11

    goto/16 :goto_18

    :cond_16
    const v14, 0x43ec52fe

    invoke-virtual {v9, v14}, Lp1/q;->e0(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->l()Lm91/u;

    move-result-object v16

    if-eqz v16, :cond_17

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v13

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 v17, v12

    move-object/from16 v12, v16

    invoke-interface {v10, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    goto :goto_d

    :cond_17
    move-object/from16 v17, v12

    move-object v12, v13

    invoke-interface {v10, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    :goto_d
    sget-object v13, Ll0/m;->g:Ll0/h;

    const/16 v14, 0x36

    invoke-static {v13, v0, v9, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v13

    move-object/from16 v18, v15

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_18

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v9, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_19

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    :cond_19
    move-object/from16 v5, v18

    goto :goto_f

    :cond_1a
    move-object/from16 v5, v18

    goto :goto_10

    :goto_f
    invoke-static {v14, v9, v14, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_10
    invoke-static {v9, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v10, 0x3f666666    # 0.9f

    float-to-double v13, v10

    cmpl-double v13, v13, v36

    if-lez v13, :cond_1b

    goto :goto_11

    :cond_1b
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_11
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v38, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v14, v10, v38

    if-lez v14, :cond_1c

    move/from16 v10, v38

    :cond_1c
    const/4 v14, 0x1

    invoke-direct {v13, v10, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v10, 0x0

    invoke-static {v4, v9, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v14, Lx81/d;->a:Lx81/d;

    const/4 v15, 0x6

    invoke-virtual {v14, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->y()J

    move-result-wide v18

    invoke-virtual {v14, v9, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->a()Lb91/a;

    move-result-object v14

    invoke-static/range {p2 .. p2}, Lc41/v1;->u(Lp1/t2;)I

    move-result v20

    and-int/lit16 v10, v6, 0x1c00

    const/16 v15, 0x800

    if-ne v10, v15, :cond_1d

    const/4 v10, 0x1

    goto :goto_12

    :cond_1d
    const/4 v10, 0x0

    :goto_12
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v10, :cond_1e

    if-ne v15, v7, :cond_1f

    :cond_1e
    new-instance v15, La61/a;

    const/16 v10, 0x11

    invoke-direct {v15, v8, v10}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v30, 0x30

    const v31, 0x257f8

    move-object/from16 v21, v11

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move-object/from16 v29, v7

    move-object v7, v13

    const/4 v13, 0x0

    move-object/from16 v39, v26

    move-object/from16 v26, v14

    const/4 v14, 0x0

    move-object/from16 v25, v15

    const/high16 v40, 0x3f800000    # 1.0f

    const/16 v41, 0x36

    const-wide/16 v15, 0x0

    move-object/from16 v42, v17

    const/16 v17, 0x0

    move-object/from16 v43, v28

    move-object/from16 v28, v9

    move-wide/from16 v58, v18

    move-object/from16 v19, v8

    move-wide/from16 v8, v58

    const/16 v18, 0x0

    move-object/from16 v44, v19

    move/from16 v45, v23

    move/from16 v23, v20

    const-wide/16 v19, 0x0

    move-object/from16 v46, v21

    const/16 v21, 0x2

    const/16 v47, 0x3

    const/16 v22, 0x0

    const/16 v48, 0x0

    const/16 v24, 0x0

    const/16 v49, 0x6

    const/16 v27, 0x0

    move-object/from16 v50, v29

    const/16 v29, 0x0

    move-object/from16 v52, p0

    move-object/from16 v56, v5

    move v5, v6

    move-object/from16 v53, v39

    move-object/from16 v54, v42

    move-object/from16 v51, v44

    move-object/from16 v55, v46

    move-object/from16 v57, v50

    move-object v6, v4

    move/from16 v4, v48

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->l()Lm91/u;

    move-result-object v6

    if-nez v6, :cond_20

    const v6, -0x6514194f

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    move-object/from16 v13, v55

    move-object/from16 v14, v56

    const/4 v6, 0x1

    goto/16 :goto_17

    :cond_20
    const v7, -0x6514194e

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    const v7, 0x3ecccccd    # 0.4f

    float-to-double v10, v7

    cmpl-double v8, v10, v36

    if-lez v8, :cond_21

    goto :goto_13

    :cond_21
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_13
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v10, v7, v38

    if-lez v10, :cond_22

    move/from16 v7, v38

    :cond_22
    invoke-direct {v8, v7, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_23

    move-object/from16 v13, v55

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_23
    move-object/from16 v13, v55

    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v9, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_24

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    :cond_24
    move-object/from16 v14, v56

    goto :goto_15

    :cond_25
    move-object/from16 v14, v56

    goto :goto_16

    :goto_15
    invoke-static {v10, v9, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_16
    invoke-static {v9, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move-object/from16 v10, v28

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    const/4 v6, 0x1

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_18
    int-to-float v7, v6

    mul-float v20, v7, v45

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v43

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v12, v16

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->g:Ll0/h;

    const/16 v10, 0x36

    invoke-static {v8, v0, v9, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_26

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_26
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_27

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    :cond_27
    invoke-static {v8, v9, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v9, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v7, v6

    cmpl-double v0, v7, v36

    if-lez v0, :cond_29

    goto :goto_1a

    :cond_29
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v7, v6, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v8, v53

    move-object/from16 v10, v54

    invoke-static {v8, v10, v9, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_2a

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1b

    :cond_2a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1b
    invoke-static {v9, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_2b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    :cond_2b
    invoke-static {v10, v9, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    invoke-static {v9, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v1

    mul-float v18, v1, v45

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v12

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, v16

    if-lez v0, :cond_2d

    goto :goto_1c

    :cond_2d
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1c
    invoke-static {v1, v4, v6}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v15, 0x6

    invoke-virtual {v0, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-virtual {v0, v9, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-static/range {v32 .. v32}, Lc41/v1;->x(Lp1/t2;)I

    move-result v23

    and-int/lit16 v0, v5, 0x1c00

    const/16 v14, 0x800

    if-ne v0, v14, :cond_2e

    const/4 v15, 0x1

    goto :goto_1d

    :cond_2e
    move v15, v4

    :goto_1d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v15, :cond_30

    move-object/from16 v1, v57

    if-ne v0, v1, :cond_2f

    goto :goto_1e

    :cond_2f
    move-object/from16 v3, v51

    goto :goto_1f

    :cond_30
    :goto_1e
    new-instance v0, Lb30/r;

    const/4 v1, 0x4

    move-object/from16 v3, v51

    move-object/from16 v12, v52

    invoke-direct {v0, v3, v12, v1}, Lb30/r;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    move-object/from16 v25, v0

    check-cast v25, Lkotlin/jvm/functions/Function1;

    const/16 v30, 0x30

    const v31, 0x257f8

    move-object/from16 v28, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->e()Lgz0/m0;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->m()Lh01/a;

    move-result-object v0

    invoke-virtual {v0}, Lh01/a;->getButtonColor()Ljava/util/List;

    move-result-object v8

    shl-int/lit8 v0, v5, 0x3

    const v1, 0xfc00

    and-int v12, v0, v1

    const/4 v13, 0x0

    move-object v10, v3

    move-object/from16 v11, v28

    move/from16 v9, v33

    invoke-static/range {v6 .. v13}, Lh01/p;->q(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v44, v10

    move-object v9, v11

    const/4 v14, 0x1

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lc41/w1;->k()Lkd1/o;

    move-result-object v6

    if-nez v6, :cond_31

    const v0, 0x3acf3093

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_20
    const/4 v14, 0x1

    goto :goto_21

    :cond_31
    const v0, 0x3acf3094

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/16 v0, 0x19

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    const/16 v14, 0x1b0

    const/16 v15, 0x78

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v0

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_20

    :goto_21
    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    move/from16 v3, v33

    move-object/from16 v1, v34

    move-object/from16 v4, v44

    goto :goto_22

    :cond_32
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v4

    move v3, v8

    move-object v4, v12

    :goto_22
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_33

    new-instance v0, Lc41/s1;

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lc41/s1;-><init>(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_33
    return-void
.end method

.method private static final s(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Z)I
    .locals 0

    if-eqz p0, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0
.end method

.method private static final u(Lp1/t2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final v(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final w(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final x(Lp1/t2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Ll3/r0;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll3/r0;->e()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll3/r0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p0, p2, Ll3/r0;->b:Ll3/w;

    iget p0, p0, Ll3/w;->f:I

    invoke-static {p1, p0}, Lc41/v1;->w(Lp1/c1;I)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
