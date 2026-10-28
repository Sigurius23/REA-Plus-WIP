.class public final Landroidx/datastore/preferences/protobuf/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/b;
    .locals 2

    sget-object v0, Landroidx/datastore/preferences/protobuf/m1;->c:Landroidx/datastore/preferences/protobuf/l1;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/l1;->h(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/b0;

    check-cast v0, Landroidx/datastore/preferences/protobuf/b;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/b;->c()Z

    move-result v1

    if-nez v1, :cond_1

    check-cast v0, Landroidx/datastore/preferences/protobuf/x0;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x0;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/x0;->g(I)Landroidx/datastore/preferences/protobuf/x0;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/m1;->o(JLjava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method
