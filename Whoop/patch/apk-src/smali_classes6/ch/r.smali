.class public final Lch/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/u;


# instance fields
.field public final a:Ll0/u;

.field public final b:Lcoil/compose/AsyncImagePainter;

.field public final c:Ljava/lang/String;

.field public final d:Lb2/h;

.field public final e:Ly2/k;


# direct methods
.method public constructor <init>(Ll0/u;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/r;->a:Ll0/u;

    iput-object p2, p0, Lch/r;->b:Lcoil/compose/AsyncImagePainter;

    iput-object p3, p0, Lch/r;->c:Ljava/lang/String;

    iput-object p4, p0, Lch/r;->d:Lb2/h;

    iput-object p5, p0, Lch/r;->e:Ly2/k;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Lch/r;->a:Ll0/u;

    invoke-interface {v0, p1, p2}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object p1, Lb2/t;->w:Lb2/t;

    iget-object v0, p0, Lch/r;->a:Ll0/u;

    invoke-interface {v0, p1}, Ll0/u;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lch/r;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lch/r;

    iget-object v1, p0, Lch/r;->a:Ll0/u;

    iget-object v2, p1, Lch/r;->a:Ll0/u;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lch/r;->b:Lcoil/compose/AsyncImagePainter;

    iget-object v2, p1, Lch/r;->b:Lcoil/compose/AsyncImagePainter;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lch/r;->c:Ljava/lang/String;

    iget-object v2, p1, Lch/r;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lch/r;->d:Lb2/h;

    iget-object v2, p1, Lch/r;->d:Lb2/h;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lch/r;->e:Ly2/k;

    iget-object p1, p1, Lch/r;->e:Ly2/k;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lch/r;->a:Ll0/u;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lch/r;->b:Lcoil/compose/AsyncImagePainter;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lch/r;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lch/r;->d:Lb2/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lch/r;->e:Ly2/k;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    const/high16 v0, 0x3f800000    # 1.0f

    const/16 v2, 0x3c1

    invoke-static {v0, v1, v2}, Ld;->a(FII)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RealSubcomposeAsyncImageScope(parentScope="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lch/r;->a:Ll0/u;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", painter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lch/r;->b:Lcoil/compose/AsyncImagePainter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lch/r;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lch/r;->d:Lb2/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lch/r;->e:Ly2/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha=1.0, colorFilter=null, clipToBounds=true)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
