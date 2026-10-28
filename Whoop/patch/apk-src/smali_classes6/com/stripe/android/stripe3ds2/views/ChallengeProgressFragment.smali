.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;",
        "Landroidx/fragment/app/m0;",
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


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Lq30/q0;

.field public final y:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lq30/q0;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "directoryServerName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransactionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0d065e

    invoke-direct {p0, v0}, Landroidx/fragment/app/m0;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;->w:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;->x:Lq30/q0;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;->y:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const p2, 0x7f0a01ea

    invoke-static {p1, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    const p2, 0x7f0a0a20

    invoke-static {p1, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    if-eqz v1, :cond_5

    check-cast p1, Landroid/widget/LinearLayout;

    new-instance v2, Ln30/c;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v3

    const-string p1, "requireContext(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ln30/f;

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;->x:Lq30/q0;

    invoke-direct {v4, p1}, Ln30/f;-><init>(Lq30/q0;)V

    const/4 v6, 0x0

    const/16 v7, 0xfc

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ln30/c;-><init>(Landroid/content/Context;Ln30/f;Lq83/j;Lx30/s0;I)V

    sget-object p1, Lt30/a;->E:Lng3/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;->w:Ljava/lang/String;

    invoke-static {p1, v2}, Lng3/n;->n(Ljava/lang/String;Ln30/d;)Lt30/a;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p2

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget v3, p1, Lt30/a;->x:I

    invoke-static {p2, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p1, Lt30/a;->y:Ljava/lang/Integer;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-boolean p1, p1, Lt30/a;->z:Z

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 p2, -0x2

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;->y:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {v1, p1}, Lfr/d;->setIndicatorColor([I)V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "Missing required view with ID: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
