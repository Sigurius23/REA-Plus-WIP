.class public Lcom/whoop/ui/debug/WhoopStrapTestFragment;
.super Lhj0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;
    }
.end annotation


# instance fields
.field private F:Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhj0/g;-><init>()V

    return-void
.end method

.method public static synthetic E(Lcom/whoop/ui/debug/WhoopStrapTestFragment;Ly82/b;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->G(Ly82/b;Landroid/view/View;)V

    return-void
.end method

.method private synthetic G(Ly82/b;Landroid/view/View;)V
    .locals 0

    iget-object p2, p0, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->F:Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly82/b;->performFromUi(Landroid/content/Context;)Ly82/b$t;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->I(Ly82/b;Ly82/b$t;)V

    :cond_0
    return-void
.end method

.method private I(Ly82/b;Ly82/b$t;)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ly82/b$t;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->F:Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2}, Ly82/b$t;->e()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->H()V

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    const-string v0, "WhoopStrapTest"

    return-object v0
.end method

.method public F(Ly82/b;Landroid/widget/TextView;)V
    .locals 3

    new-instance v0, Las2/a;

    new-instance v1, Ls52/e;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p1}, Ls52/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Las2/a;-><init>(Lbh3/b;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Ly82/b;->getUserDisplayName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public H()V
    .locals 7

    iget-object v0, p0, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->F:Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-static {}, Ly82/b;->values()[Ly82/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ly82/b;->isVisibleInUi()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance v4, Landroid/widget/Button;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v3, v4}, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->F(Ly82/b;Landroid/widget/TextView;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v5, p0, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->F:Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;

    iget-object v5, v5, Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lhj0/g;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    sget p3, Lhi0/f;->n:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    invoke-super {p0}, Lhj0/g;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->F:Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    new-instance p2, Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;

    invoke-direct {p2, p1}, Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->F:Lcom/whoop/ui/debug/WhoopStrapTestFragment$a;

    invoke-virtual {p0}, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->H()V

    return-void
.end method
