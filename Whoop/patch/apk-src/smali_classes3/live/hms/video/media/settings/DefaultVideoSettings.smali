.class public final Llive/hms/video/media/settings/DefaultVideoSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/media/settings/DefaultVideoSettings;",
        "",
        "<init>",
        "()V",
        "QVGA",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "getQVGA",
        "()Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "VGA",
        "getVGA",
        "SHD",
        "getSHD",
        "HD",
        "getHD",
        "FHD",
        "getFHD",
        "QHD",
        "getQHD",
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
.field private static final FHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

.field private static final HD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

.field public static final INSTANCE:Llive/hms/video/media/settings/DefaultVideoSettings;

.field private static final QHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

.field private static final QVGA:Llive/hms/video/media/settings/HMSVideoTrackSettings;

.field private static final SHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

.field private static final VGA:Llive/hms/video/media/settings/HMSVideoTrackSettings;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llive/hms/video/media/settings/DefaultVideoSettings;

    invoke-direct {v0}, Llive/hms/video/media/settings/DefaultVideoSettings;-><init>()V

    sput-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->INSTANCE:Llive/hms/video/media/settings/DefaultVideoSettings;

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    new-instance v1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 v2, 0x140

    const/16 v3, 0xb4

    invoke-direct {v1, v2, v3}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    const v1, 0x249f0

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->QVGA:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    new-instance v1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 v2, 0x280

    const/16 v3, 0x168

    invoke-direct {v1, v2, v3}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    const v1, 0x7a120

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->VGA:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    new-instance v1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 v2, 0x3c0

    const/16 v3, 0x21c

    invoke-direct {v1, v2, v3}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    const v1, 0x124f80

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->SHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    new-instance v1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 v2, 0x500

    const/16 v3, 0x2d0

    invoke-direct {v1, v2, v3}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    const v1, 0x2625a0

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->HD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    new-instance v1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 v2, 0x780

    const/16 v3, 0x438

    invoke-direct {v1, v2, v3}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    const v1, 0x3d0900

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->FHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    new-instance v1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 v2, 0xa00

    const/16 v3, 0x5a0

    invoke-direct {v1, v2, v3}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    const v1, 0x7a1200

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->QHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getFHD()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 1

    sget-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->FHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object v0
.end method

.method public final getHD()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 1

    sget-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->HD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object v0
.end method

.method public final getQHD()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 1

    sget-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->QHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object v0
.end method

.method public final getQVGA()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 1

    sget-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->QVGA:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object v0
.end method

.method public final getSHD()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 1

    sget-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->SHD:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object v0
.end method

.method public final getVGA()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 1

    sget-object v0, Llive/hms/video/media/settings/DefaultVideoSettings;->VGA:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object v0
.end method
