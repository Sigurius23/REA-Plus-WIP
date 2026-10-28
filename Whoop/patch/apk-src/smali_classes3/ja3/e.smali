.class public final Lja3/e;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/f;


# direct methods
.method public synthetic constructor <init>(Lja3/f;I)V
    .locals 0

    iput p2, p0, Lja3/e;->w:I

    iput-object p1, p0, Lja3/e;->x:Lja3/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lja3/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/e;->x:Lja3/f;

    iget-object v1, v0, Lja3/f;->b:Lx93/d;

    invoke-virtual {v1}, Lx93/d;->b()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lma3/a;

    move-object v4, v3

    check-cast v4, Lx93/e;

    iget-object v4, v4, Lx93/e;->a:Lva3/h;

    if-nez v4, :cond_1

    sget-object v4, Lfa3/x;->b:Lva3/h;

    :cond_1
    invoke-virtual {v0, v3}, Lja3/f;->c(Lma3/a;)Lab3/g;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/e;->x:Lja3/f;

    invoke-virtual {v0}, Lja3/f;->b()Lva3/e;

    move-result-object v1

    iget-object v2, v0, Lja3/f;->b:Lx93/d;

    iget-object v0, v0, Lja3/f;->a:Lzt/q;

    if-nez v1, :cond_4

    sget-object v0, Lnb3/k;->e0:Lnb3/k;

    invoke-virtual {v2}, Lx93/d;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v0

    goto :goto_3

    :cond_4
    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v3, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {v3}, Lr93/b0;->c()Lo93/h;

    move-result-object v4

    invoke-static {v1, v4}, Lq93/e;->b(Lva3/e;Lo93/h;)Lr93/e;

    move-result-object v4

    if-nez v4, :cond_6

    new-instance v4, Lx93/n;

    iget-object v2, v2, Lx93/d;->a:Ljava/lang/annotation/Annotation;

    invoke-static {v2}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v2

    invoke-static {v2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v4, v2}, Lx93/n;-><init>(Ljava/lang/Class;)V

    iget-object v2, v0, Lia3/a;->k:Laj/d;

    iget-object v2, v2, Laj/d;->w:Ljava/lang/Object;

    check-cast v2, Lbu/c;

    if-eqz v2, :cond_5

    invoke-virtual {v2, v4}, Lbu/c;->I(Lx93/n;)Lr93/e;

    move-result-object v4

    if-nez v4, :cond_6

    new-instance v2, Lva3/c;

    invoke-virtual {v1}, Lva3/e;->b()Lva3/e;

    move-result-object v4

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->g()Lva3/h;

    move-result-object v1

    invoke-direct {v2, v4, v1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    iget-object v0, v0, Lia3/a;->d:Loa3/f;

    invoke-virtual {v0}, Loa3/f;->c()Lhb3/i;

    move-result-object v0

    iget-object v0, v0, Lhb3/i;->l:Lzt/q;

    invoke-static {v3, v2, v0}, Lhg3/i;->O(Lr93/b0;Lva3/c;Lzt/q;)Lr93/e;

    move-result-object v4

    goto :goto_2

    :cond_5
    const-string v0, "resolver"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_6
    :goto_2
    invoke-interface {v4}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    :goto_3
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lja3/e;->x:Lja3/f;

    iget-object v0, v0, Lja3/f;->b:Lx93/d;

    iget-object v0, v0, Lx93/d;->a:Ljava/lang/annotation/Annotation;

    invoke-static {v0}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v0

    invoke-static {v0}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v0

    invoke-virtual {v0}, Lva3/c;->a()Lva3/e;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
