.class public abstract Lii0/u;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Lii0/e0;

.field public final b:Landroidx/compose/ui/platform/ComposeView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroidx/viewpager2/widget/ViewPager2;

.field public final f:Lcom/google/android/material/tabs/TabLayout;

.field public final g:Landroid/widget/ImageView;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/widget/ImageView;

.field public final j:Landroid/widget/TextView;

.field public final k:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final l:Lcom/whoop/ui/WhoopNewToolbar;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILii0/e0;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/WhoopNewToolbar;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/u;->a:Lii0/e0;

    iput-object p5, p0, Lii0/u;->b:Landroidx/compose/ui/platform/ComposeView;

    iput-object p6, p0, Lii0/u;->c:Landroid/widget/TextView;

    iput-object p7, p0, Lii0/u;->d:Landroid/widget/TextView;

    iput-object p8, p0, Lii0/u;->e:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p9, p0, Lii0/u;->f:Lcom/google/android/material/tabs/TabLayout;

    iput-object p10, p0, Lii0/u;->g:Landroid/widget/ImageView;

    iput-object p11, p0, Lii0/u;->h:Landroid/widget/TextView;

    iput-object p12, p0, Lii0/u;->i:Landroid/widget/ImageView;

    iput-object p13, p0, Lii0/u;->j:Landroid/widget/TextView;

    iput-object p14, p0, Lii0/u;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p15, p0, Lii0/u;->l:Lcom/whoop/ui/WhoopNewToolbar;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/u;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lii0/u;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/u;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/u;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->l:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/u;

    return-object p0
.end method
