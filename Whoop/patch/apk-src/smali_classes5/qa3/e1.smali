.class public final Lqa3/e1;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final N:Lqa3/e1;

.field public static final O:Lqa3/a;


# instance fields
.field public E:I

.field public F:Lqa3/w0;

.field public G:I

.field public H:Lqa3/w0;

.field public I:I

.field public J:Ljava/util/List;

.field public K:Lqa3/e;

.field public L:B

.field public M:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqa3/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/e1;->O:Lqa3/a;

    new-instance v0, Lqa3/e1;

    invoke-direct {v0}, Lqa3/e1;-><init>()V

    sput-object v0, Lqa3/e1;->N:Lqa3/e1;

    const/4 v1, 0x0

    iput v1, v0, Lqa3/e1;->z:I

    iput v1, v0, Lqa3/e1;->E:I

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, v0, Lqa3/e1;->F:Lqa3/w0;

    iput v1, v0, Lqa3/e1;->G:I

    iput-object v2, v0, Lqa3/e1;->H:Lqa3/w0;

    iput v1, v0, Lqa3/e1;->I:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/e1;->J:Ljava/util/List;

    sget-object v1, Lqa3/e;->P:Lqa3/e;

    iput-object v1, v0, Lqa3/e1;->K:Lqa3/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput-byte v0, p0, Lqa3/e1;->L:B

    .line 8
    iput v0, p0, Lqa3/e1;->M:I

    .line 9
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/e1;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/d1;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/e1;->L:B

    .line 3
    iput v0, p0, Lqa3/e1;->M:I

    .line 4
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 5
    iput-object p1, p0, Lqa3/e1;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 11

    .line 10
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/e1;->L:B

    .line 12
    iput v0, p0, Lqa3/e1;->M:I

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lqa3/e1;->z:I

    .line 14
    iput v0, p0, Lqa3/e1;->E:I

    .line 15
    sget-object v1, Lqa3/w0;->U:Lqa3/w0;

    .line 16
    iput-object v1, p0, Lqa3/e1;->F:Lqa3/w0;

    .line 17
    iput v0, p0, Lqa3/e1;->G:I

    .line 18
    iput-object v1, p0, Lqa3/e1;->H:Lqa3/w0;

    .line 19
    iput v0, p0, Lqa3/e1;->I:I

    .line 20
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lqa3/e1;->J:Ljava/util/List;

    .line 21
    sget-object v1, Lqa3/e;->P:Lqa3/e;

    .line 22
    iput-object v1, p0, Lqa3/e1;->K:Lqa3/e;

    .line 23
    new-instance v1, Lwa3/d;

    invoke-direct {v1}, Lwa3/d;-><init>()V

    const/4 v2, 0x1

    .line 24
    invoke-static {v1, v2}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v3

    move v4, v0

    :cond_0
    :goto_0
    const/16 v5, 0x40

    if-nez v0, :cond_12

    .line 25
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x8

    if-eq v6, v7, :cond_10

    const/16 v8, 0x10

    if-eq v6, v8, :cond_f

    const/16 v9, 0x1a

    const/4 v10, 0x0

    if-eq v6, v9, :cond_c

    const/16 v9, 0x22

    if-eq v6, v9, :cond_9

    const/16 v8, 0x28

    if-eq v6, v8, :cond_8

    const/16 v7, 0x30

    if-eq v6, v7, :cond_7

    const/16 v7, 0x3a

    if-eq v6, v7, :cond_5

    const/16 v7, 0x42

    if-eq v6, v7, :cond_2

    .line 26
    invoke-virtual {p0, p1, v3, p2, v6}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v0, v2

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

    .line 27
    :cond_2
    iget v6, p0, Lqa3/e1;->y:I

    and-int/2addr v6, v5

    if-ne v6, v5, :cond_3

    .line 28
    iget-object v6, p0, Lqa3/e1;->K:Lqa3/e;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-static {v6}, Lqa3/e;->j(Lqa3/e;)Lqa3/c;

    move-result-object v10

    .line 30
    :cond_3
    sget-object v6, Lqa3/e;->Q:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/e;

    iput-object v6, p0, Lqa3/e1;->K:Lqa3/e;

    if-eqz v10, :cond_4

    .line 31
    invoke-virtual {v10, v6}, Lqa3/c;->l(Lqa3/e;)V

    .line 32
    invoke-virtual {v10}, Lqa3/c;->j()Lqa3/e;

    move-result-object v6

    iput-object v6, p0, Lqa3/e1;->K:Lqa3/e;

    .line 33
    :cond_4
    iget v6, p0, Lqa3/e1;->y:I

    or-int/2addr v6, v5

    iput v6, p0, Lqa3/e1;->y:I

    goto :goto_0

    :cond_5
    and-int/lit8 v6, v4, 0x40

    if-eq v6, v5, :cond_6

    .line 34
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lqa3/e1;->J:Ljava/util/List;

    move v4, v5

    .line 35
    :cond_6
    iget-object v6, p0, Lqa3/e1;->J:Ljava/util/List;

    sget-object v7, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {p1, v7, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 36
    :cond_7
    iget v6, p0, Lqa3/e1;->y:I

    or-int/lit8 v6, v6, 0x20

    iput v6, p0, Lqa3/e1;->y:I

    .line 37
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 38
    iput v6, p0, Lqa3/e1;->I:I

    goto/16 :goto_0

    .line 39
    :cond_8
    iget v6, p0, Lqa3/e1;->y:I

    or-int/2addr v6, v7

    iput v6, p0, Lqa3/e1;->y:I

    .line 40
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 41
    iput v6, p0, Lqa3/e1;->G:I

    goto/16 :goto_0

    .line 42
    :cond_9
    iget v6, p0, Lqa3/e1;->y:I

    and-int/2addr v6, v8

    if-ne v6, v8, :cond_a

    .line 43
    iget-object v6, p0, Lqa3/e1;->H:Lqa3/w0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {v6}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v10

    .line 45
    :cond_a
    sget-object v6, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/w0;

    iput-object v6, p0, Lqa3/e1;->H:Lqa3/w0;

    if-eqz v10, :cond_b

    .line 46
    invoke-virtual {v10, v6}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 47
    invoke-virtual {v10}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v6

    iput-object v6, p0, Lqa3/e1;->H:Lqa3/w0;

    .line 48
    :cond_b
    iget v6, p0, Lqa3/e1;->y:I

    or-int/2addr v6, v8

    iput v6, p0, Lqa3/e1;->y:I

    goto/16 :goto_0

    .line 49
    :cond_c
    iget v6, p0, Lqa3/e1;->y:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_d

    .line 50
    iget-object v6, p0, Lqa3/e1;->F:Lqa3/w0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    invoke-static {v6}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v10

    .line 52
    :cond_d
    sget-object v6, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/w0;

    iput-object v6, p0, Lqa3/e1;->F:Lqa3/w0;

    if-eqz v10, :cond_e

    .line 53
    invoke-virtual {v10, v6}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 54
    invoke-virtual {v10}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v6

    iput-object v6, p0, Lqa3/e1;->F:Lqa3/w0;

    .line 55
    :cond_e
    iget v6, p0, Lqa3/e1;->y:I

    or-int/2addr v6, v7

    iput v6, p0, Lqa3/e1;->y:I

    goto/16 :goto_0

    .line 56
    :cond_f
    iget v6, p0, Lqa3/e1;->y:I

    or-int/lit8 v6, v6, 0x2

    iput v6, p0, Lqa3/e1;->y:I

    .line 57
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 58
    iput v6, p0, Lqa3/e1;->E:I

    goto/16 :goto_0

    .line 59
    :cond_10
    iget v6, p0, Lqa3/e1;->y:I

    or-int/2addr v6, v2

    iput v6, p0, Lqa3/e1;->y:I

    .line 60
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 61
    iput v6, p0, Lqa3/e1;->z:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 62
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 64
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 65
    throw p2

    .line 66
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 67
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x40

    if-ne p2, v5, :cond_11

    .line 68
    iget-object p2, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/e1;->J:Ljava/util/List;

    .line 69
    :cond_11
    :try_start_2
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    :catch_2
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/e1;->x:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/e1;->x:Lwa3/e;

    .line 71
    throw p1

    .line 72
    :goto_4
    invoke-virtual {p0}, Lwa3/m;->m()V

    .line 73
    throw p1

    :cond_12
    and-int/lit8 p1, v4, 0x40

    if-ne p1, v5, :cond_13

    .line 74
    iget-object p1, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/e1;->J:Ljava/util/List;

    .line 75
    :cond_13
    :try_start_3
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 76
    :catch_3
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/e1;->x:Lwa3/e;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/e1;->x:Lwa3/e;

    .line 77
    throw p1

    .line 78
    :goto_5
    invoke-virtual {p0}, Lwa3/m;->m()V

    return-void
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/e1;->N:Lqa3/e1;

    return-object v0
.end method

.method public final b()Z
    .locals 5

    iget-byte v0, p0, Lqa3/e1;->L:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/e1;->y:I

    and-int/lit8 v3, v0, 0x2

    const/4 v4, 0x2

    if-ne v3, v4, :cond_8

    const/4 v3, 0x4

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lqa3/e1;->F:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Lqa3/e1;->L:B

    return v2

    :cond_2
    iget v0, p0, Lqa3/e1;->y:I

    const/16 v3, 0x10

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lqa3/e1;->H:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Lqa3/e1;->L:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    iget-object v3, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Lqa3/e1;->L:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    iget v0, p0, Lqa3/e1;->y:I

    const/16 v3, 0x40

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_6

    iget-object v0, p0, Lqa3/e1;->K:Lqa3/e;

    invoke-virtual {v0}, Lqa3/e;->b()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Lqa3/e1;->L:B

    return v2

    :cond_6
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_7

    iput-byte v2, p0, Lqa3/e1;->L:B

    return v2

    :cond_7
    iput-byte v1, p0, Lqa3/e1;->L:B

    return v1

    :cond_8
    iput-byte v2, p0, Lqa3/e1;->L:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/d1;->l()Lqa3/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/d1;->n(Lqa3/e1;)V

    return-object v0
.end method

.method public final d()I
    .locals 5

    iget v0, p0, Lqa3/e1;->M:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/e1;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/e1;->z:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Lqa3/e1;->y:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Lqa3/e1;->E:I

    invoke-static {v3, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lqa3/e1;->y:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-object v4, p0, Lqa3/e1;->F:Lqa3/w0;

    invoke-static {v1, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v4, 0x10

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-object v1, p0, Lqa3/e1;->H:Lqa3/w0;

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x5

    iget v4, p0, Lqa3/e1;->G:I

    invoke-static {v1, v4}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v4, 0x20

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_6

    const/4 v1, 0x6

    iget v4, p0, Lqa3/e1;->I:I

    invoke-static {v1, v4}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    :goto_1
    iget-object v1, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_7

    iget-object v1, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/4 v4, 0x7

    invoke-static {v4, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    iget-object v1, p0, Lqa3/e1;->K:Lqa3/e;

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Lqa3/e1;->x:Lwa3/e;

    invoke-virtual {v0}, Lwa3/e;->size()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lqa3/e1;->M:I

    return v0
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/d1;->l()Lqa3/d1;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 5

    invoke-virtual {p0}, Lqa3/e1;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/e1;->y:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Lqa3/e1;->z:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_0
    iget v1, p0, Lqa3/e1;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lqa3/e1;->E:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_1
    iget v1, p0, Lqa3/e1;->y:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v3, p0, Lqa3/e1;->F:Lqa3/w0;

    invoke-virtual {p1, v1, v3}, Lwa3/g;->o(ILwa3/v;)V

    :cond_2
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lqa3/e1;->H:Lqa3/w0;

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    :cond_3
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x5

    iget v3, p0, Lqa3/e1;->G:I

    invoke-virtual {p1, v1, v3}, Lwa3/g;->m(II)V

    :cond_4
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v3, 0x20

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x6

    iget v3, p0, Lqa3/e1;->I:I

    invoke-virtual {p1, v1, v3}, Lwa3/g;->m(II)V

    :cond_5
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_6

    iget-object v3, p0, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/4 v4, 0x7

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v3, 0x40

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_7

    iget-object v1, p0, Lqa3/e1;->K:Lqa3/e;

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    :cond_7
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/e1;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final p()Lqa3/d1;
    .locals 1

    invoke-static {}, Lqa3/d1;->l()Lqa3/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/d1;->n(Lqa3/e1;)V

    return-object v0
.end method
