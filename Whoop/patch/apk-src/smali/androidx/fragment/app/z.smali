.class public final synthetic Landroidx/fragment/app/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Landroidx/fragment/app/m0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/z;->w:Landroidx/fragment/app/m0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/z;->w:Landroidx/fragment/app/m0;

    iget-object v1, v0, Landroidx/fragment/app/m0;->mViewLifecycleOwner:Landroidx/fragment/app/l2;

    iget-object v2, v0, Landroidx/fragment/app/m0;->mSavedViewRegistryState:Landroid/os/Bundle;

    iget-object v1, v1, Landroidx/fragment/app/l2;->F:Lpb/e;

    invoke-virtual {v1, v2}, Lpb/e;->a(Landroid/os/Bundle;)V

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/m0;->mSavedViewRegistryState:Landroid/os/Bundle;

    return-void
.end method
