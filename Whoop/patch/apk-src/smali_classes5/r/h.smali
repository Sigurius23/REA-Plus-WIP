.class public final Lr/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/x;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public E:Lr/w;

.field public F:Lr/g;

.field public w:Landroid/content/Context;

.field public x:Landroid/view/LayoutInflater;

.field public y:Lr/l;

.field public z:Landroidx/appcompat/view/menu/ExpandedMenuView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/h;->w:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lr/h;->x:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final a()Lr/g;
    .locals 1

    iget-object v0, p0, Lr/h;->F:Lr/g;

    if-nez v0, :cond_0

    new-instance v0, Lr/g;

    invoke-direct {v0, p0}, Lr/g;-><init>(Lr/h;)V

    iput-object v0, p0, Lr/h;->F:Lr/g;

    :cond_0
    iget-object v0, p0, Lr/h;->F:Lr/g;

    return-object v0
.end method

.method public final b(Lr/n;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Landroid/view/ViewGroup;)Lr/z;
    .locals 3

    iget-object v0, p0, Lr/h;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v0, :cond_1

    iget-object v0, p0, Lr/h;->x:Landroid/view/LayoutInflater;

    const v1, 0x7f0d000d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object p1, p0, Lr/h;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object p1, p0, Lr/h;->F:Lr/g;

    if-nez p1, :cond_0

    new-instance p1, Lr/g;

    invoke-direct {p1, p0}, Lr/g;-><init>(Lr/h;)V

    iput-object p1, p0, Lr/h;->F:Lr/g;

    :cond_0
    iget-object p1, p0, Lr/h;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v0, p0, Lr/h;->F:Lr/g;

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Lr/h;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_1
    iget-object p1, p0, Lr/h;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    return-object p1
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lr/h;->F:Lr/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lr/g;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final e(Lr/n;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final f(Landroid/content/Context;Lr/l;)V
    .locals 1

    iget-object v0, p0, Lr/h;->w:Landroid/content/Context;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lr/h;->w:Landroid/content/Context;

    iget-object v0, p0, Lr/h;->x:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lr/h;->x:Landroid/view/LayoutInflater;

    :cond_0
    iput-object p2, p0, Lr/h;->y:Lr/l;

    iget-object p1, p0, Lr/h;->F:Lr/g;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lr/g;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final g(Lr/l;Z)V
    .locals 1

    iget-object v0, p0, Lr/h;->E:Lr/w;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lr/w;->g(Lr/l;Z)V

    :cond_0
    return-void
.end method

.method public final h(Lr/w;)V
    .locals 0

    iput-object p1, p0, Lr/h;->E:Lr/w;

    return-void
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Lr/d0;)Z
    .locals 4

    invoke-virtual {p1}, Lr/l;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lr/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lr/m;->w:Lr/d0;

    new-instance v1, Lm/i;

    iget-object v2, p1, Lr/l;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Lm/i;-><init>(Landroid/content/Context;)V

    new-instance v2, Lr/h;

    invoke-virtual {v1}, Lm/i;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lr/h;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lr/m;->y:Lr/h;

    iput-object v0, v2, Lr/h;->E:Lr/w;

    invoke-virtual {p1, v2}, Lr/l;->b(Lr/x;)V

    iget-object v2, v0, Lr/m;->y:Lr/h;

    invoke-virtual {v2}, Lr/h;->a()Lr/g;

    move-result-object v2

    iget-object v3, v1, Lm/i;->a:Lm/e;

    iput-object v2, v3, Lm/e;->q:Landroid/widget/ListAdapter;

    iput-object v0, v3, Lm/e;->r:Landroid/content/DialogInterface$OnClickListener;

    iget-object v2, p1, Lr/l;->p:Landroid/view/View;

    if-eqz v2, :cond_1

    iput-object v2, v3, Lm/e;->e:Landroid/view/View;

    goto :goto_0

    :cond_1
    iget-object v2, p1, Lr/l;->o:Landroid/graphics/drawable/Drawable;

    iput-object v2, v3, Lm/e;->c:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lr/l;->n:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lm/i;->setTitle(Ljava/lang/CharSequence;)Lm/i;

    :goto_0
    iput-object v0, v3, Lm/e;->p:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v1}, Lm/i;->create()Lm/j;

    move-result-object v1

    iput-object v1, v0, Lr/m;->x:Lm/j;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v0, Lr/m;->x:Lm/j;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v3, 0x20000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, v0, Lr/m;->x:Lm/j;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lr/h;->E:Lr/w;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lr/w;->s(Lr/l;)Z

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lr/h;->y:Lr/l;

    iget-object p2, p0, Lr/h;->F:Lr/g;

    invoke-virtual {p2, p3}, Lr/g;->b(I)Lr/n;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Lr/l;->r(Landroid/view/MenuItem;Lr/x;I)Z

    return-void
.end method
