.class public final synthetic Lc22/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;I)V
    .locals 0

    iput p2, p0, Lc22/a;->w:I

    iput-object p1, p0, Lc22/a;->x:Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc22/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc22/a;->x:Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;

    invoke-static {v0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->A(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc22/a;->x:Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;

    invoke-static {v0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->D(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Lc22/b;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lc22/a;->x:Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;

    invoke-static {v0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->z(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lc22/a;->x:Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;

    invoke-static {v0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->B(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
