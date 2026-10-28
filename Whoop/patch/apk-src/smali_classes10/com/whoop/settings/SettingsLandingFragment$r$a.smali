.class final Lcom/whoop/settings/SettingsLandingFragment$r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/SettingsLandingFragment$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/settings/SettingsLandingFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/SettingsLandingFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$r$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lza2/t;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/t;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p1, Lza2/t$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$r$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object p1

    iget-object p1, p1, Lii0/s;->o:Landroid/widget/FrameLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$r$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object p1

    iget-object p1, p1, Lii0/s;->G0:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string p2, "settingsContainer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/settings/SettingsLandingFragment$r$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    const/16 v0, 0x14

    invoke-static {p2, v0}, Lcom/whoop/settings/SettingsLandingFragment;->W0(Lcom/whoop/settings/SettingsLandingFragment;I)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lza2/t;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$r$a;->b(Lza2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
