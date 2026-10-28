.class public final Landroidx/datastore/preferences/protobuf/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/l0;
    .locals 1

    check-cast p0, Landroidx/datastore/preferences/protobuf/l0;

    check-cast p1, Landroidx/datastore/preferences/protobuf/l0;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/l0;->w:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/l0;->b()Landroidx/datastore/preferences/protobuf/l0;

    move-result-object p0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/l0;->a()V

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/l0;->putAll(Ljava/util/Map;)V

    :cond_1
    return-object p0
.end method
