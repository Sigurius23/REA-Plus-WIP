.class public final Laf3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Laf3/t;Laf3/t;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Laf3/u;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Laf3/u;->x:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Laf3/u;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/cache/tape/d;Lio/sentry/cache/tape/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Laf3/u;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf3/u;->y:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Laf3/u;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwa3/e;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Laf3/u;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    .line 8
    :goto_0
    instance-of v0, p1, Lwa3/z;

    if-eqz v0, :cond_0

    .line 9
    check-cast p1, Lwa3/z;

    .line 10
    iget-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    iget-object p1, p1, Lwa3/z;->y:Lwa3/e;

    goto :goto_0

    .line 12
    :cond_0
    check-cast p1, Lwa3/u;

    .line 13
    iput-object p1, p0, Laf3/u;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lwa3/u;
    .locals 4

    iget-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Stack;

    iget-object v1, p0, Laf3/u;->y:Ljava/lang/Object;

    check-cast v1, Lwa3/u;

    if-eqz v1, :cond_3

    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/z;

    iget-object v2, v2, Lwa3/z;->z:Lwa3/e;

    :goto_1
    instance-of v3, v2, Lwa3/z;

    if-eqz v3, :cond_1

    check-cast v2, Lwa3/z;

    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v2, Lwa3/z;->y:Lwa3/e;

    goto :goto_1

    :cond_1
    check-cast v2, Lwa3/u;

    iget-object v3, v2, Lwa3/u;->x:[B

    array-length v3, v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_2
    iput-object v0, p0, Laf3/u;->y:Ljava/lang/Object;

    return-object v1

    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Laf3/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laf3/u;->y:Ljava/lang/Object;

    check-cast v0, Lwa3/u;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/tape/h;

    invoke-virtual {v0}, Lio/sentry/cache/tape/h;->hasNext()Z

    move-result v0

    return v0

    :pswitch_1
    iget-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    check-cast v0, Laf3/t;

    if-eqz v0, :cond_1

    iget-object v1, p0, Laf3/u;->y:Ljava/lang/Object;

    check-cast v1, Laf3/t;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Laf3/u;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Laf3/u;->a()Lwa3/u;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/tape/h;

    invoke-virtual {v0}, Lio/sentry/cache/tape/h;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iget-object v1, p0, Laf3/u;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/cache/tape/d;

    iget-object v1, v1, Lio/sentry/cache/tape/d;->y:Lio/sentry/cache/tape/e;

    invoke-interface {v1, v0}, Lio/sentry/cache/tape/e;->i([B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    check-cast v0, Laf3/t;

    iget-object v1, v0, Laf3/t;->e:Laf3/t;

    iput-object v1, p0, Laf3/u;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Laf3/u;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Laf3/u;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/tape/h;

    invoke-virtual {v0}, Lio/sentry/cache/tape/h;->remove()V

    return-void

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
