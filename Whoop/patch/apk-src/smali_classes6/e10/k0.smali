.class public Le10/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le53/c;
.implements Leu/d;
.implements Le9/i;
.implements Lfi/c;
.implements Lto/n;
.implements Lc4/i0;
.implements Lq3/r;
.implements Lbh3/g;
.implements Lgl/i;
.implements Lh9/c;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Le10/k0;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 3
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    return-void

    .line 6
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Lcom/mapbox/maps/l;

    const/16 v0, 0x1c

    invoke-direct {p1, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    iput-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    return-void

    .line 8
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Lgf/c;

    invoke-direct {p1}, Lgf/c;-><init>()V

    .line 10
    iput-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    return-void

    .line 11
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_2
        0x16 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
    .locals 2

    const/16 v0, 0x1b

    iput v0, p0, Le10/k0;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Landroid/view/GestureDetector;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    iput-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le53/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Le10/k0;->w:I

    const-string v0, "tokenRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lfp/a;Lgp/r;)V
    .locals 0

    const/16 p1, 0xf

    iput p1, p0, Le10/k0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le10/k0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh20/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le10/k0;->w:I

    const-string v0, "prefsRepositoryFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Le10/k0;->w:I

    iput-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final H()V
    .locals 0

    return-void
.end method

.method private final I()V
    .locals 0

    return-void
.end method

.method public static synthetic o(Le10/k0;Led3/b;I)V
    .locals 1

    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {p0, p1, p2, v0}, Le10/k0;->m(Led3/b;ILdd3/b;)V

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

.method public C()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;
    .locals 1

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    return-object v0
.end method

.method public D(JJ)J
    .locals 0

    const-wide/16 p1, 0x1

    return-wide p1
.end method

.method public E()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lu8/f;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public F()J
    .locals 7

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Magnifier;

    invoke-virtual {v0}, Landroid/widget/Magnifier;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/Magnifier;->getHeight()I

    move-result v0

    int-to-long v1, v1

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    int-to-long v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long v0, v1, v3

    return-wide v0
.end method

.method public G()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public J(I[B)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, -0x1

    if-ge v0, p1, :cond_0

    iget-object v1, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/io/InputStream;

    sub-int v3, p1, v0

    invoke-virtual {v1, p2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;

    invoke-direct {p1}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    return v0
.end method

.method public K(Lg9/d;)V
    .locals 0

    return-void
.end method

.method public L(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public M(Lu8/p;)I
    .locals 6

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-static {v0}, Lu8/d0;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p1, p1, Lu8/p;->n:Ljava/lang/String;

    sget v0, Lx8/t;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x1

    const/4 v5, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "image/png"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x6

    goto :goto_0

    :sswitch_1
    const-string v2, "image/bmp"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x5

    goto :goto_0

    :sswitch_2
    const-string v2, "image/webp"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move v5, v3

    goto :goto_0

    :sswitch_3
    const-string v2, "image/jpeg"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x3

    goto :goto_0

    :sswitch_4
    const-string v2, "image/heif"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_5
    const-string v2, "image/heic"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    move v5, v4

    goto :goto_0

    :sswitch_6
    const-string v2, "image/avif"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    move v5, v1

    :goto_0
    packed-switch v5, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const/16 p1, 0x1a

    if-lt v0, p1, :cond_8

    goto :goto_1

    :pswitch_1
    const/16 p1, 0x22

    if-lt v0, p1, :cond_8

    :goto_1
    :pswitch_2
    invoke-static {v3, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_8
    :goto_2
    invoke-static {v4, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_9
    :goto_3
    invoke-static {v1, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x58abd7ba -> :sswitch_6
        -0x58a8e8f5 -> :sswitch_5
        -0x58a8e8f2 -> :sswitch_4
        -0x58a7d764 -> :sswitch_3
        -0x58a21830 -> :sswitch_2
        -0x3468a12f -> :sswitch_1
        -0x34686c8b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public N()V
    .locals 3

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lgf/c;

    new-instance v1, Lgf/a;

    const-string v2, "rpc.system"

    invoke-direct {v1, v2}, Lgf/a;-><init>(Ljava/lang/String;)V

    const-string v2, "aws-api"

    invoke-virtual {v0, v1, v2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method

.method public O(JJ)V
    .locals 2

    iget-object p3, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p3, Landroid/widget/Magnifier;

    const/16 p4, 0x20

    shr-long v0, p1, p4

    long-to-int p4, v0

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p4

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {p3, p4, p1}, Landroid/widget/Magnifier;->show(FF)V

    return-void
.end method

.method public P([B)V
    .locals 5

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Led3/b;

    array-length v1, p1

    invoke-static {p0, v0, v1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    array-length v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, v1}, Led3/b;->b(I)V

    iget-object v2, v0, Led3/b;->a:[B

    iget v3, v0, Led3/b;->b:I

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, p1, v2}, Lm83/n;->c0(III[B[B)V

    iget p1, v0, Led3/b;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Led3/b;->b:I

    return-void
.end method

.method public Q(IILdd3/b;)V
    .locals 2

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Led3/b;

    sget-object v1, Ldd3/b;->z:Ldd3/b;

    if-ne p3, v1, :cond_0

    sget-object v1, Led3/l;->H:Led3/l;

    goto :goto_0

    :cond_0
    sget-object v1, Led3/l;->E:Led3/l;

    :goto_0
    invoke-virtual {v1, p2}, Led3/l;->a(I)I

    move-result p2

    invoke-static {p0, v0, p2}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    invoke-virtual {p0, v0, p1, p3}, Le10/k0;->m(Led3/b;ILdd3/b;)V

    return-void
.end method

.method public R(Led3/b;)V
    .locals 5

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Led3/b;

    iget v1, p1, Led3/b;->b:I

    invoke-static {p0, v0, v1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    iget v1, p1, Led3/b;->b:I

    invoke-virtual {v0, v1}, Led3/b;->b(I)V

    iget-object p1, p1, Led3/b;->a:[B

    iget-object v2, v0, Led3/b;->a:[B

    iget v3, v0, Led3/b;->b:I

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, p1, v2}, Lm83/n;->c0(III[B[B)V

    iget p1, v0, Led3/b;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Led3/b;->b:I

    return-void
.end method

.method public a(J)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lmp/k1;

    check-cast p2, Lcq/i;

    new-instance v0, Lv7/a;

    invoke-direct {v0, p2}, Lv7/a;-><init>(Lcq/i;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lmp/l1;

    iget-object p2, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p2, Lgp/r;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    iget-object v2, p1, Lmp/l1;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    sget v2, Lmp/k;->a:I

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Lgp/r;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    :try_start_0
    iget-object p1, p1, Lmp/l1;->f:Landroid/os/IBinder;

    invoke-interface {p1, v0, v1, p2, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {p2}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    throw p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Le10/k0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbh3/a;

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lxg3/k;

    invoke-virtual {v0}, Lxg3/k;->a()Lxg3/j;

    move-result-object v0

    new-instance v1, Lch3/y;

    invoke-direct {v1, p1, v0}, Lch3/y;-><init>(Lbh3/a;Lxg3/j;)V

    invoke-virtual {v0, v1}, Lxg3/j;->c(Lbh3/a;)Lxg3/t;

    return-object v0

    :pswitch_0
    check-cast p1, Lbh3/a;

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Leh3/i;

    iget-object v0, v0, Leh3/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leh3/g;

    iget v1, v0, Leh3/g;->a:I

    if-nez v1, :cond_0

    sget-object v0, Leh3/i;->c:Leh3/h;

    goto :goto_0

    :cond_0
    iget-object v2, v0, Leh3/g;->b:[Leh3/h;

    iget-wide v3, v0, Leh3/g;->c:J

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    iput-wide v5, v0, Leh3/g;->c:J

    int-to-long v0, v1

    rem-long/2addr v3, v0

    long-to-int v0, v3

    aget-object v0, v2, v0

    :goto_0
    const-wide/16 v1, -0x1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, v1, v2, v3}, Leh3/k;->f(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Leh3/p;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public c()I
    .locals 2

    invoke-virtual {p0}, Le10/k0;->h()S

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Le10/k0;->h()S

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public d()V
    .locals 1

    iget v0, p0, Le10/k0;->w:I

    return-void
.end method

.method public dispose()V
    .locals 2

    invoke-virtual {p0}, Le10/k0;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/j0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public e(Ls83/c;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Le53/d;

    iget-object p1, p1, Le53/d;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public f(Lup/b;)V
    .locals 1

    iget v0, p0, Le10/k0;->w:I

    packed-switch v0, :pswitch_data_0

    if-nez p1, :cond_0

    iget-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Lup/b;

    invoke-virtual {p1}, Lup/b;->d()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "New GoogleMap unexpectedly set while an animation was still running"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lup/a;

    invoke-virtual {p1, v0}, Lup/b;->c(Lup/a;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public g()Lbc3/i0;
    .locals 1

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/j0;

    return-object v0
.end method

.method public h()S
    .locals 2

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    int-to-short v0, v0

    return v0

    :cond_0
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V

    throw v0
.end method

.method public i(Ly3/k;JLy3/m;J)J
    .locals 8

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/j;

    iget-wide v0, v0, Ly3/j;->a:J

    iget v2, p1, Ly3/k;->a:I

    const/16 v3, 0x20

    shr-long v4, v0, v3

    long-to-int v4, v4

    add-int/2addr v2, v4

    shr-long v4, p5, v3

    long-to-int v4, v4

    shr-long v5, p2, v3

    long-to-int v5, v5

    sget-object v6, Ly3/m;->w:Ly3/m;

    const/4 v7, 0x1

    if-ne p4, v6, :cond_0

    move p4, v7

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-static {v2, v4, v5, p4}, Lbp/b;->f(IIIZ)I

    move-result p4

    iget p1, p1, Ly3/k;->b:I

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    long-to-int v0, v0

    add-int/2addr p1, v0

    and-long/2addr p5, v4

    long-to-int p5, p5

    and-long/2addr p2, v4

    long-to-int p2, p2

    invoke-static {p1, p5, p2, v7}, Lbp/b;->f(IIIZ)I

    move-result p1

    int-to-long p2, p4

    shl-long/2addr p2, v3

    int-to-long p4, p1

    and-long/2addr p4, v4

    or-long p1, p2, p4

    return-wide p1
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/j0;

    invoke-virtual {v0}, Lbc3/t1;->isActive()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j(Lg9/d;)V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lex/a;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, v0, Lex/a;->y:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public l(Lu2/k;)J
    .locals 9

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewConfiguration;

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    move-result v0

    neg-float v0, v0

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    new-instance v2, Lh2/b;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4}, Lh2/b;-><init>(J)V

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    iget-wide v5, v2, Lh2/b;->a:J

    if-ge v4, v3, :cond_0

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    iget-wide v7, v2, Lu2/r;->j:J

    invoke-static {v5, v6, v7, v8}, Lh2/b;->h(JJ)J

    move-result-wide v5

    new-instance v2, Lh2/b;

    invoke-direct {v2, v5, v6}, Lh2/b;-><init>(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x20

    shr-long v2, v5, p1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    mul-float/2addr v2, v0

    const-wide v3, 0xffffffffL

    and-long/2addr v5, v3

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    mul-float/2addr v0, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    shl-long v0, v1, p1

    and-long v2, v5, v3

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public m(Led3/b;ILdd3/b;)V
    .locals 2

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    if-eqz p3, :cond_3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 p1, 0x2

    if-ne p3, p1, :cond_0

    iget-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Led3/b;

    invoke-static {p2}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result p2

    invoke-virtual {p1, p2}, Led3/b;->c(I)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    shl-int/lit8 p3, p2, 0x1

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, p3

    const/4 p3, 0x5

    invoke-virtual {p1, p3}, Led3/b;->b(I)V

    and-int/lit8 p3, p2, -0x80

    if-nez p3, :cond_2

    iget-object p3, p1, Led3/b;->a:[B

    iget v0, p1, Led3/b;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p1, Led3/b;->b:I

    int-to-byte p1, p2

    aput-byte p1, p3, v0

    return-void

    :cond_2
    int-to-long p2, p2

    sget-object v0, Led3/b;->c:[I

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    aget v0, v0, v1

    invoke-virtual {p1, v0, p2, p3}, Led3/b;->a(IJ)V

    return-void

    :cond_3
    int-to-long p2, p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Led3/b;->c:[I

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    aget v0, v0, v1

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p1, v1}, Led3/b;->b(I)V

    invoke-virtual {p1, v0, p2, p3}, Led3/b;->a(IJ)V

    return-void
.end method

.method public n(I)I
    .locals 7

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lg40/j2;

    iget-object v0, v0, Lg40/j2;->c:Lg40/g2;

    iget-object v0, v0, Lg40/g2;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    return p1

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    :goto_0
    if-ge v1, v4, :cond_3

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x23

    if-eq v5, v6, :cond_2

    invoke-interface {v3, v5}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le p1, v0, :cond_4

    add-int/lit8 v1, v1, 0x1

    :cond_4
    sub-int/2addr p1, v1

    return p1
.end method

.method public p(Led3/b;JLdd3/b;)V
    .locals 2

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    if-eqz p4, :cond_2

    const/4 v0, 0x1

    if-eq p4, v0, :cond_1

    const/4 p1, 0x2

    if-ne p4, p1, :cond_0

    iget-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Led3/b;

    invoke-static {p2, p3}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Led3/b;->d(J)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    shl-long v0, p2, v0

    const/16 p4, 0x3f

    shr-long/2addr p2, p4

    xor-long/2addr p2, v0

    sget-object p4, Led3/b;->c:[I

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    aget p4, p4, v0

    add-int/lit8 v0, p4, 0x1

    invoke-virtual {p1, v0}, Led3/b;->b(I)V

    invoke-virtual {p1, p4, p2, p3}, Led3/b;->a(IJ)V

    return-void

    :cond_2
    sget-object p4, Led3/b;->c:[I

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    aget p4, p4, v0

    add-int/lit8 v0, p4, 0x1

    invoke-virtual {p1, v0}, Led3/b;->b(I)V

    invoke-virtual {p1, p4, p2, p3}, Led3/b;->a(IJ)V

    return-void
.end method

.method public q(JJ)J
    .locals 0

    return-wide p3
.end method

.method public r(JJ)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public s(JJ)J
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1
.end method

.method public skip(J)J
    .locals 8

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-gez v3, :cond_0

    return-wide v1

    :cond_0
    move-wide v3, p1

    :goto_0
    cmp-long v5, v3, v1

    if-lez v5, :cond_3

    invoke-virtual {v0, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-lez v7, :cond_1

    :goto_1
    sub-long/2addr v3, v5

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v5, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    sub-long/2addr p1, v3

    return-wide p1
.end method

.method public t(J)Lf9/j;
    .locals 0

    iget-object p1, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Lf9/j;

    return-object p1
.end method

.method public u(JJ)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public v()V
    .locals 3

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lex/a;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lex/a;->y:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, v0, Lex/a;->y:Z

    iget-object v1, v0, Lex/a;->w:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lex/a;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    iget-object v1, v0, Lex/a;->x:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lex/a;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lex/a;->w:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    iget-object v1, v0, Lex/a;->x:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    :cond_2
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public w(J)J
    .locals 0

    const-wide/16 p1, 0x1

    return-wide p1
.end method

.method public x(I)I
    .locals 8

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lg40/j2;

    iget-object v0, v0, Lg40/j2;->c:Lg40/g2;

    iget-object v0, v0, Lg40/g2;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    return p1

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 v2, -0x1

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v1, v6, :cond_3

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    add-int/lit8 v3, v3, 0x1

    const/16 v7, 0x23

    if-ne v6, v7, :cond_2

    add-int/lit8 v4, v4, 0x1

    if-ne v4, p1, :cond_2

    move v5, v3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-ne v5, v2, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    sub-int/2addr p1, v4

    add-int/2addr p1, v0

    return p1

    :cond_4
    return v5
.end method

.method public y()Lgf/c;
    .locals 1

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lgf/c;

    return-object v0
.end method

.method public z()La9/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
