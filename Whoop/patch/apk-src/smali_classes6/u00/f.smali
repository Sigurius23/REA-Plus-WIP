.class public final Lu00/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lzy/c;

.field public final d:I

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Lzy/c;

.field public final j:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIZLzy/b;I)V
    .locals 14

    move/from16 v0, p7

    const v1, 0x7f080819

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_0

    move-object v5, p1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    move v11, v2

    goto :goto_1

    :cond_1
    move/from16 v11, p5

    :goto_1
    and-int/lit16 v2, v0, 0x100

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v12, v3

    goto :goto_2

    :cond_2
    move-object/from16 v12, p6

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    move-object v13, v3

    goto :goto_3

    :cond_3
    move-object v13, v1

    .line 1
    :goto_3
    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticCode"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static/range {p3 .. p3}, Ls4/i;->h(I)Lzy/b;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, p0

    move-object v4, p1

    move/from16 v7, p4

    .line 3
    invoke-direct/range {v3 .. v13}, Lu00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lu00/f;->a:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lu00/f;->b:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lu00/f;->c:Lzy/c;

    .line 14
    iput p4, p0, Lu00/f;->d:I

    .line 15
    iput-object p5, p0, Lu00/f;->e:Ljava/lang/Integer;

    .line 16
    iput-object p6, p0, Lu00/f;->f:Ljava/lang/String;

    .line 17
    iput-object p7, p0, Lu00/f;->g:Ljava/lang/String;

    .line 18
    iput-boolean p8, p0, Lu00/f;->h:Z

    .line 19
    iput-object p9, p0, Lu00/f;->i:Lzy/c;

    .line 20
    iput-object p10, p0, Lu00/f;->j:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/Integer;I)V
    .locals 14

    move/from16 v0, p10

    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v12, v2

    goto :goto_0

    :cond_0
    move-object/from16 v12, p8

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    move-object v13, v2

    goto :goto_1

    :cond_1
    move-object/from16 v13, p9

    :goto_1
    move-object v5, p1

    move-object v3, p0

    move-object v4, p1

    move-object/from16 v6, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p7

    .line 21
    invoke-direct/range {v3 .. v13}, Lu00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V
    .locals 15

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x20

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    move v11, v3

    goto :goto_1

    :cond_1
    move/from16 v11, p6

    :goto_1
    and-int/lit8 v3, v0, 0x40

    if-eqz v3, :cond_2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object/from16 v12, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    move-object v13, v2

    goto :goto_3

    :cond_3
    move-object/from16 v13, p8

    .line 4
    :goto_3
    const-string v0, "paymentMethodDefinition"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {v3}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v0

    iget-object v5, v0, Ly00/f4;->w:Ljava/lang/String;

    .line 6
    invoke-static/range {p3 .. p3}, Ls4/i;->h(I)Lzy/b;

    move-result-object v6

    if-eqz v1, :cond_4

    .line 7
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    goto :goto_4

    :cond_4
    move-object v9, v2

    :goto_4
    if-eqz v1, :cond_5

    .line 8
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_5
    move-object v10, v2

    const/4 v14, 0x2

    move-object v4, p0

    move/from16 v7, p4

    move-object/from16 v8, p5

    .line 9
    invoke-direct/range {v4 .. v14}, Lu00/f;-><init>(Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/Integer;I)V

    return-void
.end method


# virtual methods
.method public final a(Lq20/c;)Lt00/a;
    .locals 10

    if-eqz p1, :cond_0

    iget-object p1, p1, Lq20/c;->x:Ljava/lang/String;

    :goto_0
    move-object v8, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Lt00/a;

    const/4 v2, 0x1

    iget-object v1, p0, Lu00/f;->c:Lzy/c;

    iget v3, p0, Lu00/f;->d:I

    iget-object v4, p0, Lu00/f;->e:Ljava/lang/Integer;

    iget-object v5, p0, Lu00/f;->f:Ljava/lang/String;

    iget-object v6, p0, Lu00/f;->g:Ljava/lang/String;

    iget-boolean v7, p0, Lu00/f;->h:Z

    iget-object v9, p0, Lu00/f;->j:Ljava/lang/Integer;

    invoke-direct/range {v0 .. v9}, Lt00/a;-><init>(Lzy/c;ZILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lu00/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lu00/f;

    iget-object v1, p0, Lu00/f;->a:Ljava/lang/String;

    iget-object v3, p1, Lu00/f;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lu00/f;->b:Ljava/lang/String;

    iget-object v3, p1, Lu00/f;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lu00/f;->c:Lzy/c;

    iget-object v3, p1, Lu00/f;->c:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lu00/f;->d:I

    iget v3, p1, Lu00/f;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lu00/f;->e:Ljava/lang/Integer;

    iget-object v3, p1, Lu00/f;->e:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lu00/f;->f:Ljava/lang/String;

    iget-object v3, p1, Lu00/f;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lu00/f;->g:Ljava/lang/String;

    iget-object v3, p1, Lu00/f;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lu00/f;->h:Z

    iget-boolean v3, p1, Lu00/f;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lu00/f;->i:Lzy/c;

    iget-object v3, p1, Lu00/f;->i:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lu00/f;->j:Ljava/lang/Integer;

    iget-object p1, p1, Lu00/f;->j:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lu00/f;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lu00/f;->c:Lzy/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lu00/f;->d:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lu00/f;->e:Ljava/lang/Integer;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lu00/f;->f:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lu00/f;->g:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lu00/f;->h:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lu00/f;->i:Lzy/c;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lu00/f;->j:Ljava/lang/Integer;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", syntheticCode="

    const-string v1, ", displayName="

    const-string v2, "SupportedPaymentMethod(code="

    iget-object v3, p0, Lu00/f;->a:Ljava/lang/String;

    iget-object v4, p0, Lu00/f;->b:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lu00/f;->c:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconResource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lu00/f;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", iconResourceNight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lightThemeIconUrl="

    const-string v2, ", darkThemeIconUrl="

    iget-object v3, p0, Lu00/f;->e:Ljava/lang/Integer;

    iget-object v4, p0, Lu00/f;->f:Ljava/lang/String;

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", iconRequiresTinting="

    const-string v2, ", subtitle="

    iget-object v3, p0, Lu00/f;->g:Ljava/lang/String;

    iget-boolean v4, p0, Lu00/f;->h:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v1, p0, Lu00/f;->i:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outlinedIconResource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu00/f;->j:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
