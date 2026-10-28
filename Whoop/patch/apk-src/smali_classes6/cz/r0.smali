.class public final Lcz/r0;
.super Lcz/t0;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Lq20/y;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Ljava/lang/String;

.field public final n:Lzy/c;

.field public final o:Z

.field public final p:Lzy/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lq20/y;ZZZZZZZLjava/lang/String;Lzy/c;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p5, v0}, Lcz/t0;-><init>(ZZ)V

    iput-object p1, p0, Lcz/r0;->c:Ljava/lang/String;

    iput-object p2, p0, Lcz/r0;->d:Ljava/util/List;

    iput-object p3, p0, Lcz/r0;->e:Lq20/y;

    iput-boolean p4, p0, Lcz/r0;->f:Z

    iput-boolean p5, p0, Lcz/r0;->g:Z

    iput-boolean p6, p0, Lcz/r0;->h:Z

    iput-boolean p7, p0, Lcz/r0;->i:Z

    iput-boolean p8, p0, Lcz/r0;->j:Z

    iput-boolean p9, p0, Lcz/r0;->k:Z

    iput-boolean p10, p0, Lcz/r0;->l:Z

    iput-object p11, p0, Lcz/r0;->m:Ljava/lang/String;

    iput-object p12, p0, Lcz/r0;->n:Lzy/c;

    iput-boolean p13, p0, Lcz/r0;->o:Z

    const p1, 0x7f14107c

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    iput-object p1, p0, Lcz/r0;->p:Lzy/b;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcz/r0;->g:Z

    return v0
.end method

.method public final b(Lc93/a;)Lb30/j3;
    .locals 6

    const-string v0, "onEditIconPressed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/h3;

    iget-boolean v1, p0, Lcz/r0;->h:Z

    iget-boolean v2, p0, Lcz/r0;->k:Z

    invoke-direct {v0, v1, v2, p1}, Lb30/h3;-><init>(ZZLc93/a;)V

    new-instance p1, Lb30/j3;

    iget-boolean v1, p0, Lcz/r0;->f:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-boolean v3, v0, Lb30/h3;->b:Z

    const/4 v4, 0x0

    if-ne v3, v2, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    iget-boolean v5, v0, Lb30/h3;->a:Z

    if-ne v5, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    iget-object v0, v0, Lb30/h3;->c:Lc93/a;

    if-nez v0, :cond_2

    new-instance v0, Lou1/a;

    const/4 v4, 0x7

    invoke-direct {v0, v4}, Lou1/a;-><init>(I)V

    :cond_2
    invoke-direct {p1, v1, v3, v2, v0}, Lb30/j3;-><init>(ZZZLc93/a;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcz/r0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcz/r0;

    iget-object v1, p0, Lcz/r0;->c:Ljava/lang/String;

    iget-object v3, p1, Lcz/r0;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcz/r0;->d:Ljava/util/List;

    iget-object v3, p1, Lcz/r0;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcz/r0;->e:Lq20/y;

    iget-object v3, p1, Lcz/r0;->e:Lq20/y;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcz/r0;->f:Z

    iget-boolean v3, p1, Lcz/r0;->f:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcz/r0;->g:Z

    iget-boolean v3, p1, Lcz/r0;->g:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcz/r0;->h:Z

    iget-boolean v3, p1, Lcz/r0;->h:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcz/r0;->i:Z

    iget-boolean v3, p1, Lcz/r0;->i:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcz/r0;->j:Z

    iget-boolean v3, p1, Lcz/r0;->j:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcz/r0;->k:Z

    iget-boolean v3, p1, Lcz/r0;->k:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcz/r0;->l:Z

    iget-boolean v3, p1, Lcz/r0;->l:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcz/r0;->m:Ljava/lang/String;

    iget-object v3, p1, Lcz/r0;->m:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcz/r0;->n:Lzy/c;

    iget-object v3, p1, Lcz/r0;->n:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcz/r0;->o:Z

    iget-boolean p1, p1, Lcz/r0;->o:Z

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcz/r0;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Lcz/r0;->d:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Lcz/r0;->e:Lq20/y;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lcz/r0;->f:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v3, p0, Lcz/r0;->g:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v3, p0, Lcz/r0;->h:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v3, p0, Lcz/r0;->i:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v3, p0, Lcz/r0;->j:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v3, p0, Lcz/r0;->k:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v3, p0, Lcz/r0;->l:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Lcz/r0;->m:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lcz/r0;->n:Lzy/c;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Lcz/r0;->o:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", savedPaymentMethods="

    const-string v1, ", paymentSelection="

    const-string v2, "SelectPaymentMethod(title="

    iget-object v3, p0, Lcz/r0;->c:Ljava/lang/String;

    iget-object v4, p0, Lcz/r0;->d:Ljava/util/List;

    invoke-static {v2, v3, v0, v1, v4}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcz/r0;->e:Lq20/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isLiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcz/r0;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isProcessing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isEditing="

    const-string v2, ", showGooglePay="

    iget-boolean v3, p0, Lcz/r0;->g:Z

    iget-boolean v4, p0, Lcz/r0;->h:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", primaryButtonVisible="

    const-string v2, ", canEdit="

    iget-boolean v3, p0, Lcz/r0;->i:Z

    iget-boolean v4, p0, Lcz/r0;->j:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", canRemovePaymentMethods="

    const-string v2, ", errorMessage="

    iget-boolean v3, p0, Lcz/r0;->k:Z

    iget-boolean v4, p0, Lcz/r0;->l:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    iget-object v1, p0, Lcz/r0;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mandateText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcz/r0;->n:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCbcEligible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-boolean v2, p0, Lcz/r0;->o:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
