.class public final synthetic Ld1/i;
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

    iput p2, p0, Ld1/i;->w:I

    iput-object p1, p0, Ld1/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ld1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/l;

    invoke-interface {v0}, Ldc3/w;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ldc3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh0/x1;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lh0/p;

    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lgk2/d;

    invoke-static {v0}, Lgk2/d;->a(Lgk2/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lg40/n;

    iget-object v0, v0, Lg40/n;->a:Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lg40/m;

    check-cast v0, Le40/c;

    invoke-interface {v0}, Le40/c;->h()Lc93/a;

    move-result-object v0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/Window;

    invoke-static {v0}, Lg32/k;->r(Landroid/view/Window;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lg20/g;

    const-string v1, "Invalid hashed value! Please provided a hashed payment intent in the correct format!"

    :try_start_0
    iget-object v0, v0, Lg20/g;->E:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v3, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v4, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, v0, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v0, ":"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x6

    invoke-static {v3, v0, v4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    new-instance v0, Lcom/stripe/android/core/exception/GenericStripeException;

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v1, "invalidHashedValueIncorrectFormat"

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/exception/GenericStripeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/n;

    invoke-direct {v1, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v2, Lcom/stripe/android/core/exception/GenericStripeException;

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, "invalidHashedValueNotBase64"

    invoke-direct {v2, v0, v3}, Lcom/stripe/android/core/exception/GenericStripeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v1

    :pswitch_6
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lg1/q2;

    invoke-virtual {v0}, Lg1/q2;->a()Ly3/c;

    move-result-object v0

    sget v1, Lg1/p2;->b:F

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lfy/c;

    iget-object v0, v0, Lfy/c;->x:Ljava/lang/String;

    return-object v0

    :pswitch_8
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    iget-object v0, v0, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->w:Ll8/d;

    return-object v0

    :pswitch_9
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lff/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "failed to resolve region from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lfc0/h;

    invoke-static {v0}, Lfc0/g;->f(Lfc0/h;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lf0/c0;

    iget-object v0, v0, Lf0/c0;->k0:Lc93/a;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_c
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/health/view/HealthTabFragment;

    invoke-static {v0}, Lcom/whoop/health/view/HealthTabFragment;->A(Lcom/whoop/health/view/HealthTabFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;

    invoke-static {v0}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->y(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/TutorialsFragment;

    invoke-static {v0}, Lcom/whoop/settings/TutorialsFragment;->z(Lcom/whoop/settings/TutorialsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    invoke-static {v0}, Le81/k;->j(Lp1/z0;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Le31/c;

    invoke-static {v0}, Le31/b;->b(Le31/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ldy/g;

    iget-object v0, v0, Ldy/g;->x:Ljava/lang/String;

    return-object v0

    :pswitch_12
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;

    iget-object v0, v0, Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;->w:Ll8/d;

    return-object v0

    :pswitch_13
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;

    invoke-static {v0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->z(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    invoke-static {v0}, Ldd1/l;->b(Lorg/joda/time/DateTime;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld80/a;

    invoke-static {v0}, Ld80/e;->k(Ld80/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld51/d;

    invoke-static {v0}, Ld51/d;->a(Ld51/d;)Li93/f;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld30/w;

    iget-object v0, v0, Ld30/w;->k:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_18
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld30/x;

    iget-object v1, v0, Ld30/x;->a:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_a

    iget-object v0, v0, Ld30/x;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    move v0, v3

    goto :goto_3

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/l;

    iget-object v4, v1, Lh20/l;->c:Lh20/r4;

    instance-of v5, v4, Lh20/m4;

    if-eqz v5, :cond_7

    iget-object v1, v1, Lh20/l;->b:Ly00/o4;

    invoke-virtual {v1}, Ly00/o4;->f()Z

    move-result v1

    if-nez v1, :cond_6

    move v1, v3

    goto :goto_2

    :cond_6
    :goto_1
    move v1, v2

    goto :goto_2

    :cond_7
    instance-of v1, v4, Lh20/n4;

    if-eqz v1, :cond_8

    check-cast v4, Lh20/n4;

    iget-object v1, v4, Lh20/n4;->a:Ly00/s2;

    instance-of v1, v1, Ly00/r2;

    goto :goto_2

    :cond_8
    instance-of v1, v4, Lh20/o4;

    if-nez v1, :cond_6

    instance-of v1, v4, Lh20/p4;

    if-nez v1, :cond_6

    sget-object v1, Lh20/q4;->a:Lh20/q4;

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_1

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_2
    if-nez v1, :cond_5

    move v0, v2

    :goto_3
    if-eqz v0, :cond_a

    move v2, v3

    :cond_a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld30/h;

    sget-object v1, Ld30/z;->b:Ld30/z;

    invoke-virtual {v0, v1}, Ld30/h;->a(Lds/p;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld20/l;

    iget-object v0, v0, Ld20/l;->H:Ljava/lang/String;

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld1/o;

    new-instance v1, Landroid/view/inputmethod/BaseInputConnection;

    iget-object v0, v0, Ld1/o;->a:Landroid/view/View;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    return-object v1

    :pswitch_1c
    iget-object v0, p0, Ld1/i;->x:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget-object v0, v0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

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
