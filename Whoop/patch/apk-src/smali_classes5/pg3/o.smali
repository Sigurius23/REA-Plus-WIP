.class public final Lpg3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/g;
.implements Lpg3/n;
.implements Lmb3/b;
.implements Lz8/e;


# instance fields
.field public w:Ljava/lang/Object;

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/o;->w:Ljava/lang/Object;

    .line 23
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lpg3/o;->x:Ljava/lang/Object;

    return-void

    .line 24
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 25
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lpg3/o;->w:Ljava/lang/Object;

    new-instance p1, Ljava/util/WeakHashMap;

    .line 26
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 27
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lpg3/o;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    packed-switch p2, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lpg3/o;->w:Ljava/lang/Object;

    const p2, 0x7f1402d8

    .line 4
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpg3/o;->x:Ljava/lang/Object;

    return-void

    .line 5
    :pswitch_0
    new-instance p2, Lce3/a0;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Lce3/a0;-><init>(I)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lpg3/o;->w:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, Lpg3/o;->x:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.os.IMessenger"

    .line 10
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 11
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Lpg3/o;->w:Ljava/lang/Object;

    iput-object v2, p0, Lpg3/o;->x:Ljava/lang/Object;

    return-void

    :cond_0
    const-string v1, "com.google.android.gms.iid.IMessengerCompat"

    .line 12
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 13
    new-instance v0, Lso/h;

    .line 14
    invoke-direct {v0, p1}, Lso/h;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Lpg3/o;->x:Ljava/lang/Object;

    iput-object v2, p0, Lpg3/o;->w:Ljava/lang/Object;

    return-void

    .line 15
    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "MessengerIpcClient"

    const-string v1, "Invalid interface descriptor: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public constructor <init>(Ldt/g;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lpg3/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpg3/o;->w:Ljava/lang/Object;

    iput-object p2, p0, Lpg3/o;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;Lmb3/c;)V
    .locals 1

    const-string v0, "equalityAxioms"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lpg3/o;->w:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, Lpg3/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public static n0(Landroid/content/Context;)Lpg3/o;
    .locals 5

    const-string v0, "generatefid.lock"

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p0, Ljava/io/RandomAccessFile;

    const-string v0, "rw"

    invoke-direct {p0, v2, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_6

    :try_start_1
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_1 .. :try_end_1} :catch_3

    :try_start_2
    new-instance v2, Lpg3/o;

    invoke-direct {v2, p0, v0}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v2

    goto :goto_2

    :catch_2
    move-exception v2

    goto :goto_2

    :catch_3
    move-exception v2

    :goto_0
    move-object v0, v1

    goto :goto_2

    :catch_4
    move-exception v2

    goto :goto_0

    :catch_5
    move-exception v2

    goto :goto_0

    :catch_6
    move-exception v2

    :goto_1
    move-object p0, v1

    move-object v0, p0

    goto :goto_2

    :catch_7
    move-exception v2

    goto :goto_1

    :catch_8
    move-exception v2

    goto :goto_1

    :goto_2
    const-string v3, "CrossProcessLock"

    const-string v4, "encountered error while creating and acquiring the lock, ignoring"

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    if-eqz v0, :cond_0

    :try_start_3
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9

    :catch_9
    :cond_0
    if-eqz p0, :cond_1

    :try_start_4
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_a

    :catch_a
    :cond_1
    return-object v1
.end method


# virtual methods
.method public A(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lpg3/o;->f(Lob3/g;)Lob3/h;

    move-result-object v0

    invoke-static {v0}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object v0

    invoke-virtual {p0, p1}, Lpg3/o;->l0(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-static {p1}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public bridge B(Lob3/k;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->L(Lob3/k;)Z

    move-result p1

    return p1
.end method

.method public bridge C(Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->z(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public D(Lob3/j;I)Lob3/k;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lob3/i;

    if-eqz v0, :cond_0

    check-cast p1, Lob3/g;

    invoke-static {p1, p2}, Lmb3/g;->m(Lob3/g;I)Lob3/k;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lob3/a;

    if-eqz v0, :cond_1

    check-cast p1, Lob3/a;

    invoke-virtual {p1, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lob3/k;

    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unknown type argument list type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge E(Lob3/l;)I
    .locals 0

    invoke-static {p1}, Lmb3/g;->R(Lob3/l;)I

    move-result p1

    return p1
.end method

.method public F(Lob3/g;)Lob3/g;
    .locals 0

    invoke-static {p1}, Lmb3/g;->Q(Lob3/g;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public bridge G(Lob3/h;)Lob3/h;
    .locals 1

    sget-object v0, Lob3/b;->w:Lob3/b;

    invoke-static {p1}, Lmb3/g;->i(Lob3/h;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public H(Lob3/l;Lob3/l;)Z
    .locals 2

    const-string v0, "c1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llb3/q0;

    const-string v1, "Failed requirement."

    if-eqz v0, :cond_6

    instance-of v0, p2, Llb3/q0;

    if-eqz v0, :cond_5

    invoke-static {p1, p2}, Lmb3/g;->a(Lob3/l;Lob3/l;)Z

    move-result v0

    if-nez v0, :cond_4

    check-cast p1, Llb3/q0;

    check-cast p2, Llb3/q0;

    iget-object v0, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v1, Lmb3/c;

    invoke-interface {v1, p1, p2}, Lmb3/c;->a(Llb3/q0;Llb3/q0;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/q0;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/q0;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public I(Lob3/h;Lob3/l;)V
    .locals 0

    return-void
.end method

.method public bridge J(Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->A(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public bridge K(Lob3/g;I)Lob3/k;
    .locals 0

    invoke-static {p1, p2}, Lmb3/g;->m(Lob3/g;I)Lob3/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge L(Llb3/y;)Llb3/c0;
    .locals 0

    invoke-static {p1}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge M(Lob3/h;)Lob3/j;
    .locals 0

    invoke-static {p1}, Lmb3/g;->c(Lob3/h;)Lob3/j;

    move-result-object p1

    return-object p1
.end method

.method public N(Lob3/g;)Lob3/l;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lpg3/o;->f(Lob3/g;)Lob3/h;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object p1

    return-object p1
.end method

.method public bridge O(Lob3/d;)Lob3/b;
    .locals 0

    invoke-static {p1}, Lmb3/g;->j(Lob3/d;)Lob3/b;

    move-result-object p1

    return-object p1
.end method

.method public P(Lob3/h;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object p1

    invoke-static {p1}, Lmb3/g;->E(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public bridge Q(Lob3/g;)Lob3/g;
    .locals 0

    invoke-static {p0, p1}, Lmb3/g;->b0(Lmb3/b;Lob3/g;)Lob3/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge R(Lob3/g;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->G(Lob3/g;)Z

    move-result p1

    return p1
.end method

.method public S(Lob3/h;I)Lob3/k;
    .locals 1

    if-ltz p2, :cond_0

    invoke-static {p1}, Lmb3/g;->b(Lob3/g;)I

    move-result v0

    if-ge p2, v0, :cond_0

    invoke-static {p1, p2}, Lmb3/g;->m(Lob3/g;I)Lob3/k;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge T(Lob3/h;)Lob3/l;
    .locals 0

    invoke-static {p1}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object p1

    return-object p1
.end method

.method public U(Lob3/g;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    return-void
.end method

.method public bridge V(Lob3/h;Lob3/h;)Z
    .locals 0

    invoke-static {p1, p2}, Lmb3/g;->x(Lob3/h;Lob3/h;)Z

    move-result p1

    return p1
.end method

.method public W(Llb3/f1;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lpg3/o;->f(Lob3/g;)Lob3/h;

    move-result-object v0

    invoke-static {v0}, Lmb3/g;->G(Lob3/g;)Z

    move-result v0

    invoke-virtual {p0, p1}, Lpg3/o;->l0(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-static {p1}, Lmb3/g;->G(Lob3/g;)Z

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge X(Lob3/h;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, Lmb3/g;->S(Lmb3/b;Lob3/h;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public Y(Lob3/j;)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lob3/h;

    if-eqz v0, :cond_0

    check-cast p1, Lob3/g;

    invoke-static {p1}, Lmb3/g;->b(Lob3/g;)I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Lob3/a;

    if-eqz v0, :cond_1

    check-cast p1, Lob3/a;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    return p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown type argument list type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge Z(Lob3/k;)Lob3/g;
    .locals 0

    invoke-static {p0, p1}, Lmb3/g;->r(Lmb3/b;Lob3/k;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public bridge a(Lob3/f;)Llb3/c0;
    .locals 0

    .line 1
    invoke-static {p1}, Lmb3/g;->Z(Lob3/f;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge a(Lob3/f;)Lob3/h;
    .locals 0

    .line 2
    invoke-static {p1}, Lmb3/g;->Z(Lob3/f;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge a0(Lob3/h;)V
    .locals 0

    invoke-static {p1}, Lmb3/g;->M(Lob3/h;)V

    return-void
.end method

.method public adapt(Lpg3/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v1, Lpg3/q;

    invoke-direct {v1, v0, p1}, Lpg3/q;-><init>(Ljava/util/concurrent/Executor;Lpg3/e;)V

    return-object v1
.end method

.method public bridge b(Lob3/f;)Llb3/c0;
    .locals 0

    .line 1
    invoke-static {p1}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Lob3/f;)Lob3/h;
    .locals 0

    .line 2
    invoke-static {p1}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b0(Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->y(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public c()Lo93/h;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge c0(Lob3/l;I)Lob3/m;
    .locals 0

    invoke-static {p1, p2}, Lmb3/g;->o(Lob3/l;I)Lob3/m;

    move-result-object p1

    return-object p1
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lud3/a1;

    iget-object v0, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v0, Lcom/google/gson/Gson;

    iget-object v1, p1, Lud3/a1;->w:Lud3/y0;

    if-nez v1, :cond_2

    new-instance v1, Lud3/y0;

    invoke-virtual {p1}, Lud3/a1;->d1()Lne3/j;

    move-result-object v2

    invoke-virtual {p1}, Lud3/a1;->k()Lud3/h0;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v4, Lud3/h0;->e:Lyb3/p;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lud3/h0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    sget-object v3, Lyb3/a;->a:Ljava/nio/charset/Charset;

    :cond_1
    invoke-direct {v1, v2, v3}, Lud3/y0;-><init>(Lne3/j;Ljava/nio/charset/Charset;)V

    iput-object v1, p1, Lud3/a1;->w:Lud3/y0;

    :cond_2
    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->newJsonReader(Ljava/io/Reader;)Lcom/google/gson/stream/JsonReader;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/gson/TypeAdapter;

    invoke-virtual {v1, v0}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v0

    sget-object v2, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Lud3/a1;->close()V

    return-object v1

    :cond_3
    :try_start_1
    new-instance v0, Lcom/google/gson/JsonIOException;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lud3/a1;->close()V

    throw v0
.end method

.method public createDataSource()Lz8/f;
    .locals 3

    new-instance v0, Lz8/h;

    iget-object v1, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v2, Lce3/a0;

    invoke-virtual {v2}, Lce3/a0;->createDataSource()Lz8/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lz8/h;-><init>(Landroid/content/Context;Lz8/f;)V

    return-object v0
.end method

.method public bridge d(Lob3/h;)Llb3/c0;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p1, v0}, Lmb3/g;->a0(Lob3/h;Z)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge d(Lob3/h;)Lob3/h;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lmb3/g;->a0(Lob3/h;Z)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge d0(Lob3/d;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->K(Lob3/d;)Z

    move-result p1

    return p1
.end method

.method public e(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lpg3/o;->s0(Lob3/h;)Lob3/i;

    move-result-object p1

    invoke-static {p0, p1}, Lmb3/g;->d(Lmb3/b;Lob3/i;)Lob3/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge e0(Lob3/g;)Lob3/k;
    .locals 0

    invoke-static {p1}, Lmb3/g;->h(Lob3/g;)Llb3/v0;

    move-result-object p1

    return-object p1
.end method

.method public f(Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-static {p1}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public f0(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lmb3/g;->e(Lob3/h;)Llb3/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge g(Lob3/g;)I
    .locals 0

    invoke-static {p1}, Lmb3/g;->b(Lob3/g;)I

    move-result p1

    return p1
.end method

.method public g0(Lob3/d;)Z
    .locals 0

    instance-of p1, p1, Lza3/a;

    return p1
.end method

.method public h(Lob3/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lpg3/o;->N(Lob3/g;)Lob3/l;

    move-result-object v0

    invoke-static {v0}, Lmb3/g;->H(Lob3/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lmb3/g;->I(Lob3/g;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge h0(Lob3/g;)Lob3/h;
    .locals 0

    invoke-static {p1}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge i(Lob3/k;)Lob3/p;
    .locals 0

    invoke-static {p1}, Lmb3/g;->t(Lob3/k;)Lob3/p;

    move-result-object p1

    return-object p1
.end method

.method public i0(Lob3/h;)Lob3/d;
    .locals 0

    invoke-virtual {p0, p1}, Lpg3/o;->s0(Lob3/h;)Lob3/i;

    move-result-object p1

    invoke-static {p0, p1}, Lmb3/g;->d(Lmb3/b;Lob3/i;)Lob3/d;

    move-result-object p1

    return-object p1
.end method

.method public j(Lob3/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object p1

    invoke-static {p1}, Lmb3/g;->z(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public bridge j0(Lob3/g;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->C(Lob3/g;)Z

    move-result p1

    return p1
.end method

.method public bridge k(Lob3/d;)Lob3/c;
    .locals 0

    invoke-static {p1}, Lmb3/g;->Y(Lob3/d;)Lmb3/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge k0(Lob3/d;)Lob3/g;
    .locals 0

    invoke-static {p1}, Lmb3/g;->P(Lob3/d;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public bridge l(Lob3/m;)Lob3/p;
    .locals 0

    invoke-static {p1}, Lmb3/g;->u(Lob3/m;)Lob3/p;

    move-result-object p1

    return-object p1
.end method

.method public l0(Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lmb3/g;->Z(Lob3/f;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-static {p1}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public m(Lob3/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmb3/g;->e(Lob3/h;)Llb3/l;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge m0(Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->E(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public bridge n(Lob3/h;)Ls2/e;
    .locals 0

    invoke-static {p0, p1}, Lmb3/g;->V(Lmb3/b;Lob3/h;)Lmb3/a;

    move-result-object p1

    return-object p1
.end method

.method public o(Lob3/g;)Z
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Llb3/b0;

    return p1
.end method

.method public o0()Ljava/io/File;
    .locals 4

    const-string v0, "PersistedInstallation."

    iget-object v1, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    if-nez v1, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    if-nez v1, :cond_0

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v2, Ldt/g;

    invoke-virtual {v2}, Ldt/g;->a()V

    iget-object v2, v2, Ldt/g;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v0, Ldt/g;

    invoke-virtual {v0}, Ldt/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".json"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lpg3/o;->w:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    iget-object v0, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method public bridge p(Lob3/h;)V
    .locals 0

    invoke-static {p1}, Lmb3/g;->N(Lob3/h;)V

    return-void
.end method

.method public p0(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/Resources;

    const-string v2, "string"

    invoke-virtual {v1, p1, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge q(Lob3/m;Lob3/l;)Z
    .locals 0

    invoke-static {p1, p2}, Lmb3/g;->w(Lob3/m;Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public q0(Lut/a;)V
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "Fid"

    iget-object v2, p1, Lut/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Status"

    iget v2, p1, Lut/a;->b:I

    invoke-static {v2}, Le4/p;->e(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "AuthToken"

    iget-object v2, p1, Lut/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "RefreshToken"

    iget-object v2, p1, Lut/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "TokenCreationEpochInSecs"

    iget-wide v2, p1, Lut/a;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "ExpiresInSecs"

    iget-wide v2, p1, Lut/a;->e:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "FisError"

    iget-object p1, p1, Lut/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "PersistedInstallation"

    const-string v1, "tmp"

    iget-object v2, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v2, Ldt/g;

    invoke-virtual {v2}, Ldt/g;->a()V

    iget-object v2, v2, Ldt/g;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-static {p1, v1, v2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "UTF-8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {p0}, Lpg3/o;->o0()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "unable to rename the tmpfile to PersistedInstallation"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public bridge r(Lob3/g;)Lob3/f;
    .locals 0

    invoke-static {p1}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object p1

    return-object p1
.end method

.method public r0()Llb3/p0;
    .locals 6

    new-instance v0, Llb3/p0;

    const/4 v1, 0x1

    const/4 v2, 0x1

    sget-object v4, Lmb3/e;->a:Lmb3/e;

    sget-object v5, Lmb3/f;->a:Lmb3/f;

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Llb3/p0;-><init>(ZZLmb3/b;Lmb3/e;Lmb3/f;)V

    return-object v0
.end method

.method public responseType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge s(Lob3/l;)Ljava/util/Collection;
    .locals 0

    invoke-static {p1}, Lmb3/g;->W(Lob3/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public s0(Lob3/h;)Lob3/i;
    .locals 1

    invoke-static {p1}, Lmb3/g;->e(Lob3/h;)Llb3/l;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Llb3/l;->x:Llb3/c0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    check-cast p1, Lob3/i;

    return-object p1
.end method

.method public bridge t(Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->B(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public t0()Lut/a;
    .locals 14

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x4000

    new-array v2, v1, [B

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Lpg3/o;->o0()Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    :try_start_1
    invoke-virtual {v4, v2, v3, v1}, Ljava/io/FileInputStream;->read([BII)I

    move-result v5

    if-gez v5, :cond_0

    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_1

    :cond_0
    :try_start_3
    invoke-virtual {v0, v2, v3, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :goto_1
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :goto_3
    const-string v0, "Fid"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "Status"

    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const-string v3, "AuthToken"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v3, "RefreshToken"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v3, "TokenCreationEpochInSecs"

    const-wide/16 v9, 0x0

    invoke-virtual {v1, v3, v9, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v11

    const-string v3, "ExpiresInSecs"

    invoke-virtual {v1, v3, v9, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v9

    const-string v3, "FisError"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {}, Lte0/d;->_values$1()[I

    move-result-object v1

    aget v6, v1, v0

    if-eqz v6, :cond_3

    if-nez v6, :cond_1

    const-string v0, " registrationStatus"

    goto :goto_4

    :cond_1
    const-string v0, ""

    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v4, Lut/a;

    invoke-direct/range {v4 .. v13}, Lut/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    return-object v4

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Null registrationStatus"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge u(Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->H(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public u0()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/nio/channels/FileLock;

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V

    iget-object v0, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "CrossProcessLock"

    const-string v2, "encountered error while releasing, ignoring"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public bridge v(Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lmb3/g;->F(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public v0(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 4

    iget-object v0, p0, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lpg3/o;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    monitor-enter v2

    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-nez p2, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->Y(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-nez p2, :cond_4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcq/i;

    new-instance v2, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {v2, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v1, v2}, Lcq/i;->c(Ljava/lang/Exception;)Z

    goto :goto_1

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public bridge w(Lob3/i;Lob3/i;)Llb3/f1;
    .locals 0

    invoke-static {p0, p1, p2}, Lmb3/g;->l(Lmb3/b;Lob3/h;Lob3/h;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public bridge x(Lob3/c;)Lob3/k;
    .locals 0

    invoke-static {p1}, Lmb3/g;->T(Lob3/c;)Llb3/u0;

    move-result-object p1

    return-object p1
.end method

.method public bridge y(Lob3/i;)Lob3/d;
    .locals 0

    invoke-static {p0, p1}, Lmb3/g;->d(Lmb3/b;Lob3/i;)Lob3/d;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/util/ArrayList;)Lob3/g;
    .locals 0

    invoke-static {p1}, Ltx/f;->Q(Ljava/util/ArrayList;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method
