.class public final Lcom/whoop/membership/dunning/DunningBottomSheetFragment$b;
.super Lpq/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/membership/dunning/DunningBottomSheetFragment$b",
        "Lpq/k;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic R:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$b;->R:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-direct {p0, p2, p3}, Lpq/k;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic q(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$b;->r(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private static final r(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroid/content/DialogInterface;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpq/k;

    const v0, 0x7f0a03ba

    invoke-virtual {p1, v0}, Lm/c0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p1

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    iput-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    invoke-virtual {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->H()Lpq/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(Lpq/c;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lpq/k;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$b;->R:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    new-instance v0, Lhe1/b;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lhe1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-void
.end method
