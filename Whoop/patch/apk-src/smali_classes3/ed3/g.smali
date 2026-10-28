.class public final Led3/g;
.super Led3/m;
.source "SourceFile"


# instance fields
.field public k:Z


# virtual methods
.method public final beginStructure(Lyc3/g;)Lzc3/b;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v1, Lyc3/l;->a:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lyc3/l;->d:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    instance-of v0, v0, Lyc3/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlinx/serialization/SerializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be directly child of oneof element"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x4c2c

    cmp-long v2, v0, v2

    if-nez v2, :cond_2

    iget-object v2, p0, Led3/m;->e:Lyc3/g;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object p0

    :cond_2
    invoke-static {v0, v1}, Luf/c0;->Z(J)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Led3/m;

    iget-object v3, p0, Led3/m;->d:Led3/o;

    invoke-static {v3, v0, v1}, Lug/m;->k(Led3/o;J)Led3/o;

    move-result-object v0

    iget-object v1, p0, Led3/m;->c:Ldd3/a;

    invoke-direct {v2, v1, v0, p1}, Led3/m;-><init>(Ldd3/a;Led3/o;Lyc3/g;)V

    return-object v2

    :cond_3
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "An oneof element cannot be directly child of another oneof element"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final decodeElementIndex(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Led3/g;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Led3/g;->k:Z

    const/4 p1, 0x0

    return p1
.end method
