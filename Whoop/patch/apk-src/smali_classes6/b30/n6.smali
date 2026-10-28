.class public final Lb30/n6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq20/a;

.field public final b:Lux/j;

.field public final c:Z

.field public final d:Lv00/j0;

.field public final e:Lux/b;

.field public final f:Ljava/util/List;


# direct methods
.method public constructor <init>(Lh20/e2;Lh20/l1;Lv00/j0;Lux/b;Ljava/util/List;)V
    .locals 5

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/j;->A(Lh20/e2;)Lq20/a;

    move-result-object p1

    iget-object v0, p2, Lh20/l1;->z:Lh20/j1;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    sget-object v1, Lux/i;->y:Lux/i;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v1, Lux/i;->x:Lux/i;

    :goto_0
    new-instance v3, Lux/j;

    sget-object v4, Lh20/j1;->y:Lh20/j1;

    if-ne v0, v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lh20/l1;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    move v0, v2

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p2}, Lh20/l1;->i()Z

    move-result p2

    invoke-direct {v3, v0, v1, p2}, Lux/j;-><init>(ZLux/i;Z)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/n6;->a:Lq20/a;

    iput-object v3, p0, Lb30/n6;->b:Lux/j;

    iput-boolean v2, p0, Lb30/n6;->c:Z

    iput-object p3, p0, Lb30/n6;->d:Lv00/j0;

    iput-object p4, p0, Lb30/n6;->e:Lux/b;

    iput-object p5, p0, Lb30/n6;->f:Ljava/util/List;

    sget-object p1, Lv00/s0;->x:Lt9/c0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lb30/n6;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lb30/n6;

    iget-object v0, p0, Lb30/n6;->a:Lq20/a;

    iget-object v1, p1, Lb30/n6;->a:Lq20/a;

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lb30/n6;->b:Lux/j;

    iget-object v1, p1, Lb30/n6;->b:Lux/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lb30/n6;->c:Z

    iget-boolean v1, p1, Lb30/n6;->c:Z

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lb30/n6;->d:Lv00/j0;

    iget-object v1, p1, Lb30/n6;->d:Lv00/j0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lb30/n6;->e:Lux/b;

    iget-object v1, p1, Lb30/n6;->e:Lux/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lb30/n6;->f:Ljava/util/List;

    iget-object p1, p1, Lb30/n6;->f:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lb30/n6;->a:Lq20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lb30/n6;->b:Lux/j;

    invoke-virtual {v2}, Lux/j;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lb30/n6;->c:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lb30/n6;->d:Lv00/j0;

    iget-object v2, v2, Lv00/j0;->w:Lh20/t1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lb30/n6;->e:Lux/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lb30/n6;->f:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GooglePay(googlePayButtonType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lb30/n6;->a:Lq20/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", billingAddressParameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/n6;->b:Lux/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowCreditCards="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lb30/n6;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cardBrandFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/n6;->d:Lv00/j0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardFundingFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/n6;->e:Lux/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", additionalEnabledNetworks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/n6;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
