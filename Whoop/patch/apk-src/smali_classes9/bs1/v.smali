.class public final synthetic Lbs1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbs1/v;->w:I

    iput-object p2, p0, Lbs1/v;->x:Ljava/lang/Object;

    iput-object p3, p0, Lbs1/v;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lbs1/v;->w:I

    iput-object p1, p0, Lbs1/v;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbs1/v;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lbs1/v;->w:I

    iget-object v1, p0, Lbs1/v;->y:Ljava/lang/Object;

    iget-object v2, p0, Lbs1/v;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Ld11/i;

    check-cast v1, Lc93/a;

    invoke-static {v2, v1}, Ld11/f;->i(Ld11/i;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v2, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    check-cast v1, Lp1/t2;

    invoke-static {v2, v1}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->z(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v2, Lch0/v0;

    check-cast v1, Lc93/a;

    invoke-static {v2, v1}, Lcp0/x0;->F(Lch0/v0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    invoke-static {v2, v1}, Lcom/whoop/profile/view/edit/StateSelectionContentKt;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    invoke-static {v2, v1}, Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lcom/whoop/profile/domain/models/Gender;

    invoke-static {v2, v1}, Lcom/whoop/profile/view/edit/GenderSelectionContentKt;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/Gender;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v2, Leb/a0;

    check-cast v1, Lp1/c1;

    invoke-static {v2, v1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->l(Leb/a0;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lcom/whoop/profile/presentation/edit/EditProfileEvent;

    invoke-static {v2, v1}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-static {v2, v1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->e(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v2, Lc93/m;

    check-cast v1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    invoke-static {v2, v1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->f(Lc93/m;Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v1, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lcom/whoop/profile/view/ProfileHeaderKt;->e(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v1, Lck1/k;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lck1/j;->b(Lck1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lc41/l5;

    invoke-static {v2, v1}, Lc41/k5;->c(Lkotlin/jvm/functions/Function1;Lc41/l5;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v1, Lc41/i5;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/h5;->e(Lc41/i5;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v1, Lc41/a4;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/z3;->b(Lc41/a4;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lc41/w2;

    invoke-static {v2, v1}, Lc41/t2;->a(Lkotlin/jvm/functions/Function1;Lc41/w2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v1, Lc41/p2;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/r2;->c(Lc41/p2;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v1, Lc41/l2;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/j2;->f(Lc41/l2;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v1, Lc41/w1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/v1;->d(Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v1, Lc41/g1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/f1;->b(Lc41/g1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lc41/t0;

    invoke-static {v2, v1}, Lc41/r0;->b(Lkotlin/jvm/functions/Function1;Lc41/t0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v1, Lc41/f0;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/e0;->e(Lc41/f0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lc41/a0;

    invoke-static {v2, v1}, Lc41/y;->a(Lkotlin/jvm/functions/Function1;Lc41/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v1, Lc41/r;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc41/t;->b(Lc41/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v1, Lq2/a;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc31/g;->d(Lq2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    check-cast v1, Lc21/d;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lc21/b;->c(Lc21/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v2, Lc20/a;

    check-cast v1, Landroid/content/Context;

    iget-boolean v0, v2, Lc20/a;->c:Z

    sget-object v2, Lm83/z;->w:Lm83/z;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    :try_start_0
    const-class v3, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;

    const-string v4, "INSTANCE"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "get"

    invoke-virtual {v4, v5, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v3

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "context"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v4, "getApplicationContext(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lyy/j;

    sget-object v5, Lbc3/q0;->a:Lkc3/e;

    sget-object v5, Lkc3/d;->w:Lkc3/d;

    invoke-static {v5}, Ls93/k;->c(Ljava/lang/Object;)V

    sget-object v6, Lqy/e;->b:Lqy/d;

    invoke-direct {v4, v6, v5}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v5, Lb10/b;

    new-instance v6, Lal0/f;

    const/4 v7, 0x1

    invoke-direct {v6, v1, v7}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v5, v1, v7, v6}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object v1, Lb20/e;->O:Lb20/e;

    sget v6, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v3}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v3

    const/4 v6, 0x4

    and-int/lit8 v7, v6, 0x2

    if-eqz v7, :cond_0

    move-object v3, v0

    :cond_0
    and-int/2addr v6, v6

    if-eqz v6, :cond_1

    move-object v0, v2

    :cond_1
    const-string v6, "additionalNonPiiParams"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v3, :cond_2

    move-object v3, v2

    goto :goto_0

    :cond_2
    invoke-static {v3}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object v3

    :goto_0
    invoke-static {v3, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v5, v1, v0}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v4, v0}, Lyy/j;->a(Lyy/b;)V

    :cond_3
    :goto_1
    return-object v2

    :pswitch_1a
    check-cast v1, Lft1/c$g;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lbu1/b;->a(Lft1/c$g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v1, Lbs1/h$b;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lbs1/d0;->c(Lbs1/h$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lds1/n;

    invoke-static {v2, v1}, Lbs1/c0;->Z(Lkotlin/jvm/functions/Function1;Lds1/n;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

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
