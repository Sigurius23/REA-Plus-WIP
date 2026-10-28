.class public final Lt9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/r;


# static fields
.field public static final F:[I

.field public static final G:Lp0/n0;

.field public static final H:Lp0/n0;


# instance fields
.field public E:I

.field public w:Z

.field public x:Lzr/w0;

.field public y:Z

.field public z:Ljc/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x15

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lt9/l;->F:[I

    new-instance v0, Lp0/n0;

    new-instance v1, Los/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    invoke-direct {v0, v1}, Lp0/n0;-><init>(Los/a;)V

    sput-object v0, Lt9/l;->G:Lp0/n0;

    new-instance v0, Lp0/n0;

    new-instance v1, Los/a;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    invoke-direct {v0, v1}, Lp0/n0;-><init>(Los/a;)V

    sput-object v0, Lt9/l;->H:Lp0/n0;

    return-void

    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljc/b;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    iput-object v0, p0, Lt9/l;->z:Ljc/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt9/l;->y:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;I)V
    .locals 6

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    new-instance p2, Laa/a;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Laa/a;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_2
    new-instance p2, Laa/a;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Laa/a;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_3
    new-instance p2, Lpa/a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lpa/a;-><init>(IB)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_4
    new-instance p2, Laa/a;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Laa/a;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_5
    new-instance p2, Lpa/a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lpa/a;-><init>(IB)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_6
    new-instance p2, Lv9/b;

    iget-boolean v0, p0, Lt9/l;->y:Z

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lt9/l;->z:Ljc/b;

    invoke-direct {p2, v0, v1}, Lv9/b;-><init>(ILjc/b;)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_7
    sget-object p2, Lt9/l;->H:Lp0/n0;

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lp0/n0;->e([Ljava/lang/Object;)Lt9/n;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    :goto_0
    return-void

    :pswitch_8
    new-instance p2, Lpa/a;

    iget v0, p0, Lt9/l;->E:I

    invoke-direct {p2, v0}, Lpa/a;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_9
    new-instance p2, Lbb/d;

    invoke-direct {p2}, Lbb/d;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_a
    iget-object p2, p0, Lt9/l;->x:Lzr/w0;

    if-nez p2, :cond_1

    invoke-static {}, Lzr/g0;->p()Lzr/w0;

    move-result-object p2

    iput-object p2, p0, Lt9/l;->x:Lzr/w0;

    :cond_1
    new-instance p2, Lab/j0;

    iget-boolean v0, p0, Lt9/l;->y:Z

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lt9/l;->z:Ljc/b;

    new-instance v2, Lx8/s;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4}, Lx8/s;-><init>(J)V

    new-instance v3, Lab/g;

    iget-object v4, p0, Lt9/l;->x:Lzr/w0;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lab/g;-><init>(Ljava/util/List;I)V

    invoke-direct {p2, v0, v1, v2, v3}, Lab/j0;-><init>(ILqa/j;Lx8/s;Lab/g;)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_b
    new-instance p2, Lab/d0;

    invoke-direct {p2}, Lab/d0;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_c
    new-instance p2, Loa/c;

    invoke-direct {p2}, Loa/c;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_d
    new-instance p2, Lna/h;

    iget-object v1, p0, Lt9/l;->z:Ljc/b;

    iget-boolean v2, p0, Lt9/l;->y:Z

    if-eqz v2, :cond_2

    move v2, v0

    goto :goto_1

    :cond_2
    const/16 v2, 0x20

    :goto_1
    invoke-direct {p2, v1, v2}, Lna/h;-><init>(Lqa/j;I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p2, Lna/k;

    iget-object v1, p0, Lt9/l;->z:Ljc/b;

    iget-boolean v2, p0, Lt9/l;->y:Z

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const/16 v0, 0x10

    :goto_2
    invoke-direct {p2, v1, v0}, Lna/k;-><init>(Lqa/j;I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_e
    new-instance p2, Lma/d;

    iget-boolean v0, p0, Lt9/l;->w:Z

    invoke-direct {p2, v0}, Lma/d;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_f
    new-instance p2, Lla/d;

    iget-object v1, p0, Lt9/l;->z:Ljc/b;

    iget-boolean v2, p0, Lt9/l;->y:Z

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const/4 v0, 0x2

    :goto_3
    invoke-direct {p2, v1, v0}, Lla/d;-><init>(Lqa/j;I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_10
    new-instance p2, Lz9/b;

    invoke-direct {p2}, Lz9/b;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lt9/l;->G:Lp0/n0;

    invoke-virtual {v0, p2}, Lp0/n0;->e([Ljava/lang/Object;)Lt9/n;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_5
    new-instance p2, Ly9/b;

    invoke-direct {p2}, Ly9/b;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_12
    new-instance p2, Lu9/a;

    iget-boolean v0, p0, Lt9/l;->w:Z

    invoke-direct {p2, v0}, Lu9/a;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_13
    new-instance p2, Lab/e;

    iget-boolean v0, p0, Lt9/l;->w:Z

    invoke-direct {p2, v0}, Lab/e;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_14
    new-instance p2, Lab/d;

    invoke-direct {p2}, Lab/d;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_15
    new-instance p2, Lab/b;

    invoke-direct {p2}, Lab/b;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final declared-synchronized c(Landroid/net/Uri;Ljava/util/Map;)[Lt9/n;
    .locals 5

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lt9/l;->F:[I

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p2}, Ls6/a;->g(Ljava/util/Map;)I

    move-result p2

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    invoke-virtual {p0, v0, p2}, Lt9/l;->a(Ljava/util/ArrayList;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-static {p1}, Ls6/a;->h(Landroid/net/Uri;)I

    move-result p1

    if-eq p1, v3, :cond_1

    if-eq p1, p2, :cond_1

    invoke-virtual {p0, v0, p1}, Lt9/l;->a(Ljava/util/ArrayList;I)V

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    aget v4, v1, v3

    if-eq v4, p2, :cond_2

    if-eq v4, p1, :cond_2

    invoke-virtual {p0, v0, v4}, Lt9/l;->a(Ljava/util/ArrayList;I)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lt9/n;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lt9/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized d()[Lt9/n;
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, v0, v1}, Lt9/l;->c(Landroid/net/Uri;Ljava/util/Map;)[Lt9/n;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
