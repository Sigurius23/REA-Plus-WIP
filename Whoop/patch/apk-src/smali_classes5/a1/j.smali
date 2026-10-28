.class public final synthetic La1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La1/j;->w:I

    iput-object p1, p0, La1/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    iget v0, p0, La1/j;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, La1/j;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lcz/n0;

    invoke-static {v4}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, La13/h;

    const/4 v5, 0x7

    invoke-direct {v1, v4, v2, v5}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x3

    invoke-static {v0, v2, v2, v1, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v3

    :pswitch_0
    check-cast v4, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;

    invoke-static {v4}, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;->B(Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v4, Lay/t;

    iget-object v0, v4, Lay/t;->w:Ljava/lang/String;

    return-object v0

    :pswitch_2
    check-cast v4, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;

    invoke-static {v4}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->A(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v4, Lmt1/a;

    invoke-static {v4}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->z(Lmt1/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v4, Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;

    invoke-static {v4}, Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;->A(Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v4, Let1/b;

    invoke-static {v4}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->F(Let1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v4, Lcom/whoop/labrador/fragment/LabradorAboutFragment;

    invoke-static {v4}, Lcom/whoop/labrador/fragment/LabradorAboutFragment;->y(Lcom/whoop/labrador/fragment/LabradorAboutFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v4, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;

    invoke-static {v4}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->E(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v4, Lc93/m;

    invoke-static {v4}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->a(Lc93/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v4, Lg2/i;

    invoke-static {v4}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->b(Lg2/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v4, Lcom/whoop/profile/view/ProfileFragment;

    invoke-static {v4}, Lcom/whoop/profile/view/ProfileFragment;->z(Lcom/whoop/profile/view/ProfileFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v4, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;

    invoke-static {v4}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->A(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v4, Lce3/q;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v4, Lce3/q;->X:Lce3/z;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1, v1}, Lce3/z;->s(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lce3/a;->z:Lce3/a;

    invoke-virtual {v4, v1, v1, v0}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    :goto_0
    return-object v3

    :pswitch_d
    check-cast v4, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;

    invoke-static {v4}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;->y(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v4, Lc41/h3;

    invoke-static {v4}, Lc41/f3;->a(Lc41/h3;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v4, Lc11/p;

    invoke-static {v4}, Lc11/h;->q(Lc11/p;)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v4, Lrh/t;

    iget-object v0, v4, Lrh/t;->a:Lrh/q;

    iget-object v0, v0, Lrh/q;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lth/a;

    return-object v0

    :pswitch_11
    check-cast v4, Lbh0/a;

    invoke-static {v4}, Lbh0/a;->c(Lbh0/a;)Ll83/k;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v4, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/view/PurchaseAddOnsFragment;

    invoke-static {v4}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/view/PurchaseAddOnsFragment;->z(Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/view/PurchaseAddOnsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v4, Lbg/k;

    iget-object v0, v4, Lbg/k;->c:Ll83/p;

    iget-object v3, v4, Lbg/k;->a:[B

    iget-object v5, v4, Lbg/k;->b:Ljava/lang/String;

    sget-object v6, Lbg/k;->g:[B

    array-length v7, v6

    move v8, v1

    move v9, v8

    :goto_1
    if-ge v8, v7, :cond_1

    aget-byte v10, v6, v8

    add-int/lit8 v11, v9, 0x1

    aget-byte v9, v3, v9

    if-eq v9, v10, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v8, v8, 0x1

    move v9, v11

    goto :goto_1

    :cond_1
    new-instance v2, Lbg/h;

    array-length v6, v6

    array-length v7, v3

    invoke-static {v6, v7}, Le93/b;->i0(II)Li93/j;

    move-result-object v6

    invoke-static {v3, v6}, Lm83/n;->N0([BLi93/j;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Lbg/h;-><init>([B)V

    :goto_2
    sget-object v3, Lbg/k;->e:Lbg/k;

    invoke-virtual {v4, v3}, Lbg/k;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v0, "::1"

    goto/16 :goto_6

    :cond_2
    sget-object v3, Lbg/k;->f:Lbg/k;

    invoke-virtual {v4, v3}, Lbg/k;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v6, "::"

    if-eqz v3, :cond_3

    move-object v0, v6

    goto/16 :goto_6

    :cond_3
    if-eqz v2, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "::ffff:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_6

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Lbg/i;

    invoke-direct {v3}, Lbg/i;-><init>()V

    new-instance v7, Lbg/i;

    invoke-direct {v7}, Lbg/i;-><init>()V

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/z;

    iget-object v8, v8, Ll83/z;->w:[S

    array-length v9, v8

    move v10, v1

    move v11, v10

    :goto_3
    if-ge v10, v9, :cond_8

    aget-short v12, v8, v10

    add-int/lit8 v13, v11, 0x1

    int-to-short v14, v1

    if-ne v12, v14, :cond_6

    iget v12, v3, Lbg/i;->b:I

    if-nez v12, :cond_5

    iput v11, v3, Lbg/i;->a:I

    :cond_5
    add-int/lit8 v12, v12, 0x1

    iput v12, v3, Lbg/i;->b:I

    iget v11, v7, Lbg/i;->b:I

    if-le v12, v11, :cond_7

    move-object v7, v3

    goto :goto_4

    :cond_6
    new-instance v3, Lbg/i;

    invoke-direct {v3}, Lbg/i;-><init>()V

    :cond_7
    :goto_4
    add-int/lit8 v10, v10, 0x1

    move v11, v13

    goto :goto_3

    :cond_8
    iget v3, v7, Lbg/i;->b:I

    const/4 v8, 0x1

    if-le v3, v8, :cond_9

    iget v3, v7, Lbg/i;->a:I

    invoke-static {v1, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    invoke-virtual {v4, v2, v1}, Lbg/k;->U(Ljava/lang/StringBuilder;Li93/j;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v7, Lbg/i;->a:I

    iget v3, v7, Lbg/i;->b:I

    add-int/2addr v1, v3

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/z;

    iget-object v0, v0, Ll83/z;->w:[S

    array-length v0, v0

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Lbg/k;->U(Ljava/lang/StringBuilder;Li93/j;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/z;

    iget-object v0, v0, Ll83/z;->w:[S

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Li93/j;

    array-length v0, v0

    sub-int/2addr v0, v8

    invoke-direct {v3, v1, v0, v8}, Li93/h;-><init>(III)V

    invoke-virtual {v4, v2, v3}, Lbg/k;->U(Ljava/lang/StringBuilder;Li93/j;)V

    :goto_5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_6
    if-eqz v5, :cond_a

    const/16 v1, 0x25

    invoke-static {v1, v0, v5}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_a
    return-object v0

    :pswitch_14
    check-cast v4, Lb30/q0;

    sget-object v0, Lb30/q5;->b:Lb30/q5;

    invoke-virtual {v4, v0}, Lb30/q0;->b(Lse/b;)V

    return-object v3

    :pswitch_15
    check-cast v4, Lh02/n0;

    sget v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->O:I

    invoke-virtual {v4}, Lh02/n0;->invoke()Ljava/lang/Object;

    return-object v3

    :pswitch_16
    check-cast v4, Landroidx/room/r1;

    invoke-virtual {v4}, Landroidx/room/r1;->a()Lub/h;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v4, Landroidx/lifecycle/j;

    iput-object v2, v4, Landroidx/lifecycle/j;->b:La30/w0;

    return-object v3

    :pswitch_18
    check-cast v4, Lv02/b;

    invoke-static {v4}, Lal0/j;->i(Lv02/b;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v4, Lcom/whoop/sms/settings/view/SmsSettingsFragment;

    invoke-static {v4}, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->z(Lcom/whoop/sms/settings/view/SmsSettingsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v4, Landroid/view/View;

    invoke-static {v4}, La81/o;->v(Landroid/view/View;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v4, Lcom/whoop/activation/feature/orderconfirmation/view/OrderConfirmationFragment;

    invoke-static {v4}, Lcom/whoop/activation/feature/orderconfirmation/view/OrderConfirmationFragment;->z(Lcom/whoop/activation/feature/orderconfirmation/view/OrderConfirmationFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v4, La1/k;

    iget-boolean v0, v4, Lb2/v;->N:Z

    if-eqz v0, :cond_b

    invoke-static {v4}, Lbi/g;->o(La3/n;)Lx0/c;

    move-result-object v0

    goto :goto_7

    :cond_b
    sget-object v0, Lx0/c;->b:Lx0/c;

    :goto_7
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
