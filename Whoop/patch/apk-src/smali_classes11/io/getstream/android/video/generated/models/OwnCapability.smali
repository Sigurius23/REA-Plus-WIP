.class public abstract Lio/getstream/android/video/generated/models/OwnCapability;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/OwnCapability$BlockUsers;,
        Lio/getstream/android/video/generated/models/OwnCapability$ChangeMaxDuration;,
        Lio/getstream/android/video/generated/models/OwnCapability$Companion;,
        Lio/getstream/android/video/generated/models/OwnCapability$CreateCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$CreateReaction;,
        Lio/getstream/android/video/generated/models/OwnCapability$EnableNoiseCancellation;,
        Lio/getstream/android/video/generated/models/OwnCapability$EndCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$JoinBackstage;,
        Lio/getstream/android/video/generated/models/OwnCapability$JoinCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$JoinEndedCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$KickUser;,
        Lio/getstream/android/video/generated/models/OwnCapability$MuteUsers;,
        Lio/getstream/android/video/generated/models/OwnCapability$OwnCapabilityAdapter;,
        Lio/getstream/android/video/generated/models/OwnCapability$PinForEveryone;,
        Lio/getstream/android/video/generated/models/OwnCapability$ReadCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$RemoveCallMember;,
        Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;,
        Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;,
        Lio/getstream/android/video/generated/models/OwnCapability$SendClosedCaptionsCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;,
        Lio/getstream/android/video/generated/models/OwnCapability$StartBroadcastCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StartClosedCaptionsCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StartFrameRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StartIndividualRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StartRawRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StartRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StartTranscriptionCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StopBroadcastCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StopClosedCaptionsCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StopFrameRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StopIndividualRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StopRawRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$StopTranscriptionCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$Unknown;,
        Lio/getstream/android/video/generated/models/OwnCapability$UpdateCall;,
        Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallMember;,
        Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallPermissions;,
        Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallSettings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \n2\u00020\u0001:\'\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-.B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001%/0123456789:;<=>?@ABCDEFGHIJKLMNOPQRS\u00a8\u0006T"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/OwnCapability;",
        "",
        "value",
        "",
        "(Ljava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "toString",
        "BlockUsers",
        "ChangeMaxDuration",
        "Companion",
        "CreateCall",
        "CreateReaction",
        "EnableNoiseCancellation",
        "EndCall",
        "JoinBackstage",
        "JoinCall",
        "JoinEndedCall",
        "KickUser",
        "MuteUsers",
        "OwnCapabilityAdapter",
        "PinForEveryone",
        "ReadCall",
        "RemoveCallMember",
        "Screenshare",
        "SendAudio",
        "SendClosedCaptionsCall",
        "SendVideo",
        "StartBroadcastCall",
        "StartClosedCaptionsCall",
        "StartFrameRecordCall",
        "StartIndividualRecordCall",
        "StartRawRecordCall",
        "StartRecordCall",
        "StartTranscriptionCall",
        "StopBroadcastCall",
        "StopClosedCaptionsCall",
        "StopFrameRecordCall",
        "StopIndividualRecordCall",
        "StopRawRecordCall",
        "StopRecordCall",
        "StopTranscriptionCall",
        "Unknown",
        "UpdateCall",
        "UpdateCallMember",
        "UpdateCallPermissions",
        "UpdateCallSettings",
        "Lio/getstream/android/video/generated/models/OwnCapability$BlockUsers;",
        "Lio/getstream/android/video/generated/models/OwnCapability$ChangeMaxDuration;",
        "Lio/getstream/android/video/generated/models/OwnCapability$CreateCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$CreateReaction;",
        "Lio/getstream/android/video/generated/models/OwnCapability$EnableNoiseCancellation;",
        "Lio/getstream/android/video/generated/models/OwnCapability$EndCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$JoinBackstage;",
        "Lio/getstream/android/video/generated/models/OwnCapability$JoinCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$JoinEndedCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$KickUser;",
        "Lio/getstream/android/video/generated/models/OwnCapability$MuteUsers;",
        "Lio/getstream/android/video/generated/models/OwnCapability$PinForEveryone;",
        "Lio/getstream/android/video/generated/models/OwnCapability$ReadCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$RemoveCallMember;",
        "Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;",
        "Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;",
        "Lio/getstream/android/video/generated/models/OwnCapability$SendClosedCaptionsCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StartBroadcastCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StartClosedCaptionsCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StartFrameRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StartIndividualRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StartRawRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StartRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StartTranscriptionCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StopBroadcastCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StopClosedCaptionsCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StopFrameRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StopIndividualRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StopRawRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$StopTranscriptionCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$Unknown;",
        "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallMember;",
        "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallPermissions;",
        "Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallSettings;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/android/video/generated/models/OwnCapability$Companion;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/android/video/generated/models/OwnCapability$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/android/video/generated/models/OwnCapability$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/android/video/generated/models/OwnCapability;->Companion:Lio/getstream/android/video/generated/models/OwnCapability$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/OwnCapability;->value:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/getstream/android/video/generated/models/OwnCapability;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/OwnCapability;->value:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/OwnCapability;->value:Ljava/lang/String;

    return-object v0
.end method
