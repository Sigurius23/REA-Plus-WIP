.class public final Lja3/p;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/q;


# direct methods
.method public synthetic constructor <init>(Lja3/q;I)V
    .locals 0

    iput p2, p0, Lja3/p;->w:I

    iput-object p1, p0, Lja3/p;->x:Lja3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lja3/p;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lja3/p;->x:Lja3/q;

    iget-object v1, v1, Lja3/q;->J:Lkb3/i;

    sget-object v2, Lja3/q;->N:[Lj93/z;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-static {v1, v2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw93/b;

    invoke-static {v3}, Ldb3/b;->c(Ljava/lang/String;)Ldb3/b;

    move-result-object v3

    iget-object v2, v2, Lw93/b;->b:Lpa3/b;

    iget-object v4, v2, Lpa3/b;->d:Ljava/lang/Object;

    check-cast v4, Lpa3/a;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_3

    const/4 v6, 0x5

    if-eq v5, v6, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Lpa3/b;->b:Ljava/lang/String;

    sget-object v5, Lpa3/a;->I:Lpa3/a;

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v2}, Ldb3/b;->c(Ljava/lang/String;)Ldb3/b;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v3, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/p;->x:Lja3/q;

    iget-object v0, v0, Lja3/q;->H:Lx93/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lja3/p;->x:Lja3/q;

    iget-object v1, v0, Lja3/q;->I:Lzt/q;

    iget-object v1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->l:Loa3/g;

    iget-object v0, v0, Lu93/g0;->F:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "packageFqName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
