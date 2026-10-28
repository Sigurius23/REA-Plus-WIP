.class public final Lmh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbc3/w1;

.field public final b:Lbc3/z;

.field public final c:Lbc3/z;

.field public final d:Lbc3/z;

.field public final e:Lph/c;

.field public final f:Lnh/d;

.field public final g:Landroid/graphics/Bitmap$Config;

.field public final h:Z

.field public final i:Lmh/b;

.field public final j:Lmh/b;

.field public final k:Lmh/b;


# direct methods
.method public constructor <init>()V
    .locals 5

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    sget-object v1, Lkc3/d;->w:Lkc3/d;

    sget-object v2, Lnh/d;->y:Lnh/d;

    sget-object v3, Lqh/d;->b:Landroid/graphics/Bitmap$Config;

    sget-object v4, Lmh/b;->y:Lmh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lmh/c;->a:Lbc3/w1;

    iput-object v1, p0, Lmh/c;->b:Lbc3/z;

    iput-object v1, p0, Lmh/c;->c:Lbc3/z;

    iput-object v1, p0, Lmh/c;->d:Lbc3/z;

    sget-object v0, Lph/e;->a:Lph/c;

    iput-object v0, p0, Lmh/c;->e:Lph/c;

    iput-object v2, p0, Lmh/c;->f:Lnh/d;

    iput-object v3, p0, Lmh/c;->g:Landroid/graphics/Bitmap$Config;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmh/c;->h:Z

    iput-object v4, p0, Lmh/c;->i:Lmh/b;

    iput-object v4, p0, Lmh/c;->j:Lmh/b;

    iput-object v4, p0, Lmh/c;->k:Lmh/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lmh/c;

    if-eqz v0, :cond_1

    check-cast p1, Lmh/c;

    iget-object v0, p1, Lmh/c;->a:Lbc3/w1;

    iget-object v1, p0, Lmh/c;->a:Lbc3/w1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/c;->b:Lbc3/z;

    iget-object v1, p1, Lmh/c;->b:Lbc3/z;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/c;->c:Lbc3/z;

    iget-object v1, p1, Lmh/c;->c:Lbc3/z;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/c;->d:Lbc3/z;

    iget-object v1, p1, Lmh/c;->d:Lbc3/z;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/c;->e:Lph/c;

    iget-object v1, p1, Lmh/c;->e:Lph/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/c;->f:Lnh/d;

    iget-object v1, p1, Lmh/c;->f:Lnh/d;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/c;->g:Landroid/graphics/Bitmap$Config;

    iget-object v1, p1, Lmh/c;->g:Landroid/graphics/Bitmap$Config;

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lmh/c;->h:Z

    iget-boolean v1, p1, Lmh/c;->h:Z

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/c;->i:Lmh/b;

    iget-object v1, p1, Lmh/c;->i:Lmh/b;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/c;->j:Lmh/b;

    iget-object v1, p1, Lmh/c;->j:Lmh/b;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/c;->k:Lmh/b;

    iget-object p1, p1, Lmh/c;->k:Lmh/b;

    if-ne v0, p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lmh/c;->a:Lbc3/w1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lmh/c;->b:Lbc3/z;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/c;->c:Lbc3/z;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lmh/c;->d:Lbc3/z;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/c;->e:Lph/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v0, Lph/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lmh/c;->f:Lnh/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/c;->g:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lmh/c;->h:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v2, 0x0

    const v3, 0xe1781

    invoke-static {v0, v3, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lmh/c;->i:Lmh/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/c;->j:Lmh/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lmh/c;->k:Lmh/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
