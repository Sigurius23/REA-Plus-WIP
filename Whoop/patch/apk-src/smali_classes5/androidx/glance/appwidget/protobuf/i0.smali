.class public final Landroidx/glance/appwidget/protobuf/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(JLjava/lang/Object;)Landroidx/glance/appwidget/protobuf/e0;
    .locals 2

    sget-object v0, Landroidx/glance/appwidget/protobuf/k1;->c:Landroidx/glance/appwidget/protobuf/j1;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/glance/appwidget/protobuf/j1;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/glance/appwidget/protobuf/e0;

    move-object v1, v0

    check-cast v1, Landroidx/glance/appwidget/protobuf/b;

    iget-boolean v1, v1, Landroidx/glance/appwidget/protobuf/b;->w:Z

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    :goto_0
    invoke-interface {v0, v1}, Landroidx/glance/appwidget/protobuf/e0;->i(I)Landroidx/glance/appwidget/protobuf/e0;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Landroidx/glance/appwidget/protobuf/k1;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method
