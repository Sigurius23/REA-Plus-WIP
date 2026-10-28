.class public final Lf91/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lf91/d;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "Lnd1/i;",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "design-showcase_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnd1/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/i;

    invoke-direct {v0}, Lnd1/i;-><init>()V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lf91/d;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lgd1/a;
    .locals 0

    invoke-static {p0, p1}, Lf91/d;->i(Lxf3/c;Luf3/a;)Lgd1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lid1/f;
    .locals 0

    invoke-static {p0, p1}, Lf91/d;->k(Lxf3/c;Luf3/a;)Lid1/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lid1/c;
    .locals 0

    invoke-static {p0, p1}, Lf91/d;->l(Lxf3/c;Luf3/a;)Lid1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lid1/c;
    .locals 0

    invoke-static {p0, p1}, Lf91/d;->m(Lxf3/c;Luf3/a;)Lid1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lgd1/a;
    .locals 0

    invoke-static {p0, p1}, Lf91/d;->h(Lxf3/c;Luf3/a;)Lgd1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lg91/b;
    .locals 0

    invoke-static {p0, p1}, Lf91/d;->j(Lxf3/c;Luf3/a;)Lg91/b;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ltf3/a;)Ll83/a0;
    .locals 15

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf91/e;->a:Lf91/e;

    invoke-virtual {v0}, Lf91/e;->b()Lvf3/c;

    move-result-object v4

    new-instance v5, Lf91/b;

    const/4 v1, 0x1

    invoke-direct {v5, v1}, Lf91/b;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v8, Lgd1/a;

    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v10, Lwf3/a;->e:Lvf3/c;

    const/4 v14, 0x2

    move-object v2, v10

    move v6, v14

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0}, Lf91/e;->d()Lvf3/c;

    move-result-object v12

    new-instance v13, Lf91/b;

    const/4 v2, 0x2

    invoke-direct {v13, v2}, Lf91/b;-><init>(I)V

    new-instance v9, Lqf3/b;

    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v11, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v9}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0}, Lf91/e;->a()Lvf3/c;

    move-result-object v12

    new-instance v13, Lf91/b;

    const/4 v2, 0x3

    invoke-direct {v13, v2}, Lf91/b;-><init>(I)V

    new-instance v9, Lqf3/b;

    const-class v2, Lg91/b;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v11, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v9}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0}, Lf91/e;->f()Lvf3/c;

    move-result-object v12

    new-instance v13, Lf91/b;

    const/4 v2, 0x4

    invoke-direct {v13, v2}, Lf91/b;-><init>(I)V

    new-instance v9, Lqf3/b;

    const-class v2, Lid1/f;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v11, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v9}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0}, Lf91/e;->c()Lvf3/c;

    move-result-object v12

    new-instance v13, Lf91/b;

    const/4 v2, 0x5

    invoke-direct {v13, v2}, Lf91/b;-><init>(I)V

    new-instance v9, Lqf3/b;

    const-class v2, Lid1/c;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v11, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v9}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0}, Lf91/e;->e()Lvf3/c;

    move-result-object v12

    new-instance v13, Lf91/b;

    const/4 v0, 0x6

    invoke-direct {v13, v0}, Lf91/b;-><init>(I)V

    new-instance v9, Lqf3/b;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v11, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lxf3/c;Luf3/a;)Lgd1/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lzc1/y1;

    invoke-direct {p0}, Lzc1/y1;-><init>()V

    return-object p0
.end method

.method private static final i(Lxf3/c;Luf3/a;)Lgd1/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ldd1/o;

    invoke-direct {p0}, Ldd1/o;-><init>()V

    return-object p0
.end method

.method private static final j(Lxf3/c;Luf3/a;)Lg91/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lg91/b;

    invoke-direct {p0}, Lg91/b;-><init>()V

    return-object p0
.end method

.method private static final k(Lxf3/c;Luf3/a;)Lid1/f;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lid1/f;

    sget-object v0, Lf91/e;->a:Lf91/e;

    invoke-virtual {v0}, Lf91/e;->d()Lvf3/c;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lgd1/a;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {p0, v5, v4, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgd1/a;

    invoke-virtual {v0}, Lf91/e;->b()Lvf3/c;

    move-result-object v0

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v5, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgd1/a;

    invoke-direct {p1, v1, p0}, Lid1/f;-><init>(Lgd1/a;Lgd1/a;)V

    return-object p1
.end method

.method private static final l(Lxf3/c;Luf3/a;)Lid1/c;
    .locals 6

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    new-instance v1, Lid1/c;

    sget-object v2, Lf91/e;->a:Lf91/e;

    invoke-virtual {v2}, Lf91/e;->f()Lvf3/c;

    move-result-object v3

    const-class v4, Lid1/f;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {p0, v5, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lid1/f;

    invoke-virtual {v2}, Lf91/e;->a()Lvf3/c;

    move-result-object v2

    const-class v4, Lg91/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v5, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg91/b;

    new-instance v0, Lor2/m;

    const/4 v2, 0x1

    invoke-direct {v0, v5, v2, v5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, p1, v3, p0, v0}, Lid1/c;-><init>(Ljava/lang/Object;Lid1/f;Lg91/b;Lbc3/c0;)V

    return-object v1
.end method

.method private static final m(Lxf3/c;Luf3/a;)Lid1/c;
    .locals 6

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    new-instance v1, Lid1/c;

    sget-object v2, Lf91/e;->a:Lf91/e;

    invoke-virtual {v2}, Lf91/e;->f()Lvf3/c;

    move-result-object v3

    const-class v4, Lid1/f;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {p0, v5, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lid1/f;

    invoke-virtual {v2}, Lf91/e;->a()Lvf3/c;

    move-result-object v2

    const-class v4, Lg91/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v5, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg91/b;

    new-instance v0, Lor2/m;

    const/4 v2, 0x1

    invoke-direct {v0, v5, v2, v5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, p1, v3, p0, v0}, Lid1/c;-><init>(Ljava/lang/Object;Lid1/f;Lg91/b;Lbc3/c0;)V

    return-object v1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lf91/d;->g(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf91/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
