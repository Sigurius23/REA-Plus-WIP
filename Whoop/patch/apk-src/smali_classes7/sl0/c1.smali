.class public abstract Lsl0/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsl0/c1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001aA\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000f\u00b2\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lzg0/k;",
        "attachmentUploadState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "removeAttachment",
        "retryClicked",
        "Lkd1/u;",
        "pdfCacheManager",
        "j",
        "(Lzg0/k;Lc93/a;Lc93/a;Lkd1/u;Landroidx/compose/runtime/Composer;II)V",
        "",
        "cachedFilePath",
        "",
        "showPreview",
        "showImagePreview",
        "bot_release"
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
.method public static final synthetic A(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/c1;->x(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/c1;->s(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzg0/k;Lc93/a;Lc93/a;Lkd1/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lsl0/c1;->t(Lzg0/k;Lc93/a;Lc93/a;Lkd1/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzg0/k;Lbc3/c0;Lp1/c1;Lp1/c1;Lkd1/u;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsl0/c1;->o(Lzg0/k;Lbc3/c0;Lp1/c1;Lp1/c1;Lkd1/u;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/c1;->n(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/c1;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/c1;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/c1;->q(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/c1;->p(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/c1;->r(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lzg0/k;Lc93/a;Lc93/a;Lkd1/u;Landroidx/compose/runtime/Composer;II)V
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg0/k;",
            "Lc93/a;",
            "Lc93/a;",
            "Lkd1/u;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    move/from16 v7, p5

    const-string v2, "attachmentUploadState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v2, 0x278ab85c

    invoke-virtual {v13, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v4, p6, 0x2

    const/16 v5, 0x10

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    move v10, v5

    :goto_2
    or-int/2addr v2, v10

    :goto_3
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v2, v12

    :goto_5
    and-int/lit16 v12, v7, 0xc00

    if-nez v12, :cond_a

    and-int/lit8 v12, p6, 0x8

    if-nez v12, :cond_9

    and-int/lit16 v12, v7, 0x1000

    if-nez v12, :cond_8

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_6

    :cond_8
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    :goto_6
    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_7

    :cond_9
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v2, v12

    :cond_a
    and-int/lit16 v12, v2, 0x493

    const/16 v15, 0x492

    const/4 v9, 0x1

    const/4 v11, 0x0

    if-eq v12, v15, :cond_b

    move v12, v9

    goto :goto_8

    :cond_b
    move v12, v11

    :goto_8
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v13, v15, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_40

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v12, v7, 0x1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    const/4 v14, 0x0

    if-eqz v12, :cond_e

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_d

    and-int/lit16 v2, v2, -0x1c01

    :cond_d
    move-object/from16 v34, p2

    move v12, v2

    move-object v10, v6

    goto/16 :goto_c

    :cond_e
    :goto_9
    if-eqz v4, :cond_10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_f

    new-instance v4, Lsh2/d;

    const/16 v6, 0x1d

    invoke-direct {v4, v6}, Lsh2/d;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lc93/a;

    goto :goto_a

    :cond_10
    move-object v4, v6

    :goto_a
    if-eqz v10, :cond_12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v15, :cond_11

    new-instance v6, Lsl0/a1;

    const/4 v10, 0x0

    invoke-direct {v6, v10}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v6, Lc93/a;

    goto :goto_b

    :cond_12
    move-object/from16 v6, p2

    :goto_b
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_15

    const v0, -0x3636f461

    invoke-virtual {v13, v0}, Lp1/q;->f0(I)V

    sget-object v0, Lpf3/a;->b:Lnf3/a;

    if-eqz v0, :cond_16

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const v10, -0x384098

    invoke-virtual {v13, v10}, Lp1/q;->f0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v13, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_13

    if-ne v12, v15, :cond_14

    :cond_13
    const-class v10, Lkd1/u;

    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v14, v10, v14}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move-object v0, v12

    check-cast v0, Lkd1/u;

    and-int/lit16 v2, v2, -0x1c01

    :cond_15
    move v12, v2

    move-object v10, v4

    move-object/from16 v34, v6

    goto :goto_c

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_c
    invoke-virtual {v13}, Lp1/q;->r()V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_17

    invoke-static {v13}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v2, Lbc3/c0;

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v4

    invoke-virtual {v13, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v6, "whoop-coach-file-upload"

    invoke-interface {v4, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v35

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_18

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v4, Lp1/c1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v15, :cond_19

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v6, Lp1/c1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v15, :cond_1a

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v14, Lp1/c1;

    const v8, 0x6fbe687b

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzg0/k;->g()Z

    move-result v8

    if-nez v8, :cond_1c

    invoke-virtual {v1}, Lzg0/k;->f()Z

    move-result v8

    if-eqz v8, :cond_1b

    goto :goto_d

    :cond_1b
    move v8, v11

    goto :goto_e

    :cond_1c
    :goto_d
    move v8, v9

    :goto_e
    int-to-float v11, v9

    const/16 v9, 0x8

    int-to-float v9, v9

    move/from16 v20, v9

    mul-float v9, v11, v20

    move/from16 v21, v11

    sget-object v11, Lb2/t;->w:Lb2/t;

    move-object/from16 p1, v4

    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v5, v5

    int-to-float v3, v3

    mul-float/2addr v5, v3

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v4, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->E:Lb2/m;

    move/from16 v22, v3

    const/4 v3, 0x0

    invoke-static {v5, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move-object/from16 p2, v6

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 p3, v8

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_1d

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1d
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_f
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v13, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move-object/from16 v23, v5

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-nez v5, :cond_1e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v24, v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    goto :goto_10

    :cond_1e
    move-object/from16 v24, v10

    :goto_10
    invoke-static {v3, v13, v3, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v13, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lzg0/k;->d()Lcom/whoop/ai/chat/models/AttachmentType;

    move-result-object v3

    sget-object v4, Lsl0/c1$b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/high16 v4, 0x3f800000    # 1.0f

    move-object/from16 v25, v6

    const/4 v6, 0x1

    if-eq v3, v6, :cond_2e

    const/4 v5, 0x2

    if-eq v3, v5, :cond_20

    const v2, 0x533696ab

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    move-object/from16 v4, p2

    move-object v5, v0

    move v2, v3

    move v7, v9

    move-object v6, v11

    move/from16 p2, v12

    move-object v1, v14

    move-object/from16 v56, v15

    move-object/from16 v0, v24

    move-object/from16 v3, p1

    move/from16 p1, v22

    goto/16 :goto_1b

    :cond_20
    const/4 v3, 0x0

    const v5, 0x53127abc

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    if-eqz p3, :cond_21

    mul-float v18, v21, v22

    move/from16 v4, v18

    goto :goto_11

    :cond_21
    int-to-float v4, v3

    :goto_11
    invoke-static {v4, v5}, Lds/p;->s(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v26

    move-object/from16 v28, v7

    invoke-virtual/range {v26 .. v26}, Ly81/i;->W0()J

    move-result-wide v6

    move-object/from16 p3, v4

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v6, v7, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v36

    invoke-virtual {v1}, Lzg0/k;->g()Z

    move-result v3

    if-nez v3, :cond_22

    invoke-virtual {v1}, Lzg0/k;->f()Z

    move-result v3

    if-nez v3, :cond_22

    const/16 v37, 0x1

    goto :goto_12

    :cond_22
    const/16 v37, 0x0

    :goto_12
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    and-int/lit16 v4, v12, 0x1c00

    xor-int/lit16 v4, v4, 0xc00

    const/16 v6, 0x800

    if-le v4, v6, :cond_23

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_24

    :cond_23
    and-int/lit16 v4, v12, 0xc00

    if-ne v4, v6, :cond_25

    :cond_24
    const/4 v4, 0x1

    goto :goto_13

    :cond_25
    const/4 v4, 0x0

    :goto_13
    or-int/2addr v3, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_26

    if-ne v4, v15, :cond_27

    :cond_26
    move v3, v5

    move-object v5, v0

    goto :goto_14

    :cond_27
    move-object/from16 v3, p1

    move-object/from16 v42, p3

    move/from16 v43, v5

    move/from16 v16, v12

    move/from16 p1, v22

    move-object/from16 v7, v23

    move-object/from16 v12, v25

    const/16 v27, 0x1

    move-object v5, v0

    move-object v0, v4

    move-object/from16 v4, p2

    move-object/from16 p2, v14

    const/4 v14, 0x5

    goto :goto_15

    :goto_14
    new-instance v0, La00/h;

    const/16 v6, 0x15

    move-object/from16 v4, p2

    move-object/from16 v42, p3

    move/from16 v43, v3

    move/from16 v16, v12

    move-object/from16 p2, v14

    move-object/from16 v7, v23

    move-object/from16 v12, v25

    const/4 v14, 0x5

    const/16 v27, 0x1

    move-object/from16 v3, p1

    move/from16 p1, v22

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    move-object/from16 v40, v0

    check-cast v40, Lc93/a;

    const/16 v41, 0xe

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-static/range {v36 .. v41}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v2, v1

    mul-float v2, v2, v20

    invoke-static {v0, v9, v2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->e:Ll0/h;

    const/16 v1, 0x36

    invoke-static {v6, v2, v13, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v2, v15

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_28

    move-object/from16 v15, v28

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_28
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v13, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_29

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    :cond_29
    invoke-static {v6, v13, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2a
    invoke-static {v13, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v14, 0x5

    int-to-float v0, v14

    mul-float v0, v0, p1

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v44

    const/16 v53, 0x0

    const v54, 0x7fffb

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/high16 v47, 0x3f000000    # 0.5f

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-static/range {v44 .. v54}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2b

    new-instance v1, Lsc2/n;

    const/16 v6, 0x11

    invoke-direct {v1, v6}, Lsc2/n;-><init>(I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v0, Lgz0/m0;->FILE:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v13, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v8

    move/from16 v19, v14

    const/16 v14, 0x30

    const/16 v15, 0x8

    move/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v21, v11

    const-wide/16 v11, 0x0

    move-object/from16 v1, p2

    move-object/from16 v55, v2

    move/from16 v2, v16

    move-object/from16 v6, v21

    move/from16 v7, v23

    move-object/from16 v0, v24

    invoke-static/range {v8 .. v15}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lzg0/k;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_2c

    const/4 v9, 0x1

    goto :goto_17

    :cond_2c
    const/4 v9, 0x0

    :goto_17
    if-eqz v9, :cond_2d

    const-string v8, "document.pdf"

    :cond_2d
    move-object/from16 v9, v42

    move/from16 v10, v43

    invoke-virtual {v9, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->m()Lb91/a;

    move-result-object v28

    invoke-virtual {v9, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v10

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v12, Lw3/k;

    const/4 v14, 0x3

    invoke-direct {v12, v14}, Lw3/k;-><init>(I)V

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v14, v14, 0x12

    or-int/lit16 v14, v14, 0xc30

    const v33, 0x2d5f8

    move-object/from16 v20, v12

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move/from16 v32, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x30

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v8, 0x1

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    move/from16 p2, v2

    move v2, v14

    move-object/from16 v56, v55

    goto/16 :goto_1b

    :cond_2e
    move-object/from16 v3, p1

    move-object v5, v0

    move v7, v9

    move-object v6, v11

    move v2, v12

    move-object v1, v14

    move-object/from16 v55, v15

    move/from16 p1, v22

    move-object/from16 v0, v24

    const/4 v14, 0x0

    move v9, v4

    move-object/from16 v4, p2

    const v8, 0x530717a5

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lzg0/k;->c()Lkd1/o;

    move-result-object v10

    if-nez v10, :cond_2f

    const v8, 0x530717a4

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    move/from16 p2, v2

    move v2, v14

    move-object/from16 v56, v55

    goto/16 :goto_1a

    :cond_2f
    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-string v9, "attachment_upload_image"

    invoke-static {v8, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    if-nez p3, :cond_30

    if-eqz v35, :cond_30

    const/16 v16, 0x1

    goto :goto_18

    :cond_30
    move/from16 v16, v14

    :goto_18
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v9, v55

    if-ne v8, v9, :cond_31

    new-instance v8, Lsl0/b1;

    const/4 v11, 0x0

    invoke-direct {v8, v11, v1}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    move-object/from16 v19, v8

    check-cast v19, Lc93/a;

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    if-eqz p3, :cond_32

    move/from16 v11, p1

    goto :goto_19

    :cond_32
    int-to-float v11, v14

    :goto_19
    invoke-static {v11, v8}, Lds/p;->s(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget v12, Lkd1/o;->a:I

    move-object/from16 v30, v13

    const/4 v13, 0x3

    move-object/from16 v55, v9

    const/4 v9, 0x0

    move-object v8, v10

    const/4 v10, 0x0

    move-object/from16 v11, v30

    move-object/from16 v56, v55

    invoke-static/range {v8 .. v13}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v8

    move-object v13, v11

    sget v9, Lwk0/b;->W0:I

    invoke-static {v9, v13, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    const/16 v16, 0x0

    const/16 v17, 0x78

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 p2, v2

    move-object v10, v15

    move/from16 v2, v18

    move-object/from16 v15, v30

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v15

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_1b
    invoke-virtual/range {p0 .. p0}, Lzg0/k;->g()Z

    move-result v8

    const/4 v9, 0x6

    if-eqz v8, :cond_34

    invoke-virtual/range {p0 .. p0}, Lzg0/k;->f()Z

    move-result v8

    if-eqz v8, :cond_33

    goto :goto_1c

    :cond_33
    const v7, 0x5343b22d

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move/from16 v16, v9

    move-object/from16 v7, v56

    goto/16 :goto_1f

    :cond_34
    :goto_1c
    const v8, 0x53381ea6

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    new-instance v22, Lj0/j;

    invoke-direct/range {v22 .. v22}, Lj0/j;-><init>()V

    and-int/lit8 v8, p2, 0x70

    const/16 v10, 0x20

    if-ne v8, v10, :cond_35

    const/4 v8, 0x1

    goto :goto_1d

    :cond_35
    move v8, v2

    :goto_1d
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_36

    move-object/from16 v8, v56

    if-ne v10, v8, :cond_37

    goto :goto_1e

    :cond_36
    move-object/from16 v8, v56

    :goto_1e
    new-instance v10, Lsl0/a;

    const/4 v11, 0x6

    invoke-direct {v10, v0, v11}, Lsl0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_37
    move-object/from16 v26, v10

    check-cast v26, Lc93/a;

    const/16 v27, 0x1c

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v6

    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/16 v24, 0x0

    const/16 v25, 0xb

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v23, v7

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->c1()J

    move-result-wide v14

    sget-object v12, Lt0/j;->a:Lt0/i;

    invoke-static {v7, v14, v15, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v12, 0x2

    int-to-float v12, v12

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, Lb2/e;->y:Lb2/m;

    sget-object v15, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v15, v7, v14}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    mul-float v12, v12, p1

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lx81/d;->d()Lgz0/o0;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/i0;->k()I

    move-result v12

    invoke-static {v12, v13, v9}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v12

    sget v14, Lgy0/f;->L:I

    invoke-static {v14, v13, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->u()J

    move-result-wide v10

    move v15, v9

    move-object v9, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move-wide/from16 v57, v10

    move-object v10, v7

    move-object v7, v8

    move-object v8, v12

    move-wide/from16 v11, v57

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual/range {p0 .. p0}, Lzg0/k;->f()Z

    move-result v8

    if-eqz v8, :cond_38

    const v8, 0x53445e21

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lsl0/l1;->a:Lsl0/l1;

    invoke-virtual {v8}, Lsl0/l1;->b()Lc93/m;

    move-result-object v11

    shr-int/lit8 v8, p2, 0x6

    and-int/lit8 v8, v8, 0xe

    or-int/lit16 v8, v8, 0x6000

    const/16 v14, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v12, v13

    move v13, v8

    move-object/from16 v8, v34

    invoke-static/range {v8 .. v14}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v20, v8

    move-object v13, v12

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_38
    move-object/from16 v20, v34

    const v8, 0x534c854d

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_20
    invoke-virtual/range {p0 .. p0}, Lzg0/k;->g()Z

    move-result v8

    if-eqz v8, :cond_39

    const v8, 0x534d1830

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    const/4 v14, 0x5

    int-to-float v8, v14

    mul-float v8, v8, p1

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v6, Lgy0/e;->d:I

    invoke-static {v6}, Lv41/r0$d;->b(I)I

    move-result v6

    invoke-static {v6}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v9

    const/16 v18, 0x6

    const/16 v19, 0x1fc

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v30

    invoke-static/range {v8 .. v19}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_21
    const/4 v6, 0x1

    goto :goto_22

    :cond_39
    const v6, 0x535055cd

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_21

    :goto_22
    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    invoke-static {v4}, Lsl0/c1;->w(Lp1/c1;)Z

    move-result v6

    if-eqz v6, :cond_3c

    const v6, 0x6fc0ee74

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-static {v3}, Lsl0/c1;->u(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3a

    const v3, -0x77a31ff3

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_23

    :cond_3a
    const v6, -0x77a31ff2

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v7, :cond_3b

    new-instance v6, Lsl0/b1;

    const/4 v8, 0x1

    invoke-direct {v6, v8, v4}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3b
    check-cast v6, Lc93/a;

    const/16 v4, 0x30

    invoke-static {v3, v6, v13, v4}, Lhh0/g;->d(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_23
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_24

    :cond_3c
    const v3, -0x77a0ce1a

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_24
    invoke-static {v1}, Lsl0/c1;->y(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_3f

    if-eqz v35, :cond_3f

    const v3, 0x6fc10eab

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lzg0/k;->c()Lkd1/o;

    move-result-object v3

    if-nez v3, :cond_3d

    const v1, -0x779f394a

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_3d
    const v4, -0x779f3949

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget v4, Lwk0/b;->W0:I

    invoke-static {v4, v13, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v7, :cond_3e

    new-instance v6, Lsl0/b1;

    const/4 v7, 0x2

    invoke-direct {v6, v7, v1}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3e
    check-cast v6, Lc93/a;

    sget v1, Lkd1/o;->a:I

    or-int/lit16 v1, v1, 0x180

    invoke-static {v3, v4, v6, v13, v1}, Lkh0/e;->f(Lkd1/o;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_25
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_3f
    const v1, -0x779b28ba

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_26
    move-object v2, v0

    move-object v4, v5

    move-object/from16 v3, v20

    goto :goto_27

    :cond_40
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v4, v0

    move-object v2, v6

    :goto_27
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_41

    new-instance v0, Lo72/a;

    const/16 v7, 0x1a

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_41
    return-void
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lp1/c1;Z)V
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

.method private static final n(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lsl0/c1;->m(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lzg0/k;Lbc3/c0;Lp1/c1;Lp1/c1;Lkd1/u;)Ll83/a0;
    .locals 6

    invoke-virtual {p0}, Lzg0/k;->e()Landroid/net/Uri;

    move-result-object v2

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    invoke-static {p2}, Lsl0/c1;->u(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    invoke-static {p3, p1}, Lsl0/c1;->x(Lp1/c1;Z)V

    return-object p0

    :cond_1
    new-instance v0, Lsl0/c1$a;

    const/4 v5, 0x0

    move-object v3, p2

    move-object v4, p3

    move-object v1, p4

    invoke-direct/range {v0 .. v5}, Lsl0/c1$a;-><init>(Lkd1/u;Landroid/net/Uri;Lp1/c1;Lp1/c1;Lq83/d;)V

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p3, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object p0
.end method

.method private static final p(Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v2

    const/16 v9, 0x9

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lsl0/c1;->x(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lsl0/c1;->m(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lzg0/k;Lc93/a;Lc93/a;Lkd1/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lsl0/c1;->j(Lzg0/k;Lc93/a;Lc93/a;Lkd1/u;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;)Ljava/lang/String;
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

.method private static final v(Lp1/c1;Ljava/lang/String;)V
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

.method private static final w(Lp1/c1;)Z
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

.method private static final x(Lp1/c1;Z)V
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

.method private static final y(Lp1/c1;)Z
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

.method public static final synthetic z(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/c1;->v(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method
