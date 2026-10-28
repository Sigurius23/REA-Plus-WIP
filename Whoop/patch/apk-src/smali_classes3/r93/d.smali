.class public final Lr93/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr93/x0;


# instance fields
.field public final w:Lr93/x0;

.field public final x:Lr93/i;

.field public final y:I


# direct methods
.method public constructor <init>(Lr93/x0;Lr93/i;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr93/d;->w:Lr93/x0;

    iput-object p2, p0, Lr93/d;->x:Lr93/i;

    iput p3, p0, Lr93/d;->y:I

    return-void
.end method


# virtual methods
.method public final D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0, p1, p2}, Lr93/k;->T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lr93/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->a()Lr93/x0;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lr93/k;
    .locals 1

    .line 2
    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->a()Lr93/x0;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lr93/x0;
    .locals 1

    .line 3
    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->a()Lr93/x0;

    move-result-object v0

    return-object v0
.end method

.method public final e()Llb3/q0;
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->e()Llb3/q0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g()Lr93/k;
    .locals 1

    iget-object v0, p0, Lr93/d;->x:Lr93/i;

    return-object v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object v0

    return-object v0
.end method

.method public final getIndex()I
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->getIndex()I

    move-result v0

    iget v1, p0, Lr93/d;->y:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final getName()Lva3/h;
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v0

    const-string v1, "getSource(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getUpperBounds()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    const-string v1, "getUpperBounds(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getVariance()Llb3/g1;
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v0

    const-string v1, "getVariance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final i()Llb3/c0;
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/h;->i()Llb3/c0;

    move-result-object v0

    const-string v1, "getDefaultType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final isReified()Z
    .locals 1

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->isReified()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lr93/d;->w:Lr93/x0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "[inner-copy]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()Lkb3/n;
    .locals 2

    iget-object v0, p0, Lr93/d;->w:Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->z()Lkb3/n;

    move-result-object v0

    const-string v1, "getStorageManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
