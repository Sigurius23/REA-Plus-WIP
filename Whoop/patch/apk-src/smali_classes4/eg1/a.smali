.class public final Leg1/a;
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
        "Leg1/a;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "firmware-events_release"
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

.method public static synthetic a(Lxf3/c;Luf3/a;)Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;
    .locals 0

    invoke-static {p0, p1}, Leg1/a;->f(Lxf3/c;Luf3/a;)Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Landroid/content/SharedPreferences;
    .locals 0

    invoke-static {p0, p1}, Leg1/a;->i(Lxf3/c;Luf3/a;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lhg1/c;
    .locals 0

    invoke-static {p0, p1}, Leg1/a;->h(Lxf3/c;Luf3/a;)Lhg1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lhg1/a;
    .locals 0

    invoke-static {p0, p1}, Leg1/a;->g(Lxf3/c;Luf3/a;)Lhg1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lds2/a;

    const/16 v0, 0x15

    invoke-direct {v5, v0}, Lds2/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

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

    new-instance v10, Lds2/a;

    const/16 v2, 0x16

    invoke-direct {v10, v2}, Lds2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lhg1/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lds2/a;

    const/16 v2, 0x17

    invoke-direct {v10, v2}, Lds2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lhg1/c;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "fw-events-shared-prefs-koin"

    invoke-static {v6, p0, v2, v1, v3}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lds2/a;

    const/16 v2, 0x18

    invoke-direct {v10, v2}, Lds2/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Landroid/content/SharedPreferences;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lxf3/c;Luf3/a;)Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;
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

    const-string v3, "defaultOkHttpClient"

    invoke-static {v1, p1, v3}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    return-object p0
.end method

.method private static final g(Lxf3/c;Luf3/a;)Lhg1/a;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lhg1/b;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "StrapEventsUploaderToApiImpl"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    const-class v4, Lor2/g;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lor2/g;

    invoke-virtual {v4}, Lor2/g;->i()Ljava/lang/String;

    move-result-object v4

    const-class v5, La6/g;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    invoke-direct {p1, v0, v2, v4, p0}, Lhg1/b;-><init>(Ltr2/n;Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;Ljava/lang/String;La6/g;)V

    return-object p1
.end method

.method private static final h(Lxf3/c;Luf3/a;)Lhg1/c;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhg1/d;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "StrapFirmwareEventsFileExporter"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    const-string p1, "getCacheDir(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lfg1/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {p0, v4, v0, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfg1/c;

    const-class v5, Ljs0/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljs0/c;

    const-class v6, Lmh2/a;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmh2/a;

    const-class v7, Lvt0/a;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lvt0/a;

    move-object v4, v0

    invoke-direct/range {v1 .. v7}, Lhg1/d;-><init>(Ltr2/n;Ljava/io/File;Lfg1/c;Ljs0/c;Lmh2/a;Lvt0/a;)V

    return-object v1
.end method

.method private static final i(Lxf3/c;Luf3/a;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1, p0}, Lb9/y;->e(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    const-string p1, "prefs-fw-events"

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Leg1/a;->e(Ltf3/a;)Ll83/a0;

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
