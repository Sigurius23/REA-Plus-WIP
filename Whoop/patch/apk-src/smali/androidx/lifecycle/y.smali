.class public final synthetic Landroidx/lifecycle/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Landroidx/lifecycle/y;->w:I

    iput-object p2, p0, Landroidx/lifecycle/y;->x:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/y;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 7

    iget v0, p0, Landroidx/lifecycle/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/lifecycle/y;->x:Ljava/lang/Object;

    check-cast v0, Lhb/f;

    iget-object v1, p0, Landroidx/lifecycle/y;->y:Ljava/lang/Object;

    check-cast v1, Leb/q;

    const-string v2, "$entry"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "owner"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "event"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    const-string v3, " due to fragment "

    const-string v4, "Marking transition complete for entry "

    const-string v5, "FragmentNavigator"

    if-ne p2, v2, :cond_1

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object v2

    iget-object v2, v2, Leb/t;->e:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lhb/f;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " view lifecycle reaching RESUMED"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object v2

    invoke-virtual {v2, v1}, Leb/t;->b(Leb/q;)V

    :cond_1
    sget-object v2, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v2, :cond_3

    invoke-static {}, Lhb/f;->n()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " view lifecycle reaching DESTROYED"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p1

    invoke-virtual {p1, v1}, Leb/t;->b(Leb/q;)V

    :cond_3
    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/y;->x:Ljava/lang/Object;

    check-cast v0, Lg/z;

    iget-object v1, p0, Landroidx/lifecycle/y;->y:Ljava/lang/Object;

    check-cast v1, Lg/l;

    const-string v2, "<anonymous parameter 0>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_4

    invoke-static {v1}, Lb5/c;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    iput-object p1, v0, Lg/z;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p1, v0, Lg/z;->g:Z

    invoke-virtual {v0, p1}, Lg/z;->e(Z)V

    :cond_4
    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/y;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/z;

    iget-object v1, p0, Landroidx/lifecycle/y;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/k1;

    const-string v2, "source"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<unused var>"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p2

    sget-object v2, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne p2, v2, :cond_5

    const/4 p1, 0x0

    invoke-interface {v1, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {v0}, Landroidx/lifecycle/z;->a()V

    goto :goto_0

    :cond_5
    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p1

    iget-object p2, v0, Landroidx/lifecycle/z;->b:Landroidx/lifecycle/w;

    iget-object v0, v0, Landroidx/lifecycle/z;->c:Landroidx/lifecycle/n;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-gez p1, :cond_6

    const/4 p1, 0x1

    iput-boolean p1, v0, Landroidx/lifecycle/n;->a:Z

    goto :goto_0

    :cond_6
    iget-boolean p1, v0, Landroidx/lifecycle/n;->a:Z

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    iget-boolean p1, v0, Landroidx/lifecycle/n;->b:Z

    if-nez p1, :cond_8

    const/4 p1, 0x0

    iput-boolean p1, v0, Landroidx/lifecycle/n;->a:Z

    invoke-virtual {v0}, Landroidx/lifecycle/n;->a()V

    :goto_0
    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot resume a finished dispatcher"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
