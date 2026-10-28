.class public final Lqa3/b1;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final N:Lqa3/b1;

.field public static final O:Lqa3/a;


# instance fields
.field public E:I

.field public F:Z

.field public G:Lqa3/a1;

.field public H:Ljava/util/List;

.field public I:Ljava/util/List;

.field public J:I

.field public K:Ljava/util/List;

.field public L:B

.field public M:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/b1;->O:Lqa3/a;

    new-instance v0, Lqa3/b1;

    invoke-direct {v0}, Lqa3/b1;-><init>()V

    sput-object v0, Lqa3/b1;->N:Lqa3/b1;

    const/4 v1, 0x0

    iput v1, v0, Lqa3/b1;->z:I

    iput v1, v0, Lqa3/b1;->E:I

    iput-boolean v1, v0, Lqa3/b1;->F:Z

    sget-object v1, Lqa3/a1;->z:Lqa3/a1;

    iput-object v1, v0, Lqa3/b1;->G:Lqa3/a1;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/b1;->H:Ljava/util/List;

    iput-object v1, v0, Lqa3/b1;->I:Ljava/util/List;

    iput-object v1, v0, Lqa3/b1;->K:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lqa3/b1;->J:I

    .line 9
    iput-byte v0, p0, Lqa3/b1;->L:B

    .line 10
    iput v0, p0, Lqa3/b1;->M:I

    .line 11
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/b1;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/z0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lqa3/b1;->J:I

    .line 3
    iput-byte v0, p0, Lqa3/b1;->L:B

    .line 4
    iput v0, p0, Lqa3/b1;->M:I

    .line 5
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 6
    iput-object p1, p0, Lqa3/b1;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 12
    invoke-direct {v1}, Lwa3/m;-><init>()V

    const/4 v3, -0x1

    .line 13
    iput v3, v1, Lqa3/b1;->J:I

    .line 14
    iput-byte v3, v1, Lqa3/b1;->L:B

    .line 15
    iput v3, v1, Lqa3/b1;->M:I

    const/4 v3, 0x0

    .line 16
    iput v3, v1, Lqa3/b1;->z:I

    .line 17
    iput v3, v1, Lqa3/b1;->E:I

    .line 18
    iput-boolean v3, v1, Lqa3/b1;->F:Z

    .line 19
    sget-object v4, Lqa3/a1;->z:Lqa3/a1;

    iput-object v4, v1, Lqa3/b1;->G:Lqa3/a1;

    .line 20
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v5, v1, Lqa3/b1;->H:Ljava/util/List;

    .line 21
    iput-object v5, v1, Lqa3/b1;->I:Ljava/util/List;

    .line 22
    iput-object v5, v1, Lqa3/b1;->K:Ljava/util/List;

    .line 23
    new-instance v5, Lwa3/d;

    invoke-direct {v5}, Lwa3/d;-><init>()V

    const/4 v6, 0x1

    .line 24
    invoke-static {v5, v6}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v7

    move v8, v3

    move v9, v8

    :goto_0
    const/16 v10, 0x40

    const/16 v11, 0x10

    const/16 v12, 0x20

    if-nez v8, :cond_17

    .line 25
    :try_start_0
    invoke-virtual {v0}, Lwa3/f;->o()I

    move-result v13

    if-eqz v13, :cond_0

    const/16 v14, 0x8

    if-eq v13, v14, :cond_12

    const/4 v15, 0x2

    if-eq v13, v11, :cond_11

    const/16 v3, 0x18

    if-eq v13, v3, :cond_f

    if-eq v13, v12, :cond_a

    const/16 v3, 0x2a

    if-eq v13, v3, :cond_8

    const/16 v3, 0x30

    if-eq v13, v3, :cond_6

    const/16 v3, 0x32

    if-eq v13, v3, :cond_3

    const/16 v3, 0x322

    if-eq v13, v3, :cond_1

    .line 26
    invoke-virtual {v1, v0, v7, v2, v13}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_0
    move v8, v6

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :catch_1
    move-exception v0

    goto/16 :goto_6

    :cond_1
    and-int/lit8 v3, v9, 0x40

    if-eq v3, v10, :cond_2

    .line 27
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lqa3/b1;->K:Ljava/util/List;

    or-int/lit8 v9, v9, 0x40

    .line 28
    :cond_2
    iget-object v3, v1, Lqa3/b1;->K:Ljava/util/List;

    sget-object v13, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v13

    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 29
    :cond_3
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v3

    .line 30
    invoke-virtual {v0, v3}, Lwa3/f;->e(I)I

    move-result v3

    and-int/lit8 v13, v9, 0x20

    if-eq v13, v12, :cond_4

    .line 31
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v13

    if-lez v13, :cond_4

    .line 32
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iput-object v13, v1, Lqa3/b1;->I:Ljava/util/List;

    or-int/lit8 v9, v9, 0x20

    .line 33
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v13

    if-lez v13, :cond_5

    .line 34
    iget-object v13, v1, Lqa3/b1;->I:Ljava/util/List;

    .line 35
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v14

    .line 36
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 37
    :cond_5
    invoke-virtual {v0, v3}, Lwa3/f;->d(I)V

    goto/16 :goto_4

    :cond_6
    and-int/lit8 v3, v9, 0x20

    if-eq v3, v12, :cond_7

    .line 38
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lqa3/b1;->I:Ljava/util/List;

    or-int/lit8 v9, v9, 0x20

    .line 39
    :cond_7
    iget-object v3, v1, Lqa3/b1;->I:Ljava/util/List;

    .line 40
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v13

    .line 41
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_8
    and-int/lit8 v3, v9, 0x10

    if-eq v3, v11, :cond_9

    .line 42
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lqa3/b1;->H:Ljava/util/List;

    or-int/lit8 v9, v9, 0x10

    .line 43
    :cond_9
    iget-object v3, v1, Lqa3/b1;->H:Ljava/util/List;

    sget-object v13, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v13

    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 44
    :cond_a
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v3

    if-eqz v3, :cond_d

    if-eq v3, v6, :cond_c

    if-eq v3, v15, :cond_b

    const/4 v15, 0x0

    goto :goto_2

    :cond_b
    move-object v15, v4

    goto :goto_2

    .line 45
    :cond_c
    sget-object v15, Lqa3/a1;->y:Lqa3/a1;

    goto :goto_2

    .line 46
    :cond_d
    sget-object v15, Lqa3/a1;->x:Lqa3/a1;

    :goto_2
    if-nez v15, :cond_e

    .line 47
    invoke-virtual {v7, v13}, Lwa3/g;->v(I)V

    .line 48
    invoke-virtual {v7, v3}, Lwa3/g;->v(I)V

    goto :goto_4

    .line 49
    :cond_e
    iget v3, v1, Lqa3/b1;->y:I

    or-int/2addr v3, v14

    iput v3, v1, Lqa3/b1;->y:I

    .line 50
    iput-object v15, v1, Lqa3/b1;->G:Lqa3/a1;

    goto :goto_4

    .line 51
    :cond_f
    iget v3, v1, Lqa3/b1;->y:I

    or-int/lit8 v3, v3, 0x4

    iput v3, v1, Lqa3/b1;->y:I

    .line 52
    invoke-virtual {v0}, Lwa3/f;->m()J

    move-result-wide v13

    const-wide/16 v16, 0x0

    cmp-long v3, v13, v16

    if-eqz v3, :cond_10

    move v3, v6

    goto :goto_3

    :cond_10
    const/4 v3, 0x0

    .line 53
    :goto_3
    iput-boolean v3, v1, Lqa3/b1;->F:Z

    goto :goto_4

    .line 54
    :cond_11
    iget v3, v1, Lqa3/b1;->y:I

    or-int/2addr v3, v15

    iput v3, v1, Lqa3/b1;->y:I

    .line 55
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v3

    .line 56
    iput v3, v1, Lqa3/b1;->E:I

    goto :goto_4

    .line 57
    :cond_12
    iget v3, v1, Lqa3/b1;->y:I

    or-int/2addr v3, v6

    iput v3, v1, Lqa3/b1;->y:I

    .line 58
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v3

    .line 59
    iput v3, v1, Lqa3/b1;->z:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_13
    :goto_4
    const/4 v3, 0x0

    goto/16 :goto_0

    .line 60
    :goto_5
    :try_start_1
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 61
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 62
    iput-object v1, v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 63
    throw v2

    .line 64
    :goto_6
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 65
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_7
    and-int/lit8 v2, v9, 0x10

    if-ne v2, v11, :cond_14

    .line 66
    iget-object v2, v1, Lqa3/b1;->H:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/b1;->H:Ljava/util/List;

    :cond_14
    and-int/lit8 v2, v9, 0x20

    if-ne v2, v12, :cond_15

    .line 67
    iget-object v2, v1, Lqa3/b1;->I:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/b1;->I:Ljava/util/List;

    :cond_15
    and-int/lit8 v2, v9, 0x40

    if-ne v2, v10, :cond_16

    .line 68
    iget-object v2, v1, Lqa3/b1;->K:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/b1;->K:Ljava/util/List;

    .line 69
    :cond_16
    :try_start_2
    invoke-virtual {v7}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    :catch_2
    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/b1;->x:Lwa3/e;

    goto :goto_8

    :catchall_1
    move-exception v0

    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/b1;->x:Lwa3/e;

    .line 71
    throw v0

    .line 72
    :goto_8
    invoke-virtual {v1}, Lwa3/m;->m()V

    .line 73
    throw v0

    :cond_17
    and-int/lit8 v0, v9, 0x10

    if-ne v0, v11, :cond_18

    .line 74
    iget-object v0, v1, Lqa3/b1;->H:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/b1;->H:Ljava/util/List;

    :cond_18
    and-int/lit8 v0, v9, 0x20

    if-ne v0, v12, :cond_19

    .line 75
    iget-object v0, v1, Lqa3/b1;->I:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/b1;->I:Ljava/util/List;

    :cond_19
    and-int/lit8 v0, v9, 0x40

    if-ne v0, v10, :cond_1a

    .line 76
    iget-object v0, v1, Lqa3/b1;->K:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/b1;->K:Ljava/util/List;

    .line 77
    :cond_1a
    :try_start_3
    invoke-virtual {v7}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 78
    :catch_3
    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, v1, Lqa3/b1;->x:Lwa3/e;

    goto :goto_9

    :catchall_2
    move-exception v0

    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/b1;->x:Lwa3/e;

    .line 79
    throw v0

    .line 80
    :goto_9
    invoke-virtual {v1}, Lwa3/m;->m()V

    return-void
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/b1;->N:Lqa3/b1;

    return-object v0
.end method

.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/b1;->L:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/b1;->y:I

    and-int/lit8 v3, v0, 0x1

    if-ne v3, v1, :cond_8

    const/4 v3, 0x2

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_7

    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-virtual {v3}, Lqa3/w0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Lqa3/b1;->L:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    iget-object v3, p0, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Lqa3/b1;->L:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Lqa3/b1;->L:B

    return v2

    :cond_6
    iput-byte v1, p0, Lqa3/b1;->L:B

    return v1

    :cond_7
    iput-byte v2, p0, Lqa3/b1;->L:B

    return v2

    :cond_8
    iput-byte v2, p0, Lqa3/b1;->L:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/z0;->k()Lqa3/z0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/z0;->n(Lqa3/b1;)V

    return-object v0
.end method

.method public final d()I
    .locals 5

    iget v0, p0, Lqa3/b1;->M:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/b1;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/b1;->z:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v3, p0, Lqa3/b1;->y:I

    const/4 v4, 0x2

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_2

    iget v3, p0, Lqa3/b1;->E:I

    invoke-static {v4, v3}, Lwa3/g;->b(II)I

    move-result v3

    add-int/2addr v0, v3

    :cond_2
    iget v3, p0, Lqa3/b1;->y:I

    const/4 v4, 0x4

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_3

    const/4 v3, 0x3

    invoke-static {v3}, Lwa3/g;->h(I)I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v0, v3

    :cond_3
    iget v1, p0, Lqa3/b1;->y:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lqa3/b1;->G:Lqa3/a1;

    iget v1, v1, Lqa3/a1;->w:I

    invoke-static {v4, v1}, Lwa3/g;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    move v1, v2

    :goto_1
    iget-object v3, p0, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    iget-object v3, p0, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x5

    invoke-static {v4, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    move v1, v2

    move v3, v1

    :goto_2
    iget-object v4, p0, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_6

    iget-object v4, p0, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lwa3/g;->c(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    add-int/2addr v0, v3

    iget-object v1, p0, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    add-int/lit8 v0, v0, 0x1

    invoke-static {v3}, Lwa3/g;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iput v3, p0, Lqa3/b1;->J:I

    :goto_3
    iget-object v1, p0, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_8

    iget-object v1, p0, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/16 v3, 0x64

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Lqa3/b1;->x:Lwa3/e;

    invoke-virtual {v0}, Lwa3/e;->size()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lqa3/b1;->M:I

    return v0
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/z0;->k()Lqa3/z0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 5

    invoke-virtual {p0}, Lqa3/b1;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/b1;->y:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Lqa3/b1;->z:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_0
    iget v1, p0, Lqa3/b1;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lqa3/b1;->E:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_1
    iget v1, p0, Lqa3/b1;->y:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    iget-boolean v1, p0, Lqa3/b1;->F:Z

    const/4 v4, 0x3

    invoke-virtual {p1, v4, v3}, Lwa3/g;->x(II)V

    invoke-virtual {p1, v1}, Lwa3/g;->q(I)V

    :cond_2
    iget v1, p0, Lqa3/b1;->y:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_3

    iget-object v1, p0, Lqa3/b1;->G:Lqa3/a1;

    iget v1, v1, Lqa3/a1;->w:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->l(II)V

    :cond_3
    move v1, v3

    :goto_0
    iget-object v2, p0, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/4 v4, 0x5

    invoke-virtual {p1, v4, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    const/16 v1, 0x32

    invoke-virtual {p1, v1}, Lwa3/g;->v(I)V

    iget v1, p0, Lqa3/b1;->J:I

    invoke-virtual {p1, v1}, Lwa3/g;->v(I)V

    :cond_5
    move v1, v3

    :goto_1
    iget-object v2, p0, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Lwa3/g;->n(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    iget-object v1, p0, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_7

    iget-object v1, p0, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/16 v2, 0x64

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    const/16 v1, 0x3e8

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/b1;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
