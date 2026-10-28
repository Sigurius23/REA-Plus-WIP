.class public final synthetic Lt30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V
    .locals 0

    iput p2, p0, Lt30/b;->w:I

    iput-object p1, p0, Lt30/b;->x:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lt30/b;->w:I

    const/4 v1, 0x0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lt30/b;->x:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object p1

    new-instance v0, Lq30/z;

    iget-object v4, v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->L:Lr30/e;

    if-eqz v4, :cond_0

    iget-object v4, v4, Lr30/e;->E:Lr30/j;

    if-eqz v4, :cond_0

    iget-object v1, v4, Lr30/j;->w:Ljava/lang/String;

    :cond_0
    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v4

    iget-object v4, v4, Lt30/s;->w:Lr30/e;

    iget-object v4, v4, Lr30/e;->E:Lr30/j;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v3

    iget-object v3, v3, Lt30/s;->G:Lq30/n0;

    invoke-direct {v0, v1, v4, v3}, Lq30/z;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    iget-object p1, p1, Lt30/g;->I:Landroidx/lifecycle/u0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_2
    return-object v2

    :pswitch_0
    check-cast p1, Lr30/e;

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    iget-object v0, v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->K:Lt30/q;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_3
    iput-object v1, v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->K:Lt30/q;

    if-eqz p1, :cond_6

    invoke-virtual {v3}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v4, "getSupportFragmentManager(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Landroidx/fragment/app/a;

    invoke-direct {v4, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    const v0, 0x7f010057

    const v5, 0x7f010058

    invoke-virtual {v4, v0, v5, v0, v5}, Landroidx/fragment/app/c2;->f(IIII)V

    iget-object v0, v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->z:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk30/a;

    iget-object v0, v0, Lk30/a;->b:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    new-instance v5, Ll83/k;

    const-string v6, "arg_cres"

    invoke-direct {v5, v6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5}, [Ll83/k;

    move-result-object v5

    invoke-static {v5}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v5

    iget-object v6, v4, Landroidx/fragment/app/c2;->a:Landroidx/fragment/app/w0;

    if-eqz v6, :cond_5

    iget-object v7, v4, Landroidx/fragment/app/c2;->b:Ljava/lang/ClassLoader;

    if-eqz v7, :cond_4

    const-class v8, Lt30/n;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroidx/fragment/app/w0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {v4, v0, v6, v1}, Landroidx/fragment/app/c2;->e(ILandroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroidx/fragment/app/a;->j()I

    iput-object p1, v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->L:Lr30/e;

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The FragmentManager must be attached to itshost to create a Fragment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_0
    return-object v2

    :pswitch_1
    check-cast p1, Lq30/a0;

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ll83/k;

    const-string v4, "extra_result"

    invoke-direct {v1, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {v3, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    :cond_7
    return-object v2

    :pswitch_2
    check-cast p1, Lq30/h;

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->o()V

    iget-object v0, v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->J:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lt30/q;

    iget-object v4, v0, Lt30/r;->a:Landroid/content/Context;

    iget-object v0, v0, Lt30/r;->b:Lm30/h;

    invoke-direct {v1, v4, v0}, Lt30/q;-><init>(Landroid/content/Context;Lm30/h;)V

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    iput-object v1, v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->K:Lt30/q;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lt30/g;->g(Lq30/h;)V

    :cond_8
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
