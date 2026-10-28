.class public final Lx30/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/i1;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:F

.field public final e:Lzy/b;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILjava/util/List;FI)V
    .locals 1

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "mandate"

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    const/16 v0, 0x8

    and-int/2addr p5, v0

    if-eqz p5, :cond_1

    int-to-float p4, v0

    :cond_1
    const-string p5, "identifier"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/e1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p2, p0, Lx30/e1;->b:I

    iput-object p3, p0, Lx30/e1;->c:Ljava/util/List;

    iput p4, p0, Lx30/e1;->d:F

    check-cast p3, Ljava/util/Collection;

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    invoke-interface {p3, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    array-length p3, p1

    invoke-static {p1, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lm83/y;->w:Lm83/y;

    invoke-static {p2, p1, p3}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    iput-object p1, p0, Lx30/e1;->e:Lzy/b;

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lx30/e1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    iget-object v0, p0, Lx30/e1;->e:Lzy/b;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lx30/e1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lx30/e1;

    iget-object v0, p0, Lx30/e1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, p1, Lx30/e1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Lx30/e1;->b:I

    iget v1, p1, Lx30/e1;->b:I

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lx30/e1;->c:Ljava/util/List;

    iget-object v1, p1, Lx30/e1;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Lx30/e1;->d:F

    iget p1, p1, Lx30/e1;->d:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

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

.method public final f()Lec3/f2;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lx30/e1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lx30/e1;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lx30/e1;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Lx30/e1;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lx30/e1;->d:F

    invoke-static {v0}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MandateTextElement(identifier="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lx30/e1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", stringResId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lx30/e1;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", args="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", topPadding="

    const-string v3, ", controller=null)"

    iget-object v4, p0, Lx30/e1;->c:Ljava/util/List;

    invoke-static {v2, v0, v3, v1, v4}, Ly00/t7;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
