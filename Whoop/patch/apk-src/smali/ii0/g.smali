.class public abstract Lii0/g;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/compose/ui/platform/ComposeView;

.field public final b:Landroidx/fragment/app/FragmentContainerView;

.field public final c:Landroidx/compose/ui/platform/ComposeView;

.field public final d:Landroid/widget/VideoView;

.field public final e:Lcom/airbnb/lottie/LottieAnimationView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/compose/ui/platform/ComposeView;Landroidx/fragment/app/FragmentContainerView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/VideoView;Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/g;->a:Landroidx/compose/ui/platform/ComposeView;

    iput-object p5, p0, Lii0/g;->b:Landroidx/fragment/app/FragmentContainerView;

    iput-object p6, p0, Lii0/g;->c:Landroidx/compose/ui/platform/ComposeView;

    iput-object p7, p0, Lii0/g;->d:Landroid/widget/VideoView;

    iput-object p8, p0, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Lii0/g;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lii0/g;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/g;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/g;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->d:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/g;

    return-object p0
.end method
