.class public final Li71/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li71/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000cJ=\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\"\u0008\u0008\u0000\u0010\u0011*\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Li71/a;",
        "Li71/g;",
        "",
        "indexPadding",
        "<init>",
        "(I)V",
        "",
        "Lk61/b;",
        "data",
        "Li71/h;",
        "position",
        "d",
        "(Ljava/util/List;Li71/h;)I",
        "start",
        "b",
        "(I)I",
        "c",
        "T",
        "Li71/d;",
        "offset",
        "a",
        "(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;",
        "I",
        "defaultStart",
        "Lb61/n;",
        "Lb61/n;",
        "pointSearcher",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lb61/n;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Li71/a;->a:I

    .line 3
    new-instance p1, Lb61/n;

    invoke-direct {p1}, Lb61/n;-><init>()V

    iput-object p1, p0, Li71/a;->c:Lb61/n;

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Li71/a;-><init>(I)V

    return-void
.end method

.method private final b(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method private final c(Ljava/util/List;Li71/h;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lk61/b;",
            ">;",
            "Li71/h;",
            ")I"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v0}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v1, v0

    check-cast v1, Lm83/d0;

    iget-object v3, v1, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm83/c0;

    iget-object v3, v1, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v3, Lk61/b;

    iget v1, v1, Lm83/c0;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk61/b;

    invoke-interface {v3}, Lk61/b;->a()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Li71/a;->c:Lb61/n;

    invoke-virtual {p2}, Li71/h;->b()J

    move-result-wide v2

    const/16 p2, 0x20

    shr-long/2addr v2, p2

    long-to-int p2, v2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {v1, p2, v0}, Lb61/n;->a(FLjava/util/List;)I

    move-result p2

    iget v0, p0, Li71/a;->a:I

    add-int/2addr p2, v0

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object p1

    invoke-static {p2, p1}, Le93/b;->o(ILi93/g;)I

    move-result p1

    return p1
.end method

.method private final d(Ljava/util/List;Li71/h;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lk61/b;",
            ">;",
            "Li71/h;",
            ")I"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object p1

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {p1}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    move-object v0, p1

    check-cast v0, Lm83/d0;

    iget-object v2, v0, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm83/c0;

    iget-object v2, v0, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v2, Lk61/b;

    iget v0, v0, Lm83/c0;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk61/b;

    invoke-interface {v2}, Lk61/b;->a()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Li71/a;->c:Lb61/n;

    invoke-virtual {p2}, Li71/h;->a()J

    move-result-wide v1

    const/16 p2, 0x20

    shr-long/2addr v1, p2

    long-to-int p2, v1

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {v0, p2, p1}, Lb61/n;->a(FLjava/util/List;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    iget p1, p0, Li71/a;->b:I

    :cond_3
    iget p2, p0, Li71/a;->a:I

    sub-int/2addr p1, p2

    invoke-direct {p0, p1}, Li71/a;->b(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public a(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lk61/b;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Li71/h;",
            "Li71/d;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    invoke-direct {p0, p1, p2}, Li71/a;->d(Ljava/util/List;Li71/h;)I

    move-result p3

    invoke-direct {p0, p1, p2}, Li71/a;->c(Ljava/util/List;Li71/h;)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    invoke-interface {p1, p3, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
