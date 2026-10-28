.class public final Lzr/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lzr/u;

.field public w:I

.field public x:I

.field public y:I

.field public final synthetic z:Lzr/u;


# direct methods
.method public constructor <init>(Lzr/u;I)V
    .locals 0

    iput p2, p0, Lzr/r;->E:I

    iput-object p1, p0, Lzr/r;->F:Lzr/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzr/r;->z:Lzr/u;

    iget p2, p1, Lzr/u;->E:I

    iput p2, p0, Lzr/r;->w:I

    invoke-virtual {p1}, Lzr/u;->isEmpty()Z

    move-result p1

    const/4 p2, -0x1

    if-eqz p1, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lzr/r;->x:I

    iput p2, p0, Lzr/r;->y:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lzr/r;->x:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lzr/r;->z:Lzr/u;

    iget v1, v0, Lzr/u;->E:I

    iget v2, p0, Lzr/r;->w:I

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, Lzr/r;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lzr/r;->x:I

    iput v1, p0, Lzr/r;->y:I

    iget v2, p0, Lzr/r;->E:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, p0, Lzr/r;->F:Lzr/u;

    invoke-virtual {v2}, Lzr/u;->k()[Ljava/lang/Object;

    move-result-object v2

    aget-object v1, v2, v1

    goto :goto_0

    :pswitch_0
    new-instance v2, Lzr/t;

    iget-object v3, p0, Lzr/r;->F:Lzr/u;

    invoke-direct {v2, v3, v1}, Lzr/t;-><init>(Lzr/u;I)V

    move-object v1, v2

    goto :goto_0

    :pswitch_1
    iget-object v2, p0, Lzr/r;->F:Lzr/u;

    invoke-virtual {v2}, Lzr/u;->j()[Ljava/lang/Object;

    move-result-object v2

    aget-object v1, v2, v1

    :goto_0
    iget v2, p0, Lzr/r;->x:I

    add-int/lit8 v2, v2, 0x1

    iget v0, v0, Lzr/u;->F:I

    if-ge v2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, -0x1

    :goto_1
    iput v2, p0, Lzr/r;->x:I

    return-object v1

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 5

    iget-object v0, p0, Lzr/r;->z:Lzr/u;

    iget v1, v0, Lzr/u;->E:I

    iget v2, p0, Lzr/r;->w:I

    if-ne v1, v2, :cond_2

    iget v1, p0, Lzr/r;->y:I

    const/4 v3, 0x1

    if-ltz v1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    add-int/lit8 v2, v2, 0x20

    iput v2, p0, Lzr/r;->w:I

    invoke-virtual {v0}, Lzr/u;->j()[Ljava/lang/Object;

    move-result-object v2

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Lzr/u;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lzr/r;->x:I

    sub-int/2addr v0, v3

    iput v0, p0, Lzr/r;->x:I

    const/4 v0, -0x1

    iput v0, p0, Lzr/r;->y:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no calls to next() since the last call to remove()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method
