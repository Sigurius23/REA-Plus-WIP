.class public final Ld/z;
.super Ld/a;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public d:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ld/z;->c:I

    invoke-direct {p0}, Ld/a;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld/s;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ld/z;->c:I

    invoke-direct {p0, p1}, Ld/a;-><init>(Ld/s;)V

    return-void
.end method

.method public synthetic constructor <init>([Ld/q;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Ld/z;->c:I

    invoke-direct {p0, p1}, Ld/a;-><init>([Ld/q;)V

    return-void
.end method

.method public synthetic constructor <init>([Ld/q;[Ld/q;)V
    .locals 1

    .line 4
    const/4 v0, 0x1

    iput v0, p0, Ld/z;->c:I

    invoke-direct {p0, p1, p2}, Ld/a;-><init>([Ld/q;[Ld/q;)V

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 6

    iget v0, p0, Ld/z;->c:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ld/z;->d:I

    if-gez v0, :cond_1

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4}, Ld/q;->d()Ld/b1;

    move-result-object v4

    invoke-virtual {v4}, Ld/b1;->k()Ld/b1;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ld/b1;->c(Z)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v3, p0, Ld/z;->d:I

    :cond_1
    iget v0, p0, Ld/z;->d:I

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1

    :pswitch_0
    iget v0, p0, Ld/z;->d:I

    if-gez v0, :cond_3

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v4, v0, v2

    invoke-interface {v4}, Ld/q;->d()Ld/b1;

    move-result-object v4

    invoke-virtual {v4}, Ld/b1;->j()Ld/b1;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ld/b1;->c(Z)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    iput v3, p0, Ld/z;->d:I

    :cond_3
    iget v0, p0, Ld/z;->d:I

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lro/i;Z)V
    .locals 8

    iget v0, p0, Ld/z;->c:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x31

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    invoke-virtual {p1}, Lro/i;->l()Ld/z0;

    move-result-object p2

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v1, v0

    iget v2, p0, Ld/z;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gez v2, :cond_2

    const/16 v5, 0x10

    if-le v1, v5, :cond_0

    goto :goto_2

    :cond_0
    new-array v2, v1, [Ld/b1;

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v5, v1, :cond_1

    aget-object v7, v0, v5

    invoke-interface {v7}, Ld/q;->d()Ld/b1;

    move-result-object v7

    invoke-virtual {v7}, Ld/b1;->k()Ld/b1;

    move-result-object v7

    aput-object v7, v2, v5

    invoke-virtual {v7, v3}, Ld/b1;->c(Z)I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iput v6, p0, Ld/z;->d:I

    invoke-virtual {p1, v6}, Lro/i;->d(I)V

    :goto_1
    if-ge v4, v1, :cond_5

    aget-object p1, v2, v4

    invoke-virtual {p2, p1}, Ld/z0;->I(Ld/b1;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-gez v2, :cond_4

    array-length v2, v0

    move v5, v4

    move v6, v5

    :goto_3
    if-ge v5, v2, :cond_3

    aget-object v7, v0, v5

    invoke-interface {v7}, Ld/q;->d()Ld/b1;

    move-result-object v7

    invoke-virtual {v7}, Ld/b1;->k()Ld/b1;

    move-result-object v7

    invoke-virtual {v7, v3}, Ld/b1;->c(Z)I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_3
    iput v6, p0, Ld/z;->d:I

    :cond_4
    iget v2, p0, Ld/z;->d:I

    invoke-virtual {p1, v2}, Lro/i;->d(I)V

    :goto_4
    if-ge v4, v1, :cond_5

    aget-object p1, v0, v4

    invoke-interface {p1}, Ld/q;->d()Ld/b1;

    move-result-object p1

    invoke-virtual {p2, p1}, Ld/z0;->I(Ld/b1;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    return-void

    :pswitch_0
    const/16 v0, 0x31

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    invoke-virtual {p1}, Lro/i;->c()Ld/r;

    move-result-object p2

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v1, v0

    iget v2, p0, Ld/z;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gez v2, :cond_8

    const/16 v5, 0x10

    if-le v1, v5, :cond_6

    goto :goto_7

    :cond_6
    new-array v2, v1, [Ld/b1;

    move v5, v3

    move v6, v5

    :goto_5
    if-ge v5, v1, :cond_7

    aget-object v7, v0, v5

    invoke-interface {v7}, Ld/q;->d()Ld/b1;

    move-result-object v7

    invoke-virtual {v7}, Ld/b1;->j()Ld/b1;

    move-result-object v7

    aput-object v7, v2, v5

    invoke-virtual {v7, v4}, Ld/b1;->c(Z)I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_7
    iput v6, p0, Ld/z;->d:I

    invoke-virtual {p1, v6}, Lro/i;->d(I)V

    :goto_6
    if-ge v3, v1, :cond_b

    aget-object p1, v2, v3

    invoke-virtual {p1, p2, v4}, Ld/b1;->f(Lro/i;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_8
    :goto_7
    if-gez v2, :cond_a

    array-length v2, v0

    move v5, v3

    move v6, v5

    :goto_8
    if-ge v5, v2, :cond_9

    aget-object v7, v0, v5

    invoke-interface {v7}, Ld/q;->d()Ld/b1;

    move-result-object v7

    invoke-virtual {v7}, Ld/b1;->j()Ld/b1;

    move-result-object v7

    invoke-virtual {v7, v4}, Ld/b1;->c(Z)I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_9
    iput v6, p0, Ld/z;->d:I

    :cond_a
    iget v2, p0, Ld/z;->d:I

    invoke-virtual {p1, v2}, Lro/i;->d(I)V

    :goto_9
    if-ge v3, v1, :cond_b

    aget-object p1, v0, v3

    invoke-interface {p1}, Ld/q;->d()Ld/b1;

    move-result-object p1

    invoke-virtual {p1}, Ld/b1;->j()Ld/b1;

    move-result-object p1

    invoke-virtual {p1, p2, v4}, Ld/b1;->f(Lro/i;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j()Ld/b1;
    .locals 1

    iget v0, p0, Ld/z;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ld/a;->j()Ld/b1;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld/a;->b:[Ld/q;

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ld/a;->j()Ld/b1;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Ld/b1;
    .locals 1

    iget v0, p0, Ld/z;->c:I

    return-object p0
.end method
