.class public final Lg40/t2;
.super Lg40/a3;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/List;

.field public final c:Lg40/s2;

.field public final d:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lg40/s2;)V
    .locals 0

    invoke-direct {p0, p1}, Lg40/a3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object p2, p0, Lg40/t2;->b:Ljava/util/List;

    iput-object p3, p0, Lg40/t2;->c:Lg40/s2;

    check-cast p2, Ljava/lang/Iterable;

    instance-of p1, p2, Ljava/util/Collection;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg40/b3;

    invoke-interface {p2}, Lg40/y2;->d()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p3, 0x1

    :cond_2
    :goto_0
    iput-boolean p3, p0, Lg40/t2;->d:Z

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg40/t2;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/b3;

    invoke-virtual {v1, p1}, Lg40/b3;->b(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lg40/t2;->d:Z

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 4

    iget-object v0, p0, Lg40/t2;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/b3;

    invoke-virtual {v2}, Lg40/b3;->e()Lec3/f2;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v2, 0x0

    new-array v2, v2, [Lec3/l;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lec3/l;

    new-instance v2, Lg40/c;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v3}, Lg40/c;-><init>([Lec3/l;I)V

    move-object v0, v2

    :goto_1
    new-instance v2, Lg40/d;

    const/4 v3, 0x6

    invoke-direct {v2, v1, v3}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v1, Ln53/e;

    invoke-direct {v1, v0, v2}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    return-object v1
.end method

.method public final f()Lec3/f2;
    .locals 3

    iget-object v0, p0, Lg40/t2;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/b3;

    invoke-virtual {v2}, Lg40/b3;->f()Lec3/f2;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lec3/f2;

    return-object v0
.end method

.method public final h(Ljava/util/Map;)V
    .locals 2

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/t2;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/b3;

    invoke-virtual {v1, p1}, Lg40/b3;->h(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i()Lg40/z2;
    .locals 1

    iget-object v0, p0, Lg40/t2;->c:Lg40/s2;

    return-object v0
.end method
