.class public final Lqa3/y0;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final P:Lqa3/y0;

.field public static final Q:Lqa3/l;


# instance fields
.field public E:I

.field public F:Ljava/util/List;

.field public G:Lqa3/w0;

.field public H:I

.field public I:Lqa3/w0;

.field public J:I

.field public K:Ljava/util/List;

.field public L:Ljava/util/List;

.field public M:Ljava/util/List;

.field public N:B

.field public O:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqa3/l;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lqa3/l;-><init>(I)V

    sput-object v0, Lqa3/y0;->Q:Lqa3/l;

    new-instance v0, Lqa3/y0;

    invoke-direct {v0}, Lqa3/y0;-><init>()V

    sput-object v0, Lqa3/y0;->P:Lqa3/y0;

    const/4 v1, 0x6

    iput v1, v0, Lqa3/y0;->z:I

    const/4 v1, 0x0

    iput v1, v0, Lqa3/y0;->E:I

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, v0, Lqa3/y0;->F:Ljava/util/List;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    iput-object v3, v0, Lqa3/y0;->G:Lqa3/w0;

    iput v1, v0, Lqa3/y0;->H:I

    iput-object v3, v0, Lqa3/y0;->I:Lqa3/w0;

    iput v1, v0, Lqa3/y0;->J:I

    iput-object v2, v0, Lqa3/y0;->K:Ljava/util/List;

    iput-object v2, v0, Lqa3/y0;->L:Ljava/util/List;

    iput-object v2, v0, Lqa3/y0;->M:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput-byte v0, p0, Lqa3/y0;->N:B

    .line 8
    iput v0, p0, Lqa3/y0;->O:I

    .line 9
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/y0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/x0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/y0;->N:B

    .line 3
    iput v0, p0, Lqa3/y0;->O:I

    .line 4
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 5
    iput-object p1, p0, Lqa3/y0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 12

    .line 10
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/y0;->N:B

    .line 12
    iput v0, p0, Lqa3/y0;->O:I

    const/4 v0, 0x6

    .line 13
    iput v0, p0, Lqa3/y0;->z:I

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lqa3/y0;->E:I

    .line 15
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lqa3/y0;->F:Ljava/util/List;

    .line 16
    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    .line 17
    iput-object v2, p0, Lqa3/y0;->G:Lqa3/w0;

    .line 18
    iput v0, p0, Lqa3/y0;->H:I

    .line 19
    iput-object v2, p0, Lqa3/y0;->I:Lqa3/w0;

    .line 20
    iput v0, p0, Lqa3/y0;->J:I

    .line 21
    iput-object v1, p0, Lqa3/y0;->K:Ljava/util/List;

    .line 22
    iput-object v1, p0, Lqa3/y0;->L:Ljava/util/List;

    .line 23
    iput-object v1, p0, Lqa3/y0;->M:Ljava/util/List;

    .line 24
    new-instance v1, Lwa3/d;

    invoke-direct {v1}, Lwa3/d;-><init>()V

    const/4 v2, 0x1

    .line 25
    invoke-static {v1, v2}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v3

    move v4, v0

    :cond_0
    :goto_0
    const/16 v5, 0x80

    const/16 v6, 0x200

    const/4 v7, 0x4

    const/16 v8, 0x100

    if-nez v0, :cond_f

    .line 26
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v9

    const/4 v10, 0x0

    sparse-switch v9, :sswitch_data_0

    .line 27
    invoke-virtual {p0, p1, v3, p2, v9}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
    move v0, v2

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
    and-int/lit16 v9, v4, 0x200

    if-eq v9, v6, :cond_1

    .line 28
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lqa3/y0;->M:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 29
    :cond_1
    iget-object v9, p0, Lqa3/y0;->M:Ljava/util/List;

    sget-object v10, Lqa3/m;->H:Lqa3/l;

    invoke-virtual {p1, v10, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :sswitch_2
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v9

    .line 31
    invoke-virtual {p1, v9}, Lwa3/f;->e(I)I

    move-result v9

    and-int/lit16 v10, v4, 0x100

    if-eq v10, v8, :cond_2

    .line 32
    invoke-virtual {p1}, Lwa3/f;->c()I

    move-result v10

    if-lez v10, :cond_2

    .line 33
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lqa3/y0;->L:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 34
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lwa3/f;->c()I

    move-result v10

    if-lez v10, :cond_3

    .line 35
    iget-object v10, p0, Lqa3/y0;->L:Ljava/util/List;

    .line 36
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v11

    .line 37
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 38
    :cond_3
    invoke-virtual {p1, v9}, Lwa3/f;->d(I)V

    goto :goto_0

    :sswitch_3
    and-int/lit16 v9, v4, 0x100

    if-eq v9, v8, :cond_4

    .line 39
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lqa3/y0;->L:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 40
    :cond_4
    iget-object v9, p0, Lqa3/y0;->L:Ljava/util/List;

    .line 41
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v10

    .line 42
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_4
    and-int/lit16 v9, v4, 0x80

    if-eq v9, v5, :cond_5

    .line 43
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lqa3/y0;->K:Ljava/util/List;

    or-int/lit16 v4, v4, 0x80

    .line 44
    :cond_5
    iget-object v9, p0, Lqa3/y0;->K:Ljava/util/List;

    sget-object v10, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {p1, v10, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 45
    :sswitch_5
    iget v9, p0, Lqa3/y0;->y:I

    or-int/lit8 v9, v9, 0x20

    iput v9, p0, Lqa3/y0;->y:I

    .line 46
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v9

    .line 47
    iput v9, p0, Lqa3/y0;->J:I

    goto/16 :goto_0

    .line 48
    :sswitch_6
    iget v9, p0, Lqa3/y0;->y:I

    const/16 v11, 0x10

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_6

    .line 49
    iget-object v9, p0, Lqa3/y0;->I:Lqa3/w0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    invoke-static {v9}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v10

    .line 51
    :cond_6
    sget-object v9, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {p1, v9, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v9

    check-cast v9, Lqa3/w0;

    iput-object v9, p0, Lqa3/y0;->I:Lqa3/w0;

    if-eqz v10, :cond_7

    .line 52
    invoke-virtual {v10, v9}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 53
    invoke-virtual {v10}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v9

    iput-object v9, p0, Lqa3/y0;->I:Lqa3/w0;

    .line 54
    :cond_7
    iget v9, p0, Lqa3/y0;->y:I

    or-int/2addr v9, v11

    iput v9, p0, Lqa3/y0;->y:I

    goto/16 :goto_0

    .line 55
    :sswitch_7
    iget v9, p0, Lqa3/y0;->y:I

    or-int/lit8 v9, v9, 0x8

    iput v9, p0, Lqa3/y0;->y:I

    .line 56
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v9

    .line 57
    iput v9, p0, Lqa3/y0;->H:I

    goto/16 :goto_0

    .line 58
    :sswitch_8
    iget v9, p0, Lqa3/y0;->y:I

    and-int/2addr v9, v7

    if-ne v9, v7, :cond_8

    .line 59
    iget-object v9, p0, Lqa3/y0;->G:Lqa3/w0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-static {v9}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v10

    .line 61
    :cond_8
    sget-object v9, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {p1, v9, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v9

    check-cast v9, Lqa3/w0;

    iput-object v9, p0, Lqa3/y0;->G:Lqa3/w0;

    if-eqz v10, :cond_9

    .line 62
    invoke-virtual {v10, v9}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 63
    invoke-virtual {v10}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v9

    iput-object v9, p0, Lqa3/y0;->G:Lqa3/w0;

    .line 64
    :cond_9
    iget v9, p0, Lqa3/y0;->y:I

    or-int/2addr v9, v7

    iput v9, p0, Lqa3/y0;->y:I

    goto/16 :goto_0

    :sswitch_9
    and-int/lit8 v9, v4, 0x4

    if-eq v9, v7, :cond_a

    .line 65
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lqa3/y0;->F:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 66
    :cond_a
    iget-object v9, p0, Lqa3/y0;->F:Ljava/util/List;

    sget-object v10, Lqa3/b1;->O:Lqa3/a;

    invoke-virtual {p1, v10, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 67
    :sswitch_a
    iget v9, p0, Lqa3/y0;->y:I

    or-int/lit8 v9, v9, 0x2

    iput v9, p0, Lqa3/y0;->y:I

    .line 68
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v9

    .line 69
    iput v9, p0, Lqa3/y0;->E:I

    goto/16 :goto_0

    .line 70
    :sswitch_b
    iget v9, p0, Lqa3/y0;->y:I

    or-int/2addr v9, v2

    iput v9, p0, Lqa3/y0;->y:I

    .line 71
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v9

    .line 72
    iput v9, p0, Lqa3/y0;->z:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 73
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 74
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 75
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 76
    throw p2

    .line 77
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 78
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v7, :cond_b

    .line 79
    iget-object p2, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/y0;->F:Ljava/util/List;

    :cond_b
    and-int/lit16 p2, v4, 0x80

    if-ne p2, v5, :cond_c

    .line 80
    iget-object p2, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/y0;->K:Ljava/util/List;

    :cond_c
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v8, :cond_d

    .line 81
    iget-object p2, p0, Lqa3/y0;->L:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/y0;->L:Ljava/util/List;

    :cond_d
    and-int/lit16 p2, v4, 0x200

    if-ne p2, v6, :cond_e

    .line 82
    iget-object p2, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/y0;->M:Ljava/util/List;

    .line 83
    :cond_e
    :try_start_2
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    :catch_2
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/y0;->x:Lwa3/e;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/y0;->x:Lwa3/e;

    .line 85
    throw p1

    .line 86
    :goto_5
    invoke-virtual {p0}, Lwa3/m;->m()V

    .line 87
    throw p1

    :cond_f
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v7, :cond_10

    .line 88
    iget-object p1, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/y0;->F:Ljava/util/List;

    :cond_10
    and-int/lit16 p1, v4, 0x80

    if-ne p1, v5, :cond_11

    .line 89
    iget-object p1, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/y0;->K:Ljava/util/List;

    :cond_11
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v8, :cond_12

    .line 90
    iget-object p1, p0, Lqa3/y0;->L:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/y0;->L:Ljava/util/List;

    :cond_12
    and-int/lit16 p1, v4, 0x200

    if-ne p1, v6, :cond_13

    .line 91
    iget-object p1, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/y0;->M:Ljava/util/List;

    .line 92
    :cond_13
    :try_start_3
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 93
    :catch_3
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/y0;->x:Lwa3/e;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/y0;->x:Lwa3/e;

    .line 94
    throw p1

    .line 95
    :goto_6
    invoke-virtual {p0}, Lwa3/m;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_b
        0x10 -> :sswitch_a
        0x1a -> :sswitch_9
        0x22 -> :sswitch_8
        0x28 -> :sswitch_7
        0x32 -> :sswitch_6
        0x38 -> :sswitch_5
        0x42 -> :sswitch_4
        0xf8 -> :sswitch_3
        0xfa -> :sswitch_2
        0x102 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/y0;->P:Lqa3/y0;

    return-object v0
.end method

.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/y0;->N:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/y0;->y:I

    const/4 v3, 0x2

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_b

    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/b1;

    invoke-virtual {v3}, Lqa3/b1;->b()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Lqa3/y0;->N:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget v0, p0, Lqa3/y0;->y:I

    const/4 v3, 0x4

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lqa3/y0;->G:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Lqa3/y0;->N:B

    return v2

    :cond_4
    iget v0, p0, Lqa3/y0;->y:I

    const/16 v3, 0x10

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lqa3/y0;->I:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, Lqa3/y0;->N:B

    return v2

    :cond_5
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_7

    iget-object v3, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_6

    iput-byte v2, p0, Lqa3/y0;->N:B

    return v2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    move v0, v2

    :goto_2
    iget-object v3, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_9

    iget-object v3, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/m;

    invoke-virtual {v3}, Lqa3/m;->b()Z

    move-result v3

    if-nez v3, :cond_8

    iput-byte v2, p0, Lqa3/y0;->N:B

    return v2

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_a

    iput-byte v2, p0, Lqa3/y0;->N:B

    return v2

    :cond_a
    iput-byte v1, p0, Lqa3/y0;->N:B

    return v1

    :cond_b
    iput-byte v2, p0, Lqa3/y0;->N:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/x0;->k()Lqa3/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/x0;->n(Lqa3/y0;)V

    return-object v0
.end method

.method public final d()I
    .locals 7

    iget v0, p0, Lqa3/y0;->O:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/y0;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/y0;->z:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Lqa3/y0;->y:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Lqa3/y0;->E:I

    invoke-static {v3, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    move v1, v2

    :goto_1
    iget-object v4, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_3

    iget-object v4, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/4 v5, 0x3

    invoke-static {v5, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget v1, p0, Lqa3/y0;->y:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-object v1, p0, Lqa3/y0;->G:Lqa3/w0;

    invoke-static {v4, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/y0;->y:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_5

    const/4 v1, 0x5

    iget v5, p0, Lqa3/y0;->H:I

    invoke-static {v1, v5}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Lqa3/y0;->y:I

    const/16 v5, 0x10

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_6

    const/4 v1, 0x6

    iget-object v5, p0, Lqa3/y0;->I:Lqa3/w0;

    invoke-static {v1, v5}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, Lqa3/y0;->y:I

    const/16 v5, 0x20

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_7

    const/4 v1, 0x7

    iget v6, p0, Lqa3/y0;->J:I

    invoke-static {v1, v6}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    move v1, v2

    :goto_2
    iget-object v6, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_8

    iget-object v6, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwa3/v;

    invoke-static {v4, v6}, Lwa3/g;->d(ILwa3/v;)I

    move-result v6

    add-int/2addr v0, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    move v1, v2

    move v4, v1

    :goto_3
    iget-object v6, p0, Lqa3/y0;->L:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_9

    iget-object v6, p0, Lqa3/y0;->L:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->c(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_9
    add-int/2addr v0, v4

    iget-object v1, p0, Lqa3/y0;->L:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/2addr v1, v3

    add-int/2addr v1, v0

    :goto_4
    iget-object v0, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_a

    iget-object v0, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwa3/v;

    invoke-static {v5, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v1, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_a
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v0

    add-int/2addr v0, v1

    iget-object v1, p0, Lqa3/y0;->x:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/y0;->O:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/x0;->k()Lqa3/x0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 6

    invoke-virtual {p0}, Lqa3/y0;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/y0;->y:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Lqa3/y0;->z:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_0
    iget v1, p0, Lqa3/y0;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lqa3/y0;->E:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_1
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x3

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v2, p0, Lqa3/y0;->y:I

    const/4 v3, 0x4

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lqa3/y0;->G:Lqa3/w0;

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_3
    iget v2, p0, Lqa3/y0;->y:I

    const/16 v3, 0x8

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_4

    const/4 v2, 0x5

    iget v4, p0, Lqa3/y0;->H:I

    invoke-virtual {p1, v2, v4}, Lwa3/g;->m(II)V

    :cond_4
    iget v2, p0, Lqa3/y0;->y:I

    const/16 v4, 0x10

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    const/4 v2, 0x6

    iget-object v4, p0, Lqa3/y0;->I:Lqa3/w0;

    invoke-virtual {p1, v2, v4}, Lwa3/g;->o(ILwa3/v;)V

    :cond_5
    iget v2, p0, Lqa3/y0;->y:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_6

    const/4 v2, 0x7

    iget v5, p0, Lqa3/y0;->J:I

    invoke-virtual {p1, v2, v5}, Lwa3/g;->m(II)V

    :cond_6
    move v2, v1

    :goto_1
    iget-object v5, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_7

    iget-object v5, p0, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwa3/v;

    invoke-virtual {p1, v3, v5}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    move v2, v1

    :goto_2
    iget-object v3, p0, Lqa3/y0;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_8

    iget-object v3, p0, Lqa3/y0;->L:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v5, 0x1f

    invoke-virtual {p1, v5, v3}, Lwa3/g;->m(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    iget-object v2, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_9

    iget-object v2, p0, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    invoke-virtual {p1, v4, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_9
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/y0;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
