.class public Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;
.super Lhj0/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhj0/t$b<",
        "Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;)V
    .locals 1

    const-class v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;

    invoke-direct {p0, p1, v0}, Lhj0/t$b;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p2}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;->r(Lcom/whoop/domain/model/Invitation;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;

    invoke-virtual {p0, p3}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;->u(Lcom/whoop/domain/model/User;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;

    return-void
.end method


# virtual methods
.method public r(Lcom/whoop/domain/model/Invitation;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "invitation"

    invoke-static {p1}, Lor2/i0;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method

.method public s(Landroid/app/Activity;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;
    .locals 1

    new-instance v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;

    invoke-direct {v0, p1, p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;-><init>(Landroid/app/Activity;Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;)V

    return-object v0
.end method

.method public t(I)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "transitionDelay"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method

.method public u(Lcom/whoop/domain/model/User;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "user"

    invoke-static {p1}, Lor2/i0;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method
