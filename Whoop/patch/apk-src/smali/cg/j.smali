.class public final Lcg/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg/d;


# instance fields
.field public final E:Lcg/g;

.field public final F:Lwe/o;

.field public G:Ltg/b;

.field public w:Lbg/l;

.field public x:Lbg/e;

.field public y:Ljava/lang/Integer;

.field public final z:Lbd3/k;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lbg/l;->c:Lbg/l;

    iput-object v0, p0, Lcg/j;->w:Lbg/l;

    new-instance v0, Lbg/c;

    const-string v1, ""

    invoke-direct {v0, v1}, Lbg/c;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcg/j;->x:Lbg/e;

    const/4 v0, 0x0

    iput-object v0, p0, Lcg/j;->y:Ljava/lang/Integer;

    new-instance v1, Lbd3/k;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lbd3/k;-><init>(I)V

    iput-object v1, p0, Lcg/j;->z:Lbd3/k;

    new-instance v1, Lcg/g;

    invoke-direct {v1}, Lcg/g;-><init>()V

    iput-object v1, p0, Lcg/j;->E:Lcg/g;

    new-instance v1, Lwe/o;

    invoke-direct {v1, v2}, Lwe/o;-><init>(I)V

    iput-object v1, p0, Lcg/j;->F:Lwe/o;

    iput-object v0, p0, Lcg/j;->G:Ltg/b;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcg/j;->c()Lcg/j;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcg/o;
    .locals 9

    new-instance v0, Lcg/o;

    iget-object v1, p0, Lcg/j;->w:Lbg/l;

    iget-object v2, p0, Lcg/j;->x:Lbg/e;

    iget-object v3, p0, Lcg/j;->y:Ljava/lang/Integer;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_0
    iget v3, v1, Lbg/l;->b:I

    :goto_0
    iget-object v4, p0, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v5, v4

    new-instance v4, Lcg/x;

    iget-object v6, v5, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    iget-boolean v5, v5, Lbd3/k;->b:Z

    invoke-direct {v4, v6, v5}, Lcg/x;-><init>(Ljava/util/List;Z)V

    iget-object v5, p0, Lcg/j;->E:Lcg/g;

    invoke-virtual {v5}, Lcg/g;->b()Lcg/i;

    move-result-object v5

    iget-object v6, p0, Lcg/j;->F:Lwe/o;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v7, v6

    new-instance v6, Lcg/y;

    iget-object v8, v7, Lwe/o;->w:Ljava/lang/Object;

    check-cast v8, Ltg/b;

    iget-object v7, v7, Lwe/o;->x:Ljava/lang/Object;

    check-cast v7, Ltg/b;

    invoke-direct {v6, v8, v7}, Lcg/y;-><init>(Ltg/b;Ltg/b;)V

    iget-object v7, p0, Lcg/j;->G:Ltg/b;

    invoke-direct/range {v0 .. v7}, Lcg/o;-><init>(Lbg/l;Lbg/e;ILcg/x;Lcg/i;Lcg/y;Ltg/b;)V

    return-object v0
.end method

.method public final c()Lcg/j;
    .locals 7

    new-instance v0, Lcg/j;

    invoke-direct {v0}, Lcg/j;-><init>()V

    iget-object v1, p0, Lcg/j;->w:Lbg/l;

    iput-object v1, v0, Lcg/j;->w:Lbg/l;

    iget-object v1, p0, Lcg/j;->x:Lbg/e;

    iput-object v1, v0, Lcg/j;->x:Lbg/e;

    iget-object v1, p0, Lcg/j;->y:Ljava/lang/Integer;

    iput-object v1, v0, Lcg/j;->y:Ljava/lang/Integer;

    iget-object v1, v0, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lcg/j;->z:Lbd3/k;

    const-string v3, "other"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->clear()V

    iget-object v5, v2, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-boolean v2, v2, Lbd3/k;->b:Z

    iput-boolean v2, v1, Lbd3/k;->b:Z

    iget-object v1, v0, Lcg/j;->E:Lcg/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lcg/j;->E:Lcg/g;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcg/g;->clear()V

    iget-object v4, v2, Lcg/g;->w:Lgf/m;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Lcg/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-boolean v2, v2, Lcg/g;->x:Z

    iput-boolean v2, v1, Lcg/g;->x:Z

    iget-object v1, v0, Lcg/j;->F:Lwe/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lcg/j;->F:Lwe/o;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lwe/o;->w:Ljava/lang/Object;

    check-cast v3, Ltg/b;

    iput-object v3, v1, Lwe/o;->w:Ljava/lang/Object;

    iget-object v2, v2, Lwe/o;->x:Ljava/lang/Object;

    check-cast v2, Ltg/b;

    iput-object v2, v1, Lwe/o;->x:Ljava/lang/Object;

    iget-object v1, p0, Lcg/j;->G:Ltg/b;

    iput-object v1, v0, Lcg/j;->G:Ltg/b;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcg/j;->x:Lbg/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcg/j;->y:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcg/j;->w:Lbg/l;

    iget v2, v2, Lbg/l;->b:I

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v2, :cond_1

    :goto_0
    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcg/j;->y:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
