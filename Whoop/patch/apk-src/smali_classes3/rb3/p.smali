.class public final Lrb3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lrb3/p;->w:I

    iput-object p1, p0, Lrb3/p;->y:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrb3/p;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lrb3/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lrb3/p;->x:Z

    return v0

    :pswitch_0
    iget-boolean v0, p0, Lrb3/p;->x:Z

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrb3/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lrb3/p;->x:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrb3/p;->x:Z

    iget-object v0, p0, Lrb3/p;->y:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    iget-boolean v0, p0, Lrb3/p;->x:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrb3/p;->x:Z

    iget-object v0, p0, Lrb3/p;->y:Ljava/lang/Object;

    check-cast v0, Lrb3/q;

    iget-object v0, v0, Lrb3/q;->w:Llb3/g;

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lrb3/p;->w:I

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

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
