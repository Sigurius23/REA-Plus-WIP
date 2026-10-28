.class public abstract Lg1/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll0/l1;

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:Ll0/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x10

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    new-instance v2, Ll0/l1;

    invoke-direct {v2, v0, v1, v0, v1}, Ll0/l1;-><init>(FFFF)V

    sput-object v2, Lg1/v0;->a:Ll0/l1;

    const/16 v0, 0x40

    int-to-float v0, v0

    sput v0, Lg1/v0;->b:F

    const/16 v0, 0x24

    int-to-float v0, v0

    sput v0, Lg1/v0;->c:F

    const/4 v0, 0x1

    int-to-float v0, v0

    sput v0, Lg1/v0;->d:F

    new-instance v0, Ll0/l1;

    invoke-direct {v0, v1, v1, v1, v1}, Ll0/l1;-><init>(FFFF)V

    sput-object v0, Lg1/v0;->e:Ll0/l1;

    return-void
.end method

.method public static a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;
    .locals 2

    and-int/lit8 p9, p10, 0x1

    if-eqz p9, :cond_0

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    move-object p1, p8

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->f()J

    move-result-wide p0

    :cond_0
    and-int/lit8 p9, p10, 0x2

    if-eqz p9, :cond_1

    invoke-static {p0, p1, p8}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide p2

    :cond_1
    and-int/lit8 p9, p10, 0x4

    if-eqz p9, :cond_2

    sget-object p4, Lg1/d1;->a:Lp1/u2;

    move-object p5, p8

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p9

    check-cast p9, Lg1/c1;

    invoke-virtual {p9}, Lg1/c1;->e()J

    move-result-wide v0

    const p9, 0x3df5c28f    # 0.12f

    invoke-static {p9, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    invoke-virtual {p5, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lg1/c1;

    invoke-virtual {p4}, Lg1/c1;->h()J

    move-result-wide p4

    invoke-static {v0, v1, p4, p5}, Li2/w0;->p(JJ)J

    move-result-wide p4

    :cond_2
    and-int/lit8 p9, p10, 0x8

    if-eqz p9, :cond_3

    sget-object p6, Lg1/d1;->a:Lp1/u2;

    move-object p7, p8

    check-cast p7, Lp1/q;

    invoke-virtual {p7, p6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lg1/c1;

    invoke-virtual {p6}, Lg1/c1;->e()J

    move-result-wide p6

    invoke-static {p8}, Lds/p;->G(Landroidx/compose/runtime/Composer;)F

    const p8, 0x3ec28f5c    # 0.38f

    invoke-static {p8, p6, p7}, Li2/x;->c(FJ)J

    move-result-wide p6

    :cond_3
    move-wide p9, p6

    move-wide p7, p4

    move-wide p5, p2

    new-instance p2, Lg1/m1;

    move-wide p3, p0

    invoke-direct/range {p2 .. p10}, Lg1/m1;-><init>(JJJJ)V

    return-object p2
.end method

.method public static b(FFFFFLandroidx/compose/runtime/Composer;II)Lg1/q1;
    .locals 4

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    int-to-float p0, p0

    :cond_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    const/16 p1, 0x8

    int-to-float p1, p1

    :cond_1
    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    int-to-float p2, v1

    :cond_2
    and-int/lit8 v0, p7, 0x8

    const/4 v2, 0x4

    if-eqz v0, :cond_3

    int-to-float p3, v2

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    int-to-float p4, v2

    :cond_4
    and-int/lit8 p7, p6, 0xe

    xor-int/lit8 p7, p7, 0x6

    const/4 v0, 0x1

    if-le p7, v2, :cond_5

    move-object p7, p5

    check-cast p7, Lp1/q;

    invoke-virtual {p7, p0}, Lp1/q;->d(F)Z

    move-result p7

    if-nez p7, :cond_6

    :cond_5
    and-int/lit8 p7, p6, 0x6

    if-ne p7, v2, :cond_7

    :cond_6
    move p7, v0

    goto :goto_0

    :cond_7
    move p7, v1

    :goto_0
    and-int/lit8 v2, p6, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    if-le v2, v3, :cond_8

    move-object v2, p5

    check-cast v2, Lp1/q;

    invoke-virtual {v2, p1}, Lp1/q;->d(F)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    and-int/lit8 v2, p6, 0x30

    if-ne v2, v3, :cond_a

    :cond_9
    move v2, v0

    goto :goto_1

    :cond_a
    move v2, v1

    :goto_1
    or-int/2addr p7, v2

    and-int/lit16 v2, p6, 0x380

    xor-int/lit16 v2, v2, 0x180

    const/16 v3, 0x100

    if-le v2, v3, :cond_b

    move-object v2, p5

    check-cast v2, Lp1/q;

    invoke-virtual {v2, p2}, Lp1/q;->d(F)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    and-int/lit16 v2, p6, 0x180

    if-ne v2, v3, :cond_d

    :cond_c
    move v2, v0

    goto :goto_2

    :cond_d
    move v2, v1

    :goto_2
    or-int/2addr p7, v2

    and-int/lit16 v2, p6, 0x1c00

    xor-int/lit16 v2, v2, 0xc00

    const/16 v3, 0x800

    if-le v2, v3, :cond_e

    move-object v2, p5

    check-cast v2, Lp1/q;

    invoke-virtual {v2, p3}, Lp1/q;->d(F)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    and-int/lit16 v2, p6, 0xc00

    if-ne v2, v3, :cond_10

    :cond_f
    move v2, v0

    goto :goto_3

    :cond_10
    move v2, v1

    :goto_3
    or-int/2addr p7, v2

    const v2, 0xe000

    and-int/2addr v2, p6

    xor-int/lit16 v2, v2, 0x6000

    const/16 v3, 0x4000

    if-le v2, v3, :cond_11

    move-object v2, p5

    check-cast v2, Lp1/q;

    invoke-virtual {v2, p4}, Lp1/q;->d(F)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    and-int/lit16 p6, p6, 0x6000

    if-ne p6, v3, :cond_13

    :cond_12
    move v1, v0

    :cond_13
    or-int p6, p7, v1

    move-object p7, p5

    check-cast p7, Lp1/q;

    invoke-virtual {p7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p6, :cond_14

    sget-object p6, Lp1/l;->a:Lp1/v0;

    if-ne p5, p6, :cond_15

    :cond_14
    move p5, p3

    move p3, p1

    new-instance p1, Lg1/q1;

    move p6, p4

    move p4, p2

    move p2, p0

    invoke-direct/range {p1 .. p6}, Lg1/q1;-><init>(FFFFF)V

    invoke-virtual {p7, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p5, p1

    :cond_15
    check-cast p5, Lg1/q1;

    return-object p5
.end method

.method public static c(JJLp1/q;I)Lg1/m1;
    .locals 9

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p4, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->h()J

    move-result-wide p0

    :cond_0
    move-wide v1, p0

    and-int/lit8 p0, p5, 0x2

    if-eqz p0, :cond_1

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p4, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->f()J

    move-result-wide p2

    :cond_1
    move-wide v3, p2

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p4, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->e()J

    move-result-wide p0

    invoke-static {p4}, Lds/p;->G(Landroidx/compose/runtime/Composer;)F

    const p2, 0x3ec28f5c    # 0.38f

    invoke-static {p2, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide v7

    new-instance v0, Lg1/m1;

    move-wide v5, v1

    invoke-direct/range {v0 .. v8}, Lg1/m1;-><init>(JJJJ)V

    return-object v0
.end method

.method public static d(JLandroidx/compose/runtime/Composer;I)Lg1/m1;
    .locals 9

    sget-wide v1, Li2/x;->m:J

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->f()J

    move-result-wide p0

    :cond_0
    move-wide v3, p0

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->e()J

    move-result-wide p0

    invoke-static {p2}, Lds/p;->G(Landroidx/compose/runtime/Composer;)F

    const p2, 0x3ec28f5c    # 0.38f

    invoke-static {p2, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide v7

    new-instance v0, Lg1/m1;

    move-wide v5, v1

    invoke-direct/range {v0 .. v8}, Lg1/m1;-><init>(JJJJ)V

    return-object v0
.end method
