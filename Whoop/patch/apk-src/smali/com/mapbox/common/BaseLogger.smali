.class public final Lcom/mapbox/common/BaseLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u001f\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\tR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/mapbox/common/BaseLogger;",
        "",
        "<init>",
        "()V",
        "",
        "tag",
        "message",
        "Ll83/a0;",
        "debug",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "info",
        "warning",
        "error",
        "Lqu/a;",
        "loggerInstance$delegate",
        "Ll83/h;",
        "getLoggerInstance",
        "()Lqu/a;",
        "loggerInstance",
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
.field public static final INSTANCE:Lcom/mapbox/common/BaseLogger;

.field private static final loggerInstance$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/BaseLogger;

    invoke-direct {v0}, Lcom/mapbox/common/BaseLogger;-><init>()V

    sput-object v0, Lcom/mapbox/common/BaseLogger;->INSTANCE:Lcom/mapbox/common/BaseLogger;

    sget-object v0, Lcom/mapbox/common/BaseLogger$loggerInstance$2;->INSTANCE:Lcom/mapbox/common/BaseLogger$loggerInstance$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/BaseLogger;->loggerInstance$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final debug(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/BaseLogger;->INSTANCE:Lcom/mapbox/common/BaseLogger;

    invoke-direct {v0}, Lcom/mapbox/common/BaseLogger;->getLoggerInstance()Lqu/a;

    move-result-object v0

    new-instance v1, Lru/b;

    invoke-direct {v1, p0}, Lru/b;-><init>(Ljava/lang/String;)V

    new-instance p0, Lru/a;

    invoke-direct {p0, p1}, Lru/a;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p0, p1}, Lqu/a;->d(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final error(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/BaseLogger;->INSTANCE:Lcom/mapbox/common/BaseLogger;

    invoke-direct {v0}, Lcom/mapbox/common/BaseLogger;->getLoggerInstance()Lqu/a;

    move-result-object v0

    new-instance v1, Lru/b;

    invoke-direct {v1, p0}, Lru/b;-><init>(Ljava/lang/String;)V

    new-instance p0, Lru/a;

    invoke-direct {p0, p1}, Lru/a;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p0, p1}, Lqu/a;->e(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method private final getLoggerInstance()Lqu/a;
    .locals 1

    sget-object v0, Lcom/mapbox/common/BaseLogger;->loggerInstance$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqu/a;

    return-object v0
.end method

.method public static final info(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/BaseLogger;->INSTANCE:Lcom/mapbox/common/BaseLogger;

    invoke-direct {v0}, Lcom/mapbox/common/BaseLogger;->getLoggerInstance()Lqu/a;

    move-result-object v0

    new-instance v1, Lru/b;

    invoke-direct {v1, p0}, Lru/b;-><init>(Ljava/lang/String;)V

    new-instance p0, Lru/a;

    invoke-direct {p0, p1}, Lru/a;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p0, p1}, Lqu/a;->i(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final warning(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/BaseLogger;->INSTANCE:Lcom/mapbox/common/BaseLogger;

    invoke-direct {v0}, Lcom/mapbox/common/BaseLogger;->getLoggerInstance()Lqu/a;

    move-result-object v0

    new-instance v1, Lru/b;

    invoke-direct {v1, p0}, Lru/b;-><init>(Ljava/lang/String;)V

    new-instance p0, Lru/a;

    invoke-direct {p0, p1}, Lru/a;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p0, p1}, Lqu/a;->w(Lru/b;Lru/a;Ljava/lang/Throwable;)V

    return-void
.end method
