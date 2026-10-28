.class public final Ltu0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ltu0/a;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "connectivity-notifications_release"
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

.method public static synthetic a(Lxf3/c;Luf3/a;)Lwu0/e;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->m(Lxf3/c;Luf3/a;)Lwu0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lsu0/c;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->v(Lxf3/c;Luf3/a;)Lsu0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Luu0/a;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->o(Lxf3/c;Luf3/a;)Luu0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lvu0/f;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->t(Lxf3/c;Luf3/a;)Lvu0/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lwu0/a;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->p(Lxf3/c;Luf3/a;)Lwu0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Let0/a;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->w(Lxf3/c;Luf3/a;)Let0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lb12/b;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->q(Lxf3/c;Luf3/a;)Lb12/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lvu0/a;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->r(Lxf3/c;Luf3/a;)Lvu0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lvu0/e;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->s(Lxf3/c;Luf3/a;)Lvu0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lsu0/a;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->u(Lxf3/c;Luf3/a;)Lsu0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lwu0/b;
    .locals 0

    invoke-static {p0, p1}, Ltu0/a;->n(Lxf3/c;Luf3/a;)Lwu0/b;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lsv1/b;

    const/16 v0, 0xe

    invoke-direct {v5, v0}, Lsv1/b;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lwu0/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v7, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v11, 0x2

    move-object v2, v7

    move v6, v11

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v2, 0x11

    invoke-direct {v10, v2}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lwu0/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v2, 0x12

    invoke-direct {v10, v2}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lwu0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v3, 0x13

    invoke-direct {v10, v3}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lb12/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v11, 0x1

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v4, 0x14

    invoke-direct {v10, v4}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lvu0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v2, 0x15

    invoke-direct {v10, v2}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lvu0/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v2, 0x16

    invoke-direct {v10, v2}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lvu0/f;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v2, 0x17

    invoke-direct {v10, v2}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lsu0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v2, 0x18

    invoke-direct {v10, v2}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lsu0/c;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v4, 0xf

    invoke-direct {v10, v4}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Let0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsv1/b;

    const/16 v3, 0x10

    invoke-direct {v10, v3}, Lsv1/b;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Luu0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lxf3/c;Luf3/a;)Lwu0/e;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwu0/f;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lci2/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lci2/b;

    const-class v3, Ljs0/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljs0/c;

    const-class v4, Lwu0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwu0/a;

    invoke-direct {p1, v1, v3, p0}, Lwu0/f;-><init>(Lci2/b;Ljs0/c;Lwu0/a;)V

    return-object p1
.end method

.method private static final n(Lxf3/c;Luf3/a;)Lwu0/b;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwu0/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lwu0/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwu0/e;

    const-class v3, Lci2/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lci2/b;

    const-class v4, Lbc3/c0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, p0}, Lwu0/c;-><init>(Lwu0/e;Lci2/b;Lbc3/c0;)V

    return-object p1
.end method

.method private static final o(Lxf3/c;Luf3/a;)Luu0/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luu0/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Luu0/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method private static final p(Lxf3/c;Luf3/a;)Lwu0/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwu0/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfi0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfi0/a;

    const-class v3, Lq92/h;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq92/h;

    invoke-direct {p1, v1, p0}, Lwu0/a;-><init>(Lfi0/a;Lq92/h;)V

    return-object p1
.end method

.method private static final q(Lxf3/c;Luf3/a;)Lb12/b;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvu0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lci2/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lci2/b;

    const-class v0, Lvu0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lvu0/a;

    const-class v0, Lvu0/f;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lvu0/f;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, Lvu0/b;-><init>(Ltr2/n;Lci2/b;Lvu0/a;Lvu0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final r(Lxf3/c;Luf3/a;)Lvu0/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvu0/a;

    const-class v0, Landroid/content/Context;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvu0/a;-><init>(Landroid/content/Context;Lx82/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final s(Lxf3/c;Luf3/a;)Lvu0/e;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvu0/e;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, La6/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    new-instance v3, Lvf3/c;

    const-string v4, "retrofitWithKtxSerialization"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lpg3/y0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p0

    check-cast v3, Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lvu0/e;-><init>(La6/g;Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final t(Lxf3/c;Luf3/a;)Lvu0/f;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvu0/f;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lvu0/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvu0/e;

    const-class v3, Lvu0/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lvu0/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lvu0/f;-><init>(Lvu0/e;Lvu0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final u(Lxf3/c;Luf3/a;)Lsu0/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lsu0/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lsu0/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method private static final v(Lxf3/c;Luf3/a;)Lsu0/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lsu0/c;

    const-class v0, La6/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lsu0/c;-><init>(La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final w(Lxf3/c;Luf3/a;)Let0/a;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luu0/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lci2/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lci2/b;

    const-class v3, Lbc3/c0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, p0}, Luu0/b;-><init>(Lci2/b;Lbc3/c0;)V

    return-object p1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Ltu0/a;->l(Ltf3/a;)Ll83/a0;

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
