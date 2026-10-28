.class public final Lcom/google/crypto/tink/shaded/protobuf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/l;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    iput-object p0, p1, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroidx/datastore/preferences/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/l;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/l;-><init>(Landroidx/datastore/preferences/protobuf/l;)V

    return-object v0
.end method

.method public static x(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static y(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final b()I
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    :goto_0
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final c(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/a1;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->c:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->f(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->c:I

    throw p1
.end method

.method public final d(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/a1;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v1

    iget v2, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    const/16 v3, 0x64

    if-ge v2, v3, :cond_0

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/l;->l(I)I

    move-result v1

    iget v2, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    invoke-interface {p2, p1, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->f(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/l;->a(I)V

    iget p1, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/l;->k(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ljava/util/List;)V
    .locals 3

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/d;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/d;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->m()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/d;->c(Z)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->m()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/d;->c(Z)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final f()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->w(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->p()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->f()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_2
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1
.end method

.method public final h(Ljava/util/List;)V
    .locals 6

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/n;

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/n;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->y(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->q()D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/n;->c(D)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->q()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n;->c(D)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->y(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->q()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->q()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final i(Ljava/util/List;)V
    .locals 3

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final j(Ljava/util/List;)V
    .locals 5

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    const/4 v1, 0x5

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->s()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_2
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->x(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int v4, v1, p1

    :cond_4
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->s()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v4, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_8
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_9
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->x(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final k(Ljava/util/List;)V
    .locals 6

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/i0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->y(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->t()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->y(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->t()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final l(Ljava/util/List;)V
    .locals 5

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/t;

    const/4 v1, 0x5

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/t;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->u()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->c(F)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_2
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->x(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int v4, v1, p1

    :cond_4
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->u()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->c(F)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v4, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->u()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_8
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_9
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->x(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->u()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 3

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 5

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/i0;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->w()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->w()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->w()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 5

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    const/4 v1, 0x5

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->x()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_2
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->x(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int v4, v1, p1

    :cond_4
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->x()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v4, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_8
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_9
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->x(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final p(Ljava/util/List;)V
    .locals 6

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/i0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->y(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->y()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->y()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->y(I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->y()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final q(Ljava/util/List;)V
    .locals 3

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->z()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->z()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->z()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->z()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final r(Ljava/util/List;)V
    .locals 5

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/i0;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->A()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->A()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->A()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->A()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final s(Ljava/util/List;Z)V
    .locals 4

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/e0;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->f()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->T0(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, p2, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->w(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->C()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->w(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->B()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_1
    return-void

    :cond_4
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v3, :cond_2

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_5
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1
.end method

.method public final t(Ljava/util/List;)V
    .locals 3

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final u(Ljava/util/List;)V
    .locals 5

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/i0;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result p1

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->F()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_1
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->F()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i0;->c(J)V

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->E()I

    move-result v0

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->F()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->v(I)V

    return-void

    :cond_6
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->F()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->d:I

    return-void
.end method

.method public final v(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->f()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final w(I)V
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->x:I

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;-><init>()V

    throw p1
.end method
