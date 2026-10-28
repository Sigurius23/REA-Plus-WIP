.class public abstract Leq0/v;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/widget/TextView;

.field public final c:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final d:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/view/View;Landroid/widget/TextView;Lcom/google/android/material/imageview/ShapeableImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/v;->a:Landroid/view/View;

    iput-object p5, p0, Leq0/v;->b:Landroid/widget/TextView;

    iput-object p6, p0, Leq0/v;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    iput-object p7, p0, Leq0/v;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p8, p0, Leq0/v;->e:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/v;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/v;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/v;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/v;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->o:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/v;

    return-object p0
.end method
