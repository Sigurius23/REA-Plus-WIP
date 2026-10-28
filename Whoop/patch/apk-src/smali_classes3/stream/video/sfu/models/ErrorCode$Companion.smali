.class public final Lstream/video/sfu/models/ErrorCode$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/ErrorCode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lstream/video/sfu/models/ErrorCode$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "value",
        "Lstream/video/sfu/models/ErrorCode;",
        "fromValue",
        "(I)Lstream/video/sfu/models/ErrorCode;",
        "Lcom/squareup/wire/q;",
        "ADAPTER",
        "Lcom/squareup/wire/q;",
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
    invoke-direct {p0}, Lstream/video/sfu/models/ErrorCode$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromValue(I)Lstream/video/sfu/models/ErrorCode;
    .locals 1

    if-eqz p1, :cond_9

    const/16 v0, 0x193

    if-eq p1, v0, :cond_8

    const/16 v0, 0x1ad

    if-eq p1, v0, :cond_7

    const/16 v0, 0x1f4

    if-eq p1, v0, :cond_6

    const/16 v0, 0x258

    if-eq p1, v0, :cond_5

    const/16 v0, 0x2bc

    if-eq p1, v0, :cond_4

    const/16 v0, 0x12c

    if-eq p1, v0, :cond_3

    const/16 v0, 0x12d

    if-eq p1, v0, :cond_2

    const/16 v0, 0x190

    if-eq p1, v0, :cond_1

    const/16 v0, 0x191

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_SIGNAL_LOST:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_1
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_2
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_RECONNECT_FAILED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_3
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATING:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_4
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATION_FAILED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_5
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATING_OUT:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_6
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_7
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_LIVE_ENDED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_8
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_9
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_a
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACKS_MISMATCH:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_b
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_0
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNAUTHENTICATED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_1
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_REQUEST_VALIDATION_FAILED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_2
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_3
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_CALL_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_4
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_SFU_FULL:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_5
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_SFU_SHUTTING_DOWN:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_6
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_INTERNAL_SERVER_ERROR:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_7
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_TOO_MANY_REQUESTS:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_8
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PERMISSION_DENIED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :cond_9
    sget-object p1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xc8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
