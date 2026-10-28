.class public final Landroidx/fragment/app/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/fragment/app/q;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/q;Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/o;->w:I

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/o;->x:Landroidx/fragment/app/q;

    iput-object p2, p0, Landroidx/fragment/app/o;->z:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/fragment/app/o;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/q;Ljava/lang/Object;Landroid/view/ViewGroup;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/o;->w:I

    .line 2
    iput-object p1, p0, Landroidx/fragment/app/o;->x:Landroidx/fragment/app/q;

    iput-object p2, p0, Landroidx/fragment/app/o;->y:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/o;->z:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Landroidx/fragment/app/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/o;->x:Landroidx/fragment/app/q;

    iget-object v1, v0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    iget-object v2, v0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const-string v4, "FragmentManager"

    const/4 v5, 0x2

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/r;

    iget-object v6, v6, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-boolean v6, v6, Landroidx/fragment/app/p2;->g:Z

    if-nez v6, :cond_1

    invoke-static {v5}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "Completing animating immediately"

    invoke-static {v4, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance v3, Lb5/d;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/r;

    iget-object v1, v1, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v1, v1, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    new-instance v4, Landroidx/fragment/app/m;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v5}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Landroidx/fragment/app/o;->y:Ljava/lang/Object;

    invoke-virtual {v2, v1, v0, v3, v4}, Landroidx/fragment/app/k2;->u(Landroidx/fragment/app/m0;Ljava/lang/Object;Lb5/d;Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Lb5/d;->a()V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {v5}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "Animating to start"

    invoke-static {v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v1, v0, Landroidx/fragment/app/q;->q:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v3, La8/c;

    const/4 v4, 0x2

    iget-object v5, p0, Landroidx/fragment/app/o;->z:Landroid/view/ViewGroup;

    invoke-direct {v3, v4, v0, v5}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v1, v3}, Landroidx/fragment/app/k2;->d(Ljava/lang/Object;La8/c;)V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/o;->x:Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    iget-object v1, p0, Landroidx/fragment/app/o;->z:Landroid/view/ViewGroup;

    iget-object v2, p0, Landroidx/fragment/app/o;->y:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/k2;->e(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
