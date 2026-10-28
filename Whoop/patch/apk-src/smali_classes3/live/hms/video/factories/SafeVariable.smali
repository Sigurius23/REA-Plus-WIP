.class public final Llive/hms/video/factories/SafeVariable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u0004R\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/factories/SafeVariable;",
        "T",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function0;",
        "block",
        "Ll83/a0;",
        "initialize",
        "(Lc93/a;)V",
        "get",
        "(Lq83/d;)Ljava/lang/Object;",
        "reset",
        "Lbc3/s;",
        "deferred",
        "Lbc3/s;",
        "Landroid/os/HandlerThread;",
        "safeHandlerThread$delegate",
        "Ll83/h;",
        "getSafeHandlerThread",
        "()Landroid/os/HandlerThread;",
        "safeHandlerThread",
        "Landroid/os/Handler;",
        "safeHandler$delegate",
        "getSafeHandler",
        "()Landroid/os/Handler;",
        "safeHandler",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private deferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field private final safeHandler$delegate:Ll83/h;

.field private final safeHandlerThread$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/factories/SafeVariable;->deferred:Lbc3/s;

    new-instance v0, Llh1/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Llh1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/factories/SafeVariable;->safeHandlerThread$delegate:Ll83/h;

    new-instance v0, Llive/hms/video/connection/degredation/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/factories/SafeVariable;->safeHandler$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a()Landroid/os/HandlerThread;
    .locals 1

    invoke-static {}, Llive/hms/video/factories/SafeVariable;->safeHandlerThread_delegate$lambda$1()Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lc93/a;Llive/hms/video/factories/SafeVariable;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/factories/SafeVariable;->initialize$lambda$4(Lc93/a;Llive/hms/video/factories/SafeVariable;)V

    return-void
.end method

.method public static synthetic c(Llive/hms/video/factories/SafeVariable;)Landroid/os/Handler;
    .locals 0

    invoke-static {p0}, Llive/hms/video/factories/SafeVariable;->safeHandler_delegate$lambda$2(Llive/hms/video/factories/SafeVariable;)Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method private final getSafeHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/SafeVariable;->safeHandler$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method private final getSafeHandlerThread()Landroid/os/HandlerThread;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/SafeVariable;->safeHandlerThread$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/HandlerThread;

    return-object v0
.end method

.method private static final initialize$lambda$4(Lc93/a;Llive/hms/video/factories/SafeVariable;)V
    .locals 4

    const-string v0, "$block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p1, Llive/hms/video/factories/SafeVariable;->deferred:Lbc3/s;

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, p0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " Time taken (:SafeVariable>webrtc>initialize): "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long/2addr p0, v0

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "ms thread name "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Profiling"

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final safeHandlerThread_delegate$lambda$1()Landroid/os/HandlerThread;
    .locals 2

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "safe-variable-thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-object v0
.end method

.method private static final safeHandler_delegate$lambda$2(Llive/hms/video/factories/SafeVariable;)Landroid/os/Handler;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {p0}, Llive/hms/video/factories/SafeVariable;->getSafeHandlerThread()Landroid/os/HandlerThread;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method


# virtual methods
.method public final get(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/factories/SafeVariable;->deferred:Lbc3/s;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, p1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final initialize(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/factories/SafeVariable;->getSafeHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lio/sentry/android/core/r0;

    const/16 v2, 0xf

    invoke-direct {v1, v2, p1, p0}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final reset()V
    .locals 1

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/factories/SafeVariable;->deferred:Lbc3/s;

    return-void
.end method
