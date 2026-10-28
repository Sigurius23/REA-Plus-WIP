.class public abstract Lhj0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0004X\u0085\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0016\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Lhj0/n;",
        "",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "Lin2/d;",
        "dispatcherFactory",
        "<init>",
        "(Ltr2/n;Lrr2/c;Lin2/d;)V",
        "",
        "thr",
        "",
        "message",
        "logRetrofitSuspendException",
        "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "Lrr2/c;",
        "getCrashReporter",
        "()Lrr2/c;",
        "Lin2/d;",
        "getDispatcherFactory",
        "()Lin2/d;",
        "getDispatcherFactory$annotations",
        "()V",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final crashReporter:Lrr2/c;

.field private final dispatcherFactory:Lin2/d;

.field private final logger:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;Lrr2/c;Lin2/d;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhj0/n;->logger:Ltr2/n;

    iput-object p2, p0, Lhj0/n;->crashReporter:Lrr2/c;

    iput-object p3, p0, Lhj0/n;->dispatcherFactory:Lin2/d;

    return-void
.end method

.method public static synthetic getDispatcherFactory$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getCrashReporter()Lrr2/c;
    .locals 1

    iget-object v0, p0, Lhj0/n;->crashReporter:Lrr2/c;

    return-object v0
.end method

.method public final getDispatcherFactory()Lin2/d;
    .locals 1

    iget-object v0, p0, Lhj0/n;->dispatcherFactory:Lin2/d;

    return-object v0
.end method

.method public final getLogger()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lhj0/n;->logger:Ltr2/n;

    return-object v0
.end method

.method public final logRetrofitSuspendException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "thr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhj0/n;->logger:Ltr2/n;

    iget-object v1, p0, Lhj0/n;->crashReporter:Lrr2/c;

    invoke-static {p1, p2, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
