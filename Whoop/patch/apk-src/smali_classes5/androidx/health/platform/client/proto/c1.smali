.class public final Landroidx/health/platform/client/proto/c1;
.super Landroidx/health/platform/client/proto/d1;
.source "SourceFile"


# virtual methods
.method public final a(JLjava/lang/Object;)V
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/w0;

    check-cast p1, Landroidx/health/platform/client/proto/b;

    const/4 p2, 0x0

    iput-boolean p2, p1, Landroidx/health/platform/client/proto/b;->w:Z

    return-void
.end method

.method public final b(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    sget-object v0, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/w0;

    invoke-virtual {v0, p1, p2, p4}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/health/platform/client/proto/w0;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v2

    if-lez v0, :cond_1

    if-lez v2, :cond_1

    move-object v3, v1

    check-cast v3, Landroidx/health/platform/client/proto/b;

    iget-boolean v3, v3, Landroidx/health/platform/client/proto/b;->w:Z

    if-nez v3, :cond_0

    add-int/2addr v2, v0

    invoke-interface {v1, v2}, Landroidx/health/platform/client/proto/w0;->i(I)Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    :cond_0
    invoke-interface {v1, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-lez v0, :cond_2

    move-object p4, v1

    :cond_2
    invoke-static {p1, p2, p3, p4}, Landroidx/health/platform/client/proto/n3;->o(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
