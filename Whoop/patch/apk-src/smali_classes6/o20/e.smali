.class public final Lo20/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Ln53/e;

.field public final w:Ljava/util/List;

.field public final x:Ls20/a;

.field public final y:Ln53/e;

.field public final z:Lec3/j1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ls20/a;)V
    .locals 5

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formArguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lo20/e;->w:Ljava/util/List;

    iput-object p2, p0, Lo20/e;->x:Ls20/a;

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lg40/w2;

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/w2;

    iget-object v0, v0, Lg40/w2;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lx30/o;

    if-eqz v1, :cond_3

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx30/o;

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lkd/f;

    const/16 v3, 0x11

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4, v3}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v1, v4, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lx30/o;->h:Ln53/e;

    if-nez p1, :cond_6

    :cond_5
    invoke-static {p2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    :cond_6
    new-instance p2, Lm22/b;

    const/16 v1, 0x13

    invoke-direct {p2, v1}, Lm22/b;-><init>(I)V

    invoke-static {p1, v0, p2}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lo20/e;->y:Ln53/e;

    invoke-virtual {p0}, Lo20/e;->g()Lec3/l;

    move-result-object p2

    new-instance v0, Lch/o;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1}, Lch/o;-><init>(Lec3/l;I)V

    new-instance p2, Lo20/a;

    invoke-virtual {p0}, Lo20/e;->g()Lec3/l;

    move-result-object v1

    new-instance v2, Lch/o;

    const/4 v3, 0x4

    invoke-direct {v2, v1, v3}, Lch/o;-><init>(Lec3/l;I)V

    iget-object v1, p0, Lo20/e;->x:Ls20/a;

    iget-object v1, v1, Ls20/a;->j:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {p2, v2, p1, v0, v1}, Lo20/a;-><init>(Lch/o;Ln53/e;Lch/o;Ljava/util/Map;)V

    new-instance v1, Lb30/l;

    const/4 v3, 0x2

    invoke-direct {v1, p2, v4, v3}, Lb30/l;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, p1, v0, v1}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object p1

    iput-object p1, p0, Lo20/e;->z:Lec3/j1;

    iget-object p1, p0, Lo20/e;->w:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/i1;

    invoke-interface {v0}, Lg40/i1;->f()Lec3/f2;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    goto :goto_4

    :cond_8
    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Lec3/l;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lec3/l;

    new-instance v0, Lg40/c;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lg40/c;-><init>([Lec3/l;I)V

    move-object p1, v0

    :goto_4
    new-instance v0, Lg40/d;

    const/16 v1, 0xc

    invoke-direct {v0, p2, v1}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance p2, Ln53/e;

    invoke-direct {p2, p1, v0}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    iget-object p1, p0, Lo20/e;->y:Ln53/e;

    new-instance v0, Lm22/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lm22/b;-><init>(I)V

    invoke-static {p1, p2, v0}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lo20/e;->E:Ln53/e;

    return-void
.end method


# virtual methods
.method public final g()Lec3/l;
    .locals 3

    iget-object v0, p0, Lo20/e;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, La6/u;

    const/4 v1, 0x1

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v2, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_0
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

    check-cast v2, Lg40/i1;

    invoke-interface {v2}, Lg40/i1;->e()Lec3/f2;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v1, v1, [Lec3/l;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lec3/l;

    new-instance v1, Lg40/c;

    const/16 v2, 0xa

    invoke-direct {v1, v0, v2}, Lg40/c;-><init>([Lec3/l;I)V

    return-object v1
.end method
