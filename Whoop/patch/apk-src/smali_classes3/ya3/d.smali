.class public final Lya3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lya3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lya3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lya3/d;->a:Lya3/d;

    return-void
.end method

.method public static c(Lr93/b;)Lr93/s0;
    .locals 3

    :goto_0
    instance-of v0, p0, Lr93/c;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lr93/c;

    invoke-interface {v0}, Lr93/c;->getKind()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p0

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->q1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr93/c;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lr93/k;Lr93/k;Z)Z
    .locals 5

    instance-of v0, p1, Lr93/e;

    if-eqz v0, :cond_0

    instance-of v0, p2, Lr93/e;

    if-eqz v0, :cond_0

    check-cast p1, Lr93/e;

    check-cast p2, Lr93/e;

    invoke-interface {p1}, Lr93/h;->e()Llb3/q0;

    move-result-object p1

    invoke-interface {p2}, Lr93/h;->e()Llb3/q0;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Lr93/x0;

    if-eqz v0, :cond_1

    instance-of v0, p2, Lr93/x0;

    if-eqz v0, :cond_1

    check-cast p1, Lr93/x0;

    check-cast p2, Lr93/x0;

    sget-object v0, Lya3/c;->x:Lya3/c;

    invoke-virtual {p0, p1, p2, p3, v0}, Lya3/d;->b(Lr93/x0;Lr93/x0;ZLc93/m;)Z

    move-result p1

    return p1

    :cond_1
    instance-of v0, p1, Lr93/b;

    if-eqz v0, :cond_c

    instance-of v0, p2, Lr93/b;

    if-eqz v0, :cond_c

    check-cast p1, Lr93/b;

    check-cast p2, Lr93/b;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    invoke-interface {p2}, Lr93/k;->getName()Lva3/h;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    goto/16 :goto_3

    :cond_3
    instance-of v0, p1, Lr93/z;

    if-eqz v0, :cond_4

    instance-of v0, p2, Lr93/z;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lr93/z;

    invoke-interface {v0}, Lr93/z;->U()Z

    move-result v0

    move-object v3, p2

    check-cast v3, Lr93/z;

    invoke-interface {v3}, Lr93/z;->U()Z

    move-result v3

    if-eq v0, v3, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez p3, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {p1}, Lya3/d;->c(Lr93/b;)Lr93/s0;

    move-result-object v0

    invoke-static {p2}, Lya3/d;->c(Lr93/b;)Lr93/s0;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {p1}, Lya3/f;->m(Lr93/k;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {p2}, Lya3/f;->m(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object v3

    instance-of v4, v0, Lr93/c;

    if-nez v4, :cond_9

    instance-of v4, v3, Lr93/c;

    if-eqz v4, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {p0, v0, v3, p3}, Lya3/d;->a(Lr93/k;Lr93/k;Z)Z

    move-result v0

    goto :goto_1

    :cond_9
    :goto_0
    move v0, v2

    :goto_1
    if-nez v0, :cond_a

    goto :goto_3

    :cond_a
    new-instance v0, Lf1/p1;

    invoke-direct {v0, p1, p2, p3}, Lf1/p1;-><init>(Lr93/b;Lr93/b;Z)V

    new-instance p3, Lya3/n;

    invoke-direct {p3, v0}, Lya3/n;-><init>(Lmb3/c;)V

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0, v1}, Lya3/n;->m(Lr93/b;Lr93/b;Lr93/e;Z)Lya3/m;

    move-result-object v3

    invoke-virtual {v3}, Lya3/m;->b()I

    move-result v3

    if-ne v3, v1, :cond_b

    invoke-virtual {p3, p2, p1, v0, v1}, Lya3/n;->m(Lr93/b;Lr93/b;Lr93/e;Z)Lya3/m;

    move-result-object p1

    invoke-virtual {p1}, Lya3/m;->b()I

    move-result p1

    if-ne p1, v1, :cond_b

    :goto_2
    return v1

    :cond_b
    :goto_3
    return v2

    :cond_c
    instance-of p3, p1, Lr93/g0;

    if-eqz p3, :cond_d

    instance-of p3, p2, Lr93/g0;

    if-eqz p3, :cond_d

    check-cast p1, Lr93/g0;

    check-cast p1, Lu93/g0;

    iget-object p1, p1, Lu93/g0;->F:Lva3/e;

    check-cast p2, Lr93/g0;

    check-cast p2, Lu93/g0;

    iget-object p2, p2, Lu93/g0;->F:Lva3/e;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_d
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b(Lr93/x0;Lr93/x0;ZLc93/m;)Z
    .locals 3

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    instance-of v2, v0, Lr93/c;

    if-nez v2, :cond_3

    instance-of v2, v1, Lr93/c;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, v1, p3}, Lya3/d;->a(Lr93/k;Lr93/k;Z)Z

    move-result p3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-interface {p4, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    :goto_1
    if-nez p3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Lr93/x0;->getIndex()I

    move-result p1

    invoke-interface {p2}, Lr93/x0;->getIndex()I

    move-result p2

    if-ne p1, p2, :cond_5

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_3
    const/4 p1, 0x0

    return p1
.end method
