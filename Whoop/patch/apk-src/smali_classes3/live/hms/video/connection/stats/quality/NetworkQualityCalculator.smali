.class public final Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;",
        "",
        "<init>",
        "()V",
        "calculateNetworkQuality",
        "",
        "totalPackets",
        "",
        "packetLoss",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final calculateNetworkQuality(JJ)I
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x5

    if-nez v0, :cond_0

    return v1

    :cond_0
    long-to-double p3, p3

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr p3, v2

    long-to-double p1, p1

    div-double/2addr p3, p1

    const-wide p1, 0x3f847ae147ae147bL    # 0.01

    cmpg-double p1, p3, p1

    if-gez p1, :cond_1

    return v1

    :cond_1
    const-wide p1, 0x3fa47ae147ae147bL    # 0.04

    cmpg-double p1, p3, p1

    if-gez p1, :cond_2

    const/4 p1, 0x4

    return p1

    :cond_2
    const-wide p1, 0x3fb999999999999aL    # 0.1

    cmpg-double p1, p3, p1

    if-gez p1, :cond_3

    const/4 p1, 0x3

    return p1

    :cond_3
    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p3, p1

    if-gez p1, :cond_4

    const/4 p1, 0x2

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1
.end method
