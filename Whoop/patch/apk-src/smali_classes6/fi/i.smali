.class public final Lfi/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Object;

.field public final c:Lhi/a;

.field public final d:Lfi/h;

.field public final e:Ljava/util/Map;

.field public final f:Lne3/p;

.field public final g:Lq83/j;

.field public final h:Lq83/j;

.field public final i:Lq83/j;

.field public final j:Lfi/b;

.field public final k:Lfi/b;

.field public final l:Lfi/b;

.field public final m:Lkotlin/jvm/functions/Function1;

.field public final n:Lkotlin/jvm/functions/Function1;

.field public final o:Lkotlin/jvm/functions/Function1;

.field public final p:Lgi/j;

.field public final q:Lgi/g;

.field public final r:Lgi/d;

.field public final s:Lrh/i;

.field public final t:Lfi/g;

.field public final u:Lfi/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Lhi/a;Lfi/h;Ljava/util/Map;Lne3/p;Lq83/j;Lq83/j;Lq83/j;Lfi/b;Lfi/b;Lfi/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lgi/j;Lgi/g;Lgi/d;Lrh/i;Lfi/g;Lfi/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lfi/i;->b:Ljava/lang/Object;

    iput-object p3, p0, Lfi/i;->c:Lhi/a;

    iput-object p4, p0, Lfi/i;->d:Lfi/h;

    iput-object p5, p0, Lfi/i;->e:Ljava/util/Map;

    iput-object p6, p0, Lfi/i;->f:Lne3/p;

    iput-object p7, p0, Lfi/i;->g:Lq83/j;

    iput-object p8, p0, Lfi/i;->h:Lq83/j;

    iput-object p9, p0, Lfi/i;->i:Lq83/j;

    iput-object p10, p0, Lfi/i;->j:Lfi/b;

    iput-object p11, p0, Lfi/i;->k:Lfi/b;

    iput-object p12, p0, Lfi/i;->l:Lfi/b;

    iput-object p13, p0, Lfi/i;->m:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lfi/i;->n:Lkotlin/jvm/functions/Function1;

    iput-object p15, p0, Lfi/i;->o:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lfi/i;->p:Lgi/j;

    move-object/from16 p1, p17

    iput-object p1, p0, Lfi/i;->q:Lgi/g;

    move-object/from16 p1, p18

    iput-object p1, p0, Lfi/i;->r:Lgi/d;

    move-object/from16 p1, p19

    iput-object p1, p0, Lfi/i;->s:Lrh/i;

    move-object/from16 p1, p20

    iput-object p1, p0, Lfi/i;->t:Lfi/g;

    move-object/from16 p1, p21

    iput-object p1, p0, Lfi/i;->u:Lfi/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lfi/i;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lfi/i;

    iget-object v0, p0, Lfi/i;->a:Landroid/content/Context;

    iget-object v1, p1, Lfi/i;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lfi/i;->b:Ljava/lang/Object;

    iget-object v1, p1, Lfi/i;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lfi/i;->c:Lhi/a;

    iget-object v1, p1, Lfi/i;->c:Lhi/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lfi/i;->d:Lfi/h;

    iget-object v1, p1, Lfi/i;->d:Lfi/h;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lfi/i;->e:Ljava/util/Map;

    iget-object v1, p1, Lfi/i;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lfi/i;->f:Lne3/p;

    iget-object v1, p1, Lfi/i;->f:Lne3/p;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lfi/i;->g:Lq83/j;

    iget-object v1, p1, Lfi/i;->g:Lq83/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-object v0, p0, Lfi/i;->h:Lq83/j;

    iget-object v1, p1, Lfi/i;->h:Lq83/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lfi/i;->i:Lq83/j;

    iget-object v1, p1, Lfi/i;->i:Lq83/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lfi/i;->j:Lfi/b;

    iget-object v1, p1, Lfi/i;->j:Lfi/b;

    if-eq v0, v1, :cond_b

    goto/16 :goto_0

    :cond_b
    iget-object v0, p0, Lfi/i;->k:Lfi/b;

    iget-object v1, p1, Lfi/i;->k:Lfi/b;

    if-eq v0, v1, :cond_c

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lfi/i;->l:Lfi/b;

    iget-object v1, p1, Lfi/i;->l:Lfi/b;

    if-eq v0, v1, :cond_d

    goto :goto_0

    :cond_d
    iget-object v0, p0, Lfi/i;->m:Lkotlin/jvm/functions/Function1;

    iget-object v1, p1, Lfi/i;->m:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    iget-object v0, p0, Lfi/i;->n:Lkotlin/jvm/functions/Function1;

    iget-object v1, p1, Lfi/i;->n:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    iget-object v0, p0, Lfi/i;->o:Lkotlin/jvm/functions/Function1;

    iget-object v1, p1, Lfi/i;->o:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    iget-object v0, p0, Lfi/i;->p:Lgi/j;

    iget-object v1, p1, Lfi/i;->p:Lgi/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    iget-object v0, p0, Lfi/i;->q:Lgi/g;

    iget-object v1, p1, Lfi/i;->q:Lgi/g;

    if-eq v0, v1, :cond_12

    goto :goto_0

    :cond_12
    iget-object v0, p0, Lfi/i;->r:Lgi/d;

    iget-object v1, p1, Lfi/i;->r:Lgi/d;

    if-eq v0, v1, :cond_13

    goto :goto_0

    :cond_13
    iget-object v0, p0, Lfi/i;->s:Lrh/i;

    iget-object v1, p1, Lfi/i;->s:Lrh/i;

    invoke-virtual {v0, v1}, Lrh/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    iget-object v0, p0, Lfi/i;->t:Lfi/g;

    iget-object v1, p1, Lfi/i;->t:Lfi/g;

    invoke-virtual {v0, v1}, Lfi/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_0

    :cond_15
    iget-object v0, p0, Lfi/i;->u:Lfi/f;

    iget-object p1, p1, Lfi/i;->u:Lfi/f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_16
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lfi/i;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfi/i;->b:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lfi/i;->c:Lhi/a;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget-object v3, v3, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lfi/i;->d:Lfi/h;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    const/16 v2, 0x3c1

    mul-int/2addr v0, v2

    iget-object v3, p0, Lfi/i;->e:Ljava/util/Map;

    invoke-static {v3, v0, v2}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v3, p0, Lfi/i;->f:Lne3/p;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/lit16 v3, v3, 0x745f

    iget-object v0, p0, Lfi/i;->g:Lq83/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lfi/i;->h:Lq83/j;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lfi/i;->i:Lq83/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lfi/i;->j:Lfi/b;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lfi/i;->k:Lfi/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lfi/i;->l:Lfi/b;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lfi/i;->m:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3, v1}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v2, p0, Lfi/i;->n:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v2, p0, Lfi/i;->o:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v2, p0, Lfi/i;->p:Lgi/j;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/i;->q:Lgi/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfi/i;->r:Lgi/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/i;->s:Lrh/i;

    iget-object v0, v0, Lrh/i;->a:Ljava/util/Map;

    invoke-static {v0, v2, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lfi/i;->t:Lfi/g;

    invoke-virtual {v2}, Lfi/g;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/i;->u:Lfi/f;

    invoke-virtual {v0}, Lfi/f;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ImageRequest(context="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lfi/i;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", target="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->c:Lhi/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", listener="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->d:Lfi/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memoryCacheKey=null, memoryCacheKeyExtras="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", diskCacheKey=null, fileSystem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->f:Lne3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->g:Lq83/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fetcherCoroutineContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->h:Lq83/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decoderCoroutineContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->i:Lq83/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memoryCachePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->j:Lfi/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", diskCachePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->k:Lfi/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", networkCachePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->l:Lfi/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderMemoryCacheKey=null, placeholderFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->m:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->n:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fallbackFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->o:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeResolver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->p:Lgi/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->q:Lgi/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", precision="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->r:Lgi/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extras="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->s:Lrh/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defined="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->t:Lfi/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defaults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/i;->u:Lfi/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
