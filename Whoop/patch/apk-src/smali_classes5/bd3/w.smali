.class public Lbd3/w;
.super Lbd3/b;
.source "SourceFile"


# instance fields
.field public final d:Lkotlinx/serialization/json/JsonObject;

.field public final e:Lyc3/g;

.field public f:I

.field public g:Z


# direct methods
.method public synthetic constructor <init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;I)V
    .locals 1

    and-int/lit8 p4, p4, 0x4

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p3, v0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, v0}, Lbd3/w;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lyc3/g;)V

    return-void
.end method

.method public constructor <init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lyc3/g;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p3}, Lbd3/b;-><init>(Lad3/c;Ljava/lang/String;)V

    .line 3
    iput-object p2, p0, Lbd3/w;->d:Lkotlinx/serialization/json/JsonObject;

    .line 4
    iput-object p4, p0, Lbd3/w;->e:Lyc3/g;

    return-void
.end method


# virtual methods
.method public final beginStructure(Lyc3/g;)Lzc3/b;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/w;->e:Lyc3/g;

    if-ne p1, v0, :cond_1

    new-instance p1, Lbd3/w;

    invoke-virtual {p0}, Lbd3/b;->f()Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v2

    instance-of v3, v1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v3, :cond_0

    check-cast v1, Lkotlinx/serialization/json/JsonObject;

    iget-object v2, p0, Lbd3/b;->b:Ljava/lang/String;

    iget-object v3, p0, Lbd3/b;->a:Lad3/c;

    invoke-direct {p1, v3, v1, v2, v0}, Lbd3/w;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lyc3/g;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Expected "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lkotlinx/serialization/json/JsonObject;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " as the serialized body of "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " at element: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlinx/serialization/internal/NamedValueDecoder;->renderTagStack()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v0, v1, p1}, Lbd3/q;->d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_1
    invoke-super {p0, p1}, Lbd3/b;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object p1

    return-object p1
.end method

.method public decodeElementIndex(Lyc3/g;)I
    .locals 9

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    iget v0, p0, Lbd3/w;->f:I

    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result v1

    if-ge v0, v1, :cond_b

    iget v0, p0, Lbd3/w;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lbd3/w;->f:I

    invoke-virtual {p0, p1, v0}, Lkotlinx/serialization/internal/NamedValueDecoder;->getTag(Lyc3/g;I)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lbd3/w;->f:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    iput-boolean v3, p0, Lbd3/w;->g:Z

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0, p1, v1}, Lbd3/w;->k(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_1
    iget-object v4, p0, Lbd3/b;->c:Lad3/i;

    iget-boolean v4, v4, Lad3/i;->h:Z

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-interface {p1, v1}, Lyc3/g;->isElementOptional(I)Z

    move-result v4

    invoke-interface {p1, v1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v5

    const-string v6, "tag"

    if-eqz v4, :cond_3

    invoke-interface {v5}, Lyc3/g;->isNullable()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v7

    invoke-virtual {v7, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlinx/serialization/json/JsonElement;

    instance-of v7, v7, Lkotlinx/serialization/json/JsonNull;

    if-eqz v7, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v5}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v7

    sget-object v8, Lyc3/j;->a:Lyc3/j;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Lyc3/g;->isNullable()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v7

    invoke-virtual {v7, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlinx/serialization/json/JsonElement;

    instance-of v7, v7, Lkotlinx/serialization/json/JsonNull;

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v6

    invoke-virtual {v6, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    instance-of v6, v0, Lkotlinx/serialization/json/JsonPrimitive;

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    check-cast v0, Lkotlinx/serialization/json/JsonPrimitive;

    goto :goto_1

    :cond_5
    move-object v0, v7

    :goto_1
    if-eqz v0, :cond_6

    invoke-static {v0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v7

    :cond_6
    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lbd3/b;->a:Lad3/c;

    invoke-static {v5, v0, v7}, Lbd3/q;->n(Lyc3/g;Lad3/c;Ljava/lang/String;)I

    move-result v6

    iget-object v0, v0, Lad3/c;->a:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->f:Z

    if-nez v0, :cond_8

    invoke-interface {v5}, Lyc3/g;->isNullable()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_2

    :cond_8
    move v2, v3

    :goto_2
    const/4 v0, -0x3

    if-ne v6, v0, :cond_a

    if-nez v4, :cond_9

    if-eqz v2, :cond_a

    :cond_9
    invoke-virtual {p0, p1, v1}, Lbd3/w;->k(Lyc3/g;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_a
    :goto_3
    return v1

    :cond_b
    const/4 p1, -0x1

    return p1
.end method

.method public final decodeNotNullMark()Z
    .locals 1

    iget-boolean v0, p0, Lbd3/w;->g:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lbd3/b;->decodeNotNullMark()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    invoke-static {p1, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    return-object p1
.end method

.method public elementName(Lyc3/g;I)Ljava/lang/String;
    .locals 7

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/b;->a:Lad3/c;

    invoke-static {v0, p1}, Lbd3/q;->s(Lad3/c;Lyc3/g;)Lad3/v;

    move-result-object v1

    invoke-interface {p1, p2}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_1

    iget-object v3, p0, Lbd3/b;->c:Lad3/i;

    iget-boolean v3, v3, Lad3/i;->k:Z

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v3

    invoke-virtual {v3}, Lkotlinx/serialization/json/JsonObject;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v0, p1}, Lbd3/q;->k(Lad3/c;Lyc3/g;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v3

    invoke-virtual {v3}, Lkotlinx/serialization/json/JsonObject;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-nez v6, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, p2, :cond_2

    goto :goto_1

    :cond_4
    move-object v4, v5

    :goto_1
    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    return-object v4

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1, p1, v2}, Lad3/v;->a(Lyc3/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_6
    if-nez v5, :cond_7

    :goto_2
    return-object v2

    :cond_7
    return-object v5
.end method

.method public endStructure(Lyc3/g;)V
    .locals 3

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/b;->a:Lad3/c;

    invoke-static {v0, p1}, Lbd3/q;->p(Lad3/c;Lyc3/g;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v1

    instance-of v1, v1, Lyc3/d;

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {v0, p1}, Lbd3/q;->s(Lad3/c;Lyc3/g;)Lad3/v;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v2, p0, Lbd3/b;->c:Lad3/i;

    iget-boolean v2, v2, Lad3/i;->k:Z

    if-nez v2, :cond_1

    invoke-static {p1}, Lkotlinx/serialization/internal/JsonInternalDependenciesKt;->jsonCachedSerialNames(Lyc3/g;)Ljava/util/Set;

    move-result-object p1

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    invoke-static {v0, p1}, Lbd3/q;->k(Lad3/c;Lyc3/g;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlinx/serialization/internal/JsonInternalDependenciesKt;->jsonCachedSerialNames(Lyc3/g;)Ljava/util/Set;

    move-result-object v1

    iget-object v0, v0, Lad3/c;->c:Lad3/z;

    sget-object v2, Lbd3/q;->a:Lqt/e;

    invoke-virtual {v0, p1, v2}, Lad3/z;->l(Lyc3/g;Lqt/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_4

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    :cond_4
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object p1

    :goto_1
    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/serialization/json/JsonObject;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lbd3/b;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    const-string p1, "Encountered an unknown key \'"

    const-string v0, "\' at element: "

    invoke-static {p1, v1, v0}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/NamedValueDecoder;->renderTagStack()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys.\nJSON input: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/serialization/json/JsonObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, v0}, Lbd3/q;->r(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lbd3/q;->c(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_7
    :goto_3
    return-void
.end method

.method public bridge synthetic g()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    invoke-virtual {p0}, Lbd3/w;->j()Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    return-object v0
.end method

.method public j()Lkotlinx/serialization/json/JsonObject;
    .locals 1

    iget-object v0, p0, Lbd3/w;->d:Lkotlinx/serialization/json/JsonObject;

    return-object v0
.end method

.method public final k(Lyc3/g;I)Z
    .locals 1

    iget-object v0, p0, Lbd3/b;->a:Lad3/c;

    iget-object v0, v0, Lad3/c;->a:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->f:Z

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lyc3/g;->isElementOptional(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->isNullable()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lbd3/w;->g:Z

    return p1
.end method
