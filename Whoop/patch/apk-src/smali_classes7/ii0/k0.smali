.class public abstract Lii0/k0;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/Guideline;

.field public final b:Lio/github/florent37/shapeofview/shapes/BubbleView;

.field public final c:Landroid/widget/ImageView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/ProgressBar;

.field public final g:Landroidx/compose/ui/platform/ComposeView;

.field public final h:Landroid/widget/ImageView;

.field public final i:Landroid/widget/FrameLayout;

.field public final j:Landroid/widget/ImageView;

.field public final k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/Guideline;Lio/github/florent37/shapeofview/shapes/BubbleView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/k0;->a:Landroidx/constraintlayout/widget/Guideline;

    iput-object p5, p0, Lii0/k0;->b:Lio/github/florent37/shapeofview/shapes/BubbleView;

    iput-object p6, p0, Lii0/k0;->c:Landroid/widget/ImageView;

    iput-object p7, p0, Lii0/k0;->d:Landroid/widget/TextView;

    iput-object p8, p0, Lii0/k0;->e:Landroid/widget/TextView;

    iput-object p9, p0, Lii0/k0;->f:Landroid/widget/ProgressBar;

    iput-object p10, p0, Lii0/k0;->g:Landroidx/compose/ui/platform/ComposeView;

    iput-object p11, p0, Lii0/k0;->h:Landroid/widget/ImageView;

    iput-object p12, p0, Lii0/k0;->i:Landroid/widget/FrameLayout;

    iput-object p13, p0, Lii0/k0;->j:Landroid/widget/ImageView;

    iput-object p14, p0, Lii0/k0;->k:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/k0;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lii0/k0;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/k0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/k0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->w:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/k0;

    return-object p0
.end method
