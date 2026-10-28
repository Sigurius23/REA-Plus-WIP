.class public final Lb30/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:F

.field public final c:F


# direct methods
.method public constructor <init>(Ljava/util/List;FF)V
    .locals 1

    sget v0, Lb30/n2;->a:F

    const-string v0, "paymentMethodCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/a;->a:Ljava/util/List;

    iput p2, p0, Lb30/a;->b:F

    iput p3, p0, Lb30/a;->c:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lb30/a;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lb30/a;

    iget-object v0, p0, Lb30/a;->a:Ljava/util/List;

    iget-object v1, p1, Lb30/a;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Lb30/a;->b:F

    iget v1, p1, Lb30/a;->b:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lb30/a;->c:F

    iget p1, p1, Lb30/a;->c:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget p1, Lb30/n2;->a:F

    invoke-static {p1, p1}, Ly3/f;->b(FF)Z

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

    iget-object v0, p0, Lb30/a;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lb30/a;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lb30/a;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    sget v1, Lb30/n2;->a:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lb30/a;->b:F

    invoke-static {v0}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lb30/a;->c:F

    invoke-static {v1}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v1

    sget v2, Lb30/n2;->a:F

    invoke-static {v2}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v2

    const-string v3, ", tabWidth="

    const-string v4, ", screenWidth="

    const-string v5, "AddPaymentMethodInitialVisibilityTrackerData(paymentMethodCodes="

    iget-object v6, p0, Lb30/a;->a:Ljava/util/List;

    invoke-static {v5, v3, v0, v4, v6}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", innerPadding="

    const-string v4, ")"

    invoke-static {v0, v1, v3, v2, v4}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
