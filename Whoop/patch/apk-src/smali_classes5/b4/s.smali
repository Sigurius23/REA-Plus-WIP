.class public final Lb4/s;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Lg2/q;
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field public O:Landroid/view/View;

.field public P:Landroid/view/ViewTreeObserver;

.field public final Q:Lb4/r;

.field public final R:Lb4/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lb2/v;-><init>()V

    new-instance v0, Lb4/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb4/r;-><init>(Lb4/s;I)V

    iput-object v0, p0, Lb4/s;->Q:Lb4/r;

    new-instance v0, Lb4/r;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lb4/r;-><init>(Lb4/s;I)V

    iput-object v0, p0, Lb4/s;->R:Lb4/r;

    return-void
.end method


# virtual methods
.method public final P0()V
    .locals 1

    invoke-static {p0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lb4/s;->P:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    return-void
.end method

.method public final Q0()V
    .locals 2

    iget-object v0, p0, Lb4/s;->P:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lb4/s;->P:Landroid/view/ViewTreeObserver;

    invoke-static {p0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    iput-object v0, p0, Lb4/s;->O:Landroid/view/View;

    return-void
.end method

.method public final X0()Lg2/x;
    .locals 10

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "visitLocalDescendants called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget v1, v0, Lb2/v;->z:I

    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-eqz v0, :cond_a

    iget v3, v0, Lb2/v;->y:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_9

    instance-of v6, v4, Lg2/x;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    check-cast v4, Lg2/x;

    if-eqz v2, :cond_1

    return-object v4

    :cond_1
    move v2, v7

    goto :goto_4

    :cond_2
    iget v6, v4, Lb2/v;->y:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_8

    instance-of v6, v4, La3/o;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    move v8, v1

    :goto_2
    if-eqz v6, :cond_7

    iget v9, v6, Lb2/v;->y:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v7, :cond_3

    move-object v4, v6

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, Lr1/c;

    const/16 v9, 0x10

    new-array v9, v9, [Lb2/v;

    invoke-direct {v5, v9}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_7
    if-ne v8, v7, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_1

    :cond_9
    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not find focus target of embedded view wrapper"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j0(Lg2/m;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lg2/m;->b(Z)V

    iget-object v0, p0, Lb4/s;->Q:Lb4/r;

    invoke-interface {p1, v0}, Lg2/m;->d(Lb4/r;)V

    iget-object v0, p0, Lb4/s;->R:Lb4/r;

    invoke-interface {p1, v0}, Lg2/m;->a(Lb4/r;)V

    return-void
.end method

.method public final onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {p0}, Lb4/n;->e(Lb2/v;)Landroid/view/View;

    move-result-object v0

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v1

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v0, p1}, Lb4/n;->c(Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_1

    move p1, v3

    goto :goto_0

    :cond_1
    move p1, v4

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0, p2}, Lb4/n;->c(Landroid/view/View;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    if-eqz p1, :cond_3

    if-eqz v3, :cond_3

    iput-object p2, p0, Lb4/s;->O:Landroid/view/View;

    return-void

    :cond_3
    if-eqz v3, :cond_4

    iput-object p2, p0, Lb4/s;->O:Landroid/view/View;

    invoke-virtual {p0}, Lb4/s;->X0()Lg2/x;

    move-result-object p1

    invoke-virtual {p1}, Lg2/x;->Z0()Lg2/w;

    move-result-object p2

    invoke-virtual {p2}, Lg2/w;->a()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-static {p1}, Lg2/g;->D(Lg2/x;)Z

    return-void

    :cond_4
    const/4 p2, 0x0

    if-eqz p1, :cond_6

    iput-object p2, p0, Lb4/s;->O:Landroid/view/View;

    invoke-virtual {p0}, Lb4/s;->X0()Lg2/x;

    move-result-object p1

    invoke-virtual {p1}, Lg2/x;->Z0()Lg2/w;

    move-result-object p1

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0x8

    check-cast v1, Lg2/l;

    invoke-virtual {v1, p1, v4, v4}, Lg2/l;->d(IZZ)Z

    :cond_5
    :goto_2
    return-void

    :cond_6
    iput-object p2, p0, Lb4/s;->O:Landroid/view/View;

    return-void
.end method
