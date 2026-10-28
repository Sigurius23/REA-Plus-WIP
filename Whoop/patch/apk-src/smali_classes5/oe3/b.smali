.class public abstract Loe3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[C

.field public static final b:[B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Loe3/b;->a:[C

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Loe3/b;->b:[B

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
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static final a(C)I
    .locals 3

    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v1, 0x3a

    if-ge p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x67

    if-ge p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p0, :cond_2

    const/16 v0, 0x47

    if-ge p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected hex digit: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Lne3/j0;Lne3/l;IJJ)J
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, Lne3/j0;->x:Lne3/h;

    const-string v3, "bytes"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lne3/l;->d()I

    move-result v3

    int-to-long v4, v3

    const/4 v3, 0x0

    int-to-long v6, v3

    move/from16 v3, p2

    int-to-long v8, v3

    invoke-static/range {v4 .. v9}, Lne3/b;->e(JJJ)V

    iget-boolean v4, v0, Lne3/j0;->y:Z

    if-nez v4, :cond_7

    move v7, v3

    move-wide/from16 v3, p3

    :goto_0
    move-wide/from16 v5, p5

    invoke-static/range {v1 .. v7}, Loe3/a;->a(Lne3/h;Lne3/l;JJI)J

    move-result-wide v10

    const-wide/16 v5, -0x1

    cmp-long v7, v10, v5

    if-eqz v7, :cond_0

    return-wide v10

    :cond_0
    iget-wide v10, v1, Lne3/h;->x:J

    sub-long v12, v10, v8

    const-wide/16 v14, 0x1

    add-long/2addr v12, v14

    cmp-long v7, v12, p5

    if-ltz v7, :cond_2

    :cond_1
    move-wide/from16 p3, v5

    goto :goto_3

    :cond_2
    cmp-long v7, v10, p5

    if-gez v7, :cond_3

    move-wide/from16 p3, v5

    goto :goto_2

    :cond_3
    sub-long v10, v10, p5

    add-long/2addr v10, v14

    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    long-to-int v7, v10

    iget-wide v10, v1, Lne3/h;->x:J

    sub-long/2addr v10, v3

    add-long/2addr v10, v14

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    long-to-int v10, v10

    add-int/lit8 v10, v10, -0x1

    if-gt v7, v10, :cond_1

    :goto_1
    iget-wide v14, v1, Lne3/h;->x:J

    move-wide/from16 p3, v5

    int-to-long v5, v10

    sub-long/2addr v14, v5

    invoke-virtual {v1, v10, v14, v15, v2}, Lne3/h;->T(IJLne3/l;)Z

    move-result v5

    if-eqz v5, :cond_5

    :goto_2
    iget-object v5, v0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v6, 0x2000

    invoke-interface {v5, v1, v6, v7}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v5

    cmp-long v5, v5, p3

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move/from16 v7, p2

    goto :goto_0

    :cond_5
    if-eq v10, v7, :cond_6

    add-int/lit8 v10, v10, -0x1

    move-wide/from16 v5, p3

    goto :goto_1

    :cond_6
    :goto_3
    return-wide p3

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c(Lne3/m0;I)I
    .locals 4

    iget-object v0, p0, Lne3/m0;->G:[I

    add-int/lit8 p1, p1, 0x1

    iget-object p0, p0, Lne3/m0;->F:[[B

    array-length p0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p0, p0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, p0, :cond_1

    add-int v2, v1, p0

    ushr-int/lit8 v2, v2, 0x1

    aget v3, v0, v2

    if-ge v3, p1, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    if-le v3, p1, :cond_2

    add-int/lit8 p0, v2, -0x1

    goto :goto_0

    :cond_1
    neg-int p0, v1

    add-int/lit8 v2, p0, -0x1

    :cond_2
    if-ltz v2, :cond_3

    return v2

    :cond_3
    not-int p0, v2

    return p0
.end method
