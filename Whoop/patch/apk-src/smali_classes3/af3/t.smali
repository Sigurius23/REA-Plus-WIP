.class public abstract Laf3/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Laf3/t;

.field public b:Laf3/t;

.field public c:Laf3/t;

.field public d:Laf3/t;

.field public e:Laf3/t;

.field public f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Laf3/t;->a:Laf3/t;

    iput-object v0, p0, Laf3/t;->b:Laf3/t;

    iput-object v0, p0, Laf3/t;->c:Laf3/t;

    iput-object v0, p0, Laf3/t;->d:Laf3/t;

    iput-object v0, p0, Laf3/t;->e:Laf3/t;

    iput-object v0, p0, Laf3/t;->f:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public abstract a(Laf3/c0;)V
.end method

.method public final b(Laf3/y;)V
    .locals 1

    iget-object v0, p0, Laf3/t;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Laf3/t;->f:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Laf3/t;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Laf3/t;)V
    .locals 1

    invoke-virtual {p1}, Laf3/t;->j()V

    invoke-virtual {p1, p0}, Laf3/t;->g(Laf3/t;)V

    iget-object v0, p0, Laf3/t;->c:Laf3/t;

    if-eqz v0, :cond_0

    iput-object p1, v0, Laf3/t;->e:Laf3/t;

    iput-object v0, p1, Laf3/t;->d:Laf3/t;

    iput-object p1, p0, Laf3/t;->c:Laf3/t;

    return-void

    :cond_0
    iput-object p1, p0, Laf3/t;->b:Laf3/t;

    iput-object p1, p0, Laf3/t;->c:Laf3/t;

    return-void
.end method

.method public d()Laf3/t;
    .locals 1

    iget-object v0, p0, Laf3/t;->a:Laf3/t;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Laf3/t;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final f(Laf3/t;)V
    .locals 2

    invoke-virtual {p1}, Laf3/t;->j()V

    iget-object v0, p0, Laf3/t;->e:Laf3/t;

    iput-object v0, p1, Laf3/t;->e:Laf3/t;

    if-eqz v0, :cond_0

    iput-object p1, v0, Laf3/t;->d:Laf3/t;

    :cond_0
    iput-object p0, p1, Laf3/t;->d:Laf3/t;

    iput-object p1, p0, Laf3/t;->e:Laf3/t;

    iget-object v0, p0, Laf3/t;->a:Laf3/t;

    iput-object v0, p1, Laf3/t;->a:Laf3/t;

    iget-object v1, p1, Laf3/t;->e:Laf3/t;

    if-nez v1, :cond_1

    iput-object p1, v0, Laf3/t;->c:Laf3/t;

    :cond_1
    return-void
.end method

.method public g(Laf3/t;)V
    .locals 0

    iput-object p1, p0, Laf3/t;->a:Laf3/t;

    return-void
.end method

.method public final h(Ljava/util/List;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Laf3/t;->f:Ljava/util/ArrayList;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Laf3/t;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final j()V
    .locals 3

    iget-object v0, p0, Laf3/t;->d:Laf3/t;

    if-eqz v0, :cond_0

    iget-object v1, p0, Laf3/t;->e:Laf3/t;

    iput-object v1, v0, Laf3/t;->e:Laf3/t;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Laf3/t;->a:Laf3/t;

    if-eqz v1, :cond_1

    iget-object v2, p0, Laf3/t;->e:Laf3/t;

    iput-object v2, v1, Laf3/t;->b:Laf3/t;

    :cond_1
    :goto_0
    iget-object v1, p0, Laf3/t;->e:Laf3/t;

    if-eqz v1, :cond_2

    iput-object v0, v1, Laf3/t;->d:Laf3/t;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Laf3/t;->a:Laf3/t;

    if-eqz v1, :cond_3

    iput-object v0, v1, Laf3/t;->c:Laf3/t;

    :cond_3
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Laf3/t;->a:Laf3/t;

    iput-object v0, p0, Laf3/t;->e:Laf3/t;

    iput-object v0, p0, Laf3/t;->d:Laf3/t;

    return-void
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

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Laf3/t;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
