.class public final Lcg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgf/m;


# instance fields
.field public final w:Lgf/m;

.field public x:Z

.field public final y:Lhf/h;

.field public final z:Lhf/h;


# direct methods
.method public constructor <init>()V
    .locals 11

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Lgf/s;

    invoke-direct {v1, v0}, Lgf/s;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcg/g;->w:Lgf/m;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcg/g;->x:Z

    sget-object v0, Lcg/a;->w:Lcg/a;

    new-instance v1, Landroidx/room/u;

    sget-object v4, Ltg/g;->j:Ltg/g;

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v2, 0x1

    move-object v3, v4

    const-class v4, Ltg/e;

    const-string v5, "encodableFromDecoded"

    const-string v6, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v4, v3

    sget-object v10, Lcg/b;->w:Lcg/b;

    new-instance v2, Landroidx/room/u;

    const/4 v8, 0x0

    const/4 v9, 0x3

    const/4 v3, 0x1

    const-class v5, Ltg/e;

    const-string v6, "encodableFromDecoded"

    const-string v7, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v2 .. v9}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {p0, v0, v1, v10, v2}, Lhg3/i;->t(Lgf/m;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;)Lhf/h;

    move-result-object v0

    iput-object v0, p0, Lcg/g;->y:Lhf/h;

    sget-object v0, Lcg/e;->w:Lcg/e;

    new-instance v2, Landroidx/room/u;

    const/4 v9, 0x4

    const-class v5, Ltg/e;

    const-string v6, "encodableFromEncoded"

    const-string v7, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v2 .. v9}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v1, v2

    sget-object v10, Lcg/f;->w:Lcg/f;

    new-instance v2, Landroidx/room/u;

    const/4 v9, 0x5

    const-class v5, Ltg/e;

    const-string v6, "encodableFromEncoded"

    const-string v7, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v2 .. v9}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {p0, v0, v1, v10, v2}, Lhg3/i;->t(Lgf/m;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;)Lhf/h;

    move-result-object v0

    iput-object v0, p0, Lcg/g;->z:Lhf/h;

    return-void
.end method


# virtual methods
.method public final bridge synthetic C(Ljava/lang/Object;Ljava/util/Collection;)Z
    .locals 0

    check-cast p1, Ltg/b;

    invoke-virtual {p0, p1, p2}, Lcg/g;->a(Ltg/b;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final H(Ljava/util/Map;)V
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1}, Lgf/m;->H(Ljava/util/Map;)V

    return-void
.end method

.method public final a(Ltg/b;Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1, p2}, Lgf/m;->C(Ljava/lang/Object;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final b()Lcg/i;
    .locals 3

    new-instance v0, Lcg/i;

    iget-object v1, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v1}, Lgf/m;->y()Lgf/k;

    move-result-object v1

    iget-boolean v2, p0, Lcg/g;->x:Z

    invoke-direct {v0, v1, v2}, Lcg/i;-><init>(Lgf/k;Z)V

    return-object v0
.end method

.method public final c(Lhf/h;Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p0}, Lcg/g;->clear()V

    const-string v0, "?"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Lcg/g;->x:Z

    invoke-static {p2, v0}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    const-string v0, "&"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p2, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "="

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1

    const/4 v7, 0x2

    if-ne v5, v7, :cond_0

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid query string segment "

    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string v2, ""

    :goto_1
    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    check-cast v3, Ljava/util/List;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-interface {p1, p2}, Lgf/m;->H(Ljava/util/Map;)V

    :cond_5
    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ltg/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ltg/b;

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p1}, Lkotlin/jvm/internal/m0;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/List;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lxb3/i;
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Lgf/m;->f()Lxb3/i;

    move-result-object v0

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Ltg/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ltg/b;

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ltg/b;

    check-cast p2, Ljava/util/List;

    .line 2
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 3
    check-cast p1, Ltg/b;

    check-cast p2, Ltg/b;

    .line 4
    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1, p2}, Lgf/m;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Ltg/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ltg/b;

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final y()Lgf/k;
    .locals 1

    iget-object v0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {v0}, Lgf/m;->y()Lgf/k;

    move-result-object v0

    return-object v0
.end method
