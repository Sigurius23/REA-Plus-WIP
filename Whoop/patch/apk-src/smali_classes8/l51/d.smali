.class public abstract Ll51/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001aK\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00018\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0012\u001a\u0004\u0008\u0019\u0010\u0016\"\u0017\u0010 \u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Ll51/g;",
        "",
        "n",
        "(Ll51/g;)F",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "scrollModifier",
        "",
        "drawBarBackground",
        "g",
        "(Landroidx/compose/ui/Modifier;Ll51/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "TOOLBAR_ICON_TOUCH_AREA",
        "b",
        "p",
        "()F",
        "HEADER_HORIZONTAL_INSET",
        "c",
        "getHEADER_IMAGE_FADE_START",
        "HEADER_IMAGE_FADE_START",
        "Li2/t;",
        "d",
        "Li2/t;",
        "o",
        "()Li2/t;",
        "CollapsableBarBrush",
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
.field private static final a:F

.field private static final b:F

.field private static final c:F = 0.55f

.field private static final d:Li2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Ll51/d;->a:F

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v2

    mul-float/2addr v0, v1

    sput v0, Ll51/d;->b:F

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v3, 0xcc283339L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v4, 0xb31d2429L

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const v5, 0x192024

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v0, v2, v1, v1, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v0

    sput-object v0, Ll51/d;->d:Li2/t;

    return-void
.end method

.method public static synthetic a(Ll51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ll51/d;->l(Ll51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll51/d;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ll51/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ll51/d;->m(Landroidx/compose/ui/Modifier;Ll51/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ll51/d;->k(Ll51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll51/d;->i(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll51/d;->j(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Ll51/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ll51/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v6, p6

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, 0x23049136

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

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

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, v6, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :goto_7
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v11, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_c

    move/from16 v11, p4

    invoke-virtual {v12, v11}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v4, v14

    :goto_9
    and-int/lit16 v14, v4, 0x2493

    const/16 v15, 0x2492

    if-eq v14, v15, :cond_f

    const/4 v14, 0x1

    goto :goto_a

    :cond_f
    const/4 v14, 0x0

    :goto_a
    and-int/lit8 v15, v4, 0x1

    invoke-virtual {v12, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_3b

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_10

    move-object v3, v14

    :cond_10
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_11

    new-instance v5, Lkx1/b;

    const/16 v7, 0x1b

    invoke-direct {v5, v7}, Lkx1/b;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_12
    move-object v5, v7

    :goto_b
    if-eqz v8, :cond_13

    move-object v15, v14

    goto :goto_c

    :cond_13
    move-object v15, v9

    :goto_c
    if-eqz v10, :cond_14

    const/16 v33, 0x1

    goto :goto_d

    :cond_14
    move/from16 v33, v11

    :goto_d
    sget-object v7, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    sget-object v8, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v12}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v8

    iget-object v8, v8, Ll0/c2;->f:Ll0/b;

    invoke-virtual {v8}, Ll0/b;->e()Lv4/b;

    move-result-object v8

    iget v8, v8, Lv4/b;->b:I

    int-to-float v8, v8

    invoke-interface {v7}, Ly3/c;->getDensity()F

    move-result v7

    div-float v19, v8, v7

    invoke-static {v2}, Ll51/d;->n(Ll51/g;)F

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float v9, v8, v7

    sget-object v10, Ll51/g;->j:Ll51/g$a;

    invoke-virtual {v2}, Ll51/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v2}, Ll51/g;->p()Lb91/c;

    move-result-object v13

    invoke-virtual {v2}, Ll51/g;->o()Z

    move-result v1

    invoke-virtual {v10, v11, v13, v1}, Ll51/g$a;->e(Lcom/whoop/design/util/TextResource;Lb91/c;Z)F

    move-result v1

    invoke-virtual {v10}, Ll51/g$a;->a()F

    move-result v11

    add-float/2addr v11, v1

    invoke-virtual {v10}, Ll51/g$a;->b()F

    move-result v1

    sub-float/2addr v1, v11

    mul-float/2addr v1, v9

    add-float/2addr v1, v11

    add-float v1, v1, v19

    invoke-virtual {v2}, Ll51/g;->j()Lkd1/o;

    move-result-object v11

    invoke-interface {v3, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v8, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v13, 0x6

    if-nez v11, :cond_15

    const v8, 0x1092468c

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v12, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    move-object/from16 v35, v3

    invoke-virtual {v8}, Ly81/i;->o()J

    move-result-wide v2

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v14, v2, v3, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_15
    move-object/from16 v35, v3

    const/4 v3, 0x0

    const v2, 0x1093cbfc

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move-object v2, v14

    :goto_e
    invoke-interface {v1, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move-object/from16 v18, v14

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_16

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_16
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 p3, v8

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 p4, v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_18

    goto :goto_10

    :cond_17
    move/from16 p4, v9

    :goto_10
    invoke-static {v3, v12, v3, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x0

    if-eqz v11, :cond_19

    if-eqz v33, :cond_19

    const v9, -0x272013e9

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    move-object/from16 v9, v18

    const/high16 v1, 0x3f800000    # 1.0f

    move-object/from16 v18, v10

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v1, Ll51/d;->d:Li2/t;

    move-object/from16 v21, v9

    move-object/from16 p2, v11

    const/4 v9, 0x0

    const/4 v11, 0x6

    invoke-static {v10, v1, v8, v9, v11}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v1, v12, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_19
    move-object/from16 p2, v11

    move-object/from16 v21, v18

    const/4 v7, 0x0

    const/4 v11, 0x6

    move-object/from16 v18, v10

    const v1, -0x271cddce

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_11
    if-eqz p2, :cond_1b

    const v1, 0x3c23d70a    # 0.01f

    cmpl-float v1, p4, v1

    if-lez v1, :cond_1a

    const/4 v1, 0x1

    goto :goto_12

    :cond_1a
    const/4 v1, 0x0

    :goto_12
    if-eqz v1, :cond_1b

    move-object/from16 v7, p2

    goto :goto_13

    :cond_1b
    move-object v7, v8

    :goto_13
    if-nez v7, :cond_1c

    const v1, -0x271b70d5

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    move-object/from16 v38, p3

    move/from16 v41, p4

    move-object/from16 p2, v2

    move-object/from16 v36, v8

    move-object/from16 v43, v13

    move-object/from16 v42, v14

    move-object/from16 v40, v15

    move-object/from16 v37, v18

    move-object/from16 v2, v21

    const/high16 v1, 0x3f800000    # 1.0f

    goto/16 :goto_14

    :cond_1c
    const v1, -0x271b70d4

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    move v1, v11

    const/4 v11, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x3

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object/from16 v38, p3

    move-object/from16 v36, v10

    move-object/from16 p2, v13

    move-object/from16 p3, v14

    move-object/from16 v37, v18

    move-object/from16 v14, v21

    move-object/from16 v10, v29

    move/from16 v13, p4

    move/from16 v18, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object v12, v10

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v13, v8}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_1d

    new-instance v9, Lkx1/b;

    const/16 v10, 0x1c

    invoke-direct {v9, v10}, Lkx1/b;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_1e

    new-instance v9, Lkx1/b;

    const/16 v10, 0x1d

    invoke-direct {v9, v10}, Lkx1/b;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v9}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object v8, v15

    const/16 v15, 0x6030

    const/16 v10, 0x100

    const/16 v16, 0x68

    move-object v11, v8

    const/4 v8, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    sget-object v11, Ly2/j;->a:Ly2/b1;

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move/from16 v22, v13

    const/4 v13, 0x0

    move-object/from16 v43, p2

    move-object/from16 v42, p3

    move-object/from16 p2, v2

    move-object v2, v14

    move-object/from16 v40, v21

    move/from16 v41, v22

    move-object/from16 v14, v29

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_14
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v21, 0x0

    const/16 v22, 0xd

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v8, Ll51/d;->b:F

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static {v7, v8, v10, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x0

    invoke-static {v8, v9, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1f

    move-object/from16 v15, v42

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1f
    move-object/from16 v15, v42

    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v12, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v38

    invoke-static {v12, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_20

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_21

    :cond_20
    move-object/from16 v10, v43

    goto :goto_16

    :cond_21
    move-object/from16 v10, v43

    goto :goto_17

    :goto_16
    invoke-static {v9, v12, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_17
    invoke-static {v12, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {v37 .. v37}, Ll51/g$a;->a()F

    move-result v9

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v9, v11, v12, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_22

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_22
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v12, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_23

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_24

    :cond_23
    invoke-static {v11, v12, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    invoke-static {v12, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Ll51/g;->n()Ll51/h;

    move-result-object v7

    invoke-virtual {v7}, Ll51/h;->a()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_28

    const v9, 0x2c97e657

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    sget v9, Ll51/d;->a:F

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v16, Lny0/o;

    sget-object v17, Lny0/q$a;->f:Lny0/q$a;

    invoke-virtual {v7}, Ll51/h;->a()Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v18

    const/16 v27, 0x3fc

    const/16 v28, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit16 v13, v4, 0x380

    const/16 v14, 0x100

    if-ne v13, v14, :cond_25

    const/4 v13, 0x1

    goto :goto_19

    :cond_25
    const/4 v13, 0x0

    :goto_19
    or-int/2addr v11, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_27

    if-ne v13, v0, :cond_26

    goto :goto_1a

    :cond_26
    const/4 v11, 0x0

    goto :goto_1b

    :cond_27
    :goto_1a
    new-instance v13, Ll51/c;

    const/4 v11, 0x0

    invoke-direct {v13, v7, v5, v11}, Ll51/c;-><init>(Ll51/h;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v13, Lc93/a;

    move/from16 v34, v11

    move-object v11, v13

    const/16 v13, 0x1b0

    move/from16 v44, v14

    const/16 v14, 0x8

    move-object/from16 v38, v8

    const-string v8, "Back"

    move-object/from16 v43, v10

    const/4 v10, 0x0

    move-object/from16 v7, v16

    move/from16 v1, v34

    move-object/from16 v46, v38

    move-object/from16 v47, v43

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_28
    move-object/from16 v46, v8

    move-object/from16 v47, v10

    const/4 v1, 0x0

    const v7, 0x2ca2006b

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget v7, Ll51/d;->a:F

    invoke-static {v2, v7, v12, v1}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    :goto_1c
    invoke-virtual/range {p1 .. p1}, Ll51/g;->q()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v12, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_29

    const/4 v13, 0x1

    goto :goto_1d

    :cond_29
    const/4 v13, 0x0

    :goto_1d
    const/16 v1, 0x8

    if-eqz v13, :cond_2a

    const v8, 0x2ca5853c

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v8, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v8, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    const/4 v8, 0x1

    int-to-float v13, v8

    int-to-float v14, v1

    mul-float/2addr v13, v14

    const/4 v8, 0x0

    const/4 v14, 0x2

    invoke-static {v2, v13, v8, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v31, 0x0

    const v32, 0x2fff8

    move/from16 v45, v9

    move-wide v9, v10

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v42, v15

    const/4 v15, 0x0

    const/16 v39, 0x1

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    move-object/from16 p3, v3

    move/from16 v3, v39

    move-object/from16 v1, v42

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_2a
    move-object/from16 p3, v3

    move-object v1, v15

    const/4 v3, 0x1

    const/4 v7, 0x0

    const v8, 0x2ca9c80c

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual/range {p1 .. p1}, Ll51/g;->m()Ll51/h;

    move-result-object v7

    if-eqz v7, :cond_2b

    invoke-virtual {v7}, Ll51/h;->a()Ljava/lang/Integer;

    move-result-object v8

    goto :goto_1f

    :cond_2b
    move-object/from16 v8, v36

    :goto_1f
    if-eqz v8, :cond_2f

    const v8, 0x2cabe43f

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget v8, Ll51/d;->a:F

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v13, Lny0/o;

    sget-object v14, Lny0/q$a;->f:Lny0/q$a;

    invoke-virtual {v7}, Ll51/h;->a()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/16 v24, 0x3fc

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit16 v4, v4, 0x380

    const/16 v10, 0x100

    if-ne v4, v10, :cond_2c

    move v4, v3

    goto :goto_20

    :cond_2c
    const/4 v4, 0x0

    :goto_20
    or-int/2addr v4, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_2d

    if-ne v8, v0, :cond_2e

    :cond_2d
    new-instance v8, Ll51/c;

    invoke-direct {v8, v7, v5, v3}, Ll51/c;-><init>(Ll51/h;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    move-object v11, v8

    check-cast v11, Lc93/a;

    move-object v7, v13

    const/16 v13, 0x1b0

    const/16 v14, 0x8

    const-string v8, "Action"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_21

    :cond_2f
    const/4 v7, 0x0

    const v0, 0x2cb387ab

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget v0, Ll51/d;->a:F

    invoke-static {v2, v0, v12, v7}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    :goto_21
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Ll51/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Ll51/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    const-string v7, "invalid weight; must be greater than zero"

    const-wide/16 v9, 0x0

    if-eqz v4, :cond_38

    const v4, 0x21011117

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v13, v4

    cmpl-double v9, v13, v9

    if-lez v9, :cond_30

    goto :goto_22

    :cond_30
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_22
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v9, v4, v8

    if-lez v9, :cond_31

    goto :goto_23

    :cond_31
    move v8, v4

    :goto_23
    invoke-direct {v7, v8, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v4, p2

    const/4 v10, 0x0

    invoke-static {v4, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_32

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_24

    :cond_32
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_24
    invoke-static {v12, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v46

    invoke-static {v12, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_33

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    :cond_33
    move-object/from16 v10, v47

    goto :goto_26

    :cond_34
    :goto_25
    move-object/from16 v1, p3

    goto :goto_27

    :goto_26
    invoke-static {v8, v12, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_25

    :goto_27
    invoke-static {v12, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v1, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Ll51/g;->p()Lb91/c;

    move-result-object v4

    if-eqz v4, :cond_35

    sget-object v8, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v8, v4}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v8

    goto :goto_28

    :cond_35
    move-object/from16 v8, v36

    :goto_28
    if-nez v8, :cond_36

    const v4, -0x3de22fe5

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->p()Lb91/a;

    move-result-object v8

    const/4 v10, 0x0

    :goto_29
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-object/from16 v27, v8

    goto :goto_2a

    :cond_36
    const/4 v10, 0x0

    const v1, -0x3de239b4

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    goto :goto_29

    :goto_2a
    sget-object v1, Lb2/e;->G:Lb2/m;

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v2, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v9, 0x2

    int-to-float v1, v9

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v14, v1, v2

    invoke-virtual/range {v37 .. v37}, Ll51/g$a;->c()F

    move-result v17

    const/16 v18, 0x6

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ll51/g;->o()Z

    move-result v2

    if-eqz v2, :cond_37

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_2b

    :cond_37
    move/from16 v8, v41

    :goto_2b
    invoke-static {v8, v1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v31, 0x0

    const v32, 0x2fff8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-wide v9, v6

    move-object v7, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_2e

    :cond_38
    const v0, 0x210e287b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v13, v1

    cmpl-double v0, v13, v9

    if-lez v0, :cond_39

    goto :goto_2c

    :cond_39
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2c
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v1, v8

    if-lez v2, :cond_3a

    goto :goto_2d

    :cond_3a
    move v8, v1

    :goto_2d
    invoke-direct {v0, v8, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_2e
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move-object v3, v5

    move/from16 v5, v33

    move-object/from16 v1, v35

    move-object/from16 v4, v40

    goto :goto_2f

    :cond_3b
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v7

    move-object v4, v9

    move v5, v11

    :goto_2f
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_3c

    new-instance v0, Lbf0/g;

    const/16 v8, 0x18

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_3c
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->f(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lk2/c;)Ll83/a0;
    .locals 14

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->f:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v2, Ll51/d;->c:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v4, Li2/x;->m:J

    new-instance v7, Li2/x;

    invoke-direct {v7, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v3, v4}, [Ll83/k;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v0, v2, v1, v1, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v5

    const/4 v12, 0x6

    const/16 v13, 0x3e

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v13}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ll51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ll51/h;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Ll51/a;->a:Ll51/a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ll51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ll51/h;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Ll51/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ll51/d;->g(Landroidx/compose/ui/Modifier;Ll51/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ll51/g;)F
    .locals 3

    invoke-virtual {p0}, Ll51/g;->k()Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll51/g;->l()Z

    move-result p0

    if-eqz p0, :cond_1

    move p0, v2

    goto :goto_0

    :cond_1
    move p0, v1

    :goto_0
    invoke-static {p0, v1, v2}, Le93/b;->m(FFF)F

    move-result p0

    return p0
.end method

.method public static final o()Li2/t;
    .locals 1

    sget-object v0, Ll51/d;->d:Li2/t;

    return-object v0
.end method

.method public static final p()F
    .locals 1

    sget v0, Ll51/d;->b:F

    return v0
.end method
