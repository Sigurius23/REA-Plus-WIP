.class public final Lch/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lqt/e;

.field public final c:Lbh/e;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lqt/e;Lbh/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/l;->a:Ljava/lang/Object;

    iput-object p2, p0, Lch/l;->b:Lqt/e;

    iput-object p3, p0, Lch/l;->c:Lbh/e;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v1, p1, Lch/l;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    check-cast p1, Lch/l;

    iget-object v1, p1, Lch/l;->a:Ljava/lang/Object;

    iget-object v3, p0, Lch/l;->b:Lqt/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lch/l;->a:Ljava/lang/Object;

    if-ne v3, v1, :cond_1

    :goto_0
    move v1, v0

    goto/16 :goto_2

    :cond_1
    instance-of v4, v3, Lmh/j;

    if-eqz v4, :cond_4

    instance-of v4, v1, Lmh/j;

    if-nez v4, :cond_2

    goto/16 :goto_1

    :cond_2
    check-cast v3, Lmh/j;

    iget-object v4, v3, Lmh/j;->a:Landroid/content/Context;

    check-cast v1, Lmh/j;

    iget-object v5, v1, Lmh/j;->a:Landroid/content/Context;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Lmh/j;->b:Ljava/lang/Object;

    iget-object v5, v1, Lmh/j;->b:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Lmh/j;->e:Lkh/a;

    iget-object v5, v1, Lmh/j;->e:Lkh/a;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    iget-object v5, v1, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    if-ne v4, v5, :cond_3

    iget-object v4, v3, Lmh/j;->i:Ljava/util/List;

    iget-object v5, v1, Lmh/j;->i:Ljava/util/List;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Lmh/j;->k:Lud3/d0;

    iget-object v5, v1, Lmh/j;->k:Lud3/d0;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-boolean v4, v3, Lmh/j;->m:Z

    iget-boolean v5, v1, Lmh/j;->m:Z

    if-ne v4, v5, :cond_3

    iget-boolean v4, v3, Lmh/j;->n:Z

    iget-boolean v5, v1, Lmh/j;->n:Z

    if-ne v4, v5, :cond_3

    iget-boolean v4, v3, Lmh/j;->o:Z

    iget-boolean v5, v1, Lmh/j;->o:Z

    if-ne v4, v5, :cond_3

    iget-boolean v4, v3, Lmh/j;->p:Z

    iget-boolean v5, v1, Lmh/j;->p:Z

    if-ne v4, v5, :cond_3

    iget-object v4, v3, Lmh/j;->q:Lmh/b;

    iget-object v5, v1, Lmh/j;->q:Lmh/b;

    if-ne v4, v5, :cond_3

    iget-object v4, v3, Lmh/j;->r:Lmh/b;

    iget-object v5, v1, Lmh/j;->r:Lmh/b;

    if-ne v4, v5, :cond_3

    iget-object v4, v3, Lmh/j;->s:Lmh/b;

    iget-object v5, v1, Lmh/j;->s:Lmh/b;

    if-ne v4, v5, :cond_3

    iget-object v4, v3, Lmh/j;->y:Lnh/i;

    iget-object v5, v1, Lmh/j;->y:Lnh/i;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Lmh/j;->z:Lnh/g;

    iget-object v5, v1, Lmh/j;->z:Lnh/g;

    if-ne v4, v5, :cond_3

    iget-object v4, v3, Lmh/j;->g:Lnh/d;

    iget-object v5, v1, Lmh/j;->g:Lnh/d;

    if-ne v4, v5, :cond_3

    iget-object v3, v3, Lmh/j;->A:Lmh/n;

    iget-object v1, v1, Lmh/j;->A:Lmh/n;

    invoke-virtual {v3, v1}, Lmh/n;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_0

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    :goto_1
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_5

    iget-object v1, p0, Lch/l;->c:Lbh/e;

    iget-object p1, p1, Lch/l;->c:Lbh/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_3
    return v0

    :cond_5
    return v2
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Lch/l;->b:Lqt/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lch/l;->a:Ljava/lang/Object;

    instance-of v1, v0, Lmh/j;

    const/4 v2, 0x0

    const/16 v3, 0x1f

    if-nez v1, :cond_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto/16 :goto_0

    :cond_0
    check-cast v0, Lmh/j;

    iget-object v1, v0, Lmh/j;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/2addr v1, v3

    iget-object v4, v0, Lmh/j;->b:Ljava/lang/Object;

    const/16 v5, 0x3c1

    invoke-static {v1, v5, v4}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v1

    iget-object v4, v0, Lmh/j;->e:Lkh/a;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lkh/a;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v1, v2

    mul-int/2addr v1, v5

    iget-object v2, v0, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/2addr v2, v5

    iget-object v1, v0, Lmh/j;->i:Ljava/util/List;

    invoke-static {v2, v3, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v2, v0, Lmh/j;->k:Lud3/d0;

    iget-object v2, v2, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/2addr v1, v3

    iget-boolean v2, v0, Lmh/j;->m:Z

    invoke-static {v1, v3, v2}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v2, v0, Lmh/j;->n:Z

    invoke-static {v1, v3, v2}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v2, v0, Lmh/j;->o:Z

    invoke-static {v1, v3, v2}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v2, v0, Lmh/j;->p:Z

    invoke-static {v1, v3, v2}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v2, v0, Lmh/j;->q:Lmh/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/2addr v2, v3

    iget-object v1, v0, Lmh/j;->r:Lmh/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/2addr v1, v3

    iget-object v2, v0, Lmh/j;->s:Lmh/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/2addr v2, v3

    iget-object v1, v0, Lmh/j;->y:Lnh/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/2addr v1, v3

    iget-object v2, v0, Lmh/j;->z:Lnh/g;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/2addr v2, v3

    iget-object v1, v0, Lmh/j;->g:Lnh/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/2addr v1, v3

    iget-object v0, v0, Lmh/j;->A:Lmh/n;

    iget-object v0, v0, Lmh/n;->w:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int v2, v0, v1

    :cond_2
    :goto_0
    mul-int/2addr v2, v3

    iget-object v0, p0, Lch/l;->c:Lbh/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
