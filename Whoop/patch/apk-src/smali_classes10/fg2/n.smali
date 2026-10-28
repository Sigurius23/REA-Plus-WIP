.class public abstract Lfg2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "isFetchingDestinationPhoneNumber",
        "isPhoneNumberError",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNext",
        "onTermsOfService",
        "n",
        "(Landroidx/compose/ui/Modifier;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "i",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "a",
        "F",
        "BENEFITS_CARD_TAIL_HEIGHT",
        "sms_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    int-to-float v0, v0

    sput v0, Lfg2/n;->a:F

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfg2/n;->m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lfg2/n;->q(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li2/t;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/n;->l(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/n;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;ZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lfg2/n;->r(Landroidx/compose/ui/Modifier;ZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/n;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Lfg2/n;->k(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfg2/n;->j(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Landroidx/compose/runtime/Composer;I)V
    .locals 44

    move-object/from16 v6, p0

    check-cast v6, Lp1/q;

    const v1, -0x1b7a5079

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v9, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_10

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    invoke-virtual {v1, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->V0()J

    move-result-wide v1

    sget v5, Lvf2/b;->v:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget v7, Lvf2/b;->w:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sget v8, Lvf2/b;->x:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget v11, Lvf2/b;->y:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v5, v7, v8, v11}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v27

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v13, v6, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v6, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v6, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v8, v6, v8, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v6, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v10, Lb2/e;->x:Lb2/m;

    invoke-virtual {v5, v12, v10}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float v11, v10, v10

    move-object/from16 v16, v14

    sget v14, Lfg2/n;->a:F

    invoke-static {v5, v11, v14}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v6, v3, v4}, Lp1/q;->f(J)Z

    move-result v11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move/from16 v20, v10

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_4

    if-ne v9, v10, :cond_5

    :cond_4
    new-instance v9, Lai1/b;

    const/16 v11, 0xe

    invoke-direct {v9, v3, v4, v11}, Lai1/b;-><init>(JI)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    invoke-static {v5, v9, v6, v11}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v5, v16

    const/16 v16, 0x0

    const/16 v17, 0xd

    move-object v9, v13

    const/4 v13, 0x0

    move-object v11, v15

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v15, 0x6

    int-to-float v14, v15

    mul-float v14, v14, v20

    const/16 v15, 0xc

    const/4 v0, 0x0

    invoke-static {v14, v14, v0, v0, v15}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v14

    invoke-static {v13, v14}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Li2/t;->b:Li2/s;

    new-instance v15, Li2/x;

    invoke-direct {v15, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v15, v3}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v2, 0xe

    invoke-static {v14, v1, v0, v0, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v1

    const/4 v14, 0x0

    const/4 v2, 0x6

    invoke-static {v13, v1, v14, v0, v2}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v13, v2

    mul-float/2addr v1, v13

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v1, v2, v6, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-eqz v4, :cond_6

    invoke-virtual {v6, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v6, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    invoke-static {v2, v6, v2, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v6, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x33b01f68

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, v27

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v11, 0x0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v28, v11, 0x1

    if-ltz v11, :cond_e

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v9

    sget-object v1, Lb2/e;->K:Lb2/l;

    sget-object v2, Ll0/m;->a:Ll0/e;

    const/16 v3, 0x30

    invoke-static {v2, v1, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_9

    invoke-virtual {v6, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v6, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v2, v6, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float v1, v1, v20

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v29

    const/16 v38, 0x0

    const v39, 0x7fffb

    const/16 v30, 0x0

    const/16 v31, 0x0

    const v32, 0x3f7d70a4    # 0.99f

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static/range {v29 .. v39}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_c

    new-instance v2, Lf41/f;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lf41/f;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v1, Lgz0/m0;->AI_SPARKLE:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v15, 0x6

    invoke-static {v1, v6, v15}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    move-wide/from16 v42, v7

    move v8, v4

    move-wide/from16 v4, v42

    const/16 v7, 0x30

    move/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v2

    const/4 v2, 0x0

    move-object/from16 v21, v10

    move/from16 v22, v11

    move/from16 v11, v16

    move-object/from16 v10, v17

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    mul-float/2addr v1, v13

    const/16 v16, 0x0

    const/16 v17, 0xe

    move-object v2, v14

    const/4 v14, 0x0

    move v3, v15

    const/4 v15, 0x0

    move-object/from16 v30, v2

    move/from16 v31, v3

    move/from16 v29, v13

    const/high16 v18, 0x3f800000    # 1.0f

    move v13, v1

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v32, v12

    const/4 v3, 0x0

    invoke-static {v9, v6, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v6, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v4

    invoke-virtual {v10, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v25, v5, 0x12

    const v26, 0x2fff8

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    move/from16 v19, v3

    move-object/from16 v42, v21

    move-object/from16 v21, v4

    move-wide v3, v7

    move-object/from16 v8, v42

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    move/from16 v16, v11

    const-wide/16 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v24, v14

    const-wide/16 v14, 0x0

    move/from16 v33, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move/from16 v35, v18

    const/16 v18, 0x0

    move/from16 v36, v19

    const/16 v19, 0x0

    move/from16 v37, v20

    const/16 v20, 0x0

    move/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v24

    const/16 v24, 0x30

    move-object/from16 p0, v0

    move/from16 v41, v33

    move-object/from16 v40, v34

    const/4 v0, 0x1

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-static/range {v27 .. v27}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    move/from16 v2, v38

    if-ge v2, v1, :cond_d

    const v1, 0x2a5869c0

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    mul-float v13, v29, v37

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v14, v1, v29

    const/4 v15, 0x0

    const/16 v17, 0x4

    move/from16 v16, v14

    move-object/from16 v12, v32

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v2, v0

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v10, v40

    move/from16 v8, v41

    invoke-virtual {v10, v6, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v6, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_d
    move-object/from16 v12, v32

    const/4 v3, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const v1, 0x2a5dad67

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    :goto_5
    move-object/from16 v0, p0

    move/from16 v11, v28

    move/from16 v13, v29

    move-object/from16 v14, v30

    move/from16 v20, v37

    move-object/from16 v10, v39

    goto/16 :goto_3

    :cond_e
    move-object/from16 v30, v14

    invoke-static {}, Lwb3/f;->d0()V

    throw v30

    :cond_f
    const/4 v0, 0x1

    const/4 v3, 0x0

    invoke-static {v6, v3, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_6

    :cond_10
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, Lf01/c0;

    const/16 v2, 0x8

    const/4 v3, 0x0

    move/from16 v4, p1

    invoke-direct {v1, v3, v4, v2}, Lf01/c0;-><init>(BII)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final j(JLk2/e;)Ll83/a0;
    .locals 8

    const-string v0, "$this$Canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v2

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v0

    const/16 v3, 0x20

    shr-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Li2/j;->i(FF)V

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {v2, v1, v0}, Li2/j;->h(FF)V

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v0

    shr-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v3

    and-long/2addr v3, v6

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v2, v0, v1}, Li2/j;->h(FF)V

    invoke-virtual {v2}, Li2/j;->f()V

    const/4 v6, 0x0

    const/16 v7, 0x3c

    const/4 v5, 0x0

    move-wide v3, p0

    move-object v1, p2

    invoke-static/range {v1 .. v7}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lf2/d;)Lf2/g;
    .locals 3

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    new-instance v1, Lc51/h;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Lc51/h;-><init>(Li2/t;I)V

    invoke-virtual {p0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/16 v9, 0x9

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lfg2/n;->i(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Landroidx/compose/ui/Modifier;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    move-object/from16 v14, p5

    check-cast v14, Lp1/q;

    const v0, 0x1e4d6f59

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v5, p7, 0x2

    const/16 v33, 0x20

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    move/from16 v7, p1

    invoke-virtual {v14, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_5

    move/from16 v8, v33

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-virtual {v14, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, p7, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v14, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit8 v12, p7, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v6, 0x6000

    if-nez v15, :cond_c

    move-object/from16 v15, p4

    invoke-virtual {v14, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    :goto_9
    and-int/lit16 v13, v4, 0x2493

    const/16 v1, 0x2492

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v18, v10

    const/4 v10, 0x1

    if-eq v13, v1, :cond_f

    move v1, v10

    goto :goto_a

    :cond_f
    move v1, v8

    :goto_a
    and-int/lit8 v13, v4, 0x1

    invoke-virtual {v14, v13, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_26

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_10

    move-object v3, v1

    :cond_10
    if-eqz v5, :cond_11

    move v0, v8

    goto :goto_b

    :cond_11
    move v0, v7

    :goto_b
    if-eqz v16, :cond_12

    move v5, v8

    goto :goto_c

    :cond_12
    move v5, v9

    :goto_c
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v18, :cond_14

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_13

    new-instance v9, Lf1/z1;

    const/16 v11, 0x14

    invoke-direct {v9, v11}, Lf1/z1;-><init>(I)V

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Lc93/a;

    move-object/from16 v34, v9

    goto :goto_d

    :cond_14
    move-object/from16 v34, v11

    :goto_d
    if-eqz v12, :cond_16

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_15

    new-instance v9, Lf1/z1;

    const/16 v11, 0x15

    invoke-direct {v9, v11}, Lf1/z1;-><init>(I)V

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v9, Lc93/a;

    goto :goto_e

    :cond_16
    move-object v9, v15

    :goto_e
    sget v11, Lvf2/a;->b:I

    sget-object v12, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    invoke-virtual {v14, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/res/Resources;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v7, :cond_17

    new-instance v13, Landroid/util/TypedValue;

    invoke-direct {v13}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v14, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v13, Landroid/util/TypedValue;

    invoke-virtual {v12, v11, v13, v10}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v13, v13, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v14, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 p0, v13

    const/4 v13, 0x0

    if-nez p0, :cond_18

    if-ne v15, v7, :cond_19

    :cond_18
    invoke-virtual {v12, v11, v13}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    const-string v12, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v11}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v11

    new-instance v15, Li2/g;

    invoke-direct {v15, v11}, Li2/g;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v15, Li2/g;

    move-object v11, v7

    new-instance v7, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    iget-object v12, v15, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    iget-object v13, v15, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    const/16 v2, 0x8c

    invoke-static {v13, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-long v12, v12

    shl-long v12, v12, v33

    move-object/from16 p1, v11

    int-to-long v10, v2

    const-wide v35, 0xffffffffL

    and-long v10, v10, v35

    or-long/2addr v10, v12

    invoke-direct {v7, v15, v10, v11}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Li2/g;J)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move-object/from16 p2, v9

    iget-wide v8, v14, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v14, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_1a

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1a
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_f
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v14, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v14, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_1b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move/from16 v37, v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_10

    :cond_1b
    move/from16 v37, v0

    :goto_10
    invoke-static {v8, v14, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v14, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v38, v3

    const/4 v2, 0x0

    const/4 v10, 0x1

    invoke-static {v2, v14, v10}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    const/16 v10, 0xe

    invoke-static {v8, v3, v10}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v8, 0x2

    int-to-float v10, v8

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v10, v2

    move/from16 v18, v2

    const/4 v2, 0x0

    invoke-static {v3, v10, v2, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    move/from16 v39, v4

    const/4 v4, 0x0

    invoke-static {v8, v2, v14, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move/from16 v40, v5

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-eqz v8, :cond_1d

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1d
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v14, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_1e

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    :cond_1e
    invoke-static {v4, v14, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v14, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v8, 0x2

    invoke-static {v2, v10, v3, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v3, v15

    const/16 v15, 0x61b0

    const/4 v4, 0x1

    const/16 v16, 0x68

    const/4 v8, 0x0

    move/from16 v21, v10

    const/4 v10, 0x0

    move-object v5, v11

    sget-object v11, Ly2/j;->d:Ly2/b1;

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v42, p1

    move-object/from16 p0, v0

    move-object v4, v3

    move-object/from16 p1, v9

    move-object/from16 v6, v19

    move/from16 v41, v21

    const/16 v0, 0x4000

    move-object/from16 v3, p2

    move-object/from16 v19, v1

    move-object v9, v2

    move-object/from16 v1, v20

    const/4 v2, 0x0

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v2}, Lfg2/n;->i(Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v21, v7, v18

    const/16 v23, 0x0

    const/16 v24, 0xd

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v43, v19

    sget v9, Lvf2/b;->G:I

    invoke-static {v9, v14, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v14, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->P()Lb91/a;

    move-result-object v27

    invoke-virtual {v10, v14, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    sget v44, Lb91/a;->d:I

    shl-int/lit8 v31, v44, 0x12

    const v32, 0x2fff8

    move v15, v7

    move-object v7, v9

    move-object/from16 v16, v10

    move-wide v9, v12

    move v13, v11

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    move/from16 v24, v21

    const-wide/16 v20, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v30, v24

    const/16 v24, 0x0

    move/from16 v45, v25

    const/16 v25, 0x0

    move/from16 v46, v26

    const/16 v26, 0x0

    move-object/from16 v47, v28

    const/16 v28, 0x0

    move/from16 v48, v30

    const/16 v30, 0x30

    move/from16 v2, v45

    move/from16 v49, v46

    move-object/from16 v0, v47

    move/from16 v50, v48

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v29

    invoke-virtual {v0, v14, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->k()Lb91/a;

    move-result-object v10

    const/4 v2, 0x0

    int-to-float v7, v2

    const/4 v2, 0x0

    const/4 v8, 0x2

    invoke-static {v7, v2, v8}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v16

    sget v2, Lvf2/b;->E:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const v0, 0xe000

    and-int v2, v39, v0

    const/16 v7, 0x4000

    if-ne v2, v7, :cond_20

    const/4 v8, 0x1

    goto :goto_12

    :cond_20
    const/4 v8, 0x0

    :goto_12
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v8, :cond_21

    move-object/from16 v11, v42

    if-ne v2, v11, :cond_22

    :cond_21
    new-instance v2, Ld42/o;

    const/16 v7, 0x18

    invoke-direct {v2, v3, v7}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    move-object/from16 v17, v2

    check-cast v17, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    const/4 v7, 0x6

    shl-int/2addr v2, v7

    const v8, 0x36030006

    or-int/2addr v2, v8

    shl-int/lit8 v8, v44, 0x9

    or-int v19, v2, v8

    const/16 v20, 0x0

    const/16 v21, 0x92

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move v2, v7

    move-object/from16 v18, v29

    move-object/from16 v7, v43

    invoke-static/range {v7 .. v21}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v19, v7

    move-object/from16 v14, v18

    const/16 v23, 0x0

    const/16 v24, 0xd

    const/16 v20, 0x0

    const/16 v22, 0x0

    move/from16 v21, v41

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v7, Lfg2/d;->a:Lfg2/d;

    invoke-virtual {v7}, Lfg2/d;->b()Lkotlin/jvm/functions/Function3;

    move-result-object v13

    shr-int/lit8 v7, v39, 0x3

    and-int/lit8 v7, v7, 0x70

    const v8, 0x180186

    or-int v15, v8, v7

    const/16 v16, 0x1c

    sget-object v7, Ll0/z;->a:Ll0/z;

    const/4 v10, 0x0

    move/from16 p2, v0

    move-object/from16 v0, v19

    move/from16 v8, v40

    invoke-static/range {v7 .. v16}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/16 v7, 0x23

    int-to-float v7, v7

    move/from16 v15, v49

    const/4 v8, 0x1

    invoke-static {v7, v15, v0, v14, v8}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    sget-object v7, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v14}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v7

    iget-object v7, v7, Ll0/c2;->e:Ll0/b;

    invoke-static {v7, v14}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v7

    invoke-virtual {v7}, Ll0/x0;->a()F

    move-result v7

    const/16 v9, 0x190

    int-to-float v9, v9

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->I:Lb2/m;

    sget-object v11, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v11, v9, v10}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v9, v10, v7, v8}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, Li2/t;->b:Li2/s;

    const-wide v9, 0xff50d5ffL

    invoke-static {v9, v10}, Li2/w0;->e(J)J

    move-result-wide v12

    const v8, 0x3dcccccd    # 0.1f

    invoke-static {v8, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    move-wide/from16 p4, v9

    new-instance v9, Li2/x;

    invoke-direct {v9, v12, v13}, Li2/x;-><init>(J)V

    invoke-static/range {p4 .. p5}, Li2/w0;->e(J)J

    move-result-wide v12

    invoke-static {v8, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    new-instance v10, Li2/x;

    invoke-direct {v10, v12, v13}, Li2/x;-><init>(J)V

    const-wide v12, 0xff8b62ffL

    invoke-static {v12, v13}, Li2/w0;->e(J)J

    move-result-wide v12

    invoke-static {v8, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    new-instance v8, Li2/x;

    invoke-direct {v8, v12, v13}, Li2/x;-><init>(J)V

    sget-wide v12, Li2/x;->m:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v12, v13}, Li2/x;-><init>(J)V

    filled-new-array {v9, v10, v8, v2}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v12, v2

    shl-long v8, v8, v33

    and-long v12, v12, v35

    or-long v17, v8, v12

    const/high16 v19, 0x44610000    # 900.0f

    const/16 v20, 0x8

    invoke-static/range {v15 .. v20}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v2

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v7, v2, v9, v10, v8}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v13, 0x0

    invoke-static {v2, v14, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v2, Lb2/e;->H:Lb2/m;

    invoke-virtual {v11, v0, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v7, v50

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-eqz v8, :cond_23

    invoke-virtual {v14, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_23
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v14, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_24

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    :cond_24
    move-object/from16 v1, p1

    goto :goto_15

    :cond_25
    :goto_14
    move-object/from16 v1, p0

    goto :goto_16

    :goto_15
    invoke-static {v5, v14, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_14

    :goto_16
    invoke-static {v14, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Leg2/k;->INTRO_V2:Leg2/k;

    shl-int/lit8 v0, v39, 0x3

    and-int/lit16 v1, v0, 0x380

    const/16 v21, 0x6

    or-int/lit8 v1, v1, 0x6

    and-int v0, v0, p2

    or-int v13, v1, v0

    move-object/from16 v29, v14

    const/16 v14, 0xa

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v12, v29

    move-object/from16 v11, v34

    move/from16 v9, v37

    const/4 v4, 0x1

    invoke-static/range {v7 .. v14}, Leg2/e;->k(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v12

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    move-object v5, v3

    move v2, v9

    move-object/from16 v1, v38

    move/from16 v3, v40

    :goto_17
    move-object v4, v11

    goto :goto_18

    :cond_26
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v1, v3

    move v2, v7

    move v3, v9

    move-object v5, v15

    goto :goto_17

    :goto_18
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_27

    new-instance v0, Lep1/p;

    const/4 v8, 0x1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;Ll83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroidx/compose/ui/Modifier;ZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lfg2/n;->n(Landroidx/compose/ui/Modifier;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
