.class public final Ly6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/a;


# static fields
.field public static final a:Ly6/f;

.field public static final b:Lmc3/c;

.field public static final c:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly6/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly6/f;->a:Ly6/f;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    sput-object v0, Ly6/f;->b:Lmc3/c;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Ly6/f;->c:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Ly6/b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly6/b;

    iget v1, v0, Ly6/b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly6/b;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly6/b;

    invoke-direct {v0, p0, p4}, Ly6/b;-><init>(Ly6/f;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ly6/b;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly6/b;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ly6/b;->z:Lmc3/c;

    iget-object p3, v0, Ly6/b;->y:Ljava/lang/String;

    iget-object p2, v0, Ly6/b;->x:Ly6/g;

    iget-object v0, v0, Ly6/b;->w:Landroid/content/Context;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p4, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Ly6/b;->w:Landroid/content/Context;

    iput-object p2, v0, Ly6/b;->x:Ly6/g;

    iput-object p3, v0, Ly6/b;->y:Ljava/lang/String;

    sget-object p4, Ly6/f;->b:Lmc3/c;

    iput-object p4, v0, Ly6/b;->z:Lmc3/c;

    iput v3, v0, Ly6/b;->G:I

    invoke-virtual {p4, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ly6/f;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, p1, p3}, Ly6/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p4, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p4, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final b(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Ly6/c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly6/c;

    iget v1, v0, Ly6/c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly6/c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly6/c;

    invoke-direct {v0, p0, p4}, Ly6/c;-><init>(Ly6/f;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ly6/c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly6/c;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ly6/c;->y:Ljava/lang/String;

    iget-object p2, v0, Ly6/c;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    iget-object p3, v0, Ly6/c;->w:Ljava/lang/Object;

    check-cast p3, Lmc3/a;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Ly6/c;->z:Lmc3/c;

    iget-object p3, v0, Ly6/c;->y:Ljava/lang/String;

    iget-object p2, v0, Ly6/c;->x:Ljava/lang/Object;

    check-cast p2, Ly6/g;

    iget-object v2, v0, Ly6/c;->w:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p4, p1

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Ly6/c;->w:Ljava/lang/Object;

    iput-object p2, v0, Ly6/c;->x:Ljava/lang/Object;

    iput-object p3, v0, Ly6/c;->y:Ljava/lang/String;

    sget-object p4, Ly6/f;->b:Lmc3/c;

    iput-object p4, v0, Ly6/c;->z:Lmc3/c;

    iput v4, v0, Ly6/c;->G:I

    invoke-virtual {p4, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    sget-object v2, Ly6/f;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_6

    iput-object p4, v0, Ly6/c;->w:Ljava/lang/Object;

    iput-object v2, v0, Ly6/c;->x:Ljava/lang/Object;

    iput-object p3, v0, Ly6/c;->y:Ljava/lang/String;

    iput-object v5, v0, Ly6/c;->z:Lmc3/c;

    iput v3, v0, Ly6/c;->G:I

    invoke-interface {p2, p1, p3}, Ly6/g;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object p2, p4

    move-object p4, p1

    move-object p1, p3

    move-object p3, p2

    move-object p2, v2

    :goto_3
    :try_start_2
    move-object v4, p4

    check-cast v4, La6/g;

    invoke-interface {p2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object p3, p4

    goto :goto_5

    :cond_6
    move-object p3, p4

    :goto_4
    const-string p1, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, La6/g;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p3, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v4

    :goto_5
    invoke-interface {p3, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final c(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Ly6/d;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly6/d;

    iget v1, v0, Ly6/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly6/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly6/d;

    invoke-direct {v0, p0, p4}, Ly6/d;-><init>(Ly6/f;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ly6/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly6/d;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, v0, Ly6/d;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Ly6/f;->b(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p4, La6/g;

    invoke-interface {p4}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v3, v0, Ly6/d;->y:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final d(Landroid/content/Context;Ly6/g;Ljava/lang/String;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p5, Ly6/e;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ly6/e;

    iget v1, v0, Ly6/e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly6/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly6/e;

    invoke-direct {v0, p0, p5}, Ly6/e;-><init>(Ly6/f;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Ly6/e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly6/e;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Ly6/e;->w:Ls83/i;

    move-object p4, p1

    check-cast p4, Lc93/m;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p5, p4

    check-cast p5, Ls83/i;

    iput-object p5, v0, Ly6/e;->w:Ls83/i;

    iput v4, v0, Ly6/e;->z:I

    invoke-virtual {p0, p1, p2, p3, v0}, Ly6/f;->b(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p5, La6/g;

    const/4 p1, 0x0

    iput-object p1, v0, Ly6/e;->w:Ls83/i;

    iput v3, v0, Ly6/e;->z:I

    invoke-interface {p5, p4, v0}, La6/g;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method
