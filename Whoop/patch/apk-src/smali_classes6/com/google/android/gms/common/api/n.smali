.class public final synthetic Lcom/google/android/gms/common/api/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic x:Lcom/google/android/gms/common/api/n;

.field public static final synthetic y:Lcom/google/android/gms/common/api/n;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/n;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/api/n;->x:Lcom/google/android/gms/common/api/n;

    new-instance v0, Lcom/google/android/gms/common/api/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/n;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/api/n;->y:Lcom/google/android/gms/common/api/n;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/common/api/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final synthetic a()V
    .locals 0

    return-void
.end method

.method private final synthetic b()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/common/api/n;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    :try_start_0
    sget-object v0, Leh3/k;->E:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->purge()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_1
    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-static {v0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    :cond_1
    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
