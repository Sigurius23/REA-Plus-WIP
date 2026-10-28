.class public abstract Lxb3/k;
.super Lv63/c;


# direct methods
.method public static A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb3/s;

    invoke-direct {v0, p0, p1}, Lxb3/s;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;
    .locals 2

    new-instance v0, Lxb3/s;

    invoke-direct {v0, p0, p1}, Lxb3/s;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lvb1/a;

    const/16 p1, 0x10

    invoke-direct {p0, p1}, Lvb1/a;-><init>(I)V

    new-instance p1, Lxb3/f;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    return-object p1
.end method

.method public static C(Lxb3/i;Ljava/util/Comparator;)Lxb3/o;
    .locals 2

    const-string v0, "comparator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb3/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lxb3/o;-><init>(Lxb3/i;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static D(Lxb3/i;I)Lxb3/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_2

    if-nez p1, :cond_0

    sget-object p0, Lxb3/d;->a:Lxb3/d;

    return-object p0

    :cond_0
    instance-of v0, p0, Lxb3/c;

    if-eqz v0, :cond_1

    check-cast p0, Lxb3/c;

    invoke-interface {p0, p1}, Lxb3/c;->b(I)Lxb3/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lxb3/q;

    invoke-direct {v0, p0, p1}, Lxb3/q;-><init>(Lxb3/i;I)V

    return-object v0

    :cond_2
    const-string p0, "Requested element count "

    const-string v0, " is less than zero."

    invoke-static {p1, p0, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static E(Lxb3/i;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static F(Lxb3/i;)Ljava/util/Set;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lm83/a0;->w:Lm83/a0;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static n(Ljava/util/Iterator;)Lxb3/i;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm83/r;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lm83/r;-><init>(Ljava/lang/Object;I)V

    new-instance p0, Lxb3/a;

    invoke-direct {p0, v0}, Lxb3/a;-><init>(Lxb3/i;)V

    return-object p0
.end method

.method public static o(Lxb3/i;Ljava/lang/String;)Z
    .locals 3

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-ltz v1, :cond_1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_2
    const/4 v1, -0x1

    :goto_1
    if-ltz v1, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    return v0
.end method

.method public static p(Lxb3/i;)I
    .locals 2

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return v0
.end method

.method public static q(Lxb3/i;I)Lxb3/i;
    .locals 1

    if-ltz p1, :cond_2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Lxb3/c;

    if-eqz v0, :cond_1

    check-cast p0, Lxb3/c;

    invoke-interface {p0, p1}, Lxb3/c;->a(I)Lxb3/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lxb3/b;

    invoke-direct {v0, p0, p1}, Lxb3/b;-><init>(Lxb3/i;I)V

    return-object v0

    :cond_2
    const-string p0, "Requested element count "

    const-string v0, " is less than zero."

    invoke-static {p1, p0, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;
    .locals 2

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb3/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1, p1}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static s(Lxb3/i;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static t(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;
    .locals 2

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb3/g;

    sget-object v1, Lxb3/n;->w:Lxb3/n;

    invoke-direct {v0, p0, p1, v1}, Lxb3/g;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static u(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;
    .locals 2

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb3/g;

    sget-object v1, Lxb3/m;->w:Lxb3/m;

    invoke-direct {v0, p0, p1, v1}, Lxb3/g;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final v(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;
    .locals 3

    instance-of v0, p0, Lxb3/s;

    if-eqz v0, :cond_0

    check-cast p0, Lxb3/s;

    new-instance v0, Lxb3/g;

    iget-object v1, p0, Lxb3/s;->a:Lxb3/i;

    iget-object p0, p0, Lxb3/s;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, p0, p1}, Lxb3/g;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :cond_0
    new-instance v0, Lxb3/g;

    new-instance v1, Lxa0/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lxa0/a;-><init>(I)V

    invoke-direct {v0, p0, v1, p1}, Lxb3/g;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static w(Lc93/a;)Lxb3/i;
    .locals 3

    new-instance v0, Lx83/h;

    new-instance v1, Landroidx/room/o0;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Landroidx/room/o0;-><init>(Lc93/a;I)V

    invoke-direct {v0, p0, v1}, Lx83/h;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lxb3/a;

    invoke-direct {p0, v0}, Lxb3/a;-><init>(Lxb3/i;)V

    return-object p0
.end method

.method public static x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;
    .locals 3

    const-string v0, "nextFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    sget-object p0, Lxb3/d;->a:Lxb3/d;

    return-object p0

    :cond_0
    new-instance v0, Lx83/h;

    new-instance v1, Lm83/p;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1, p1}, Lx83/h;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static y(Lxb3/i;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;
    .locals 3

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const-string p1, ", "

    :cond_0
    and-int/lit8 v0, p4, 0x2

    const-string v1, ""

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p4, p4, 0x20

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    :cond_2
    const-string p4, "<this>"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x1

    add-int/2addr p2, v2

    if-le p2, v2, :cond_3

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_3
    invoke-static {p4, v0, p3}, Lva3/l;->h(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static z(Lxb3/i;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "Sequence is empty."

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
