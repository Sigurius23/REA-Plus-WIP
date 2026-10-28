.class public abstract Lgf2/u;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/widget/ImageView;

.field public final c:Lcom/whoop/ui/DotProgressIndicator;

.field public final d:Landroid/widget/FrameLayout;

.field public final e:Lcom/whoop/ui/views/ColoredImageView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final i:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/view/View;Landroid/widget/ImageView;Lcom/whoop/ui/DotProgressIndicator;Landroid/widget/FrameLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lgf2/u;->a:Landroid/view/View;

    iput-object p5, p0, Lgf2/u;->b:Landroid/widget/ImageView;

    iput-object p6, p0, Lgf2/u;->c:Lcom/whoop/ui/DotProgressIndicator;

    iput-object p7, p0, Lgf2/u;->d:Landroid/widget/FrameLayout;

    iput-object p8, p0, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p9, p0, Lgf2/u;->f:Landroid/widget/TextView;

    iput-object p10, p0, Lgf2/u;->g:Landroid/widget/TextView;

    iput-object p11, p0, Lgf2/u;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p12, p0, Lgf2/u;->i:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/u;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lgf2/u;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lgf2/u;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lgf2/u;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lqe2/f;->s:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lgf2/u;

    return-object p0
.end method
