.class public abstract Lcom/mapbox/common/BaseMapboxInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyb/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/BaseMapboxInitializer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lyb/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000 \u0012*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00030\u000c0\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00030\u000c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/mapbox/common/BaseMapboxInitializer;",
        "",
        "T",
        "Lyb/b;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "create",
        "(Landroid/content/Context;)Ljava/lang/Boolean;",
        "",
        "Ljava/lang/Class;",
        "dependencies",
        "()Ljava/util/List;",
        "getInitializerClass",
        "()Ljava/lang/Class;",
        "initializerClass",
        "Companion",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/mapbox/common/BaseMapboxInitializer$Companion;

.field private static final LOCK_WAIT_TIME_MS:J = 0x32L

.field private static final TAG:Ljava/lang/String; = "MapboxInitializer"

.field private static appContext:Landroid/content/Context;

.field private static final globalLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private static final initializersMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "+",
            "Lyb/b;",
            ">;",
            "Lcom/mapbox/common/InitializerData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/BaseMapboxInitializer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/BaseMapboxInitializer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->Companion:Lcom/mapbox/common/BaseMapboxInitializer$Companion;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->initializersMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->globalLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAppContext$cp()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->appContext:Landroid/content/Context;

    return-object v0
.end method

.method public static final synthetic access$getGlobalLock$cp()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    sget-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->globalLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static final synthetic access$getInitializersMap$cp()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->initializersMap:Ljava/util/HashMap;

    return-object v0
.end method

.method public static final getInitializersMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "+",
            "Lyb/b;",
            ">;",
            "Lcom/mapbox/common/InitializerData;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->Companion:Lcom/mapbox/common/BaseMapboxInitializer$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/BaseMapboxInitializer$Companion;->getInitializersMap()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static final init(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "+",
            "Lyb/b;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->Companion:Lcom/mapbox/common/BaseMapboxInitializer$Companion;

    invoke-virtual {v0, p0}, Lcom/mapbox/common/BaseMapboxInitializer$Companion;->init(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " create() is called"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MapboxInitializer"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sput-object p1, Lcom/mapbox/common/BaseMapboxInitializer;->appContext:Landroid/content/Context;

    .line 4
    :try_start_0
    sget-object p1, Lcom/mapbox/common/BaseMapboxInitializer;->Companion:Lcom/mapbox/common/BaseMapboxInitializer$Companion;

    invoke-virtual {p0}, Lcom/mapbox/common/BaseMapboxInitializer;->getInitializerClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {p1, v0, v2}, Lcom/mapbox/common/BaseMapboxInitializer$Companion;->access$init(Lcom/mapbox/common/BaseMapboxInitializer$Companion;Ljava/lang/Class;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Exception occurred when initializing "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/BaseMapboxInitializer;->getInitializerClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    sget-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->initializersMap:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/mapbox/common/BaseMapboxInitializer;->getInitializerClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/InitializerData;

    if-eqz v0, :cond_0

    .line 7
    sget-object v1, Lcom/mapbox/common/BaseMapboxInitializer;->Companion:Lcom/mapbox/common/BaseMapboxInitializer$Companion;

    .line 8
    invoke-virtual {p0}, Lcom/mapbox/common/BaseMapboxInitializer;->getInitializerClass()Ljava/lang/Class;

    move-result-object v2

    .line 9
    sget-object v3, Lcom/mapbox/common/InitializerState;->FAILURE:Lcom/mapbox/common/InitializerState;

    .line 10
    invoke-static {v1, v2, v0, v3}, Lcom/mapbox/common/BaseMapboxInitializer$Companion;->access$updateState(Lcom/mapbox/common/BaseMapboxInitializer$Companion;Ljava/lang/Class;Lcom/mapbox/common/InitializerData;Lcom/mapbox/common/InitializerState;)V

    .line 11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 12
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 13
    :cond_1
    throw p1
.end method

.method public bridge synthetic create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/mapbox/common/BaseMapboxInitializer;->create(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final dependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lyb/b;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public abstract getInitializerClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lyb/b;",
            ">;"
        }
    .end annotation
.end method
