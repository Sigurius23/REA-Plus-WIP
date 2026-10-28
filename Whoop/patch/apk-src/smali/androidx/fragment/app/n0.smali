.class public final synthetic Landroidx/fragment/app/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpb/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/fragment/app/n0;->a:I

    iput-object p1, p0, Landroidx/fragment/app/n0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    iget v0, p0, Landroidx/fragment/app/n0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/n0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->b0()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/n0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/r0;

    invoke-virtual {v0}, Landroidx/fragment/app/r0;->markFragmentsCreated()V

    iget-object v0, v0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
