.class public final Lm00/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls20/a;

.field public final b:Ljava/util/List;

.field public final c:Lh00/o0;

.field public final d:Lzy/c;

.field public final e:Z

.field public final f:Ly00/d5;

.field public final g:Lzy/c;

.field public final h:Ljava/util/List;


# direct methods
.method public constructor <init>(Ls20/a;Ljava/util/List;Lh00/o0;Lzy/c;ZLy00/d5;Lzy/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm00/a;->a:Ls20/a;

    iput-object p2, p0, Lm00/a;->b:Ljava/util/List;

    iput-object p3, p0, Lm00/a;->c:Lh00/o0;

    iput-object p4, p0, Lm00/a;->d:Lzy/c;

    iput-boolean p5, p0, Lm00/a;->e:Z

    iput-object p6, p0, Lm00/a;->f:Ly00/d5;

    iput-object p7, p0, Lm00/a;->g:Lzy/c;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg40/i1;

    iget-boolean p4, p0, Lm00/a;->e:Z

    invoke-interface {p3, p4}, Lg40/i1;->b(Z)V

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lm00/a;->h:Ljava/util/List;

    return-void
.end method

.method public static a(Lm00/a;Lh00/o0;ZLy00/d5;Lzy/c;I)Lm00/a;
    .locals 8

    iget-object v1, p0, Lm00/a;->a:Ls20/a;

    iget-object v2, p0, Lm00/a;->b:Ljava/util/List;

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    iget-object p1, p0, Lm00/a;->c:Lh00/o0;

    :cond_0
    move-object v3, p1

    iget-object v4, p0, Lm00/a;->d:Lzy/c;

    and-int/lit8 p1, p5, 0x10

    if-eqz p1, :cond_1

    iget-boolean p2, p0, Lm00/a;->e:Z

    :cond_1
    move v5, p2

    and-int/lit8 p1, p5, 0x20

    if-eqz p1, :cond_2

    iget-object p3, p0, Lm00/a;->f:Ly00/d5;

    :cond_2
    move-object v6, p3

    and-int/lit8 p1, p5, 0x40

    if-eqz p1, :cond_3

    iget-object p4, p0, Lm00/a;->g:Lzy/c;

    :cond_3
    move-object v7, p4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lm00/a;

    invoke-direct/range {v0 .. v7}, Lm00/a;-><init>(Ls20/a;Ljava/util/List;Lh00/o0;Lzy/c;ZLy00/d5;Lzy/c;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm00/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm00/a;

    iget-object v1, p0, Lm00/a;->a:Ls20/a;

    iget-object v3, p1, Lm00/a;->a:Ls20/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm00/a;->b:Ljava/util/List;

    iget-object v3, p1, Lm00/a;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm00/a;->c:Lh00/o0;

    iget-object v3, p1, Lm00/a;->c:Lh00/o0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm00/a;->d:Lzy/c;

    iget-object v3, p1, Lm00/a;->d:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lm00/a;->e:Z

    iget-boolean v3, p1, Lm00/a;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm00/a;->f:Ly00/d5;

    iget-object v3, p1, Lm00/a;->f:Ly00/d5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lm00/a;->g:Lzy/c;

    iget-object p1, p1, Lm00/a;->g:Lzy/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lm00/a;->a:Ls20/a;

    invoke-virtual {v0}, Ls20/a;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm00/a;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lm00/a;->c:Lh00/o0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lm00/a;->d:Lzy/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lm00/a;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lm00/a;->f:Ly00/d5;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ly00/d5;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm00/a;->g:Lzy/c;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PaymentMethodState(formArguments="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lm00/a;->a:Ls20/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formElements="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm00/a;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButtonState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm00/a;->c:Lh00/o0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButtonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm00/a;->d:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isValidating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lm00/a;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodCreateParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm00/a;->f:Ly00/d5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm00/a;->g:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
