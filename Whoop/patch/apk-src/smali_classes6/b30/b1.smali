.class public final Lb30/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb30/q;

.field public final b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Lb30/k1;


# direct methods
.method public constructor <init>(Lb30/q;ZLjava/util/List;Lb30/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/b1;->a:Lb30/q;

    iput-boolean p2, p0, Lb30/b1;->b:Z

    iput-object p3, p0, Lb30/b1;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb30/b1;->d:Lb30/k1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lb30/b1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lb30/b1;

    iget-object v0, p0, Lb30/b1;->a:Lb30/q;

    iget-object v1, p1, Lb30/b1;->a:Lb30/q;

    invoke-virtual {v0, v1}, Lb30/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lb30/b1;->b:Z

    iget-boolean v1, p1, Lb30/b1;->b:Z

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lb30/b1;->c:Ljava/lang/Object;

    iget-object v1, p1, Lb30/b1;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lb30/b1;->d:Lb30/k1;

    iget-object p1, p1, Lb30/b1;->d:Lb30/k1;

    invoke-virtual {v0, p1}, Lb30/k1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lb30/b1;->a:Lb30/q;

    invoke-virtual {v0}, Lb30/q;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lb30/b1;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lb30/b1;->c:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lb30/b1;->d:Lb30/k1;

    invoke-virtual {v1}, Lb30/k1;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CardDetailsState(selectedCardBrand="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lb30/b1;->a:Lb30/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowCardBrandDropdown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lb30/b1;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", availableNetworks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/b1;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expiryDateState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/b1;->d:Lb30/k1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
