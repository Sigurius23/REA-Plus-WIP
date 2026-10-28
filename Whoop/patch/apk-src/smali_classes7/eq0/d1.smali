.class public abstract Leq0/d1;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Leq0/i2;

.field public final b:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final c:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final d:Lcom/whoop/ui/ThrobberView;

.field public final e:Landroidx/fragment/app/FragmentContainerView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/ImageView;

.field public final h:Landroidx/viewpager2/widget/ViewPager2;

.field public final i:Lcom/google/android/material/tabs/TabLayout;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILeq0/i2;Lcom/whoop/ui/pills/StrokedPillButton;Lcom/whoop/ui/pills/StrokedPillButton;Lcom/whoop/ui/ThrobberView;Landroidx/fragment/app/FragmentContainerView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayout;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/d1;->a:Leq0/i2;

    iput-object p5, p0, Leq0/d1;->b:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p6, p0, Leq0/d1;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p7, p0, Leq0/d1;->d:Lcom/whoop/ui/ThrobberView;

    iput-object p8, p0, Leq0/d1;->e:Landroidx/fragment/app/FragmentContainerView;

    iput-object p9, p0, Leq0/d1;->f:Landroid/widget/TextView;

    iput-object p10, p0, Leq0/d1;->g:Landroid/widget/ImageView;

    iput-object p11, p0, Leq0/d1;->h:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p12, p0, Leq0/d1;->i:Lcom/google/android/material/tabs/TabLayout;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/d1;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/d1;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/d1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/d1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->J:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/d1;

    return-object p0
.end method
