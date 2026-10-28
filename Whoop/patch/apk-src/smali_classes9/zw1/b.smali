.class public final synthetic Lzw1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/management/MembershipManagementFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/management/MembershipManagementFragment;I)V
    .locals 0

    iput p2, p0, Lzw1/b;->w:I

    iput-object p1, p0, Lzw1/b;->x:Lcom/whoop/membership/management/MembershipManagementFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzw1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzw1/b;->x:Lcom/whoop/membership/management/MembershipManagementFragment;

    check-cast p1, Lax1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/management/MembershipManagementFragment;->y(Lcom/whoop/membership/management/MembershipManagementFragment;Lax1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzw1/b;->x:Lcom/whoop/membership/management/MembershipManagementFragment;

    check-cast p1, Llx1/e;

    invoke-static {v0, p1}, Lcom/whoop/membership/management/MembershipManagementFragment;->E(Lcom/whoop/membership/management/MembershipManagementFragment;Llx1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
