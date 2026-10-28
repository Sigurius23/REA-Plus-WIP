.class public final Lb4/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb4/l;

.field public final synthetic y:La3/n0;


# direct methods
.method public synthetic constructor <init>(Lb4/l;La3/n0;I)V
    .locals 0

    iput p3, p0, Lb4/d;->w:I

    iput-object p1, p0, Lb4/d;->x:Lb4/l;

    iput-object p2, p0, Lb4/d;->y:La3/n0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lb4/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly2/y;

    iget-object v0, p0, Lb4/d;->y:La3/n0;

    iget-object v1, p0, Lb4/d;->x:Lb4/l;

    invoke-static {v1, v0}, Lb4/n;->f(Landroid/view/View;La3/n0;)V

    iget-object v0, v1, Lb4/l;->y:Landroidx/compose/ui/node/Owner;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->d0:Z

    iget-object v0, v1, Lb4/l;->N:[I

    const/4 v3, 0x0

    aget v4, v0, v3

    aget v5, v0, v2

    invoke-virtual {v1}, Lb4/l;->getView()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-wide v6, v1, Lb4/l;->O:J

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v8

    iput-wide v8, v1, Lb4/l;->O:J

    iget-object p1, v1, Lb4/l;->P:Lh5/q1;

    if-eqz p1, :cond_1

    aget v3, v0, v3

    if-ne v4, v3, :cond_0

    aget v0, v0, v2

    if-ne v5, v0, :cond_0

    invoke-static {v6, v7, v8, v9}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {v1, p1}, Lb4/l;->m(Lh5/q1;)Lh5/q1;

    move-result-object p1

    invoke-virtual {p1}, Lh5/q1;->g()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lb4/l;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/i1;

    iget-object p1, p0, Lb4/d;->x:Lb4/l;

    iget-object v0, p0, Lb4/d;->y:La3/n0;

    invoke-static {p1, v0}, Lb4/n;->f(Landroid/view/View;La3/n0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/node/Owner;

    instance-of v0, p1, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v0, :cond_2

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lb4/d;->x:Lb4/l;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v1

    invoke-virtual {v1}, Lb3/h1;->getHolderToLayoutNode()Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lb4/d;->y:La3/n0;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v1

    invoke-virtual {v1}, Lb3/h1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v1

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    new-instance v1, Lb3/q;

    invoke-direct {v1, p1, v2, p1}, Lb3/q;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;La3/n0;Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-static {v0, v1}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    :cond_3
    invoke-virtual {v0}, Lb4/l;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eq p1, v0, :cond_4

    invoke-virtual {v0}, Lb4/l;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
