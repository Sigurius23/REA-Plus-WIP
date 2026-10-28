.class public final Lmy1/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmy1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\r\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\r\u00a8\u0006\u0016"
    }
    d2 = {
        "Lmy1/a$c;",
        "",
        "<init>",
        "()V",
        "",
        "percent",
        "",
        "a",
        "(D)Ljava/lang/String;",
        "",
        "DEDUPE_WINDOW_MS",
        "J",
        "METRIC_MEMORY_PRESSURE",
        "Ljava/lang/String;",
        "METRIC_MEMORY_HEAP_PERCENT",
        "METRIC_MEMORY_THREAD_COUNT",
        "SENTRY_TAG_LAST_TRIM_LEVEL",
        "SENTRY_TAG_LAST_HEAP_PERCENT",
        "SENTRY_TAG_LAST_HEAP_PERCENT_BUCKET",
        "SENTRY_BREADCRUMB_MEMORY_PRESSURE",
        "SENTRY_BREADCRUMB_KEY_TRIM_LEVEL",
        "SENTRY_BREADCRUMB_KEY_HEAP_PERCENT",
        "metrics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmy1/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(D)Ljava/lang/String;
    .locals 2

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    const-string p1, "low"

    return-object p1

    :cond_0
    const-wide v0, 0x4052c00000000000L    # 75.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_1

    const-string p1, "moderate"

    return-object p1

    :cond_1
    const-wide v0, 0x4056800000000000L    # 90.0

    cmpg-double p1, p1, v0

    if-gez p1, :cond_2

    const-string p1, "high"

    return-object p1

    :cond_2
    const-string p1, "critical"

    return-object p1
.end method
