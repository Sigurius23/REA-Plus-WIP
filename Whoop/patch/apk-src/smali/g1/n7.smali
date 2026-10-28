.class public Lg1/n7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld0/l;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lp1/k1;

.field public final d:Lp1/k1;

.field public final e:Lp1/g1;

.field public final f:Lp1/g1;

.field public final g:Lp1/g1;

.field public final h:Lp1/k1;

.field public final i:Lp1/k1;

.field public final j:Lch/i;

.field public k:F

.field public l:F

.field public final m:Lp1/k1;

.field public final n:Lp1/g1;

.field public final o:Lp1/k1;

.field public final p:Lh0/z;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 27
    sget-object v0, Lg1/d7;->a:Ld0/i1;

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    .line 28
    new-instance p2, Lgm1/b;

    const/16 p3, 0x1a

    invoke-direct {p2, p3}, Lgm1/b;-><init>(I)V

    .line 29
    :cond_0
    invoke-direct {p0, p1, p2}, Lg1/n7;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    sget-object v0, Lg1/d7;->a:Ld0/i1;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v0, p0, Lg1/n7;->a:Ld0/l;

    .line 3
    iput-object p2, p0, Lg1/n7;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lg1/n7;->c:Lp1/k1;

    .line 5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lg1/n7;->d:Lp1/k1;

    .line 6
    new-instance p1, Lp1/g1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    .line 7
    iput-object p1, p0, Lg1/n7;->e:Lp1/g1;

    .line 8
    new-instance p1, Lp1/g1;

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    .line 9
    iput-object p1, p0, Lg1/n7;->f:Lp1/g1;

    .line 10
    new-instance p1, Lp1/g1;

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    .line 11
    iput-object p1, p0, Lg1/n7;->g:Lp1/g1;

    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lg1/n7;->h:Lp1/k1;

    .line 13
    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lg1/n7;->i:Lp1/k1;

    .line 14
    new-instance v0, La6/l0;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v0

    .line 15
    new-instance v1, La6/u;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    .line 16
    new-instance v0, Lch/i;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lch/i;-><init>(Lec3/l;I)V

    .line 17
    iput-object v0, p0, Lg1/n7;->j:Lch/i;

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 18
    iput v0, p0, Lg1/n7;->k:F

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 19
    iput v0, p0, Lg1/n7;->l:F

    .line 20
    new-instance v0, Lfq0/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lfq0/a;-><init>(I)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lg1/n7;->m:Lp1/k1;

    .line 21
    new-instance v0, Lp1/g1;

    invoke-direct {v0, p2}, Lp1/g1;-><init>(F)V

    .line 22
    iput-object v0, p0, Lg1/n7;->n:Lp1/g1;

    .line 23
    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lg1/n7;->o:Lp1/k1;

    .line 24
    new-instance p1, La6/i;

    const/16 p2, 0xe

    invoke-direct {p1, p0, p2}, La6/i;-><init>(Ljava/lang/Object;I)V

    sget-object p2, Lh0/k1;->a:Lh0/j1;

    .line 25
    new-instance p2, Lh0/z;

    invoke-direct {p2, p1}, Lh0/z;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 26
    iput-object p2, p0, Lg1/n7;->p:Lh0/z;

    return-void
.end method


# virtual methods
.method public final a(FLd0/l;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v0, Lg1/h7;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lg1/h7;-><init>(Ljava/lang/Object;FLd0/l;Lq83/d;I)V

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    iget-object p2, v1, Lg1/n7;->p:Lh0/z;

    invoke-virtual {p2, p1, v0, p3}, Lh0/z;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Ljava/util/Map;Ljava/util/Map;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lg1/k7;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lg1/k7;

    iget v1, v0, Lg1/k7;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg1/k7;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg1/k7;

    invoke-direct {v0, p0, p3}, Lg1/k7;-><init>(Lg1/n7;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lg1/k7;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg1/k7;->E:I

    iget-object v3, p0, Lg1/n7;->p:Lh0/z;

    const/4 v4, 0x0

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v8, :cond_3

    if-eq v2, v7, :cond_2

    if-ne v2, v6, :cond_1

    iget p1, v0, Lg1/k7;->x:F

    iget-object p2, v0, Lg1/k7;->w:Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception p3

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lg1/k7;->x:F

    iget-object p2, v0, Lg1/k7;->w:Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_5

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v5

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p3

    iget-object v2, p0, Lg1/n7;->c:Lp1/k1;

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->Y0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lg1/n7;->k:F

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->U0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lg1/n7;->l:F

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, Lj93/l0;->g(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput v8, v0, Lg1/k7;->E:I

    new-instance p2, Lg1/l7;

    invoke-direct {p2, p1, p0, v4}, Lg1/l7;-><init>(FLg1/n7;Lq83/d;)V

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {v3, p1, p2, v0}, Lh0/z;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_1

    :cond_5
    move-object p1, v5

    :goto_1
    if-ne p1, v1, :cond_17

    goto/16 :goto_8

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must have an associated anchor."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_17

    const/high16 p3, -0x800000    # Float.NEGATIVE_INFINITY

    iput p3, p0, Lg1/n7;->k:F

    const/high16 p3, 0x7f800000    # Float.POSITIVE_INFINITY

    iput p3, p0, Lg1/n7;->l:F

    iget-object p3, p0, Lg1/n7;->h:Lp1/k1;

    invoke-virtual {p3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    if-eqz p3, :cond_d

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, Lj93/l0;->g(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto/16 :goto_4

    :cond_8
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_9

    move-object p1, v4

    goto :goto_2

    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_2

    :cond_a
    move-object v2, p1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v9

    sub-float/2addr v2, v9

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    :cond_b
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v11

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    invoke-static {v2, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v11

    if-lez v11, :cond_c

    move-object p1, v9

    move v2, v10

    :cond_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_b

    :goto_2
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    goto/16 :goto_4

    :cond_d
    iget-object p3, p0, Lg1/n7;->e:Lp1/g1;

    invoke-interface {p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_e
    invoke-static {p1, p2}, Lj93/l0;->g(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_4

    :cond_f
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_10

    move-object v2, v4

    goto :goto_3

    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_11

    goto :goto_3

    :cond_11
    move-object v8, v2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-interface {p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    sub-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    :cond_12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    invoke-interface {p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    move-result v11

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v11

    if-lez v11, :cond_13

    move-object v2, v9

    move v8, v10

    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_12

    :goto_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p1

    :goto_4
    :try_start_2
    iget-object p3, p0, Lg1/n7;->a:Ld0/l;

    move-object v2, p2

    check-cast v2, Ljava/util/Map;

    iput-object v2, v0, Lg1/k7;->w:Ljava/util/Map;

    iput p1, v0, Lg1/k7;->x:F

    iput v7, v0, Lg1/k7;->E:I

    invoke-virtual {p0, p1, p3, v0}, Lg1/n7;->a(FLd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p3, v1, :cond_14

    goto :goto_8

    :cond_14
    :goto_5
    new-instance p3, Ljava/lang/Float;

    invoke-direct {p3, p1}, Ljava/lang/Float;-><init>(F)V

    :goto_6
    invoke-static {p3, p2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg1/n7;->c(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->Y0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lg1/n7;->k:F

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->U0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lg1/n7;->l:F

    return-object v5

    :catch_0
    :try_start_3
    move-object p3, p2

    check-cast p3, Ljava/util/Map;

    iput-object p3, v0, Lg1/k7;->w:Ljava/util/Map;

    iput p1, v0, Lg1/k7;->x:F

    iput v6, v0, Lg1/k7;->E:I

    new-instance p3, Lg1/l7;

    invoke-direct {p3, p1, p0, v4}, Lg1/l7;-><init>(FLg1/n7;Lq83/d;)V

    sget-object v2, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {v3, v2, p3, v0}, Lh0/z;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Lr83/a;->w:Lr83/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p3, v0, :cond_15

    goto :goto_7

    :cond_15
    move-object p3, v5

    :goto_7
    if-ne p3, v1, :cond_16

    :goto_8
    return-object v1

    :cond_16
    :goto_9
    new-instance p3, Ljava/lang/Float;

    invoke-direct {p3, p1}, Ljava/lang/Float;-><init>(F)V

    goto :goto_6

    :goto_a
    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    invoke-static {v0, p2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg1/n7;->c(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->Y0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lg1/n7;->k:F

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->U0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lg1/n7;->l:F

    throw p3

    :cond_17
    return-object v5
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lg1/n7;->c:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
