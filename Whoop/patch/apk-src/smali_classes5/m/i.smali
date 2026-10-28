.class public Lm/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm/e;

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lm/j;->g(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lm/i;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lm/e;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 4
    invoke-static {p1, p2}, Lm/j;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lm/e;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, Lm/i;->a:Lm/e;

    .line 5
    iput p2, p0, Lm/i;->b:I

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lm/i;->a:Lm/e;

    iget-object v1, v0, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lm/e;->f:Ljava/lang/CharSequence;

    return-void
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, Lm/i;->a:Lm/e;

    iget-object v1, v0, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lm/e;->d:Ljava/lang/CharSequence;

    return-void
.end method

.method public final c()Lm/j;
    .locals 1

    invoke-virtual {p0}, Lm/i;->create()Lm/j;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-object v0
.end method

.method public create()Lm/j;
    .locals 11

    new-instance v0, Lm/j;

    iget-object v1, p0, Lm/i;->a:Lm/e;

    iget-object v2, v1, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    iget v3, p0, Lm/i;->b:I

    invoke-direct {v0, v2, v3}, Lm/j;-><init>(Landroid/view/ContextThemeWrapper;I)V

    iget-object v2, v1, Lm/e;->e:Landroid/view/View;

    iget-object v3, v0, Lm/j;->F:Lm/h;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iput-object v2, v3, Lm/h;->w:Landroid/view/View;

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lm/e;->d:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    iput-object v2, v3, Lm/h;->d:Ljava/lang/CharSequence;

    iget-object v5, v3, Lm/h;->u:Landroid/widget/TextView;

    if-eqz v5, :cond_1

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v2, v1, Lm/e;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    iput-object v2, v3, Lm/h;->s:Landroid/graphics/drawable/Drawable;

    iget-object v5, v3, Lm/h;->t:Landroid/widget/ImageView;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v5, v3, Lm/h;->t:Landroid/widget/ImageView;

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    :goto_0
    iget-object v2, v1, Lm/e;->f:Ljava/lang/CharSequence;

    if-eqz v2, :cond_3

    iput-object v2, v3, Lm/h;->e:Ljava/lang/CharSequence;

    iget-object v5, v3, Lm/h;->v:Landroid/widget/TextView;

    if-eqz v5, :cond_3

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object v2, v1, Lm/e;->g:Ljava/lang/CharSequence;

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v5, -0x1

    iget-object v6, v1, Lm/e;->h:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v3, v5, v2, v6}, Lm/h;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    :goto_1
    iget-object v2, v1, Lm/e;->i:Ljava/lang/CharSequence;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, -0x2

    iget-object v6, v1, Lm/e;->j:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v3, v5, v2, v6}, Lm/h;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    :goto_2
    iget-object v2, v1, Lm/e;->k:Ljava/lang/CharSequence;

    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    const/4 v5, -0x3

    iget-object v6, v1, Lm/e;->l:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v3, v5, v2, v6}, Lm/h;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    :goto_3
    iget-object v2, v1, Lm/e;->q:Landroid/widget/ListAdapter;

    const/4 v5, 0x1

    if-eqz v2, :cond_b

    iget-object v2, v1, Lm/e;->b:Landroid/view/LayoutInflater;

    iget v6, v3, Lm/h;->A:I

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    iget-boolean v6, v1, Lm/e;->t:Z

    if-eqz v6, :cond_7

    iget v6, v3, Lm/h;->B:I

    goto :goto_4

    :cond_7
    iget v6, v3, Lm/h;->C:I

    :goto_4
    iget-object v8, v1, Lm/e;->q:Landroid/widget/ListAdapter;

    if-eqz v8, :cond_8

    goto :goto_5

    :cond_8
    new-instance v8, Lm/g;

    iget-object v9, v1, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    const v10, 0x1020014

    invoke-direct {v8, v9, v6, v10, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    :goto_5
    iput-object v8, v3, Lm/h;->x:Landroid/widget/ListAdapter;

    iget v6, v1, Lm/e;->u:I

    iput v6, v3, Lm/h;->y:I

    iget-object v6, v1, Lm/e;->r:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v6, :cond_9

    new-instance v6, Lm/d;

    invoke-direct {v6, v1, v3}, Lm/d;-><init>(Lm/e;Lm/h;)V

    invoke-virtual {v2, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_9
    iget-boolean v6, v1, Lm/e;->t:Z

    if-eqz v6, :cond_a

    invoke-virtual {v2, v5}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    :cond_a
    iput-object v2, v3, Lm/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    :cond_b
    iget-object v2, v1, Lm/e;->s:Landroid/view/View;

    if-eqz v2, :cond_c

    iput-object v2, v3, Lm/h;->g:Landroid/view/View;

    iput-boolean v4, v3, Lm/h;->h:Z

    :cond_c
    iget-boolean v2, v1, Lm/e;->m:Z

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-boolean v2, v1, Lm/e;->m:Z

    if-eqz v2, :cond_d

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_d
    iget-object v2, v1, Lm/e;->n:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v2, v1, Lm/e;->o:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v1, Lm/e;->p:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_e

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_e
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lm/i;->a:Lm/e;

    iget-object v0, v0, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    return-object v0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;
    .locals 2

    iget-object v0, p0, Lm/i;->a:Lm/e;

    iget-object v1, v0, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lm/e;->i:Ljava/lang/CharSequence;

    iput-object p2, v0, Lm/e;->j:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;
    .locals 2

    iget-object v0, p0, Lm/i;->a:Lm/e;

    iget-object v1, v0, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lm/e;->g:Ljava/lang/CharSequence;

    iput-object p2, v0, Lm/e;->h:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Lm/i;
    .locals 1

    iget-object v0, p0, Lm/i;->a:Lm/e;

    iput-object p1, v0, Lm/e;->d:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public setView(Landroid/view/View;)Lm/i;
    .locals 1

    iget-object v0, p0, Lm/i;->a:Lm/e;

    iput-object p1, v0, Lm/e;->s:Landroid/view/View;

    return-object p0
.end method
