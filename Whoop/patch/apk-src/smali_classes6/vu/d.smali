.class public final Lvu/d;
.super Lcom/mapbox/bindgen/Value;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(D)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lvu/d;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lvu/d;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 5
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 8
    invoke-static {v2}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    .line 11
    iput-object p1, p0, Lvu/d;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvu/a;)V
    .locals 3

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    new-instance v1, Lcom/mapbox/bindgen/Value;

    iget-object v2, p1, Lvu/a;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object p1, p1, Lvu/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    .line 16
    const-string v0, "literal"

    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvu/d;

    iget-object p1, p1, Lvu/d;->a:Ljava/lang/Object;

    iput-object p1, p0, Lvu/d;->a:Ljava/lang/Object;

    :cond_0
    return-void
.end method
