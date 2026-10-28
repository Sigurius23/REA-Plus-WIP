.class public abstract Lh0/q3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgo1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgo1/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lgo1/a;-><init>(I)V

    sput-object v0, Lh0/q3;->a:Lgo1/a;

    return-void
.end method

.method public static final a(Lu2/b;)Z
    .locals 5

    check-cast p0, Lu2/g0;

    iget-object p0, p0, Lu2/g0;->F:Lu2/h0;

    iget-object p0, p0, Lu2/h0;->T:Lu2/k;

    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    iget-boolean v4, v4, Lu2/r;->d:Z

    if-eqz v4, :cond_0

    move v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    xor-int/lit8 p0, v1, 0x1

    return p0
.end method

.method public static final b(J)F
    .locals 7

    const/16 v0, 0x20

    shr-long v0, p0, v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    const-wide v3, 0xffffffffL

    if-nez v1, :cond_0

    and-long v5, p0, v3

    long-to-int v1, v5

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    and-long/2addr p0, v3

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    float-to-double v0, v0

    float-to-double p0, p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    double-to-float p0, p0

    neg-float p0, p0

    const/high16 p1, 0x43340000    # 180.0f

    mul-float/2addr p0, p1

    const p1, 0x40490fdb    # (float)Math.PI

    div-float/2addr p0, p1

    return p0
.end method

.method public static final c(Lh0/x2;FLd0/l;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lh0/i2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh0/i2;

    iget v1, v0, Lh0/i2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/i2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/i2;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lh0/i2;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/i2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/i2;->w:Lkotlin/jvm/internal/d0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lkotlin/jvm/internal/d0;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lg1/h7;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p2, p3, v4}, Lg1/h7;-><init>(FLd0/l;Lkotlin/jvm/internal/d0;Lq83/d;)V

    iput-object p3, v0, Lh0/i2;->w:Lkotlin/jvm/internal/d0;

    iput v3, v0, Lh0/i2;->y:I

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-interface {p0, p1, v2, v0}, Lh0/x2;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p3

    :goto_1
    iget p0, p0, Lkotlin/jvm/internal/d0;->w:F

    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    return-object p1
.end method

.method public static synthetic d(Lh0/x2;FLs83/i;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v0, v0, v1, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Lh0/q3;->c(Lh0/x2;FLd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lh0/a4;FLs83/i;)Ljava/lang/Object;
    .locals 6

    new-instance v3, Ld0/i1;

    const/4 v0, 0x5

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0}, Ld0/i1;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "zoom value should be greater than 0"

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v1, Lkotlin/jvm/internal/d0;->w:F

    new-instance v0, Lg1/h7;

    const/4 v5, 0x2

    move v2, p1

    invoke-direct/range {v0 .. v5}, Lg1/h7;-><init>(Ljava/lang/Object;FLd0/l;Lq83/d;I)V

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    check-cast p0, Lh0/f0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lg20/p;

    invoke-direct {v1, p0, p1, v0, v4}, Lg20/p;-><init>(Lh0/f0;Lf0/z0;Lc93/m;Lq83/d;)V

    invoke-static {v1, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-ne p0, p1, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, p2

    :goto_1
    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    return-object p2
.end method

.method public static final f(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lh0/q1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/q1;

    iget v1, v0, Lh0/q1;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/q1;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/q1;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/q1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/q1;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/q1;->x:Lu2/l;

    iget-object p1, v0, Lh0/q1;->w:Lu2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p0}, Lh0/q3;->a(Lu2/b;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_1
    iput-object p0, v0, Lh0/q1;->w:Lu2/b;

    iput-object p1, v0, Lh0/q1;->x:Lu2/l;

    iput v3, v0, Lh0/q1;->z:I

    check-cast p0, Lu2/g0;

    invoke-virtual {p0, p1, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p2, Lu2/k;

    iget-object p2, p2, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_5

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/r;

    iget-boolean v5, v5, Lu2/r;->d:Z

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_5
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lf1/v0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lf1/v0;-><init>(Lq83/j;Lc93/m;Lq83/d;)V

    check-cast p0, Lu2/h0;

    invoke-virtual {p0, v1, p2}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lu2/k;Z)J
    .locals 7

    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v0, :cond_2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/r;

    iget-boolean v6, v5, Lu2/r;->d:Z

    if-eqz v6, :cond_1

    iget-boolean v6, v5, Lu2/r;->h:Z

    if-eqz v6, :cond_1

    if-eqz p1, :cond_0

    iget-wide v5, v5, Lu2/r;->c:J

    goto :goto_1

    :cond_0
    iget-wide v5, v5, Lu2/r;->g:J

    :goto_1
    invoke-static {v1, v2, v5, v6}, Lh2/b;->h(JJ)J

    move-result-wide v1

    add-int/lit8 v4, v4, 0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-nez v4, :cond_3

    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide p0

    :cond_3
    int-to-float p0, v4

    invoke-static {p0, v1, v2}, Lh2/b;->b(FJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final i(Lu2/k;Z)F
    .locals 8

    invoke-static {p0, p1}, Lh0/q3;->h(Lu2/k;Z)J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, p0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu2/r;

    iget-boolean v7, v6, Lu2/r;->d:Z

    if-eqz v7, :cond_2

    iget-boolean v7, v6, Lu2/r;->h:Z

    if-eqz v7, :cond_2

    if-eqz p1, :cond_1

    iget-wide v6, v6, Lu2/r;->c:J

    goto :goto_1

    :cond_1
    iget-wide v6, v6, Lu2/r;->g:J

    :goto_1
    invoke-static {v6, v7, v0, v1}, Lh2/b;->g(JJ)J

    move-result-wide v6

    invoke-static {v6, v7}, Lh2/b;->d(J)F

    move-result v6

    add-float/2addr v6, v3

    add-int/lit8 v5, v5, 0x1

    move v3, v6

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    int-to-float p0, v5

    div-float/2addr v3, p0

    return v3
.end method

.method public static final j(Lu2/k;)J
    .locals 4

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lh0/q3;->h(Lu2/k;Z)J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const/4 v2, 0x0

    invoke-static {p0, v2}, Lh0/q3;->h(Lu2/k;Z)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lh2/b;->g(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final k(Lu2/k;)F
    .locals 15

    iget-object v0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu2/r;

    iget-boolean v7, v6, Lu2/r;->h:Z

    if-eqz v7, :cond_0

    iget-boolean v6, v6, Lu2/r;->d:Z

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ge v4, v1, :cond_2

    goto :goto_4

    :cond_2
    invoke-static {p0, v5}, Lh0/q3;->h(Lu2/k;Z)J

    move-result-wide v4

    invoke-static {p0, v2}, Lh0/q3;->h(Lu2/k;Z)J

    move-result-wide v6

    move-object p0, v0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    move v1, v3

    move v8, v1

    :goto_2
    if-ge v2, p0, :cond_6

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    iget-boolean v10, v9, Lu2/r;->d:Z

    if-eqz v10, :cond_5

    iget-boolean v10, v9, Lu2/r;->h:Z

    if-eqz v10, :cond_5

    iget-wide v10, v9, Lu2/r;->c:J

    iget-wide v12, v9, Lu2/r;->g:J

    invoke-static {v12, v13, v6, v7}, Lh2/b;->g(JJ)J

    move-result-wide v12

    invoke-static {v10, v11, v4, v5}, Lh2/b;->g(JJ)J

    move-result-wide v9

    invoke-static {v12, v13}, Lh0/q3;->b(J)F

    move-result v11

    invoke-static {v9, v10}, Lh0/q3;->b(J)F

    move-result v14

    sub-float/2addr v14, v11

    invoke-static {v9, v10, v12, v13}, Lh2/b;->h(JJ)J

    move-result-wide v9

    invoke-static {v9, v10}, Lh2/b;->d(J)F

    move-result v9

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    const/high16 v10, 0x43340000    # 180.0f

    cmpl-float v10, v14, v10

    const/high16 v11, 0x43b40000    # 360.0f

    if-lez v10, :cond_3

    sub-float/2addr v14, v11

    goto :goto_3

    :cond_3
    const/high16 v10, -0x3ccc0000    # -180.0f

    cmpg-float v10, v14, v10

    if-gez v10, :cond_4

    add-float/2addr v14, v11

    :cond_4
    :goto_3
    mul-float/2addr v14, v9

    add-float/2addr v8, v14

    add-float/2addr v1, v9

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    cmpg-float p0, v1, v3

    if-nez p0, :cond_7

    :goto_4
    return v3

    :cond_7
    div-float/2addr v8, v1

    return v8
.end method

.method public static final l(Lu2/k;)F
    .locals 3

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lh0/q3;->i(Lu2/k;Z)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lh0/q3;->i(Lu2/k;Z)F

    move-result p0

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v1, p0, v1

    if-nez v1, :cond_1

    :goto_0
    const/high16 p0, 0x3f800000    # 1.0f

    return p0

    :cond_1
    div-float/2addr v0, p0

    return v0
.end method

.method public static final m(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lh0/r1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/r1;

    iget v1, v0, Lh0/r1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/r1;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/r1;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/r1;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/r1;->E:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p0, v0, Lh0/r1;->y:Lq83/j;

    iget-object p1, v0, Lh0/r1;->x:Lc93/m;

    iget-object v2, v0, Lh0/r1;->w:Lu2/v;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lh0/r1;->y:Lq83/j;

    iget-object p1, v0, Lh0/r1;->x:Lc93/m;

    iget-object v2, v0, Lh0/r1;->w:Lu2/v;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_1
    move-object p2, p0

    move-object p0, v2

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_5

    :cond_4
    iget-object p0, v0, Lh0/r1;->y:Lq83/j;

    iget-object p1, v0, Lh0/r1;->x:Lc93/m;

    iget-object v2, v0, Lh0/r1;->w:Lu2/v;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    :goto_2
    invoke-static {p2}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v2

    if-eqz v2, :cond_a

    :try_start_2
    iput-object p0, v0, Lh0/r1;->w:Lu2/v;

    iput-object p1, v0, Lh0/r1;->x:Lc93/m;

    iput-object p2, v0, Lh0/r1;->y:Lq83/j;

    iput v7, v0, Lh0/r1;->E:I

    invoke-interface {p1, p0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v2, v1, :cond_6

    goto :goto_7

    :cond_6
    move-object v2, p0

    move-object p0, p2

    :goto_3
    :try_start_3
    iput-object v2, v0, Lh0/r1;->w:Lu2/v;

    iput-object p1, v0, Lh0/r1;->x:Lc93/m;

    iput-object p0, v0, Lh0/r1;->y:Lq83/j;

    iput v6, v0, Lh0/r1;->E:I

    new-instance p2, Lh0/p1;

    invoke-direct {p2, v6, v3}, Ls83/h;-><init>(ILq83/d;)V

    move-object v8, v2

    check-cast v8, Lu2/h0;

    invoke-virtual {v8, p2, v0}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    sget-object v8, Lr83/a;->w:Lr83/a;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p2, v8, :cond_7

    goto :goto_4

    :cond_7
    move-object p2, v4

    :goto_4
    if-ne p2, v1, :cond_3

    goto :goto_7

    :catch_1
    move-exception v2

    move-object v9, v2

    move-object v2, p0

    move-object p0, p2

    move-object p2, v9

    :goto_5
    invoke-static {p0}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v8

    if-eqz v8, :cond_9

    iput-object v2, v0, Lh0/r1;->w:Lu2/v;

    iput-object p1, v0, Lh0/r1;->x:Lc93/m;

    iput-object p0, v0, Lh0/r1;->y:Lq83/j;

    iput v5, v0, Lh0/r1;->E:I

    new-instance p2, Lh0/p1;

    invoke-direct {p2, v6, v3}, Ls83/h;-><init>(ILq83/d;)V

    move-object v8, v2

    check-cast v8, Lu2/h0;

    invoke-virtual {v8, p2, v0}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    sget-object v8, Lr83/a;->w:Lr83/a;

    if-ne p2, v8, :cond_8

    goto :goto_6

    :cond_8
    move-object p2, v4

    :goto_6
    if-ne p2, v1, :cond_3

    :goto_7
    return-object v1

    :cond_9
    throw p2

    :cond_a
    return-object v4
.end method

.method public static final n(La3/m;)Le10/k0;
    .locals 2

    new-instance v0, Le10/k0;

    invoke-static {p0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p0

    const/16 v1, 0x1a

    invoke-direct {v0, p0, v1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final o(Lkotlin/jvm/functions/Function3;Lp1/q;)Lh0/a4;
    .locals 2

    invoke-static {p0, p1}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lea2/g;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Lea2/g;-><init>(ILp1/c1;)V

    new-instance p0, Lh0/f0;

    invoke-direct {p0, v0}, Lh0/f0;-><init>(Lea2/g;)V

    invoke-virtual {p1, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, p0

    :cond_0
    check-cast v0, Lh0/a4;

    return-object v0
.end method

.method public static final p(Lh0/x2;FLq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lh0/j2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/j2;

    iget v1, v0, Lh0/j2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/j2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/j2;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/j2;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/j2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/j2;->w:Lkotlin/jvm/internal/d0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/d0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lbm/h;

    const/4 v4, 0x0

    invoke-direct {v2, p2, p1, v4}, Lbm/h;-><init>(Lkotlin/jvm/internal/d0;FLq83/d;)V

    iput-object p2, v0, Lh0/j2;->w:Lkotlin/jvm/internal/d0;

    iput v3, v0, Lh0/j2;->y:I

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-interface {p0, p1, v2, v0}, Lh0/x2;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p2

    :goto_1
    iget p0, p0, Lkotlin/jvm/internal/d0;->w:F

    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    return-object p1
.end method
