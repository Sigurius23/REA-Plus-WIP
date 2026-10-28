.class public final Ln50/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln50/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Ln50/d;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "b",
        "access_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Ln50/d$a;

.field public static final c:I


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln50/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln50/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ln50/d;->b:Ln50/d$a;

    const/16 v0, 0x8

    sput v0, Ln50/d;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/i;

    invoke-direct {v0}, Lnd1/i;-><init>()V

    new-instance v1, Lms1/a;

    invoke-direct {v1}, Lms1/a;-><init>()V

    new-instance v2, Le12/a;

    invoke-direct {v2}, Le12/a;-><init>()V

    new-instance v3, Lv82/a;

    invoke-direct {v3}, Lv82/a;-><init>()V

    const/4 v4, 0x4

    new-array v4, v4, [Lnd1/j;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ln50/d;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Ljava/util/Map;Lu82/a;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Lxf3/c;Luf3/a;)Lg60/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lg60/a;

    invoke-direct {p0}, Lg60/a;-><init>()V

    return-object p0
.end method

.method private static final C(Lxf3/c;Luf3/a;)Lf60/b;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf60/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ld60/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld60/d;

    const-class v3, Lg60/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lg60/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lf60/b;-><init>(Ld60/d;Lg60/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final D(Lxf3/c;Luf3/a;)Lu50/c;
    .locals 6

    const-string v0, "it"

    const-string v1, "access-mapping"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v1, Lvf3/c;

    const-string v3, "KotlinxDeserializer"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v3, Lmq2/a;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lmq2/a;-><init>(I)V

    const-class v4, Lu82/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu82/a;

    new-instance v3, Lu50/c;

    new-instance v4, Lbh1/b;

    const/4 v5, 0x5

    invoke-direct {v4, p1, v1, v5}, Lbh1/b;-><init>(Ljava/util/Map;Lu82/a;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnm0/e;

    invoke-direct {v3, p0}, Lu50/c;-><init>(Lnm0/e;)V

    return-object v3
.end method

.method private static final E()Luf3/a;
    .locals 2

    new-instance v0, Lvf3/c;

    const-string v1, "access-mapping"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Luf3/a;

    invoke-static {v0}, Lm83/n;->Z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {v1, v0}, Luf3/a;-><init>(Ljava/util/ArrayList;)V

    return-object v1
.end method

.method private static final F(Ljava/util/Map;Lu82/a;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lxf3/c;Luf3/a;)Ly50/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ly50/a;

    invoke-direct {p0}, Ly50/a;-><init>()V

    return-object p0
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lg50/c;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->x(Lxf3/c;Luf3/a;)Lg50/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lg60/a;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->B(Lxf3/c;Luf3/a;)Lg60/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lu50/c;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->D(Lxf3/c;Luf3/a;)Lu50/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lx50/b;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->u(Lxf3/c;Luf3/a;)Lx50/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Ln50/a;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->w(Lxf3/c;Luf3/a;)Ln50/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Luf3/a;
    .locals 1

    invoke-static {}, Ln50/d;->z()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Ld60/d;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->y(Lxf3/c;Luf3/a;)Ld60/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lf60/b;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->C(Lxf3/c;Luf3/a;)Lf60/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Ln50/c;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->s(Lxf3/c;Luf3/a;)Ln50/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Ly50/a;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->G(Lxf3/c;Luf3/a;)Ly50/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lu50/d;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->t(Lxf3/c;Luf3/a;)Lu50/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Ln50/b;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->v(Lxf3/c;Luf3/a;)Ln50/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->r(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljava/util/Map;Lu82/a;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->F(Ljava/util/Map;Lu82/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljava/util/Map;Lu82/a;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Ln50/d;->A(Ljava/util/Map;Lu82/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p()Luf3/a;
    .locals 1

    invoke-static {}, Ln50/d;->E()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final q(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    const-string v1, "access-mapping"

    invoke-static {p0, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lmu2/e;

    const/16 v0, 0x14

    invoke-direct {v6, v0}, Lmu2/e;-><init>(I)V

    new-instance v2, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v8, Lwf3/a;->e:Lvf3/c;

    const/4 v12, 0x2

    move-object v3, v8

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v7

    invoke-static {v4, v5, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v2}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v3, 0x17

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ln50/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v12, 0x1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, p0, v3, v2}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v3

    const-class v4, Ljb1/e;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-string v5, "clazz"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v3, Lrf3/b;->a:Lqf3/b;

    iget-object v7, v6, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    invoke-static {v4, v7}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    iput-object v7, v6, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v7, v6, Lqf3/b;->c:Lvf3/a;

    iget-object v6, v6, Lqf3/b;->a:Lvf3/a;

    invoke-static {v4, v7, v6}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    invoke-virtual {p0, v4, v3, v6}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v3, 0x18

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ln50/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, p0, v3, v2}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v3

    const-class v4, Lm91/s;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v3, Lrf3/b;->a:Lqf3/b;

    iget-object v9, v7, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    invoke-static {v4, v9}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v9

    iput-object v9, v7, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v9, v7, Lqf3/b;->c:Lvf3/a;

    iget-object v7, v7, Lqf3/b;->a:Lvf3/a;

    invoke-static {v4, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, v3, v6}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v3, 0x19

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ln50/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, p0, v4, v2}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v4

    const-class v7, Ljb1/d;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v4, Lrf3/b;->a:Lqf3/b;

    iget-object v9, v5, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    invoke-static {v7, v9}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v9

    iput-object v9, v5, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v9, v5, Lqf3/b;->c:Lvf3/a;

    iget-object v5, v5, Lqf3/b;->a:Lvf3/a;

    invoke-static {v7, v9, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5, v4, v6}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v4, 0xe

    invoke-direct {v11, v4}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lg50/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v1, 0xf

    invoke-direct {v11, v1}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ld60/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v1, 0x10

    invoke-direct {v11, v1}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lg60/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lf60/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lu50/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ly50/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v4, 0x15

    invoke-direct {v11, v4}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lu50/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v3

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v3, 0x16

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lx50/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, p0, v0, v2}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p1, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "CARE_UPDATE_ENTRYPOINT_TILE"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/access/circumference/models/CircumferenceModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "CIRCUMFERENCE"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/access/labsummary/models/LabSummaryModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "LAB_SUMMARY"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v3, Ll83/k;

    const-string v4, "MEASUREMENT_PROGRESS"

    invoke-direct {v3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance p1, Ll83/k;

    const-string v4, "PROGRAM_GOAL_TILE"

    invoke-direct {p1, v4, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3, p1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lxf3/c;Luf3/a;)Ln50/c;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ln50/c;

    new-instance v0, Lvf3/c;

    const-string v1, "access-mapping"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/Map;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    invoke-direct {p1, p0}, Ln50/c;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method private static final t(Lxf3/c;Luf3/a;)Lu50/d;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lg12/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg12/e;

    new-instance v2, Lu50/d;

    invoke-virtual {v0}, Lg12/e;->e()Lec3/t1;

    move-result-object v3

    const-class v4, Lg50/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg50/c;

    invoke-direct {v2, v0, v3, p0}, Lu50/d;-><init>(Lg12/d;Lec3/l;Lg50/c;)V

    return-object v2
.end method

.method private static final u(Lxf3/c;Luf3/a;)Lx50/b;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lx50/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu50/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu50/c;

    const-class v3, Ly50/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ly50/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lx50/b;-><init>(Lu50/c;Ly50/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final v(Lxf3/c;Luf3/a;)Ln50/b;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ln50/b;

    invoke-direct {p0}, Ln50/b;-><init>()V

    return-object p0
.end method

.method private static final w(Lxf3/c;Luf3/a;)Ln50/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ln50/a;

    invoke-direct {p0}, Ln50/a;-><init>()V

    return-object p0
.end method

.method private static final x(Lxf3/c;Luf3/a;)Lg50/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lg50/c;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lg50/c;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method private static final y(Lxf3/c;Luf3/a;)Ld60/d;
    .locals 10

    const-string v0, "it"

    const-string v1, "access-mapping"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v1, Lvf3/c;

    const-string v3, "KotlinxDeserializer"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v3, Lmq2/a;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lmq2/a;-><init>(I)V

    const-class v4, Lu82/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu82/a;

    new-instance v3, Ld60/d;

    new-instance v4, Lbh1/b;

    const/4 v5, 0x6

    invoke-direct {v4, p1, v1, v5}, Lbh1/b;-><init>(Ljava/util/Map;Lu82/a;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lnm0/e;

    const-class p1, Lcom/whoop/labfileupload/domain/LabFileUploadApi;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/whoop/labfileupload/domain/LabFileUploadApi;

    const-class p1, Lps1/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lps1/a;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ld60/d;-><init>(Lnm0/e;Lcom/whoop/labfileupload/domain/LabFileUploadApi;Lps1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final z()Luf3/a;
    .locals 2

    new-instance v0, Lvf3/c;

    const-string v1, "access-mapping"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Luf3/a;

    invoke-static {v0}, Lm83/n;->Z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {v1, v0}, Luf3/a;-><init>(Ljava/util/ArrayList;)V

    return-object v1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Ln50/d;->q(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln50/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
