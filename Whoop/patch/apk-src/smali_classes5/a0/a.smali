.class public La0/a;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;I)V
    .locals 0

    iput p2, p0, La0/a;->w:I

    iput-object p1, p0, La0/a;->x:Ljava/util/Map;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, La0/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, La0/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/health/platform/client/proto/w2;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/health/platform/client/proto/w2;->g(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, La0/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/datastore/preferences/protobuf/b1;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/datastore/preferences/protobuf/b1;->h(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public clear()V
    .locals 1

    iget v0, p0, La0/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/health/platform/client/proto/w2;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/w2;->clear()V

    return-void

    :pswitch_1
    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/datastore/preferences/protobuf/b1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/b1;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, La0/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/health/platform/client/proto/w2;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/health/platform/client/proto/w2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/datastore/preferences/protobuf/b1;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_3

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p1, 0x1

    :goto_3
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, La0/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/datastore/preferences/protobuf/d1;

    iget-object v1, p0, La0/a;->x:Ljava/util/Map;

    check-cast v1, Landroidx/health/platform/client/proto/w2;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/d1;-><init>(Ljava/util/AbstractMap;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroidx/datastore/preferences/protobuf/d1;

    iget-object v1, p0, La0/a;->x:Ljava/util/Map;

    check-cast v1, Landroidx/datastore/preferences/protobuf/b1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/d1;-><init>(Ljava/util/AbstractMap;I)V

    return-object v0

    :pswitch_1
    new-instance v0, La0/d;

    iget-object v1, p0, La0/a;->x:Ljava/util/Map;

    check-cast v1, La0/g;

    invoke-direct {v0, v1}, La0/d;-><init>(La0/g;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, La0/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, La0/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/health/platform/client/proto/w2;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/health/platform/client/proto/w2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, La0/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/datastore/preferences/protobuf/b1;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/b1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    iget v0, p0, La0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/health/platform/client/proto/w2;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/w2;->size()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, Landroidx/datastore/preferences/protobuf/b1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/b1;->size()I

    move-result v0

    return v0

    :pswitch_1
    iget-object v0, p0, La0/a;->x:Ljava/util/Map;

    check-cast v0, La0/g;

    iget v0, v0, La0/f1;->y:I

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
