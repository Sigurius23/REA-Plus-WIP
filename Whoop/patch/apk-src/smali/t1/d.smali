.class public final Lt1/d;
.super Lt1/a;
.source "SourceFile"


# instance fields
.field public final y:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(II[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt1/a;-><init>(II)V

    iput-object p3, p0, Lt1/d;->y:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lt1/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lt1/a;->w:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lt1/a;->w:I

    iget-object v1, p0, Lt1/d;->y:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lt1/a;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lt1/a;->w:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lt1/a;->w:I

    iget-object v1, p0, Lt1/d;->y:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
