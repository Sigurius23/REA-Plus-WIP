.class public abstract Landroidx/glance/appwidget/protobuf/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/Object;)Landroidx/glance/appwidget/protobuf/e1;
.end method

.method public final b(ILandroidx/glance/appwidget/protobuf/m;Ljava/lang/Object;)Z
    .locals 8

    iget v0, p2, Landroidx/glance/appwidget/protobuf/m;->b:I

    ushr-int/lit8 v1, v0, 0x3

    and-int/lit8 v0, v0, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x3

    if-eqz v0, :cond_a

    if-eq v0, v3, :cond_9

    const/4 v5, 0x2

    if-eq v0, v5, :cond_8

    if-eq v0, v4, :cond_2

    const/4 p1, 0x4

    if-eq v0, p1, :cond_1

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/glance/appwidget/protobuf/m;->v(I)V

    iget-object p2, p2, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/l;->w()I

    move-result p2

    check-cast p3, Landroidx/glance/appwidget/protobuf/e1;

    shl-int/lit8 v0, v1, 0x3

    or-int/2addr p1, v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    return v3

    :cond_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->c()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_1
    return v2

    :cond_2
    invoke-static {}, Landroidx/glance/appwidget/protobuf/e1;->c()Landroidx/glance/appwidget/protobuf/e1;

    move-result-object v0

    shl-int/2addr v1, v4

    or-int/lit8 v5, v1, 0x4

    add-int/2addr p1, v3

    const/16 v6, 0x64

    if-ge p1, v6, :cond_7

    :cond_3
    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/m;->a()I

    move-result v6

    const v7, 0x7fffffff

    if-eq v6, v7, :cond_4

    invoke-virtual {p0, p1, p2, v0}, Landroidx/glance/appwidget/protobuf/d1;->b(ILandroidx/glance/appwidget/protobuf/m;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_4
    iget p1, p2, Landroidx/glance/appwidget/protobuf/m;->b:I

    if-ne v5, p1, :cond_6

    iget-boolean p1, v0, Landroidx/glance/appwidget/protobuf/e1;->e:Z

    if-eqz p1, :cond_5

    iput-boolean v2, v0, Landroidx/glance/appwidget/protobuf/e1;->e:Z

    :cond_5
    check-cast p3, Landroidx/glance/appwidget/protobuf/e1;

    or-int/lit8 p1, v1, 0x3

    invoke-virtual {p3, p1, v0}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    return v3

    :cond_6
    new-instance p1, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    const-string p2, "Protocol message end-group tag did not match expected tag."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/m;->e()Landroidx/glance/appwidget/protobuf/i;

    move-result-object p1

    check-cast p3, Landroidx/glance/appwidget/protobuf/e1;

    shl-int/lit8 p2, v1, 0x3

    or-int/2addr p2, v5

    invoke-virtual {p3, p2, p1}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    return v3

    :cond_9
    invoke-virtual {p2, v3}, Landroidx/glance/appwidget/protobuf/m;->v(I)V

    iget-object p1, p2, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/l;->x()J

    move-result-wide p1

    check-cast p3, Landroidx/glance/appwidget/protobuf/e1;

    shl-int/lit8 v0, v1, 0x3

    or-int/2addr v0, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    return v3

    :cond_a
    invoke-virtual {p2, v2}, Landroidx/glance/appwidget/protobuf/m;->v(I)V

    iget-object p1, p2, Landroidx/glance/appwidget/protobuf/m;->a:Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/l;->A()J

    move-result-wide p1

    check-cast p3, Landroidx/glance/appwidget/protobuf/e1;

    shl-int/lit8 v0, v1, 0x3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    return v3
.end method
