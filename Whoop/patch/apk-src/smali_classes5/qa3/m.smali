.class public final Lqa3/m;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final G:Lqa3/m;

.field public static final H:Lqa3/l;


# instance fields
.field public E:B

.field public F:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:I

.field public z:Lwa3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqa3/l;-><init>(I)V

    sput-object v0, Lqa3/m;->H:Lqa3/l;

    new-instance v0, Lqa3/m;

    invoke-direct {v0}, Lqa3/m;-><init>()V

    sput-object v0, Lqa3/m;->G:Lqa3/m;

    iput v1, v0, Lqa3/m;->y:I

    sget-object v1, Lwa3/e;->w:Lwa3/u;

    iput-object v1, v0, Lqa3/m;->z:Lwa3/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/m;->E:B

    .line 3
    iput v0, p0, Lqa3/m;->F:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/m;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/b;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/m;->E:B

    .line 7
    iput v0, p0, Lqa3/m;->F:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/m;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;)V
    .locals 6

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/m;->E:B

    .line 12
    iput v0, p0, Lqa3/m;->F:I

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lqa3/m;->y:I

    .line 14
    sget-object v1, Lwa3/e;->w:Lwa3/u;

    iput-object v1, p0, Lqa3/m;->z:Lwa3/u;

    .line 15
    new-instance v1, Lwa3/d;

    invoke-direct {v1}, Lwa3/d;-><init>()V

    const/4 v2, 0x1

    .line 16
    invoke-static {v1, v2}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v3

    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_3

    const/16 v5, 0x12

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p1, v4, v3}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v0, v2

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

    .line 19
    :cond_2
    iget v4, p0, Lqa3/m;->x:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lqa3/m;->x:I

    .line 20
    invoke-virtual {p1}, Lwa3/f;->f()Lwa3/u;

    move-result-object v4

    iput-object v4, p0, Lqa3/m;->z:Lwa3/u;

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, Lqa3/m;->x:I

    or-int/2addr v4, v2

    iput v4, p0, Lqa3/m;->x:I

    .line 22
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v4

    .line 23
    iput v4, p0, Lqa3/m;->y:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 24
    :goto_1
    :try_start_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 26
    iput-object p0, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 27
    throw v0

    .line 28
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 29
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :goto_3
    :try_start_2
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 31
    :catch_2
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/m;->w:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/m;->w:Lwa3/e;

    .line 32
    throw p1

    .line 33
    :goto_4
    throw p1

    .line 34
    :cond_4
    :try_start_3
    invoke-virtual {v3}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 35
    :catch_3
    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/m;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/m;->w:Lwa3/e;

    .line 36
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/m;->E:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/m;->x:I

    and-int/lit8 v3, v0, 0x1

    if-ne v3, v1, :cond_3

    const/4 v3, 0x2

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    iput-byte v1, p0, Lqa3/m;->E:B

    return v1

    :cond_2
    iput-byte v2, p0, Lqa3/m;->E:B

    return v2

    :cond_3
    iput-byte v2, p0, Lqa3/m;->E:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/b;->j()Lqa3/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/b;->p(Lqa3/m;)V

    return-object v0
.end method

.method public final d()I
    .locals 4

    iget v0, p0, Lqa3/m;->F:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/m;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/m;->y:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lqa3/m;->x:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lqa3/m;->z:Lwa3/u;

    invoke-static {v2}, Lwa3/g;->h(I)I

    move-result v2

    invoke-virtual {v1}, Lwa3/u;->size()I

    move-result v3

    invoke-static {v3}, Lwa3/g;->f(I)I

    move-result v3

    invoke-virtual {v1}, Lwa3/u;->size()I

    move-result v1

    add-int/2addr v1, v3

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lqa3/m;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/m;->F:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/b;->j()Lqa3/b;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 2

    invoke-virtual {p0}, Lqa3/m;->d()I

    iget v0, p0, Lqa3/m;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lqa3/m;->y:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_0
    iget v0, p0, Lqa3/m;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lqa3/m;->z:Lwa3/u;

    invoke-virtual {p1, v1, v1}, Lwa3/g;->x(II)V

    invoke-virtual {v0}, Lwa3/u;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Lwa3/g;->v(I)V

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    :cond_1
    iget-object v0, p0, Lqa3/m;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
