.class public final Lm83/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/e0;Lz1/c0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lm83/h0;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lm83/h0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lm83/h0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm83/i0;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm83/h0;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lm83/h0;->y:Ljava/lang/Object;

    .line 7
    iget-object v0, p1, Lm83/i0;->w:Ljava/util/ArrayList;

    .line 8
    invoke-static {p2, p1}, Lm83/s;->n0(ILjava/util/List;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, p0, Lm83/h0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm83/j0;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm83/h0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm83/h0;->y:Ljava/lang/Object;

    .line 3
    iget-object v0, p1, Lm83/j0;->w:Ljava/util/List;

    .line 4
    invoke-static {p2, p1}, Lm83/s;->n0(ILjava/util/List;)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, p0, Lm83/h0;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot modify a state list through an iterator"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 3

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget v0, v0, Lkotlin/jvm/internal/e0;->w:I

    iget-object v1, p0, Lm83/h0;->y:Ljava/lang/Object;

    check-cast v1, Lz1/c0;

    iget v1, v1, Lz1/c0;->z:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2

    :pswitch_0
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 1

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget v0, v0, Lkotlin/jvm/internal/e0;->w:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget v1, v0, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lm83/h0;->y:Ljava/lang/Object;

    check-cast v2, Lz1/c0;

    iget v3, v2, Lz1/c0;->z:I

    invoke-static {v1, v3}, Lz1/q;->a(II)V

    iput v1, v0, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v2, v1}, Lz1/c0;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 2

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget v0, v0, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v0, v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Lm83/h0;->y:Ljava/lang/Object;

    check-cast v0, Lm83/j0;

    iget-object v1, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->previousIndex()I

    move-result v1

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    sub-int/2addr v0, v1

    return v0

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->y:Ljava/lang/Object;

    check-cast v0, Lm83/i0;

    iget-object v1, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->previousIndex()I

    move-result v1

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    sub-int/2addr v0, v1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget v1, v0, Lkotlin/jvm/internal/e0;->w:I

    iget-object v2, p0, Lm83/h0;->y:Ljava/lang/Object;

    check-cast v2, Lz1/c0;

    iget v3, v2, Lz1/c0;->z:I

    invoke-static {v1, v3}, Lz1/q;->a(II)V

    add-int/lit8 v3, v1, -0x1

    iput v3, v0, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v2, v1}, Lz1/c0;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 2

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget v0, v0, Lkotlin/jvm/internal/e0;->w:I

    return v0

    :pswitch_0
    iget-object v0, p0, Lm83/h0;->y:Ljava/lang/Object;

    check-cast v0, Lm83/j0;

    iget-object v1, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    sub-int/2addr v0, v1

    return v0

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->y:Ljava/lang/Object;

    check-cast v0, Lm83/i0;

    iget-object v1, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    sub-int/2addr v0, v1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot modify a state list through an iterator"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lm83/h0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot modify a state list through an iterator"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iget-object v0, p0, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
