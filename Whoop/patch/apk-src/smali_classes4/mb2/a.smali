.class public final Lmb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lmb2/a;",
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
        "b",
        "settings_release"
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
.field public static final b:Lmb2/a$a;

.field public static final c:I


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
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmb2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb2/a;->b:Lmb2/a$a;

    const/16 v0, 0x8

    sput v0, Lmb2/a;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lb9/y;->u()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lmb2/a;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lcom/whoop/settings/gifthub/api/GiftHubApi;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->n(Lxf3/c;Luf3/a;)Lcom/whoop/settings/gifthub/api/GiftHubApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lnb2/d;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->k(Lxf3/c;Luf3/a;)Lnb2/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Ltb2/a;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->s(Lxf3/c;Luf3/a;)Ltb2/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->m(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lpb2/c;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->o(Lxf3/c;Luf3/a;)Lpb2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Llb2/b;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->q(Lxf3/c;Luf3/a;)Llb2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lrb2/a;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->r(Lxf3/c;Luf3/a;)Lrb2/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;
    .locals 0

    invoke-static {p0, p1}, Lmb2/a;->l(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lmb2/a;->p(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ll3/h0;

    const/16 v0, 0x16

    invoke-direct {v5, v0}, Ll3/h0;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lnb2/d;

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

    const-string v3, "gift-hub-gson"

    const/4 v4, 0x0

    invoke-static {v1, p0, v2, v4, v3}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Ll3/h0;

    const/16 v1, 0x17

    invoke-direct {v10, v1}, Ll3/h0;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Lcom/google/gson/Gson;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "gift-hub-json"

    invoke-static {v6, p0, v1, v4, v2}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Ll3/h0;

    const/16 v1, 0x18

    invoke-direct {v10, v1}, Ll3/h0;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Ll3/h0;

    const/16 v1, 0x19

    invoke-direct {v10, v1}, Ll3/h0;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Lcom/whoop/settings/gifthub/api/GiftHubApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Ll3/h0;

    const/16 v1, 0x1a

    invoke-direct {v10, v1}, Ll3/h0;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Lpb2/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Ll3/h0;

    const/16 v1, 0x1b

    invoke-direct {v10, v1}, Ll3/h0;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Llb2/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Ll3/h0;

    const/16 v1, 0x1c

    invoke-direct {v10, v1}, Ll3/h0;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Lrb2/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Ll3/h0;

    const/16 v1, 0x1d

    invoke-direct {v10, v1}, Ll3/h0;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Ltb2/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v4}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lxf3/c;Luf3/a;)Lnb2/d;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnb2/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/settings/gifthub/api/GiftHubApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/settings/gifthub/api/GiftHubApi;

    const-class v3, Llb2/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Llb2/b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lnb2/d;-><init>(Lcom/whoop/settings/gifthub/api/GiftHubApi;Llb2/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final l(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;
    .locals 2

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lih0/d0;->g(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-static {p0, p1, p1, v0, p1}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final m(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lxf3/c;Luf3/a;)Lcom/whoop/settings/gifthub/api/GiftHubApi;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu82/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu82/e;

    new-instance v2, Lvf3/c;

    const-string v3, "gift-hub-gson"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lcom/google/gson/Gson;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/Gson;

    new-instance v3, Lvf3/c;

    const-string v4, "gift-hub-json"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lad3/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v1, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad3/c;

    const-string v4, "kt-serialization-settings"

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object v0

    new-instance v2, Lpg3/x0;

    invoke-direct {v2}, Lpg3/x0;-><init>()V

    const-class v3, Lsr2/y;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsr2/y;

    const-string v4, "defaultOkHttpClient"

    invoke-static {v3, v2, v0, v4}, Lb9/y;->y(Lsr2/y;Lpg3/x0;Lu82/d;Ljava/lang/String;)Lvf3/c;

    move-result-object v0

    const-class v3, Lud3/l0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class p1, Lcom/whoop/settings/gifthub/api/GiftHubApi;

    const-string v0, "create(...)"

    invoke-static {v2, p0, p1, v0}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/settings/gifthub/api/GiftHubApi;

    return-object p0
.end method

.method private static final o(Lxf3/c;Luf3/a;)Lpb2/c;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Leb/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    const-class v2, Landroidx/fragment/app/r0;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/r0;

    new-instance v2, Lpb2/c;

    new-instance v3, Lao1/f;

    const/4 v4, 0x5

    invoke-direct {v3, p1, v4}, Lao1/f;-><init>(Landroidx/fragment/app/r0;I)V

    const-class p1, Lj02/o0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v4, 0x0

    invoke-virtual {p0, v3, p1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/o0;

    const-class v3, Llb2/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v4, v0, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llb2/b;

    invoke-direct {v2, v1, p1, p0}, Lpb2/c;-><init>(Leb/a0;Lj02/o0;Llb2/b;)V

    return-object v2
.end method

.method private static final p(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lxf3/c;Luf3/a;)Llb2/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llb2/b;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Llb2/b;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method private static final r(Lxf3/c;Luf3/a;)Lrb2/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lrb2/a;

    invoke-direct {p0}, Lrb2/a;-><init>()V

    return-object p0
.end method

.method private static final s(Lxf3/c;Luf3/a;)Ltb2/a;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltb2/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lnb2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb2/d;

    const-class v3, Lrb2/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lrb2/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Ltb2/a;-><init>(Lnb2/d;Lrb2/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lmb2/a;->j(Ltf3/a;)Ll83/a0;

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

    iget-object v0, p0, Lmb2/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
