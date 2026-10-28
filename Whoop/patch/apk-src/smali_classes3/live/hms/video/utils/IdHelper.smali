.class public final Llive/hms/video/utils/IdHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u0008\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "Llive/hms/video/utils/IdHelper;",
        "",
        "<init>",
        "()V",
        "uuidv4",
        "",
        "makeCallSignalId",
        "makeStreamId",
        "makeAudioMediaStreamTrackId",
        "makeVideoMediaStreamTrackId",
        "makePeerId",
        "makeHMSTrackId",
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


# static fields
.field public static final INSTANCE:Llive/hms/video/utils/IdHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/utils/IdHelper;

    invoke-direct {v0}, Llive/hms/video/utils/IdHelper;-><init>()V

    sput-object v0, Llive/hms/video/utils/IdHelper;->INSTANCE:Llive/hms/video/utils/IdHelper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final uuidv4()Ljava/lang/String;
    .locals 1

    const-string v0, "toString(...)"

    invoke-static {v0}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final makeAudioMediaStreamTrackId()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Llive/hms/video/utils/IdHelper;->uuidv4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final makeCallSignalId()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Llive/hms/video/utils/IdHelper;->uuidv4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final makeHMSTrackId()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Llive/hms/video/utils/IdHelper;->uuidv4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final makePeerId()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Llive/hms/video/utils/IdHelper;->uuidv4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final makeStreamId()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Llive/hms/video/utils/IdHelper;->uuidv4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final makeVideoMediaStreamTrackId()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Llive/hms/video/utils/IdHelper;->uuidv4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
