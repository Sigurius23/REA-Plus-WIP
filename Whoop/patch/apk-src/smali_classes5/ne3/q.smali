.class public abstract Lne3/q;
.super Lne3/p;
.source "SourceFile"


# instance fields
.field public final y:Lne3/p;


# direct methods
.method public constructor <init>(Lne3/p;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/q;->y:Lne3/p;

    return-void
.end method


# virtual methods
.method public final J(Lne3/e0;)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->J(Lne3/e0;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/e0;

    const-string v2, "path"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/w;->k0(Ljava/util/List;)V

    return-object v0
.end method

.method public final a0(Lne3/e0;)Ln4/f;
    .locals 10

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->a0(Lne3/e0;)Ln4/f;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p1, Ln4/f;->d:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lne3/e0;

    if-nez v4, :cond_1

    return-object p1

    :cond_1
    iget-boolean v2, p1, Ln4/f;->b:Z

    iget-boolean v3, p1, Ln4/f;->c:Z

    iget-object v0, p1, Ln4/f;->e:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Long;

    iget-object v0, p1, Ln4/f;->f:Ljava/io/Serializable;

    move-object v6, v0

    check-cast v6, Ljava/lang/Long;

    iget-object v0, p1, Ln4/f;->g:Ljava/io/Serializable;

    move-object v7, v0

    check-cast v7, Ljava/lang/Long;

    iget-object v0, p1, Ln4/f;->h:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/lang/Long;

    iget-object p1, p1, Ln4/f;->i:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Ljava/util/Map;

    const-string p1, "extras"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln4/f;

    invoke-direct/range {v1 .. v9}, Ln4/f;-><init>(ZZLne3/e0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V

    return-object v1
.end method

.method public final b(Lne3/e0;)Lne3/n0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->b(Lne3/e0;)Lne3/n0;

    move-result-object p1

    return-object p1
.end method

.method public final b0(Lne3/e0;)Lne3/z;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->b0(Lne3/e0;)Lne3/z;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0}, Lne3/p;->close()V

    return-void
.end method

.method public final h(Lne3/e0;Lne3/e0;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1, p2}, Lne3/p;->h(Lne3/e0;Lne3/e0;)V

    return-void
.end method

.method public final k(Lne3/e0;)V
    .locals 1

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->k(Lne3/e0;)V

    return-void
.end method

.method public final m(Lne3/e0;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->m(Lne3/e0;)V

    return-void
.end method

.method public final o0(Lne3/e0;)Lne3/z;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->o0(Lne3/e0;)Lne3/z;

    move-result-object p1

    return-object p1
.end method

.method public p0(Lne3/e0;Z)Lne3/n0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1, p2}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x0(Lne3/e0;)Lne3/p0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/q;->y:Lne3/p;

    invoke-virtual {v0, p1}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object p1

    return-object p1
.end method
