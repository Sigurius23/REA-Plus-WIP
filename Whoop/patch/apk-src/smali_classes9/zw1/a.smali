.class public final synthetic Lzw1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/management/MembershipManagementFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/management/MembershipManagementFragment;I)V
    .locals 0

    iput p2, p0, Lzw1/a;->w:I

    iput-object p1, p0, Lzw1/a;->x:Lcom/whoop/membership/management/MembershipManagementFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzw1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzw1/a;->x:Lcom/whoop/membership/management/MembershipManagementFragment;

    invoke-static {v0}, Lcom/whoop/membership/management/MembershipManagementFragment;->A(Lcom/whoop/membership/management/MembershipManagementFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lzw1/a;->x:Lcom/whoop/membership/management/MembershipManagementFragment;

    invoke-static {v0}, Lcom/whoop/membership/management/MembershipManagementFragment;->C(Lcom/whoop/membership/management/MembershipManagementFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lzw1/a;->x:Lcom/whoop/membership/management/MembershipManagementFragment;

    invoke-static {v0}, Lcom/whoop/membership/management/MembershipManagementFragment;->D(Lcom/whoop/membership/management/MembershipManagementFragment;)Lzw1/c;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
