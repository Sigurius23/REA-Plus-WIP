.class public abstract Leq0/j1;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Leq0/k2;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroidx/recyclerview/widget/RecyclerView;

.field public final e:Lcom/whoop/ui/ThrobberView;

.field public final f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Leq0/k2;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Lcom/whoop/ui/ThrobberView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/j1;->a:Landroid/widget/ImageView;

    iput-object p5, p0, Leq0/j1;->b:Leq0/k2;

    iput-object p6, p0, Leq0/j1;->c:Landroid/widget/TextView;

    iput-object p7, p0, Leq0/j1;->d:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p8, p0, Leq0/j1;->e:Lcom/whoop/ui/ThrobberView;

    iput-object p9, p0, Leq0/j1;->f:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/j1;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/j1;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/j1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/j1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->M:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/j1;

    return-object p0
.end method
