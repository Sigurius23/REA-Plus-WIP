.class public final Lx30/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/i1;


# instance fields
.field public final a:Z

.field public final b:Lec3/f2;

.field public final c:Z

.field public final d:Ln53/e;

.field public final e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final f:Lx30/l1;

.field public final g:Z


# direct methods
.method public constructor <init>(ZLec3/h2;Z)V
    .locals 2

    const-string v0, "saveForFutureUseCheckedFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lx30/n1;->a:Z

    iput-object p2, p0, Lx30/n1;->b:Lec3/f2;

    iput-boolean p3, p0, Lx30/n1;->c:Z

    new-instance v0, Lx30/m1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx30/m1;-><init>(Lx30/n1;I)V

    invoke-static {p2, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    iput-object v0, p0, Lx30/n1;->d:Ln53/e;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSetAsDefaultPaymentMethod$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iput-object v0, p0, Lx30/n1;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lx30/l1;

    invoke-direct {v0, p1, p2, p3}, Lx30/l1;-><init>(ZLec3/f2;Z)V

    iput-object v0, p0, Lx30/n1;->f:Lx30/l1;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx30/n1;->g:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lx30/n1;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lx30/n1;->g:Z

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 3

    iget-object v0, p0, Lx30/n1;->f:Lx30/l1;

    iget-object v0, v0, Lx30/l1;->f:Ln53/e;

    new-instance v1, Lx30/m1;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lx30/m1;-><init>(Lx30/n1;I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx30/n1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx30/n1;

    iget-boolean v1, p0, Lx30/n1;->a:Z

    iget-boolean v3, p1, Lx30/n1;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lx30/n1;->b:Lec3/f2;

    iget-object v3, p1, Lx30/n1;->b:Lec3/f2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lx30/n1;->c:Z

    iget-boolean p1, p1, Lx30/n1;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lec3/f2;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lx30/n1;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx30/n1;->b:Lec3/f2;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lx30/n1;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SetAsDefaultPaymentMethodElement(initialValue="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lx30/n1;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", saveForFutureUseCheckedFlow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx30/n1;->b:Lec3/f2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", setAsDefaultMatchesSaveForFutureUse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-boolean v2, p0, Lx30/n1;->c:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
