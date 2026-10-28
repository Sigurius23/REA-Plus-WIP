.class final Lyu0/e$a;
.super Lyu0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyu0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\u00ca\u0001\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "com/whoop/connectivityanalytics/Gen5ConnectivityPacketProfile.REALTIME_ECG",
        "Lyu0/e;",
        "",
        "Ljt0/b;",
        "gen5PacketTypes",
        "()[Ljt0/b;",
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
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lyu0/e;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public gen5PacketTypes()[Ljt0/b;
    .locals 1

    sget-object v0, Ljt0/b;->REALTIME_FILTERED_ECG:Ljt0/b;

    filled-new-array {v0}, [Ljt0/b;

    move-result-object v0

    return-object v0
.end method
