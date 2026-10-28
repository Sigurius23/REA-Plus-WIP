.class public final Lt1/g;
.super Lt1/a;
.source "SourceFile"


# instance fields
.field public final y:[Ljava/lang/Object;

.field public final z:Lt1/k;


# direct methods
.method public constructor <init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt1/a;-><init>(II)V

    iput-object p5, p0, Lt1/g;->y:[Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x1

    and-int/lit8 p2, p2, -0x20

    if-le p1, p2, :cond_0

    move p1, p2

    :cond_0
    new-instance p5, Lt1/k;

    invoke-direct {p5, p4, p1, p2, p3}, Lt1/k;-><init>([Ljava/lang/Object;III)V

    iput-object p5, p0, Lt1/g;->z:Lt1/k;

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lt1/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt1/g;->z:Lt1/k;

    invoke-virtual {v0}, Lt1/a;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lt1/a;->w:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lt1/a;->w:I

    invoke-virtual {v0}, Lt1/k;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget v1, p0, Lt1/a;->w:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lt1/a;->w:I

    iget v0, v0, Lt1/a;->x:I

    sub-int/2addr v1, v0

    iget-object v0, p0, Lt1/g;->y:[Ljava/lang/Object;

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lt1/a;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lt1/a;->w:I

    iget-object v1, p0, Lt1/g;->z:Lt1/k;

    iget v2, v1, Lt1/a;->x:I

    if-le v0, v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lt1/a;->w:I

    sub-int/2addr v0, v2

    iget-object v1, p0, Lt1/g;->y:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lt1/a;->w:I

    invoke-virtual {v1}, Lt1/k;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
