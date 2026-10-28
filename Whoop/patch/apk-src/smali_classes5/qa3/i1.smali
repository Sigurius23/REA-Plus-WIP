.class public final Lqa3/i1;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final K:Lqa3/i1;

.field public static final L:Lqa3/a;


# instance fields
.field public E:Lqa3/g1;

.field public F:I

.field public G:I

.field public H:Lqa3/h1;

.field public I:B

.field public J:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqa3/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/i1;->L:Lqa3/a;

    new-instance v0, Lqa3/i1;

    invoke-direct {v0}, Lqa3/i1;-><init>()V

    sput-object v0, Lqa3/i1;->K:Lqa3/i1;

    const/4 v1, 0x0

    iput v1, v0, Lqa3/i1;->y:I

    iput v1, v0, Lqa3/i1;->z:I

    sget-object v2, Lqa3/g1;->y:Lqa3/g1;

    iput-object v2, v0, Lqa3/i1;->E:Lqa3/g1;

    iput v1, v0, Lqa3/i1;->F:I

    iput v1, v0, Lqa3/i1;->G:I

    sget-object v1, Lqa3/h1;->x:Lqa3/h1;

    iput-object v1, v0, Lqa3/i1;->H:Lqa3/h1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/i1;->I:B

    .line 3
    iput v0, p0, Lqa3/i1;->J:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/i1;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/f1;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/i1;->I:B

    .line 7
    iput v0, p0, Lqa3/i1;->J:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/i1;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;)V
    .locals 12

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/i1;->I:B

    .line 12
    iput v0, p0, Lqa3/i1;->J:I

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lqa3/i1;->y:I

    .line 14
    iput v0, p0, Lqa3/i1;->z:I

    .line 15
    sget-object v1, Lqa3/g1;->y:Lqa3/g1;

    iput-object v1, p0, Lqa3/i1;->E:Lqa3/g1;

    .line 16
    iput v0, p0, Lqa3/i1;->F:I

    .line 17
    iput v0, p0, Lqa3/i1;->G:I

    .line 18
    sget-object v2, Lqa3/h1;->x:Lqa3/h1;

    iput-object v2, p0, Lqa3/i1;->H:Lqa3/h1;

    .line 19
    new-instance v3, Lwa3/d;

    invoke-direct {v3}, Lwa3/d;-><init>()V

    const/4 v4, 0x1

    .line 20
    invoke-static {v3, v4}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v5

    :cond_0
    :goto_0
    if-nez v0, :cond_10

    .line 21
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x8

    if-eq v6, v7, :cond_f

    const/4 v8, 0x2

    const/16 v9, 0x10

    if-eq v6, v9, :cond_e

    const/16 v10, 0x18

    const/4 v11, 0x0

    if-eq v6, v10, :cond_9

    const/16 v10, 0x20

    if-eq v6, v10, :cond_8

    const/16 v7, 0x28

    if-eq v6, v7, :cond_7

    const/16 v7, 0x30

    if-eq v6, v7, :cond_2

    .line 22
    invoke-virtual {p1, v6, v5}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v6

    if-nez v6, :cond_0

    :cond_1
    move v0, v4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    .line 23
    :cond_2
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    if-eqz v7, :cond_5

    if-eq v7, v4, :cond_4

    if-eq v7, v8, :cond_3

    goto :goto_1

    .line 24
    :cond_3
    sget-object v11, Lqa3/h1;->z:Lqa3/h1;

    goto :goto_1

    .line 25
    :cond_4
    sget-object v11, Lqa3/h1;->y:Lqa3/h1;

    goto :goto_1

    :cond_5
    move-object v11, v2

    :goto_1
    if-nez v11, :cond_6

    .line 26
    invoke-virtual {v5, v6}, Lwa3/g;->v(I)V

    .line 27
    invoke-virtual {v5, v7}, Lwa3/g;->v(I)V

    goto :goto_0

    .line 28
    :cond_6
    iget v6, p0, Lqa3/i1;->x:I

    or-int/2addr v6, v10

    iput v6, p0, Lqa3/i1;->x:I

    .line 29
    iput-object v11, p0, Lqa3/i1;->H:Lqa3/h1;

    goto :goto_0

    .line 30
    :cond_7
    iget v6, p0, Lqa3/i1;->x:I

    or-int/2addr v6, v9

    iput v6, p0, Lqa3/i1;->x:I

    .line 31
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 32
    iput v6, p0, Lqa3/i1;->G:I

    goto :goto_0

    .line 33
    :cond_8
    iget v6, p0, Lqa3/i1;->x:I

    or-int/2addr v6, v7

    iput v6, p0, Lqa3/i1;->x:I

    .line 34
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 35
    iput v6, p0, Lqa3/i1;->F:I

    goto :goto_0

    .line 36
    :cond_9
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v7

    if-eqz v7, :cond_c

    if-eq v7, v4, :cond_b

    if-eq v7, v8, :cond_a

    goto :goto_2

    .line 37
    :cond_a
    sget-object v11, Lqa3/g1;->z:Lqa3/g1;

    goto :goto_2

    :cond_b
    move-object v11, v1

    goto :goto_2

    .line 38
    :cond_c
    sget-object v11, Lqa3/g1;->x:Lqa3/g1;

    :goto_2
    if-nez v11, :cond_d

    .line 39
    invoke-virtual {v5, v6}, Lwa3/g;->v(I)V

    .line 40
    invoke-virtual {v5, v7}, Lwa3/g;->v(I)V

    goto/16 :goto_0

    .line 41
    :cond_d
    iget v6, p0, Lqa3/i1;->x:I

    or-int/lit8 v6, v6, 0x4

    iput v6, p0, Lqa3/i1;->x:I

    .line 42
    iput-object v11, p0, Lqa3/i1;->E:Lqa3/g1;

    goto/16 :goto_0

    .line 43
    :cond_e
    iget v6, p0, Lqa3/i1;->x:I

    or-int/2addr v6, v8

    iput v6, p0, Lqa3/i1;->x:I

    .line 44
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 45
    iput v6, p0, Lqa3/i1;->z:I

    goto/16 :goto_0

    .line 46
    :cond_f
    iget v6, p0, Lqa3/i1;->x:I

    or-int/2addr v6, v4

    iput v6, p0, Lqa3/i1;->x:I

    .line 47
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    .line 48
    iput v6, p0, Lqa3/i1;->y:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 49
    :goto_3
    :try_start_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 51
    iput-object p0, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 52
    throw v0

    .line 53
    :goto_4
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 54
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    :goto_5
    :try_start_2
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    :catch_2
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/i1;->w:Lwa3/e;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/i1;->w:Lwa3/e;

    .line 57
    throw p1

    .line 58
    :goto_6
    throw p1

    .line 59
    :cond_10
    :try_start_3
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 60
    :catch_3
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/i1;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/i1;->w:Lwa3/e;

    .line 61
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-byte v0, p0, Lqa3/i1;->I:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    iput-byte v1, p0, Lqa3/i1;->I:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/f1;->j()Lqa3/f1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/f1;->l(Lqa3/i1;)V

    return-object v0
.end method

.method public final d()I
    .locals 4

    iget v0, p0, Lqa3/i1;->J:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/i1;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/i1;->y:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lqa3/i1;->x:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, Lqa3/i1;->z:I

    invoke-static {v2, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lqa3/i1;->x:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lqa3/i1;->E:Lqa3/g1;

    iget v1, v1, Lqa3/g1;->w:I

    const/4 v3, 0x3

    invoke-static {v3, v1}, Lwa3/g;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Lqa3/i1;->x:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget v1, p0, Lqa3/i1;->F:I

    invoke-static {v2, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/i1;->x:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget v2, p0, Lqa3/i1;->G:I

    invoke-static {v1, v2}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Lqa3/i1;->x:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lqa3/i1;->H:Lqa3/h1;

    iget v1, v1, Lqa3/h1;->w:I

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lwa3/g;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Lqa3/i1;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/i1;->J:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/f1;->j()Lqa3/f1;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 3

    invoke-virtual {p0}, Lqa3/i1;->d()I

    iget v0, p0, Lqa3/i1;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lqa3/i1;->y:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_0
    iget v0, p0, Lqa3/i1;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/i1;->z:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_1
    iget v0, p0, Lqa3/i1;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lqa3/i1;->E:Lqa3/g1;

    iget v0, v0, Lqa3/g1;->w:I

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lwa3/g;->l(II)V

    :cond_2
    iget v0, p0, Lqa3/i1;->x:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget v0, p0, Lqa3/i1;->F:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_3
    iget v0, p0, Lqa3/i1;->x:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget v1, p0, Lqa3/i1;->G:I

    invoke-virtual {p1, v0, v1}, Lwa3/g;->m(II)V

    :cond_4
    iget v0, p0, Lqa3/i1;->x:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lqa3/i1;->H:Lqa3/h1;

    iget v0, v0, Lqa3/h1;->w:I

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lwa3/g;->l(II)V

    :cond_5
    iget-object v0, p0, Lqa3/i1;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
