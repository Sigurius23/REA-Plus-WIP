.class public final synthetic Lhc2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhc2/j;


# direct methods
.method public synthetic constructor <init>(Lhc2/j;I)V
    .locals 0

    iput p2, p0, Lhc2/i;->w:I

    iput-object p1, p0, Lhc2/i;->x:Lhc2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhc2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhc2/i;->x:Lhc2/j;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;

    invoke-static {v0, p1}, Lhc2/j;->z(Lhc2/j;Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhc2/i;->x:Lhc2/j;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-static {v0, p1}, Lhc2/j;->w(Lhc2/j;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhc2/i;->x:Lhc2/j;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;

    invoke-static {v0, p1}, Lhc2/j;->A(Lhc2/j;Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lhc2/i;->x:Lhc2/j;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/TrialDetails;

    invoke-static {v0, p1}, Lhc2/j;->y(Lhc2/j;Lcom/whoop/data/remote/domain/response/growth/TrialDetails;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
