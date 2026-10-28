.class public final Ln33/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Ljava/lang/Long;

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Double;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Boolean;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/Boolean;

.field public final i:Ljava/lang/Boolean;

.field public final j:Ljava/lang/Double;

.field public final k:Ljava/lang/Double;

.field public final l:Ljava/lang/Long;

.field public final m:Ljava/lang/Double;

.field public final n:Ljava/lang/Double;

.field public final o:Ljava/lang/Double;

.field public final p:Ljava/lang/Double;

.field public final q:Ljava/lang/Long;

.field public final r:Ljava/lang/Long;

.field public final s:Ljava/lang/Double;

.field public final t:Ljava/lang/Long;

.field public final u:Ljava/lang/Long;

.field public final v:Ljava/lang/Double;

.field public final w:Ljava/lang/Long;

.field public final x:Ljava/lang/Long;

.field public final y:Ljava/lang/Long;

.field public final z:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln33/g;->a:Ljava/lang/String;

    iput-object p2, p0, Ln33/g;->b:Ljava/lang/String;

    iput-object p3, p0, Ln33/g;->c:Ljava/lang/Double;

    iput-object p4, p0, Ln33/g;->d:Ljava/lang/String;

    iput-object p5, p0, Ln33/g;->e:Ljava/lang/Boolean;

    iput-object p6, p0, Ln33/g;->f:Ljava/lang/String;

    iput-object p7, p0, Ln33/g;->g:Ljava/lang/String;

    iput-object p8, p0, Ln33/g;->h:Ljava/lang/Boolean;

    iput-object p9, p0, Ln33/g;->i:Ljava/lang/Boolean;

    iput-object p10, p0, Ln33/g;->j:Ljava/lang/Double;

    iput-object p11, p0, Ln33/g;->k:Ljava/lang/Double;

    iput-object p12, p0, Ln33/g;->l:Ljava/lang/Long;

    iput-object p13, p0, Ln33/g;->m:Ljava/lang/Double;

    iput-object p14, p0, Ln33/g;->n:Ljava/lang/Double;

    iput-object p15, p0, Ln33/g;->o:Ljava/lang/Double;

    move-object/from16 p1, p16

    iput-object p1, p0, Ln33/g;->p:Ljava/lang/Double;

    move-object/from16 p1, p17

    iput-object p1, p0, Ln33/g;->q:Ljava/lang/Long;

    move-object/from16 p1, p18

    iput-object p1, p0, Ln33/g;->r:Ljava/lang/Long;

    move-object/from16 p1, p19

    iput-object p1, p0, Ln33/g;->s:Ljava/lang/Double;

    move-object/from16 p1, p20

    iput-object p1, p0, Ln33/g;->t:Ljava/lang/Long;

    move-object/from16 p1, p21

    iput-object p1, p0, Ln33/g;->u:Ljava/lang/Long;

    move-object/from16 p1, p22

    iput-object p1, p0, Ln33/g;->v:Ljava/lang/Double;

    move-object/from16 p1, p23

    iput-object p1, p0, Ln33/g;->w:Ljava/lang/Long;

    move-object/from16 p1, p24

    iput-object p1, p0, Ln33/g;->x:Ljava/lang/Long;

    move-object/from16 p1, p25

    iput-object p1, p0, Ln33/g;->y:Ljava/lang/Long;

    move-object/from16 p1, p26

    iput-object p1, p0, Ln33/g;->z:Ljava/lang/Long;

    move-object/from16 p1, p27

    iput-object p1, p0, Ln33/g;->A:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln33/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln33/g;

    iget-object v1, p0, Ln33/g;->a:Ljava/lang/String;

    iget-object v3, p1, Ln33/g;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ln33/g;->b:Ljava/lang/String;

    iget-object v3, p1, Ln33/g;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ln33/g;->c:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->c:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ln33/g;->d:Ljava/lang/String;

    iget-object v3, p1, Ln33/g;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ln33/g;->e:Ljava/lang/Boolean;

    iget-object v3, p1, Ln33/g;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ln33/g;->f:Ljava/lang/String;

    iget-object v3, p1, Ln33/g;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ln33/g;->g:Ljava/lang/String;

    iget-object v3, p1, Ln33/g;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ln33/g;->h:Ljava/lang/Boolean;

    iget-object v3, p1, Ln33/g;->h:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ln33/g;->i:Ljava/lang/Boolean;

    iget-object v3, p1, Ln33/g;->i:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Ln33/g;->j:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->j:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ln33/g;->k:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->k:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ln33/g;->l:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->l:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Ln33/g;->m:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->m:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Ln33/g;->n:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->n:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Ln33/g;->o:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->o:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Ln33/g;->p:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->p:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Ln33/g;->q:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->q:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Ln33/g;->r:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->r:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Ln33/g;->s:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->s:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Ln33/g;->t:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->t:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Ln33/g;->u:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->u:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Ln33/g;->v:Ljava/lang/Double;

    iget-object v3, p1, Ln33/g;->v:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Ln33/g;->w:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->w:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Ln33/g;->x:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->x:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Ln33/g;->y:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->y:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Ln33/g;->z:Ljava/lang/Long;

    iget-object v3, p1, Ln33/g;->z:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Ln33/g;->A:Ljava/lang/Long;

    iget-object p1, p1, Ln33/g;->A:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    return v2

    :cond_1c
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ln33/g;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->c:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->d:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->e:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->f:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->g:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->h:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    move v2, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->i:Ljava/lang/Boolean;

    if-nez v2, :cond_8

    move v2, v0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->j:Ljava/lang/Double;

    if-nez v2, :cond_9

    move v2, v0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->k:Ljava/lang/Double;

    if-nez v2, :cond_a

    move v2, v0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->l:Ljava/lang/Long;

    if-nez v2, :cond_b

    move v2, v0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->m:Ljava/lang/Double;

    if-nez v2, :cond_c

    move v2, v0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->n:Ljava/lang/Double;

    if-nez v2, :cond_d

    move v2, v0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->o:Ljava/lang/Double;

    if-nez v2, :cond_e

    move v2, v0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->p:Ljava/lang/Double;

    if-nez v2, :cond_f

    move v2, v0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->q:Ljava/lang/Long;

    if-nez v2, :cond_10

    move v2, v0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->r:Ljava/lang/Long;

    if-nez v2, :cond_11

    move v2, v0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->s:Ljava/lang/Double;

    if-nez v2, :cond_12

    move v2, v0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->t:Ljava/lang/Long;

    if-nez v2, :cond_13

    move v2, v0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->u:Ljava/lang/Long;

    if-nez v2, :cond_14

    move v2, v0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->v:Ljava/lang/Double;

    if-nez v2, :cond_15

    move v2, v0

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->w:Ljava/lang/Long;

    if-nez v2, :cond_16

    move v2, v0

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->x:Ljava/lang/Long;

    if-nez v2, :cond_17

    move v2, v0

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_17
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->y:Ljava/lang/Long;

    if-nez v2, :cond_18

    move v2, v0

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_18
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->z:Ljava/lang/Long;

    if-nez v2, :cond_19

    move v2, v0

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_19
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln33/g;->A:Ljava/lang/Long;

    if-nez v2, :cond_1a

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1a
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", type="

    const-string v1, ", timestampUs="

    const-string v2, "RtcMediaStreamAudioTrackReceiverStats(id="

    iget-object v3, p0, Ln33/g;->a:Ljava/lang/String;

    iget-object v4, p0, Ln33/g;->b:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ln33/g;->c:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackIdentifier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln33/g;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ended="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", kind="

    const-string v2, ", priority="

    iget-object v3, p0, Ln33/g;->e:Ljava/lang/Boolean;

    iget-object v4, p0, Ln33/g;->f:Ljava/lang/String;

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", remoteSource="

    const-string v2, ", detached="

    iget-object v3, p0, Ln33/g;->h:Ljava/lang/Boolean;

    iget-object v4, p0, Ln33/g;->g:Ljava/lang/String;

    invoke-static {v3, v4, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Ln33/g;->i:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", estimatedPlayoutTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln33/g;->j:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBufferDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln33/g;->k:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBufferEmittedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln33/g;->l:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", totalAudioEnergy="

    const-string v2, ", totalSamplesDuration="

    iget-object v3, p0, Ln33/g;->m:Ljava/lang/Double;

    iget-object v4, p0, Ln33/g;->n:Ljava/lang/Double;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", totalInterruptionDuration="

    const-string v2, ", removedSamplesForAcceleration="

    iget-object v3, p0, Ln33/g;->o:Ljava/lang/Double;

    iget-object v4, p0, Ln33/g;->p:Ljava/lang/Double;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", interruptionCount="

    const-string v2, ", relativePacketArrivalDelay="

    iget-object v3, p0, Ln33/g;->q:Ljava/lang/Long;

    iget-object v4, p0, Ln33/g;->r:Ljava/lang/Long;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->r(Ljava/lang/StringBuilder;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    iget-object v1, p0, Ln33/g;->s:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBufferFlushes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln33/g;->t:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", concealedSamples="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln33/g;->u:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBufferTargetDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln33/g;->v:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", insertedSamplesForDeceleration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", delayedPacketOutageSamples="

    const-string v2, ", totalSamplesReceived="

    iget-object v3, p0, Ln33/g;->w:Ljava/lang/Long;

    iget-object v4, p0, Ln33/g;->x:Ljava/lang/Long;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->r(Ljava/lang/StringBuilder;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    const-string v1, ", concealmentEvents="

    const-string v2, ", silentConcealedSamples="

    iget-object v3, p0, Ln33/g;->y:Ljava/lang/Long;

    iget-object v4, p0, Ln33/g;->z:Ljava/lang/Long;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->r(Ljava/lang/StringBuilder;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    iget-object v1, p0, Ln33/g;->A:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
