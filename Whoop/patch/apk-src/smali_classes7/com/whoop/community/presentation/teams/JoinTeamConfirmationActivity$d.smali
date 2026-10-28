.class Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Landroid/view/View;

.field c:Landroid/view/ViewGroup;

.field d:Landroid/widget/ImageView;

.field e:Landroid/widget/TextView;

.field f:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lxp0/a0;->q:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->a:Landroid/view/View;

    sget v0, Lxp0/a0;->v:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->b:Landroid/view/View;

    sget v0, Lxp0/a0;->u:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->c:Landroid/view/ViewGroup;

    sget v0, Lxp0/a0;->t:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->d:Landroid/widget/ImageView;

    sget v0, Lxp0/a0;->s:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->e:Landroid/widget/TextView;

    sget v0, Lxp0/a0;->r:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->f:Landroid/view/View;

    return-void
.end method
