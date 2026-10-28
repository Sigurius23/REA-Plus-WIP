.class public final Lfq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfq0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lfq0/b;",
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
        "community_release"
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
.field public static final b:Lfq0/b$a;

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

    new-instance v0, Lfq0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfq0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfq0/b;->b:Lfq0/b$a;

    const/16 v0, 0x8

    sput v0, Lfq0/b;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lb9/y;->u()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lfq0/b;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Landroid/content/Context;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Lxf3/c;Luf3/a;)Liq0/b0;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Liq0/b0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/ChatClient;

    const-class v3, Lcq0/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcq0/a;

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "NotificationSettingsViewModel"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Liq0/b0;-><init>(Lio/getstream/chat/android/client/ChatClient;Lcq0/a;Ltr2/n;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final C(Lxf3/c;Luf3/a;)Lcq0/h;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/widget/api/WidgetApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/widget/api/WidgetApi;

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v3, "WidgetRepository"

    invoke-virtual {v2, v3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    const-class v3, Lrr2/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrr2/c;

    const-class v4, Lin2/d;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lin2/d;

    new-instance p1, Lcq0/h;

    invoke-direct {p1, v0, v2, p0, v3}, Lcq0/h;-><init>(Lcom/whoop/widget/api/WidgetApi;Ltr2/n;Lin2/d;Lrr2/c;)V

    return-object p1
.end method

.method private static final D(Lxf3/c;Luf3/a;)Ldq0/d;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldq0/d;

    new-instance v2, Lao1/g;

    const/4 p1, 0x3

    invoke-direct {v2, p0, p1}, Lao1/g;-><init>(Lxf3/c;I)V

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "StreamSessionLifecycleHandler"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lod1/a0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {p0, v4, v0, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/a0;

    const-class v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v6, Lbc3/c0;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lbc3/c0;

    move-object v4, v0

    invoke-direct/range {v1 .. v6}, Ldq0/d;-><init>(Lc93/a;Ltr2/n;Lod1/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V

    return-object v1
.end method

.method private static final E(Lxf3/c;)Ldq0/b;
    .locals 3

    new-instance v0, Lvf3/c;

    const-string v1, "streamClient"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Ldq0/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldq0/b;

    return-object p0
.end method

.method private static final F(Lxf3/c;Luf3/a;)Lnq0/r;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lnq0/r;

    invoke-direct {p0}, Lnq0/r;-><init>()V

    return-object p0
.end method

.method private static final G(Lxf3/c;Luf3/a;)Lgq0/a;
    .locals 11

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lao1/g;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lao1/g;-><init>(Lxf3/c;I)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lnm0/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lnm0/e;

    const-class p1, Lwm0/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lwm0/a;

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class p1, Lhj0/d;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lhj0/d;

    const-class p1, Lod1/a0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lod1/a0;

    const-class p1, Lyp0/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Lyp0/a;

    const-class p1, Lbc3/c0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lbc3/c0;

    new-instance v3, Lgq0/a;

    invoke-direct/range {v3 .. v10}, Lgq0/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnm0/e;Lwm0/a;Lhj0/d;Lod1/a0;Lyp0/a;Lbc3/c0;)V

    return-object v3
.end method

.method private static final H(Lxf3/c;)Luf3/a;
    .locals 3

    new-instance v0, Lvf3/c;

    const-string v1, "community-bff-cache-deserializer"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lu82/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    new-instance v0, Luf3/a;

    invoke-static {p0}, Lm83/n;->Z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {v0, p0}, Luf3/a;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method private static final I(Lxf3/c;Luf3/a;)Lj02/g;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Lgq0/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj02/g;

    return-object p0
.end method

.method private static final J(Lxf3/c;Luf3/a;)Lcq0/g;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lin2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lin2/d;

    const-class v2, Lcom/whoop/data/remote/commons/AppExecutors;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/whoop/data/remote/commons/AppExecutors;

    const-class v2, Lcom/whoop/service/network/CommunityApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/service/network/CommunityApi;

    const-class v2, Lcom/whoop/community/data/network/CommunityServiceApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/community/data/network/CommunityServiceApi;

    const-class v2, Lcom/whoop/service/network/UsersApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/whoop/service/network/UsersApi;

    const-class v2, Lcom/whoop/community/data/network/ChatApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/whoop/community/data/network/ChatApi;

    const-class v2, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    const-class v2, Lcom/whoop/data/remote/RemoteDataSource;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/whoop/data/remote/RemoteDataSource;

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "TeamsRepository"

    invoke-virtual {v2, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v14

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-class v2, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    const-class v2, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    const-class v2, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    const-class v2, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-class v2, Lrr2/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lrr2/c;

    new-instance v4, Lcq0/g;

    invoke-direct/range {v4 .. v19}, Lcq0/g;-><init>(Lin2/d;Lcom/whoop/service/network/CommunityApi;Lcom/whoop/community/data/network/CommunityServiceApi;Lcom/whoop/service/network/UsersApi;Lcom/whoop/community/data/network/ChatApi;Lcom/whoop/data/remote/commons/AppExecutors;Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/data/repositories/FeatureFlagRepository;Ltr2/n;Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;Lcom/whoop/data/local/prefs/PreferenceHelper;Lrr2/c;)V

    return-object v4
.end method

.method private static final K(Lxf3/c;Luf3/a;)Lcq0/a;
    .locals 6

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcq0/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/community/data/network/ChatApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/community/data/network/ChatApi;

    sget-object v3, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "ChatRepository"

    invoke-virtual {v3, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    const-class v4, Lin2/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lin2/d;

    const-class v5, Lrr2/c;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrr2/c;

    invoke-direct {p1, v1, v3, v4, p0}, Lcq0/a;-><init>(Lcom/whoop/community/data/network/ChatApi;Ltr2/n;Lin2/d;Lrr2/c;)V

    return-object p1
.end method

.method private static final L(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;
    .locals 25

    move-object/from16 v0, p1

    const-string v1, "$this$factory"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "<destruct>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Ljava/lang/String;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    invoke-static {v2}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v2

    const v23, 0x1ffffc

    const/16 v24, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final M(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;
    .locals 1

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "<destruct>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    const-class p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->create(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    return-object p0
.end method

.method private static final N(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;
    .locals 1

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "<destruct>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    const-class p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->create(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    return-object p0
.end method

.method private static final O(Lxf3/c;Luf3/a;)Liq0/m;
    .locals 14

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Liq0/m;

    new-instance p1, Lvf3/c;

    const-string v0, "streamClient"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ldq0/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ldq0/b;

    const-class p1, Lcq0/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcq0/a;

    const-class v4, Lcq0/g;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcq0/g;

    sget-object v5, Ltr2/n;->a:Ltr2/n$a;

    const-string v6, "CommunityChatViewModel"

    invoke-virtual {v5, v6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const-class v6, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v3, v6, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-class v7, Lz92/a;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v3, v7, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz92/a;

    const-class v8, Ly92/a;

    invoke-virtual {v0, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v3, v8, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly92/a;

    const-class v9, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v12, 0x300

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v13}, Liq0/m;-><init>(Ldq0/b;Lcq0/a;Lcq0/g;Ltr2/n;Lcom/whoop/data/local/prefs/PreferenceHelper;Lz92/a;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/j;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lnq0/i;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->y(Lxf3/c;Luf3/a;)Lnq0/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lnq0/r;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->F(Lxf3/c;Luf3/a;)Lnq0/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Luf3/a;
    .locals 1

    invoke-static {}, Lfq0/b;->x()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->v(Lxf3/c;Luf3/a;)Lu82/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->N(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lj02/g;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->I(Lxf3/c;Luf3/a;)Lj02/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lfq0/b;->A(Landroid/content/Context;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Liq0/m;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->O(Lxf3/c;Luf3/a;)Liq0/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lmq0/i;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->z(Lxf3/c;Luf3/a;)Lmq0/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Ldq0/d;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->D(Lxf3/c;Luf3/a;)Ldq0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->L(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxf3/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lfq0/b;->H(Lxf3/c;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->M(Lxf3/c;Luf3/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lgq0/a;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->G(Lxf3/c;Luf3/a;)Lgq0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lcq0/h;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->C(Lxf3/c;Luf3/a;)Lcq0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lxf3/c;)Ldq0/b;
    .locals 0

    invoke-static {p0}, Lfq0/b;->E(Lxf3/c;)Ldq0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Lcom/whoop/community/data/network/CommunityServiceApi;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->w(Lxf3/c;Luf3/a;)Lcom/whoop/community/data/network/CommunityServiceApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Liq0/b0;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->B(Lxf3/c;Luf3/a;)Liq0/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lcq0/a;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->K(Lxf3/c;Luf3/a;)Lcq0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lcq0/g;
    .locals 0

    invoke-static {p0, p1}, Lfq0/b;->J(Lxf3/c;Luf3/a;)Lcq0/g;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    const-string v1, "community-bff-cache-deserializer"

    invoke-static {p0, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lf91/b;

    const/16 v0, 0x1a

    invoke-direct {v6, v0}, Lf91/b;-><init>(I)V

    new-instance v2, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lu82/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v8, Lwf3/a;->e:Lvf3/c;

    const/4 v12, 0x2

    move-object v3, v8

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v4, v5, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/16 v1, 0x9

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/community/data/network/CommunityServiceApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/16 v3, 0xa

    invoke-direct {v11, v3}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lgq0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v12, 0x1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/16 v3, 0xb

    invoke-direct {v11, v3}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lj02/g;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lf91/b;

    const/16 v3, 0x1b

    invoke-direct {v11, v3}, Lf91/b;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcq0/g;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lf91/b;

    const/16 v3, 0x1c

    invoke-direct {v11, v3}, Lf91/b;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcq0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lf91/b;

    const/16 v4, 0x1d

    invoke-direct {v11, v4}, Lf91/b;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Liq0/m;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v1, 0x3

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lnq0/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lmq0/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v1, 0x5

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Liq0/b0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v4, 0x6

    invoke-direct {v11, v4}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lcq0/h;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v3

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/4 v3, 0x7

    invoke-direct {v11, v3}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ldq0/d;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lfq0/a;

    const/16 v1, 0x8

    invoke-direct {v11, v1}, Lfq0/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lnq0/r;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, p0, v0, v2}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lu82/c;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    new-instance v1, Lcom/google/gson/GsonBuilder;

    invoke-direct {v1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v2, 0x3

    invoke-static {v1, v3, v3, v2, v3}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v1

    const-string v2, "create(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "kt-serialization-community"

    invoke-static {v2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {p1, p0, v1, v0, v2}, Lu82/c;-><init>(Lad3/c;Lcom/google/gson/Gson;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/util/Set;)V

    return-object p1
.end method

.method private static final w(Lxf3/c;Luf3/a;)Lcom/whoop/community/data/network/CommunityServiceApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableLegacyDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lep0/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/community/data/network/CommunityServiceApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/community/data/network/CommunityServiceApi;

    return-object p0
.end method

.method private static final x()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-community"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final y(Lxf3/c;Luf3/a;)Lnq0/i;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "$this$viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcq0/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcq0/g;

    const-class v2, Li92/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Li92/e;

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "CommunityLandingViewModel"

    invoke-virtual {v2, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v7

    const-class v2, Lle1/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lle1/c;

    const-class v2, Lqe1/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lqe1/d;

    const-class v2, Lcom/whoop/data/repositories/LanguageRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/whoop/data/repositories/LanguageRepository;

    const-class v2, Lsx1/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lsx1/c;

    const-class v2, Lz92/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lz92/a;

    const-class v2, Lqv1/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lqv1/d;

    const-class v2, Lqv1/f;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lqv1/f;

    new-instance v4, Lnq0/i;

    const/16 v16, 0x80

    const/16 v17, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v17}, Lnq0/i;-><init>(Lcq0/g;Li92/e;Ltr2/n;Lle1/c;Lqe1/d;Lqv1/d;Lqv1/f;Lbc3/c0;Lcom/whoop/data/repositories/LanguageRepository;Lsx1/c;Lz92/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private static final z(Lxf3/c;Luf3/a;)Lmq0/i;
    .locals 10

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v1, Lmq0/i;

    const-class v2, Li92/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li92/e;

    const-class v4, Lcq0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcq0/a;

    new-instance v5, Lvf3/c;

    const-string v6, "userContext"

    invoke-direct {v5, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v6, Lod1/u;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v3, v6, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/u;

    new-instance v5, Lvf3/c;

    const-string v6, "stringRepo"

    invoke-direct {v5, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v6, Lal0/f;

    const/4 v7, 0x4

    invoke-direct {v6, p1, v7}, Lal0/f;-><init>(Landroid/content/Context;I)V

    const-class p1, Lcom/whoop/data/repositories/StringsRepository;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v6, p1, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/whoop/data/repositories/StringsRepository;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v9, v4

    move-object v4, v3

    move-object v3, v9

    invoke-direct/range {v1 .. v8}, Lmq0/i;-><init>(Li92/e;Lcq0/a;Lod1/u;Lcom/whoop/data/repositories/StringsRepository;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lfq0/b;->u(Ltf3/a;)Ll83/a0;

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

    iget-object v0, p0, Lfq0/b;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
