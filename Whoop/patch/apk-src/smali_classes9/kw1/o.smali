.class public final synthetic Lkw1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V
    .locals 0

    iput p2, p0, Lkw1/o;->w:I

    iput-object p1, p0, Lkw1/o;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkw1/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkw1/o;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    check-cast p1, Liw1/e;

    invoke-static {v0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->O(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkw1/o;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    check-cast p1, Liw1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->F(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lkw1/o;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    check-cast p1, Lhw1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->P(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lkw1/o;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    check-cast p1, Liw1/c;

    invoke-static {v0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->H(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lkw1/o;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    check-cast p1, Lhw1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->D(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lkw1/o;->x:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    check-cast p1, Liw1/j;

    invoke-static {v0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->z(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
