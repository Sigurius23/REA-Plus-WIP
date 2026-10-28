.class public abstract Landroidx/fragment/app/v1;
.super Lfc/a;
.source "SourceFile"


# instance fields
.field private final c:Landroidx/fragment/app/o1;

.field private final d:I

.field private e:Landroidx/fragment/app/c2;

.field private f:Landroidx/fragment/app/m0;

.field private g:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;)V
    .locals 1

    invoke-direct {p0}, Lfc/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    iput-object v0, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    iput-object p1, p0, Landroidx/fragment/app/v1;->c:Landroidx/fragment/app/o1;

    const/4 p1, 0x1

    iput p1, p0, Landroidx/fragment/app/v1;->d:I

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    check-cast p3, Landroidx/fragment/app/m0;

    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/v1;->c:Landroidx/fragment/app/o1;

    invoke-static {p1, p1}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    check-cast p1, Landroidx/fragment/app/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p3, Landroidx/fragment/app/m0;->mFragmentManager:Landroidx/fragment/app/o1;

    if-eqz p2, :cond_2

    iget-object v0, p1, Landroidx/fragment/app/a;->t:Landroidx/fragment/app/o1;

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Cannot detach Fragment attached to a different FragmentManager. Fragment "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroidx/fragment/app/m0;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " is already attached to a FragmentManager."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    new-instance p2, Landroidx/fragment/app/b2;

    const/4 v0, 0x6

    invoke-direct {p2, p3, v0}, Landroidx/fragment/app/b2;-><init>(Landroidx/fragment/app/m0;I)V

    invoke-virtual {p1, p2}, Landroidx/fragment/app/c2;->b(Landroidx/fragment/app/b2;)V

    iget-object p1, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    invoke-virtual {p3, p1}, Landroidx/fragment/app/m0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    :cond_3
    return-void
.end method

.method public c(Landroid/view/ViewGroup;)V
    .locals 3

    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    if-eqz p1, :cond_2

    iget-boolean v0, p0, Landroidx/fragment/app/v1;->g:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/v1;->g:Z

    check-cast p1, Landroidx/fragment/app/a;

    iget-boolean v2, p1, Landroidx/fragment/app/c2;->i:Z

    if-nez v2, :cond_0

    iput-boolean v1, p1, Landroidx/fragment/app/c2;->j:Z

    iget-object v2, p1, Landroidx/fragment/app/a;->t:Landroidx/fragment/app/o1;

    invoke-virtual {v2, p1, v0}, Landroidx/fragment/app/o1;->A(Landroidx/fragment/app/a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Landroidx/fragment/app/v1;->g:Z

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This transaction is already being added to the back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Landroidx/fragment/app/v1;->g:Z

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    :cond_2
    return-void
.end method

.method public h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/v1;->c:Landroidx/fragment/app/o1;

    invoke-static {v0, v0}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/fragment/app/v1;->u(I)J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android:switcher:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Landroidx/fragment/app/v1;->c:Landroidx/fragment/app/o1;

    invoke-virtual {v5, v3}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v3

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Landroidx/fragment/app/b2;

    const/4 v0, 0x7

    invoke-direct {p2, v3, v0}, Landroidx/fragment/app/b2;-><init>(Landroidx/fragment/app/m0;I)V

    invoke-virtual {p1, p2}, Landroidx/fragment/app/c2;->b(Landroidx/fragment/app/b2;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/fragment/app/v1;->t(I)Landroidx/fragment/app/m0;

    move-result-object v3

    iget-object p2, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v6, v3, p1, v5}, Landroidx/fragment/app/c2;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    if-eq v3, p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {v3, p1}, Landroidx/fragment/app/m0;->setMenuVisibility(Z)V

    iget p2, p0, Landroidx/fragment/app/v1;->d:I

    if-ne p2, v5, :cond_2

    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    sget-object p2, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {p1, v3, p2}, Landroidx/fragment/app/c2;->g(Landroidx/fragment/app/m0;Landroidx/lifecycle/w;)Landroidx/fragment/app/a;

    return-object v3

    :cond_2
    invoke-virtual {v3, p1}, Landroidx/fragment/app/m0;->setUserVisibleHint(Z)V

    :cond_3
    return-object v3
.end method

.method public i(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Landroidx/fragment/app/m0;

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public l(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0

    return-void
.end method

.method public m()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public o(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    check-cast p3, Landroidx/fragment/app/m0;

    iget-object p1, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    if-eq p3, p1, :cond_5

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/m0;->setMenuVisibility(Z)V

    iget p1, p0, Landroidx/fragment/app/v1;->d:I

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/v1;->c:Landroidx/fragment/app/o1;

    invoke-static {p1, p1}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    iget-object v0, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    sget-object v1, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/c2;->g(Landroidx/fragment/app/m0;Landroidx/lifecycle/w;)Landroidx/fragment/app/a;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/m0;->setUserVisibleHint(Z)V

    :cond_2
    :goto_0
    invoke-virtual {p3, p2}, Landroidx/fragment/app/m0;->setMenuVisibility(Z)V

    iget p1, p0, Landroidx/fragment/app/v1;->d:I

    if-ne p1, p2, :cond_4

    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    if-nez p1, :cond_3

    iget-object p1, p0, Landroidx/fragment/app/v1;->c:Landroidx/fragment/app/o1;

    invoke-static {p1, p1}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/v1;->e:Landroidx/fragment/app/c2;

    sget-object p2, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    invoke-virtual {p1, p3, p2}, Landroidx/fragment/app/c2;->g(Landroidx/fragment/app/m0;Landroidx/lifecycle/w;)Landroidx/fragment/app/a;

    goto :goto_1

    :cond_4
    invoke-virtual {p3, p2}, Landroidx/fragment/app/m0;->setUserVisibleHint(Z)V

    :goto_1
    iput-object p3, p0, Landroidx/fragment/app/v1;->f:Landroidx/fragment/app/m0;

    :cond_5
    return-void
.end method

.method public r(Landroid/view/ViewGroup;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ViewPager with adapter "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " requires a view id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract t(I)Landroidx/fragment/app/m0;
.end method

.method public u(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method
