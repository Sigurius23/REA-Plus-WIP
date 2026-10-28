.class public final Lu8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:I

.field public final B:Lu8/g;

.field public final C:I

.field public final D:I

.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:I

.field public final K:I

.field public final L:I

.field public final M:I

.field public N:I

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lzr/g0;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:Lu8/c0;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:I

.field public final p:I

.field public final q:Ljava/util/List;

.field public final r:Lu8/l;

.field public final s:J

.field public final t:Z

.field public final u:I

.field public final v:I

.field public final w:F

.field public final x:I

.field public final y:F

.field public final z:[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    invoke-virtual {v0}, Lu8/o;->a()Lu8/p;

    const/4 v0, 0x0

    invoke-static {v0}, Lx8/t;->F(I)V

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

.method public constructor <init>(Lu8/o;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lu8/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lu8/p;->a:Ljava/lang/String;

    iget-object v0, p1, Lu8/o;->d:Ljava/lang/String;

    invoke-static {v0}, Lx8/t;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lu8/p;->d:Ljava/lang/String;

    iget-object v1, p1, Lu8/o;->c:Lzr/g0;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p1, Lu8/o;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v1, Lu8/q;

    iget-object v4, p1, Lu8/o;->b:Ljava/lang/String;

    invoke-direct {v1, v0, v4}, Lu8/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    iput-object v0, p0, Lu8/p;->c:Lzr/g0;

    iget-object v0, p1, Lu8/o;->b:Ljava/lang/String;

    iput-object v0, p0, Lu8/p;->b:Ljava/lang/String;

    goto/16 :goto_4

    :cond_0
    iget-object v1, p1, Lu8/o;->c:Lzr/g0;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p1, Lu8/o;->b:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lu8/o;->c:Lzr/g0;

    iput-object v1, p0, Lu8/p;->c:Lzr/g0;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu8/q;

    iget-object v6, v5, Lu8/q;->a:Ljava/lang/String;

    invoke-static {v6, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v0, v5, Lu8/q;->b:Ljava/lang/String;

    goto :goto_0

    :cond_2
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/q;

    iget-object v0, v0, Lu8/q;->b:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lu8/p;->b:Ljava/lang/String;

    goto :goto_4

    :cond_3
    iget-object v0, p1, Lu8/o;->c:Lzr/g0;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lu8/o;->b:Ljava/lang/String;

    if-nez v0, :cond_4

    :goto_1
    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v3

    :goto_2
    iget-object v1, p1, Lu8/o;->c:Lzr/g0;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    iget-object v1, p1, Lu8/o;->c:Lzr/g0;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu8/q;

    iget-object v1, v1, Lu8/q;->b:Ljava/lang/String;

    iget-object v4, p1, Lu8/o;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    move v0, v3

    :goto_3
    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-object v0, p1, Lu8/o;->c:Lzr/g0;

    iput-object v0, p0, Lu8/p;->c:Lzr/g0;

    iget-object v0, p1, Lu8/o;->b:Ljava/lang/String;

    iput-object v0, p0, Lu8/p;->b:Ljava/lang/String;

    :goto_4
    iget v0, p1, Lu8/o;->e:I

    iput v0, p0, Lu8/p;->e:I

    iget v0, p1, Lu8/o;->g:I

    if-eqz v0, :cond_8

    iget v0, p1, Lu8/o;->f:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_7

    goto :goto_5

    :cond_7
    move v0, v3

    goto :goto_6

    :cond_8
    :goto_5
    move v0, v2

    :goto_6
    const-string v1, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set"

    invoke-static {v1, v0}, Lva3/g;->h(Ljava/lang/String;Z)V

    iget v0, p1, Lu8/o;->f:I

    iput v0, p0, Lu8/p;->f:I

    iget v0, p1, Lu8/o;->g:I

    iput v0, p0, Lu8/p;->g:I

    iget v0, p1, Lu8/o;->h:I

    iput v0, p0, Lu8/p;->h:I

    iget v1, p1, Lu8/o;->i:I

    iput v1, p0, Lu8/p;->i:I

    const/4 v4, -0x1

    if-eq v1, v4, :cond_9

    move v0, v1

    :cond_9
    iput v0, p0, Lu8/p;->j:I

    iget-object v0, p1, Lu8/o;->j:Ljava/lang/String;

    iput-object v0, p0, Lu8/p;->k:Ljava/lang/String;

    iget-object v0, p1, Lu8/o;->k:Lu8/c0;

    iput-object v0, p0, Lu8/p;->l:Lu8/c0;

    iget-object v0, p1, Lu8/o;->l:Ljava/lang/String;

    iput-object v0, p0, Lu8/p;->m:Ljava/lang/String;

    iget-object v0, p1, Lu8/o;->m:Ljava/lang/String;

    iput-object v0, p0, Lu8/p;->n:Ljava/lang/String;

    iget v0, p1, Lu8/o;->n:I

    iput v0, p0, Lu8/p;->o:I

    iget v0, p1, Lu8/o;->o:I

    iput v0, p0, Lu8/p;->p:I

    iget-object v0, p1, Lu8/o;->p:Ljava/util/List;

    if-nez v0, :cond_a

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_a
    iput-object v0, p0, Lu8/p;->q:Ljava/util/List;

    iget-object v0, p1, Lu8/o;->q:Lu8/l;

    iput-object v0, p0, Lu8/p;->r:Lu8/l;

    iget-wide v5, p1, Lu8/o;->r:J

    iput-wide v5, p0, Lu8/p;->s:J

    iget-boolean v1, p1, Lu8/o;->s:Z

    iput-boolean v1, p0, Lu8/p;->t:Z

    iget v1, p1, Lu8/o;->t:I

    iput v1, p0, Lu8/p;->u:I

    iget v1, p1, Lu8/o;->u:I

    iput v1, p0, Lu8/p;->v:I

    iget v1, p1, Lu8/o;->v:F

    iput v1, p0, Lu8/p;->w:F

    iget v1, p1, Lu8/o;->w:I

    if-ne v1, v4, :cond_b

    move v1, v3

    :cond_b
    iput v1, p0, Lu8/p;->x:I

    iget v1, p1, Lu8/o;->x:F

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v5, v1, v5

    if-nez v5, :cond_c

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_c
    iput v1, p0, Lu8/p;->y:F

    iget-object v1, p1, Lu8/o;->y:[B

    iput-object v1, p0, Lu8/p;->z:[B

    iget v1, p1, Lu8/o;->z:I

    iput v1, p0, Lu8/p;->A:I

    iget-object v1, p1, Lu8/o;->A:Lu8/g;

    iput-object v1, p0, Lu8/p;->B:Lu8/g;

    iget v1, p1, Lu8/o;->B:I

    iput v1, p0, Lu8/p;->C:I

    iget v1, p1, Lu8/o;->C:I

    iput v1, p0, Lu8/p;->D:I

    iget v1, p1, Lu8/o;->D:I

    iput v1, p0, Lu8/p;->E:I

    iget v1, p1, Lu8/o;->E:I

    iput v1, p0, Lu8/p;->F:I

    iget v1, p1, Lu8/o;->F:I

    if-ne v1, v4, :cond_d

    move v1, v3

    :cond_d
    iput v1, p0, Lu8/p;->G:I

    iget v1, p1, Lu8/o;->G:I

    if-ne v1, v4, :cond_e

    goto :goto_7

    :cond_e
    move v3, v1

    :goto_7
    iput v3, p0, Lu8/p;->H:I

    iget v1, p1, Lu8/o;->H:I

    iput v1, p0, Lu8/p;->I:I

    iget v1, p1, Lu8/o;->I:I

    iput v1, p0, Lu8/p;->J:I

    iget v1, p1, Lu8/o;->J:I

    iput v1, p0, Lu8/p;->K:I

    iget v1, p1, Lu8/o;->K:I

    iput v1, p0, Lu8/p;->L:I

    iget p1, p1, Lu8/o;->L:I

    if-nez p1, :cond_f

    if-eqz v0, :cond_f

    iput v2, p0, Lu8/p;->M:I

    return-void

    :cond_f
    iput p1, p0, Lu8/p;->M:I

    return-void
.end method

.method public static c(Lu8/p;)Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    if-nez v0, :cond_0

    const-string v0, "null"

    return-object v0

    :cond_0
    iget v1, v0, Lu8/p;->e:I

    iget-object v2, v0, Lu8/p;->c:Lzr/g0;

    iget-object v3, v0, Lu8/p;->d:Ljava/lang/String;

    iget v4, v0, Lu8/p;->E:I

    iget v5, v0, Lu8/p;->D:I

    iget v6, v0, Lu8/p;->C:I

    iget v7, v0, Lu8/p;->w:F

    iget-object v8, v0, Lu8/p;->B:Lu8/g;

    iget v9, v0, Lu8/p;->y:F

    iget v10, v0, Lu8/p;->v:I

    iget v11, v0, Lu8/p;->u:I

    iget-object v12, v0, Lu8/p;->r:Lu8/l;

    iget-object v13, v0, Lu8/p;->k:Ljava/lang/String;

    iget v14, v0, Lu8/p;->j:I

    iget-object v15, v0, Lu8/p;->m:Ljava/lang/String;

    move/from16 v16, v1

    iget v1, v0, Lu8/p;->f:I

    move/from16 v17, v1

    new-instance v1, Ldb/j0;

    const/16 v18, 0x2c

    move-object/from16 v19, v2

    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v3

    const/16 v3, 0xf

    invoke-direct {v1, v2, v3}, Ldb/j0;-><init>(Ljava/lang/String;I)V

    const-string v2, "id="

    invoke-static {v2}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lu8/p;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", mimeType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v15, :cond_1

    const-string v3, ", container="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/4 v3, -0x1

    if-eq v14, v3, :cond_2

    const-string v15, ", bitrate="

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    if-eqz v13, :cond_3

    const-string v14, ", codecs="

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    if-eqz v12, :cond_a

    new-instance v13, Ljava/util/LinkedHashSet;

    invoke-direct {v13}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v14, 0x0

    :goto_0
    iget v15, v12, Lu8/l;->z:I

    if-ge v14, v15, :cond_9

    iget-object v15, v12, Lu8/l;->w:[Lu8/k;

    aget-object v15, v15, v14

    iget-object v15, v15, Lu8/k;->x:Ljava/util/UUID;

    sget-object v3, Lu8/f;->b:Ljava/util/UUID;

    invoke-virtual {v15, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "cenc"

    invoke-interface {v13, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_1
    move-object/from16 v20, v12

    goto :goto_2

    :cond_4
    sget-object v3, Lu8/f;->c:Ljava/util/UUID;

    invoke-virtual {v15, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "clearkey"

    invoke-interface {v13, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    sget-object v3, Lu8/f;->e:Ljava/util/UUID;

    invoke-virtual {v15, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "playready"

    invoke-interface {v13, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    sget-object v3, Lu8/f;->d:Ljava/util/UUID;

    invoke-virtual {v15, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "widevine"

    invoke-interface {v13, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    sget-object v3, Lu8/f;->a:Ljava/util/UUID;

    invoke-virtual {v15, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v3, "universal"

    invoke-interface {v13, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v20, v12

    const-string v12, "unknown ("

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, ")"

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v13, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v12, v20

    const/4 v3, -0x1

    goto :goto_0

    :cond_9
    const-string v3, ", drm=["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ldb/j0;->c(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    const/16 v3, 0x5d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, -0x1

    :cond_a
    if-eq v11, v3, :cond_b

    if-eq v10, v3, :cond_b

    const-string v3, ", res="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_b
    float-to-double v10, v9

    sget v3, Lbs/c;->a:I

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    sub-double v14, v10, v12

    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->copySign(DD)D

    move-result-wide v14

    const-wide v20, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v3, v14, v20

    if-lez v3, :cond_d

    cmpl-double v3, v10, v12

    if-eqz v3, :cond_d

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_3

    :cond_c
    const-string v3, ", par="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    sget v9, Lx8/t;->a:I

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "%.3f"

    invoke-static {v9, v10, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    :goto_3
    if-eqz v8, :cond_11

    iget v3, v8, Lu8/g;->f:I

    iget v9, v8, Lu8/g;->e:I

    const/4 v10, -0x1

    if-eq v9, v10, :cond_e

    if-eq v3, v10, :cond_e

    goto :goto_4

    :cond_e
    invoke-virtual {v8}, Lu8/g;->d()Z

    move-result v10

    if-eqz v10, :cond_11

    :goto_4
    const-string v10, ", color="

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Lu8/g;->d()Z

    move-result v10

    const-string v11, "/"

    if-eqz v10, :cond_f

    iget v10, v8, Lu8/g;->a:I

    invoke-static {v10}, Lu8/g;->b(I)Ljava/lang/String;

    move-result-object v10

    iget v12, v8, Lu8/g;->b:I

    invoke-static {v12}, Lu8/g;->a(I)Ljava/lang/String;

    move-result-object v12

    iget v8, v8, Lu8/g;->c:I

    invoke-static {v8}, Lu8/g;->c(I)Ljava/lang/String;

    move-result-object v8

    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_5
    const/4 v10, -0x1

    goto :goto_6

    :cond_f
    const-string v8, "NA/NA/NA"

    goto :goto_5

    :goto_6
    if-eq v9, v10, :cond_10

    if-eq v3, v10, :cond_10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_10
    const-string v3, "NA/NA"

    :goto_7
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v3, v7, v3

    if-eqz v3, :cond_12

    const-string v3, ", fps="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    :cond_12
    const/4 v10, -0x1

    if-eq v6, v10, :cond_13

    const-string v3, ", maxSubLayers="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_13
    if-eq v5, v10, :cond_14

    const-string v3, ", channels="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_14
    if-eq v4, v10, :cond_15

    const-string v3, ", sample_rate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_15
    if-eqz v18, :cond_16

    const-string v3, ", language="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_16
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const-string v4, "]"

    if-nez v3, :cond_17

    const-string v3, ", labels=["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Lsm/c;

    const/16 v5, 0x1c

    invoke-direct {v3, v5}, Lsm/c;-><init>(I)V

    move-object/from16 v5, v19

    invoke-static {v5, v3}, Lzr/q;->t(Ljava/util/List;Lyr/e;)Ljava/util/AbstractList;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ldb/j0;->c(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_17
    const/4 v3, 0x2

    if-eqz v16, :cond_1b

    const-string v5, ", selectionFlags=["

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v5, Lx8/t;->a:I

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v6, v16, 0x4

    if-eqz v6, :cond_18

    const-string v6, "auto"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    and-int/lit8 v6, v16, 0x1

    if-eqz v6, :cond_19

    const-string v6, "default"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    and-int/lit8 v6, v16, 0x2

    if-eqz v6, :cond_1a

    const-string v6, "forced"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ldb/j0;->c(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1b
    const v5, 0x8000

    if-eqz v17, :cond_2c

    const-string v6, ", roleFlags=["

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v6, Lx8/t;->a:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v7, v17, 0x1

    if-eqz v7, :cond_1c

    const-string v7, "main"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    and-int/lit8 v7, v17, 0x2

    if-eqz v7, :cond_1d

    const-string v7, "alt"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1d
    and-int/lit8 v7, v17, 0x4

    if-eqz v7, :cond_1e

    const-string v7, "supplementary"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1e
    and-int/lit8 v7, v17, 0x8

    if-eqz v7, :cond_1f

    const-string v7, "commentary"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    and-int/lit8 v7, v17, 0x10

    if-eqz v7, :cond_20

    const-string v7, "dub"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    and-int/lit8 v7, v17, 0x20

    if-eqz v7, :cond_21

    const-string v7, "emergency"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    and-int/lit8 v7, v17, 0x40

    if-eqz v7, :cond_22

    const-string v7, "caption"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    move/from16 v7, v17

    and-int/lit16 v8, v7, 0x80

    if-eqz v8, :cond_23

    const-string v8, "subtitle"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_23
    and-int/lit16 v8, v7, 0x100

    if-eqz v8, :cond_24

    const-string v8, "sign"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    and-int/lit16 v8, v7, 0x200

    if-eqz v8, :cond_25

    const-string v8, "describes-video"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_25
    and-int/lit16 v8, v7, 0x400

    if-eqz v8, :cond_26

    const-string v8, "describes-music"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_26
    and-int/lit16 v8, v7, 0x800

    if-eqz v8, :cond_27

    const-string v8, "enhanced-intelligibility"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_27
    and-int/lit16 v8, v7, 0x1000

    if-eqz v8, :cond_28

    const-string v8, "transcribes-dialog"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_28
    and-int/lit16 v8, v7, 0x2000

    if-eqz v8, :cond_29

    const-string v8, "easy-read"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    and-int/lit16 v8, v7, 0x4000

    if-eqz v8, :cond_2a

    const-string v8, "trick-play"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2a
    and-int v8, v7, v5

    if-eqz v8, :cond_2b

    const-string v8, "auxiliary"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2b
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Ldb/j0;->c(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_2c
    move/from16 v7, v17

    :goto_8
    and-int v1, v7, v5

    if-eqz v1, :cond_32

    const-string v1, ", auxiliaryTrackType="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lu8/p;->g:I

    sget v1, Lx8/t;->a:I

    if-eqz v0, :cond_31

    const/4 v1, 0x1

    if-eq v0, v1, :cond_30

    if-eq v0, v3, :cond_2f

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2e

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2d

    const-string v0, "depth metadata"

    goto :goto_9

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported auxiliary track type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    const-string v0, "depth-inverse"

    goto :goto_9

    :cond_2f
    const-string v0, "depth-linear"

    goto :goto_9

    :cond_30
    const-string v0, "original"

    goto :goto_9

    :cond_31
    const-string v0, "undefined"

    :goto_9
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lu8/o;
    .locals 3

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lu8/p;->a:Ljava/lang/String;

    iput-object v1, v0, Lu8/o;->a:Ljava/lang/String;

    iget-object v1, p0, Lu8/p;->b:Ljava/lang/String;

    iput-object v1, v0, Lu8/o;->b:Ljava/lang/String;

    iget-object v1, p0, Lu8/p;->c:Lzr/g0;

    iput-object v1, v0, Lu8/o;->c:Lzr/g0;

    iget-object v1, p0, Lu8/p;->d:Ljava/lang/String;

    iput-object v1, v0, Lu8/o;->d:Ljava/lang/String;

    iget v1, p0, Lu8/p;->e:I

    iput v1, v0, Lu8/o;->e:I

    iget v1, p0, Lu8/p;->f:I

    iput v1, v0, Lu8/o;->f:I

    iget v1, p0, Lu8/p;->h:I

    iput v1, v0, Lu8/o;->h:I

    iget v1, p0, Lu8/p;->i:I

    iput v1, v0, Lu8/o;->i:I

    iget-object v1, p0, Lu8/p;->k:Ljava/lang/String;

    iput-object v1, v0, Lu8/o;->j:Ljava/lang/String;

    iget-object v1, p0, Lu8/p;->l:Lu8/c0;

    iput-object v1, v0, Lu8/o;->k:Lu8/c0;

    iget-object v1, p0, Lu8/p;->m:Ljava/lang/String;

    iput-object v1, v0, Lu8/o;->l:Ljava/lang/String;

    iget-object v1, p0, Lu8/p;->n:Ljava/lang/String;

    iput-object v1, v0, Lu8/o;->m:Ljava/lang/String;

    iget v1, p0, Lu8/p;->o:I

    iput v1, v0, Lu8/o;->n:I

    iget v1, p0, Lu8/p;->p:I

    iput v1, v0, Lu8/o;->o:I

    iget-object v1, p0, Lu8/p;->q:Ljava/util/List;

    iput-object v1, v0, Lu8/o;->p:Ljava/util/List;

    iget-object v1, p0, Lu8/p;->r:Lu8/l;

    iput-object v1, v0, Lu8/o;->q:Lu8/l;

    iget-wide v1, p0, Lu8/p;->s:J

    iput-wide v1, v0, Lu8/o;->r:J

    iget-boolean v1, p0, Lu8/p;->t:Z

    iput-boolean v1, v0, Lu8/o;->s:Z

    iget v1, p0, Lu8/p;->u:I

    iput v1, v0, Lu8/o;->t:I

    iget v1, p0, Lu8/p;->v:I

    iput v1, v0, Lu8/o;->u:I

    iget v1, p0, Lu8/p;->w:F

    iput v1, v0, Lu8/o;->v:F

    iget v1, p0, Lu8/p;->x:I

    iput v1, v0, Lu8/o;->w:I

    iget v1, p0, Lu8/p;->y:F

    iput v1, v0, Lu8/o;->x:F

    iget-object v1, p0, Lu8/p;->z:[B

    iput-object v1, v0, Lu8/o;->y:[B

    iget v1, p0, Lu8/p;->A:I

    iput v1, v0, Lu8/o;->z:I

    iget-object v1, p0, Lu8/p;->B:Lu8/g;

    iput-object v1, v0, Lu8/o;->A:Lu8/g;

    iget v1, p0, Lu8/p;->C:I

    iput v1, v0, Lu8/o;->B:I

    iget v1, p0, Lu8/p;->D:I

    iput v1, v0, Lu8/o;->C:I

    iget v1, p0, Lu8/p;->E:I

    iput v1, v0, Lu8/o;->D:I

    iget v1, p0, Lu8/p;->F:I

    iput v1, v0, Lu8/o;->E:I

    iget v1, p0, Lu8/p;->G:I

    iput v1, v0, Lu8/o;->F:I

    iget v1, p0, Lu8/p;->H:I

    iput v1, v0, Lu8/o;->G:I

    iget v1, p0, Lu8/p;->I:I

    iput v1, v0, Lu8/o;->H:I

    iget v1, p0, Lu8/p;->J:I

    iput v1, v0, Lu8/o;->I:I

    iget v1, p0, Lu8/p;->K:I

    iput v1, v0, Lu8/o;->J:I

    iget v1, p0, Lu8/p;->L:I

    iput v1, v0, Lu8/o;->K:I

    iget v1, p0, Lu8/p;->M:I

    iput v1, v0, Lu8/o;->L:I

    return-object v0
.end method

.method public final b(Lu8/p;)Z
    .locals 5

    iget-object v0, p0, Lu8/p;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p1, Lu8/p;->q:Ljava/util/List;

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

    iget-object v4, p1, Lu8/p;->q:Ljava/util/List;

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

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_3

    const-class v1, Lu8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lu8/p;

    iget v1, p0, Lu8/p;->N:I

    if-eqz v1, :cond_2

    iget v2, p1, Lu8/p;->N:I

    if-eqz v2, :cond_2

    if-eq v1, v2, :cond_2

    goto/16 :goto_0

    :cond_2
    iget v1, p0, Lu8/p;->e:I

    iget v2, p1, Lu8/p;->e:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->f:I

    iget v2, p1, Lu8/p;->f:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->g:I

    iget v2, p1, Lu8/p;->g:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->h:I

    iget v2, p1, Lu8/p;->h:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->i:I

    iget v2, p1, Lu8/p;->i:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->o:I

    iget v2, p1, Lu8/p;->o:I

    if-ne v1, v2, :cond_3

    iget-wide v1, p0, Lu8/p;->s:J

    iget-wide v3, p1, Lu8/p;->s:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_3

    iget v1, p0, Lu8/p;->u:I

    iget v2, p1, Lu8/p;->u:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->v:I

    iget v2, p1, Lu8/p;->v:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->x:I

    iget v2, p1, Lu8/p;->x:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->A:I

    iget v2, p1, Lu8/p;->A:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->C:I

    iget v2, p1, Lu8/p;->C:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->D:I

    iget v2, p1, Lu8/p;->D:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->E:I

    iget v2, p1, Lu8/p;->E:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->F:I

    iget v2, p1, Lu8/p;->F:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->G:I

    iget v2, p1, Lu8/p;->G:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->H:I

    iget v2, p1, Lu8/p;->H:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->I:I

    iget v2, p1, Lu8/p;->I:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->K:I

    iget v2, p1, Lu8/p;->K:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->L:I

    iget v2, p1, Lu8/p;->L:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->M:I

    iget v2, p1, Lu8/p;->M:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lu8/p;->w:F

    iget v2, p1, Lu8/p;->w:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Lu8/p;->y:F

    iget v2, p1, Lu8/p;->y:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lu8/p;->a:Ljava/lang/String;

    iget-object v2, p1, Lu8/p;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->b:Ljava/lang/String;

    iget-object v2, p1, Lu8/p;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->c:Lzr/g0;

    iget-object v2, p1, Lu8/p;->c:Lzr/g0;

    invoke-virtual {v1, v2}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->k:Ljava/lang/String;

    iget-object v2, p1, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->m:Ljava/lang/String;

    iget-object v2, p1, Lu8/p;->m:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->n:Ljava/lang/String;

    iget-object v2, p1, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->d:Ljava/lang/String;

    iget-object v2, p1, Lu8/p;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->z:[B

    iget-object v2, p1, Lu8/p;->z:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->l:Lu8/c0;

    iget-object v2, p1, Lu8/p;->l:Lu8/c0;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->B:Lu8/g;

    iget-object v2, p1, Lu8/p;->B:Lu8/g;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/p;->r:Lu8/l;

    iget-object v2, p1, Lu8/p;->r:Lu8/l;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1}, Lu8/p;->b(Lu8/p;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Lu8/p;->N:I

    if-nez v0, :cond_7

    const/4 v0, 0x0

    iget-object v1, p0, Lu8/p;->a:Ljava/lang/String;

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

    iget-object v1, p0, Lu8/p;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lu8/p;->c:Lzr/g0;

    invoke-virtual {v1}, Lzr/g0;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lu8/p;->d:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lu8/p;->e:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lu8/p;->f:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lu8/p;->g:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lu8/p;->h:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lu8/p;->i:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lu8/p;->k:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lu8/p;->l:Lu8/c0;

    if-nez v2, :cond_4

    move v2, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lu8/c0;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3c1

    iget-object v2, p0, Lu8/p;->m:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lu8/p;->n:Ljava/lang/String;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->o:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lu8/p;->s:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->u:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->v:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->w:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu8/p;->x:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu8/p;->y:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->A:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->C:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->D:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->E:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->F:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->G:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->H:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->I:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->K:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->L:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu8/p;->M:I

    add-int/2addr v1, v0

    iput v1, p0, Lu8/p;->N:I

    :cond_7
    iget v0, p0, Lu8/p;->N:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Format("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lu8/p;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lu8/p;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lu8/p;->m:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lu8/p;->k:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lu8/p;->j:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lu8/p;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lu8/p;->u:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lu8/p;->v:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lu8/p;->w:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lu8/p;->B:Lu8/g;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "], ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lu8/p;->D:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lu8/p;->E:I

    const-string v2, "])"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
