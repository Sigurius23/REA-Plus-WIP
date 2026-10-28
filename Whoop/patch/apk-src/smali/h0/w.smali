.class public final Lh0/w;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/a0;


# instance fields
.field public O:Lh0/d2;

.field public final P:Lh0/c3;

.field public Q:Z

.field public R:Lh0/s;

.field public final S:Lad3/z;

.field public T:Ly2/y;

.field public U:Z

.field public V:Z

.field public W:J

.field public X:Z


# direct methods
.method public constructor <init>(Lh0/d2;Lh0/c3;ZLh0/s;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lh0/w;->O:Lh0/d2;

    iput-object p2, p0, Lh0/w;->P:Lh0/c3;

    iput-boolean p3, p0, Lh0/w;->Q:Z

    iput-object p4, p0, Lh0/w;->R:Lh0/s;

    new-instance p1, Lad3/z;

    const/16 p2, 0xb

    invoke-direct {p1, p2}, Lad3/z;-><init>(I)V

    iput-object p1, p0, Lh0/w;->S:Lad3/z;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lh0/w;->W:J

    return-void
.end method

.method public static final X0(Lh0/w;Lh0/s;)F
    .locals 14

    iget-wide v0, p0, Lh0/w;->W:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ly3/l;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lh0/w;->S:Lad3/z;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    iget v1, v0, Lr1/c;->y:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    iget-object v0, v0, Lr1/c;->w:[Ljava/lang/Object;

    array-length v3, v0

    const/16 v4, 0x20

    const-wide v5, 0xffffffffL

    const/4 v7, 0x0

    if-ge v1, v3, :cond_5

    move-object v3, v7

    :goto_0
    if-ltz v1, :cond_6

    aget-object v8, v0, v1

    check-cast v8, Lh0/v;

    iget-object v8, v8, Lh0/v;->a:Lr0/e;

    invoke-virtual {v8}, Lr0/e;->invoke()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lh2/c;

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lh2/c;->e()J

    move-result-wide v9

    iget-wide v11, p0, Lh0/w;->W:J

    invoke-static {v11, v12}, Lv63/b;->l(J)J

    move-result-wide v11

    iget-object v13, p0, Lh0/w;->O:Lh0/d2;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_2

    if-ne v13, v2, :cond_1

    shr-long/2addr v9, v4

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    shr-long v10, v11, v4

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    and-long/2addr v9, v5

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    and-long v10, v11, v5

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    :goto_1
    if-gtz v9, :cond_3

    move-object v3, v8

    goto :goto_2

    :cond_3
    if-nez v3, :cond_6

    move-object v3, v8

    goto :goto_3

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    move-object v3, v7

    :cond_6
    :goto_3
    if-nez v3, :cond_9

    iget-boolean v0, p0, Lh0/w;->U:Z

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lh0/w;->Y0()Lh2/c;

    move-result-object v7

    :cond_7
    if-nez v7, :cond_8

    :goto_4
    const/4 p0, 0x0

    return p0

    :cond_8
    move-object v3, v7

    :cond_9
    iget-wide v0, p0, Lh0/w;->W:J

    invoke-static {v0, v1}, Lv63/b;->l(J)J

    move-result-wide v0

    iget-object p0, p0, Lh0/w;->O:Lh0/d2;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_b

    if-ne p0, v2, :cond_a

    iget p0, v3, Lh2/c;->a:F

    iget v2, v3, Lh2/c;->c:F

    sub-float/2addr v2, p0

    shr-long/2addr v0, v4

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {p1, p0, v2, v0}, Lh0/s;->a(FFF)F

    move-result p0

    return p0

    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_b
    iget p0, v3, Lh2/c;->b:F

    iget v2, v3, Lh2/c;->d:F

    sub-float/2addr v2, p0

    and-long/2addr v0, v5

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {p1, p0, v2, v0}, Lh0/s;->a(FFF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Y0()Lh2/c;
    .locals 4

    iget-boolean v0, p0, Lb2/v;->N:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, La3/g;->o(La3/n;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-object v2, p0, Lh0/w;->T:Ly2/y;

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ly2/y;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/node/NodeCoordinator;->r(Ly2/y;Z)Lh2/c;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public final Z0(Lh2/c;J)Z
    .locals 3

    invoke-virtual {p0, p1, p2, p3}, Lh0/w;->b1(Lh2/c;J)J

    move-result-wide p1

    const/16 p3, 0x20

    shr-long v0, p1, p3

    long-to-int p3, v0

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float p3, p3, v0

    if-gtz p3, :cond_0

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a1()V
    .locals 8

    invoke-virtual {p0}, Lh0/w;->c1()Lh0/s;

    move-result-object v3

    iget-boolean v0, p0, Lh0/w;->X:Z

    if-eqz v0, :cond_0

    const-string v0, "launchAnimation called when previous animation was running"

    invoke-static {v0}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_0
    new-instance v2, Lh0/d4;

    invoke-virtual {p0}, Lh0/w;->c1()Lh0/s;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lh0/s;->b()Ld0/i1;

    move-result-object v0

    invoke-direct {v2, v0}, Lh0/d4;-><init>(Ld0/i1;)V

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v6

    sget-object v7, Lbc3/d0;->z:Lbc3/d0;

    new-instance v0, Lb2/y;

    const/16 v5, 0xb

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x1

    invoke-static {v6, v4, v7, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final b1(Lh2/c;J)J
    .locals 6

    invoke-static {p2, p3}, Lv63/b;->l(J)J

    move-result-wide p2

    iget-object v0, p0, Lh0/w;->O:Lh0/d2;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    if-ne v0, v5, :cond_0

    invoke-virtual {p0}, Lh0/w;->c1()Lh0/s;

    move-result-object v0

    iget v5, p1, Lh2/c;->a:F

    iget p1, p1, Lh2/c;->c:F

    sub-float/2addr p1, v5

    shr-long/2addr p2, v4

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-interface {v0, v5, p1, p2}, Lh0/s;->a(FFF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long v0, p3

    shl-long/2addr p1, v4

    :goto_0
    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lh0/w;->c1()Lh0/s;

    move-result-object v0

    iget v5, p1, Lh2/c;->b:F

    iget p1, p1, Lh2/c;->d:F

    sub-float/2addr p1, v5

    and-long/2addr p2, v2

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-interface {v0, v5, p1, p2}, Lh0/s;->a(FFF)F

    move-result p1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    shl-long p1, p2, v4

    goto :goto_0
.end method

.method public final c1()Lh0/s;
    .locals 1

    iget-object v0, p0, Lh0/w;->R:Lh0/s;

    if-nez v0, :cond_0

    invoke-static {}, Lh0/u;->a()Lp1/b0;

    move-result-object v0

    invoke-static {p0, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh0/s;

    :cond_0
    return-object v0
.end method

.method public final g(J)V
    .locals 6

    iget-wide v0, p0, Lh0/w;->W:J

    iput-wide p1, p0, Lh0/w;->W:J

    iget-object v2, p0, Lh0/w;->O:Lh0/d2;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    const/16 v2, 0x20

    shr-long/2addr p1, v2

    long-to-int p1, p1

    shr-long v4, v0, v2

    long-to-int p2, v4

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    and-long/2addr v4, v0

    long-to-int p2, v4

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean p1, p0, Lh0/w;->X:Z

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lh0/w;->U:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lh0/w;->Y0()Lh2/c;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1, v0, v1}, Lh0/w;->Z0(Lh2/c;J)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v3, p0, Lh0/w;->V:Z

    :cond_5
    :goto_1
    return-void
.end method
