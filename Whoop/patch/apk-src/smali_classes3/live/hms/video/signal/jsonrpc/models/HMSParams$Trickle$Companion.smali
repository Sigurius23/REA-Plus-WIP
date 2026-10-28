.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;",
        "src",
        "Llive/hms/video/connection/models/HMSTrickle;",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Llive/hms/video/connection/models/HMSTrickle;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;
    .locals 3

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/connection/models/HMSConnectionRole;->getValue()I

    move-result v1

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getCandidate()Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getSfuNodeId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;-><init>(ILlive/hms/video/connection/models/HMSIceCandidate;Ljava/lang/String;)V

    return-object v0
.end method
