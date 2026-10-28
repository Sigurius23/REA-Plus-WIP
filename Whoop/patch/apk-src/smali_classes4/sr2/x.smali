.class public final Lsr2/x;
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
        "Lsr2/x;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "app_prodStandardRelease"
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

.method public static synthetic a(Lxf3/c;Luf3/a;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    invoke-static {p0, p1}, Lsr2/x;->d(Lxf3/c;Luf3/a;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ltf3/a;)Ll83/a0;
    .locals 2

    const-string v0, "$this$module"

    const-string v1, "scopeConnectStrap"

    invoke-static {p0, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v0

    new-instance v1, Lzf3/a;

    invoke-direct {v1, v0, p0}, Lzf3/a;-><init>(Lvf3/c;Ltf3/a;)V

    invoke-static {v1}, Lsr2/x;->c(Lzf3/a;)Ll83/a0;

    iget-object p0, p0, Ltf3/a;->c:Ljava/util/HashSet;

    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c(Lzf3/a;)Ll83/a0;
    .locals 7

    const-string v0, "$this$scope"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lvf3/c;

    const-string v0, "bleStrap"

    invoke-direct {v4, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v5, Lsr2/u;

    const/16 v0, 0x10

    invoke-direct {v5, v0}, Lsr2/u;-><init>(I)V

    iget-object v2, p0, Lzf3/a;->a:Lvf3/c;

    new-instance v1, Lqf3/b;

    const-class v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v6, 0x3

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/c;

    invoke-direct {v2, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v2, Lrf3/c;->b:Ljava/util/HashMap;

    iget-object p0, p0, Lzf3/a;->b:Ltf3/a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lxf3/c;Luf3/a;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    const-string v0, "$this$scoped"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lsr2/x;->b(Ltf3/a;)Ll83/a0;

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
