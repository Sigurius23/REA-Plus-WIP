.class final Lvp1/h$u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvp1/h$u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ltp1/j;

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltp1/j;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltp1/j;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lvp1/h$u$a;->w:Ltp1/j;

    iput-object p2, p0, Lvp1/h$u$a;->x:Lp1/c1;

    iput-object p3, p0, Lvp1/h$u$a;->y:Lp1/c1;

    iput-object p4, p0, Lvp1/h$u$a;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lg1/z3;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/z3;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lg1/z3;->w:Lg1/z3;

    if-ne p1, p2, :cond_6

    iget-object p1, p0, Lvp1/h$u$a;->x:Lp1/c1;

    invoke-static {p1}, Lvp1/h;->g2(Lp1/c1;)Lvp1/a;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lvp1/h$u$a;->x:Lp1/c1;

    invoke-static {p1}, Lvp1/h;->g2(Lp1/c1;)Lvp1/a;

    move-result-object p1

    sget-object p2, Lvp1/a;->FERTILITY_INSIGHTS_DISABLE_SURVEY:Lvp1/a;

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lvp1/h$u$a;->y:Lp1/c1;

    invoke-static {p1, v0}, Lvp1/h;->e2(Lp1/c1;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lvp1/h$u$a;->x:Lp1/c1;

    invoke-static {p1}, Lvp1/h;->g2(Lp1/c1;)Lvp1/a;

    move-result-object p1

    sget-object p2, Lvp1/a;->GOALS:Lvp1/a;

    if-ne p1, p2, :cond_5

    iget-object p1, p0, Lvp1/h$u$a;->z:Lp1/c1;

    iget-object p2, p0, Lvp1/h$u$a;->w:Ltp1/j;

    invoke-virtual {p2}, Ltp1/j;->d()Ltp1/f;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ltp1/f;->c()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ltp1/e;

    invoke-virtual {v3}, Ltp1/e;->c()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltp1/e;

    invoke-virtual {v2}, Ltp1/e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    goto :goto_2

    :cond_4
    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :goto_2
    invoke-static {p1, p2}, Lvp1/h;->f2(Lp1/c1;Ljava/util/Set;)V

    :cond_5
    iget-object p1, p0, Lvp1/h$u$a;->x:Lp1/c1;

    invoke-static {p1, v0}, Lvp1/h;->h2(Lp1/c1;Lvp1/a;)V

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg1/z3;

    invoke-virtual {p0, p1, p2}, Lvp1/h$u$a;->b(Lg1/z3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
