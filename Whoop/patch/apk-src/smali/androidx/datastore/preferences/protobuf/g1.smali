.class public final Landroidx/datastore/preferences/protobuf/g1;
.super Landroidx/datastore/preferences/protobuf/e1;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/f1;
    .locals 5

    check-cast p1, Landroidx/datastore/preferences/protobuf/z;

    iget-object v0, p1, Landroidx/datastore/preferences/protobuf/z;->unknownFields:Landroidx/datastore/preferences/protobuf/f1;

    sget-object v1, Landroidx/datastore/preferences/protobuf/f1;->f:Landroidx/datastore/preferences/protobuf/f1;

    if-ne v0, v1, :cond_0

    new-instance v0, Landroidx/datastore/preferences/protobuf/f1;

    const/16 v1, 0x8

    new-array v2, v1, [I

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v2, v1, v3}, Landroidx/datastore/preferences/protobuf/f1;-><init>(I[I[Ljava/lang/Object;Z)V

    iput-object v0, p1, Landroidx/datastore/preferences/protobuf/z;->unknownFields:Landroidx/datastore/preferences/protobuf/f1;

    :cond_0
    return-object v0
.end method
