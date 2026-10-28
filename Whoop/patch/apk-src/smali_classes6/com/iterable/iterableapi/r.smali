.class public final Lcom/iterable/iterableapi/r;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lcom/iterable/iterableapi/s;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/s;Lcom/iterable/iterableapi/z1;Z)V
    .locals 0

    iput-object p1, p0, Lcom/iterable/iterableapi/r;->x:Lcom/iterable/iterableapi/s;

    iput-boolean p3, p0, Lcom/iterable/iterableapi/r;->w:Z

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/iterable/iterableapi/r;->x:Lcom/iterable/iterableapi/s;

    iget-object v0, v0, Lcom/iterable/iterableapi/s;->w:Lcom/iterable/iterableapi/k;

    iget-object v1, v0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "IterableAuth"

    const-string v1, "Email or userId is not available. Skipping token refresh"

    invoke-static {v0, v1}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v0

    iget-boolean v1, p0, Lcom/iterable/iterableapi/r;->w:Z

    monitor-enter v0

    if-nez v1, :cond_2

    :try_start_0
    iget-object v1, v0, Lcom/iterable/iterableapi/s;->z:Lcom/iterable/iterableapi/m2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_1
    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/iterable/iterableapi/k;->l(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_2
    iget-object v0, p0, Lcom/iterable/iterableapi/r;->x:Lcom/iterable/iterableapi/s;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/iterable/iterableapi/s;->E:Z

    return-void

    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
