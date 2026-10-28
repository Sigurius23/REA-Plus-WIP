.class public abstract Li6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public w:I

.field public x:I

.field public y:I

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lqt/e;->x:Lqt/e;

    if-nez v0, :cond_0

    new-instance v0, Lqt/e;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lqt/e;->x:Lqt/e;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    iget v0, p0, Li6/c;->y:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget v1, p0, Li6/c;->x:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    iget v0, v0, Ln83/f;->H:I

    iget v1, p0, Li6/c;->y:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public c()V
    .locals 3

    :goto_0
    iget v0, p0, Li6/c;->w:I

    iget-object v1, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v1, Ln83/f;

    iget v2, v1, Ln83/f;->F:I

    if-ge v0, v2, :cond_0

    iget-object v1, v1, Ln83/f;->y:[I

    aget v1, v1, v0

    if-gez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Li6/c;->w:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Li6/c;->w:I

    iget-object v1, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v1, Ln83/f;

    iget v1, v1, Ln83/f;->F:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public remove()V
    .locals 3

    iget-object v0, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {p0}, Li6/c;->b()V

    iget v1, p0, Li6/c;->x:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Ln83/f;->c()V

    iget v1, p0, Li6/c;->x:I

    invoke-virtual {v0, v1}, Ln83/f;->m(I)V

    iput v2, p0, Li6/c;->x:I

    iget v0, v0, Ln83/f;->H:I

    iput v0, p0, Li6/c;->y:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing element from the iterator."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
