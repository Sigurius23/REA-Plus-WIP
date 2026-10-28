.class public abstract Lmi2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u001c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lji2/l;",
        "parentViewState",
        "Lkotlin/Function1;",
        "Lji2/i;",
        "Ll83/a0;",
        "onViewEvent",
        "y",
        "(Lji2/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lji2/e;",
        "viewState",
        "q",
        "(Lji2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lji2/c;",
        "selectableActivity",
        "m",
        "(Lji2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "a",
        "Ljava/util/List;",
        "displayActivities",
        "strava_release"
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
.field private static a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lji2/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    sput-object v0, Lmi2/c;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Lji2/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lmi2/c;->y(Lji2/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic B(Lji2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmi2/c;->m(Lji2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lji2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmi2/c;->w(Lkotlin/jvm/functions/Function1;Lji2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmi2/c;->v(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lji2/e;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmi2/c;->s(Lkotlin/jvm/functions/Function1;Lji2/e;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lji2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmi2/c;->p(Lji2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lji2/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmi2/c;->x(Lji2/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lji2/c;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmi2/c;->o(Lkotlin/jvm/functions/Function1;Lji2/c;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmi2/c;->z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lji2/e;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmi2/c;->t(Lkotlin/jvm/functions/Function1;Lji2/e;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lji2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmi2/c;->u(Lkotlin/jvm/functions/Function1;Lji2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lmi2/c;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lji2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmi2/c;->n(Lkotlin/jvm/functions/Function1;Lji2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lji2/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmi2/c;->A(Lji2/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lji2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lji2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v3, 0x2f949c1b

    invoke-virtual {v6, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v14, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v14

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    const/16 v15, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v15

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    move/from16 v16, v3

    and-int/lit8 v3, v16, 0x13

    const/16 v4, 0x12

    const/16 v17, 0x0

    const/4 v5, 0x1

    if-eq v3, v4, :cond_5

    move v3, v5

    goto :goto_4

    :cond_5
    move/from16 v3, v17

    :goto_4
    and-int/lit8 v7, v16, 0x1

    invoke-virtual {v6, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_13

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    new-instance v19, Lj0/j;

    invoke-direct/range {v19 .. v19}, Lj0/j;-><init>()V

    new-instance v7, Li3/i;

    invoke-direct {v7, v5}, Li3/i;-><init>(I)V

    and-int/lit8 v8, v16, 0x70

    if-ne v8, v15, :cond_6

    move v9, v5

    goto :goto_5

    :cond_6
    move/from16 v9, v17

    :goto_5
    and-int/lit8 v10, v16, 0xe

    if-eq v10, v14, :cond_8

    and-int/lit8 v11, v16, 0x8

    if-eqz v11, :cond_7

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_6

    :cond_7
    move/from16 v11, v17

    goto :goto_7

    :cond_8
    :goto_6
    move v11, v5

    :goto_7
    or-int/2addr v9, v11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_9

    if-ne v11, v12, :cond_a

    :cond_9
    new-instance v11, Ll01/q;

    const/16 v9, 0x1d

    invoke-direct {v11, v1, v0, v9}, Ll01/q;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v6, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v23, v11

    check-cast v23, Lc93/a;

    const/16 v24, 0x8

    const/16 v20, 0x0

    const/16 v21, 0x1

    move-object/from16 v22, v7

    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v11, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v11, v9, v6, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v6, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v6, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v6, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-nez v9, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    invoke-static {v4, v6, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v7, v5

    mul-float/2addr v4, v7

    invoke-static {v3, v4}, Lmi2/l;->z(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v19

    invoke-virtual {v0}, Lji2/c;->h()Z

    move-result v20

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v9, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->w()J

    move-result-wide v21

    invoke-virtual {v9, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v23

    invoke-virtual {v9, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v25

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/16 v13, 0x18

    move-object/from16 v29, v9

    move/from16 v28, v10

    const-wide/16 v9, 0x0

    move/from16 v30, v4

    move/from16 v18, v7

    move v14, v8

    move/from16 v32, v11

    move-wide/from16 v7, v21

    move-object/from16 v1, v27

    move/from16 v2, v28

    move-object/from16 v31, v29

    const/16 v21, 0x12

    move/from16 v22, v5

    move-object v11, v6

    move-wide/from16 v5, v25

    move-wide/from16 v33, v23

    move-object/from16 v23, v3

    move-wide/from16 v3, v33

    invoke-static/range {v3 .. v13}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v7

    move-object v6, v11

    if-ne v14, v15, :cond_e

    const/4 v5, 0x1

    :goto_9
    const/4 v3, 0x4

    goto :goto_a

    :cond_e
    move/from16 v5, v17

    goto :goto_9

    :goto_a
    if-eq v2, v3, :cond_f

    and-int/lit8 v2, v16, 0x8

    if-eqz v2, :cond_10

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    :cond_f
    const/16 v17, 0x1

    :cond_10
    or-int v2, v5, v17

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_12

    if-ne v3, v1, :cond_11

    goto :goto_b

    :cond_11
    move-object/from16 v2, p1

    goto :goto_c

    :cond_12
    :goto_b
    new-instance v3, Llq0/d;

    const/16 v1, 0xb

    move-object/from16 v2, p1

    invoke-direct {v3, v1, v2, v0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    const/16 v10, 0x18

    move-object v8, v6

    const/4 v6, 0x0

    move-object/from16 v5, v19

    move/from16 v3, v20

    invoke-static/range {v3 .. v10}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    invoke-virtual {v0}, Lji2/c;->c()Lkd1/o;

    move-result-object v3

    sget v7, Lkd1/o;->a:I

    const/4 v8, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float v10, v1, v18

    const/4 v11, 0x0

    const/16 v12, 0xb

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, v23

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v13, v7

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float v4, v4, v18

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v1, v31

    move/from16 v14, v32

    invoke-virtual {v1, v6, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v7

    new-instance v9, Li2/p;

    const/4 v4, 0x5

    invoke-direct {v9, v7, v8, v4}, Li2/p;-><init>(JI)V

    invoke-virtual {v0}, Lji2/c;->e()Ljava/lang/String;

    move-result-object v4

    const/16 v11, 0x6180

    const/16 v12, 0x28

    move-object v8, v6

    const/4 v6, 0x0

    sget-object v7, Ly2/j;->c:Ly2/b1;

    move-object/from16 v25, v8

    const/4 v8, 0x0

    move-object/from16 v10, v25

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    move/from16 v4, v30

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lji2/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v6, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v6, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v1, v6, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->i()Lb91/a;

    move-result-object v23

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v27, v1, 0x12

    const v28, 0x2fffa

    move-object v8, v6

    move-wide v5, v4

    const/4 v4, 0x0

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    const/4 v11, 0x1

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_13
    move-object v2, v1

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_14

    new-instance v3, Lkl2/f;

    const/16 v4, 0x18

    move/from16 v5, p3

    invoke-direct {v3, v0, v2, v5, v4}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v1, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lji2/c;)Ll83/a0;
    .locals 2

    new-instance v0, Lji2/i$i;

    invoke-virtual {p1}, Lji2/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lji2/c;->h()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {v0, v1, p1}, Lji2/i$i;-><init>(Ljava/lang/String;Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lji2/c;Z)Ll83/a0;
    .locals 1

    new-instance v0, Lji2/i$i;

    invoke-virtual {p1}, Lji2/c;->e()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lji2/i$i;-><init>(Ljava/lang/String;Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lji2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lmi2/c;->m(Lji2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lji2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lji2/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, 0x67837b0

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_4

    move v6, v10

    goto :goto_3

    :cond_4
    move v6, v9

    :goto_3
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v12, v11, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v14, v5, v6

    const/4 v15, 0x0

    const/16 v18, 0x2

    sget-object v13, Lb2/t;->w:Lb2/t;

    move/from16 v16, v14

    move/from16 v17, v14

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v15, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-eqz v4, :cond_5

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v8, v12, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v4, v10

    mul-float/2addr v4, v6

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v12, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lji2/e;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v12, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const/16 v16, 0x0

    const/16 v18, 0x7

    move/from16 v17, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move v11, v4

    invoke-virtual {v0}, Lji2/e;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lji2/e;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v7, :cond_8

    move v15, v10

    goto :goto_5

    :cond_8
    const/4 v15, 0x0

    :goto_5
    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move/from16 v17, v6

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v15, :cond_9

    if-ne v7, v6, :cond_a

    :cond_9
    new-instance v7, La23/c;

    const/4 v15, 0x4

    invoke-direct {v7, v1, v5, v15}, La23/c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v5, v8, 0x3

    or-int/lit8 v5, v5, 0x6

    shl-int/lit8 v15, v8, 0x6

    or-int v21, v5, v15

    const/16 v22, 0x0

    const/16 v23, 0x3ff8

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    move v15, v8

    const/16 v18, 0x0

    const-wide/16 v7, 0x0

    move/from16 v20, v3

    move-object v3, v9

    const/4 v9, 0x0

    move/from16 v24, v10

    const/4 v10, 0x0

    move/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v27, v13

    move/from16 v26, v20

    move-object/from16 v20, v12

    const-wide/16 v12, 0x0

    move-object/from16 v28, v5

    move-object v5, v14

    const/4 v14, 0x0

    move/from16 v29, v15

    const/4 v15, 0x0

    const/16 v30, 0x20

    const/16 v16, 0x0

    move/from16 v31, v17

    const/16 v17, 0x0

    move/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v1, v25

    move/from16 v33, v26

    move-object/from16 v2, v27

    move-object/from16 v34, v28

    move/from16 v0, v29

    const/16 v24, 0x12

    invoke-static/range {v3 .. v23}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v20

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v12, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lji2/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    invoke-virtual {v4, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v27, v8, 0x12

    const v28, 0x2fffa

    move-object v8, v4

    const/4 v4, 0x0

    move-wide v9, v6

    move-object v6, v8

    const-wide/16 v7, 0x0

    move v11, v5

    move-wide/from16 v38, v9

    move-object v10, v6

    move-wide/from16 v5, v38

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object v15, v13

    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move-object/from16 v18, v17

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 p2, v1

    move-object/from16 v1, v29

    move/from16 v36, v30

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v25

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    move/from16 v15, v31

    invoke-static {v3, v15, v2, v12}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v4, v3

    const-wide/16 v6, 0x0

    cmpl-double v4, v4, v6

    if-lez v4, :cond_b

    goto :goto_6

    :cond_b
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static/range {p2 .. p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    move/from16 v7, v33

    const/16 v8, 0x20

    if-ne v7, v8, :cond_c

    move v9, v5

    :goto_7
    move-object/from16 v10, p0

    goto :goto_8

    :cond_c
    const/4 v9, 0x0

    goto :goto_7

    :goto_8
    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_e

    move-object/from16 v9, v34

    if-ne v11, v9, :cond_d

    goto :goto_9

    :cond_d
    move-object/from16 v14, p1

    goto :goto_a

    :cond_e
    move-object/from16 v9, v34

    :goto_9
    new-instance v11, Llq0/d;

    const/16 v13, 0xc

    move-object/from16 v14, p1

    invoke-direct {v11, v13, v14, v10}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/16 v13, 0x6000

    const/16 v14, 0x1ee

    move/from16 v16, v3

    move-object v3, v4

    const/4 v4, 0x0

    move/from16 v35, v5

    const/4 v5, 0x0

    move/from16 v33, v7

    const/4 v7, 0x0

    move/from16 v30, v8

    const/4 v8, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v17, v15

    move/from16 v15, v16

    move-object/from16 v37, v28

    move/from16 v20, v33

    invoke-static/range {v3 .. v14}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v3, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v12}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v3

    iget-object v3, v3, Ll0/c2;->c:Ll0/b;

    iget-object v3, v3, Ll0/b;->d:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v12}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_12

    const v3, 0x33f4e88b

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    sget-object v4, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lji2/e;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float v8, v0, v17

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v14, v36

    invoke-virtual {v1, v12, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a()J

    move-result-wide v7

    move/from16 v0, v20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_f

    const/4 v9, 0x1

    :goto_b
    move-object/from16 v0, p0

    goto :goto_c

    :cond_f
    const/4 v9, 0x0

    goto :goto_b

    :goto_c
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_11

    move-object/from16 v9, v37

    if-ne v2, v9, :cond_10

    goto :goto_d

    :cond_10
    move-object/from16 v1, p1

    const/4 v15, 0x0

    goto :goto_e

    :cond_11
    :goto_d
    new-instance v2, Lmi2/b;

    move-object/from16 v1, p1

    const/4 v15, 0x0

    invoke-direct {v2, v1, v0, v15}, Lmi2/b;-><init>(Lkotlin/jvm/functions/Function1;Lji2/e;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    move-object v11, v2

    check-cast v11, Lc93/a;

    const/16 v13, 0x36

    const/16 v14, 0x68

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v14}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v5, 0x1

    goto :goto_10

    :cond_12
    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x340362dc

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_13
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_14

    new-instance v3, Lkl2/f;

    const/16 v4, 0x19

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lhy0/x0$a;

    if-eqz v0, :cond_0

    new-instance p1, Lji2/i$g;

    const-string p2, ""

    invoke-direct {p1, p2}, Lji2/i$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lhy0/x0$c;

    if-eqz v0, :cond_1

    check-cast p2, Lhy0/x0$c;

    invoke-virtual {p2}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Lji2/i$g;

    invoke-virtual {p2}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lji2/i$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Lji2/e;Ln0/q;)Ll83/a0;
    .locals 7

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lih1/f;

    const/16 v1, 0x17

    invoke-direct {v0, p0, p1, v1}, Lih1/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, 0x18b3a07b

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x3

    const/4 v3, 0x0

    invoke-static {p2, v3, v1, v0}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object v0, Lmi2/c;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lji2/c;

    invoke-virtual {v5}, Lji2/c;->g()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v4, Lmi2/c$a;

    invoke-direct {v4, v1}, Lmi2/c$a;-><init>(Ljava/util/List;)V

    new-instance v5, Lmi2/c$b;

    invoke-direct {v5, v1, p1, p0}, Lmi2/c$b;-><init>(Ljava/util/List;Lji2/e;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lx1/b;

    const v6, 0x799532c4

    invoke-direct {v1, v5, v2, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Ln0/f;

    invoke-virtual {p2, v0, v3, v4, v1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object v0, Lmi2/c;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lji2/c;

    invoke-virtual {v5}, Lji2/c;->g()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v4, Lmi2/c$c;

    invoke-direct {v4, v1}, Lmi2/c$c;-><init>(Ljava/util/List;)V

    new-instance v5, Lmi2/c$d;

    invoke-direct {v5, v1, p1, p0}, Lmi2/c$d;-><init>(Ljava/util/List;Lji2/e;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    invoke-direct {p0, v5, v2, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p2, v0, v3, v4, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Lji2/e;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$item"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x11

    const/16 v3, 0x10

    const/4 v4, 0x1

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p4, 0x1

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v4}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v3, v12, :cond_1

    invoke-static {v13}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v3

    :cond_1
    move-object v6, v3

    check-cast v6, Lj0/i;

    new-instance v9, Li3/i;

    invoke-direct {v9, v4}, Li3/i;-><init>(I)V

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_2

    if-ne v7, v12, :cond_3

    :cond_2
    new-instance v7, Lmi2/b;

    const/4 v3, 0x1

    invoke-direct {v7, v0, v1, v3}, Lmi2/b;-><init>(Lkotlin/jvm/functions/Function1;Lji2/e;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v10, v7

    check-cast v10, Lc93/a;

    const/16 v11, 0x8

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v5, v13, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v13, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, v13, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v2, v3}, Lmi2/l;->z(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lji2/e;->b()Z

    move-result v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->w()J

    move-result-wide v9

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v14

    move-object v11, v5

    move-wide/from16 v31, v14

    move v15, v6

    move-wide v5, v7

    move-wide/from16 v7, v31

    const/4 v14, 0x0

    move/from16 v16, v15

    const/16 v15, 0x18

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    const-wide/16 v11, 0x0

    move-object/from16 p3, v2

    move/from16 v1, v16

    move-object/from16 v4, v17

    move-object/from16 v2, v18

    invoke-static/range {v5 .. v15}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v9

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_7

    if-ne v6, v2, :cond_8

    :cond_7
    new-instance v6, Ll80/k;

    const/16 v2, 0x16

    invoke-direct {v6, v0, v2}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/16 v12, 0x18

    const/4 v8, 0x0

    move-object/from16 v7, p3

    move v5, v3

    move-object v10, v13

    invoke-static/range {v5 .. v12}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p1 .. p1}, Lji2/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v4, v13, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->k()Lb91/a;

    move-result-object v25

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v27, v13

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

    move-object/from16 v13, v27

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_9
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lji2/e;)Ll83/a0;
    .locals 1

    new-instance v0, Lji2/i$h;

    invoke-virtual {p1}, Lji2/e;->b()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {v0, p1}, Lji2/i$h;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    new-instance v0, Lji2/i$h;

    invoke-direct {v0, p1}, Lji2/i$h;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lji2/e;)Ll83/a0;
    .locals 8

    new-instance v0, Lji2/i$k;

    new-instance v1, Lji2/m;

    invoke-virtual {p1}, Lji2/e;->b()Z

    move-result v3

    invoke-virtual {p1}, Lji2/e;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lji2/e;->a()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {p1}, Lji2/e;->d()Z

    move-result v7

    const/4 v2, 0x1

    invoke-direct/range {v1 .. v7}, Lji2/m;-><init>(ZZLjava/lang/String;Ljava/util/List;ZZ)V

    invoke-direct {v0, v1}, Lji2/i$k;-><init>(Lji2/m;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lji2/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lmi2/c;->q(Lji2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Lji2/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lji2/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "parentViewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v3, 0x72a532b2

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v4, v6, :cond_4

    move v4, v14

    goto :goto_3

    :cond_4
    move v4, v13

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v10, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-virtual {v0}, Lji2/l;->b()Lji2/e;

    move-result-object v15

    if-nez v15, :cond_5

    const v3, 0x6649a81c

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_5
    const v4, 0x6649a81d

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v10, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb3/x2;

    invoke-virtual {v15}, Lji2/e;->f()Z

    move-result v6

    if-nez v6, :cond_6

    if-eqz v4, :cond_6

    check-cast v4, Lb3/x1;

    invoke-virtual {v4}, Lb3/x1;->a()V

    :cond_6
    const v4, 0x5e2381bc

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lji2/e;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lji2/c;

    invoke-virtual {v8}, Lji2/c;->f()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15}, Lji2/e;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v10, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v14}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    sput-object v6, Lmi2/c;->a:Ljava/util/List;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->o()J

    move-result-wide v11

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v11, v12, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-eqz v5, :cond_9

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v10, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v10, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v11, v10, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    move/from16 v17, v3

    const/4 v3, 0x0

    invoke-static {v11, v13, v10, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v10, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    :cond_d
    invoke-static {v2, v10, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v18, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v15}, Lji2/e;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-static {v8}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v21

    sget v2, Ldi2/a;->d:I

    invoke-static {v10, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v22

    const v35, 0xfff2

    const/16 v36, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v18 .. v36}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v2, v17, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_f

    const/4 v3, 0x1

    goto :goto_7

    :cond_f
    const/4 v3, 0x0

    :goto_7
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_10

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_11

    :cond_10
    new-instance v5, Lmf2/e;

    const/4 v3, 0x2

    invoke-direct {v5, v1, v3}, Lmf2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v7, v5

    check-cast v7, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v11, v3, 0x3

    const/16 v12, 0x34

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v5, v18

    invoke-static/range {v4 .. v12}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v1, v10, v2}, Lmi2/c;->q(Lji2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v10, v2, v2, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_8

    :cond_12
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_13

    new-instance v3, Lmi2/a;

    const/4 v4, 0x0

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lmi2/a;-><init>(Lji2/l;Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 7

    new-instance v0, Lji2/i$f;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v6}, Lji2/i$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
