.class public final Lxh2/c;
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
        "Lxh2/c;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "strap-history-sync_release"
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

.method public static synthetic a(Ljava/lang/String;Lec3/p1;Lcom/whoop/straphistorysync/sync/d;Lbi2/h;Lwh2/a;)Lcom/whoop/straphistorysync/sync/i;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lxh2/c;->n(Ljava/lang/String;Lec3/p1;Lcom/whoop/straphistorysync/sync/d;Lbi2/h;Lwh2/a;)Lcom/whoop/straphistorysync/sync/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lyh2/c;
    .locals 0

    invoke-static {p0, p1}, Lxh2/c;->o(Lxf3/c;Luf3/a;)Lyh2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;)Lbi2/h;
    .locals 0

    invoke-static {p0, p1, p2}, Lxh2/c;->l(Lxf3/c;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;)Lbi2/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lbi2/j;
    .locals 0

    invoke-static {p0, p1}, Lxh2/c;->j(Lxf3/c;Luf3/a;)Lbi2/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lbi2/g;
    .locals 0

    invoke-static {p0, p1}, Lxh2/c;->m(Lxf3/c;Luf3/a;)Lbi2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lcom/whoop/straphistorysync/sync/d;
    .locals 0

    invoke-static {p0, p1}, Lxh2/c;->i(Lxf3/c;Luf3/a;)Lcom/whoop/straphistorysync/sync/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lbi2/i;
    .locals 0

    invoke-static {p0, p1}, Lxh2/c;->k(Lxf3/c;Luf3/a;)Lbi2/i;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lx52/a;

    const/16 v0, 0x19

    invoke-direct {v5, v0}, Lx52/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/straphistorysync/sync/d;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v7, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v11, 0x1

    move-object v2, v7

    move v6, v11

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lx52/a;

    const/16 v2, 0x1a

    invoke-direct {v10, v2}, Lx52/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lbi2/j;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lx52/a;

    const/16 v3, 0x1b

    invoke-direct {v10, v3}, Lx52/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lbi2/i;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lx52/a;

    const/16 v3, 0x1c

    invoke-direct {v10, v3}, Lx52/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lbi2/g;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lx52/a;

    const/16 v3, 0x1d

    invoke-direct {v10, v3}, Lx52/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lyh2/c;

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

.method private static final i(Lxf3/c;Luf3/a;)Lcom/whoop/straphistorysync/sync/d;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/whoop/straphistorysync/sync/d;

    invoke-direct {p0}, Lcom/whoop/straphistorysync/sync/d;-><init>()V

    return-object p0
.end method

.method private static final j(Lxf3/c;Luf3/a;)Lbi2/j;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lbi2/j;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lbc3/c0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    const-class v3, Lyh2/d;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyh2/d;

    invoke-direct {p1, v1, p0}, Lbi2/j;-><init>(Lbc3/c0;Lyh2/d;)V

    return-object p1
.end method

.method private static final k(Lxf3/c;Luf3/a;)Lbi2/i;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lxh2/b;

    invoke-direct {p1, p0}, Lxh2/b;-><init>(Lxf3/c;)V

    return-object p1
.end method

.method private static final l(Lxf3/c;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;)Lbi2/h;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "strapInfo"

    move-object/from16 v4, p1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "analytics"

    move-object/from16 v5, p2

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lzh2/f;

    new-instance v1, Lai2/g;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v6, Lbi2/d;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    const/4 v13, 0x0

    invoke-virtual {v0, v13, v6, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbi2/d;

    const/4 v7, 0x2

    invoke-direct {v1, v6, v13, v7, v13}, Lai2/g;-><init>(Lbi2/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lai2/d;

    const-class v8, Lhu1/i;

    invoke-virtual {v2, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v13, v8, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lhu1/i;

    invoke-direct {v6, v8, v13, v7, v13}, Lai2/d;-><init>(Lhu1/i;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lai2/m;

    const-class v9, Ly62/b;

    invoke-virtual {v2, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v13, v9, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly62/b;

    invoke-direct {v8, v9, v13, v7, v13}, Lai2/m;-><init>(Ly62/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lai2/j;

    const-class v10, Lh52/a;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v13, v10, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh52/a;

    invoke-direct {v9, v10, v13, v7, v13}, Lai2/j;-><init>(Lh52/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lai2/k;

    const-class v10, Lcu0/b;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v13, v10, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    move-object v15, v10

    check-cast v15, Lcu0/b;

    const-class v10, Leu0/b;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v13, v10, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v16, v10

    check-cast v16, Leu0/b;

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lai2/k;-><init>(Lcu0/b;Leu0/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lai2/b;

    const-class v11, Leu0/a;

    invoke-virtual {v2, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v13, v11, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Leu0/a;

    invoke-direct {v10, v11, v13, v7, v13}, Lai2/b;-><init>(Leu0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x6

    new-array v11, v11, [Lai2/h;

    const/4 v12, 0x0

    aput-object v1, v11, v12

    const/4 v1, 0x1

    aput-object v6, v11, v1

    aput-object v8, v11, v7

    const/4 v1, 0x3

    aput-object v9, v11, v1

    const/4 v1, 0x4

    aput-object v14, v11, v1

    const/4 v1, 0x5

    aput-object v10, v11, v1

    invoke-static {v11}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v8, Lai2/e;

    const-class v6, Lgg1/a;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v13, v6, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgg1/a;

    invoke-direct {v8, v6, v13, v7, v13}, Lai2/e;-><init>(Lgg1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lai2/a;

    const-class v6, Lat0/b;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v13, v6, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lat0/b;

    invoke-virtual {v4}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v6

    invoke-virtual {v6}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v14 .. v19}, Lai2/a;-><init>(Lat0/b;Ljava/lang/String;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v7, v1

    move-object v6, v3

    move-object v9, v14

    invoke-direct/range {v6 .. v12}, Lzh2/f;-><init>(Ljava/util/List;Lai2/f;Lai2/f;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/whoop/straphistorysync/sync/j;

    const-class v6, Lca2/h;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v13, v2, v13}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lca2/h;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Lcom/whoop/straphistorysync/sync/j;-><init>(Lzh2/d;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;Lca2/h;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private static final m(Lxf3/c;Luf3/a;)Lbi2/g;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lxh2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method

.method private static final n(Ljava/lang/String;Lec3/p1;Lcom/whoop/straphistorysync/sync/d;Lbi2/h;Lwh2/a;)Lcom/whoop/straphistorysync/sync/i;
    .locals 10

    const-string v0, "deviceSerial"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateMachine"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncProcessor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/straphistorysync/sync/i;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v9}, Lcom/whoop/straphistorysync/sync/i;-><init>(Ljava/lang/String;Lec3/p1;Lcom/whoop/straphistorysync/sync/d;Lbi2/h;Lwh2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final o(Lxf3/c;Luf3/a;)Lyh2/c;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/straphistorysync/sync/e;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/straphistorysync/sync/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/straphistorysync/sync/d;

    const-class v5, Lbi2/j;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbi2/j;

    const-class v6, Lbi2/g;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbi2/g;

    const-class v7, Lbi2/i;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbi2/i;

    const-class v8, Liy1/c;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Liy1/c;

    const-class v9, Lca2/h;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lca2/h;

    const-class v10, Lst0/r;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lst0/r;

    const-class v11, Ljs0/c;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljs0/c;

    const-class v12, Lbc3/c0;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    const/16 v14, 0x600

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v0

    invoke-direct/range {v2 .. v15}, Lcom/whoop/straphistorysync/sync/e;-><init>(Lcom/whoop/straphistorysync/sync/d;Lbi2/j;Lbi2/g;Lbi2/i;Liy1/c;Lca2/h;Lst0/r;Ljs0/c;Lbc3/c0;Ltr2/n;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lxh2/c;->h(Ltf3/a;)Ll83/a0;

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
