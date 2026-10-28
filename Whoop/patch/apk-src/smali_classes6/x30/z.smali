.class public final Lx30/z;
.super Lg40/b3;
.source "SourceFile"


# instance fields
.field public final b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final c:Lx30/p0;

.field public final d:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lx30/p0;)V
    .locals 1

    const-string v0, "_identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg40/b3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object p1, p0, Lx30/z;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p2, p0, Lx30/z;->c:Lx30/p0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx30/z;->d:Z

    return-void
.end method


# virtual methods
.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lx30/z;->d:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lx30/z;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lx30/z;

    iget-object v0, p0, Lx30/z;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, p1, Lx30/z;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lx30/z;->c:Lx30/p0;

    iget-object p1, p1, Lx30/z;->c:Lx30/p0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final h(Ljava/util/Map;)V
    .locals 1

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lx30/z;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx30/z;->c:Lx30/p0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final k()Lg40/k1;
    .locals 1

    iget-object v0, p0, Lx30/z;->c:Lx30/p0;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CardNumberElement(_identifier="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lx30/z;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", controller="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx30/z;->c:Lx30/p0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
