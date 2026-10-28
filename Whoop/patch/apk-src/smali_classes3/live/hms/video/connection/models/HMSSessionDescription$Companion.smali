.class public final Llive/hms/video/connection/models/HMSSessionDescription$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/models/HMSSessionDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/models/HMSSessionDescription$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Llive/hms/video/connection/models/HMSSessionDescription$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "from",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "src",
        "Lhms/webrtc/SessionDescription;",
        "nodeID",
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
    invoke-direct {p0}, Llive/hms/video/connection/models/HMSSessionDescription$Companion;-><init>()V

    return-void
.end method

.method public static synthetic from$default(Llive/hms/video/connection/models/HMSSessionDescription$Companion;Lhms/webrtc/SessionDescription;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/connection/models/HMSSessionDescription;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/models/HMSSessionDescription$Companion;->from(Lhms/webrtc/SessionDescription;Ljava/lang/String;)Llive/hms/video/connection/models/HMSSessionDescription;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final from(Lhms/webrtc/SessionDescription;Ljava/lang/String;)Llive/hms/video/connection/models/HMSSessionDescription;
    .locals 3

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lhms/webrtc/SessionDescription;->type:Lhms/webrtc/SessionDescription$Type;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v1, Llive/hms/video/connection/models/HMSSessionDescription$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const-string v0, "HMSSessionDescription"

    const-string v1, " Received unexpected SDP of type ROLLBACK"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    sget-object v0, Llive/hms/video/connection/models/HMSSessionDescription$Type;->ANSWER:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    goto :goto_0

    :cond_1
    sget-object v0, Llive/hms/video/connection/models/HMSSessionDescription$Type;->PRANSWER:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    goto :goto_0

    :cond_2
    sget-object v0, Llive/hms/video/connection/models/HMSSessionDescription$Type;->OFFER:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    :goto_0
    new-instance v1, Llive/hms/video/connection/models/HMSSessionDescription;

    const-string v2, "null cannot be cast to non-null type live.hms.video.connection.models.HMSSessionDescription.Type"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Llive/hms/video/connection/models/HMSSessionDescription$Type;

    iget-object p1, p1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v2, "description"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, p1, p2}, Llive/hms/video/connection/models/HMSSessionDescription;-><init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
