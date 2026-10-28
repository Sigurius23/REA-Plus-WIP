.class public abstract Leq0/b2;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final b:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final c:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final d:Landroid/widget/RelativeLayout;

.field public final e:Landroid/widget/LinearLayout;

.field public final f:Landroid/widget/TextView;

.field public final g:Leq0/s2;

.field public final h:Landroidx/recyclerview/widget/RecyclerView;

.field public final i:Landroid/widget/ImageView;

.field public final j:Lcom/whoop/ui/ThrobberView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/whoop/ui/pills/StrokedPillButton;Lcom/whoop/ui/pills/StrokedPillButton;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Leq0/s2;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/ImageView;Lcom/whoop/ui/ThrobberView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/b2;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p5, p0, Leq0/b2;->b:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p6, p0, Leq0/b2;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p7, p0, Leq0/b2;->d:Landroid/widget/RelativeLayout;

    iput-object p8, p0, Leq0/b2;->e:Landroid/widget/LinearLayout;

    iput-object p9, p0, Leq0/b2;->f:Landroid/widget/TextView;

    iput-object p10, p0, Leq0/b2;->g:Leq0/s2;

    iput-object p11, p0, Leq0/b2;->h:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p12, p0, Leq0/b2;->i:Landroid/widget/ImageView;

    iput-object p13, p0, Leq0/b2;->j:Lcom/whoop/ui/ThrobberView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/b2;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/b2;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/b2;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/b2;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->W:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/b2;

    return-object p0
.end method
