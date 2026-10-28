.class public final Lex0/b;
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
        "Lex0/b;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "Lv82/a;",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "data-sync-service_release"
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
            "Lv82/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lb9/y;->u()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lex0/b;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Lxf3/c;Luf3/a;)Lix0/d;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lix0/e;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Leu0/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leu0/b;

    const-class v3, Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    const-class v4, Ljs0/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljs0/c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lix0/e;-><init>(Leu0/b;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final B(Lxf3/c;Luf3/a;)Lix0/a;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lix0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Leu0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leu0/a;

    const-class v3, Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    const-class v4, Ljs0/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljs0/c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lix0/b;-><init>(Leu0/a;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final C(Lxf3/c;Luf3/a;)Lhx0/e;
    .locals 12

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhx0/b;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "NewRawDataUploaderImpl"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    const-class v4, Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    const-class v5, Lcu0/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcu0/b;

    const-class v6, Ljs0/c;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v3, v6, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljs0/c;

    const-class v7, Lfi0/a;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v3, v7, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lfi0/a;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v8

    const-string v9, "prefs-raw-data"

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v8

    const-string v9, "getSharedPreferences(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lzr2/a;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {p0, v3, v9, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzr2/a;

    const-class v10, Lix0/d;

    invoke-virtual {p1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {p0, v3, v10, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lix0/d;

    const-class v11, Lix0/a;

    invoke-virtual {p1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v11, p0

    check-cast v11, Lix0/a;

    move-object v3, v0

    invoke-direct/range {v1 .. v11}, Lhx0/b;-><init>(Ltr2/n;Lcom/whoop/dataSyncService/retrofit/DataSyncApi;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Lcu0/b;Ljs0/c;Lfi0/a;Landroid/content/SharedPreferences;Lzr2/a;Lix0/d;Lix0/a;)V

    return-object v1
.end method

.method private static final D(Lxf3/c;Luf3/a;)Lmx0/b;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmx0/b;

    new-instance v0, Lvf3/c;

    const-string v1, "workManagerInstance"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lic/p0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lic/p0;

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "DataSyncScheduler"

    invoke-virtual {v2, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    const-class v4, Ljx0/f;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljx0/f;

    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v1

    const-string v3, "systemDefaultZone(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2, p0, v1}, Lmx0/b;-><init>(Lic/p0;Ltr2/n;Ljx0/f;Ljava/time/Clock;)V

    return-object p1
.end method

.method private static final E(Lxf3/c;Luf3/a;)Lmx0/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmx0/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Llx0/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llx0/d;

    const-class v3, Lkx0/d;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkx0/d;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "DataFlowController"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, v1, v3, p0, v0}, Lmx0/a;-><init>(Llx0/d;Lkx0/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-object p1
.end method

.method private static final F(Lxf3/c;Luf3/a;)Ljx0/f;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljx0/f;

    const-class v0, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;

    invoke-virtual {p0}, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;->b()Ljx0/b;

    move-result-object p0

    invoke-direct {p1, p0}, Ljx0/f;-><init>(Ljx0/b;)V

    return-object p1
.end method

.method private static final G(Lxf3/c;Luf3/a;)Lfx0/b;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfx0/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Liy1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liy1/c;

    const-class v3, Lca2/h;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lca2/h;

    invoke-direct {p1, v1, p0}, Lfx0/b;-><init>(Liy1/c;Lca2/h;)V

    return-object p1
.end method

.method private static final H(Lxf3/c;Luf3/a;)Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;
    .locals 2

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1, p0}, Lb9/y;->e(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    const-class p1, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;

    const-string v0, "data_sync_work_db"

    invoke-static {p0, p1, v0}, Ljc/x;->C(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/p0;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/room/p0;->b()Landroidx/room/z0;

    move-result-object p0

    check-cast p0, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;

    return-object p0
.end method

.method private static final I(Lxf3/c;Luf3/a;)Lu92/d;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lu92/d;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    const-string v0, "whoop_dataSyncService_preferences"

    invoke-direct {p1, p0, v0}, Lu92/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final J(Lxf3/c;Luf3/a;)Ljava/time/Clock;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object p0

    const-string p1, "systemUTC(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final K(Lxf3/c;Luf3/a;)Lgx0/a;
    .locals 7

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lgx0/a;

    new-instance p1, Lvf3/c;

    const-string v0, "whoop_dataSyncService_preferences"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v0, Lu92/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lu92/d;

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v3

    const-string p0, "systemUTC(...)"

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lgx0/a;-><init>(Lu92/d;Ljava/time/Clock;Lbc3/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final L(Lxf3/c;Luf3/a;)Lmx0/c;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmx0/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lbc3/c0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    const-class v3, Lgx0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgx0/a;

    const-class v4, Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "HighWatermarkHelper"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, v1, v3, p0, v0}, Lmx0/c;-><init>(Lbc3/c0;Lgx0/a;Lcom/whoop/dataSyncService/retrofit/DataSyncApi;Ltr2/n;)V

    return-object p1
.end method

.method private static final M(Lxf3/c;Luf3/a;)Ldt0/d;
    .locals 6

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ldx0/a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "DataSyncService"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v4, Ldx0/b;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldx0/b;

    const-class v5, Lmx0/c;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmx0/c;

    invoke-direct {p1, v0, v2, v4, p0}, Ldx0/a;-><init>(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Ldx0/b;Lmx0/c;)V

    return-object p1
.end method

.method private static final N(Lxf3/c;Luf3/a;)Ldt0/e;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldx0/d;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "ProcessNowApi"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ldt0/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldt0/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v4

    sget-object v5, Lbc3/q0;->a:Lkc3/e;

    invoke-static {v4, v5}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v4

    const-class v5, Ljs0/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljs0/c;

    const-class v6, La6/g;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, La6/g;

    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v7

    const-string p0, "systemDefaultZone(...)"

    invoke-static {v7, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    invoke-direct/range {v1 .. v7}, Ldx0/d;-><init>(Ltr2/n;Ldt0/d;Lbc3/c0;Ljs0/c;La6/g;Ljava/time/Clock;)V

    return-object v1
.end method

.method private static final O(Lxf3/c;Luf3/a;)Ldx0/b;
    .locals 11

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "DataSyncServiceManager"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const-class v0, Lbc3/c0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v6

    const-string v0, "systemUTC(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lmx0/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lmx0/b;

    const-class v0, Ljx0/f;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljx0/f;

    const-class v0, Lod1/a0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lod1/a0;

    const-class v0, Lfx0/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lfx0/b;

    new-instance v2, Ldx0/b;

    invoke-direct/range {v2 .. v10}, Ldx0/b;-><init>(Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Ljava/time/Clock;Lmx0/b;Ljx0/f;Lod1/a0;Lfx0/b;)V

    return-object v2
.end method

.method private static final P(Lxf3/c;Luf3/a;)Llx0/f;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llx0/f;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v0

    const-string v1, "systemUTC(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "UploadPipelineGate"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    invoke-direct {p1, p0, v0, v1}, Llx0/f;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/time/Clock;Ltr2/n;)V

    return-object p1
.end method

.method private static final Q(Lxf3/c;Luf3/a;)Llx0/d;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "UploadDataInteractor"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lp82/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp82/b;

    const-class v3, Llx0/f;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llx0/f;

    new-instance v0, Llx0/d;

    invoke-direct {v0, v1, p0, p1}, Llx0/d;-><init>(Lp82/b;Llx0/f;Ltr2/n;)V

    return-object v0
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lyh2/d;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->w(Lxf3/c;Luf3/a;)Lyh2/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lix0/d;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->A(Lxf3/c;Luf3/a;)Lix0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Ldt0/e;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->N(Lxf3/c;Luf3/a;)Ldt0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lgx0/a;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->K(Lxf3/c;Luf3/a;)Lgx0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Ldt0/d;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->M(Lxf3/c;Luf3/a;)Ldt0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Ljx0/f;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->F(Lxf3/c;Luf3/a;)Ljx0/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lfx0/b;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->G(Lxf3/c;Luf3/a;)Lfx0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->H(Lxf3/c;Luf3/a;)Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Llx0/f;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->P(Lxf3/c;Luf3/a;)Llx0/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Ldx0/b;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->O(Lxf3/c;Luf3/a;)Ldx0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lhx0/e;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->C(Lxf3/c;Luf3/a;)Lhx0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lix0/a;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->B(Lxf3/c;Luf3/a;)Lix0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lcom/whoop/dataSyncService/retrofit/DataSyncApi;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->x(Lxf3/c;Luf3/a;)Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Ljava/time/Clock;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->J(Lxf3/c;Luf3/a;)Ljava/time/Clock;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lmx0/a;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->E(Lxf3/c;Luf3/a;)Lmx0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lmx0/c;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->L(Lxf3/c;Luf3/a;)Lmx0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Lu92/d;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->I(Lxf3/c;Luf3/a;)Lu92/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lca2/f;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->y(Lxf3/c;Luf3/a;)Lca2/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Llx0/d;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->Q(Lxf3/c;Luf3/a;)Llx0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lmx0/b;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->D(Lxf3/c;Luf3/a;)Lmx0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lkx0/d;
    .locals 0

    invoke-static {p0, p1}, Lex0/b;->z(Lxf3/c;Luf3/a;)Lkx0/d;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lek1/a;

    const/16 v0, 0x18

    invoke-direct {v5, v0}, Lek1/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lyh2/d;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v7, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v11, 0x1

    move-object v2, v7

    move v6, v11

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v6

    invoke-static {v3, v4, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lek1/a;

    const/16 v3, 0x1a

    invoke-direct {v10, v3}, Lek1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "whoop_dataSyncService_preferences"

    invoke-static {v6, p0, v4, v1, v5}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lek1/a;

    const/16 v4, 0x1c

    invoke-direct {v10, v4}, Lek1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lu92/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lek1/a;

    const/16 v2, 0x1d

    invoke-direct {v10, v2}, Lek1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lgx0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v2, 0x0

    invoke-direct {v10, v2}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lmx0/c;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v2, 0x1

    invoke-direct {v10, v2}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Ldt0/d;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v4, 0x2

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Ldt0/e;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v4, 0x3

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Ldx0/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v2, 0x4

    invoke-direct {v10, v2}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Llx0/f;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v4, 0x6

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Llx0/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v4, 0x5

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lca2/f;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/4 v4, 0x7

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lkx0/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/16 v4, 0x8

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lix0/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/16 v2, 0x9

    invoke-direct {v10, v2}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lix0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/16 v2, 0xa

    invoke-direct {v10, v2}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lhx0/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/16 v2, 0xb

    invoke-direct {v10, v2}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lmx0/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/16 v4, 0xc

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lmx0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/16 v4, 0xd

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Ljx0/f;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lex0/a;

    const/16 v4, 0xe

    invoke-direct {v10, v4}, Lex0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lfx0/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lek1/a;

    const/16 v4, 0x19

    invoke-direct {v10, v4}, Lek1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "WORKER_CLOCK"

    invoke-static {v6, p0, v2, v1, v4}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lek1/a;

    const/16 v2, 0x1b

    invoke-direct {v10, v2}, Lek1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Ljava/time/Clock;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lxf3/c;Luf3/a;)Lyh2/d;
    .locals 9

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkx0/f;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lmu0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmu0/a;

    const-class v3, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    const-class v4, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;

    invoke-virtual {v5}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;->k()Lau0/a;

    move-result-object v5

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;

    invoke-virtual {v6}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;->i()Lfu0/d;

    move-result-object v6

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;

    invoke-virtual {v4}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;->h()Lfu0/a;

    move-result-object v4

    const-class v7, Lhu1/d;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lhu1/d;

    const-class v8, Lyt0/d;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lyt0/d;

    move-object v2, v6

    move-object v6, v4

    move-object v4, v5

    move-object v5, v2

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lkx0/f;-><init>(Lmu0/a;Lcom/whoop/data/local/room/dao/persistent/RawDataDao;Lau0/a;Lfu0/d;Lfu0/a;Lhu1/d;Lyt0/d;)V

    return-object v1
.end method

.method private static final x(Lxf3/c;Luf3/a;)Lcom/whoop/dataSyncService/retrofit/DataSyncApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    return-object p0
.end method

.method private static final y(Lxf3/c;Luf3/a;)Lca2/f;
    .locals 7

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkx0/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lyh2/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh2/c;

    const-class v3, Ldt0/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldt0/d;

    const-class v4, Lbc3/c0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lbc3/c0;

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v5

    const-string p0, "systemUTC(...)"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "HistorySyncRouter"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lkx0/a;-><init>(Lyh2/c;Ldt0/d;Lbc3/c0;Ljava/time/Clock;Ltr2/n;)V

    return-object v1
.end method

.method private static final z(Lxf3/c;Luf3/a;)Lkx0/d;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkx0/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lyh2/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh2/c;

    const-class v3, Lci2/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lci2/b;

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "StrapSyncInteractor"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    sget-object p0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 p0, 0xa

    sget-object p1, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    invoke-static {p0, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lkx0/d;-><init>(Lyh2/c;Lci2/b;Ltr2/n;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lex0/b;->v(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv82/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lex0/b;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
