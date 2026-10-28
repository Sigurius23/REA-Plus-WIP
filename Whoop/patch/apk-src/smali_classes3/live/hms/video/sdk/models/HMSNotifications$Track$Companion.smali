.class public final Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications$Track;
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
        "Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Llive/hms/video/sdk/models/HMSNotifications$Track;",
        "track",
        "Llive/hms/video/media/tracks/HMSTrack;",
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
    invoke-direct {p0}, Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Llive/hms/video/media/tracks/HMSTrack;)Llive/hms/video/sdk/models/HMSNotifications$Track;
    .locals 8

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/HMSNotifications$Track;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v2

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "ROOT"

    const-string v5, "toLowerCase(...)"

    invoke-static {v3, v4, v0, v3, v5}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getSource()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSMediaStream;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/media/streams/HMSMediaStream;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Llive/hms/video/sdk/models/HMSNotifications$Track;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
