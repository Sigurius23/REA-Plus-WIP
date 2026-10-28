.class public abstract Lwn1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "rotation",
        "",
        "animateToReplayIcon",
        "",
        "duration",
        "Ly3/f;",
        "checkmarkIconSize",
        "Ll83/a0;",
        "c",
        "(FZIFLandroidx/compose/runtime/Composer;I)V",
        "home-notifications-center_release"
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
.method public static synthetic a(FLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwn1/d;->d(FLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FZIFILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwn1/d;->e(FZIFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(FZIFLandroidx/compose/runtime/Composer;I)V
    .locals 15

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, -0x1fb3f41d    # -5.881238E19f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, p0}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    move/from16 v6, p1

    invoke-virtual {v12, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    goto :goto_3

    :cond_3
    move/from16 v6, p1

    :goto_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_4

    :cond_4
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_5

    :cond_6
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_6

    :cond_8
    const/4 v7, 0x0

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_9

    const/high16 v7, 0x42b40000    # 90.0f

    add-float/2addr v7, p0

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lc0/e1;->a:Lc0/f1;

    int-to-float v8, v3

    const v10, 0x3f4ccccd    # 0.8f

    mul-float/2addr v10, v8

    invoke-static {v10}, Le93/b;->X(F)I

    move-result v10

    const v11, 0x3e4ccccd    # 0.2f

    mul-float/2addr v8, v11

    invoke-static {v8}, Le93/b;->X(F)I

    move-result v8

    const/4 v11, 0x0

    invoke-static {v10, v8, v11, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    invoke-static {v2, v1}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v8

    new-instance v1, Lwn1/a;

    const/4 v2, 0x1

    invoke-direct {v1, v4, v2}, Lwn1/a;-><init>(FI)V

    const v2, -0x359479f5

    invoke-static {v2, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    const/high16 v1, 0x30000

    or-int v13, v0, v1

    const/16 v14, 0x10

    const/4 v10, 0x0

    invoke-static/range {v6 .. v14}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_9
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Lwn1/b;

    const/4 v6, 0x1

    move v1, p0

    move/from16 v2, p1

    invoke-direct/range {v0 .. v6}, Lwn1/b;-><init>(FZIFII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final d(FLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/a;->p()I

    move-result p1

    const/4 p3, 0x6

    invoke-static {p1, p2, p3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    sget p1, Lgy0/f;->t1:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, p2, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(FZIFILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lwn1/d;->c(FZIFLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
