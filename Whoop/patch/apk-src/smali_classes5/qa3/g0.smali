.class public final Lqa3/g0;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final K:Lqa3/g0;

.field public static final L:Lqa3/a;


# instance fields
.field public E:Ljava/util/List;

.field public F:Ljava/util/List;

.field public G:Lqa3/c1;

.field public H:Lqa3/j1;

.field public I:B

.field public J:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/g0;->L:Lqa3/a;

    new-instance v0, Lqa3/g0;

    invoke-direct {v0}, Lqa3/g0;-><init>()V

    sput-object v0, Lqa3/g0;->K:Lqa3/g0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/g0;->z:Ljava/util/List;

    iput-object v1, v0, Lqa3/g0;->E:Ljava/util/List;

    iput-object v1, v0, Lqa3/g0;->F:Ljava/util/List;

    sget-object v1, Lqa3/c1;->G:Lqa3/c1;

    iput-object v1, v0, Lqa3/g0;->G:Lqa3/c1;

    sget-object v1, Lqa3/j1;->E:Lqa3/j1;

    iput-object v1, v0, Lqa3/g0;->H:Lqa3/j1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput-byte v0, p0, Lqa3/g0;->I:B

    .line 8
    iput v0, p0, Lqa3/g0;->J:I

    .line 9
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/g0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/f0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/g0;->I:B

    .line 3
    iput v0, p0, Lqa3/g0;->J:I

    .line 4
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 5
    iput-object p1, p0, Lqa3/g0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 10

    .line 10
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/g0;->I:B

    .line 12
    iput v0, p0, Lqa3/g0;->J:I

    .line 13
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lqa3/g0;->z:Ljava/util/List;

    .line 14
    iput-object v0, p0, Lqa3/g0;->E:Ljava/util/List;

    .line 15
    iput-object v0, p0, Lqa3/g0;->F:Ljava/util/List;

    .line 16
    sget-object v0, Lqa3/c1;->G:Lqa3/c1;

    .line 17
    iput-object v0, p0, Lqa3/g0;->G:Lqa3/c1;

    .line 18
    sget-object v0, Lqa3/j1;->E:Lqa3/j1;

    .line 19
    iput-object v0, p0, Lqa3/g0;->H:Lqa3/j1;

    .line 20
    new-instance v0, Lwa3/d;

    invoke-direct {v0}, Lwa3/d;-><init>()V

    const/4 v1, 0x1

    .line 21
    invoke-static {v0, v1}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/4 v5, 0x4

    const/4 v6, 0x2

    if-nez v3, :cond_11

    .line 22
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x1a

    if-eq v7, v8, :cond_c

    const/16 v8, 0x22

    if-eq v7, v8, :cond_a

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_8

    const/16 v8, 0xf2

    const/4 v9, 0x0

    if-eq v7, v8, :cond_5

    const/16 v8, 0x102

    if-eq v7, v8, :cond_2

    .line 23
    invoke-virtual {p0, p1, v2, p2, v7}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 24
    :cond_2
    iget v7, p0, Lqa3/g0;->y:I

    and-int/2addr v7, v6

    if-ne v7, v6, :cond_3

    .line 25
    iget-object v7, p0, Lqa3/g0;->H:Lqa3/j1;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v9, Lqa3/p;

    const/4 v8, 0x1

    .line 27
    invoke-direct {v9, v8}, Lqa3/p;-><init>(I)V

    .line 28
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v8, v9, Lqa3/p;->z:Ljava/util/List;

    .line 29
    invoke-virtual {v9, v7}, Lqa3/p;->n(Lqa3/j1;)V

    .line 30
    :cond_3
    sget-object v7, Lqa3/j1;->F:Lqa3/a;

    invoke-virtual {p1, v7, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    check-cast v7, Lqa3/j1;

    iput-object v7, p0, Lqa3/g0;->H:Lqa3/j1;

    if-eqz v9, :cond_4

    .line 31
    invoke-virtual {v9, v7}, Lqa3/p;->n(Lqa3/j1;)V

    .line 32
    invoke-virtual {v9}, Lqa3/p;->k()Lqa3/j1;

    move-result-object v7

    iput-object v7, p0, Lqa3/g0;->H:Lqa3/j1;

    .line 33
    :cond_4
    iget v7, p0, Lqa3/g0;->y:I

    or-int/2addr v7, v6

    iput v7, p0, Lqa3/g0;->y:I

    goto :goto_0

    .line 34
    :cond_5
    iget v7, p0, Lqa3/g0;->y:I

    and-int/2addr v7, v1

    if-ne v7, v1, :cond_6

    .line 35
    iget-object v7, p0, Lqa3/g0;->G:Lqa3/c1;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-static {v7}, Lqa3/c1;->i(Lqa3/c1;)Lqa3/g;

    move-result-object v9

    .line 37
    :cond_6
    sget-object v7, Lqa3/c1;->H:Lqa3/a;

    invoke-virtual {p1, v7, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    check-cast v7, Lqa3/c1;

    iput-object v7, p0, Lqa3/g0;->G:Lqa3/c1;

    if-eqz v9, :cond_7

    .line 38
    invoke-virtual {v9, v7}, Lqa3/g;->o(Lqa3/c1;)V

    .line 39
    invoke-virtual {v9}, Lqa3/g;->k()Lqa3/c1;

    move-result-object v7

    iput-object v7, p0, Lqa3/g0;->G:Lqa3/c1;

    .line 40
    :cond_7
    iget v7, p0, Lqa3/g0;->y:I

    or-int/2addr v7, v1

    iput v7, p0, Lqa3/g0;->y:I

    goto/16 :goto_0

    :cond_8
    and-int/lit8 v7, v4, 0x4

    if-eq v7, v5, :cond_9

    .line 41
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lqa3/g0;->F:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 42
    :cond_9
    iget-object v7, p0, Lqa3/g0;->F:Ljava/util/List;

    sget-object v8, Lqa3/y0;->Q:Lqa3/l;

    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    and-int/lit8 v7, v4, 0x2

    if-eq v7, v6, :cond_b

    .line 43
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lqa3/g0;->E:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    .line 44
    :cond_b
    iget-object v7, p0, Lqa3/g0;->E:Ljava/util/List;

    sget-object v8, Lqa3/k0;->f0:Lqa3/a;

    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_c
    and-int/lit8 v7, v4, 0x1

    if-eq v7, v1, :cond_d

    .line 45
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lqa3/g0;->z:Ljava/util/List;

    or-int/lit8 v4, v4, 0x1

    .line 46
    :cond_d
    iget-object v7, p0, Lqa3/g0;->z:Ljava/util/List;

    sget-object v8, Lqa3/c0;->Z:Lqa3/a;

    invoke-virtual {p1, v8, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 47
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 49
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 50
    throw p2

    .line 51
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 52
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x1

    if-ne p2, v1, :cond_e

    .line 53
    iget-object p2, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/g0;->z:Ljava/util/List;

    :cond_e
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v6, :cond_f

    .line 54
    iget-object p2, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/g0;->E:Ljava/util/List;

    :cond_f
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v5, :cond_10

    .line 55
    iget-object p2, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/g0;->F:Ljava/util/List;

    .line 56
    :cond_10
    :try_start_2
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/g0;->x:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/g0;->x:Lwa3/e;

    .line 58
    throw p1

    .line 59
    :goto_4
    invoke-virtual {p0}, Lwa3/m;->m()V

    .line 60
    throw p1

    :cond_11
    and-int/lit8 p1, v4, 0x1

    if-ne p1, v1, :cond_12

    .line 61
    iget-object p1, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/g0;->z:Ljava/util/List;

    :cond_12
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v6, :cond_13

    .line 62
    iget-object p1, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/g0;->E:Ljava/util/List;

    :cond_13
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v5, :cond_14

    .line 63
    iget-object p1, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/g0;->F:Ljava/util/List;

    .line 64
    :cond_14
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 65
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/g0;->x:Lwa3/e;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/g0;->x:Lwa3/e;

    .line 66
    throw p1

    .line 67
    :goto_5
    invoke-virtual {p0}, Lwa3/m;->m()V

    return-void
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/g0;->K:Lqa3/g0;

    return-object v0
.end method

.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/g0;->I:B

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
    iget-object v3, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/c0;

    invoke-virtual {v3}, Lqa3/c0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Lqa3/g0;->I:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    iget-object v3, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/k0;

    invoke-virtual {v3}, Lqa3/k0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Lqa3/g0;->I:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v2

    :goto_2
    iget-object v3, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_7

    iget-object v3, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/y0;

    invoke-virtual {v3}, Lqa3/y0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    iput-byte v2, p0, Lqa3/g0;->I:B

    return v2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    iget v0, p0, Lqa3/g0;->y:I

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lqa3/g0;->G:Lqa3/c1;

    invoke-virtual {v0}, Lqa3/c1;->b()Z

    move-result v0

    if-nez v0, :cond_8

    iput-byte v2, p0, Lqa3/g0;->I:B

    return v2

    :cond_8
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_9

    iput-byte v2, p0, Lqa3/g0;->I:B

    return v2

    :cond_9
    iput-byte v1, p0, Lqa3/g0;->I:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/f0;->k()Lqa3/f0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/f0;->n(Lqa3/g0;)V

    return-object v0
.end method

.method public final d()I
    .locals 5

    iget v0, p0, Lqa3/g0;->J:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x3

    invoke-static {v4, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    iget-object v3, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    iget-object v3, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x4

    invoke-static {v4, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    iget-object v1, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/4 v3, 0x5

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iget v0, p0, Lqa3/g0;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/16 v0, 0x1e

    iget-object v1, p0, Lqa3/g0;->G:Lqa3/c1;

    invoke-static {v0, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v2, v0

    :cond_4
    iget v0, p0, Lqa3/g0;->y:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    const/16 v0, 0x20

    iget-object v1, p0, Lqa3/g0;->H:Lqa3/j1;

    invoke-static {v0, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v2, v0

    :cond_5
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v0

    add-int/2addr v0, v2

    iget-object v1, p0, Lqa3/g0;->x:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/g0;->J:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/f0;->k()Lqa3/f0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 5

    invoke-virtual {p0}, Lqa3/g0;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x3

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_1
    iget-object v3, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x4

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    iget-object v2, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    iget v1, p0, Lqa3/g0;->y:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/16 v1, 0x1e

    iget-object v2, p0, Lqa3/g0;->G:Lqa3/c1;

    invoke-virtual {p1, v1, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_3
    iget v1, p0, Lqa3/g0;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    const/16 v1, 0x20

    iget-object v2, p0, Lqa3/g0;->H:Lqa3/j1;

    invoke-virtual {p1, v1, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_4
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/g0;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
