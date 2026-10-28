.class public Lhms/webrtc/CryptoOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/CryptoOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private enableAes128Sha1_32CryptoCipher:Z

.field private enableEncryptedRtpHeaderExtensions:Z

.field private enableGcmCryptoSuites:Z

.field private requireFrameEncryption:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhms/webrtc/CryptoOptions$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public createCryptoOptions()Lhms/webrtc/CryptoOptions;
    .locals 6

    new-instance v0, Lhms/webrtc/CryptoOptions;

    iget-boolean v1, p0, Lhms/webrtc/CryptoOptions$Builder;->enableGcmCryptoSuites:Z

    iget-boolean v2, p0, Lhms/webrtc/CryptoOptions$Builder;->enableAes128Sha1_32CryptoCipher:Z

    iget-boolean v3, p0, Lhms/webrtc/CryptoOptions$Builder;->enableEncryptedRtpHeaderExtensions:Z

    iget-boolean v4, p0, Lhms/webrtc/CryptoOptions$Builder;->requireFrameEncryption:Z

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lhms/webrtc/CryptoOptions;-><init>(ZZZZI)V

    return-object v0
.end method

.method public setEnableAes128Sha1_32CryptoCipher(Z)Lhms/webrtc/CryptoOptions$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/CryptoOptions$Builder;->enableAes128Sha1_32CryptoCipher:Z

    return-object p0
.end method

.method public setEnableEncryptedRtpHeaderExtensions(Z)Lhms/webrtc/CryptoOptions$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/CryptoOptions$Builder;->enableEncryptedRtpHeaderExtensions:Z

    return-object p0
.end method

.method public setEnableGcmCryptoSuites(Z)Lhms/webrtc/CryptoOptions$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/CryptoOptions$Builder;->enableGcmCryptoSuites:Z

    return-object p0
.end method

.method public setRequireFrameEncryption(Z)Lhms/webrtc/CryptoOptions$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/CryptoOptions$Builder;->requireFrameEncryption:Z

    return-object p0
.end method
