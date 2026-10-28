.class public abstract Leq0/v1;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Landroidx/recyclerview/widget/RecyclerView;

.field public final c:Landroid/widget/FrameLayout;

.field public final d:Lcom/whoop/ui/WhoopNewToolbar;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/EditText;

.field public final g:Lcom/whoop/ui/ThrobberView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/FrameLayout;Lcom/whoop/ui/WhoopNewToolbar;Landroid/widget/ImageView;Landroid/widget/EditText;Lcom/whoop/ui/ThrobberView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/v1;->a:Landroid/widget/LinearLayout;

    iput-object p5, p0, Leq0/v1;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p6, p0, Leq0/v1;->c:Landroid/widget/FrameLayout;

    iput-object p7, p0, Leq0/v1;->d:Lcom/whoop/ui/WhoopNewToolbar;

    iput-object p8, p0, Leq0/v1;->e:Landroid/widget/ImageView;

    iput-object p9, p0, Leq0/v1;->f:Landroid/widget/EditText;

    iput-object p10, p0, Leq0/v1;->g:Lcom/whoop/ui/ThrobberView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/v1;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/v1;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/v1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/v1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->T:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/v1;

    return-object p0
.end method
