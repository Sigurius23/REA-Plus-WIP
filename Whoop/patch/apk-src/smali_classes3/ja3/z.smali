.class public final Lja3/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Llb3/y;

.field public final b:Llb3/y;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Z

.field public final f:Ljava/util/List;


# direct methods
.method public constructor <init>(Llb3/y;Llb3/y;Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V
    .locals 1

    const-string v0, "valueParameters"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/z;->a:Llb3/y;

    iput-object p2, p0, Lja3/z;->b:Llb3/y;

    iput-object p3, p0, Lja3/z;->c:Ljava/util/List;

    iput-object p4, p0, Lja3/z;->d:Ljava/util/List;

    iput-boolean p5, p0, Lja3/z;->e:Z

    iput-object p6, p0, Lja3/z;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lja3/z;->f:Ljava/util/List;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lja3/z;->e:Z

    return v0
.end method

.method public final c()Llb3/y;
    .locals 1

    iget-object v0, p0, Lja3/z;->b:Llb3/y;

    return-object v0
.end method

.method public final d()Llb3/y;
    .locals 1

    iget-object v0, p0, Lja3/z;->a:Llb3/y;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lja3/z;->d:Ljava/util/List;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lja3/z;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lja3/z;

    iget-object v1, p0, Lja3/z;->a:Llb3/y;

    iget-object v3, p1, Lja3/z;->a:Llb3/y;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lja3/z;->b:Llb3/y;

    iget-object v3, p1, Lja3/z;->b:Llb3/y;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lja3/z;->c:Ljava/util/List;

    iget-object v3, p1, Lja3/z;->c:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lja3/z;->d:Ljava/util/List;

    iget-object v3, p1, Lja3/z;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lja3/z;->e:Z

    iget-boolean v3, p1, Lja3/z;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lja3/z;->f:Ljava/util/List;

    iget-object p1, p1, Lja3/z;->f:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lja3/z;->c:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lja3/z;->a:Llb3/y;

    invoke-virtual {v0}, Llb3/y;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lja3/z;->b:Llb3/y;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Llb3/y;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lja3/z;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lja3/z;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lja3/z;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lja3/z;->f:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MethodSignatureData(returnType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lja3/z;->a:Llb3/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receiverType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lja3/z;->b:Llb3/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", valueParameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lja3/z;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", typeParameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lja3/z;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasStableParameterNames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lja3/z;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", errors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lja3/z;->f:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
