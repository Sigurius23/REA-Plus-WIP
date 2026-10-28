.class public final Lqa3/a0;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final L:Lqa3/a0;

.field public static final M:Lqa3/l;


# instance fields
.field public E:Lqa3/z;

.field public F:Lqa3/w0;

.field public G:I

.field public H:Ljava/util/List;

.field public I:Ljava/util/List;

.field public J:B

.field public K:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqa3/l;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lqa3/l;-><init>(I)V

    sput-object v0, Lqa3/a0;->M:Lqa3/l;

    new-instance v0, Lqa3/a0;

    invoke-direct {v0}, Lqa3/a0;-><init>()V

    sput-object v0, Lqa3/a0;->L:Lqa3/a0;

    const/4 v1, 0x0

    iput v1, v0, Lqa3/a0;->y:I

    iput v1, v0, Lqa3/a0;->z:I

    sget-object v2, Lqa3/z;->x:Lqa3/z;

    iput-object v2, v0, Lqa3/a0;->E:Lqa3/z;

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, v0, Lqa3/a0;->F:Lqa3/w0;

    iput v1, v0, Lqa3/a0;->G:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/a0;->H:Ljava/util/List;

    iput-object v1, v0, Lqa3/a0;->I:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/a0;->J:B

    .line 3
    iput v0, p0, Lqa3/a0;->K:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/a0;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/y;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/a0;->J:B

    .line 7
    iput v0, p0, Lqa3/a0;->K:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/a0;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v3, -0x1

    .line 11
    iput-byte v3, v1, Lqa3/a0;->J:B

    .line 12
    iput v3, v1, Lqa3/a0;->K:I

    const/4 v3, 0x0

    .line 13
    iput v3, v1, Lqa3/a0;->y:I

    .line 14
    iput v3, v1, Lqa3/a0;->z:I

    .line 15
    sget-object v4, Lqa3/z;->x:Lqa3/z;

    iput-object v4, v1, Lqa3/a0;->E:Lqa3/z;

    .line 16
    sget-object v5, Lqa3/w0;->U:Lqa3/w0;

    .line 17
    iput-object v5, v1, Lqa3/a0;->F:Lqa3/w0;

    .line 18
    iput v3, v1, Lqa3/a0;->G:I

    .line 19
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v5, v1, Lqa3/a0;->H:Ljava/util/List;

    .line 20
    iput-object v5, v1, Lqa3/a0;->I:Ljava/util/List;

    .line 21
    new-instance v5, Lwa3/d;

    invoke-direct {v5}, Lwa3/d;-><init>()V

    const/4 v6, 0x1

    .line 22
    invoke-static {v5, v6}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v7

    move v8, v3

    :cond_0
    :goto_0
    const/16 v9, 0x20

    const/16 v10, 0x40

    if-nez v3, :cond_13

    .line 23
    :try_start_0
    invoke-virtual {v0}, Lwa3/f;->o()I

    move-result v11
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v11, :cond_1

    const/16 v12, 0x8

    if-eq v11, v12, :cond_10

    const/4 v13, 0x2

    const/16 v14, 0x10

    if-eq v11, v14, :cond_f

    const/16 v15, 0x18

    const/16 v16, 0x0

    if-eq v11, v15, :cond_a

    const/16 v13, 0x22

    if-eq v11, v13, :cond_7

    const/16 v12, 0x28

    if-eq v11, v12, :cond_6

    const/16 v12, 0x32

    .line 24
    sget-object v13, Lqa3/a0;->M:Lqa3/l;

    if-eq v11, v12, :cond_4

    const/16 v12, 0x3a

    if-eq v11, v12, :cond_2

    .line 25
    :try_start_1
    invoke-virtual {v0, v11, v7}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v9

    if-nez v9, :cond_0

    :cond_1
    move v3, v6

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_4

    :cond_2
    and-int/lit8 v11, v8, 0x40

    if-eq v11, v10, :cond_3

    .line 26
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/a0;->I:Ljava/util/List;

    or-int/lit8 v8, v8, 0x40

    .line 27
    :cond_3
    iget-object v11, v1, Lqa3/a0;->I:Ljava/util/List;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    and-int/lit8 v11, v8, 0x20

    if-eq v11, v9, :cond_5

    .line 28
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/a0;->H:Ljava/util/List;

    or-int/lit8 v8, v8, 0x20

    .line 29
    :cond_5
    iget-object v11, v1, Lqa3/a0;->H:Ljava/util/List;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :cond_6
    iget v11, v1, Lqa3/a0;->x:I

    or-int/2addr v11, v14

    iput v11, v1, Lqa3/a0;->x:I

    .line 31
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 32
    iput v11, v1, Lqa3/a0;->G:I

    goto :goto_0

    .line 33
    :cond_7
    iget v11, v1, Lqa3/a0;->x:I

    and-int/2addr v11, v12

    if-ne v11, v12, :cond_8

    .line 34
    iget-object v11, v1, Lqa3/a0;->F:Lqa3/w0;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-static {v11}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v16

    :cond_8
    move-object/from16 v11, v16

    .line 36
    sget-object v13, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v13

    check-cast v13, Lqa3/w0;

    iput-object v13, v1, Lqa3/a0;->F:Lqa3/w0;

    if-eqz v11, :cond_9

    .line 37
    invoke-virtual {v11, v13}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 38
    invoke-virtual {v11}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v11

    iput-object v11, v1, Lqa3/a0;->F:Lqa3/w0;

    .line 39
    :cond_9
    iget v11, v1, Lqa3/a0;->x:I

    or-int/2addr v11, v12

    iput v11, v1, Lqa3/a0;->x:I

    goto/16 :goto_0

    .line 40
    :cond_a
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v12

    if-eqz v12, :cond_d

    if-eq v12, v6, :cond_c

    if-eq v12, v13, :cond_b

    :goto_1
    move-object/from16 v13, v16

    goto :goto_2

    .line 41
    :cond_b
    sget-object v16, Lqa3/z;->z:Lqa3/z;

    goto :goto_1

    .line 42
    :cond_c
    sget-object v16, Lqa3/z;->y:Lqa3/z;

    goto :goto_1

    :cond_d
    move-object v13, v4

    :goto_2
    if-nez v13, :cond_e

    .line 43
    invoke-virtual {v7, v11}, Lwa3/g;->v(I)V

    .line 44
    invoke-virtual {v7, v12}, Lwa3/g;->v(I)V

    goto/16 :goto_0

    .line 45
    :cond_e
    iget v11, v1, Lqa3/a0;->x:I

    or-int/lit8 v11, v11, 0x4

    iput v11, v1, Lqa3/a0;->x:I

    .line 46
    iput-object v13, v1, Lqa3/a0;->E:Lqa3/z;

    goto/16 :goto_0

    .line 47
    :cond_f
    iget v11, v1, Lqa3/a0;->x:I

    or-int/2addr v11, v13

    iput v11, v1, Lqa3/a0;->x:I

    .line 48
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 49
    iput v11, v1, Lqa3/a0;->z:I

    goto/16 :goto_0

    .line 50
    :cond_10
    iget v11, v1, Lqa3/a0;->x:I

    or-int/2addr v11, v6

    iput v11, v1, Lqa3/a0;->x:I

    .line 51
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 52
    iput v11, v1, Lqa3/a0;->y:I
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 53
    :goto_3
    :try_start_2
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 54
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 55
    iput-object v1, v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 56
    throw v2

    .line 57
    :goto_4
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 58
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    and-int/lit8 v2, v8, 0x20

    if-ne v2, v9, :cond_11

    .line 59
    iget-object v2, v1, Lqa3/a0;->H:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/a0;->H:Ljava/util/List;

    :cond_11
    and-int/lit8 v2, v8, 0x40

    if-ne v2, v10, :cond_12

    .line 60
    iget-object v2, v1, Lqa3/a0;->I:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/a0;->I:Ljava/util/List;

    .line 61
    :cond_12
    :try_start_3
    invoke-virtual {v7}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :catch_2
    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/a0;->w:Lwa3/e;

    goto :goto_6

    :catchall_1
    move-exception v0

    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/a0;->w:Lwa3/e;

    .line 63
    throw v0

    .line 64
    :goto_6
    throw v0

    :cond_13
    and-int/lit8 v0, v8, 0x20

    if-ne v0, v9, :cond_14

    .line 65
    iget-object v0, v1, Lqa3/a0;->H:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/a0;->H:Ljava/util/List;

    :cond_14
    and-int/lit8 v0, v8, 0x40

    if-ne v0, v10, :cond_15

    .line 66
    iget-object v0, v1, Lqa3/a0;->I:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/a0;->I:Ljava/util/List;

    .line 67
    :cond_15
    :try_start_4
    invoke-virtual {v7}, Lwa3/g;->i()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 68
    :catch_3
    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, v1, Lqa3/a0;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception v0

    invoke-virtual {v5}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/a0;->w:Lwa3/e;

    .line 69
    throw v0
.end method


# virtual methods
.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/a0;->J:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lqa3/a0;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lqa3/a0;->F:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Lqa3/a0;->J:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/a0;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lqa3/a0;->H:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/a0;

    invoke-virtual {v3}, Lqa3/a0;->b()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Lqa3/a0;->J:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/a0;->I:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_6

    iget-object v3, p0, Lqa3/a0;->I:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/a0;

    invoke-virtual {v3}, Lqa3/a0;->b()Z

    move-result v3

    if-nez v3, :cond_5

    iput-byte v2, p0, Lqa3/a0;->J:B

    return v2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iput-byte v1, p0, Lqa3/a0;->J:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/y;->k()Lqa3/y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/y;->l(Lqa3/a0;)V

    return-object v0
.end method

.method public final d()I
    .locals 5

    iget v0, p0, Lqa3/a0;->K:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/a0;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/a0;->y:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Lqa3/a0;->x:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Lqa3/a0;->z:I

    invoke-static {v3, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lqa3/a0;->x:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lqa3/a0;->E:Lqa3/z;

    iget v1, v1, Lqa3/z;->w:I

    const/4 v4, 0x3

    invoke-static {v4, v1}, Lwa3/g;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Lqa3/a0;->x:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-object v1, p0, Lqa3/a0;->F:Lqa3/w0;

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/a0;->x:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x5

    iget v3, p0, Lqa3/a0;->G:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    move v1, v2

    :goto_1
    iget-object v3, p0, Lqa3/a0;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_6

    iget-object v3, p0, Lqa3/a0;->H:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x6

    invoke-static {v4, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    iget-object v1, p0, Lqa3/a0;->I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_7

    iget-object v1, p0, Lqa3/a0;->I:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/4 v3, 0x7

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    iget-object v1, p0, Lqa3/a0;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/a0;->K:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/y;->k()Lqa3/y;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 4

    invoke-virtual {p0}, Lqa3/a0;->d()I

    iget v0, p0, Lqa3/a0;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lqa3/a0;->y:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_0
    iget v0, p0, Lqa3/a0;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/a0;->z:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_1
    iget v0, p0, Lqa3/a0;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lqa3/a0;->E:Lqa3/z;

    iget v0, v0, Lqa3/z;->w:I

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lwa3/g;->l(II)V

    :cond_2
    iget v0, p0, Lqa3/a0;->x:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lqa3/a0;->F:Lqa3/w0;

    invoke-virtual {p1, v1, v0}, Lwa3/g;->o(ILwa3/v;)V

    :cond_3
    iget v0, p0, Lqa3/a0;->x:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget v1, p0, Lqa3/a0;->G:I

    invoke-virtual {p1, v0, v1}, Lwa3/g;->m(II)V

    :cond_4
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lqa3/a0;->H:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    iget-object v2, p0, Lqa3/a0;->H:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    iget-object v1, p0, Lqa3/a0;->I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    iget-object v1, p0, Lqa3/a0;->I:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/4 v2, 0x7

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lqa3/a0;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final i()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lqa3/a0;->H:Ljava/util/List;

    return-object v0
.end method

.method public final j()Lqa3/z;
    .locals 1

    iget-object v0, p0, Lqa3/a0;->E:Lqa3/z;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lqa3/a0;->y:I

    return v0
.end method

.method public final l()Lqa3/w0;
    .locals 1

    iget-object v0, p0, Lqa3/a0;->F:Lqa3/w0;

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lqa3/a0;->G:I

    return v0
.end method

.method public final n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lqa3/a0;->I:Ljava/util/List;

    return-object v0
.end method

.method public final o()Z
    .locals 2

    iget v0, p0, Lqa3/a0;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p()Z
    .locals 2

    iget v0, p0, Lqa3/a0;->x:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final q()Z
    .locals 2

    iget v0, p0, Lqa3/a0;->x:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
