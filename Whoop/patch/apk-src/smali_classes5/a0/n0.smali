.class public final La0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public y:I


# direct methods
.method public constructor <init>(Ljava/util/List;II)V
    .locals 0

    iput p3, p0, La0/n0;->w:I

    packed-switch p3, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/n0;->x:Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, La0/n0;->y:I

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/n0;->x:Ljava/lang/Object;

    iput p2, p0, La0/n0;->y:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/n0;->x:Ljava/lang/Object;

    iget v1, p0, La0/n0;->y:I

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget p1, p0, La0/n0;->y:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La0/n0;->y:I

    return-void

    :pswitch_0
    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 3

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget v0, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 1

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/n0;->y:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget v0, p0, La0/n0;->y:I

    if-ltz v0, :cond_1

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
    .locals 2

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 1

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/n0;->y:I

    return v0

    :pswitch_0
    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v0, v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 1

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v0, v0, -0x1

    return v0

    :pswitch_0
    iget v0, p0, La0/n0;->y:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La0/n0;->y:I

    iget-object v1, p0, La0/n0;->x:Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, La0/n0;->x:Ljava/lang/Object;

    iget v1, p0, La0/n0;->y:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget v0, p0, La0/n0;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La0/n0;->y:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, La0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/n0;->x:Ljava/lang/Object;

    iget v1, p0, La0/n0;->y:I

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, La0/n0;->x:Ljava/lang/Object;

    iget v1, p0, La0/n0;->y:I

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
