.class public Lvu/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvu/a;->a:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lvu/a;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Lvu/d;)V
    .locals 1

    const-string v0, "expression"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvu/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()Lvu/d;
    .locals 10

    iget-object v0, p0, Lvu/a;->a:Ljava/lang/String;

    const-string v1, "match"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lvu/a;

    invoke-direct {v0, v1}, Lvu/a;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lvu/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    const/4 v7, 0x0

    if-ltz v4, :cond_2

    check-cast v5, Lvu/d;

    rem-int/lit8 v8, v4, 0x2

    if-ne v8, v3, :cond_1

    if-eq v4, v2, :cond_1

    const-string v4, "<this>"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/util/List;

    if-eqz v4, :cond_1

    invoke-virtual {v5}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v4

    const-string v8, "null cannot be cast to non-null type kotlin.collections.List<com.mapbox.bindgen.Value>"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v8}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_0

    move-object v7, v8

    check-cast v7, Ljava/lang/String;

    :cond_0
    const-string v8, "literal"

    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-static {v4}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v4}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v4

    instance-of v7, v4, Ljava/util/List;

    if-eqz v7, :cond_1

    check-cast v4, Ljava/util/List;

    new-instance v5, Lvu/d;

    invoke-direct {v5, v4}, Lvu/d;-><init>(Ljava/util/List;)V

    :cond_1
    invoke-virtual {v0, v5}, Lvu/a;->a(Lvu/d;)V

    move v4, v6

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    throw v7

    :cond_3
    new-instance v1, Lvu/d;

    invoke-direct {v1, v0}, Lvu/d;-><init>(Lvu/a;)V

    return-object v1

    :cond_4
    new-instance v0, Lvu/d;

    invoke-direct {v0, p0}, Lvu/d;-><init>(Lvu/a;)V

    return-object v0
.end method

.method public final c(D)V
    .locals 1

    new-instance v0, Lvu/d;

    invoke-direct {v0, p1, p2}, Lvu/d;-><init>(D)V

    iget-object p1, p0, Lvu/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
