.class public final synthetic Lt30/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt30/n;


# direct methods
.method public synthetic constructor <init>(Lt30/n;I)V
    .locals 0

    iput p2, p0, Lt30/j;->w:I

    iput-object p1, p0, Lt30/j;->x:Lt30/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lt30/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt30/j;->x:Lt30/n;

    iget-object v1, v0, Lt30/n;->K:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt30/h;

    iget-object v2, v0, Lt30/n;->H:Lr30/e;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    iget-object v0, v0, Lt30/n;->w:Lm30/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "uiCustomization"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v2, Lr30/e;->E:Lr30/j;

    sget-object v5, Lr30/j;->E:Lr30/j;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v4, v5, :cond_0

    move v4, v7

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    new-instance v5, Lt30/t;

    iget-object v1, v1, Lt30/h;->a:Landroidx/fragment/app/r0;

    invoke-direct {v5, v1, v4}, Lt30/t;-><init>(Landroidx/fragment/app/r0;Z)V

    iget-object v1, v2, Lr30/e;->H:Ljava/lang/String;

    iget-object v4, v0, Lm30/h;->x:Lm30/e;

    iget-object v8, v5, Lt30/t;->x:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v8, v1, v4}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->d(Ljava/lang/String;Lm30/e;)V

    goto :goto_2

    :cond_2
    :goto_1
    const/16 v1, 0x8

    invoke-virtual {v8, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    iget-object v1, v2, Lr30/e;->L:Ljava/util/List;

    sget-object v2, Lm30/j;->F:Lm30/j;

    invoke-virtual {v0, v2}, Lm30/h;->b(Lm30/j;)Lm30/b;

    move-result-object v0

    if-eqz v1, :cond_a

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v6, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v4

    invoke-virtual {v4}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    move-object v8, v4

    check-cast v8, Li93/i;

    iget-boolean v8, v8, Li93/i;->y:Z

    if-eqz v8, :cond_a

    move-object v8, v4

    check-cast v8, Lm83/e0;

    invoke-virtual {v8}, Lm83/e0;->nextInt()I

    move-result v8

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lr30/c;

    add-int/lit8 v10, v2, -0x1

    if-ne v8, v10, :cond_3

    move v8, v7

    goto :goto_4

    :cond_3
    move v8, v6

    :goto_4
    const-string v10, "option"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v10, v5, Lt30/t;->w:Z

    if-eqz v10, :cond_4

    new-instance v10, Lgr/a;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v10, v11, v3}, Lgr/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_5

    :cond_4
    new-instance v10, Ltq/b;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v10, v11, v3}, Ltq/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_5
    if-eqz v0, :cond_8

    move-object v11, v0

    check-cast v11, Lm30/d;

    iget-object v11, v11, Lm30/d;->z:Ljava/lang/String;

    if-eqz v11, :cond_6

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_6

    :cond_5
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-static {v11}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    :cond_6
    :goto_6
    move-object v11, v0

    check-cast v11, Lm30/a;

    iget-object v11, v11, Lm30/a;->x:Ljava/lang/String;

    if-eqz v11, :cond_8

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_7

    :cond_7
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_8
    :goto_7
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v11

    invoke-virtual {v10, v11}, Landroid/view/View;->setId(I)V

    invoke-virtual {v10, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v9, v9, Lr30/c;->x:Ljava/lang/String;

    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v10}, Landroid/view/View;->getPaddingTop()I

    move-result v9

    invoke-virtual {v10}, Landroid/view/View;->getPaddingRight()I

    move-result v11

    invoke-virtual {v10}, Landroid/view/View;->getPaddingBottom()I

    move-result v12

    iget v13, v5, Lt30/t;->E:I

    invoke-virtual {v10, v13, v9, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    iget v9, v5, Lt30/t;->G:I

    invoke-virtual {v10, v9}, Landroid/view/View;->setMinimumHeight(I)V

    new-instance v9, Landroid/widget/RadioGroup$LayoutParams;

    const/4 v11, -0x1

    const/4 v12, -0x2

    invoke-direct {v9, v11, v12}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    if-nez v8, :cond_9

    iget v8, v5, Lt30/t;->z:I

    iput v8, v9, Landroid/widget/RadioGroup$LayoutParams;->bottomMargin:I

    :cond_9
    iget v8, v5, Lt30/t;->F:I

    iput v8, v9, Landroid/widget/RadioGroup$LayoutParams;->leftMargin:I

    invoke-virtual {v10, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v8, v5, Lt30/t;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_3

    :cond_a
    return-object v5

    :cond_b
    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :pswitch_0
    iget-object v0, p0, Lt30/j;->x:Lt30/n;

    iget-object v1, v0, Lt30/n;->K:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt30/h;

    iget-object v2, v0, Lt30/n;->H:Lr30/e;

    if-eqz v2, :cond_c

    iget-object v0, v0, Lt30/n;->w:Lm30/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "uiCustomization"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lt30/u;

    iget-object v1, v1, Lt30/h;->a:Landroidx/fragment/app/r0;

    invoke-direct {v3, v1}, Lt30/u;-><init>(Landroidx/fragment/app/r0;)V

    iget-object v1, v2, Lr30/e;->H:Ljava/lang/String;

    invoke-virtual {v3, v1}, Lt30/u;->setTextEntryLabel(Ljava/lang/String;)V

    iget-object v0, v0, Lm30/h;->y:Lm30/i;

    invoke-virtual {v3, v0}, Lt30/u;->setTextBoxCustomization(Lm30/i;)V

    return-object v3

    :cond_c
    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lt30/j;->x:Lt30/n;

    invoke-virtual {v0}, Lt30/n;->B()Lk30/b;

    move-result-object v0

    iget-object v0, v0, Lk30/b;->b:Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    const-string v1, "caBrandZone"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lt30/j;->x:Lt30/n;

    invoke-virtual {v0}, Lt30/n;->B()Lk30/b;

    move-result-object v0

    iget-object v0, v0, Lk30/b;->c:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    const-string v1, "caChallengeZone"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lt30/h;

    iget-object v1, p0, Lt30/j;->x:Lt30/n;

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lt30/h;-><init>(Landroidx/fragment/app/r0;)V

    return-object v0

    :pswitch_4
    new-instance v0, Ls40/r0;

    iget-object v1, p0, Lt30/j;->x:Lt30/n;

    iget-object v2, v1, Lt30/n;->E:Lq30/k;

    iget-object v3, v1, Lt30/n;->x:Lq30/g0;

    iget-object v1, v1, Lt30/n;->z:Ln30/d;

    invoke-direct {v0, v2, v3, v1}, Ls40/r0;-><init>(Lq30/k;Lq30/g0;Ln30/d;)V

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lt30/j;->x:Lt30/n;

    iget-object v0, v0, Lt30/n;->H:Lr30/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    iget-object v0, v0, Lr30/e;->E:Lr30/j;

    if-eqz v0, :cond_d

    iget-object v1, v0, Lr30/j;->w:Ljava/lang/String;

    :cond_d
    if-nez v1, :cond_e

    const-string v1, ""

    :cond_e
    return-object v1

    :cond_f
    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_6
    iget-object v0, p0, Lt30/j;->x:Lt30/n;

    invoke-virtual {v0}, Lt30/n;->B()Lk30/b;

    move-result-object v0

    iget-object v0, v0, Lk30/b;->d:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    const-string v1, "caInformationZone"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lt30/j;->x:Lt30/n;

    iget-object v1, v0, Lt30/n;->K:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt30/h;

    iget-object v0, v0, Lt30/n;->H:Lr30/e;

    if-eqz v0, :cond_10

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lt30/v;

    iget-object v1, v1, Lt30/h;->a:Landroidx/fragment/app/r0;

    invoke-direct {v2, v1}, Lt30/v;-><init>(Landroidx/fragment/app/r0;)V

    iget-object v0, v0, Lr30/e;->y:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lt30/v;->a(Ljava/lang/String;)V

    return-object v2

    :cond_10
    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
