.class public final Lja3/k;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/o;


# direct methods
.method public synthetic constructor <init>(Lja3/o;I)V
    .locals 0

    iput p2, p0, Lja3/k;->w:I

    iput-object p1, p0, Lja3/k;->x:Lja3/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lja3/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/k;->x:Lja3/o;

    iget-object v0, v0, Lja3/o;->o:Lx93/n;

    invoke-virtual {v0}, Lx93/n;->b()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lx93/t;

    invoke-virtual {v3}, Lx93/t;->l()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v2, 0x10

    if-ge v0, v2, :cond_2

    move v0, v2

    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lx93/t;

    invoke-virtual {v3}, Lx93/v;->d()Lva3/h;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-object v2

    :pswitch_0
    iget-object v0, p0, Lja3/k;->x:Lja3/o;

    iget-object v0, v0, Lja3/o;->o:Lx93/n;

    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getDeclaredClasses(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v0

    sget-object v1, Lx93/b;->z:Lx93/b;

    new-instance v2, Lxb3/f;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v1}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    sget-object v0, Lx93/b;->E:Lx93/b;

    invoke-static {v2, v0}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
