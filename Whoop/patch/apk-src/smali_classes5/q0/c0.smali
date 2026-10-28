.class public abstract Lq0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Lq0/q;

.field public static final c:Lq0/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Lq0/c0;->a:F

    sget-object v5, Lh0/d2;->x:Lh0/d2;

    sget-object v9, Li0/m;->c:Li0/m;

    new-instance v10, Lq0/a0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v11

    new-instance v1, Lq0/q;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v11}, Lq0/q;-><init>(IIILh0/d2;IIILi0/n;Ly2/s0;Lbc3/c0;)V

    sput-object v1, Lq0/c0;->b:Lq0/q;

    new-instance v0, Lq0/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq0/c0;->c:Lq0/b0;

    return-void
.end method

.method public static final a(Lq0/q;I)J
    .locals 8

    iget v0, p0, Lq0/q;->c:I

    iget v1, p0, Lq0/q;->b:I

    add-int/2addr v1, v0

    int-to-long v2, p1

    int-to-long v4, v1

    mul-long/2addr v2, v4

    iget p1, p0, Lq0/q;->f:I

    neg-int p1, p1

    int-to-long v4, p1

    add-long/2addr v2, v4

    iget v1, p0, Lq0/q;->d:I

    int-to-long v4, v1

    add-long/2addr v2, v4

    int-to-long v4, v0

    sub-long/2addr v2, v4

    iget-object v0, p0, Lq0/q;->e:Lh0/d2;

    sget-object v4, Lh0/d2;->x:Lh0/d2;

    if-ne v0, v4, :cond_0

    invoke-virtual {p0}, Lq0/q;->e()J

    move-result-wide v4

    const/16 v0, 0x20

    shr-long/2addr v4, v0

    :goto_0
    long-to-int v0, v4

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lq0/q;->e()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    goto :goto_0

    :goto_1
    iget-object v4, p0, Lq0/q;->n:Li0/n;

    iget p0, p0, Lq0/q;->b:I

    invoke-interface {v4, v0, p0, p1, v1}, Li0/n;->a(IIII)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p0, p1, v0}, Le93/b;->n(III)I

    move-result p0

    sub-int/2addr v0, p0

    int-to-long p0, v0

    sub-long/2addr v2, p0

    const-wide/16 p0, 0x0

    cmp-long v0, v2, p0

    if-gez v0, :cond_1

    return-wide p0

    :cond_1
    return-wide v2
.end method

.method public static final b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Lq0/b;
    .locals 7

    const/4 v0, 0x1

    and-int/2addr p4, v0

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    move p1, v1

    :cond_0
    new-array p4, v1, [Ljava/lang/Object;

    sget-object v2, Lq0/b;->K:Lp0/n0;

    and-int/lit8 v3, p2, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    if-le v3, v4, :cond_1

    move-object v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->e(I)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    and-int/lit8 v3, p2, 0x6

    if-ne v3, v4, :cond_3

    :cond_2
    move v3, v0

    goto :goto_0

    :cond_3
    move v3, v1

    :goto_0
    and-int/lit8 v4, p2, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v5, 0x20

    const/4 v6, 0x0

    if-le v4, v5, :cond_4

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v6}, Lp1/q;->d(F)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    and-int/lit8 v4, p2, 0x30

    if-ne v4, v5, :cond_6

    :cond_5
    move v4, v0

    goto :goto_1

    :cond_6
    move v4, v1

    :goto_1
    or-int/2addr v3, v4

    and-int/lit16 v4, p2, 0x380

    xor-int/lit16 v4, v4, 0x180

    const/16 v5, 0x100

    if-le v4, v5, :cond_7

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_7
    and-int/lit16 p2, p2, 0x180

    if-ne p2, v5, :cond_8

    goto :goto_2

    :cond_8
    move v0, v1

    :cond_9
    :goto_2
    or-int p2, v3, v0

    check-cast p3, Lp1/q;

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_a

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_b

    :cond_a
    new-instance v0, Lq0/z;

    invoke-direct {v0, v6, p1, p0}, Lq0/z;-><init>(FILc93/a;)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lc93/a;

    invoke-static {p4, v2, v0, p3, v1}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq0/b;

    iget-object p2, p1, Lq0/b;->J:Lp1/k1;

    invoke-virtual {p2, p0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-object p1
.end method
