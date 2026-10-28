.class public final Lt20/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lq20/c;

.field public final c:Ly00/p2;

.field public final d:Ls20/a;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Lq20/s;

.field public final l:Li20/b;

.field public final m:Ljava/lang/String;

.field public final n:Lf20/b;

.field public final o:Z

.field public final p:Z

.field public final q:Lh20/i3;

.field public final r:Ljava/lang/String;

.field public final s:Z

.field public final t:Ly00/n;


# direct methods
.method public constructor <init>(ZLq20/c;Ly00/p2;Ls20/a;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/s;Li20/b;Ljava/lang/String;Lf20/b;ZZLh20/i3;Ljava/lang/String;ZLy00/n;)V
    .locals 2

    move-object/from16 v0, p20

    const-string v1, "formArgs"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "clientAttributionMetadata"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lt20/v;->a:Z

    iput-object p2, p0, Lt20/v;->b:Lq20/c;

    iput-object p3, p0, Lt20/v;->c:Ly00/p2;

    iput-object p4, p0, Lt20/v;->d:Ls20/a;

    iput-boolean p5, p0, Lt20/v;->e:Z

    iput-boolean p6, p0, Lt20/v;->f:Z

    iput-boolean p7, p0, Lt20/v;->g:Z

    iput-object p8, p0, Lt20/v;->h:Ljava/lang/String;

    iput-object p9, p0, Lt20/v;->i:Ljava/lang/String;

    iput-object p10, p0, Lt20/v;->j:Ljava/lang/String;

    iput-object p11, p0, Lt20/v;->k:Lq20/s;

    iput-object p12, p0, Lt20/v;->l:Li20/b;

    iput-object p13, p0, Lt20/v;->m:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lt20/v;->n:Lf20/b;

    move/from16 p1, p15

    iput-boolean p1, p0, Lt20/v;->o:Z

    move/from16 p1, p16

    iput-boolean p1, p0, Lt20/v;->p:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lt20/v;->q:Lh20/i3;

    move-object/from16 p1, p18

    iput-object p1, p0, Lt20/v;->r:Ljava/lang/String;

    move/from16 p1, p19

    iput-boolean p1, p0, Lt20/v;->s:Z

    iput-object v0, p0, Lt20/v;->t:Ly00/n;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lt20/v;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lt20/v;

    iget-boolean v0, p0, Lt20/v;->a:Z

    iget-boolean v1, p1, Lt20/v;->a:Z

    if-eq v0, v1, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lt20/v;->b:Lq20/c;

    iget-object v1, p1, Lt20/v;->b:Lq20/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lt20/v;->c:Ly00/p2;

    iget-object v1, p1, Lt20/v;->c:Ly00/p2;

    if-eq v0, v1, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lt20/v;->d:Ls20/a;

    iget-object v1, p1, Lt20/v;->d:Ls20/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-boolean v0, p0, Lt20/v;->e:Z

    iget-boolean v1, p1, Lt20/v;->e:Z

    if-eq v0, v1, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-boolean v0, p0, Lt20/v;->f:Z

    iget-boolean v1, p1, Lt20/v;->f:Z

    if-eq v0, v1, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-boolean v0, p0, Lt20/v;->g:Z

    iget-boolean v1, p1, Lt20/v;->g:Z

    if-eq v0, v1, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-object v0, p0, Lt20/v;->h:Ljava/lang/String;

    iget-object v1, p1, Lt20/v;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lt20/v;->i:Ljava/lang/String;

    iget-object v1, p1, Lt20/v;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lt20/v;->j:Ljava/lang/String;

    iget-object v1, p1, Lt20/v;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    iget-object v0, p0, Lt20/v;->k:Lq20/s;

    iget-object v1, p1, Lt20/v;->k:Lq20/s;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    iget-object v0, p0, Lt20/v;->l:Li20/b;

    iget-object v1, p1, Lt20/v;->l:Li20/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    iget-object v0, p0, Lt20/v;->m:Ljava/lang/String;

    iget-object v1, p1, Lt20/v;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    iget-object v0, p0, Lt20/v;->n:Lf20/b;

    iget-object v1, p1, Lt20/v;->n:Lf20/b;

    if-eq v0, v1, :cond_f

    goto :goto_0

    :cond_f
    iget-boolean v0, p0, Lt20/v;->o:Z

    iget-boolean v1, p1, Lt20/v;->o:Z

    if-eq v0, v1, :cond_10

    goto :goto_0

    :cond_10
    iget-boolean v0, p0, Lt20/v;->p:Z

    iget-boolean v1, p1, Lt20/v;->p:Z

    if-eq v0, v1, :cond_11

    goto :goto_0

    :cond_11
    iget-object v0, p0, Lt20/v;->q:Lh20/i3;

    iget-object v1, p1, Lt20/v;->q:Lh20/i3;

    if-eq v0, v1, :cond_12

    goto :goto_0

    :cond_12
    iget-object v0, p0, Lt20/v;->r:Ljava/lang/String;

    iget-object v1, p1, Lt20/v;->r:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    iget-boolean v0, p0, Lt20/v;->s:Z

    iget-boolean v1, p1, Lt20/v;->s:Z

    if-eq v0, v1, :cond_14

    goto :goto_0

    :cond_14
    iget-object v0, p0, Lt20/v;->t:Ly00/n;

    iget-object p1, p1, Lt20/v;->t:Ly00/n;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_15
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lt20/v;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lt20/v;->b:Lq20/c;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lq20/c;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt20/v;->c:Ly00/p2;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt20/v;->d:Ls20/a;

    invoke-virtual {v3}, Ls20/a;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-boolean v0, p0, Lt20/v;->e:Z

    invoke-static {v3, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lt20/v;->f:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lt20/v;->g:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lt20/v;->h:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt20/v;->i:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt20/v;->j:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt20/v;->k:Lq20/s;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lq20/s;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt20/v;->l:Li20/b;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Li20/b;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt20/v;->m:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lt20/v;->n:Lf20/b;

    if-nez v3, :cond_7

    move v3, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lt20/v;->o:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lt20/v;->p:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lt20/v;->q:Lh20/i3;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lt20/v;->r:Ljava/lang/String;

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v3, v2

    mul-int/2addr v3, v1

    iget-boolean v0, p0, Lt20/v;->s:Z

    invoke-static {v3, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lt20/v;->t:Ly00/n;

    invoke-virtual {v1}, Ly00/n;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Args(instantDebits="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lt20/v;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", incentive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->b:Lq20/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->c:Ly00/p2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formArgs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->d:Ls20/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showCheckbox="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isCompleteFlow="

    const-string v2, ", isPaymentFlow="

    iget-boolean v3, p0, Lt20/v;->e:Z

    iget-boolean v4, p0, Lt20/v;->f:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", stripeIntentId="

    const-string v2, ", clientSecret="

    iget-boolean v3, p0, Lt20/v;->g:Z

    iget-object v4, p0, Lt20/v;->h:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", onBehalfOf="

    const-string v2, ", savedPaymentMethod="

    iget-object v3, p0, Lt20/v;->i:Ljava/lang/String;

    iget-object v4, p0, Lt20/v;->j:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lt20/v;->k:Lq20/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shippingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->l:Li20/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hostedSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", financialConnectionsAvailability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->n:Lf20/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", setAsDefaultPaymentMethodEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", setAsDefaultMatchesSaveForFutureUse="

    const-string v2, ", termsDisplay="

    iget-boolean v3, p0, Lt20/v;->o:Z

    iget-boolean v4, p0, Lt20/v;->p:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    iget-object v1, p0, Lt20/v;->q:Lh20/i3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sellerBusinessName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", forceSetupFutureUseBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lt20/v;->s:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clientAttributionMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/v;->t:Ly00/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
