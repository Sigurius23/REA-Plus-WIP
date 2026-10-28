.class public final Lta3/f;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final J:Lta3/f;

.field public static final K:Lqa3/a;


# instance fields
.field public E:Lta3/d;

.field public F:Lta3/d;

.field public G:Lta3/d;

.field public H:B

.field public I:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:Lta3/b;

.field public z:Lta3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lta3/f;->K:Lqa3/a;

    new-instance v0, Lta3/f;

    invoke-direct {v0}, Lta3/f;-><init>()V

    sput-object v0, Lta3/f;->J:Lta3/f;

    sget-object v1, Lta3/b;->G:Lta3/b;

    iput-object v1, v0, Lta3/f;->y:Lta3/b;

    sget-object v1, Lta3/d;->G:Lta3/d;

    iput-object v1, v0, Lta3/f;->z:Lta3/d;

    iput-object v1, v0, Lta3/f;->E:Lta3/d;

    iput-object v1, v0, Lta3/f;->F:Lta3/d;

    iput-object v1, v0, Lta3/f;->G:Lta3/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lta3/f;->H:B

    .line 3
    iput v0, p0, Lta3/f;->I:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lta3/f;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lta3/e;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lta3/f;->H:B

    .line 7
    iput v0, p0, Lta3/f;->I:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lta3/f;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lta3/f;->H:B

    .line 12
    iput v0, p0, Lta3/f;->I:I

    .line 13
    sget-object v0, Lta3/b;->G:Lta3/b;

    .line 14
    iput-object v0, p0, Lta3/f;->y:Lta3/b;

    .line 15
    sget-object v0, Lta3/d;->G:Lta3/d;

    .line 16
    iput-object v0, p0, Lta3/f;->z:Lta3/d;

    .line 17
    iput-object v0, p0, Lta3/f;->E:Lta3/d;

    .line 18
    iput-object v0, p0, Lta3/f;->F:Lta3/d;

    .line 19
    iput-object v0, p0, Lta3/f;->G:Lta3/d;

    .line 20
    new-instance v0, Lwa3/d;

    invoke-direct {v0}, Lwa3/d;-><init>()V

    const/4 v1, 0x1

    .line 21
    invoke-static {v0, v1}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_11

    .line 22
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v4, v5, :cond_e

    const/16 v5, 0x12

    if-eq v4, v5, :cond_b

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_8

    const/16 v5, 0x22

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2a

    if-eq v4, v5, :cond_2

    .line 23
    invoke-virtual {p1, v4, v2}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v4

    if-nez v4, :cond_0

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
    iget v4, p0, Lta3/f;->x:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 25
    iget-object v4, p0, Lta3/f;->G:Lta3/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-static {v4}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v6

    .line 27
    :cond_3
    sget-object v4, Lta3/d;->H:Lqa3/a;

    invoke-virtual {p1, v4, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v4

    check-cast v4, Lta3/d;

    iput-object v4, p0, Lta3/f;->G:Lta3/d;

    if-eqz v6, :cond_4

    .line 28
    invoke-virtual {v6, v4}, Lta3/c;->k(Lta3/d;)V

    .line 29
    invoke-virtual {v6}, Lta3/c;->j()Lta3/d;

    move-result-object v4

    iput-object v4, p0, Lta3/f;->G:Lta3/d;

    .line 30
    :cond_4
    iget v4, p0, Lta3/f;->x:I

    or-int/2addr v4, v5

    iput v4, p0, Lta3/f;->x:I

    goto :goto_0

    .line 31
    :cond_5
    iget v4, p0, Lta3/f;->x:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    .line 32
    iget-object v4, p0, Lta3/f;->F:Lta3/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-static {v4}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v6

    .line 34
    :cond_6
    sget-object v4, Lta3/d;->H:Lqa3/a;

    invoke-virtual {p1, v4, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v4

    check-cast v4, Lta3/d;

    iput-object v4, p0, Lta3/f;->F:Lta3/d;

    if-eqz v6, :cond_7

    .line 35
    invoke-virtual {v6, v4}, Lta3/c;->k(Lta3/d;)V

    .line 36
    invoke-virtual {v6}, Lta3/c;->j()Lta3/d;

    move-result-object v4

    iput-object v4, p0, Lta3/f;->F:Lta3/d;

    .line 37
    :cond_7
    iget v4, p0, Lta3/f;->x:I

    or-int/2addr v4, v5

    iput v4, p0, Lta3/f;->x:I

    goto/16 :goto_0

    .line 38
    :cond_8
    iget v4, p0, Lta3/f;->x:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_9

    .line 39
    iget-object v4, p0, Lta3/f;->E:Lta3/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-static {v4}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v6

    .line 41
    :cond_9
    sget-object v4, Lta3/d;->H:Lqa3/a;

    invoke-virtual {p1, v4, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v4

    check-cast v4, Lta3/d;

    iput-object v4, p0, Lta3/f;->E:Lta3/d;

    if-eqz v6, :cond_a

    .line 42
    invoke-virtual {v6, v4}, Lta3/c;->k(Lta3/d;)V

    .line 43
    invoke-virtual {v6}, Lta3/c;->j()Lta3/d;

    move-result-object v4

    iput-object v4, p0, Lta3/f;->E:Lta3/d;

    .line 44
    :cond_a
    iget v4, p0, Lta3/f;->x:I

    or-int/2addr v4, v5

    iput v4, p0, Lta3/f;->x:I

    goto/16 :goto_0

    .line 45
    :cond_b
    iget v4, p0, Lta3/f;->x:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_c

    .line 46
    iget-object v4, p0, Lta3/f;->z:Lta3/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    invoke-static {v4}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v6

    .line 48
    :cond_c
    sget-object v4, Lta3/d;->H:Lqa3/a;

    invoke-virtual {p1, v4, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v4

    check-cast v4, Lta3/d;

    iput-object v4, p0, Lta3/f;->z:Lta3/d;

    if-eqz v6, :cond_d

    .line 49
    invoke-virtual {v6, v4}, Lta3/c;->k(Lta3/d;)V

    .line 50
    invoke-virtual {v6}, Lta3/c;->j()Lta3/d;

    move-result-object v4

    iput-object v4, p0, Lta3/f;->z:Lta3/d;

    .line 51
    :cond_d
    iget v4, p0, Lta3/f;->x:I

    or-int/2addr v4, v5

    iput v4, p0, Lta3/f;->x:I

    goto/16 :goto_0

    .line 52
    :cond_e
    iget v4, p0, Lta3/f;->x:I

    and-int/2addr v4, v1

    if-ne v4, v1, :cond_f

    .line 53
    iget-object v4, p0, Lta3/f;->y:Lta3/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-static {}, Lta3/a;->j()Lta3/a;

    move-result-object v6

    .line 55
    invoke-virtual {v6, v4}, Lta3/a;->l(Lta3/b;)V

    .line 56
    :cond_f
    sget-object v4, Lta3/b;->H:Lqa3/a;

    invoke-virtual {p1, v4, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v4

    check-cast v4, Lta3/b;

    iput-object v4, p0, Lta3/f;->y:Lta3/b;

    if-eqz v6, :cond_10

    .line 57
    invoke-virtual {v6, v4}, Lta3/a;->l(Lta3/b;)V

    .line 58
    invoke-virtual {v6}, Lta3/a;->k()Lta3/b;

    move-result-object v4

    iput-object v4, p0, Lta3/f;->y:Lta3/b;

    .line 59
    :cond_10
    iget v4, p0, Lta3/f;->x:I

    or-int/2addr v4, v1

    iput v4, p0, Lta3/f;->x:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 60
    :goto_1
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
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 65
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lta3/f;->w:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lta3/f;->w:Lwa3/e;

    .line 68
    throw p1

    .line 69
    :goto_4
    throw p1

    .line 70
    :cond_11
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 71
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lta3/f;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lta3/f;->w:Lwa3/e;

    .line 72
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-byte v0, p0, Lta3/f;->H:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    iput-byte v1, p0, Lta3/f;->H:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lta3/e;->k()Lta3/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lta3/e;->l(Lta3/f;)V

    return-object v0
.end method

.method public final d()I
    .locals 4

    iget v0, p0, Lta3/f;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lta3/f;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lta3/f;->y:Lta3/b;

    invoke-static {v1, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lta3/f;->x:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lta3/f;->z:Lta3/d;

    invoke-static {v2, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lta3/f;->x:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/4 v1, 0x3

    iget-object v3, p0, Lta3/f;->E:Lta3/d;

    invoke-static {v1, v3}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Lta3/f;->x:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lta3/f;->F:Lta3/d;

    invoke-static {v2, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lta3/f;->x:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget-object v2, p0, Lta3/f;->G:Lta3/d;

    invoke-static {v1, v2}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lta3/f;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lta3/f;->I:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lta3/e;->k()Lta3/e;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 3

    invoke-virtual {p0}, Lta3/f;->d()I

    iget v0, p0, Lta3/f;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lta3/f;->y:Lta3/b;

    invoke-virtual {p1, v1, v0}, Lwa3/g;->o(ILwa3/v;)V

    :cond_0
    iget v0, p0, Lta3/f;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lta3/f;->z:Lta3/d;

    invoke-virtual {p1, v1, v0}, Lwa3/g;->o(ILwa3/v;)V

    :cond_1
    iget v0, p0, Lta3/f;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x3

    iget-object v2, p0, Lta3/f;->E:Lta3/d;

    invoke-virtual {p1, v0, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_2
    iget v0, p0, Lta3/f;->x:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lta3/f;->F:Lta3/d;

    invoke-virtual {p1, v1, v0}, Lwa3/g;->o(ILwa3/v;)V

    :cond_3
    iget v0, p0, Lta3/f;->x:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget-object v1, p0, Lta3/f;->G:Lta3/d;

    invoke-virtual {p1, v0, v1}, Lwa3/g;->o(ILwa3/v;)V

    :cond_4
    iget-object v0, p0, Lta3/f;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final i()Z
    .locals 2

    iget v0, p0, Lta3/f;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
