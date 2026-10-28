.class public abstract Lxl/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[C

.field public static final b:I

.field public static final c:[C


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0xa

    new-array v1, v0, [C

    fill-array-data v1, :array_0

    sput-object v1, Lxl/b;->a:[C

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    const-wide/high16 v3, 0x4010000000000000L    # 4.0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-int v1, v1

    sput v1, Lxl/b;->b:I

    const/4 v2, 0x4

    mul-int/2addr v1, v2

    add-int/2addr v1, v0

    new-array v0, v1, [C

    sput-object v0, Lxl/b;->c:[C

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget v3, Lxl/b;->b:I

    if-ge v0, v3, :cond_0

    sget-object v3, Lxl/b;->c:[C

    invoke-static {v1, v2, v0, v3}, Lxl/b;->a(III[C)V

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
    .end array-data
.end method

.method public static a(III[C)V
    .locals 5

    add-int/lit8 v0, p0, 0xa

    neg-int p2, p2

    move v1, v0

    :goto_0
    const/16 v2, -0xa

    sget-object v3, Lxl/b;->a:[C

    if-gt p2, v2, :cond_0

    div-int/lit8 v2, p2, 0xa

    mul-int/lit8 v4, v2, 0xa

    sub-int/2addr p2, v4

    neg-int p2, p2

    add-int/lit8 v4, v1, -0x1

    aget-char p2, v3, p2

    aput-char p2, p3, v1

    move p2, v2

    move v1, v4

    goto :goto_0

    :cond_0
    neg-int p2, p2

    aget-char p2, v3, p2

    aput-char p2, p3, v1

    sub-int/2addr v0, v1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    if-ge v0, p1, :cond_1

    add-int/lit8 v1, v1, -0x1

    const/16 p2, 0x30

    aput-char p2, p3, v1

    goto :goto_1

    :cond_1
    invoke-static {p3, v1, p3, p0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static b(IILjava/lang/String;)I
    .locals 4

    const/4 v0, 0x0

    move v1, p0

    :goto_0
    if-ge v1, p1, :cond_1

    :try_start_0
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v3, 0x39

    if-gt v2, v3, :cond_0

    mul-int/lit8 v0, v0, 0xa

    add-int/lit8 v2, v2, -0x30

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0xa

    new-array p1, p1, [C

    fill-array-data p1, :array_0

    invoke-static {p2, v1, p1}, Lrg/a;->s(Ljava/lang/String;I[C)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/time/format/DateTimeParseException;

    const-string v0, "Unexpected end of input: "

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p2, p0}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p1

    :cond_1
    return v0

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
    .end array-data
.end method

.method public static c(III[C)V
    .locals 5

    sget v0, Lxl/b;->b:I

    if-ge p0, v0, :cond_3

    const/4 v0, 0x4

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int v2, p2, v1

    if-le p2, v0, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    rsub-int/lit8 v3, p2, 0x4

    :goto_0
    add-int v4, p1, v2

    mul-int/2addr p0, v0

    if-ge p2, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    add-int/2addr p0, v3

    sget-object p2, Lxl/b;->c:[C

    invoke-static {p2, p0, p3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez v2, :cond_2

    const/16 p0, 0x30

    invoke-static {p3, p1, v4, p0}, Ljava/util/Arrays;->fill([CIIC)V

    :cond_2
    return-void

    :cond_3
    invoke-static {p1, p2, p0, p3}, Lxl/b;->a(III[C)V

    return-void
.end method
