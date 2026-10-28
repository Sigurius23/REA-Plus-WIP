.class public final synthetic Lqt2/e;
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
    iput p1, p0, Lqt2/e;->w:I

    iput-object p2, p0, Lqt2/e;->x:Ljava/lang/Object;

    iput-object p3, p0, Lqt2/e;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lqt2/e;->w:I

    iput-object p1, p0, Lqt2/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lqt2/e;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lqt2/e;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Lqt2/e;->y:Ljava/lang/Object;

    iget-object v4, v0, Lqt2/e;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v4, Landroid/content/Context;

    move-object v6, v3

    check-cast v6, Lcom/stripe/android/view/ShippingInfoWidget;

    sget v1, Lcom/stripe/android/view/ShippingInfoWidget;->T:I

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d063d

    invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v1, 0x7f0a0357

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/stripe/android/view/CountryTextInputLayout;

    if-eqz v7, :cond_0

    const v1, 0x7f0a0440

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/view/StripeEditText;

    if-eqz v8, :cond_0

    const v1, 0x7f0a0441

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/stripe/android/view/StripeEditText;

    if-eqz v9, :cond_0

    const v1, 0x7f0a0443

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/stripe/android/view/StripeEditText;

    if-eqz v10, :cond_0

    const v1, 0x7f0a0446

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/stripe/android/view/StripeEditText;

    if-eqz v11, :cond_0

    const v1, 0x7f0a0447

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/stripe/android/view/StripeEditText;

    if-eqz v12, :cond_0

    const v1, 0x7f0a0449

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/stripe/android/view/StripeEditText;

    if-eqz v13, :cond_0

    const v1, 0x7f0a044a

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/stripe/android/view/StripeEditText;

    if-eqz v14, :cond_0

    const v1, 0x7f0a0c96

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v15, :cond_0

    const v1, 0x7f0a0c97

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v16, :cond_0

    const v1, 0x7f0a0c99

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v17, :cond_0

    const v1, 0x7f0a0c9c

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v18, :cond_0

    const v1, 0x7f0a0c9d

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v19, :cond_0

    const v1, 0x7f0a0c9f

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v20, :cond_0

    const v1, 0x7f0a0ca0

    invoke-static {v6, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v21, :cond_0

    new-instance v5, Liz/b;

    invoke-direct/range {v5 .. v21}, Liz/b;-><init>(Landroid/view/View;Lcom/stripe/android/view/CountryTextInputLayout;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v5

    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_0
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Ls32/a;

    invoke-static {v4, v3}, Ls32/c;->h(Lkotlin/jvm/functions/Function1;Ls32/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v3, Ls31/e;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4}, Ls31/c;->e(Ls31/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Ls21/h;

    invoke-static {v4, v3}, Ls21/g;->f(Lkotlin/jvm/functions/Function1;Ls21/h;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Ls01/d;

    invoke-static {v4, v3}, Ls01/f;->e(Lkotlin/jvm/functions/Function1;Ls01/d;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Ljava/lang/Integer;

    invoke-static {v4, v3}, Lry2/f;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    return-object v1

    :pswitch_5
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lty2/a$d;

    invoke-static {v4, v3}, Lry2/e;->m(Lkotlin/jvm/functions/Function1;Lty2/a$d;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lty2/a$c;

    invoke-static {v4, v3}, Lry2/e;->t(Lkotlin/jvm/functions/Function1;Lty2/a$c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lty2/a$i;

    invoke-static {v4, v3}, Lry2/e;->j(Lkotlin/jvm/functions/Function1;Lty2/a$i;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    check-cast v4, Llz2/b;

    check-cast v3, Lc93/a;

    invoke-static {v4, v3}, Lry2/a;->a(Llz2/b;Lc93/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lry0/d;

    invoke-static {v4, v3}, Lry0/a;->b(Lkotlin/jvm/functions/Function1;Lry0/d;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    check-cast v4, Lms0/c;

    check-cast v3, Lc93/a;

    invoke-static {v4, v3}, Lrs0/e;->a(Lms0/c;Lc93/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    check-cast v4, Lc93/m;

    check-cast v3, Lm91/n;

    invoke-static {v4, v3}, Lrm1/f;->a(Lc93/m;Lm91/n;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    check-cast v4, Luh/e;

    check-cast v3, Lj93/d;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lcom/whoop/educationModels/StickyButton;

    invoke-static {v4, v3}, Lre1/m;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/educationModels/StickyButton;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_e
    check-cast v3, Lcom/whoop/design/model/FeatureEducationCtaButton;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4}, Lre1/j;->c(Lcom/whoop/design/model/FeatureEducationCtaButton;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    check-cast v4, Lr51/d;

    check-cast v3, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v4, v3}, Lr51/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v4, Ljc/v;

    check-cast v3, Ljava/util/UUID;

    iget-object v1, v4, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    const-string v5, "getWorkDatabase(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lr5/b;

    const/4 v6, 0x5

    invoke-direct {v5, v6, v4, v3}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Landroidx/room/z0;->runInTransaction(Ljava/lang/Runnable;)V

    iget-object v3, v4, Ljc/v;->b:Lic/b;

    iget-object v4, v4, Ljc/v;->e:Ljava/util/List;

    invoke-static {v3, v1, v4}, Ljc/k;->b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-object v2

    :pswitch_11
    check-cast v4, Lbc3/c0;

    check-cast v3, Lf0/r1;

    invoke-static {v4, v3}, Lr90/h;->g(Lbc3/c0;Lf0/r1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lr81/d;

    invoke-static {v4, v3}, Lr81/b;->d(Lkotlin/jvm/functions/Function1;Lr81/d;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    check-cast v3, Lr80/e;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4}, Lr80/d;->c(Lr80/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lr21/c;

    invoke-static {v4, v3}, Lr21/d;->a(Lkotlin/jvm/functions/Function1;Lr21/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v4, Lr20/d;

    invoke-virtual {v4, v3}, Lr20/d;->f(Ljava/lang/Object;)V

    return-object v2

    :pswitch_16
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lqy0/h;

    invoke-static {v4, v3}, Lqy0/d;->a(Lkotlin/jvm/functions/Function1;Lqy0/h;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lpu2/a;

    invoke-static {v4, v3}, Lqu2/h;->H(Lkotlin/jvm/functions/Function1;Lpu2/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lhu2/a$u;

    invoke-static {v4, v3}, Lqu2/h;->I(Lkotlin/jvm/functions/Function1;Lhu2/a$u;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lqt2/v;

    invoke-static {v4, v3}, Lqt2/x;->b(Lkotlin/jvm/functions/Function1;Lqt2/v;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lqt2/r;

    invoke-static {v4, v3}, Lqt2/s;->a(Lkotlin/jvm/functions/Function1;Lqt2/r;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lqt2/m;

    invoke-static {v4, v3}, Lqt2/n;->a(Lkotlin/jvm/functions/Function1;Lqt2/m;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lqt2/d;

    invoke-static {v4, v3}, Lqt2/f;->a(Lkotlin/jvm/functions/Function1;Lqt2/d;)Ll83/a0;

    move-result-object v1

    return-object v1

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
