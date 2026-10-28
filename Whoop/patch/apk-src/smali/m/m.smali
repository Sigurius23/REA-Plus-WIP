.class public abstract Lm/m;
.super Landroidx/fragment/app/r0;
.source "SourceFile"

# interfaces
.implements Lm/n;
.implements Landroidx/core/app/TaskStackBuilder$SupportParentable;


# static fields
.field private static final DELEGATE_TAG:Ljava/lang/String; = "androidx:appcompat"


# instance fields
.field private mDelegate:Lm/q;

.field private mResources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/r0;-><init>()V

    invoke-virtual {p0}, Lg/l;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    new-instance v1, Lm/k;

    invoke-direct {v1, p0}, Lm/k;-><init>(Lm/m;)V

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2, v1}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V

    new-instance v0, Lm/l;

    invoke-direct {v0, p0}, Lm/l;-><init>(Lm/m;)V

    invoke-virtual {p0, v0}, Lg/l;->addOnContextAvailableListener(Li/b;)V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Lm/m;->n()V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->B()V

    iget-object v1, v0, Lm/a0;->a0:Landroid/view/ViewGroup;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, v0, Lm/a0;->M:Lm/w;

    iget-object p2, v0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm/w;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 8

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lm/a0;->o0:Z

    iget v2, v0, Lm/a0;->s0:I

    const/16 v3, -0x64

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    sget v2, Lm/q;->x:I

    :goto_0
    invoke-virtual {v0, p1, v2}, Lm/a0;->G(Landroid/content/Context;I)I

    move-result v0

    invoke-static {p1}, Lm/q;->h(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1}, Lm/q;->r(Landroid/content/Context;)V

    :cond_1
    invoke-static {p1}, Lm/a0;->u(Landroid/content/Context;)Lb5/g;

    move-result-object v2

    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-static {p1, v0, v2, v5, v4}, Lm/a0;->y(Landroid/content/Context;ILb5/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v3

    :try_start_0
    move-object v6, p1

    check-cast v6, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    :cond_2
    instance-of v3, p1, Lq/d;

    if-eqz v3, :cond_3

    invoke-static {p1, v0, v2, v5, v4}, Lm/a0;->y(Landroid/content/Context;ILb5/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v3

    :try_start_1
    move-object v4, p1

    check-cast v4, Lq/d;

    invoke-virtual {v4, v3}, Lq/d;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    :catch_1
    :cond_3
    sget-boolean v3, Lm/a0;->J0:Z

    if-nez v3, :cond_4

    goto/16 :goto_2

    :cond_4
    new-instance v3, Landroid/content/res/Configuration;

    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    const/4 v4, -0x1

    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    const/4 v4, 0x0

    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v7

    if-nez v7, :cond_18

    new-instance v5, Landroid/content/res/Configuration;

    invoke-direct {v5}, Landroid/content/res/Configuration;-><init>()V

    iput v4, v5, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_1

    :cond_5
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    iget v7, v6, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v4, v4, v7

    if-eqz v4, :cond_6

    iput v7, v5, Landroid/content/res/Configuration;->fontScale:F

    :cond_6
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    iget v7, v6, Landroid/content/res/Configuration;->mcc:I

    if-eq v4, v7, :cond_7

    iput v7, v5, Landroid/content/res/Configuration;->mcc:I

    :cond_7
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    iget v7, v6, Landroid/content/res/Configuration;->mnc:I

    if-eq v4, v7, :cond_8

    iput v7, v5, Landroid/content/res/Configuration;->mnc:I

    :cond_8
    invoke-static {v3, v6, v5}, Lm/u;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    iget v4, v3, Landroid/content/res/Configuration;->touchscreen:I

    iget v7, v6, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v4, v7, :cond_9

    iput v7, v5, Landroid/content/res/Configuration;->touchscreen:I

    :cond_9
    iget v4, v3, Landroid/content/res/Configuration;->keyboard:I

    iget v7, v6, Landroid/content/res/Configuration;->keyboard:I

    if-eq v4, v7, :cond_a

    iput v7, v5, Landroid/content/res/Configuration;->keyboard:I

    :cond_a
    iget v4, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v7, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v4, v7, :cond_b

    iput v7, v5, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->navigation:I

    iget v7, v6, Landroid/content/res/Configuration;->navigation:I

    if-eq v4, v7, :cond_c

    iput v7, v5, Landroid/content/res/Configuration;->navigation:I

    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->navigationHidden:I

    iget v7, v6, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v4, v7, :cond_d

    iput v7, v5, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    iget v7, v6, Landroid/content/res/Configuration;->orientation:I

    if-eq v4, v7, :cond_e

    iput v7, v5, Landroid/content/res/Configuration;->orientation:I

    :cond_e
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v4, 0xf

    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0xf

    if-eq v4, v7, :cond_f

    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_f
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v4, 0xc0

    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0xc0

    if-eq v4, v7, :cond_10

    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_10
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v4, 0x30

    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0x30

    if-eq v4, v7, :cond_11

    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_11
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v4, 0x300

    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0x300

    if-eq v4, v7, :cond_12

    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_12
    invoke-static {v3, v6, v5}, Lx43/j;->z(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0xf

    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0xf

    if-eq v4, v7, :cond_13

    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    :cond_13
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0x30

    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0x30

    if-eq v4, v7, :cond_14

    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    :cond_14
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v7, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v4, v7, :cond_15

    iput v7, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_15
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v7, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v4, v7, :cond_16

    iput v7, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v7, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v4, v7, :cond_17

    iput v7, v5, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :cond_17
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    if-eq v3, v4, :cond_18

    iput v4, v5, Landroid/content/res/Configuration;->densityDpi:I

    :cond_18
    :goto_1
    invoke-static {p1, v0, v2, v5, v1}, Lm/a0;->y(Landroid/content/Context;ILb5/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v0

    new-instance v1, Lq/d;

    const v2, 0x7f15038b

    invoke-direct {v1, p1, v2}, Lq/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v0}, Lq/d;->a(Landroid/content/res/Configuration;)V

    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz p1, :cond_19

    invoke-virtual {v1}, Lq/d;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-static {p1}, Lu4/b;->n(Landroid/content/res/Resources$Theme;)V

    :catch_2
    :cond_19
    move-object p1, v1

    :goto_2
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm/b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lm/b;->j(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->B()V

    iget-object v0, v0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDelegate()Lm/q;
    .locals 2

    iget-object v0, p0, Lm/m;->mDelegate:Lm/q;

    if-nez v0, :cond_0

    sget-object v0, Lm/q;->w:Landroidx/room/u1;

    new-instance v0, Lm/a0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p0, p0}, Lm/a0;-><init>(Landroid/content/Context;Landroid/view/Window;Lm/n;Ljava/lang/Object;)V

    iput-object v0, p0, Lm/m;->mDelegate:Lm/q;

    :cond_0
    iget-object v0, p0, Lm/m;->mDelegate:Lm/q;

    return-object v0
.end method

.method public getDrawerToggleDelegate()Lm/c;
    .locals 2

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lg73/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lg73/a;-><init>(I)V

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    iget-object v1, v0, Lm/a0;->P:Lq/j;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lm/a0;->E()V

    new-instance v1, Lq/j;

    iget-object v2, v0, Lm/a0;->O:Lm/b;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lm/b;->e()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lm/a0;->K:Landroid/content/Context;

    :goto_0
    invoke-direct {v1, v2}, Lq/j;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lm/a0;->P:Lq/j;

    :cond_1
    iget-object v0, v0, Lm/a0;->P:Lq/j;

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    iget-object v0, p0, Lm/m;->mResources:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    sget v1, Ls/v2;->a:I

    :cond_0
    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getSupportActionBar()Lm/b;
    .locals 1

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->E()V

    iget-object v0, v0, Lm/a0;->O:Lm/b;

    return-object v0
.end method

.method public getSupportParentActivityIntent()Landroid/content/Intent;
    .locals 1

    invoke-static {p0}, Landroidx/core/app/NavUtils;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0}, Lm/q;->g()V

    return-void
.end method

.method public final n()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/o1;->o(Landroid/view/View;Landroidx/lifecycle/f2;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/room/c1;->M(Landroid/view/View;Lg/b0;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    invoke-super {p0, p1}, Lg/l;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object p1

    check-cast p1, Lm/a0;

    iget-boolean v0, p1, Lm/a0;->f0:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lm/a0;->Z:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm/a0;->E()V

    iget-object v0, p1, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm/b;->g()V

    :cond_0
    invoke-static {}, Ls/p;->a()Ls/p;

    move-result-object v0

    iget-object v1, p1, Lm/a0;->K:Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Ls/p;->a:Ls/c2;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, v2, Ls/c2;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/y;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, La0/y;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    new-instance v0, Landroid/content/res/Configuration;

    iget-object v1, p1, Lm/a0;->K:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p1, Lm/a0;->r0:Landroid/content/res/Configuration;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lm/a0;->s(ZZ)Z

    iget-object p1, p0, Lm/m;->mResources:Landroid/content/res/Resources;

    if-eqz p1, :cond_2

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v1, p0, Lm/m;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_2
    return-void

    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public onContentChanged()V
    .locals 0

    invoke-virtual {p0}, Lm/m;->onSupportContentChanged()V

    return-void
.end method

.method public onCreateSupportNavigateUpTaskStack(Landroidx/core/app/TaskStackBuilder;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroidx/core/app/TaskStackBuilder;->addParentStack(Landroid/app/Activity;)Landroidx/core/app/TaskStackBuilder;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/r0;->onDestroy()V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0}, Lm/q;->j()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onLocalesChanged(Lb5/g;)V
    .locals 0

    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/r0;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lm/b;->d()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lm/m;->onSupportNavigateUp()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onNightModeChanged(I)V
    .locals 0

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lg/l;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object p1

    check-cast p1, Lm/a0;

    invoke-virtual {p1}, Lm/a0;->B()V

    return-void
.end method

.method public onPostResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/r0;->onPostResume()V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->E()V

    iget-object v0, v0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lm/b;->u(Z)V

    :cond_0
    return-void
.end method

.method public onPrepareSupportNavigateUpTaskStack(Landroidx/core/app/TaskStackBuilder;)V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/r0;->onStart()V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lm/a0;->s(ZZ)Z

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/r0;->onStop()V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->E()V

    iget-object v0, v0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm/b;->u(Z)V

    :cond_0
    return-void
.end method

.method public onSupportActionModeFinished(Lq/b;)V
    .locals 0

    return-void
.end method

.method public onSupportActionModeStarted(Lq/b;)V
    .locals 0

    return-void
.end method

.method public onSupportContentChanged()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 2

    invoke-virtual {p0}, Lm/m;->getSupportParentActivityIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lm/m;->supportShouldUpRecreateTask(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/core/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroidx/core/app/TaskStackBuilder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm/m;->onCreateSupportNavigateUpTaskStack(Landroidx/core/app/TaskStackBuilder;)V

    invoke-virtual {p0, v0}, Lm/m;->onPrepareSupportNavigateUpTaskStack(Landroidx/core/app/TaskStackBuilder;)V

    invoke-virtual {v0}, Landroidx/core/app/TaskStackBuilder;->startActivities()V

    :try_start_0
    invoke-static {p0}, Landroidx/core/app/ActivityCompat;->finishAffinity(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lm/m;->supportNavigateUpTo(Landroid/content/Intent;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object p2

    invoke-virtual {p2, p1}, Lm/q;->p(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onWindowStartingSupportActionMode(Lq/a;)Lq/b;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public openOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm/b;->k()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/m;->n()V

    .line 2
    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->m(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lm/m;->n()V

    .line 4
    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->n(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lm/m;->n()V

    .line 6
    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lm/q;->o(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V
    .locals 4

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    iget-object v1, v0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v1, v1, Landroid/app/Activity;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lm/a0;->E()V

    iget-object v1, v0, Lm/a0;->O:Lm/b;

    instance-of v2, v1, Lm/n0;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    iput-object v2, v0, Lm/a0;->P:Lq/j;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lm/b;->h()V

    :cond_1
    iput-object v2, v0, Lm/a0;->O:Lm/b;

    if-eqz p1, :cond_3

    new-instance v1, Lm/i0;

    iget-object v2, v0, Lm/a0;->J:Ljava/lang/Object;

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_2

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_0

    :cond_2
    iget-object v2, v0, Lm/a0;->Q:Ljava/lang/CharSequence;

    :goto_0
    iget-object v3, v0, Lm/a0;->M:Lm/w;

    invoke-direct {v1, p1, v2, v3}, Lm/i0;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Lm/w;)V

    iput-object v1, v0, Lm/a0;->O:Lm/b;

    iget-object v2, v0, Lm/a0;->M:Lm/w;

    iget-object v1, v1, Lm/i0;->c:Lm/h0;

    iput-object v1, v2, Lm/w;->x:Lm/h0;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    goto :goto_1

    :cond_3
    iget-object p1, v0, Lm/a0;->M:Lm/w;

    iput-object v2, p1, Lm/w;->x:Lm/h0;

    :goto_1
    invoke-virtual {v0}, Lm/a0;->g()V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSupportProgress(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setSupportProgressBarIndeterminate(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setSupportProgressBarIndeterminateVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setSupportProgressBarVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    iput p1, v0, Lm/a0;->t0:I

    return-void
.end method

.method public startSupportActionMode(Lq/a;)Lq/b;
    .locals 1

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->q(Lq/a;)Lq/b;

    move-result-object p1

    return-object p1
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0}, Lm/q;->g()V

    return-void
.end method

.method public supportNavigateUpTo(Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/app/NavUtils;->navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V

    return-void
.end method

.method public supportRequestWindowFeature(I)Z
    .locals 1

    invoke-virtual {p0}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->l(I)Z

    move-result p1

    return p1
.end method

.method public supportShouldUpRecreateTask(Landroid/content/Intent;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/app/NavUtils;->shouldUpRecreateTask(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method
