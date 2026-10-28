.class public final Lqa3/o0;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final H:Lqa3/o0;

.field public static final I:Lqa3/a;


# instance fields
.field public E:Lqa3/n0;

.field public F:B

.field public G:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/o0;->I:Lqa3/a;

    new-instance v0, Lqa3/o0;

    invoke-direct {v0}, Lqa3/o0;-><init>()V

    sput-object v0, Lqa3/o0;->H:Lqa3/o0;

    const/4 v1, -0x1

    iput v1, v0, Lqa3/o0;->y:I

    const/4 v1, 0x0

    iput v1, v0, Lqa3/o0;->z:I

    sget-object v1, Lqa3/n0;->y:Lqa3/n0;

    iput-object v1, v0, Lqa3/o0;->E:Lqa3/n0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/o0;->F:B

    .line 3
    iput v0, p0, Lqa3/o0;->G:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/o0;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/m0;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/o0;->F:B

    .line 7
    iput v0, p0, Lqa3/o0;->G:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/o0;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;)V
    .locals 8

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/o0;->F:B

    .line 12
    iput v0, p0, Lqa3/o0;->G:I

    .line 13
    iput v0, p0, Lqa3/o0;->y:I

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lqa3/o0;->z:I

    .line 15
    sget-object v1, Lqa3/n0;->y:Lqa3/n0;

    iput-object v1, p0, Lqa3/o0;->E:Lqa3/n0;

    .line 16
    new-instance v2, Lwa3/d;

    invoke-direct {v2}, Lwa3/d;-><init>()V

    const/4 v3, 0x1

    .line 17
    invoke-static {v2, v3}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v4

    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 18
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0x8

    if-eq v5, v6, :cond_8

    const/16 v6, 0x10

    const/4 v7, 0x2

    if-eq v5, v6, :cond_7

    const/16 v6, 0x18

    if-eq v5, v6, :cond_2

    .line 19
    invoke-virtual {p1, v5, v4}, Lwa3/f;->r(ILwa3/g;)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v0, v3

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
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v6

    if-eqz v6, :cond_5

    if-eq v6, v3, :cond_4

    if-eq v6, v7, :cond_3

    const/4 v7, 0x0

    goto :goto_1

    .line 21
    :cond_3
    sget-object v7, Lqa3/n0;->z:Lqa3/n0;

    goto :goto_1

    :cond_4
    move-object v7, v1

    goto :goto_1

    .line 22
    :cond_5
    sget-object v7, Lqa3/n0;->x:Lqa3/n0;

    :goto_1
    if-nez v7, :cond_6

    .line 23
    invoke-virtual {v4, v5}, Lwa3/g;->v(I)V

    .line 24
    invoke-virtual {v4, v6}, Lwa3/g;->v(I)V

    goto :goto_0

    .line 25
    :cond_6
    iget v5, p0, Lqa3/o0;->x:I

    or-int/lit8 v5, v5, 0x4

    iput v5, p0, Lqa3/o0;->x:I

    .line 26
    iput-object v7, p0, Lqa3/o0;->E:Lqa3/n0;

    goto :goto_0

    .line 27
    :cond_7
    iget v5, p0, Lqa3/o0;->x:I

    or-int/2addr v5, v7

    iput v5, p0, Lqa3/o0;->x:I

    .line 28
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v5

    .line 29
    iput v5, p0, Lqa3/o0;->z:I

    goto :goto_0

    .line 30
    :cond_8
    iget v5, p0, Lqa3/o0;->x:I

    or-int/2addr v5, v3

    iput v5, p0, Lqa3/o0;->x:I

    .line 31
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v5

    .line 32
    iput v5, p0, Lqa3/o0;->y:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 33
    :goto_2
    :try_start_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 35
    iput-object p0, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 36
    throw v0

    .line 37
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 38
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :goto_4
    :try_start_2
    invoke-virtual {v4}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 40
    :catch_2
    invoke-virtual {v2}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/o0;->w:Lwa3/e;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v2}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/o0;->w:Lwa3/e;

    .line 41
    throw p1

    .line 42
    :goto_5
    throw p1

    .line 43
    :cond_9
    :try_start_3
    invoke-virtual {v4}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 44
    :catch_3
    invoke-virtual {v2}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/o0;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v2}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/o0;->w:Lwa3/e;

    .line 45
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/o0;->F:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/o0;->x:I

    const/4 v3, 0x2

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    iput-byte v1, p0, Lqa3/o0;->F:B

    return v1

    :cond_2
    iput-byte v2, p0, Lqa3/o0;->F:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/m0;->j()Lqa3/m0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/m0;->l(Lqa3/o0;)V

    return-object v0
.end method

.method public final d()I
    .locals 3

    iget v0, p0, Lqa3/o0;->G:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/o0;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/o0;->y:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lqa3/o0;->x:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, Lqa3/o0;->z:I

    invoke-static {v2, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lqa3/o0;->x:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lqa3/o0;->E:Lqa3/n0;

    iget v1, v1, Lqa3/n0;->w:I

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lwa3/g;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lqa3/o0;->w:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/o0;->G:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/m0;->j()Lqa3/m0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 2

    invoke-virtual {p0}, Lqa3/o0;->d()I

    iget v0, p0, Lqa3/o0;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lqa3/o0;->y:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_0
    iget v0, p0, Lqa3/o0;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/o0;->z:I

    invoke-virtual {p1, v1, v0}, Lwa3/g;->m(II)V

    :cond_1
    iget v0, p0, Lqa3/o0;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lqa3/o0;->E:Lqa3/n0;

    iget v0, v0, Lqa3/n0;->w:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lwa3/g;->l(II)V

    :cond_2
    iget-object v0, p0, Lqa3/o0;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
