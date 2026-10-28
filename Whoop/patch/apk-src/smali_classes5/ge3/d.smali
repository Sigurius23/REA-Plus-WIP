.class public final Lge3/d;
.super Ljava/util/logging/Handler;
.source "SourceFile"


# static fields
.field public static final a:Lge3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lge3/d;

    invoke-direct {v0}, Ljava/util/logging/Handler;-><init>()V

    sput-object v0, Lge3/d;->a:Lge3/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final publish(Ljava/util/logging/LogRecord;)V
    .locals 4

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lge3/c;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getLoggerName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getLoggerName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/squareup/wire/n;->i(Ljava/util/logging/LogRecord;)I

    move-result v1

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getMessage(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getThrown()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v1, v0, v2, p1}, Lge3/c;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
