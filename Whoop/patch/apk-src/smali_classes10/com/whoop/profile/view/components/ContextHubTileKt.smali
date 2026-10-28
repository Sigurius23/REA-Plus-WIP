.class public final Lcom/whoop/profile/view/components/ContextHubTileKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/profile/view/components/ContextHubTileViewState;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "ContextHubTile",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "PreviewContextHubTile",
        "(Landroidx/compose/runtime/Composer;I)V",
        "sampleContextHubTileWithIcon",
        "Lcom/whoop/profile/view/components/ContextHubTileViewState;",
        "getSampleContextHubTileWithIcon",
        "()Lcom/whoop/profile/view/components/ContextHubTileViewState;",
        "sampleContextHubTileNoIcon",
        "getSampleContextHubTileNoIcon",
        "profile_release"
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
.field private static final sampleContextHubTileNoIcon:Lcom/whoop/profile/view/components/ContextHubTileViewState;

.field private static final sampleContextHubTileWithIcon:Lcom/whoop/profile/view/components/ContextHubTileViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/profile/view/components/ContextHubTileViewState;

    sget-object v1, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const-string v2, "context_hub_tile"

    const-string v3, "MY MEMORY"

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/whoop/profile/view/components/ContextHubTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V

    sput-object v0, Lcom/whoop/profile/view/components/ContextHubTileKt;->sampleContextHubTileWithIcon:Lcom/whoop/profile/view/components/ContextHubTileViewState;

    new-instance v0, Lcom/whoop/profile/view/components/ContextHubTileViewState;

    const-string v1, "context_hub_tile_no_icon"

    invoke-direct {v0, v1, v3, v4, v4}, Lcom/whoop/profile/view/components/ContextHubTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V

    sput-object v0, Lcom/whoop/profile/view/components/ContextHubTileKt;->sampleContextHubTileNoIcon:Lcom/whoop/profile/view/components/ContextHubTileViewState;

    return-void
.end method

.method public static final ContextHubTile(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/profile/view/components/ContextHubTileViewState;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x5b6aca84

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

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

    const/16 v8, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v4, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    const/16 v9, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    move v12, v9

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v6, v12

    :goto_5
    and-int/lit16 v12, v6, 0x93

    const/16 v13, 0x92

    if-eq v12, v13, :cond_9

    const/4 v12, 0x1

    goto :goto_6

    :cond_9
    const/4 v12, 0x0

    :goto_6
    and-int/lit8 v13, v6, 0x1

    invoke-virtual {v10, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1b

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v0, v12

    goto :goto_7

    :cond_a
    move-object v0, v5

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_b

    new-instance v7, Lv01/k;

    const/16 v11, 0xc

    invoke-direct {v7, v11}, Lv01/k;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v7, v11

    :goto_8
    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v13, 0x3

    int-to-float v14, v13

    int-to-float v3, v3

    invoke-static {v11, v14, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {}, Lgb1/b0;->D()Li2/t;

    move-result-object v14

    const/4 v1, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x6

    invoke-static {v11, v14, v1, v13, v15}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    and-int/lit8 v14, v6, 0x70

    if-eq v14, v8, :cond_e

    and-int/lit8 v8, v6, 0x40

    if-eqz v8, :cond_d

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    goto :goto_9

    :cond_d
    const/4 v8, 0x0

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v8, 0x1

    :goto_a
    and-int/lit16 v6, v6, 0x380

    if-ne v6, v9, :cond_f

    const/4 v6, 0x1

    goto :goto_b

    :cond_f
    const/4 v6, 0x0

    :goto_b
    or-int/2addr v6, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_10

    if-ne v8, v5, :cond_11

    :cond_10
    new-instance v8, Lui0/q;

    const/16 v5, 0x8

    invoke-direct {v8, v2, v7, v5}, Lui0/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v8, Lc93/a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static {v11, v6, v1, v8, v5}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x2

    int-to-float v8, v6

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v8, v15

    mul-float/2addr v8, v3

    invoke-static {v5, v8, v13, v6}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v6, v11, v10, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v1, v10, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_12

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v31, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_d

    :cond_13
    move-object/from16 v31, v0

    :goto_d
    invoke-static {v1, v10, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v4

    const/16 v4, 0x36

    invoke-static {v1, v9, v11, v10, v4}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v10, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    invoke-static {v4, v10, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v10, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lgy0/a;->j:I

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v13, 0x1b0

    const/16 v14, 0x78

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v2, v7

    move-object v7, v0

    move-object v0, v2

    move-object v2, v12

    move-object/from16 v12, v27

    const/4 v4, 0x1

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/components/ContextHubTileViewState;->getTitle()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v29, v11, 0x12

    const v30, 0x2fffa

    move-object v11, v6

    const/4 v6, 0x0

    move v12, v7

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    move-object/from16 v16, v15

    const-wide/16 v14, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x0

    move-object/from16 v33, v28

    const/16 v28, 0x0

    move-object/from16 p2, v0

    move v0, v1

    move-object/from16 v1, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/components/ContextHubTileViewState;->getEndIcon()Lgz0/m0;

    move-result-object v5

    if-eqz v5, :cond_18

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_f

    :cond_18
    const/4 v5, 0x0

    :goto_f
    if-nez v5, :cond_19

    const v5, -0x35445f65    # -6148173.5f

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    goto :goto_10

    :cond_19
    const v6, -0x35445f64    # -6148174.0f

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v6, 0x6

    invoke-static {v5, v10, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_10
    if-nez v5, :cond_1a

    const v1, -0x3543adc0    # -6170912.0f

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1a
    const v6, -0x3543adbf    # -6170912.5f

    invoke-static {v10, v6, v3, v3, v2}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v12, v32

    invoke-virtual {v1, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    move-object/from16 v1, v31

    goto :goto_12

    :cond_1b
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v11

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lv31/d;

    const/4 v6, 0x2

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final ContextHubTile$lambda$0$0(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ContextHubTile$lambda$1$0(Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/view/components/ContextHubTileViewState;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ContextHubTile$lambda$3(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/components/ContextHubTileKt;->ContextHubTile(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final PreviewContextHubTile(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const/high16 v0, 0x17000000

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/components/ContextHubTileKt$PreviewContextHubTile$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/components/ContextHubTileKt$PreviewContextHubTile$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lv41/c;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lv41/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final PreviewContextHubTile$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/components/ContextHubTileKt;->PreviewContextHubTile(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/components/ContextHubTileKt;->PreviewContextHubTile$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/components/ContextHubTileKt;->ContextHubTile$lambda$1$0(Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/view/components/ContextHubTileKt;->ContextHubTile$lambda$3(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/components/ContextHubTileKt;->ContextHubTile$lambda$0$0(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final getSampleContextHubTileNoIcon()Lcom/whoop/profile/view/components/ContextHubTileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/view/components/ContextHubTileKt;->sampleContextHubTileNoIcon:Lcom/whoop/profile/view/components/ContextHubTileViewState;

    return-object v0
.end method

.method public static final getSampleContextHubTileWithIcon()Lcom/whoop/profile/view/components/ContextHubTileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/view/components/ContextHubTileKt;->sampleContextHubTileWithIcon:Lcom/whoop/profile/view/components/ContextHubTileViewState;

    return-object v0
.end method
