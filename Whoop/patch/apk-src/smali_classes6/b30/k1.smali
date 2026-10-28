.class public final Lb30/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Lg40/j0;

.field public final e:Lg40/s3;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLg40/j0;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/k1;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lb30/k1;->b:Z

    iput-boolean p3, p0, Lb30/k1;->c:Z

    iput-object p4, p0, Lb30/k1;->d:Lg40/j0;

    const-string p2, "\u2022\u2022 / \u2022\u2022"

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lg40/t3;->b:Lg40/t3;

    goto :goto_0

    :cond_0
    invoke-virtual {p4, p1}, Lg40/j0;->k(Ljava/lang/String;)Lg40/s3;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lb30/k1;->e:Lg40/s3;

    invoke-interface {p2}, Lg40/s3;->isValid()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ll40/a;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    invoke-static {p2}, Lrv/n;->j(Ll40/a;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lb30/k1;->f:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lb30/k1;Ljava/lang/String;I)Lb30/k1;
    .locals 2

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lb30/k1;->a:Ljava/lang/String;

    :cond_0
    iget-boolean v0, p0, Lb30/k1;->b:Z

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Lb30/k1;->c:Z

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    :goto_0
    iget-object p0, p0, Lb30/k1;->d:Lg40/j0;

    const-string v1, "text"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb30/k1;

    invoke-direct {v1, p1, v0, p2, p0}, Lb30/k1;-><init>(Ljava/lang/String;ZZLg40/j0;)V

    return-object v1
.end method


# virtual methods
.method public final b()Ljava/lang/Integer;
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lb30/k1;->f:Ljava/lang/Object;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpMonth$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll40/a;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll40/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-gt v3, v2, :cond_0

    const/16 v3, 0xc

    if-gt v2, v3, :cond_0

    return-object v1

    :cond_0
    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lb30/k1;->f:Ljava/lang/Object;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpYear$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll40/a;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll40/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/16 v3, 0x7d0

    if-gt v3, v2, :cond_0

    const/16 v3, 0x834

    if-gt v2, v3, :cond_0

    return-object v1

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb30/k1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb30/k1;

    iget-object v1, p0, Lb30/k1;->a:Ljava/lang/String;

    iget-object v3, p1, Lb30/k1;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lb30/k1;->b:Z

    iget-boolean v3, p1, Lb30/k1;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lb30/k1;->c:Z

    iget-boolean v3, p1, Lb30/k1;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lb30/k1;->d:Lg40/j0;

    iget-object p1, p1, Lb30/k1;->d:Lg40/j0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lb30/k1;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lb30/k1;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lb30/k1;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lb30/k1;->d:Lg40/j0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", enabled="

    const-string v1, ", validating="

    const-string v2, "ExpiryDateState(text="

    iget-object v3, p0, Lb30/k1;->a:Ljava/lang/String;

    iget-boolean v4, p0, Lb30/k1;->b:Z

    invoke-static {v2, v3, v0, v1, v4}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lb30/k1;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dateConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/k1;->d:Lg40/j0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
