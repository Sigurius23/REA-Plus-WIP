.class public final Lmh/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/graphics/Bitmap$Config;

.field public final c:Landroid/graphics/ColorSpace;

.field public final d:Lnh/h;

.field public final e:Lnh/g;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Lud3/d0;

.field public final k:Lmh/p;

.field public final l:Lmh/n;

.field public final m:Lmh/b;

.field public final n:Lmh/b;

.field public final o:Lmh/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lnh/h;Lnh/g;ZZZLjava/lang/String;Lud3/d0;Lmh/p;Lmh/n;Lmh/b;Lmh/b;Lmh/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh/m;->a:Landroid/content/Context;

    iput-object p2, p0, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    iput-object p3, p0, Lmh/m;->c:Landroid/graphics/ColorSpace;

    iput-object p4, p0, Lmh/m;->d:Lnh/h;

    iput-object p5, p0, Lmh/m;->e:Lnh/g;

    iput-boolean p6, p0, Lmh/m;->f:Z

    iput-boolean p7, p0, Lmh/m;->g:Z

    iput-boolean p8, p0, Lmh/m;->h:Z

    iput-object p9, p0, Lmh/m;->i:Ljava/lang/String;

    iput-object p10, p0, Lmh/m;->j:Lud3/d0;

    iput-object p11, p0, Lmh/m;->k:Lmh/p;

    iput-object p12, p0, Lmh/m;->l:Lmh/n;

    iput-object p13, p0, Lmh/m;->m:Lmh/b;

    iput-object p14, p0, Lmh/m;->n:Lmh/b;

    iput-object p15, p0, Lmh/m;->o:Lmh/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmh/m;

    if-eqz v1, :cond_1

    check-cast p1, Lmh/m;

    iget-object v1, p1, Lmh/m;->a:Landroid/content/Context;

    iget-object v2, p0, Lmh/m;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    iget-object v2, p1, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lmh/m;->c:Landroid/graphics/ColorSpace;

    iget-object v2, p1, Lmh/m;->c:Landroid/graphics/ColorSpace;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/m;->d:Lnh/h;

    iget-object v2, p1, Lmh/m;->d:Lnh/h;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/m;->e:Lnh/g;

    iget-object v2, p1, Lmh/m;->e:Lnh/g;

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Lmh/m;->f:Z

    iget-boolean v2, p1, Lmh/m;->f:Z

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Lmh/m;->g:Z

    iget-boolean v2, p1, Lmh/m;->g:Z

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Lmh/m;->h:Z

    iget-boolean v2, p1, Lmh/m;->h:Z

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lmh/m;->i:Ljava/lang/String;

    iget-object v2, p1, Lmh/m;->i:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/m;->j:Lud3/d0;

    iget-object v2, p1, Lmh/m;->j:Lud3/d0;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/m;->k:Lmh/p;

    iget-object v2, p1, Lmh/m;->k:Lmh/p;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/m;->l:Lmh/n;

    iget-object v2, p1, Lmh/m;->l:Lmh/n;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/m;->m:Lmh/b;

    iget-object v2, p1, Lmh/m;->m:Lmh/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lmh/m;->n:Lmh/b;

    iget-object v2, p1, Lmh/m;->n:Lmh/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lmh/m;->o:Lmh/b;

    iget-object p1, p1, Lmh/m;->o:Lmh/b;

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const/4 v0, 0x0

    iget-object v3, p0, Lmh/m;->c:Landroid/graphics/ColorSpace;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Lmh/m;->d:Lnh/h;

    invoke-virtual {v3}, Lnh/h;->hashCode()I

    move-result v3

    add-int/2addr v3, v2

    mul-int/2addr v3, v1

    iget-object v2, p0, Lmh/m;->e:Lnh/g;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-boolean v3, p0, Lmh/m;->f:Z

    invoke-static {v2, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v2

    iget-boolean v3, p0, Lmh/m;->g:Z

    invoke-static {v2, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v2

    iget-boolean v3, p0, Lmh/m;->h:Z

    invoke-static {v2, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v2

    iget-object v3, p0, Lmh/m;->i:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/m;->j:Lud3/d0;

    iget-object v0, v0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/m;->k:Lmh/p;

    iget-object v0, v0, Lmh/p;->a:Ljava/util/Map;

    invoke-static {v0, v2, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lmh/m;->l:Lmh/n;

    iget-object v2, v2, Lmh/n;->w:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lmh/m;->m:Lmh/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/m;->n:Lmh/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lmh/m;->o:Lmh/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
