.class public final Lui1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lui1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lui1/a;",
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
        "kennel_release"
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
.field public static final b:Lui1/a$a;

.field public static final c:I

.field private static final d:Ltf3/a;


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

    new-instance v0, Lui1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lui1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lui1/a;->b:Lui1/a$a;

    const/16 v0, 0x8

    sput v0, Lui1/a;->c:I

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lui1/a;->o(Ltf3/a;)Ll83/a0;

    sput-object v0, Lui1/a;->d:Ltf3/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/i;

    invoke-direct {v0}, Lnd1/i;-><init>()V

    new-instance v1, Lrm0/c;

    invoke-direct {v1}, Lrm0/c;-><init>()V

    new-instance v2, Lv82/a;

    invoke-direct {v2}, Lv82/a;-><init>()V

    const/4 v3, 0x3

    new-array v3, v3, [Lnd1/j;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lui1/a;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Lxf3/c;Luf3/a;)Lyi1/e;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lyi1/e;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lyi1/e;-><init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final B(Lxf3/c;Luf3/a;)Lxi1/b;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Landroidx/fragment/app/r0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p1, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x27

    const-string v4, "No value found for type \'"

    if-eqz v2, :cond_1

    check-cast v2, Landroidx/fragment/app/r0;

    new-instance v1, Lxi1/b;

    new-instance v5, Lao1/f;

    const/16 v6, 0x12

    invoke-direct {v5, v2, v6}, Lao1/f;-><init>(Landroidx/fragment/app/r0;I)V

    const-class v2, Lj02/o0;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v6, 0x0

    invoke-virtual {p0, v5, v2, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj02/o0;

    const-class v5, Lo02/d;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v6, v5, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo02/d;

    const-class v7, Lfi0/a;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v6, v7, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    const-class v6, Leb/a0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p1, v7}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Leb/a0;

    invoke-direct {v1, v2, v5, p0, p1}, Lxi1/b;-><init>(Lj02/o0;Lo02/d;Lfi0/a;Leb/a0;)V

    return-object v1

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v6, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final C(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lyi1/b;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->z(Lxf3/c;Luf3/a;)Lyi1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Luf3/a;
    .locals 1

    invoke-static {}, Lui1/a;->r()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->v(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lui1/a;->C(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lu82/i;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lui1/a;->y(Lu82/i;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/HealthMonitorRepository;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->u(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/HealthMonitorRepository;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lvi1/d;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->x(Lxf3/c;Luf3/a;)Lvi1/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lgp0/a;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->p(Lxf3/c;Luf3/a;)Lgp0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/content/Context;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lui1/a;->q(Landroid/content/Context;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lxi1/b;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->B(Lxf3/c;Luf3/a;)Lxi1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->s(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()Luf3/a;
    .locals 1

    invoke-static {}, Lui1/a;->t()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lyi1/e;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->A(Lxf3/c;Luf3/a;)Lyi1/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lti1/a;
    .locals 0

    invoke-static {p0, p1}, Lui1/a;->w(Lxf3/c;Luf3/a;)Lti1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Luc2/a;

    const/16 v0, 0xb

    invoke-direct {v5, v0}, Luc2/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lgp0/a;

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

    new-instance v10, Luc2/a;

    const/16 v2, 0xc

    invoke-direct {v10, v2}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Luc2/a;

    const/16 v3, 0xd

    invoke-direct {v10, v3}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lcom/whoop/data/repositories/HealthMonitorRepository;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v11, 0x1

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "samd-model-mapping"

    invoke-static {v6, p0, v3, v1, v4}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Luc2/a;

    const/16 v3, 0xe

    invoke-direct {v10, v3}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Ljava/util/Map;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Luc2/a;

    const/16 v2, 0xf

    invoke-direct {v10, v2}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lti1/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Luc2/a;

    const/16 v2, 0x10

    invoke-direct {v10, v2}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lvi1/d;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Luc2/a;

    const/16 v2, 0x11

    invoke-direct {v10, v2}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lyi1/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Luc2/a;

    const/16 v2, 0x12

    invoke-direct {v10, v2}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lyi1/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Luc2/a;

    const/16 v2, 0x13

    invoke-direct {v10, v2}, Luc2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lxi1/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lxf3/c;Luf3/a;)Lgp0/a;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$viewModel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "params"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Landroid/content/Context;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v1, v4}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    check-cast v4, Landroid/content/Context;

    iget-object v1, v1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lbc3/c0;

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    check-cast v2, Lbc3/c0;

    if-nez v2, :cond_3

    new-instance v2, Lor2/m;

    const/4 v1, 0x1

    invoke-direct {v2, v3, v1, v3}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    move-object v14, v2

    new-instance v5, Lgp0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/data/repositories/HealthMonitorRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/data/repositories/HealthMonitorRepository;

    new-instance v2, Lvf3/c;

    const-string v7, "stringRepo"

    invoke-direct {v2, v7}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v7, Lal0/f;

    const/16 v8, 0x10

    invoke-direct {v7, v4, v8}, Lal0/f;-><init>(Landroid/content/Context;I)V

    const-class v4, Lcom/whoop/data/repositories/StringsRepository;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v7, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/data/repositories/StringsRepository;

    new-instance v2, Lvf3/c;

    const-string v4, "userContext"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lod1/u;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lod1/u;

    new-instance v2, Lu91/a;

    const/16 v4, 0x17

    invoke-direct {v2, v4}, Lu91/a;-><init>(I)V

    const-class v4, Lp92/i;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v2, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lp92/i;

    const-class v2, Lor2/a0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lor2/a0;

    const-class v2, Lz82/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lz82/b;

    const-class v2, Lgt0/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lgt0/e;

    const/16 v15, 0x80

    const/16 v16, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v16}, Lgp0/a;-><init>(Lcom/whoop/data/repositories/HealthMonitorRepository;Lcom/whoop/data/repositories/StringsRepository;Lod1/u;Lp92/i;Lor2/a0;Lz82/b;Lgt0/e;Lq83/j;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_4
    new-instance v0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "No value found for type \'"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v4, 0x27

    invoke-static {v2, v3, v1, v4}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final q(Landroid/content/Context;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final r()Luf3/a;
    .locals 1

    const/16 v0, 0x38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final s(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableLegacyDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lu91/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lu91/a;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    return-object p0
.end method

.method private static final t()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-health-monitor-users-api"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final u(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/HealthMonitorRepository;
    .locals 9

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/repositories/HealthMonitorRepository;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/UsersApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/UsersApi;

    const-class v3, Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v5, Ltr2/n;->a:Ltr2/n$a;

    const-string v6, "HealthMonitorRepository"

    invoke-virtual {v5, v6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const-class v6, Lrr2/c;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lrr2/c;

    const-class v7, Lcom/whoop/data/remote/api/FileDownloaderApi;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/remote/api/FileDownloaderApi;

    const-class v8, Lin2/d;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lin2/d;

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lcom/whoop/data/repositories/HealthMonitorRepository;-><init>(Lcom/whoop/service/network/UsersApi;Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lrr2/c;Lcom/whoop/data/remote/api/FileDownloaderApi;Lin2/d;)V

    return-object v1
.end method

.method private static final v(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "ANF_STATE_CARD"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "ECG_ENABLED_CARD"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "ECG_RESULT"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v3, Ll83/k;

    const-string v4, "ONBOARDING_CARD"

    invoke-direct {v3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v4, Ll83/k;

    const-string v5, "PROFILE_INELIGIBLE_CARD"

    invoke-direct {v4, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v5, Ll83/k;

    const-string v6, "HORIZONTAL_DIVIDER"

    invoke-direct {v5, v6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v6, Ll83/k;

    const-string v7, "ANF_TILE"

    invoke-direct {v6, v7, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v7, Ll83/k;

    const-string v8, "MENU_ITEM"

    invoke-direct {v7, v8, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/HeartScreenerIntroModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v8, Ll83/k;

    const-string v9, "HEART_SCREENER_INTRO"

    invoke-direct {v8, v9, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/health/monitor/medical/domain/model/NewFeatureTagModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v9, Ll83/k;

    const-string p1, "NEW_FEATURE_TAG"

    invoke-direct {v9, p1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v0 .. v9}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lxf3/c;Luf3/a;)Lti1/a;
    .locals 2

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "params"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lbc3/c0;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_0

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    check-cast p1, Lbc3/c0;

    if-nez p1, :cond_3

    new-instance p1, Lor2/m;

    const/4 p0, 0x1

    invoke-direct {p1, v0, p0, v0}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    new-instance p0, Lti1/a;

    invoke-direct {p0, p1}, Lti1/a;-><init>(Lbc3/c0;)V

    return-object p0
.end method

.method private static final x(Lxf3/c;Luf3/a;)Lvi1/d;
    .locals 13

    const-string v0, "it"

    const-string v1, "samd-model-mapping"

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

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    new-instance p1, Lu82/i;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    invoke-direct {p1, p0}, Lu82/i;-><init>(Lad3/c;)V

    move-object p0, v3

    new-instance v3, Lvi1/d;

    new-instance v1, Lal0/b;

    const/4 v4, 0x4

    invoke-direct {v1, p1, v4}, Lal0/b;-><init>(Lu82/i;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lnm0/e;

    const-class p1, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    const-class p1, Lzr2/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lzr2/a;

    const-class p1, Lqk1/b;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lqk1/b;

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v10

    const-string p0, "systemUTC(...)"

    invoke-static {v10, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x28

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v12}, Lvi1/d;-><init>(Lnm0/e;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lzr2/a;Ltr2/n;Lqk1/b;Ljava/time/ZoneId;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final y(Lu82/i;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final z(Lxf3/c;Luf3/a;)Lyi1/b;
    .locals 5

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lbc3/c0;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Lbc3/c0;

    if-nez v0, :cond_3

    new-instance v0, Lor2/m;

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1, v1}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    new-instance p1, Lyi1/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lvi1/d;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvi1/d;

    const-class v4, Lyi1/e;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyi1/e;

    invoke-direct {p1, v3, p0, v0}, Lyi1/b;-><init>(Lvi1/d;Lyi1/e;Lbc3/c0;)V

    return-object p1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    sget-object v0, Lui1/a;->d:Ltf3/a;

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

    iget-object v0, p0, Lui1/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
