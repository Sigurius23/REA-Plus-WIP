.class public abstract Lxh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001ai\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aE\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001a\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \"\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Lvh0/c;",
        "viewState",
        "Lqh0/b;",
        "analyticsHelper",
        "Lkotlin/Function1;",
        "Lvh0/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Luh0/a;",
        "onNavigationEvent",
        "",
        "showBottomSheet",
        "Lkotlin/Function0;",
        "onDismiss",
        "r",
        "(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "C",
        "(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "A",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "Li2/x;",
        "b",
        "J",
        "tileGradientStart",
        "c",
        "tileGradientEnd",
        "Li2/t;",
        "d",
        "Li2/t;",
        "customGradient",
        "e",
        "iconGradient",
        "ai-insights_release"
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
.field private static final a:Ltr2/n;

.field private static final b:J

.field private static final c:J

.field private static final d:Li2/t;

.field private static final e:Li2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AiInsightsScreen"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lxh0/c;->a:Ltr2/n;

    const-wide v0, 0xff50d5ffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lxh0/c;->b:J

    const-wide v2, 0xff8b62ffL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    sput-wide v2, Lxh0/c;->c:J

    sget-object v4, Li2/t;->b:Li2/s;

    const v5, 0x3e4ccccd    # 0.2f

    invoke-static {v5, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    invoke-static {v5, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    filled-new-array {v8, v7}, [Li2/x;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-wide v8, 0x7f8000007f800000L    # 1.404448428688076E306

    const/16 v10, 0x8

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v10}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v5

    sput-object v5, Lxh0/c;->d:Li2/t;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v5, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static/range {v4 .. v10}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v0

    sput-object v0, Lxh0/c;->e:Li2/t;

    return-void
.end method

.method public static final A(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v0, p1

    move-object/from16 v13, p0

    check-cast v13, Lp1/q;

    const v1, 0x5238034

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v13, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lsz0/p0$b;

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lph0/c;->c:I

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-direct {v3, v2, v8, v9, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lph0/c;->f:I

    invoke-direct {v2, v3, v8, v9, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lsz0/p0$b;->h:I

    sget v4, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v4, v4, 0x3

    or-int v14, v3, v4

    const/4 v15, 0x6

    const/16 v16, 0xbfc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lv41/c;

    const/16 v3, 0xc

    invoke-direct {v2, v0, v3}, Lv41/c;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lxh0/c;->A(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh0/c;",
            "Lqh0/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v6, p2

    move-object/from16 v0, p3

    move/from16 v8, p5

    move-object/from16 v2, p4

    check-cast v2, Lp1/q;

    const v3, -0x39cc682c

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_1
    move v3, v8

    :goto_1
    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v3, v3, 0x30

    :cond_2
    move-object/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v8, 0x30

    if-nez v9, :cond_2

    move-object/from16 v9, p1

    invoke-virtual {v2, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v3, v10

    :goto_3
    and-int/lit16 v10, v8, 0x180

    if-nez v10, :cond_6

    invoke-virtual {v2, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    :cond_6
    and-int/lit16 v10, v8, 0xc00

    const/16 v12, 0x800

    if-nez v10, :cond_8

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    move v10, v12

    goto :goto_5

    :cond_7
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v3, v10

    :cond_8
    and-int/lit16 v10, v3, 0x493

    const/16 v13, 0x492

    const/4 v15, 0x0

    if-eq v10, v13, :cond_9

    const/4 v10, 0x1

    goto :goto_6

    :cond_9
    move v10, v15

    :goto_6
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v2, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_2f

    if-eqz v7, :cond_a

    const/4 v7, 0x0

    goto :goto_7

    :cond_a
    move-object v7, v9

    :goto_7
    instance-of v9, v1, Lvh0/c$e;

    sget-object v13, Lb2/t;->w:Lb2/t;

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_c

    const v3, -0x120a86ac

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    sget-object v9, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_b

    sget-object v4, Lxh0/c$d;->w:Lxh0/c$d;

    invoke-virtual {v2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-static {v13, v4}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    sget v4, Lsz0/p0$c;->f:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v22, v4, v5

    const/16 v23, 0x6

    const/16 v24, 0x9fc

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v4, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move-object/from16 v21, v2

    move-object v10, v3

    move v2, v4

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v21

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_8
    move-object v2, v0

    move-object v5, v1

    move-object v4, v7

    :goto_9
    move-object v8, v9

    goto/16 :goto_24

    :cond_c
    move-object v9, v2

    move v2, v15

    instance-of v15, v1, Lvh0/c$d;

    if-eqz v15, :cond_d

    const v3, -0x1205c171

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-static {v9, v2}, Lxh0/c;->A(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    instance-of v15, v1, Lvh0/c$f;

    if-eqz v15, :cond_28

    const v12, -0x1201fa44

    invoke-virtual {v9, v12}, Lp1/q;->e0(I)V

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v15, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v9, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p1, v13

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_e

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v9, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v9, v12, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    :cond_f
    invoke-static {v14, v9, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v14, v12

    float-to-double v11, v5

    const-wide/16 v27, 0x0

    cmpl-double v11, v11, v27

    const-string v29, "invalid weight; must be greater than zero"

    if-lez v11, :cond_11

    goto :goto_b

    :cond_11
    invoke-static/range {v29 .. v29}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v12, 0x0

    invoke-direct {v11, v5, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v12, v6

    mul-float/2addr v5, v12

    const/4 v6, 0x0

    const/4 v8, 0x2

    invoke-static {v11, v5, v6, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit8 v8, v3, 0xe

    const/4 v11, 0x4

    if-ne v8, v11, :cond_12

    const/4 v11, 0x1

    goto :goto_c

    :cond_12
    const/4 v11, 0x0

    :goto_c
    and-int/lit16 v3, v3, 0x380

    move/from16 v25, v5

    const/16 v5, 0x100

    if-ne v3, v5, :cond_13

    const/16 v17, 0x1

    goto :goto_d

    :cond_13
    const/16 v17, 0x0

    :goto_d
    or-int v11, v11, v17

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v11, v11, v17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v11, :cond_15

    if-ne v5, v10, :cond_14

    goto :goto_e

    :cond_14
    move-object/from16 v18, v6

    move-object/from16 v19, v10

    move-object/from16 v10, p2

    goto :goto_f

    :cond_15
    :goto_e
    new-instance v5, Lwc/e1;

    move-object v11, v1

    check-cast v11, Lvh0/c$f;

    move-object/from16 v18, v6

    move-object/from16 v19, v10

    const/16 v6, 0x8

    move-object/from16 v10, p2

    invoke-direct {v5, v11, v10, v7, v6}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v6, v19

    const/16 v19, 0x0

    const/16 v20, 0x1fe

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    move-object/from16 v31, v14

    const/4 v14, 0x0

    move-object/from16 v32, v15

    const/4 v15, 0x0

    const/16 v33, 0x1

    const/16 v16, 0x0

    move-object/from16 v0, v18

    move-object/from16 v18, v9

    move-object v9, v0

    move-object/from16 v1, p1

    move-object/from16 v17, v5

    move-object/from16 v35, v6

    move-object/from16 v5, v30

    move-object/from16 v6, v31

    move-object/from16 v0, v32

    invoke-static/range {v9 .. v20}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v18

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v10, v12

    mul-float v10, v10, v26

    const/4 v12, 0x2

    int-to-float v12, v12

    mul-float v12, v12, v26

    invoke-static {v11, v10, v12}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x6

    invoke-static {v11, v12, v9, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_16
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v9, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    :cond_17
    invoke-static {v12, v9, v12, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v9, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, p0

    check-cast v5, Lvh0/c$f;

    invoke-virtual {v5}, Lvh0/c$f;->f()Lvh0/e;

    move-result-object v0

    const v30, 0x7f7fffff    # Float.MAX_VALUE

    if-nez v0, :cond_19

    const v0, -0x7737f9e9

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move v6, v2

    move-object v4, v7

    move/from16 v2, v25

    move-object/from16 v7, v35

    const/high16 v0, 0x3f800000    # 1.0f

    goto/16 :goto_18

    :cond_19
    const/4 v2, 0x0

    const v4, -0x7737f9e8

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lvh0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v4, Lg1/v0;->a:Ll0/l1;

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->V0()J

    move-result-wide v10

    invoke-virtual {v4, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    const/16 v18, 0x0

    const/16 v19, 0xc

    move-object/from16 v23, v9

    move-wide v9, v10

    move-wide v11, v12

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v17, v23

    invoke-static/range {v9 .. v19}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v16

    move-object/from16 v9, v17

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v10, v10

    const/4 v11, 0x4

    int-to-float v12, v11

    mul-float/2addr v10, v12

    invoke-virtual {v4, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->X0()J

    move-result-wide v11

    invoke-static {v10, v11, v12}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v18

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v11, v10

    cmpl-double v4, v11, v27

    if-lez v4, :cond_1a

    goto :goto_11

    :cond_1a
    invoke-static/range {v29 .. v29}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_11
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v10, v30

    if-lez v4, :cond_1b

    move/from16 v4, v30

    :goto_12
    const/4 v6, 0x1

    goto :goto_13

    :cond_1b
    move v4, v10

    goto :goto_12

    :goto_13
    invoke-direct {v11, v4, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v4, v12

    const/4 v12, 0x4

    if-ne v8, v12, :cond_1c

    move v14, v6

    goto :goto_14

    :cond_1c
    move v14, v2

    :goto_14
    or-int/2addr v4, v14

    const/16 v13, 0x100

    if-ne v3, v13, :cond_1d

    move v14, v6

    goto :goto_15

    :cond_1d
    move v14, v2

    :goto_15
    or-int/2addr v4, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v15, v35

    if-nez v4, :cond_1e

    if-ne v14, v15, :cond_1f

    :cond_1e
    move/from16 v23, v2

    goto :goto_16

    :cond_1f
    move/from16 v23, v2

    move/from16 v33, v6

    move-object v4, v7

    move v0, v10

    move/from16 v21, v12

    const/4 v12, 0x0

    move v10, v3

    goto :goto_17

    :goto_16
    new-instance v2, Lxh0/a;

    move-object v4, v7

    const/4 v7, 0x1

    move/from16 v21, v3

    move-object v3, v0

    move v0, v10

    move/from16 v10, v21

    move/from16 v33, v6

    move/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v7}, Lxh0/a;-><init>(Lvh0/e;Lqh0/b;Lvh0/c$f;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v14, v2

    :goto_17
    move-object/from16 v22, v14

    check-cast v22, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v24, v2, 0x12

    move/from16 v2, v25

    const/16 v25, 0x0

    const/16 v26, 0x1d3e

    move v3, v10

    const/4 v10, 0x0

    move-object/from16 v17, v9

    move-object v9, v11

    const/4 v11, 0x0

    move-object v6, v12

    const/4 v12, 0x0

    move/from16 v34, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v7, v23

    move-object/from16 v23, v17

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v35, v15

    move-object/from16 v15, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move v6, v7

    move-object/from16 v7, v35

    invoke-static/range {v9 .. v26}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v23

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    :goto_18
    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v5}, Lvh0/c$f;->h()Lvh0/e;

    move-result-object v1

    if-nez v1, :cond_20

    const v0, -0x77263d23

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    move v1, v6

    const/4 v0, 0x1

    goto/16 :goto_1f

    :cond_20
    const v2, -0x77263d22

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lvh0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    float-to-double v10, v0

    cmpl-double v2, v10, v27

    if-lez v2, :cond_21

    goto :goto_19

    :cond_21
    invoke-static/range {v29 .. v29}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_19
    new-instance v10, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v0, v30

    if-lez v2, :cond_22

    move/from16 v0, v30

    :cond_22
    const/4 v2, 0x1

    invoke-direct {v10, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v1}, Lvh0/e;->a()Lgz0/m0;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v12, v0

    goto :goto_1a

    :cond_23
    const/4 v12, 0x0

    :goto_1a
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v0, v11

    const/4 v11, 0x4

    if-ne v8, v11, :cond_24

    move v14, v2

    goto :goto_1b

    :cond_24
    move v14, v6

    :goto_1b
    or-int/2addr v0, v14

    const/16 v13, 0x100

    if-ne v3, v13, :cond_25

    move v14, v2

    goto :goto_1c

    :cond_25
    move v14, v6

    :goto_1c
    or-int/2addr v0, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_26

    if-ne v3, v7, :cond_27

    :cond_26
    move/from16 v33, v2

    goto :goto_1d

    :cond_27
    move v0, v2

    move v1, v6

    goto :goto_1e

    :goto_1d
    new-instance v2, Lxh0/a;

    const/4 v7, 0x0

    move-object v3, v1

    move v1, v6

    move/from16 v0, v33

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v7}, Lxh0/a;-><init>(Lvh0/e;Lqh0/b;Lvh0/c$f;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v2

    :goto_1e
    move-object/from16 v22, v3

    check-cast v22, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v24, v2, 0x12

    const/16 v25, 0x0

    const/16 v26, 0x1fb6

    move-object/from16 v21, v9

    move-object v9, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    invoke-static/range {v9 .. v26}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v23

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-static {v9, v0, v0, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v5, p0

    :goto_20
    move-object/from16 v2, p3

    goto/16 :goto_9

    :cond_28
    move v1, v2

    move-object v4, v7

    move-object v7, v10

    const/4 v0, 0x1

    sget-object v2, Lvh0/c$c;->a:Lvh0/c$c;

    move-object/from16 v5, p0

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    const v0, -0x11ae617d

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    move-object/from16 v21, v9

    sget-object v9, Lsz0/p0$c;->e:Lsz0/p0$c;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lph0/c;->b:I

    const/4 v6, 0x0

    const/4 v12, 0x2

    invoke-direct {v10, v0, v6, v12, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lsz0/p0$c;->f:I

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x3

    or-int v22, v0, v2

    const/16 v23, 0x6

    const/16 v24, 0xbfc

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v21

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_29
    const/4 v6, 0x0

    instance-of v2, v5, Lvh0/c$a;

    if-eqz v2, :cond_2a

    const v0, -0x11a9dbb6

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    new-instance v10, Lsz0/p0$b;

    move-object v0, v5

    check-cast v0, Lvh0/c$a;

    invoke-virtual {v0}, Lvh0/c$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lph0/c;->f:I

    const/4 v12, 0x2

    invoke-direct {v0, v2, v6, v12, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lsz0/p0$b;->h:I

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v3, v3, 0x3

    or-int v22, v2, v3

    const/16 v23, 0x6

    const/16 v24, 0xbfc

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move-object/from16 v21, v9

    move-object v9, v10

    move-object v10, v0

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v21

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_20

    :cond_2a
    sget-object v2, Lvh0/c$b;->a:Lvh0/c$b;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    const v2, -0x11a49147

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    new-instance v13, Lsz0/p0$h;

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lph0/c;->e:I

    const/4 v8, 0x2

    invoke-direct {v10, v2, v6, v8, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lsz0/p0$h;->h:I

    sget v8, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v8, v8, 0x3

    or-int v22, v2, v8

    const/16 v23, 0x6

    const/16 v24, 0xbfc

    const/4 v11, 0x0

    move v2, v12

    const/4 v12, 0x0

    move-object/from16 v21, v9

    move-object v9, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v21

    and-int/lit16 v3, v3, 0x1c00

    if-ne v3, v2, :cond_2b

    move v14, v0

    goto :goto_21

    :cond_2b
    move v14, v1

    :goto_21
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_2d

    if-ne v0, v7, :cond_2c

    goto :goto_22

    :cond_2c
    move-object/from16 v2, p3

    goto :goto_23

    :cond_2d
    :goto_22
    new-instance v0, Lxh0/c$g;

    move-object/from16 v2, p3

    invoke-direct {v0, v2, v6}, Lxh0/c$g;-><init>(Lc93/a;Lq83/d;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_23
    check-cast v0, Lc93/m;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v8, v0, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_24
    move-object v9, v4

    goto :goto_25

    :cond_2e
    move-object v8, v9

    const v0, 0x7ad279a

    invoke-static {v0, v8, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_2f
    move-object v5, v1

    move-object v8, v2

    move-object v2, v0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_25
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_30

    new-instance v0, Lw71/k;

    const/4 v7, 0x7

    move-object/from16 v3, p2

    move/from16 v6, p6

    move-object v4, v2

    move-object v1, v5

    move-object v2, v9

    move/from16 v5, p5

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final D(Lvh0/c;Lkotlin/jvm/functions/Function1;Lqh0/b;Ln0/q;)Ll83/a0;
    .locals 8

    const-string v0, "$this$LazyColumn"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxh0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lxh0/b;-><init>(Lvh0/c;I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x5bb12e17

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x0

    const/4 v3, 0x3

    invoke-static {p3, v0, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance v1, Lxh0/b;

    const/4 v4, 0x1

    invoke-direct {v1, p0, v4}, Lxh0/b;-><init>(Lvh0/c;I)V

    new-instance v4, Lx1/b;

    const v5, 0x5c1abe52

    invoke-direct {v4, v1, v2, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p3, v0, v4, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    move-object v1, p0

    check-cast v1, Lvh0/c$f;

    invoke-virtual {v1}, Lvh0/c$f;->b()Ljava/util/List;

    move-result-object v1

    sget-object v4, Lxh0/c$h;->w:Lxh0/c$h;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    new-instance v6, Lxh0/c$i;

    invoke-direct {v6, v4, v1}, Lxh0/c$i;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v4, Lxh0/c$j;

    invoke-direct {v4, v1, p1}, Lxh0/c$j;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lx1/b;

    const v7, 0x2fd4df92

    invoke-direct {v1, v4, v2, v7}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v4, p3

    check-cast v4, Ln0/f;

    invoke-virtual {v4, v5, v0, v6, v1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    new-instance v1, Lno0/h;

    const/16 v4, 0x1b

    invoke-direct {v1, p0, p2, p1, v4}, Lno0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const p1, -0x541d7c4f

    invoke-direct {p0, v1, v2, p1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p3, v0, p0, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lvh0/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    check-cast v0, Lvh0/c$f;

    invoke-virtual {v0}, Lvh0/c$f;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_1

    const v0, -0x4fa1b0cd

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const v1, -0x4fa1b0cc

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v4, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->P()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v6

    int-to-float v1, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v1, v5

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    invoke-static {v5, v8, v1, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v28, v1, 0x12

    const v29, 0x2fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x30

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lvh0/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v0, p0

    check-cast v0, Lvh0/c$f;

    invoke-virtual {v0}, Lvh0/c$f;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_1

    const v0, 0x4c2ac1e3    # 4.476302E7f

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :cond_1
    const v1, 0x4c2ac1e4    # 4.4763024E7f

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v3

    const/4 v5, 0x4

    int-to-float v5, v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v5, v6, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v1, Lb2/e;->J:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v1, v4, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_2

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    :cond_3
    invoke-static {v7, v4, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v1, v4, v2, v3}, Lo01/d;->c(Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x2

    int-to-float v1, v1

    invoke-static {v1, v5, v6, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v4, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v6

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v28, v1, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final G(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 24

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "$this$item"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p5, 0x11

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/lit8 v3, p5, 0x1

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v2, p0

    check-cast v2, Lvh0/c$f;

    invoke-virtual {v2}, Lvh0/c$f;->c()Lvh0/e;

    move-result-object v2

    if-nez v2, :cond_1

    const v0, 0x6cbcacf4

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :cond_1
    const v3, 0x6cbcacf5

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    int-to-float v3, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v14, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Lvh0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v14, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->k()Lb91/a;

    move-result-object v18

    invoke-virtual {v2}, Lvh0/e;->a()Lgz0/m0;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    :goto_1
    move-object/from16 v17, v10

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    goto :goto_1

    :goto_2
    sget-object v10, Lxh0/c;->e:Li2/t;

    invoke-static {v7, v10}, Lgb1/b0;->s(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    sget-object v10, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v8, v14, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->V0()J

    move-result-wide v10

    invoke-virtual {v8, v14, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    const/4 v15, 0x0

    const/16 v16, 0xc

    move v12, v6

    move-object v13, v7

    move-wide v6, v10

    const-wide/16 v10, 0x0

    move/from16 v20, v12

    move-object/from16 v21, v13

    const-wide/16 v12, 0x0

    move-object/from16 v4, v21

    invoke-static/range {v6 .. v16}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v13

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float v6, v6, v20

    const/4 v7, 0x0

    invoke-static {v4, v7, v6, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Lre1/k;

    const/16 v4, 0x16

    invoke-direct {v5, v2, v0, v1, v4}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit8 v21, v0, 0x6

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v22, v0, 0x6

    const/16 v23, 0xf26

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v9, v17

    const/16 v17, 0x0

    move-object v12, v3

    move-object/from16 v10, v19

    move-object/from16 v19, v5

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v20

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H(Lvh0/e;Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lvh0/e;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    sget-object v0, Lqh0/a$b;->a:Lqh0/a$b;

    invoke-virtual {p1, v0}, Lqh0/b;->a(Lqh0/a;)V

    :cond_0
    new-instance p1, Luh0/a$a;

    invoke-direct {p1, p0}, Luh0/a$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lvh0/e;Lqh0/b;Lvh0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lvh0/e;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Lqh0/a$a;

    check-cast p2, Lvh0/c$f;

    invoke-virtual {p2}, Lvh0/c$f;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lqh0/a$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lqh0/b;->a(Lqh0/a;)V

    :cond_0
    new-instance p1, Luh0/a$a;

    invoke-direct {p1, p0}, Luh0/a$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lvh0/e;Lqh0/b;Lvh0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lvh0/e;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Lqh0/a$e;

    check-cast p2, Lvh0/c$f;

    invoke-virtual {p2}, Lvh0/c$f;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lqh0/a$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lqh0/b;->a(Lqh0/a;)V

    :cond_0
    new-instance p1, Luh0/a$a;

    invoke-direct {p1, p0}, Luh0/a$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lxh0/c;->C(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic L()Ltr2/n;
    .locals 1

    sget-object v0, Lxh0/c;->a:Ltr2/n;

    return-object v0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lxh0/c;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lxh0/c;->K(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lxh0/c;->y(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lxh0/c;->z(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lvh0/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxh0/c;->E(Lvh0/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lxh0/c;->B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lvh0/e;Lqh0/b;Lvh0/c$f;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxh0/c;->I(Lvh0/e;Lqh0/b;Lvh0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lvh0/c$f;Lkotlin/jvm/functions/Function1;Lqh0/b;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxh0/c;->D(Lvh0/c;Lkotlin/jvm/functions/Function1;Lqh0/b;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxh0/c;->x(Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Luh0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxh0/c;->t(Luh0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxh0/c;->w(Lbc3/c0;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lvh0/e;Lqh0/b;Lvh0/c$f;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxh0/c;->J(Lvh0/e;Lqh0/b;Lvh0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lg1/y3;Lv41/g;Lbc3/c0;Lqh0/b;Lkotlin/jvm/functions/Function1;Lvh0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lxh0/c;->v(Lg1/y3;Lv41/g;Lbc3/c0;Lqh0/b;Lkotlin/jvm/functions/Function1;Lvh0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lvh0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxh0/c;->s(Lvh0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lxh0/c;->G(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lvh0/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxh0/c;->F(Lvh0/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lvh0/e;Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lxh0/c;->H(Lvh0/e;Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh0/c;",
            "Lqh0/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v9, p7

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p6

    check-cast v6, Lp1/q;

    const v0, -0x5569b695

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit8 v7, p8, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v9, 0x6000

    if-nez v13, :cond_b

    move/from16 v13, p4

    invoke-virtual {v6, v13}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v0, v14

    :goto_9
    and-int/lit8 v14, p8, 0x20

    const/high16 v16, 0x30000

    if-eqz v14, :cond_e

    or-int v0, v0, v16

    move-object/from16 v10, p5

    goto :goto_b

    :cond_e
    and-int v16, v9, v16

    move-object/from16 v10, p5

    if-nez v16, :cond_10

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v16, 0x10000

    :goto_a
    or-int v0, v0, v16

    :cond_10
    :goto_b
    const v16, 0x12493

    and-int v15, v0, v16

    const v12, 0x12492

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-eq v15, v12, :cond_11

    move/from16 v12, v19

    goto :goto_c

    :cond_11
    move/from16 v12, v18

    :goto_c
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v6, v15, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_24

    const/4 v12, 0x0

    if-eqz v2, :cond_12

    move-object v15, v12

    goto :goto_d

    :cond_12
    move-object v15, v3

    :goto_d
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_14

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_13

    new-instance v3, Lxa0/a;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lxa0/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v20, v3

    goto :goto_e

    :cond_14
    move-object/from16 v20, v5

    :goto_e
    if-eqz v7, :cond_16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_15

    new-instance v3, Lxa0/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lxa0/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v3

    goto :goto_f

    :cond_16
    move-object/from16 v21, v8

    :goto_f
    if-eqz v11, :cond_17

    move/from16 v11, v19

    goto :goto_10

    :cond_17
    move v11, v13

    :goto_10
    if-eqz v14, :cond_19

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_18

    new-instance v3, Lxa1/a;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lxa1/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lc93/a;

    move-object v10, v3

    :cond_19
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1a

    invoke-static {v6}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v13, v3

    check-cast v13, Lbc3/c0;

    move-object v3, v2

    sget-object v2, Lg1/z3;->x:Lg1/z3;

    const/16 v7, 0xc06

    const/4 v8, 0x6

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v14, v5

    const/4 v5, 0x1

    invoke-static/range {v2 .. v8}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v2

    move-object v3, v6

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const v5, 0xe000

    and-int/2addr v5, v0

    const/16 v6, 0x4000

    if-ne v5, v6, :cond_1b

    move/from16 v5, v19

    goto :goto_11

    :cond_1b
    move/from16 v5, v18

    :goto_11
    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1c

    if-ne v6, v14, :cond_1d

    :cond_1c
    new-instance v6, Lxh0/c$a;

    invoke-direct {v6, v11, v2, v12}, Lxh0/c$a;-><init>(ZLg1/y3;Lq83/d;)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v6, Lc93/m;

    invoke-static {v3, v6, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lg1/y3;->b()Lg1/z3;

    move-result-object v4

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    const/high16 v6, 0x70000

    and-int/2addr v0, v6

    const/high16 v6, 0x20000

    if-ne v0, v6, :cond_1e

    move/from16 v18, v19

    :cond_1e
    or-int v0, v5, v18

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_1f

    if-ne v5, v14, :cond_20

    :cond_1f
    new-instance v5, Lxh0/c$b;

    invoke-direct {v5, v2, v10, v12}, Lxh0/c$b;-><init>(Lg1/y3;Lc93/a;Lq83/d;)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v5, Lc93/m;

    invoke-static {v3, v5, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v0, v1, Lvh0/c$f;

    if-eqz v0, :cond_23

    move-object v0, v1

    check-cast v0, Lvh0/c$f;

    invoke-virtual {v0}, Lvh0/c$f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_21

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :cond_21
    move-object/from16 v23, v4

    new-instance v4, Ly71/g;

    sget-object v5, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lph0/c;->d:I

    const/4 v8, 0x2

    invoke-direct {v6, v7, v12, v8, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v5, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    invoke-virtual {v0}, Lvh0/c$f;->e()Lgz0/m0;

    move-result-object v0

    if-eqz v0, :cond_22

    new-instance v5, Ly71/g;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lph0/c;->a:I

    invoke-direct {v6, v7, v12, v8, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v5, v0, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    move-object/from16 v25, v5

    goto :goto_12

    :cond_22
    move-object/from16 v25, v12

    :goto_12
    sget-object v26, Lv41/i0;->LEFT:Lv41/i0;

    new-instance v22, Lv41/g;

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x70

    const/16 v31, 0x0

    move-object/from16 v24, v4

    invoke-direct/range {v22 .. v31}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_13

    :cond_23
    new-instance v23, Lv41/g;

    const/16 v31, 0x7f

    const/16 v32, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v23 .. v32}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v23

    :goto_13
    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v0, v3, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->t()J

    move-result-wide v16

    new-instance v0, Lbm2/p;

    move-object v6, v1

    move-object v1, v2

    move-object v8, v10

    move-object v4, v15

    move-object/from16 v5, v20

    move-object/from16 v7, v21

    move-object/from16 v2, v22

    move-object v10, v3

    move-object v3, v13

    invoke-direct/range {v0 .. v8}, Lbm2/p;-><init>(Lg1/y3;Lv41/g;Lbc3/c0;Lqh0/b;Lkotlin/jvm/functions/Function1;Lvh0/c;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    const v1, -0xc5a351

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const v20, 0x180006

    const/16 v21, 0x3a

    move v13, v11

    const/4 v11, 0x0

    const-wide/16 v14, 0x0

    move-object v3, v10

    move-object v10, v12

    move/from16 v19, v13

    move-wide/from16 v12, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v0, v19

    move-object/from16 v19, v3

    invoke-static/range {v10 .. v21}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v4

    move-object v3, v5

    move-object v4, v7

    move-object v6, v8

    move v5, v0

    goto :goto_14

    :cond_24
    move-object/from16 v19, v6

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v5

    move-object v4, v8

    move-object v6, v10

    move v5, v13

    :goto_14
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_25

    new-instance v0, Lb30/i2;

    move-object/from16 v1, p0

    move/from16 v8, p8

    move v7, v9

    invoke-direct/range {v0 .. v8}, Lb30/i2;-><init>(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final s(Lvh0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Luh0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(Lg1/y3;Lv41/g;Lbc3/c0;Lqh0/b;Lkotlin/jvm/functions/Function1;Lvh0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    and-int/lit8 v4, p9, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eq v4, v6, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    and-int/lit8 v7, p9, 0x1

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_5

    new-instance v10, Lv41/f$a;

    invoke-direct {v10, v0}, Lv41/f$a;-><init>(Lg1/y3;)V

    sget-object v11, Ly81/f;->TRANSPARENT:Ly81/f;

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v7, 0x0

    const/4 v9, 0x3

    invoke-static {v4, v7, v9}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v7, v9}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v8, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/res/Configuration;

    iget v12, v12, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v12, v12

    const v13, 0x3f266666    # 0.65f

    mul-float/2addr v12, v13

    const/4 v13, 0x0

    invoke-static {v4, v13, v12, v5}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lxh0/c;->d:Li2/t;

    const/4 v12, 0x6

    invoke-static {v4, v5, v7, v13, v12}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v5, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_1

    if-ne v5, v6, :cond_2

    :cond_1
    new-instance v5, Lbf0/h;

    const/16 v4, 0x1b

    invoke-direct {v5, v1, v0, v4}, Lbf0/h;-><init>(Lbc3/c0;Lg1/y3;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v5

    check-cast v7, Lc93/a;

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    if-ne v1, v6, :cond_4

    :cond_3
    new-instance v1, Lwr0/r;

    const/16 v0, 0xa

    invoke-direct {v1, v0, v2, v3}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v13, v1

    check-cast v13, Lc93/a;

    new-instance v0, Lat2/r;

    const/16 v5, 0x1d

    move-object/from16 v1, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x2303c3f

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    sget-object v0, Lxh0/d;->a:Lxh0/d;

    invoke-virtual {v0}, Lxh0/d;->b()Lc93/m;

    move-result-object v22

    sget v0, Lv41/g;->h:I

    shl-int/2addr v0, v9

    const v1, 0xc00c00

    or-int/2addr v0, v1

    sget v1, Lv41/f$a;->c:I

    shl-int/2addr v1, v12

    or-int v24, v0, v1

    const/16 v25, 0x6006

    const/16 v26, 0x1b41

    move-object/from16 v23, v8

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v9, p1

    move-object v12, v7

    invoke-static/range {v8 .. v26}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_5
    move-object/from16 v23, v8

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lxh0/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lxh0/c$c;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    if-eqz p0, :cond_0

    sget-object v0, Lqh0/a$d;->a:Lqh0/a$d;

    invoke-virtual {p0, v0}, Lqh0/b;->a(Lqh0/a;)V

    :cond_0
    sget-object p0, Lvh0/a$a;->a:Lvh0/a$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string v0, "$this$BottomSheet"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p4, p6, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p4, v0, :cond_0

    move p4, v1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    and-int/2addr p6, v1

    move-object v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p6, p4}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v6}, Lxh0/c;->C(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lxh0/c;->r(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
