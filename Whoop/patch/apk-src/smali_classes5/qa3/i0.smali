.class public final Lqa3/i0;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final J:Lqa3/i0;

.field public static final K:Lqa3/a;


# instance fields
.field public E:Lqa3/p0;

.field public F:Lqa3/g0;

.field public G:Ljava/util/List;

.field public H:B

.field public I:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:Lqa3/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/i0;->K:Lqa3/a;

    new-instance v0, Lqa3/i0;

    invoke-direct {v0}, Lqa3/i0;-><init>()V

    sput-object v0, Lqa3/i0;->J:Lqa3/i0;

    sget-object v1, Lqa3/r0;->E:Lqa3/r0;

    iput-object v1, v0, Lqa3/i0;->z:Lqa3/r0;

    sget-object v1, Lqa3/p0;->E:Lqa3/p0;

    iput-object v1, v0, Lqa3/i0;->E:Lqa3/p0;

    sget-object v1, Lqa3/g0;->K:Lqa3/g0;

    iput-object v1, v0, Lqa3/i0;->F:Lqa3/g0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/i0;->G:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput-byte v0, p0, Lqa3/i0;->H:B

    .line 8
    iput v0, p0, Lqa3/i0;->I:I

    .line 9
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/i0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/h0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/i0;->H:B

    .line 3
    iput v0, p0, Lqa3/i0;->I:I

    .line 4
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 5
    iput-object p1, p0, Lqa3/i0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 9

    .line 10
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/i0;->H:B

    .line 12
    iput v0, p0, Lqa3/i0;->I:I

    .line 13
    sget-object v0, Lqa3/r0;->E:Lqa3/r0;

    .line 14
    iput-object v0, p0, Lqa3/i0;->z:Lqa3/r0;

    .line 15
    sget-object v0, Lqa3/p0;->E:Lqa3/p0;

    .line 16
    iput-object v0, p0, Lqa3/i0;->E:Lqa3/p0;

    .line 17
    sget-object v0, Lqa3/g0;->K:Lqa3/g0;

    .line 18
    iput-object v0, p0, Lqa3/i0;->F:Lqa3/g0;

    .line 19
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lqa3/i0;->G:Ljava/util/List;

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
    const/16 v5, 0x8

    if-nez v3, :cond_e

    .line 22
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0xa

    const/4 v8, 0x0

    if-eq v6, v7, :cond_a

    const/16 v7, 0x12

    if-eq v6, v7, :cond_7

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_4

    const/16 v7, 0x22

    if-eq v6, v7, :cond_2

    .line 23
    invoke-virtual {p0, p1, v2, p2, v6}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

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

    :cond_2
    and-int/lit8 v6, v4, 0x8

    if-eq v6, v5, :cond_3

    .line 24
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lqa3/i0;->G:Ljava/util/List;

    move v4, v5

    .line 25
    :cond_3
    iget-object v6, p0, Lqa3/i0;->G:Ljava/util/List;

    sget-object v7, Lqa3/k;->h0:Lqa3/a;

    invoke-virtual {p1, v7, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 26
    :cond_4
    iget v6, p0, Lqa3/i0;->y:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_5

    .line 27
    iget-object v6, p0, Lqa3/i0;->F:Lqa3/g0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    invoke-static {}, Lqa3/f0;->k()Lqa3/f0;

    move-result-object v8

    .line 29
    invoke-virtual {v8, v6}, Lqa3/f0;->n(Lqa3/g0;)V

    .line 30
    :cond_5
    sget-object v6, Lqa3/g0;->L:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/g0;

    iput-object v6, p0, Lqa3/i0;->F:Lqa3/g0;

    if-eqz v8, :cond_6

    .line 31
    invoke-virtual {v8, v6}, Lqa3/f0;->n(Lqa3/g0;)V

    .line 32
    invoke-virtual {v8}, Lqa3/f0;->l()Lqa3/g0;

    move-result-object v6

    iput-object v6, p0, Lqa3/i0;->F:Lqa3/g0;

    .line 33
    :cond_6
    iget v6, p0, Lqa3/i0;->y:I

    or-int/2addr v6, v7

    iput v6, p0, Lqa3/i0;->y:I

    goto :goto_0

    .line 34
    :cond_7
    iget v6, p0, Lqa3/i0;->y:I

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_8

    .line 35
    iget-object v6, p0, Lqa3/i0;->E:Lqa3/p0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-static {}, Lqa3/l0;->k()Lqa3/l0;

    move-result-object v8

    .line 37
    invoke-virtual {v8, v6}, Lqa3/l0;->o(Lqa3/p0;)V

    .line 38
    :cond_8
    sget-object v6, Lqa3/p0;->F:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/p0;

    iput-object v6, p0, Lqa3/i0;->E:Lqa3/p0;

    if-eqz v8, :cond_9

    .line 39
    invoke-virtual {v8, v6}, Lqa3/l0;->o(Lqa3/p0;)V

    .line 40
    invoke-virtual {v8}, Lqa3/l0;->l()Lqa3/p0;

    move-result-object v6

    iput-object v6, p0, Lqa3/i0;->E:Lqa3/p0;

    .line 41
    :cond_9
    iget v6, p0, Lqa3/i0;->y:I

    or-int/2addr v6, v7

    iput v6, p0, Lqa3/i0;->y:I

    goto/16 :goto_0

    .line 42
    :cond_a
    iget v6, p0, Lqa3/i0;->y:I

    and-int/2addr v6, v1

    if-ne v6, v1, :cond_b

    .line 43
    iget-object v6, p0, Lqa3/i0;->z:Lqa3/r0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {}, Lqa3/l0;->j()Lqa3/l0;

    move-result-object v8

    .line 45
    invoke-virtual {v8, v6}, Lqa3/l0;->p(Lqa3/r0;)V

    .line 46
    :cond_b
    sget-object v6, Lqa3/r0;->F:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/r0;

    iput-object v6, p0, Lqa3/i0;->z:Lqa3/r0;

    if-eqz v8, :cond_c

    .line 47
    invoke-virtual {v8, v6}, Lqa3/l0;->p(Lqa3/r0;)V

    .line 48
    invoke-virtual {v8}, Lqa3/l0;->n()Lqa3/r0;

    move-result-object v6

    iput-object v6, p0, Lqa3/i0;->z:Lqa3/r0;

    .line 49
    :cond_c
    iget v6, p0, Lqa3/i0;->y:I

    or-int/2addr v6, v1

    iput v6, p0, Lqa3/i0;->y:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 50
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 51
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 52
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 53
    throw p2

    .line 54
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 55
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x8

    if-ne p2, v5, :cond_d

    .line 56
    iget-object p2, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/i0;->G:Ljava/util/List;

    .line 57
    :cond_d
    :try_start_2
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/i0;->x:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/i0;->x:Lwa3/e;

    .line 59
    throw p1

    .line 60
    :goto_4
    invoke-virtual {p0}, Lwa3/m;->m()V

    .line 61
    throw p1

    :cond_e
    and-int/lit8 p1, v4, 0x8

    if-ne p1, v5, :cond_f

    .line 62
    iget-object p1, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/i0;->G:Ljava/util/List;

    .line 63
    :cond_f
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 64
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/i0;->x:Lwa3/e;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/i0;->x:Lwa3/e;

    .line 65
    throw p1

    .line 66
    :goto_5
    invoke-virtual {p0}, Lwa3/m;->m()V

    return-void
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/i0;->J:Lqa3/i0;

    return-object v0
.end method

.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/i0;->H:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/i0;->y:I

    const/4 v3, 0x2

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lqa3/i0;->E:Lqa3/p0;

    invoke-virtual {v0}, Lqa3/p0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Lqa3/i0;->H:B

    return v2

    :cond_2
    iget v0, p0, Lqa3/i0;->y:I

    const/4 v3, 0x4

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lqa3/i0;->F:Lqa3/g0;

    invoke-virtual {v0}, Lqa3/g0;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Lqa3/i0;->H:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    iget-object v3, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/k;

    invoke-virtual {v3}, Lqa3/k;->b()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Lqa3/i0;->H:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Lqa3/i0;->H:B

    return v2

    :cond_6
    iput-byte v1, p0, Lqa3/i0;->H:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/h0;->k()Lqa3/h0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/h0;->n(Lqa3/i0;)V

    return-object v0
.end method

.method public final d()I
    .locals 5

    iget v0, p0, Lqa3/i0;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/i0;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lqa3/i0;->z:Lqa3/r0;

    invoke-static {v1, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Lqa3/i0;->y:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lqa3/i0;->E:Lqa3/p0;

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lqa3/i0;->y:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-object v4, p0, Lqa3/i0;->F:Lqa3/g0;

    invoke-static {v1, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    :goto_1
    iget-object v1, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    iget-object v1, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Lqa3/i0;->x:Lwa3/e;

    invoke-virtual {v0}, Lwa3/e;->size()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lqa3/i0;->I:I

    return v0
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/h0;->k()Lqa3/h0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 4

    invoke-virtual {p0}, Lqa3/i0;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/i0;->y:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lqa3/i0;->z:Lqa3/r0;

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    :cond_0
    iget v1, p0, Lqa3/i0;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lqa3/i0;->E:Lqa3/p0;

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    :cond_1
    iget v1, p0, Lqa3/i0;->y:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v3, p0, Lqa3/i0;->F:Lqa3/g0;

    invoke-virtual {p1, v1, v3}, Lwa3/g;->o(ILwa3/v;)V

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    iget-object v3, p0, Lqa3/i0;->G:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    invoke-virtual {p1, v2, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/i0;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
