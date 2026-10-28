.class public final La0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, La0/i;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/4 v0, 0x7

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/2addr v0, v2

    :cond_0
    add-int/lit8 v1, v0, -0x1

    .line 6
    iput v1, p0, La0/i;->d:I

    .line 7
    new-array v0, v0, [I

    iput-object v0, p0, La0/i;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La0/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(II[FI)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, La0/i;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La0/i;->b:I

    iput p2, p0, La0/i;->c:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La0/i;->e:Ljava/lang/Object;

    array-length p1, p3

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    aget v0, p3, p2

    iget-object v1, p0, La0/i;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iput p4, p0, La0/i;->d:I

    return-void
.end method


# virtual methods
.method public a(Lqx/g0;)V
    .locals 6

    const/4 v0, 0x0

    iput-object v0, p1, Lqx/g0;->y:Lqx/g0;

    iput-object v0, p1, Lqx/g0;->w:Lqx/g0;

    iput-object v0, p1, Lqx/g0;->x:Lqx/g0;

    const/4 v0, 0x1

    iput v0, p1, Lqx/g0;->I:I

    iget v1, p0, La0/i;->b:I

    if-lez v1, :cond_0

    iget v2, p0, La0/i;->d:I

    and-int/lit8 v3, v2, 0x1

    if-nez v3, :cond_0

    add-int/2addr v2, v0

    iput v2, p0, La0/i;->d:I

    sub-int/2addr v1, v0

    iput v1, p0, La0/i;->b:I

    iget v1, p0, La0/i;->c:I

    add-int/2addr v1, v0

    iput v1, p0, La0/i;->c:I

    :cond_0
    iget-object v1, p0, La0/i;->e:Ljava/lang/Object;

    check-cast v1, Lqx/g0;

    iput-object v1, p1, Lqx/g0;->w:Lqx/g0;

    iput-object p1, p0, La0/i;->e:Ljava/lang/Object;

    iget p1, p0, La0/i;->d:I

    add-int/lit8 v1, p1, 0x1

    iput v1, p0, La0/i;->d:I

    iget v2, p0, La0/i;->b:I

    const/4 v3, 0x2

    if-lez v2, :cond_1

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    add-int/2addr p1, v3

    iput p1, p0, La0/i;->d:I

    sub-int/2addr v2, v0

    iput v2, p0, La0/i;->b:I

    iget p1, p0, La0/i;->c:I

    add-int/2addr p1, v0

    iput p1, p0, La0/i;->c:I

    :cond_1
    const/4 p1, 0x4

    :goto_0
    iget v1, p0, La0/i;->d:I

    add-int/lit8 v2, p1, -0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget v1, p0, La0/i;->c:I

    if-nez v1, :cond_2

    iget-object v1, p0, La0/i;->e:Ljava/lang/Object;

    check-cast v1, Lqx/g0;

    iget-object v2, v1, Lqx/g0;->w:Lqx/g0;

    iget-object v4, v2, Lqx/g0;->w:Lqx/g0;

    iget-object v5, v4, Lqx/g0;->w:Lqx/g0;

    iput-object v5, v2, Lqx/g0;->w:Lqx/g0;

    iput-object v2, p0, La0/i;->e:Ljava/lang/Object;

    iput-object v4, v2, Lqx/g0;->x:Lqx/g0;

    iput-object v1, v2, Lqx/g0;->y:Lqx/g0;

    iget v5, v1, Lqx/g0;->I:I

    add-int/2addr v5, v0

    iput v5, v2, Lqx/g0;->I:I

    iput-object v2, v4, Lqx/g0;->w:Lqx/g0;

    iput-object v2, v1, Lqx/g0;->w:Lqx/g0;

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    if-ne v1, v0, :cond_3

    iget-object v1, p0, La0/i;->e:Ljava/lang/Object;

    check-cast v1, Lqx/g0;

    iget-object v4, v1, Lqx/g0;->w:Lqx/g0;

    iput-object v4, p0, La0/i;->e:Ljava/lang/Object;

    iput-object v1, v4, Lqx/g0;->y:Lqx/g0;

    iget v5, v1, Lqx/g0;->I:I

    add-int/2addr v5, v0

    iput v5, v4, Lqx/g0;->I:I

    iput-object v4, v1, Lqx/g0;->w:Lqx/g0;

    iput v2, p0, La0/i;->c:I

    goto :goto_1

    :cond_3
    if-ne v1, v3, :cond_4

    iput v2, p0, La0/i;->c:I

    :cond_4
    :goto_1
    mul-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_5
    return-void
.end method

.method public b(I)V
    .locals 6

    iget-object v0, p0, La0/i;->e:Ljava/lang/Object;

    check-cast v0, [I

    iget v1, p0, La0/i;->c:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iget p1, p0, La0/i;->d:I

    and-int/2addr p1, v1

    iput p1, p0, La0/i;->c:I

    iget v1, p0, La0/i;->b:I

    if-ne p1, v1, :cond_1

    array-length p1, v0

    sub-int v2, p1, v1

    shl-int/lit8 v3, p1, 0x1

    if-ltz v3, :cond_0

    new-array v4, v3, [I

    const/4 v5, 0x0

    invoke-static {v5, v1, v0, v4, p1}, Lm83/n;->e0(II[I[II)V

    iget-object v0, p0, La0/i;->e:Ljava/lang/Object;

    check-cast v0, [I

    iget v1, p0, La0/i;->b:I

    invoke-static {v2, v5, v0, v4, v1}, Lm83/n;->e0(II[I[II)V

    iput-object v4, p0, La0/i;->e:Ljava/lang/Object;

    iput v5, p0, La0/i;->b:I

    iput p1, p0, La0/i;->c:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, La0/i;->d:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Max array capacity exceeded"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public c()I
    .locals 2

    iget v0, p0, La0/i;->d:I

    iget v1, p0, La0/i;->c:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public d()J
    .locals 5

    iget v0, p0, La0/i;->c:I

    if-eqz v0, :cond_0

    iget-object v1, p0, La0/i;->e:Ljava/lang/Object;

    check-cast v1, [J

    iget v2, p0, La0/i;->b:I

    aget-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    iget v1, p0, La0/i;->d:I

    and-int/2addr v1, v2

    iput v1, p0, La0/i;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La0/i;->c:I

    return-wide v3

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, La0/i;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, ""

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
