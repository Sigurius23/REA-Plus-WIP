.class public final Lav0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lav0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\nR\u0014\u0010\u000c\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Lav0/a$a;",
        "",
        "<init>",
        "()V",
        "",
        "minutes",
        "",
        "a",
        "(D)Ljava/lang/String;",
        "SENTRY_TAG_STRAP_STATUS",
        "Ljava/lang/String;",
        "SENTRY_TAG_STRAP_GENERATION",
        "SENTRY_TAG_LAST_BACKLOG_MINUTES",
        "SENTRY_TAG_LAST_BACKLOG_MINUTES_BUCKET",
        "SENTRY_TAG_RAW_DATA_IN_BACKLOG",
        "SENTRY_TAG_FIRMWARE_VERSION",
        "SENTRY_BREADCRUMB_STRAP_STATUS",
        "SENTRY_BREADCRUMB_KEY_STATUS",
        "connectivity-analytics_release"
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
    invoke-direct {p0}, Lav0/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(D)Ljava/lang/String;
    .locals 2

    const-wide/high16 v0, 0x402e000000000000L    # 15.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    const-string p1, "current"

    return-object p1

    :cond_0
    const-wide/high16 v0, 0x407e000000000000L    # 480.0

    cmpg-double p1, p1, v0

    if-gez p1, :cond_1

    const-string p1, "behind"

    return-object p1

    :cond_1
    const-string p1, "stale"

    return-object p1
.end method
