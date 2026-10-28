.class public final Le9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/j;
.implements Lun/c;


# instance fields
.field public final E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final x:J

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(JLjava/util/List;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Le9/k;->w:I

    .line 6
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-wide v0, p0, Le9/k;->x:J

    const-wide/16 v0, -0x1

    .line 9
    iput-wide v0, p0, Le9/k;->y:J

    .line 10
    iput-wide p1, p0, Le9/k;->z:J

    .line 11
    iput-object p3, p0, Le9/k;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le9/j;JJ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le9/k;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p2, p0, Le9/k;->x:J

    .line 3
    iput-wide p4, p0, Le9/k;->y:J

    const-wide/16 p4, 0x1

    sub-long/2addr p2, p4

    .line 4
    iput-wide p2, p0, Le9/k;->z:J

    .line 5
    iput-object p1, p0, Le9/k;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()J
    .locals 5

    iget v0, p0, Le9/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Le9/k;->y:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    iget-wide v2, p0, Le9/k;->x:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    iget-wide v2, p0, Le9/k;->z:J

    iget-object v4, p0, Le9/k;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    long-to-int v0, v0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/h;

    iget-wide v0, v0, Lwn/h;->E:J

    add-long/2addr v2, v0

    return-wide v2

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    iget-wide v0, p0, Le9/k;->z:J

    iget-wide v2, p0, Le9/k;->x:J

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    iget-wide v2, p0, Le9/k;->y:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    iget-object v2, p0, Le9/k;->E:Ljava/lang/Object;

    check-cast v2, Le9/j;

    invoke-virtual {v2, v0, v1}, Le9/j;->f(J)J

    move-result-wide v0

    return-wide v0

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

.method public final e()J
    .locals 5

    iget v0, p0, Le9/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Le9/k;->y:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    iget-wide v2, p0, Le9/k;->x:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    iget-object v2, p0, Le9/k;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    long-to-int v0, v0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/h;

    iget-wide v1, p0, Le9/k;->z:J

    iget-wide v3, v0, Lwn/h;->E:J

    add-long/2addr v1, v3

    iget-wide v3, v0, Lwn/h;->y:J

    add-long/2addr v1, v3

    return-wide v1

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    iget-wide v0, p0, Le9/k;->z:J

    iget-wide v2, p0, Le9/k;->x:J

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    iget-wide v2, p0, Le9/k;->y:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    iget-object v2, p0, Le9/k;->E:Ljava/lang/Object;

    check-cast v2, Le9/j;

    invoke-virtual {v2, v0, v1}, Le9/j;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Z
    .locals 4

    iget v0, p0, Le9/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Le9/k;->y:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Le9/k;->y:J

    iget-wide v2, p0, Le9/k;->x:J

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    return v0

    :pswitch_0
    iget-wide v0, p0, Le9/k;->z:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Le9/k;->z:J

    iget-wide v2, p0, Le9/k;->y:J

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    xor-int/2addr v0, v1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
