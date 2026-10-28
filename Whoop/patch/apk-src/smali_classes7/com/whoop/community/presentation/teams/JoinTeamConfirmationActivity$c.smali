.class public Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;
.super Lhj0/t$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhj0/t$c<",
        "Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhj0/t$c;-><init>(Landroid/app/Activity;Lhj0/t$b;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;
    .locals 1

    const-string v0, "background"

    invoke-virtual {p0, v0, p1}, Lhj0/t$c;->b(Ljava/lang/String;Landroid/view/View;)V

    return-object p0
.end method

.method public d(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "navigationBar"

    invoke-virtual {p0, v0, p1}, Lhj0/t$c;->b(Ljava/lang/String;Landroid/view/View;)V

    :cond_0
    return-object p0
.end method

.method public e(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;
    .locals 1

    const-string v0, "teamIcon"

    invoke-virtual {p0, v0, p1}, Lhj0/t$c;->b(Ljava/lang/String;Landroid/view/View;)V

    return-object p0
.end method

.method public f(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;
    .locals 1

    const-string v0, "whoopLogo"

    invoke-virtual {p0, v0, p1}, Lhj0/t$c;->b(Ljava/lang/String;Landroid/view/View;)V

    return-object p0
.end method
