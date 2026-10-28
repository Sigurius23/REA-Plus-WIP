.class public final Lty/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;
.implements Lt53/a;
.implements Luf/c;
.implements Luo/b;
.implements Lpg3/n;
.implements Luf/f;
.implements Lto/n;
.implements Lxk/g;
.implements Lm83/b0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, Lty/c;->w:I

    const/4 v0, 0x0

    sparse-switch p1, :sswitch_data_0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance p1, Llo/e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Llo/e;-><init>(I)V

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void

    .line 22
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    new-array p1, p1, [B

    fill-array-data p1, :array_0

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    const/16 p1, 0x80

    new-array v1, p1, [B

    move v2, v0

    :goto_0
    if-ge v2, p1, :cond_0

    const/4 v3, -0x1

    .line 25
    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, [B

    array-length v2, p1

    if-ge v0, v2, :cond_1

    aget-byte p1, p1, v0

    int-to-byte v2, v0

    aput-byte v2, v1, p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/16 p1, 0x61

    aget-byte p1, v1, p1

    const/16 v0, 0x41

    aput-byte p1, v1, v0

    const/16 p1, 0x62

    aget-byte p1, v1, p1

    const/16 v0, 0x42

    aput-byte p1, v1, v0

    const/16 p1, 0x63

    aget-byte p1, v1, p1

    const/16 v0, 0x43

    aput-byte p1, v1, v0

    const/16 p1, 0x64

    aget-byte p1, v1, p1

    const/16 v0, 0x44

    aput-byte p1, v1, v0

    const/16 p1, 0x65

    aget-byte p1, v1, p1

    const/16 v0, 0x45

    aput-byte p1, v1, v0

    const/16 p1, 0x66

    aget-byte p1, v1, p1

    const/16 v0, 0x46

    aput-byte p1, v1, v0

    return-void

    .line 26
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance p1, Led3/a;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Led3/a;-><init>(I)V

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void

    .line 28
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void

    .line 30
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void

    .line 32
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance p1, Lvn/d;

    const/4 v1, 0x5

    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    invoke-direct {p1, v1, v2, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 35
    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_5
        0xf -> :sswitch_4
        0x10 -> :sswitch_3
        0x14 -> :sswitch_2
        0x17 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;Lal/g;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lty/c;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lgl/u;

    invoke-direct {v0, p1, p2}, Lgl/u;-><init>(Ljava/io/InputStream;Lal/g;)V

    iput-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    const/high16 p1, 0x500000

    .line 5
    invoke-virtual {v0, p1}, Lgl/u;->mark(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lty/c;->w:I

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lu8/d;)V
    .locals 2

    const/4 v0, 0x5

    iput v0, p0, Lty/c;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iget p1, p1, Lu8/d;->a:I

    .line 8
    invoke-virtual {v0, p1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 11
    sget v0, Lx8/t;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 12
    invoke-static {p1}, La4/a;->A(Landroid/media/AudioAttributes$Builder;)V

    :cond_0
    const/16 v1, 0x20

    if-lt v0, v1, :cond_1

    .line 13
    invoke-static {p1}, Lu8/c;->a(Landroid/media/AudioAttributes$Builder;)V

    .line 14
    :cond_1
    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Luo/c;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lty/c;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyf/u;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lty/c;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    instance-of v0, p1, Lyf/m;

    if-eqz v0, :cond_0

    check-cast p1, Lyf/m;

    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Lyf/b;

    invoke-static {p1}, Ls30/b;->x(Lyf/u;)Lne3/p0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1

    invoke-direct {v0, p1}, Lyf/b;-><init>(Lne3/j0;)V

    move-object p1, v0

    .line 19
    :goto_0
    iput-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public static h(Lty/c;Lwa3/e;Lwa3/e;)Lwa3/e;
    .locals 1

    invoke-virtual {p0, p1}, Lty/c;->k(Lwa3/e;)V

    invoke-virtual {p0, p2}, Lty/c;->k(Lwa3/e;)V

    iget-object p0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/Stack;

    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwa3/e;

    :goto_0
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwa3/e;

    new-instance v0, Lwa3/z;

    invoke-direct {v0, p2, p1}, Lwa3/z;-><init>(Lwa3/e;Lwa3/e;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lgl/u;

    invoke-virtual {v0}, Lgl/u;->h()V

    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    check-cast p2, Lcq/i;

    check-cast p1, Lwo/c;

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lwo/a;

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Luo/m;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    iget-object v2, p1, Lip/a;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    sget v2, Ljp/a;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, v1, v3}, Luo/m;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    :try_start_0
    iget-object p1, p1, Lip/a;->g:Landroid/os/IBinder;

    const/4 v0, 0x0

    invoke-interface {p1, v2, v1, v0, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2, v0}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw p1
.end method

.method public b(Lcom/google/android/gms/common/a;)V
    .locals 2

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Luo/c;

    invoke-virtual {p1}, Lcom/google/android/gms/common/a;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object p1, v0

    check-cast p1, Luo/h;

    iget-object p1, p1, Luo/h;->y:Ljava/util/Set;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Luo/c;->i(Luo/i;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, v0, Luo/c;->o:Luo/k;

    if-eqz v0, :cond_1

    iget-object v0, v0, Luo/k;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/j;->c0(Lcom/google/android/gms/common/a;)V

    :cond_1
    return-void
.end method

.method public c(Luf/w;Lq83/d;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Lef/a;

    iget-object p2, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast p2, Lcg/o;

    invoke-direct {p1, p2}, Lef/a;-><init>(Lcg/o;)V

    return-object p1
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lud3/a1;

    :try_start_0
    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lud3/a1;->d1()Lne3/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lne3/j;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lud3/a1;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lud3/a1;->close()V

    throw v0
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Class;

    return-object p1
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lgl/u;

    invoke-virtual {v0}, Lgl/u;->reset()V

    return-object v0
.end method

.method public f(Luf/u;Luf/a;)Ljava/lang/Object;
    .locals 3

    iget-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, [Lnf/e;

    new-instance p2, Ljava/util/ArrayList;

    array-length v0, p1

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-interface {v2}, Lnf/e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method public g()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public i(Lsn/z;)V
    .locals 0

    return-void
.end method

.method public j(IZ)V
    .locals 1

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Llo/e;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1}, Llo/e;->a(I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public k(Lwa3/e;)V
    .locals 5

    invoke-virtual {p1}, Lwa3/e;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lwa3/e;->size()I

    move-result v0

    sget-object v1, Lwa3/z;->H:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-gez v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    :cond_0
    add-int/lit8 v2, v0, 0x1

    aget v2, v1, v2

    iget-object v3, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/e;

    invoke-virtual {v4}, Lwa3/e;->size()I

    move-result v4

    if-lt v4, v2, :cond_1

    goto :goto_2

    :cond_1
    aget v0, v1, v0

    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/e;

    :goto_0
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/e;

    invoke-virtual {v2}, Lwa3/e;->size()I

    move-result v2

    if-ge v2, v0, :cond_2

    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/e;

    new-instance v4, Lwa3/z;

    invoke-direct {v4, v2, v1}, Lwa3/z;-><init>(Lwa3/e;Lwa3/e;)V

    move-object v1, v4

    goto :goto_0

    :cond_2
    new-instance v0, Lwa3/z;

    invoke-direct {v0, v1, p1}, Lwa3/z;-><init>(Lwa3/e;Lwa3/e;)V

    :goto_1
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lwa3/z;->H:[I

    iget v1, v0, Lwa3/z;->x:I

    invoke-static {p1, v1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v1

    if-gez v1, :cond_3

    add-int/lit8 v1, v1, 0x1

    neg-int v1, v1

    add-int/lit8 v1, v1, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    aget p1, p1, v1

    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    if-ge v1, p1, :cond_4

    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwa3/e;

    new-instance v1, Lwa3/z;

    invoke-direct {v1, p1, v0}, Lwa3/z;-><init>(Lwa3/e;Lwa3/e;)V

    move-object v0, v1

    goto :goto_1

    :cond_4
    invoke-virtual {v3, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    :goto_2
    invoke-virtual {v3, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_6
    instance-of v0, p1, Lwa3/z;

    if-eqz v0, :cond_7

    check-cast p1, Lwa3/z;

    iget-object v0, p1, Lwa3/z;->y:Lwa3/e;

    invoke-virtual {p0, v0}, Lty/c;->k(Lwa3/e;)V

    iget-object p1, p1, Lwa3/z;->z:Lwa3/e;

    invoke-virtual {p0, p1}, Lty/c;->k(Lwa3/e;)V

    return-void

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x31

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Has a new type of ByteString been created? Found "

    invoke-static {v2, p1, v1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()Lxi/b;
    .locals 1

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lxi/b;

    return-object v0
.end method

.method public bridge synthetic m(Lorg/json/JSONObject;)Lvy/b;
    .locals 0

    invoke-virtual {p0, p1}, Lty/c;->t(Lorg/json/JSONObject;)Lty/b;

    move-result-object p1

    return-object p1
.end method

.method public n()Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException;
    .locals 1

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException;

    return-object v0
.end method

.method public o()Lyb3/k;
    .locals 1

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lyb3/n;

    return-object v0
.end method

.method public p()Laa3/u0;
    .locals 3

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lcf3/a;

    instance-of v1, v0, Lxe3/p;

    if-eqz v1, :cond_0

    check-cast v0, Lxe3/p;

    iget-object v0, v0, Lxe3/p;->b:Lxe3/l;

    iget-object v0, v0, Lxe3/l;->b:Ljava/util/ArrayList;

    new-instance v1, Laa3/u0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Laa3/u0;-><init>(I)V

    iget-object v2, v1, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v1

    :cond_0
    new-instance v0, Laa3/u0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Laa3/u0;-><init>(I)V

    return-object v0
.end method

.method public q()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lrm/g;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public r()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public s()Z
    .locals 1

    iget v0, p0, Lty/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lyf/m;

    invoke-interface {v0}, Lyf/m;->o()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lyf/o;

    invoke-interface {v0}, Lyf/o;->h()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public t(Lorg/json/JSONObject;)Lty/b;
    .locals 7

    const-string v0, "guid"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "muid"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "sid"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance v1, Lty/b;

    iget-object p1, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Ltb0/b;

    invoke-virtual {p1}, Ltb0/b;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-direct/range {v1 .. v6}, Lty/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v1
.end method

.method public u(Lsn/z;)V
    .locals 0

    return-void
.end method

.method public v(Lv00/c0;Ljava/util/ArrayList;Ljava/util/List;Lh20/i3;)Ljava/util/ArrayList;
    .locals 17

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "specs"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "placeholderOverrideList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    iget-object v4, v2, Lty/c;->x:Ljava/lang/Object;

    check-cast v4, Lv00/m0;

    iget-object v5, v4, Lv00/m0;->g:Ljava/lang/String;

    iget-object v6, v4, Lv00/m0;->c:Ljava/util/LinkedHashMap;

    iget-object v7, v4, Lv00/m0;->i:Lh20/l1;

    iget-boolean v8, v4, Lv00/m0;->j:Z

    const-string v9, "configuration"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v10, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v11, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v12, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    filled-new-array {v9, v10, v11, v12}, [Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    const-string v13, "spec"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v13, v11, Lcom/stripe/android/ui/core/elements/NameSpec;

    if-eqz v13, :cond_1

    sget-object v14, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    instance-of v14, v11, Lcom/stripe/android/ui/core/elements/EmailSpec;

    if-eqz v14, :cond_2

    sget-object v14, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    instance-of v14, v11, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    if-eqz v14, :cond_3

    sget-object v14, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    instance-of v14, v11, Lcom/stripe/android/ui/core/elements/AddressSpec;

    if-eqz v14, :cond_4

    sget-object v14, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    instance-of v14, v11, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    if-eqz v14, :cond_5

    sget-object v14, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->SepaMandate:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    instance-of v14, v11, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    if-eqz v14, :cond_7

    move-object v14, v11

    check-cast v14, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    invoke-virtual {v14}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;->getField()Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v15

    sget-object v16, Lo20/f;->a:[I

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v15, v16, v15

    const/4 v12, 0x1

    if-ne v15, v12, :cond_6

    sget-object v12, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-virtual {v14}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;->getField()Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_7
    :goto_1
    if-eqz v13, :cond_8

    move-object v12, v11

    check-cast v12, Lcom/stripe/android/ui/core/elements/NameSpec;

    iget-object v12, v7, Lh20/l1;->w:Lh20/k1;

    sget-object v13, Lh20/k1;->x:Lh20/k1;

    if-ne v12, v13, :cond_e

    :goto_2
    const/4 v12, 0x0

    goto :goto_3

    :cond_8
    instance-of v12, v11, Lcom/stripe/android/ui/core/elements/EmailSpec;

    if-eqz v12, :cond_9

    move-object v12, v11

    check-cast v12, Lcom/stripe/android/ui/core/elements/EmailSpec;

    iget-object v12, v7, Lh20/l1;->y:Lh20/k1;

    sget-object v13, Lh20/k1;->x:Lh20/k1;

    if-ne v12, v13, :cond_e

    goto :goto_2

    :cond_9
    instance-of v12, v11, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    if-eqz v12, :cond_a

    move-object v12, v11

    check-cast v12, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    iget-object v12, v7, Lh20/l1;->x:Lh20/k1;

    sget-object v13, Lh20/k1;->x:Lh20/k1;

    if-ne v12, v13, :cond_e

    goto :goto_2

    :cond_a
    instance-of v12, v11, Lcom/stripe/android/ui/core/elements/AddressSpec;

    if-eqz v12, :cond_b

    move-object v12, v11

    check-cast v12, Lcom/stripe/android/ui/core/elements/AddressSpec;

    iget-object v12, v7, Lh20/l1;->z:Lh20/j1;

    sget-object v13, Lh20/j1;->x:Lh20/j1;

    if-ne v12, v13, :cond_e

    goto :goto_2

    :cond_b
    instance-of v12, v11, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    if-eqz v12, :cond_c

    check-cast v11, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    invoke-virtual {v11}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;->getField()Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v11

    invoke-static {v11, v0, v8, v7, v1}, Lo20/g;->a(Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;Ljava/util/List;ZLh20/l1;Lh20/i3;)Lcom/stripe/android/ui/core/elements/FormItemSpec;

    move-result-object v12

    goto :goto_3

    :cond_c
    instance-of v12, v11, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    if-eqz v12, :cond_d

    move-object v12, v11

    check-cast v12, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    sget-object v12, Lh20/i3;->x:Lh20/i3;

    if-ne v1, v12, :cond_e

    goto :goto_2

    :cond_d
    instance-of v12, v11, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    if-eqz v12, :cond_e

    move-object v12, v11

    check-cast v12, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    sget-object v12, Lh20/i3;->x:Lh20/i3;

    if-ne v1, v12, :cond_e

    goto :goto_2

    :cond_e
    move-object v12, v11

    :goto_3
    if-eqz v12, :cond_0

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_f
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_10
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-static {v11, v0, v8, v7, v1}, Lo20/g;->a(Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;Ljava/util/List;ZLh20/l1;Lh20/i3;)Lcom/stripe/android/ui/core/elements/FormItemSpec;

    move-result-object v11

    if-eqz v11, :cond_10

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_11
    invoke-static {v10, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Lm22/b;

    const/16 v3, 0x15

    invoke-direct {v1, v3}, Lm22/b;-><init>(I)V

    new-instance v3, Lea2/l;

    const/16 v7, 0xb

    invoke-direct {v3, v1, v7}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    instance-of v7, v3, Lcom/stripe/android/ui/core/elements/StaticTextSpec;

    if-eqz v7, :cond_12

    check-cast v3, Lcom/stripe/android/ui/core/elements/StaticTextSpec;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/StaticTextSpec;->transform()Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v7, p1

    goto/16 :goto_7

    :cond_12
    instance-of v7, v3, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;

    if-eqz v7, :cond_14

    check-cast v3, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;

    move-object/from16 v7, p1

    iget-object v8, v7, Lv00/c0;->w:Ly00/c8;

    if-eqz v8, :cond_13

    invoke-static {v8}, Luf/c0;->P(Ly00/c8;)Ljava/lang/String;

    move-result-object v8

    goto :goto_6

    :cond_13
    const/4 v8, 0x0

    :goto_6
    invoke-virtual {v3, v8}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;->transform(Ljava/lang/String;)Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_14
    move-object/from16 v7, p1

    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;

    if-eqz v8, :cond_15

    check-cast v3, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;->transform()Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_15
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    if-eqz v8, :cond_16

    new-instance v3, Lx30/r0;

    invoke-direct {v3}, Lx30/r0;-><init>()V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_16
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    if-eqz v8, :cond_17

    check-cast v3, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/stripe/android/ui/core/elements/MandateTextSpec;->transform([Ljava/lang/String;)Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_17
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    if-eqz v8, :cond_18

    check-cast v3, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    invoke-virtual {v3, v5}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;->transform(Ljava/lang/String;)Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_18
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;

    if-eqz v8, :cond_19

    check-cast v3, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_19
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;

    if-eqz v8, :cond_1a

    check-cast v3, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;

    invoke-virtual {v3, v5, v6}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->transform(Ljava/lang/String;Ljava/util/Map;)Lg40/e0;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_1a
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/BsbSpec;

    if-eqz v8, :cond_1b

    check-cast v3, Lcom/stripe/android/ui/core/elements/BsbSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/BsbSpec;->transform(Ljava/util/Map;)Lx30/k;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_1b
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/OTPSpec;

    if-eqz v8, :cond_1c

    check-cast v3, Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lg40/o1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_1c
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/NameSpec;

    if-eqz v8, :cond_1d

    check-cast v3, Lcom/stripe/android/ui/core/elements/NameSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/NameSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_1d
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/EmailSpec;

    if-eqz v8, :cond_1e

    check-cast v3, Lcom/stripe/android/ui/core/elements/EmailSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/EmailSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_1e
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    if-eqz v8, :cond_1f

    check-cast v3, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/PhoneSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_1f
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    if-eqz v8, :cond_20

    check-cast v3, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_20
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;

    if-eqz v8, :cond_21

    check-cast v3, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_21
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/IbanSpec;

    if-eqz v8, :cond_22

    check-cast v3, Lcom/stripe/android/ui/core/elements/IbanSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/IbanSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_7

    :cond_22
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;

    if-eqz v8, :cond_23

    check-cast v3, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;->transform()Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_23
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    if-eqz v8, :cond_24

    check-cast v3, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/DropdownSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_24
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/CountrySpec;

    if-eqz v8, :cond_25

    check-cast v3, Lcom/stripe/android/ui/core/elements/CountrySpec;

    invoke-virtual {v3, v6}, Lcom/stripe/android/ui/core/elements/CountrySpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_25
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/AddressSpec;

    if-eqz v8, :cond_26

    check-cast v3, Lcom/stripe/android/ui/core/elements/AddressSpec;

    iget-object v8, v4, Lv00/m0;->e:Ljava/util/Map;

    iget-object v9, v4, Lv00/m0;->o:Lg40/z;

    invoke-virtual {v3, v6, v8, v9}, Lcom/stripe/android/ui/core/elements/AddressSpec;->transform(Ljava/util/Map;Ljava/util/Map;Lg40/z;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_26
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    if-eqz v8, :cond_27

    check-cast v3, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    invoke-virtual {v3, v5}, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;->transform(Ljava/lang/String;)Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_27
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    if-eqz v8, :cond_28

    sget-object v3, Lm83/y;->w:Lm83/y;

    goto :goto_7

    :cond_28
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    if-eqz v8, :cond_29

    check-cast v3, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    invoke-virtual {v3, v5}, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;->transform(Ljava/lang/String;)Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_29
    instance-of v8, v3, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;

    if-eqz v8, :cond_2a

    check-cast v3, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;

    invoke-virtual {v3, v5}, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;->transform(Ljava/lang/String;)Lg40/i1;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :goto_7
    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto/16 :goto_5

    :cond_2a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2b
    return-object v1
.end method
