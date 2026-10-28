.class public final Lqa3/e;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final P:Lqa3/e;

.field public static final Q:Lqa3/a;


# instance fields
.field public E:F

.field public F:D

.field public G:I

.field public H:I

.field public I:I

.field public J:Lqa3/h;

.field public K:Ljava/util/List;

.field public L:I

.field public M:I

.field public N:B

.field public O:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:Lqa3/d;

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/e;->Q:Lqa3/a;

    new-instance v0, Lqa3/e;

    invoke-direct {v0}, Lqa3/e;-><init>()V

    sput-object v0, Lqa3/e;->P:Lqa3/e;

    invoke-virtual {v0}, Lqa3/e;->i()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/e;->N:B

    .line 3
    iput v0, p0, Lqa3/e;->O:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/e;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/c;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/e;->N:B

    .line 7
    iput v0, p0, Lqa3/e;->O:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/e;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 12

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/e;->N:B

    .line 12
    iput v0, p0, Lqa3/e;->O:I

    .line 13
    invoke-virtual {p0}, Lqa3/e;->i()V

    .line 14
    new-instance v0, Lwa3/d;

    invoke-direct {v0}, Lwa3/d;-><init>()V

    const/4 v1, 0x1

    .line 15
    invoke-static {v0, v1}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x100

    if-nez v3, :cond_6

    .line 16
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    .line 17
    invoke-virtual {p1, v6, v2}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
    move v3, v1

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

    .line 18
    :sswitch_1
    iget v6, p0, Lqa3/e;->x:I

    or-int/2addr v6, v5

    iput v6, p0, Lqa3/e;->x:I

    .line 19
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 20
    iput v6, p0, Lqa3/e;->L:I

    goto :goto_0

    .line 21
    :sswitch_2
    iget v6, p0, Lqa3/e;->x:I

    or-int/lit16 v6, v6, 0x200

    iput v6, p0, Lqa3/e;->x:I

    .line 22
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 23
    iput v6, p0, Lqa3/e;->M:I

    goto :goto_0

    :sswitch_3
    and-int/lit16 v6, v4, 0x100

    if-eq v6, v5, :cond_1

    .line 24
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lqa3/e;->K:Ljava/util/List;

    move v4, v5

    .line 25
    :cond_1
    iget-object v6, p0, Lqa3/e;->K:Ljava/util/List;

    sget-object v7, Lqa3/e;->Q:Lqa3/a;

    invoke-virtual {p1, v7, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 26
    :sswitch_4
    iget v6, p0, Lqa3/e;->x:I

    const/16 v7, 0x80

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_2

    .line 27
    iget-object v6, p0, Lqa3/e;->J:Lqa3/h;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v8, Lqa3/g;

    const/4 v9, 0x0

    .line 29
    invoke-direct {v8, v9}, Lqa3/g;-><init>(I)V

    .line 30
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v9, v8, Lqa3/g;->z:Ljava/util/List;

    .line 31
    invoke-virtual {v8, v6}, Lqa3/g;->n(Lqa3/h;)V

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    .line 32
    :goto_1
    sget-object v6, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/h;

    iput-object v6, p0, Lqa3/e;->J:Lqa3/h;

    if-eqz v8, :cond_3

    .line 33
    invoke-virtual {v8, v6}, Lqa3/g;->n(Lqa3/h;)V

    .line 34
    invoke-virtual {v8}, Lqa3/g;->j()Lqa3/h;

    move-result-object v6

    iput-object v6, p0, Lqa3/e;->J:Lqa3/h;

    .line 35
    :cond_3
    iget v6, p0, Lqa3/e;->x:I

    or-int/2addr v6, v7

    iput v6, p0, Lqa3/e;->x:I

    goto/16 :goto_0

    .line 36
    :sswitch_5
    iget v6, p0, Lqa3/e;->x:I

    or-int/lit8 v6, v6, 0x40

    iput v6, p0, Lqa3/e;->x:I

    .line 37
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 38
    iput v6, p0, Lqa3/e;->I:I

    goto/16 :goto_0

    .line 39
    :sswitch_6
    iget v6, p0, Lqa3/e;->x:I

    or-int/lit8 v6, v6, 0x20

    iput v6, p0, Lqa3/e;->x:I

    .line 40
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 41
    iput v6, p0, Lqa3/e;->H:I

    goto/16 :goto_0

    .line 42
    :sswitch_7
    iget v6, p0, Lqa3/e;->x:I

    or-int/lit8 v6, v6, 0x10

    iput v6, p0, Lqa3/e;->x:I

    .line 43
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 44
    iput v6, p0, Lqa3/e;->G:I

    goto/16 :goto_0

    .line 45
    :sswitch_8
    iget v6, p0, Lqa3/e;->x:I

    or-int/lit8 v6, v6, 0x8

    iput v6, p0, Lqa3/e;->x:I

    .line 46
    invoke-virtual {p1}, Lwa3/f;->k()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v6

    .line 47
    iput-wide v6, p0, Lqa3/e;->F:D

    goto/16 :goto_0

    .line 48
    :sswitch_9
    iget v6, p0, Lqa3/e;->x:I

    or-int/lit8 v6, v6, 0x4

    iput v6, p0, Lqa3/e;->x:I

    .line 49
    invoke-virtual {p1}, Lwa3/f;->j()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 50
    iput v6, p0, Lqa3/e;->E:F

    goto/16 :goto_0

    .line 51
    :sswitch_a
    iget v6, p0, Lqa3/e;->x:I

    or-int/lit8 v6, v6, 0x2

    iput v6, p0, Lqa3/e;->x:I

    .line 52
    invoke-virtual {p1}, Lwa3/f;->m()J

    move-result-wide v6

    ushr-long v8, v6, v1

    const-wide/16 v10, 0x1

    and-long/2addr v6, v10

    neg-long v6, v6

    xor-long/2addr v6, v8

    .line 53
    iput-wide v6, p0, Lqa3/e;->z:J

    goto/16 :goto_0

    .line 54
    :sswitch_b
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    .line 55
    invoke-static {v7}, Lqa3/d;->b(I)Lqa3/d;

    move-result-object v8

    if-nez v8, :cond_4

    .line 56
    invoke-virtual {v2, v6}, Lwa3/g;->v(I)V

    .line 57
    invoke-virtual {v2, v7}, Lwa3/g;->v(I)V

    goto/16 :goto_0

    .line 58
    :cond_4
    iget v6, p0, Lqa3/e;->x:I

    or-int/2addr v6, v1

    iput v6, p0, Lqa3/e;->x:I

    .line 59
    iput-object v8, p0, Lqa3/e;->y:Lqa3/d;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 60
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 62
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 63
    throw p2

    .line 64
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 65
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v5, :cond_5

    .line 66
    iget-object p2, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/e;->K:Ljava/util/List;

    .line 67
    :cond_5
    :try_start_2
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/e;->w:Lwa3/e;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/e;->w:Lwa3/e;

    .line 69
    throw p1

    .line 70
    :goto_5
    throw p1

    :cond_6
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v5, :cond_7

    .line 71
    iget-object p1, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/e;->K:Ljava/util/List;

    .line 72
    :cond_7
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 73
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/e;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/e;->w:Lwa3/e;

    .line 74
    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_b
        0x10 -> :sswitch_a
        0x1d -> :sswitch_9
        0x21 -> :sswitch_8
        0x28 -> :sswitch_7
        0x30 -> :sswitch_6
        0x38 -> :sswitch_5
        0x42 -> :sswitch_4
        0x4a -> :sswitch_3
        0x50 -> :sswitch_2
        0x58 -> :sswitch_1
    .end sparse-switch
.end method

.method public static j(Lqa3/e;)Lqa3/c;
    .locals 1

    invoke-static {}, Lqa3/c;->k()Lqa3/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/c;->l(Lqa3/e;)V

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/e;->N:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/e;->x:I

    const/16 v3, 0x80

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lqa3/e;->J:Lqa3/h;

    invoke-virtual {v0}, Lqa3/h;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Lqa3/e;->N:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/e;

    invoke-virtual {v3}, Lqa3/e;->b()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Lqa3/e;->N:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    iput-byte v1, p0, Lqa3/e;->N:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {p0}, Lqa3/e;->j(Lqa3/e;)Lqa3/c;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 9

    iget v0, p0, Lqa3/e;->O:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/e;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lqa3/e;->y:Lqa3/d;

    iget v0, v0, Lqa3/d;->w:I

    invoke-static {v1, v0}, Lwa3/g;->a(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v3, p0, Lqa3/e;->x:I

    const/4 v4, 0x2

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_2

    iget-wide v5, p0, Lqa3/e;->z:J

    invoke-static {v4}, Lwa3/g;->h(I)I

    move-result v3

    shl-long v7, v5, v1

    const/16 v1, 0x3f

    shr-long v4, v5, v1

    xor-long/2addr v4, v7

    invoke-static {v4, v5}, Lwa3/g;->g(J)I

    move-result v1

    add-int/2addr v1, v3

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lqa3/e;->x:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    invoke-static {v1}, Lwa3/g;->h(I)I

    move-result v1

    add-int/2addr v1, v3

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Lqa3/e;->x:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    invoke-static {v3}, Lwa3/g;->h(I)I

    move-result v1

    add-int/2addr v1, v4

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/e;->x:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x5

    iget v3, p0, Lqa3/e;->G:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Lqa3/e;->x:I

    const/16 v3, 0x20

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_6

    const/4 v1, 0x6

    iget v3, p0, Lqa3/e;->H:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, Lqa3/e;->x:I

    const/16 v3, 0x40

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_7

    const/4 v1, 0x7

    iget v3, p0, Lqa3/e;->I:I

    invoke-static {v1, v3}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget v1, p0, Lqa3/e;->x:I

    const/16 v3, 0x80

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_8

    iget-object v1, p0, Lqa3/e;->J:Lqa3/h;

    invoke-static {v4, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    :goto_1
    iget-object v1, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_9

    iget-object v1, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/16 v3, 0x9

    invoke-static {v3, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_9
    iget v1, p0, Lqa3/e;->x:I

    const/16 v2, 0x200

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    const/16 v1, 0xa

    iget v2, p0, Lqa3/e;->M:I

    invoke-static {v1, v2}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget v1, p0, Lqa3/e;->x:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_b

    const/16 v1, 0xb

    iget v2, p0, Lqa3/e;->L:I

    invoke-static {v1, v2}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget-object v1, p0, Lqa3/e;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/e;->O:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/c;->k()Lqa3/c;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 8

    invoke-virtual {p0}, Lqa3/e;->d()I

    iget v0, p0, Lqa3/e;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqa3/e;->y:Lqa3/d;

    iget v0, v0, Lqa3/d;->w:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->l(II)V

    :cond_0
    iget v0, p0, Lqa3/e;->x:I

    const/4 v2, 0x2

    and-int/2addr v0, v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    iget-wide v4, p0, Lqa3/e;->z:J

    invoke-virtual {p1, v2, v3}, Lwa3/g;->x(II)V

    shl-long v6, v4, v1

    const/16 v0, 0x3f

    shr-long/2addr v4, v0

    xor-long/2addr v4, v6

    invoke-virtual {p1, v4, v5}, Lwa3/g;->w(J)V

    :cond_1
    iget v0, p0, Lqa3/e;->x:I

    const/4 v2, 0x4

    and-int/2addr v0, v2

    const/4 v4, 0x5

    if-ne v0, v2, :cond_2

    iget v0, p0, Lqa3/e;->E:F

    const/4 v5, 0x3

    invoke-virtual {p1, v5, v4}, Lwa3/g;->x(II)V

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-virtual {p1, v0}, Lwa3/g;->t(I)V

    :cond_2
    iget v0, p0, Lqa3/e;->x:I

    const/16 v5, 0x8

    and-int/2addr v0, v5

    if-ne v0, v5, :cond_3

    iget-wide v6, p0, Lqa3/e;->F:D

    invoke-virtual {p1, v2, v1}, Lwa3/g;->x(II)V

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lwa3/g;->u(J)V

    :cond_3
    iget v0, p0, Lqa3/e;->x:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget v0, p0, Lqa3/e;->G:I

    invoke-virtual {p1, v4, v0}, Lwa3/g;->m(II)V

    :cond_4
    iget v0, p0, Lqa3/e;->x:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x6

    iget v1, p0, Lqa3/e;->H:I

    invoke-virtual {p1, v0, v1}, Lwa3/g;->m(II)V

    :cond_5
    iget v0, p0, Lqa3/e;->x:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_6

    const/4 v0, 0x7

    iget v1, p0, Lqa3/e;->I:I

    invoke-virtual {p1, v0, v1}, Lwa3/g;->m(II)V

    :cond_6
    iget v0, p0, Lqa3/e;->x:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lqa3/e;->J:Lqa3/h;

    invoke-virtual {p1, v5, v0}, Lwa3/g;->o(ILwa3/v;)V

    :cond_7
    :goto_0
    iget-object v0, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    iget-object v0, p0, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwa3/v;

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_8
    iget v0, p0, Lqa3/e;->x:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_9

    const/16 v0, 0xa

    iget v1, p0, Lqa3/e;->M:I

    invoke-virtual {p1, v0, v1}, Lwa3/g;->m(II)V

    :cond_9
    iget v0, p0, Lqa3/e;->x:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_a

    const/16 v0, 0xb

    iget v1, p0, Lqa3/e;->L:I

    invoke-virtual {p1, v0, v1}, Lwa3/g;->m(II)V

    :cond_a
    iget-object v0, p0, Lqa3/e;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final i()V
    .locals 2

    sget-object v0, Lqa3/d;->x:Lqa3/d;

    iput-object v0, p0, Lqa3/e;->y:Lqa3/d;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lqa3/e;->z:J

    const/4 v0, 0x0

    iput v0, p0, Lqa3/e;->E:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lqa3/e;->F:D

    const/4 v0, 0x0

    iput v0, p0, Lqa3/e;->G:I

    iput v0, p0, Lqa3/e;->H:I

    iput v0, p0, Lqa3/e;->I:I

    sget-object v1, Lqa3/h;->G:Lqa3/h;

    iput-object v1, p0, Lqa3/e;->J:Lqa3/h;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lqa3/e;->K:Ljava/util/List;

    iput v0, p0, Lqa3/e;->L:I

    iput v0, p0, Lqa3/e;->M:I

    return-void
.end method
