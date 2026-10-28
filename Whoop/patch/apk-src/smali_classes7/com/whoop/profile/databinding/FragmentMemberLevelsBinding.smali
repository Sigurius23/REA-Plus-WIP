.class public abstract Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final collapsingToolbarLayout:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

.field public final currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

.field public final memberLevelsToolbar:Lcom/whoop/ui/WhoopNewToolbar;

.field public final pinnedLevelTitle:Landroid/widget/TextView;

.field public final progressLevelRecyclerview:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/google/android/material/appbar/CollapsingToolbarLayout;Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;Lcom/whoop/ui/WhoopNewToolbar;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->collapsingToolbarLayout:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    iput-object p5, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    iput-object p6, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->memberLevelsToolbar:Lcom/whoop/ui/WhoopNewToolbar;

    iput-object p7, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->pinnedLevelTitle:Landroid/widget/TextView;

    iput-object p8, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->progressLevelRecyclerview:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
    .locals 1

    .line 1
    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/whoop/profile/R$layout;->fragment_member_levels:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/a0;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
    .locals 1

    .line 3
    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
    .locals 1

    .line 1
    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/whoop/profile/R$layout;->fragment_member_levels:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    sget v0, Lcom/whoop/profile/R$layout;->fragment_member_levels:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;

    return-object p0
.end method
