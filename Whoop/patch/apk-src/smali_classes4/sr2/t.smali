.class public abstract Lsr2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ltf3/a;",
        "a",
        "Ltf3/a;",
        "w",
        "()Ltf3/a;",
        "buildTypeModule",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltf3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lsr2/t;->k(Ltf3/a;)Ll83/a0;

    sput-object v0, Lsr2/t;->a:Ltf3/a;

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lj92/e;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->u(Lxf3/c;Luf3/a;)Lj92/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lfi0/c;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->r(Lxf3/c;Luf3/a;)Lfi0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lz82/h;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->n(Lxf3/c;Luf3/a;)Lz82/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lgj/d;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->q(Lxf3/c;Luf3/a;)Lgj/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lcom/amplitude/android/engagement/a;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->s(Lxf3/c;Luf3/a;)Lcom/amplitude/android/engagement/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lz82/b;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->m(Lxf3/c;Luf3/a;)Lz82/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lrr2/c;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->l(Lxf3/c;Luf3/a;)Lrr2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lud3/f0;)Lud3/x0;
    .locals 0

    invoke-static {p0}, Lsr2/t;->v(Lud3/f0;)Lud3/x0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lgj/g;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->o(Lxf3/c;Luf3/a;)Lgj/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lei0/a;
    .locals 0

    invoke-static {p0, p1}, Lsr2/t;->t(Lxf3/c;Luf3/a;)Lei0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ltf3/a;)Ll83/a0;
    .locals 14

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltf3/a;->a:Ljava/util/HashSet;

    new-instance v5, Lsr2/m;

    const/16 v1, 0x18

    invoke-direct {v5, v1}, Lsr2/m;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lrr2/c;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v9, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v13, 0x1

    move-object v2, v9

    move v6, v13

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/m;

    const/16 v2, 0x19

    invoke-direct {v12, v2}, Lsr2/m;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lz82/b;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v0, Lfi0/a;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v2, "clazz"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v3, Lrf3/b;->a:Lqf3/b;

    iget-object v4, v2, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v0, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v2, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v4, v2, Lqf3/b;->c:Lvf3/a;

    iget-object v2, v2, Lqf3/b;->a:Lvf3/a;

    invoke-static {v0, v4, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/m;

    const/16 v0, 0x1a

    invoke-direct {v12, v0}, Lsr2/m;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lz82/h;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v13, 0x2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "amplitude"

    invoke-static {v8, p0, v0, v1, v2}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lsr2/m;

    const/16 v0, 0x1b

    invoke-direct {v12, v0}, Lsr2/m;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lgj/g;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/m;

    const/16 v0, 0x1c

    invoke-direct {v12, v0}, Lsr2/m;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lgj/d;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/m;

    const/16 v0, 0x1d

    invoke-direct {v12, v0}, Lsr2/m;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lfi0/c;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/4 v0, 0x0

    invoke-direct {v12, v0}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lcom/amplitude/android/engagement/a;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/4 v0, 0x1

    invoke-direct {v12, v0}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lei0/a;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/4 v0, 0x2

    invoke-direct {v12, v0}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lj92/e;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p0, v0, v1}, Ldc/b;->C(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lxf3/c;Luf3/a;)Lrr2/c;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, La6/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    const-class v2, Lzr2/a;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzr2/a;

    const-class v3, Lor2/g;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lor2/g;

    const-class v4, Lrr2/o;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrr2/o;

    invoke-static {v0, v2, v3, p0}, Lrr2/k;->a(La6/g;Lzr2/a;Lor2/g;Lrr2/o;)Lrr2/a;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lxf3/c;Luf3/a;)Lz82/b;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    new-array p1, p1, [Lfi0/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lz82/h;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, p1, v3

    const-class v1, Lfi0/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, p1, v3

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-class v1, Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/AnalyticsUserRepository;

    const-class v3, Lq92/h;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq92/h;

    new-instance v0, Lz82/c;

    check-cast p1, Ljava/lang/Iterable;

    invoke-direct {v0, p1, v1, p0}, Lz82/c;-><init>(Ljava/lang/Iterable;Lcom/whoop/data/repositories/AnalyticsUserRepository;Lq92/h;)V

    invoke-virtual {v0}, Lz82/c;->b()V

    return-object v0
.end method

.method private static final n(Lxf3/c;Luf3/a;)Lz82/h;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lz82/h;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "LoggingAnalytics"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/AnalyticsUserRepository;

    const-class v4, Lq92/h;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq92/h;

    invoke-direct {p1, v0, v2, p0}, Lz82/h;-><init>(Ltr2/n;Lcom/whoop/data/repositories/AnalyticsUserRepository;Lq92/h;)V

    return-object p1
.end method

.method private static final o(Lxf3/c;Luf3/a;)Lgj/g;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "4483d4bb0e3f071613d0cc2546aacc65"

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    new-instance p1, Lgj/f;

    invoke-direct {p1}, Lgj/f;-><init>()V

    invoke-static {p1}, Lsr2/t;->p(Lgj/f;)Ll83/a0;

    iget-object p1, p1, Lgj/f;->a:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Lgj/g;

    invoke-direct {v0, p0, p1}, Lgj/g;-><init>(Landroid/app/Application;Ljava/util/Set;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "The AMPLITUDE_API_KEY environment variable is not set!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final p(Lgj/f;)Ll83/a0;
    .locals 2

    const-string v0, "$this$autocaptureOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgj/f;->b:Lgj/e;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lgj/f;->a:Ljava/util/LinkedHashSet;

    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lxf3/c;Luf3/a;)Lgj/d;
    .locals 10

    const-string v0, "it"

    const-string v1, "amplitude"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lgj/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lgj/g;

    new-instance v3, Lgj/d;

    const-string p1, "configuration"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, La3/p;

    const/16 p1, 0x8

    invoke-direct {v5, p1}, La3/p;-><init>(I)V

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v6

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    const-string v1, "newCachedThreadPool()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lbc3/d1;

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-direct {v7, p1}, Lbc3/d1;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    const-string v1, "newSingleThreadExecutor()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lbc3/d1;

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-direct {v8, p1}, Lbc3/d1;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lbc3/d1;

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-direct {v9, p1}, Lbc3/d1;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct/range {v3 .. v9}, Lgj/d;-><init>(Lgj/g;La3/p;Lbc3/c0;Lbc3/z;Lbc3/z;Lbc3/z;)V

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    new-instance v1, Lgj/c;

    const/4 v5, 0x0

    invoke-direct {v1, v3, v5}, Lgj/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    iget-object p1, v4, Lgj/g;->r:Ljava/util/Set;

    sget-object v1, Lgj/e;->x:Lgj/e;

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v4, Lgj/g;->b:Landroid/content/Context;

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    iget-object v1, v3, Lgj/d;->p:Lcom/iterable/iterableapi/e;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    goto :goto_0

    :cond_0
    const-string p0, "activityLifecycleCallbacks"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-enable-amplitude-survey-sdk"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-class p1, Lcom/amplitude/android/engagement/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amplitude/android/engagement/a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lkj/b;

    invoke-direct {p1, p0}, Lkj/b;-><init>(Lcom/amplitude/android/engagement/a;)V

    invoke-virtual {v3, p1}, Lgj/d;->a(Lkk/e;)V

    :cond_2
    return-object v3
.end method

.method private static final r(Lxf3/c;Luf3/a;)Lfi0/c;
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lz82/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lod1/j;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/j;

    const-class v5, Lcq0/g;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcq0/g;

    new-instance v6, Lvf3/c;

    const-string v7, "userContext"

    invoke-direct {v6, v7}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v7, Lod1/u;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lod1/u;

    const-class v7, Lrv1/a;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrv1/a;

    const-class v8, Lwe1/m;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwe1/m;

    const-class v9, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v10, Lbc3/c0;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lbc3/c0;

    const-class v11, Lod1/x;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lod1/x;

    const-class v12, Lcom/whoop/data/repositories/UserRepository;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/data/repositories/UserRepository;

    const-class v13, Lin2/h;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-virtual {v0, v4, v13, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lin2/h;

    const-class v14, Lq92/h;

    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-virtual {v0, v4, v14, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lq92/h;

    const-class v15, Lci2/b;

    invoke-virtual {v1, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-virtual {v0, v4, v15, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lci2/b;

    move-object/from16 p1, v2

    const-class v2, Lgj/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgj/d;

    move-object/from16 v16, v2

    const-class v2, Lfi0/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfi0/e;

    sget-object v4, Ltr2/n;->a:Ltr2/n$a;

    move-object/from16 v18, v2

    const-string v2, "AmplitudeAnalyticsManager"

    invoke-virtual {v4, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    const-class v4, Li92/c;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move-object/from16 v19, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li92/c;

    move-object/from16 v17, v3

    const-class v3, Lcom/whoop/data/repositories/LanguageChecker;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/LanguageChecker;

    move-object/from16 v20, v3

    const-class v3, Lor2/g;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lor2/g;

    move-object/from16 v21, v3

    const-class v3, Lor2/r1;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lor2/r1;

    move-object/from16 v22, v3

    const-class v3, Lca2/h;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lca2/h;

    move-object/from16 v23, v3

    const-class v3, Lst0/r;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lst0/r;

    move-object/from16 v24, v3

    const-class v3, Lei0/a;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lei0/a;

    move-object/from16 v2, v18

    move-object/from16 v18, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v2

    move-object/from16 v2, p1

    move-object/from16 v3, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v0

    invoke-direct/range {v2 .. v24}, Lz82/a;-><init>(Lod1/j;Lcq0/g;Lod1/u;Lrv1/a;Lwe1/m;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lod1/x;Lcom/whoop/data/repositories/UserRepository;Lin2/h;Lq92/h;Lci2/b;Lgj/d;Lfi0/e;Ltr2/n;Li92/c;Lcom/whoop/data/repositories/LanguageChecker;Lor2/g;Lor2/r1;Lca2/h;Lst0/r;Lei0/a;)V

    return-object v2
.end method

.method private static final s(Lxf3/c;Luf3/a;)Lcom/amplitude/android/engagement/a;
    .locals 10

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/amplitude/android/engagement/a;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object v0

    new-instance v1, Lvf3/c;

    const-string v2, "amplitude"

    invoke-direct {v1, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lgj/g;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgj/g;

    iget-object p0, p0, Lgj/g;->a:Ljava/lang/String;

    new-instance v1, Lcom/amplitude/android/engagement/AmplitudeInitOptions;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/amplitude/android/engagement/AmplitudeInitOptions;-><init>(Lhj/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0, p0, v1}, Lcom/amplitude/android/engagement/a;-><init>(Landroid/app/Application;Ljava/lang/String;Lcom/amplitude/android/engagement/AmplitudeInitOptions;)V

    return-object p1
.end method

.method private static final t(Lxf3/c;Luf3/a;)Lei0/a;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lei0/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/amplitude/android/engagement/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amplitude/android/engagement/a;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v1, p0}, Lei0/b;-><init>(Lcom/amplitude/android/engagement/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method private static final u(Lxf3/c;Luf3/a;)Lj92/e;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lsr2/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method

.method private static final v(Lud3/f0;)Lud3/x0;
    .locals 1

    const-string v0, "chain"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lae3/i;

    iget-object v0, p0, Lae3/i;->e:Lud3/o0;

    invoke-virtual {p0, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p0

    return-object p0
.end method

.method public static final w()Ltf3/a;
    .locals 1

    sget-object v0, Lsr2/t;->a:Ltf3/a;

    return-object v0
.end method
