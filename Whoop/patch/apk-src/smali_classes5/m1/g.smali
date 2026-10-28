.class public final Lm1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lh0/l0;

.field public final b:Lc93/a;

.field public final c:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

.field public final d:Lkotlin/jvm/functions/Function1;

.field public final e:Lm1/a0;

.field public final f:Lg1/z;

.field public final g:Lp1/k1;

.field public final h:Lp1/f0;

.field public final i:Lp1/f0;

.field public final j:Lp1/g1;

.field public final k:Lp1/g1;

.field public final l:Lp1/k1;

.field public final m:Lp1/k1;

.field public final n:Lm1/f;


# direct methods
.method public constructor <init>(Ll1/x3;Lh0/l0;Lc93/a;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm1/g;->a:Lh0/l0;

    iput-object p3, p0, Lm1/g;->b:Lc93/a;

    iput-object p4, p0, Lm1/g;->c:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    iput-object p5, p0, Lm1/g;->d:Lkotlin/jvm/functions/Function1;

    new-instance p2, Lm1/a0;

    invoke-direct {p2}, Lm1/a0;-><init>()V

    iput-object p2, p0, Lm1/g;->e:Lm1/a0;

    new-instance p2, Lg1/z;

    invoke-direct {p2, p0}, Lg1/z;-><init>(Lm1/g;)V

    iput-object p2, p0, Lm1/g;->f:Lg1/z;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lm1/g;->g:Lp1/k1;

    new-instance p1, Lm1/c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lm1/c;-><init>(Lm1/g;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lm1/g;->h:Lp1/f0;

    new-instance p1, Lm1/c;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lm1/c;-><init>(Lm1/g;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lm1/g;->i:Lp1/f0;

    new-instance p1, Lp1/g1;

    const/high16 p2, 0x7fc00000    # Float.NaN

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lm1/g;->j:Lp1/g1;

    sget-object p1, Lp1/v0;->F:Lp1/v0;

    new-instance p2, Lm1/c;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p3}, Lm1/c;-><init>(Lm1/g;I)V

    invoke-static {p2, p1}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    new-instance p1, Lp1/g1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lm1/g;->k:Lp1/g1;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lm1/g;->l:Lp1/k1;

    new-instance p1, Lm1/b0;

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-direct {p1, p2}, Lm1/b0;-><init>(Ljava/util/Map;)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lm1/g;->m:Lp1/k1;

    new-instance p1, Lm1/f;

    invoke-direct {p1, p0}, Lm1/f;-><init>(Lm1/g;)V

    iput-object p1, p0, Lm1/g;->n:Lm1/f;

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lg1/x;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lm1/d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lm1/d;

    iget v1, v0, Lm1/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm1/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm1/d;

    invoke-direct {v0, p0, p3}, Lm1/d;-><init>(Lm1/g;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lm1/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm1/d;->y:I

    iget-object v3, p0, Lm1/g;->j:Lp1/g1;

    iget-object v4, p0, Lm1/g;->d:Lkotlin/jvm/functions/Function1;

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lm1/g;->e:Lm1/a0;

    new-instance v2, La33/c;

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-direct {v2, p0, p2, v8, v7}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v6, v0, Lm1/d;->y:I

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Le00/c;

    invoke-direct {p2, p1, p3, v2, v8}, Le00/c;-><init>(Lf0/z0;Lm1/a0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {p2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object p1

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result p2

    invoke-virtual {p1, p2}, Lm1/b0;->a(F)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result p2

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object p3

    invoke-virtual {p3, p1}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result p3

    sub-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float p2, p2, v5

    if-gtz p2, :cond_4

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0, p1}, Lm1/g;->g(Ljava/lang/Object;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_2
    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object p2

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result p3

    invoke-virtual {p2, p3}, Lm1/b0;->a(F)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result p3

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v0

    sub-float/2addr p3, v0

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpg-float p3, p3, v5

    if-gtz p3, :cond_5

    invoke-interface {v4, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {p0, p2}, Lm1/g;->g(Ljava/lang/Object;)V

    :cond_5
    throw p1
.end method

.method public final b(Ljava/lang/Object;Lf0/z0;Lc93/n;Lq83/d;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p4

    instance-of v2, v0, Lm1/e;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lm1/e;

    iget v3, v2, Lm1/e;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lm1/e;->y:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lm1/e;

    invoke-direct {v2, p0, v0}, Lm1/e;-><init>(Lm1/g;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lm1/e;->w:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, v6, Lm1/e;->y:I

    iget-object v8, p0, Lm1/g;->j:Lp1/g1;

    iget-object v9, p0, Lm1/g;->d:Lkotlin/jvm/functions/Function1;

    const/high16 v10, 0x3f000000    # 0.5f

    const/4 v11, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v11, :cond_1

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    iget-object v0, v0, Lm1/b0;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :try_start_1
    iget-object v12, p0, Lm1/g;->e:Lm1/a0;

    new-instance v0, La00/f;

    const/4 v5, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p3

    invoke-direct/range {v0 .. v5}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v11, v6, Lm1/e;->y:I

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Le00/c;

    invoke-direct {v2, p2, v12, v0, v4}, Le00/c;-><init>(Lf0/z0;Lm1/a0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v2, v6}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_3
    :goto_2
    invoke-virtual {p0, v4}, Lm1/g;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    invoke-virtual {v8}, Lp1/g1;->x()F

    move-result v2

    invoke-virtual {v0, v2}, Lm1/b0;->a(F)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v8}, Lp1/g1;->x()F

    move-result v2

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v3

    invoke-virtual {v3, v0}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v10

    if-gtz v2, :cond_6

    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, v0}, Lm1/g;->g(Ljava/lang/Object;)V

    goto :goto_4

    :goto_3
    invoke-virtual {p0, v4}, Lm1/g;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v2

    invoke-virtual {v8}, Lp1/g1;->x()F

    move-result v3

    invoke-virtual {v2, v3}, Lm1/b0;->a(F)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v8}, Lp1/g1;->x()F

    move-result v3

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v4

    invoke-virtual {v4, v2}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v4

    sub-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v3, v3, v10

    if-gtz v3, :cond_4

    invoke-interface {v9, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, v2}, Lm1/g;->g(Ljava/lang/Object;)V

    :cond_4
    throw v0

    :cond_5
    invoke-virtual/range {p0 .. p1}, Lm1/g;->g(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final c(FFLjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    invoke-virtual {v0, p3}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v1

    iget-object v2, p0, Lm1/g;->b:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpg-float v3, v1, p1

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v4, p0, Lm1/g;->a:Lh0/l0;

    if-gez v3, :cond_4

    cmpl-float p2, p2, v2

    const/4 v2, 0x1

    if-ltz p2, :cond_2

    invoke-virtual {v0, p1, v2}, Lm1/b0;->b(FZ)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    invoke-virtual {v0, p1, v2}, Lm1/b0;->b(FZ)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v0

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4, v0}, Lh0/l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_3

    goto :goto_0

    :cond_3
    return-object p2

    :cond_4
    neg-float v2, v2

    cmpg-float p2, p2, v2

    const/4 v2, 0x0

    if-gtz p2, :cond_5

    invoke-virtual {v0, p1, v2}, Lm1/b0;->b(FZ)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_5
    invoke-virtual {v0, p1, v2}, Lm1/b0;->b(FZ)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v0

    sub-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4, v0}, Lh0/l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gez v1, :cond_6

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, v0

    if-gez p1, :cond_7

    goto :goto_0

    :cond_6
    cmpl-float p1, p1, v0

    if-lez p1, :cond_7

    :goto_0
    return-object p3

    :cond_7
    return-object p2
.end method

.method public final d()Lm1/b0;
    .locals 1

    iget-object v0, p0, Lm1/g;->m:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/b0;

    return-object v0
.end method

.method public final e(F)F
    .locals 2

    iget-object v0, p0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    :goto_0
    add-float/2addr v0, p1

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object p1

    invoke-virtual {p1}, Lm1/b0;->c()F

    move-result p1

    invoke-virtual {p0}, Lm1/g;->d()Lm1/b0;

    move-result-object v1

    iget-object v1, v1, Lm1/b0;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->U0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_1

    :cond_1
    const/high16 v1, 0x7fc00000    # Float.NaN

    :goto_1
    invoke-static {v0, p1, v1}, Le93/b;->m(FFF)F

    move-result p1

    return p1
.end method

.method public final f()F
    .locals 2

    iget-object v0, p0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm1/g;->g:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm1/g;->l:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
