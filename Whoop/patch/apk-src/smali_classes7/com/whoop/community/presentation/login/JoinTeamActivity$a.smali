.class public Lcom/whoop/community/presentation/login/JoinTeamActivity$a;
.super Lhj0/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/community/presentation/login/JoinTeamActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhj0/t$b<",
        "Lcom/whoop/community/presentation/login/JoinTeamActivity$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;)V
    .locals 1

    const-class v0, Lcom/whoop/community/presentation/login/JoinTeamActivity;

    invoke-direct {p0, p1, v0}, Lhj0/t$b;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "invitation"

    invoke-static {p2}, Lor2/i0;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public r(Landroid/app/Activity;)Lcom/whoop/community/presentation/login/JoinTeamActivity$b;
    .locals 1

    new-instance v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$b;

    invoke-direct {v0, p1, p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity$b;-><init>(Landroid/app/Activity;Lcom/whoop/community/presentation/login/JoinTeamActivity$a;)V

    return-object v0
.end method

.method public s(I)Lcom/whoop/community/presentation/login/JoinTeamActivity$a;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "transitionDelay"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method
