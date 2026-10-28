.class public Lcom/whoop/ui/debug/MainConsoleFragment;
.super Lhj0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/debug/MainConsoleFragment$a;
    }
.end annotation


# instance fields
.field private F:Lcom/whoop/ui/debug/MainConsoleFragment$a;

.field private G:Lmm2/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhj0/g;-><init>()V

    return-void
.end method

.method public static synthetic E(Lcom/whoop/ui/debug/MainConsoleFragment;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/debug/MainConsoleFragment;->F(Ljava/util/List;)V

    return-void
.end method

.method private synthetic F(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->F:Lcom/whoop/ui/debug/MainConsoleFragment$a;

    iget-object v0, v0, Lcom/whoop/ui/debug/MainConsoleFragment$a;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v0

    iget-object v1, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->G:Lmm2/d;

    invoke-virtual {v1}, Llx/a;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->G:Lmm2/d;

    invoke-virtual {v1, p1}, Llx/a;->addAll(Ljava/util/Collection;)Z

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->F:Lcom/whoop/ui/debug/MainConsoleFragment$a;

    iget-object p1, p1, Lcom/whoop/ui/debug/MainConsoleFragment$a;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->G:Lmm2/d;

    invoke-virtual {v0}, Llx/a;->size()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    const-string v0, "Main Console"

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    sget p3, Lhi0/f;->i:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    new-instance p2, Lcom/whoop/ui/debug/MainConsoleFragment$a;

    invoke-direct {p2, p1}, Lcom/whoop/ui/debug/MainConsoleFragment$a;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->F:Lcom/whoop/ui/debug/MainConsoleFragment$a;

    new-instance p1, Lmm2/d;

    invoke-direct {p1}, Lmm2/d;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->G:Lmm2/d;

    iget-object p2, p0, Lcom/whoop/ui/debug/MainConsoleFragment;->F:Lcom/whoop/ui/debug/MainConsoleFragment$a;

    iget-object p2, p2, Lcom/whoop/ui/debug/MainConsoleFragment$a;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p1, p2}, Le4/a;->s(Lmx/c;Landroidx/recyclerview/widget/RecyclerView;)Lmx/b;

    const-class p1, Ltr2/d;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltr2/d;

    invoke-virtual {p1}, Ltr2/d;->c()Lxg3/g;

    move-result-object p1

    invoke-virtual {p1}, Lxg3/g;->E()Lxg3/g;

    move-result-object p1

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance p2, Lbl2/c;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0}, Lbl2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj0/g;->z(Lxg3/t;)V

    return-void
.end method
