.class public La0/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La0/i1;->w:I

    iput-object p1, p0, La0/i1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlinx/serialization/internal/EnumDescriptor;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La0/i1;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, La0/i1;->y:Ljava/lang/Object;

    .line 8
    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result p1

    iput p1, p0, La0/i1;->x:I

    return-void
.end method

.method public constructor <init>(Lyc3/g;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La0/i1;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, La0/i1;->y:Ljava/lang/Object;

    .line 5
    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result p1

    iput p1, p0, La0/i1;->x:I

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La0/i1;->w:I

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/i1;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, La0/i1;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/i1;->x:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget v0, p0, La0/i1;->x:I

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :pswitch_1
    iget v0, p0, La0/i1;->x:I

    iget-object v1, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v1, Lm83/e;

    invoke-virtual {v1}, Lm83/a;->a()I

    move-result v1

    if-ge v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    :pswitch_2
    iget v0, p0, La0/i1;->x:I

    iget-object v1, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    return v0

    :pswitch_3
    iget v0, p0, La0/i1;->x:I

    iget-object v1, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v1, La0/g1;

    invoke-virtual {v1}, La0/g1;->g()I

    move-result v1

    if-ge v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, La0/i1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v0, Lkotlinx/serialization/internal/EnumDescriptor;

    invoke-interface {v0}, Lyc3/g;->getElementsCount()I

    move-result v1

    iget v2, p0, La0/i1;->x:I

    add-int/lit8 v3, v2, -0x1

    iput v3, p0, La0/i1;->x:I

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v0, Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->getElementsCount()I

    move-result v1

    iget v2, p0, La0/i1;->x:I

    add-int/lit8 v3, v2, -0x1

    iput v3, p0, La0/i1;->x:I

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v0, Lm83/e;

    iget v1, p0, La0/i1;->x:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La0/i1;->x:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_2
    :try_start_0
    iget-object v0, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget v1, p0, La0/i1;->x:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La0/i1;->x:I

    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget v1, p0, La0/i1;->x:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La0/i1;->x:I

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_3
    iget-object v0, p0, La0/i1;->y:Ljava/lang/Object;

    check-cast v0, La0/g1;

    iget v1, p0, La0/i1;->x:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La0/i1;->x:I

    invoke-virtual {v0, v1}, La0/g1;->h(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, La0/i1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
