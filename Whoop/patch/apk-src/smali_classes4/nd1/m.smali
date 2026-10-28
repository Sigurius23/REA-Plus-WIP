.class public final Lnd1/m;
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
        "Lnd1/m;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "essentials_release"
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

.method public static synthetic a(Lxf3/c;Luf3/a;)La6/g;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->u(Lxf3/c;Luf3/a;)La6/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lm32/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->q(Lxf3/c;Luf3/a;)Lm32/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lor2/k0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->w(Lxf3/c;Luf3/a;)Lor2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lkh2/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->t(Lxf3/c;Luf3/a;)Lkh2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;)Ljava/io/File;
    .locals 0

    invoke-static {p0}, Lnd1/m;->v(Lxf3/c;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Landroidx/lifecycle/g0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->n(Lxf3/c;Luf3/a;)Landroidx/lifecycle/g0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lor2/t1;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->s(Lxf3/c;Luf3/a;)Lor2/t1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lm32/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->p(Lxf3/c;Luf3/a;)Lm32/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lm32/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->m(Lxf3/c;Luf3/a;)Lm32/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lhj0/d;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->o(Lxf3/c;Luf3/a;)Lhj0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lm32/f;
    .locals 0

    invoke-static {p0, p1}, Lnd1/m;->r(Lxf3/c;Luf3/a;)Lm32/f;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Ltf3/a;)Ll83/a0;
    .locals 14

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltf3/a;->a:Ljava/util/HashSet;

    new-instance v5, Lnd1/h;

    const/4 v1, 0x2

    invoke-direct {v5, v1}, Lnd1/h;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lm32/a;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v9, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v13, 0x2

    move-object v2, v9

    move v6, v13

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "appLifecycleOwnerr"

    const/4 v4, 0x0

    invoke-static {v1, p0, v2, v4, v3}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lnd1/h;

    const/4 v1, 0x3

    invoke-direct {v12, v1}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v1, Landroidx/lifecycle/g0;

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v13, 0x1

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/h;

    const/4 v1, 0x4

    invoke-direct {v12, v1}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v1, Lhj0/d;

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v13

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v11, Lvf3/c;

    const-string v0, "required-permissions-helper"

    invoke-direct {v11, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v12, Lnd1/h;

    const/4 v0, 0x5

    invoke-direct {v12, v0}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lm32/c;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "push-notification-permission-helper"

    invoke-static {v8, p0, v2, v4, v3}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lnd1/h;

    const/4 v2, 0x6

    invoke-direct {v12, v2}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/h;

    const/4 v0, 0x7

    invoke-direct {v12, v0}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lm32/f;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/h;

    const/16 v0, 0x8

    invoke-direct {v12, v0}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lor2/t1;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/h;

    const/16 v0, 0x9

    invoke-direct {v12, v0}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lkh2/b;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v1

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lrf3/d;

    invoke-direct {v1, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v1, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/h;

    const/16 v0, 0xa

    invoke-direct {v12, v0}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, La6/g;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lrf3/d;

    invoke-direct {v1, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v1, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/h;

    const/16 v0, 0xb

    invoke-direct {v12, v0}, Lnd1/h;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lor2/k0;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p0, v0, v4}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lxf3/c;Luf3/a;)Lm32/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm32/b;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-direct {p1, p0}, Lm32/b;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method private static final n(Lxf3/c;Luf3/a;)Landroidx/lifecycle/g0;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    sget-object p0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    return-object p0
.end method

.method private static final o(Lxf3/c;Luf3/a;)Lhj0/d;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lhj0/d;

    new-instance v0, Lvf3/c;

    const-string v1, "appLifecycleOwnerr"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Landroidx/lifecycle/g0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/g0;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v2, v0, v2}, Lhj0/d;-><init>(Landroidx/lifecycle/g0;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final p(Lxf3/c;Luf3/a;)Lm32/c;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lj/j;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lj/j;

    const-class v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/util/List;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "BluetoothPermissionHelperImpl"

    invoke-virtual {p1, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    const-class p1, Lm32/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lm32/a;

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v2, Lm32/d;

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lm32/d;-><init>(Ltr2/n;Lj/j;Lm32/a;Ljava/util/List;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private static final q(Lxf3/c;Luf3/a;)Lm32/c;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lj/j;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lj/j;

    const-class v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/util/List;

    const-class v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ljava/lang/String;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "PushNotificationPermissionsHelper"

    invoke-virtual {p1, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    const-class p1, Lm32/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lm32/a;

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v2, Lm32/d;

    invoke-direct/range {v2 .. v8}, Lm32/d;-><init>(Ltr2/n;Lj/j;Lm32/a;Ljava/util/List;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V

    return-object v2
.end method

.method private static final r(Lxf3/c;Luf3/a;)Lm32/f;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm32/f;

    const-class v0, La6/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lm32/f;-><init>(La6/g;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final s(Lxf3/c;Luf3/a;)Lor2/t1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lor2/u1;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lor2/u1;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method private static final t(Lxf3/c;Luf3/a;)Lkh2/b;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkh2/b;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-direct {p1, p0}, Lkh2/b;-><init>(Landroid/app/Application;)V

    return-object p1
.end method

.method private static final u(Lxf3/c;Luf3/a;)La6/g;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Lkh2/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkh2/b;

    invoke-virtual {p1}, Lkh2/b;->a()Ljava/util/List;

    move-result-object p1

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Lao1/h;

    const/16 v2, 0x1b

    invoke-direct {v1, p0, v2}, Lao1/h;-><init>(Lxf3/c;I)V

    const/4 p0, 0x1

    invoke-static {p1, v0, v1, p0}, Lf6/c;->d(Ljava/util/List;Lhc3/d;Lc93/a;I)Lf6/b;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lxf3/c;)Ljava/io/File;
    .locals 1

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    const-string v0, "complete_data_store_file"

    invoke-static {p0, v0}, Ljc/x;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lxf3/c;Luf3/a;)Lor2/k0;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lor2/k0;

    invoke-direct {p0}, Lor2/k0;-><init>()V

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lnd1/m;->l(Ltf3/a;)Ll83/a0;

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
