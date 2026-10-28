.class public abstract Lsz0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a3\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u001a\u0010\u0013\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0010\u001a\u0004\u0008\u0015\u0010\u0012\"\u001a\u0010\u001b\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e\u00b2\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lsz0/g;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lsz0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lsz0/h;",
        "",
        "isSelected",
        "n",
        "(Lsz0/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lsz0/h;",
        "getFakeBinaryIconPositiveState",
        "()Lsz0/h;",
        "fakeBinaryIconPositiveState",
        "b",
        "getFakeBinaryIconNegativeState",
        "fakeBinaryIconNegativeState",
        "c",
        "Lsz0/g;",
        "getFakeBinaryFeedbackState",
        "()Lsz0/g;",
        "fakeBinaryFeedbackState",
        "Lsz0/f;",
        "localSelection",
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
.field private static final a:Lsz0/h;

.field private static final b:Lsz0/h;

.field private static final c:Lsz0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lsz0/h;

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->t()I

    move-result v1

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->k0()I

    move-result v3

    const/16 v6, 0x10

    const/4 v7, 0x0

    const-string v2, "Thumbs up"

    const-string v4, "Thumbs up"

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lsz0/h;-><init>(ILjava/lang/String;ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsz0/e;->a:Lsz0/h;

    new-instance v9, Lsz0/h;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->s()I

    move-result v10

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->j0()I

    move-result v12

    const/16 v15, 0x10

    const/16 v16, 0x0

    const-string v11, "Thumbs down"

    const-string v13, "Thumbs down"

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Lsz0/h;-><init>(ILjava/lang/String;ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lsz0/e;->b:Lsz0/h;

    new-instance v1, Lsz0/g;

    const-string v2, "Was this visit summary helpful?"

    sget-object v3, Lsz0/f;->NONE:Lsz0/f;

    invoke-direct {v1, v2, v3, v0, v9}, Lsz0/g;-><init>(Ljava/lang/String;Lsz0/f;Lsz0/h;Lsz0/h;)V

    sput-object v1, Lsz0/e;->c:Lsz0/g;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsz0/e;->k(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsz0/e;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsz0/e;->l(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lsz0/e;->o(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lsz0/h;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsz0/e;->p(Lsz0/h;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lsz0/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsz0/e;->m(Landroidx/compose/ui/Modifier;Lsz0/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lsz0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lsz0/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x28961320

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v4, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v6, v10

    :goto_5
    and-int/lit16 v10, v6, 0x93

    const/16 v11, 0x92

    if-eq v10, v11, :cond_9

    const/4 v10, 0x1

    goto :goto_6

    :cond_9
    const/4 v10, 0x0

    :goto_6
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_20

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_a

    move-object v1, v10

    goto :goto_7

    :cond_a
    move-object v1, v5

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_b

    new-instance v7, Lsl0/h3;

    const/16 v9, 0x1d

    invoke-direct {v7, v9}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v7, v9

    :goto_8
    invoke-virtual {v2}, Lsz0/g;->c()Lsz0/f;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    invoke-virtual {v0, v9}, Lp1/q;->e(I)Z

    move-result v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_d

    if-ne v11, v5, :cond_e

    :cond_d
    invoke-virtual {v2}, Lsz0/g;->c()Lsz0/f;

    move-result-object v9

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v11, Lp1/c1;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->g:Ll0/h;

    const/16 v3, 0x36

    invoke-static {v8, v15, v0, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object v8, v10

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_f

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v31, v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_a

    :cond_10
    move-object/from16 v31, v1

    :goto_a
    invoke-static {v9, v0, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v9, v5

    invoke-virtual {v2}, Lsz0/g;->e()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_12

    const v5, 0x56e0b537

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    move-object/from16 p0, v1

    move-object/from16 p2, v3

    move/from16 v36, v6

    move-object/from16 v32, v7

    move-object v1, v8

    move-object/from16 v41, v9

    move-object/from16 v37, v10

    move-object/from16 v35, v11

    move-object v2, v13

    move-object v4, v15

    const/4 v3, 0x6

    move-object v6, v0

    move v0, v14

    :goto_b
    const/4 v5, 0x2

    goto/16 :goto_d

    :cond_12
    const v14, 0x56e0b538

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    move-object/from16 p2, v13

    const/high16 v14, 0x3f800000    # 1.0f

    float-to-double v12, v14

    const-wide/16 v19, 0x0

    cmpl-double v12, v12, v19

    if-lez v12, :cond_13

    const/4 v12, 0x1

    goto :goto_c

    :cond_13
    const/4 v12, 0x0

    :goto_c
    if-nez v12, :cond_14

    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_14
    move v12, v6

    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v6, v14, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v14, Lb91/c;->Companion:Lb91/c$a;

    sget-object v13, Lb91/c;->B1:Lb91/c;

    invoke-virtual {v14, v13}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v25

    sget-object v13, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/4 v14, 0x6

    invoke-virtual {v13, v0, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object/from16 v20, v9

    move-object v13, v10

    const-wide/16 v9, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move/from16 v26, v14

    move-object/from16 v24, v15

    const-wide/16 v14, 0x0

    const/16 v27, 0x1

    const/16 v16, 0x0

    const/16 v28, 0x0

    const/16 v17, 0x0

    move-object/from16 v32, v7

    move-object/from16 v33, v8

    move-wide/from16 v7, v18

    const-wide/16 v18, 0x0

    move-object/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move-object/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v24

    const/16 v24, 0x0

    move/from16 v39, v26

    const/16 v26, 0x0

    move/from16 v40, v28

    const/16 v28, 0x0

    move-object/from16 v2, p2

    move-object/from16 v27, v0

    move-object/from16 p0, v1

    move-object/from16 p2, v3

    move-object/from16 v1, v33

    move-object/from16 v41, v34

    move-object/from16 v4, v38

    move/from16 v3, v39

    move/from16 v0, v40

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v27

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :goto_d
    int-to-float v5, v5

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v7, Lb2/e;->J:Lb2/l;

    invoke-static {v5, v7, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_15

    invoke-virtual {v6, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v6, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, p2

    invoke-static {v6, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    move-object/from16 v13, v37

    goto :goto_10

    :cond_17
    :goto_f
    move-object/from16 v2, p0

    goto :goto_11

    :goto_10
    invoke-static {v5, v6, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v6, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lsz0/g;->b()Lsz0/h;

    move-result-object v1

    invoke-static/range {v35 .. v35}, Lsz0/e;->i(Lp1/c1;)Lsz0/f;

    move-result-object v2

    sget-object v3, Lsz0/f;->POSITIVE:Lsz0/f;

    if-ne v2, v3, :cond_18

    const/4 v12, 0x1

    :goto_12
    move-object/from16 v11, v35

    goto :goto_13

    :cond_18
    move v12, v0

    goto :goto_12

    :goto_13
    invoke-virtual {v6, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    move/from16 v3, v36

    and-int/lit16 v3, v3, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_19

    const/4 v5, 0x1

    goto :goto_14

    :cond_19
    move v5, v0

    :goto_14
    or-int/2addr v2, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v9, v41

    if-nez v2, :cond_1b

    if-ne v5, v9, :cond_1a

    goto :goto_15

    :cond_1a
    move-object/from16 v7, v32

    goto :goto_16

    :cond_1b
    :goto_15
    new-instance v5, Lp40/b;

    const/4 v2, 0x5

    move-object/from16 v7, v32

    invoke-direct {v5, v7, v11, v2}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v2, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    invoke-static {v1, v12, v5, v6, v2}, Lsz0/e;->n(Lsz0/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p1 .. p1}, Lsz0/g;->a()Lsz0/h;

    move-result-object v1

    invoke-static {v11}, Lsz0/e;->i(Lp1/c1;)Lsz0/f;

    move-result-object v5

    sget-object v8, Lsz0/f;->NEGATIVE:Lsz0/f;

    if-ne v5, v8, :cond_1c

    const/4 v12, 0x1

    goto :goto_17

    :cond_1c
    move v12, v0

    :goto_17
    invoke-virtual {v6, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-ne v3, v4, :cond_1d

    const/4 v0, 0x1

    :cond_1d
    or-int/2addr v0, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1e

    if-ne v3, v9, :cond_1f

    :cond_1e
    new-instance v3, Lp40/b;

    const/4 v0, 0x6

    invoke-direct {v3, v7, v11, v0}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v12, v3, v6, v2}, Lsz0/e;->n(Lsz0/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v13, 0x1

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    move-object v3, v7

    move-object/from16 v1, v31

    goto :goto_18

    :cond_20
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v9

    :goto_18
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_21

    new-instance v0, Ls51/b;

    const/16 v6, 0x16

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Lsz0/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lsz0/f;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsz0/f;

    return-object p0
.end method

.method private static final j(Lp1/c1;Lsz0/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lsz0/f;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsz0/f;->POSITIVE:Lsz0/f;

    invoke-static {p1, v0}, Lsz0/e;->j(Lp1/c1;Lsz0/f;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsz0/f;->NEGATIVE:Lsz0/f;

    invoke-static {p1, v0}, Lsz0/e;->j(Lp1/c1;Lsz0/f;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lsz0/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsz0/e;->g(Landroidx/compose/ui/Modifier;Lsz0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lsz0/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsz0/h;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0xa6f3297

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v5, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v5

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v7

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit16 v6, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v11, 0x0

    if-eq v6, v8, :cond_7

    move v6, v9

    goto :goto_5

    :cond_7
    move v6, v11

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v10, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    if-eqz v2, :cond_8

    invoke-virtual {v1}, Lsz0/h;->b()I

    move-result v6

    goto :goto_6

    :cond_8
    invoke-virtual {v1}, Lsz0/h;->d()I

    move-result v6

    :goto_6
    if-eqz v2, :cond_9

    invoke-virtual {v1}, Lsz0/h;->a()Ljava/lang/String;

    move-result-object v8

    goto :goto_7

    :cond_9
    invoke-virtual {v1}, Lsz0/h;->c()Ljava/lang/String;

    move-result-object v8

    :goto_7
    if-eqz v2, :cond_a

    const/4 v12, 0x0

    goto :goto_8

    :cond_a
    invoke-virtual {v1}, Lsz0/h;->e()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    :goto_8
    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v12, :cond_e

    const v14, 0x4236c78c    # 45.69487f

    invoke-virtual {v10, v14}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v7, :cond_b

    goto :goto_9

    :cond_b
    move v9, v11

    :goto_9
    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_c

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v7, v0, :cond_d

    :cond_c
    new-instance v7, Lcw2/b;

    const/4 v0, 0x5

    invoke-direct {v7, v3, v12, v0}, Lcw2/b;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    const v0, 0x4237ce33

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object v0, v13

    :goto_a
    const/4 v7, 0x6

    invoke-static {v6, v10, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/4 v9, 0x5

    int-to-float v9, v9

    int-to-float v5, v5

    mul-float/2addr v9, v5

    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v5, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    if-eqz v2, :cond_f

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v11

    goto :goto_b

    :cond_f
    invoke-virtual {v5}, Ly81/i;->d1()J

    move-result-wide v11

    :goto_b
    const/4 v5, 0x0

    move-wide/from16 v19, v11

    move v11, v5

    move-object v5, v6

    move-object v6, v8

    move-wide/from16 v8, v19

    const/4 v12, 0x0

    move-object v7, v0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_c

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lsg2/o;

    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lsz0/h;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsz0/e;->n(Lsz0/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
