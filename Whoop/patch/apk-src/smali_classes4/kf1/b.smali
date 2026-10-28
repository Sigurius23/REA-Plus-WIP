.class public final Lkf1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkf1/b;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "experiments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lmf1/a;
    .locals 0

    invoke-static {p0, p1}, Lkf1/b;->j(Lxf3/c;Luf3/a;)Lmf1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lhf1/c;
    .locals 0

    invoke-static {p0, p1}, Lkf1/b;->i(Lxf3/c;Luf3/a;)Lhf1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lud3/g0;)Z
    .locals 0

    invoke-static {p0}, Lkf1/b;->m(Lud3/g0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsApi;
    .locals 0

    invoke-static {p0, p1}, Lkf1/b;->k(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Ljf1/a;
    .locals 0

    invoke-static {p0, p1}, Lkf1/b;->h(Lxf3/c;Luf3/a;)Ljf1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsAuthApi;
    .locals 0

    invoke-static {p0, p1}, Lkf1/b;->l(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsAuthApi;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljj1/a;

    const/16 v0, 0x1b

    invoke-direct {v5, v0}, Ljj1/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ljf1/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v7, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v11, 0x2

    move-object v2, v7

    move v6, v11

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v6

    invoke-static {v3, v4, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Ljj1/a;

    const/16 v3, 0x1c

    invoke-direct {v10, v3}, Ljj1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lhf1/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, p0, v3, v1}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v3

    const-class v4, Lhf1/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-string v5, "clazz"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v3, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v6, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v4, v8}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v6, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v8, v6, Lqf3/b;->c:Lvf3/a;

    iget-object v6, v6, Lqf3/b;->a:Lvf3/a;

    invoke-static {v4, v8, v6}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    const/4 v12, 0x1

    invoke-virtual {p0, v4, v3, v12}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v9, Lvf3/c;

    const-string v3, "EXPERIMENTS_INTERCEPTOR"

    invoke-direct {v9, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljj1/a;

    const/16 v3, 0x1d

    invoke-direct {v10, v3}, Ljj1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lmf1/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    const-class v2, Lud3/g0;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v3, Lrf3/b;->a:Lqf3/b;

    iget-object v5, v4, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v2, v5}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, v4, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v5, v4, Lqf3/b;->c:Lvf3/a;

    iget-object v4, v4, Lqf3/b;->a:Lvf3/a;

    invoke-static {v2, v5, v4}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v3, v12}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lkf1/a;

    const/4 v2, 0x0

    invoke-direct {v10, v2}, Lkf1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/experiments/api/ExperimentsApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lkf1/a;

    const/4 v2, 0x1

    invoke-direct {v10, v2}, Lkf1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/experiments/api/ExperimentsAuthApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lxf3/c;Luf3/a;)Ljf1/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljf1/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, La6/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La6/g;

    const-class v3, Lzr2/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzr2/a;

    const-class v4, Ltr2/n;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltr2/n;

    invoke-direct {p1, v1, v3, p0}, Ljf1/a;-><init>(La6/g;Lzr2/a;Ltr2/n;)V

    return-object p1
.end method

.method private static final i(Lxf3/c;Luf3/a;)Lhf1/c;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhf1/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/experiments/api/ExperimentsApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/experiments/api/ExperimentsApi;

    const-class v3, Lcom/whoop/experiments/api/ExperimentsAuthApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/experiments/api/ExperimentsAuthApi;

    const-class v4, Ljf1/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljf1/a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lhf1/c;-><init>(Lcom/whoop/experiments/api/ExperimentsApi;Lcom/whoop/experiments/api/ExperimentsAuthApi;Ljf1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final j(Lxf3/c;Luf3/a;)Lmf1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmf1/a;

    const-class v0, Lhf1/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhf1/b;

    invoke-direct {p1, p0}, Lmf1/a;-><init>(Lhf1/b;)V

    return-object p1
.end method

.method private static final k(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsApi;
    .locals 4

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    invoke-virtual {v1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lpg3/x0;->c(Ljava/lang/String;)V

    new-instance v1, Lif1/a;

    invoke-direct {v1}, Lif1/a;-><init>()V

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "unauthenticatedOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    invoke-virtual {p1, p0}, Lpg3/x0;->e(Lud3/l0;)V

    invoke-virtual {p1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/experiments/api/ExperimentsApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/experiments/api/ExperimentsApi;

    return-object p0
.end method

.method private static final l(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsAuthApi;
    .locals 5

    const-string v0, "it"

    const-string v1, "defaultOkHttpClient"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/l0;

    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    iget-object v1, p1, Lud3/k0;->c:Ljava/util/ArrayList;

    new-instance v3, Lji0/b;

    const/16 v4, 0x19

    invoke-direct {v3, v4}, Lji0/b;-><init>(I)V

    invoke-static {v1, v3}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lud3/l0;

    invoke-direct {v1, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    new-instance p1, Lpg3/x0;

    invoke-direct {p1}, Lpg3/x0;-><init>()V

    const-class v3, Lsr2/y;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    new-instance p0, Lif1/a;

    invoke-direct {p0}, Lif1/a;-><init>()V

    invoke-virtual {p1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    iput-object v1, p1, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {p1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/experiments/api/ExperimentsAuthApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/experiments/api/ExperimentsAuthApi;

    return-object p0
.end method

.method private static final m(Lud3/g0;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, Lj92/d;

    return p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lkf1/b;->g(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public bridge getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lnd1/j;->getDependencies()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
