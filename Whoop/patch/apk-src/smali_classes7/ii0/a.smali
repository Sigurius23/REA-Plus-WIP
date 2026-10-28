.class public abstract Lii0/a;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Lii0/a0;

.field public final b:Landroid/widget/ImageView;

.field public final c:Lii0/c0;

.field public final d:Lii0/e0;

.field public final e:Lii0/g0;

.field public final f:Landroid/view/View;

.field public final g:Landroidx/constraintlayout/widget/Guideline;

.field public final h:Lcom/airbnb/lottie/LottieAnimationView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILii0/a0;Landroid/widget/ImageView;Lii0/c0;Lii0/e0;Lii0/g0;Landroid/view/View;Landroidx/constraintlayout/widget/Guideline;Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/a;->a:Lii0/a0;

    iput-object p5, p0, Lii0/a;->b:Landroid/widget/ImageView;

    iput-object p6, p0, Lii0/a;->c:Lii0/c0;

    iput-object p7, p0, Lii0/a;->d:Lii0/e0;

    iput-object p8, p0, Lii0/a;->e:Lii0/g0;

    iput-object p9, p0, Lii0/a;->f:Landroid/view/View;

    iput-object p10, p0, Lii0/a;->g:Landroidx/constraintlayout/widget/Guideline;

    iput-object p11, p0, Lii0/a;->h:Lcom/airbnb/lottie/LottieAnimationView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Lii0/a;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lii0/a;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/a;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/a;

    return-object p0
.end method
