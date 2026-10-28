.class public final Landroidx/fragment/app/c0;
.super Landroidx/fragment/app/j0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/fragment/app/m0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/c0;->a:Landroidx/fragment/app/m0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/c0;->a:Landroidx/fragment/app/m0;

    iget-object v1, v0, Landroidx/fragment/app/m0;->mSavedStateRegistryController:Lpb/e;

    iget-object v1, v1, Lpb/e;->a:Lrb/a;

    invoke-virtual {v1}, Lrb/a;->a()V

    invoke-static {v0}, Landroidx/lifecycle/o1;->f(Lpb/f;)V

    iget-object v1, v0, Landroidx/fragment/app/m0;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    const-string v2, "registryState"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v0, v0, Landroidx/fragment/app/m0;->mSavedStateRegistryController:Lpb/e;

    invoke-virtual {v0, v1}, Lpb/e;->a(Landroid/os/Bundle;)V

    return-void
.end method
