.class public abstract Lcom/google/android/gms/common/api/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/l;


# instance fields
.field protected final zaa:Lto/f;

.field private final zab:Landroid/content/Context;

.field private final zac:Ljava/lang/String;

.field private final zad:Lbp/a;

.field private final zae:Lcom/google/android/gms/common/api/f;

.field private final zaf:Lcom/google/android/gms/common/api/c;

.field private final zag:Lto/a;

.field private final zah:Landroid/os/Looper;

.field private final zai:I

.field private final zaj:Lcom/google/android/gms/common/api/k;

.field private final zak:Lto/o;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Ljc/b;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    .line 2
    const-string v1, "Looper must not be null."

    invoke-static {v0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v7, Lcom/google/android/gms/common/api/g;

    invoke-direct {v7, p3, v0}, Lcom/google/android/gms/common/api/g;-><init>(Ljc/b;Landroid/os/Looper;)V

    .line 4
    sget-object v6, Lcom/google/android/gms/common/api/c;->g:Lcom/google/android/gms/common/api/b;

    move-object v4, p1

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V
    .locals 4

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Api must not be null."

    .line 6
    invoke-static {p3, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 7
    invoke-static {p5, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "The provided context did not have an application context."

    .line 9
    invoke-static {v0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/h;->zab:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 10
    invoke-static {p1}, Ls4/c;->getAttributionTag(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->getApiFallbackAttributionTag(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 12
    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/common/api/h;->zac:Ljava/lang/String;

    const/16 v3, 0x1f

    if-lt v1, v3, :cond_1

    .line 13
    new-instance v1, Lbp/a;

    invoke-virtual {p1}, Landroid/content/Context;->getAttributionSource()Landroid/content/AttributionSource;

    move-result-object p1

    invoke-direct {v1, p1}, Lbp/a;-><init>(Landroid/content/AttributionSource;)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/common/api/h;->zad:Lbp/a;

    iput-object p3, p0, Lcom/google/android/gms/common/api/h;->zae:Lcom/google/android/gms/common/api/f;

    iput-object p4, p0, Lcom/google/android/gms/common/api/h;->zaf:Lcom/google/android/gms/common/api/c;

    .line 14
    iget-object p1, p5, Lcom/google/android/gms/common/api/g;->b:Landroid/os/Looper;

    iput-object p1, p0, Lcom/google/android/gms/common/api/h;->zah:Landroid/os/Looper;

    .line 15
    new-instance p1, Lto/a;

    invoke-direct {p1, p3, p4, v2}, Lto/a;-><init>(Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lcom/google/android/gms/common/api/h;->zag:Lto/a;

    .line 17
    new-instance p3, Lto/x;

    invoke-direct {p3, p0}, Lto/x;-><init>(Lcom/google/android/gms/common/api/h;)V

    iput-object p3, p0, Lcom/google/android/gms/common/api/h;->zaj:Lcom/google/android/gms/common/api/k;

    .line 18
    invoke-static {v0}, Lto/f;->e(Landroid/content/Context;)Lto/f;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/common/api/h;->zaa:Lto/f;

    .line 19
    iget-object p4, p3, Lto/f;->H:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p4

    .line 21
    iput p4, p0, Lcom/google/android/gms/common/api/h;->zai:I

    .line 22
    iget-object p4, p5, Lcom/google/android/gms/common/api/g;->a:Ljc/b;

    iput-object p4, p0, Lcom/google/android/gms/common/api/h;->zak:Lto/o;

    if-eqz p2, :cond_2

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_2

    .line 23
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_2

    .line 24
    invoke-static {p2, p3, p1}, Lto/s;->m(Landroid/app/Activity;Lto/f;Lto/a;)V

    .line 25
    :cond_2
    iget-object p1, p3, Lto/f;->N:Ljp/d;

    const/4 p2, 0x7

    .line 26
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method


# virtual methods
.method public final a(ILto/d;)V
    .locals 2

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->b0()V

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zaa:Lto/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lto/k0;

    invoke-direct {v1, p1, p2}, Lto/k0;-><init>(ILto/d;)V

    iget-object p1, v0, Lto/f;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p2, Lto/e0;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    invoke-direct {p2, v1, p1, p0}, Lto/e0;-><init>(Lto/n0;ILcom/google/android/gms/common/api/h;)V

    iget-object p1, v0, Lto/f;->N:Ljp/d;

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public asGoogleApiClient()Lcom/google/android/gms/common/api/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zaj:Lcom/google/android/gms/common/api/k;

    return-object v0
.end method

.method public final b(ILto/q;)Lcq/u;
    .locals 4

    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/common/api/h;->zak:Lto/o;

    iget-object v2, p0, Lcom/google/android/gms/common/api/h;->zaa:Lto/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Lto/q;->c()I

    move-result v3

    invoke-virtual {v2, v0, v3, p0}, Lto/f;->c(Lcq/i;ILcom/google/android/gms/common/api/h;)V

    new-instance v3, Lto/m0;

    invoke-direct {v3, p1, p2, v0, v1}, Lto/m0;-><init>(ILto/q;Lcq/i;Lto/o;)V

    iget-object p1, v2, Lto/f;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p2, Lto/e0;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    invoke-direct {p2, v3, p1, p0}, Lto/e0;-><init>(Lto/n0;ILcom/google/android/gms/common/api/h;)V

    iget-object p1, v2, Lto/f;->N:Ljp/d;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iget-object p1, v0, Lcq/i;->a:Lcq/u;

    return-object p1
.end method

.method public createClientSettingsBuilder()Luo/e;
    .locals 4

    new-instance v0, Luo/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iget-object v2, v0, Luo/e;->a:La0/h;

    if-nez v2, :cond_0

    new-instance v2, La0/h;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, La0/h;-><init>(I)V

    iput-object v2, v0, Luo/e;->a:La0/h;

    :cond_0
    iget-object v2, v0, Luo/e;->a:La0/h;

    invoke-virtual {v2, v1}, La0/h;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcom/google/android/gms/common/api/h;->zab:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Luo/e;->c:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Luo/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public disconnectService()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zaa:Lto/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lto/t;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->getApiKey()Lto/a;

    move-result-object v2

    invoke-direct {v1, v2}, Lto/t;-><init>(Lto/a;)V

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v1}, Lto/t;->b()Lcq/i;

    move-result-object v0

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    return-object v0
.end method

.method public doBestEffortWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lto/q;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/h;->b(ILto/q;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public doBestEffortWrite(Lto/d;)Lto/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lto/d;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/h;->a(ILto/d;)V

    return-object p1
.end method

.method public doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lto/q;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/h;->b(ILto/q;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public doRead(Lto/d;)Lto/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lto/d;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/h;->a(ILto/d;)V

    return-object p1
.end method

.method public doRegisterEventListener(Lto/l;Lto/r;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lto/l;",
            "U:",
            "Lto/r;",
            ">(TT;TU;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    .line 2
    invoke-static {p2}, Luo/w;->f(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p1}, Lto/l;->a()Lto/j;

    move-result-object v0

    .line 4
    const-string v1, "Listener has already been released."

    invoke-static {v0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lto/r;->a()Lto/j;

    move-result-object v0

    .line 6
    invoke-static {v0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lto/l;->a()Lto/j;

    move-result-object v0

    invoke-virtual {p2}, Lto/r;->a()Lto/j;

    move-result-object v1

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Listener registration and unregistration methods must be constructed with the same ListenerHolder."

    .line 8
    invoke-static {v0, v1}, Luo/w;->b(ZLjava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/common/api/n;->x:Lcom/google/android/gms/common/api/n;

    iget-object v1, p0, Lcom/google/android/gms/common/api/h;->zaa:Lto/f;

    .line 9
    invoke-virtual {v1, p0, p1, p2, v0}, Lto/f;->h(Lcom/google/android/gms/common/api/h;Lto/l;Lto/r;Ljava/lang/Runnable;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public doRegisterEventListener(Lto/m;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lto/m;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 10
    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    .line 11
    iget-object v0, p1, Lto/m;->a:Lto/g0;

    .line 12
    invoke-virtual {v0}, Lto/l;->a()Lto/j;

    move-result-object v1

    .line 13
    const-string v2, "Listener has already been released."

    invoke-static {v1, v2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object p1, p1, Lto/m;->b:Lto/h0;

    invoke-virtual {p1}, Lto/r;->a()Lto/j;

    move-result-object v1

    invoke-static {v1, v2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v1, Lcom/google/android/gms/common/api/n;->y:Lcom/google/android/gms/common/api/n;

    iget-object v2, p0, Lcom/google/android/gms/common/api/h;->zaa:Lto/f;

    invoke-virtual {v2, p0, v0, p1, v1}, Lto/f;->h(Lcom/google/android/gms/common/api/h;Lto/l;Lto/r;Ljava/lang/Runnable;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public doUnregisterEventListener(Lto/j;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lto/j;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/h;->doUnregisterEventListener(Lto/j;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doUnregisterEventListener(Lto/j;I)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lto/j;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 2
    const-string v0, "Listener key cannot be null."

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zaa:Lto/f;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance v1, Lcq/i;

    invoke-direct {v1}, Lcq/i;-><init>()V

    .line 5
    invoke-virtual {v0, v1, p2, p0}, Lto/f;->c(Lcq/i;ILcom/google/android/gms/common/api/h;)V

    new-instance p2, Lto/l0;

    .line 6
    invoke-direct {p2, p1, v1}, Lto/l0;-><init>(Lto/j;Lcq/i;)V

    iget-object p1, v0, Lto/f;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v2, Lto/e0;

    .line 7
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    invoke-direct {v2, p2, p1, p0}, Lto/e0;-><init>(Lto/n0;ILcom/google/android/gms/common/api/h;)V

    iget-object p1, v0, Lto/f;->N:Ljp/d;

    const/16 p2, 0xd

    .line 8
    invoke-virtual {p1, p2, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 10
    iget-object p1, v1, Lcq/i;->a:Lcq/u;

    return-object p1
.end method

.method public doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lto/q;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/h;->b(ILto/q;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public doWrite(Lto/d;)Lto/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lto/d;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/h;->a(ILto/d;)V

    return-object p1
.end method

.method public getApiFallbackAttributionTag(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getApiKey()Lto/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lto/a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zag:Lto/a;

    return-object v0
.end method

.method public getApiOptions()Lcom/google/android/gms/common/api/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/c;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zaf:Lcom/google/android/gms/common/api/c;

    return-object v0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zab:Landroid/content/Context;

    return-object v0
.end method

.method public getContextAttributionTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getContextFeatureId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getLooper()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zah:Landroid/os/Looper;

    return-object v0
.end method

.method public registerListener(Ljava/lang/Object;Ljava/lang/String;)Lto/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(T",
            "L;",
            "Ljava/lang/String;",
            ")",
            "Lto/k;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zah:Landroid/os/Looper;

    invoke-static {v0, p1, p2}, Ls2/h;->g(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)Lto/k;

    move-result-object p1

    return-object p1
.end method

.method public final zaa(Landroid/os/Looper;Lto/v;)Lcom/google/android/gms/common/api/d;
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->createClientSettingsBuilder()Luo/e;

    move-result-object v0

    new-instance v1, Lcom/google/crypto/tink/internal/k0;

    iget-object v2, v0, Luo/e;->a:La0/h;

    iget-object v4, v0, Luo/e;->b:Ljava/lang/String;

    iget-object v5, v0, Luo/e;->c:Ljava/lang/String;

    sget-object v6, Lzp/a;->w:Lzp/a;

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/google/crypto/tink/internal/k0;-><init>(Ljava/util/Set;La0/g;Ljava/lang/String;Ljava/lang/String;Lzp/a;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/h;->zae:Lcom/google/android/gms/common/api/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/f;->a:Lcom/google/android/gms/common/api/a;

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/google/android/gms/common/api/h;->zaf:Lcom/google/android/gms/common/api/c;

    iget-object v2, p0, Lcom/google/android/gms/common/api/h;->zab:Landroid/content/Context;

    move-object v7, p2

    move-object v3, p1

    move-object v6, p2

    move-object v4, v1

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/common/api/a;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/common/api/h;->zad:Lbp/a;

    if-eqz p2, :cond_1

    instance-of v0, p1, Luo/c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Luo/c;

    iput-object p2, v0, Luo/c;->s:Lbp/a;

    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->getContextAttributionTag()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    instance-of v0, p1, Luo/c;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Luo/c;

    iput-object p2, v0, Luo/c;->r:Ljava/lang/String;

    :cond_2
    return-object p1
.end method

.method public final zab()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/h;->zai:I

    return v0
.end method

.method public final zac(Landroid/content/Context;Landroid/os/Handler;)Lto/i0;
    .locals 8

    new-instance v0, Lto/i0;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->createClientSettingsBuilder()Luo/e;

    move-result-object v1

    new-instance v2, Lcom/google/crypto/tink/internal/k0;

    iget-object v3, v1, Luo/e;->a:La0/h;

    iget-object v5, v1, Luo/e;->b:Ljava/lang/String;

    iget-object v6, v1, Luo/e;->c:Ljava/lang/String;

    sget-object v7, Lzp/a;->w:Lzp/a;

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/google/crypto/tink/internal/k0;-><init>(Ljava/util/Set;La0/g;Ljava/lang/String;Ljava/lang/String;Lzp/a;)V

    invoke-direct {v0, p1, p2, v2}, Lto/i0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/crypto/tink/internal/k0;)V

    return-object v0
.end method
