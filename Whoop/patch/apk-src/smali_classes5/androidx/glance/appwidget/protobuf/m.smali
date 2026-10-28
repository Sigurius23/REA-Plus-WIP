.class public final Landroidx/glance/appwidget/protobuf/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/glance/appwidget/protobuf/l;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Landroidx/glance/appwidget/protobuf/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    sget-object v0, Landroidx/glance/appwidget/protobuf/f0;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    iput-object p0, p1, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    return-void
.end method

.method public static w(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->f()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static x(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->f()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    :goto_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->c:I

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

.method public final b(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/b1;Landroidx/glance/appwidget/protobuf/s;)V
    .locals 2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->c:I

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Landroidx/glance/appwidget/protobuf/m;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Landroidx/glance/appwidget/protobuf/b1;->e(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m;Landroidx/glance/appwidget/protobuf/s;)V

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    iget p2, p0, Landroidx/glance/appwidget/protobuf/m;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->f()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->c:I

    throw p1
.end method

.method public final c(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/b1;Landroidx/glance/appwidget/protobuf/s;)V
    .locals 4

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v1

    iget v2, v0, Landroidx/glance/appwidget/protobuf/l;->a:I

    const/16 v3, 0x64

    if-ge v2, v3, :cond_0

    invoke-virtual {v0, v1}, Landroidx/glance/appwidget/protobuf/l;->q(I)I

    move-result v1

    iget v2, v0, Landroidx/glance/appwidget/protobuf/l;->a:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Landroidx/glance/appwidget/protobuf/l;->a:I

    invoke-interface {p2, p1, p0, p3}, Landroidx/glance/appwidget/protobuf/b1;->e(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m;Landroidx/glance/appwidget/protobuf/s;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/l;->e(I)V

    iget p1, v0, Landroidx/glance/appwidget/protobuf/l;->a:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v0, Landroidx/glance/appwidget/protobuf/l;->a:I

    invoke-virtual {v0, v1}, Landroidx/glance/appwidget/protobuf/l;->m(I)V

    return-void

    :cond_0
    new-instance p1, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 3

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/e;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/e;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->s()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/e;->c(Z)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->s()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/e;->c(Z)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->s()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->s()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final e()Landroidx/glance/appwidget/protobuf/i;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/m;->v(I)V

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->t()Landroidx/glance/appwidget/protobuf/h;

    move-result-object v0

    return-object v0
.end method

.method public final f(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/m;->e()Landroidx/glance/appwidget/protobuf/i;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final g(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 6

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/q;

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/q;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/m;->x(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->u()D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroidx/glance/appwidget/protobuf/q;->c(D)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->u()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/glance/appwidget/protobuf/q;->c(D)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Landroidx/glance/appwidget/protobuf/m;->x(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->u()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->u()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final h(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 3

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/b0;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/b0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final i(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 5

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/b0;

    const/4 v1, 0x5

    const/4 v2, 0x2

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/b0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->w()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/m;->w(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int v4, v1, p1

    :cond_4
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->w()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v4, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->w()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_8
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Landroidx/glance/appwidget/protobuf/m;->w(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->w()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final j(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 6

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/k0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/k0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/m;->x(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->x()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->x()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Landroidx/glance/appwidget/protobuf/m;->x(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->x()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final k(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 5

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/w;

    const/4 v1, 0x5

    const/4 v2, 0x2

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/w;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->y()F

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/w;->c(F)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/m;->w(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int v4, v1, p1

    :cond_4
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->y()F

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/w;->c(F)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v4, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->y()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_8
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Landroidx/glance/appwidget/protobuf/m;->w(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->y()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final l(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 3

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/b0;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/b0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->z()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->z()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->z()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->z()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final m(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 5

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/k0;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/k0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->A()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->A()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->A()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->A()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final n(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 5

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/b0;

    const/4 v1, 0x5

    const/4 v2, 0x2

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/b0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->B()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_2
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/m;->w(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int v4, v1, p1

    :cond_4
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->B()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v4, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->B()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_8
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Landroidx/glance/appwidget/protobuf/m;->w(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->B()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final o(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 6

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/k0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/k0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/m;->x(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->C()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->C()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Landroidx/glance/appwidget/protobuf/m;->x(I)V

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->C()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->C()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final p(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 3

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/b0;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/b0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->D()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->D()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->D()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->D()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final q(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 5

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/k0;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/k0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->E()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->E()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->E()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->E()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final r(Landroidx/glance/appwidget/protobuf/e0;Z)V
    .locals 3

    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    :cond_0
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz p2, :cond_1

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->v(I)V

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->G()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->v(I)V

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->F()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v2, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v2, :cond_0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_3
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final s(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 3

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/b0;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/b0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final t(Landroidx/glance/appwidget/protobuf/e0;)V
    .locals 5

    instance-of v0, p1, Landroidx/glance/appwidget/protobuf/k0;

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/glance/appwidget/protobuf/k0;

    iget p1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result p1

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->J()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->J()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroidx/glance/appwidget/protobuf/k0;->c(J)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void

    :cond_4
    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->I()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->J()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/m;->u(I)V

    return-void

    :cond_6
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->J()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_0
    return-void

    :cond_8
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/l;->H()I

    move-result v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Landroidx/glance/appwidget/protobuf/m;->d:I

    return-void
.end method

.method public final u(I)V
    .locals 1

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/l;->j()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->g()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final v(I)V
    .locals 1

    iget v0, p0, Landroidx/glance/appwidget/protobuf/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method
