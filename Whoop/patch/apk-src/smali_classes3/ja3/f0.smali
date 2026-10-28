.class public final Lja3/f0;
.super Lu93/c;
.source "SourceFile"


# instance fields
.field public final L:Lzt/q;

.field public final M:Lx93/b0;


# direct methods
.method public constructor <init>(Lzt/q;Lx93/b0;ILr93/l;)V
    .locals 10

    const-string v0, "javaTypeParameter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v2, v0, Lia3/a;->a:Lkb3/n;

    new-instance v4, Lia3/c;

    const/4 v1, 0x0

    invoke-direct {v4, p1, p2, v1}, Lia3/c;-><init>(Lzt/q;Lma3/b;Z)V

    iget-object v1, p2, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    invoke-interface {v1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v5

    sget-object v6, Llb3/g1;->y:Llb3/g1;

    const/4 v7, 0x0

    iget-object v9, v0, Lia3/a;->m:Lr93/v0;

    move-object v1, p0

    move v8, p3

    move-object v3, p4

    invoke-direct/range {v1 .. v9}, Lu93/c;-><init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Llb3/g1;ZILr93/v0;)V

    iput-object p1, v1, Lja3/f0;->L:Lzt/q;

    iput-object p2, v1, Lja3/f0;->M:Lx93/b0;

    return-void
.end method


# virtual methods
.method public final J0(Ljava/util/List;)Ljava/util/List;
    .locals 11

    iget-object v3, p0, Lja3/f0;->L:Lzt/q;

    iget-object v0, v3, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v6, v0, Lia3/a;->r:Ljc/b;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Llb3/y;

    sget-object v0, Lna3/n;->z:Lna3/n;

    const-string v1, "<this>"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v7, v0, v1}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v4, v6

    move-object v6, v7

    goto :goto_1

    :cond_0
    new-instance v0, Llg3/q;

    sget-object v4, Lfa3/a;->F:Lfa3/a;

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Llg3/q;-><init>(Ls93/a;ZLzt/q;Lfa3/a;Z)V

    move-object v4, v6

    move-object v6, v7

    sget-object v7, Lm83/y;->w:Lm83/y;

    const/4 v9, 0x0

    const/4 v8, 0x0

    move-object v5, v0

    invoke-virtual/range {v4 .. v9}, Ljc/b;->m(Llg3/q;Llb3/y;Ljava/util/List;Lna3/q;Z)Llb3/y;

    move-result-object v7

    if-nez v7, :cond_1

    :goto_1
    move-object v7, v6

    :cond_1
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v6, v4

    goto :goto_0

    :cond_2
    return-object v10
.end method

.method public final K0()Ljava/util/List;
    .locals 8

    iget-object v0, p0, Lja3/f0;->M:Lx93/b0;

    iget-object v0, v0, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getBounds(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    new-instance v6, Lx93/p;

    invoke-direct {v6, v5}, Lx93/p;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx93/p;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lx93/p;->a:Ljava/lang/reflect/Type;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-class v2, Ljava/lang/Object;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    iget-object v2, p0, Lja3/f0;->L:Lzt/q;

    if-eqz v0, :cond_3

    iget-object v0, v2, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {v0}, Lr93/b0;->c()Lo93/h;

    move-result-object v0

    invoke-virtual {v0}, Lo93/h;->e()Llb3/c0;

    move-result-object v0

    iget-object v1, v2, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->o:Lr93/b0;

    invoke-interface {v1}, Lr93/b0;->c()Lo93/h;

    move-result-object v1

    invoke-virtual {v1}, Lo93/h;->p()Llb3/c0;

    move-result-object v1

    invoke-static {v0, v1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_3
    check-cast v1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx93/p;

    iget-object v5, v2, Lzt/q;->E:Ljava/lang/Object;

    check-cast v5, La3/p;

    sget-object v6, Llb3/b1;->x:Llb3/b1;

    const/4 v7, 0x3

    invoke-static {v6, v3, p0, v7}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object v0
.end method
