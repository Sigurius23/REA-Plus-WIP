.class public final Lqa3/v;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final J:Lqa3/v;

.field public static final K:Lqa3/l;


# instance fields
.field public E:Lqa3/a0;

.field public F:Lqa3/u;

.field public G:Lqa3/s;

.field public H:B

.field public I:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:Lqa3/t;

.field public z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/l;-><init>(I)V

    sput-object v0, Lqa3/v;->K:Lqa3/l;

    new-instance v0, Lqa3/v;

    invoke-direct {v0}, Lqa3/v;-><init>()V

    sput-object v0, Lqa3/v;->J:Lqa3/v;

    sget-object v1, Lqa3/t;->x:Lqa3/t;

    iput-object v1, v0, Lqa3/v;->y:Lqa3/t;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/v;->z:Ljava/util/List;

    sget-object v1, Lqa3/a0;->L:Lqa3/a0;

    iput-object v1, v0, Lqa3/v;->E:Lqa3/a0;

    sget-object v1, Lqa3/u;->x:Lqa3/u;

    iput-object v1, v0, Lqa3/v;->F:Lqa3/u;

    sget-object v1, Lqa3/s;->x:Lqa3/s;

    iput-object v1, v0, Lqa3/v;->G:Lqa3/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/v;->H:B

    .line 3
    iput v0, p0, Lqa3/v;->I:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/v;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/r;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/v;->H:B

    .line 7
    iput v0, p0, Lqa3/v;->I:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/v;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 13

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/v;->H:B

    .line 12
    iput v0, p0, Lqa3/v;->I:I

    .line 13
    sget-object v0, Lqa3/t;->x:Lqa3/t;

    iput-object v0, p0, Lqa3/v;->y:Lqa3/t;

    .line 14
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lqa3/v;->z:Ljava/util/List;

    .line 15
    sget-object v1, Lqa3/a0;->L:Lqa3/a0;

    .line 16
    iput-object v1, p0, Lqa3/v;->E:Lqa3/a0;

    .line 17
    sget-object v1, Lqa3/u;->x:Lqa3/u;

    iput-object v1, p0, Lqa3/v;->F:Lqa3/u;

    .line 18
    sget-object v2, Lqa3/s;->x:Lqa3/s;

    iput-object v2, p0, Lqa3/v;->G:Lqa3/s;

    .line 19
    new-instance v3, Lwa3/d;

    invoke-direct {v3}, Lwa3/d;-><init>()V

    const/4 v4, 0x1

    .line 20
    invoke-static {v3, v4}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :cond_0
    :goto_0
    const/4 v8, 0x2

    if-nez v6, :cond_17

    .line 21
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v9

    if-eqz v9, :cond_1

    const/4 v10, 0x0

    const/16 v11, 0x8

    if-eq v9, v11, :cond_11

    const/16 v12, 0x12

    if-eq v9, v12, :cond_f

    const/16 v12, 0x1a

    if-eq v9, v12, :cond_c

    const/16 v12, 0x20

    if-eq v9, v12, :cond_7

    const/16 v12, 0x28

    if-eq v9, v12, :cond_2

    .line 22
    invoke-virtual {p1, v9, v5}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v8

    if-nez v8, :cond_0

    :cond_1
    move v6, v4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    .line 23
    :cond_2
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v12

    if-eqz v12, :cond_5

    if-eq v12, v4, :cond_4

    if-eq v12, v8, :cond_3

    goto :goto_1

    .line 24
    :cond_3
    sget-object v10, Lqa3/s;->z:Lqa3/s;

    goto :goto_1

    .line 25
    :cond_4
    sget-object v10, Lqa3/s;->y:Lqa3/s;

    goto :goto_1

    :cond_5
    move-object v10, v2

    :goto_1
    if-nez v10, :cond_6

    .line 26
    invoke-virtual {v5, v9}, Lwa3/g;->v(I)V

    .line 27
    invoke-virtual {v5, v12}, Lwa3/g;->v(I)V

    goto :goto_0

    .line 28
    :cond_6
    iget v9, p0, Lqa3/v;->x:I

    or-int/2addr v9, v11

    iput v9, p0, Lqa3/v;->x:I

    .line 29
    iput-object v10, p0, Lqa3/v;->G:Lqa3/s;

    goto :goto_0

    .line 30
    :cond_7
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v11

    if-eqz v11, :cond_a

    if-eq v11, v4, :cond_9

    if-eq v11, v8, :cond_8

    goto :goto_2

    .line 31
    :cond_8
    sget-object v10, Lqa3/u;->z:Lqa3/u;

    goto :goto_2

    .line 32
    :cond_9
    sget-object v10, Lqa3/u;->y:Lqa3/u;

    goto :goto_2

    :cond_a
    move-object v10, v1

    :goto_2
    if-nez v10, :cond_b

    .line 33
    invoke-virtual {v5, v9}, Lwa3/g;->v(I)V

    .line 34
    invoke-virtual {v5, v11}, Lwa3/g;->v(I)V

    goto :goto_0

    .line 35
    :cond_b
    iget v9, p0, Lqa3/v;->x:I

    or-int/lit8 v9, v9, 0x4

    iput v9, p0, Lqa3/v;->x:I

    .line 36
    iput-object v10, p0, Lqa3/v;->F:Lqa3/u;

    goto :goto_0

    .line 37
    :cond_c
    iget v9, p0, Lqa3/v;->x:I

    and-int/2addr v9, v8

    if-ne v9, v8, :cond_d

    .line 38
    iget-object v9, p0, Lqa3/v;->E:Lqa3/a0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-static {}, Lqa3/y;->k()Lqa3/y;

    move-result-object v10

    .line 40
    invoke-virtual {v10, v9}, Lqa3/y;->l(Lqa3/a0;)V

    .line 41
    :cond_d
    sget-object v9, Lqa3/a0;->M:Lqa3/l;

    invoke-virtual {p1, v9, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v9

    check-cast v9, Lqa3/a0;

    iput-object v9, p0, Lqa3/v;->E:Lqa3/a0;

    if-eqz v10, :cond_e

    .line 42
    invoke-virtual {v10, v9}, Lqa3/y;->l(Lqa3/a0;)V

    .line 43
    invoke-virtual {v10}, Lqa3/y;->j()Lqa3/a0;

    move-result-object v9

    iput-object v9, p0, Lqa3/v;->E:Lqa3/a0;

    .line 44
    :cond_e
    iget v9, p0, Lqa3/v;->x:I

    or-int/2addr v9, v8

    iput v9, p0, Lqa3/v;->x:I

    goto/16 :goto_0

    :cond_f
    and-int/lit8 v9, v7, 0x2

    if-eq v9, v8, :cond_10

    .line 45
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lqa3/v;->z:Ljava/util/List;

    move v7, v8

    .line 46
    :cond_10
    iget-object v9, p0, Lqa3/v;->z:Ljava/util/List;

    sget-object v10, Lqa3/a0;->M:Lqa3/l;

    invoke-virtual {p1, v10, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 47
    :cond_11
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v11

    if-eqz v11, :cond_14

    if-eq v11, v4, :cond_13

    if-eq v11, v8, :cond_12

    goto :goto_3

    .line 48
    :cond_12
    sget-object v10, Lqa3/t;->z:Lqa3/t;

    goto :goto_3

    .line 49
    :cond_13
    sget-object v10, Lqa3/t;->y:Lqa3/t;

    goto :goto_3

    :cond_14
    move-object v10, v0

    :goto_3
    if-nez v10, :cond_15

    .line 50
    invoke-virtual {v5, v9}, Lwa3/g;->v(I)V

    .line 51
    invoke-virtual {v5, v11}, Lwa3/g;->v(I)V

    goto/16 :goto_0

    .line 52
    :cond_15
    iget v9, p0, Lqa3/v;->x:I

    or-int/2addr v9, v4

    iput v9, p0, Lqa3/v;->x:I

    .line 53
    iput-object v10, p0, Lqa3/v;->y:Lqa3/t;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 54
    :goto_4
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 56
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 57
    throw p2

    .line 58
    :goto_5
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 59
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    and-int/lit8 p2, v7, 0x2

    if-ne p2, v8, :cond_16

    .line 60
    iget-object p2, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/v;->z:Ljava/util/List;

    .line 61
    :cond_16
    :try_start_2
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    :catch_2
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/v;->w:Lwa3/e;

    goto :goto_7

    :catchall_1
    move-exception p1

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/v;->w:Lwa3/e;

    .line 63
    throw p1

    .line 64
    :goto_7
    throw p1

    :cond_17
    and-int/lit8 p1, v7, 0x2

    if-ne p1, v8, :cond_18

    .line 65
    iget-object p1, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/v;->z:Ljava/util/List;

    .line 66
    :cond_18
    :try_start_3
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    :catch_3
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/v;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/v;->w:Lwa3/e;

    .line 68
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/v;->H:B

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
    iget-object v3, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/a0;

    invoke-virtual {v3}, Lqa3/a0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Lqa3/v;->H:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lqa3/v;->m()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lqa3/v;->E:Lqa3/a0;

    invoke-virtual {v0}, Lqa3/a0;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Lqa3/v;->H:B

    return v2

    :cond_4
    iput-byte v1, p0, Lqa3/v;->H:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/r;->k()Lqa3/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/r;->l(Lqa3/v;)V

    return-object v0
.end method

.method public final d()I
    .locals 4

    iget v0, p0, Lqa3/v;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/v;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lqa3/v;->y:Lqa3/t;

    iget v0, v0, Lqa3/t;->w:I

    invoke-static {v1, v0}, Lwa3/g;->a(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget-object v1, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x2

    if-ge v2, v1, :cond_2

    iget-object v1, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v1, p0, Lqa3/v;->x:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-object v2, p0, Lqa3/v;->E:Lqa3/a0;

    invoke-static {v1, v2}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Lqa3/v;->x:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lqa3/v;->F:Lqa3/u;

    iget v1, v1, Lqa3/u;->w:I

    invoke-static {v2, v1}, Lwa3/g;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/v;->x:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Lqa3/v;->G:Lqa3/s;

    iget v1, v1, Lqa3/s;->w:I

    const/4 v2, 0x5

    invoke-static {v2, v1}, Lwa3/g;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lqa3/v;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/v;->I:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/r;->k()Lqa3/r;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 3

    invoke-virtual {p0}, Lqa3/v;->d()I

    iget v0, p0, Lqa3/v;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqa3/v;->y:Lqa3/t;

    iget v0, v0, Lqa3/t;->w:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->l(II)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lqa3/v;->x:I

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Lqa3/v;->E:Lqa3/a0;

    invoke-virtual {p1, v0, v1}, Lwa3/g;->o(ILwa3/v;)V

    :cond_2
    iget v0, p0, Lqa3/v;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lqa3/v;->F:Lqa3/u;

    iget v0, v0, Lqa3/u;->w:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->l(II)V

    :cond_3
    iget v0, p0, Lqa3/v;->x:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lqa3/v;->G:Lqa3/s;

    iget v0, v0, Lqa3/s;->w:I

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lwa3/g;->l(II)V

    :cond_4
    iget-object v0, p0, Lqa3/v;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final i()Lqa3/a0;
    .locals 1

    iget-object v0, p0, Lqa3/v;->E:Lqa3/a0;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lqa3/v;->z:Ljava/util/List;

    return-object v0
.end method

.method public final k()Lqa3/t;
    .locals 1

    iget-object v0, p0, Lqa3/v;->y:Lqa3/t;

    return-object v0
.end method

.method public final l()Lqa3/u;
    .locals 1

    iget-object v0, p0, Lqa3/v;->F:Lqa3/u;

    return-object v0
.end method

.method public final m()Z
    .locals 2

    iget v0, p0, Lqa3/v;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final n()Z
    .locals 2

    iget v0, p0, Lqa3/v;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o()Z
    .locals 2

    iget v0, p0, Lqa3/v;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
