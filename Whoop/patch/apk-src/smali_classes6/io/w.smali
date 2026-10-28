.class public Lio/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# instance fields
.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:I

.field public final K:Z

.field public final L:Lzr/g0;

.field public final M:I

.field public final N:Lzr/g0;

.field public final O:I

.field public final P:I

.field public final Q:I

.field public final R:Lzr/g0;

.field public final S:Lzr/g0;

.field public final T:I

.field public final U:Z

.field public final V:Z

.field public final W:Z

.field public final X:Lio/u;

.field public final Y:Lzr/j0;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/v;

    invoke-direct {v0}, Lio/v;-><init>()V

    return-void
.end method

.method public constructor <init>(Lio/v;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lio/v;->a:I

    iput v0, p0, Lio/w;->w:I

    iget v0, p1, Lio/v;->b:I

    iput v0, p0, Lio/w;->x:I

    iget v0, p1, Lio/v;->c:I

    iput v0, p0, Lio/w;->y:I

    iget v0, p1, Lio/v;->d:I

    iput v0, p0, Lio/w;->z:I

    iget v0, p1, Lio/v;->e:I

    iput v0, p0, Lio/w;->E:I

    iget v0, p1, Lio/v;->f:I

    iput v0, p0, Lio/w;->F:I

    iget v0, p1, Lio/v;->g:I

    iput v0, p0, Lio/w;->G:I

    iget v0, p1, Lio/v;->h:I

    iput v0, p0, Lio/w;->H:I

    iget v0, p1, Lio/v;->i:I

    iput v0, p0, Lio/w;->I:I

    iget v0, p1, Lio/v;->j:I

    iput v0, p0, Lio/w;->J:I

    iget-boolean v0, p1, Lio/v;->k:Z

    iput-boolean v0, p0, Lio/w;->K:Z

    iget-object v0, p1, Lio/v;->l:Lzr/g0;

    iput-object v0, p0, Lio/w;->L:Lzr/g0;

    iget v0, p1, Lio/v;->m:I

    iput v0, p0, Lio/w;->M:I

    iget-object v0, p1, Lio/v;->n:Lzr/g0;

    iput-object v0, p0, Lio/w;->N:Lzr/g0;

    iget v0, p1, Lio/v;->o:I

    iput v0, p0, Lio/w;->O:I

    iget v0, p1, Lio/v;->p:I

    iput v0, p0, Lio/w;->P:I

    iget v0, p1, Lio/v;->q:I

    iput v0, p0, Lio/w;->Q:I

    iget-object v0, p1, Lio/v;->r:Lzr/g0;

    iput-object v0, p0, Lio/w;->R:Lzr/g0;

    iget-object v0, p1, Lio/v;->s:Lzr/g0;

    iput-object v0, p0, Lio/w;->S:Lzr/g0;

    iget v0, p1, Lio/v;->t:I

    iput v0, p0, Lio/w;->T:I

    iget-boolean v0, p1, Lio/v;->u:Z

    iput-boolean v0, p0, Lio/w;->U:Z

    iget-boolean v0, p1, Lio/v;->v:Z

    iput-boolean v0, p0, Lio/w;->V:Z

    iget-boolean v0, p1, Lio/v;->w:Z

    iput-boolean v0, p0, Lio/w;->W:Z

    iget-object v0, p1, Lio/v;->x:Lio/u;

    iput-object v0, p0, Lio/w;->X:Lio/u;

    iget-object p1, p1, Lio/v;->y:Lzr/j0;

    iput-object p1, p0, Lio/w;->Y:Lzr/j0;

    return-void
.end method


# virtual methods
.method public a()Lio/v;
    .locals 1

    new-instance v0, Lio/v;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p0}, Lio/v;->b(Lio/w;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lio/w;

    iget v2, p0, Lio/w;->w:I

    iget v3, p1, Lio/w;->w:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->x:I

    iget v3, p1, Lio/w;->x:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->y:I

    iget v3, p1, Lio/w;->y:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->z:I

    iget v3, p1, Lio/w;->z:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->E:I

    iget v3, p1, Lio/w;->E:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->F:I

    iget v3, p1, Lio/w;->F:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->G:I

    iget v3, p1, Lio/w;->G:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->H:I

    iget v3, p1, Lio/w;->H:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lio/w;->K:Z

    iget-boolean v3, p1, Lio/w;->K:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->I:I

    iget v3, p1, Lio/w;->I:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->J:I

    iget v3, p1, Lio/w;->J:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/w;->L:Lzr/g0;

    iget-object v3, p1, Lio/w;->L:Lzr/g0;

    invoke-virtual {v2, v3}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lio/w;->M:I

    iget v3, p1, Lio/w;->M:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/w;->N:Lzr/g0;

    iget-object v3, p1, Lio/w;->N:Lzr/g0;

    invoke-virtual {v2, v3}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lio/w;->O:I

    iget v3, p1, Lio/w;->O:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->P:I

    iget v3, p1, Lio/w;->P:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/w;->Q:I

    iget v3, p1, Lio/w;->Q:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/w;->R:Lzr/g0;

    iget-object v3, p1, Lio/w;->R:Lzr/g0;

    invoke-virtual {v2, v3}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/w;->S:Lzr/g0;

    iget-object v3, p1, Lio/w;->S:Lzr/g0;

    invoke-virtual {v2, v3}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lio/w;->T:I

    iget v3, p1, Lio/w;->T:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lio/w;->U:Z

    iget-boolean v3, p1, Lio/w;->U:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lio/w;->V:Z

    iget-boolean v3, p1, Lio/w;->V:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lio/w;->W:Z

    iget-boolean v3, p1, Lio/w;->W:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/w;->X:Lio/u;

    iget-object v3, p1, Lio/w;->X:Lio/u;

    invoke-virtual {v2, v3}, Lio/u;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/w;->Y:Lzr/j0;

    iget-object p1, p1, Lio/w;->Y:Lzr/j0;

    invoke-virtual {v2, p1}, Lzr/j0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/w;->w:I

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->x:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->y:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->z:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->E:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->F:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->G:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->H:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/w;->K:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->I:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->J:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/w;->L:Lzr/g0;

    invoke-virtual {v2}, Lzr/g0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lio/w;->M:I

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/w;->N:Lzr/g0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->O:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->P:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->Q:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/w;->R:Lzr/g0;

    invoke-virtual {v2}, Lzr/g0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/w;->S:Lzr/g0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/w;->T:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/w;->U:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/w;->V:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/w;->W:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/w;->X:Lio/u;

    iget-object v2, v2, Lio/u;->w:Lzr/b1;

    invoke-virtual {v2}, Lzr/b1;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/w;->Y:Lzr/j0;

    invoke-virtual {v0}, Lzr/j0;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
