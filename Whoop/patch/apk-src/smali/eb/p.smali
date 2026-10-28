.class public final Leb/p;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/q;


# direct methods
.method public synthetic constructor <init>(Leb/q;I)V
    .locals 0

    iput p2, p0, Leb/p;->w:I

    iput-object p1, p0, Leb/p;->x:Leb/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Leb/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leb/p;->x:Leb/q;

    iget-boolean v1, v0, Leb/q;->J:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, Leb/q;->H:Landroidx/lifecycle/i0;

    iget-object v1, v1, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v2, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq v1, v2, :cond_1

    new-instance v1, Leb/n;

    invoke-direct {v1, v0}, Leb/n;-><init>(Lpb/f;)V

    invoke-virtual {v0}, Leb/q;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v2

    invoke-virtual {v0}, Leb/q;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v0

    new-instance v3, Lzt/q;

    invoke-direct {v3, v2, v1, v0}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    const-class v0, Leb/o;

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v1, "modelClass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object v0

    check-cast v0, Leb/o;

    invoke-virtual {v0}, Leb/o;->g()Landroidx/lifecycle/k1;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Landroidx/lifecycle/s1;

    iget-object v1, p0, Leb/p;->x:Leb/q;

    iget-object v2, v1, Leb/q;->w:Landroid/content/Context;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    instance-of v4, v2, Landroid/app/Application;

    if-eqz v4, :cond_4

    move-object v3, v2

    check-cast v3, Landroid/app/Application;

    :cond_4
    invoke-virtual {v1}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v0, v3, v1, v2}, Landroidx/lifecycle/s1;-><init>(Landroid/app/Application;Lpb/f;Landroid/os/Bundle;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
