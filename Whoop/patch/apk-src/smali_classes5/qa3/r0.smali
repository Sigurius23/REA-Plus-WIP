.class public final Lqa3/r0;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final E:Lqa3/r0;

.field public static final F:Lqa3/a;


# instance fields
.field public final w:Lwa3/e;

.field public x:Lwa3/t;

.field public y:B

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/r0;->F:Lqa3/a;

    new-instance v0, Lqa3/r0;

    invoke-direct {v0}, Lqa3/r0;-><init>()V

    sput-object v0, Lqa3/r0;->E:Lqa3/r0;

    sget-object v1, Lwa3/s;->x:Lwa3/j0;

    iput-object v1, v0, Lqa3/r0;->x:Lwa3/t;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/r0;->y:B

    .line 3
    iput v0, p0, Lqa3/r0;->z:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/r0;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/l0;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/r0;->y:B

    .line 7
    iput v0, p0, Lqa3/r0;->z:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/r0;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/r0;->y:B

    .line 12
    iput v0, p0, Lqa3/r0;->z:I

    .line 13
    sget-object v0, Lwa3/s;->x:Lwa3/j0;

    iput-object v0, p0, Lqa3/r0;->x:Lwa3/t;

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
    if-nez v3, :cond_5

    .line 16
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0xa

    if-eq v5, v6, :cond_2

    .line 17
    invoke-virtual {p1, v5, v2}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 18
    :cond_2
    invoke-virtual {p1}, Lwa3/f;->f()Lwa3/u;

    move-result-object v5

    if-eq v4, v1, :cond_3

    .line 19
    new-instance v6, Lwa3/s;

    invoke-direct {v6}, Lwa3/s;-><init>()V

    iput-object v6, p0, Lqa3/r0;->x:Lwa3/t;

    move v4, v1

    .line 20
    :cond_3
    iget-object v6, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {v6, v5}, Lwa3/t;->S0(Lwa3/u;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 21
    :goto_1
    :try_start_1
    new-instance v3, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 23
    iput-object p0, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 24
    throw v3

    .line 25
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 26
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-ne v4, v1, :cond_4

    .line 27
    iget-object v1, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {v1}, Lwa3/t;->k()Lwa3/j0;

    move-result-object v1

    iput-object v1, p0, Lqa3/r0;->x:Lwa3/t;

    .line 28
    :cond_4
    :try_start_2
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/r0;->w:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/r0;->w:Lwa3/e;

    .line 30
    throw p1

    .line 31
    :goto_4
    throw p1

    :cond_5
    if-ne v4, v1, :cond_6

    .line 32
    iget-object p1, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {p1}, Lwa3/t;->k()Lwa3/j0;

    move-result-object p1

    iput-object p1, p0, Lqa3/r0;->x:Lwa3/t;

    .line 33
    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 34
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/r0;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/r0;->w:Lwa3/e;

    .line 35
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-byte v0, p0, Lqa3/r0;->y:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    iput-byte v1, p0, Lqa3/r0;->y:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/l0;->j()Lqa3/l0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/l0;->p(Lqa3/r0;)V

    return-object v0
.end method

.method public final d()I
    .locals 4

    iget v0, p0, Lqa3/r0;->z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {v2, v0}, Lwa3/t;->b0(I)Lwa3/e;

    move-result-object v2

    invoke-virtual {v2}, Lwa3/e;->size()I

    move-result v3

    invoke-static {v3}, Lwa3/g;->f(I)I

    move-result v3

    invoke-virtual {v2}, Lwa3/e;->size()I

    move-result v2

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v1

    iget-object v1, p0, Lqa3/r0;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/r0;->z:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/l0;->j()Lqa3/l0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 4

    invoke-virtual {p0}, Lqa3/r0;->d()I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lqa3/r0;->x:Lwa3/t;

    invoke-interface {v1, v0}, Lwa3/t;->b0(I)Lwa3/e;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Lwa3/g;->x(II)V

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    invoke-virtual {p1, v1}, Lwa3/g;->r(Lwa3/e;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqa3/r0;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
