.class public final Lu93/z;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lu93/a0;


# direct methods
.method public synthetic constructor <init>(Lu93/a0;I)V
    .locals 0

    iput p2, p0, Lu93/z;->w:I

    iput-object p1, p0, Lu93/z;->x:Lu93/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lu93/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu93/z;->x:Lu93/a0;

    iget-object v1, v0, Lu93/a0;->G:Lkb3/i;

    sget-object v2, Lu93/a0;->I:[Lj93/z;

    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-static {v1, v3}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v3, v0, Lu93/a0;->E:Lva3/e;

    iget-object v4, v0, Lu93/a0;->z:Lu93/e0;

    if-eqz v1, :cond_0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lu93/a0;->F:Lkb3/i;

    const/4 v1, 0x0

    aget-object v1, v2, v1

    invoke-static {v0, v1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/g0;

    invoke-interface {v2}, Lr93/g0;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Lu93/r0;

    invoke-direct {v0, v4, v3}, Lu93/r0;-><init>(Lr93/b0;Lva3/e;)V

    invoke-static {v0, v1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "package view scope for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lu93/n;->getName()Lva3/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/room/c1;->m(Ljava/lang/String;Ljava/lang/Iterable;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lu93/z;->x:Lu93/a0;

    iget-object v1, v0, Lu93/a0;->z:Lu93/e0;

    iget-boolean v2, v1, Lu93/e0;->J:Z

    if-eqz v2, :cond_2

    iget-object v1, v1, Lu93/e0;->L:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu93/m;

    iget-object v0, v0, Lu93/a0;->E:Lva3/e;

    invoke-static {v1, v0}, Lj93/l0;->N(Lr93/j0;Lva3/e;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static {v1}, Lr93/y;->c(Lu93/e0;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lu93/z;->x:Lu93/a0;

    iget-object v1, v0, Lu93/a0;->z:Lu93/e0;

    iget-boolean v2, v1, Lu93/e0;->J:Z

    if-eqz v2, :cond_3

    iget-object v1, v1, Lu93/e0;->L:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu93/m;

    iget-object v0, v0, Lu93/a0;->E:Lva3/e;

    invoke-static {v1, v0}, Lj93/l0;->R(Lr93/j0;Lva3/e;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_3
    invoke-static {v1}, Lr93/y;->c(Lu93/e0;)V

    const/4 v0, 0x0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
