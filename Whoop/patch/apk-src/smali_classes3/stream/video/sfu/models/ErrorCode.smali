.class public final enum Lstream/video/sfu/models/ErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/wire/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/ErrorCode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lstream/video/sfu/models/ErrorCode;",
        ">;",
        "Lcom/squareup/wire/y;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u001e\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 \u00a8\u0006!"
    }
    d2 = {
        "Lstream/video/sfu/models/ErrorCode;",
        "",
        "Lcom/squareup/wire/y;",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getValue",
        "()I",
        "Companion",
        "ERROR_CODE_UNSPECIFIED",
        "ERROR_CODE_PUBLISH_TRACK_NOT_FOUND",
        "ERROR_CODE_PUBLISH_TRACKS_MISMATCH",
        "ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER",
        "ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND",
        "ERROR_CODE_LIVE_ENDED",
        "ERROR_CODE_PARTICIPANT_NOT_FOUND",
        "ERROR_CODE_PARTICIPANT_MIGRATING_OUT",
        "ERROR_CODE_PARTICIPANT_MIGRATION_FAILED",
        "ERROR_CODE_PARTICIPANT_MIGRATING",
        "ERROR_CODE_PARTICIPANT_RECONNECT_FAILED",
        "ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE",
        "ERROR_CODE_PARTICIPANT_SIGNAL_LOST",
        "ERROR_CODE_CALL_NOT_FOUND",
        "ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED",
        "ERROR_CODE_REQUEST_VALIDATION_FAILED",
        "ERROR_CODE_UNAUTHENTICATED",
        "ERROR_CODE_PERMISSION_DENIED",
        "ERROR_CODE_TOO_MANY_REQUESTS",
        "ERROR_CODE_INTERNAL_SERVER_ERROR",
        "ERROR_CODE_SFU_SHUTTING_DOWN",
        "ERROR_CODE_SFU_FULL",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lstream/video/sfu/models/ErrorCode;

.field public static final ADAPTER:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field public static final Companion:Lstream/video/sfu/models/ErrorCode$Companion;

.field public static final enum ERROR_CODE_CALL_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_INTERNAL_SERVER_ERROR:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_LIVE_ENDED:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PARTICIPANT_MIGRATING:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PARTICIPANT_MIGRATING_OUT:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PARTICIPANT_MIGRATION_FAILED:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PARTICIPANT_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PARTICIPANT_RECONNECT_FAILED:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PARTICIPANT_SIGNAL_LOST:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PERMISSION_DENIED:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PUBLISH_TRACKS_MISMATCH:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PUBLISH_TRACK_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_REQUEST_VALIDATION_FAILED:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_SFU_FULL:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_SFU_SHUTTING_DOWN:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_TOO_MANY_REQUESTS:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_UNAUTHENTICATED:Lstream/video/sfu/models/ErrorCode;

.field public static final enum ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lstream/video/sfu/models/ErrorCode;
    .locals 23

    sget-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;

    sget-object v2, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    sget-object v3, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACKS_MISMATCH:Lstream/video/sfu/models/ErrorCode;

    sget-object v4, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER:Lstream/video/sfu/models/ErrorCode;

    sget-object v5, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    sget-object v6, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_LIVE_ENDED:Lstream/video/sfu/models/ErrorCode;

    sget-object v7, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    sget-object v8, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATING_OUT:Lstream/video/sfu/models/ErrorCode;

    sget-object v9, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATION_FAILED:Lstream/video/sfu/models/ErrorCode;

    sget-object v10, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATING:Lstream/video/sfu/models/ErrorCode;

    sget-object v11, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_RECONNECT_FAILED:Lstream/video/sfu/models/ErrorCode;

    sget-object v12, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE:Lstream/video/sfu/models/ErrorCode;

    sget-object v13, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_SIGNAL_LOST:Lstream/video/sfu/models/ErrorCode;

    sget-object v14, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_CALL_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    sget-object v15, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED:Lstream/video/sfu/models/ErrorCode;

    sget-object v16, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_REQUEST_VALIDATION_FAILED:Lstream/video/sfu/models/ErrorCode;

    sget-object v17, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNAUTHENTICATED:Lstream/video/sfu/models/ErrorCode;

    sget-object v18, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PERMISSION_DENIED:Lstream/video/sfu/models/ErrorCode;

    sget-object v19, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_TOO_MANY_REQUESTS:Lstream/video/sfu/models/ErrorCode;

    sget-object v20, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_INTERNAL_SERVER_ERROR:Lstream/video/sfu/models/ErrorCode;

    sget-object v21, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_SFU_SHUTTING_DOWN:Lstream/video/sfu/models/ErrorCode;

    sget-object v22, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_SFU_FULL:Lstream/video/sfu/models/ErrorCode;

    filled-new-array/range {v1 .. v22}, [Lstream/video/sfu/models/ErrorCode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lstream/video/sfu/models/ErrorCode;

    const-string v1, "ERROR_CODE_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/4 v2, 0x1

    const/16 v3, 0x64

    const-string v4, "ERROR_CODE_PUBLISH_TRACK_NOT_FOUND"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/4 v2, 0x2

    const/16 v3, 0x65

    const-string v4, "ERROR_CODE_PUBLISH_TRACKS_MISMATCH"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACKS_MISMATCH:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/4 v2, 0x3

    const/16 v3, 0x66

    const-string v4, "ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/4 v2, 0x4

    const/16 v3, 0x67

    const-string v4, "ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/4 v2, 0x5

    const/16 v3, 0x68

    const-string v4, "ERROR_CODE_LIVE_ENDED"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_LIVE_ENDED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/4 v2, 0x6

    const/16 v3, 0xc8

    const-string v4, "ERROR_CODE_PARTICIPANT_NOT_FOUND"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/4 v2, 0x7

    const/16 v3, 0xc9

    const-string v4, "ERROR_CODE_PARTICIPANT_MIGRATING_OUT"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATING_OUT:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x8

    const/16 v3, 0xca

    const-string v4, "ERROR_CODE_PARTICIPANT_MIGRATION_FAILED"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATION_FAILED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x9

    const/16 v3, 0xcb

    const-string v4, "ERROR_CODE_PARTICIPANT_MIGRATING"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MIGRATING:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0xa

    const/16 v3, 0xcc

    const-string v4, "ERROR_CODE_PARTICIPANT_RECONNECT_FAILED"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_RECONNECT_FAILED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0xb

    const/16 v3, 0xcd

    const-string v4, "ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0xc

    const/16 v3, 0xce

    const-string v4, "ERROR_CODE_PARTICIPANT_SIGNAL_LOST"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PARTICIPANT_SIGNAL_LOST:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0xd

    const/16 v3, 0x12c

    const-string v4, "ERROR_CODE_CALL_NOT_FOUND"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_CALL_NOT_FOUND:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0xe

    const/16 v3, 0x12d

    const-string v4, "ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0xf

    const/16 v3, 0x190

    const-string v4, "ERROR_CODE_REQUEST_VALIDATION_FAILED"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_REQUEST_VALIDATION_FAILED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x10

    const/16 v3, 0x191

    const-string v4, "ERROR_CODE_UNAUTHENTICATED"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNAUTHENTICATED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x11

    const/16 v3, 0x193

    const-string v4, "ERROR_CODE_PERMISSION_DENIED"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_PERMISSION_DENIED:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x12

    const/16 v3, 0x1ad

    const-string v4, "ERROR_CODE_TOO_MANY_REQUESTS"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_TOO_MANY_REQUESTS:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x13

    const/16 v3, 0x1f4

    const-string v4, "ERROR_CODE_INTERNAL_SERVER_ERROR"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_INTERNAL_SERVER_ERROR:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x14

    const/16 v3, 0x258

    const-string v4, "ERROR_CODE_SFU_SHUTTING_DOWN"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_SFU_SHUTTING_DOWN:Lstream/video/sfu/models/ErrorCode;

    new-instance v1, Lstream/video/sfu/models/ErrorCode;

    const/16 v2, 0x15

    const/16 v3, 0x2bc

    const-string v4, "ERROR_CODE_SFU_FULL"

    invoke-direct {v1, v4, v2, v3}, Lstream/video/sfu/models/ErrorCode;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_SFU_FULL:Lstream/video/sfu/models/ErrorCode;

    invoke-static {}, Lstream/video/sfu/models/ErrorCode;->$values()[Lstream/video/sfu/models/ErrorCode;

    move-result-object v1

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->$VALUES:[Lstream/video/sfu/models/ErrorCode;

    invoke-static {v1}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v1

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->$ENTRIES:Lt83/a;

    new-instance v1, Lstream/video/sfu/models/ErrorCode$Companion;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lstream/video/sfu/models/ErrorCode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lstream/video/sfu/models/ErrorCode;->Companion:Lstream/video/sfu/models/ErrorCode$Companion;

    const-class v1, Lstream/video/sfu/models/ErrorCode;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lstream/video/sfu/models/ErrorCode$Companion$ADAPTER$1;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v2, v1, v3, v0}, Lstream/video/sfu/models/ErrorCode$Companion$ADAPTER$1;-><init>(Lj93/d;Lcom/squareup/wire/x;Lstream/video/sfu/models/ErrorCode;)V

    sput-object v2, Lstream/video/sfu/models/ErrorCode;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lstream/video/sfu/models/ErrorCode;->value:I

    return-void
.end method

.method public static final fromValue(I)Lstream/video/sfu/models/ErrorCode;
    .locals 1

    sget-object v0, Lstream/video/sfu/models/ErrorCode;->Companion:Lstream/video/sfu/models/ErrorCode$Companion;

    invoke-virtual {v0, p0}, Lstream/video/sfu/models/ErrorCode$Companion;->fromValue(I)Lstream/video/sfu/models/ErrorCode;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lstream/video/sfu/models/ErrorCode;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lstream/video/sfu/models/ErrorCode;
    .locals 1

    const-class v0, Lstream/video/sfu/models/ErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lstream/video/sfu/models/ErrorCode;

    return-object p0
.end method

.method public static values()[Lstream/video/sfu/models/ErrorCode;
    .locals 1

    sget-object v0, Lstream/video/sfu/models/ErrorCode;->$VALUES:[Lstream/video/sfu/models/ErrorCode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lstream/video/sfu/models/ErrorCode;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/ErrorCode;->value:I

    return v0
.end method
