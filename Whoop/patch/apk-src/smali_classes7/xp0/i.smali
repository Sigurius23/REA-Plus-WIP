.class public final synthetic Lxp0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final synthetic y:Lcom/whoop/community/CommunityLandingHostFragment;

.field public final synthetic z:Leq0/r0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/whoop/community/CommunityLandingHostFragment;Leq0/r0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lxp0/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp0/i;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput-object p2, p0, Lxp0/i;->y:Lcom/whoop/community/CommunityLandingHostFragment;

    iput-object p3, p0, Lxp0/i;->z:Leq0/r0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/community/CommunityLandingHostFragment;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Leq0/r0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lxp0/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp0/i;->y:Lcom/whoop/community/CommunityLandingHostFragment;

    iput-object p2, p0, Lxp0/i;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput-object p3, p0, Lxp0/i;->z:Leq0/r0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lxp0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/i;->z:Leq0/r0;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lxp0/i;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, p0, Lxp0/i;->y:Lcom/whoop/community/CommunityLandingHostFragment;

    invoke-static {v1, v2, v0, p1}, Lcom/whoop/community/CommunityLandingHostFragment;->H(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/whoop/community/CommunityLandingHostFragment;Leq0/r0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/i;->z:Leq0/r0;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lxp0/i;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, p0, Lxp0/i;->y:Lcom/whoop/community/CommunityLandingHostFragment;

    invoke-static {v1, v2, v0, p1}, Lcom/whoop/community/CommunityLandingHostFragment;->I(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/whoop/community/CommunityLandingHostFragment;Leq0/r0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
