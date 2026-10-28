.class public final synthetic Lt30/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;I)V
    .locals 0

    iput p2, p0, Lt30/c;->w:I

    iput-object p1, p0, Lt30/c;->x:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lt30/c;->w:I

    iget-object v1, p0, Lt30/c;->x:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d064a

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a04ca

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v2, :cond_0

    new-instance v1, Lk30/a;

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-direct {v1, v0, v2}, Lk30/a;-><init>(Landroid/widget/FrameLayout;Landroidx/fragment/app/FragmentContainerView;)V

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->y:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/n;

    invoke-virtual {v0}, Lt30/n;->B()Lk30/b;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->z:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk30/a;

    iget-object v0, v0, Lk30/a;->b:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentContainerView;->getFragment()Landroidx/fragment/app/m0;

    move-result-object v0

    check-cast v0, Lt30/n;

    return-object v0

    :pswitch_2
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    new-instance v2, Ln30/c;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v0, "getApplicationContext(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ln30/f;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v0

    iget-object v0, v0, Lt30/s;->x:Lr30/b;

    iget-object v0, v0, Lr30/b;->z:Lq30/q0;

    invoke-direct {v4, v0}, Ln30/f;-><init>(Lq30/q0;)V

    const/4 v6, 0x0

    const/16 v7, 0xfc

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ln30/c;-><init>(Landroid/content/Context;Ln30/f;Lq83/j;Lx30/s0;I)V

    return-object v2

    :pswitch_3
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    new-instance v0, Lt30/r;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v2

    iget-object v2, v2, Lt30/s;->y:Lm30/h;

    invoke-direct {v0, v1, v2}, Lt30/r;-><init>(Landroid/content/Context;Lm30/h;)V

    return-object v0

    :pswitch_4
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    new-instance v0, Lq30/g0;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v2

    iget v2, v2, Lt30/s;->F:I

    iget-object v3, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->F:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq30/v0;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v1

    iget-object v1, v1, Lt30/s;->x:Lr30/b;

    invoke-direct {v0, v2, v3, v1}, Lq30/g0;-><init>(ILq30/v0;Lr30/b;)V

    return-object v0

    :pswitch_5
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    new-instance v0, Lt30/y;

    invoke-direct {v0, v1}, Lt30/y;-><init>(Landroidx/fragment/app/r0;)V

    return-object v0

    :pswitch_6
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v1, "extra_args"

    const-class v2, Lt30/s;

    invoke-static {v0, v2, v1}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Lt30/s;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    new-instance v0, Ls40/r0;

    iget-object v2, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->E:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq30/k;

    iget-object v3, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->w:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq30/g0;

    iget-object v1, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->x:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln30/d;

    invoke-direct {v0, v2, v3, v1}, Ls40/r0;-><init>(Lq30/k;Lq30/g0;Ln30/d;)V

    return-object v0

    :pswitch_8
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    const-string v2, "workContext"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v2

    iget-object v2, v2, Lt30/s;->z:Lq30/n;

    iget-object v2, v2, Lq30/n;->z:Ljava/lang/String;

    iget-object v1, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->x:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln30/d;

    const-string v3, "acsUrl"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "errorReporter"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lq30/v0;

    new-instance v4, Lq30/w0;

    invoke-direct {v4, v2, v1, v0}, Lq30/w0;-><init>(Ljava/lang/String;Ln30/d;Lq83/j;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-direct {v3, v4, v1, v0}, Lq30/v0;-><init>(Lq30/w0;Ln30/d;Lq83/j;)V

    return-object v3

    :pswitch_9
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    new-instance v0, Lq30/j;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v2

    iget-object v2, v2, Lt30/s;->x:Lr30/b;

    iget-object v3, v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->x:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln30/d;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->p()Lt30/s;

    move-result-object v1

    iget-object v1, v1, Lt30/s;->E:Lq30/r0;

    sget-object v4, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    invoke-direct {v0, v2, v3, v1, v4}, Lq30/j;-><init>(Lr30/b;Ln30/d;Lq30/r0;Lq83/j;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
