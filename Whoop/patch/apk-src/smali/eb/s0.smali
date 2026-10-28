.class public final Leb/s0;
.super Leb/o0;
.source "SourceFile"


# instance fields
.field public final f:Leb/j1;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Leb/j1;Ljava/lang/String;)V
    .locals 2

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDestination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Leb/t0;

    invoke-static {v0}, Le93/b;->G(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Leb/o0;-><init>(Leb/i1;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Leb/s0;->h:Ljava/util/ArrayList;

    iput-object p1, p0, Leb/s0;->f:Leb/j1;

    iput-object p2, p0, Leb/s0;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g()Leb/r0;
    .locals 3

    invoke-super {p0}, Leb/o0;->a()Leb/n0;

    move-result-object v0

    check-cast v0, Leb/r0;

    const-string v1, "nodes"

    iget-object v2, p0, Leb/s0;->h:Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/n0;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Leb/r0;->p(Leb/n0;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Leb/s0;->g:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v0, p0, Leb/o0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must set a start destination route"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must set a start destination id"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {v0, v1}, Leb/r0;->v(Ljava/lang/String;)V

    return-object v0
.end method
