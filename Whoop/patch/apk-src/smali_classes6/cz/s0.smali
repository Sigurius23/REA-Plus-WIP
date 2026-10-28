.class public final Lcz/s0;
.super Lcz/t0;
.source "SourceFile"


# instance fields
.field public final c:Lb30/y0;

.field public final d:Z


# direct methods
.method public constructor <init>(Lb30/y0;Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcz/t0;-><init>(ZZ)V

    iput-object p1, p0, Lcz/s0;->c:Lb30/y0;

    iput-boolean p2, p0, Lcz/s0;->d:Z

    return-void
.end method


# virtual methods
.method public final b(Lc93/a;)Lb30/j3;
    .locals 4

    const-string v0, "onEditIconPressed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lb30/j3;

    iget-boolean v0, p0, Lcz/s0;->d:Z

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-instance v2, Lou1/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lou1/a;-><init>(I)V

    invoke-direct {p1, v0, v1, v1, v2}, Lb30/j3;-><init>(ZZZLc93/a;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcz/s0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcz/s0;

    iget-object v0, p0, Lcz/s0;->c:Lb30/y0;

    iget-object v1, p1, Lcz/s0;->c:Lb30/y0;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcz/s0;->d:Z

    iget-boolean p1, p1, Lcz/s0;->d:Z

    if-eq v0, p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcz/s0;->c:Lb30/y0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcz/s0;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UpdatePaymentMethod(updatePaymentMethodInteractor="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcz/s0;->c:Lb30/y0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isLiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcz/s0;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
