.class final Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/location/LocationServiceNative;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LocationServicePeerCleaner"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;",
        "Ljava/lang/Runnable;",
        "",
        "peer",
        "<init>",
        "(J)V",
        "Ll83/a0;",
        "run",
        "()V",
        "J",
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


# instance fields
.field private final peer:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;->peer:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    sget-object v0, Lcom/mapbox/common/location/LocationServiceNative;->Companion:Lcom/mapbox/common/location/LocationServiceNative$Companion;

    iget-wide v1, p0, Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;->peer:J

    invoke-virtual {v0, v1, v2}, Lcom/mapbox/common/location/LocationServiceNative$Companion;->cleanNativePeer(J)V

    return-void
.end method
