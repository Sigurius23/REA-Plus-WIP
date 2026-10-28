.class public final Lr/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx4/a;


# instance fields
.field public A:Landroid/view/View;

.field public B:Lr/o;

.field public C:Landroid/view/MenuItem$OnActionExpandListener;

.field public D:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Ljava/lang/CharSequence;

.field public g:Ljava/lang/CharSequence;

.field public h:Landroid/content/Intent;

.field public i:C

.field public j:I

.field public k:C

.field public l:I

.field public m:Landroid/graphics/drawable/Drawable;

.field public n:I

.field public final o:Lr/l;

.field public p:Lr/d0;

.field public q:Landroid/view/MenuItem$OnMenuItemClickListener;

.field public r:Ljava/lang/CharSequence;

.field public s:Ljava/lang/CharSequence;

.field public t:Landroid/content/res/ColorStateList;

.field public u:Landroid/graphics/PorterDuff$Mode;

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lr/l;IIIILjava/lang/CharSequence;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    iput v0, p0, Lr/n;->j:I

    iput v0, p0, Lr/n;->l:I

    const/4 v0, 0x0

    iput v0, p0, Lr/n;->n:I

    const/4 v1, 0x0

    iput-object v1, p0, Lr/n;->t:Landroid/content/res/ColorStateList;

    iput-object v1, p0, Lr/n;->u:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v0, p0, Lr/n;->v:Z

    iput-boolean v0, p0, Lr/n;->w:Z

    iput-boolean v0, p0, Lr/n;->x:Z

    const/16 v1, 0x10

    iput v1, p0, Lr/n;->y:I

    iput-boolean v0, p0, Lr/n;->D:Z

    iput-object p1, p0, Lr/n;->o:Lr/l;

    iput p3, p0, Lr/n;->b:I

    iput p2, p0, Lr/n;->c:I

    iput p4, p0, Lr/n;->d:I

    iput p5, p0, Lr/n;->e:I

    iput-object p6, p0, Lr/n;->f:Ljava/lang/CharSequence;

    iput p7, p0, Lr/n;->z:I

    return-void
.end method

.method public static a(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Lr/o;)Lx4/a;
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lr/n;->A:Landroid/view/View;

    iput-object p1, p0, Lr/n;->B:Lr/o;

    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    iget-object p1, p0, Lr/n;->B:Lr/o;

    if-eqz p1, :cond_0

    new-instance v0, Lq30/u0;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p1, Lr/o;->a:Lq30/u0;

    iget-object v0, p1, Lr/o;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V

    :cond_0
    return-object p0
.end method

.method public final c()Lr/o;
    .locals 1

    iget-object v0, p0, Lr/n;->B:Lr/o;

    return-object v0
.end method

.method public final collapseActionView()Z
    .locals 2

    iget v0, p0, Lr/n;->z:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lr/n;->A:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lr/n;->C:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    iget-object v0, p0, Lr/n;->o:Lr/l;

    invoke-virtual {v0, p0}, Lr/l;->e(Lr/n;)Z

    move-result v0

    return v0
.end method

.method public final d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-eqz p1, :cond_3

    iget-boolean v0, p0, Lr/n;->x:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lr/n;->v:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lr/n;->w:Z

    if-eqz v0, :cond_3

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-boolean v0, p0, Lr/n;->v:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/n;->t:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v0, p0, Lr/n;->w:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lr/n;->u:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lr/n;->x:Z

    :cond_3
    return-object p1
.end method

.method public final e()Z
    .locals 2

    iget v0, p0, Lr/n;->z:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/n;->A:Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Lr/n;->B:Lr/o;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lr/o;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0, p0}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lr/n;->A:Landroid/view/View;

    :cond_0
    iget-object v0, p0, Lr/n;->A:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final expandActionView()Z
    .locals 1

    invoke-virtual {p0}, Lr/n;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr/n;->C:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lr/n;->o:Lr/l;

    invoke-virtual {v0, p0}, Lr/l;->g(Lr/n;)Z

    move-result v0

    return v0
.end method

.method public final f(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lr/n;->y:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lr/n;->y:I

    return-void

    :cond_0
    iget p1, p0, Lr/n;->y:I

    and-int/lit8 p1, p1, -0x21

    iput p1, p0, Lr/n;->y:I

    return-void
.end method

.method public final getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is not supported, use MenuItemCompat.getActionProvider()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getActionView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lr/n;->A:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lr/n;->B:Lr/o;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lr/o;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0, p0}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lr/n;->A:Landroid/view/View;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAlphabeticModifiers()I
    .locals 1

    iget v0, p0, Lr/n;->l:I

    return v0
.end method

.method public final getAlphabeticShortcut()C
    .locals 1

    iget-char v0, p0, Lr/n;->k:C

    return v0
.end method

.method public final getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lr/n;->r:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getGroupId()I
    .locals 1

    iget v0, p0, Lr/n;->c:I

    return v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lr/n;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lr/n;->d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    iget v0, p0, Lr/n;->n:I

    if-eqz v0, :cond_1

    iget-object v1, p0, Lr/n;->o:Lr/l;

    iget-object v1, v1, Lr/l;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, p0, Lr/n;->n:I

    iput-object v0, p0, Lr/n;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lr/n;->d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lr/n;->t:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lr/n;->u:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public final getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lr/n;->h:Landroid/content/Intent;

    return-object v0
.end method

.method public final getItemId()I
    .locals 1

    iget v0, p0, Lr/n;->b:I

    return v0
.end method

.method public final getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getNumericModifiers()I
    .locals 1

    iget v0, p0, Lr/n;->j:I

    return v0
.end method

.method public final getNumericShortcut()C
    .locals 1

    iget-char v0, p0, Lr/n;->i:C

    return v0
.end method

.method public final getOrder()I
    .locals 1

    iget v0, p0, Lr/n;->d:I

    return v0
.end method

.method public final getSubMenu()Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lr/n;->p:Lr/d0;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lr/n;->f:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lr/n;->g:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lr/n;->f:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getTooltipText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lr/n;->s:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final hasSubMenu()Z
    .locals 1

    iget-object v0, p0, Lr/n;->p:Lr/d0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isActionViewExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lr/n;->D:Z

    return v0
.end method

.method public final isCheckable()Z
    .locals 2

    iget v0, p0, Lr/n;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isChecked()Z
    .locals 2

    iget v0, p0, Lr/n;->y:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    iget v0, p0, Lr/n;->y:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVisible()Z
    .locals 3

    iget-object v0, p0, Lr/n;->B:Lr/o;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, v0, Lr/o;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lr/n;->y:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    iget-object v0, p0, Lr/n;->B:Lr/o;

    iget-object v0, v0, Lr/o;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget v0, p0, Lr/n;->y:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This is not supported, use MenuItemCompat.setActionProvider()"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setActionView(I)Landroid/view/MenuItem;
    .locals 4

    .line 7
    iget-object v0, p0, Lr/n;->o:Lr/l;

    iget-object v1, v0, Lr/l;->b:Landroid/content/Context;

    .line 8
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 9
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v2, p1, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 10
    iput-object p1, p0, Lr/n;->A:Landroid/view/View;

    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lr/n;->B:Lr/o;

    if-eqz p1, :cond_0

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lr/n;->b:I

    if-lez v1, :cond_0

    .line 13
    invoke-virtual {p1, v1}, Landroid/view/View;->setId(I)V

    :cond_0
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, v0, Lr/l;->l:Z

    .line 15
    invoke-virtual {v0, p1}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    iput-object p1, p0, Lr/n;->A:Landroid/view/View;

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lr/n;->B:Lr/o;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lr/n;->b:I

    if-lez v0, :cond_0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 5
    :cond_0
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lr/l;->l:Z

    .line 6
    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-char v0, p0, Lr/n;->k:C

    if-ne v0, p1, :cond_0

    return-object p0

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lr/n;->k:C

    .line 3
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setAlphabeticShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 4
    iget-char v0, p0, Lr/n;->k:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Lr/n;->l:I

    if-ne v0, p2, :cond_0

    return-object p0

    .line 5
    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lr/n;->k:C

    .line 6
    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lr/n;->l:I

    .line 7
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setCheckable(Z)Landroid/view/MenuItem;
    .locals 2

    iget v0, p0, Lr/n;->y:I

    and-int/lit8 v1, v0, -0x2

    or-int/2addr p1, v1

    iput p1, p0, Lr/n;->y:I

    if-eq v0, p1, :cond_0

    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    :cond_0
    return-object p0
.end method

.method public final setChecked(Z)Landroid/view/MenuItem;
    .locals 9

    iget v0, p0, Lr/n;->y:I

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x2

    iget-object v3, p0, Lr/n;->o:Lr/l;

    const/4 v4, 0x0

    if-eqz v1, :cond_5

    iget-object p1, v3, Lr/l;->g:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v3}, Lr/l;->z()V

    move v1, v4

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr/n;

    iget v6, v5, Lr/n;->c:I

    iget v7, p0, Lr/n;->c:I

    if-ne v6, v7, :cond_3

    iget v6, v5, Lr/n;->y:I

    and-int/lit8 v6, v6, 0x4

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Lr/n;->isCheckable()Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_3

    :cond_0
    if-ne v5, p0, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    iget v7, v5, Lr/n;->y:I

    and-int/lit8 v8, v7, -0x3

    if-eqz v6, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move v6, v4

    :goto_2
    or-int/2addr v6, v8

    iput v6, v5, Lr/n;->y:I

    if-eq v7, v6, :cond_3

    iget-object v5, v5, Lr/n;->o:Lr/l;

    invoke-virtual {v5, v4}, Lr/l;->q(Z)V

    :cond_3
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, Lr/l;->y()V

    return-object p0

    :cond_5
    and-int/lit8 v1, v0, -0x3

    if-eqz p1, :cond_6

    goto :goto_4

    :cond_6
    move v2, v4

    :goto_4
    or-int p1, v1, v2

    iput p1, p0, Lr/n;->y:I

    if-eq v0, p1, :cond_7

    invoke-virtual {v3, v4}, Lr/l;->q(Z)V

    :cond_7
    return-object p0
.end method

.method public final bridge synthetic setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/n;->setContentDescription(Ljava/lang/CharSequence;)Lx4/a;

    return-object p0
.end method

.method public final setContentDescription(Ljava/lang/CharSequence;)Lx4/a;
    .locals 1

    .line 2
    iput-object p1, p0, Lr/n;->r:Ljava/lang/CharSequence;

    .line 3
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    if-eqz p1, :cond_0

    iget p1, p0, Lr/n;->y:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lr/n;->y:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lr/n;->y:I

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, Lr/n;->y:I

    :goto_0
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lr/n;->m:Landroid/graphics/drawable/Drawable;

    .line 6
    iput p1, p0, Lr/n;->n:I

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lr/n;->x:Z

    .line 8
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lr/n;->n:I

    .line 2
    iput-object p1, p0, Lr/n;->m:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lr/n;->x:Z

    .line 4
    iget-object p1, p0, Lr/n;->o:Lr/l;

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lr/n;->t:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr/n;->v:Z

    iput-boolean p1, p0, Lr/n;->x:Z

    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lr/n;->u:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr/n;->w:Z

    iput-boolean p1, p0, Lr/n;->x:Z

    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lr/n;->h:Landroid/content/Intent;

    return-object p0
.end method

.method public final setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-char v0, p0, Lr/n;->i:C

    if-ne v0, p1, :cond_0

    return-object p0

    .line 2
    :cond_0
    iput-char p1, p0, Lr/n;->i:C

    .line 3
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setNumericShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 4
    iget-char v0, p0, Lr/n;->i:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Lr/n;->j:I

    if-ne v0, p2, :cond_0

    return-object p0

    .line 5
    :cond_0
    iput-char p1, p0, Lr/n;->i:C

    .line 6
    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lr/n;->j:I

    .line 7
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lr/n;->C:Landroid/view/MenuItem$OnActionExpandListener;

    return-object p0
.end method

.method public final setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lr/n;->q:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-object p0
.end method

.method public final setShortcut(CC)Landroid/view/MenuItem;
    .locals 0

    .line 1
    iput-char p1, p0, Lr/n;->i:C

    .line 2
    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lr/n;->k:C

    .line 3
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setShortcut(CCII)Landroid/view/MenuItem;
    .locals 0

    .line 4
    iput-char p1, p0, Lr/n;->i:C

    .line 5
    invoke-static {p3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lr/n;->j:I

    .line 6
    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lr/n;->k:C

    .line 7
    invoke-static {p4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lr/n;->l:I

    .line 8
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setShowAsAction(I)V
    .locals 3

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p1, p0, Lr/n;->z:I

    iget-object p1, p0, Lr/n;->o:Lr/l;

    iput-boolean v1, p1, Lr/l;->l:Z

    invoke-virtual {p1, v1}, Lr/l;->q(Z)V

    return-void
.end method

.method public final setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lr/n;->setShowAsAction(I)V

    return-object p0
.end method

.method public final setTitle(I)Landroid/view/MenuItem;
    .locals 1

    .line 5
    iget-object v0, p0, Lr/n;->o:Lr/l;

    .line 6
    iget-object v0, v0, Lr/l;->b:Landroid/content/Context;

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lr/n;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    iput-object p1, p0, Lr/n;->f:Ljava/lang/CharSequence;

    .line 2
    iget-object v0, p0, Lr/n;->o:Lr/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr/l;->q(Z)V

    .line 3
    iget-object v0, p0, Lr/n;->p:Lr/d0;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lr/d0;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    :cond_0
    return-object p0
.end method

.method public final setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lr/n;->g:Ljava/lang/CharSequence;

    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final bridge synthetic setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/n;->setTooltipText(Ljava/lang/CharSequence;)Lx4/a;

    return-object p0
.end method

.method public final setTooltipText(Ljava/lang/CharSequence;)Lx4/a;
    .locals 1

    .line 2
    iput-object p1, p0, Lr/n;->s:Ljava/lang/CharSequence;

    .line 3
    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    return-object p0
.end method

.method public final setVisible(Z)Landroid/view/MenuItem;
    .locals 2

    iget v0, p0, Lr/n;->y:I

    and-int/lit8 v1, v0, -0x9

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    or-int/2addr p1, v1

    iput p1, p0, Lr/n;->y:I

    if-eq v0, p1, :cond_1

    iget-object p1, p0, Lr/n;->o:Lr/l;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lr/l;->i:Z

    invoke-virtual {p1, v0}, Lr/l;->q(Z)V

    :cond_1
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr/n;->f:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
