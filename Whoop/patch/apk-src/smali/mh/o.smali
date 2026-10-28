.class public final Lmh/o;
.super Lmh/k;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/drawable/Drawable;

.field public final b:Lmh/j;

.field public final c:Ldh/g;

.field public final d:Lkh/a;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lmh/j;Ldh/g;Lkh/a;Ljava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh/o;->a:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lmh/o;->b:Lmh/j;

    iput-object p3, p0, Lmh/o;->c:Ldh/g;

    iput-object p4, p0, Lmh/o;->d:Lkh/a;

    iput-object p5, p0, Lmh/o;->e:Ljava/lang/String;

    iput-boolean p6, p0, Lmh/o;->f:Z

    iput-boolean p7, p0, Lmh/o;->g:Z

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lmh/o;->a:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final b()Lmh/j;
    .locals 1

    iget-object v0, p0, Lmh/o;->b:Lmh/j;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmh/o;

    if-eqz v1, :cond_1

    check-cast p1, Lmh/o;

    iget-object v1, p1, Lmh/o;->a:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lmh/o;->a:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/o;->b:Lmh/j;

    iget-object v2, p1, Lmh/o;->b:Lmh/j;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/o;->c:Ldh/g;

    iget-object v2, p1, Lmh/o;->c:Ldh/g;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lmh/o;->d:Lkh/a;

    iget-object v2, p1, Lmh/o;->d:Lkh/a;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/o;->e:Ljava/lang/String;

    iget-object v2, p1, Lmh/o;->e:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lmh/o;->f:Z

    iget-boolean v2, p1, Lmh/o;->f:Z

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Lmh/o;->g:Z

    iget-boolean p1, p1, Lmh/o;->g:Z

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lmh/o;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lmh/o;->b:Lmh/j;

    invoke-virtual {v2}, Lmh/j;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/o;->c:Ldh/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lmh/o;->d:Lkh/a;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lkh/a;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lmh/o;->e:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lmh/o;->f:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lmh/o;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
