.class public abstract Leq0/p0;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/Barrier;

.field public final b:Landroidx/viewpager2/widget/ViewPager2;

.field public final c:Lcom/google/android/material/tabs/TabLayout;

.field public final d:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroid/widget/Spinner;

.field public final h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/Barrier;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/Spinner;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/p0;->a:Landroidx/constraintlayout/widget/Barrier;

    iput-object p5, p0, Leq0/p0;->b:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p6, p0, Leq0/p0;->c:Lcom/google/android/material/tabs/TabLayout;

    iput-object p7, p0, Leq0/p0;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p8, p0, Leq0/p0;->e:Landroid/widget/ImageView;

    iput-object p9, p0, Leq0/p0;->f:Landroid/widget/ImageView;

    iput-object p10, p0, Leq0/p0;->g:Landroid/widget/Spinner;

    iput-object p11, p0, Leq0/p0;->h:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/p0;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/p0;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/p0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/p0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->C:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/p0;

    return-object p0
.end method
