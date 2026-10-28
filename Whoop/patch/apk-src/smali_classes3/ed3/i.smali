.class public final Led3/i;
.super Led3/m;
.source "SourceFile"


# instance fields
.field public final k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Ldd3/a;Led3/o;JLyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p5}, Led3/m;-><init>(Ldd3/a;Led3/o;Lyc3/g;)V

    iput-wide p3, p0, Led3/i;->k:J

    return-void
.end method


# virtual methods
.method public final Q(J)Ljava/lang/String;
    .locals 8

    const-wide/16 v0, 0x4c2d

    cmp-long v0, p1, v0

    if-nez v0, :cond_3

    iget-object p1, p0, Led3/m;->c:Ldd3/a;

    iget-object p1, p1, Ldd3/a;->a:Lcd3/f;

    iget-wide v0, p0, Led3/i;->k:J

    const-wide/32 v2, 0x7fffffff

    and-long v4, v0, v2

    long-to-int p2, v4

    const-string v4, "<this>"

    iget-object v5, p0, Led3/m;->e:Lyc3/g;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "serializersModule"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, p1}, Luf/c0;->N(Lyc3/g;Lcd3/f;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lyc3/g;

    const/4 v7, 0x0

    invoke-static {v6, v7}, Luf/c0;->K(Lyc3/g;I)J

    move-result-wide v6

    and-long/2addr v6, v2

    long-to-int v6, v6

    if-ne v6, p2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    check-cast v4, Lyc3/g;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v4, "Cannot find a subclass of "

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v5}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " annotated with @ProtoNumber("

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-long/2addr v0, v2

    long-to-int v0, v0

    const-string v1, ")."

    invoke-static {p2, v0, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-super {p0, p1, p2}, Led3/m;->Q(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final T(Lyc3/g;I)J
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const-wide/16 p1, 0x4c2d

    return-wide p1

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, Luf/c0;->K(Lyc3/g;I)J

    move-result-wide p1

    return-wide p1
.end method

.method public final beginStructure(Lyc3/g;)Lzc3/b;
    .locals 6

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Led3/m;->e:Lyc3/g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Led3/g;

    iget-object v1, p0, Led3/m;->c:Ldd3/a;

    iget-object v2, p0, Led3/m;->d:Led3/o;

    invoke-direct {v0, v1, v2, p1}, Led3/m;-><init>(Ldd3/a;Led3/o;Lyc3/g;)V

    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result v1

    const/4 v2, 0x1

    const-string v3, "Implementation of oneOf type "

    if-ne v1, v2, :cond_4

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Lyc3/g;->getElementAnnotations(I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ldd3/c;

    if-eqz v5, :cond_1

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldd3/c;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ldd3/c;->number()I

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " should have @ProtoNumber annotation"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " should contain only 1 element, but get "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final decodeElementIndex(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Led3/i;->l:Z

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iput-boolean v0, p0, Led3/i;->l:Z

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean p1, p0, Led3/i;->m:Z

    if-nez p1, :cond_1

    iput-boolean v0, p0, Led3/i;->m:Z

    return v0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method
