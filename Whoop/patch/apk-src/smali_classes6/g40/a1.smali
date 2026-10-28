.class public final Lg40/a1;
.super Lg40/b3;
.source "SourceFile"


# instance fields
.field public final b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final c:Ljava/lang/String;

.field public final d:Lg40/m3;

.field public final e:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;I)V
    .locals 4

    const/4 v0, 0x1

    and-int/2addr p3, v0

    if-eqz p3, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    new-instance p3, Lg40/f3;

    new-instance v1, Lg40/z0;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lg40/z0;-><init>(ZI)V

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-direct {p3, v1, p2, v2, v3}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    const-string v1, "identifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg40/b3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object p1, p0, Lg40/a1;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p2, p0, Lg40/a1;->c:Ljava/lang/String;

    iput-object p3, p0, Lg40/a1;->d:Lg40/m3;

    iput-boolean v0, p0, Lg40/a1;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lg40/a1;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lg40/a1;->e:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg40/a1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg40/a1;

    iget-object v1, p0, Lg40/a1;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v3, p1, Lg40/a1;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lg40/a1;->c:Ljava/lang/String;

    iget-object v3, p1, Lg40/a1;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lg40/a1;->d:Lg40/m3;

    iget-object p1, p1, Lg40/a1;->d:Lg40/m3;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lg40/a1;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg40/a1;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg40/a1;->d:Lg40/m3;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final k()Lg40/k1;
    .locals 1

    iget-object v0, p0, Lg40/a1;->d:Lg40/m3;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EmailElement(identifier="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg40/a1;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/a1;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", controller="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/a1;->d:Lg40/m3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
