.class public final Lcom/mapbox/common/logger/MapboxLogger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqu/a;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0016\u0010\u0018J\u001d\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u001aJ+\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0008\u001a\u00020\u00152\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ+\u0010\u001c\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0008\u001a\u00020\u00152\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001d\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ+\u0010\u001d\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0008\u001a\u00020\u00152\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ+\u0010\u001e\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0008\u001a\u00020\u00152\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u001d\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u0008\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ+\u0010\u001f\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0008\u001a\u00020\u00152\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R(\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0004\u0008\"\u0010#\u0012\u0004\u0008(\u0010\u0003\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lcom/mapbox/common/logger/MapboxLogger;",
        "Lqu/a;",
        "<init>",
        "()V",
        "",
        "requiredLogLevel",
        "",
        "tag",
        "msg",
        "",
        "tr",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "logBlock",
        "log",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V",
        "Lcom/mapbox/common/logger/LoggerObserver;",
        "observer",
        "setObserver",
        "(Lcom/mapbox/common/logger/LoggerObserver;)V",
        "removeObserver",
        "Lru/a;",
        "v",
        "(Lru/a;)V",
        "(Lru/a;Ljava/lang/Throwable;)V",
        "Lru/b;",
        "(Lru/b;Lru/a;)V",
        "(Lru/b;Lru/a;Ljava/lang/Throwable;)V",
        "d",
        "i",
        "w",
        "e",
        "DEFAULT_TAG",
        "Ljava/lang/String;",
        "logLevel",
        "I",
        "getLogLevel",
        "()I",
        "setLogLevel",
        "(I)V",
        "getLogLevel$annotations",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "liblogger_release"
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
.field private static final DEFAULT_TAG:Ljava/lang/String; = "MapboxLogger"

.field public static final INSTANCE:Lcom/mapbox/common/logger/MapboxLogger;

.field private static volatile logLevel:I

.field private static final observer:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/mapbox/common/logger/LoggerObserver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/logger/MapboxLogger;

    invoke-direct {v0}, Lcom/mapbox/common/logger/MapboxLogger;-><init>()V

    sput-object v0, Lcom/mapbox/common/logger/MapboxLogger;->INSTANCE:Lcom/mapbox/common/logger/MapboxLogger;

    const/4 v0, 0x2

    sput v0, Lcom/mapbox/common/logger/MapboxLogger;->logLevel:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lcom/mapbox/common/logger/MapboxLogger;->observer:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getLogLevel$annotations()V
    .locals 0

    return-void
.end method

.method private final log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    sget v0, Lcom/mapbox/common/logger/MapboxLogger;->logLevel:I

    if-gt v0, p1, :cond_0

    invoke-interface {p5}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p5, Lcom/mapbox/common/logger/MapboxLogger;->observer:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/mapbox/common/logger/LoggerObserver;

    if-eqz p5, :cond_0

    new-instance v0, Lcom/mapbox/common/logger/LogEntry;

    invoke-direct {v0, p2, p3, p4}, Lcom/mapbox/common/logger/LogEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p5, p1, v0}, Lcom/mapbox/common/logger/LoggerObserver;->log(ILcom/mapbox/common/logger/LogEntry;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lru/a;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, v0}, Lcom/mapbox/common/logger/MapboxLogger;->d(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Lru/a;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, p2}, Lcom/mapbox/common/logger/MapboxLogger;->d(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Lru/b;Lru/a;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/mapbox/common/logger/MapboxLogger;->d(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public d(Lru/b;Lru/a;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p1, Lru/b;->a:Ljava/lang/String;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :goto_1
    iget-object v4, p2, Lru/a;->a:Ljava/lang/String;

    .line 3
    new-instance v6, Lcom/mapbox/common/logger/MapboxLogger$d$1;

    invoke-direct {v6, p1, p2, p3}, Lcom/mapbox/common/logger/MapboxLogger$d$1;-><init>(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    const/4 v2, 0x3

    move-object v1, p0

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/common/logger/MapboxLogger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final e(Lru/a;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, v0}, Lcom/mapbox/common/logger/MapboxLogger;->e(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Lru/a;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, p2}, Lcom/mapbox/common/logger/MapboxLogger;->e(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Lru/b;Lru/a;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/mapbox/common/logger/MapboxLogger;->e(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public e(Lru/b;Lru/a;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p1, Lru/b;->a:Ljava/lang/String;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :goto_1
    iget-object v4, p2, Lru/a;->a:Ljava/lang/String;

    .line 3
    new-instance v6, Lcom/mapbox/common/logger/MapboxLogger$e$1;

    invoke-direct {v6, p1, p2, p3}, Lcom/mapbox/common/logger/MapboxLogger$e$1;-><init>(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    const/4 v2, 0x6

    move-object v1, p0

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/common/logger/MapboxLogger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final getLogLevel()I
    .locals 1

    sget v0, Lcom/mapbox/common/logger/MapboxLogger;->logLevel:I

    return v0
.end method

.method public final i(Lru/a;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, v0}, Lcom/mapbox/common/logger/MapboxLogger;->i(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final i(Lru/a;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, p2}, Lcom/mapbox/common/logger/MapboxLogger;->i(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final i(Lru/b;Lru/a;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/mapbox/common/logger/MapboxLogger;->i(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public i(Lru/b;Lru/a;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p1, Lru/b;->a:Ljava/lang/String;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :goto_1
    iget-object v4, p2, Lru/a;->a:Ljava/lang/String;

    .line 3
    new-instance v6, Lcom/mapbox/common/logger/MapboxLogger$i$1;

    invoke-direct {v6, p1, p2, p3}, Lcom/mapbox/common/logger/MapboxLogger$i$1;-><init>(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    const/4 v2, 0x4

    move-object v1, p0

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/common/logger/MapboxLogger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final removeObserver()V
    .locals 2

    sget-object v0, Lcom/mapbox/common/logger/MapboxLogger;->observer:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final setLogLevel(I)V
    .locals 0

    sput p1, Lcom/mapbox/common/logger/MapboxLogger;->logLevel:I

    return-void
.end method

.method public final setObserver(Lcom/mapbox/common/logger/LoggerObserver;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/logger/MapboxLogger;->observer:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final v(Lru/a;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, v0}, Lcom/mapbox/common/logger/MapboxLogger;->v(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final v(Lru/a;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, p2}, Lcom/mapbox/common/logger/MapboxLogger;->v(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final v(Lru/b;Lru/a;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/mapbox/common/logger/MapboxLogger;->v(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public v(Lru/b;Lru/a;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p1, Lru/b;->a:Ljava/lang/String;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :goto_1
    iget-object v4, p2, Lru/a;->a:Ljava/lang/String;

    .line 3
    new-instance v6, Lcom/mapbox/common/logger/MapboxLogger$v$1;

    invoke-direct {v6, p1, p2, p3}, Lcom/mapbox/common/logger/MapboxLogger$v$1;-><init>(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    const/4 v2, 0x2

    move-object v1, p0

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/common/logger/MapboxLogger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final w(Lru/a;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, v0}, Lcom/mapbox/common/logger/MapboxLogger;->w(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final w(Lru/a;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, p2}, Lcom/mapbox/common/logger/MapboxLogger;->w(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final w(Lru/b;Lru/a;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/mapbox/common/logger/MapboxLogger;->w(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public w(Lru/b;Lru/a;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p1, Lru/b;->a:Ljava/lang/String;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :goto_1
    iget-object v4, p2, Lru/a;->a:Ljava/lang/String;

    .line 3
    new-instance v6, Lcom/mapbox/common/logger/MapboxLogger$w$1;

    invoke-direct {v6, p1, p2, p3}, Lcom/mapbox/common/logger/MapboxLogger$w$1;-><init>(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    const/4 v2, 0x5

    move-object v1, p0

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/common/logger/MapboxLogger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method
