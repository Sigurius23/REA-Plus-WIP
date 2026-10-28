.class public final Lgf/r;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:Lgf/s;

.field public x:Ljava/util/Iterator;

.field public y:Ljava/lang/Object;

.field public z:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lgf/s;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lgf/r;->J:Lgf/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Lgf/r;

    iget-object v1, p0, Lgf/r;->J:Lgf/s;

    invoke-direct {v0, v1, p2}, Lgf/r;-><init>(Lgf/s;Lq83/d;)V

    iput-object p1, v0, Lgf/r;->I:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgf/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgf/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgf/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lgf/r;->I:Ljava/lang/Object;

    check-cast v0, Lxb3/j;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lgf/r;->H:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget v2, p0, Lgf/r;->G:I

    iget v5, p0, Lgf/r;->F:I

    iget v6, p0, Lgf/r;->E:I

    iget-object v7, p0, Lgf/r;->z:Ljava/util/Iterator;

    iget-object v8, p0, Lgf/r;->y:Ljava/lang/Object;

    iget-object v9, p0, Lgf/r;->x:Ljava/util/Iterator;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgf/r;->J:Lgf/s;

    iget-object p1, p1, Lgf/s;->w:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v9, p1

    move v6, v4

    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v2, v4

    move v5, v2

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    new-instance v4, Lgf/j;

    invoke-direct {v4, v8, p1}, Lgf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lgf/r;->I:Ljava/lang/Object;

    iput-object v9, p0, Lgf/r;->x:Ljava/util/Iterator;

    iput-object v8, p0, Lgf/r;->y:Ljava/lang/Object;

    iput-object v7, p0, Lgf/r;->z:Ljava/util/Iterator;

    iput v6, p0, Lgf/r;->E:I

    iput v5, p0, Lgf/r;->F:I

    iput v2, p0, Lgf/r;->G:I

    iput v3, p0, Lgf/r;->H:I

    invoke-virtual {v0, v4, p0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object v1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
