.class public abstract Lg01/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lg01/d;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lg01/a;",
        "body",
        "i",
        "(Lg01/a;Landroidx/compose/runtime/Composer;I)V",
        "Lhy0/c2;",
        "a",
        "Lhy0/c2;",
        "fertilityLowTrend",
        "b",
        "fertilityHighTrend",
        "Lhy0/h1;",
        "c",
        "Lhy0/h1;",
        "waitingToConfirmTag",
        "d",
        "confirmedTag",
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
.field private static final a:Lhy0/c2;

.field private static final b:Lhy0/c2;

.field private static final c:Lhy0/h1;

.field private static final d:Lhy0/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    new-instance v0, Lhy0/c2;

    const-string v1, "Low"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v3, Lhy0/b2;->NO_CHANGE:Lhy0/b2;

    const/16 v16, 0x7ff8

    const/16 v17, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v0 .. v17}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg01/c;->a:Lhy0/c2;

    new-instance v1, Lhy0/c2;

    const-string v0, "High"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v4, Lhy0/b2;->POSITIVE_GREEN:Lhy0/b2;

    const/16 v17, 0x7ff8

    const/16 v18, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v1 .. v18}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lg01/c;->b:Lhy0/c2;

    const-string v0, "Waiting to confirm"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v6, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v4, Ly81/f;->TRANSPARENT:Ly81/f;

    const/4 v0, 0x2

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    sget-object v9, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEUTRAL:Lhy0/o1;

    new-instance v1, Lhy0/c1;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x3

    invoke-direct {v1, v3, v5, v7, v3}, Lhy0/c1;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v1

    new-instance v1, Lhy0/h1;

    const v24, 0x3bfd6a

    const/16 v25, 0x0

    move-object v8, v3

    move v10, v5

    const/4 v5, 0x0

    move v12, v7

    const/4 v7, 0x0

    move-object v13, v8

    const/4 v8, 0x0

    move v14, v10

    const/4 v10, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v29, v0

    move-object/from16 v0, v28

    invoke-direct/range {v1 .. v25}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lg01/c;->c:Lhy0/h1;

    const-string v1, "Confirmed"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static/range {v29 .. v29}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    new-instance v2, Lhy0/c1;

    const/4 v10, 0x0

    const/4 v12, 0x3

    invoke-direct {v2, v0, v10, v12, v0}, Lhy0/c1;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lhy0/h1;

    const v26, 0x3bfd6a

    const/16 v27, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v22, v2

    move-object v8, v6

    move-object v6, v4

    move-object v4, v1

    invoke-direct/range {v3 .. v27}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lg01/c;->d:Lhy0/h1;

    return-void
.end method

.method public static synthetic a(Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lg01/c;->g(Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lg01/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lg01/c;->h(Landroidx/compose/ui/Modifier;Lg01/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lg01/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lg01/c;->j(Lg01/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lg01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lg01/c;->f(Lg01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lg01/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x4cc42847

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v1, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit16 v8, v7, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v8, v10, :cond_7

    move v8, v12

    goto :goto_4

    :cond_7
    move v8, v11

    :goto_4
    and-int/lit8 v10, v7, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_d

    if-eqz v2, :cond_8

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v2, v4

    :goto_5
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v6}, Lg01/d;->c()Lcom/whoop/navigation/e;

    move-result-object v4

    if-eqz v4, :cond_9

    move v14, v12

    goto :goto_6

    :cond_9
    move v14, v11

    :goto_6
    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit16 v7, v7, 0x380

    if-ne v7, v9, :cond_a

    move v11, v12

    :cond_a
    or-int/2addr v4, v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_b

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v7, v4, :cond_c

    :cond_b
    new-instance v7, Lf1/w1;

    const/16 v4, 0x9

    invoke-direct {v7, v4, v6, v5}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    const/16 v18, 0xe

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v4, 0x3

    int-to-float v4, v4

    int-to-float v3, v3

    mul-float/2addr v4, v3

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    new-instance v3, Lf01/f;

    const/16 v4, 0xb

    invoke-direct {v3, v4, v6, v5}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x4df33629    # 5.1005162E8f

    invoke-static {v4, v0, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x76

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v2

    goto :goto_7

    :cond_d
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_7
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lf02/c;

    const/16 v3, 0x8

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Lg01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lg01/d;->c()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 39

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v3, v3

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x3

    int-to-float v5, v5

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v31, v5, v7

    invoke-static/range {v31 .. v31}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v5, v8, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v9, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-nez v15, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v11, v9, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, Lb2/e;->K:Lb2/l;

    sget-object v15, Ll0/m;->g:Ll0/h;

    const/16 v0, 0x36

    invoke-static {v15, v11, v9, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v9, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {v10, v9, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v5

    invoke-virtual/range {p0 .. p0}, Lg01/d;->b()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_7

    const v3, 0x75230d73

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v37, v0

    move-object/from16 p3, v1

    move/from16 p2, v6

    move/from16 v33, v7

    move-object v0, v8

    move-object/from16 v38, v12

    move-object v3, v13

    move-object/from16 v36, v14

    const/4 v1, 0x6

    goto/16 :goto_5

    :cond_7
    const v3, 0x75230d74

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v3, v9, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v15

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v10, v3

    const-wide/16 v17, 0x0

    cmpl-double v10, v10, v17

    if-lez v10, :cond_8

    :goto_3
    move v10, v6

    goto :goto_4

    :cond_8
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_3

    :goto_4
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v11, 0x1

    invoke-direct {v6, v3, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object/from16 v27, v9

    move v3, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v7

    move-object/from16 v20, v8

    move-wide v7, v15

    move-object/from16 v16, v14

    const-wide/16 v14, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    move-object/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v24, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move-object/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move-object/from16 v36, v28

    const/16 v28, 0x0

    move-object/from16 v37, v0

    move-object/from16 p3, v1

    move/from16 p2, v3

    move-object/from16 v38, v32

    move-object/from16 v3, v34

    move-object/from16 v0, v35

    const/4 v1, 0x6

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lg01/d;->g()Lhy0/c2;

    move-result-object v5

    if-nez v5, :cond_9

    const v5, 0x7527c78a

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v6, 0x7527c78b

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    sget v6, Lcom/whoop/navigation/e;->d:I

    invoke-static {v5, v9, v6}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    mul-float v5, v5, p2

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v9, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lg01/d;->e()Lgz0/m0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5, v9, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget v6, Lgy0/f;->z0:I

    invoke-static {v9, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    mul-float v7, v33, v33

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-static {v8, v9, v1, v10}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v10

    move-object/from16 v27, v9

    move-wide v8, v10

    const/16 v11, 0x180

    const/4 v12, 0x0

    move-object/from16 v10, v27

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    const/4 v11, 0x1

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lg01/d;->a()Lg01/a;

    move-result-object v5

    if-nez v5, :cond_a

    const v5, -0x7975caef

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    :goto_7
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    const v6, -0x7975caee

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-static {v5, v9, v2}, Lg01/c;->i(Lg01/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lg01/d;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_f

    const v5, -0x79749434

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-static/range {v31 .. v31}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    invoke-static {v5, v0, v9, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_b

    invoke-virtual {v9, v3}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v3, v36

    goto :goto_a

    :cond_b
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v9, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v37

    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    move-object/from16 v0, v38

    goto :goto_c

    :cond_d
    :goto_b
    move-object/from16 v0, p3

    goto :goto_d

    :goto_c
    invoke-static {v1, v9, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v9, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x3d5cdd0c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lg01/d;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lm91/u;

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_e

    :cond_e
    const/4 v11, 0x1

    invoke-static {v9, v2, v11, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_f

    :cond_f
    const/4 v11, 0x1

    const v0, -0x7970c7f1

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_10
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lg01/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lg01/c;->e(Landroidx/compose/ui/Modifier;Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lg01/a;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0x445576de

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v6, v2, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    and-int/2addr v2, v7

    invoke-virtual {v5, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    int-to-float v2, v7

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v2, v3, v5, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    invoke-static {v3, v5, v3, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Lb2/e;->K:Lb2/l;

    sget-object v14, Ll0/m;->g:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v14, v13, v5, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v5, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v13, v5, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v5, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg01/a;->c()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    const v2, 0x53cb0ef1

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    move v1, v4

    move v0, v8

    goto/16 :goto_7

    :cond_9
    const v3, 0x53cb0ef2

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v6

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v10

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float v13, v3, v10

    const/4 v14, 0x7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v10, v9

    const-wide/16 v12, 0x0

    cmpl-double v10, v10, v12

    if-lez v10, :cond_a

    :goto_5
    const/4 v10, 0x1

    goto :goto_6

    :cond_a
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    invoke-static {v3, v10, v9}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v26, 0x0

    const v27, 0x2fff8

    move v9, v4

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move v14, v11

    move v15, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v1, v29

    move/from16 v0, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lg01/a;->b()Lhy0/h1;

    move-result-object v2

    if-nez v2, :cond_b

    const v2, 0x53d0678b

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    :goto_8
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    const/4 v13, 0x1

    goto :goto_9

    :cond_b
    const v3, 0x53d0678c

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :goto_9
    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lg01/a;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_c

    const v1, 0x243d3036

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_a
    const/4 v13, 0x1

    goto :goto_b

    :cond_c
    const v3, 0x243d3037

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v3

    const/16 v26, 0x0

    const v27, 0x2fffa

    move-object/from16 v24, v5

    move-wide v4, v3

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Ld71/c;

    const/16 v2, 0x9

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final j(Lg01/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lg01/c;->i(Lg01/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
