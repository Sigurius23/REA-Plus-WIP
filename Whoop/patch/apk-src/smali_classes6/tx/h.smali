.class public final Ltx/h;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# instance fields
.field public final a:Lb30/m;

.field public final b:Lj93/d;

.field public final c:Ljava/util/Map;

.field public final d:[Ltx/c;


# direct methods
.method public constructor <init>(Lb30/m;)V
    .locals 12

    iget-object v0, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lj93/d;

    iget-object v1, p1, Lb30/m;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v2, Lcom/squareup/wire/x;

    sget-object v3, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;)V

    iput-object p1, p0, Ltx/h;->a:Lb30/m;

    iput-object v0, p0, Ltx/h;->b:Lj93/d;

    iget-object p1, p1, Lb30/m;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Ltx/h;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Ltx/c;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ltx/c;

    iput-object p1, p0, Ltx/h;->d:[Ltx/c;

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p1, v3

    invoke-static {v4}, Ltx/h;->a(Ltx/c;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ltx/h;->d:[Ltx/c;

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p1

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, p1, v3

    invoke-static {v4}, Ltx/h;->a(Ltx/c;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Ltx/h;->d:[Ltx/c;

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, p1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p1

    move v4, v0

    :goto_2
    if-ge v4, v3, :cond_8

    aget-object v5, p1, v4

    invoke-static {v5}, Ltx/h;->a(Ltx/c;)Ljava/lang/String;

    move-result-object v6

    move-object v7, v5

    check-cast v7, Ltx/b;

    iget-object v8, v7, Ltx/b;->e:Ljava/lang/String;

    iget-object v7, v7, Ltx/b;->g:Ljava/lang/String;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    move-object v8, v7

    goto :goto_4

    :cond_2
    invoke-static {v5}, Ltx/h;->a(Ltx/c;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_4

    :cond_3
    const-string v6, "string"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    move v6, v0

    move v9, v6

    :goto_3
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v6, v10, :cond_6

    invoke-virtual {v7, v6}, Ljava/lang/String;->codePointAt(I)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v11

    add-int/2addr v6, v11

    const/16 v11, 0x5f

    if-ne v10, v11, :cond_4

    const/4 v9, 0x1

    goto :goto_3

    :cond_4
    if-eqz v9, :cond_5

    const/16 v9, 0x61

    if-gt v9, v10, :cond_5

    const/16 v9, 0x7b

    if-ge v10, v9, :cond_5

    add-int/lit8 v10, v10, -0x20

    :cond_5
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    move v9, v0

    goto :goto_3

    :cond_6
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v6, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Ltx/h;->a(Ltx/c;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    return-void
.end method

.method public static a(Ltx/c;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ltx/b;

    iget-object v0, p0, Ltx/b;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    iget-object p0, p0, Ltx/b;->g:Ljava/lang/String;

    return-object p0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 8

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltx/h;->a:Lb30/m;

    iget-object v0, v0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Lr5/c;

    invoke-virtual {v0}, Lr5/c;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/j;

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_3

    iget-object v4, p0, Ltx/h;->c:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltx/c;

    if-eqz v4, :cond_2

    :try_start_0
    move-object v5, v4

    check-cast v5, Ltx/b;

    iget-object v5, v5, Ltx/b;->i:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_1

    iget-object v5, v4, Ltx/c;->a:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/squareup/wire/q;

    goto :goto_2

    :cond_1
    move-object v5, v4

    check-cast v5, Ltx/b;

    sget-object v6, Lcom/squareup/wire/q;->Companion:Lcom/squareup/wire/p;

    iget-object v7, v5, Ltx/b;->j:Ljava/lang/String;

    iget-object v5, v5, Ltx/b;->c:Ljava/lang/ClassLoader;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v5}, Lcom/squareup/wire/p;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/q;

    move-result-object v5

    :goto_2
    invoke-virtual {v5, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v0, v5}, Ltx/c;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v4

    goto :goto_3

    :cond_2
    iget-object v4, p1, Lcom/squareup/wire/r;->h:Lcom/squareup/wire/d;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/squareup/wire/d;->a()Lcom/squareup/wire/q;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v3, v4, v5}, Lb30/m;->o(Lcom/squareup/wire/j;ILcom/squareup/wire/d;Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_3
    iget v4, v4, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    sget-object v5, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    invoke-static {v0, v3, v5, v4}, Lb30/m;->o(Lcom/squareup/wire/j;ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    invoke-virtual {v0}, Lcom/squareup/wire/j;->a()Lcom/squareup/wire/l;

    move-result-object p1

    return-object p1
.end method

.method public final encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Ltx/h;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltx/c;

    .line 2
    invoke-virtual {v1, p2}, Ltx/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v3, v1, Ltx/c;->a:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/wire/q;

    .line 4
    check-cast v1, Ltx/b;

    .line 5
    iget v1, v1, Ltx/b;->h:I

    .line 6
    invoke-virtual {v3, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Ltx/h;->a:Lb30/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    check-cast p2, Lcom/squareup/wire/l;

    .line 9
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    .line 10
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public final encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Ltx/h;->a:Lb30/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    move-object v0, p2

    check-cast v0, Lcom/squareup/wire/l;

    .line 13
    invoke-virtual {v0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 15
    iget-object v0, p0, Ltx/h;->d:[Ltx/c;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    :goto_0
    const/4 v2, -0x1

    if-ge v2, v1, :cond_1

    .line 16
    aget-object v2, v0, v1

    .line 17
    invoke-virtual {v2, p2}, Ltx/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 18
    :cond_0
    iget-object v4, v2, Ltx/c;->a:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/squareup/wire/q;

    .line 19
    check-cast v2, Ltx/b;

    .line 20
    iget v2, v2, Ltx/b;->h:I

    .line 21
    invoke-virtual {v4, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final encodedSize(Ljava/lang/Object;)I
    .locals 6

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltx/h;->a:Lb30/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p1

    check-cast v0, Lcom/squareup/wire/l;

    invoke-virtual {v0}, Lcom/squareup/wire/l;->getCachedSerializedSize$wire_runtime()I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    :cond_0
    iget-object v1, p0, Ltx/h;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltx/c;

    invoke-virtual {v3, p1}, Ltx/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v5, v3, Ltx/c;->a:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/squareup/wire/q;

    check-cast v3, Ltx/b;

    iget v3, v3, Ltx/b;->h:I

    invoke-virtual {v5, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p1

    invoke-virtual {p1}, Lne3/l;->d()I

    move-result p1

    add-int/2addr p1, v2

    invoke-virtual {v0, p1}, Lcom/squareup/wire/l;->setCachedSerializedSize$wire_runtime(I)V

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ltx/h;

    if-eqz v0, :cond_0

    check-cast p1, Ltx/h;

    iget-object p1, p1, Ltx/h;->b:Lj93/d;

    iget-object v0, p0, Ltx/h;->b:Lj93/d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ltx/h;->b:Lj93/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltx/h;->a:Lb30/m;

    iget-object p1, p1, Lb30/m;->y:Ljava/lang/Object;

    check-cast p1, Lr5/c;

    invoke-virtual {p1}, Lr5/c;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/squareup/wire/j;

    iget-object v0, p0, Ltx/h;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltx/c;

    move-object v3, v1

    check-cast v3, Ltx/b;

    iget-boolean v4, v3, Ltx/b;->k:Z

    if-eqz v4, :cond_2

    iget-object v4, v3, Ltx/b;->d:Lcom/squareup/wire/z;

    sget-object v5, Lcom/squareup/wire/z;->w:Lcom/squareup/wire/z;

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Field \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v3, Ltx/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/wire/q;->getType()Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is required and cannot be redacted."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object v4, v3, Ltx/b;->d:Lcom/squareup/wire/z;

    sget-object v5, Lcom/squareup/wire/q;->Companion:Lcom/squareup/wire/p;

    iget-object v6, v3, Ltx/b;->j:Ljava/lang/String;

    iget-object v7, v3, Ltx/b;->c:Ljava/lang/ClassLoader;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Lcom/squareup/wire/p;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/q;

    move-result-object v6

    invoke-virtual {v6}, Lcom/squareup/wire/q;->getType()Lj93/d;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v6}, Ljc/x;->T(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    :cond_3
    const-class v6, Lcom/squareup/wire/l;

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    iget-boolean v6, v3, Ltx/b;->k:Z

    if-nez v6, :cond_5

    if-eqz v2, :cond_4

    invoke-virtual {v4}, Lcom/squareup/wire/z;->a()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v2, :cond_0

    invoke-virtual {v4}, Lcom/squareup/wire/z;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v3, p1}, Ltx/b;->c(Lcom/squareup/wire/j;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Ltx/b;->j:Ljava/lang/String;

    iget-object v3, v3, Ltx/b;->c:Ljava/lang/ClassLoader;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, Lcom/squareup/wire/p;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/q;

    move-result-object v3

    invoke-static {v2, v3}, Ls30/e;->a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;

    move-result-object v2

    check-cast v1, Ltx/b;

    iget-object v1, v1, Ltx/b;->l:Lkotlin/jvm/internal/m;

    invoke-interface {v1, p1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    :goto_2
    invoke-virtual {v3, p1}, Ltx/b;->c(Lcom/squareup/wire/j;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, v1, Ltx/c;->a:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/wire/q;

    invoke-virtual {v3, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v1, Ltx/b;

    iget-object v1, v1, Ltx/b;->l:Lkotlin/jvm/internal/m;

    invoke-interface {v1, p1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_6
    sget-object v0, Lne3/l;->E:Lne3/l;

    iput-object v0, p1, Lcom/squareup/wire/j;->a:Lne3/l;

    iget-object v0, p1, Lcom/squareup/wire/j;->b:Lne3/h;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lne3/h;->b()V

    iput-object v2, p1, Lcom/squareup/wire/j;->b:Lne3/h;

    :cond_7
    iput-object v2, p1, Lcom/squareup/wire/j;->c:Lcom/squareup/wire/s;

    invoke-virtual {p1}, Lcom/squareup/wire/j;->a()Lcom/squareup/wire/l;

    move-result-object p1

    return-object p1
.end method

.method public final toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltx/h;->b:Lj93/d;

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltx/h;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltx/c;

    invoke-virtual {v3, p1}, Ltx/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    check-cast v3, Ltx/b;

    iget-object v2, v3, Ltx/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-boolean v2, v3, Ltx/b;->k:Z

    if-eqz v2, :cond_2

    const-string v4, "\u2588\u2588"

    :cond_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    const/16 p1, 0x7d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
