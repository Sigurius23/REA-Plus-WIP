.class public final Lqa3/w0;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final U:Lqa3/w0;

.field public static final V:Lqa3/a;


# instance fields
.field public E:Z

.field public F:I

.field public G:Lqa3/w0;

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:Lqa3/w0;

.field public N:I

.field public O:Lqa3/w0;

.field public P:I

.field public Q:I

.field public R:Ljava/util/List;

.field public S:B

.field public T:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/w0;->V:Lqa3/a;

    new-instance v0, Lqa3/w0;

    invoke-direct {v0}, Lqa3/w0;-><init>()V

    sput-object v0, Lqa3/w0;->U:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->q()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput-byte v0, p0, Lqa3/w0;->S:B

    .line 8
    iput v0, p0, Lqa3/w0;->T:I

    .line 9
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/w0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/v0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/w0;->S:B

    .line 3
    iput v0, p0, Lqa3/w0;->T:I

    .line 4
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 5
    iput-object p1, p0, Lqa3/w0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 11

    .line 10
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/w0;->S:B

    .line 12
    iput v0, p0, Lqa3/w0;->T:I

    .line 13
    invoke-virtual {p0}, Lqa3/w0;->q()V

    .line 14
    new-instance v0, Lwa3/d;

    invoke-direct {v0}, Lwa3/d;-><init>()V

    const/4 v1, 0x1

    .line 15
    invoke-static {v0, v1}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :cond_0
    :goto_0
    const/16 v6, 0x4000

    if-nez v4, :cond_c

    .line 16
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v7
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    sget-object v8, Lqa3/w0;->V:Lqa3/a;

    const/4 v9, 0x0

    sparse-switch v7, :sswitch_data_0

    .line 18
    :try_start_1
    invoke-virtual {p0, p1, v2, p2, v7}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v6

    if-nez v6, :cond_0

    :sswitch_0
    move v4, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :sswitch_1
    and-int/lit16 v7, v5, 0x4000

    if-eq v7, v6, :cond_1

    .line 19
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lqa3/w0;->R:Ljava/util/List;

    or-int/lit16 v5, v5, 0x4000

    .line 20
    :cond_1
    iget-object v7, p0, Lqa3/w0;->R:Ljava/util/List;

    sget-object v8, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :sswitch_2
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit16 v7, v7, 0x800

    iput v7, p0, Lqa3/w0;->y:I

    .line 22
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 23
    iput v7, p0, Lqa3/w0;->P:I

    goto :goto_0

    .line 24
    :sswitch_3
    iget v7, p0, Lqa3/w0;->y:I

    const/16 v10, 0x400

    and-int/2addr v7, v10

    if-ne v7, v10, :cond_2

    .line 25
    iget-object v7, p0, Lqa3/w0;->O:Lqa3/w0;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-static {v7}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v9

    .line 27
    :cond_2
    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    check-cast v7, Lqa3/w0;

    iput-object v7, p0, Lqa3/w0;->O:Lqa3/w0;

    if-eqz v9, :cond_3

    .line 28
    invoke-virtual {v9, v7}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 29
    invoke-virtual {v9}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v7

    iput-object v7, p0, Lqa3/w0;->O:Lqa3/w0;

    .line 30
    :cond_3
    iget v7, p0, Lqa3/w0;->y:I

    or-int/2addr v7, v10

    iput v7, p0, Lqa3/w0;->y:I

    goto :goto_0

    .line 31
    :sswitch_4
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit16 v7, v7, 0x80

    iput v7, p0, Lqa3/w0;->y:I

    .line 32
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 33
    iput v7, p0, Lqa3/w0;->L:I

    goto :goto_0

    .line 34
    :sswitch_5
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit16 v7, v7, 0x200

    iput v7, p0, Lqa3/w0;->y:I

    .line 35
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 36
    iput v7, p0, Lqa3/w0;->N:I

    goto/16 :goto_0

    .line 37
    :sswitch_6
    iget v7, p0, Lqa3/w0;->y:I

    const/16 v10, 0x100

    and-int/2addr v7, v10

    if-ne v7, v10, :cond_4

    .line 38
    iget-object v7, p0, Lqa3/w0;->M:Lqa3/w0;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-static {v7}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v9

    .line 40
    :cond_4
    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    check-cast v7, Lqa3/w0;

    iput-object v7, p0, Lqa3/w0;->M:Lqa3/w0;

    if-eqz v9, :cond_5

    .line 41
    invoke-virtual {v9, v7}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 42
    invoke-virtual {v9}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v7

    iput-object v7, p0, Lqa3/w0;->M:Lqa3/w0;

    .line 43
    :cond_5
    iget v7, p0, Lqa3/w0;->y:I

    or-int/2addr v7, v10

    iput v7, p0, Lqa3/w0;->y:I

    goto/16 :goto_0

    .line 44
    :sswitch_7
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit8 v7, v7, 0x40

    iput v7, p0, Lqa3/w0;->y:I

    .line 45
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 46
    iput v7, p0, Lqa3/w0;->K:I

    goto/16 :goto_0

    .line 47
    :sswitch_8
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit8 v7, v7, 0x8

    iput v7, p0, Lqa3/w0;->y:I

    .line 48
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 49
    iput v7, p0, Lqa3/w0;->H:I

    goto/16 :goto_0

    .line 50
    :sswitch_9
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit8 v7, v7, 0x20

    iput v7, p0, Lqa3/w0;->y:I

    .line 51
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 52
    iput v7, p0, Lqa3/w0;->J:I

    goto/16 :goto_0

    .line 53
    :sswitch_a
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit8 v7, v7, 0x10

    iput v7, p0, Lqa3/w0;->y:I

    .line 54
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 55
    iput v7, p0, Lqa3/w0;->I:I

    goto/16 :goto_0

    .line 56
    :sswitch_b
    iget v7, p0, Lqa3/w0;->y:I

    const/4 v10, 0x4

    and-int/2addr v7, v10

    if-ne v7, v10, :cond_6

    .line 57
    iget-object v7, p0, Lqa3/w0;->G:Lqa3/w0;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    invoke-static {v7}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v9

    .line 59
    :cond_6
    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    check-cast v7, Lqa3/w0;

    iput-object v7, p0, Lqa3/w0;->G:Lqa3/w0;

    if-eqz v9, :cond_7

    .line 60
    invoke-virtual {v9, v7}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 61
    invoke-virtual {v9}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v7

    iput-object v7, p0, Lqa3/w0;->G:Lqa3/w0;

    .line 62
    :cond_7
    iget v7, p0, Lqa3/w0;->y:I

    or-int/2addr v7, v10

    iput v7, p0, Lqa3/w0;->y:I

    goto/16 :goto_0

    .line 63
    :sswitch_c
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Lqa3/w0;->y:I

    .line 64
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 65
    iput v7, p0, Lqa3/w0;->F:I

    goto/16 :goto_0

    .line 66
    :sswitch_d
    iget v7, p0, Lqa3/w0;->y:I

    or-int/2addr v7, v1

    iput v7, p0, Lqa3/w0;->y:I

    .line 67
    invoke-virtual {p1}, Lwa3/f;->m()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v7, v7, v9

    if-eqz v7, :cond_8

    move v7, v1

    goto :goto_1

    :cond_8
    move v7, v3

    .line 68
    :goto_1
    iput-boolean v7, p0, Lqa3/w0;->E:Z

    goto/16 :goto_0

    :sswitch_e
    and-int/lit8 v7, v5, 0x1

    if-eq v7, v1, :cond_9

    .line 69
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lqa3/w0;->z:Ljava/util/List;

    or-int/lit8 v5, v5, 0x1

    .line 70
    :cond_9
    iget-object v7, p0, Lqa3/w0;->z:Ljava/util/List;

    sget-object v8, Lqa3/u0;->I:Lqa3/a;

    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 71
    :sswitch_f
    iget v7, p0, Lqa3/w0;->y:I

    or-int/lit16 v7, v7, 0x1000

    iput v7, p0, Lqa3/w0;->y:I

    .line 72
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 73
    iput v7, p0, Lqa3/w0;->Q:I
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 74
    :goto_2
    :try_start_2
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 75
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 76
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 77
    throw p2

    .line 78
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 79
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    and-int/lit8 p2, v5, 0x1

    if-ne p2, v1, :cond_a

    .line 80
    iget-object p2, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/w0;->z:Ljava/util/List;

    :cond_a
    and-int/lit16 p2, v5, 0x4000

    if-ne p2, v6, :cond_b

    .line 81
    iget-object p2, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/w0;->R:Ljava/util/List;

    .line 82
    :cond_b
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/w0;->x:Lwa3/e;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/w0;->x:Lwa3/e;

    .line 84
    throw p1

    .line 85
    :goto_5
    invoke-virtual {p0}, Lwa3/m;->m()V

    .line 86
    throw p1

    :cond_c
    and-int/lit8 p1, v5, 0x1

    if-ne p1, v1, :cond_d

    .line 87
    iget-object p1, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/w0;->z:Ljava/util/List;

    :cond_d
    and-int/lit16 p1, v5, 0x4000

    if-ne p1, v6, :cond_e

    .line 88
    iget-object p1, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/w0;->R:Ljava/util/List;

    .line 89
    :cond_e
    :try_start_4
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 90
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/w0;->x:Lwa3/e;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/w0;->x:Lwa3/e;

    .line 91
    throw p1

    .line 92
    :goto_6
    invoke-virtual {p0}, Lwa3/m;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_f
        0x12 -> :sswitch_e
        0x18 -> :sswitch_d
        0x20 -> :sswitch_c
        0x2a -> :sswitch_b
        0x30 -> :sswitch_a
        0x38 -> :sswitch_9
        0x40 -> :sswitch_8
        0x48 -> :sswitch_7
        0x52 -> :sswitch_6
        0x58 -> :sswitch_5
        0x60 -> :sswitch_4
        0x6a -> :sswitch_3
        0x70 -> :sswitch_2
        0x322 -> :sswitch_1
    .end sparse-switch
.end method

.method public static r(Lqa3/w0;)Lqa3/v0;
    .locals 1

    invoke-static {}, Lqa3/v0;->l()Lqa3/v0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    return-object v0
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/w0;->U:Lqa3/w0;

    return-object v0
.end method

.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/w0;->S:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/u0;

    invoke-virtual {v3}, Lqa3/u0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Lqa3/w0;->S:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget v0, p0, Lqa3/w0;->y:I

    const/4 v3, 0x4

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lqa3/w0;->G:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Lqa3/w0;->S:B

    return v2

    :cond_4
    iget v0, p0, Lqa3/w0;->y:I

    const/16 v3, 0x100

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lqa3/w0;->M:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, Lqa3/w0;->S:B

    return v2

    :cond_5
    iget v0, p0, Lqa3/w0;->y:I

    const/16 v3, 0x400

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_6

    iget-object v0, p0, Lqa3/w0;->O:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Lqa3/w0;->S:B

    return v2

    :cond_6
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_8

    iget-object v3, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_7

    iput-byte v2, p0, Lqa3/w0;->S:B

    return v2

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_9

    iput-byte v2, p0, Lqa3/w0;->S:B

    return v2

    :cond_9
    iput-byte v1, p0, Lqa3/w0;->S:B

    return v1
.end method

.method public final bridge synthetic c()Lwa3/k;
    .locals 1

    invoke-virtual {p0}, Lqa3/w0;->s()Lqa3/v0;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 6

    iget v0, p0, Lqa3/w0;->T:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/w0;->y:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/w0;->Q:I

    invoke-static {v3, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    move v1, v2

    :goto_1
    iget-object v4, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x2

    if-ge v1, v4, :cond_2

    iget-object v4, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    invoke-static {v5, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget v1, p0, Lqa3/w0;->y:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    invoke-static {v1}, Lwa3/g;->h(I)I

    move-result v1

    add-int/2addr v1, v3

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Lqa3/w0;->y:I

    and-int/2addr v1, v5

    const/4 v3, 0x4

    if-ne v1, v5, :cond_4

    iget v1, p0, Lqa3/w0;->F:I

    invoke-static {v3, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/w0;->y:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x5

    iget-object v3, p0, Lqa3/w0;->G:Lqa3/w0;

    invoke-static {v1, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_6

    const/4 v1, 0x6

    iget v3, p0, Lqa3/w0;->I:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x20

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_7

    const/4 v1, 0x7

    iget v3, p0, Lqa3/w0;->J:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_8

    iget v1, p0, Lqa3/w0;->H:I

    invoke-static {v3, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x40

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_9

    const/16 v1, 0x9

    iget v3, p0, Lqa3/w0;->K:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x100

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_a

    const/16 v1, 0xa

    iget-object v3, p0, Lqa3/w0;->M:Lqa3/w0;

    invoke-static {v1, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x200

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_b

    const/16 v1, 0xb

    iget v3, p0, Lqa3/w0;->N:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x80

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_c

    const/16 v1, 0xc

    iget v3, p0, Lqa3/w0;->L:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x400

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_d

    const/16 v1, 0xd

    iget-object v3, p0, Lqa3/w0;->O:Lqa3/w0;

    invoke-static {v1, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    iget v1, p0, Lqa3/w0;->y:I

    const/16 v3, 0x800

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_e

    const/16 v1, 0xe

    iget v3, p0, Lqa3/w0;->P:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    :goto_2
    iget-object v1, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_f

    iget-object v1, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/16 v3, 0x64

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_f
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Lqa3/w0;->x:Lwa3/e;

    invoke-virtual {v0}, Lwa3/e;->size()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lqa3/w0;->T:I

    return v0
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/v0;->l()Lqa3/v0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 6

    invoke-virtual {p0}, Lqa3/w0;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/w0;->y:I

    const/16 v2, 0x1000

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lqa3/w0;->Q:I

    invoke-virtual {p1, v3, v1}, Lwa3/g;->m(II)V

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v4, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x2

    if-ge v2, v4, :cond_1

    iget-object v4, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    invoke-virtual {p1, v5, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget v2, p0, Lqa3/w0;->y:I

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lqa3/w0;->E:Z

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v1}, Lwa3/g;->x(II)V

    invoke-virtual {p1, v2}, Lwa3/g;->q(I)V

    :cond_2
    iget v2, p0, Lqa3/w0;->y:I

    and-int/2addr v2, v5

    const/4 v3, 0x4

    if-ne v2, v5, :cond_3

    iget v2, p0, Lqa3/w0;->F:I

    invoke-virtual {p1, v3, v2}, Lwa3/g;->m(II)V

    :cond_3
    iget v2, p0, Lqa3/w0;->y:I

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_4

    const/4 v2, 0x5

    iget-object v3, p0, Lqa3/w0;->G:Lqa3/w0;

    invoke-virtual {p1, v2, v3}, Lwa3/g;->o(ILwa3/v;)V

    :cond_4
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x10

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_5

    const/4 v2, 0x6

    iget v3, p0, Lqa3/w0;->I:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_5
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x20

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_6

    const/4 v2, 0x7

    iget v3, p0, Lqa3/w0;->J:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_6
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x8

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_7

    iget v2, p0, Lqa3/w0;->H:I

    invoke-virtual {p1, v3, v2}, Lwa3/g;->m(II)V

    :cond_7
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x40

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_8

    const/16 v2, 0x9

    iget v3, p0, Lqa3/w0;->K:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_8
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x100

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_9

    const/16 v2, 0xa

    iget-object v3, p0, Lqa3/w0;->M:Lqa3/w0;

    invoke-virtual {p1, v2, v3}, Lwa3/g;->o(ILwa3/v;)V

    :cond_9
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x200

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_a

    const/16 v2, 0xb

    iget v3, p0, Lqa3/w0;->N:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_a
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_b

    const/16 v2, 0xc

    iget v3, p0, Lqa3/w0;->L:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_b
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x400

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_c

    const/16 v2, 0xd

    iget-object v3, p0, Lqa3/w0;->O:Lqa3/w0;

    invoke-virtual {p1, v2, v3}, Lwa3/g;->o(ILwa3/v;)V

    :cond_c
    iget v2, p0, Lqa3/w0;->y:I

    const/16 v3, 0x800

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_d

    const/16 v2, 0xe

    iget v3, p0, Lqa3/w0;->P:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_d
    :goto_1
    iget-object v2, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_e

    iget-object v2, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/16 v3, 0x64

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_e
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/w0;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final p()Z
    .locals 2

    iget v0, p0, Lqa3/w0;->y:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final q()V
    .locals 3

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lqa3/w0;->z:Ljava/util/List;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lqa3/w0;->E:Z

    iput v1, p0, Lqa3/w0;->F:I

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, p0, Lqa3/w0;->G:Lqa3/w0;

    iput v1, p0, Lqa3/w0;->H:I

    iput v1, p0, Lqa3/w0;->I:I

    iput v1, p0, Lqa3/w0;->J:I

    iput v1, p0, Lqa3/w0;->K:I

    iput v1, p0, Lqa3/w0;->L:I

    iput-object v2, p0, Lqa3/w0;->M:Lqa3/w0;

    iput v1, p0, Lqa3/w0;->N:I

    iput-object v2, p0, Lqa3/w0;->O:Lqa3/w0;

    iput v1, p0, Lqa3/w0;->P:I

    iput v1, p0, Lqa3/w0;->Q:I

    iput-object v0, p0, Lqa3/w0;->R:Ljava/util/List;

    return-void
.end method

.method public final s()Lqa3/v0;
    .locals 1

    invoke-static {p0}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v0

    return-object v0
.end method
