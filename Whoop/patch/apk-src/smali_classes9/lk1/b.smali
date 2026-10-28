.class public abstract Llk1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a5\u0010\u000f\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lik1/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lik1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "",
        "dividerState",
        "",
        "index",
        "isExpanded",
        "totalContributors",
        "h",
        "(Ljava/util/List;IZI)V",
        "Lc11/i;",
        "a",
        "Lc11/i;",
        "SampleContributorContent",
        "healthspan_release"
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
.field private static final a:Lc11/i;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v0, Lc11/i;

    new-instance v1, Lc11/k;

    sget-object v11, Lc11/m;->OLDER_1:Lc11/m;

    invoke-direct {v1, v11}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v2, Lc11/k;

    sget-object v3, Lc11/m;->OLDER_2:Lc11/m;

    invoke-direct {v2, v3}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v3, Lc11/k;

    sget-object v4, Lc11/m;->OLDER_3:Lc11/m;

    invoke-direct {v3, v4}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v4, Lc11/k;

    sget-object v5, Lc11/m;->OLDER_4:Lc11/m;

    invoke-direct {v4, v5}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v5, Lc11/k;

    sget-object v6, Lc11/m;->NEUTRAL:Lc11/m;

    invoke-direct {v5, v6}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v7, Lc11/k;

    invoke-direct {v7, v6}, Lc11/k;-><init>(Lc11/m;)V

    move-object v6, v7

    new-instance v7, Lc11/k;

    sget-object v8, Lc11/m;->YOUNGER_4:Lc11/m;

    invoke-direct {v7, v8}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v8, Lc11/k;

    sget-object v9, Lc11/m;->YOUNGER_3:Lc11/m;

    invoke-direct {v8, v9}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v9, Lc11/k;

    sget-object v10, Lc11/m;->YOUNGER_2:Lc11/m;

    invoke-direct {v9, v10}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v10, Lc11/k;

    sget-object v12, Lc11/m;->YOUNGER_1:Lc11/m;

    invoke-direct {v10, v12}, Lc11/k;-><init>(Lc11/m;)V

    filled-new-array/range {v1 .. v10}, [Lc11/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "0%"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "100%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v6, Lc11/l;

    const-string v3, "68"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const-string v3, "%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v18, Lc11/o;->ENABLED:Lc11/o;

    const-string v3, "6 Month avg."

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const-wide v16, 0x3fe5c28f5c28f5c3L    # 0.68

    move-object v13, v6

    invoke-direct/range {v13 .. v19}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    const-string v3, "+0.1"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v3, "years"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v9, Lc11/n;->NEUTRAL:Lc11/n;

    new-instance v16, Lc11/l;

    const-string v3, "0.39"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const-string v3, "h"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v5, "30 Day avg."

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const-wide v19, 0x3fdccccccccccccdL    # 0.45

    move-object/from16 v21, v18

    move-object/from16 v18, v3

    invoke-direct/range {v16 .. v22}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v3, v5, v3}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v3

    move-object v5, v12

    move-object v12, v3

    move-object v3, v11

    sget-object v11, Lm83/y;->w:Lm83/y;

    move-object/from16 v10, v16

    invoke-direct/range {v0 .. v12}, Lc11/i;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lc11/m;Lcom/whoop/design/util/TextResource;Lc11/m;Lc11/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc11/n;Lc11/l;Ljava/util/List;Lm91/p;)V

    sput-object v0, Llk1/b;->a:Lc11/i;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llk1/b;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lz1/p;ILik1/e;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llk1/b;->f(Lz1/p;ILik1/e;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lik1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llk1/b;->g(Lik1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lik1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik1/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x1681db59

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_4
    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v4, v6, :cond_5

    move v4, v9

    goto :goto_4

    :cond_5
    move v4, v8

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v5, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_14

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_6

    new-instance v2, Llive/hms/video/media/capturers/camera/utils/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, v2

    goto :goto_5

    :cond_7
    move-object v4, p1

    :goto_5
    invoke-virtual {p0}, Lik1/e;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_8

    if-ne v3, v10, :cond_b

    :cond_8
    new-instance v3, Lz1/p;

    invoke-direct {v3}, Lz1/p;-><init>()V

    invoke-virtual {p0}, Lik1/e;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v8

    :goto_6
    if-ge v7, v2, :cond_a

    invoke-virtual {p0}, Lik1/e;->c()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v11

    if-ge v7, v11, :cond_9

    move v11, v9

    goto :goto_7

    :cond_9
    move v11, v8

    :goto_7
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_a
    invoke-virtual {v3, v6}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v11, v3

    check-cast v11, Lz1/p;

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x3

    int-to-float v3, v3

    int-to-float v1, v1

    invoke-static {v2, v3, v1}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    invoke-static {v2, v3}, Li91/c;->o(J)Li91/a;

    move-result-object v2

    invoke-static {v1, v2}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v5, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x3dc4bc8c

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lik1/e;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move v1, v8

    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v13, v1, 0x1

    if-ltz v1, :cond_12

    check-cast v2, Lc11/p;

    if-ltz v1, :cond_f

    invoke-virtual {v11}, Lz1/p;->size()I

    move-result v3

    if-ge v1, v3, :cond_f

    invoke-virtual {v11, v1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    goto :goto_a

    :cond_f
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_a
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v1}, Lp1/q;->e(I)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_10

    if-ne v7, v10, :cond_11

    :cond_10
    new-instance v7, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/4 v6, 0x4

    invoke-direct {v7, v11, v1, p0, v6}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v1, Lc11/p;->f:I

    shl-int/lit8 v6, v0, 0x6

    and-int/lit16 v6, v6, 0x1c00

    or-int/2addr v6, v1

    move-object v1, v2

    move v2, v3

    move-object v3, v7

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lc11/h;->v(Lc11/p;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v1, v13

    goto :goto_9

    :cond_12
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_13
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    move-object v3, v4

    goto :goto_b

    :cond_14
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, p1

    :goto_b
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v0, Lio2/k0;

    const/16 v5, 0x1d

    move-object v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lz1/p;ILik1/e;Z)Ll83/a0;
    .locals 0

    invoke-virtual {p2}, Lik1/e;->c()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Llk1/b;->h(Ljava/util/List;IZI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lik1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Llk1/b;->d(Lik1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ljava/util/List;IZI)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;IZI)V"
        }
    .end annotation

    if-ltz p1, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    const/4 v0, 0x1

    sub-int/2addr p3, v0

    const/4 v1, 0x0

    if-ne p1, p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    if-nez p2, :cond_1

    if-nez p3, :cond_1

    move v1, v0

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p0, p1, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-lez p1, :cond_2

    sub-int/2addr p1, v0

    xor-int/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
