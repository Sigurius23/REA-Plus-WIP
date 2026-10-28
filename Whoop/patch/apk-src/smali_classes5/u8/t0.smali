.class public Lu8/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Z

.field public final i:Lzr/g0;

.field public final j:Lzr/g0;

.field public final k:Lzr/g0;

.field public final l:I

.field public final m:I

.field public final n:Lzr/g0;

.field public final o:Lu8/r0;

.field public final p:Lzr/g0;

.field public final q:Z

.field public final r:I

.field public final s:Lzr/b1;

.field public final t:Lzr/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu8/s0;

    invoke-direct {v0}, Lu8/s0;-><init>()V

    new-instance v1, Lu8/t0;

    invoke-direct {v1, v0}, Lu8/t0;-><init>(Lu8/s0;)V

    const/4 v0, 0x1

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x2

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x3

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x4

    invoke-static {v0}, Lx8/t;->F(I)V

    const/16 v0, 0x8

    const/16 v1, 0x9

    const/4 v2, 0x5

    const/4 v3, 0x6

    const/4 v4, 0x7

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/16 v0, 0xd

    const/16 v1, 0xe

    const/16 v2, 0xa

    const/16 v3, 0xb

    const/16 v4, 0xc

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/16 v0, 0x12

    const/16 v1, 0x13

    const/16 v2, 0xf

    const/16 v3, 0x10

    const/16 v4, 0x11

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/16 v0, 0x17

    const/16 v1, 0x18

    const/16 v2, 0x14

    const/16 v3, 0x15

    const/16 v4, 0x16

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/16 v0, 0x1c

    const/16 v1, 0x1d

    const/16 v2, 0x19

    const/16 v3, 0x1a

    const/16 v4, 0x1b

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/16 v0, 0x21

    const/16 v1, 0x22

    const/16 v2, 0x1e

    const/16 v3, 0x1f

    const/16 v4, 0x20

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    return-void
.end method

.method public constructor <init>(Lu8/s0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lu8/s0;->a:I

    iput v0, p0, Lu8/t0;->a:I

    iget v0, p1, Lu8/s0;->b:I

    iput v0, p0, Lu8/t0;->b:I

    iget v0, p1, Lu8/s0;->c:I

    iput v0, p0, Lu8/t0;->c:I

    iget v0, p1, Lu8/s0;->d:I

    iput v0, p0, Lu8/t0;->d:I

    iget v0, p1, Lu8/s0;->e:I

    iput v0, p0, Lu8/t0;->e:I

    iget v0, p1, Lu8/s0;->f:I

    iput v0, p0, Lu8/t0;->f:I

    iget-boolean v0, p1, Lu8/s0;->g:Z

    iput-boolean v0, p0, Lu8/t0;->g:Z

    iget-boolean v0, p1, Lu8/s0;->h:Z

    iput-boolean v0, p0, Lu8/t0;->h:Z

    iget-object v0, p1, Lu8/s0;->i:Lzr/g0;

    iput-object v0, p0, Lu8/t0;->i:Lzr/g0;

    iget-object v0, p1, Lu8/s0;->j:Lzr/g0;

    iput-object v0, p0, Lu8/t0;->j:Lzr/g0;

    iget-object v0, p1, Lu8/s0;->k:Lzr/g0;

    iput-object v0, p0, Lu8/t0;->k:Lzr/g0;

    iget v0, p1, Lu8/s0;->l:I

    iput v0, p0, Lu8/t0;->l:I

    iget v0, p1, Lu8/s0;->m:I

    iput v0, p0, Lu8/t0;->m:I

    iget-object v0, p1, Lu8/s0;->n:Lzr/g0;

    iput-object v0, p0, Lu8/t0;->n:Lzr/g0;

    iget-object v0, p1, Lu8/s0;->o:Lu8/r0;

    iput-object v0, p0, Lu8/t0;->o:Lu8/r0;

    iget-object v0, p1, Lu8/s0;->p:Lzr/g0;

    iput-object v0, p0, Lu8/t0;->p:Lzr/g0;

    iget-boolean v0, p1, Lu8/s0;->q:Z

    iput-boolean v0, p0, Lu8/t0;->q:Z

    iget v0, p1, Lu8/s0;->r:I

    iput v0, p0, Lu8/t0;->r:I

    iget-object v0, p1, Lu8/s0;->s:Ljava/util/HashMap;

    invoke-static {v0}, Lzr/b1;->a(Ljava/util/Map;)Lzr/b1;

    move-result-object v0

    iput-object v0, p0, Lu8/t0;->s:Lzr/b1;

    iget-object p1, p1, Lu8/s0;->t:Ljava/util/HashSet;

    invoke-static {p1}, Lzr/j0;->m(Ljava/util/Collection;)Lzr/j0;

    move-result-object p1

    iput-object p1, p0, Lu8/t0;->t:Lzr/j0;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lu8/t0;

    iget v0, p0, Lu8/t0;->a:I

    iget v1, p1, Lu8/t0;->a:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/t0;->b:I

    iget v1, p1, Lu8/t0;->b:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/t0;->c:I

    iget v1, p1, Lu8/t0;->c:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/t0;->d:I

    iget v1, p1, Lu8/t0;->d:I

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lu8/t0;->h:Z

    iget-boolean v1, p1, Lu8/t0;->h:Z

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/t0;->e:I

    iget v1, p1, Lu8/t0;->e:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/t0;->f:I

    iget v1, p1, Lu8/t0;->f:I

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lu8/t0;->g:Z

    iget-boolean v1, p1, Lu8/t0;->g:Z

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lu8/t0;->i:Lzr/g0;

    iget-object v1, p1, Lu8/t0;->i:Lzr/g0;

    invoke-virtual {v0, v1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/t0;->j:Lzr/g0;

    iget-object v1, p1, Lu8/t0;->j:Lzr/g0;

    invoke-virtual {v0, v1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/t0;->k:Lzr/g0;

    iget-object v1, p1, Lu8/t0;->k:Lzr/g0;

    invoke-virtual {v0, v1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lu8/t0;->l:I

    iget v1, p1, Lu8/t0;->l:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/t0;->m:I

    iget v1, p1, Lu8/t0;->m:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lu8/t0;->n:Lzr/g0;

    iget-object v1, p1, Lu8/t0;->n:Lzr/g0;

    invoke-virtual {v0, v1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/t0;->o:Lu8/r0;

    iget-object v1, p1, Lu8/t0;->o:Lu8/r0;

    invoke-virtual {v0, v1}, Lu8/r0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/t0;->p:Lzr/g0;

    iget-object v1, p1, Lu8/t0;->p:Lzr/g0;

    invoke-virtual {v0, v1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lu8/t0;->q:Z

    iget-boolean v1, p1, Lu8/t0;->q:Z

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/t0;->r:I

    iget v1, p1, Lu8/t0;->r:I

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Lu8/t0;->s:Lzr/b1;

    iget-object v1, p0, Lu8/t0;->s:Lzr/b1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, Lzr/q;->e(Ljava/lang/Object;Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/t0;->t:Lzr/j0;

    iget-object p1, p1, Lu8/t0;->t:Lzr/j0;

    invoke-virtual {v0, p1}, Lzr/j0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lu8/t0;->a:I

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Lu8/t0;->b:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lu8/t0;->c:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lu8/t0;->d:I

    add-int/2addr v0, v2

    const v2, 0x1b4d89f

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lu8/t0;->h:Z

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Lu8/t0;->e:I

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Lu8/t0;->f:I

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lu8/t0;->g:Z

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lu8/t0;->i:Lzr/g0;

    invoke-virtual {v3}, Lzr/g0;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lu8/t0;->j:Lzr/g0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/lit16 v0, v0, 0x3c1

    iget-object v3, p0, Lu8/t0;->k:Lzr/g0;

    invoke-virtual {v3}, Lzr/g0;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/lit16 v3, v3, 0x3c1

    iget v0, p0, Lu8/t0;->l:I

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget v0, p0, Lu8/t0;->m:I

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lu8/t0;->n:Lzr/g0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lu8/t0;->o:Lu8/r0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit16 v0, v0, 0x745f

    mul-int/2addr v0, v1

    iget-object v3, p0, Lu8/t0;->p:Lzr/g0;

    invoke-virtual {v3}, Lzr/g0;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/lit16 v3, v3, 0x3c1

    iget-boolean v0, p0, Lu8/t0;->q:Z

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget v0, p0, Lu8/t0;->r:I

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lu8/t0;->s:Lzr/b1;

    invoke-virtual {v0}, Lzr/b1;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lu8/t0;->t:Lzr/j0;

    invoke-virtual {v1}, Lzr/j0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
