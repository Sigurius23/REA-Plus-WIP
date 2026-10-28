.class public final Lyc3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyc3/g;
.implements Lkotlinx/serialization/internal/CachedNames;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lyc3/k;

.field public final c:I

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/HashSet;

.field public final f:[Ljava/lang/String;

.field public final g:[Lyc3/g;

.field public final h:[Ljava/util/List;

.field public final i:[Z

.field public final j:Ljava/util/Map;

.field public final k:[Lyc3/g;

.field public final l:Ll83/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V
    .locals 1

    const-string v0, "serialName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc3/h;->a:Ljava/lang/String;

    iput-object p2, p0, Lyc3/h;->b:Lyc3/k;

    iput p3, p0, Lyc3/h;->c:I

    iget-object p1, p5, Lyc3/a;->b:Ljava/util/List;

    iput-object p1, p0, Lyc3/h;->d:Ljava/util/List;

    iget-object p1, p5, Lyc3/a;->c:Ljava/util/ArrayList;

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljava/util/HashSet;

    const/16 v0, 0xc

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/HashSet;-><init>(I)V

    invoke-static {p1, p3}, Lm83/s;->A1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    iput-object p3, p0, Lyc3/h;->e:Ljava/util/HashSet;

    const/4 p3, 0x0

    new-array v0, p3, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lyc3/h;->f:[Ljava/lang/String;

    iget-object v0, p5, Lyc3/a;->e:Ljava/util/ArrayList;

    invoke-static {v0}, Lkotlinx/serialization/internal/Platform_commonKt;->compactArray(Ljava/util/List;)[Lyc3/g;

    move-result-object v0

    iput-object v0, p0, Lyc3/h;->g:[Lyc3/g;

    iget-object v0, p5, Lyc3/a;->f:Ljava/util/ArrayList;

    new-array p3, p3, [Ljava/util/List;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/util/List;

    iput-object p3, p0, Lyc3/h;->h:[Ljava/util/List;

    iget-object p3, p5, Lyc3/a;->g:Ljava/util/ArrayList;

    invoke-static {p3}, Lm83/s;->y1(Ljava/util/Collection;)[Z

    move-result-object p3

    iput-object p3, p0, Lyc3/h;->i:[Z

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lm83/q;

    new-instance p3, Lm83/p;

    const/4 p5, 0x0

    invoke-direct {p3, p1, p5}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    const/4 p1, 0x1

    invoke-direct {p2, p3, p1}, Lm83/q;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p2, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    move-object p3, p2

    check-cast p3, Lm83/d0;

    iget-object p5, p3, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-virtual {p3}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm83/c0;

    iget-object p5, p3, Lm83/c0;->b:Ljava/lang/Object;

    iget p3, p3, Lm83/c0;->a:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance v0, Ll83/k;

    invoke-direct {v0, p5, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lyc3/h;->j:Ljava/util/Map;

    invoke-static {p4}, Lkotlinx/serialization/internal/Platform_commonKt;->compactArray(Ljava/util/List;)[Lyc3/g;

    move-result-object p1

    iput-object p1, p0, Lyc3/h;->k:[Lyc3/g;

    new-instance p1, Lm83/p;

    const/16 p2, 0x1b

    invoke-direct {p1, p0, p2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lyc3/h;->l:Ll83/p;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p0, p1, :cond_0

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lyc3/h;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p1

    check-cast v0, Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lyc3/h;->a:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    check-cast p1, Lyc3/h;

    iget-object v2, p0, Lyc3/h;->k:[Lyc3/g;

    iget-object p1, p1, Lyc3/h;->k:[Lyc3/g;

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Lyc3/g;->getElementsCount()I

    move-result p1

    iget v2, p0, Lyc3/h;->c:I

    if-eq v2, p1, :cond_4

    goto :goto_1

    :cond_4
    move p1, v1

    :goto_0
    if-ge p1, v2, :cond_7

    iget-object v3, p0, Lyc3/h;->g:[Lyc3/g;

    aget-object v4, v3, p1

    invoke-interface {v4}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, p1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v5

    invoke-interface {v5}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    aget-object v3, v3, p1

    invoke-interface {v3}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v3

    invoke-interface {v0, p1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v4

    invoke-interface {v4}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :goto_1
    return v1

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_7
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lyc3/h;->d:Ljava/util/List;

    return-object v0
.end method

.method public final getElementAnnotations(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lyc3/h;->h:[Ljava/util/List;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getElementDescriptor(I)Lyc3/g;
    .locals 1

    iget-object v0, p0, Lyc3/h;->g:[Lyc3/g;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getElementIndex(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyc3/h;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x3

    return p1
.end method

.method public final getElementName(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyc3/h;->f:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getElementsCount()I
    .locals 1

    iget v0, p0, Lyc3/h;->c:I

    return v0
.end method

.method public final getKind()Lyc3/k;
    .locals 1

    iget-object v0, p0, Lyc3/h;->b:Lyc3/k;

    return-object v0
.end method

.method public final getSerialName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyc3/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final getSerialNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lyc3/h;->e:Ljava/util/HashSet;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lyc3/h;->l:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final isElementOptional(I)Z
    .locals 1

    iget-object v0, p0, Lyc3/h;->i:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isNullable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt;->toStringImpl(Lyc3/g;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
