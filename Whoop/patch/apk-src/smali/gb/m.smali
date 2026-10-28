.class public final Lgb/m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lp1/c1;

.field public final synthetic x:Lgb/q;

.field public final synthetic y:Lz1/p;


# direct methods
.method public constructor <init>(Lp1/c1;Lgb/q;Lz1/p;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lgb/m;->w:Lp1/c1;

    iput-object p2, p0, Lgb/m;->x:Lgb/q;

    iput-object p3, p0, Lgb/m;->y:Lz1/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance p1, Lgb/m;

    iget-object v0, p0, Lgb/m;->x:Lgb/q;

    iget-object v1, p0, Lgb/m;->y:Lz1/p;

    iget-object v2, p0, Lgb/m;->w:Lp1/c1;

    invoke-direct {p1, v2, v0, v1, p2}, Lgb/m;-><init>(Lp1/c1;Lgb/q;Lz1/p;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgb/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgb/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgb/m;->w:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v1, p0, Lgb/m;->x:Lgb/q;

    invoke-virtual {v1}, Leb/i1;->b()Leb/t;

    move-result-object v2

    iget-object v2, v2, Leb/t;->e:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lgb/m;->y:Lz1/p;

    invoke-virtual {v2, v0}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Leb/i1;->b()Leb/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Leb/t;->b(Leb/q;)V

    goto :goto_0

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
