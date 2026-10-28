.class public Lu8/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Lzr/g0;

.field public j:Lzr/g0;

.field public k:Lzr/g0;

.field public l:I

.field public m:I

.field public n:Lzr/g0;

.field public o:Lu8/r0;

.field public p:Lzr/g0;

.field public q:Z

.field public r:I

.field public s:Ljava/util/HashMap;

.field public t:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lu8/s0;->a:I

    iput v0, p0, Lu8/s0;->b:I

    iput v0, p0, Lu8/s0;->c:I

    iput v0, p0, Lu8/s0;->d:I

    iput v0, p0, Lu8/s0;->e:I

    iput v0, p0, Lu8/s0;->f:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lu8/s0;->g:Z

    iput-boolean v1, p0, Lu8/s0;->h:Z

    sget-object v2, Lzr/g0;->x:Lzr/e0;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    iput-object v2, p0, Lu8/s0;->i:Lzr/g0;

    iput-object v2, p0, Lu8/s0;->j:Lzr/g0;

    iput-object v2, p0, Lu8/s0;->k:Lzr/g0;

    iput v0, p0, Lu8/s0;->l:I

    iput v0, p0, Lu8/s0;->m:I

    iput-object v2, p0, Lu8/s0;->n:Lzr/g0;

    sget-object v0, Lu8/r0;->a:Lu8/r0;

    iput-object v0, p0, Lu8/s0;->o:Lu8/r0;

    iput-object v2, p0, Lu8/s0;->p:Lzr/g0;

    iput-boolean v1, p0, Lu8/s0;->q:Z

    const/4 v0, 0x0

    iput v0, p0, Lu8/s0;->r:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu8/s0;->s:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lu8/s0;->t:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lu8/s0;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu8/q0;

    iget-object v1, v1, Lu8/q0;->a:Lu8/p0;

    iget v1, v1, Lu8/p0;->c:I

    if-ne v1, p1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b(Lu8/t0;)V
    .locals 2

    iget v0, p1, Lu8/t0;->a:I

    iput v0, p0, Lu8/s0;->a:I

    iget v0, p1, Lu8/t0;->b:I

    iput v0, p0, Lu8/s0;->b:I

    iget v0, p1, Lu8/t0;->c:I

    iput v0, p0, Lu8/s0;->c:I

    iget v0, p1, Lu8/t0;->d:I

    iput v0, p0, Lu8/s0;->d:I

    iget v0, p1, Lu8/t0;->e:I

    iput v0, p0, Lu8/s0;->e:I

    iget v0, p1, Lu8/t0;->f:I

    iput v0, p0, Lu8/s0;->f:I

    iget-boolean v0, p1, Lu8/t0;->g:Z

    iput-boolean v0, p0, Lu8/s0;->g:Z

    iget-boolean v0, p1, Lu8/t0;->h:Z

    iput-boolean v0, p0, Lu8/s0;->h:Z

    iget-object v0, p1, Lu8/t0;->i:Lzr/g0;

    iput-object v0, p0, Lu8/s0;->i:Lzr/g0;

    iget-object v0, p1, Lu8/t0;->j:Lzr/g0;

    iput-object v0, p0, Lu8/s0;->j:Lzr/g0;

    iget-object v0, p1, Lu8/t0;->k:Lzr/g0;

    iput-object v0, p0, Lu8/s0;->k:Lzr/g0;

    iget v0, p1, Lu8/t0;->l:I

    iput v0, p0, Lu8/s0;->l:I

    iget v0, p1, Lu8/t0;->m:I

    iput v0, p0, Lu8/s0;->m:I

    iget-object v0, p1, Lu8/t0;->n:Lzr/g0;

    iput-object v0, p0, Lu8/s0;->n:Lzr/g0;

    iget-object v0, p1, Lu8/t0;->o:Lu8/r0;

    iput-object v0, p0, Lu8/s0;->o:Lu8/r0;

    iget-object v0, p1, Lu8/t0;->p:Lzr/g0;

    iput-object v0, p0, Lu8/s0;->p:Lzr/g0;

    iget-boolean v0, p1, Lu8/t0;->q:Z

    iput-boolean v0, p0, Lu8/s0;->q:Z

    iget v0, p1, Lu8/t0;->r:I

    iput v0, p0, Lu8/s0;->r:I

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lu8/t0;->t:Lzr/j0;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lu8/s0;->t:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Lu8/t0;->s:Lzr/b1;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lu8/s0;->s:Ljava/util/HashMap;

    return-void
.end method

.method public varargs c([Ljava/lang/String;)Lu8/s0;
    .locals 5

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lx8/t;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lzr/d0;->f()Lzr/w0;

    move-result-object p1

    iput-object p1, p0, Lu8/s0;->p:Lzr/g0;

    iput-boolean v2, p0, Lu8/s0;->q:Z

    return-object p0
.end method
