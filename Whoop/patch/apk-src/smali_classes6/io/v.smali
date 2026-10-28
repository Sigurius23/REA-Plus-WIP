.class public Lio/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Lzr/g0;

.field public m:I

.field public n:Lzr/g0;

.field public o:I

.field public p:I

.field public q:I

.field public r:Lzr/g0;

.field public s:Lzr/g0;

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Lio/u;

.field public y:Lzr/j0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lio/v;->a:I

    iput v0, p0, Lio/v;->b:I

    iput v0, p0, Lio/v;->c:I

    iput v0, p0, Lio/v;->d:I

    iput v0, p0, Lio/v;->i:I

    iput v0, p0, Lio/v;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/v;->k:Z

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    iput-object v1, p0, Lio/v;->l:Lzr/g0;

    const/4 v2, 0x0

    iput v2, p0, Lio/v;->m:I

    iput-object v1, p0, Lio/v;->n:Lzr/g0;

    iput v2, p0, Lio/v;->o:I

    iput v0, p0, Lio/v;->p:I

    iput v0, p0, Lio/v;->q:I

    iput-object v1, p0, Lio/v;->r:Lzr/g0;

    iput-object v1, p0, Lio/v;->s:Lzr/g0;

    iput v2, p0, Lio/v;->t:I

    iput-boolean v2, p0, Lio/v;->u:Z

    iput-boolean v2, p0, Lio/v;->v:Z

    iput-boolean v2, p0, Lio/v;->w:Z

    sget-object v0, Lio/u;->x:Lio/u;

    iput-object v0, p0, Lio/v;->x:Lio/u;

    sget v0, Lzr/j0;->y:I

    sget-object v0, Lzr/c1;->J:Lzr/c1;

    iput-object v0, p0, Lio/v;->y:Lzr/j0;

    return-void
.end method


# virtual methods
.method public a()Lio/w;
    .locals 1

    new-instance v0, Lio/w;

    invoke-direct {v0, p0}, Lio/w;-><init>(Lio/v;)V

    return-object v0
.end method

.method public final b(Lio/w;)V
    .locals 1

    iget v0, p1, Lio/w;->w:I

    iput v0, p0, Lio/v;->a:I

    iget v0, p1, Lio/w;->x:I

    iput v0, p0, Lio/v;->b:I

    iget v0, p1, Lio/w;->y:I

    iput v0, p0, Lio/v;->c:I

    iget v0, p1, Lio/w;->z:I

    iput v0, p0, Lio/v;->d:I

    iget v0, p1, Lio/w;->E:I

    iput v0, p0, Lio/v;->e:I

    iget v0, p1, Lio/w;->F:I

    iput v0, p0, Lio/v;->f:I

    iget v0, p1, Lio/w;->G:I

    iput v0, p0, Lio/v;->g:I

    iget v0, p1, Lio/w;->H:I

    iput v0, p0, Lio/v;->h:I

    iget v0, p1, Lio/w;->I:I

    iput v0, p0, Lio/v;->i:I

    iget v0, p1, Lio/w;->J:I

    iput v0, p0, Lio/v;->j:I

    iget-boolean v0, p1, Lio/w;->K:Z

    iput-boolean v0, p0, Lio/v;->k:Z

    iget-object v0, p1, Lio/w;->L:Lzr/g0;

    iput-object v0, p0, Lio/v;->l:Lzr/g0;

    iget v0, p1, Lio/w;->M:I

    iput v0, p0, Lio/v;->m:I

    iget-object v0, p1, Lio/w;->N:Lzr/g0;

    iput-object v0, p0, Lio/v;->n:Lzr/g0;

    iget v0, p1, Lio/w;->O:I

    iput v0, p0, Lio/v;->o:I

    iget v0, p1, Lio/w;->P:I

    iput v0, p0, Lio/v;->p:I

    iget v0, p1, Lio/w;->Q:I

    iput v0, p0, Lio/v;->q:I

    iget-object v0, p1, Lio/w;->R:Lzr/g0;

    iput-object v0, p0, Lio/v;->r:Lzr/g0;

    iget-object v0, p1, Lio/w;->S:Lzr/g0;

    iput-object v0, p0, Lio/v;->s:Lzr/g0;

    iget v0, p1, Lio/w;->T:I

    iput v0, p0, Lio/v;->t:I

    iget-boolean v0, p1, Lio/w;->U:Z

    iput-boolean v0, p0, Lio/v;->u:Z

    iget-boolean v0, p1, Lio/w;->V:Z

    iput-boolean v0, p0, Lio/v;->v:Z

    iget-boolean v0, p1, Lio/w;->W:Z

    iput-boolean v0, p0, Lio/v;->w:Z

    iget-object v0, p1, Lio/w;->X:Lio/u;

    iput-object v0, p0, Lio/v;->x:Lio/u;

    iget-object p1, p1, Lio/w;->Y:Lzr/j0;

    iput-object p1, p0, Lio/v;->y:Lzr/j0;

    return-void
.end method

.method public c(Ljava/util/Set;)Lio/v;
    .locals 0

    invoke-static {p1}, Lzr/j0;->m(Ljava/util/Collection;)Lzr/j0;

    move-result-object p1

    iput-object p1, p0, Lio/v;->y:Lzr/j0;

    return-object p0
.end method

.method public d()V
    .locals 1

    const/16 v0, 0x2d0

    iput v0, p0, Lio/v;->a:I

    const/16 v0, 0x500

    iput v0, p0, Lio/v;->b:I

    return-void
.end method

.method public e()V
    .locals 1

    const/16 v0, 0x2d0

    iput v0, p0, Lio/v;->e:I

    const/16 v0, 0x500

    iput v0, p0, Lio/v;->f:I

    return-void
.end method

.method public f(II)Lio/v;
    .locals 0

    iput p1, p0, Lio/v;->i:I

    iput p2, p0, Lio/v;->j:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/v;->k:Z

    return-object p0
.end method
