.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Laa3/i1;)Ldm/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$2(Lgt/c;)Ldm/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Laa3/i1;)Ldm/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$1(Lgt/c;)Ldm/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Laa3/i1;)Ldm/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Lgt/c;)Ldm/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lgt/c;)Ldm/e;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lgm/q;->b(Landroid/content/Context;)V

    invoke-static {}, Lgm/q;->a()Lgm/q;

    move-result-object p0

    sget-object v0, Lem/a;->f:Lem/a;

    invoke-virtual {p0, v0}, Lgm/q;->c(Lgm/l;)Lgm/p;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$1(Lgt/c;)Ldm/e;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lgm/q;->b(Landroid/content/Context;)V

    invoke-static {}, Lgm/q;->a()Lgm/q;

    move-result-object p0

    sget-object v0, Lem/a;->f:Lem/a;

    invoke-virtual {p0, v0}, Lgm/q;->c(Lgm/l;)Lgm/p;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$2(Lgt/c;)Ldm/e;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lgm/q;->b(Landroid/content/Context;)V

    invoke-static {}, Lgm/q;->a()Lgm/q;

    move-result-object p0

    sget-object v0, Lem/a;->e:Lem/a;

    invoke-virtual {p0, v0}, Lgm/q;->c(Lgm/l;)Lgm/p;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgt/b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    const-class v11, Ldm/e;

    invoke-static {v11}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    array-length v3, v0

    const/4 v7, 0x0

    move v4, v7

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    const-string v6, "Null interface"

    invoke-static {v5, v6}, Lts/o;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const-class v0, Landroid/content/Context;

    invoke-static {v0}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v3

    iget-object v4, v3, Lgt/j;->a:Lgt/p;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v9, Lio/sentry/okhttp/b;

    const/16 v3, 0x9

    invoke-direct {v9, v3}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v3, Lgt/b;

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const-string v4, "fire-transport"

    move v8, v7

    invoke-direct/range {v3 .. v10}, Lgt/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILgt/e;Ljava/util/Set;)V

    new-instance v1, Lgt/p;

    const-class v2, Ljt/a;

    invoke-direct {v1, v2, v11}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-static {v1}, Lgt/b;->a(Lgt/p;)Lgt/a;

    move-result-object v1

    invoke-static {v0}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgt/a;->a(Lgt/j;)V

    new-instance v2, Lio/sentry/okhttp/b;

    const/16 v5, 0xa

    invoke-direct {v2, v5}, Lio/sentry/okhttp/b;-><init>(I)V

    iput-object v2, v1, Lgt/a;->f:Lgt/e;

    invoke-virtual {v1}, Lgt/a;->b()Lgt/b;

    move-result-object v1

    new-instance v2, Lgt/p;

    const-class v5, Ljt/b;

    invoke-direct {v2, v5, v11}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-static {v2}, Lgt/b;->a(Lgt/p;)Lgt/a;

    move-result-object v2

    invoke-static {v0}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgt/a;->a(Lgt/j;)V

    new-instance v0, Lio/sentry/okhttp/b;

    const/16 v5, 0xb

    invoke-direct {v0, v5}, Lio/sentry/okhttp/b;-><init>(I)V

    iput-object v0, v2, Lgt/a;->f:Lgt/e;

    invoke-virtual {v2}, Lgt/a;->b()Lgt/b;

    move-result-object v0

    const-string v2, "18.2.0"

    invoke-static {v4, v2}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v2

    filled-new-array {v3, v1, v0, v2}, [Lgt/b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Components are not allowed to depend on interfaces they themselves provide."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
