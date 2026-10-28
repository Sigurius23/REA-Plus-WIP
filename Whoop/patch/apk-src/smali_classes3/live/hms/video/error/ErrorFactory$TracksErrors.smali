.class public final Llive/hms/video/error/ErrorFactory$TracksErrors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/error/ErrorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TracksErrors"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JY\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011Ja\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r\u00a2\u0006\u0002\u0010\u0014Ja\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r\u00a2\u0006\u0002\u0010\u0014JO\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r\u00a2\u0006\u0002\u0010\u0018JO\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r\u00a2\u0006\u0002\u0010\u0018JO\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r\u00a2\u0006\u0002\u0010\u0018JO\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r\u00a2\u0006\u0002\u0010\u0018JO\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r\u00a2\u0006\u0002\u0010\u0018J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010 \u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010!\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\""
    }
    d2 = {
        "Llive/hms/video/error/ErrorFactory$TracksErrors;",
        "",
        "<init>",
        "()V",
        "GenericTrack",
        "Llive/hms/video/error/HMSException;",
        "action",
        "Llive/hms/video/error/ErrorFactory$Action;",
        "description",
        "",
        "cause",
        "",
        "params",
        "Lkotlin/collections/HashMap;",
        "Ljava/util/HashMap;",
        "isTerminal",
        "",
        "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;Z)Llive/hms/video/error/HMSException;",
        "CantAccessCaptureDevice",
        "deviceInfo",
        "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;",
        "CantFindCameraIdForParticularFace",
        "face",
        "PeerConnectionFactoryDisposed",
        "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;",
        "NothingToReturn",
        "InvalidVideoSettings",
        "CodecChangeNotPermitted",
        "MicCaptureFailed",
        "PreferLayerFailed",
        "preferStateResponseError",
        "Llive/hms/video/media/streams/models/PreferStateResponseError;",
        "PreferLayerFailedUnknownError",
        "PreferLayerTimeoutError",
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
.field public static final INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-direct {v0}, Llive/hms/video/error/ErrorFactory$TracksErrors;-><init>()V

    sput-object v0, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic CantAccessCaptureDevice$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const-string p3, ""

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    new-instance p6, Ljava/util/HashMap;

    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$TracksErrors;->CantAccessCaptureDevice(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic CantFindCameraIdForParticularFace$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const-string p3, ""

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    new-instance p6, Ljava/util/HashMap;

    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$TracksErrors;->CantFindCameraIdForParticularFace(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic CodecChangeNotPermitted$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/error/ErrorFactory$TracksErrors;->CodecChangeNotPermitted(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic GenericTrack$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ZILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-string p2, ""

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/4 p5, 0x1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/error/ErrorFactory$TracksErrors;->GenericTrack(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;Z)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic InvalidVideoSettings$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/error/ErrorFactory$TracksErrors;->InvalidVideoSettings(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic MicCaptureFailed$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/error/ErrorFactory$TracksErrors;->MicCaptureFailed(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic NothingToReturn$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/error/ErrorFactory$TracksErrors;->NothingToReturn(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic PeerConnectionFactoryDisposed$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PeerConnectionFactoryDisposed(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic PreferLayerFailed$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/media/streams/models/PreferStateResponseError;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerFailed(Llive/hms/video/media/streams/models/PreferStateResponseError;Llive/hms/video/error/ErrorFactory$Action;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic PreferLayerFailedUnknownError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerFailedUnknownError(Llive/hms/video/error/ErrorFactory$Action;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic PreferLayerTimeoutError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerTimeoutError(Llive/hms/video/error/ErrorFactory$Action;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final CantAccessCaptureDevice(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string p1, "{device_type}"

    const/4 v0, 0x0

    const-string v2, "[PUBLISH]: No permission to access capture device - {device_type}"

    invoke-static {v2, p1, p2, v0}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    const/16 v2, 0xbb9

    const-string v3, "CantAccessCaptureDevice"

    move-object v6, p3

    move v8, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v9}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V

    return-object v1
.end method

.method public final CantFindCameraIdForParticularFace(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "face"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string p1, "Couldn\'t find "

    const-string v0, " facing camera. Please restart your device"

    invoke-static {p1, p2, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v2, 0xbba

    const-string v3, "CantFindCameraIdForParticularFace"

    move-object v6, p3

    move v8, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v9}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V

    return-object v1
.end method

.method public final CodecChangeNotPermitted(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    move-object/from16 v9, p4

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0x40

    const/4 v11, 0x0

    const/16 v2, 0xbbf

    const-string v3, "CodecChangeNotPermitted"

    const-string v5, "Codec can\'t be changed mid call."

    const/4 v8, 0x0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final GenericTrack(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;Z)Llive/hms/video/error/HMSException;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Llive/hms/video/error/HMSException;

    const-string v3, "GenericTrack"

    const-string v5, "[PUBLISH]: Something went wrong"

    const/16 v2, 0xbb8

    move-object v6, p2

    move-object v7, p3

    move-object v9, p4

    move v8, p5

    invoke-direct/range {v1 .. v9}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V

    return-object v1
.end method

.method public final InvalidVideoSettings(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    move-object/from16 v9, p4

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0x40

    const/4 v11, 0x0

    const/16 v2, 0xbbe

    const-string v3, "InvalidVideoSettings"

    const-string v5, "Cannot enable simulcast when no video settings are provided"

    const/4 v8, 0x0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final MicCaptureFailed(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    move-object/from16 v9, p4

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0x40

    const/4 v11, 0x0

    const/16 v2, 0xbc3

    const-string v3, "Mic Capture Failed"

    const-string v5, "Mic Capture Failed"

    const/4 v8, 0x0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final NothingToReturn(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    move-object/from16 v9, p4

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0x40

    const/4 v11, 0x0

    const/16 v2, 0xbbd

    const-string v3, "NothingToReturn"

    const-string v5, "There is no media to return. Please select either video or audio or both."

    const/4 v8, 0x0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final PeerConnectionFactoryDisposed(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/ErrorFactory$Action;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Llive/hms/video/error/HMSException;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "[PUBLISH]: Peer Connection Factory Disposed"

    const/4 v8, 0x0

    const/16 v2, 0xbbc

    const-string v3, "PeerConnectionFactoryDisposed"

    move-object v6, p2

    move-object v7, p3

    move-object v9, p4

    invoke-direct/range {v1 .. v9}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V

    return-object v1
.end method

.method public final PreferLayerFailed(Llive/hms/video/media/streams/models/PreferStateResponseError;Llive/hms/video/error/ErrorFactory$Action;)Llive/hms/video/error/HMSException;
    .locals 12

    const-string v0, "preferStateResponseError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Llive/hms/video/media/streams/models/PreferStateResponseError;->getCode()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :goto_0
    move v2, p2

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Llive/hms/video/media/streams/models/PreferStateResponseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    const-string p2, ""

    :cond_1
    move-object v5, p2

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Prefer layer change failed. Data: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/streams/models/PreferStateResponseError;->getData()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v1, Llive/hms/video/error/HMSException;

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const-string v3, "Prefer Layer failed"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final PreferLayerFailedUnknownError(Llive/hms/video/error/ErrorFactory$Action;)Llive/hms/video/error/HMSException;
    .locals 12

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Llive/hms/video/error/HMSException;

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/16 v2, 0xbc6

    const-string v3, "Prefer Layer failed"

    const-string v5, "Unknown prefer layer error"

    const-string v6, "Unknown error for prefer layer"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final PreferLayerTimeoutError(Llive/hms/video/error/ErrorFactory$Action;)Llive/hms/video/error/HMSException;
    .locals 12

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Llive/hms/video/error/HMSException;

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/16 v2, 0xbc7

    const-string v3, "Prefer Layer failed"

    const-string v5, "Prefer layer timed out"

    const-string v6, "The server did not acknowledge the request to change the preferred layer."

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
