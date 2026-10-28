.class public final Lm/l0;
.super Lx43/j;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lm/n0;


# direct methods
.method public synthetic constructor <init>(Lm/n0;I)V
    .locals 0

    iput p2, p0, Lm/l0;->d:I

    iput-object p1, p0, Lm/l0;->e:Lm/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget v0, p0, Lm/l0;->d:I

    const/4 v1, 0x0

    iget-object v2, p0, Lm/l0;->e:Lm/n0;

    packed-switch v0, :pswitch_data_0

    iput-object v1, v2, Lm/n0;->s:Lq/l;

    iget-object v0, v2, Lm/n0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_0
    iget-boolean v0, v2, Lm/n0;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, v2, Lm/n0;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, v2, Lm/n0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object v0, v2, Lm/n0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object v0, v2, Lm/n0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iput-object v1, v2, Lm/n0;->s:Lq/l;

    iget-object v0, v2, Lm/n0;->k:Lqg3/d;

    if-eqz v0, :cond_1

    iget-object v3, v2, Lm/n0;->j:Lm/m0;

    invoke-virtual {v0, v3}, Lqg3/d;->D(Lq/b;)V

    iput-object v1, v2, Lm/n0;->j:Lm/m0;

    iput-object v1, v2, Lm/n0;->k:Lqg3/d;

    :cond_1
    iget-object v0, v2, Lm/n0;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_2

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Lh5/f0;->c(Landroid/view/View;)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
