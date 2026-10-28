.class public abstract Lu70/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lu70/c;",
        "heroSection",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "b",
        "(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "HEADER_TOP_INSET",
        "HEADER_BOTTOM_PADDING",
        "activation_release"
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
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x12

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lu70/d;->a:F

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lu70/d;->b:F

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lu70/d;->c(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lu70/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x58e5d447

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, p4, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p4, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p4, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, v4, 0x13

    const/4 v14, 0x0

    const/16 v15, 0x12

    const/4 v9, 0x1

    if-eq v5, v15, :cond_6

    move v5, v9

    goto :goto_4

    :cond_6
    move v5, v14

    :goto_4
    and-int/2addr v4, v9

    invoke-virtual {v10, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_7

    move-object v0, v11

    goto :goto_5

    :cond_7
    move-object v0, v3

    :goto_5
    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_8

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v5, v10, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v10, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lu70/c;->a()Lkd1/o;

    move-result-object v3

    move-object v5, v7

    sget v7, Lkd1/o;->a:I

    move-object v12, v8

    const/4 v8, 0x3

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move-object/from16 v33, v10

    move-object v10, v6

    move-object/from16 v6, v33

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    move-object/from16 v25, v6

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v11}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v6, v11

    const/16 v11, 0x6030

    move-object v7, v12

    const/16 v12, 0x68

    move-object v8, v4

    const/4 v4, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    sget-object v7, Ly2/j;->a:Ly2/b1;

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v31, v10

    move/from16 v22, v15

    move-object/from16 v30, v16

    move-object/from16 v15, v17

    move-object/from16 v1, v18

    move-object/from16 v29, v19

    move-object/from16 v14, v20

    move-object/from16 v32, v21

    move-object/from16 v10, v25

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v1}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v13, v3}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Li2/t;->b:Li2/s;

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->n()J

    move-result-wide v11

    invoke-static {v5, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    new-instance v9, Li2/x;

    invoke-direct {v9, v11, v12}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x3eb33333    # 0.35f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    move/from16 p0, v13

    invoke-virtual {v9}, Ly81/i;->n()J

    move-result-wide v13

    const v9, 0x3ecccccd    # 0.4f

    invoke-static {v9, v13, v14}, Li2/x;->c(FJ)J

    move-result-wide v12

    new-instance v9, Li2/x;

    invoke-direct {v9, v12, v13}, Li2/x;-><init>(J)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x3f0ccccd    # 0.55f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->n()J

    move-result-wide v13

    const v9, 0x3f266666    # 0.65f

    invoke-static {v9, v13, v14}, Li2/x;->c(FJ)J

    move-result-wide v13

    new-instance v9, Li2/x;

    invoke-direct {v9, v13, v14}, Li2/x;-><init>(J)V

    new-instance v13, Ll83/k;

    invoke-direct {v13, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x3f400000    # 0.75f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    move-object/from16 v18, v6

    invoke-virtual {v9}, Ly81/i;->n()J

    move-result-wide v5

    const v9, 0x3f4ccccd    # 0.8f

    invoke-static {v9, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v9, Li2/x;

    invoke-direct {v9, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    move-object/from16 v6, v18

    invoke-direct {v5, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x3f666666    # 0.9f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    move-object/from16 v19, v15

    invoke-virtual/range {v18 .. v18}, Ly81/i;->n()J

    move-result-wide v14

    invoke-static {v6, v14, v15}, Li2/x;->c(FJ)J

    move-result-wide v14

    new-instance v6, Li2/x;

    invoke-direct {v6, v14, v15}, Li2/x;-><init>(J)V

    new-instance v14, Ll83/k;

    invoke-direct {v14, v9, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    invoke-virtual {v9}, Ly81/i;->n()J

    move-result-wide v11

    new-instance v9, Li2/x;

    invoke-direct {v9, v11, v12}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v26, v5

    move-object/from16 v28, v11

    move-object/from16 v25, v13

    move-object/from16 v27, v14

    filled-new-array/range {v23 .. v28}, [Ll83/k;

    move-result-object v5

    const/16 v6, 0xe

    const/4 v14, 0x0

    invoke-static {v4, v5, v14, v14, v6}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x6

    invoke-static {v3, v4, v5, v14, v6}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v10, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move/from16 v13, p0

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v23

    sget v25, Lu70/d;->a:F

    const/16 v27, 0x0

    const/16 v28, 0xd

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x2

    int-to-float v5, v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v11, v5, v9

    const/4 v14, 0x0

    invoke-static {v3, v11, v14, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v23

    sget v27, Lu70/d;->b:F

    const/16 v28, 0x7

    const/16 v25, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v4, v3}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    move-object/from16 v15, v19

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v12, v29

    goto :goto_8

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v10, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v30

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    move-object/from16 v4, v31

    goto :goto_a

    :cond_d
    :goto_9
    move-object/from16 v4, v32

    goto :goto_b

    :goto_a
    invoke-static {v5, v10, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v10, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lu70/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v10, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v10, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v23

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v27, v11, 0x12

    const v28, 0x2fffa

    move v11, v4

    const/4 v4, 0x0

    move-object v12, v7

    move v13, v8

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    move/from16 v17, v13

    const-wide/16 v12, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move-object/from16 v20, v16

    move/from16 v21, v17

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v31, v24

    const/16 v24, 0x0

    move-object/from16 v32, v26

    const/16 v26, 0x0

    move-object/from16 p0, v0

    move/from16 v2, v29

    move-object/from16 v0, v32

    move-object/from16 v29, v1

    move/from16 v1, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v25

    invoke-virtual/range {p1 .. p1}, Lu70/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v5

    const/4 v4, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v25

    const/4 v3, 0x1

    int-to-float v4, v3

    mul-float v4, v4, v30

    move-object/from16 v6, v29

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lu70/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v5

    const/4 v4, 0x0

    const/4 v10, 0x0

    move v0, v3

    move-object v3, v1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v25

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    goto :goto_c

    :cond_e
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v3

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lt01/e;

    const/16 v6, 0xd

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lu70/d;->b(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic d(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lu70/d;->b(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
