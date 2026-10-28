.class public final Ly43/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lc93/m;

.field public final c:Lmc3/c;

.field public final d:Lec3/h2;

.field public final e:Lec3/h2;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/util/Map;Lc93/m;)V
    .locals 1

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateFunctions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultEventHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly43/b;->a:Ljava/util/Map;

    iput-object p3, p0, Ly43/b;->b:Lc93/m;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p2

    iput-object p2, p0, Ly43/b;->c:Lmc3/c;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Ly43/b;->d:Lec3/h2;

    iput-object p1, p0, Ly43/b;->e:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Ly43/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ly43/a;

    iget v1, v0, Ly43/a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly43/a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly43/a;

    invoke-direct {v0, p0, p2}, Ly43/a;-><init>(Ly43/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ly43/a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly43/a;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ly43/a;->y:Lmc3/c;

    iget-object v1, v0, Ly43/a;->x:Ljava/lang/Object;

    iget-object v0, v0, Ly43/a;->w:Ly43/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Ly43/a;->w:Ly43/b;

    iput-object p1, v0, Ly43/a;->x:Ljava/lang/Object;

    iget-object p2, p0, Ly43/b;->c:Lmc3/c;

    iput-object p2, v0, Ly43/a;->y:Lmc3/c;

    iput v3, v0, Ly43/a;->F:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v0, Ly43/b;->d:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, Ly43/b;->a:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc93/m;

    if-nez v3, :cond_5

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v3, v0, Ly43/b;->b:Lc93/m;

    :cond_5
    iget-object v0, v0, Ly43/b;->d:Lec3/h2;

    invoke-interface {v3, v2, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
