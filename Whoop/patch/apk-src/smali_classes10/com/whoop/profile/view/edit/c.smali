.class public final synthetic Lcom/whoop/profile/view/edit/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lcom/whoop/profile/view/edit/c;->w:I

    iput-object p2, p0, Lcom/whoop/profile/view/edit/c;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lcom/whoop/profile/view/edit/c;->w:I

    iget-object v1, p0, Lcom/whoop/profile/view/edit/c;->x:Lp1/c1;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/m8;->c(Lp1/c1;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/m8;->b(Lp1/c1;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/f8;->d(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/f8;->m(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/f8;->a(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/f8;->b(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/u7;->f(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/p7;->b(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/p7;->d(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/p7;->a(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/p7;->j(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/k7;->c(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/x4;->b(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/u3;->f(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/p3;->c(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/z1;->i(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lzc1/z1;->h(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lx31/f;->f(Lp1/c1;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lry2/b;->c(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ly3/k;

    check-cast p2, Ly3/k;

    sget v0, Lg1/o3;->a:F

    iget v0, p2, Ly3/k;->a:I

    iget v2, p2, Ly3/k;->d:I

    iget v3, p2, Ly3/k;->c:I

    iget v4, p2, Ly3/k;->b:I

    iget v5, p1, Ly3/k;->c:I

    iget v6, p1, Ly3/k;->b:I

    iget v7, p1, Ly3/k;->d:I

    iget v8, p1, Ly3/k;->a:I

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    if-lt v0, v5, :cond_0

    :goto_0
    move p1, v10

    goto :goto_1

    :cond_0
    if-gt v3, v8, :cond_1

    move p1, v9

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ly3/k;->c()I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget p1, p1, Ly3/k;->c:I

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/2addr p1, v5

    div-int/lit8 p1, p1, 0x2

    sub-int/2addr p1, v0

    int-to-float p1, p1

    invoke-virtual {p2}, Ly3/k;->c()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    :goto_1
    if-lt v4, v7, :cond_3

    :goto_2
    move v9, v10

    goto :goto_3

    :cond_3
    if-gt v2, v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Ly3/k;->a()I

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v0

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v2, v4

    int-to-float v0, v2

    invoke-virtual {p2}, Ly3/k;->a()I

    move-result p2

    int-to-float p2, p2

    div-float v9, v0, p2

    :goto_3
    invoke-static {p1, v9}, Li2/w0;->l(FF)J

    move-result-wide p1

    new-instance v0, Li2/e1;

    invoke-direct {v0, p1, p2}, Li2/e1;-><init>(J)V

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lep1/c;->f(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/data/onboarding/FeatureEducationType;

    check-cast p2, Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-static {v1, p1, p2}, Lea2/n;->a(Lp1/c1;Lcom/whoop/data/onboarding/FeatureEducationType;Lcom/whoop/data/onboarding/FeatureEducationType;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p1, p2}, Lea2/n;->g(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    check-cast p2, Ljava/lang/String;

    invoke-static {v1, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->r(Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
