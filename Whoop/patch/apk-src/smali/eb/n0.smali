.class public Leb/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic K:I


# instance fields
.field public final E:Ljava/util/ArrayList;

.field public final F:La0/g1;

.field public final G:Ljava/util/LinkedHashMap;

.field public H:I

.field public I:Ljava/lang/String;

.field public J:Ll83/p;

.field public final w:Ljava/lang/String;

.field public x:Leb/r0;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method

.method public constructor <init>(Leb/i1;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, Leb/j1;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Le93/b;->G(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/n0;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Leb/n0;->w:Ljava/lang/String;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Leb/n0;->E:Ljava/util/ArrayList;

    .line 4
    new-instance p1, La0/g1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, La0/g1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Leb/n0;->F:La0/g1;

    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Leb/f0;)V
    .locals 3

    const-string v0, "navDeepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/m0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Leb/m0;-><init>(Leb/f0;I)V

    iget-object v1, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    invoke-static {v1, v0}, Lpf/c;->G(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Leb/n0;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Deep link "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Leb/f0;->a:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " can\'t be used to open destination "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".\nFollowing required arguments are missing: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 6

    iget-object v0, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    if-nez p1, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "name"

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/l;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v4, v3, Leb/l;->c:Z

    if-eqz v4, :cond_1

    iget-object v4, v3, Leb/l;->d:Ljava/lang/Object;

    if-eqz v4, :cond_1

    iget-object v3, v3, Leb/l;->a:Leb/g1;

    invoke-virtual {v3, v1, v5, v4}, Leb/g1;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_5

    invoke-virtual {v1, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Leb/l;->a:Leb/g1;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, v0, Leb/l;->b:Z

    if-nez v0, :cond_3

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_3
    :try_start_0
    invoke-virtual {v3, v1, v2}, Leb/g1;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_4
    const-string p1, "Wrong argument type for \'"

    const-string v0, "\' in argument bundle. "

    invoke-static {p1, v2, v0}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v3}, Leb/g1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expected."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    return-object v1
.end method

.method public final d(Leb/n0;)[I
    .locals 7

    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    move-object v1, p0

    :goto_0
    iget-object v2, v1, Leb/n0;->x:Leb/r0;

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    iget-object v4, p1, Leb/n0;->x:Leb/r0;

    goto :goto_1

    :cond_0
    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_1

    iget-object v4, p1, Leb/n0;->x:Leb/r0;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v5, v1, Leb/n0;->H:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v4, v3, v6}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v3

    if-ne v3, v1, :cond_1

    invoke-virtual {v0, v1}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    if-eqz v2, :cond_2

    iget v3, v2, Leb/r0;->M:I

    iget v4, v1, Leb/n0;->H:I

    if-eq v3, v4, :cond_3

    :cond_2
    invoke-virtual {v0, v1}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    :cond_3
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    if-nez v2, :cond_6

    :goto_2
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    iget v1, v1, Leb/n0;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v0}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object p1

    return-object p1

    :cond_6
    move-object v1, v2

    goto :goto_0
.end method

.method public final e(I)Leb/g;
    .locals 3

    iget-object v0, p0, Leb/n0;->F:La0/g1;

    invoke-virtual {v0}, La0/g1;->g()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/g;

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, Leb/n0;->x:Leb/r0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Leb/n0;->e(I)Leb/g;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v2

    :cond_2
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    instance-of v2, p1, Leb/n0;

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    check-cast p1, Leb/n0;

    iget-object v2, p1, Leb/n0;->F:La0/g1;

    iget-object v3, p1, Leb/n0;->G:Ljava/util/LinkedHashMap;

    iget-object v4, p1, Leb/n0;->E:Ljava/util/ArrayList;

    iget-object v5, p0, Leb/n0;->E:Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, p0, Leb/n0;->F:La0/g1;

    invoke-virtual {v5}, La0/g1;->g()I

    move-result v6

    invoke-virtual {v2}, La0/g1;->g()I

    move-result v7

    if-ne v6, v7, :cond_4

    new-instance v6, La0/h1;

    invoke-direct {v6, v5}, La0/h1;-><init>(La0/g1;)V

    invoke-static {v6}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v6

    check-cast v6, Lxb3/a;

    invoke-virtual {v6}, Lxb3/a;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v5, v7}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v7}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_0

    :cond_3
    move v2, v0

    goto :goto_1

    :cond_4
    :goto_0
    move v2, v1

    :goto_1
    iget-object v5, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v6

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v7

    if-ne v6, v7, :cond_6

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v5

    iget-object v5, v5, Lm83/r;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_5
    move v3, v0

    goto :goto_3

    :cond_6
    move v3, v1

    :goto_3
    iget v5, p0, Leb/n0;->H:I

    iget v6, p1, Leb/n0;->H:I

    if-ne v5, v6, :cond_7

    iget-object v5, p0, Leb/n0;->I:Ljava/lang/String;

    iget-object p1, p1, Leb/n0;->I:Ljava/lang/String;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    if-eqz v4, :cond_7

    if-eqz v2, :cond_7

    if-eqz v3, :cond_7

    :goto_4
    return v0

    :cond_7
    :goto_5
    return v1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Leb/n0;->y:Ljava/lang/String;

    if-nez v0, :cond_0

    iget v0, p0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 9

    iget v0, p0, Leb/n0;->H:I

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Leb/n0;->I:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    add-int/2addr v0, v2

    iget-object v2, p0, Leb/n0;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/f0;

    mul-int/lit8 v0, v0, 0x1f

    iget-object v5, v4, Leb/f0;->a:Ljava/lang/String;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_2

    :cond_1
    move v5, v3

    :goto_2
    add-int/2addr v0, v5

    mul-int/2addr v0, v1

    iget-object v5, v4, Leb/f0;->b:Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_3

    :cond_2
    move v5, v3

    :goto_3
    add-int/2addr v0, v5

    mul-int/2addr v0, v1

    iget-object v4, v4, Leb/f0;->c:Ljava/lang/String;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_4

    :cond_3
    move v4, v3

    :goto_4
    add-int/2addr v0, v4

    goto :goto_1

    :cond_4
    const-string v2, "<this>"

    iget-object v4, p0, Leb/n0;->F:La0/g1;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move v2, v3

    :goto_5
    invoke-virtual {v4}, La0/g1;->g()I

    move-result v5

    if-ge v2, v5, :cond_5

    const/4 v5, 0x1

    goto :goto_6

    :cond_5
    move v5, v3

    :goto_6
    if-eqz v5, :cond_9

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {v4, v2}, La0/g1;->h(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/g;

    mul-int/lit8 v0, v0, 0x1f

    iget v6, v2, Leb/g;->a:I

    add-int/2addr v0, v6

    mul-int/2addr v0, v1

    iget-object v6, v2, Leb/g;->b:Leb/x0;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Leb/x0;->hashCode()I

    move-result v6

    goto :goto_7

    :cond_6
    move v6, v3

    :goto_7
    add-int/2addr v0, v6

    iget-object v6, v2, Leb/g;->c:Landroid/os/Bundle;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v6

    if-eqz v6, :cond_8

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    mul-int/lit8 v0, v0, 0x1f

    iget-object v8, v2, Leb/g;->c:Landroid/os/Bundle;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v8, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_9

    :cond_7
    move v7, v3

    :goto_9
    add-int/2addr v0, v7

    goto :goto_8

    :cond_8
    move v2, v5

    goto :goto_5

    :cond_9
    iget-object v2, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    mul-int/lit8 v0, v0, 0x1f

    invoke-static {v0, v1, v5}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_b

    :cond_a
    move v5, v3

    :goto_b
    add-int/2addr v0, v5

    goto :goto_a

    :cond_b
    return v0
.end method

.method public j(Leb/k0;)Leb/l0;
    .locals 14

    const-string v0, "navDeepLinkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/n0;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v1, v2

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/f0;

    iget-object v4, p1, Leb/k0;->a:Landroid/net/Uri;

    iget-object v5, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    if-eqz v4, :cond_2

    invoke-virtual {v3, v4, v5}, Leb/f0;->d(Landroid/net/Uri;Ljava/util/LinkedHashMap;)Landroid/os/Bundle;

    move-result-object v6

    move-object v9, v6

    goto :goto_1

    :cond_2
    move-object v9, v2

    :goto_1
    invoke-virtual {v3, v4}, Leb/f0;->b(Landroid/net/Uri;)I

    move-result v11

    iget-object v6, p1, Leb/k0;->b:Ljava/lang/String;

    if-eqz v6, :cond_3

    iget-object v7, v3, Leb/f0;->b:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/4 v6, 0x1

    :goto_2
    move v12, v6

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    goto :goto_2

    :goto_3
    iget-object v6, p1, Leb/k0;->c:Ljava/lang/String;

    const/4 v7, -0x1

    if-eqz v6, :cond_6

    iget-object v8, v3, Leb/f0;->c:Ljava/lang/String;

    if-eqz v8, :cond_5

    iget-object v10, v3, Leb/f0;->o:Ll83/p;

    invoke-virtual {v10}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/regex/Pattern;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v10, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_4

    :cond_4
    new-instance v10, Leb/c0;

    invoke-direct {v10, v8}, Leb/c0;-><init>(Ljava/lang/String;)V

    new-instance v8, Leb/c0;

    invoke-direct {v8, v6}, Leb/c0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Leb/c0;->a(Leb/c0;)I

    move-result v6

    goto :goto_5

    :cond_5
    :goto_4
    move v6, v7

    :goto_5
    move v13, v6

    goto :goto_6

    :cond_6
    move v13, v7

    :goto_6
    if-nez v9, :cond_d

    if-nez v12, :cond_7

    if-le v13, v7, :cond_1

    :cond_7
    const-string v6, "arguments"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    if-nez v4, :cond_8

    goto :goto_8

    :cond_8
    iget-object v7, v3, Leb/f0;->f:Ll83/p;

    invoke-virtual {v7}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/regex/Pattern;

    if-eqz v7, :cond_9

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    goto :goto_7

    :cond_9
    move-object v7, v2

    :goto_7
    if-nez v7, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v3, v7, v6, v5}, Leb/f0;->e(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z

    iget-object v7, v3, Leb/f0;->g:Ll83/p;

    invoke-virtual {v7}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-virtual {v3, v4, v6, v5}, Leb/f0;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z

    :cond_c
    :goto_8
    new-instance v4, La0/a1;

    const/16 v7, 0x12

    invoke-direct {v4, v6, v7}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v5, v4}, Lpf/c;->G(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_d
    new-instance v7, Leb/l0;

    iget-boolean v10, v3, Leb/f0;->p:Z

    move-object v8, p0

    invoke-direct/range {v7 .. v13}, Leb/l0;-><init>(Leb/n0;Landroid/os/Bundle;ZIZI)V

    if-eqz v1, :cond_e

    invoke-virtual {v7, v1}, Leb/l0;->a(Leb/l0;)I

    move-result v3

    if-lez v3, :cond_1

    :cond_e
    move-object v1, v7

    goto/16 :goto_0

    :cond_f
    return-object v1
.end method

.method public final l(Ljava/lang/String;)Leb/l0;
    .locals 9

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/n0;->J:Ll83/p;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/f0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "android-app://androidx.navigation/"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->f(Landroid/net/Uri;)V

    iget-object v1, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, v1}, Leb/f0;->d(Landroid/net/Uri;Ljava/util/LinkedHashMap;)Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Leb/f0;->b(Landroid/net/Uri;)I

    move-result v6

    new-instance v2, Leb/l0;

    iget-boolean v5, v0, Leb/f0;->p:Z

    const/4 v7, 0x0

    const/4 v8, -0x1

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Leb/l0;-><init>(Leb/n0;Landroid/os/Bundle;ZIZI)V

    return-object v2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v1, Lfb/a;->e:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "context.resources.obtain\u2026s, R.styleable.Navigator)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Leb/n0;->o(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Leb/n0;->H:I

    const/4 v1, 0x0

    iput-object v1, p0, Leb/n0;->y:Ljava/lang/String;

    invoke-static {p1, v0}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Leb/n0;->y:Ljava/lang/String;

    :cond_0
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Leb/n0;->z:Ljava/lang/CharSequence;

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final n(ILeb/g;)V
    .locals 2

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Leb/b;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Leb/n0;->F:La0/g1;

    invoke-virtual {v0, p1, p2}, La0/g1;->f(ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot have an action with actionId 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot add action "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final o(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Leb/n0;->H:I

    iput-object v0, p0, Leb/n0;->y:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "android-app://androidx.navigation/"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "uriPattern"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Leb/f0;

    invoke-direct {v2, v1, v0, v0}, Leb/f0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Leb/m0;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Leb/m0;-><init>(Leb/f0;I)V

    iget-object v2, p0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    invoke-static {v2, v3}, Lpf/c;->G(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v2, La3/l0;

    const/4 v3, 0x7

    invoke-direct {v2, v1, v3}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    iput-object v2, p0, Leb/n0;->J:Ll83/p;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    iput v1, p0, Leb/n0;->H:I

    iput-object v0, p0, Leb/n0;->y:Ljava/lang/String;

    :goto_0
    iput-object p1, p0, Leb/n0;->I:Ljava/lang/String;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot set route \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" for destination "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Following required arguments are missing: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot have an empty route"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/n0;->y:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Leb/n0;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/n0;->I:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, " route="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/n0;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    iget-object v1, p0, Leb/n0;->z:Ljava/lang/CharSequence;

    if-eqz v1, :cond_3

    const-string v1, " label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/n0;->z:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
