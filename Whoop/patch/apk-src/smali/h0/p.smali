.class public final Lh0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgm1/b;

.field public final b:Lf0/c1;

.field public final c:Lp1/k1;

.field public final d:Lp1/k1;

.field public final e:Lp1/f0;

.field public final f:Lp1/g1;

.field public final g:Lp1/g1;

.field public final h:Lp1/k1;

.field public final i:Lp1/k1;

.field public final j:Lh0/o;


# direct methods
.method public constructor <init>(Ljava/lang/Enum;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgm1/b;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    iput-object v0, p0, Lh0/p;->a:Lgm1/b;

    new-instance v0, Lf0/c1;

    invoke-direct {v0}, Lf0/c1;-><init>()V

    iput-object v0, p0, Lh0/p;->b:Lf0/c1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lh0/p;->c:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lh0/p;->d:Lp1/k1;

    new-instance p1, Lh0/l;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lh0/l;-><init>(Lh0/p;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lh0/p;->e:Lp1/f0;

    new-instance p1, Lp1/g1;

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-direct {p1, v0}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lh0/p;->f:Lp1/g1;

    sget-object p1, Lp1/v0;->F:Lp1/v0;

    new-instance v0, Lh0/l;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lh0/l;-><init>(Lh0/p;I)V

    invoke-static {v0, p1}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    new-instance p1, Lp1/g1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lh0/p;->g:Lp1/g1;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lh0/p;->h:Lp1/k1;

    new-instance p1, Lh0/x;

    const/4 v0, 0x0

    new-array v0, v0, [F

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {p1, v1, v0}, Lh0/x;-><init>(Ljava/util/List;[F)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lh0/p;->i:Lp1/k1;

    new-instance p1, Lh0/o;

    invoke-direct {p1, p0}, Lh0/o;-><init>(Lh0/p;)V

    iput-object p1, p0, Lh0/p;->j:Lh0/o;

    return-void
.end method

.method public static b(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lf0/z0;->w:Lf0/z0;

    iget-object v1, p0, Lh0/p;->b:Lf0/c1;

    new-instance v2, La33/c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, La33/c;-><init>(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Landroidx/lifecycle/g1;

    invoke-direct {p0, v0, v1, v2, v3}, Landroidx/lifecycle/g1;-><init>(Lf0/z0;Lf0/c1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {p0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lf0/z0;Lc93/n;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Lh0/m;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lh0/m;

    iget v1, v0, Lh0/m;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/m;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/m;

    invoke-direct {v0, p0, p4}, Lh0/m;-><init>(Lh0/p;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lh0/m;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/m;->y:I

    iget-object v3, p0, Lh0/p;->h:Lp1/k1;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
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
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lh0/p;->c()Lh0/h1;

    move-result-object p4

    check-cast p4, Lh0/x;

    iget-object p4, p4, Lh0/x;->a:Ljava/util/List;

    invoke-interface {p4, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p4

    const/4 v2, -0x1

    if-eq p4, v2, :cond_4

    :try_start_1
    iget-object p4, p0, Lh0/p;->b:Lf0/c1;

    new-instance v2, Lh0/n;

    invoke-direct {v2, p0, p1, p3, v5}, Lh0/n;-><init>(Lh0/p;Ljava/lang/Object;Lc93/n;Lq83/d;)V

    iput v4, v0, Lh0/m;->y:I

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Landroidx/lifecycle/g1;

    invoke-direct {p1, p2, p4, v2, v5}, Landroidx/lifecycle/g1;-><init>(Lf0/z0;Lf0/c1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {p1, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-virtual {v3, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_3

    :goto_2
    invoke-virtual {v3, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    throw p1

    :cond_4
    iget-object p2, p0, Lh0/p;->d:Lp1/k1;

    invoke-virtual {p2, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lh0/p;->g(Ljava/lang/Object;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c()Lh0/h1;
    .locals 1

    iget-object v0, p0, Lh0/p;->i:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh0/h1;

    return-object v0
.end method

.method public final d(F)F
    .locals 2

    iget-object v0, p0, Lh0/p;->f:Lp1/g1;

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

    invoke-virtual {p0}, Lh0/p;->c()Lh0/h1;

    move-result-object p1

    check-cast p1, Lh0/x;

    invoke-virtual {p1}, Lh0/x;->d()F

    move-result p1

    invoke-virtual {p0}, Lh0/p;->c()Lh0/h1;

    move-result-object v1

    check-cast v1, Lh0/x;

    invoke-virtual {v1}, Lh0/x;->c()F

    move-result v1

    invoke-static {v0, p1, v1}, Le93/b;->m(FFF)F

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/Enum;Ljava/lang/Enum;)F
    .locals 3

    invoke-virtual {p0}, Lh0/p;->c()Lh0/h1;

    move-result-object v0

    check-cast v0, Lh0/x;

    invoke-virtual {v0, p1}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p0}, Lh0/p;->c()Lh0/h1;

    move-result-object v0

    check-cast v0, Lh0/x;

    invoke-virtual {v0, p2}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result p2

    iget-object v0, p0, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v0, v1, v2}, Le93/b;->m(FFF)F

    move-result v0

    sub-float/2addr v0, p1

    sub-float/2addr p2, p1

    div-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_2

    const p1, 0x358637bd    # 1.0E-6f

    cmpg-float p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const p1, 0x3f7fffef    # 0.999999f

    cmpl-float p1, v0, p1

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/high16 p1, 0x3f800000    # 1.0f

    return p1
.end method

.method public final f()F
    .locals 2

    iget-object v0, p0, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?"

    invoke-static {v1}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    return v0
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lh0/p;->c:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Lh0/x;Ljava/lang/Object;)V
    .locals 6

    invoke-virtual {p0}, Lh0/p;->c()Lh0/h1;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lh0/p;->i:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/p;->b:Lf0/c1;

    iget-object v0, p1, Lf0/c1;->b:Lmc3/c;

    iget-object p1, p1, Lf0/c1;->b:Lmc3/c;

    invoke-virtual {v0}, Lmc3/c;->tryLock()Z

    move-result v0

    iget-object v1, p0, Lh0/p;->h:Lp1/k1;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lh0/p;->j:Lh0/o;

    invoke-virtual {p0}, Lh0/p;->c()Lh0/h1;

    move-result-object v4

    check-cast v4, Lh0/x;

    invoke-virtual {v4, p2}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v3, v4}, Lh0/a;->a(Lh0/a;F)V

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0, p2}, Lh0/p;->g(Ljava/lang/Object;)V

    iget-object v3, p0, Lh0/p;->d:Lp1/k1;

    invoke-virtual {v3, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v2}, Lmc3/c;->i(Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    invoke-virtual {p1, v2}, Lmc3/c;->i(Ljava/lang/Object;)V

    throw p2

    :cond_1
    :goto_2
    if-nez v0, :cond_2

    invoke-virtual {v1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
