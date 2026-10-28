.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final M:Lkc3/d;


# instance fields
.field public final E:Ll83/p;

.field public final F:Ll83/p;

.field public final G:Landroidx/lifecycle/y1;

.field public final H:Ll83/p;

.field public final I:Ll83/p;

.field public final J:Ll83/p;

.field public K:Lt30/q;

.field public L:Lr30/e;

.field public final w:Ll83/p;

.field public final x:Ll83/p;

.field public final y:Ll83/p;

.field public final z:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lt30/c;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->w:Ll83/p;

    new-instance v0, Lt30/c;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->x:Ll83/p;

    new-instance v0, Lt30/c;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->y:Ll83/p;

    new-instance v0, Lt30/c;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance v0, Lt30/c;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->z:Ll83/p;

    new-instance v0, Lt30/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->E:Ll83/p;

    new-instance v0, Lt30/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->F:Ll83/p;

    new-instance v0, Lt30/c;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lt30/g;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lt30/e;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lt30/e;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    new-instance v4, Lt30/e;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lt30/e;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->G:Landroidx/lifecycle/y1;

    new-instance v0, Lt30/c;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->H:Ll83/p;

    new-instance v0, Lt30/c;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->I:Ll83/p;

    new-instance v0, Lt30/c;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lt30/c;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->J:Ll83/p;

    sget-object v0, Lq30/u0;->y:Lq30/u0;

    if-nez v0, :cond_0

    new-instance v0, Lq30/u0;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lq30/u0;-><init>(I)V

    :cond_0
    sget-object v1, Lq30/u0;->y:Lq30/u0;

    if-nez v1, :cond_1

    sput-object v0, Lq30/u0;->y:Lq30/u0;

    :cond_1
    iget-object v0, v0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ServiceLoader;

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final o()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->I:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/y;

    iget-object v0, v0, Lt30/y;->a:Landroidx/fragment/app/r0;

    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-static {v0, v1}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_1
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_a

    const-string v1, "extra_args"

    const-class v2, Lt30/s;

    invoke-static {v0, v2, v1}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v1

    iget-object v3, v1, Lt30/s;->y:Lm30/h;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->w:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lq30/g0;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->F:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lq30/v0;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->x:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ln30/d;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->E:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lq30/k;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v1

    iget-object v9, v1, Lt30/s;->G:Lq30/n0;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v1

    iget-object v1, v1, Lt30/s;->w:Lr30/e;

    iget-object v8, v1, Lr30/e;->E:Lr30/j;

    new-instance v2, Lt30/o;

    invoke-direct/range {v2 .. v9}, Lt30/o;-><init>(Lm30/h;Lq30/g0;Lq30/v0;Ln30/d;Lq30/k;Lr30/j;Lq30/n0;)V

    iput-object v2, v0, Landroidx/fragment/app/o1;->B:Landroidx/fragment/app/w0;

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    new-instance v1, Lg/a0;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lg/a0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lg/z;->b(Lg/t;)Lg/y;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->z:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk30/a;

    iget-object v0, v0, Lk30/a;->a:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->H:Landroidx/lifecycle/u0;

    new-instance v1, Lt30/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lt30/b;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    new-instance v2, Lt30/d;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->J:Landroidx/lifecycle/u0;

    new-instance v1, Lt30/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lt30/b;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    new-instance v2, Lt30/d;

    invoke-direct {v2, v1, v3}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v0

    iget-object v0, v0, Lt30/s;->y:Lm30/h;

    iget-object v0, v0, Lm30/h;->w:Lm30/g;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v1

    iget-object v1, v1, Lt30/s;->y:Lm30/h;

    sget-object v2, Lm30/j;->z:Lm30/j;

    invoke-virtual {v1, v2}, Lm30/h;->b(Lm30/j;)Lm30/b;

    move-result-object v1

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v5, v3

    goto/16 :goto_3

    :cond_0
    new-instance v4, Lq/d;

    const v5, 0x7f1502bc

    invoke-direct {v4, p0, v5}, Lq/d;-><init>(Landroid/content/Context;I)V

    new-instance v5, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    const/4 v6, 0x6

    invoke-direct {v5, v4, v3, v6}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v4, 0x0

    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/material/button/MaterialButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v5, v1}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setButtonCustomization(Lm30/b;)V

    new-instance v1, Lm/a;

    const/4 v6, -0x2

    invoke-direct {v1, v6, v6}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const v6, 0x800015

    iput v6, v1, Lm/a;->a:I

    invoke-virtual {v2, v5, v1}, Lm/b;->m(Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lm/a;)V

    invoke-virtual {v2}, Lm/b;->p()V

    const v1, 0x7f140f5c

    if-eqz v0, :cond_7

    iget-object v6, v0, Lm30/g;->F:Ljava/lang/String;

    iget-object v7, v0, Lm30/g;->z:Ljava/lang/String;

    iget-object v8, v0, Lm30/g;->G:Ljava/lang/String;

    if-eqz v8, :cond_2

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lm30/g;->G:Ljava/lang/String;

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_1
    if-eqz v7, :cond_4

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-direct {v1, v8}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v1}, Lm/b;->l(Landroid/graphics/drawable/ColorDrawable;)V

    iget-object v1, v0, Lm30/g;->E:Ljava/lang/String;

    const/16 v8, 0x22

    if-eqz v1, :cond_3

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v4, v8, :cond_4

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_2

    :cond_3
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v9

    int-to-float v9, v9

    const v10, 0x3f4ccccd    # 0.8f

    mul-float/2addr v9, v10

    float-to-int v9, v9

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v11

    int-to-float v11, v11

    mul-float/2addr v11, v10

    float-to-int v11, v11

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v10

    float-to-int v1, v1

    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v9

    const/16 v10, 0xff

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-static {v11, v10}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v7, v9, v11, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v4, v8, :cond_4

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_4
    :goto_2
    if-eqz v6, :cond_5

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    const v1, 0x7f140f5d

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_6
    invoke-static {p0, v6, v0}, Ls30/b;->c(Lm/m;Ljava/lang/String;Lm30/c;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v2, v0}, Lm/b;->w(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Lm/b;->v()V

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_3
    if-eqz v5, :cond_8

    new-instance v0, Lb13/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1, v5, p0}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->O:Lt30/f;

    new-instance v1, Lt30/b;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lt30/b;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    new-instance v2, Lt30/d;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    if-nez p1, :cond_9

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v0

    iget-object v0, v0, Lt30/s;->w:Lr30/e;

    const-string v1, "cres"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lt30/g;->N:Lt30/f;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    :cond_9
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object p1

    new-instance v0, Ls40/c0;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v3, v1}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object p1, Lq83/k;->w:Lq83/k;

    invoke-static {p1, v0}, Landroidx/lifecycle/x1;->c(Lq83/j;Lc93/m;)Landroidx/lifecycle/j;

    move-result-object p1

    new-instance v0, Lt30/b;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lt30/b;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V

    new-instance v1, Lt30/d;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object p1

    iget-object p1, p1, Lt30/s;->w:Lr30/e;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->L:Lr30/e;

    return-void

    :cond_a
    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Lm/m;->onDestroy()V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->K:Lt30/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->K:Lt30/q;

    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->y:Ls30/d;

    check-cast v0, Ls30/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ls30/c;->b:Lm40/d;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    return-void
.end method

.method public final onPause()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/r0;->onPause()V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lt30/g;->P:Z

    sget-object v0, Lr30/j;->y:Lng3/o;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->L:Lr30/e;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lr30/e;->E:Lr30/j;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lr30/j;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lng3/o;->o(Ljava/lang/String;)Lr30/j;

    move-result-object v0

    sget-object v2, Lr30/j;->G:Lr30/j;

    if-ne v0, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iput-boolean v1, v0, Lt30/g;->Q:Z

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->o()V

    return-void
.end method

.method public final onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/r0;->onResume()V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iget-boolean v0, v0, Lt30/g;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v0}, Landroidx/fragment/app/a2;->f()Ljava/util/List;

    move-result-object v0

    const-string v1, "getFragments(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.views.ChallengeFragment"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lt30/n;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v1

    new-instance v2, Lq30/f;

    invoke-virtual {v0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->getWhitelistingSelection$3ds2sdk_release()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v2, v0}, Lq30/f;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v1, v2}, Lt30/g;->g(Lq30/h;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iget-boolean v0, v0, Lt30/g;->P:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->E:Landroidx/lifecycle/u0;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 0

    invoke-super {p0, p1}, Lg/l;->onTrimMemory(I)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object p1

    iget-object p1, p1, Lt30/g;->y:Ls30/d;

    check-cast p1, Ls30/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ls30/c;->b:Lm40/d;

    invoke-virtual {p1}, Landroid/util/LruCache;->evictAll()V

    return-void
.end method

.method public final p()Lt30/s;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->H:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/s;

    return-object v0
.end method

.method public final r()Lt30/g;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->G:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/g;

    return-object v0
.end method
