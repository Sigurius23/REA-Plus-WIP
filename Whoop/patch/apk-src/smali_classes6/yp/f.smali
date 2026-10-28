.class public final Lyp/f;
.super Landroidx/fragment/app/m0;
.source "SourceFile"

# interfaces
.implements Lo8/a;


# instance fields
.field public E:Lt9/u;

.field public F:Landroid/content/Context;

.field public w:Landroid/widget/ListView;

.field public x:Liv/d;

.field public y:Lso/q;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    return-void
.end method


# virtual methods
.method public final l()V
    .locals 1

    iget-object v0, p0, Lyp/f;->x:Liv/d;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    iget-object v0, p0, Lyp/f;->x:Liv/d;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final onAttach(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    iput-object p1, p0, Lyp/f;->F:Landroid/content/Context;

    invoke-static {p1}, Lt9/u;->i(Landroid/content/Context;)Lt9/u;

    move-result-object p1

    iput-object p1, p0, Lyp/f;->E:Lt9/u;

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "license_activity_package_name"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lyp/f;->z:Ljava/lang/String;

    :cond_0
    iget-object p1, p0, Lyp/f;->z:Ljava/lang/String;

    if-nez p1, :cond_1

    iget-object p1, p0, Lyp/f;->F:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lyp/f;->z:Ljava/lang/String;

    :cond_1
    iget-object p1, p0, Lyp/f;->F:Landroid/content/Context;

    iget-object v0, p0, Lyp/f;->z:Ljava/lang/String;

    invoke-static {p1, v0}, Lt9/u;->j(Landroid/content/Context;Ljava/lang/String;)Lso/q;

    move-result-object p1

    iput-object p1, p0, Lyp/f;->y:Lso/q;

    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    iget-object p3, p0, Lyp/f;->y:Lso/q;

    iget-object v0, p3, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    iget-object p3, p3, Lso/q;->x:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    const-string v1, "license_menu_fragment"

    const-string v2, "layout"

    invoke-virtual {v0, v1, v2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onDestroy()V
    .locals 5

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/fragment/app/r0;->getSupportLoaderManager()Lo8/b;

    move-result-object v0

    check-cast v0, Lo8/f;

    iget-object v0, v0, Lo8/f;->b:Lo8/e;

    iget-boolean v1, v0, Lo8/e;->x:Z

    iget-object v0, v0, Lo8/e;->w:La0/g1;

    if-nez v1, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    const v1, 0xd431

    invoke-virtual {v0, v1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo8/c;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lo8/c;->b()V

    iget-object v2, v0, La0/g1;->x:[I

    iget v3, v0, La0/g1;->z:I

    invoke-static {v3, v1, v2}, Lb0/a;->a(II[I)I

    move-result v1

    if-ltz v1, :cond_2

    iget-object v2, v0, La0/g1;->y:[Ljava/lang/Object;

    aget-object v3, v2, v1

    sget-object v4, La0/z;->c:Ljava/lang/Object;

    if-eq v3, v4, :cond_2

    aput-object v4, v2, v1

    const/4 v1, 0x1

    iput-boolean v1, v0, La0/g1;->w:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "destroyLoader must be called on the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Called while creating a loader"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p2

    invoke-static {p2}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, Landroidx/fragment/app/r0;->getSupportLoaderManager()Lo8/b;

    move-result-object v0

    const v1, 0xd431

    invoke-virtual {v0, v1, p0}, Lo8/b;->b(ILo8/a;)Lro/d;

    iget-object v0, p0, Lyp/f;->y:Lso/q;

    iget-object v1, v0, Lso/q;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/Resources;

    iget-object v0, v0, Lso/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v2, "license_list"

    const-string v3, "id"

    invoke-virtual {v1, v2, v3, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Lyp/f;->w:Landroid/widget/ListView;

    new-instance p1, Liv/d;

    invoke-direct {p1, p0, p2}, Liv/d;-><init>(Lyp/f;Landroidx/fragment/app/r0;)V

    iput-object p1, p0, Lyp/f;->x:Liv/d;

    iget-object p2, p0, Lyp/f;->w:Landroid/widget/ListView;

    invoke-virtual {p2, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Lyp/f;->w:Landroid/widget/ListView;

    new-instance p2, Ls/g0;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Ls/g0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public final bridge synthetic p(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lyp/f;->x:Liv/d;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    iget-object v0, p0, Lyp/f;->x:Liv/d;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    iget-object p1, p0, Lyp/f;->x:Liv/d;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final w()Lro/d;
    .locals 3

    new-instance v0, Lro/d;

    iget-object v1, p0, Lyp/f;->F:Landroid/content/Context;

    iget-object v2, p0, Lyp/f;->E:Lt9/u;

    invoke-direct {v0, v1, v2}, Lro/d;-><init>(Landroid/content/Context;Lt9/u;)V

    return-object v0
.end method
