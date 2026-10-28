.class public abstract Lrc3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lrc3/b;->a:[I

    return-void

    :array_0
    .array-data 4
        0x1
        0xa
        0x64
        0x3e8
        0x2710
        0x186a0
        0xf4240
        0x989680
        0x5f5e100
        0x3b9aca00
    .end array-data
.end method

.method public static final a(Li93/k;)I
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li93/k;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const v0, 0x7fffffff

    :try_start_0
    iget-wide v1, p0, Li93/k;->x:J

    iget-wide v3, p0, Li93/k;->w:J

    neg-long v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->addExact(JJ)J

    move-result-wide v1

    iget-wide v3, p0, Li93/k;->y:J

    div-long/2addr v1, v3
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    const-wide/32 v3, 0x7fffffff

    cmp-long p0, v1, v3

    if-lez p0, :cond_1

    return v0

    :cond_1
    const-wide/32 v3, -0x80000000

    cmp-long p0, v1, v3

    if-gez p0, :cond_2

    const/high16 p0, -0x80000000

    return p0

    :cond_2
    long-to-int p0, v1

    return p0

    :catch_0
    return v0
.end method

.method public static final b(C)Z
    .locals 2

    const/16 v0, 0x30

    const/4 v1, 0x0

    if-gt v0, p0, :cond_0

    const/16 v0, 0x3a

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public static final c(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc

    add-int/2addr p0, v1

    if-lt v0, p0, :cond_4

    const-string p0, "+-"

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {p0, v2, v0}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const/16 p0, 0x2d

    const/4 v2, 0x4

    const/4 v3, 0x1

    invoke-static {p1, p0, v3, v0, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result p0

    if-ge p0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-ne v4, v5, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    sub-int v0, p0, v0

    if-lt v0, v1, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 p0, p0, -0xa

    invoke-static {v3, p0, p1}, Lyb3/r;->r0(IILjava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    return-object p1
.end method
