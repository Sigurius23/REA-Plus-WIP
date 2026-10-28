.class public final Led3/j;
.super Led3/m;
.source "SourceFile"


# instance fields
.field public k:I


# virtual methods
.method public final Q(J)Ljava/lang/String;
    .locals 0

    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string p2, "Packing only supports primitive number types. The actual reading is for string."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final T(Lyc3/g;I)J
    .locals 0

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 p1, 0x4c2c

    return-wide p1
.end method

.method public final beginStructure(Lyc3/g;)Lzc3/b;
    .locals 3

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/SerializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Packing only supports primitive number types. The input type however was a struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final decodeElementIndex(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Led3/m;->d:Led3/o;

    iget-boolean v0, p1, Led3/o;->d:Z

    if-nez v0, :cond_0

    iget-object p1, p1, Led3/o;->e:Ljava/lang/Object;

    check-cast p1, Led3/a;

    iget v0, p1, Led3/a;->b:I

    iget p1, p1, Led3/a;->c:I

    sub-int/2addr v0, p1

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget p1, p0, Led3/j;->k:I

    add-int/lit8 v0, p1, 0x1

    iput v0, p0, Led3/j;->k:I

    return p1
.end method
