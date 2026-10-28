.class public final Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->c0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0010\u0008\n\u0002\u0008\t*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J1\u0010\u000c\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "com/whoop/community/presentation/login/JoinTeamLandingActivity$a",
        "Landroid/text/TextWatcher;",
        "Landroid/text/Editable;",
        "s",
        "Ll83/a0;",
        "afterTextChanged",
        "(Landroid/text/Editable;)V",
        "",
        "",
        "start",
        "count",
        "after",
        "beforeTextChanged",
        "(Ljava/lang/CharSequence;III)V",
        "charSequence",
        "before",
        "onTextChanged",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$a;->w:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const-string p2, "charSequence"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$a;->w:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-static {p2}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->O(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Loq0/k;

    move-result-object p2

    invoke-virtual {p2, p1}, Loq0/k;->G(Ljava/lang/CharSequence;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 p2, 0x0

    const-string p3, "joinTeamLandingBinding"

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$a;->w:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-static {p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->N(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Leq0/g;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Leq0/g;->o:Lcom/whoop/ui/pills/StrokedPillButton;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_0
    invoke-static {p3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p2

    :cond_1
    iget-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$a;->w:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-static {p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->N(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Leq0/g;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p1, Leq0/g;->o:Lcom/whoop/ui/pills/StrokedPillButton;

    const/high16 p2, 0x3f000000    # 0.5f

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_2
    invoke-static {p3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p2
.end method
