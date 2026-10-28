.class public Lcom/whoop/ui/WhoopToolbar;
.super Landroidx/appcompat/widget/Toolbar;
.source "SourceFile"


# instance fields
.field private x0:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private L()V
    .locals 1

    sget v0, Lnf1/d;->l:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/WhoopToolbar;->x0:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public H(Landroid/content/Context;I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopToolbar;->x0:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/Toolbar;->H(Landroid/content/Context;I)V

    return-void
.end method

.method public onFinishInflate()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-direct {p0}, Lcom/whoop/ui/WhoopToolbar;->L()V

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/whoop/ui/WhoopToolbar;->x0:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 4
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/whoop/ui/WhoopToolbar;->x0:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 7
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleTextColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopToolbar;->x0:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(I)V

    return-void
.end method
