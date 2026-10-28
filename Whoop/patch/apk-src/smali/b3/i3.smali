.class public final synthetic Lb3/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb3/i3;->w:I

    iput-object p1, p0, Lb3/i3;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 6

    iget v0, p0, Lb3/i3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/i3;->x:Ljava/lang/Object;

    check-cast v0, Lrb/a;

    const-string v1, "<unused var>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, v0, Lrb/a;->h:Z

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, v0, Lrb/a;->h:Z

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lb3/i3;->x:Ljava/lang/Object;

    check-cast v0, Lhb/f;

    const-string v1, "source"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "event"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v1, :cond_5

    move-object p2, p1

    check-cast p2, Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object v1

    iget-object v1, v1, Leb/t;->f:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Leb/q;

    iget-object v4, v4, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v2, v3

    goto :goto_1

    :cond_3
    check-cast v2, Leb/q;

    if-eqz v2, :cond_5

    invoke-static {}, Lhb/f;->n()Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Marking transition complete for entry "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " due to fragment "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " lifecycle reaching DESTROYED"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentNavigator"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p1

    invoke-virtual {p1, v2}, Leb/t;->b(Leb/q;)V

    :cond_5
    return-void

    :pswitch_1
    iget-object v0, p0, Lb3/i3;->x:Ljava/lang/Object;

    check-cast v0, Leb/a0;

    const-string v1, "<anonymous parameter 0>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/lifecycle/v;->a()Landroidx/lifecycle/w;

    move-result-object p1

    iput-object p1, v0, Leb/a0;->s:Landroidx/lifecycle/w;

    iget-object p1, v0, Leb/a0;->c:Leb/r0;

    if-eqz p1, :cond_6

    iget-object p1, v0, Leb/a0;->g:Lm83/m;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Landroidx/lifecycle/v;->a()Landroidx/lifecycle/w;

    move-result-object v1

    iput-object v1, v0, Leb/q;->z:Landroidx/lifecycle/w;

    invoke-virtual {v0}, Leb/q;->d()V

    goto :goto_2

    :cond_6
    return-void

    :pswitch_2
    iget-object p1, p0, Lb3/i3;->x:Ljava/lang/Object;

    check-cast p1, Lb3/a;

    sget-object v0, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v0, :cond_7

    invoke-virtual {p1}, Lb3/a;->d()V

    :cond_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
