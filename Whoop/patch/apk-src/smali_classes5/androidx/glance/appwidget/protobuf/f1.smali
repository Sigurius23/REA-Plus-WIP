.class public final Landroidx/glance/appwidget/protobuf/f1;
.super Landroidx/glance/appwidget/protobuf/d1;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/Object;)Landroidx/glance/appwidget/protobuf/e1;
    .locals 2

    check-cast p1, Landroidx/glance/appwidget/protobuf/a0;

    iget-object v0, p1, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    sget-object v1, Landroidx/glance/appwidget/protobuf/e1;->f:Landroidx/glance/appwidget/protobuf/e1;

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroidx/glance/appwidget/protobuf/e1;->c()Landroidx/glance/appwidget/protobuf/e1;

    move-result-object v0

    iput-object v0, p1, Landroidx/glance/appwidget/protobuf/a0;->unknownFields:Landroidx/glance/appwidget/protobuf/e1;

    :cond_0
    return-object v0
.end method
