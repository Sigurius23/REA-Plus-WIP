.class public abstract Leq0/z0;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/recyclerview/widget/RecyclerView;

.field public final b:Leq0/g2;

.field public final c:Lcom/whoop/ui/ThrobberView;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView;Leq0/g2;Lcom/whoop/ui/ThrobberView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/z0;->a:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p5, p0, Leq0/z0;->b:Leq0/g2;

    iput-object p6, p0, Leq0/z0;->c:Lcom/whoop/ui/ThrobberView;

    iput-object p7, p0, Leq0/z0;->d:Landroid/widget/ImageView;

    iput-object p8, p0, Leq0/z0;->e:Landroid/widget/TextView;

    iput-object p9, p0, Leq0/z0;->f:Landroid/widget/ImageView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/z0;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/z0;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/z0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/z0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->H:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/z0;

    return-object p0
.end method
