.class public abstract Lii0/i0;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Lcom/whoop/ui/ThrobberView;

.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/whoop/ui/ThrobberView;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/i0;->a:Lcom/whoop/ui/ThrobberView;

    iput-object p5, p0, Lii0/i0;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Lii0/i0;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lii0/i0;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/i0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/i0;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->v:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/i0;

    return-object p0
.end method
