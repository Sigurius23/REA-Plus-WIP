.class public abstract Lii0/m;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Lcom/whoop/ui/views/ColoredImageView;

.field public final c:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final d:Lcom/whoop/ui/views/ColoredImageView;

.field public final e:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final f:Lcom/whoop/ui/views/ColoredImageView;

.field public final g:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final h:Landroid/widget/ScrollView;

.field public final i:Lcom/whoop/ui/views/ColoredImageView;

.field public final j:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Lcom/whoop/ui/views/ColoredImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ScrollView;Lcom/whoop/ui/views/ColoredImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/m;->a:Landroid/widget/ImageView;

    iput-object p5, p0, Lii0/m;->b:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p6, p0, Lii0/m;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p7, p0, Lii0/m;->d:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p8, p0, Lii0/m;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p9, p0, Lii0/m;->f:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p10, p0, Lii0/m;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p11, p0, Lii0/m;->h:Landroid/widget/ScrollView;

    iput-object p12, p0, Lii0/m;->i:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p13, p0, Lii0/m;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p14, p0, Lii0/m;->k:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/m;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lii0/m;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/m;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/m;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->g:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/m;

    return-object p0
.end method
