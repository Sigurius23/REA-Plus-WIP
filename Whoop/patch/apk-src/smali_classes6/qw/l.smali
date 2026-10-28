.class public abstract Lqw/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic E:Ljava/util/AbstractMap;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/util/Map$Entry;

.field public z:Ljava/util/Map$Entry;


# direct methods
.method public constructor <init>(Lqw/n;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lqw/l;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    .line 2
    iget-object v0, p1, Lqw/n;->F:Lqw/m;

    iget-object v0, v0, Lqw/m;->z:Lqw/m;

    iput-object v0, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    .line 4
    iget p1, p1, Lqw/n;->E:I

    iput p1, p0, Lqw/l;->x:I

    return-void
.end method

.method public constructor <init>(Lqx/h0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lqw/l;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    .line 6
    iget-object v0, p1, Lqx/h0;->y:Lqx/g0;

    iget-object v0, v0, Lqx/g0;->z:Lqx/g0;

    iput-object v0, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    .line 8
    iget p1, p1, Lqx/h0;->E:I

    iput p1, p0, Lqw/l;->x:I

    return-void
.end method


# virtual methods
.method public a()Lqw/m;
    .locals 3

    iget-object v0, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    check-cast v0, Lqw/m;

    iget-object v1, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    check-cast v1, Lqw/n;

    iget-object v2, v1, Lqw/n;->F:Lqw/m;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lqw/n;->E:I

    iget v2, p0, Lqw/l;->x:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lqw/m;->z:Lqw/m;

    iput-object v1, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    iput-object v0, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public b()Lqx/g0;
    .locals 3

    iget-object v0, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    check-cast v0, Lqx/g0;

    iget-object v1, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    check-cast v1, Lqx/h0;

    iget-object v2, v1, Lqx/h0;->y:Lqx/g0;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lqx/h0;->E:I

    iget v2, p0, Lqw/l;->x:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lqx/g0;->z:Lqx/g0;

    iput-object v1, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    iput-object v0, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lqw/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    check-cast v0, Lqx/g0;

    iget-object v1, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    check-cast v1, Lqx/h0;

    iget-object v1, v1, Lqx/h0;->y:Lqx/g0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, Lqw/l;->y:Ljava/util/Map$Entry;

    check-cast v0, Lqw/m;

    iget-object v1, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    check-cast v1, Lqw/n;

    iget-object v1, v1, Lqw/n;->F:Lqw/m;

    if-eq v0, v1, :cond_1

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

.method public next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqw/l;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lqw/l;->b()Lqx/g0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lqw/l;->a()Lqw/m;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    iget v0, p0, Lqw/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    check-cast v0, Lqx/h0;

    iget-object v1, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    check-cast v1, Lqx/g0;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lqx/h0;->c(Lqx/g0;Z)V

    const/4 v1, 0x0

    iput-object v1, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    iget v0, v0, Lqx/h0;->E:I

    iput v0, p0, Lqw/l;->x:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lqw/l;->E:Ljava/util/AbstractMap;

    check-cast v0, Lqw/n;

    iget-object v1, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    check-cast v1, Lqw/m;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lqw/n;->c(Lqw/m;Z)V

    const/4 v1, 0x0

    iput-object v1, p0, Lqw/l;->z:Ljava/util/Map$Entry;

    iget v0, v0, Lqw/n;->E:I

    iput v0, p0, Lqw/l;->x:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
