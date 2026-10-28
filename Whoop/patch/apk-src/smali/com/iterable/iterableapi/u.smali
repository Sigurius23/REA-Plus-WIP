.class public abstract Lcom/iterable/iterableapi/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/iterable/iterableapi/l1;

.field public static volatile b:Ljava/util/concurrent/ExecutorService;

.field public static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/iterable/iterableapi/l1;

    invoke-direct {v0}, Lcom/iterable/iterableapi/l1;-><init>()V

    sput-object v0, Lcom/iterable/iterableapi/u;->a:Lcom/iterable/iterableapi/l1;

    new-instance v0, Lcom/iterable/iterableapi/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/iterable/iterableapi/u;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    return-void
.end method
