.class public final Lmh/e;
.super Lmh/k;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/drawable/Drawable;

.field public final b:Lmh/j;

.field public final c:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lmh/j;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh/e;->a:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lmh/e;->b:Lmh/j;

    iput-object p3, p0, Lmh/e;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lmh/e;->a:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final b()Lmh/j;
    .locals 1

    iget-object v0, p0, Lmh/e;->b:Lmh/j;

    return-object v0
.end method

.method public final c()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lmh/e;->c:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmh/e;

    if-eqz v1, :cond_1

    check-cast p1, Lmh/e;

    iget-object v1, p1, Lmh/e;->a:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lmh/e;->a:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/e;->b:Lmh/j;

    iget-object v2, p1, Lmh/e;->b:Lmh/j;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/e;->c:Ljava/lang/Throwable;

    iget-object p1, p1, Lmh/e;->c:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lmh/e;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmh/e;->b:Lmh/j;

    invoke-virtual {v1}, Lmh/j;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lmh/e;->c:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
