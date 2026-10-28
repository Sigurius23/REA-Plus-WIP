.class public abstract Ld01/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld01/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a5\u0010\u0013\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Ld01/h;",
        "titleType",
        "Ld01/g;",
        "style",
        "Lb91/a;",
        "j",
        "(Ld01/h;Ld01/g;Landroidx/compose/runtime/Composer;I)Lb91/a;",
        "i",
        "(Landroidx/compose/runtime/Composer;I)Lb91/a;",
        "h",
        "(Ld01/g;Landroidx/compose/runtime/Composer;I)Lb91/a;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ld01/f;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Ld01/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Li2/x;",
        "a",
        "J",
        "ButtonCellAvatarBorderColor",
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
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0xff14191dL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Ld01/e;->a:J

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ld01/e;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ld01/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ld01/e;->g(Landroidx/compose/ui/Modifier;Ld01/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ld01/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld01/e;->f(Ld01/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ld01/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ld01/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, -0x6c4a03ce

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v1

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v4, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v6, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v7, v9, :cond_7

    move v7, v11

    goto :goto_4

    :cond_7
    move v7, v10

    :goto_4
    and-int/lit8 v9, v6, 0x1

    invoke-virtual {v15, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_10

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v5

    :goto_5
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_9

    invoke-static {v15}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_9
    move-object/from16 v17, v5

    check-cast v17, Lj0/i;

    invoke-virtual {v2}, Ld01/f;->a()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_a

    invoke-virtual {v2}, Ld01/f;->e()Lcom/whoop/navigation/e;

    move-result-object v5

    :cond_a
    invoke-virtual {v2}, Ld01/f;->f()Z

    move-result v9

    if-eqz v9, :cond_b

    if-eqz v5, :cond_b

    move/from16 v19, v11

    goto :goto_6

    :cond_b
    move/from16 v19, v10

    :goto_6
    const/high16 v9, 0x3f800000    # 1.0f

    if-eqz v19, :cond_c

    move v12, v9

    goto :goto_7

    :cond_c
    const v12, 0x3f19999a    # 0.6f

    :goto_7
    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v13, Ld01/b;->a:Ld01/b;

    invoke-virtual {v13}, Ld01/b;->g()F

    move-result v13

    const/4 v14, 0x0

    invoke-static {v9, v13, v14, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    new-instance v1, Li3/i;

    invoke-direct {v1, v10}, Li3/i;-><init>(I)V

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v6, v6, 0x380

    if-ne v6, v8, :cond_d

    goto :goto_8

    :cond_d
    move v11, v10

    :goto_8
    or-int v6, v9, v11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_e

    if-ne v8, v7, :cond_f

    :cond_e
    new-instance v8, Ld01/d;

    const/4 v6, 0x0

    invoke-direct {v8, v5, v3, v6}, Ld01/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v21, v8

    check-cast v21, Lc93/a;

    const/16 v22, 0x8

    const/16 v18, 0x0

    move-object/from16 v20, v1

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v12, v1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v1, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v1}, Lkd1/w;->a()Lk91/a;

    move-result-object v1

    invoke-virtual {v1}, Lk91/a;->c()Lt0/i;

    move-result-object v6

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v1, v15, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v7

    int-to-float v12, v10

    new-instance v1, Lci0/a;

    const/16 v9, 0xf

    invoke-direct {v1, v2, v9}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    const v9, -0x24d566b3

    invoke-static {v9, v15, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v16, 0xc30000

    const/16 v17, 0x58

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v5 .. v17}, Ll1/c4;->a(Landroidx/compose/ui/Modifier;Li2/a1;JJFFLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v0

    goto :goto_9

    :cond_10
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v1, v5

    :goto_9
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lc41/d1;

    const/16 v6, 0x15

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ld01/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 38

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v31, Ld01/b;->a:Ld01/b;

    invoke-virtual/range {v31 .. v31}, Ld01/b;->d()F

    move-result v6

    invoke-virtual/range {v31 .. v31}, Ld01/b;->k()F

    move-result v7

    invoke-static {v5, v6, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->a:Ll0/e;

    invoke-virtual/range {v31 .. v31}, Ld01/b;->h()F

    move-result v6

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/16 v8, 0x36

    invoke-static {v6, v7, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v10, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v10, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->g()Lgz0/m0;

    move-result-object v5

    const/16 v16, 0x0

    const/4 v8, 0x6

    if-eqz v5, :cond_6

    const v5, 0x59c834be

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->g()Lgz0/m0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5, v10, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Ld01/b;->e()F

    move-result v9

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Ld01/f;->k()Ly81/f;

    move-result-object v11

    if-nez v11, :cond_4

    const v11, -0x20bd9a5b

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-object/from16 v11, v16

    goto :goto_2

    :cond_4
    const v12, 0x59c855dc

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v10, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-static {v10, v2, v11, v12}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v11

    :goto_2
    if-nez v11, :cond_5

    const v11, 0x59c85af0

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-static {v11, v10, v8, v2}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    goto :goto_3

    :cond_5
    const v12, 0x59c853ea

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    iget-wide v11, v11, Li2/x;->a:J

    :goto_3
    const/16 v17, 0x1b0

    move/from16 v18, v8

    move-wide/from16 v36, v11

    move-object v11, v7

    move-object v7, v9

    move-wide/from16 v8, v36

    const/4 v12, 0x0

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v32, v11

    move/from16 v11, v17

    move-object/from16 v3, v19

    invoke-static/range {v5 .. v12}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-object/from16 v34, v13

    move-object/from16 v35, v14

    goto :goto_4

    :cond_6
    move-object v3, v6

    move-object/from16 v32, v7

    invoke-virtual/range {p0 .. p0}, Ld01/f;->h()Lkd1/o;

    move-result-object v5

    if-eqz v5, :cond_7

    const v5, 0x59c864cc

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->h()Lkd1/o;

    move-result-object v5

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Ld01/b;->f()F

    move-result v6

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v6, v13

    const/16 v13, 0x1b0

    move-object v8, v14

    const/16 v14, 0x78

    move-object v9, v6

    const/4 v6, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v35, v12

    move-object/from16 v34, v17

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    move-object/from16 v34, v13

    move-object/from16 v35, v14

    const v5, -0x20b840e7

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_4
    float-to-double v5, v0

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_8

    goto :goto_5

    :cond_8
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v5, v0, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {v31 .. v31}, Ld01/b;->i()F

    move-result v0

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v0, v6, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_9

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v9, v34

    goto :goto_7

    :cond_9
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v10, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v12, v35

    invoke-static {v10, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_9

    :cond_a
    :goto_8
    move-object/from16 v11, v32

    goto :goto_a

    :cond_b
    :goto_9
    invoke-static {v6, v10, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v10, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Ld01/f;->m()Ld01/h;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Ld01/f;->j()Ld01/g;

    move-result-object v3

    invoke-static {v0, v3, v10, v2}, Ld01/e;->j(Ld01/h;Ld01/g;Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Ld01/f;->k()Ly81/f;

    move-result-object v0

    if-nez v0, :cond_c

    const v0, -0x117cf185

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_b
    move-object/from16 v0, v16

    goto :goto_c

    :cond_c
    const v3, 0x52043a46

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v10, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    invoke-static {v10, v2, v8, v9}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v16

    goto :goto_b

    :goto_c
    if-nez v0, :cond_d

    const v0, 0x52043f5d    # 1.4199969E11f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v10, v7, v2}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    goto :goto_d

    :cond_d
    const v3, 0x52043857

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    iget-wide v8, v0, Li2/x;->a:J

    :goto_d
    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move/from16 v18, v7

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v33, v18

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v0, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Ld01/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-ne v3, v1, :cond_e

    const v3, -0x117a4a8b

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-static {v10, v2}, Ld01/e;->i(Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_e
    const v3, -0x1176a011

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_10

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_f

    :cond_f
    const v3, -0x20aa2187

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->c()Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Ld01/b;->b()F

    move-result v6

    invoke-virtual/range {v31 .. v31}, Ld01/b;->c()F

    move-result v7

    invoke-virtual/range {v31 .. v31}, Ld01/b;->a()F

    move-result v9

    sget-wide v11, Ld01/e;->a:J

    move-object/from16 v27, v10

    new-instance v10, Li2/x;

    invoke-direct {v10, v11, v12}, Li2/x;-><init>(J)V

    const v12, 0x361b0

    const/16 v13, 0x8

    const/4 v8, 0x0

    move-object/from16 v11, v27

    invoke-static/range {v5 .. v13}, Lmy0/b;->c(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_10
    :goto_f
    const v3, -0x20a48007

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p0 .. p0}, Ld01/f;->b()Ld01/a;

    move-result-object v3

    sget-object v5, Ld01/e$a;->c:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    if-eq v3, v1, :cond_14

    const/4 v5, 0x2

    if-eq v3, v5, :cond_12

    const/4 v0, 0x3

    if-ne v3, v0, :cond_11

    const v0, 0x59c98b6d

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :cond_11
    const v0, 0x59c92a1f

    invoke-static {v0, v10, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_12
    const v3, -0x209c910b

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_13

    const v0, -0x209c910c

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_13
    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-static {v4, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, Ld01/f;->j()Ld01/g;

    move-result-object v0

    invoke-static {v0, v10, v2}, Ld01/e;->h(Ld01/g;Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_14
    const v3, -0x20a2e430

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld01/f;->n()Lgz0/m0;

    move-result-object v5

    if-nez v5, :cond_15

    const v0, -0x20a2e431

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_15
    invoke-static {v10, v3, v5, v10, v0}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Ld01/b;->j()F

    move-result v3

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_16
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_14
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Ld01/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ld01/e;->d(Landroidx/compose/ui/Modifier;Ld01/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ld01/g;Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 19

    sget-object v0, Ld01/e$a;->b:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x6

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    move-object/from16 v0, p1

    check-cast v0, Lp1/q;

    const v1, 0x5c38fb3d

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lb91/a;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v0, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->c()Lb91/a;

    move-result-object v2

    invoke-virtual {v2}, Lb91/a;->d()Ll3/v0;

    move-result-object v4

    const/16 v2, 0x10

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v14

    const/16 v17, 0x0

    const v18, 0xfdffff

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v2

    sget-object v4, Lb91/b$j;->a:Lb91/b$j;

    invoke-direct {v1, v2, v4}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    return-object v1

    :cond_0
    const v0, 0x5c38ec98

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-static {v0, v1, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1
    move-object/from16 v0, p1

    check-cast v0, Lp1/q;

    const v1, 0x5c38f67c

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v0, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v1

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    return-object v1
.end method

.method private static final i(Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 17

    new-instance v0, Lb91/a;

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    move-object/from16 v3, p0

    invoke-virtual {v1, v3, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->c()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v2

    const/16 v1, 0x10

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v12

    const/4 v15, 0x0

    const v16, 0xfdffff

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v1

    sget-object v2, Lb91/b$j;->a:Lb91/b$j;

    invoke-direct {v0, v1, v2}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    return-object v0
.end method

.method private static final j(Ld01/h;Ld01/g;Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 3

    sget-object p3, Ld01/e$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v2, 0x2

    if-ne p1, v2, :cond_2

    check-cast p2, Lp1/q;

    const p1, 0x19fb5b2c

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Ld01/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    if-eq p0, v1, :cond_1

    if-ne p0, v2, :cond_0

    const p0, -0x7b085665

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p2, p3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->c()Lb91/a;

    move-result-object p0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const p0, -0x7b08686a

    invoke-static {p0, p2, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    const p0, -0x7b085ec4

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p2, p3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->j()Lb91/a;

    move-result-object p0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    const p0, -0x7b08770f

    check-cast p2, Lp1/q;

    invoke-static {p0, p2, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_3
    check-cast p2, Lp1/q;

    const p0, -0x7b086d45

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p2, p3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->a()Lb91/a;

    move-result-object p0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    :goto_1
    return-object p0
.end method
