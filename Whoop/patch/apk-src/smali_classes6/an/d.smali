.class public final Lan/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/j;
.implements Lwm/k;
.implements Lt9/o;
.implements Lt9/q;
.implements Le9/i;
.implements Lto/n;
.implements Lxn/e;


# instance fields
.field public final synthetic w:I

.field public x:J

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lan/d;->w:I

    packed-switch p1, :pswitch_data_0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 20
    iput-wide v0, p0, Lan/d;->x:J

    return-void

    .line 21
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lan/d;->w:I

    iput-wide p1, p0, Lan/d;->x:J

    iput-object p3, p0, Lan/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lan/d;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/high16 v0, 0x10e0000

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    int-to-long v0, p1

    .line 7
    iput-wide v0, p0, Lan/d;->x:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    iput p4, p0, Lan/d;->w:I

    iput-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lan/d;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lne3/j0;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Lan/d;->w:I

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    const-wide/32 v0, 0x40000

    .line 10
    iput-wide v0, p0, Lan/d;->x:J

    return-void
.end method

.method public constructor <init>(Lt9/o;J)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, Lan/d;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    .line 17
    invoke-interface {p1}, Lt9/o;->getPosition()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lva3/g;->d(Z)V

    .line 18
    iput-wide p2, p0, Lan/d;->x:J

    return-void
.end method

.method public constructor <init>(Lwm/j;J)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lan/d;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    .line 13
    invoke-interface {p1}, Lwm/j;->getPosition()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->e(Z)V

    .line 14
    iput-wide p2, p0, Lan/d;->x:J

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public B()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public C(IZ)Z
    .locals 1

    iget-object p2, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p2, Lt9/o;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lt9/o;->C(IZ)Z

    move-result p1

    return p1
.end method

.method public D(JJ)J
    .locals 0

    iget-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p1, Lt9/i;

    iget p1, p1, Lt9/i;->a:I

    int-to-long p1, p1

    return-wide p1
.end method

.method public E(Lu2/r;F)J
    .locals 6

    iget-wide v0, p1, Lu2/r;->c:J

    iget-wide v2, p1, Lu2/r;->g:J

    invoke-static {v0, v1, v2, v3}, Lh2/b;->g(JJ)J

    move-result-wide v0

    iget-wide v2, p0, Lan/d;->x:J

    invoke-static {v2, v3, v0, v1}, Lh2/b;->h(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lan/d;->x:J

    iget-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p1, Lh0/d2;

    if-nez p1, :cond_0

    invoke-static {v0, v1}, Lh2/b;->d(J)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v1}, Lan/d;->K(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    :goto_0
    cmpl-float v0, v0, p2

    if-ltz v0, :cond_4

    if-nez p1, :cond_1

    iget-wide v0, p0, Lan/d;->x:J

    invoke-static {v0, v1}, Lh2/b;->d(J)F

    move-result p1

    invoke-static {p1, v0, v1}, Lh2/b;->b(FJ)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lh2/b;->i(FJ)J

    move-result-wide p1

    iget-wide v0, p0, Lan/d;->x:J

    invoke-static {v0, v1, p1, p2}, Lh2/b;->g(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_1
    iget-wide v0, p0, Lan/d;->x:J

    invoke-virtual {p0, v0, v1}, Lan/d;->K(J)F

    move-result v0

    iget-wide v1, p0, Lan/d;->x:J

    invoke-virtual {p0, v1, v2}, Lan/d;->K(J)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v1, p2

    sub-float/2addr v0, v1

    iget-wide v1, p0, Lan/d;->x:J

    sget-object p2, Lh0/d2;->x:Lh0/d2;

    const/16 v3, 0x20

    const-wide v4, 0xffffffffL

    if-ne p1, p2, :cond_2

    and-long/2addr v1, v4

    :goto_1
    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    goto :goto_2

    :cond_2
    shr-long/2addr v1, v3

    goto :goto_1

    :goto_2
    if-ne p1, p2, :cond_3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long/2addr p1, v3

    and-long/2addr v0, v4

    or-long/2addr p1, v0

    return-wide p1

    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long/2addr p1, v3

    and-long/2addr v0, v4

    or-long/2addr p1, v0

    return-wide p1

    :cond_4
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide p1
.end method

.method public F(I)V
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_1

    iget-object v1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lan/d;

    if-eqz v1, :cond_0

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lan/d;->F(I)V

    :cond_0
    return-void

    :cond_1
    iget-wide v0, p0, Lan/d;->x:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    not-long v2, v2

    and-long/2addr v0, v2

    iput-wide v0, p0, Lan/d;->x:J

    return-void
.end method

.method public G(I)I
    .locals 6

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lan/d;

    const/16 v1, 0x40

    const-wide/16 v2, 0x1

    if-nez v0, :cond_1

    if-lt p1, v1, :cond_0

    iget-wide v0, p0, Lan/d;->x:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Lan/d;->x:J

    shl-long v4, v2, p1

    sub-long/2addr v4, v2

    and-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_1
    if-ge p1, v1, :cond_2

    iget-wide v0, p0, Lan/d;->x:J

    shl-long v4, v2, p1

    sub-long/2addr v4, v2

    and-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_2
    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lan/d;->G(I)I

    move-result p1

    iget-wide v0, p0, Lan/d;->x:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public H()V
    .locals 2

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lan/d;

    if-nez v0, :cond_0

    new-instance v0, Lan/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lan/d;-><init>(I)V

    iput-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public I(I)Z
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lan/d;->H()V

    iget-object v1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lan/d;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lan/d;->I(I)Z

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Lan/d;->x:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public J(IZ)V
    .locals 9

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lan/d;->H()V

    iget-object v1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lan/d;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1, p2}, Lan/d;->J(IZ)V

    return-void

    :cond_0
    iget-wide v0, p0, Lan/d;->x:J

    const-wide/high16 v2, -0x8000000000000000L

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    const-wide/16 v5, 0x1

    shl-long v7, v5, p1

    sub-long/2addr v7, v5

    and-long v5, v0, v7

    not-long v7, v7

    and-long/2addr v0, v7

    shl-long/2addr v0, v4

    or-long/2addr v0, v5

    iput-wide v0, p0, Lan/d;->x:J

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lan/d;->N(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Lan/d;->F(I)V

    :goto_1
    if-nez v2, :cond_4

    iget-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p1, Lan/d;

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lan/d;->H()V

    iget-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p1, Lan/d;

    invoke-virtual {p1, v3, v2}, Lan/d;->J(IZ)V

    return-void
.end method

.method public K(J)F
    .locals 2

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lh0/d2;

    sget-object v1, Lh0/d2;->x:Lh0/d2;

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    :goto_0
    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1

    :cond_0
    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    goto :goto_0
.end method

.method public L(I)Z
    .locals 10

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lan/d;->H()V

    iget-object v1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lan/d;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lan/d;->L(I)Z

    move-result p1

    return p1

    :cond_0
    const-wide/16 v0, 0x1

    shl-long v2, v0, p1

    iget-wide v4, p0, Lan/d;->x:J

    and-long v6, v4, v2

    const-wide/16 v8, 0x0

    cmp-long p1, v6, v8

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz p1, :cond_1

    move p1, v6

    goto :goto_0

    :cond_1
    move p1, v7

    :goto_0
    not-long v8, v2

    and-long/2addr v4, v8

    iput-wide v4, p0, Lan/d;->x:J

    sub-long/2addr v2, v0

    and-long v0, v4, v2

    not-long v2, v2

    and-long/2addr v2, v4

    invoke-static {v2, v3, v6}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lan/d;->x:J

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lan/d;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v7}, Lan/d;->I(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Lan/d;->N(I)V

    :cond_2
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lan/d;

    invoke-virtual {v0, v7}, Lan/d;->L(I)Z

    :cond_3
    return p1
.end method

.method public M()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lan/d;->x:J

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lan/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lan/d;->M()V

    :cond_0
    return-void
.end method

.method public N(I)V
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lan/d;->H()V

    iget-object v1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lan/d;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lan/d;->N(I)V

    return-void

    :cond_0
    iget-wide v0, p0, Lan/d;->x:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lan/d;->x:J

    return-void
.end method

.method public O(Ljava/lang/Exception;)V
    .locals 4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Exception;

    if-nez v2, :cond_0

    iput-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    const-wide/16 v2, 0x64

    add-long/2addr v2, v0

    iput-wide v2, p0, Lan/d;->x:J

    :cond_0
    iget-wide v2, p0, Lan/d;->x:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    if-eq v0, p1, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    iget-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    const/4 v0, 0x0

    iput-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    throw p1

    :cond_2
    return-void
.end method

.method public a(J)J
    .locals 2

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/i;

    iget-object v0, v0, Lt9/i;->e:[J

    long-to-int p1, p1

    aget-wide p1, v0, p1

    iget-wide v0, p0, Lan/d;->x:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    iget-wide v0, p0, Lan/d;->x:J

    iget-object v2, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v2, Landroid/app/PendingIntent;

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    invoke-virtual {p1}, Luo/c;->c()V

    invoke-static {v2}, Luo/w;->f(Ljava/lang/Object;)V

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    const/4 v4, 0x1

    if-ltz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const-string v5, "detectionIntervalMillis must be >= 0"

    invoke-static {v3, v5}, Luo/w;->b(ZLjava/lang/String;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lnp/e;

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    sget v0, Lnp/l;->a:I

    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v3, v2}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 v0, 0x5

    invoke-virtual {p1, v3, v0}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public b(J)I
    .locals 2

    iget-wide v0, p0, Lan/d;->x:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public c([BIIZ)Z
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p2, Lt9/o;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0, p3, p4}, Lt9/o;->c([BIIZ)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1, p2, p3, p4}, Lwm/j;->c([BIIZ)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(J)Ljava/util/List;
    .locals 2

    iget-wide v0, p0, Lan/d;->x:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p1, Lzr/g0;

    return-object p1

    :cond_0
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    return-object p1
.end method

.method public e()V
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0}, Lt9/o;->e()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0}, Lwm/j;->e()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f([BIIZ)Z
    .locals 1

    iget p2, p0, Lan/d;->w:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p2, Lt9/o;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0, p3, p4}, Lt9/o;->f([BIIZ)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object p2, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p2, Lwm/j;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0, p3, p4}, Lwm/j;->f([BIIZ)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g()J
    .locals 4

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0}, Lt9/o;->g()J

    move-result-wide v0

    iget-wide v2, p0, Lan/d;->x:J

    :goto_0
    sub-long/2addr v0, v2

    return-wide v0

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0}, Lwm/j;->g()J

    move-result-wide v0

    iget-wide v2, p0, Lan/d;->x:J

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getLength()J
    .locals 4

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v0

    iget-wide v2, p0, Lan/d;->x:J

    :goto_0
    sub-long/2addr v0, v2

    return-wide v0

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0}, Lwm/j;->getLength()J

    move-result-wide v0

    iget-wide v2, p0, Lan/d;->x:J

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getPosition()J
    .locals 4

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Lan/d;->x:J

    :goto_0
    sub-long/2addr v0, v2

    return-wide v0

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0}, Lwm/j;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Lan/d;->x:J

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(I)J
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->e(Z)V

    iget-wide v0, p0, Lan/d;->x:J

    return-wide v0
.end method

.method public i(I)V
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0, p1}, Lt9/o;->i(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1}, Lwm/j;->i(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k(I)I
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0, p1}, Lt9/o;->k(I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1}, Lwm/j;->k(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/q;

    invoke-interface {v0}, Lt9/q;->l()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/k;

    invoke-interface {v0}, Lwm/k;->l()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public m([BII)I
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0, p1, p2, p3}, Lt9/o;->m([BII)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1, p2, p3}, Lwm/j;->m([BII)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public n(I)V
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0, p1}, Lt9/o;->n(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1}, Lwm/j;->n(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public o(II)Lt9/k0;
    .locals 1

    .line 2
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/q;

    invoke-interface {v0, p1, p2}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    return-object p1
.end method

.method public o(II)Lwm/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/k;

    invoke-interface {v0, p1, p2}, Lwm/k;->o(II)Lwm/s;

    move-result-object p1

    return-object p1
.end method

.method public p([BII)V
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0, p1, p2, p3}, Lt9/o;->p([BII)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1, p2, p3}, Lwm/j;->p([BII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public q(JJ)J
    .locals 0

    iget-object p3, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p3, Lt9/i;

    iget-object p3, p3, Lt9/i;->d:[J

    long-to-int p1, p1

    aget-wide p1, p3, p1

    return-wide p1
.end method

.method public r(JJ)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public read([BII)I
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0, p1, p2, p3}, Lu8/h;->read([BII)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1, p2, p3}, Lko/i;->read([BII)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public readFully([BII)V
    .locals 1

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/o;

    invoke-interface {v0, p1, p2, p3}, Lt9/o;->readFully([BII)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/j;

    invoke-interface {v0, p1, p2, p3}, Lwm/j;->readFully([BII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public s(JJ)J
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1
.end method

.method public t(J)Lf9/j;
    .locals 6

    new-instance v0, Lf9/j;

    iget-object v1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lt9/i;

    iget-object v2, v1, Lt9/i;->c:[J

    long-to-int p1, p1

    aget-wide v2, v2, p1

    iget-object p2, v1, Lt9/i;->b:[I

    aget p1, p2, p1

    int-to-long v4, p1

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lf9/j;-><init>(Ljava/lang/String;JJ)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lan/d;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lan/d;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lan/d;->x:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lan/d;

    invoke-virtual {v1}, Lan/d;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "xx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lan/d;->x:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public u(JJ)J
    .locals 2

    iget-object p3, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p3, Lt9/i;

    iget-wide v0, p0, Lan/d;->x:J

    add-long/2addr p1, v0

    iget-object p3, p3, Lt9/i;->e:[J

    const/4 p4, 0x1

    invoke-static {p3, p1, p2, p4}, Lx8/t;->d([JJZ)I

    move-result p1

    int-to-long p1, p1

    return-wide p1
.end method

.method public v(Lt9/e0;)V
    .locals 2

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lt9/q;

    new-instance v1, Lba/c;

    invoke-direct {v1, p0, p1, p1}, Lba/c;-><init>(Lan/d;Lt9/e0;Lt9/e0;)V

    invoke-interface {v0, v1}, Lt9/q;->v(Lt9/e0;)V

    return-void
.end method

.method public w(J)J
    .locals 0

    iget-object p1, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast p1, Lt9/i;

    iget p1, p1, Lt9/i;->a:I

    int-to-long p1, p1

    return-wide p1
.end method

.method public x(Lwm/p;)V
    .locals 2

    iget-object v0, p0, Lan/d;->y:Ljava/lang/Object;

    check-cast v0, Lwm/k;

    new-instance v1, Lan/e;

    invoke-direct {v1, p0, p1}, Lan/e;-><init>(Lan/d;Lwm/p;)V

    invoke-interface {v0, v1}, Lwm/k;->x(Lwm/p;)V

    return-void
.end method
