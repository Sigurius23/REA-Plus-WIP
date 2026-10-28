.class public final synthetic Loq0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/c;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/login/JoinTeamActivity;

.field public final synthetic y:Lcom/whoop/domain/model/Invitation;

.field public final synthetic z:Lcom/whoop/domain/model/User;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;I)V
    .locals 0

    iput p4, p0, Loq0/h;->w:I

    iput-object p1, p0, Loq0/h;->x:Lcom/whoop/community/presentation/login/JoinTeamActivity;

    iput-object p2, p0, Loq0/h;->y:Lcom/whoop/domain/model/Invitation;

    iput-object p3, p0, Loq0/h;->z:Lcom/whoop/domain/model/User;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Loq0/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lcom/whoop/ui/h;

    iget-object v0, p0, Loq0/h;->x:Lcom/whoop/community/presentation/login/JoinTeamActivity;

    iget-object v1, p0, Loq0/h;->y:Lcom/whoop/domain/model/Invitation;

    iget-object v2, p0, Loq0/h;->z:Lcom/whoop/domain/model/User;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->H(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Ljava/lang/Throwable;Lcom/whoop/ui/h;)V

    return-void

    :pswitch_0
    check-cast p1, Lpg3/v0;

    check-cast p2, Lcom/whoop/ui/h;

    iget-object v0, p0, Loq0/h;->x:Lcom/whoop/community/presentation/login/JoinTeamActivity;

    iget-object v1, p0, Loq0/h;->y:Lcom/whoop/domain/model/Invitation;

    iget-object v2, p0, Loq0/h;->z:Lcom/whoop/domain/model/User;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->K(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Lpg3/v0;Lcom/whoop/ui/h;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
