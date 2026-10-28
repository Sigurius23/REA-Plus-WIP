.class public final Ld30/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Lt20/n;

.field public final e:Ls20/a;

.field public final f:Ljava/util/List;

.field public final g:Lt00/a;

.field public final h:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLt20/n;Ls20/a;Ljava/util/List;Lt00/a;)V
    .locals 1

    const-string v0, "selectedPaymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/g1;->a:Ljava/lang/String;

    iput-boolean p2, p0, Ld30/g1;->b:Z

    iput-boolean p3, p0, Ld30/g1;->c:Z

    iput-object p4, p0, Ld30/g1;->d:Lt20/n;

    iput-object p5, p0, Ld30/g1;->e:Ls20/a;

    iput-object p6, p0, Ld30/g1;->f:Ljava/util/List;

    iput-object p7, p0, Ld30/g1;->g:Lt00/a;

    check-cast p6, Ljava/lang/Iterable;

    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg40/i1;

    iget-boolean p3, p0, Ld30/g1;->c:Z

    invoke-interface {p2, p3}, Lg40/i1;->b(Z)V

    goto :goto_0

    :cond_0
    check-cast p6, Ljava/util/List;

    iput-object p6, p0, Ld30/g1;->h:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld30/g1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld30/g1;

    iget-object v1, p0, Ld30/g1;->a:Ljava/lang/String;

    iget-object v3, p1, Ld30/g1;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ld30/g1;->b:Z

    iget-boolean v3, p1, Ld30/g1;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ld30/g1;->c:Z

    iget-boolean v3, p1, Ld30/g1;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ld30/g1;->d:Lt20/n;

    iget-object v3, p1, Ld30/g1;->d:Lt20/n;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ld30/g1;->e:Ls20/a;

    iget-object v3, p1, Ld30/g1;->e:Ls20/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ld30/g1;->f:Ljava/util/List;

    iget-object v3, p1, Ld30/g1;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ld30/g1;->g:Lt00/a;

    iget-object p1, p1, Ld30/g1;->g:Lt00/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ld30/g1;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ld30/g1;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Ld30/g1;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ld30/g1;->d:Lt20/n;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ld30/g1;->e:Ls20/a;

    invoke-virtual {v0}, Ls20/a;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ld30/g1;->f:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Ld30/g1;->g:Lt00/a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lt00/a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", isProcessing="

    const-string v1, ", isValidating="

    const-string v2, "State(selectedPaymentMethodCode="

    iget-object v3, p0, Ld30/g1;->a:Ljava/lang/String;

    iget-boolean v4, p0, Ld30/g1;->b:Z

    invoke-static {v2, v3, v0, v1, v4}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ld30/g1;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", usBankAccountFormArguments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld30/g1;->d:Lt20/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formArguments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld30/g1;->e:Ls20/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formElements="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld30/g1;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerInformation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld30/g1;->g:Lt00/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
