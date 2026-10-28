.class public final Le10/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Le10/q0;->w:I

    iput-object p1, p0, Le10/q0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDestroy(Landroidx/lifecycle/g0;)V
    .locals 5

    iget v0, p0, Le10/q0;->w:I

    const/4 v1, 0x0

    iget-object v2, p0, Le10/q0;->x:Ljava/lang/Object;

    const-string v3, "owner"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v0, :pswitch_data_0

    check-cast v2, Ln20/i;

    iget-object p1, v2, Ln20/i;->u:Lj/d;

    invoke-virtual {p1}, Lj/d;->b()V

    iget-object p1, v2, Ln20/i;->v:Lj/d;

    invoke-virtual {p1}, Lj/d;->b()V

    iget-object p1, v2, Ln20/i;->n:Lwz/r0;

    iget-object v0, p1, Lwz/r0;->e:Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    iput-object v1, p1, Lwz/r0;->e:Lj/d;

    iget-object p1, v2, Ln20/i;->m:Lwz/r0;

    iget-object v0, p1, Lwz/r0;->e:Lj/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_1
    iput-object v1, p1, Lwz/r0;->e:Lj/d;

    sget-object p1, Ld10/a;->a:Ljava/util/LinkedHashMap;

    iget-object p1, v2, Ln20/i;->t:Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld10/a;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    check-cast v2, Li20/y0;

    iget-object p1, v2, Li20/y0;->b:Lj/d;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lj/d;->b()V

    :cond_2
    iput-object v1, v2, Li20/y0;->b:Lj/d;

    return-void

    :pswitch_1
    check-cast v2, Lh20/w0;

    iget-object v0, v2, Lh20/w0;->f0:Lwz/r0;

    iget-object v2, v0, Lwz/r0;->e:Lj/d;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lj/d;->b()V

    :cond_3
    iput-object v1, v0, Lwz/r0;->e:Lj/d;

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void

    :pswitch_2
    sget-object v0, Ld10/a;->a:Ljava/util/LinkedHashMap;

    check-cast v2, La30/w0;

    iget-object v0, v2, La30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ld10/a;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void

    :pswitch_3
    check-cast v2, Lg20/r;

    iget-object v0, v2, Lg20/r;->y:Lc20/a;

    invoke-virtual {v0}, Lc20/a;->a()Ln83/i;

    move-result-object v2

    invoke-virtual {v2}, Ln83/i;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    move-object v3, v2

    check-cast v3, Li6/c;

    invoke-virtual {v3}, Li6/c;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v3, v2

    check-cast v3, Ln83/d;

    invoke-virtual {v3}, Ln83/d;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc20/e;

    invoke-virtual {v3}, Lc20/e;->a()V

    goto :goto_0

    :cond_4
    iget-object v2, v0, Lc20/a;->e:Lj/d;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lj/d;->b()V

    :cond_5
    iget-object v2, v0, Lc20/a;->f:Lj/d;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lj/d;->b()V

    :cond_6
    iput-object v1, v0, Lc20/a;->e:Lj/d;

    iput-object v1, v0, Lc20/a;->f:Lj/d;

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void

    :pswitch_4
    check-cast v2, Le10/r0;

    iget-object v0, v2, Le10/r0;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le10/i0;

    iget-object v3, v2, Le10/i0;->c:Ljava/lang/Object;

    if-eqz v3, :cond_7

    iget-object v4, v2, Le10/i0;->b:Le10/j;

    invoke-interface {v4, v3}, Le10/j;->h(Ljava/lang/Object;)V

    :cond_7
    iput-object v1, v2, Le10/i0;->c:Ljava/lang/Object;

    goto :goto_1

    :cond_8
    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
