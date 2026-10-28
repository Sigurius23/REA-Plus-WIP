.class public final Lqa3/j1;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final E:Lqa3/j1;

.field public static final F:Lqa3/a;


# instance fields
.field public final w:Lwa3/e;

.field public x:Ljava/util/List;

.field public y:B

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/j1;->F:Lqa3/a;

    new-instance v0, Lqa3/j1;

    invoke-direct {v0}, Lqa3/j1;-><init>()V

    sput-object v0, Lqa3/j1;->E:Lqa3/j1;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/j1;->x:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/j1;->y:B

    .line 3
    iput v0, p0, Lqa3/j1;->z:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/j1;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/p;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/j1;->y:B

    .line 7
    iput v0, p0, Lqa3/j1;->z:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/j1;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/j1;->y:B

    .line 12
    iput v0, p0, Lqa3/j1;->z:I

    .line 13
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lqa3/j1;->x:Ljava/util/List;

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

    :cond_2
    if-eq v4, v1, :cond_3

    .line 18
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lqa3/j1;->x:Ljava/util/List;

    move v4, v1

    .line 19
    :cond_3
    iget-object v5, p0, Lqa3/j1;->x:Ljava/util/List;

    sget-object v6, Lqa3/i1;->L:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 20
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 22
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 23
    throw p2

    .line 24
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 25
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-ne v4, v1, :cond_4

    .line 26
    iget-object p2, p0, Lqa3/j1;->x:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/j1;->x:Ljava/util/List;

    .line 27
    :cond_4
    :try_start_2
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/j1;->w:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/j1;->w:Lwa3/e;

    .line 29
    throw p1

    .line 30
    :goto_4
    throw p1

    :cond_5
    if-ne v4, v1, :cond_6

    .line 31
    iget-object p1, p0, Lqa3/j1;->x:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/j1;->x:Ljava/util/List;

    .line 32
    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 33
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/j1;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/j1;->w:Lwa3/e;

    .line 34
    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-byte v0, p0, Lqa3/j1;->y:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    iput-byte v1, p0, Lqa3/j1;->y:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 2

    new-instance v0, Lqa3/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/p;-><init>(I)V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/p;->z:Ljava/util/List;

    invoke-virtual {v0, p0}, Lqa3/p;->n(Lqa3/j1;)V

    return-object v0
.end method

.method public final d()I
    .locals 4

    iget v0, p0, Lqa3/j1;->z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lqa3/j1;->x:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lqa3/j1;->x:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lwa3/g;->d(ILwa3/v;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lqa3/j1;->w:Lwa3/e;

    invoke-virtual {v0}, Lwa3/e;->size()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lqa3/j1;->z:I

    return v0
.end method

.method public final e()Lwa3/k;
    .locals 2

    new-instance v0, Lqa3/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/p;-><init>(I)V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/p;->z:Ljava/util/List;

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 3

    invoke-virtual {p0}, Lqa3/j1;->d()I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lqa3/j1;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lqa3/j1;->x:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqa3/j1;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final i()Lqa3/p;
    .locals 2

    new-instance v0, Lqa3/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/p;-><init>(I)V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/p;->z:Ljava/util/List;

    invoke-virtual {v0, p0}, Lqa3/p;->n(Lqa3/j1;)V

    return-object v0
.end method
