.class public final La0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La0/u0;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, La0/t0;->w:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, La0/t0;->z:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 18
    iput v0, p0, La0/t0;->x:I

    .line 19
    new-instance v0, La0/s0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, La0/s0;-><init>(La0/u0;La0/t0;Lq83/d;)V

    invoke-static {v0}, Lv63/c;->i(Lc93/m;)Lxb3/j;

    move-result-object p1

    iput-object p1, p0, La0/t0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La0/y0;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, La0/t0;->w:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, La0/t0;->z:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 14
    iput v0, p0, La0/t0;->x:I

    .line 15
    new-instance v0, La0/x0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, La0/x0;-><init>(La0/y0;La0/t0;Lq83/d;)V

    invoke-static {v0}, Lv63/c;->i(Lc93/m;)Lxb3/j;

    move-result-object p1

    iput-object p1, p0, La0/t0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La0/t0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/t0;->y:Ljava/lang/Object;

    .line 2
    iput-object p2, p0, La0/t0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxb3/o;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La0/t0;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, La0/t0;->z:Ljava/lang/Object;

    .line 5
    iget-object p1, p1, Lxb3/o;->b:Lxb3/i;

    check-cast p1, Lxb3/g;

    .line 6
    new-instance v0, Lxb3/e;

    invoke-direct {v0, p1}, Lxb3/e;-><init>(Lxb3/g;)V

    .line 7
    iput-object v0, p0, La0/t0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxb3/p;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La0/t0;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, La0/t0;->z:Ljava/lang/Object;

    .line 10
    iget-object p1, p1, Lxb3/p;->a:Lxb3/i;

    .line 11
    invoke-interface {p1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, La0/t0;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 5

    iget v0, p0, La0/t0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, La0/t0;->z:Ljava/lang/Object;

    check-cast v0, Lxb3/p;

    iget-object v1, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    :goto_0
    iget v2, p0, La0/t0;->x:I

    iget v3, v0, Lxb3/p;->b:I

    const/4 v4, 0x1

    if-ge v2, v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v2, p0, La0/t0;->x:I

    add-int/2addr v2, v4

    iput v2, p0, La0/t0;->x:I

    goto :goto_0

    :cond_0
    iget v2, p0, La0/t0;->x:I

    iget v0, v0, Lxb3/p;->c:I

    if-ge v2, v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    return v4

    :pswitch_1
    iget v0, p0, La0/t0;->x:I

    iget-object v1, p0, La0/t0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    :pswitch_2
    iget-object v0, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v0, Lxb3/j;

    invoke-virtual {v0}, Lxb3/j;->hasNext()Z

    move-result v0

    return v0

    :pswitch_3
    iget-object v0, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v0, Lxb3/j;

    invoke-virtual {v0}, Lxb3/j;->hasNext()Z

    move-result v0

    return v0

    nop

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

    iget v0, p0, La0/t0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/t0;->z:Ljava/lang/Object;

    check-cast v0, Lxb3/o;

    iget-object v0, v0, Lxb3/o;->c:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget v1, p0, La0/t0;->x:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La0/t0;->x:I

    if-ltz v1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :pswitch_0
    iget-object v0, p0, La0/t0;->z:Ljava/lang/Object;

    check-cast v0, Lxb3/p;

    iget-object v1, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    :goto_0
    iget v2, p0, La0/t0;->x:I

    iget v3, v0, Lxb3/p;->b:I

    if-ge v2, v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v2, p0, La0/t0;->x:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, La0/t0;->x:I

    goto :goto_0

    :cond_1
    iget v2, p0, La0/t0;->x:I

    iget v0, v0, Lxb3/p;->c:I

    if-ge v2, v0, :cond_2

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, La0/t0;->x:I

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_1
    invoke-virtual {p0}, La0/t0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, La0/t0;->y:Ljava/lang/Object;

    iget v1, p0, La0/t0;->x:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La0/t0;->x:I

    iget-object v1, p0, La0/t0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    check-cast v1, Lv1/a;

    iget-object v1, v1, Lv1/a;->b:Ljava/lang/Object;

    iput-object v1, p0, La0/t0;->y:Ljava/lang/Object;

    return-object v0

    :cond_3
    new-instance v1, Ljava/util/ConcurrentModificationException;

    const-string v2, "Hash code of an element ("

    const-string v3, ") has changed after it was added to the persistent set."

    invoke-static {v0, v2, v3}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_2
    iget-object v0, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v0, Lxb3/j;

    invoke-virtual {v0}, Lxb3/j;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, La0/t0;->y:Ljava/lang/Object;

    check-cast v0, Lxb3/j;

    invoke-virtual {v0}, Lxb3/j;->next()Ljava/lang/Object;

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
    .locals 3

    iget v0, p0, La0/t0;->w:I

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
    iget v0, p0, La0/t0;->x:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, La0/t0;->z:Ljava/lang/Object;

    check-cast v2, La0/y0;

    iget-object v2, v2, La0/y0;->x:La0/w0;

    invoke-virtual {v2, v0}, La0/w0;->m(I)V

    iput v1, p0, La0/t0;->x:I

    :cond_0
    return-void

    :pswitch_3
    iget v0, p0, La0/t0;->x:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v2, p0, La0/t0;->z:Ljava/lang/Object;

    check-cast v2, La0/u0;

    iget-object v2, v2, La0/u0;->x:La0/r0;

    invoke-virtual {v2, v0}, La0/r0;->h(I)V

    iput v1, p0, La0/t0;->x:I

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
