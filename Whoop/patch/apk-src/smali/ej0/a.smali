.class public final Lej0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lej0/a;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "Lhy1/a;",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "auth_release"
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
            "Lhy1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhy1/a;

    invoke-direct {v0}, Lhy1/a;-><init>()V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lej0/a;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Ldj0/b;
    .locals 0

    invoke-static {p0, p1}, Lej0/a;->i(Lxf3/c;Luf3/a;)Ldj0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lne/c;
    .locals 0

    invoke-static {p0, p1}, Lej0/a;->f(Lxf3/c;Luf3/a;)Lne/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Leg/k;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lej0/a;->h(Leg/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Ldj0/v;
    .locals 0

    invoke-static {p0, p1}, Lej0/a;->j(Lxf3/c;Luf3/a;)Ldj0/v;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lds2/a;

    const/16 v0, 0x19

    invoke-direct {v5, v0}, Lds2/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lne/c;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v7, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v2, v7

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v6

    invoke-static {v3, v4, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lds2/a;

    const/16 v3, 0x1a

    invoke-direct {v10, v3}, Lds2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Ldj0/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lds2/a;

    const/16 v3, 0x1b

    invoke-direct {v10, v3}, Lds2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Ldj0/v;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Ldc/b;->C(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lxf3/c;Luf3/a;)Lne/c;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    new-instance v2, Lvf3/c;

    const-string v3, "unauthenticatedOkHttpClient"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    new-instance p1, Lne/a;

    invoke-direct {p1}, Lne/a;-><init>()V

    invoke-static {v0, p0, p1}, Lej0/a;->g(Lsr2/y;Lud3/l0;Lne/a;)Ll83/a0;

    new-instance p0, Lye/b;

    invoke-direct {p0}, Lye/b;-><init>()V

    iget-object v0, p1, Lne/a;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-interface {p1}, Lvg/a;->build()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcf/k;

    check-cast p0, Lne/b;

    const-string p1, "config"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lne/d;

    invoke-direct {p1, p0}, Lne/d;-><init>(Lne/b;)V

    return-object p1
.end method

.method private static final g(Lsr2/y;Lud3/l0;Lne/a;)Ll83/a0;
    .locals 2

    const-string v0, "$this$CognitoIdentityProviderClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "us-west-2"

    iput-object v0, p2, Lne/a;->d:Ljava/lang/String;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/auth-service/v3/whoop"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lcg/o;->i:Lcg/n;

    invoke-static {v0, p0}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p0

    iput-object p0, p2, Lne/a;->g:Lcg/o;

    new-instance p0, Lrf/o;

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrf/r;->m:Lrf/r;

    invoke-direct {p0, v0, p1}, Lrf/o;-><init>(Lrf/r;Lud3/l0;)V

    iget-object p1, p2, Lne/a;->a:Lzt/q;

    invoke-virtual {p1, p0}, Lzt/q;->G(Lpf/a;)V

    new-instance p0, Lgj0/d;

    invoke-direct {p0}, Lgj0/d;-><init>()V

    iput-object p0, p2, Lne/a;->j:Lgj0/d;

    sget-object p0, Lcf/c;->e:Lcf/c;

    iput-object p0, p2, Lne/a;->i:Lcf/e;

    new-instance p0, Ldc1/c;

    const/16 p1, 0x19

    invoke-direct {p0, p1}, Ldc1/c;-><init>(I)V

    iget-object p1, p2, Lne/a;->b:Lcf/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lcf/h;->a:Ljc/b0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, Ljc/b0;->f:Ljava/io/Serializable;

    check-cast p2, Lvg/p;

    sget-object v0, Lvg/f;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    sget-object p2, Lvg/p;->y:Lvg/p;

    iput-object p2, p1, Ljc/b0;->f:Ljava/io/Serializable;

    sget-object p2, Leg/o;->b:Lqt/e;

    iput-object p2, p1, Ljc/b0;->e:Ljava/lang/Object;

    iget-object p2, p1, Ljc/b0;->d:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    new-instance v0, Lp3/b0;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p2, p0}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p1, Ljc/b0;->d:Ljava/lang/Object;

    new-instance p0, Lvg/e;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lvg/e;-><init>(Ljc/b0;I)V

    iput-object p0, p1, Ljc/b0;->g:Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance p0, Laws/smithy/kotlin/runtime/ClientException;

    const-string p1, "An explicit instance is already configured and its configuration cannot be modified"

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final h(Leg/k;)Ll83/a0;
    .locals 1

    const-string v0, "$this$retryStrategy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput v0, p0, Leg/k;->b:I

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lxf3/c;Luf3/a;)Ldj0/b;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldj0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v3, Lne/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lne/c;

    const-class v4, Liy1/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Liy1/c;

    const-class v4, Ldj0/v;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ldj0/v;

    const/16 v8, 0x24

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Ldj0/b;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lne/c;Ljava/lang/String;Liy1/c;Ldj0/v;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final j(Lxf3/c;Luf3/a;)Ldj0/v;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ldj0/v;

    invoke-direct {p0}, Ldj0/v;-><init>()V

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lej0/a;->e(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhy1/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lej0/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
