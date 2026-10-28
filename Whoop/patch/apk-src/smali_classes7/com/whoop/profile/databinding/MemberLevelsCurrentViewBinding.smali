.class public abstract Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final currentLevel:Landroid/widget/TextView;

.field public final currentLevelBadge:Landroid/widget/ImageView;

.field public final currentLevelMiniBadge:Landroid/widget/ImageView;

.field public final currentLevelProgressText:Landroid/widget/TextView;

.field public final currentTier:Landroid/widget/TextView;

.field public final levelOnboardingSegmentBar:Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;

.field public final levelProgressBar:Landroid/widget/ProgressBar;

.field public final nextLevelMiniBadge:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;Landroid/widget/ProgressBar;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevel:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelBadge:Landroid/widget/ImageView;

    iput-object p6, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelMiniBadge:Landroid/widget/ImageView;

    iput-object p7, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentLevelProgressText:Landroid/widget/TextView;

    iput-object p8, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->currentTier:Landroid/widget/TextView;

    iput-object p9, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelOnboardingSegmentBar:Lcom/whoop/profile/databinding/ViewOnboardingSegmentBarBinding;

    iput-object p10, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->levelProgressBar:Landroid/widget/ProgressBar;

    iput-object p11, p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->nextLevelMiniBadge:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;
    .locals 1

    .line 1
    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/whoop/profile/R$layout;->member_levels_current_view:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/a0;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;
    .locals 1

    .line 3
    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;
    .locals 1

    .line 1
    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/whoop/profile/R$layout;->member_levels_current_view:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    sget v0, Lcom/whoop/profile/R$layout;->member_levels_current_view:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    return-object p0
.end method
