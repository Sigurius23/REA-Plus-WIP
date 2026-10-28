.class public final Lqa3/f;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final G:Lqa3/f;

.field public static final H:Lqa3/a;


# instance fields
.field public E:B

.field public F:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:I

.field public z:Lqa3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/f;->H:Lqa3/a;

    new-instance v0, Lqa3/f;

    invoke-direct {v0}, Lqa3/f;-><init>()V

    sput-object v0, Lqa3/f;->G:Lqa3/f;

    const/4 v1, 0x0

    iput v1, v0, Lqa3/f;->y:I

    sget-object v1, Lqa3/e;->P:Lqa3/e;

    iput-object v1, v0, Lqa3/f;->z:Lqa3/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/f;->E:B

    .line 3
    iput v0, p0, Lqa3/f;->F:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/f;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/b;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/f;->E:B

    .line 7
    iput v0, p0, Lqa3/f;->F:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/f;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/f;->E:B

    .line 12
    iput v0, p0, Lqa3/f;->F:I

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lqa3/f;->y:I

    .line 14
    sget-object v1, Lqa3/e;->P:Lqa3/e;

    .line 15
    iput-object v1, p0, Lqa3/f;->z:Lqa3/e;

    .line 16
    new-instance v1, Lwa3/d;

    invoke-direct {v1}, Lwa3/d;-><init>()V

    const/4 v2, 0x1

    .line 17
    invoke-static {v1, v2}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v3

    :cond_0
    :goto_0
    if-nez v0, :cond_6

    .line 18
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_5

    const/16 v5, 0x12

    if-eq v4, v5, :cond_2

    .line 19
    invoke-virtual {p1, v4, v3}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    .line 20
    :cond_2
    iget v4, p0, Lqa3/f;->x:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 21
    iget-object v4, p0, Lqa3/f;->z:Lqa3/e;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-static {v4}, Lqa3/e;->j(Lqa3/e;)Lqa3/c;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 23
    :goto_1
    sget-object v6, Lqa3/e;->Q:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    check-cast v6, Lqa3/e;

    iput-object v6, p0, Lqa3/f;->z:Lqa3/e;

    if-eqz v4, :cond_4

    .line 24
    invoke-virtual {v4, v6}, Lqa3/c;->l(Lqa3/e;)V

    .line 25
    invoke-virtual {v4}, Lqa3/c;->j()Lqa3/e;

    move-result-object v4

    iput-object v4, p0, Lqa3/f;->z:Lqa3/e;

    .line 26
    :cond_4
    iget v4, p0, Lqa3/f;->x:I

    or-int/2addr v4, v5

    iput v4, p0, Lqa3/f;->x:I

    goto :goto_0

    .line 27
    :cond_5
    iget v4, p0, Lqa3/f;->x:I

    or-int/2addr v4, v2

    iput v4, p0, Lqa3/f;->x:I

    .line 28
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v4

    .line 29
    iput v4, p0, Lqa3/f;->y:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 30
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 32
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 33
    throw p2

    .line 34
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 35
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_4
    :try_start_2
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :catch_2
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/f;->w:Lwa3/e;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/f;->w:Lwa3/e;

    .line 38
    throw p1

    .line 39
    :goto_5
    throw p1

    .line 40
    :cond_6
    :try_start_3
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 41
    :catch_3
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/f;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/f;->w:Lwa3/e;

    .line 42
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/f;->E:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/f;->x:I

    and-int/lit8 v3, v0, 0x1

    if-ne v3, v1, :cond_4

    const/4 v3, 0x2

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lqa3/f;->z:Lqa3/e;

    invoke-virtual {v0}, Lqa3/e;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Lqa3/f;->E:B

    return v2

    :cond_2
    iput-byte v1, p0, Lqa3/f;->E:B

    return v1

    :cond_3
    iput-byte v2, p0, Lqa3/f;->E:B

    return v2

    :cond_4
    iput-byte v2, p0, Lqa3/f;->E:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/b;->k()Lqa3/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/b;->o(Lqa3/f;)V

    return-object v0
.end method

.method public final d()I
    .locals 3

    iget v0, p0, Lqa3/f;->F:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/f;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/f;->y:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lqa3/f;->x:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lqa3/f;->z:Lqa3/e;

    invoke-static {v2, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lqa3/f;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/f;->F:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/b;->k()Lqa3/b;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 2

    invoke-virtual {p0}, Lqa3/f;->d()I

    iget v0, p0, Lqa3/f;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lqa3/f;->y:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_0
    iget v0, p0, Lqa3/f;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lqa3/f;->z:Lqa3/e;

    invoke-virtual {p1, v1, v0}, Lwa3/g;->o(ILwa3/v;)V

    :cond_1
    iget-object v0, p0, Lqa3/f;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
