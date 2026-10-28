.class public abstract Lg93/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final w:Lg93/c;

.field public static final x:Lg93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg93/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg93/d;->w:Lg93/c;

    sget-object v0, Lw83/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lg93/b;

    invoke-direct {v0}, Lg93/b;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lh93/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_1
    sput-object v0, Lg93/d;->x:Lg93/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(I)I
.end method

.method public b()D
    .locals 2

    const/16 v0, 0x1a

    invoke-virtual {p0, v0}, Lg93/d;->a(I)I

    move-result v0

    const/16 v1, 0x1b

    invoke-virtual {p0, v1}, Lg93/d;->a(I)I

    move-result v1

    invoke-static {v0, v1}, Lx43/j;->t(II)D

    move-result-wide v0

    return-wide v0
.end method

.method public c(D)D
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg93/d;->d(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public d(D)D
    .locals 8

    invoke-static {p1, p2}, Lo73/a;->r(D)V

    const-wide/16 v0, 0x0

    sub-double v2, p1, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const-wide v6, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v4, v4, v6

    if-gtz v4, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    cmpg-double v4, v4, v6

    if-gtz v4, :cond_0

    invoke-virtual {p0}, Lg93/d;->b()D

    move-result-wide v2

    const/4 v4, 0x2

    int-to-double v4, v4

    div-double v6, p1, v4

    div-double v4, v0, v4

    sub-double/2addr v6, v4

    mul-double/2addr v6, v2

    add-double/2addr v0, v6

    add-double/2addr v0, v6

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg93/d;->b()D

    move-result-wide v4

    mul-double/2addr v4, v2

    add-double/2addr v0, v4

    :goto_0
    cmpl-double v2, v0, p1

    if-ltz v2, :cond_1

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->nextAfter(DD)D

    move-result-wide p1

    return-wide p1

    :cond_1
    return-wide v0
.end method

.method public e()F
    .locals 2

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lg93/d;->a(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x4b800000    # 1.6777216E7f

    div-float/2addr v0, v1

    return v0
.end method

.method public abstract f()I
.end method

.method public g(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lg93/d;->h(II)I

    move-result p1

    return p1
.end method

.method public h(II)I
    .locals 3

    invoke-static {p1, p2}, Lo73/a;->s(II)V

    sub-int v0, p2, p1

    if-gtz v0, :cond_1

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg93/d;->f()I

    move-result v0

    if-gt p1, v0, :cond_0

    if-ge v0, p2, :cond_0

    return v0

    :cond_1
    :goto_0
    neg-int p2, v0

    and-int/2addr p2, v0

    if-ne p2, v0, :cond_2

    invoke-static {v0}, Lo73/a;->y(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lg93/d;->a(I)I

    move-result p2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lg93/d;->f()I

    move-result p2

    ushr-int/lit8 p2, p2, 0x1

    rem-int v1, p2, v0

    sub-int/2addr p2, v1

    add-int/lit8 v2, v0, -0x1

    add-int/2addr v2, p2

    if-ltz v2, :cond_2

    move p2, v1

    :goto_1
    add-int/2addr p1, p2

    return p1
.end method
