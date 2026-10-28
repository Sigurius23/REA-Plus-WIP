.class final Lcom/whoop/settings/SettingsLandingFragment$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/SettingsLandingFragment$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/settings/SettingsLandingFragment$k$a$a;
    }
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

    iput-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lea2/j0;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lea2/j0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whoop/settings/SettingsLandingFragment;->V0(Lcom/whoop/settings/SettingsLandingFragment;Z)V

    invoke-virtual {p1}, Lea2/j0;->b()Lcom/whoop/whattoexpect/domain/models/CtaLocation;

    move-result-object v0

    sget-object v2, Lcom/whoop/settings/SettingsLandingFragment$k$a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, Lea2/j0;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v1}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v4

    iget-object v4, v4, Lii0/s;->k1:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v0

    iget-object v0, v0, Lii0/s;->i1:Landroid/widget/TextView;

    invoke-virtual {p1}, Lea2/j0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lea2/j0;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v1

    iget-object v1, v1, Lii0/s;->j1:Landroid/widget/TextView;

    const-string v4, "wteDescription"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v0

    iget-object v0, v0, Lii0/s;->j1:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->N0(Lcom/whoop/settings/SettingsLandingFragment;)Lcom/whoop/settings/m;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/m;->O()Landroidx/lifecycle/p0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;->getStatus()Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;

    move-result-object v2

    :cond_3
    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;->APPROVED:Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;

    if-ne v2, p1, :cond_9

    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lvu1/b;->i:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v0

    iget-object v0, v0, Lii0/s;->D0:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1, v3, p1, v3}, Landroid/view/View;->setPadding(IIII)V

    goto/16 :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    invoke-virtual {p1}, Lea2/j0;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v1}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v4

    iget-object v4, v4, Lii0/s;->Q:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v0

    iget-object v0, v0, Lii0/s;->c0:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v1, "journeyToAHealthierYou"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v0

    iget-object v0, v0, Lii0/s;->R:Landroid/widget/TextView;

    invoke-virtual {p1}, Lea2/j0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lea2/j0;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v1

    iget-object v1, v1, Lii0/s;->S:Landroid/widget/TextView;

    const-string v4, "healthierYouSubtext"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v0}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v0

    iget-object v0, v0, Lii0/s;->S:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->N0(Lcom/whoop/settings/SettingsLandingFragment;)Lcom/whoop/settings/m;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/m;->O()Landroidx/lifecycle/p0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;->getStatus()Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;

    move-result-object v2

    :cond_8
    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;->APPROVED:Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;

    if-ne v2, p1, :cond_9

    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lvu1/b;->i:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lvu1/b;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/settings/SettingsLandingFragment$k$a;->w:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v1}, Lcom/whoop/settings/SettingsLandingFragment;->J0(Lcom/whoop/settings/SettingsLandingFragment;)Lii0/s;

    move-result-object v1

    iget-object v1, v1, Lii0/s;->D0:Landroid/widget/FrameLayout;

    invoke-virtual {v1, p1, v0, p1, v3}, Landroid/view/View;->setPadding(IIII)V

    :cond_9
    :goto_0
    return-object p2
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lea2/j0;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$k$a;->b(Lea2/j0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
