.class public final synthetic Lkw1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V
    .locals 0

    iput p2, p0, Lkw1/p;->w:I

    iput-object p1, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkw1/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->K(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->y(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->M(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->J(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->L(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->B(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->G(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->A(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->E(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lkw1/p;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->I(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
