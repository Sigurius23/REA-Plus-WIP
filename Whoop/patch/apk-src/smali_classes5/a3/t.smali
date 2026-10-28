.class public final La3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Ld93/a;


# instance fields
.field public final E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(La3/v;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La3/t;->w:I

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    move p2, v0

    .line 1
    :cond_0
    iget-object p3, p1, La3/v;->w:La0/q0;

    .line 2
    iget p3, p3, La0/q0;->b:I

    .line 3
    invoke-direct {p0, p1, p2, v0, p3}, La3/t;-><init>(La3/v;III)V

    return-void
.end method

.method public constructor <init>(La3/v;III)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La3/t;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/t;->E:Ljava/lang/Object;

    .line 5
    iput p2, p0, La3/t;->x:I

    .line 6
    iput p3, p0, La3/t;->y:I

    .line 7
    iput p4, p0, La3/t;->z:I

    return-void
.end method

.method public constructor <init>(Ln83/a;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La3/t;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, La3/t;->E:Ljava/lang/Object;

    .line 10
    iput p2, p0, La3/t;->x:I

    const/4 p2, -0x1

    .line 11
    iput p2, p0, La3/t;->y:I

    .line 12
    invoke-static {p1}, Ln83/a;->d(Ln83/a;)I

    move-result p1

    iput p1, p0, La3/t;->z:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v0, Ln83/a;

    iget-object v0, v0, Ln83/a;->E:Ln83/c;

    invoke-static {v0}, Ln83/c;->d(Ln83/c;)I

    move-result v0

    iget v1, p0, La3/t;->z:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, La3/t;->a()V

    iget-object v0, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v0, Ln83/a;

    iget v1, p0, La3/t;->x:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La3/t;->x:I

    invoke-virtual {v0, v1, p1}, Ln83/a;->add(ILjava/lang/Object;)V

    const/4 p1, -0x1

    iput p1, p0, La3/t;->y:I

    invoke-static {v0}, Ln83/a;->d(Ln83/a;)I

    move-result p1

    iput p1, p0, La3/t;->z:I

    return-void

    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La3/t;->x:I

    iget-object v1, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v1, Ln83/a;

    iget v1, v1, Ln83/a;->y:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget v0, p0, La3/t;->x:I

    iget v1, p0, La3/t;->z:I

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 2

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La3/t;->x:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget v0, p0, La3/t;->x:I

    iget v1, p0, La3/t;->y:I

    if-le v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, La3/t;->a()V

    iget v0, p0, La3/t;->x:I

    iget-object v1, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v1, Ln83/a;

    iget v2, v1, Ln83/a;->y:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, La3/t;->x:I

    iput v0, p0, La3/t;->y:I

    iget-object v2, v1, Ln83/a;->w:[Ljava/lang/Object;

    iget v1, v1, Ln83/a;->x:I

    add-int/2addr v1, v0

    aget-object v0, v2, v1

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v0, La3/v;

    iget-object v0, v0, La3/v;->w:La0/q0;

    iget v1, p0, La3/t;->x:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La3/t;->x:I

    invoke-virtual {v0, v1}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb2/v;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 2

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La3/t;->x:I

    return v0

    :pswitch_0
    iget v0, p0, La3/t;->x:I

    iget v1, p0, La3/t;->y:I

    sub-int/2addr v0, v1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, La3/t;->a()V

    iget v0, p0, La3/t;->x:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La3/t;->x:I

    iput v0, p0, La3/t;->y:I

    iget-object v1, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v1, Ln83/a;

    iget-object v2, v1, Ln83/a;->w:[Ljava/lang/Object;

    iget v1, v1, Ln83/a;->x:I

    add-int/2addr v1, v0

    aget-object v0, v2, v1

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v0, La3/v;

    iget-object v0, v0, La3/v;->w:La0/q0;

    iget v1, p0, La3/t;->x:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La3/t;->x:I

    invoke-virtual {v0, v1}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb2/v;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 2

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La3/t;->x:I

    :goto_0
    add-int/lit8 v0, v0, -0x1

    return v0

    :pswitch_0
    iget v0, p0, La3/t;->x:I

    iget v1, p0, La3/t;->y:I

    sub-int/2addr v0, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v0, Ln83/a;

    invoke-virtual {p0}, La3/t;->a()V

    iget v1, p0, La3/t;->y:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, v1}, Ln83/a;->c(I)Ljava/lang/Object;

    iget v1, p0, La3/t;->y:I

    iput v1, p0, La3/t;->x:I

    iput v2, p0, La3/t;->y:I

    invoke-static {v0}, Ln83/a;->d(Ln83/a;)I

    move-result v0

    iput v0, p0, La3/t;->z:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() or previous() before removing element from the iterator."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, La3/t;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, La3/t;->a()V

    iget v0, p0, La3/t;->y:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, La3/t;->E:Ljava/lang/Object;

    check-cast v1, Ln83/a;

    invoke-virtual {v1, v0, p1}, Ln83/a;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Call next() or previous() before replacing element from the iterator."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
