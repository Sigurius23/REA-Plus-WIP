.class public abstract Lwa3/l;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public x:Lwa3/j;

.field public y:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lwa3/k;-><init>()V

    sget-object v0, Lwa3/j;->c:Lwa3/j;

    iput-object v0, p0, Lwa3/l;->x:Lwa3/j;

    return-void
.end method


# virtual methods
.method public final j(Lwa3/m;)V
    .locals 4

    iget-boolean v0, p0, Lwa3/l;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lwa3/l;->x:Lwa3/j;

    invoke-virtual {v0}, Lwa3/j;->b()Lwa3/j;

    move-result-object v0

    iput-object v0, p0, Lwa3/l;->x:Lwa3/j;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwa3/l;->y:Z

    :cond_0
    iget-object v0, p0, Lwa3/l;->x:Lwa3/j;

    iget-object p1, p1, Lwa3/m;->w:Lwa3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p1, Lwa3/j;->a:Lwa3/a0;

    iget-object v3, v2, Lwa3/a0;->x:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    iget-object v2, v2, Lwa3/a0;->x:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-virtual {v0, v2}, Lwa3/j;->g(Ljava/util/Map$Entry;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lwa3/a0;->c()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-virtual {v0, v1}, Lwa3/j;->g(Ljava/util/Map$Entry;)V

    goto :goto_1

    :cond_2
    return-void
.end method
