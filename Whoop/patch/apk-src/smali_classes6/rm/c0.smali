.class public final Lrm/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final g0:Lrm/c0;

.field public static final h0:Lqa/b;


# instance fields
.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:Ljava/lang/String;

.field public final J:Lin/c;

.field public final K:Ljava/lang/String;

.field public final L:Ljava/lang/String;

.field public final M:I

.field public final N:Ljava/util/List;

.field public final O:Lvm/c;

.field public final P:J

.field public final Q:I

.field public final R:I

.field public final S:F

.field public final T:I

.field public final U:F

.field public final V:[B

.field public final W:I

.field public final X:Lmo/b;

.field public final Y:I

.field public final Z:I

.field public final a0:I

.field public final b0:I

.field public final c0:I

.field public final d0:I

.field public final e0:I

.field public f0:I

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    sput-object v1, Lrm/c0;->g0:Lrm/c0;

    new-instance v0, Lqa/b;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lqa/b;-><init>(I)V

    sput-object v0, Lrm/c0;->h0:Lqa/b;

    return-void
.end method

.method public constructor <init>(Lrm/b0;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lrm/b0;->a:Ljava/lang/String;

    iput-object v0, p0, Lrm/c0;->w:Ljava/lang/String;

    iget-object v0, p1, Lrm/b0;->b:Ljava/lang/String;

    iput-object v0, p0, Lrm/c0;->x:Ljava/lang/String;

    iget-object v0, p1, Lrm/b0;->c:Ljava/lang/String;

    invoke-static {v0}, Llo/y;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lrm/c0;->y:Ljava/lang/String;

    iget v0, p1, Lrm/b0;->d:I

    iput v0, p0, Lrm/c0;->z:I

    iget v0, p1, Lrm/b0;->e:I

    iput v0, p0, Lrm/c0;->E:I

    iget v0, p1, Lrm/b0;->f:I

    iput v0, p0, Lrm/c0;->F:I

    iget v1, p1, Lrm/b0;->g:I

    iput v1, p0, Lrm/c0;->G:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    move v0, v1

    :cond_0
    iput v0, p0, Lrm/c0;->H:I

    iget-object v0, p1, Lrm/b0;->h:Ljava/lang/String;

    iput-object v0, p0, Lrm/c0;->I:Ljava/lang/String;

    iget-object v0, p1, Lrm/b0;->i:Lin/c;

    iput-object v0, p0, Lrm/c0;->J:Lin/c;

    iget-object v0, p1, Lrm/b0;->j:Ljava/lang/String;

    iput-object v0, p0, Lrm/c0;->K:Ljava/lang/String;

    iget-object v0, p1, Lrm/b0;->k:Ljava/lang/String;

    iput-object v0, p0, Lrm/c0;->L:Ljava/lang/String;

    iget v0, p1, Lrm/b0;->l:I

    iput v0, p0, Lrm/c0;->M:I

    iget-object v0, p1, Lrm/b0;->m:Ljava/util/List;

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_1
    iput-object v0, p0, Lrm/c0;->N:Ljava/util/List;

    iget-object v0, p1, Lrm/b0;->n:Lvm/c;

    iput-object v0, p0, Lrm/c0;->O:Lvm/c;

    iget-wide v3, p1, Lrm/b0;->o:J

    iput-wide v3, p0, Lrm/c0;->P:J

    iget v1, p1, Lrm/b0;->p:I

    iput v1, p0, Lrm/c0;->Q:I

    iget v1, p1, Lrm/b0;->q:I

    iput v1, p0, Lrm/c0;->R:I

    iget v1, p1, Lrm/b0;->r:F

    iput v1, p0, Lrm/c0;->S:F

    iget v1, p1, Lrm/b0;->s:I

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    move v1, v3

    :cond_2
    iput v1, p0, Lrm/c0;->T:I

    iget v1, p1, Lrm/b0;->t:F

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v4, v1, v4

    if-nez v4, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_3
    iput v1, p0, Lrm/c0;->U:F

    iget-object v1, p1, Lrm/b0;->u:[B

    iput-object v1, p0, Lrm/c0;->V:[B

    iget v1, p1, Lrm/b0;->v:I

    iput v1, p0, Lrm/c0;->W:I

    iget-object v1, p1, Lrm/b0;->w:Lmo/b;

    iput-object v1, p0, Lrm/c0;->X:Lmo/b;

    iget v1, p1, Lrm/b0;->x:I

    iput v1, p0, Lrm/c0;->Y:I

    iget v1, p1, Lrm/b0;->y:I

    iput v1, p0, Lrm/c0;->Z:I

    iget v1, p1, Lrm/b0;->z:I

    iput v1, p0, Lrm/c0;->a0:I

    iget v1, p1, Lrm/b0;->A:I

    if-ne v1, v2, :cond_4

    move v1, v3

    :cond_4
    iput v1, p0, Lrm/c0;->b0:I

    iget v1, p1, Lrm/b0;->B:I

    if-ne v1, v2, :cond_5

    goto :goto_0

    :cond_5
    move v3, v1

    :goto_0
    iput v3, p0, Lrm/c0;->c0:I

    iget v1, p1, Lrm/b0;->C:I

    iput v1, p0, Lrm/c0;->d0:I

    iget p1, p1, Lrm/b0;->D:I

    if-nez p1, :cond_6

    if-eqz v0, :cond_6

    const/4 p1, 0x1

    iput p1, p0, Lrm/c0;->e0:I

    return-void

    :cond_6
    iput p1, p0, Lrm/c0;->e0:I

    return-void
.end method


# virtual methods
.method public final a()Lrm/b0;
    .locals 3

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lrm/c0;->w:Ljava/lang/String;

    iput-object v1, v0, Lrm/b0;->a:Ljava/lang/String;

    iget-object v1, p0, Lrm/c0;->x:Ljava/lang/String;

    iput-object v1, v0, Lrm/b0;->b:Ljava/lang/String;

    iget-object v1, p0, Lrm/c0;->y:Ljava/lang/String;

    iput-object v1, v0, Lrm/b0;->c:Ljava/lang/String;

    iget v1, p0, Lrm/c0;->z:I

    iput v1, v0, Lrm/b0;->d:I

    iget v1, p0, Lrm/c0;->E:I

    iput v1, v0, Lrm/b0;->e:I

    iget v1, p0, Lrm/c0;->F:I

    iput v1, v0, Lrm/b0;->f:I

    iget v1, p0, Lrm/c0;->G:I

    iput v1, v0, Lrm/b0;->g:I

    iget-object v1, p0, Lrm/c0;->I:Ljava/lang/String;

    iput-object v1, v0, Lrm/b0;->h:Ljava/lang/String;

    iget-object v1, p0, Lrm/c0;->J:Lin/c;

    iput-object v1, v0, Lrm/b0;->i:Lin/c;

    iget-object v1, p0, Lrm/c0;->K:Ljava/lang/String;

    iput-object v1, v0, Lrm/b0;->j:Ljava/lang/String;

    iget-object v1, p0, Lrm/c0;->L:Ljava/lang/String;

    iput-object v1, v0, Lrm/b0;->k:Ljava/lang/String;

    iget v1, p0, Lrm/c0;->M:I

    iput v1, v0, Lrm/b0;->l:I

    iget-object v1, p0, Lrm/c0;->N:Ljava/util/List;

    iput-object v1, v0, Lrm/b0;->m:Ljava/util/List;

    iget-object v1, p0, Lrm/c0;->O:Lvm/c;

    iput-object v1, v0, Lrm/b0;->n:Lvm/c;

    iget-wide v1, p0, Lrm/c0;->P:J

    iput-wide v1, v0, Lrm/b0;->o:J

    iget v1, p0, Lrm/c0;->Q:I

    iput v1, v0, Lrm/b0;->p:I

    iget v1, p0, Lrm/c0;->R:I

    iput v1, v0, Lrm/b0;->q:I

    iget v1, p0, Lrm/c0;->S:F

    iput v1, v0, Lrm/b0;->r:F

    iget v1, p0, Lrm/c0;->T:I

    iput v1, v0, Lrm/b0;->s:I

    iget v1, p0, Lrm/c0;->U:F

    iput v1, v0, Lrm/b0;->t:F

    iget-object v1, p0, Lrm/c0;->V:[B

    iput-object v1, v0, Lrm/b0;->u:[B

    iget v1, p0, Lrm/c0;->W:I

    iput v1, v0, Lrm/b0;->v:I

    iget-object v1, p0, Lrm/c0;->X:Lmo/b;

    iput-object v1, v0, Lrm/b0;->w:Lmo/b;

    iget v1, p0, Lrm/c0;->Y:I

    iput v1, v0, Lrm/b0;->x:I

    iget v1, p0, Lrm/c0;->Z:I

    iput v1, v0, Lrm/b0;->y:I

    iget v1, p0, Lrm/c0;->a0:I

    iput v1, v0, Lrm/b0;->z:I

    iget v1, p0, Lrm/c0;->b0:I

    iput v1, v0, Lrm/b0;->A:I

    iget v1, p0, Lrm/c0;->c0:I

    iput v1, v0, Lrm/b0;->B:I

    iget v1, p0, Lrm/c0;->d0:I

    iput v1, v0, Lrm/b0;->C:I

    iget v1, p0, Lrm/c0;->e0:I

    iput v1, v0, Lrm/b0;->D:I

    return-object v0
.end method

.method public final b(Lrm/c0;)Z
    .locals 5

    iget-object v0, p0, Lrm/c0;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p1, Lrm/c0;->N:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    return v3

    :cond_0
    move v1, v3

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v4, p1, Lrm/c0;->N:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_1

    return v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final c(Lrm/c0;)Lrm/c0;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v2, v0, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v2}, Llo/m;->g(Ljava/lang/String;)I

    move-result v2

    iget-object v3, v1, Lrm/c0;->w:Ljava/lang/String;

    iget-object v4, v1, Lrm/c0;->J:Lin/c;

    iget-object v5, v1, Lrm/c0;->x:Ljava/lang/String;

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v5, v0, Lrm/c0;->x:Ljava/lang/String;

    :goto_0
    const/4 v6, 0x3

    const/4 v7, 0x1

    if-eq v2, v6, :cond_2

    if-ne v2, v7, :cond_3

    :cond_2
    iget-object v6, v1, Lrm/c0;->y:Ljava/lang/String;

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    iget-object v6, v0, Lrm/c0;->y:Ljava/lang/String;

    :goto_1
    const/4 v8, -0x1

    iget v9, v0, Lrm/c0;->F:I

    if-ne v9, v8, :cond_4

    iget v9, v1, Lrm/c0;->F:I

    :cond_4
    iget v10, v0, Lrm/c0;->G:I

    if-ne v10, v8, :cond_5

    iget v10, v1, Lrm/c0;->G:I

    :cond_5
    iget-object v8, v0, Lrm/c0;->I:Ljava/lang/String;

    if-nez v8, :cond_6

    iget-object v11, v1, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v2, v11}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Llo/y;->F(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    array-length v12, v12

    if-ne v12, v7, :cond_6

    move-object v8, v11

    :cond_6
    const/4 v7, 0x0

    iget-object v11, v0, Lrm/c0;->J:Lin/c;

    if-nez v11, :cond_7

    goto :goto_3

    :cond_7
    if-nez v4, :cond_8

    goto :goto_2

    :cond_8
    iget-object v4, v4, Lin/c;->w:[Lin/b;

    array-length v12, v4

    if-nez v12, :cond_9

    :goto_2
    move-object v4, v11

    goto :goto_3

    :cond_9
    new-instance v12, Lin/c;

    iget-object v11, v11, Lin/c;->w:[Lin/b;

    sget v13, Llo/y;->a:I

    array-length v13, v11

    array-length v14, v4

    add-int/2addr v13, v14

    invoke-static {v11, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v13

    array-length v11, v11

    array-length v14, v4

    invoke-static {v4, v7, v13, v11, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    check-cast v13, [Lin/b;

    invoke-direct {v12, v13}, Lin/c;-><init>([Lin/b;)V

    move-object v4, v12

    :goto_3
    const/high16 v11, -0x40800000    # -1.0f

    iget v12, v0, Lrm/c0;->S:F

    cmpl-float v11, v12, v11

    if-nez v11, :cond_a

    const/4 v11, 0x2

    if-ne v2, v11, :cond_a

    iget v12, v1, Lrm/c0;->S:F

    :cond_a
    iget v2, v0, Lrm/c0;->z:I

    iget v11, v1, Lrm/c0;->z:I

    or-int/2addr v2, v11

    iget v11, v0, Lrm/c0;->E:I

    iget v13, v1, Lrm/c0;->E:I

    or-int/2addr v11, v13

    iget-object v1, v1, Lrm/c0;->O:Lvm/c;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_c

    iget-object v15, v1, Lvm/c;->y:Ljava/lang/String;

    iget-object v1, v1, Lvm/c;->w:[Lvm/b;

    array-length v14, v1

    :goto_4
    if-ge v7, v14, :cond_d

    move-object/from16 v16, v1

    aget-object v1, v16, v7

    move/from16 v17, v7

    iget-object v7, v1, Lvm/b;->E:[B

    if-eqz v7, :cond_b

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v7, v17, 0x1

    move-object/from16 v1, v16

    goto :goto_4

    :cond_c
    const/4 v15, 0x0

    :cond_d
    iget-object v1, v0, Lrm/c0;->O:Lvm/c;

    if-eqz v1, :cond_12

    if-nez v15, :cond_e

    iget-object v15, v1, Lvm/c;->y:Ljava/lang/String;

    :cond_e
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v7

    iget-object v1, v1, Lvm/c;->w:[Lvm/b;

    array-length v14, v1

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v14, :cond_12

    move/from16 v16, v0

    aget-object v0, v1, v16

    move-object/from16 v17, v1

    iget-object v1, v0, Lvm/b;->E:[B

    if-eqz v1, :cond_11

    iget-object v1, v0, Lvm/b;->x:Ljava/util/UUID;

    move/from16 v18, v14

    const/4 v14, 0x0

    :goto_6
    if-ge v14, v7, :cond_10

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v20, v7

    move-object/from16 v7, v19

    check-cast v7, Lvm/b;

    iget-object v7, v7, Lvm/b;->x:Ljava/util/UUID;

    invoke-virtual {v7, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_7

    :cond_f
    add-int/lit8 v14, v14, 0x1

    move/from16 v7, v20

    goto :goto_6

    :cond_10
    move/from16 v20, v7

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_11
    move/from16 v20, v7

    move/from16 v18, v14

    :goto_7
    add-int/lit8 v0, v16, 0x1

    move-object/from16 v1, v17

    move/from16 v14, v18

    move/from16 v7, v20

    goto :goto_5

    :cond_12
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    const/4 v14, 0x0

    goto :goto_8

    :cond_13
    new-instance v14, Lvm/c;

    const/4 v0, 0x0

    new-array v1, v0, [Lvm/b;

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lvm/b;

    invoke-direct {v14, v15, v0, v1}, Lvm/c;-><init>(Ljava/lang/String;Z[Lvm/b;)V

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lrm/c0;->a()Lrm/b0;

    move-result-object v0

    iput-object v3, v0, Lrm/b0;->a:Ljava/lang/String;

    iput-object v5, v0, Lrm/b0;->b:Ljava/lang/String;

    iput-object v6, v0, Lrm/b0;->c:Ljava/lang/String;

    iput v2, v0, Lrm/b0;->d:I

    iput v11, v0, Lrm/b0;->e:I

    iput v9, v0, Lrm/b0;->f:I

    iput v10, v0, Lrm/b0;->g:I

    iput-object v8, v0, Lrm/b0;->h:Ljava/lang/String;

    iput-object v4, v0, Lrm/b0;->i:Lin/c;

    iput-object v14, v0, Lrm/b0;->n:Lvm/c;

    iput v12, v0, Lrm/b0;->r:F

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lrm/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lrm/c0;

    iget v2, p0, Lrm/c0;->f0:I

    if-eqz v2, :cond_2

    iget v3, p1, Lrm/c0;->f0:I

    if-eqz v3, :cond_2

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lrm/c0;->z:I

    iget v3, p1, Lrm/c0;->z:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->E:I

    iget v3, p1, Lrm/c0;->E:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->F:I

    iget v3, p1, Lrm/c0;->F:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->G:I

    iget v3, p1, Lrm/c0;->G:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->M:I

    iget v3, p1, Lrm/c0;->M:I

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Lrm/c0;->P:J

    iget-wide v4, p1, Lrm/c0;->P:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget v2, p0, Lrm/c0;->Q:I

    iget v3, p1, Lrm/c0;->Q:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->R:I

    iget v3, p1, Lrm/c0;->R:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->T:I

    iget v3, p1, Lrm/c0;->T:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->W:I

    iget v3, p1, Lrm/c0;->W:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->Y:I

    iget v3, p1, Lrm/c0;->Y:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->Z:I

    iget v3, p1, Lrm/c0;->Z:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->a0:I

    iget v3, p1, Lrm/c0;->a0:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->b0:I

    iget v3, p1, Lrm/c0;->b0:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->c0:I

    iget v3, p1, Lrm/c0;->c0:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->d0:I

    iget v3, p1, Lrm/c0;->d0:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->e0:I

    iget v3, p1, Lrm/c0;->e0:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lrm/c0;->S:F

    iget v3, p1, Lrm/c0;->S:F

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-nez v2, :cond_3

    iget v2, p0, Lrm/c0;->U:F

    iget v3, p1, Lrm/c0;->U:F

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lrm/c0;->w:Ljava/lang/String;

    iget-object v3, p1, Lrm/c0;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->x:Ljava/lang/String;

    iget-object v3, p1, Lrm/c0;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->I:Ljava/lang/String;

    iget-object v3, p1, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->K:Ljava/lang/String;

    iget-object v3, p1, Lrm/c0;->K:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->L:Ljava/lang/String;

    iget-object v3, p1, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->y:Ljava/lang/String;

    iget-object v3, p1, Lrm/c0;->y:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->V:[B

    iget-object v3, p1, Lrm/c0;->V:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->J:Lin/c;

    iget-object v3, p1, Lrm/c0;->J:Lin/c;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->X:Lmo/b;

    iget-object v3, p1, Lrm/c0;->X:Lmo/b;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lrm/c0;->O:Lvm/c;

    iget-object v3, p1, Lrm/c0;->O:Lvm/c;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, p1}, Lrm/c0;->b(Lrm/c0;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lrm/c0;->f0:I

    if-nez v0, :cond_7

    const/4 v0, 0x0

    iget-object v1, p0, Lrm/c0;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x20f

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lrm/c0;->x:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lrm/c0;->y:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget v1, p0, Lrm/c0;->z:I

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget v1, p0, Lrm/c0;->E:I

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget v1, p0, Lrm/c0;->F:I

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget v1, p0, Lrm/c0;->G:I

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lrm/c0;->I:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lrm/c0;->J:Lin/c;

    if-nez v1, :cond_4

    move v1, v0

    goto :goto_4

    :cond_4
    iget-object v1, v1, Lin/c;->w:[Lin/b;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    :goto_4
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lrm/c0;->K:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lrm/c0;->L:Ljava/lang/String;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget v0, p0, Lrm/c0;->M:I

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Lrm/c0;->P:J

    long-to-int v0, v0

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget v0, p0, Lrm/c0;->Q:I

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget v0, p0, Lrm/c0;->R:I

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget v0, p0, Lrm/c0;->S:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lrm/c0;->T:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lrm/c0;->U:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->W:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->Y:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->Z:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->a0:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->b0:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->c0:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->d0:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/c0;->e0:I

    add-int/2addr v1, v0

    iput v1, p0, Lrm/c0;->f0:I

    :cond_7
    iget v0, p0, Lrm/c0;->f0:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    const/16 v0, 0x68

    iget-object v1, p0, Lrm/c0;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lrm/c0;->x:Ljava/lang/String;

    invoke-static {v0, v2}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lrm/c0;->K:Ljava/lang/String;

    invoke-static {v0, v3}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    iget-object v4, p0, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v0, v4}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    iget-object v5, p0, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v0, v5}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    iget-object v6, p0, Lrm/c0;->y:Ljava/lang/String;

    invoke-static {v0, v6}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Format("

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v0, v3, v0, v4}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrm/c0;->H:I

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrm/c0;->Q:I

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrm/c0;->R:I

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrm/c0;->S:F

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "], ["

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrm/c0;->Y:I

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lrm/c0;->Z:I

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "])"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
