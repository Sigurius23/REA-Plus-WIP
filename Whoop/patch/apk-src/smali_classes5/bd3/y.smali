.class public final Lbd3/y;
.super Lbd3/w;
.source "SourceFile"


# instance fields
.field public final h:Lkotlinx/serialization/json/JsonObject;

.field public final i:Ljava/util/List;

.field public final j:I

.field public k:I


# direct methods
.method public constructor <init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;)V
    .locals 2

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/16 v1, 0xc

    invoke-direct {p0, p1, p2, v0, v1}, Lbd3/w;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;I)V

    iput-object p2, p0, Lbd3/y;->h:Lkotlinx/serialization/json/JsonObject;

    invoke-virtual {p2}, Lkotlinx/serialization/json/JsonObject;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lbd3/y;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    iput p1, p0, Lbd3/y;->j:I

    const/4 p1, -0x1

    iput p1, p0, Lbd3/y;->k:I

    return-void
.end method


# virtual methods
.method public final decodeElementIndex(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lbd3/y;->k:I

    iget v0, p0, Lbd3/y;->j:I

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lbd3/y;->k:I

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final e(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lbd3/y;->k:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lbd3/y;->h:Lkotlinx/serialization/json/JsonObject;

    invoke-static {p1, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    return-object p1
.end method

.method public final elementName(Lyc3/g;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    div-int/lit8 p2, p2, 0x2

    iget-object p1, p0, Lbd3/y;->i:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final endStructure(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final g()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lbd3/y;->h:Lkotlinx/serialization/json/JsonObject;

    return-object v0
.end method

.method public final j()Lkotlinx/serialization/json/JsonObject;
    .locals 1

    iget-object v0, p0, Lbd3/y;->h:Lkotlinx/serialization/json/JsonObject;

    return-object v0
.end method
