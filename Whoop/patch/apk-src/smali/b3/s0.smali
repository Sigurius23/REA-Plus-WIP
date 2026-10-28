.class public final Lb3/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lb3/s0;->a:I

    iput-object p2, p0, Lb3/s0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb3/s0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 4

    iget v0, p0, Lb3/s0;->a:I

    iget-object v1, p0, Lb3/s0;->c:Ljava/lang/Object;

    iget-object v2, p0, Lb3/s0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Ll0/c2;

    check-cast v1, Landroid/view/View;

    iget v0, v2, Ll0/c2;->t:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Ll0/c2;->t:I

    if-nez v0, :cond_0

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    invoke-static {v1, v0}, Lh5/p0;->q(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V

    iget-object v0, v2, Ll0/c2;->u:Ll0/v0;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast v2, Lp1/t2;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    move-object v3, v1

    check-cast v3, Lgb/i;

    invoke-virtual {v3}, Leb/i1;->b()Leb/t;

    move-result-object v3

    invoke-virtual {v3, v2}, Leb/t;->b(Leb/q;)V

    goto :goto_0

    :cond_1
    return-void

    :pswitch_1
    check-cast v2, Ld0/z1;

    check-cast v1, Ld0/v1;

    iget-object v0, v2, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0, v1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_2
    check-cast v2, Ld0/z1;

    check-cast v1, Ld0/z1;

    iget-object v0, v2, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0, v1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_3
    check-cast v2, Ld0/l0;

    check-cast v1, Ld0/j0;

    iget-object v0, v2, Ld0/l0;->a:Lr1/c;

    invoke-virtual {v0, v1}, Lr1/c;->k(Ljava/lang/Object;)Z

    return-void

    :pswitch_4
    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v1, Lb3/v0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void

    :pswitch_5
    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v1, Lb3/u0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
