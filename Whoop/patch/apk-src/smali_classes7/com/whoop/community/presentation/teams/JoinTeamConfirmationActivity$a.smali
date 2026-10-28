.class Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->L()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$a;->w:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$a;->w:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->startPostponedEnterTransition()V

    return-void
.end method
