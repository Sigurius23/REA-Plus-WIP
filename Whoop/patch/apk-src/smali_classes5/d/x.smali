.class public final Ld/x;
.super Ld/h1;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public c:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ld/x;->b:I

    invoke-direct {p0}, Ld/h1;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld/b1;I)V
    .locals 0

    .line 3
    iput p2, p0, Ld/x;->b:I

    invoke-direct {p0, p1}, Ld/h1;-><init>(Ld/b1;)V

    return-void
.end method

.method public synthetic constructor <init>(Ld/s;I)V
    .locals 0

    .line 2
    iput p2, p0, Ld/x;->b:I

    invoke-direct {p0, p1}, Ld/h1;-><init>(Ld/s;)V

    return-void
.end method

.method public constructor <init>([Ld/q;I)V
    .locals 0

    iput p2, p0, Ld/x;->b:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Ld/h1;->a:[Ld/q;

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 5

    iget v0, p0, Ld/x;->b:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ld/x;->c:I

    if-gez v0, :cond_1

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Ld/h1;->a:[Ld/q;

    aget-object v3, v3, v1

    invoke-interface {v3}, Ld/q;->d()Ld/b1;

    move-result-object v3

    invoke-virtual {v3}, Ld/b1;->k()Ld/b1;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ld/b1;->c(Z)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v2, p0, Ld/x;->c:I

    :cond_1
    iget v0, p0, Ld/x;->c:I

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1

    :pswitch_0
    iget v0, p0, Ld/x;->c:I

    if-gez v0, :cond_3

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v3, p0, Ld/h1;->a:[Ld/q;

    aget-object v3, v3, v1

    invoke-interface {v3}, Ld/q;->d()Ld/b1;

    move-result-object v3

    invoke-virtual {v3}, Ld/b1;->j()Ld/b1;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ld/b1;->c(Z)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iput v2, p0, Ld/x;->c:I

    :cond_3
    iget v0, p0, Ld/x;->c:I

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
    .locals 7

    iget v0, p0, Ld/x;->b:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x30

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    invoke-virtual {p1}, Lro/i;->l()Ld/z0;

    move-result-object p2

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v1, v0

    iget v2, p0, Ld/x;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gez v2, :cond_2

    const/16 v5, 0x10

    if-le v1, v5, :cond_0

    goto :goto_2

    :cond_0
    new-array v0, v1, [Ld/b1;

    move v2, v4

    move v5, v2

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v6, p0, Ld/h1;->a:[Ld/q;

    aget-object v6, v6, v2

    invoke-interface {v6}, Ld/q;->d()Ld/b1;

    move-result-object v6

    invoke-virtual {v6}, Ld/b1;->k()Ld/b1;

    move-result-object v6

    aput-object v6, v0, v2

    invoke-virtual {v6, v3}, Ld/b1;->c(Z)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput v5, p0, Ld/x;->c:I

    invoke-virtual {p1, v5}, Lro/i;->d(I)V

    :goto_1
    if-ge v4, v1, :cond_5

    aget-object p1, v0, v4

    invoke-virtual {p2, p1}, Ld/z0;->I(Ld/b1;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-gez v2, :cond_4

    array-length v0, v0

    move v2, v4

    move v5, v2

    :goto_3
    if-ge v2, v0, :cond_3

    iget-object v6, p0, Ld/h1;->a:[Ld/q;

    aget-object v6, v6, v2

    invoke-interface {v6}, Ld/q;->d()Ld/b1;

    move-result-object v6

    invoke-virtual {v6}, Ld/b1;->k()Ld/b1;

    move-result-object v6

    invoke-virtual {v6, v3}, Ld/b1;->c(Z)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    iput v5, p0, Ld/x;->c:I

    :cond_4
    iget v0, p0, Ld/x;->c:I

    invoke-virtual {p1, v0}, Lro/i;->d(I)V

    :goto_4
    if-ge v4, v1, :cond_5

    iget-object p1, p0, Ld/h1;->a:[Ld/q;

    aget-object p1, p1, v4

    invoke-interface {p1}, Ld/q;->d()Ld/b1;

    move-result-object p1

    invoke-virtual {p2, p1}, Ld/z0;->I(Ld/b1;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    return-void

    :pswitch_0
    const/16 v0, 0x30

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    invoke-virtual {p1}, Lro/i;->c()Ld/r;

    move-result-object p2

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v1, v0

    iget v2, p0, Ld/x;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gez v2, :cond_8

    const/16 v5, 0x10

    if-le v1, v5, :cond_6

    goto :goto_7

    :cond_6
    new-array v0, v1, [Ld/b1;

    move v2, v3

    move v5, v2

    :goto_5
    if-ge v2, v1, :cond_7

    iget-object v6, p0, Ld/h1;->a:[Ld/q;

    aget-object v6, v6, v2

    invoke-interface {v6}, Ld/q;->d()Ld/b1;

    move-result-object v6

    invoke-virtual {v6}, Ld/b1;->j()Ld/b1;

    move-result-object v6

    aput-object v6, v0, v2

    invoke-virtual {v6, v4}, Ld/b1;->c(Z)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_7
    iput v5, p0, Ld/x;->c:I

    invoke-virtual {p1, v5}, Lro/i;->d(I)V

    :goto_6
    if-ge v3, v1, :cond_b

    aget-object p1, v0, v3

    invoke-virtual {p1, p2, v4}, Ld/b1;->f(Lro/i;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_8
    :goto_7
    if-gez v2, :cond_a

    array-length v0, v0

    move v2, v3

    move v5, v2

    :goto_8
    if-ge v2, v0, :cond_9

    iget-object v6, p0, Ld/h1;->a:[Ld/q;

    aget-object v6, v6, v2

    invoke-interface {v6}, Ld/q;->d()Ld/b1;

    move-result-object v6

    invoke-virtual {v6}, Ld/b1;->j()Ld/b1;

    move-result-object v6

    invoke-virtual {v6, v4}, Ld/b1;->c(Z)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_9
    iput v5, p0, Ld/x;->c:I

    :cond_a
    iget v0, p0, Ld/x;->c:I

    invoke-virtual {p1, v0}, Lro/i;->d(I)V

    :goto_9
    if-ge v3, v1, :cond_b

    iget-object p1, p0, Ld/h1;->a:[Ld/q;

    aget-object p1, p1, v3

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

    iget v0, p0, Ld/x;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ld/h1;->j()Ld/b1;

    move-result-object v0

    return-object v0

    :pswitch_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Ld/b1;
    .locals 1

    iget v0, p0, Ld/x;->b:I

    return-object p0
.end method

.method public final p()Ld/g;
    .locals 3

    iget v0, p0, Ld/x;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld/o0;

    invoke-virtual {p0}, Ld/h1;->n()[Ld/g;

    move-result-object v1

    invoke-static {v1}, Ld/t;->m([Ld/g;)[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld/o0;-><init>([BI)V

    return-object v0

    :pswitch_0
    new-instance v0, Ld/o0;

    invoke-virtual {p0}, Ld/h1;->n()[Ld/g;

    move-result-object v1

    invoke-static {v1}, Ld/t;->m([Ld/g;)[B

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld/o0;-><init>([BI)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q()Ld/x0;
    .locals 5

    iget v0, p0, Ld/x;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld/l;

    iget-object v1, p0, Ld/h1;->a:[Ld/q;

    array-length v1, v1

    new-array v2, v1, [Ld/x0;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, p0, Ld/h1;->a:[Ld/q;

    aget-object v4, v4, v3

    invoke-static {v4}, Ld/x0;->l(Ld/q;)Ld/x0;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ld/a0;->m([Ld/x0;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ld/x0;-><init>([B)V

    return-object v0

    :pswitch_0
    new-instance v0, Ld/l;

    iget-object v1, p0, Ld/h1;->a:[Ld/q;

    array-length v1, v1

    new-array v2, v1, [Ld/x0;

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    iget-object v4, p0, Ld/h1;->a:[Ld/q;

    aget-object v4, v4, v3

    invoke-static {v4}, Ld/x0;->l(Ld/q;)Ld/x0;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ld/a0;->m([Ld/x0;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ld/x0;-><init>([B)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
