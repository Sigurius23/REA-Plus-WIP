.class public final Lqa3/c1;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# static fields
.field public static final G:Lqa3/c1;

.field public static final H:Lqa3/a;


# instance fields
.field public E:B

.field public F:I

.field public final w:Lwa3/e;

.field public x:I

.field public y:Ljava/util/List;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/c1;->H:Lqa3/a;

    new-instance v0, Lqa3/c1;

    invoke-direct {v0}, Lqa3/c1;-><init>()V

    sput-object v0, Lqa3/c1;->G:Lqa3/c1;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/c1;->y:Ljava/util/List;

    const/4 v1, -0x1

    iput v1, v0, Lqa3/c1;->z:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lqa3/c1;->E:B

    .line 3
    iput v0, p0, Lqa3/c1;->F:I

    .line 4
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/c1;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/g;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lqa3/c1;->E:B

    .line 7
    iput v0, p0, Lqa3/c1;->F:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/c1;->w:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lqa3/c1;->E:B

    .line 12
    iput v0, p0, Lqa3/c1;->F:I

    .line 13
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lqa3/c1;->y:Ljava/util/List;

    .line 14
    iput v0, p0, Lqa3/c1;->z:I

    .line 15
    new-instance v0, Lwa3/d;

    invoke-direct {v0}, Lwa3/d;-><init>()V

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    if-nez v3, :cond_6

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lwa3/f;->o()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0xa

    if-eq v5, v6, :cond_3

    const/16 v6, 0x10

    if-eq v5, v6, :cond_2

    .line 18
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

    .line 19
    :cond_2
    iget v5, p0, Lqa3/c1;->x:I

    or-int/2addr v5, v1

    iput v5, p0, Lqa3/c1;->x:I

    .line 20
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v5

    .line 21
    iput v5, p0, Lqa3/c1;->z:I

    goto :goto_0

    :cond_3
    if-eq v4, v1, :cond_4

    .line 22
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lqa3/c1;->y:Ljava/util/List;

    move v4, v1

    .line 23
    :cond_4
    iget-object v5, p0, Lqa3/c1;->y:Ljava/util/List;

    sget-object v6, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {p1, v6, p2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 24
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 26
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 27
    throw p2

    .line 28
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 29
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-ne v4, v1, :cond_5

    .line 30
    iget-object p2, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lqa3/c1;->y:Ljava/util/List;

    .line 31
    :cond_5
    :try_start_2
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 32
    :catch_2
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/c1;->w:Lwa3/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/c1;->w:Lwa3/e;

    .line 33
    throw p1

    .line 34
    :goto_4
    throw p1

    :cond_6
    if-ne v4, v1, :cond_7

    .line 35
    iget-object p1, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lqa3/c1;->y:Ljava/util/List;

    .line 36
    :cond_7
    :try_start_3
    invoke-virtual {v2}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 37
    :catch_3
    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lqa3/c1;->w:Lwa3/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lwa3/d;->i()Lwa3/e;

    move-result-object p2

    iput-object p2, p0, Lqa3/c1;->w:Lwa3/e;

    .line 38
    throw p1
.end method

.method public static i(Lqa3/c1;)Lqa3/g;
    .locals 1

    invoke-static {}, Lqa3/g;->l()Lqa3/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/g;->o(Lqa3/c1;)V

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/c1;->E:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-virtual {v3}, Lqa3/w0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Lqa3/c1;->E:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iput-byte v1, p0, Lqa3/c1;->E:B

    return v1
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {p0}, Lqa3/c1;->i(Lqa3/c1;)Lqa3/g;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 4

    iget v0, p0, Lqa3/c1;->F:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    invoke-static {v3, v2}, Lwa3/g;->d(ILwa3/v;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lqa3/c1;->x:I

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    const/4 v0, 0x2

    iget v2, p0, Lqa3/c1;->z:I

    invoke-static {v0, v2}, Lwa3/g;->b(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_2
    iget-object v0, p0, Lqa3/c1;->w:Lwa3/e;

    invoke-virtual {v0}, Lwa3/e;->size()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lqa3/c1;->F:I

    return v0
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/g;->l()Lqa3/g;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 3

    invoke-virtual {p0}, Lqa3/c1;->d()I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    invoke-virtual {p1, v2, v1}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lqa3/c1;->x:I

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_1

    const/4 v0, 0x2

    iget v1, p0, Lqa3/c1;->z:I

    invoke-virtual {p1, v0, v1}, Lwa3/g;->m(II)V

    :cond_1
    iget-object v0, p0, Lqa3/c1;->w:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method
