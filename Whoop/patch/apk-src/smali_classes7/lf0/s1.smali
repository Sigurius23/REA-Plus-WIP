.class public abstract Llf0/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\n\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u000f\u001a\'\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u0017\u0010\u001d\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f\u00b2\u0006\u0012\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llf0/t1;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Le81/f0;",
        "pieChart",
        "",
        "Le81/h0;",
        "n",
        "(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "j",
        "m",
        "Li2/x;",
        "from",
        "to",
        "",
        "f",
        "i",
        "(JJF)J",
        "a",
        "Llf0/t1;",
        "getFakePromotionalBiomarkerPieChartState",
        "()Llf0/t1;",
        "fakePromotionalBiomarkerPieChartState",
        "smoothSlices",
        "advanced-labs_release"
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
.field private static final a:Llf0/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Llf0/t1;

    new-instance v1, Le81/f0;

    sget-object v2, Le81/b;->a:Le81/b;

    const/16 v3, 0x3c

    invoke-virtual {v2, v3}, Le81/b;->b(I)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v2, "empty_pie_chart"

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Le81/f0;-><init>(Ljava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "ADVANCED LABS"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v2, "VIEW BIOMARKERS"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v6, Lcom/whoop/navigation/e;

    sget-object v7, Lcom/whoop/navigation/AppScreen$y2;->w:Lcom/whoop/navigation/AppScreen$y2;

    new-instance v8, Lcom/whoop/navigation/InAppBrowserScreenModel;

    const-string v2, "https://app.whoop.com/fake/inapp"

    invoke-direct {v8, v2}, Lcom/whoop/navigation/InAppBrowserScreenModel;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    const-string v1, "promotional_biomarker_pie_chart_1"

    invoke-direct/range {v0 .. v6}, Llf0/t1;-><init>(Ljava/lang/String;Le81/f0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V

    sput-object v0, Llf0/s1;->a:Llf0/t1;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Llf0/t1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/s1;->h(Landroidx/compose/ui/Modifier;Llf0/t1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llf0/s1;->f(Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ld0/e;Ljava/util/List;J)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llf0/s1;->k(Ld0/e;Ljava/util/List;J)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Llf0/s1;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llf0/t1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x41d91820

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

    if-nez v8, :cond_5

    and-int/lit8 v8, v1, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_8

    move v8, v11

    goto :goto_5

    :cond_8
    move v8, v10

    :goto_5
    and-int/2addr v7, v11

    invoke-virtual {v0, v7, v8}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_13

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_9

    move-object v4, v7

    :cond_9
    invoke-virtual {v5}, Llf0/t1;->e()Le81/f0;

    move-result-object v2

    invoke-virtual {v2}, Le81/f0;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v8, v2, Ljava/util/Collection;

    if-eqz v8, :cond_b

    move-object v8, v2

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_b

    :cond_a
    move v2, v10

    goto :goto_7

    :cond_b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le81/j0;

    invoke-virtual {v8}, Le81/j0;->a()Le81/i0;

    move-result-object v8

    sget-object v9, Le81/i0;->NONE:Le81/i0;

    if-eq v8, v9, :cond_d

    move v8, v11

    goto :goto_6

    :cond_d
    move v8, v10

    :goto_6
    if-eqz v8, :cond_c

    move v2, v11

    :goto_7
    if-nez v2, :cond_f

    invoke-virtual {v5}, Llf0/t1;->e()Le81/f0;

    move-result-object v2

    invoke-virtual {v2}, Le81/f0;->c()Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_9

    :cond_e
    const v2, -0x317c9e14

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llf0/t1;->e()Le81/f0;

    move-result-object v2

    sget v8, Le81/f0;->d:I

    invoke-static {v2, v0, v8}, Llf0/s1;->j(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    :goto_8
    move-object v8, v2

    goto :goto_a

    :cond_f
    :goto_9
    const v2, -0x317d7f12

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llf0/t1;->e()Le81/f0;

    move-result-object v2

    sget v8, Le81/f0;->d:I

    invoke-static {v2, v0, v8}, Llf0/s1;->n(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_a
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, Ll0/m;->e:Ll0/h;

    sget-object v10, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x6

    invoke-static {v9, v10, v0, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_10

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    :cond_11
    invoke-static {v10, v0, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x3c

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v2, Lj21/d;

    const/16 v3, 0xd

    invoke-direct {v2, v3, v5, v6}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x672a7ed5

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const v17, 0x6000006

    const/16 v18, 0xfc

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v2, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v7 .. v18}, Le81/d0;->h(Landroidx/compose/ui/Modifier;Ljava/util/List;FFFFLe81/u;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_13
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Ll72/h;

    const/16 v3, 0x12

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final f(Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 47

    move-object/from16 v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    and-int/lit8 v1, p3, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    const v1, 0x46862870

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->c()Lcom/whoop/navigation/e;

    move-result-object v1

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_3

    new-instance v6, Lj0/j;

    invoke-direct {v6}, Lj0/j;-><init>()V

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v7, v2, :cond_2

    :cond_1
    new-instance v7, Lck1/l;

    const/16 v2, 0x8

    invoke-direct {v7, v0, v1, v2}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v10, v7

    check-cast v10, Lc93/a;

    const/16 v11, 0x1c

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v1, v5

    move-object v5, v0

    goto :goto_1

    :cond_3
    move-object v1, v5

    :goto_1
    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    int-to-float v0, v3

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v10, v0, v2

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v12, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v12, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, v12, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x18

    int-to-float v0, v0

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v0, v7

    const-wide/high16 v8, 0x4016000000000000L    # 5.5

    double-to-float v8, v8

    mul-float/2addr v8, v7

    invoke-static {v1, v0, v8}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x0

    const/4 v11, 0x7

    move v8, v7

    const/4 v7, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v28, v6

    move-object v6, v0

    move-object/from16 v0, v28

    move/from16 v28, v16

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object v6, v5

    move/from16 v29, v10

    new-instance v5, Lkd1/o$a;

    sget v7, Lgy0/a;->Q4:I

    invoke-direct {v5, v7}, Lkd1/o$a;-><init>(I)V

    sget v9, Lkd1/o$a;->c:I

    const/4 v10, 0x3

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v46, v12

    move-object v12, v8

    move-object/from16 v8, v46

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object/from16 v24, v8

    move-object v6, v13

    const/16 v13, 0x61b0

    move-object v7, v14

    const/16 v14, 0x68

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    sget-object v9, Ly2/j;->b:Ly2/b1;

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v17, v7

    move-object v7, v11

    const/4 v11, 0x0

    move-object/from16 v32, v12

    move-object/from16 v30, v16

    move-object/from16 v31, v17

    move-object/from16 v12, v24

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v11, 0x3

    int-to-float v13, v11

    mul-float v9, v13, v2

    const/4 v10, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v1

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v16

    invoke-virtual {v8, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    new-instance v14, Lw3/k;

    invoke-direct {v14, v11}, Lw3/k;-><init>(I)V

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v10, v10, 0x12

    const/high16 v18, 0xc00000

    or-int v26, v10, v18

    const v27, 0xfdf8

    move/from16 v18, v2

    move-object v2, v6

    move v10, v7

    const-wide/16 v6, 0x0

    move-object/from16 v19, v8

    const/4 v8, 0x0

    move/from16 v20, v9

    const/4 v9, 0x0

    move/from16 v21, v10

    const/4 v10, 0x0

    move/from16 v25, v11

    const-wide/16 v11, 0x0

    move/from16 v33, v13

    const/4 v13, 0x0

    move/from16 v34, v4

    move-object/from16 v35, v5

    move-wide/from16 v4, v16

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v36, v17

    const/16 v17, 0x0

    move/from16 v37, v18

    const/16 v18, 0x0

    move-object/from16 v38, v19

    const/16 v19, 0x0

    move/from16 v39, v20

    const/16 v20, 0x0

    move/from16 v40, v21

    const/16 v21, 0x0

    move/from16 v41, v25

    const/16 v25, 0x30

    move-object v3, v1

    move/from16 v34, v33

    move-object/from16 v45, v35

    move-object/from16 v1, v38

    move/from16 v42, v40

    move-object/from16 v33, v0

    move/from16 v0, v39

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v24

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->c()Lcom/whoop/navigation/e;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->f()Lgz0/m0;

    move-result-object v2

    if-eqz v2, :cond_a

    const v2, -0x61138efa

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    move/from16 v4, v28

    move/from16 v5, v34

    move-object/from16 v6, v45

    invoke-static {v5, v4, v6, v2, v3}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v7

    mul-float v3, v3, v37

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    invoke-static/range {v29 .. v29}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v7, 0x36

    invoke-static {v5, v3, v12, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    move-object/from16 v8, v36

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_3
    move-object/from16 v8, v30

    goto :goto_4

    :cond_7
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_3

    :goto_4
    invoke-static {v12, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v31

    invoke-static {v12, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    move-object/from16 v7, v32

    goto :goto_6

    :cond_9
    :goto_5
    move-object/from16 v3, v33

    goto :goto_7

    :goto_6
    invoke-static {v5, v12, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_5

    :goto_7
    invoke-static {v12, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v10, v42

    invoke-static {v2, v12, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v12, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v1, v12, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->k()Lb91/a;

    move-result-object v22

    new-instance v14, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v14, v3}, Lw3/k;-><init>(I)V

    const/16 v25, 0x30

    const v27, 0xfdf8

    move/from16 v28, v4

    move-object/from16 v45, v6

    move-wide v4, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v3, v45

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v5, v3

    move-object/from16 v12, v24

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->f()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v12, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    invoke-virtual {v1, v12, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v8

    const-wide/high16 v0, 0x400c000000000000L    # 3.5

    double-to-float v0, v0

    mul-float v0, v0, v28

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    move-object v5, v2

    move-object/from16 v10, v24

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v12, v10

    const/4 v2, 0x1

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    move v0, v2

    goto/16 :goto_9

    :cond_a
    move/from16 v10, v42

    move-object/from16 v5, v45

    const/4 v2, 0x1

    const/4 v3, 0x3

    const/4 v4, 0x0

    const v6, -0x610022fd

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Llf0/t1;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-nez v7, :cond_b

    const v0, -0x610022fe

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    move v0, v2

    move v1, v4

    goto :goto_8

    :cond_b
    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object v6

    invoke-static {v5, v6}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v7, v12, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v12, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v1, v12, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->k()Lb91/a;

    move-result-object v22

    new-instance v14, Lw3/k;

    invoke-direct {v14, v3}, Lw3/k;-><init>(I)V

    const/16 v25, 0x0

    const v27, 0xfdf8

    move/from16 v43, v2

    move/from16 v44, v4

    move-object v3, v5

    move-object v2, v6

    move-wide v4, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v0, v43

    move/from16 v1, v44

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v24

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_c
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Llf0/t1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/s1;->e(Landroidx/compose/ui/Modifier;Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(JJF)J
    .locals 5

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p4, v0, v1}, Le93/b;->m(FFF)F

    move-result p4

    invoke-static {p0, p1}, Li2/x;->i(J)F

    move-result v0

    invoke-static {p2, p3}, Li2/x;->i(J)F

    move-result v1

    invoke-static {p0, p1}, Li2/x;->i(J)F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-static {p0, p1}, Li2/x;->h(J)F

    move-result v0

    invoke-static {p2, p3}, Li2/x;->h(J)F

    move-result v2

    invoke-static {p0, p1}, Li2/x;->h(J)F

    move-result v3

    sub-float/2addr v2, v3

    mul-float/2addr v2, p4

    add-float/2addr v2, v0

    invoke-static {p0, p1}, Li2/x;->f(J)F

    move-result v0

    invoke-static {p2, p3}, Li2/x;->f(J)F

    move-result v3

    invoke-static {p0, p1}, Li2/x;->f(J)F

    move-result v4

    sub-float/2addr v3, v4

    mul-float/2addr v3, p4

    add-float/2addr v3, v0

    invoke-static {p0, p1}, Li2/x;->e(J)F

    move-result v0

    invoke-static {p2, p3}, Li2/x;->e(J)F

    move-result p2

    invoke-static {p0, p1}, Li2/x;->e(J)F

    move-result p0

    sub-float/2addr p2, p0

    mul-float/2addr p2, p4

    add-float/2addr p2, v0

    const/16 p0, 0x10

    invoke-static {v1, v2, v3, p2, p0}, Li2/w0;->f(FFFFI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final j(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le81/f0;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Le81/h0;",
            ">;"
        }
    .end annotation

    const-string v0, "pieChart"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Le81/i0;->NONE:Le81/i0;

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, Le81/g0;->a(Le81/i0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    sget v2, Le81/f0;->d:I

    and-int/lit8 p2, p2, 0xe

    or-int/2addr p2, v2

    invoke-static {p0, p1, p2}, Llf0/s1;->m(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object p0

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne p2, v2, :cond_0

    const/4 p2, 0x0

    invoke-static {p2}, Ld0/f;->a(F)Ld0/e;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p2, Ld0/e;

    invoke-virtual {p1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1

    if-ne v4, v2, :cond_2

    :cond_1
    new-instance v4, Llf0/s1$a;

    const/4 v3, 0x0

    invoke-direct {v4, p2, p0, v3}, Llf0/s1$a;-><init>(Ld0/e;Ljava/util/List;Lq83/d;)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lc93/m;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {p1, v4, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    new-instance v2, Llf0/r1;

    invoke-direct {v2, p2, p0, v0, v1}, Llf0/r1;-><init>(Ld0/e;Ljava/util/List;J)V

    invoke-static {v2}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v3

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lp1/t2;

    invoke-static {v3}, Llf0/s1;->l(Lp1/t2;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ld0/e;Ljava/util/List;J)Ljava/util/List;
    .locals 8

    invoke-virtual {p0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    const/4 v4, 0x0

    if-ltz v1, :cond_0

    check-cast v2, Le81/h0;

    int-to-float v1, v1

    const/high16 v5, 0x3f800000    # 1.0f

    add-float v6, v1, v5

    sub-float v7, p0, v1

    sub-float/2addr v6, v1

    div-float/2addr v7, v6

    const/4 v1, 0x0

    invoke-static {v7, v1, v5}, Le93/b;->m(FFF)F

    move-result v1

    new-instance v5, Le81/h0;

    invoke-virtual {v2}, Le81/h0;->a()J

    move-result-wide v6

    invoke-static {v6, v7, p2, p3, v1}, Llf0/s1;->i(JJF)J

    move-result-wide v1

    invoke-direct {v5, v1, v2, v4}, Le81/h0;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v4

    :cond_1
    return-object v0
.end method

.method private static final l(Lp1/t2;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ljava/util/List<",
            "Le81/h0;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final m(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le81/f0;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Le81/h0;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "pieChart"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Le81/f0;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sget-object v2, Le81/i0;->OPTIMAL:Le81/i0;

    const/4 v3, 0x6

    invoke-static {v2, v0, v3}, Le81/g0;->a(Le81/i0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    sget-object v2, Le81/i0;->SUFFICIENT:Le81/i0;

    invoke-static {v2, v0, v3}, Le81/g0;->a(Le81/i0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    sget-object v2, Le81/i0;->OUT_OF_RANGE:Le81/i0;

    invoke-static {v2, v0, v3}, Le81/g0;->a(Le81/i0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    sget-object v2, Le81/i0;->NONE:Le81/i0;

    invoke-static {v2, v0, v3}, Le81/g0;->a(Le81/i0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->e(I)Z

    move-result v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_0

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v11, v10, :cond_5

    :cond_0
    const/16 v10, 0x32

    invoke-static {v10, v1}, Ljava/lang/Math;->min(II)I

    move-result v10

    sub-int v11, v1, v10

    const/16 v12, 0xa

    invoke-static {v12, v11}, Ljava/lang/Math;->min(II)I

    move-result v12

    const/4 v13, 0x5

    sub-int/2addr v11, v12

    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v1, :cond_4

    if-ge v14, v10, :cond_1

    move/from16 p0, v1

    move-wide v15, v2

    move-wide v1, v4

    goto :goto_1

    :cond_1
    add-int v15, v10, v12

    if-ge v14, v15, :cond_2

    move/from16 p0, v1

    move-wide v15, v2

    move-wide v1, v6

    goto :goto_1

    :cond_2
    add-int/2addr v15, v11

    if-ge v14, v15, :cond_3

    move/from16 p0, v1

    move-wide v15, v2

    move-wide v1, v8

    goto :goto_1

    :cond_3
    move/from16 p0, v1

    move-wide v15, v2

    move-wide v1, v15

    :goto_1
    new-instance v3, Le81/h0;

    move-wide/from16 v17, v4

    const/4 v4, 0x0

    invoke-direct {v3, v1, v2, v4}, Le81/h0;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move/from16 v1, p0

    move-wide v2, v15

    move-wide/from16 v4, v17

    goto :goto_0

    :cond_4
    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v11, v13

    :cond_5
    check-cast v11, Ljava/util/List;

    return-object v11
.end method

.method public static final n(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le81/f0;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Le81/h0;",
            ">;"
        }
    .end annotation

    const-string p2, "pieChart"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le81/f0;->e()Ljava/util/List;

    move-result-object p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_1

    :cond_0
    invoke-virtual {p0}, Le81/f0;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Ljava/util/List;

    const p0, -0xf726729

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {v0, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le81/j0;

    new-instance v2, Le81/h0;

    invoke-virtual {v0}, Le81/j0;->a()Le81/i0;

    move-result-object v0

    invoke-static {v0, p1, v1}, Le81/g0;->a(Le81/i0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Le81/h0;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0
.end method
