.class public final Lrm0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lrm0/c;",
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
        "cache_release"
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
            "Lnd1/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/m;

    invoke-direct {v0}, Lnd1/m;-><init>()V

    new-instance v1, Lv02/a;

    invoke-direct {v1}, Lv02/a;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lnd1/j;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lrm0/c;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lrb0/f;

    const/16 v0, 0x1d

    invoke-direct {v5, v0}, Lrb0/f;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/cache/persistence/BffCacheDatabase;

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

    new-instance v10, Lrm0/a;

    const/4 v2, 0x1

    invoke-direct {v10, v2}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lum0/a;

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

    new-instance v10, Lrm0/a;

    const/4 v3, 0x3

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lum0/g;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/4 v3, 0x4

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lum0/e;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "InMemoryCache"

    invoke-static {v6, p0, v4, v1, v5}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lrm0/a;

    const/4 v4, 0x5

    invoke-direct {v10, v4}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lmm0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "PersistentCache"

    invoke-static {v6, p0, v2, v1, v5}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lrm0/a;

    const/4 v2, 0x6

    invoke-direct {v10, v2}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "CompositeCache"

    invoke-static {v6, p0, v2, v1, v5}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lrm0/a;

    const/4 v2, 0x7

    invoke-direct {v10, v2}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v4, 0x8

    invoke-direct {v10, v4}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lfy1/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0x9

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lxm0/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0xb

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lym0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0xa

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lnm0/d;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0xc

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lqm0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0xd

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Ltm0/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0xe

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Ltm0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "DefaultDeserializer"

    invoke-static {v6, p0, v3, v1, v4}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lrm0/a;

    const/16 v3, 0xf

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lu82/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0x10

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lnm0/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v3, 0x11

    invoke-direct {v10, v3}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lnm0/e;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v4, 0x12

    invoke-direct {v10, v4}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lwm0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/16 v2, 0x13

    invoke-direct {v10, v2}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lvm0/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "RealCacheReporter"

    invoke-static {v6, p0, v2, v1, v4}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lrm0/a;

    const/4 v2, 0x0

    invoke-direct {v10, v2}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lvm0/g;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lrm0/a;

    const/4 v2, 0x2

    invoke-direct {v10, v2}, Lrm0/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lom0/c;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lxf3/c;Luf3/a;)Lcom/whoop/cache/persistence/BffCacheDatabase;
    .locals 2

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1, p0}, Lb9/y;->e(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    const-class p1, Lcom/whoop/cache/persistence/BffCacheDatabase;

    const-string v0, "bff_cache_db"

    invoke-static {p0, p1, v0}, Ljc/x;->C(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/p0;

    move-result-object p0

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/room/p0;->p:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/room/p0;->q:Z

    invoke-virtual {p0}, Landroidx/room/p0;->b()Landroidx/room/z0;

    move-result-object p0

    check-cast p0, Lcom/whoop/cache/persistence/BffCacheDatabase;

    return-object p0
.end method

.method private static final C(Lxf3/c;Luf3/a;)Lum0/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Lcom/whoop/cache/persistence/BffCacheDatabase;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/cache/persistence/BffCacheDatabase;

    invoke-virtual {p0}, Lcom/whoop/cache/persistence/BffCacheDatabase;->b()Lum0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lxf3/c;Luf3/a;)Lnm0/d;
    .locals 6

    const-string v0, "$this$factory"

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

    instance-of v2, v0, Lu82/a;

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
    check-cast v0, Lu82/a;

    if-nez v0, :cond_3

    new-instance p1, Lvf3/c;

    const-string v0, "DefaultDeserializer"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v0, Lu82/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lu82/a;

    :cond_3
    new-instance p1, Lnm0/d;

    new-instance v2, Lrm0/b;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lrm0/b;-><init>(Lu82/a;I)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lqm0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqm0/a;

    const-class v3, Lxm0/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxm0/b;

    new-instance v4, Lvf3/c;

    const-string v5, "RealCacheReporter"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v5, Lvm0/g;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v1, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvm0/g;

    const-class v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v2, v3, v4, p0}, Lnm0/d;-><init>(Lqm0/a;Lxm0/b;Lvm0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method private static final E(Lu82/a;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lxf3/c;Luf3/a;)Lqm0/a;
    .locals 3

    const-string v0, "$this$factory"

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

    instance-of v2, v0, Lu82/a;

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
    check-cast v0, Lu82/a;

    if-nez v0, :cond_3

    new-instance p1, Lvf3/c;

    const-string v0, "DefaultDeserializer"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v0, Lu82/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lu82/a;

    :cond_3
    new-instance p0, Lqm0/a;

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lkc3/d;->w:Lkc3/d;

    invoke-direct {p0, v0, p1}, Lqm0/a;-><init>(Lu82/a;Lq83/j;)V

    return-object p0
.end method

.method private static final G(Lxf3/c;Luf3/a;)Ltm0/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltm0/b;

    const-class v0, Ltm0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltm0/a;

    invoke-direct {p1, p0}, Ltm0/b;-><init>(Ltm0/a;)V

    return-object p1
.end method

.method private static final H(Lxf3/c;Luf3/a;)Ltm0/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltm0/c;

    new-instance v0, Lvf3/c;

    const-string v1, "CompositeCache"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lmm0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmm0/a;

    new-instance v2, Lvf3/c;

    const-string v4, "RealCacheReporter"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lvm0/g;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvm0/g;

    invoke-direct {p1, v0, p0}, Ltm0/c;-><init>(Lmm0/a;Lvm0/g;)V

    return-object p1
.end method

.method private static final I(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 5

    const-string v0, "$this$factory"

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

    instance-of v2, v0, Ljava/util/Map;

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
    check-cast v0, Ljava/util/Map;

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p1

    new-instance v2, Lvf3/c;

    const-string v3, "api_gson_name"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v3, Lbh1/a;

    const/16 v4, 0x8

    invoke-direct {v3, v0, v4}, Lbh1/a;-><init>(Ljava/util/Map;I)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lcom/google/gson/Gson;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/Gson;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v0, Lu82/c;

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v0, p1, v2, p0, v1}, Lu82/c;-><init>(Lad3/c;Lcom/google/gson/Gson;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/util/Set;)V

    return-object v0
.end method

.method private static final J(Ljava/util/Map;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Lxf3/c;Luf3/a;)Lnm0/b;
    .locals 10

    const-string v0, "$this$factory"

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

    instance-of v2, v0, Lu82/a;

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
    check-cast v0, Lu82/a;

    if-nez v0, :cond_3

    new-instance p1, Lvf3/c;

    const-string v0, "DefaultDeserializer"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v0, Lu82/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lu82/a;

    :cond_3
    move-object v8, v0

    new-instance v2, Lnm0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lxm0/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lxm0/b;

    const-class v0, Lu02/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lu02/c;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lsr2/y;

    new-instance v0, Lvf3/c;

    const-string v6, "RealCacheReporter"

    invoke-direct {v0, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v6, Lvm0/g;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v1, v6, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lvm0/g;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v7, Lkc3/d;->w:Lkc3/d;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct/range {v2 .. v9}, Lnm0/b;-><init>(Lxm0/b;Lu02/c;Lsr2/y;Lvm0/g;Lq83/j;Lu82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object v2
.end method

.method private static final L(Lxf3/c;Luf3/a;)Lnm0/e;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/util/Map;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_0

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lu82/a;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_3

    goto :goto_3

    :cond_5
    move-object v0, v2

    :goto_3
    check-cast v0, Lu82/a;

    if-nez v0, :cond_6

    new-instance p1, Lvf3/c;

    const-string v0, "DefaultDeserializer"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v0, Lm83/p;

    const/16 v3, 0xd

    invoke-direct {v0, v1, v3}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    const-class v1, Lu82/a;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lu82/a;

    :cond_6
    new-instance v3, Lnm0/f;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lym0/a;

    invoke-virtual {p1, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lym0/a;

    new-instance v1, Lrm0/b;

    const/4 v5, 0x0

    invoke-direct {v1, v0, v5}, Lrm0/b;-><init>(Lu82/a;I)V

    const-class v5, Lnm0/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v1, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lnm0/b;

    new-instance v1, Lrm0/b;

    const/4 v6, 0x1

    invoke-direct {v1, v0, v6}, Lrm0/b;-><init>(Lu82/a;I)V

    const-class v0, Lnm0/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lnm0/d;

    const-class v0, Lwm0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lwm0/a;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lsr2/y;

    invoke-direct/range {v3 .. v8}, Lnm0/f;-><init>(Lym0/a;Lnm0/b;Lnm0/d;Lwm0/a;Lsr2/y;)V

    return-object v3
.end method

.method private static final M(Ljava/util/Map;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final N(Lu82/a;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final O(Lu82/a;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final P(Lxf3/c;Luf3/a;)Lwm0/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lwm0/a;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lwm0/a;-><init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final Q(Lxf3/c;Luf3/a;)Lvm0/b;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvm0/b;

    const-class v0, Lfy1/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfy1/c;

    invoke-direct {p1, p0}, Lvm0/b;-><init>(Lfy1/c;)V

    return-object p1
.end method

.method private static final R(Lxf3/c;Luf3/a;)Lvm0/g;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvm0/j;

    new-instance p1, Lvf3/c;

    const-string v0, "CompositeCache"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lmm0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lmm0/a;

    const-class p1, Lrr2/c;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrr2/c;

    const-class v4, Lvm0/b;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lvm0/b;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lvm0/j;-><init>(Lmm0/a;Lrr2/c;Lvm0/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final S(Lxf3/c;Luf3/a;)Lum0/g;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lum0/g;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/cache/persistence/BffCacheDatabase;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/cache/persistence/BffCacheDatabase;

    const-class v3, Lum0/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lum0/a;

    const-class v4, Lrr2/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrr2/c;

    const-class v5, Lum0/e;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lum0/e;

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lum0/g;-><init>(Lcom/whoop/cache/persistence/BffCacheDatabase;Lum0/a;Lrr2/c;Lum0/e;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final T(Lxf3/c;Luf3/a;)Lom0/c;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lom0/c;

    new-instance p1, Lvf3/c;

    const-string v0, "CompositeCache"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lmm0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lmm0/a;

    const-class p1, Lxm0/b;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxm0/b;

    const-class v4, Lu02/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu02/c;

    const-class v5, Lsr2/y;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lsr2/y;

    new-instance v6, Lvf3/c;

    const-string v7, "RealCacheReporter"

    invoke-direct {v6, v7}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v7, Lvm0/g;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v3, v7, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lvm0/g;

    const-class v7, Lbc3/c0;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lbc3/c0;

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lom0/c;-><init>(Lmm0/a;Lxm0/b;Lu02/c;Lsr2/y;Lvm0/g;Lbc3/c0;)V

    return-object v1
.end method

.method private static final U(Lxf3/c;Luf3/a;)Lum0/e;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lum0/e;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lum0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lum0/a;

    const-class v3, Ljs0/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljs0/c;

    const-class v4, Lvm0/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lvm0/b;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lum0/e;-><init>(Lum0/a;Ljs0/c;Lvm0/b;Lfy1/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final V(Lxf3/c;Luf3/a;)Lmm0/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lmm0/e;

    invoke-direct {p0}, Lmm0/e;-><init>()V

    return-object p0
.end method

.method private static final W(Lxf3/c;Luf3/a;)Lmm0/a;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmm0/d;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lrm0/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lrm0/c$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    new-instance v3, Lrm0/c$b;

    invoke-direct {v3, p0, v2, v2}, Lrm0/c$b;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p0

    new-instance v0, Lmm0/e;

    invoke-direct {v0}, Lmm0/e;-><init>()V

    invoke-direct {p1, v1, p0, v0}, Lmm0/d;-><init>(Ll83/h;Ll83/h;Lmm0/a;)V

    return-object p1
.end method

.method private static final X(Lxf3/c;Luf3/a;)Lmm0/a;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmm0/c;

    new-instance p1, Lvf3/c;

    const-string v0, "InMemoryCache"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lmm0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v4, v3, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmm0/a;

    new-instance v3, Lvf3/c;

    const-string v5, "PersistentCache"

    invoke-direct {v3, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v4, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lmm0/a;

    const-class v2, Lvm0/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v4, v0, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lvm0/b;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lmm0/c;-><init>(Lmm0/a;Lmm0/a;Lvm0/b;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final Y(Lxf3/c;Luf3/a;)Lfy1/a;
    .locals 3

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvm0/i;

    new-instance v0, Lvf3/c;

    const-string v1, "CompositeCache"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lmm0/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmm0/a;

    invoke-direct {p1, p0}, Lvm0/i;-><init>(Lmm0/a;)V

    return-object p1
.end method

.method private static final Z(Lxf3/c;Luf3/a;)Lxm0/b;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lxm0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    new-instance v3, Lvf3/c;

    const-string v4, "CompositeCache"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lmm0/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmm0/a;

    new-instance v4, Lvf3/c;

    const-string v5, "RealCacheReporter"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v5, Lvm0/g;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lvm0/g;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lxm0/b;-><init>(Lsr2/y;Lmm0/a;Lvm0/g;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Ltm0/b;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->G(Lxf3/c;Luf3/a;)Ltm0/b;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lxf3/c;Luf3/a;)Lym0/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lym0/a;

    new-instance v0, Lvf3/c;

    const-string v1, "CompositeCache"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lmm0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmm0/a;

    new-instance v2, Lvf3/c;

    const-string v4, "RealCacheReporter"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lvm0/g;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvm0/g;

    invoke-direct {p1, v0, p0}, Lym0/a;-><init>(Lmm0/a;Lvm0/g;)V

    return-object p1
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lom0/c;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->T(Lxf3/c;Luf3/a;)Lom0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->I(Lxf3/c;Luf3/a;)Lu82/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lu82/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lrm0/c;->N(Lu82/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lnm0/d;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->D(Lxf3/c;Luf3/a;)Lnm0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lwm0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->P(Lxf3/c;Luf3/a;)Lwm0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lfy1/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->Y(Lxf3/c;Luf3/a;)Lfy1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lum0/g;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->S(Lxf3/c;Luf3/a;)Lum0/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/Map;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lrm0/c;->M(Ljava/util/Map;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lcom/whoop/cache/persistence/BffCacheDatabase;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->B(Lxf3/c;Luf3/a;)Lcom/whoop/cache/persistence/BffCacheDatabase;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lqm0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->F(Lxf3/c;Luf3/a;)Lqm0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lum0/e;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->U(Lxf3/c;Luf3/a;)Lum0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Ltm0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->H(Lxf3/c;Luf3/a;)Ltm0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lmm0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->V(Lxf3/c;Luf3/a;)Lmm0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lmm0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->W(Lxf3/c;Luf3/a;)Lmm0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lym0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->a0(Lxf3/c;Luf3/a;)Lym0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Lnm0/b;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->K(Lxf3/c;Luf3/a;)Lnm0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lum0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->C(Lxf3/c;Luf3/a;)Lum0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lxm0/b;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->Z(Lxf3/c;Luf3/a;)Lxm0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lnm0/e;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->L(Lxf3/c;Luf3/a;)Lnm0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lmm0/a;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->X(Lxf3/c;Luf3/a;)Lmm0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lu82/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lrm0/c;->O(Lu82/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lu82/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lrm0/c;->E(Lu82/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lvm0/b;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->Q(Lxf3/c;Luf3/a;)Lvm0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Lvm0/g;
    .locals 0

    invoke-static {p0, p1}, Lrm0/c;->R(Lxf3/c;Luf3/a;)Lvm0/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Ljava/util/Map;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lrm0/c;->J(Ljava/util/Map;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lrm0/c;->A(Ltf3/a;)Ll83/a0;

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

    iget-object v0, p0, Lrm0/c;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
