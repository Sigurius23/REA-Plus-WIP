.class public abstract Leq0/x1;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final b:Leq0/u2;

.field public final c:Landroid/widget/RelativeLayout;

.field public final d:Landroid/widget/LinearLayout;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/LinearLayout;

.field public final g:Landroid/widget/TextView;

.field public final h:Leq0/q2;

.field public final i:Landroidx/recyclerview/widget/RecyclerView;

.field public final j:Lcom/whoop/ui/ThrobberView;

.field public final k:Landroid/widget/LinearLayout;

.field public final l:Landroid/widget/Space;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/coordinatorlayout/widget/CoordinatorLayout;Leq0/u2;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Leq0/q2;Landroidx/recyclerview/widget/RecyclerView;Lcom/whoop/ui/ThrobberView;Landroid/widget/LinearLayout;Landroid/widget/Space;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/x1;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p5, p0, Leq0/x1;->b:Leq0/u2;

    iput-object p6, p0, Leq0/x1;->c:Landroid/widget/RelativeLayout;

    iput-object p7, p0, Leq0/x1;->d:Landroid/widget/LinearLayout;

    iput-object p8, p0, Leq0/x1;->e:Landroid/widget/TextView;

    iput-object p9, p0, Leq0/x1;->f:Landroid/widget/LinearLayout;

    iput-object p10, p0, Leq0/x1;->g:Landroid/widget/TextView;

    iput-object p11, p0, Leq0/x1;->h:Leq0/q2;

    iput-object p12, p0, Leq0/x1;->i:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p13, p0, Leq0/x1;->j:Lcom/whoop/ui/ThrobberView;

    iput-object p14, p0, Leq0/x1;->k:Landroid/widget/LinearLayout;

    iput-object p15, p0, Leq0/x1;->l:Landroid/widget/Space;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/x1;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/x1;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/x1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/x1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->U:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/x1;

    return-object p0
.end method
