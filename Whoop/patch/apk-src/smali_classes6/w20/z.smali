.class public final Lw20/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ly00/i;

.field public final c:Z

.field public final d:I

.field public final e:Lg40/q3;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly00/i;)V
    .locals 3

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw20/z;->a:Ljava/lang/String;

    iput-object p2, p0, Lw20/z;->b:Ly00/i;

    new-instance v0, Ld0/o2;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ld0/o2;-><init>(I)V

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-virtual {p2}, Ly00/i;->b()I

    move-result v2

    invoke-virtual {v0, p2, v1, p1, v2}, Ld0/o2;->j(Ly00/i;Ljava/util/List;Ljava/lang/String;I)Lg40/s3;

    move-result-object p1

    invoke-interface {p1}, Lg40/s3;->isValid()Z

    move-result p1

    iput-boolean p1, p0, Lw20/z;->c:Z

    sget-object p1, Ly00/i;->Q:Ly00/i;

    if-ne p2, p1, :cond_0

    const p1, 0x7f140fec

    goto :goto_0

    :cond_0
    const p1, 0x7f140fef

    :goto_0
    iput p1, p0, Lw20/z;->d:I

    new-instance p1, Lg40/q3;

    iget p2, p2, Ly00/i;->z:I

    const/4 v0, 0x0

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-direct {p1, p2, v2, v0, v1}, Lg40/q3;-><init>(IZLh02/n0;I)V

    iput-object p1, p0, Lw20/z;->e:Lg40/q3;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lw20/z;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lw20/z;

    iget-object v1, p0, Lw20/z;->a:Ljava/lang/String;

    iget-object v3, p1, Lw20/z;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lw20/z;->b:Ly00/i;

    iget-object p1, p1, Lw20/z;->b:Ly00/i;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lw20/z;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw20/z;->b:Ly00/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CvcState(cvc="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lw20/z;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cardBrand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw20/z;->b:Ly00/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
