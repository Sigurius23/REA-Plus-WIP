.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Laa3/i1;)Ltt/d;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lgt/c;)Ltt/d;

    move-result-object p0

    return-object p0
.end method

.method private static lambda$getComponents$0(Lgt/c;)Ltt/d;
    .locals 7

    new-instance v0, Ltt/c;

    const-class v1, Ldt/g;

    invoke-interface {p0, v1}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldt/g;

    const-class v2, Lqt/f;

    invoke-interface {p0, v2}, Lgt/c;->e(Ljava/lang/Class;)Lst/a;

    move-result-object v2

    new-instance v3, Lgt/p;

    const-class v4, Lft/a;

    const-class v5, Ljava/util/concurrent/ExecutorService;

    invoke-direct {v3, v4, v5}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-interface {p0, v3}, Lgt/c;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lgt/p;

    const-class v5, Lft/b;

    const-class v6, Ljava/util/concurrent/Executor;

    invoke-direct {v4, v5, v6}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-interface {p0, v4}, Lgt/c;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    new-instance v4, Lht/j;

    invoke-direct {v4, p0}, Lht/j;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct {v0, v1, v2, v3, v4}, Ltt/c;-><init>(Ldt/g;Lst/a;Ljava/util/concurrent/ExecutorService;Lht/j;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgt/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgt/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ltt/d;

    invoke-direct {v0, v3, v2}, Lgt/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    const-string v2, "fire-installations"

    iput-object v2, v0, Lgt/a;->a:Ljava/lang/String;

    const-class v3, Ldt/g;

    invoke-static {v3}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v3

    invoke-virtual {v0, v3}, Lgt/a;->a(Lgt/j;)V

    new-instance v3, Lgt/j;

    const/4 v4, 0x1

    const-class v5, Lqt/f;

    invoke-direct {v3, v1, v4, v5}, Lgt/j;-><init>(IILjava/lang/Class;)V

    invoke-virtual {v0, v3}, Lgt/a;->a(Lgt/j;)V

    new-instance v3, Lgt/p;

    const-class v5, Lft/a;

    const-class v6, Ljava/util/concurrent/ExecutorService;

    invoke-direct {v3, v5, v6}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-instance v5, Lgt/j;

    invoke-direct {v5, v3, v4, v1}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v0, v5}, Lgt/a;->a(Lgt/j;)V

    new-instance v3, Lgt/p;

    const-class v5, Lft/b;

    const-class v6, Ljava/util/concurrent/Executor;

    invoke-direct {v3, v5, v6}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-instance v5, Lgt/j;

    invoke-direct {v5, v3, v4, v1}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v0, v5}, Lgt/a;->a(Lgt/j;)V

    new-instance v1, Lts/b;

    const/4 v3, 0x5

    invoke-direct {v1, v3}, Lts/b;-><init>(I)V

    iput-object v1, v0, Lgt/a;->f:Lgt/e;

    invoke-virtual {v0}, Lgt/a;->b()Lgt/b;

    move-result-object v0

    new-instance v1, Lqt/e;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lqt/e;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    const-class v5, Lqt/e;

    invoke-static {v5}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v11, Lcom/whoop/data/repositories/c;

    const/4 v5, 0x4

    invoke-direct {v11, v1, v5}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lgt/b;

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v5 .. v12}, Lgt/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILgt/e;Ljava/util/Set;)V

    const-string v1, "18.0.0"

    invoke-static {v2, v1}, Ljc/x;->y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;

    move-result-object v1

    filled-new-array {v0, v5, v1}, [Lgt/b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
