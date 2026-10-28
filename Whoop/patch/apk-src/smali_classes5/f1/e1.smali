.class public final Lf1/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/q0;


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:Lf1/u;

.field public final e:Lf1/r;


# direct methods
.method public constructor <init>(ZIILf1/u;Lf1/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lf1/e1;->a:Z

    iput p2, p0, Lf1/e1;->b:I

    iput p3, p0, Lf1/e1;->c:I

    iput-object p4, p0, Lf1/e1;->d:Lf1/u;

    iput-object p5, p0, Lf1/e1;->e:Lf1/r;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lf1/e1;->a:Z

    return v0
.end method

.method public final b()Lf1/r;
    .locals 1

    iget-object v0, p0, Lf1/e1;->e:Lf1/r;

    return-object v0
.end method

.method public final c()Lf1/r;
    .locals 1

    iget-object v0, p0, Lf1/e1;->e:Lf1/r;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lf1/e1;->c:I

    return v0
.end method

.method public final e()Lf1/g;
    .locals 2

    iget v0, p0, Lf1/e1;->b:I

    iget v1, p0, Lf1/e1;->c:I

    if-ge v0, v1, :cond_0

    sget-object v0, Lf1/g;->x:Lf1/g;

    return-object v0

    :cond_0
    if-le v0, v1, :cond_1

    sget-object v0, Lf1/g;->w:Lf1/g;

    return-object v0

    :cond_1
    iget-object v0, p0, Lf1/e1;->e:Lf1/r;

    invoke-virtual {v0}, Lf1/r;->b()Lf1/g;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lf1/q0;)Z
    .locals 5

    iget-object v0, p0, Lf1/e1;->d:Lf1/u;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    instance-of v0, p1, Lf1/e1;

    if-eqz v0, :cond_1

    check-cast p1, Lf1/e1;

    iget v0, p1, Lf1/e1;->b:I

    iget v1, p0, Lf1/e1;->b:I

    if-ne v1, v0, :cond_1

    iget v0, p0, Lf1/e1;->c:I

    iget v1, p1, Lf1/e1;->c:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lf1/e1;->a:Z

    iget-boolean v1, p1, Lf1/e1;->a:Z

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Lf1/e1;->e:Lf1/r;

    iget-object v0, p0, Lf1/e1;->e:Lf1/r;

    iget-wide v1, v0, Lf1/r;->a:J

    iget-wide v3, p1, Lf1/r;->a:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    iget v1, v0, Lf1/r;->c:I

    iget v2, p1, Lf1/r;->c:I

    if-ne v1, v2, :cond_1

    iget v0, v0, Lf1/r;->d:I

    iget p1, p1, Lf1/r;->d:I

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final g(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    return-void
.end method

.method public final getSize()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final h(Lf1/u;)La0/k0;
    .locals 5

    iget-boolean v0, p1, Lf1/u;->c:Z

    iget-object v1, p1, Lf1/u;->b:Lf1/t;

    iget-object v2, p1, Lf1/u;->a:Lf1/t;

    if-nez v0, :cond_0

    iget v3, v2, Lf1/t;->b:I

    iget v4, v1, Lf1/t;->b:I

    if-gt v3, v4, :cond_1

    :cond_0
    if-eqz v0, :cond_2

    iget v2, v2, Lf1/t;->b:I

    iget v1, v1, Lf1/t;->b:I

    if-gt v2, v1, :cond_2

    :cond_1
    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, Lf1/u;->a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;

    move-result-object p1

    :cond_2
    iget-object v0, p0, Lf1/e1;->e:Lf1/r;

    iget-wide v0, v0, Lf1/r;->a:J

    sget-object v2, La0/w;->a:La0/k0;

    new-instance v2, La0/k0;

    invoke-direct {v2}, La0/k0;-><init>()V

    invoke-virtual {v2, v0, v1, p1}, La0/k0;->h(JLjava/lang/Object;)V

    return-object v2
.end method

.method public final i()Lf1/u;
    .locals 1

    iget-object v0, p0, Lf1/e1;->d:Lf1/u;

    return-object v0
.end method

.method public final j()Lf1/r;
    .locals 1

    iget-object v0, p0, Lf1/e1;->e:Lf1/r;

    return-object v0
.end method

.method public final k()Lf1/r;
    .locals 1

    iget-object v0, p0, Lf1/e1;->e:Lf1/r;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lf1/e1;->b:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SingleSelectionLayout(isStartHandle="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lf1/e1;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", crossed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf1/e1;->e()Lf1/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", info=\n\t"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/e1;->e:Lf1/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
