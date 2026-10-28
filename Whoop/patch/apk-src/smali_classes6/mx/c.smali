.class public abstract Lmx/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private E:Ljx/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljx/d;"
        }
    .end annotation
.end field

.field private F:Lnx/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnx/e;"
        }
    .end annotation
.end field

.field private G:Z

.field protected final H:Ljx/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljx/b;"
        }
    .end annotation
.end field

.field private final I:Ljava/lang/Runnable;

.field private final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llx/d;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llx/d;",
            ">;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lmx/c;->w:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lmx/c;->x:Ljava/util/List;

    new-instance v0, Llx/c;

    invoke-direct {v0, p0}, Llx/c;-><init>(Lmx/c;)V

    iput-object v0, p0, Lmx/c;->H:Ljx/b;

    new-instance v0, Lbq/b;

    const/16 v1, 0x13

    invoke-direct {v0, p0, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lmx/c;->I:Ljava/lang/Runnable;

    new-instance v0, Ljx/d;

    invoke-direct {v0}, Ljx/d;-><init>()V

    iput-object v0, p0, Lmx/c;->E:Ljx/d;

    return-void
.end method


# virtual methods
.method public A(I)Z
    .locals 2

    invoke-virtual {p0, p1}, Lmx/c;->F(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lmx/c;->E(I)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lmx/c;->D(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    invoke-virtual {p0}, Lmx/c;->f()I

    move-result v1

    add-int/2addr v1, v0

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, Lmx/c;->C(I)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0, p1}, Lmx/c;->e(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lmx/c;->B(I)Z

    move-result p1

    return p1
.end method

.method public B(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public C(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public D(I)Z
    .locals 2

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    invoke-virtual {p0}, Lmx/c;->f()I

    move-result v1

    add-int/2addr v1, v0

    if-lt p1, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public E(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public F(I)Z
    .locals 1

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract G()V
.end method

.method public H()V
    .locals 1

    iget-object v0, p0, Lmx/c;->I:Ljava/lang/Runnable;

    invoke-static {v0}, Lse/b;->b0(Ljava/lang/Runnable;)V

    return-void
.end method

.method public I(Llx/d;I)V
    .locals 0

    return-void
.end method

.method public K(Llx/d;I)V
    .locals 0

    return-void
.end method

.method public abstract L(Llx/d;Ljava/lang/Object;I)V
.end method

.method public abstract M(Landroid/view/ViewGroup;I)Llx/d;
.end method

.method public N()V
    .locals 3

    iget-boolean v0, p0, Lmx/c;->y:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmx/c;->z:Z

    return-void

    :cond_0
    iget-object v0, p0, Lmx/c;->E:Ljx/d;

    iget-object v1, v0, Ljx/d;->b:Lg73/d;

    iget-object v0, v0, Ljx/d;->a:Le10/k0;

    invoke-virtual {v0}, Le10/k0;->k()V

    invoke-virtual {v0}, Le10/k0;->k()V

    iget-object v1, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lex/a;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljx/b;

    invoke-interface {v2}, Ljx/b;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Le10/k0;->v()V

    invoke-virtual {v0}, Le10/k0;->v()V

    return-void
.end method

.method public O(ILlx/d;)V
    .locals 2

    invoke-virtual {p0, p1}, Lmx/c;->A(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lmx/c;->F(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lmx/c;->m()Lnx/c;

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lmx/c;->D(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lmx/c;->g()Lnx/a;

    return-void

    :cond_1
    invoke-virtual {p0}, Lmx/c;->r()Lnx/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lmx/c;->e(I)I

    move-result p1

    invoke-virtual {p0}, Lmx/c;->r()Lnx/e;

    move-result-object v0

    invoke-virtual {p0, p1}, Lmx/c;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v0, Lmm/d;

    iget-object v0, v0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    check-cast v1, Lqm2/s;

    check-cast p2, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;

    invoke-static {v0, p0, v1, p2, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->g0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Lmx/c;Lqm2/s;Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;I)V

    :cond_2
    return-void
.end method

.method public P(ILlx/d;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lmx/c;->A(I)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lmx/c;->F(I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lmx/c;->n()Lnx/d;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lmx/c;->D(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lmx/c;->j()Lnx/b;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lmx/c;->u()Lnx/f;

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public Q(II)V
    .locals 3

    iget-boolean v0, p0, Lmx/c;->y:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmx/c;->z:Z

    return-void

    :cond_0
    iget-object v0, p0, Lmx/c;->E:Ljx/d;

    iget-object v0, v0, Ljx/d;->a:Le10/k0;

    invoke-virtual {v0}, Le10/k0;->k()V

    invoke-virtual {v0}, Le10/k0;->k()V

    iget-object v1, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lex/a;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljx/b;

    invoke-interface {v2, p1, p2}, Ljx/b;->b(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Le10/k0;->v()V

    invoke-virtual {v0}, Le10/k0;->v()V

    return-void
.end method

.method public R(II)V
    .locals 3

    iget-boolean v0, p0, Lmx/c;->y:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmx/c;->z:Z

    return-void

    :cond_0
    iget-object v0, p0, Lmx/c;->E:Ljx/d;

    iget-object v0, v0, Ljx/d;->a:Le10/k0;

    invoke-virtual {v0}, Le10/k0;->k()V

    invoke-virtual {v0}, Le10/k0;->k()V

    iget-object v1, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lex/a;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljx/b;

    invoke-interface {v2, p1, p2}, Ljx/b;->a(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Le10/k0;->v()V

    invoke-virtual {v0}, Le10/k0;->v()V

    return-void
.end method

.method public S(II)V
    .locals 3

    iget-boolean v0, p0, Lmx/c;->y:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmx/c;->z:Z

    return-void

    :cond_0
    iget-object v0, p0, Lmx/c;->E:Ljx/d;

    iget-object v0, v0, Ljx/d;->a:Le10/k0;

    invoke-virtual {v0}, Le10/k0;->k()V

    invoke-virtual {v0}, Le10/k0;->k()V

    iget-object v1, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lex/a;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljx/b;

    invoke-interface {v2, p1, p2}, Ljx/b;->d(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Le10/k0;->v()V

    invoke-virtual {v0}, Le10/k0;->v()V

    return-void
.end method

.method public U(Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmx/c;->G:Z

    return-void
.end method

.method public V(Lnx/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnx/e;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmx/c;->F:Lnx/e;

    return-void
.end method

.method public a(Llx/d;I)V
    .locals 3

    invoke-virtual {p0, p2}, Lmx/c;->F(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lmx/c;->K(Llx/d;I)V

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lmx/c;->D(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    invoke-virtual {p0}, Lmx/c;->f()I

    move-result v1

    add-int/2addr v1, v0

    sub-int/2addr p2, v1

    invoke-virtual {p0, p1, p2}, Lmx/c;->I(Llx/d;I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    sub-int/2addr p2, v0

    iget-object v0, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const v1, 0x7f0a02de

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, Lmx/c;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lmx/c;->L(Llx/d;Ljava/lang/Object;I)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-boolean v0, p0, Lmx/c;->G:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lmx/c;->U(Z)V

    :cond_0
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Llx/d;
    .locals 2

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object p1, p0, Lmx/c;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llx/d;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    invoke-virtual {p0}, Lmx/c;->w()I

    move-result v1

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, -0x1

    if-le p2, v1, :cond_1

    iget-object p1, p0, Lmx/c;->x:Ljava/util/List;

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Lmx/c;->w()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llx/d;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0, p1, p2}, Lmx/c;->M(Landroid/view/ViewGroup;I)Llx/d;

    move-result-object p1

    :goto_0
    iget-object p2, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const v0, 0x7f0a02df

    invoke-virtual {p2, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object p1
.end method

.method public e(I)I
    .locals 1

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public abstract f()I
.end method

.method public g()Lnx/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract get(I)Ljava/lang/Object;
.end method

.method public j()Lnx/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Lmx/c;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public m()Lnx/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public n()Lnx/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, Lmx/c;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public p()I
    .locals 2

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    invoke-virtual {p0}, Lmx/c;->f()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Lmx/c;->l()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public p0()Ljx/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljx/a;"
        }
    .end annotation

    iget-object v0, p0, Lmx/c;->E:Ljx/d;

    return-object v0
.end method

.method public q(I)I
    .locals 3

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lmx/c;->D(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    invoke-virtual {p0}, Lmx/c;->w()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    invoke-virtual {p0}, Lmx/c;->f()I

    move-result v2

    add-int/2addr v2, v0

    sub-int/2addr p1, v2

    add-int/2addr p1, v1

    return p1

    :cond_1
    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lmx/c;->v(I)I

    move-result p1

    invoke-virtual {p0}, Lmx/c;->o()I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public r()Lnx/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnx/e;"
        }
    .end annotation

    iget-object v0, p0, Lmx/c;->F:Lnx/e;

    return-object v0
.end method

.method public t(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public u()Lnx/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnx/f;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public v(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public w()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public z(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
