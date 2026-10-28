.class public final Lcom/mapbox/common/MapboxSupport$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/MapboxSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001c\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0087 \u00a2\u0006\u0004\u0008\u000c\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000e\u001a\u00020\nH\u0087 \u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/mapbox/common/MapboxSupport$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "peer",
        "Ll83/a0;",
        "cleanNativePeer",
        "(J)V",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "Lcom/mapbox/bindgen/DataRef;",
        "getSupportPackageData",
        "()Lcom/mapbox/bindgen/Expected;",
        "fileName",
        "Lcom/mapbox/bindgen/None;",
        "saveSupportPackageToFile",
        "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
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
    invoke-direct {p0}, Lcom/mapbox/common/MapboxSupport$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$cleanNativePeer(Lcom/mapbox/common/MapboxSupport$Companion;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/MapboxSupport$Companion;->cleanNativePeer(J)V

    return-void
.end method

.method private final cleanNativePeer(J)V
    .locals 0

    invoke-static {p1, p2}, Lcom/mapbox/common/MapboxSupport;->access$cleanNativePeer(J)V

    return-void
.end method


# virtual methods
.method public final getSupportPackageData()Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/DataRef;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/mapbox/common/MapboxSupport;->getSupportPackageData()Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    return-object v0
.end method

.method public final saveSupportPackageToFile(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/mapbox/common/MapboxSupport;->saveSupportPackageToFile(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method
